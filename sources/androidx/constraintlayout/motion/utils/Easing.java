package androidx.constraintlayout.motion.utils;

import android.util.Log;
import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public class Easing {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Easing f3798b = new Easing();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final String[] f3799c = {"standard", "accelerate", "decelerate", "linear"};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f3800a = "identity";

    public static class CubicEasing extends Easing {
        public final double d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final double f3801e;
        public final double f;
        public final double g;

        public CubicEasing(String str) {
            this.f3800a = str;
            int iIndexOf = str.indexOf(40);
            int iIndexOf2 = str.indexOf(44, iIndexOf);
            this.d = Double.parseDouble(str.substring(iIndexOf + 1, iIndexOf2).trim());
            int i2 = iIndexOf2 + 1;
            int iIndexOf3 = str.indexOf(44, i2);
            this.f3801e = Double.parseDouble(str.substring(i2, iIndexOf3).trim());
            int i3 = iIndexOf3 + 1;
            int iIndexOf4 = str.indexOf(44, i3);
            this.f = Double.parseDouble(str.substring(i3, iIndexOf4).trim());
            int i4 = iIndexOf4 + 1;
            this.g = Double.parseDouble(str.substring(i4, str.indexOf(41, i4)).trim());
        }

        @Override // androidx.constraintlayout.motion.utils.Easing
        public final double a(double d) {
            if (d <= 0.0d) {
                return 0.0d;
            }
            if (d >= 1.0d) {
                return 1.0d;
            }
            double d2 = 0.5d;
            double d3 = 0.5d;
            while (d2 > 0.01d) {
                d2 *= 0.5d;
                d3 = c(d3) < d ? d3 + d2 : d3 - d2;
            }
            double d4 = d3 - d2;
            double dC = c(d4);
            double d5 = d3 + d2;
            double dC2 = c(d5);
            double d6 = d(d4);
            return (((d - dC) * (d(d5) - d6)) / (dC2 - dC)) + d6;
        }

        public final double c(double d) {
            double d2 = 1.0d - d;
            double d3 = 3.0d * d2;
            double d4 = d2 * d3 * d;
            double d5 = d3 * d * d;
            return (this.f * d5) + (this.d * d4) + (d * d * d);
        }

        public final double d(double d) {
            double d2 = 1.0d - d;
            double d3 = 3.0d * d2;
            double d4 = d2 * d3 * d;
            double d5 = d3 * d * d;
            return (this.g * d5) + (this.f3801e * d4) + (d * d * d);
        }
    }

    public static Easing b(String str) {
        if (str == null) {
            return null;
        }
        if (str.startsWith("cubic")) {
            return new CubicEasing(str);
        }
        switch (str) {
            case "accelerate":
                return new CubicEasing("cubic(0.4, 0.05, 0.8, 0.7)");
            case "decelerate":
                return new CubicEasing("cubic(0.0, 0.0, 0.2, 0.95)");
            case "linear":
                return new CubicEasing("cubic(1, 1, 0, 0)");
            case "standard":
                return new CubicEasing("cubic(0.4, 0.0, 0.2, 1)");
            default:
                Log.e("ConstraintSet", "transitionEasing syntax error syntax:transitionEasing=\"cubic(1.0,0.5,0.0,0.6)\" or " + Arrays.toString(f3799c));
                return f3798b;
        }
    }

    public double a(double d) {
        return d;
    }

    public final String toString() {
        return this.f3800a;
    }
}
