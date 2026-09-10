package com.badlogic.gdx.utils;

/* JADX INFO: loaded from: classes.dex */
public final class NumberUtils {
    public static long doubleToLongBits(double d) {
        return Double.doubleToLongBits(d);
    }

    public static int floatToIntBits(float f) {
        return Float.floatToIntBits(f);
    }

    public static int floatToIntColor(float f) {
        int iFloatToRawIntBits = Float.floatToRawIntBits(f);
        return iFloatToRawIntBits | (((int) ((iFloatToRawIntBits >>> 24) * 1.003937f)) << 24);
    }

    public static int floatToRawIntBits(float f) {
        return Float.floatToRawIntBits(f);
    }

    public static float intBitsToFloat(int i) {
        return Float.intBitsToFloat(i);
    }

    public static float intToFloatColor(int i) {
        return Float.intBitsToFloat(i & (-16777217));
    }

    public static double longBitsToDouble(long j) {
        return Double.longBitsToDouble(j);
    }
}
