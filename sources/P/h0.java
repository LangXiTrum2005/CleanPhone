package p;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class h0 extends q1 {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final /* synthetic */ n0 f47656j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final /* synthetic */ q0 f47657k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h0(q0 q0Var, q0 q0Var2, n0 n0Var) {
        super(q0Var2);
        this.f47657k = q0Var;
        this.f47656j = n0Var;
    }

    @Override // p.q1
    public final o.c0 b() {
        return this.f47656j;
    }

    @Override // p.q1
    public final boolean c() {
        q0 q0Var = this.f47657k;
        if (q0Var.getInternalPopup().a()) {
            return true;
        }
        q0Var.f47770f.i(q0Var.getTextDirection(), q0Var.getTextAlignment());
        return true;
    }
}
