package zk;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
public abstract class u {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final hn.u f55001a = new hn.u("InvalidModuleNotifier", 4);

    public static final r1.s a(pm.c0 c0Var, h hVar, int i10) {
        if (hVar == null || rm.i.f(hVar)) {
            return null;
        }
        int size = hVar.i().size() + i10;
        if (hVar.u()) {
            List listSubList = c0Var.t().subList(i10, size);
            j jVarE = hVar.e();
            return new r1.s(hVar, listSubList, a(c0Var, jVarE instanceof h ? (h) jVarE : null, size));
        }
        if (size != c0Var.t().size()) {
            bm.e.o(hVar);
        }
        return new r1.s(hVar, c0Var.t().subList(i10, c0Var.t().size()), (r1.s) null);
    }

    public static final void b(d0 d0Var, yl.c fqName, ArrayList arrayList) {
        kotlin.jvm.internal.n.f(d0Var, "<this>");
        kotlin.jvm.internal.n.f(fqName, "fqName");
        d0Var.a(fqName, arrayList);
    }

    public static final List c(h hVar) {
        List parameters;
        Object next;
        pm.n0 n0VarN;
        List declaredTypeParameters = hVar.i();
        kotlin.jvm.internal.n.e(declaredTypeParameters, "declaredTypeParameters");
        if (!hVar.u() && !(hVar.e() instanceof b)) {
            return declaredTypeParameters;
        }
        int i10 = fm.e.f41020a;
        fm.d dVar = fm.d.f41019e;
        List listW = zm.l.W(new zm.g(zm.l.P(new an.r(zm.l.O(zm.l.R(hVar, dVar), 1), 7), q.f54992h), q.f54993i, zm.o.f55118b));
        Iterator it = zm.l.O(zm.l.R(hVar, dVar), 1).iterator();
        do {
            parameters = null;
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (!(next instanceof e));
        e eVar = (e) next;
        if (eVar != null && (n0VarN = eVar.n()) != null) {
            parameters = n0VarN.getParameters();
        }
        if (parameters == null) {
            parameters = xj.v.f53866a;
        }
        if (listW.isEmpty() && parameters.isEmpty()) {
            List declaredTypeParameters2 = hVar.i();
            kotlin.jvm.internal.n.e(declaredTypeParameters2, "declaredTypeParameters");
            return declaredTypeParameters2;
        }
        ArrayList<m0> arrayListB0 = xj.n.B0(parameters, listW);
        ArrayList arrayList = new ArrayList(xj.p.W(arrayListB0, 10));
        for (m0 it2 : arrayListB0) {
            kotlin.jvm.internal.n.e(it2, "it");
            arrayList.add(new d(it2, hVar, declaredTypeParameters.size()));
        }
        return xj.n.B0(arrayList, declaredTypeParameters);
    }

    public static final e d(w wVar, yl.b classId) {
        kotlin.jvm.internal.n.f(wVar, "<this>");
        kotlin.jvm.internal.n.f(classId, "classId");
        g gVarE = e(wVar, classId);
        if (gVarE instanceof e) {
            return (e) gVarE;
        }
        return null;
    }

    public static final g e(w wVar, yl.b classId) {
        kotlin.jvm.internal.n.f(wVar, "<this>");
        kotlin.jvm.internal.n.f(classId, "classId");
        if (wVar.n0(bm.m.f5740a) != null) {
            throw new ClassCastException();
        }
        yl.c cVarG = classId.g();
        kotlin.jvm.internal.n.e(cVarG, "classId.packageFqName");
        e0 e0VarF = wVar.F(cVarG);
        List listE = classId.h().f54505a.e();
        im.j jVar = ((cl.b0) e0VarF).f6483g;
        Object objO0 = xj.n.o0(listE);
        kotlin.jvm.internal.n.e(objO0, "segments.first()");
        hl.b bVar = hl.b.f42411g;
        g gVarC = jVar.c((yl.f) objO0, bVar);
        if (gVarC != null) {
            for (yl.f name : listE.subList(1, listE.size())) {
                if (gVarC instanceof e) {
                    im.n nVarN = ((e) gVarC).N();
                    kotlin.jvm.internal.n.e(name, "name");
                    g gVarC2 = nVarN.c(name, bVar);
                    gVarC = gVarC2 instanceof e ? (e) gVarC2 : null;
                    if (gVarC != null) {
                    }
                }
            }
            return gVarC;
        }
        return null;
    }

    public static final e f(w wVar, yl.b classId, zc.u notFoundClasses) {
        kotlin.jvm.internal.n.f(wVar, "<this>");
        kotlin.jvm.internal.n.f(classId, "classId");
        kotlin.jvm.internal.n.f(notFoundClasses, "notFoundClasses");
        e eVarD = d(wVar, classId);
        return eVarD != null ? eVarD : notFoundClasses.r(classId, zm.l.W(zm.l.U(zm.l.R(classId, p.f54989b), q.f54990f)));
    }

    public static final g g(j jVar) {
        j jVarE = jVar.e();
        if (jVarE == null || (jVar instanceof b0)) {
            return null;
        }
        if (!(jVarE.e() instanceof b0)) {
            return g(jVarE);
        }
        if (jVarE instanceof g) {
            return (g) jVarE;
        }
        return null;
    }

    public static final boolean h(d0 d0Var, yl.c fqName) {
        kotlin.jvm.internal.n.f(d0Var, "<this>");
        kotlin.jvm.internal.n.f(fqName, "fqName");
        return d0Var.b(fqName);
    }

    public static final ArrayList i(d0 d0Var, yl.c fqName) {
        kotlin.jvm.internal.n.f(d0Var, "<this>");
        kotlin.jvm.internal.n.f(fqName, "fqName");
        ArrayList arrayList = new ArrayList();
        b(d0Var, fqName, arrayList);
        return arrayList;
    }

    public static final e j(w wVar, yl.c fqName) {
        g gVarC;
        im.n nVarN;
        kotlin.jvm.internal.n.f(wVar, "<this>");
        kotlin.jvm.internal.n.f(fqName, "fqName");
        if (!fqName.d()) {
            im.j jVar = ((cl.b0) wVar.F(fqName.e())).f6483g;
            yl.f fVarF = fqName.f();
            kotlin.jvm.internal.n.e(fVarF, "fqName.shortName()");
            hl.b bVar = hl.b.f42405a;
            g gVarC2 = jVar.c(fVarF, bVar);
            e eVar = gVarC2 instanceof e ? (e) gVarC2 : null;
            if (eVar != null) {
                return eVar;
            }
            e eVarJ = j(wVar, fqName.e());
            if (eVarJ == null || (nVarN = eVarJ.N()) == null) {
                gVarC = null;
            } else {
                yl.f fVarF2 = fqName.f();
                kotlin.jvm.internal.n.e(fVarF2, "fqName.shortName()");
                gVarC = nVarN.c(fVarF2, bVar);
            }
            if (gVarC instanceof e) {
                return (e) gVarC;
            }
        }
        return null;
    }
}
