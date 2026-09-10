package cn;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
public final class n1 extends j1 {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final kn.e f6749e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ q1 f6750f;

    public n1(q1 q1Var, kn.e eVar) {
        this.f6750f = q1Var;
        this.f6749e = eVar;
    }

    @Override // cn.j1
    public final boolean i() {
        return false;
    }

    @Override // cn.j1
    public final void j(Throwable th2) {
        q1 q1Var = this.f6750f;
        q1Var.getClass();
        Object objH = q1.f6757a.get(q1Var);
        if (!(objH instanceof u)) {
            objH = d0.H(objH);
        }
        ((kn.d) this.f6749e).g(q1Var, objH);
    }
}
