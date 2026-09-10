package com.p004ironsource.sdk.utils;

import android.text.TextUtils;
import android.util.Log;
import com.p004ironsource.mh;

/* JADX INFO: loaded from: classes5.dex */
public class Logger {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static boolean f27162a;

    public static void d(String str, String str2) {
        if (f27162a) {
            Log.d(str, str2);
        }
    }

    public static void e(String str, String str2) {
        if (f27162a) {
            Log.e(str, str2);
        }
    }

    public static void enableLogging(int i2) {
        f27162a = mh.d.MODE_0.a() != i2;
    }

    public static void i(String str, String str2) {
        if (f27162a) {
            Log.i(str, str2);
        }
    }

    public static void v(String str, String str2) {
        if (f27162a) {
            Log.v(str, str2);
        }
    }

    public static void w(String str, String str2) {
        if (f27162a) {
            Log.w(str, str2);
        }
    }

    public static void d(String str, String str2, Throwable th) {
        if (f27162a) {
            Log.d(str, str2, th);
        }
    }

    public static void e(String str, String str2, Throwable th) {
        if (f27162a) {
            Log.e(str, str2, th);
        }
    }

    public static void i(String str, String str2, Throwable th) {
        if (!f27162a || TextUtils.isEmpty(str2)) {
            return;
        }
        Log.i(str, str2, th);
    }

    public static void v(String str, String str2, Throwable th) {
        if (f27162a) {
            Log.v(str, str2, th);
        }
    }

    public static void w(String str, String str2, Throwable th) {
        if (f27162a) {
            Log.w(str, str2, th);
        }
    }
}
