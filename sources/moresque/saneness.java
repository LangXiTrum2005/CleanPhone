package moresque;

import com.google.common.base.formularize;

/* JADX INFO: compiled from: DoubleUtils.java */
/* JADX INFO: loaded from: classes3.dex */
public final class saneness {
    public static long attabal(double d) {
        formularize.marial(saneness(d), "not a normal value");
        int exponent = Math.getExponent(d);
        long jDoubleToRawLongBits = Double.doubleToRawLongBits(d) & 4503599627370495L;
        return exponent == -1023 ? jDoubleToRawLongBits << 1 : jDoubleToRawLongBits | 4503599627370496L;
    }

    public static boolean saneness(double d) {
        return Math.getExponent(d) <= 1023;
    }
}
