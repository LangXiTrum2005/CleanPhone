package dm;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
public final class j extends g {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f38956b;

    public j(String str) {
        super(wj.r.f53297a);
        this.f38956b = str;
    }

    @Override // dm.g
    public final pm.y a(zk.w module) {
        kotlin.jvm.internal.n.f(module, "module");
        return rm.i.c(rm.h.ERROR_CONSTANT_VALUE, this.f38956b);
    }

    @Override // dm.g
    public final Object b() {
        throw new UnsupportedOperationException();
    }

    @Override // dm.g
    public final String toString() {
        return this.f38956b;
    }
}
