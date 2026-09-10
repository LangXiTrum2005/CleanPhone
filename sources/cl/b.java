package cl;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
public final class b implements jk.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f6476a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ c f6477b;

    public /* synthetic */ b(c cVar, int i10) {
        this.f6476a = i10;
        this.f6477b = cVar;
    }

    @Override // jk.a
    public final Object invoke() {
        int i10 = this.f6476a;
        c cVar = this.f6477b;
        switch (i10) {
            case 0:
                im.n nVarR = cVar.R();
                a aVar = new a(this, 0);
                rm.f fVar = pm.y0.f48489a;
                if (rm.i.f(cVar)) {
                    return rm.i.c(rm.h.UNABLE_TO_SUBSTITUTE_TYPE, cVar.toString());
                }
                pm.n0 n0VarN = cVar.n();
                if (n0VarN == null) {
                    pm.y0.a(12);
                    throw null;
                }
                if (nVarR == null) {
                    pm.y0.a(13);
                    throw null;
                }
                List listD = pm.y0.d(n0VarN.getParameters());
                pm.j0.f48443b.getClass();
                return pm.f.t(pm.j0.f48444c, n0VarN, listD, false, nVarR, aVar);
            case 1:
                return new im.i(cVar.R());
            default:
                return new z(cVar);
        }
    }
}
