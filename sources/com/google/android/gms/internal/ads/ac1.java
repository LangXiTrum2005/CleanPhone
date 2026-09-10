package com.google.android.gms.internal.ads;

import java.math.RoundingMode;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public abstract class ac1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int f11991a = 0;

    static {
        Math.log(2.0d);
    }

    public static boolean a(double d10) {
        if (d10 > 0.0d && rb0.s(d10)) {
            long jA = rb0.a(d10);
            if ((jA & ((-1) + jA)) == 0) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Code duplicated, block: B:26:0x0069  */
    /* JADX WARN: Code duplicated, block: B:33:? A[RETURN, SYNTHETIC] */
    public static int b(double d10) {
        boolean zA;
        RoundingMode roundingMode = RoundingMode.CEILING;
        boolean z10 = false;
        ps1.C("x must be positive and finite", d10 > 0.0d && rb0.s(d10));
        int exponent = Math.getExponent(d10);
        if (Math.getExponent(d10) < -1022) {
            return b(d10 * 4.503599627370496E15d) - 52;
        }
        switch (zb1.f22576a[roundingMode.ordinal()]) {
            case 1:
                ps1.D(a(d10));
                return exponent;
            case 2:
                return exponent;
            case 3:
                z10 = !a(d10);
                if (z10) {
                    return exponent + 1;
                }
                return exponent;
            case 4:
                z10 = exponent < 0;
                zA = a(d10);
                z10 &= !zA;
                if (z10) {
                    return exponent + 1;
                }
                return exponent;
            case 5:
                z10 = exponent >= 0;
                zA = a(d10);
                z10 &= !zA;
                if (z10) {
                    return exponent + 1;
                }
                return exponent;
            case 6:
            case 7:
            case 8:
                double dLongBitsToDouble = Double.longBitsToDouble((Double.doubleToRawLongBits(d10) & 4503599627370495L) | 4607182418800017408L);
                if (dLongBitsToDouble * dLongBitsToDouble > 2.0d) {
                    z10 = true;
                }
                if (z10) {
                    return exponent + 1;
                }
                return exponent;
            default:
                throw new AssertionError();
        }
    }

    public static boolean c(double d10) {
        if (rb0.s(d10)) {
            return d10 == 0.0d || 52 - Long.numberOfTrailingZeros(rb0.a(d10)) <= Math.getExponent(d10);
        }
        return false;
    }
}
