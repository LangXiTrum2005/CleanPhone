package com.bytedance.adsdk.ugeno.ebl;

/* JADX INFO: loaded from: classes.dex */
public final class lk {
    public static float Lxb(String str, float f) {
        try {
            return Float.parseFloat(str);
        } catch (NumberFormatException unused) {
            return f;
        }
    }

    public static int Lxb(String str, int i) {
        try {
            return Integer.parseInt(str);
        } catch (NumberFormatException unused) {
            return i;
        }
    }

    public static long Lxb(String str, long j) {
        try {
            return Long.parseLong(str);
        } catch (NumberFormatException unused) {
            return j;
        }
    }

    public static double Lxb(String str, double d) {
        try {
            return Double.parseDouble(str);
        } catch (NumberFormatException unused) {
            return d;
        }
    }

    public static boolean Lxb(String str, boolean z) {
        try {
            return Boolean.parseBoolean(str);
        } catch (NumberFormatException unused) {
            return z;
        }
    }
}
