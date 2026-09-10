package androidx.datastore.preferences.protobuf;

/* JADX INFO: compiled from: MapFieldSchemas.java */
/* JADX INFO: loaded from: classes.dex */
public final class polder {

    /* JADX INFO: renamed from: attabal, reason: collision with root package name */
    public static final restrictive f9806attabal = dern();

    /* JADX INFO: renamed from: saneness, reason: collision with root package name */
    public static final restrictive f9807saneness = new merc();

    public static restrictive attabal() {
        return f9806attabal;
    }

    public static restrictive dern() {
        if (clubfoot.f9694wireman) {
            return null;
        }
        try {
            return (restrictive) Class.forName("androidx.datastore.preferences.protobuf.MapFieldSchemaFull").getDeclaredConstructor(null).newInstance(null);
        } catch (Exception unused) {
            return null;
        }
    }

    public static restrictive saneness() {
        return f9807saneness;
    }
}
