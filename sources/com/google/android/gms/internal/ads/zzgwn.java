package com.google.android.gms.internal.ads;

import java.math.RoundingMode;

/* JADX INFO: loaded from: classes4.dex */
public final class zzgwn {
    public static final /* synthetic */ int zza = 0;

    static {
        Math.log(2.0d);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:37:0x007e  */
    /* JADX WARN: Code duplicated, block: B:40:0x0089  */
    /* JADX WARN: Code duplicated, block: B:41:0x008b  */
    /* JADX WARN: Code duplicated, block: B:45:0x0093  */
    /* JADX WARN: Code duplicated, block: B:48:0x0097  */
    /* JADX WARN: Code duplicated, block: B:50:0x0099  */
    public static long zza(double d, RoundingMode roundingMode) {
        double dRint;
        long j;
        long j2;
        boolean z2;
        if (!zzgwo.zzb(d)) {
            throw new ArithmeticException("input is infinite or NaN");
        }
        switch (zzgwm.zza[roundingMode.ordinal()]) {
            case 1:
                zzgwt.zzb(zzd(d));
                dRint = d;
                if ((-9.223372036854776E18d) - dRint < 1.0d) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                if (z2 && (dRint < 9.223372036854776E18d)) {
                    return (long) dRint;
                }
                String strValueOf = String.valueOf(roundingMode);
                StringBuilder sb = new StringBuilder(String.valueOf(d).length() + 59 + strValueOf.length());
                sb.append("rounded value is out of range for input ");
                sb.append(d);
                sb.append(" and rounding mode ");
                sb.append(strValueOf);
                throw new ArithmeticException(sb.toString());
            case 2:
                if (d >= 0.0d || zzd(d)) {
                    dRint = d;
                } else {
                    j = (long) d;
                    j2 = -1;
                    dRint = j + j2;
                }
                if ((-9.223372036854776E18d) - dRint < 1.0d) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                if (z2 && (dRint < 9.223372036854776E18d)) {
                    return (long) dRint;
                }
                String strValueOf2 = String.valueOf(roundingMode);
                StringBuilder sb2 = new StringBuilder(String.valueOf(d).length() + 59 + strValueOf2.length());
                sb2.append("rounded value is out of range for input ");
                sb2.append(d);
                sb2.append(" and rounding mode ");
                sb2.append(strValueOf2);
                throw new ArithmeticException(sb2.toString());
            case 3:
                if (d <= 0.0d || zzd(d)) {
                    dRint = d;
                } else {
                    j = (long) d;
                    j2 = 1;
                    dRint = j + j2;
                }
                if ((-9.223372036854776E18d) - dRint < 1.0d) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                if (z2 && (dRint < 9.223372036854776E18d)) {
                    return (long) dRint;
                }
                String strValueOf3 = String.valueOf(roundingMode);
                StringBuilder sb3 = new StringBuilder(String.valueOf(d).length() + 59 + strValueOf3.length());
                sb3.append("rounded value is out of range for input ");
                sb3.append(d);
                sb3.append(" and rounding mode ");
                sb3.append(strValueOf3);
                throw new ArithmeticException(sb3.toString());
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
                String strValueOf4 = String.valueOf(roundingMode);
                StringBuilder sb4 = new StringBuilder(String.valueOf(d).length() + 59 + strValueOf4.length());
                sb4.append("rounded value is out of range for input ");
                sb4.append(d);
                sb4.append(" and rounding mode ");
                sb4.append(strValueOf4);
                throw new ArithmeticException(sb4.toString());
            case 5:
                if (zzd(d)) {
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
                String strValueOf5 = String.valueOf(roundingMode);
                StringBuilder sb5 = new StringBuilder(String.valueOf(d).length() + 59 + strValueOf5.length());
                sb5.append("rounded value is out of range for input ");
                sb5.append(d);
                sb5.append(" and rounding mode ");
                sb5.append(strValueOf5);
                throw new ArithmeticException(sb5.toString());
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
                String strValueOf6 = String.valueOf(roundingMode);
                StringBuilder sb6 = new StringBuilder(String.valueOf(d).length() + 59 + strValueOf6.length());
                sb6.append("rounded value is out of range for input ");
                sb6.append(d);
                sb6.append(" and rounding mode ");
                sb6.append(strValueOf6);
                throw new ArithmeticException(sb6.toString());
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
                String strValueOf7 = String.valueOf(roundingMode);
                StringBuilder sb7 = new StringBuilder(String.valueOf(d).length() + 59 + strValueOf7.length());
                sb7.append("rounded value is out of range for input ");
                sb7.append(d);
                sb7.append(" and rounding mode ");
                sb7.append(strValueOf7);
                throw new ArithmeticException(sb7.toString());
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
                String strValueOf8 = String.valueOf(roundingMode);
                StringBuilder sb8 = new StringBuilder(String.valueOf(d).length() + 59 + strValueOf8.length());
                sb8.append("rounded value is out of range for input ");
                sb8.append(d);
                sb8.append(" and rounding mode ");
                sb8.append(strValueOf8);
                throw new ArithmeticException(sb8.toString());
            default:
                throw new AssertionError();
        }
    }

    public static boolean zzb(double d) {
        if (d > 0.0d && zzgwo.zzb(d)) {
            long jZza = zzgwo.zza(d);
            if ((jZza & ((-1) + jZza)) == 0) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Code duplicated, block: B:26:0x0067  */
    /* JADX WARN: Code duplicated, block: B:33:? A[RETURN, SYNTHETIC] */
    public static int zzc(double d, RoundingMode roundingMode) {
        boolean zZzb;
        boolean z2 = false;
        zzgqa.zzb(d > 0.0d && zzgwo.zzb(d), "x must be positive and finite");
        int exponent = Math.getExponent(d);
        if (Math.getExponent(d) < -1022) {
            return zzc(d * 4.503599627370496E15d, roundingMode) - 52;
        }
        switch (zzgwm.zza[roundingMode.ordinal()]) {
            case 1:
                zzgwt.zzb(zzb(d));
                return exponent;
            case 2:
                return exponent;
            case 3:
                z2 = !zzb(d);
                if (z2) {
                    return exponent + 1;
                }
                return exponent;
            case 4:
                z2 = exponent < 0;
                zZzb = zzb(d);
                z2 &= !zZzb;
                if (z2) {
                    return exponent + 1;
                }
                return exponent;
            case 5:
                z2 = exponent >= 0;
                zZzb = zzb(d);
                z2 &= !zZzb;
                if (z2) {
                    return exponent + 1;
                }
                return exponent;
            case 6:
            case 7:
            case 8:
                double dLongBitsToDouble = Double.longBitsToDouble((Double.doubleToRawLongBits(d) & 4503599627370495L) | 4607182418800017408L);
                if (dLongBitsToDouble * dLongBitsToDouble > 2.0d) {
                    z2 = true;
                }
                if (z2) {
                    return exponent + 1;
                }
                return exponent;
            default:
                throw new AssertionError();
        }
    }

    public static boolean zzd(double d) {
        if (zzgwo.zzb(d)) {
            return d == 0.0d || 52 - Long.numberOfTrailingZeros(zzgwo.zza(d)) <= Math.getExponent(d);
        }
        return false;
    }
}
