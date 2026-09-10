package fn;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
public final class p0 implements y0, e, gn.l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ a1 f41136a;
    private final cn.f1 job = null;

    public p0(a1 a1Var) {
        this.f41136a = a1Var;
    }

    @Override // gn.l
    public final e b(ak.k kVar, int i10, en.a aVar) {
        return (((i10 < 0 || i10 >= 2) && i10 != -2) || aVar != en.a.f40123b) ? g.n(this, kVar, i10, aVar) : this;
    }

    @Override // fn.e
    public final Object collect(f fVar, ak.f fVar2) {
        this.f41136a.collect(fVar, fVar2);
        return bk.a.f5708a;
    }

    @Override // fn.y0
    public final Object getValue() {
        return this.f41136a.getValue();
    }
}
