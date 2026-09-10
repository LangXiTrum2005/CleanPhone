package kotlin.time;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt;
import kotlin.text.StringsKt;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"kotlin-stdlib"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class DurationKt {
    public static final long a(String str) {
        DurationUnit durationUnit;
        char cCharAt;
        int length = str.length();
        if (length == 0) {
            throw new IllegalArgumentException("The string is empty");
        }
        Duration.Companion companion = Duration.f44719Y;
        char cCharAt2 = str.charAt(0);
        int i2 = (cCharAt2 == '+' || cCharAt2 == '-') ? 1 : 0;
        boolean z2 = (i2 > 0) && StringsKt.N(str, '-');
        if (length <= i2) {
            throw new IllegalArgumentException("No components");
        }
        if (str.charAt(i2) != 'P') {
            throw new IllegalArgumentException();
        }
        int i3 = i2 + 1;
        if (i3 == length) {
            throw new IllegalArgumentException();
        }
        DurationUnit durationUnit2 = null;
        long jI = 0;
        boolean z3 = false;
        while (i3 < length) {
            if (str.charAt(i3) != 'T') {
                int i4 = i3;
                while (i4 < str.length() && (('0' <= (cCharAt = str.charAt(i4)) && cCharAt < ':') || StringsKt.m("+-.", cCharAt))) {
                    i4++;
                }
                String strSubstring = str.substring(i3, i4);
                Intrinsics.e(strSubstring, "substring(...)");
                if (strSubstring.length() == 0) {
                    throw new IllegalArgumentException();
                }
                int length2 = strSubstring.length() + i3;
                if (length2 < 0 || length2 >= str.length()) {
                    throw new IllegalArgumentException("Missing unit for value ".concat(strSubstring));
                }
                char cCharAt3 = str.charAt(length2);
                int i5 = length2 + 1;
                if (z3) {
                    if (cCharAt3 == 'H') {
                        durationUnit = DurationUnit.HOURS;
                    } else if (cCharAt3 == 'M') {
                        durationUnit = DurationUnit.MINUTES;
                    } else {
                        if (cCharAt3 != 'S') {
                            throw new IllegalArgumentException("Invalid duration ISO time unit: " + cCharAt3);
                        }
                        durationUnit = DurationUnit.SECONDS;
                    }
                } else {
                    if (cCharAt3 != 'D') {
                        throw new IllegalArgumentException("Invalid or unsupported duration ISO non-time unit: " + cCharAt3);
                    }
                    durationUnit = DurationUnit.DAYS;
                }
                if (durationUnit2 != null && durationUnit2.compareTo(durationUnit) <= 0) {
                    throw new IllegalArgumentException("Unexpected order of duration components");
                }
                int iU = StringsKt.u(strSubstring, '.', 0, 6);
                if (durationUnit != DurationUnit.SECONDS || iU <= 0) {
                    jI = Duration.i(jI, h(e(strSubstring), durationUnit));
                } else {
                    String strSubstring2 = strSubstring.substring(0, iU);
                    Intrinsics.e(strSubstring2, "substring(...)");
                    long jI2 = Duration.i(jI, h(e(strSubstring2), durationUnit));
                    String strSubstring3 = strSubstring.substring(iU);
                    Intrinsics.e(strSubstring3, "substring(...)");
                    jI = Duration.i(jI2, f(Double.parseDouble(strSubstring3), durationUnit));
                }
                durationUnit2 = durationUnit;
                i3 = i5;
            } else {
                if (z3 || (i3 = i3 + 1) == length) {
                    throw new IllegalArgumentException();
                }
                z3 = true;
            }
        }
        return z2 ? Duration.m(jI) : jI;
    }

    public static final long b(long j) {
        long j2 = (j << 1) + 1;
        Duration.Companion companion = Duration.f44719Y;
        int i2 = DurationJvmKt.f44720a;
        return j2;
    }

    public static final long c(long j) {
        return (-4611686018426L > j || j >= 4611686018427L) ? b(RangesKt.c(j)) : d(j * ((long) 1000000));
    }

    public static final long d(long j) {
        long j2 = j << 1;
        Duration.Companion companion = Duration.f44719Y;
        int i2 = DurationJvmKt.f44720a;
        return j2;
    }

    public static final long e(String str) {
        char cCharAt;
        int length = str.length();
        int i2 = (length <= 0 || !StringsKt.m("+-", str.charAt(0))) ? 0 : 1;
        if (length - i2 > 16) {
            int i3 = i2;
            while (true) {
                if (i2 >= length) {
                    if (length - i3 <= 16) {
                        break;
                    }
                    return str.charAt(0) == '-' ? Long.MIN_VALUE : Long.MAX_VALUE;
                }
                char cCharAt2 = str.charAt(i2);
                if (cCharAt2 == '0') {
                    if (i3 == i2) {
                        i3++;
                    }
                } else if ('1' > cCharAt2 || cCharAt2 >= ':') {
                    break;
                }
                i2++;
            }
        }
        return (!StringsKt.M(str, "+", false) || length <= 1 || '0' > (cCharAt = str.charAt(1)) || cCharAt >= ':') ? Long.parseLong(str) : Long.parseLong(StringsKt.o(1, str));
    }

    public static final long f(double d, DurationUnit unit) {
        Intrinsics.f(unit, "unit");
        double dA = DurationUnitKt__DurationUnitJvmKt.a(d, unit, DurationUnit.NANOSECONDS);
        if (Double.isNaN(dA)) {
            throw new IllegalArgumentException("Duration value cannot be NaN.");
        }
        if (Double.isNaN(dA)) {
            throw new IllegalArgumentException("Cannot round NaN value.");
        }
        long jRound = Math.round(dA);
        if (-4611686018426999999L <= jRound && jRound < 4611686018427000000L) {
            return d(jRound);
        }
        double dA2 = DurationUnitKt__DurationUnitJvmKt.a(d, unit, DurationUnit.MILLISECONDS);
        if (Double.isNaN(dA2)) {
            throw new IllegalArgumentException("Cannot round NaN value.");
        }
        return c(Math.round(dA2));
    }

    public static final long g(int i2, DurationUnit unit) {
        Intrinsics.f(unit, "unit");
        return unit.compareTo(DurationUnit.SECONDS) <= 0 ? d(DurationUnitKt__DurationUnitJvmKt.c(i2, unit, DurationUnit.NANOSECONDS)) : h(i2, unit);
    }

    public static final long h(long j, DurationUnit unit) {
        Intrinsics.f(unit, "unit");
        DurationUnit durationUnit = DurationUnit.NANOSECONDS;
        long jC = DurationUnitKt__DurationUnitJvmKt.c(4611686018426999999L, durationUnit, unit);
        return ((-jC) > j || j > jC) ? b(RangesKt.c(DurationUnitKt__DurationUnitJvmKt.b(j, unit, DurationUnit.MILLISECONDS))) : d(DurationUnitKt__DurationUnitJvmKt.c(j, unit, durationUnit));
    }
}
