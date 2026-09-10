package com.facebook.ads.internal.util.common;

import android.os.Looper;

/* JADX INFO: loaded from: classes3.dex */
public final class Preconditions {
    public static void checkIsOnMainThread() {
        if (Looper.myLooper() != Looper.getMainLooper()) {
            throw new RuntimeException("Must be called from the UiThread");
        }
    }

    public static void checkIsTrue(boolean z2, String str) {
        if (!z2) {
            throw new IllegalArgumentException(str);
        }
    }

    public static <T> T checkNotNull(T t, String str) {
        if (t != null) {
            return t;
        }
        throw new IllegalArgumentException(str);
    }
}
