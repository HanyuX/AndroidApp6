package edu.dartmouth.cs.actiontabs;

import android.app.Notification;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.app.Service;
import android.content.Context;
import android.content.Intent;
import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.location.Criteria;
import android.location.Location;
import android.location.LocationListener;
import android.location.LocationManager;
import android.os.AsyncTask;
import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;

import com.google.android.gms.maps.model.LatLng;

import java.text.DecimalFormat;
import java.util.Calendar;
import java.util.concurrent.ArrayBlockingQueue;

/**
 * Service to track position by Android System Service
 * Created by xuehanyu on 4/27/16.
 */
public class trackingService extends Service implements SensorEventListener{
    private final IBinder mBinder = new trackingBinder();
    private databaseItem Item = new databaseItem();
    private double lastAltitude = 0;                               //indicate the last altitude
    private double lastLongtitude = 0;                             //indicate the last longtitude
    private double lastLatitude = 0;                               //indicate the last latitude
    private Long startTime;
    private double Ra = 6371.004*0.621371192;                      //radius of the earth
    private double Pi = 3.1415926;
    private NotificationManager notificationManager;
    public static final String ACTION_UPDATE = "Update_Location";
    public static final String Type_Update = "Update_Type";
    private ArrayBlockingQueue<Double> mBuff;
    private int featureSize = 64;
    private int buffSize = 128;
    private OnSensorChangedTask myAsync = new OnSensorChangedTask();
    private int typeNum = 3;
    private int[] activityType = new int[typeNum];

    @Override
    public void onCreate(){
        super.onCreate();
        LocationManager locationManager;
        String svcName= Context.LOCATION_SERVICE;
        locationManager = (LocationManager)getSystemService(svcName);
        showNotification();

        Criteria criteria = new Criteria();
        criteria.setAccuracy(Criteria.ACCURACY_FINE);
        criteria.setPowerRequirement(Criteria.POWER_LOW);
        criteria.setAltitudeRequired(false);
        criteria.setBearingRequired(false);
        criteria.setSpeedRequired(false);
        criteria.setCostAllowed(true);
        String provider = locationManager.getBestProvider(criteria, true);

        startTime = Calendar.getInstance().getTimeInMillis();
        Location l = locationManager.getLastKnownLocation(LocationManager.NETWORK_PROVIDER);
        sendLocationtoMap(l, true);
        mBuff = new ArrayBlockingQueue<>(buffSize);
        locationManager.requestLocationUpdates(provider, 2000, 10,
                locationListener);

        myAsync.execute();
    }

    @Override
    public IBinder onBind(Intent intent) {
        return mBinder;
    }

    /*
     * Listener for location service
     */
    private final LocationListener locationListener = new LocationListener() {
        public void onLocationChanged(Location location) {
            sendLocationtoMap(location, false);
        }

        public void onProviderDisabled(String provider) {}
        public void onProviderEnabled(String provider) {}
        public void onStatusChanged(String provider, int status,
                                    Bundle extras) {}
    };

    /*
     * When location is changed, the function will be called
     * Position information is broadcast out
     */
    private void sendLocationtoMap(Location location, boolean flag){
        LatLng l = new LatLng(location.getLatitude(), location.getLongitude());
        Item.getLatlngs().add(l);
        DecimalFormat df = new DecimalFormat("#.##");
        Item.setCurSpeed(Double.parseDouble(df.format(location.getSpeed()*3.6/1.6)));
        if(flag){
            Item.setAvgSpeed(0);
            Item.setClimb(0);
            Item.setDistance(0);
        }else{
            double C = Math.sin(location.getLatitude())*Math.sin(lastLatitude) + Math.cos(location.getLatitude())*Math.cos(lastLatitude)*Math.cos(location.getLongitude()-lastLongtitude);
            Item.setDistance(Item.getDistance() + Double.parseDouble(df.format(Math.abs(Ra * Math.acos(C)*Pi/180))));
            long nowTime = Calendar.getInstance().getTimeInMillis();
            double timeDifference = (nowTime-startTime)/(3600*1000*1.0);
            Item.setAvgSpeed(timeDifference == 0 ? 0 : Double.parseDouble(df.format(Item.getDistance()/timeDifference)));

            double climb = (location.getAltitude() - lastAltitude) / 1610.0;
            Item.setClimb(Item.getClimb() + Double.parseDouble(df.format(climb > 0 ? climb : 0)));
        }
        lastAltitude = location.getAltitude();
        lastLatitude = location.getLatitude();
        lastLongtitude = location.getLongitude();
        sendBroadcast(new Intent(ACTION_UPDATE));
    }

