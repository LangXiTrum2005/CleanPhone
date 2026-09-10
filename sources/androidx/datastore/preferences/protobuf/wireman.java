package androidx.datastore.preferences.protobuf;

/* JADX INFO: compiled from: Android.java */
/* JADX INFO: loaded from: classes.dex */
public final class wireman {

    /* JADX INFO: renamed from: attabal, reason: collision with root package name */
    public static boolean f9897attabal;

    /* JADX INFO: renamed from: dern, reason: collision with root package name */
    public static final boolean f9898dern;

    /* JADX INFO: renamed from: saneness, reason: collision with root package name */
    public static final Class<?> f9899saneness = attabal("libcore.io.Memory");

    static {
        f9898dern = (f9897attabal || attabal("org.robolectric.Robolectric") == null) ? false : true;
    }

    public static <T> Class<T> attabal(String str) {
        try {
            return (Class<T>) Class.forName(str);
        } catch (Throwable unused) {
            return null;
        }
    }

    public static boolean dern() {
        if (f9897attabal) {
            return true;
        }
        return (f9899saneness == null || f9898dern) ? false : true;
    }

    public static Class<?> saneness() {
        return f9899saneness;
    }
}
