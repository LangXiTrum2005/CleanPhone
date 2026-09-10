package ml;

import cl.t0;
import com.google.android.gms.internal.measurement.nf;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
public final class w extends f0 {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final fl.x f46242n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final r f46243o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final om.h f46244p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final om.j f46245q;

    public w(nf nfVar, fl.x xVar, r rVar) {
        super(nfVar, null);
        this.f46242n = xVar;
        this.f46243o = rVar;
        om.o oVar = ((ll.a) nfVar.f23782b).f45485a;
        t0 t0Var = new t0(6, nfVar, this);
        om.l lVar = (om.l) oVar;
        lVar.getClass();
        this.f46244p = new om.h(lVar, t0Var);
        this.f46245q = ((om.l) oVar).c(new a4.b(3, this, nfVar));
    }

    @Override // im.o, im.p
    public final zk.g c(yl.f name, hl.b location) {
        kotlin.jvm.internal.n.f(name, "name");
        kotlin.jvm.internal.n.f(location, "location");
        return v(name, null);
    }

    @Override // ml.a0, im.o, im.p
    public final Collection d(im.f kindFilter, jk.b bVar) {
        kotlin.jvm.internal.n.f(kindFilter, "kindFilter");
        if (!kindFilter.a(im.f.l | im.f.f43160e)) {
            return xj.v.f53866a;
        }
        Iterable iterable = (Iterable) this.f46153d.invoke();
        ArrayList arrayList = new ArrayList();
        for (Object obj : iterable) {
            zk.j jVar = (zk.j) obj;
            if (jVar instanceof zk.e) {
                yl.f name = ((zk.e) jVar).getName();
                kotlin.jvm.internal.n.e(name, "it.name");
                if (((Boolean) bVar.invoke(name)).booleanValue()) {
                    arrayList.add(obj);
                }
            }
        }
        return arrayList;
    }

    @Override // ml.a0, im.o, im.n
    public final Collection f(yl.f name, hl.b bVar) {
        kotlin.jvm.internal.n.f(name, "name");
        return xj.v.f53866a;
    }

    @Override // ml.a0
    public final Set h(im.f kindFilter, jk.b bVar) {
        kotlin.jvm.internal.n.f(kindFilter, "kindFilter");
        if (!kindFilter.a(im.f.f43160e)) {
            return xj.x.f53868a;
        }
        Set set = (Set) this.f46244p.invoke();
        if (set == null) {
            this.f46242n.getClass();
            return new LinkedHashSet();
        }
        HashSet hashSet = new HashSet();
        Iterator it = set.iterator();
        while (it.hasNext()) {
            hashSet.add(yl.f.e((String) it.next()));
        }
        return hashSet;
    }

    @Override // ml.a0
    public final Set i(im.f kindFilter, im.k kVar) {
        kotlin.jvm.internal.n.f(kindFilter, "kindFilter");
        return xj.x.f53868a;
    }

    @Override // ml.a0
    public final c k() {
        return b.f46161a;
    }

    @Override // ml.a0
    public final void m(LinkedHashSet linkedHashSet, yl.f name) {
        kotlin.jvm.internal.n.f(name, "name");
    }

    @Override // ml.a0
    public final Set o(im.f kindFilter) {
        kotlin.jvm.internal.n.f(kindFilter, "kindFilter");
        return xj.x.f53868a;
    }

    @Override // ml.a0
    public final zk.j q() {
        return this.f46243o;
    }

    public final zk.e v(yl.f name, fl.n nVar) {
        yl.f fVar = yl.h.f54517a;
        kotlin.jvm.internal.n.f(name, "name");
        String strB = name.b();
        kotlin.jvm.internal.n.e(strB, "name.asString()");
        if (strB.length() <= 0 || name.f54515b) {
            return null;
        }
        Set set = (Set) this.f46244p.invoke();
        if (nVar == null && set != null && !set.contains(name.b())) {
            return null;
        }
        return (zk.e) this.f46245q.invoke(new s(name, nVar));
    }
}
