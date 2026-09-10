package ml;

import cc.a2;
import cl.o0;
import cl.p0;
import cl.q0;
import cl.x0;
import com.google.android.gms.internal.measurement.nf;
import java.lang.annotation.Annotation;
import java.lang.reflect.InvocationTargetException;
import java.util.AbstractCollection;
import java.util.AbstractSet;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import pm.a1;
import pm.y0;
import qk.i0;
import zk.h0;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
public final class p extends a0 {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final zk.e f46221n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final fl.n f46222o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final boolean f46223p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final om.i f46224q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final om.i f46225r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final om.i f46226s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final om.i f46227t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final om.j f46228u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(nf c4, zk.e eVar, fl.n jClass, boolean z10, p pVar) {
        super(c4, pVar);
        kotlin.jvm.internal.n.f(c4, "c");
        kotlin.jvm.internal.n.f(jClass, "jClass");
        this.f46221n = eVar;
        this.f46222o = jClass;
        this.f46223p = z10;
        om.o oVar = ((ll.a) c4.f23782b).f45485a;
        n nVar = new n(this, c4);
        om.l lVar = (om.l) oVar;
        lVar.getClass();
        this.f46224q = new om.i(lVar, nVar);
        o oVar2 = new o(this, 1);
        om.l lVar2 = (om.l) oVar;
        lVar2.getClass();
        this.f46225r = new om.i(lVar2, oVar2);
        n nVar2 = new n(c4, this);
        om.l lVar3 = (om.l) oVar;
        lVar3.getClass();
        this.f46226s = new om.i(lVar3, nVar2);
        o oVar3 = new o(this, 0);
        om.l lVar4 = (om.l) oVar;
        lVar4.getClass();
        this.f46227t = new om.i(lVar4, oVar3);
        this.f46228u = ((om.l) oVar).c(new a4.b(2, this, c4));
    }

    public static q0 C(q0 q0Var, zk.s sVar, AbstractCollection abstractCollection) {
        if (abstractCollection.isEmpty()) {
            return q0Var;
        }
        Iterator it = abstractCollection.iterator();
        while (it.hasNext()) {
            q0 q0Var2 = (q0) it.next();
            if (!q0Var.equals(q0Var2) && q0Var2.B == null && F(q0Var2, sVar)) {
                zk.s sVarBuild = q0Var.v0().n().build();
                kotlin.jvm.internal.n.c(sVarBuild);
                return (q0) sVarBuild;
            }
        }
        return q0Var;
    }

    /* JADX WARN: Code duplicated, block: B:12:0x0036  */
    public static q0 D(q0 q0Var) {
        yl.c cVarG;
        List valueParameters = q0Var.B();
        kotlin.jvm.internal.n.e(valueParameters, "valueParameters");
        x0 x0Var = (x0) xj.n.x0(valueParameters);
        if (x0Var != null) {
            zk.g gVarE = x0Var.getType().P().e();
            if (gVarE != null) {
                yl.e eVarH = fm.e.h(gVarE);
                if (!eVarH.d()) {
                    eVarH = null;
                }
                if (eVarH != null) {
                    cVarG = eVarH.g();
                } else {
                    cVarG = null;
                }
            } else {
                cVarG = null;
            }
            if (!kotlin.jvm.internal.n.a(cVarG, wk.m.f53368f)) {
                x0Var = null;
            }
            if (x0Var != null) {
                zk.r rVarV0 = q0Var.v0();
                List valueParameters2 = q0Var.B();
                kotlin.jvm.internal.n.e(valueParameters2, "valueParameters");
                q0 q0Var2 = (q0) rVarV0.c(xj.n.l0(valueParameters2)).o(((pm.q0) x0Var.getType().t().get(0)).b()).build();
                if (q0Var2 == null) {
                    return q0Var2;
                }
                q0Var2.f6652u = true;
                return q0Var2;
            }
        }
        return null;
    }

    public static boolean F(zk.s sVar, zk.s sVar2) {
        int iC = bm.l.f5737c.n(sVar2, sVar, true).c();
        d5.u.u(iC, "DEFAULT.isOverridableByW…iptor, this, true).result");
        return iC == 1 && !j1.f.p(sVar2, sVar);
    }

    public static boolean G(q0 q0Var, q0 q0Var2) {
        int i10 = il.d.l;
        kotlin.jvm.internal.n.f(q0Var, "<this>");
        if (kotlin.jvm.internal.n.a(q0Var.getName().b(), "removeAt") && kotlin.jvm.internal.n.a(go.k.v(q0Var), il.g0.f43083g.f43059b)) {
            q0Var2 = q0Var2.a();
        }
        kotlin.jvm.internal.n.e(q0Var2, "if (superDescriptor.isRe…iginal else subDescriptor");
        return F(q0Var2, q0Var);
    }

    public static q0 H(h0 h0Var, String str, jk.b bVar) {
        q0 q0Var;
        Iterator it = ((Iterable) bVar.invoke(yl.f.e(str))).iterator();
        do {
            q0Var = null;
            if (!it.hasNext()) {
                break;
            }
            q0 q0Var2 = (q0) it.next();
            if (q0Var2.B().size() == 0) {
                qm.l lVar = qm.d.f49173a;
                pm.y yVar = q0Var2.f6639g;
                if (yVar == null ? false : lVar.b(yVar, h0Var.getType())) {
                    q0Var = q0Var2;
                }
            }
        } while (q0Var == null);
        return q0Var;
    }

    public static q0 J(h0 h0Var, jk.b bVar) {
        q0 q0Var;
        pm.y yVar;
        String strB = h0Var.getName().b();
        kotlin.jvm.internal.n.e(strB, "name.asString()");
        Iterator it = ((Iterable) bVar.invoke(yl.f.e(il.x.b(strB)))).iterator();
        do {
            q0Var = null;
            if (!it.hasNext()) {
                break;
            }
            q0 q0Var2 = (q0) it.next();
            if (q0Var2.B().size() == 1 && (yVar = q0Var2.f6639g) != null) {
                yl.f fVar = wk.h.f53310e;
                if (wk.h.D(yVar, wk.l.f53341d)) {
                    qm.l lVar = qm.d.f49173a;
                    List listB = q0Var2.B();
                    kotlin.jvm.internal.n.e(listB, "descriptor.valueParameters");
                    if (lVar.a(((x0) xj.n.F0(listB)).getType(), h0Var.getType())) {
                        q0Var = q0Var2;
                    }
                }
            }
        } while (q0Var == null);
        return q0Var;
    }

    public static boolean M(q0 q0Var, zk.s sVar) {
        String strU = go.k.u(q0Var, 2);
        zk.s sVarA = sVar.a();
        kotlin.jvm.internal.n.e(sVarA, "builtinWithErasedParameters.original");
        return strU.equals(go.k.u(sVarA, 2)) && !F(q0Var, sVar);
    }

