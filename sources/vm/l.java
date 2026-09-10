package vm;

import cl.x0;
import java.util.Collection;
import java.util.List;
import pm.c0;
import pm.h0;
import pm.j0;
import pm.y;
import pm.y0;
import zk.m0;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
public final class l implements e {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final l f52680b = new l(0);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final l f52681c = new l(1);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f52682a;

    public /* synthetic */ l(int i10) {
        this.f52682a = i10;
    }

    @Override // vm.e
    public final String a(kl.e eVar) {
        switch (this.f52682a) {
            case 0:
                break;
        }
        return go.c.w(this, eVar);
    }

    @Override // vm.e
    public final boolean b(kl.e eVar) {
        c0 c0VarQ;
        switch (this.f52682a) {
            case 0:
                x0 secondParameter = (x0) eVar.B().get(1);
                un.a aVar = wk.k.f53330d;
                kotlin.jvm.internal.n.e(secondParameter, "secondParameter");
                zk.w wVarJ = fm.e.j(secondParameter);
                aVar.getClass();
                zk.e eVarD = zk.u.d(wVarJ, wk.l.Q);
                if (eVarD == null) {
                    c0VarQ = null;
                } else {
                    j0.f48443b.getClass();
                    j0 j0Var = j0.f48444c;
                    List parameters = eVarD.n().getParameters();
                    kotlin.jvm.internal.n.e(parameters, "kPropertyClass.typeConstructor.parameters");
                    Object objF0 = xj.n.F0(parameters);
                    kotlin.jvm.internal.n.e(objF0, "kPropertyClass.typeConstructor.parameters.single()");
                    c0VarQ = pm.f.q(j0Var, eVarD, j1.f.C(new h0((m0) objF0)));
                }
                if (c0VarQ == null) {
                    return false;
                }
                y type = secondParameter.getType();
                kotlin.jvm.internal.n.e(type, "secondParameter.type");
                return qm.d.f49173a.b(c0VarQ, y0.g(type, false));
            default:
                List listB = eVar.B();
                kotlin.jvm.internal.n.e(listB, "functionDescriptor.valueParameters");
                List<x0> list = listB;
                if (!(list instanceof Collection) || !list.isEmpty()) {
                    for (x0 it : list) {
                        kotlin.jvm.internal.n.e(it, "it");
                        if (fm.e.a(it) || it.f6635j != null) {
                            return false;
                        }
                    }
                }
                return true;
        }
    }

    @Override // vm.e
    public final String getDescription() {
        switch (this.f52682a) {
            case 0:
                return "second parameter must be of type KProperty<*> or its supertype";
            default:
                return "should not have varargs or parameters with default values";
        }
    }
}
