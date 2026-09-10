package com.google.common.math;

import com.google.common.base.Preconditions;
import java.math.RoundingMode;

/* JADX INFO: loaded from: classes4.dex */
@ElementTypesAreNonnullByDefault
public final class DoubleMath {

    /* JADX INFO: renamed from: com.google.common.math.DoubleMath$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f20035a;

        static {
            int[] iArr = new int[RoundingMode.values().length];
            f20035a = iArr;
            try {
                iArr[RoundingMode.UNNECESSARY.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f20035a[RoundingMode.FLOOR.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f20035a[RoundingMode.CEILING.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f20035a[RoundingMode.DOWN.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f20035a[RoundingMode.UP.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f20035a[RoundingMode.HALF_EVEN.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f20035a[RoundingMode.HALF_UP.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f20035a[RoundingMode.HALF_DOWN.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
        }
    }

    static {
        Math.log(2.0d);
    }

    public static boolean a(double d) {
        if (Math.getExponent(d) <= 1023) {
            if (d != 0.0d) {
                Preconditions.e("not a normal value", Math.getExponent(d) <= 1023);
                int exponent = Math.getExponent(d);
                long jDoubleToRawLongBits = Double.doubleToRawLongBits(d) & 4503599627370495L;
                if (52 - Long.numberOfTrailingZeros(exponent == -1023 ? jDoubleToRawLongBits << 1 : jDoubleToRawLongBits | 4503599627370496L) <= Math.getExponent(d)) {
                }
            }
            return true;
        }
        return false;
    }

    /* JADX WARN: Code duplicated, block: B:42:0x008b  */
    /* JADX WARN: Code duplicated, block: B:43:0x008d  */
    /* JADX WARN: Code duplicated, block: B:47:0x0095  */
    /* JADX WARN: Code duplicated, block: B:50:0x0099  */
    /* JADX WARN: Code duplicated, block: B:52:0x009b  */
    /* JADX WARN: Instruction removed from duplicated block: B:52:0x009b, please report this as an issue */
    public static long b(double d, RoundingMode roundingMode) {
        double dRint;
        long j;
        boolean z2;
        if (Math.getExponent(d) > 1023) {
            throw new ArithmeticException("input is infinite or NaN");
        }
        switch (AnonymousClass1.f20035a[roundingMode.ordinal()]) {
            case 1:
                if (!a(d)) {
                    throw new ArithmeticException("mode was UNNECESSARY, but rounding was necessary");
                }
                dRint = d;
                if ((-9.223372036854776E18d) - dRint < 1.0d) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                if (z2 && (dRint < 9.223372036854776E18d)) {
                    return (long) dRint;
                }
                throw new ArithmeticException("rounded value is out of range for input " + d + " and rounding mode " + roundingMode);
            case 2:
                if (d >= 0.0d || a(d)) {
                    dRint = d;
                } else {
                    j = ((long) d) - 1;
                    dRint = j;
                }
                if ((-9.223372036854776E18d) - dRint < 1.0d) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                if (z2 && (dRint < 9.223372036854776E18d)) {
                    return (long) dRint;
                }
                throw new ArithmeticException("rounded value is out of range for input " + d + " and rounding mode " + roundingMode);
            case 3:
                if (d <= 0.0d || a(d)) {
                    dRint = d;
                } else {
                    j = ((long) d) + 1;
                    dRint = j;
                }
                if ((-9.223372036854776E18d) - dRint < 1.0d) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                if (z2 && (dRint < 9.223372036854776E18d)) {
                    return (long) dRint;
                }
                throw new ArithmeticException("rounded value is out of range for input " + d + " and rounding mode " + roundingMode);
            case 4:
                dRint = d;
                if ((-9.223372036854776E18d) - dRint < 1.0d) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                if (z2 && (dRint < 9.223372036854776E18d)) {
                    return (long) dRint;
                }
                throw new ArithmeticException("rounded value is out of range for input " + d + " and rounding mode " + roundingMode);
            case 5:
                if (a(d)) {
                    dRint = d;
                } else {
                    dRint = ((long) d) + ((long) (d > 0.0d ? 1 : -1));
                }
                if ((-9.223372036854776E18d) - dRint < 1.0d) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                if (z2 && (dRint < 9.223372036854776E18d)) {
                    return (long) dRint;
                }
                throw new ArithmeticException("rounded value is out of range for input " + d + " and rounding mode " + roundingMode);
            case 6:
                dRint = Math.rint(d);
                if ((-9.223372036854776E18d) - dRint < 1.0d) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                if (z2 && (dRint < 9.223372036854776E18d)) {
                    return (long) dRint;
                }
                throw new ArithmeticException("rounded value is out of range for input " + d + " and rounding mode " + roundingMode);
            case 7:
                dRint = Math.rint(d);
                if (Math.abs(d - dRint) == 0.5d) {
                    dRint = Math.copySign(0.5d, d) + d;
                }
                if ((-9.223372036854776E18d) - dRint < 1.0d) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                if (z2 && (dRint < 9.223372036854776E18d)) {
                    return (long) dRint;
                }
                throw new ArithmeticException("rounded value is out of range for input " + d + " and rounding mode " + roundingMode);
            case 8:
                dRint = Math.rint(d);
                if (Math.abs(d - dRint) == 0.5d) {
                    dRint = d;
                }
                if ((-9.223372036854776E18d) - dRint < 1.0d) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                if (z2 && (dRint < 9.223372036854776E18d)) {
                    return (long) dRint;
                }
                throw new ArithmeticException("rounded value is out of range for input " + d + " and rounding mode " + roundingMode);
            default:
                throw new AssertionError();
        }
    }
}
