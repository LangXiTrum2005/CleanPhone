package dm;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
public class b extends g {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final kotlin.jvm.internal.o f38949b;

    /* JADX WARN: Multi-variable type inference failed */
    public b(List list, jk.b bVar) {
        super(list);
        this.f38949b = (kotlin.jvm.internal.o) bVar;
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [jk.b, kotlin.jvm.internal.o] */
    @Override // dm.g
    public final pm.y a(zk.w module) {
        zk.g gVarE;
        kotlin.jvm.internal.n.f(module, "module");
        pm.y yVar = (pm.y) this.f38949b.invoke(module);
        if (!wk.h.y(yVar) && (((gVarE = yVar.P().e()) == null || wk.h.r(gVarE) == null) && !wk.h.B(yVar, wk.l.V.i()) && !wk.h.B(yVar, wk.l.W.i()) && !wk.h.B(yVar, wk.l.X.i()))) {
            wk.h.B(yVar, wk.l.Y.i());
        }
        return yVar;
    }
}
