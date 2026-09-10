package cn;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
public final class k1 extends l {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final q1 f6727i;

    public k1(ak.f fVar, q1 q1Var) {
        super(1, fVar);
        this.f6727i = q1Var;
    }

    @Override // cn.l
    public final Throwable r(q1 q1Var) {
        Throwable thC;
        q1 q1Var2 = this.f6727i;
        q1Var2.getClass();
        Object obj = q1.f6757a.get(q1Var2);
        if (!(obj instanceof m1) || (thC = ((m1) obj).c()) == null) {
            return obj instanceof u ? ((u) obj).f6771a : q1Var.h();
        }
        return thC;
    }

    @Override // cn.l
    public final String z() {
        return "AwaitContinuation";
    }
}
