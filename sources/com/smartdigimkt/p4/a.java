package com.smartdigimkt.p4;

import android.os.Looper;
import android.text.TextUtils;

/* JADX INFO: loaded from: classes6.dex */
public final class a {
    private a() {
    }

    public static void a(boolean z2) {
        if (!z2) {
            throw new IllegalArgumentException();
        }
    }

    public static void b(boolean z2) {
        if (!z2) {
            throw new IllegalStateException();
        }
    }

    public static void a(boolean z2, Object obj) {
        if (!z2) {
            throw new IllegalArgumentException(String.valueOf(obj));
        }
    }

    public static void b(boolean z2, Object obj) {
        if (!z2) {
            throw new IllegalStateException(String.valueOf(obj));
        }
    }

    public static int a(int i2, int i3, int i4) {
        if (i2 < i3 || i2 >= i4) {
            throw new IndexOutOfBoundsException();
        }
        return i2;
    }

    public static <T> T a(T t) {
        t.getClass();
        return t;
    }

    public static <T> T a(T t, Object obj) {
        if (t != null) {
            return t;
        }
        throw new NullPointerException(String.valueOf(obj));
    }

    public static String a(String str) {
        if (TextUtils.isEmpty(str)) {
            throw new IllegalArgumentException();
        }
        return str;
    }

    public static String a(String str, Object obj) {
        if (TextUtils.isEmpty(str)) {
            throw new IllegalArgumentException(String.valueOf(obj));
        }
        return str;
    }

    public static void a() {
        if (Looper.myLooper() != Looper.getMainLooper()) {
            throw new IllegalStateException("Not in applications main thread");
        }
    }
}
