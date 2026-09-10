package nm;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import pm.y;
import xj.v;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
public final class f extends o {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final qm.f f46809g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final om.i f46810h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final om.i f46811i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final /* synthetic */ h f46812j;

    public f(h hVar, qm.f kotlinTypeRefiner) {
        kotlin.jvm.internal.n.f(kotlinTypeRefiner, "kotlinTypeRefiner");
        this.f46812j = hVar;
        com.google.android.gms.internal.consent_sdk.d dVar = hVar.l;
        tl.j jVar = hVar.f46815e;
        List list = jVar.f51308q;
        kotlin.jvm.internal.n.e(list, "classProto.functionList");
        List list2 = jVar.f51309r;
        kotlin.jvm.internal.n.e(list2, "classProto.propertyList");
        List list3 = jVar.f51310s;
        kotlin.jvm.internal.n.e(list3, "classProto.typeAliasList");
        List list4 = jVar.f51303k;
        kotlin.jvm.internal.n.e(list4, "classProto.nestedClassNameList");
        List list5 = list4;
        vl.f fVar = (vl.f) hVar.l.f22982b;
        ArrayList arrayList = new ArrayList(xj.p.W(list5, 10));
        Iterator it = list5.iterator();
        while (it.hasNext()) {
            arrayList.add(com.bumptech.glide.c.s(fVar, ((Number) it.next()).intValue()));
        }
        super(dVar, list, list2, list3, new d(arrayList, 0));
        lm.i iVar = (lm.i) dVar.f22981a;
        this.f46809g = kotlinTypeRefiner;
        om.l lVar = iVar.f45537a;
        e eVar = new e(this, 0);
        lVar.getClass();
        this.f46810h = new om.i(lVar, eVar);
        om.l lVar2 = iVar.f45537a;
        e eVar2 = new e(this, 1);
        lVar2.getClass();
        this.f46811i = new om.i(lVar2, eVar2);
    }

    @Override // nm.o, im.o, im.n
    public final Collection a(yl.f name, hl.b bVar) {
        kotlin.jvm.internal.n.f(name, "name");
        s(name, bVar);
        return super.a(name, bVar);
    }

    @Override // nm.o, im.o, im.p
    public final zk.g c(yl.f name, hl.b location) {
        zk.e eVar;
        kotlin.jvm.internal.n.f(name, "name");
        kotlin.jvm.internal.n.f(location, "location");
        s(name, location);
        zc.u uVar = this.f46812j.f46825p;
        return (uVar == null || (eVar = (zk.e) ((om.j) uVar.f54880c).invoke(name)) == null) ? super.c(name, location) : eVar;
    }

    @Override // im.o, im.p
    public final Collection d(im.f kindFilter, jk.b bVar) {
        kotlin.jvm.internal.n.f(kindFilter, "kindFilter");
        return (Collection) this.f46810h.invoke();
    }

    @Override // nm.o, im.o, im.n
    public final Collection f(yl.f name, hl.b bVar) {
        kotlin.jvm.internal.n.f(name, "name");
        s(name, bVar);
        return super.f(name, bVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0 */
    /* JADX WARN: Type inference failed for: r0v1 */
    /* JADX WARN: Type inference failed for: r0v2, types: [java.util.Collection] */
    /* JADX WARN: Type inference failed for: r0v3, types: [xj.v] */
    /* JADX WARN: Type inference failed for: r0v4, types: [java.util.ArrayList] */
    @Override // nm.o
    public final void h(ArrayList arrayList, jk.b bVar) {
        ?? arrayList2;
        zc.u uVar = this.f46812j.f46825p;
        if (uVar != null) {
            Set<yl.f> setKeySet = ((LinkedHashMap) uVar.f54879b).keySet();
            arrayList2 = new ArrayList();
            for (yl.f name : setKeySet) {
                kotlin.jvm.internal.n.f(name, "name");
                zk.e eVar = (zk.e) ((om.j) uVar.f54880c).invoke(name);
                if (eVar != null) {
                    arrayList2.add(eVar);
                }
            }
        } else {
            arrayList2 = 0;
        }
        if (arrayList2 == 0) {
            arrayList2 = v.f53866a;
        }
        arrayList.addAll(arrayList2);
    }

    @Override // nm.o
    public final void j(ArrayList arrayList, yl.f name) {
        kotlin.jvm.internal.n.f(name, "name");
        ArrayList arrayList2 = new ArrayList();
        Iterator it = ((Collection) this.f46811i.invoke()).iterator();
        while (it.hasNext()) {
            arrayList2.addAll(((y) it.next()).A().a(name, hl.b.f42407c));
        }
        com.google.android.gms.internal.consent_sdk.d dVar = this.f46851b;
        arrayList.addAll(((lm.i) dVar.f22981a).f45549n.e(name, this.f46812j));
        ArrayList arrayList3 = new ArrayList(arrayList);
        ((qm.l) ((lm.i) dVar.f22981a).f45552q).f49192d.h(name, arrayList2, arrayList3, this.f46812j, new cl.t(arrayList, 1));
    }

    @Override // nm.o
    public final void k(ArrayList arrayList, yl.f name) {
        kotlin.jvm.internal.n.f(name, "name");
        ArrayList arrayList2 = new ArrayList();
        Iterator it = ((Collection) this.f46811i.invoke()).iterator();
        while (it.hasNext()) {
            arrayList2.addAll(((y) it.next()).A().f(name, hl.b.f42407c));
        }
        ArrayList arrayList3 = new ArrayList(arrayList);
        ((qm.l) ((lm.i) this.f46851b.f22981a).f45552q).f49192d.h(name, arrayList2, arrayList3, this.f46812j, new cl.t(arrayList, 1));
    }

    @Override // nm.o
    public final yl.b l(yl.f name) {
        kotlin.jvm.internal.n.f(name, "name");
        return this.f46812j.f46818h.d(name);
    }

    @Override // nm.o
    public final Set n() {
        List listF = this.f46812j.f46823n.f();
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        Iterator it = listF.iterator();
        while (it.hasNext()) {
            Set setE = ((y) it.next()).A().e();
            if (setE == null) {
                return null;
            }
            xj.t.a0(setE, linkedHashSet);
        }
        return linkedHashSet;
    }

    @Override // nm.o
    public final Set o() {
        h hVar = this.f46812j;
        List listF = hVar.f46823n.f();
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        Iterator it = listF.iterator();
        while (it.hasNext()) {
            xj.t.a0(((y) it.next()).A().b(), linkedHashSet);
        }
        linkedHashSet.addAll(((lm.i) this.f46851b.f22981a).f45549n.c(hVar));
        return linkedHashSet;
    }

    @Override // nm.o
    public final Set p() {
        List listF = this.f46812j.f46823n.f();
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        Iterator it = listF.iterator();
        while (it.hasNext()) {
            xj.t.a0(((y) it.next()).A().g(), linkedHashSet);
        }
        return linkedHashSet;
    }

    @Override // nm.o
    public final boolean r(r rVar) {
        return ((lm.i) this.f46851b.f22981a).f45550o.a(this.f46812j, rVar);
    }

    public final void s(yl.f name, hl.b location) {
        kotlin.jvm.internal.n.f(name, "name");
        kotlin.jvm.internal.n.f(location, "location");
        kotlin.jvm.internal.n.f(((lm.i) this.f46851b.f22981a).f45545i, "<this>");
        h scopeOwner = this.f46812j;
        kotlin.jvm.internal.n.f(scopeOwner, "scopeOwner");
    }
}
