package com.google.android.exoplayer2.util;

/* JADX INFO: loaded from: classes3.dex */
public final class Assertions {
    public static void a(String str, boolean z2) {
        if (!z2) {
            throw new IllegalArgumentException(String.valueOf(str));
        }
    }

    public static void b(boolean z2) {
        if (!z2) {
            throw new IllegalArgumentException();
        }
    }

    public static void c(int i2, int i3) {
        if (i2 < 0 || i2 >= i3) {
            throw new IndexOutOfBoundsException();
        }
    }

    public static void d(boolean z2) {
        if (!z2) {
            throw new IllegalStateException();
        }
    }

    public static void e(Object obj) {
        if (obj == null) {
            throw new IllegalStateException();
        }
    }
}
