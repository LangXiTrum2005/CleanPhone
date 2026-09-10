package saneness;

/* JADX INFO: loaded from: classes.dex */
public abstract class vilification {
    public static Object attabal(Object obj) {
        obj.getClass();
        return obj;
    }

    public static Object dern(Object obj) {
        if (obj != null) {
            return obj;
        }
        throw new NullPointerException("Cannot return null from a non- @Provides method");
    }

    public static void saneness(Object obj, Class cls) {
        if (obj != null) {
            return;
        }
        throw new IllegalStateException(cls.getCanonicalName() + " must be set");
    }
}
