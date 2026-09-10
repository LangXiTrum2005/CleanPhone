package com.bytedance.adsdk.ugeno.xha;

/* JADX INFO: loaded from: classes2.dex */
public final class ik {
    public static float ri(String str, float f) {
        if (str == null) {
            return f;
        }
        try {
            return Float.parseFloat(str);
        } catch (Throwable unused) {
            return f;
        }
    }

    public static int ri(String str, int i) {
        if (str == null) {
            return i;
        }
        try {
            return (int) Float.parseFloat(str);
        } catch (Throwable unused) {
            return i;
        }
    }

    public static long ri(String str, long j) {
        if (str == null) {
            return j;
        }
        try {
            return Long.parseLong(str);
        } catch (Throwable unused) {
            return j;
        }
    }

    public static double ri(String str, double d) {
        if (str == null) {
            return d;
        }
        try {
            return Double.parseDouble(str);
        } catch (Throwable unused) {
            return d;
        }
    }

    public static boolean ri(String str, boolean z) {
        if (str == null) {
            return z;
        }
        try {
            return Boolean.parseBoolean(str);
        } catch (Throwable unused) {
            return z;
        }
    }
}
