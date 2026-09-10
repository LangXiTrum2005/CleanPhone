package com.mbridge.msdk.foundation.tools;

import android.text.TextUtils;
import android.util.Log;
import com.mbridge.msdk.MBridgeConstans;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public class q0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static boolean f34162a = true;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static boolean f34163b = true;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static boolean f34164c = true;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static boolean f34165d = false;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static boolean f34166e = true;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static boolean f34167f = false;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static boolean f34168g = true;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static boolean f34169h = true;

    static {
        if (MBridgeConstans.DEBUG) {
            return;
        }
        f34168g = false;
        f34162a = false;
        f34164c = false;
        f34169h = false;
        f34163b = false;
        f34167f = false;
        f34166e = false;
        f34165d = false;
    }

    public static void a(String str, String str2) {
        if (!f34162a || TextUtils.isEmpty(str2)) {
            return;
        }
        Log.d(a(str), str2);
    }

    public static void b(String str, String str2) {
        if (!f34163b || str2 == null) {
            return;
        }
        Log.e(a(str), str2);
    }

    public static void c(String str, String str2) {
        if (!f34164c || TextUtils.isEmpty(str2)) {
            return;
        }
        Log.i(a(str), str2);
    }

    public static void d(String str, String str2) {
        if (!f34169h || TextUtils.isEmpty(str2)) {
            return;
        }
        Log.w(a(str), str2);
    }

    public static void b(String str, String str2, Throwable th2) {
        if (!f34163b || str2 == null || th2 == null) {
            return;
        }
        Log.e(a(str), str2, th2);
    }

    private static String a(String str) {
        return !TextUtils.isEmpty(str) ? defpackage.e.n("MBRIDGE_", str) : str;
    }

    public static void c(String str, String str2, Throwable th2) {
        if (!f34169h || TextUtils.isEmpty(str2)) {
            return;
        }
        Log.w(a(str), str2, th2);
    }

    public static void a(String str, String str2, Throwable th2) {
        if (!f34162a || TextUtils.isEmpty(str2)) {
            return;
        }
        Log.d(a(str), str2, th2);
    }

    public static void a(String str, Throwable th2) {
        if (!f34169h || th2 == null) {
            return;
        }
        Log.w(a(str), th2);
    }
}
