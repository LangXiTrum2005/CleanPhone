package com.applovin.impl;

import android.os.Looper;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public abstract class m1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final Thread f8393a = Looper.getMainLooper().getThread();

    public static void a(Throwable th2) {
    }

    public static void a(Throwable th2, String str, Object... objArr) {
    }

    public static boolean a(boolean z10) {
        return a(z10, "Assertion failed", new Object[0]);
    }

    public static boolean a(boolean z10, String str, Object... objArr) {
        if (!z10) {
            a(str, objArr);
        }
        return z10;
    }

    public static boolean a(Object obj) {
        return a(obj, "Null value not expected", new Object[0]);
    }

    public static boolean a(Object obj, String str, Object... objArr) {
        return a(obj != null, str, objArr);
    }

    public static void a(String str, Object... objArr) {
        a((Throwable) null, str, objArr);
    }
}
