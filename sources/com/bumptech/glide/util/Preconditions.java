package com.bumptech.glide.util;

/* JADX INFO: loaded from: classes.dex */
public final class Preconditions {
    public static void a(String str, boolean z2) {
        if (!z2) {
            throw new IllegalArgumentException(str);
        }
    }

    public static void b(Object obj) {
        c(obj, "Argument must not be null");
    }

    public static void c(Object obj, String str) {
        if (obj == null) {
            throw new NullPointerException(str);
        }
    }
}
