package dm;

import pm.a1;
import pm.c0;
import pm.j0;
import pm.r0;
import qk.i0;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
public final class s extends g {
    public s(yl.b bVar, int i10) {
        super(new q(new f(bVar, i10)));
    }

    @Override // dm.g
    public final pm.y a(zk.w module) {
        pm.y yVarC;
        kotlin.jvm.internal.n.f(module, "module");
        j0.f48443b.getClass();
        j0 j0Var = j0.f48444c;
        wk.h hVarD = module.d();
        hVarD.getClass();
        zk.e eVarI = hVarD.i(wk.l.P.g());
        Object obj = this.f38953a;
        r rVar = (r) obj;
        if (rVar instanceof p) {
            yVarC = ((p) obj).f38960a;
        } else {
            if (!(rVar instanceof q)) {
                throw new aa.b((byte) 0, 20);
            }
            f fVar = ((q) obj).f38961a;
            yl.b bVar = fVar.f38951a;
            int i10 = fVar.f38952b;
            zk.e eVarD = zk.u.d(module, bVar);
            if (eVarD == null) {
                String string = bVar.toString();
                kotlin.jvm.internal.n.e(string, "classId.toString()");
                yVarC = rm.i.c(rm.h.UNRESOLVED_KCLASS_CONSTANT_VALUE, string, String.valueOf(i10));
            } else {
                c0 c0VarG = eVarD.g();
                kotlin.jvm.internal.n.e(c0VarG, "descriptor.defaultType");
                a1 a1VarH0 = i0.h0(c0VarG);
                for (int i11 = 0; i11 < i10; i11++) {
                    a1VarH0 = module.d().h(a1VarH0);
                }
                yVarC = a1VarH0;
            }
        }
        return pm.f.q(j0Var, eVarI, j1.f.C(new r0(yVarC)));
    }
}