    @Override
    public void onTaskRemoved(Intent rootIntent) {
        super.onTaskRemoved(rootIntent);
    }

    public class trackingBinder extends Binder {
        public databaseItem getItems() {
            return Item;
        }
    }

    /*
     * The notification is clicked, MapsActivity will be open
     */
    public void showNotification() {
        Intent resultIntent = new Intent(this, MapsActivity.class);
        PendingIntent contentIntent = PendingIntent.getActivity(this, 0,
            resultIntent, 0);
        Notification notification = new Notification.Builder(this)
                .setContentTitle("MyRuns")
                .setContentText(
                        "Recording your path now")
                .setSmallIcon(R.drawable.icon)
                .setContentIntent(contentIntent).build();
        notificationManager = (NotificationManager) getSystemService(NOTIFICATION_SERVICE);
        notification.flags = notification.flags
                | Notification.FLAG_ONGOING_EVENT;
        notification.flags |= Notification.FLAG_AUTO_CANCEL;
        notificationManager.notify(0, notification);
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        myAsync.cancel(true);
        notificationManager.cancelAll();
    }

    public void onSensorChanged(SensorEvent event) {
        if(event.sensor.getType() == Sensor.TYPE_ACCELEROMETER){
            double m = Math.sqrt(event.values[0] * event.values[0]
                    + event.values[1] * event.values[1] + event.values[2]
                    * event.values[2]);
            mBuff.offer(m);
        }
    }

    private class OnSensorChangedTask extends AsyncTask<Void, Void, Void> {
        private Double[] featureVector = new Double[featureSize+1];
        private double[] featureBuff = new double[featureSize];
        private double[] featureBuffFFT = new double[featureSize];
        FFT fft = new FFT(featureSize);

        private int buffN = 0;
        private double Max = 0;
        @Override
        protected Void doInBackground(Void... arg0) {
            try {
                while (!isCancelled()) {
                    if(buffN == featureSize){
                        featureVector[featureSize] = Max;
                        fft.fft(featureBuff, featureBuffFFT);
                        for(int i = 0 ; i < featureSize ; ++i)
                            featureVector[i] = featureBuff[i]*featureBuff[i] + featureBuffFFT[i]*featureBuffFFT[i];

                        activityType[(int)WekaClassifier.classify(featureVector)]++;
                        for(int i = 0 ; i < typeNum ; ++i){
                            int j;
                            for(j = 0 ; j < typeNum ; ++j)
                                if(activityType[i] < activityType[j])
                                    break;
                            if(j == typeNum){
                                switch (j){
                                    case 0:
                                        Item.setActivityType("Standing");
                                        break;
                                    case 1:
                                        Item.setActivityType("Walking");
                                        break;
                                    case 2:
                                        Item.setActivityType("Running");
                                }
                            }
                        }
                        sendBroadcast(new Intent(ACTION_UPDATE));
                        buffN = 0;
                        Max = 0;
                    }else {
                        featureBuff[buffN++] = mBuff.take().doubleValue();
                        Max = Math.max(Max, featureVector[buffN]);
                    }
                }
            }catch (Exception e){}
            return null;
        }
    }

    public void onAccuracyChanged(Sensor sensor, int accuracy) {
    }
}
