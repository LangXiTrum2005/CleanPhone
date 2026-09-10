package androidx.datastore.preferences.protobuf;

/* JADX INFO: compiled from: ExtensionSchemas.java */
/* JADX INFO: loaded from: classes.dex */
public final class monoploid {

    /* JADX INFO: renamed from: attabal, reason: collision with root package name */
    public static final kowloon<?> f9794attabal = new arytenoidectomy();

    /* JADX INFO: renamed from: saneness, reason: collision with root package name */
    public static final kowloon<?> f9795saneness = dern();

    public static kowloon<?> attabal() {
        kowloon<?> kowloonVar = f9795saneness;
        if (kowloonVar != null) {
            return kowloonVar;
        }
        throw new IllegalStateException("Protobuf runtime is not correctly loaded.");
    }

    public static kowloon<?> dern() {
        if (clubfoot.f9694wireman) {
            return null;
        }
        try {
            return (kowloon) Class.forName("androidx.datastore.preferences.protobuf.ExtensionSchemaFull").getDeclaredConstructor(null).newInstance(null);
        } catch (Exception unused) {
            return null;
        }
    }

    public static kowloon<?> saneness() {
        return f9794attabal;
    }
}
