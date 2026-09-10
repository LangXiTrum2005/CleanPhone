package com.bytedance.adsdk.ugeno.wd;

/* JADX INFO: loaded from: classes.dex */
public final class lnr {
    public static float qdl(String str, float f) {
        try {
            return Float.parseFloat(str);
        } catch (NumberFormatException unused) {
            return f;
        }
    }

    public static int qdl(String str, int i2) {
        try {
            return Integer.parseInt(str);
        } catch (NumberFormatException unused) {
            return i2;
        }
    }

    public static long qdl(String str, long j) {
        try {
            return Long.parseLong(str);
        } catch (NumberFormatException unused) {
            return j;
        }
    }

    public static double qdl(String str, double d) {
        try {
            return Double.parseDouble(str);
        } catch (NumberFormatException unused) {
            return d;
        }
    }

    public static boolean qdl(String str, boolean z2) {
        try {
            return Boolean.parseBoolean(str);
        } catch (NumberFormatException unused) {
            return z2;
        }
    }
}
