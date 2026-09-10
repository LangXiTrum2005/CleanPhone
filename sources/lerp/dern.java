package lerp;

import java.io.PrintStream;
import java.util.Arrays;

/* JADX INFO: compiled from: Easing.java */
/* JADX INFO: loaded from: classes.dex */
public class dern {

    /* JADX INFO: renamed from: attabal, reason: collision with root package name */
    public String f32796attabal = "identity";

    /* JADX INFO: renamed from: saneness, reason: collision with root package name */
    public static dern f32795saneness = new dern();

    /* JADX INFO: renamed from: dern, reason: collision with root package name */
    public static String[] f32794dern = {"standard", "accelerate", "decelerate", "linear"};

    /* JADX INFO: compiled from: Easing.java */
    public static class attabal extends dern {

        /* JADX INFO: renamed from: impromptu, reason: collision with root package name */
        public static double f32797impromptu = 0.01d;

        /* JADX INFO: renamed from: taiyuan, reason: collision with root package name */
        public static double f32798taiyuan = 1.0E-4d;

        /* JADX INFO: renamed from: beachfront, reason: collision with root package name */
        public double f32799beachfront;

        /* JADX INFO: renamed from: competently, reason: collision with root package name */
        public double f32800competently;

        /* JADX INFO: renamed from: marial, reason: collision with root package name */
        public double f32801marial;

        /* JADX INFO: renamed from: wireman, reason: collision with root package name */
        public double f32802wireman;

        public attabal(String str) {
            this.f32796attabal = str;
            int iIndexOf = str.indexOf(40);
            int iIndexOf2 = str.indexOf(44, iIndexOf);
            this.f32802wireman = Double.parseDouble(str.substring(iIndexOf + 1, iIndexOf2).trim());
            int i = iIndexOf2 + 1;
            int iIndexOf3 = str.indexOf(44, i);
            this.f32801marial = Double.parseDouble(str.substring(i, iIndexOf3).trim());
            int i2 = iIndexOf3 + 1;
            int iIndexOf4 = str.indexOf(44, i2);
            this.f32799beachfront = Double.parseDouble(str.substring(i2, iIndexOf4).trim());
            int i3 = iIndexOf4 + 1;
            this.f32800competently = Double.parseDouble(str.substring(i3, str.indexOf(41, i3)).trim());
        }

        @Override // lerp.dern
        public double attabal(double d) {
            if (d <= 0.0d) {
                return 0.0d;
            }
            if (d >= 1.0d) {
                return 1.0d;
            }
            double d2 = 0.5d;
            double d3 = 0.5d;
            while (d2 > f32797impromptu) {
                d2 *= 0.5d;
                d3 = wireman(d3) < d ? d3 + d2 : d3 - d2;
            }
            double d4 = d3 - d2;
            double dWireman = wireman(d4);
            double d5 = d3 + d2;
            double dWireman2 = wireman(d5);
            double dMarial = marial(d4);
            return (((marial(d5) - dMarial) * (d - dWireman)) / (dWireman2 - dWireman)) + dMarial;
        }

        public final double marial(double d) {
            double d2 = 1.0d - d;
            double d3 = 3.0d * d2;
            return (this.f32801marial * d2 * d3 * d) + (this.f32800competently * d3 * d * d) + (d * d * d);
        }

        @Override // lerp.dern
        public double saneness(double d) {
            double d2 = 0.5d;
            double d3 = 0.5d;
            while (d2 > f32798taiyuan) {
                d2 *= 0.5d;
                d3 = wireman(d3) < d ? d3 + d2 : d3 - d2;
            }
            double d4 = d3 - d2;
            double d5 = d3 + d2;
            return (marial(d5) - marial(d4)) / (wireman(d5) - wireman(d4));
        }

        public final double wireman(double d) {
            double d2 = 1.0d - d;
            double d3 = 3.0d * d2;
            return (this.f32802wireman * d2 * d3 * d) + (this.f32799beachfront * d3 * d * d) + (d * d * d);
        }
    }

    public static dern dern(String str) {
        if (str == null) {
            return null;
        }
        if (str.startsWith("cubic")) {
            return new attabal(str);
        }
        if (str.startsWith("spline")) {
            return new formularize(str);
        }
        if (str.startsWith("Schlick")) {
            return new taiyuan(str);
        }
        switch (str) {
            case "accelerate":
                return new attabal("cubic(0.4, 0.05, 0.8, 0.7)");
            case "decelerate":
                return new attabal("cubic(0.0, 0.0, 0.2, 0.95)");
            case "anticipate":
                return new attabal("cubic(0.36, 0, 0.66, -0.56)");
            case "linear":
                return new attabal("cubic(1, 1, 0, 0)");
            case "overshoot":
                return new attabal("cubic(0.34, 1.56, 0.64, 1)");
            case "standard":
                return new attabal("cubic(0.4, 0.0, 0.2, 1)");
            default:
                PrintStream printStream = System.err;
                Arrays.toString(f32794dern);
                printStream.getClass();
                return f32795saneness;
        }
    }

    public double saneness(double d) {
        return 1.0d;
    }

    public String toString() {
        return this.f32796attabal;
    }

    public double attabal(double d) {
        return d;
    }
}
