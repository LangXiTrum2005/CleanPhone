package qm;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.Set;
import kotlin.jvm.internal.d0;
import pm.a1;
import pm.c0;
import pm.n0;
import pm.q0;
import pm.r0;
import zk.m0;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
public final class m implements b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final m f49193a = new m();

    @Override // qm.b
    public final a1 A(ArrayList arrayList) {
        c0 c0Var;
        int size = arrayList.size();
        if (size == 0) {
            throw new IllegalStateException("Expected some types");
        }
        if (size == 1) {
            return (a1) xj.n.F0(arrayList);
        }
        ArrayList arrayList2 = new ArrayList(xj.p.W(arrayList, 10));
        Iterator it = arrayList.iterator();
        boolean z10 = false;
        boolean z11 = false;
        while (it.hasNext()) {
            a1 a1Var = (a1) it.next();
            z10 = z10 || pm.c.j(a1Var);
            if (a1Var instanceof c0) {
                c0Var = (c0) a1Var;
            } else {
                if (!(a1Var instanceof pm.r)) {
                    throw new aa.b((byte) 0, 20);
                }
                c0Var = ((pm.r) a1Var).f48470b;
                z11 = true;
            }
            arrayList2.add(c0Var);
        }
        if (z10) {
            return rm.i.c(rm.h.INTERSECTION_OF_ERROR_TYPES, arrayList.toString());
        }
        u uVar = u.f49202a;
        if (!z11) {
            return uVar.b(arrayList2);
        }
        ArrayList arrayList3 = new ArrayList(xj.p.W(arrayList, 10));
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            arrayList3.add(pm.c.z((a1) it2.next()));
        }
        return pm.f.j(uVar.b(arrayList2), uVar.b(arrayList3));
    }

    @Override // qm.b
    public final boolean A0(sm.f fVar, sm.f fVar2) {
        return g.b(fVar, fVar2);
    }

    @Override // qm.b
    public final c0 C(pm.r rVar) {
        return g.Y(rVar);
    }

    @Override // qm.b
    public final n0 C0(sm.d dVar) {
        return g.W(dVar);
    }

    @Override // qm.b
    public final boolean D(sm.f fVar) {
        return g.D(fVar);
    }

    @Override // qm.b
    public final boolean D0(sm.f fVar) {
        return g.z(fVar);
    }

    @Override // qm.b
    public final sm.c E(sm.c cVar) {
        return g.a0(this, cVar);
    }

    @Override // qm.b
    public final boolean F(sm.f fVar) {
        return g.x(fVar);
    }

    @Override // qm.b
    public final void G(sm.c cVar) {
        kotlin.jvm.internal.n.f(cVar, "<this>");
        g.g(cVar);
    }

    @Override // qm.b
    public final int G0(sm.b bVar) {
        return g.k(bVar);
    }

    @Override // qm.b
    public final q0 H(cm.b bVar) {
        return g.T(bVar);
    }

    @Override // qm.b
    public final boolean H0(sm.d dVar) {
        kotlin.jvm.internal.n.f(dVar, "<this>");
        c0 c0VarH = g.h(dVar);
        return (c0VarH != null ? g.e(this, c0VarH) : null) != null;
    }

    @Override // qm.b
    public final c0 I(sm.c cVar) {
        c0 c0VarY;
        kotlin.jvm.internal.n.f(cVar, "<this>");
        pm.r rVarG = g.g(cVar);
        if (rVarG != null && (c0VarY = g.Y(rVarG)) != null) {
            return c0VarY;
        }
        c0 c0VarH = g.h(cVar);
        kotlin.jvm.internal.n.c(c0VarH);
        return c0VarH;
    }

    @Override // qm.b
    public final Collection I0(sm.f fVar) {
        return g.V(fVar);
    }

    @Override // qm.b
    public final r0 J(sm.c cVar) {
        return g.i(cVar);
    }

    @Override // qm.b
    public final boolean J0(sm.f fVar) {
        return g.G(fVar);
    }

    @Override // qm.b
    public final int K0(sm.f fVar) {
        return g.R(fVar);
    }

    @Override // qm.b
    public final int L(m0 receiver) {
        kotlin.jvm.internal.n.f(receiver, "$receiver");
        int iV = receiver.v();
        d5.u.u(iV, "this.variance");
        return j1.f.i(iV);
    }

    @Override // qm.b
    public final a1 L0(sm.b bVar) {
        return g.O(bVar);
    }

    @Override // qm.b
    public final void M(sm.d dVar) {
        g.L(dVar);
    }

    @Override // qm.b
    public final c0 M0(sm.d dVar, boolean z10) {
        return g.Z(dVar, z10);
    }

    @Override // qm.b
    public final int N(q0 q0Var) {
        return g.t(q0Var);
    }

    @Override // qm.b
    public final boolean N0(sm.f fVar) {
        return g.E(fVar);
    }

    @Override // qm.b
    public final sm.b O0(sm.d dVar) {
        return g.e(this, dVar);
    }

    @Override // qm.b
    public final Set R(sm.d dVar) {
        return g.S(this, dVar);
    }

    @Override // qm.b
    public final q0 S(sm.c cVar, int i10) {
        return g.p(cVar, i10);
    }

    @Override // qm.b
    public final a1 T(q0 q0Var) {
        return g.r(q0Var);
    }

    @Override // qm.b
    public final q0 U(sm.d dVar, int i10) {
        kotlin.jvm.internal.n.f(dVar, "<this>");
        if (i10 < 0 || i10 >= g.c(dVar)) {
            return null;
        }
        return g.p(dVar, i10);
    }

    @Override // qm.b
    public final boolean V(sm.d dVar) {
        return g.B(dVar);
    }

    @Override // qm.b
    public final boolean W(sm.b bVar) {
        return g.J(bVar);
    }

    @Override // qm.b
    public final boolean X(sm.d dVar) {
        kotlin.jvm.internal.n.f(dVar, "<this>");
        return g.D(g.W(dVar));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // qm.b
    public final q0 Z(sm.e eVar, int i10) {
        kotlin.jvm.internal.n.f(eVar, "<this>");
        if (eVar instanceof sm.d) {
            return g.p((sm.c) eVar, i10);
        }
        if (eVar instanceof sm.a) {
            E e10 = ((sm.a) eVar).get(i10);
            kotlin.jvm.internal.n.e(e10, "get(index)");
            return (q0) e10;
        }
        throw new IllegalStateException(("unknown type argument list type: " + eVar + ", " + d0.f44761a.b(eVar.getClass())).toString());
    }

    @Override // qm.b
    public final boolean a(sm.b bVar) {
        return bVar instanceof cm.a;
    }

    @Override // qm.b
    public final boolean a0(a1 a1Var) {
        kotlin.jvm.internal.n.f(a1Var, "<this>");
        return g.F(q0(a1Var)) != g.F(I(a1Var));
    }

    public final sm.c b(sm.c cVar) {
        c0 c0VarZ;
        kotlin.jvm.internal.n.f(cVar, "<this>");
        c0 c0VarH = g.h(cVar);
        return (c0VarH == null || (c0VarZ = g.Z(c0VarH, true)) == null) ? cVar : c0VarZ;
    }

    @Override // qm.b
    public final boolean c0(sm.c cVar) {
        kotlin.jvm.internal.n.f(cVar, "<this>");
        c0 c0VarH = g.h(cVar);
        return (c0VarH != null ? g.f(c0VarH) : null) != null;
    }

    @Override // qm.b
    public final c0 d0(sm.d dVar) {
        return g.j(dVar);
    }

    @Override // qm.b
    public final boolean e(q0 q0Var) {
        return g.K(q0Var);
    }

    @Override // qm.b
    public final a1 e0(sm.c cVar) {
        return g.P(cVar);
    }

    @Override // qm.b
    public final c0 f0(pm.n nVar) {
        return g.Q(nVar);
    }

    @Override // qm.b
    public final c0 g0(sm.c cVar) {
        return g.h(cVar);
    }

    @Override // qm.b
    public final boolean h0(sm.d dVar) {
        return g.F(dVar);
    }

    @Override // qm.b
    public final i i0(sm.b bVar) {
        return g.X(bVar);
    }

    @Override // qm.b
    public final boolean j(sm.d dVar) {
        kotlin.jvm.internal.n.f(dVar, "<this>");
        return g.y(g.W(dVar));
    }

    @Override // qm.b
    public final a1 k(sm.d dVar, sm.d dVar2) {
        return g.m(this, dVar, dVar2);
    }

    @Override // qm.b
    public final sm.d k0(sm.d dVar) {
        c0 c0VarQ;
        kotlin.jvm.internal.n.f(dVar, "<this>");
        pm.n nVarF = g.f(dVar);
        return (nVarF == null || (c0VarQ = g.Q(nVarF)) == null) ? dVar : c0VarQ;
    }

    @Override // qm.b
    public final boolean l(sm.d dVar) {
        kotlin.jvm.internal.n.f(dVar, "<this>");
        return g.G(p0(dVar)) && !g.H(dVar);
    }

    @Override // qm.b
    public final pm.r l0(sm.c cVar) {
        return g.g(cVar);
    }

    @Override // qm.b
    public final boolean m0(sm.f fVar) {
        return g.y(fVar);
    }

    @Override // qm.b
    public final int o(sm.c cVar) {
        return g.c(cVar);
    }

    @Override // qm.b
    public final boolean o0(sm.d dVar, sm.d dVar2) {
        return g.w(dVar, dVar2);
    }

    @Override // qm.b
    public final sm.e p(sm.d dVar) {
        return g.d(dVar);
    }

    @Override // qm.b
    public final n0 p0(sm.c cVar) {
        kotlin.jvm.internal.n.f(cVar, "<this>");
        c0 c0VarH = g.h(cVar);
        if (c0VarH == null) {
            c0VarH = q0(cVar);
        }
        return g.W(c0VarH);
    }

    @Override // qm.b
    public final c0 q0(sm.c cVar) {
        c0 c0VarN;
        kotlin.jvm.internal.n.f(cVar, "<this>");
        pm.r rVarG = g.g(cVar);
        if (rVarG != null && (c0VarN = g.N(rVarG)) != null) {
            return c0VarN;
        }
        c0 c0VarH = g.h(cVar);
        kotlin.jvm.internal.n.c(c0VarH);
        return c0VarH;
    }

    @Override // qm.b
    public final int r(sm.e eVar) {
        kotlin.jvm.internal.n.f(eVar, "<this>");
        if (eVar instanceof sm.d) {
            return g.c((sm.c) eVar);
        }
        if (eVar instanceof sm.a) {
            return ((sm.a) eVar).size();
        }
        throw new IllegalStateException(("unknown type argument list type: " + eVar + ", " + d0.f44761a.b(eVar.getClass())).toString());
    }

    @Override // qm.b
    public final pm.n r0(sm.d dVar) {
        return g.f(dVar);
    }

    @Override // qm.b
    public final boolean s(m0 m0Var, sm.f fVar) {
        return g.v(m0Var, fVar);
    }

    @Override // qm.b
    public final boolean s0(sm.c receiver) {
        kotlin.jvm.internal.n.f(receiver, "$receiver");
        return receiver instanceof ql.f;
    }

    @Override // qm.b
    public final m0 v(sm.f fVar, int i10) {
        return g.q(fVar, i10);
    }

    @Override // qm.b
    public final boolean v0(sm.f fVar) {
        return g.A(fVar);
    }

    @Override // qm.b
    public final a w(sm.d dVar) {
        return g.U(this, dVar);
    }

    @Override // qm.b
    public final c0 y(pm.r rVar) {
        return g.N(rVar);
    }

    @Override // qm.b
    public final void z(sm.d dVar) {
        g.M(dVar);
    }

    @Override // qm.b
    public final void Y(sm.d dVar, sm.f fVar) {
    }
}
