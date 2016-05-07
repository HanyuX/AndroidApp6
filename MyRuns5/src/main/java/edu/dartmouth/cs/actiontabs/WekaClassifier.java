package edu.dartmouth.cs.actiontabs;

/**
 * Created by dnalwqer on 5/6/16.
 */
class WekaClassifier {

    public static double classify(Object[] i)
            throws Exception {

        double p = Double.NaN;
        p = WekaClassifier.N44cdbc590(i);
        return p;
    }
    static double N44cdbc590(Object []i) {
        double p = Double.NaN;
        if (i[0] == null) {
            p = 0;
        } else if (((Double) i[0]).doubleValue() <= 66.234774) {
            p = 0;
        } else if (((Double) i[0]).doubleValue() > 66.234774) {
            p = WekaClassifier.N1f089a591(i);
        }
        return p;
    }
    static double N1f089a591(Object []i) {
        double p = Double.NaN;
        if (i[0] == null) {
            p = 1;
        } else if (((Double) i[0]).doubleValue() <= 921.263246) {
            p = WekaClassifier.N6dcd58f92(i);
        } else if (((Double) i[0]).doubleValue() > 921.263246) {
            p = 2;
        }
        return p;
    }
    static double N6dcd58f92(Object []i) {
        double p = Double.NaN;
        if (i[0] == null) {
            p = 1;
        } else if (((Double) i[0]).doubleValue() <= 268.8472) {
            p = WekaClassifier.N448c7bc03(i);
        } else if (((Double) i[0]).doubleValue() > 268.8472) {
            p = WekaClassifier.N42e85a120(i);
        }
        return p;
    }
    static double N448c7bc03(Object []i) {
        double p = Double.NaN;
        if (i[15] == null) {
            p = 1;
        } else if (((Double) i[15]).doubleValue() <= 3.892205) {
            p = WekaClassifier.N63109d684(i);
        } else if (((Double) i[15]).doubleValue() > 3.892205) {
            p = WekaClassifier.N44410ef615(i);
        }
        return p;
    }
    static double N63109d684(Object []i) {
        double p = Double.NaN;
        if (i[14] == null) {
            p = 1;
        } else if (((Double) i[14]).doubleValue() <= 1.788289) {
            p = WekaClassifier.N57ce49a75(i);
        } else if (((Double) i[14]).doubleValue() > 1.788289) {
            p = WekaClassifier.N1012594c8(i);
        }
        return p;
    }
    static double N57ce49a75(Object []i) {
        double p = Double.NaN;
        if (i[9] == null) {
            p = 1;
        } else if (((Double) i[9]).doubleValue() <= 2.184446) {
            p = 1;
        } else if (((Double) i[9]).doubleValue() > 2.184446) {
            p = WekaClassifier.N28459ffa6(i);
        }
        return p;
    }
    static double N28459ffa6(Object []i) {
        double p = Double.NaN;
        if (i[1] == null) {
            p = 2;
        } else if (((Double) i[1]).doubleValue() <= 45.732491) {
            p = WekaClassifier.N7309eabd7(i);
        } else if (((Double) i[1]).doubleValue() > 45.732491) {
            p = 1;
        }
        return p;
    }
    static double N7309eabd7(Object []i) {
        double p = Double.NaN;
        if (i[8] == null) {
            p = 1;
        } else if (((Double) i[8]).doubleValue() <= 1.735883) {
            p = 1;
        } else if (((Double) i[8]).doubleValue() > 1.735883) {
            p = 2;
        }
        return p;
    }
    static double N1012594c8(Object []i) {
        double p = Double.NaN;
        if (i[22] == null) {
            p = 1;
        } else if (((Double) i[22]).doubleValue() <= 1.22947) {
            p = WekaClassifier.N24a494d29(i);
        } else if (((Double) i[22]).doubleValue() > 1.22947) {
            p = WekaClassifier.N312679c910(i);
        }
        return p;
    }
    static double N24a494d29(Object []i) {
        double p = Double.NaN;
        if (i[23] == null) {
            p = 0;
        } else if (((Double) i[23]).doubleValue() <= 0.400869) {
            p = 0;
        } else if (((Double) i[23]).doubleValue() > 0.400869) {
            p = 1;
        }
        return p;
    }
    static double N312679c910(Object []i) {
        double p = Double.NaN;
        if (i[6] == null) {
            p = 2;
        } else if (((Double) i[6]).doubleValue() <= 5.005317) {
            p = 2;
        } else if (((Double) i[6]).doubleValue() > 5.005317) {
            p = WekaClassifier.N5505945411(i);
        }
        return p;
    }
    static double N5505945411(Object []i) {
        double p = Double.NaN;
        if (i[24] == null) {
            p = 0;
        } else if (((Double) i[24]).doubleValue() <= 2.840258) {
            p = WekaClassifier.N614d426712(i);
        } else if (((Double) i[24]).doubleValue() > 2.840258) {
            p = WekaClassifier.N19ad5b3d14(i);
        }
        return p;
    }
    static double N614d426712(Object []i) {
        double p = Double.NaN;
        if (i[4] == null) {
            p = 0;
        } else if (((Double) i[4]).doubleValue() <= 12.635041) {
            p = 0;
        } else if (((Double) i[4]).doubleValue() > 12.635041) {
            p = WekaClassifier.N1742aa1913(i);
        }
        return p;
    }
    static double N1742aa1913(Object []i) {
        double p = Double.NaN;
        if (i[9] == null) {
            p = 1;
        } else if (((Double) i[9]).doubleValue() <= 5.398423) {
            p = 1;
        } else if (((Double) i[9]).doubleValue() > 5.398423) {
            p = 0;
        }
        return p;
    }
    static double N19ad5b3d14(Object []i) {
        double p = Double.NaN;
        if (i[0] == null) {
            p = 2;
        } else if (((Double) i[0]).doubleValue() <= 223.281233) {
            p = 2;
        } else if (((Double) i[0]).doubleValue() > 223.281233) {
            p = 1;
        }
        return p;
    }
    static double N44410ef615(Object []i) {
        double p = Double.NaN;
        if (i[0] == null) {
            p = 1;
        } else if (((Double) i[0]).doubleValue() <= 157.955846) {
            p = WekaClassifier.Nb3d5b7c16(i);
        } else if (((Double) i[0]).doubleValue() > 157.955846) {
            p = WekaClassifier.N2e9c019f19(i);
        }
        return p;
    }
    static double Nb3d5b7c16(Object []i) {
        double p = Double.NaN;
        if (i[16] == null) {
            p = 0;
        } else if (((Double) i[16]).doubleValue() <= 2.610561) {
            p = 0;
        } else if (((Double) i[16]).doubleValue() > 2.610561) {
            p = WekaClassifier.N69412fa717(i);
        }
        return p;
    }
    static double N69412fa717(Object []i) {
        double p = Double.NaN;
        if (i[32] == null) {
            p = 2;
        } else if (((Double) i[32]).doubleValue() <= 2.11553) {
            p = WekaClassifier.N369fb2ed18(i);
        } else if (((Double) i[32]).doubleValue() > 2.11553) {
            p = 1;
        }
        return p;
    }
    static double N369fb2ed18(Object []i) {
        double p = Double.NaN;
        if (i[8] == null) {
            p = 1;
        } else if (((Double) i[8]).doubleValue() <= 9.054217) {
            p = 1;
        } else if (((Double) i[8]).doubleValue() > 9.054217) {
            p = 2;
        }
        return p;
    }
    static double N2e9c019f19(Object []i) {
        double p = Double.NaN;
        if (i[0] == null) {
            p = 1;
        } else if (((Double) i[0]).doubleValue() <= 265.020572) {
            p = 1;
        } else if (((Double) i[0]).doubleValue() > 265.020572) {
            p = 0;
        }
        return p;
    }
    static double N42e85a120(Object []i) {
        double p = Double.NaN;
        if (i[29] == null) {
            p = 1;
        } else if (((Double) i[29]).doubleValue() <= 5.576855) {
            p = WekaClassifier.Na470f2c21(i);
        } else if (((Double) i[29]).doubleValue() > 5.576855) {
            p = WekaClassifier.N367755da23(i);
        }
        return p;
    }
    static double Na470f2c21(Object []i) {
        double p = Double.NaN;
        if (i[0] == null) {
            p = 1;
        } else if (((Double) i[0]).doubleValue() <= 738.864402) {
            p = 1;
        } else if (((Double) i[0]).doubleValue() > 738.864402) {
            p = WekaClassifier.N3f3516f922(i);
        }
        return p;
    }
    static double N3f3516f922(Object []i) {
        double p = Double.NaN;
        if (i[3] == null) {
            p = 2;
        } else if (((Double) i[3]).doubleValue() <= 97.816677) {
            p = 2;
        } else if (((Double) i[3]).doubleValue() > 97.816677) {
            p = 1;
        }
        return p;
    }
    static double N367755da23(Object []i) {
        double p = Double.NaN;
        if (i[5] == null) {
            p = 1;
        } else if (((Double) i[5]).doubleValue() <= 92.966314) {
            p = WekaClassifier.N54a5772524(i);
        } else if (((Double) i[5]).doubleValue() > 92.966314) {
            p = WekaClassifier.N3b31498d25(i);
        }
        return p;
    }
    static double N54a5772524(Object []i) {
        double p = Double.NaN;
        if (i[0] == null) {
            p = 1;
        } else if (((Double) i[0]).doubleValue() <= 708.313117) {
            p = 1;
        } else if (((Double) i[0]).doubleValue() > 708.313117) {
            p = 2;
        }
        return p;
    }
    static double N3b31498d25(Object []i) {
        double p = Double.NaN;
        if (i[16] == null) {
            p = 1;
        } else if (((Double) i[16]).doubleValue() <= 45.41406) {
            p = 1;
        } else if (((Double) i[16]).doubleValue() > 45.41406) {
            p = 2;
        }
        return p;
    }
}