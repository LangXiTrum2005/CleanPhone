package cn;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
public final class l1 extends j1 {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final q1 f6736e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final m1 f6737f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final p f6738g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Object f6739h;

    public l1(q1 q1Var, m1 m1Var, p pVar, Object obj) {
        this.f6736e = q1Var;
        this.f6737f = m1Var;
        this.f6738g = pVar;
        this.f6739h = obj;
    }

    @Override // cn.j1
    public final boolean i() {
        return false;
    }

    @Override // cn.j1
    public final void j(Throwable th2) {
        p pVar = this.f6738g;
        p pVarR = q1.R(pVar);
        q1 q1Var = this.f6736e;
        m1 m1Var = this.f6737f;
        Object obj = this.f6739h;
        if (pVarR == null || !q1Var.a0(m1Var, pVarR, obj)) {
            m1Var.f6745a.c(new hn.i(2), 2);
            p pVarR2 = q1.R(pVar);
            if (pVarR2 == null || !q1Var.a0(m1Var, pVarR2, obj)) {
                q1Var.q(q1Var.A(m1Var, obj));
            }
        }
    }
}
