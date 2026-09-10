package androidx.datastore.preferences.protobuf;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public abstract class y0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final x0 f4199a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final x0 f4200b;

    static {
        a1 a1Var = a1.f4050c;
        x0 x0Var = null;
        try {
            x0Var = (x0) Class.forName("androidx.datastore.preferences.protobuf.NewInstanceSchemaFull").getDeclaredConstructor(null).newInstance(null);
        } catch (Exception unused) {
        }
        f4199a = x0Var;
        f4200b = new x0();
    }
}
