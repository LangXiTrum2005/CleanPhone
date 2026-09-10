package zk;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
public final class a0 extends kotlin.jvm.internal.o implements jk.b {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f54960e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ zc.u f54961f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ a0(zc.u uVar, int i10) {
        super(1);
        this.f54960e = i10;
        this.f54961f = uVar;
    }

    @Override // jk.b
    public final Object invoke(Object obj) {
        f fVarR;
        switch (this.f54960e) {
            case 0:
                y yVar = (y) obj;
                kotlin.jvm.internal.n.f(yVar, "<name for destructuring parameter 0>");
                yl.b bVar = yVar.f55007a;
                List list = yVar.f55008b;
                if (bVar.f54503c) {
                    throw new UnsupportedOperationException("Unresolved local class: " + bVar);
                }
                yl.b bVarF = bVar.f();
                zc.u uVar = this.f54961f;
                if (bVarF != null) {
                    fVarR = uVar.r(bVarF, xj.n.k0(list, 1));
                } else {
                    om.e eVar = (om.e) uVar.f54881d;
                    yl.c cVarG = bVar.g();
                    kotlin.jvm.internal.n.e(cVarG, "classId.packageFqName");
                    fVarR = (f) eVar.invoke(cVarG);
                }
                f fVar = fVarR;
                boolean z10 = !bVar.f54502b.e().d();
                om.l lVar = (om.l) uVar.f54879b;
                yl.f fVarI = bVar.i();
                kotlin.jvm.internal.n.e(fVarI, "classId.shortClassName");
                Integer num = (Integer) xj.n.q0(list);
                return new z(lVar, fVar, fVarI, z10, num != null ? num.intValue() : 0);
            default:
                yl.c fqName = (yl.c) obj;
                kotlin.jvm.internal.n.f(fqName, "fqName");
                return new cl.r((w) this.f54961f.f54880c, fqName, 0);
        }
    }
}
