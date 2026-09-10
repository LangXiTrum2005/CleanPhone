package al;

import android.content.Context;
import android.view.View;
import cl.f0;
import cl.j0;
import cl.k0;
import cl.x0;
import com.facebook.appevents.iap.InAppPurchaseConstants;
import com.google.android.gms.internal.ads.hx0;
import com.google.android.gms.internal.measurement.nf;
import com.google.android.gms.internal.play_billing.q1;
import ea.f2;
import fl.a0;
import fl.c0;
import il.g0;
import java.io.File;
import java.lang.annotation.Annotation;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.WeakHashMap;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicInteger;
import m0.s0;
import m0.s1;
import nm.s;
import pm.a1;
import pm.n0;
import pm.p0;
import pm.q0;
import pm.x;
import pm.y;
import pm.y0;
import qk.i0;
import s0.e0;
import s0.l0;
import s0.o0;
import tl.d1;
import tl.w0;
import xj.v;
import zk.b0;
import zk.d0;
import zk.m0;
import zk.u;
import zk.w;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
public final class f extends kotlin.jvm.internal.o implements jk.b {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f3638e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Object f3639f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ f(Object obj, int i10) {
        super(1);
        this.f3638e = i10;
        this.f3639f = obj;
    }

    /* JADX WARN: Code duplicated, block: B:222:0x062d  */
    /* JADX WARN: Code duplicated, block: B:225:0x063b  */
    /* JADX WARN: Code duplicated, block: B:228:0x0640  */
    /* JADX WARN: Code duplicated, block: B:270:0x0708  */
    /* JADX WARN: Code duplicated, block: B:325:0x0887  */
    /* JADX WARN: Code duplicated, block: B:336:0x08c0  */
    /* JADX WARN: Code duplicated, block: B:373:0x0971  */
    /* JADX WARN: Code duplicated, block: B:435:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r0v55, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r0v97, types: [jk.b, kotlin.jvm.internal.o] */
    /* JADX WARN: Type inference failed for: r3v12, types: [java.lang.Object, wj.d] */
    @Override // jk.b
    public final Object invoke(Object it) {
        boolean z10;
        boolean z11;
        boolean zEquals;
        Object next;
        Object next2;
        b0 b0Var;
        com.google.android.gms.internal.consent_sdk.d dVarA;
        b0 b0Var2;
        yl.f fVarI;
        boolean z12;
        boolean z13;
        boolean zIsEmpty;
        q0 q0VarF;
        ql.a aVar;
        pm.r rVarG;
        pm.r rVarG2;
        x xVar = null;
        int i10 = 1;
        switch (this.f3638e) {
            case 0:
                w module = (w) it;
                kotlin.jvm.internal.n.f(module, "module");
                return module.d().h(((wk.h) this.f3639f).u());
            case 1:
                Map.Entry entry = (Map.Entry) it;
                kotlin.jvm.internal.n.f(entry, "entry");
                Collection collection = (Collection) this.f3639f;
                View view = (View) entry.getValue();
                WeakHashMap weakHashMap = s0.f45746a;
                return Boolean.valueOf(xj.n.i0(collection, view.getTransitionName()));
            case 2:
                ym.i iVar = (ym.i) this.f3639f;
                kotlin.jvm.internal.n.e(it, "it");
                iVar.add(it);
                return wj.r.f53297a;
            case 3:
                a1 type = (a1) it;
                kotlin.jvm.internal.n.e(type, "type");
                if (pm.c.j(type)) {
                    z10 = false;
                } else {
                    s sVar = (s) this.f3639f;
                    zk.g gVarE = type.P().e();
                    if (!(gVarE instanceof m0) || kotlin.jvm.internal.n.a(((m0) gVarE).e(), sVar)) {
                        z10 = false;
                    } else {
                        z10 = true;
                    }
                }
                return Boolean.valueOf(z10);
            case 4:
                yl.c fqName = (yl.c) it;
                kotlin.jvm.internal.n.f(fqName, "fqName");
                f0 f0Var = (f0) this.f3639f;
                k0 k0Var = f0Var.f6501f;
                om.l storageManager = f0Var.f6498c;
                ((j0) k0Var).getClass();
                kotlin.jvm.internal.n.f(storageManager, "storageManager");
                return new cl.b0(f0Var, fqName, storageManager);
            case 5:
                kotlin.jvm.internal.n.f((Context) it, "it");
                return new d4.b((Context) this.f3639f, 0);
            case 6:
                Throwable th2 = (Throwable) it;
                d5.j jVar = (d5.j) this.f3639f;
                if (th2 == null) {
                    if (!jVar.f38698a.isDone()) {
                        throw new IllegalArgumentException("Failed requirement.");
                    }
                } else if (th2 instanceof CancellationException) {
                    jVar.f38698a.cancel(true);
                } else {
                    o5.j jVar2 = jVar.f38698a;
                    Throwable cause = th2.getCause();
                    if (cause != null) {
                        th2 = cause;
                    }
                    jVar2.i(th2);
                }
                return wj.r.f53297a;
            case 7:
                w it2 = (w) it;
                kotlin.jvm.internal.n.f(it2, "it");
                return it2.d().q((wk.j) this.f3639f);
            case 8:
                kotlin.jvm.internal.n.f((w) it, "it");
                return (y) this.f3639f;
            case 9:
                Method method = (Method) it;
                fl.n nVar = (fl.n) this.f3639f;
                if (method.isSynthetic()) {
                    z11 = false;
                } else {
                    if (nVar.f41001a.isEnum()) {
                        String name = method.getName();
                        if (kotlin.jvm.internal.n.a(name, "values")) {
                            Class<?>[] parameterTypes = method.getParameterTypes();
                            kotlin.jvm.internal.n.e(parameterTypes, "method.parameterTypes");
                            if (parameterTypes.length == 0) {
                                zEquals = true;
                            } else {
                                zEquals = false;
                            }
                        } else if (kotlin.jvm.internal.n.a(name, "valueOf")) {
                            zEquals = Arrays.equals(method.getParameterTypes(), new Class[]{String.class});
                        } else {
                            zEquals = false;
                        }
                        if (zEquals) {
                            z11 = false;
                        }
                    }
                    z11 = true;
                }
                return Boolean.valueOf(z11);
            case 10:
                kotlin.jvm.internal.n.f((zk.c) it, "it");
                return Boolean.valueOf(g0.f43085i.containsKey(go.k.v((cl.q0) this.f3639f)));
            case 11:
                yl.c it3 = (yl.c) it;
                kotlin.jvm.internal.n.e(it3, "it");
                ?? r0 = ((f2) this.f3639f).f39409b;
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                for (Map.Entry entry2 : r0.entrySet()) {
                    yl.c packageName = (yl.c) entry2.getKey();
                    if (!it3.equals(packageName)) {
                        kotlin.jvm.internal.n.f(packageName, "packageName");
                        if (kotlin.jvm.internal.n.a(it3.d() ? null : it3.e(), packageName)) {
                        }
                    }
                    linkedHashMap.put(entry2.getKey(), entry2.getValue());
                }
                if (linkedHashMap.isEmpty()) {
                    linkedHashMap = null;
                }
                if (linkedHashMap == null) {
                    return null;
                }
                Iterator it4 = linkedHashMap.entrySet().iterator();
                if (it4.hasNext()) {
                    next = it4.next();
                    if (it4.hasNext()) {
                        int length = t9.e.y((yl.c) ((Map.Entry) next).getKey(), it3).b().length();
                        do {
                            Object next3 = it4.next();
                            int length2 = t9.e.y((yl.c) ((Map.Entry) next3).getKey(), it3).b().length();
                            if (length > length2) {
                                next = next3;
                                length = length2;
                            }
                        } while (it4.hasNext());
                    }
                } else {
                    next = null;
                }
                Map.Entry entry3 = (Map.Entry) next;
                if (entry3 != null) {
                    return entry3.getValue();
                }
                return null;
            case 12:
                fl.d annotation = (fl.d) it;
                kotlin.jvm.internal.n.f(annotation, "annotation");
                yl.f fVar = jl.c.f43969a;
                ll.c cVar = (ll.c) this.f3639f;
                return jl.c.b(cVar.f45510a, annotation, cVar.f45512c);
            case 13:
                fl.b0 typeParameter = (fl.b0) it;
                kotlin.jvm.internal.n.f(typeParameter, "typeParameter");
                i3.f fVar2 = (i3.f) this.f3639f;
                Integer num = (Integer) ((LinkedHashMap) fVar2.f42855e).get(typeParameter);
                if (num == null) {
                    return null;
                }
                int iIntValue = num.intValue();
                nf nfVar = (nf) fVar2.f42853c;
                zk.k kVar = (zk.k) fVar2.f42854d;
                kotlin.jvm.internal.n.f(nfVar, "<this>");
                return new ml.g0(android.support.v4.media.session.a.j(new nf((ll.a) nfVar.f23782b, fVar2, (wj.d) nfVar.f23784d), kVar.getAnnotations()), typeParameter, fVar2.f42852b + iIntValue, kVar);
            case 14:
                yl.c fqName2 = (yl.c) it;
                kotlin.jvm.internal.n.f(fqName2, "fqName");
                yk.m mVar = (yk.m) this.f3639f;
                mm.c cVarC = mVar.c(fqName2);
                if (cVarC == null) {
                    return null;
                }
                lm.i iVar2 = mVar.f54491c;
                if (iVar2 != null) {
                    cVarC.K0(iVar2);
                    return cVarC;
                }
                kotlin.jvm.internal.n.l("components");
                throw null;
            case 15:
                lm.f key = (lm.f) it;
                kotlin.jvm.internal.n.f(key, "key");
                lm.g gVar = (lm.g) this.f3639f;
                yl.b bVar = key.f45531a;
                lm.i iVar3 = gVar.f45534a;
                Iterator it5 = iVar3.f45547k.iterator();
                while (it5.hasNext()) {
                    zk.e eVarB = ((bl.c) it5.next()).b(bVar);
                    if (eVarB != null) {
                        return eVarB;
                    }
                }
                if (lm.g.f45533c.contains(bVar)) {
                    return null;
                }
                lm.d dVarJ = key.f45532b;
                if (dVarJ == null && (dVarJ = iVar3.f45540d.j(bVar)) == null) {
                    return null;
                }
                vl.f fVar3 = dVarJ.f45527a;
                tl.j jVar3 = dVarJ.f45528b;
                vl.a aVar2 = dVarJ.f45529c;
                zk.j0 j0Var = dVarJ.f45530d;
                yl.b bVarF = bVar.f();
                if (bVarF != null) {
                    zk.e eVarA = gVar.a(bVarF, null);
                    nm.h hVar = eVarA instanceof nm.h ? (nm.h) eVarA : null;
                    if (hVar == null) {
                        return null;
                    }
                    yl.f fVarI2 = bVar.i();
                    kotlin.jvm.internal.n.e(fVarI2, "classId.shortClassName");
                    if (!hVar.M().m().contains(fVarI2)) {
                        return null;
                    }
                    dVarA = hVar.l;
                } else {
                    d0 d0Var = iVar3.f45542f;
                    yl.c cVarG = bVar.g();
                    kotlin.jvm.internal.n.e(cVarG, "classId.packageFqName");
                    Iterator it6 = u.i(d0Var, cVarG).iterator();
                    do {
                        if (it6.hasNext()) {
                            next2 = it6.next();
                            b0Var2 = (b0) next2;
                            if (b0Var2 instanceof mm.c) {
                                fVarI = bVar.i();
                                kotlin.jvm.internal.n.e(fVarI, "classId.shortClassName");
                            }
                        } else {
                            next2 = null;
                        }
                        b0Var = (b0) next2;
                        if (b0Var == null) {
                            return null;
                        }
                        w0 w0Var = jVar3.E;
                        kotlin.jvm.internal.n.e(w0Var, "classProto.typeTable");
                        l3.i iVar4 = new l3.i(w0Var);
                        vl.g gVar2 = vl.g.f52655b;
                        d1 d1Var = jVar3.G;
                        kotlin.jvm.internal.n.e(d1Var, "classProto.versionRequirementTable");
                        dVarA = iVar3.a(b0Var, fVar3, iVar4, q1.h(d1Var), aVar2, null);
                    } while (!((nm.o) ((mm.c) b0Var2).A()).m().contains(fVarI));
                    b0Var = (b0) next2;
                    if (b0Var == null) {
                        return null;
                    }
                    w0 w0Var2 = jVar3.E;
                    kotlin.jvm.internal.n.e(w0Var2, "classProto.typeTable");
                    l3.i iVar5 = new l3.i(w0Var2);
                    vl.g gVar3 = vl.g.f52655b;
                    d1 d1Var2 = jVar3.G;
                    kotlin.jvm.internal.n.e(d1Var2, "classProto.versionRequirementTable");
                    dVarA = iVar3.a(b0Var, fVar3, iVar5, q1.h(d1Var2), aVar2, null);
                }
                return new nm.h(dVarA, jVar3, fVar3, aVar2, j0Var);
            case 16:
                fl.w m7 = (fl.w) it;
                kotlin.jvm.internal.n.f(m7, "m");
                if (((Boolean) ((ml.a) this.f3639f).f46145b.invoke(m7)).booleanValue()) {
                    Class<?> declaringClass = ((Method) m7.b()).getDeclaringClass();
                    kotlin.jvm.internal.n.e(declaringClass, "member.declaringClass");
                    if (declaringClass.isInterface()) {
                        String strB = m7.c().b();
                        int iHashCode = strB.hashCode();
                        if (iHashCode != -1776922004) {
                            if (iHashCode != -1295482945) {
                                if (iHashCode == 147696667 && strB.equals("hashCode")) {
                                    zIsEmpty = ((ArrayList) m7.g()).isEmpty();
                                }
                            } else if (strB.equals("equals")) {
                                c0 c0Var = (c0) xj.n.H0(m7.g());
                                a0 a0Var = c0Var != null ? c0Var.f40984a : null;
                                fl.p pVar = a0Var instanceof fl.p ? (fl.p) a0Var : null;
                                if (pVar != null) {
                                    fl.r rVar = pVar.f41004b;
                                    if ((rVar instanceof fl.n) && ((fl.n) rVar).c().b().equals("java.lang.Object")) {
                                        zIsEmpty = true;
                                    }
                                }
                            }
                            zIsEmpty = false;
                        } else if (strB.equals(InAppPurchaseConstants.METHOD_TO_STRING)) {
                            zIsEmpty = ((ArrayList) m7.g()).isEmpty();
                        } else {
                            zIsEmpty = false;
                        }
                        if (zIsEmpty) {
                            z13 = true;
                        } else {
                            z13 = false;
                        }
                    } else {
                        z13 = false;
                    }
                    if (z13) {
                        z12 = false;
                    } else {
                        z12 = true;
                    }
                } else {
                    z12 = false;
                }
                return Boolean.valueOf(z12);
            case 17:
                kotlin.jvm.internal.n.f((qm.f) it, "it");
                ml.j jVar4 = (ml.j) this.f3639f;
                return new ml.p(jVar4.f46195j, jVar4, jVar4.f46193h, jVar4.f46194i != null, jVar4.f46201q);
            case 18:
                kotlin.jvm.internal.n.f((qm.f) it, "kotlinTypeRefiner");
                zk.e eVar = (zk.e) this.f3639f;
                if (eVar == null) {
                    eVar = null;
                }
                if (eVar != null) {
                    fm.e.f(eVar);
                }
                return null;
            case 19:
                pm.g supertypes = (pm.g) it;
                kotlin.jvm.internal.n.f(supertypes, "supertypes");
                pm.h hVar2 = (pm.h) this.f3639f;
                zk.k0 k0VarH = hVar2.h();
                List superTypes = supertypes.f48431a;
                k0VarH.getClass();
                kotlin.jvm.internal.n.f(superTypes, "superTypes");
                if (superTypes.isEmpty()) {
                    y yVarC = hVar2.c();
                    List listC = yVarC != null ? j1.f.C(yVarC) : null;
                    if (listC == null) {
                        listC = v.f53866a;
                    }
                    superTypes = listC;
                }
                List listN0 = superTypes instanceof List ? (List) superTypes : null;
                if (listN0 == null) {
                    listN0 = xj.n.N0(superTypes);
                }
                List listK = hVar2.k(listN0);
                kotlin.jvm.internal.n.f(listK, "<set-?>");
                supertypes.f48432b = listK;
                return wj.r.f53297a;
            case 20:
                qm.f kotlinTypeRefiner = (qm.f) it;
                kotlin.jvm.internal.n.f(kotlinTypeRefiner, "kotlinTypeRefiner");
                x xVar2 = (x) this.f3639f;
                LinkedHashSet linkedHashSet = xVar2.f48485b;
                ArrayList arrayList = new ArrayList(xj.p.W(linkedHashSet, 10));
                Iterator it7 = linkedHashSet.iterator();
                boolean z14 = false;
                while (it7.hasNext()) {
                    arrayList.add(((y) it7.next()).j0(kotlinTypeRefiner));
                    z14 = true;
                }
                if (z14) {
                    y yVar = xVar2.f48484a;
                    y yVarU = yVar != null ? yVar.j0(kotlinTypeRefiner) : null;
                    arrayList.isEmpty();
                    LinkedHashSet linkedHashSet2 = new LinkedHashSet(arrayList);
                    linkedHashSet2.hashCode();
                    x xVar3 = new x(linkedHashSet2);
                    xVar3.f48484a = yVarU;
                    xVar = xVar3;
                }
                if (xVar != null) {
                    xVar2 = xVar;
                }
                return xVar2.b();
            case 21:
                y it8 = (y) it;
                jk.b bVar2 = (jk.b) this.f3639f;
                kotlin.jvm.internal.n.e(it8, "it");
                return bVar2.invoke(it8).toString();
            case 22:
                p0 p0Var = (p0) it;
                m5.k kVar2 = (m5.k) this.f3639f;
                m0 m0Var = p0Var.f48466a;
                nl.a aVar3 = p0Var.f48467b;
                Set set = aVar3.f46791e;
                if (set != null && set.contains(m0Var.a())) {
                    return kVar2.s(aVar3);
                }
                pm.c0 c0VarG = m0Var.g();
                kotlin.jvm.internal.n.e(c0VarG, "typeParameter.defaultType");
                LinkedHashSet<m0> linkedHashSet3 = new LinkedHashSet();
                i0.E(c0VarG, c0VarG, linkedHashSet3, set);
                int iO = xj.b0.O(xj.p.W(linkedHashSet3, 10));
                if (iO < 16) {
                    iO = 16;
                }
                LinkedHashMap linkedHashMap2 = new LinkedHashMap(iO);
                for (m0 m0Var2 : linkedHashSet3) {
                    if (set == null || !set.contains(m0Var2)) {
                        Set set2 = aVar3.f46791e;
                        q0VarF = ne.a.f(m0Var2, aVar3, kVar2, kVar2.t(m0Var2, nl.a.a(aVar3, 0, false, set2 != null ? xj.g0.w0(set2, m0Var) : i0.k0(m0Var), null, 47)));
                    } else {
                        q0VarF = y0.k(m0Var2, aVar3);
                    }
                    linkedHashMap2.put(m0Var2.n(), q0VarF);
                }
                pm.w0 w0Var3 = new pm.w0(new pm.i0(linkedHashMap2, i10));
                List upperBounds = m0Var.getUpperBounds();
                kotlin.jvm.internal.n.e(upperBounds, "typeParameter.upperBounds");
                yj.k kVarH = kVar2.H(w0Var3, upperBounds, aVar3);
                if (kVarH.f54441a.isEmpty()) {
                    return kVar2.s(aVar3);
                }
                if (kVarH.f54441a.f54430i == 1) {
                    return (y) xj.n.E0(kVarH);
                }
                throw new IllegalArgumentException("Should only be one computed upper bound if no need to intersect all bounds");
            case 23:
                ql.a it9 = (ql.a) it;
                kotlin.jvm.internal.n.f(it9, "it");
                il.v vVar = it9.f49131b;
                sm.c cVar2 = it9.f49130a;
                hx0 hx0Var = (hx0) this.f3639f;
                if (hx0Var.f15419c) {
                    if (((cVar2 == null || (rVarG2 = qm.g.g(cVar2)) == null || !(rVarG2 instanceof nl.f)) ? null : (nl.f) rVarG2) != null) {
                        return null;
                    }
                }
                if (cVar2 == null) {
                    return null;
                }
                pm.c0 c0VarH = qm.g.h(cVar2);
                if (c0VarH == null && ((rVarG = qm.g.g(cVar2)) == null || (c0VarH = qm.g.N(rVarG)) == null)) {
                    c0VarH = qm.g.h(cVar2);
                    kotlin.jvm.internal.n.c(c0VarH);
                }
                n0 n0VarW = qm.g.W(c0VarH);
                if (n0VarW == null) {
                    return null;
                }
                List parameters = n0VarW.getParameters();
                kotlin.jvm.internal.n.e(parameters, "this.parameters");
                List list = parameters;
                if (!(cVar2 instanceof y)) {
                    StringBuilder sb2 = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
                    sb2.append(cVar2);
                    sb2.append(", ");
                    throw new IllegalArgumentException(q4.a.k(kotlin.jvm.internal.d0.f44761a, cVar2.getClass(), sb2).toString());
                }
                List listT = ((y) cVar2).t();
                Iterator it10 = list.iterator();
                Iterator it11 = listT.iterator();
                ArrayList arrayList2 = new ArrayList(Math.min(xj.p.W(list, 10), xj.p.W(listT, 10)));
                while (it10.hasNext() && it11.hasNext()) {
                    Object next4 = it10.next();
                    q0 q0Var = (q0) it11.next();
                    m0 m0Var3 = (m0) next4;
                    if (qm.g.K(q0Var)) {
                        aVar = new ql.a(null, vVar, m0Var3);
                    } else {
                        a1 a1VarR = qm.g.r(q0Var);
                        aVar = new ql.a(a1VarR, ((ll.a) ((nf) hx0Var.f15421e).f23782b).f45500q.b(vVar, a1VarR.getAnnotations()), m0Var3);
                    }
                    arrayList2.add(aVar);
                }
                return arrayList2;
            case 24:
                zk.c it12 = (zk.c) it;
                kotlin.jvm.internal.n.f(it12, "it");
                y type2 = ((x0) it12.B().get(((x0) this.f3639f).f6631f)).getType();
                kotlin.jvm.internal.n.e(type2, "it.valueParameters[p.index].type");
                return type2;
            case 25:
                el.b kotlinClass = (el.b) it;
                kotlin.jvm.internal.n.f(kotlinClass, "kotlinClass");
                com.google.android.gms.internal.consent_sdk.x xVar4 = (com.google.android.gms.internal.consent_sdk.x) this.f3639f;
                HashMap map = new HashMap();
                HashMap map2 = new HashMap();
                HashMap map3 = new HashMap();
                s1 s1Var = new s1(xVar4, map, map2);
                Class klass = kotlinClass.f40112a;
                kotlin.jvm.internal.n.f(klass, "klass");
                Method[] declaredMethods = klass.getDeclaredMethods();
                kotlin.jvm.internal.n.e(declaredMethods, "klass.declaredMethods");
                int length3 = declaredMethods.length;
                int i11 = 0;
                while (i11 < length3) {
                    Method method2 = declaredMethods[i11];
                    yl.f fVarE = yl.f.e(method2.getName());
                    Class cls = klass;
                    StringBuilder sb3 = new StringBuilder("(");
                    Class<?>[] parameterTypes2 = method2.getParameterTypes();
                    kotlin.jvm.internal.n.e(parameterTypes2, "method.parameterTypes");
                    Method[] methodArr = declaredMethods;
                    int length4 = parameterTypes2.length;
                    int i12 = length3;
                    int i13 = 0;
                    while (i13 < length4) {
                        int i14 = length4;
                        Class<?> parameterType = parameterTypes2[i13];
                        kotlin.jvm.internal.n.e(parameterType, "parameterType");
                        sb3.append(fl.c.b(parameterType));
                        i13++;
                        length4 = i14;
                    }
                    sb3.append(")");
                    Class<?> returnType = method2.getReturnType();
                    kotlin.jvm.internal.n.e(returnType, "method.returnType");
                    sb3.append(fl.c.b(returnType));
                    String string = sb3.toString();
                    kotlin.jvm.internal.n.e(string, "sb.toString()");
                    zc.u uVarT = s1Var.t(fVarE, string);
                    Annotation[] declaredAnnotations = method2.getDeclaredAnnotations();
                    kotlin.jvm.internal.n.e(declaredAnnotations, "method.declaredAnnotations");
                    for (Annotation annotation2 : declaredAnnotations) {
                        kotlin.jvm.internal.n.e(annotation2, "annotation");
                        j1.f.F(uVarT, annotation2);
                    }
                    Annotation[][] parameterAnnotations = method2.getParameterAnnotations();
                    kotlin.jvm.internal.n.e(parameterAnnotations, "method.parameterAnnotations");
                    Annotation[][] annotationArr = parameterAnnotations;
                    int length5 = annotationArr.length;
                    for (int i15 = 0; i15 < length5; i15++) {
                        Annotation[] annotations = annotationArr[i15];
                        kotlin.jvm.internal.n.e(annotations, "annotations");
                        int length6 = annotations.length;
                        int i16 = 0;
                        while (i16 < length6) {
                            Annotation annotation3 = annotations[i16];
                            Annotation[][] annotationArr2 = annotationArr;
                            Class clsP = d0.c.p(d0.c.l(annotation3));
                            int i17 = length5;
                            int i18 = i11;
                            fc.f fVarI3 = uVarT.I(i15, fl.c.a(clsP), new el.a(annotation3));
                            if (fVarI3 != null) {
                                j1.f.G(fVarI3, annotation3, clsP);
                            }
                            i16++;
                            length5 = i17;
                            annotationArr = annotationArr2;
                            i11 = i18;
                        }
                    }
                    uVarT.k();
                    i11++;
                    declaredMethods = methodArr;
                    length3 = i12;
                    klass = cls;
                }
                Class cls2 = klass;
                Constructor<?>[] declaredConstructors = cls2.getDeclaredConstructors();
                kotlin.jvm.internal.n.e(declaredConstructors, "klass.declaredConstructors");
                int length7 = declaredConstructors.length;
                int i19 = 0;
                while (i19 < length7) {
                    Constructor<?> constructor = declaredConstructors[i19];
                    yl.f fVar4 = yl.h.f54521e;
                    kotlin.jvm.internal.n.e(constructor, "constructor");
                    StringBuilder sb4 = new StringBuilder("(");
                    Class<?>[] parameterTypes3 = constructor.getParameterTypes();
                    Constructor<?>[] constructorArr = declaredConstructors;
                    kotlin.jvm.internal.n.e(parameterTypes3, "constructor.parameterTypes");
                    int length8 = parameterTypes3.length;
                    int i20 = length7;
                    int i21 = 0;
                    while (i21 < length8) {
                        int i22 = length8;
                        Class<?> parameterType2 = parameterTypes3[i21];
                        kotlin.jvm.internal.n.e(parameterType2, "parameterType");
                        sb4.append(fl.c.b(parameterType2));
                        i21++;
                        length8 = i22;
                    }
                    sb4.append(")V");
                    String string2 = sb4.toString();
                    kotlin.jvm.internal.n.e(string2, "sb.toString()");
                    zc.u uVarT2 = s1Var.t(fVar4, string2);
                    Annotation[] declaredAnnotations2 = constructor.getDeclaredAnnotations();
                    kotlin.jvm.internal.n.e(declaredAnnotations2, "constructor.declaredAnnotations");
                    for (Annotation annotation4 : declaredAnnotations2) {
                        kotlin.jvm.internal.n.e(annotation4, "annotation");
                        j1.f.F(uVarT2, annotation4);
                    }
                    Annotation[][] parameterAnnotations2 = constructor.getParameterAnnotations();
                    kotlin.jvm.internal.n.e(parameterAnnotations2, "parameterAnnotations");
                    if (parameterAnnotations2.length != 0) {
                        int length9 = constructor.getParameterTypes().length - parameterAnnotations2.length;
                        int length10 = parameterAnnotations2.length;
                        int i23 = 0;
                        while (i23 < length10) {
                            Annotation[] annotations2 = parameterAnnotations2[i23];
                            kotlin.jvm.internal.n.e(annotations2, "annotations");
                            Annotation[][] annotationArr3 = parameterAnnotations2;
                            int length11 = annotations2.length;
                            int i24 = i19;
                            int i25 = 0;
                            while (i25 < length11) {
                                int i26 = length11;
                                Annotation annotation5 = annotations2[i25];
                                int i27 = i25;
                                Class clsP2 = d0.c.p(d0.c.l(annotation5));
                                int i28 = length9;
                                int i29 = length10;
                                int i30 = i23;
                                fc.f fVarI4 = uVarT2.I(i23 + i28, fl.c.a(clsP2), new el.a(annotation5));
                                if (fVarI4 != null) {
                                    j1.f.G(fVarI4, annotation5, clsP2);
                                }
                                i25 = i27 + 1;
                                length11 = i26;
                                length9 = i28;
                                length10 = i29;
                                i23 = i30;
                            }
                            i23++;
                            parameterAnnotations2 = annotationArr3;
                            i19 = i24;
                        }
                    }
                    int i31 = i19;
                    uVarT2.k();
                    i19 = i31 + 1;
                    declaredConstructors = constructorArr;
                    length7 = i20;
                }
                Field[] declaredFields = cls2.getDeclaredFields();
                kotlin.jvm.internal.n.e(declaredFields, "klass.declaredFields");
                int length12 = declaredFields.length;
                int i32 = 0;
                while (i32 < length12) {
                    Field field = declaredFields[i32];
                    yl.f fVarE2 = yl.f.e(field.getName());
                    Class<?> type3 = field.getType();
                    kotlin.jvm.internal.n.e(type3, "field.type");
                    String desc = fl.c.b(type3);
                    kotlin.jvm.internal.n.f(desc, "desc");
                    String strB2 = fVarE2.b();
                    kotlin.jvm.internal.n.e(strB2, "name.asString()");
                    rl.o oVar = new rl.o(strB2 + '#' + desc);
                    ArrayList arrayList3 = new ArrayList();
                    Annotation[] declaredAnnotations3 = field.getDeclaredAnnotations();
                    kotlin.jvm.internal.n.e(declaredAnnotations3, "field.declaredAnnotations");
                    int length13 = declaredAnnotations3.length;
                    int i33 = 0;
                    while (i33 < length13) {
                        Annotation annotation6 = declaredAnnotations3[i33];
                        kotlin.jvm.internal.n.e(annotation6, "annotation");
                        Class clsP3 = d0.c.p(d0.c.l(annotation6));
                        Field[] fieldArr = declaredFields;
                        int i34 = length12;
                        fc.f fVarQ = ((com.google.android.gms.internal.consent_sdk.x) s1Var.f45751b).q(fl.c.a(clsP3), new el.a(annotation6), arrayList3);
                        if (fVarQ != null) {
                            j1.f.G(fVarQ, annotation6, clsP3);
                        }
                        i33++;
                        declaredFields = fieldArr;
                        length12 = i34;
                    }
                    Field[] fieldArr2 = declaredFields;
                    int i35 = length12;
                    if (!arrayList3.isEmpty()) {
                        ((HashMap) s1Var.f45752c).put(oVar, arrayList3);
                    }
                    i32++;
                    declaredFields = fieldArr2;
                    length12 = i35;
                }
                return new rl.a(map, map2, map3);
            case DIAGNOSTIC_EVENT_TYPE_NATIVE_LOAD_STARTED_AD_VIEWER_VALUE:
                Throwable th3 = (Throwable) it;
                e0 e0Var = (e0) this.f3639f;
                if (th3 != null) {
                    e0Var.f49789h.y(new o0(th3));
                }
                if (e0Var.f49791j.f53291b != wj.o.f53296a) {
                    ((l0) e0Var.f49791j.getValue()).close();
                }
                return wj.r.f53297a;
            case 27:
                File it13 = (File) it;
                kotlin.jvm.internal.n.f(it13, "it");
                return new s0.w0(((hn.d) this.f3639f).f42424a, it13);
            default:
                kotlin.jvm.internal.n.f((String) it, "it");
                return Integer.valueOf(((AtomicInteger) ((s1) this.f3639f).f45752c).getAndIncrement());
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(zk.e eVar, nl.d dVar, pm.c0 c0Var, nl.a aVar) {
        super(1);
        this.f3638e = 18;
        this.f3639f = eVar;
    }
}
