package com.ironsource.sdk.utils;

import android.text.TextUtils;
import android.util.Log;
import com.ironsource.C0514p8;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public class Logger {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static boolean f30681a;

    public static void d(String str, String str2) {
        if (f30681a) {
            Log.d(str, str2);
        }
    }

    public static void e(String str, String str2) {
        if (f30681a) {
            Log.e(str, str2);
        }
    }

    public static void enableLogging(int i10) {
        f30681a = C0514p8.d.MODE_0.b() != i10;
    }

    public static void i(String str, String str2) {
        if (f30681a) {
            Log.i(str, str2);
        }
    }

    public static void v(String str, String str2) {
        if (f30681a) {
            Log.v(str, str2);
        }
    }

    public static void w(String str, String str2) {
        if (f30681a) {
            Log.w(str, str2);
        }
    }

    public static void d(String str, String str2, Throwable th2) {
        if (f30681a) {
            Log.d(str, str2, th2);
        }
    }

    public static void e(String str, String str2, Throwable th2) {
        if (f30681a) {
            Log.e(str, str2, th2);
        }
    }

    public static void i(String str, String str2, Throwable th2) {
        if (!f30681a || TextUtils.isEmpty(str2)) {
            return;
        }
        Log.i(str, str2, th2);
    }

    public static void v(String str, String str2, Throwable th2) {
        if (f30681a) {
            Log.v(str, str2, th2);
        }
    }

    public static void w(String str, String str2, Throwable th2) {
        if (f30681a) {
            Log.w(str, str2, th2);
        }
    }
}
