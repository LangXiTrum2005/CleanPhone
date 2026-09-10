package androidx.datastore.preferences.protobuf;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class y implements t0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final y f4197b = new y(0);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f4198a;

    public /* synthetic */ y(int i10) {
        this.f4198a = i10;
    }

    @Override // androidx.datastore.preferences.protobuf.t0
    public final c1 a(Class cls) {
        switch (this.f4198a) {
            case 0:
                if (!b0.class.isAssignableFrom(cls)) {
                    throw new IllegalArgumentException("Unsupported message type: ".concat(cls.getName()));
                }
                try {
                    return (c1) b0.d(cls.asSubclass(b0.class)).c(3);
                } catch (Exception e10) {
                    throw new RuntimeException("Unable to get message info for ".concat(cls.getName()), e10);
                }
            default:
                throw new IllegalStateException("This should never be called.");
        }
    }

    @Override // androidx.datastore.preferences.protobuf.t0
    public final boolean b(Class cls) {
        switch (this.f4198a) {
            case 0:
                return b0.class.isAssignableFrom(cls);
            default:
                return false;
        }
    }
}
