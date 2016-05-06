package edu.dartmouth.cs.actiontabs;

/**
 * Created by dnalwqer on 5/6/16.
 */
class WekaClassifier {

    public static double classify(Object[] i)
            throws Exception {

        double p = Double.NaN;
        p = WekaClassifier.N30f250080(i);
        return p;
    }
    static double N30f250080(Object []i) {
        double p = Double.NaN;
        if (i[64] == null) {
            p = 0;
        } else if (((Double) i[64]).doubleValue() <= 1.661234) {
            p = 0;
        } else if (((Double) i[64]).doubleValue() > 1.661234) {
            p = WekaClassifier.N75b3d3741(i);
        }
        return p;
    }
    static double N75b3d3741(Object []i) {
        double p = Double.NaN;
        if (i[0] == null) {
            p = 1;
        } else if (((Double) i[0]).doubleValue() <= 120.972196) {
            p = WekaClassifier.N2c403d422(i);
        } else if (((Double) i[0]).doubleValue() > 120.972196) {
            p = 1;
        }
        return p;
    }
    static double N2c403d422(Object []i) {
        double p = Double.NaN;
        if (i[10] == null) {
            p = 1;
        } else if (((Double) i[10]).doubleValue() <= 2.37594) {
            p = WekaClassifier.N302a4e263(i);
        } else if (((Double) i[10]).doubleValue() > 2.37594) {
            p = WekaClassifier.N54befb2b6(i);
        }
        return p;
    }
    static double N302a4e263(Object []i) {
        double p = Double.NaN;
        if (i[0] == null) {
            p = 1;
        } else if (((Double) i[0]).doubleValue() <= 95.985935) {
            p = WekaClassifier.N127a3a3b4(i);
        } else if (((Double) i[0]).doubleValue() > 95.985935) {
            p = 1;
        }
        return p;
    }
    static double N127a3a3b4(Object []i) {
        double p = Double.NaN;
        if (i[0] == null) {
            p = 1;
        } else if (((Double) i[0]).doubleValue() <= 88.806901) {
            p = WekaClassifier.N79b973735(i);
        } else if (((Double) i[0]).doubleValue() > 88.806901) {
            p = 0;
        }
        return p;
    }
    static double N79b973735(Object []i) {
        double p = Double.NaN;
        if (i[16] == null) {
            p = 0;
        } else if (((Double) i[16]).doubleValue() <= 0.3104) {
            p = 0;
        } else if (((Double) i[16]).doubleValue() > 0.3104) {
            p = 1;
        }
        return p;
    }
    static double N54befb2b6(Object []i) {
        double p = Double.NaN;
        if (i[9] == null) {
            p = 0;
        } else if (((Double) i[9]).doubleValue() <= 3.705738) {
            p = 0;
        } else if (((Double) i[9]).doubleValue() > 3.705738) {
            p = 1;
        }
        return p;
    }
}