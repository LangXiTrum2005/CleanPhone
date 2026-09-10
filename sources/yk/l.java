package yk;

import cl.f0;
import cl.q0;
import cl.r;
import cl.t0;
import cl.x0;
import cl.y;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.internal.d0;
import kotlin.jvm.internal.e0;
import kotlin.jvm.internal.v;
import ml.p;
import oa.k0;
import pm.a0;
import pm.c0;
import pm.w0;
import qk.i0;
import qk.w;
import xj.o;
import xj.x;
import zk.s;
import zk.u;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
public final class l implements bl.b, bl.d {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ w[] f54482g;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final f0 f54483a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final om.i f54484b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final c0 f54485c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final om.i f54486d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final om.e f54487e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final om.i f54488f;

    static {
        e0 e0Var = d0.f44761a;
        f54482g = new w[]{e0Var.g(new v(e0Var.b(l.class), "settings", "getSettings()Lorg/jetbrains/kotlin/builtins/jvm/JvmBuiltIns$Settings;")), e0Var.g(new v(e0Var.b(l.class), "cloneableType", "getCloneableType()Lorg/jetbrains/kotlin/types/SimpleType;")), e0Var.g(new v(e0Var.b(l.class), "notConsideredDeprecation", "getNotConsideredDeprecation()Lorg/jetbrains/kotlin/descriptors/annotations/Annotations;"))};
    }

    public l(f0 f0Var, om.l lVar, uk.c cVar) {
        this.f54483a = f0Var;
        this.f54484b = new om.i(lVar, cVar);
        cl.n nVar = new cl.n(new r(f0Var, new yl.c("java.io"), 1), yl.f.e("Serializable"), 4, 2, j1.f.C(new a0(lVar, new k(this, 0))), lVar);
        nVar.M(im.m.f43190b, x.f53868a, null);
        this.f54485c = nVar.g();
        this.f54486d = new om.i(lVar, new t0(18, this, lVar));
        this.f54487e = new om.e(lVar, new ConcurrentHashMap(3, 1.0f, 2), new om.f(), 0);
        this.f54488f = new om.i(lVar, new k(this, 1));
    }

    @Override // bl.d
    public final boolean a(zk.e classDescriptor, nm.r rVar) {
        kotlin.jvm.internal.n.f(classDescriptor, "classDescriptor");
        ml.j jVarF = f(classDescriptor);
        if (jVarF == null || !rVar.getAnnotations().c(bl.e.f5723a)) {
            return true;
        }
        g().getClass();
        String strU = go.k.u(rVar, 3);
        p pVarM = jVarF.M();
        yl.f name = rVar.getName();
        kotlin.jvm.internal.n.e(name, "functionDescriptor.name");
        Collection collectionA = pVarM.a(name, hl.b.f42405a);
        if ((collectionA instanceof Collection) && collectionA.isEmpty()) {
            return false;
        }
        Iterator it = collectionA.iterator();
        while (it.hasNext()) {
            if (go.k.u((q0) it.next(), 3).equals(strU)) {
                return true;
            }
        }
        return false;
    }

