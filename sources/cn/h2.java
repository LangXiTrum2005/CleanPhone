package cn;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
public final class h2 extends hn.r {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final ThreadLocal f6719e;
    private volatile boolean threadLocalIsSet;

    /* JADX WARN: Illegal instructions before constructor call */
    public h2(ak.f fVar, ak.k kVar) {
        i2 i2Var = i2.f6721a;
        super(fVar, kVar.get(i2Var) == null ? kVar.plus(i2Var) : kVar);
        this.f6719e = new ThreadLocal();
        if (fVar.getContext().get(ak.g.f3619a) instanceof w) {
            return;
        }
        Object objN = hn.b.n(kVar, null);
        hn.b.g(kVar, objN);
        h0(kVar, objN);
    }

    @Override // hn.r
    public final void e0() {
        g0();
    }

    public final boolean f0() {
        boolean z10 = this.threadLocalIsSet && this.f6719e.get() == null;
        this.f6719e.remove();
        return !z10;
    }

    public final void g0() {
        if (this.threadLocalIsSet) {
            wj.f fVar = (wj.f) this.f6719e.get();
            if (fVar != null) {
                hn.b.g((ak.k) fVar.f53283a, fVar.f53284b);
            }
            this.f6719e.remove();
        }
    }

    public final void h0(ak.k kVar, Object obj) {
        this.threadLocalIsSet = true;
        this.f6719e.set(new wj.f(kVar, obj));
    }

    @Override // hn.r, cn.q1
    public final void r(Object obj) {
        g0();
        Object objZ = d0.z(obj);
        ak.f fVar = this.f42453d;
        ak.k context = fVar.getContext();
        Object objN = hn.b.n(context, null);
        h2 h2VarI = objN != hn.b.f42418d ? d0.I(fVar, context, objN) : null;
        try {
            fVar.resumeWith(objZ);
        } finally {
            if (h2VarI == null || h2VarI.f0()) {
                hn.b.g(context, objN);
            }
        }
    }
}
