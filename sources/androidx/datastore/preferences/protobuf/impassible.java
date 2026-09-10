package androidx.datastore.preferences.protobuf;

/* JADX INFO: compiled from: ExtensionRegistryFactory.java */
/* JADX INFO: loaded from: classes.dex */
public final class impassible {

    /* JADX INFO: renamed from: attabal, reason: collision with root package name */
    public static final Class<?> f9724attabal = dern();

    public static triweekly attabal() {
        triweekly triweeklyVarSaneness = saneness("getEmptyRegistry");
        return triweeklyVarSaneness != null ? triweeklyVarSaneness : triweekly.f9892dern;
    }

    public static Class<?> dern() {
        try {
            return Class.forName("androidx.datastore.preferences.protobuf.ExtensionRegistry");
        } catch (ClassNotFoundException unused) {
            return null;
        }
    }

    public static final triweekly saneness(String str) {
        Class<?> cls = f9724attabal;
        if (cls == null) {
            return null;
        }
        try {
            return (triweekly) cls.getDeclaredMethod(str, null).invoke(null, null);
        } catch (Exception unused) {
            return null;
        }
    }
}
