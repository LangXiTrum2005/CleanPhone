package moresque;

import java.math.RoundingMode;

/* JADX INFO: compiled from: DoubleMath.java */
/* JADX INFO: loaded from: classes3.dex */
public final class attabal {

    /* JADX INFO: renamed from: attabal, reason: collision with root package name */
    public static final double f33613attabal = Math.log(2.0d);

    /* JADX INFO: renamed from: saneness, reason: collision with root package name */
    public static final double[] f33614saneness = {1.0d, 2.0922789888E13d, 2.631308369336935E35d, 1.2413915592536073E61d, 1.2688693218588417E89d, 7.156945704626381E118d, 9.916779348709496E149d, 1.974506857221074E182d, 3.856204823625804E215d, 5.5502938327393044E249d, 4.7147236359920616E284d};

    /* JADX INFO: renamed from: moresque.attabal$attabal, reason: collision with other inner class name */
    /* JADX INFO: compiled from: DoubleMath.java */
    public static /* synthetic */ class C0747attabal {

        /* JADX INFO: renamed from: attabal, reason: collision with root package name */
        public static final /* synthetic */ int[] f33615attabal;

        static {
            int[] iArr = new int[RoundingMode.values().length];
            f33615attabal = iArr;
            try {
                iArr[RoundingMode.UNNECESSARY.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f33615attabal[RoundingMode.FLOOR.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f33615attabal[RoundingMode.CEILING.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f33615attabal[RoundingMode.DOWN.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f33615attabal[RoundingMode.UP.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f33615attabal[RoundingMode.HALF_EVEN.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f33615attabal[RoundingMode.HALF_UP.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f33615attabal[RoundingMode.HALF_DOWN.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
        }
    }

    public static boolean attabal(double d) {
        if (saneness.saneness(d)) {
            return d == 0.0d || 52 - Long.numberOfTrailingZeros(saneness.attabal(d)) <= Math.getExponent(d);
        }
        return false;
    }

    public static long dern(double d, RoundingMode roundingMode) {
        double dSaneness = saneness(d, roundingMode);
        marial.attabal(((-9.223372036854776E18d) - dSaneness < 1.0d) & (dSaneness < 9.223372036854776E18d), d, roundingMode);
        return (long) dSaneness;
    }

    public static double saneness(double d, RoundingMode roundingMode) {
        if (!saneness.saneness(d)) {
            throw new ArithmeticException("input is infinite or NaN");
        }
        switch (C0747attabal.f33615attabal[roundingMode.ordinal()]) {
            case 1:
                marial.beachfront(attabal(d));
                return d;
            case 2:
                return (d >= 0.0d || attabal(d)) ? d : ((long) d) - 1;
            case 3:
                return (d <= 0.0d || attabal(d)) ? d : ((long) d) + 1;
            case 4:
                return d;
            case 5:
                if (attabal(d)) {
                    return d;
                }
                return ((long) d) + ((long) (d > 0.0d ? 1 : -1));
            case 6:
                return Math.rint(d);
            case 7:
                double dRint = Math.rint(d);
                return Math.abs(d - dRint) == 0.5d ? d + Math.copySign(0.5d, d) : dRint;
            case 8:
                double dRint2 = Math.rint(d);
                return Math.abs(d - dRint2) == 0.5d ? d : dRint2;
            default:
                throw new AssertionError();
        }
    }
}
