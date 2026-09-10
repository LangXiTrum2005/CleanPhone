package il;

import java.util.ArrayList;
import qk.i0;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
public final class q implements bm.f {
    /* JADX WARN: Code duplicated, block: B:14:0x0043  */
    /* JADX WARN: Code duplicated, block: B:16:0x004e  */
    /* JADX WARN: Code duplicated, block: B:17:0x0052  */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // bm.f
    public final int a(zk.b superDescriptor, zk.b subDescriptor, zk.e eVar) {
        zk.c cVarM;
        boolean z10;
        zk.s sVar;
        kotlin.jvm.internal.n.f(superDescriptor, "superDescriptor");
        kotlin.jvm.internal.n.f(subDescriptor, "subDescriptor");
        if ((superDescriptor instanceof zk.c) && (subDescriptor instanceof zk.s) && !wk.h.z(subDescriptor)) {
            int i10 = f.l;
            zk.s sVar2 = (zk.s) subDescriptor;
            cl.p pVar = (cl.p) sVar2;
            yl.f name = pVar.getName();
            kotlin.jvm.internal.n.e(name, "subDescriptor.name");
            if (f.b(name)) {
                cVarM = i0.M((zk.c) superDescriptor);
                z10 = superDescriptor instanceof zk.s;
                if (z10) {
                    sVar = (zk.s) superDescriptor;
                } else {
                    sVar = null;
                }
                return sVar == null ? 3 : 3;
                if (eVar instanceof kl.c) {
                    return cVarM instanceof zk.s ? 3 : 3;
                }
            } else {
                ArrayList arrayList = g0.f43077a;
                yl.f name2 = pVar.getName();
                kotlin.jvm.internal.n.e(name2, "subDescriptor.name");
                if (g0.f43086j.contains(name2)) {
                    cVarM = i0.M((zk.c) superDescriptor);
                    z10 = superDescriptor instanceof zk.s;
                    if (z10) {
                        sVar = (zk.s) superDescriptor;
                    } else {
                        sVar = null;
                    }
                    if (!(sVar == null && sVar2.s0() == sVar.s0()) && (cVarM == null || !sVar2.s0())) {
                        return 3;
                    }
                    if ((eVar instanceof kl.c) && sVar2.k0() == null && cVarM != null && !i0.P(eVar, cVarM)) {
                        if ((cVarM instanceof zk.s) || !z10 || f.a((zk.s) cVarM) == null) {
                            return 3;
                        }
                        String strU = go.k.u(sVar2, 2);
                        zk.s sVarA = ((zk.s) superDescriptor).a();
                        kotlin.jvm.internal.n.e(sVarA, "superDescriptor.original");
                        if (!strU.equals(go.k.u(sVarA, 2))) {
                            return 3;
                        }
                    }
                }
            }
        }
        return j1.f.p(superDescriptor, subDescriptor) ? 3 : 4;
    }

    @Override // bm.f
    public final int b() {
        return 1;
    }
}
