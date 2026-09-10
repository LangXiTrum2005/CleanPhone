package fn;

import cc.a2;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
public final class k0 implements e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f41106a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ e f41107b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f41108c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f41109d;

    /* JADX WARN: Multi-variable type inference failed */
    public k0(e eVar, a1 a1Var, jk.d dVar) {
        this.f41107b = eVar;
        this.f41108c = a1Var;
        this.f41109d = (ck.i) dVar;
    }

    /* JADX WARN: Type inference failed for: r3v1, types: [ck.i, jk.d] */
    @Override // fn.e
    public final Object collect(f fVar, ak.f fVar2) throws Throwable {
        int i10 = this.f41106a;
        wj.r rVar = wj.r.f53297a;
        bk.a aVar = bk.a.f5708a;
        Object obj = this.f41109d;
        Object obj2 = this.f41108c;
        e eVar = this.f41107b;
        switch (i10) {
            case 0:
                gn.i iVar = new gn.i(new e[]{eVar, (a1) obj2}, new l0((ck.i) obj, null), fVar, null);
                gn.k kVar = new gn.k(fVar2, fVar2.getContext());
                Object objN = a2.N(kVar, true, kVar, iVar);
                if (objN != aVar) {
                    objN = rVar;
                }
                return objN == aVar ? objN : rVar;
            default:
                Object objCollect = eVar.collect(new u(fVar, (w0.d) obj2, (oj.z) obj), fVar2);
                return objCollect == aVar ? objCollect : rVar;
        }
    }

    public k0(e eVar, w0.d dVar, oj.z zVar) {
        this.f41107b = eVar;
        this.f41108c = dVar;
        this.f41109d = zVar;
    }
}
