package s0;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class v implements fn.f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f49921a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f49922b;

    public /* synthetic */ v(Object obj, int i10) {
        this.f49921a = i10;
        this.f49922b = obj;
    }

    @Override // fn.f
    public final Object emit(Object obj, ak.f fVar) {
        Object objE;
        switch (this.f49921a) {
            case 0:
                e0 e0Var = (e0) this.f49922b;
                return ((e0Var.f49789h.u() instanceof o0) || (objE = e0.e(e0Var, true, fVar)) != bk.a.f5708a) ? wj.r.f53297a : objE;
            case 1:
                ud.i0 i0Var = (ud.i0) obj;
                ud.c1 c1Var = (ud.c1) this.f49922b;
                kotlin.jvm.internal.n.f(i0Var, "<set-?>");
                c1Var.f52044h = i0Var;
                if (c1Var.f52046j) {
                    c1Var.f52046j = false;
                    c1Var.c();
                }
                Object objA = ud.c1.a(c1Var, i0Var.f52106a.f52123a, ud.z0.f52190a, fVar);
                return objA == bk.a.f5708a ? objA : wj.r.f53297a;
            default:
                ((l0.a) this.f49922b).accept(obj);
                return wj.r.f53297a;
        }
    }
}
