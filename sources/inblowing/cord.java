package inblowing;

/* JADX INFO: compiled from: Preconditions.java */
/* JADX INFO: loaded from: classes3.dex */
public final class cord {
    public static void attabal(boolean z, String str) {
        if (!z) {
            throw new IllegalArgumentException(str);
        }
    }

    public static <T> T dern(T t, String str) {
        if (t != null) {
            return t;
        }
        throw new NullPointerException(str);
    }

    public static <T> T saneness(T t) {
        t.getClass();
        return t;
    }

    public static void wireman(boolean z, String str) {
        if (!z) {
            throw new IllegalStateException(str);
        }
    }
}
