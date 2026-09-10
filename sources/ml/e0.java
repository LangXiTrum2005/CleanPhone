package ml;

import com.google.android.gms.internal.measurement.nf;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import zk.h0;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
public final class e0 extends f0 {

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final /* synthetic */ int f46175p = 0;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final fl.n f46176n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final j f46177o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e0(nf nfVar, fl.n jClass, j jVar) {
        super(nfVar, null);
        kotlin.jvm.internal.n.f(jClass, "jClass");
        this.f46176n = jClass;
        this.f46177o = jVar;
    }

    public static h0 v(h0 h0Var) {
        if (h0Var.getKind() != 2) {
            return h0Var;
        }
        Collection collectionF = h0Var.f();
        kotlin.jvm.internal.n.e(collectionF, "this.overriddenDescriptors");
        Collection<h0> collection = collectionF;
        ArrayList arrayList = new ArrayList(xj.p.W(collection, 10));
        for (h0 it : collection) {
            kotlin.jvm.internal.n.e(it, "it");
            arrayList.add(v(it));
        }
        return (h0) xj.n.F0(xj.n.j0(arrayList));
    }

    @Override // im.o, im.p
    public final zk.g c(yl.f name, hl.b location) {
        kotlin.jvm.internal.n.f(name, "name");
        kotlin.jvm.internal.n.f(location, "location");
        return null;
    }

    @Override // ml.a0
    public final Set h(im.f kindFilter, jk.b bVar) {
        kotlin.jvm.internal.n.f(kindFilter, "kindFilter");
        return xj.x.f53868a;
    }

    @Override // ml.a0
    public final Set i(im.f kindFilter, im.k kVar) {
        kotlin.jvm.internal.n.f(kindFilter, "kindFilter");
        Set setQ0 = xj.n.Q0(((c) this.f46154e.invoke()).a());
        j jVar = this.f46177o;
        e0 e0VarY = com.bumptech.glide.d.y(jVar);
        Set setB = e0VarY != null ? e0VarY.b() : null;
        if (setB == null) {
            setB = xj.x.f53868a;
        }
        setQ0.addAll(setB);
        if (this.f46176n.f41001a.isEnum()) {
            setQ0.addAll(xj.o.Q(wk.m.f53365c, wk.m.f53363a));
        }
        nf nfVar = this.f46151b;
        setQ0.addAll(((gm.a) ((ll.a) nfVar.f23782b).f45507x).g(nfVar, jVar));
        return setQ0;
    }

    @Override // ml.a0
    public final void j(ArrayList arrayList, yl.f name) {
        kotlin.jvm.internal.n.f(name, "name");
        nf nfVar = this.f46151b;
        ((gm.a) ((ll.a) nfVar.f23782b).f45507x).d(nfVar, this.f46177o, name, arrayList);
    }

    @Override // ml.a0
    public final c k() {
        return new a(this.f46176n, k.f46209h);
    }

    @Override // ml.a0
    public final void m(LinkedHashSet linkedHashSet, yl.f name) {
        kotlin.jvm.internal.n.f(name, "name");
        j jVar = this.f46177o;
        e0 e0VarY = com.bumptech.glide.d.y(jVar);
        Collection collectionR0 = e0VarY == null ? xj.x.f53868a : xj.n.R0(e0VarY.a(name, hl.b.f42409e));
        ll.a aVar = (ll.a) this.f46151b.f23782b;
        linkedHashSet.addAll(go.c.E(name, collectionR0, linkedHashSet, this.f46177o, aVar.f45490f, ((qm.l) aVar.f45504u).f49192d));
        if (this.f46176n.f41001a.isEnum()) {
            if (name.equals(wk.m.f53365c)) {
                linkedHashSet.add(bm.m.i(jVar));
            } else if (name.equals(wk.m.f53363a)) {
                linkedHashSet.add(bm.m.j(jVar));
            }
        }
    }

    @Override // ml.f0, ml.a0
    public final void n(ArrayList arrayList, yl.f name) {
        kotlin.jvm.internal.n.f(name, "name");
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        c0 c0Var = new c0(name, 0);
        j jVar = this.f46177o;
        ym.l.e(j1.f.C(jVar), b0.f46162a, new d0(jVar, linkedHashSet, c0Var));
        boolean zIsEmpty = arrayList.isEmpty();
        nf nfVar = this.f46151b;
        if (zIsEmpty) {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            for (Object obj : linkedHashSet) {
                h0 h0VarV = v((h0) obj);
                Object arrayList2 = linkedHashMap.get(h0VarV);
                if (arrayList2 == null) {
                    arrayList2 = new ArrayList();
                    linkedHashMap.put(h0VarV, arrayList2);
                }
                ((List) arrayList2).add(obj);
            }
            ArrayList arrayList3 = new ArrayList();
            Iterator it = linkedHashMap.entrySet().iterator();
            while (it.hasNext()) {
                Collection collection = (Collection) ((Map.Entry) it.next()).getValue();
                ll.a aVar = (ll.a) nfVar.f23782b;
                xj.t.a0(go.c.E(name, collection, arrayList, this.f46177o, aVar.f45490f, ((qm.l) aVar.f45504u).f49192d), arrayList3);
            }
            arrayList.addAll(arrayList3);
        } else {
            ll.a aVar2 = (ll.a) nfVar.f23782b;
            arrayList.addAll(go.c.E(name, linkedHashSet, arrayList, this.f46177o, aVar2.f45490f, ((qm.l) aVar2.f45504u).f49192d));
        }
        if (this.f46176n.f41001a.isEnum() && name.equals(wk.m.f53364b)) {
            ym.l.a(arrayList, bm.m.h(jVar));
        }
    }

    @Override // ml.a0
    public final Set o(im.f kindFilter) {
        kotlin.jvm.internal.n.f(kindFilter, "kindFilter");
        Set setQ0 = xj.n.Q0(((c) this.f46154e.invoke()).c());
        k kVar = k.f46210i;
        j jVar = this.f46177o;
        ym.l.e(j1.f.C(jVar), b0.f46162a, new d0(jVar, setQ0, kVar));
        if (this.f46176n.f41001a.isEnum()) {
            setQ0.add(wk.m.f53364b);
        }
        return setQ0;
    }

    @Override // ml.a0
    public final zk.j q() {
        return this.f46177o;
    }
}