    @Override // bl.b
    public final Collection b(zk.e eVar) {
        zk.e eVarB;
        if (eVar.l0() == 1) {
            g().getClass();
            ml.j jVarF = f(eVar);
            if (jVarF != null && (eVarB = e.b(fm.e.g(jVarF), b.f54443f)) != null) {
                w0 w0Var = new w0(r9.b.e(eVarB, jVarF));
                List list = (List) jVarF.f46201q.f46224q.invoke();
                ArrayList<cl.l> arrayList = new ArrayList();
                Iterator it = list.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    Object next = it.next();
                    cl.l lVar = (cl.l) next;
                    cl.l lVar2 = lVar;
                    if (lVar2.getVisibility().f43095a.f46265b) {
                        Collection collectionP = eVarB.p();
                        kotlin.jvm.internal.n.e(collectionP, "defaultKotlinVersion.constructors");
                        Collection collection = collectionP;
                        if (!(collection instanceof Collection) || !collection.isEmpty()) {
                            Iterator it2 = collection.iterator();
                            while (true) {
                                if (it2.hasNext()) {
                                    cl.l it3 = (cl.l) it2.next();
                                    kotlin.jvm.internal.n.e(it3, "it");
                                    if (bm.l.j(it3, lVar.b(w0Var)) == 1) {
                                    }
                                }
                            }
                        }
                        if (lVar2.B().size() == 1) {
                            List valueParameters = lVar2.B();
                            kotlin.jvm.internal.n.e(valueParameters, "valueParameters");
                            zk.g gVarE = ((x0) xj.n.F0(valueParameters)).getType().P().e();
                            if (kotlin.jvm.internal.n.a(gVarE != null ? fm.e.h(gVarE) : null, fm.e.h(eVar))) {
                            }
                        }
                        if (!wk.h.C(lVar) && !n.f54497e.contains(go.c.H(jVarF, go.k.u(lVar, 3)))) {
                            arrayList.add(next);
                        }
                    }
                }
                ArrayList arrayList2 = new ArrayList(xj.p.W(arrayList, 10));
                for (cl.l lVar3 : arrayList) {
                    cl.l lVar4 = lVar3;
                    lVar4.getClass();
                    cl.x xVarP0 = lVar4.P0(w0.f48482b);
                    xVarP0.f6609b = eVar;
                    xVarP0.o(eVar.g());
                    xVarP0.f6621o = true;
                    pm.t0 t0VarF = w0Var.f();
                    if (t0VarF == null) {
                        cl.x.a(37);
                        throw null;
                    }
                    xVarP0.f6608a = t0VarF;
                    if (!n.f54498f.contains(go.c.H(jVarF, go.k.u(lVar3, 3)))) {
                        xVarP0.b((al.j) j1.f.w(this.f54488f, f54482g[2]));
                    }
                    y yVarM0 = xVarP0.f6630x.M0(xVarP0);
                    kotlin.jvm.internal.n.d(yVarM0, "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.ClassConstructorDescriptor");
                    arrayList2.add((cl.l) yVarM0);
                }
                return arrayList2;
            }
        }
        return xj.v.f53866a;
    }

    @Override // bl.b
    public final Collection c(zk.e classDescriptor) {
        Set setB;
        kotlin.jvm.internal.n.f(classDescriptor, "classDescriptor");
        g().getClass();
        ml.j jVarF = f(classDescriptor);
        return (jVarF == null || (setB = jVarF.M().b()) == null) ? x.f53868a : setB;
    }

    @Override // bl.b
    public final Collection d(zk.e eVar) {
        yl.e eVarH = fm.e.h(eVar);
        LinkedHashSet linkedHashSet = n.f54493a;
        yl.e eVar2 = wk.l.f53344g;
        boolean zEquals = eVarH.equals(eVar2);
        boolean zIsAssignableFrom = false;
        c0 c0Var = this.f54485c;
        if (!zEquals) {
            HashMap map = wk.l.f53340c0;
            if (map.get(eVarH) == null) {
                if (eVarH.equals(eVar2) || map.get(eVarH) != null) {
                    zIsAssignableFrom = true;
                } else {
                    String str = d.f54447a;
                    yl.b bVarF = d.f(eVarH);
                    if (bVarF != null) {
                        try {
                            zIsAssignableFrom = Serializable.class.isAssignableFrom(Class.forName(bVarF.b().b()));
                        } catch (ClassNotFoundException unused) {
                        }
                    }
                }
                return zIsAssignableFrom ? j1.f.C(c0Var) : xj.v.f53866a;
            }
        }
        c0 cloneableType = (c0) j1.f.w(this.f54486d, f54482g[1]);
        kotlin.jvm.internal.n.e(cloneableType, "cloneableType");
        return o.Q(cloneableType, c0Var);
    }

    /* JADX WARN: Code duplicated, block: B:25:0x00ce  */
    /* JADX WARN: Code duplicated, block: B:37:0x011a  */
    /* JADX WARN: Code duplicated, block: B:81:0x0235  */
    /* JADX WARN: Code duplicated, block: B:82:0x0237  */
    /* JADX WARN: Code duplicated, block: B:84:0x0253  */
    /* JADX WARN: Code duplicated, block: B:96:0x02dd  */
    @Override // bl.b
    public final Collection e(yl.f name, zk.e classDescriptor) throws Throwable {
        List listK0;
        Object obj;
        q0 q0Var;
        boolean z10;
        zk.j jVarE;
        boolean zBooleanValue;
        q0 q0Var2;
        kotlin.jvm.internal.n.f(name, "name");
        kotlin.jvm.internal.n.f(classDescriptor, "classDescriptor");
        boolean zEquals = name.equals(a.f54442e);
        w[] wVarArr = f54482g;
        List<q0> list = xj.v.f53866a;
        if (zEquals && (classDescriptor instanceof nm.h)) {
            yl.f fVar = wk.h.f53310e;
            if (wk.h.b(classDescriptor, wk.l.f53344g) || wk.h.r(classDescriptor) != null) {
                nm.h hVar = (nm.h) classDescriptor;
                List list2 = hVar.f46815e.f51308q;
                kotlin.jvm.internal.n.e(list2, "classDescriptor.classProto.functionList");
                List list3 = list2;
                if (!(list3 instanceof Collection) || !list3.isEmpty()) {
                    Iterator it = list3.iterator();
                    while (it.hasNext()) {
                        if (com.bumptech.glide.c.s((vl.f) hVar.l.f22982b, ((tl.y) it.next()).f51554f).equals(a.f54442e)) {
                            return list;
                        }
                    }
                }
                zk.r rVarV0 = ((q0) xj.n.E0(((c0) j1.f.w(this.f54486d, wVarArr[1])).A().a(name, hl.b.f42405a))).v0();
                rVarV0.i(hVar);
                rVarV0.y(zk.n.f54978e);
                rVarV0.o(hVar.g());
                rVarV0.f(hVar.y0());
                s sVarBuild = rVarV0.build();
                kotlin.jvm.internal.n.c(sVarBuild);
                return j1.f.C((q0) sVarBuild);
            }
        }
        g().getClass();
        ml.c0 c0Var = new ml.c0(name, 1);
        ml.j jVarF = f(classDescriptor);
        if (jVarF == null) {
            q0Var = null;
        } else {
            yl.c cVarG = fm.e.g(jVarF);
            b builtIns = b.f54443f;
            kotlin.jvm.internal.n.f(builtIns, "builtIns");
            zk.e eVarB = e.b(cVarG, builtIns);
            if (eVarB == null) {
                listK0 = x.f53868a;
            } else {
                String str = d.f54447a;
                yl.c cVar = (yl.c) d.f54457k.get(fm.e.h(eVarB));
                listK0 = cVar == null ? i0.k0(eVarB) : o.Q(eVarB, builtIns.i(cVar));
            }
            Iterable iterable = listK0;
            if (iterable instanceof List) {
                List list4 = (List) iterable;
                if (list4.isEmpty()) {
                    obj = null;
                } else {
                    obj = list4.get(list4.size() - 1);
                }
            } else {
                Iterator it2 = iterable.iterator();
                if (it2.hasNext()) {
                    Object next = it2.next();
                    while (it2.hasNext()) {
                        next = it2.next();
                    }
                    obj = next;
                } else {
                    obj = null;
                }
            }
            zk.e eVar = (zk.e) obj;
            if (eVar == null) {
                q0Var = null;
            } else {
                int i10 = ym.i.f54555c;
                ArrayList arrayList = new ArrayList(xj.p.W(iterable, 10));
                Iterator it3 = iterable.iterator();
                while (it3.hasNext()) {
                    arrayList.add(fm.e.g((zk.e) it3.next()));
                }
                ym.i iVar = new ym.i();
                iVar.addAll(arrayList);
                String str2 = d.f54447a;
                boolean zContainsKey = d.f54456j.containsKey(bm.e.g(classDescriptor));
                yl.c cVarG2 = fm.e.g(jVarF);
                t0 t0Var = new t0(19, jVarF, eVar);
                om.e eVar2 = this.f54487e;
                eVar2.getClass();
                Object objInvoke = eVar2.invoke(new om.g(cVarG2, t0Var));
                if (objInvoke == null) {
                    om.e.a(3);
                    throw null;
                }
                im.n nVarR = ((zk.e) objInvoke).R();
                kotlin.jvm.internal.n.e(nVarR, "fakeJavaClassDescriptor.unsubstitutedMemberScope");
                Iterable iterable2 = (Iterable) c0Var.invoke(nVarR);
                ArrayList arrayList2 = new ArrayList();
                for (Object obj2 : iterable2) {
                    q0 q0Var3 = (q0) obj2;
                    if (q0Var3.getKind() == 1 && q0Var3.getVisibility().f43095a.f46265b && !wk.h.C(q0Var3)) {
                        Collection collectionF = q0Var3.f();
                        if ((collectionF instanceof Collection) && collectionF.isEmpty()) {
                            jVarE = q0Var3.e();
                            kotlin.jvm.internal.n.d(jVarE, "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.ClassDescriptor");
                            if (n.f54496d.contains(go.c.H((zk.e) jVarE, go.k.u(q0Var3, 3))) ^ zContainsKey) {
                                zBooleanValue = true;
                            } else {
                                Boolean boolG = ym.l.g(j1.f.C(q0Var3), e.f54460a, new f(this));
                                kotlin.jvm.internal.n.e(boolG, "private fun SimpleFuncti…scriptor)\n        }\n    }");
                                zBooleanValue = boolG.booleanValue();
                            }
                            if (zBooleanValue) {
                                z10 = false;
                            } else {
                                z10 = true;
                            }
                        } else {
                            Iterator it4 = collectionF.iterator();
                            while (true) {
                                if (it4.hasNext()) {
                                    zk.j jVarE2 = ((s) it4.next()).e();
                                    kotlin.jvm.internal.n.e(jVarE2, "it.containingDeclaration");
                                    if (iVar.contains(fm.e.g(jVarE2))) {
                                    }
                                } else {
                                    jVarE = q0Var3.e();
                                    kotlin.jvm.internal.n.d(jVarE, "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.ClassDescriptor");
                                    if (n.f54496d.contains(go.c.H((zk.e) jVarE, go.k.u(q0Var3, 3))) ^ zContainsKey) {
                                        zBooleanValue = true;
                                    } else {
                                        Boolean boolG2 = ym.l.g(j1.f.C(q0Var3), e.f54460a, new f(this));
                                        kotlin.jvm.internal.n.e(boolG2, "private fun SimpleFuncti…scriptor)\n        }\n    }");
                                        zBooleanValue = boolG2.booleanValue();
                                    }
                                    if (zBooleanValue) {
                                        z10 = true;
                                    }
                                }
                                z10 = false;
                            }
                        }
                    } else {
                        z10 = false;
                    }
                    if (z10) {
                        arrayList2.add(obj2);
                    }
                }
                q0Var = null;
                list = arrayList2;
            }
        }
        ArrayList arrayList3 = new ArrayList();
        for (q0 q0Var4 : list) {
            zk.j jVarE3 = q0Var4.e();
            kotlin.jvm.internal.n.d(jVarE3, "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.ClassDescriptor");
            s sVarB = q0Var4.b(new w0(r9.b.e((zk.e) jVarE3, classDescriptor)));
            kotlin.jvm.internal.n.d(sVarB, "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.SimpleFunctionDescriptor");
            zk.r rVarV1 = ((q0) sVarB).v0();
            rVarV1.i(classDescriptor);
            rVarV1.f(classDescriptor.y0());
            rVarV1.s();
            zk.j jVarE4 = q0Var4.e();
            kotlin.jvm.internal.n.d(jVarE4, "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.ClassDescriptor");
            Object objE = ym.l.e(j1.f.C((zk.e) jVarE4), new k0(this, 28), new fm.c(go.k.u(q0Var4, 3), new kotlin.jvm.internal.c0()));
            kotlin.jvm.internal.n.e(objE, "jvmDescriptor = computeJ…CONSIDERED\n            })");
            int iOrdinal = ((j) objE).ordinal();
            if (iOrdinal != 0) {
                if (iOrdinal == 2) {
                    rVarV1.b((al.j) j1.f.w(this.f54488f, wVarArr[2]));
                } else if (iOrdinal == 3) {
                    q0Var2 = q0Var;
                }
                s sVarBuild2 = rVarV1.build();
                kotlin.jvm.internal.n.c(sVarBuild2);
                q0Var2 = (q0) sVarBuild2;
            } else if (classDescriptor.j() == 1 && classDescriptor.l0() != 3) {
                q0Var2 = q0Var;
            } else {
                rVarV1.h();
                s sVarBuild3 = rVarV1.build();
                kotlin.jvm.internal.n.c(sVarBuild3);
                q0Var2 = (q0) sVarBuild3;
            }
            if (q0Var2 != null) {
                arrayList3.add(q0Var2);
            }
        }
        return arrayList3;
    }

    public final ml.j f(zk.e eVar) {
        if (eVar == null) {
            wk.h.a(108);
            throw null;
        }
        yl.f fVar = wk.h.f53310e;
        if (!wk.h.b(eVar, wk.l.f53335a) && wk.h.I(eVar)) {
            yl.e eVarH = fm.e.h(eVar);
            if (eVarH.d()) {
                String str = d.f54447a;
                yl.b bVarF = d.f(eVarH);
                if (bVarF != null) {
                    zk.e eVarJ = u.j(g().f54471a, bVarF.b());
                    if (eVarJ instanceof ml.j) {
                        return (ml.j) eVarJ;
                    }
                }
            }
        }
        return null;
    }

    public final h g() {
        return (h) j1.f.w(this.f54484b, f54482g[0]);
    }
}
