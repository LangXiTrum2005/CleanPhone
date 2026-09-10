package yk;

import qk.w;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
public final class e implements ym.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final e f54460a = new e();

    public static zk.e a(zk.e eVar) {
        yl.e eVarG = bm.e.g(eVar);
        String str = d.f54447a;
        yl.c cVar = (yl.c) d.f54457k.get(eVarG);
        if (cVar != null) {
            return fm.e.e(eVar).i(cVar);
        }
        throw new IllegalArgumentException("Given class " + eVar + " is not a read-only collection");
    }

    public static zk.e b(yl.c cVar, wk.h builtIns) {
        kotlin.jvm.internal.n.f(builtIns, "builtIns");
        String str = d.f54447a;
        yl.b bVar = (yl.b) d.f54454h.get(cVar.i());
        if (bVar != null) {
            return builtIns.i(bVar.b());
        }
        return null;
    }

    @Override // ym.a
    public Iterable r(Object obj) {
        w[] wVarArr = l.f54482g;
        return ((zk.c) obj).a().f();
    }
}
