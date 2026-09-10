package androidx.datastore.preferences.protobuf;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public abstract class u {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final t f4169a = new t();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final t f4170b;

    static {
        a1 a1Var = a1.f4050c;
        t tVar = null;
        try {
            tVar = (t) Class.forName("androidx.datastore.preferences.protobuf.ExtensionSchemaFull").getDeclaredConstructor(null).newInstance(null);
        } catch (Exception unused) {
        }
        f4170b = tVar;
    }
}
