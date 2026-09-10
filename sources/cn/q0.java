package cn;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
public final class q0 extends j1 {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f6755e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Object f6756f;

    public /* synthetic */ q0(Object obj, int i10) {
        this.f6755e = i10;
        this.f6756f = obj;
    }

    @Override // cn.j1
    public final boolean i() {
        switch (this.f6755e) {
        }
        return false;
    }

    @Override // cn.j1
    public final void j(Throwable th2) {
        switch (this.f6755e) {
            case 0:
                ((p0) this.f6756f).dispose();
                break;
            case 1:
                ((jk.b) this.f6756f).invoke(th2);
                break;
            default:
                k1 k1Var = (k1) this.f6756f;
                Object obj = q1.f6757a.get(h());
                if (!(obj instanceof u)) {
                    k1Var.resumeWith(d0.H(obj));
                } else {
                    k1Var.resumeWith(t9.e.c(((u) obj).f6771a));
                }
                break;
        }
    }
}
