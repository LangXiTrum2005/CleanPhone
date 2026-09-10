package delouse;

/* JADX INFO: compiled from: Preconditions.java */
/* JADX INFO: loaded from: classes2.dex */
public final class wireman {
    public static <T> void attabal(T t, Class<T> cls) {
        if (t != null) {
            return;
        }
        throw new IllegalStateException(cls.getCanonicalName() + " must be set");
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

    public static <T> T wireman(T t) {
        if (t != null) {
            return t;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }
}
