package qm;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashSet;
import pm.a1;
import pm.c0;
import pm.n0;
import pm.q0;
import pm.x;
import pm.y;
import qk.i0;
import zk.m0;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final e f49174a = new e();

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [pm.x] */
    /* JADX WARN: Type inference failed for: r0v2, types: [pm.x] */
    /* JADX WARN: Type inference failed for: r0v3 */
    /* JADX WARN: Type inference failed for: r3v0, types: [zk.m0] */
    /* JADX WARN: Type inference failed for: r3v1 */
    /* JADX WARN: Type inference failed for: r3v3 */
    public static c0 b(c0 c0Var) {
        y yVarB;
        n0 n0VarP = c0Var.P();
        ?? r3 = 0;
        if (n0VarP instanceof cm.c) {
            cm.c cVar = (cm.c) n0VarP;
            q0 q0Var = cVar.f6666a;
            q0 q0Var2 = q0Var.a() == 2 ? q0Var : null;
            a1 a1VarB0 = (q0Var2 == null || (yVarB = q0Var2.b()) == null) ? null : yVarB.b0();
            if (cVar.f6667b == null) {
                Collection collectionF = cVar.f();
                ArrayList arrayList = new ArrayList(xj.p.W(collectionF, 10));
                Iterator it = collectionF.iterator();
                while (it.hasNext()) {
                    arrayList.add(((y) it.next()).b0());
                }
                cVar.f6667b = new i(q0Var, new nm.d(arrayList, 1), (m0) r3, 8);
            }
            i iVar = cVar.f6667b;
            kotlin.jvm.internal.n.c(iVar);
            return new h(1, iVar, a1VarB0, c0Var.M(), c0Var.Q(), 32);
        }
        if (!(n0VarP instanceof x) || !c0Var.Q()) {
            return c0Var;
        }
        ?? r0 = (x) n0VarP;
        LinkedHashSet linkedHashSet = r0.f48485b;
        ArrayList arrayList2 = new ArrayList(xj.p.W(linkedHashSet, 10));
        Iterator it2 = linkedHashSet.iterator();
        boolean z10 = false;
        while (it2.hasNext()) {
            arrayList2.add(i0.T((y) it2.next()));
            z10 = true;
        }
        if (z10) {
            y yVar = r0.f48484a;
            a1 a1VarT = yVar != null ? i0.T(yVar) : null;
            arrayList2.isEmpty();
            LinkedHashSet linkedHashSet2 = new LinkedHashSet(arrayList2);
            linkedHashSet2.hashCode();
            x xVar = new x(linkedHashSet2);
            xVar.f48484a = a1VarT;
            r3 = xVar;
        }
        if (r3 != 0) {
            r0 = r3;
        }
        return r0.b();
    }

    public final a1 a(sm.c type) {
        a1 a1VarJ;
        kotlin.jvm.internal.n.f(type, "type");
        if (!(type instanceof y)) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        a1 a1VarB0 = ((y) type).b0();
        if (a1VarB0 instanceof c0) {
            a1VarJ = b((c0) a1VarB0);
        } else {
            if (!(a1VarB0 instanceof pm.r)) {
                throw new aa.b((byte) 0, 20);
            }
            pm.r rVar = (pm.r) a1VarB0;
            c0 c0Var = rVar.f48471c;
            c0 c0Var2 = rVar.f48470b;
            c0 c0VarB = b(c0Var2);
            c0 c0VarB2 = b(c0Var);
            a1VarJ = (c0VarB == c0Var2 && c0VarB2 == c0Var) ? a1VarB0 : pm.f.j(c0VarB, c0VarB2);
        }
        ml.l lVar = new ml.l(1, 6, this);
        y yVarF = pm.c.f(a1VarB0);
        return pm.c.B(a1VarJ, yVarF != null ? (y) lVar.invoke(yVarF) : null);
    }
}
