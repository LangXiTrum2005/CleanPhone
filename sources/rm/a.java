package rm;

import cl.n;
import java.util.List;
import om.l;
import pm.t0;
import pm.w0;
import qk.i0;
import xj.v;
import zk.j0;
import zk.k;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
public final class a extends n {
    /* JADX WARN: Illegal instructions before constructor call */
    public a(yl.f fVar) {
        i iVar = i.f49698a;
        c cVar = i.f49699b;
        om.b bVar = l.f47582e;
        List list = v.f53866a;
        super(cVar, fVar, 3, 1, list, bVar);
        cl.l lVar = new cl.l(this, null, al.i.f3645a, true, 1, j0.C9);
        lVar.X0(list, zk.n.f54977d);
        String str = lVar.getName().f54514a;
        kotlin.jvm.internal.n.e(str, "errorConstructor.name.toString()");
        e eVarB = i.b(9, str, "");
        h hVar = h.ERROR_CLASS;
        lVar.f6639g = new f(i.d(hVar, new String[0]), eVarB, hVar, list, false, new String[0]);
        M(eVarB, i0.k0(lVar), lVar);
    }

    @Override // cl.c, zk.l0
    public final k b(w0 substitutor) {
        kotlin.jvm.internal.n.f(substitutor, "substitutor");
        return this;
    }

    @Override // cl.c, cl.d0
    public final im.n k(t0 t0Var, qm.f fVar) {
        String str = getName().f54514a;
        kotlin.jvm.internal.n.e(str, "name.toString()");
        return i.b(9, str, t0Var.toString());
    }

    @Override // cl.c
    /* JADX INFO: renamed from: t */
    public final zk.e b(w0 substitutor) {
        kotlin.jvm.internal.n.f(substitutor, "substitutor");
        return this;
    }

    @Override // cl.n
    public final String toString() {
        String strB = getName().b();
        kotlin.jvm.internal.n.e(strB, "name.asString()");
        return strB;
    }
}
