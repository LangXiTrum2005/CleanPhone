package il;

import cl.q0;
import java.util.List;
import pm.w0;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
public final class j implements bm.f {
    @Override // bm.f
    public final int a(zk.b superDescriptor, zk.b subDescriptor, zk.e eVar) {
        kotlin.jvm.internal.n.f(superDescriptor, "superDescriptor");
        kotlin.jvm.internal.n.f(subDescriptor, "subDescriptor");
        if (!(subDescriptor instanceof kl.e)) {
            return 4;
        }
        kl.e eVar2 = (kl.e) subDescriptor;
        if (!eVar2.getTypeParameters().isEmpty()) {
            return 4;
        }
        bm.k kVarI = bm.l.i(superDescriptor, subDescriptor);
        if ((kVarI != null ? kVarI.c() : 0) != 0) {
            return 4;
        }
        List listB = eVar2.B();
        kotlin.jvm.internal.n.e(listB, "subDescriptor.valueParameters");
        zm.s sVarU = zm.l.U(xj.n.g0(listB), e.f43063i);
        pm.y yVar = eVar2.f6639g;
        kotlin.jvm.internal.n.c(yVar);
        zm.g gVarQ = zm.l.Q(xj.k.b0(new zm.i[]{sVarU, new an.r(yVar, 6)}));
        cl.z zVar = eVar2.f6641i;
        zm.e eVar3 = new zm.e(zm.l.Q(xj.k.b0(new zm.i[]{gVarQ, xj.n.g0(xj.o.R(zVar != null ? zVar.getType() : null))})));
        while (eVar3.hasNext()) {
            pm.y yVar2 = (pm.y) eVar3.next();
            if (!yVar2.t().isEmpty() && !(yVar2.b0() instanceof nl.f)) {
                return 4;
            }
        }
        zk.b bVarBuild = (zk.b) superDescriptor.b(new w0(new nl.d()));
        if (bVarBuild == null) {
            return 4;
        }
        if (bVarBuild instanceof q0) {
            q0 q0Var = (q0) bVarBuild;
            if (!q0Var.getTypeParameters().isEmpty()) {
                bVarBuild = q0Var.v0().m().build();
                kotlin.jvm.internal.n.c(bVarBuild);
            }
        }
        int iC = bm.l.f5737c.n(bVarBuild, subDescriptor, false).c();
        d5.u.u(iC, "DEFAULT.isOverridableByW…Descriptor, false).result");
        return i.f43088a[v0.i.c(iC)] == 1 ? 1 : 4;
    }

    @Override // bm.f
    public final int b() {
        return 2;
    }
}
