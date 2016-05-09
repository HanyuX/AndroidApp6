package edu.dartmouth.cs.actiontabs;

/**
 * Created by dnalwqer on 5/6/16.
 */

class WekaClassifier {

    public static double classify(Object[] i)
            throws Exception {

        double p = Double.NaN;
        p = WekaClassifier.Nbfb1eea0(i);
        return p;
    }
    static double Nbfb1eea0(Object []i) {
        double p = Double.NaN;
        if (i[0] == null) {
            p = 1;
        } else if (((Double) i[0]).doubleValue() <= 504.53758) {
            p = WekaClassifier.N2600ad5c1(i);
        } else if (((Double) i[0]).doubleValue() > 504.53758) {
            p = 2;
        }
        return p;
    }
    static double N2600ad5c1(Object []i) {
        double p = Double.NaN;
        if (i[0] == null) {
            p = 0;
        } else if (((Double) i[0]).doubleValue() <= 79.708925) {
            p = WekaClassifier.N5033b7ee2(i);
        } else if (((Double) i[0]).doubleValue() > 79.708925) {
            p = WekaClassifier.N42d3f0d94(i);
        }
        return p;
    }
    static double N5033b7ee2(Object []i) {
        double p = Double.NaN;
        if (i[0] == null) {
            p = 0;
        } else if (((Double) i[0]).doubleValue() <= 38.078767) {
            p = 0;
        } else if (((Double) i[0]).doubleValue() > 38.078767) {
            p = WekaClassifier.N110cb05c3(i);
        }
        return p;
    }
    static double N110cb05c3(Object []i) {
        double p = Double.NaN;
        if (i[12] == null) {
            p = 1;
        } else if (((Double) i[12]).doubleValue() <= 0.119527) {
            p = 1;
        } else if (((Double) i[12]).doubleValue() > 0.119527) {
            p = 0;
        }
        return p;
    }
    static double N42d3f0d94(Object []i) {
        double p = Double.NaN;
        if (i[0] == null) {
            p = 1;
        } else if (((Double) i[0]).doubleValue() <= 100.542276) {
            p = 1;
        } else if (((Double) i[0]).doubleValue() > 100.542276) {
            p = WekaClassifier.N619acf925(i);
        }
        return p;
    }
    static double N619acf925(Object []i) {
        double p = Double.NaN;
        if (i[13] == null) {
            p = 1;
        } else if (((Double) i[13]).doubleValue() <= 6.045579) {
            p = WekaClassifier.N2c5b98886(i);
        } else if (((Double) i[13]).doubleValue() > 6.045579) {
            p = WekaClassifier.N4297dd9d10(i);
        }
        return p;
    }
    static double N2c5b98886(Object []i) {
        double p = Double.NaN;
        if (i[0] == null) {
            p = 1;
        } else if (((Double) i[0]).doubleValue() <= 120.972196) {
            p = WekaClassifier.N58a1530f7(i);
        } else if (((Double) i[0]).doubleValue() > 120.972196) {
            p = 1;
        }
        return p;
    }
    static double N58a1530f7(Object []i) {
        double p = Double.NaN;
        if (i[26] == null) {
            p = 1;
        } else if (((Double) i[26]).doubleValue() <= 1.363885) {
            p = WekaClassifier.N5a925fa8(i);
        } else if (((Double) i[26]).doubleValue() > 1.363885) {
            p = WekaClassifier.N32788c829(i);
        }
        return p;
    }
    static double N5a925fa8(Object []i) {
        double p = Double.NaN;
        if (i[7] == null) {
            p = 0;
        } else if (((Double) i[7]).doubleValue() <= 0.382771) {
            p = 0;
        } else if (((Double) i[7]).doubleValue() > 0.382771) {
            p = 1;
        }
        return p;
    }
    static double N32788c829(Object []i) {
        double p = Double.NaN;
        if (i[2] == null) {
            p = 1;
        } else if (((Double) i[2]).doubleValue() <= 18.263885) {
            p = 1;
        } else if (((Double) i[2]).doubleValue() > 18.263885) {
            p = 0;
        }
        return p;
    }
    static double N4297dd9d10(Object []i) {
        double p = Double.NaN;
        if (i[8] == null) {
            p = 0;
        } else if (((Double) i[8]).doubleValue() <= 6.638222) {
            p = 0;
        } else if (((Double) i[8]).doubleValue() > 6.638222) {
            p = WekaClassifier.N107cd7eb11(i);
        }
        return p;
    }
    static double N107cd7eb11(Object []i) {
        double p = Double.NaN;
        if (i[12] == null) {
            p = 0;
        } else if (((Double) i[12]).doubleValue() <= 5.249064) {
            p = 0;
        } else if (((Double) i[12]).doubleValue() > 5.249064) {
            p = WekaClassifier.N5c36a6eb12(i);
        }
        return p;
    }
    static double N5c36a6eb12(Object []i) {
        double p = Double.NaN;
        if (i[14] == null) {
            p = 1;
        } else if (((Double) i[14]).doubleValue() <= 15.450739) {
            p = 1;
        } else if (((Double) i[14]).doubleValue() > 15.450739) {
            p = 0;
        }
        return p;
    }
}
