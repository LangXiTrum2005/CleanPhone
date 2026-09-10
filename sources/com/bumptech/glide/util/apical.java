package com.bumptech.glide.util;

import android.text.TextUtils;
import java.util.Collection;

/* JADX INFO: compiled from: Preconditions.java */
/* JADX INFO: loaded from: classes2.dex */
public final class apical {
    public static void attabal(boolean z, String str) {
        if (!z) {
            throw new IllegalArgumentException(str);
        }
    }

    public static <T extends Collection<Y>, Y> T dern(T t) {
        if (t.isEmpty()) {
            throw new IllegalArgumentException("Must not be empty.");
        }
        return t;
    }

    public static <T> T marial(T t, String str) {
        if (t != null) {
            return t;
        }
        throw new NullPointerException(str);
    }

    public static String saneness(String str) {
        if (TextUtils.isEmpty(str)) {
            throw new IllegalArgumentException("Must not be null or empty");
        }
        return str;
    }

    public static <T> T wireman(T t) {
        return (T) marial(t, "Argument must not be null");
    }
}
