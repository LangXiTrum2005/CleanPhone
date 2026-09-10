package decarock;

import android.text.TextUtils;
import org.checkerframework.checker.nullness.qual.EnsuresNonNull;
import org.checkerframework.dataflow.qual.Pure;

/* JADX INFO: compiled from: Assertions.java */
/* JADX INFO: loaded from: classes.dex */
public final class attabal {
    @Pure
    public static void attabal(boolean z) {
        if (!z) {
            throw new IllegalArgumentException();
        }
    }

    @EnsuresNonNull({"#1"})
    @Pure
    public static <T> T beachfront(T t, Object obj) {
        if (t != null) {
            return t;
        }
        throw new NullPointerException(String.valueOf(obj));
    }

    @Pure
    public static void competently(boolean z) {
        if (!z) {
            throw new IllegalStateException();
        }
    }

    @EnsuresNonNull({"#1"})
    @Pure
    public static <T> T cutely(T t, Object obj) {
        if (t != null) {
            return t;
        }
        throw new IllegalStateException(String.valueOf(obj));
    }

    @Pure
    public static int dern(int i, int i2, int i3) {
        if (i < i2 || i >= i3) {
            throw new IndexOutOfBoundsException();
        }
        return i;
    }

    @Pure
    public static void impromptu(boolean z, Object obj) {
        if (!z) {
            throw new IllegalStateException(String.valueOf(obj));
        }
    }

    @EnsuresNonNull({"#1"})
    @Pure
    public static <T> T marial(T t) {
        t.getClass();
        return t;
    }

    @Pure
    public static void saneness(boolean z, Object obj) {
        if (!z) {
            throw new IllegalArgumentException(String.valueOf(obj));
        }
    }

    @EnsuresNonNull({"#1"})
    @Pure
    public static <T> T taiyuan(T t) {
        if (t != null) {
            return t;
        }
        throw new IllegalStateException();
    }

    @EnsuresNonNull({"#1"})
    @Pure
    public static String wireman(String str) {
        if (TextUtils.isEmpty(str)) {
            throw new IllegalArgumentException();
        }
        return str;
    }
}
