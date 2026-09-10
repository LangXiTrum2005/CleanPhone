package com.smartdigimkt.v0;

import android.content.Context;
import android.text.TextUtils;
import android.util.Log;
import android.widget.Toast;

/* JADX INFO: loaded from: classes6.dex */
public class r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final String f39021a = "sdm_";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static boolean f39022b = true;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static boolean f39023c = true;
    public static boolean d = true;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static boolean f39024e = true;
    public static boolean f = true;
    public static boolean g = false;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static boolean f39025h = true;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static boolean f39026i = false;

    static {
        if (com.smartdigimkt.b.b.f33800a) {
            return;
        }
        f39022b = false;
        f39023c = false;
        d = false;
        f39024e = false;
        f = false;
        g = false;
        f39025h = false;
        f39026i = false;
    }

    private r() {
    }

    public static void a(String str, String str2) {
        if (!f39023c || TextUtils.isEmpty(str2)) {
            return;
        }
        Log.d(a(str), str2);
    }

    public static void b(String str, String str2) {
        if (!f || str2 == null) {
            return;
        }
        Log.e(a(str), str2);
    }

    public static void c(String str, String str2) {
        if (!d || TextUtils.isEmpty(str2)) {
            return;
        }
        Log.i(a(str), str2);
    }

    public static void d(String str, String str2) {
        if (!f39022b || TextUtils.isEmpty(str2)) {
            return;
        }
        Log.v(a(str), str2);
    }

    public static void e(String str, String str2) {
        if (!f39024e || TextUtils.isEmpty(str2)) {
            return;
        }
        Log.w(a(str), str2);
    }

    public static void b(String str, String str2, Throwable th) {
        if (!f || str2 == null || th == null) {
            return;
        }
        Log.e(a(str), str2, th);
    }

    public static void a(String str, String str2, Throwable th) {
        if (!f39023c || TextUtils.isEmpty(str2)) {
            return;
        }
        Log.d(a(str), str2, th);
    }

    public static void c(String str, String str2, Throwable th) {
        if (!d || TextUtils.isEmpty(str2)) {
            return;
        }
        Log.i(a(str), str2, th);
    }

    public static void d(String str, String str2, Throwable th) {
        if (!f39022b || TextUtils.isEmpty(str2)) {
            return;
        }
        Log.v(a(str), str2, th);
    }

    public static void e(String str, String str2, Throwable th) {
        if (!f39024e || TextUtils.isEmpty(str2)) {
            return;
        }
        Log.w(a(str), str2, th);
    }

    public static void a(String str, Throwable th) {
        if (!f39024e || th == null) {
            return;
        }
        Log.w(a(str), th);
    }

    public static void a(Context context, String str) {
        if (g) {
            Toast.makeText(context, str, 1).show();
        }
    }

    private static String a(String str) {
        return !TextUtils.isEmpty(str) ? android.support.v4.media.a.C(f39021a, str) : str;
    }
}