    public static final ArrayList v(p pVar, yl.f fVar) {
        Collection collectionD = ((c) pVar.f46154e.invoke()).d(fVar);
        ArrayList arrayList = new ArrayList(xj.p.W(collectionD, 10));
        Iterator it = collectionD.iterator();
        while (it.hasNext()) {
            arrayList.add(pVar.t((fl.w) it.next()));
        }
        return arrayList;
    }

    public static final ArrayList w(p pVar, yl.f fVar) {
        LinkedHashSet linkedHashSetK = pVar.K(fVar);
        ArrayList arrayList = new ArrayList();
        for (Object obj : linkedHashSetK) {
            q0 q0Var = (q0) obj;
            kotlin.jvm.internal.n.f(q0Var, "<this>");
            if (i0.L(q0Var) == null && il.f.a(q0Var) == null) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    public final void A(Set set, AbstractCollection abstractCollection, ym.i iVar, jk.b bVar) {
        q0 q0VarJ;
        p0 p0VarM;
        kl.d dVar;
        Iterator it = set.iterator();
        while (it.hasNext()) {
            h0 h0Var = (h0) it.next();
            if (E(h0Var, bVar)) {
                q0 q0VarI = I(h0Var, bVar);
                kotlin.jvm.internal.n.c(q0VarI);
                if (h0Var.I()) {
                    q0VarJ = J(h0Var, bVar);
                    kotlin.jvm.internal.n.c(q0VarJ);
                } else {
                    q0VarJ = null;
                }
                if (q0VarJ != null) {
                    q0VarJ.j();
                    q0VarI.j();
                }
                zk.e ownerDescriptor = this.f46221n;
                kotlin.jvm.internal.n.f(ownerDescriptor, "ownerDescriptor");
                kl.d dVar2 = new kl.d(ownerDescriptor, al.i.f3645a, q0VarI.j(), q0VarI.getVisibility(), q0VarJ != null, h0Var.getName(), q0VarI.c(), null, 1, false, null);
                pm.y yVar = q0VarI.f6639g;
                kotlin.jvm.internal.n.c(yVar);
                cl.z zVarP = p();
                xj.v vVar = xj.v.f53866a;
                dVar2.Q0(yVar, vVar, zVarP, null, vVar);
                o0 o0VarL = bm.m.l(dVar2, q0VarI.getAnnotations(), false, q0VarI.c());
                o0VarL.l = q0VarI;
                o0VarL.M0(dVar2.getType());
                if (q0VarJ != null) {
                    List listB = q0VarJ.B();
                    kotlin.jvm.internal.n.e(listB, "setterMethod.valueParameters");
                    x0 x0Var = (x0) xj.n.q0(listB);
                    if (x0Var == null) {
                        throw new AssertionError("No parameter found for " + q0VarJ);
                    }
                    p0VarM = bm.m.m(dVar2, q0VarJ.getAnnotations(), x0Var.getAnnotations(), false, q0VarJ.getVisibility(), q0VarJ.c());
                    p0VarM.l = q0VarJ;
                } else {
                    p0VarM = null;
                }
                dVar2.N0(o0VarL, p0VarM, null, null);
                dVar = dVar2;
            } else {
                dVar = null;
            }
            if (dVar != null) {
                abstractCollection.add(dVar);
                if (iVar != null) {
                    iVar.add(h0Var);
                    return;
                }
                return;
            }
        }
    }

    public final Collection B() {
        boolean z10 = this.f46223p;
        zk.e classDescriptor = this.f46221n;
        if (z10) {
            Collection collectionF = classDescriptor.n().f();
            kotlin.jvm.internal.n.e(collectionF, "ownerDescriptor.typeConstructor.supertypes");
            return collectionF;
        }
        ((qm.l) ((ll.a) this.f46151b.f23782b).f45504u).getClass();
        kotlin.jvm.internal.n.f(classDescriptor, "classDescriptor");
        Collection collectionF2 = classDescriptor.n().f();
        kotlin.jvm.internal.n.e(collectionF2, "classDescriptor.typeConstructor.supertypes");
        return collectionF2;
    }

    public final boolean E(h0 h0Var, jk.b bVar) {
        if (x7.a.D(h0Var)) {
            return false;
        }
        q0 q0VarI = I(h0Var, bVar);
        q0 q0VarJ = J(h0Var, bVar);
        if (q0VarI == null) {
            return false;
        }
        if (h0Var.I()) {
            return q0VarJ != null && q0VarJ.j() == q0VarI.j();
        }
        return true;
    }

    /* JADX WARN: Type inference failed for: r3v1, types: [java.lang.Object, java.util.Map] */
    public final q0 I(h0 h0Var, jk.b bVar) {
        yl.f fVar;
        o0 getter = h0Var.getGetter();
        String strB = null;
        o0 o0Var = getter != null ? (o0) i0.L(getter) : null;
        if (o0Var != null) {
            wk.h.z(o0Var);
            zk.c cVarB = fm.e.b(fm.e.k(o0Var), il.e.f43062h);
            if (cVarB != null && (fVar = (yl.f) il.g.f43073a.get(fm.e.g(cVarB))) != null) {
                strB = fVar.b();
            }
        }
        if (strB != null && !i0.P(this.f46221n, o0Var)) {
            return H(h0Var, strB, bVar);
        }
        String strB2 = h0Var.getName().b();
        kotlin.jvm.internal.n.e(strB2, "name.asString()");
        return H(h0Var, il.x.a(strB2), bVar);
    }

    public final LinkedHashSet K(yl.f fVar) {
        Collection collectionB = B();
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        Iterator it = collectionB.iterator();
        while (it.hasNext()) {
            xj.t.a0(((pm.y) it.next()).A().a(fVar, hl.b.f42409e), linkedHashSet);
        }
        return linkedHashSet;
    }

    public final Set L(yl.f fVar) {
        Collection collectionB = B();
        ArrayList arrayList = new ArrayList();
        Iterator it = collectionB.iterator();
        while (it.hasNext()) {
            Collection collectionF = ((pm.y) it.next()).A().f(fVar, hl.b.f42409e);
            ArrayList arrayList2 = new ArrayList(xj.p.W(collectionF, 10));
            Iterator it2 = collectionF.iterator();
            while (it2.hasNext()) {
                arrayList2.add((h0) it2.next());
            }
            xj.t.a0(arrayList2, arrayList);
        }
        return xj.n.R0(arrayList);
    }

    /* JADX WARN: Code duplicated, block: B:101:0x0173 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:103:0x0161 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:106:0x01ca A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:107:? A[LOOP:3: B:72:0x0182->B:107:?, LOOP_END, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:109:0x01c4 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:112:0x01b2 A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:41:0x00d8  */
    /* JADX WARN: Code duplicated, block: B:44:0x00eb  */
    /* JADX WARN: Code duplicated, block: B:50:0x0108  */
    /* JADX WARN: Code duplicated, block: B:53:0x0125  */
    /* JADX WARN: Code duplicated, block: B:56:0x012f  */
    /* JADX WARN: Code duplicated, block: B:59:0x013d  */
    /* JADX WARN: Code duplicated, block: B:62:0x014d  */
    /* JADX WARN: Code duplicated, block: B:65:0x0167  */
    /* JADX WARN: Code duplicated, block: B:71:0x017e  */
    /* JADX WARN: Code duplicated, block: B:74:0x0188  */
    /* JADX WARN: Code duplicated, block: B:77:0x0195  */
    /* JADX WARN: Code duplicated, block: B:80:0x019c  */
    /* JADX WARN: Code duplicated, block: B:83:0x01ae  */
    /* JADX WARN: Code duplicated, block: B:86:0x01b8  */
    /* JADX WARN: Code duplicated, block: B:93:0x00fd A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:95:0x00e5 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:98:0x01ca A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:99:? A[LOOP:1: B:54:0x0129->B:99:?, LOOP_END, SYNTHETIC] */
    public final boolean N(q0 q0Var) {
        Iterable iterableR;
        yl.f fVar;
        yl.f name;
        q0 q0VarD;
        LinkedHashSet<q0> linkedHashSetK;
        ArrayList arrayList;
        Iterator it;
        Iterator it2;
        zk.s sVarA;
        ArrayList arrayList2;
        q0 q0Var2;
        Iterator it3;
        q0 q0Var3;
        yl.f name2 = q0Var.getName();
        kotlin.jvm.internal.n.e(name2, "function.name");
        String strB = name2.b();
        kotlin.jvm.internal.n.e(strB, "name.asString()");
        yl.c cVar = il.x.f43118a;
        if (an.p.p0(strB, "get", false) || an.p.p0(strB, "is", false)) {
            yl.f fVarC = no.b.C(name2, "get", null, 12);
            if (fVarC == null) {
                fVarC = no.b.C(name2, "is", null, 8);
            }
            iterableR = xj.o.R(fVarC);
        } else if (an.p.p0(strB, "set", false)) {
            iterableR = xj.k.m0(new yl.f[]{no.b.C(name2, "set", null, 4), no.b.C(name2, "set", "is", 4)});
        } else {
            iterableR = (List) il.g.f43074b.get(name2);
            if (iterableR == null) {
                iterableR = xj.v.f53866a;
            }
        }
        Iterable iterable = iterableR;
        if ((iterable instanceof Collection) && ((Collection) iterable).isEmpty()) {
            ArrayList arrayList3 = il.g0.f43077a;
            yl.f name3 = q0Var.getName();
            kotlin.jvm.internal.n.e(name3, "name");
            fVar = (yl.f) il.g0.f43087k.get(name3);
            if (fVar == null) {
                int i10 = il.f.l;
                name = q0Var.getName();
                kotlin.jvm.internal.n.e(name, "name");
                if (!il.f.b(name)) {
                    q0VarD = D(q0Var);
                    if (q0VarD != null) {
                        yl.f name4 = q0Var.getName();
                        kotlin.jvm.internal.n.e(name4, "name");
                        linkedHashSetK = K(name4);
                        if (!linkedHashSetK.isEmpty()) {
                            for (q0 q0Var4 : linkedHashSetK) {
                                if (q0Var4.isSuspend()) {
                                }
                            }
                        }
                    }
                    return true;
                }
                yl.f name5 = q0Var.getName();
                kotlin.jvm.internal.n.e(name5, "name");
                LinkedHashSet linkedHashSetK2 = K(name5);
                arrayList = new ArrayList();
                it = linkedHashSetK2.iterator();
                while (it.hasNext()) {
                    sVarA = il.f.a((q0) it.next());
                    if (sVarA != null) {
                        arrayList.add(sVarA);
                    }
                }
                if (arrayList.isEmpty()) {
                    q0VarD = D(q0Var);
                    if (q0VarD != null) {
                        yl.f name6 = q0Var.getName();
                        kotlin.jvm.internal.n.e(name6, "name");
                        linkedHashSetK = K(name6);
                        if (!linkedHashSetK.isEmpty()) {
                            while (r9.hasNext()) {
                                if (q0Var4.isSuspend()) {
                                }
                            }
                        }
                    }
                    return true;
                }
                it2 = arrayList.iterator();
                while (it2.hasNext()) {
                    if (M(q0Var, (zk.s) it2.next())) {
                    }
                }
                q0VarD = D(q0Var);
                if (q0VarD != null) {
                    yl.f name7 = q0Var.getName();
                    kotlin.jvm.internal.n.e(name7, "name");
                    linkedHashSetK = K(name7);
                    if (!linkedHashSetK.isEmpty()) {
                        while (r9.hasNext()) {
                            if (q0Var4.isSuspend()) {
                            }
                        }
                    }
                }
                return true;
            }
            LinkedHashSet linkedHashSetK3 = K(fVar);
            arrayList2 = new ArrayList();
            for (Object obj : linkedHashSetK3) {
                q0Var3 = (q0) obj;
                kotlin.jvm.internal.n.f(q0Var3, "<this>");
                if (i0.L(q0Var3) != null) {
                    arrayList2.add(obj);
                }
            }
            if (arrayList2.isEmpty()) {
                int i11 = il.f.l;
                name = q0Var.getName();
                kotlin.jvm.internal.n.e(name, "name");
                if (!il.f.b(name)) {
                    q0VarD = D(q0Var);
                    if (q0VarD != null) {
                        yl.f name8 = q0Var.getName();
                        kotlin.jvm.internal.n.e(name8, "name");
                        linkedHashSetK = K(name8);
                        if (!linkedHashSetK.isEmpty()) {
                            while (r9.hasNext()) {
                                if (q0Var4.isSuspend()) {
                                }
                            }
                        }
                    }
                    return true;
                }
                yl.f name9 = q0Var.getName();
                kotlin.jvm.internal.n.e(name9, "name");
                LinkedHashSet linkedHashSetK4 = K(name9);
                arrayList = new ArrayList();
                it = linkedHashSetK4.iterator();
                while (it.hasNext()) {
                    sVarA = il.f.a((q0) it.next());
                    if (sVarA != null) {
                        arrayList.add(sVarA);
                    }
                }
                if (arrayList.isEmpty()) {
                    q0VarD = D(q0Var);
                    if (q0VarD != null) {
                        yl.f name10 = q0Var.getName();
                        kotlin.jvm.internal.n.e(name10, "name");
                        linkedHashSetK = K(name10);
                        if (!linkedHashSetK.isEmpty()) {
                            while (r9.hasNext()) {
                                if (q0Var4.isSuspend()) {
                                }
                            }
                        }
                    }
                    return true;
                }
                it2 = arrayList.iterator();
                while (it2.hasNext()) {
                    if (M(q0Var, (zk.s) it2.next())) {
                    }
                }
                q0VarD = D(q0Var);
                if (q0VarD != null) {
                    yl.f name11 = q0Var.getName();
                    kotlin.jvm.internal.n.e(name11, "name");
                    linkedHashSetK = K(name11);
                    if (!linkedHashSetK.isEmpty()) {
                        while (r9.hasNext()) {
                            if (q0Var4.isSuspend()) {
                            }
                        }
                    }
                }
                return true;
            }
            zk.r rVarV0 = q0Var.v0();
            rVarV0.d(fVar);
            rVarV0.B();
            rVarV0.s();
            zk.s sVarBuild = rVarV0.build();
            kotlin.jvm.internal.n.c(sVarBuild);
            q0Var2 = (q0) sVarBuild;
            if (arrayList2.isEmpty()) {
                int i12 = il.f.l;
                name = q0Var.getName();
                kotlin.jvm.internal.n.e(name, "name");
                if (!il.f.b(name)) {
                    q0VarD = D(q0Var);
                    if (q0VarD != null) {
                        yl.f name12 = q0Var.getName();
                        kotlin.jvm.internal.n.e(name12, "name");
                        linkedHashSetK = K(name12);
                        if (!linkedHashSetK.isEmpty()) {
                            while (r9.hasNext()) {
                                if (q0Var4.isSuspend()) {
                                }
                            }
                        }
                    }
                    return true;
                }
                yl.f name13 = q0Var.getName();
                kotlin.jvm.internal.n.e(name13, "name");
                LinkedHashSet linkedHashSetK5 = K(name13);
                arrayList = new ArrayList();
                it = linkedHashSetK5.iterator();
                while (it.hasNext()) {
                    sVarA = il.f.a((q0) it.next());
                    if (sVarA != null) {
                        arrayList.add(sVarA);
                    }
                }
                if (arrayList.isEmpty()) {
                    q0VarD = D(q0Var);
                    if (q0VarD != null) {
                        yl.f name14 = q0Var.getName();
                        kotlin.jvm.internal.n.e(name14, "name");
                        linkedHashSetK = K(name14);
                        if (!linkedHashSetK.isEmpty()) {
                            while (r9.hasNext()) {
                                if (q0Var4.isSuspend()) {
                                }
                            }
                        }
                    }
                    return true;
                }
                it2 = arrayList.iterator();
                while (it2.hasNext()) {
                    if (M(q0Var, (zk.s) it2.next())) {
                    }
                }
                q0VarD = D(q0Var);
                if (q0VarD != null) {
                    yl.f name15 = q0Var.getName();
                    kotlin.jvm.internal.n.e(name15, "name");
                    linkedHashSetK = K(name15);
                    if (!linkedHashSetK.isEmpty()) {
                        while (r9.hasNext()) {
                            if (q0Var4.isSuspend()) {
                            }
                        }
                    }
                }
                return true;
            }
            it3 = arrayList2.iterator();
            while (it3.hasNext()) {
                if (G((q0) it3.next(), q0Var2)) {
                }
            }
            int i13 = il.f.l;
            name = q0Var.getName();
            kotlin.jvm.internal.n.e(name, "name");
            if (!il.f.b(name)) {
                q0VarD = D(q0Var);
                if (q0VarD != null) {
                    yl.f name16 = q0Var.getName();
                    kotlin.jvm.internal.n.e(name16, "name");
                    linkedHashSetK = K(name16);
                    if (!linkedHashSetK.isEmpty()) {
                        while (r9.hasNext()) {
                            if (q0Var4.isSuspend()) {
                            }
                        }
                    }
                }
                return true;
            }
            yl.f name17 = q0Var.getName();
            kotlin.jvm.internal.n.e(name17, "name");
            LinkedHashSet linkedHashSetK6 = K(name17);
            arrayList = new ArrayList();
            it = linkedHashSetK6.iterator();
            while (it.hasNext()) {
                sVarA = il.f.a((q0) it.next());
                if (sVarA != null) {
                    arrayList.add(sVarA);
                }
            }
            if (arrayList.isEmpty()) {
                q0VarD = D(q0Var);
                if (q0VarD != null) {
                    yl.f name18 = q0Var.getName();
                    kotlin.jvm.internal.n.e(name18, "name");
                    linkedHashSetK = K(name18);
                    if (!linkedHashSetK.isEmpty()) {
                        while (r9.hasNext()) {
                            if (q0Var4.isSuspend()) {
                            }
                        }
                    }
                }
                return true;
            }
            it2 = arrayList.iterator();
            while (it2.hasNext()) {
                if (M(q0Var, (zk.s) it2.next())) {
                }
            }
            q0VarD = D(q0Var);
            if (q0VarD != null) {
                yl.f name19 = q0Var.getName();
                kotlin.jvm.internal.n.e(name19, "name");
                linkedHashSetK = K(name19);
                if (!linkedHashSetK.isEmpty()) {
                    while (r9.hasNext()) {
                        if (q0Var4.isSuspend()) {
                        }
                    }
                }
            }
            return true;
        }
        Iterator it4 = iterable.iterator();
        while (it4.hasNext()) {
            Set<h0> setL = L((yl.f) it4.next());
            if (!setL.isEmpty()) {
                for (h0 h0Var : setL) {
                    if (E(h0Var, new a4.b(1, q0Var, this))) {
                        if (!h0Var.I()) {
                            String strB2 = q0Var.getName().b();
                            kotlin.jvm.internal.n.e(strB2, "function.name.asString()");
                            if (!an.p.p0(strB2, "set", false)) {
                            }
                        }
                    }
                }
            }
        }
        ArrayList arrayList4 = il.g0.f43077a;
        yl.f name20 = q0Var.getName();
        kotlin.jvm.internal.n.e(name20, "name");
        fVar = (yl.f) il.g0.f43087k.get(name20);
        if (fVar == null) {
            int i14 = il.f.l;
            name = q0Var.getName();
            kotlin.jvm.internal.n.e(name, "name");
            if (!il.f.b(name)) {
                q0VarD = D(q0Var);
                if (q0VarD != null) {
                    yl.f name110 = q0Var.getName();
                    kotlin.jvm.internal.n.e(name110, "name");
                    linkedHashSetK = K(name110);
                    if (!linkedHashSetK.isEmpty()) {
                        while (r9.hasNext()) {
                            if (q0Var4.isSuspend() || !F(q0VarD, q0Var4)) {
                            }
                        }
                    }
                }
                return true;
            }
            yl.f name111 = q0Var.getName();
            kotlin.jvm.internal.n.e(name111, "name");
            LinkedHashSet linkedHashSetK7 = K(name111);
            arrayList = new ArrayList();
            it = linkedHashSetK7.iterator();
            while (it.hasNext()) {
                sVarA = il.f.a((q0) it.next());
                if (sVarA != null) {
                    arrayList.add(sVarA);
                }
            }
            if (arrayList.isEmpty()) {
                q0VarD = D(q0Var);
                if (q0VarD != null) {
                    yl.f name112 = q0Var.getName();
                    kotlin.jvm.internal.n.e(name112, "name");
                    linkedHashSetK = K(name112);
                    if (!linkedHashSetK.isEmpty()) {
                        while (r9.hasNext()) {
                            if (q0Var4.isSuspend()) {
                            }
                        }
                    }
                }
                return true;
            }
            it2 = arrayList.iterator();
            while (it2.hasNext()) {
                if (M(q0Var, (zk.s) it2.next())) {
                }
            }
            q0VarD = D(q0Var);
            if (q0VarD != null) {
                yl.f name113 = q0Var.getName();
                kotlin.jvm.internal.n.e(name113, "name");
                linkedHashSetK = K(name113);
                if (!linkedHashSetK.isEmpty()) {
                    while (r9.hasNext()) {
                        if (q0Var4.isSuspend()) {
                        }
                    }
                }
            }
            return true;
        }
        LinkedHashSet linkedHashSetK8 = K(fVar);
        arrayList2 = new ArrayList();
        while (r4.hasNext()) {
            q0Var3 = (q0) obj;
            kotlin.jvm.internal.n.f(q0Var3, "<this>");
            if (i0.L(q0Var3) != null) {
                arrayList2.add(obj);
            }
        }
        if (arrayList2.isEmpty()) {
            int i15 = il.f.l;
            name = q0Var.getName();
            kotlin.jvm.internal.n.e(name, "name");
            if (!il.f.b(name)) {
                q0VarD = D(q0Var);
                if (q0VarD != null) {
                    yl.f name114 = q0Var.getName();
                    kotlin.jvm.internal.n.e(name114, "name");
                    linkedHashSetK = K(name114);
                    if (!linkedHashSetK.isEmpty()) {
                        while (r9.hasNext()) {
                            if (q0Var4.isSuspend()) {
                            }
                        }
                    }
                }
                return true;
            }
            yl.f name115 = q0Var.getName();
            kotlin.jvm.internal.n.e(name115, "name");
            LinkedHashSet linkedHashSetK9 = K(name115);
            arrayList = new ArrayList();
            it = linkedHashSetK9.iterator();
            while (it.hasNext()) {
                sVarA = il.f.a((q0) it.next());
                if (sVarA != null) {
                    arrayList.add(sVarA);
                }
            }
            if (arrayList.isEmpty()) {
                q0VarD = D(q0Var);
                if (q0VarD != null) {
                    yl.f name116 = q0Var.getName();
                    kotlin.jvm.internal.n.e(name116, "name");
                    linkedHashSetK = K(name116);
                    if (!linkedHashSetK.isEmpty()) {
                        while (r9.hasNext()) {
                            if (q0Var4.isSuspend()) {
                            }
                        }
                    }
                }
                return true;
            }
            it2 = arrayList.iterator();
            while (it2.hasNext()) {
                if (M(q0Var, (zk.s) it2.next())) {
                }
            }
            q0VarD = D(q0Var);
            if (q0VarD != null) {
                yl.f name117 = q0Var.getName();
                kotlin.jvm.internal.n.e(name117, "name");
                linkedHashSetK = K(name117);
                if (!linkedHashSetK.isEmpty()) {
                    while (r9.hasNext()) {
                        if (q0Var4.isSuspend()) {
                        }
                    }
                }
            }
            return true;
        }
        zk.r rVarV1 = q0Var.v0();
        rVarV1.d(fVar);
        rVarV1.B();
        rVarV1.s();
        zk.s sVarBuild2 = rVarV1.build();
        kotlin.jvm.internal.n.c(sVarBuild2);
        q0Var2 = (q0) sVarBuild2;
        if (arrayList2.isEmpty()) {
            int i16 = il.f.l;
            name = q0Var.getName();
            kotlin.jvm.internal.n.e(name, "name");
            if (!il.f.b(name)) {
                q0VarD = D(q0Var);
                if (q0VarD != null) {
                    yl.f name118 = q0Var.getName();
                    kotlin.jvm.internal.n.e(name118, "name");
                    linkedHashSetK = K(name118);
                    if (!linkedHashSetK.isEmpty()) {
                        while (r9.hasNext()) {
                            if (q0Var4.isSuspend()) {
                            }
                        }
                    }
                }
                return true;
            }
            yl.f name119 = q0Var.getName();
            kotlin.jvm.internal.n.e(name119, "name");
            LinkedHashSet linkedHashSetK10 = K(name119);
            arrayList = new ArrayList();
            it = linkedHashSetK10.iterator();
            while (it.hasNext()) {
                sVarA = il.f.a((q0) it.next());
                if (sVarA != null) {
                    arrayList.add(sVarA);
                }
            }
            if (arrayList.isEmpty()) {
                q0VarD = D(q0Var);
                if (q0VarD != null) {
                    yl.f name1110 = q0Var.getName();
                    kotlin.jvm.internal.n.e(name1110, "name");
                    linkedHashSetK = K(name1110);
                    if (!linkedHashSetK.isEmpty()) {
                        while (r9.hasNext()) {
                            if (q0Var4.isSuspend()) {
                            }
                        }
                    }
                }
                return true;
            }
            it2 = arrayList.iterator();
            while (it2.hasNext()) {
                if (M(q0Var, (zk.s) it2.next())) {
                }
            }
            q0VarD = D(q0Var);
            if (q0VarD != null) {
                yl.f name1111 = q0Var.getName();
                kotlin.jvm.internal.n.e(name1111, "name");
                linkedHashSetK = K(name1111);
                if (!linkedHashSetK.isEmpty()) {
                    while (r9.hasNext()) {
                        if (q0Var4.isSuspend()) {
                        }
                    }
                }
            }
            return true;
        }
        it3 = arrayList2.iterator();
        while (it3.hasNext()) {
            if (G((q0) it3.next(), q0Var2)) {
            }
        }
        int i17 = il.f.l;
        name = q0Var.getName();
        kotlin.jvm.internal.n.e(name, "name");
        if (!il.f.b(name)) {
            q0VarD = D(q0Var);
            if (q0VarD != null) {
                yl.f name1112 = q0Var.getName();
                kotlin.jvm.internal.n.e(name1112, "name");
                linkedHashSetK = K(name1112);
                if (!linkedHashSetK.isEmpty()) {
                    while (r9.hasNext()) {
                        if (q0Var4.isSuspend()) {
                        }
                    }
                }
            }
            return true;
        }
        yl.f name1113 = q0Var.getName();
        kotlin.jvm.internal.n.e(name1113, "name");
        LinkedHashSet linkedHashSetK11 = K(name1113);
        arrayList = new ArrayList();
        it = linkedHashSetK11.iterator();
        while (it.hasNext()) {
            sVarA = il.f.a((q0) it.next());
            if (sVarA != null) {
                arrayList.add(sVarA);
            }
        }
        if (arrayList.isEmpty()) {
            q0VarD = D(q0Var);
            if (q0VarD != null) {
                yl.f name1114 = q0Var.getName();
                kotlin.jvm.internal.n.e(name1114, "name");
                linkedHashSetK = K(name1114);
                if (!linkedHashSetK.isEmpty()) {
                    while (r9.hasNext()) {
                        if (q0Var4.isSuspend()) {
                        }
                    }
                }
            }
            return true;
        }
        it2 = arrayList.iterator();
        while (it2.hasNext()) {
            if (M(q0Var, (zk.s) it2.next())) {
            }
        }
        q0VarD = D(q0Var);
        if (q0VarD != null) {
            yl.f name1115 = q0Var.getName();
            kotlin.jvm.internal.n.e(name1115, "name");
            linkedHashSetK = K(name1115);
            if (!linkedHashSetK.isEmpty()) {
                while (r9.hasNext()) {
                    if (q0Var4.isSuspend()) {
                    }
                }
            }
        }
        return true;
        return false;
    }

    public final void O(yl.f name, hl.b location) {
        kotlin.jvm.internal.n.f(name, "name");
        kotlin.jvm.internal.n.f(location, "location");
        kotlin.jvm.internal.n.f(((ll.a) this.f46151b.f23782b).f45497n, "<this>");
        zk.e scopeOwner = this.f46221n;
        kotlin.jvm.internal.n.f(scopeOwner, "scopeOwner");
    }

    @Override // ml.a0, im.o, im.n
    public final Collection a(yl.f name, hl.b bVar) {
        kotlin.jvm.internal.n.f(name, "name");
        O(name, bVar);
        return super.a(name, bVar);
    }

    @Override // im.o, im.p
    public final zk.g c(yl.f name, hl.b location) {
        om.j jVar;
        zk.e eVar;
        kotlin.jvm.internal.n.f(name, "name");
        kotlin.jvm.internal.n.f(location, "location");
        O(name, location);
        p pVar = (p) this.f46152c;
        return (pVar == null || (jVar = pVar.f46228u) == null || (eVar = (zk.e) jVar.invoke(name)) == null) ? (zk.g) this.f46228u.invoke(name) : eVar;
    }

    @Override // ml.a0, im.o, im.n
    public final Collection f(yl.f name, hl.b bVar) {
        kotlin.jvm.internal.n.f(name, "name");
        O(name, bVar);
        return super.f(name, bVar);
    }

    @Override // ml.a0
    public final Set h(im.f kindFilter, jk.b bVar) {
        kotlin.jvm.internal.n.f(kindFilter, "kindFilter");
        return xj.g0.v0(((Map) this.f46227t.invoke()).keySet(), (Set) this.f46225r.invoke());
    }

    @Override // ml.a0
    public final Set i(im.f kindFilter, im.k kVar) {
        kotlin.jvm.internal.n.f(kindFilter, "kindFilter");
        zk.e eVar = this.f46221n;
        Collection collectionF = eVar.n().f();
        kotlin.jvm.internal.n.e(collectionF, "ownerDescriptor.typeConstructor.supertypes");
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        Iterator it = collectionF.iterator();
        while (it.hasNext()) {
            xj.t.a0(((pm.y) it.next()).A().b(), linkedHashSet);
        }
        om.i iVar = this.f46154e;
        linkedHashSet.addAll(((c) iVar.invoke()).a());
        linkedHashSet.addAll(((c) iVar.invoke()).b());
        linkedHashSet.addAll(h(kindFilter, kVar));
        nf nfVar = this.f46151b;
        linkedHashSet.addAll(((gm.a) ((ll.a) nfVar.f23782b).f45507x).e(nfVar, eVar));
        return linkedHashSet;
    }

    @Override // ml.a0
    public final void j(ArrayList arrayList, yl.f name) throws IllegalAccessException, InvocationTargetException {
        kotlin.jvm.internal.n.f(name, "name");
        boolean zF = this.f46222o.f();
        zk.e eVar = this.f46221n;
        nf nfVar = this.f46151b;
        if (zF) {
            om.i iVar = this.f46154e;
            if (((c) iVar.invoke()).e(name) != null) {
                if (arrayList.isEmpty()) {
                    fl.z zVarE = ((c) iVar.invoke()).e(name);
                    kotlin.jvm.internal.n.c(zVarE);
                    ll.c cVarI = a2.I(nfVar, zVarE);
                    ll.a aVar = (ll.a) nfVar.f23782b;
                    kl.e eVarY0 = kl.e.Y0(eVar, cVarI, zVarE.c(), aVar.f45494j.c(zVarE), true);
                    pm.y yVarL = ((v9.e) nfVar.f23786f).L(zVarE.f(), android.support.v4.media.session.a.I(2, false, null, 6));
                    cl.z zVarP = p();
                    il.o oVar = zk.n.f54978e;
                    xj.v vVar = xj.v.f53866a;
                    eVarY0.X0(null, zVarP, vVar, vVar, vVar, yVarL, 3, oVar, null);
                    eVarY0.D = 1;
                    aVar.f45491g.getClass();
                    arrayList.add(eVarY0);
                } else {
                    Iterator it = arrayList.iterator();
                    while (it.hasNext()) {
                        if (((q0) it.next()).B().isEmpty()) {
                        }
                    }
                    fl.z zVarE2 = ((c) iVar.invoke()).e(name);
                    kotlin.jvm.internal.n.c(zVarE2);
                    ll.c cVarI2 = a2.I(nfVar, zVarE2);
                    ll.a aVar2 = (ll.a) nfVar.f23782b;
                    kl.e eVarY1 = kl.e.Y0(eVar, cVarI2, zVarE2.c(), aVar2.f45494j.c(zVarE2), true);
                    pm.y yVarL2 = ((v9.e) nfVar.f23786f).L(zVarE2.f(), android.support.v4.media.session.a.I(2, false, null, 6));
                    cl.z zVarP2 = p();
                    il.o oVar2 = zk.n.f54978e;
                    xj.v vVar2 = xj.v.f53866a;
                    eVarY1.X0(null, zVarP2, vVar2, vVar2, vVar2, yVarL2, 3, oVar2, null);
                    eVarY1.D = 1;
                    aVar2.f45491g.getClass();
                    arrayList.add(eVarY1);
                }
            }
        }
        ((gm.a) ((ll.a) nfVar.f23782b).f45507x).b(nfVar, eVar, name, arrayList);
    }

    @Override // ml.a0
    public final c k() {
        return new a(this.f46222o, k.f46207f);
    }

    @Override // ml.a0
    public final void m(LinkedHashSet linkedHashSet, yl.f name) {
        kotlin.jvm.internal.n.f(name, "name");
        LinkedHashSet linkedHashSetK = K(name);
        ArrayList arrayList = il.g0.f43077a;
        int i10 = 0;
        if (!il.g0.f43086j.contains(name)) {
            int i11 = il.f.l;
            if (!il.f.b(name)) {
                if (!linkedHashSetK.isEmpty()) {
                    Iterator it = linkedHashSetK.iterator();
                    while (true) {
                        if (it.hasNext()) {
                            if (((zk.s) it.next()).isSuspend()) {
                            }
                        }
                    }
                }
                ArrayList arrayList2 = new ArrayList();
                for (Object obj : linkedHashSetK) {
                    if (N((q0) obj)) {
                        arrayList2.add(obj);
                    }
                }
                y(linkedHashSet, name, arrayList2, false);
                return;
            }
        }
        ym.i iVar = new ym.i();
        LinkedHashSet linkedHashSetD = go.c.D(name, linkedHashSetK, xj.v.f53866a, this.f46221n, lm.k.f45559a, ((qm.l) ((ll.a) this.f46151b.f23782b).f45504u).f49192d);
        int i12 = 1;
        z(name, linkedHashSet, linkedHashSetD, linkedHashSet, new l(i12, i10, this));
        z(name, linkedHashSet, linkedHashSetD, iVar, new l(i12, i12, this));
        ArrayList arrayList3 = new ArrayList();
        for (Object obj2 : linkedHashSetK) {
            if (N((q0) obj2)) {
                arrayList3.add(obj2);
            }
        }
        y(linkedHashSet, name, xj.n.B0(iVar, arrayList3), true);
    }

    /* JADX WARN: Type inference failed for: r7v3, types: [java.lang.Object, wj.d] */
    @Override // ml.a0
    public final void n(ArrayList arrayList, yl.f name) {
        LinkedHashSet linkedHashSet;
        Set setR0;
        fl.w wVar;
        kotlin.jvm.internal.n.f(name, "name");
        boolean zIsAnnotation = this.f46222o.f41001a.isAnnotation();
        nf nfVar = this.f46151b;
        if (zIsAnnotation && (wVar = (fl.w) xj.n.G0(((c) this.f46154e.invoke()).d(name))) != null) {
            kl.f fVarR0 = kl.f.R0(this.f46221n, a2.I(nfVar, wVar), r9.b.A(wVar.e()), false, wVar.c(), ((ll.a) nfVar.f23782b).f45494j.c(wVar), false);
            o0 o0VarF = bm.m.f(fVarR0, al.i.f3645a);
            fVarR0.N0(o0VarF, null, null, null);
            kotlin.jvm.internal.n.f(nfVar, "<this>");
            pm.y yVarL = a0.l(wVar, new nf((ll.a) nfVar.f23782b, new i3.f(nfVar, fVarR0, wVar, 0), (wj.d) nfVar.f23784d));
            cl.z zVarP = p();
            xj.v vVar = xj.v.f53866a;
            fVarR0.Q0(yVarL, vVar, zVarP, null, vVar);
            o0VarF.f6582m = yVarL;
            arrayList.add(fVarR0);
        }
        Set setL = L(name);
        if (setL.isEmpty()) {
            return;
        }
        ym.i iVar = new ym.i();
        AbstractCollection iVar2 = new ym.i();
        A(setL, arrayList, iVar, new m(this, 0));
        if (iVar.isEmpty()) {
            setR0 = xj.n.R0(setL);
        } else {
            if (iVar instanceof Set) {
                linkedHashSet = new LinkedHashSet();
                for (Object obj : setL) {
                    if (!iVar.contains(obj)) {
                        linkedHashSet.add(obj);
                    }
                }
            } else {
                linkedHashSet = new LinkedHashSet(setL);
                linkedHashSet.removeAll(iVar);
            }
            setR0 = linkedHashSet;
        }
        A(setR0, iVar2, null, new m(this, 1));
        LinkedHashSet linkedHashSetV0 = xj.g0.v0(iVar2, setL);
        ll.a aVar = (ll.a) nfVar.f23782b;
        arrayList.addAll(go.c.D(name, linkedHashSetV0, arrayList, this.f46221n, aVar.f45490f, ((qm.l) aVar.f45504u).f49192d));
    }

    @Override // ml.a0
    public final Set o(im.f kindFilter) {
        kotlin.jvm.internal.n.f(kindFilter, "kindFilter");
        if (this.f46222o.f41001a.isAnnotation()) {
            return b();
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet(((c) this.f46154e.invoke()).c());
        Collection collectionF = this.f46221n.n().f();
        kotlin.jvm.internal.n.e(collectionF, "ownerDescriptor.typeConstructor.supertypes");
        Iterator it = collectionF.iterator();
        while (it.hasNext()) {
            xj.t.a0(((pm.y) it.next()).A().g(), linkedHashSet);
        }
        return linkedHashSet;
    }

    @Override // ml.a0
    public final cl.z p() {
        zk.e eVar = this.f46221n;
        if (eVar != null) {
            int i10 = bm.e.f5728a;
            return eVar.y0();
        }
        bm.e.a(0);
        throw null;
    }

    @Override // ml.a0
    public final zk.j q() {
        return this.f46221n;
    }

    @Override // ml.a0
    public final boolean r(kl.e eVar) {
        if (this.f46222o.f41001a.isAnnotation()) {
            return false;
        }
        return N(eVar);
    }

    @Override // ml.a0
    public final x s(fl.w method, ArrayList arrayList, pm.y yVar, List list) {
        kotlin.jvm.internal.n.f(method, "method");
        ((ll.a) this.f46151b.f23782b).f45489e.getClass();
        if (this.f46221n != null) {
            List list2 = Collections.EMPTY_LIST;
            if (list2 != null) {
                return new x(yVar, list, arrayList, list2);
            }
            throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", "signatureErrors", "kotlin/reflect/jvm/internal/impl/load/java/components/SignaturePropagator$PropagatedSignature", "<init>"));
        }
        Object[] objArr = new Object[3];
        switch (1) {
            case 1:
                objArr[0] = "owner";
                break;
            case 2:
                objArr[0] = "returnType";
                break;
            case 3:
                objArr[0] = "valueParameters";
                break;
            case 4:
                objArr[0] = "typeParameters";
                break;
            case 5:
                objArr[0] = "descriptor";
                break;
            case 6:
                objArr[0] = "signatureErrors";
                break;
            default:
                objArr[0] = "method";
                break;
        }
        objArr[1] = "kotlin/reflect/jvm/internal/impl/load/java/components/SignaturePropagator$1";
        objArr[2] = "resolvePropagatedSignature";
        throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
    }

    @Override // ml.a0
    public final String toString() {
        return "Lazy Java member scope for " + this.f46222o.c();
    }

    public final void x(ArrayList arrayList, kl.b bVar, int i10, fl.w wVar, pm.y yVar, pm.y yVar2) {
        fl.e oVar;
        yl.f fVarC = wVar.c();
        if (yVar == null) {
            y0.a(2);
            throw null;
        }
        a1 a1VarG = y0.g(yVar, false);
        Object defaultValue = wVar.f41009a.getDefaultValue();
        if (defaultValue != null) {
            Class<?> cls = defaultValue.getClass();
            List list = fl.c.f40980a;
            if (Enum.class.isAssignableFrom(cls)) {
                oVar = new fl.s(null, (Enum) defaultValue);
            } else if (defaultValue instanceof Annotation) {
                oVar = new fl.f(null, (Annotation) defaultValue);
            } else if (defaultValue instanceof Object[]) {
                oVar = new fl.g(null, (Object[]) defaultValue);
            } else {
                oVar = defaultValue instanceof Class ? new fl.o(null, (Class) defaultValue) : new fl.u(null, defaultValue);
            }
        } else {
            oVar = null;
        }
        arrayList.add(new x0(bVar, null, i10, al.i.f3645a, fVarC, a1VarG, oVar != null, false, false, yVar2 != null ? y0.g(yVar2, false) : null, ((ll.a) this.f46151b.f23782b).f45494j.c(wVar)));
    }

    public final void y(LinkedHashSet linkedHashSet, yl.f fVar, ArrayList arrayList, boolean z10) {
        ll.a aVar = (ll.a) this.f46151b.f23782b;
        LinkedHashSet<q0> linkedHashSetD = go.c.D(fVar, arrayList, linkedHashSet, this.f46221n, aVar.f45490f, ((qm.l) aVar.f45504u).f49192d);
        if (!z10) {
            linkedHashSet.addAll(linkedHashSetD);
            return;
        }
        ArrayList arrayListB0 = xj.n.B0(linkedHashSetD, linkedHashSet);
        ArrayList arrayList2 = new ArrayList(xj.p.W(linkedHashSetD, 10));
        for (q0 q0VarC : linkedHashSetD) {
            q0 q0Var = (q0) i0.M(q0VarC);
            if (q0Var != null) {
                q0VarC = C(q0VarC, q0Var, arrayListB0);
            }
            arrayList2.add(q0VarC);
        }
        linkedHashSet.addAll(arrayList2);
    }

    /* JADX WARN: Code duplicated, block: B:16:0x0065  */
    /* JADX WARN: Multi-variable type inference failed */
    public final void z(yl.f fVar, LinkedHashSet linkedHashSet, LinkedHashSet linkedHashSet2, AbstractSet abstractSet, jk.b bVar) {
        q0 q0VarC;
        Object next;
        q0 q0Var;
        q0 q0VarC2;
        Iterator it = linkedHashSet2.iterator();
        while (it.hasNext()) {
            q0 q0Var2 = (q0) it.next();
            q0 q0Var3 = (q0) i0.L(q0Var2);
            q0 q0Var4 = null;
            if (q0Var3 != null) {
                String strK = i0.K(q0Var3);
                kotlin.jvm.internal.n.c(strK);
                Iterator it2 = ((Collection) bVar.invoke(yl.f.e(strK))).iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        q0VarC = null;
                        break;
                    }
                    zk.r rVarV0 = ((q0) it2.next()).v0();
                    rVarV0.d(fVar);
                    rVarV0.B();
                    rVarV0.s();
                    zk.s sVarBuild = rVarV0.build();
                    kotlin.jvm.internal.n.c(sVarBuild);
                    q0 q0Var5 = (q0) sVarBuild;
                    if (G(q0Var3, q0Var5)) {
                        q0VarC = C(q0Var5, q0Var3, linkedHashSet);
                        break;
                    }
                }
            } else {
                q0VarC = null;
                break;
            }
            ym.l.a(abstractSet, q0VarC);
            zk.s sVarA = il.f.a(q0Var2);
            if (sVarA == 0) {
                q0VarC2 = null;
            } else {
                yl.f name = ((cl.p) sVarA).getName();
                kotlin.jvm.internal.n.e(name, "overridden.name");
                Iterator it3 = ((Iterable) bVar.invoke(name)).iterator();
                do {
                    if (!it3.hasNext()) {
                        next = null;
                        break;
                    }
                    next = it3.next();
                } while (!M((q0) next, sVarA));
                q0 q0Var6 = (q0) next;
                if (q0Var6 != null) {
                    zk.r rVarV1 = q0Var6.v0();
                    List listB = sVarA.B();
                    kotlin.jvm.internal.n.e(listB, "overridden.valueParameters");
                    List list = listB;
                    ArrayList arrayList = new ArrayList(xj.p.W(list, 10));
                    Iterator it4 = list.iterator();
                    while (it4.hasNext()) {
                        arrayList.add(((x0) it4.next()).getType());
                    }
                    List listB2 = q0Var6.B();
                    kotlin.jvm.internal.n.e(listB2, "override.valueParameters");
                    rVarV1.c(com.bumptech.glide.d.r(arrayList, listB2, sVarA));
                    rVarV1.B();
                    rVarV1.s();
                    rVarV1.v();
                    q0Var = (q0) rVarV1.build();
                } else {
                    q0Var = null;
                }
                if (q0Var == null) {
                    q0VarC2 = null;
                } else {
                    if (!N(q0Var)) {
                        q0Var = null;
                    }
                    if (q0Var != null) {
                        q0VarC2 = C(q0Var, sVarA, linkedHashSet);
                    } else {
                        q0VarC2 = null;
                    }
                }
            }
            ym.l.a(abstractSet, q0VarC2);
            if (q0Var2.isSuspend()) {
                yl.f name2 = q0Var2.getName();
                kotlin.jvm.internal.n.e(name2, "descriptor.name");
                Iterator it5 = ((Iterable) bVar.invoke(name2)).iterator();
                while (it5.hasNext()) {
                    q0 q0VarD = D((q0) it5.next());
                    if (q0VarD == null || !F(q0VarD, q0Var2)) {
                        q0VarD = null;
                    }
                    if (q0VarD != null) {
                        q0Var4 = q0VarD;
                        break;
                    }
                }
            }
            ym.l.a(abstractSet, q0Var4);
        }
    }
}
