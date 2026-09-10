package nl;

import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.n;
import m5.k;
import pm.c0;
import pm.j0;
import pm.n0;
import pm.q0;
import pm.r0;
import pm.t0;
import pm.y;
import rm.i;
import wk.h;
import xj.p;
import zk.g;
import zk.m0;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
public final class d extends t0 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final a f46799c = android.support.v4.media.session.a.I(2, false, null, 5).b(3);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final a f46800d = android.support.v4.media.session.a.I(2, false, null, 5).b(2);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final k f46801b = new k(new ne.a(2));

    @Override // pm.t0
    public final q0 d(y yVar) {
        return new r0(h(yVar, new a(2, false, false, null, 62)));
    }

    public final wj.f g(c0 c0Var, zk.e eVar, a aVar) {
        if (c0Var.P().getParameters().isEmpty()) {
            return new wj.f(c0Var, Boolean.FALSE);
        }
        if (h.y(c0Var)) {
            q0 q0Var = (q0) c0Var.t().get(0);
            int iA = q0Var.a();
            y yVarB = q0Var.b();
            n.e(yVarB, "componentTypeProjection.type");
            return new wj.f(pm.f.r(j1.f.C(new r0(iA, h(yVarB, aVar))), c0Var.M(), c0Var.P(), c0Var.Q()), Boolean.FALSE);
        }
        if (pm.c.j(c0Var)) {
            return new wj.f(i.c(rm.h.ERROR_RAW_TYPE, c0Var.P().toString()), Boolean.FALSE);
        }
        im.n nVarE = eVar.E(this);
        n.e(nVarE, "declaration.getMemberScope(this)");
        j0 j0VarM = c0Var.M();
        n0 n0VarN = eVar.n();
        n.e(n0VarN, "declaration.typeConstructor");
        List parameters = eVar.n().getParameters();
        n.e(parameters, "declaration.typeConstructor.parameters");
        List<m0> list = parameters;
        ArrayList arrayList = new ArrayList(p.W(list, 10));
        for (m0 parameter : list) {
            n.e(parameter, "parameter");
            k kVar = this.f46801b;
            arrayList.add(ne.a.f(parameter, aVar, kVar, kVar.t(parameter, aVar)));
        }
        return new wj.f(pm.f.t(j0VarM, n0VarN, arrayList, c0Var.Q(), nVarE, new al.f(eVar, this, c0Var, aVar)), Boolean.TRUE);
    }

    public final y h(y yVar, a aVar) {
        g gVarE = yVar.P().e();
        if (gVarE instanceof m0) {
            aVar.getClass();
            return h(this.f46801b.t((m0) gVarE, a.a(aVar, 0, true, null, null, 59)), aVar);
        }
        if (!(gVarE instanceof zk.e)) {
            throw new IllegalStateException(("Unexpected declaration kind: " + gVarE).toString());
        }
        g gVarE2 = pm.c.z(yVar).P().e();
        if (gVarE2 instanceof zk.e) {
            wj.f fVarG = g(pm.c.l(yVar), (zk.e) gVarE, f46799c);
            c0 c0Var = (c0) fVarG.f53283a;
            boolean zBooleanValue = ((Boolean) fVarG.f53284b).booleanValue();
            wj.f fVarG2 = g(pm.c.z(yVar), (zk.e) gVarE2, f46800d);
            c0 c0Var2 = (c0) fVarG2.f53283a;
            return (zBooleanValue || ((Boolean) fVarG2.f53284b).booleanValue()) ? new f(c0Var, c0Var2) : pm.f.j(c0Var, c0Var2);
        }
        throw new IllegalStateException(("For some reason declaration for upper bound is not a class but \"" + gVarE2 + "\" while for lower it's \"" + gVarE + '\"').toString());
    }
}
