package dm;

import pm.c0;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
public final class i extends g {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final yl.b f38954b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final yl.f f38955c;

    public i(yl.b bVar, yl.f fVar) {
        super(new wj.f(bVar, fVar));
        this.f38954b = bVar;
        this.f38955c = fVar;
    }

    @Override // dm.g
    public final pm.y a(zk.w module) {
        kotlin.jvm.internal.n.f(module, "module");
        yl.b bVar = this.f38954b;
        zk.e eVarD = zk.u.d(module, bVar);
        c0 c0VarG = null;
        if (eVarD != null) {
            if (!bm.e.n(eVarD, 3)) {
                eVarD = null;
            }
            if (eVarD != null) {
                c0VarG = eVarD.g();
            }
        }
        if (c0VarG != null) {
            return c0VarG;
        }
        String string = bVar.toString();
        kotlin.jvm.internal.n.e(string, "enumClassId.toString()");
        String str = this.f38955c.f54514a;
        kotlin.jvm.internal.n.e(str, "enumEntryName.toString()");
        return rm.i.c(rm.h.ERROR_ENUM_TYPE, string, str);
    }

    @Override // dm.g
    public final String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(this.f38954b.i());
        sb2.append('.');
        sb2.append(this.f38955c);
        return sb2.toString();
    }
}
