package androidx.datastore.preferences.protobuf;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class m0 implements t0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public t0[] f4132a;

    @Override // androidx.datastore.preferences.protobuf.t0
    public final c1 a(Class cls) {
        for (t0 t0Var : this.f4132a) {
            if (t0Var.b(cls)) {
                return t0Var.a(cls);
            }
        }
        throw new UnsupportedOperationException("No factory is available for message type: ".concat(cls.getName()));
    }

    @Override // androidx.datastore.preferences.protobuf.t0
    public final boolean b(Class cls) {
        for (t0 t0Var : this.f4132a) {
            if (t0Var.b(cls)) {
                return true;
            }
        }
        return false;
    }
}
