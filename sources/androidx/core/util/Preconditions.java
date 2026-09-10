package androidx.core.util;

/* JADX INFO: loaded from: classes.dex */
public final class Preconditions {
    public static void a(String str, boolean z2) {
        if (!z2) {
            throw new IllegalArgumentException(str);
        }
    }

    public static void b(float f, String str) {
        if (Float.isNaN(f)) {
            throw new IllegalArgumentException(str.concat(" must not be NaN"));
        }
        if (Float.isInfinite(f)) {
            throw new IllegalArgumentException(str.concat(" must not be infinite"));
        }
    }

    public static void c(int i2) {
        if (i2 < 0) {
            throw new IllegalArgumentException();
        }
    }

    public static void d(Object obj, String str) {
        if (obj == null) {
            throw new NullPointerException(str);
        }
    }
}
