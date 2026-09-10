package androidx.media3.common.util;

/* JADX INFO: loaded from: classes.dex */
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

    public static void d(String str, boolean z2) {
        if (!z2) {
            throw new IllegalStateException(String.valueOf(str));
        }
    }

    public static void e(boolean z2) {
        if (!z2) {
            throw new IllegalStateException();
        }
    }

    public static void f(Object obj) {
        if (obj == null) {
            throw new IllegalStateException();
        }
    }
}
