package al;

import androidx.lifecycle.d1;
import androidx.lifecycle.r0;
import cl.w0;
import cn.p0;
import il.c0;
import il.w;
import java.io.File;
import java.lang.reflect.Field;
import java.math.BigInteger;
import java.security.cert.Certificate;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.d0;
import kotlin.jvm.internal.v;
import pm.q0;
import pm.t0;
import pm.y;
import s0.i0;
import tk.f0;
import tk.j0;
import tk.k0;
import tk.k1;
import tk.l1;
import tk.n1;
import xj.b0;
import xj.g0;
import xj.t;
import zc.u;
import zk.h0;
import zk.s;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
public final class l extends kotlin.jvm.internal.o implements jk.a {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f3648e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Object f3649f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ l(Object obj, int i10) {
        super(0);
        this.f3648e = i10;
        this.f3649f = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v10, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r11v6, types: [xj.v] */
    /* JADX WARN: Type inference failed for: r11v7 */
    /* JADX WARN: Type inference failed for: r14v0, types: [java.lang.StringBuilder] */
    /* JADX WARN: Type inference failed for: r15v1, types: [java.lang.Object, java.lang.String] */
    /* JADX WARN: Type inference failed for: r15v2, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r15v6 */
    /* JADX WARN: Type inference failed for: r15v7 */
    /* JADX WARN: Type inference failed for: r1v20, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r2v0 */
    /* JADX WARN: Type inference failed for: r2v1, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r2v3 */
    @Override // jk.a
    public final Object invoke() throws IllegalAccessException {
        ?? r15;
        ?? arrayList;
        Map mapP;
        q qVar;
        dm.b bVarA;
        ?? r2 = 0;
        switch (this.f3648e) {
            case 0:
                m mVar = (m) this.f3649f;
                return mVar.f3650a.i(mVar.f3651b).g();
            case 1:
                am.k kVar = ((am.h) this.f3649f).f3709a;
                am.k kVar2 = new am.k();
                Field[] declaredFields = am.k.class.getDeclaredFields();
                kotlin.jvm.internal.n.e(declaredFields, "this::class.java.declaredFields");
                int length = declaredFields.length;
                int i10 = 0;
                while (i10 < length) {
                    Field field = declaredFields[i10];
                    if ((field.getModifiers() & 8) == 0) {
                        field.setAccessible(true);
                        Object obj = field.get(kVar);
                        wf.a aVar = obj instanceof wf.a ? (wf.a) obj : null;
                        if (aVar != null) {
                            String name = field.getName();
                            kotlin.jvm.internal.n.e(name, "field.name");
                            an.p.p0(name, "is", r2);
                            qk.d dVarB = d0.f44761a.b(am.k.class);
                            String name2 = field.getName();
                            ?? sb2 = new StringBuilder("get");
                            ?? name3 = field.getName();
                            kotlin.jvm.internal.n.e(name3, "field.name");
                            if (name3.length() > 0) {
                                r15 = name3;
                                char upperCase = Character.toUpperCase(name3.charAt(r2));
                                String strSubstring = name3.substring(1);
                                kotlin.jvm.internal.n.e(strSubstring, "this as java.lang.String).substring(startIndex)");
                                r15 = upperCase + strSubstring;
                            }
                            r15 = name3;
                            sb2.append(r15);
                            new v(dVarB, name2, sb2.toString());
                            field.set(kVar2, new wf.a(aVar.f53175a, kVar2));
                        }
                    }
                    i10++;
                    r2 = 0;
                }
                kVar2.k(g0.v0(xj.o.Q(wk.l.f53352p, wk.l.f53353q), kVar2.f()));
                kVar2.f3728a = true;
                return new am.h(kVar2);
            case 2:
                return r0.f((d1) this.f3649f);
            case 3:
                xn.k kVar3 = ((bo.k) this.f3649f).f5804e;
                kotlin.jvm.internal.n.c(kVar3);
                List<Certificate> listA = kVar3.a();
                ArrayList arrayList2 = new ArrayList(xj.p.W(listA, 10));
                for (Certificate certificate : listA) {
                    kotlin.jvm.internal.n.d(certificate, "null cannot be cast to non-null type java.security.cert.X509Certificate");
                    arrayList2.add((X509Certificate) certificate);
                }
                return arrayList2;
            case 4:
                return (List) ((w0) this.f3649f).l.getValue();
            case 5:
                y yVarB = ((q0) this.f3649f).b();
                kotlin.jvm.internal.n.e(yVarB, "this@createCapturedIfNeeded.type");
                return yVarB;
            case 6:
                w wVar = (w) this.f3649f;
                yj.c cVarM = j1.f.m();
                cVarM.add(wVar.f43114a.f43057a);
                c0 c0Var = wVar.f43115b;
                if (c0Var != null) {
                    cVarM.add("under-migration:".concat(c0Var.f43057a));
                }
                for (Map.Entry entry : wVar.f43116c.entrySet()) {
                    cVarM.add("@" + entry.getKey() + ':' + ((c0) entry.getValue()).f43057a);
                }
                return (String[]) j1.f.d(cVarM).toArray(new String[0]);
            case 7:
                im.h hVar = (im.h) this.f3649f;
                List listH = hVar.h();
                List list = listH;
                ArrayList arrayList3 = new ArrayList(3);
                cl.c cVar = hVar.f43179b;
                Collection collectionF = cVar.n().f();
                kotlin.jvm.internal.n.e(collectionF, "containingClass.typeConstructor.supertypes");
                ArrayList arrayList4 = new ArrayList();
                Iterator it = collectionF.iterator();
                while (it.hasNext()) {
                    t.a0(a.a.r(((y) it.next()).A(), null, 3), arrayList4);
                }
                ArrayList arrayList5 = new ArrayList();
                for (Object obj2 : arrayList4) {
                    if (obj2 instanceof zk.c) {
                        arrayList5.add(obj2);
                    }
                }
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                for (Object obj3 : arrayList5) {
                    yl.f name4 = ((zk.c) obj3).getName();
                    Object arrayList6 = linkedHashMap.get(name4);
                    if (arrayList6 == null) {
                        arrayList6 = new ArrayList();
                        linkedHashMap.put(name4, arrayList6);
                    }
                    ((List) arrayList6).add(obj3);
                }
                for (Map.Entry entry2 : linkedHashMap.entrySet()) {
                    yl.f fVar = (yl.f) entry2.getKey();
                    List list2 = (List) entry2.getValue();
                    LinkedHashMap linkedHashMap2 = new LinkedHashMap();
                    for (Object obj4 : list2) {
                        Boolean boolValueOf = Boolean.valueOf(((zk.c) obj4) instanceof s);
                        Object arrayList7 = linkedHashMap2.get(boolValueOf);
                        if (arrayList7 == null) {
                            arrayList7 = new ArrayList();
                            linkedHashMap2.put(boolValueOf, arrayList7);
                        }
                        ((List) arrayList7).add(obj4);
                    }
                    for (Map.Entry entry3 : linkedHashMap2.entrySet()) {
                        boolean zBooleanValue = ((Boolean) entry3.getKey()).booleanValue();
                        List list3 = (List) entry3.getValue();
                        bm.l lVar = bm.l.f5737c;
                        List list4 = list3;
                        if (zBooleanValue) {
                            arrayList = new ArrayList();
                            for (Object obj5 : listH) {
                                if (kotlin.jvm.internal.n.a(((cl.p) ((s) obj5)).getName(), fVar)) {
                                    arrayList.add(obj5);
                                }
                            }
                        } else {
                            arrayList = xj.v.f53866a;
                        }
                        lVar.h(fVar, list4, (Collection) arrayList, cVar, new im.g(arrayList3, hVar));
                    }
                }
                return xj.n.B0(ym.l.d(arrayList3), list);
            case 8:
                im.n nVar = (im.n) ((jk.a) this.f3649f).invoke();
                return nVar instanceof im.j ? ((im.j) nVar).h() : nVar;
            case 9:
                im.s sVar = (im.s) this.f3649f;
                return sVar.h(a.a.r(sVar.f43198b, null, 3));
            case 10:
                t0 t0VarF = ((pm.w0) this.f3649f).f();
                t0VarF.getClass();
                return new pm.w0(t0VarF);
            case 11:
                Object obj6 = jl.e.f43974a;
                pl.a aVar2 = ((jl.i) this.f3649f).f43968d;
                fl.s sVar2 = aVar2 instanceof fl.s ? (fl.s) aVar2 : null;
                dm.i iVar = (sVar2 == null || (qVar = (q) jl.e.f43975b.get(yl.f.e(sVar2.f41006b.name()).b())) == null) ? null : new dm.i(yl.b.j(wk.l.f53358v), yl.f.e(qVar.name()));
                mapP = iVar != null ? b0.P(new wj.f(jl.c.f43971c, iVar)) : null;
                return mapP == null ? xj.w.f53867a : mapP;
            case 12:
                pl.a aVar3 = ((jl.j) this.f3649f).f43968d;
                if (aVar3 instanceof fl.g) {
                    Object obj7 = jl.e.f43974a;
                    bVarA = jl.e.a(((fl.g) aVar3).a());
                } else if (aVar3 instanceof fl.s) {
                    Object obj8 = jl.e.f43974a;
                    bVarA = jl.e.a(j1.f.C(aVar3));
                } else {
                    bVarA = null;
                }
                mapP = bVarA != null ? b0.P(new wj.f(jl.c.f43970b, bVarA)) : null;
                return mapP == null ? xj.w.f53867a : mapP;
            case 13:
                Set setKeySet = ((LinkedHashMap) ((mm.c) this.f3649f).f46258i.f54882e).keySet();
                ArrayList arrayList8 = new ArrayList();
                for (Object obj9 : setKeySet) {
                    yl.b bVar = (yl.b) obj9;
                    if (bVar.f54502b.e().d() && !lm.g.f45533c.contains(bVar)) {
                        arrayList8.add(obj9);
                    }
                }
                ArrayList arrayList9 = new ArrayList(xj.p.W(arrayList8, 10));
                Iterator it2 = arrayList8.iterator();
                while (it2.hasNext()) {
                    arrayList9.add(((yl.b) it2.next()).i());
                }
                return arrayList9;
            case 14:
                ml.d dVar = (ml.d) this.f3649f;
                ml.r rVar = dVar.f46167c;
                Collection collectionValues = ((Map) j1.f.w(rVar.f46234i, ml.r.f46231m[0])).values();
                ArrayList arrayList10 = new ArrayList();
                Iterator it3 = collectionValues.iterator();
                while (it3.hasNext()) {
                    nm.p pVarA = ((ll.a) dVar.f46166b.f23782b).f45488d.a(rVar, (el.b) it3.next());
                    if (pVarA != null) {
                        arrayList10.add(pVarA);
                    }
                }
                return (im.n[]) x7.a.E(arrayList10).toArray(new im.n[0]);
            case 15:
                u uVar = (u) this.f3649f;
                HashSet hashSet = new HashSet();
                nm.h hVar2 = (nm.h) uVar.f54882e;
                ml.h hVar3 = hVar2.f46823n;
                com.google.android.gms.internal.consent_sdk.d dVar2 = hVar2.l;
                tl.j jVar = hVar2.f46815e;
                Iterator it4 = hVar3.f().iterator();
                while (it4.hasNext()) {
                    for (zk.j jVar2 : a.a.r(((y) it4.next()).A(), null, 3)) {
                        if ((jVar2 instanceof cl.q0) || (jVar2 instanceof h0)) {
                            hashSet.add(jVar2.getName());
                        }
                    }
                }
                List list5 = jVar.f51308q;
                kotlin.jvm.internal.n.e(list5, "classProto.functionList");
                Iterator it5 = list5.iterator();
                while (it5.hasNext()) {
                    hashSet.add(com.bumptech.glide.c.s((vl.f) dVar2.f22982b, ((tl.y) it5.next()).f51554f));
                }
                List list6 = jVar.f51309r;
                kotlin.jvm.internal.n.e(list6, "classProto.propertyList");
                Iterator it6 = list6.iterator();
                while (it6.hasNext()) {
                    hashSet.add(com.bumptech.glide.c.s((vl.f) dVar2.f22982b, ((tl.g0) it6.next()).f51242f));
                }
                return g0.v0(hashSet, hashSet);
            case 16:
                nm.o oVar = (nm.o) this.f3649f;
                Set setN = oVar.n();
                if (setN == null) {
                    return null;
                }
                return g0.v0(setN, g0.v0(oVar.f46852c.f46841c.keySet(), oVar.m()));
            case 17:
                nm.t tVar = (nm.t) this.f3649f;
                com.google.android.gms.internal.consent_sdk.d dVar3 = tVar.f46871k;
                return xj.n.N0(((lm.i) dVar3.f22981a).f45541e.O(tVar.l, (vl.f) dVar3.f22982b));
            case 18:
                return new pm.g(((pm.h) this.f3649f).b());
            case 19:
                return pm.c.s(((pm.h0) this.f3649f).f48436a);
            case 20:
                return rm.i.c(rm.h.CANNOT_COMPUTE_ERASED_BOUND, ((m5.k) this.f3649f).toString());
            case 21:
                jk.a aVar4 = ((qm.i) this.f3649f).f49184b;
                if (aVar4 != null) {
                    return (List) aVar4.invoke();
                }
                return null;
            case 22:
                Object obj10 = i0.f49822e;
                File file = (File) this.f3649f;
                synchronized (obj10) {
                    i0.f49821d.remove(file.getAbsolutePath());
                }
                return wj.r.f53297a;
            case 23:
                ((p0) this.f3649f).dispose();
                return wj.r.f53297a;
            case 24:
                return n1.a(((tk.c0) this.f3649f).a());
            case 25:
                return new f0((tk.g0) this.f3649f);
            case DIAGNOSTIC_EVENT_TYPE_NATIVE_LOAD_STARTED_AD_VIEWER_VALUE:
                return new tk.h0((tk.i0) this.f3649f);
            case 27:
                return new j0((k0) this.f3649f);
            case DIAGNOSTIC_EVENT_TYPE_NATIVE_MEMORY_WARNING_VALUE:
                List upperBounds = ((l1) this.f3649f).f51011a.getUpperBounds();
                kotlin.jvm.internal.n.e(upperBounds, "descriptor.upperBounds");
                List list7 = upperBounds;
                ArrayList arrayList11 = new ArrayList(xj.p.W(list7, 10));
                Iterator it7 = list7.iterator();
                while (it7.hasNext()) {
                    arrayList11.add(new k1((y) it7.next(), null));
                }
                return arrayList11;
            default:
                u4.h hVar4 = (u4.h) this.f3649f;
                return BigInteger.valueOf(hVar4.f51896a).shiftLeft(32).or(BigInteger.valueOf(hVar4.f51897b)).shiftLeft(32).or(BigInteger.valueOf(hVar4.f51898c));
        }
    }
}
