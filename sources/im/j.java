package im;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
public final class j implements n {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f43182b = 1;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f43183c;

    public j(n nVar) {
        this.f43183c = nVar;
    }

    @Override // im.n
    public Collection a(yl.f name, hl.b bVar) {
        switch (this.f43182b) {
            case 1:
                kotlin.jvm.internal.n.f(name, "name");
                return bm.m.o(j(name, bVar), k.f43186h);
            default:
                return j(name, bVar);
        }
    }

    @Override // im.n
    public final Set b() {
        return l().b();
    }

    @Override // im.p
    public final zk.g c(yl.f name, hl.b location) {
        kotlin.jvm.internal.n.f(name, "name");
        kotlin.jvm.internal.n.f(location, "location");
        return l().c(name, location);
    }

    @Override // im.p
    public Collection d(f kindFilter, jk.b bVar) {
        switch (this.f43182b) {
            case 1:
                kotlin.jvm.internal.n.f(kindFilter, "kindFilter");
                Collection collectionI = i(kindFilter, bVar);
                ArrayList arrayList = new ArrayList();
                ArrayList arrayList2 = new ArrayList();
                for (Object obj : collectionI) {
                    if (((zk.j) obj) instanceof zk.b) {
                        arrayList.add(obj);
                    } else {
                        arrayList2.add(obj);
                    }
                }
                return xj.n.B0(arrayList2, bm.m.o(arrayList, k.f43185g));
            default:
                return i(kindFilter, bVar);
        }
    }

    @Override // im.n
    public final Set e() {
        return l().e();
    }

    @Override // im.n
    public Collection f(yl.f name, hl.b bVar) {
        switch (this.f43182b) {
            case 1:
                kotlin.jvm.internal.n.f(name, "name");
                return bm.m.o(k(name, bVar), k.f43187i);
            default:
                return k(name, bVar);
        }
    }

    @Override // im.n
    public final Set g() {
        return l().g();
    }

    public final n h() {
        if (!(l() instanceof j)) {
            return l();
        }
        n nVarL = l();
        kotlin.jvm.internal.n.d(nVarL, "null cannot be cast to non-null type org.jetbrains.kotlin.resolve.scopes.AbstractScopeAdapter");
        return ((j) nVarL).h();
    }

    public final Collection i(f kindFilter, jk.b bVar) {
        kotlin.jvm.internal.n.f(kindFilter, "kindFilter");
        return l().d(kindFilter, bVar);
    }

    public final Collection j(yl.f name, hl.b bVar) {
        kotlin.jvm.internal.n.f(name, "name");
        return l().a(name, bVar);
    }

    public final Collection k(yl.f name, hl.b bVar) {
        kotlin.jvm.internal.n.f(name, "name");
        return l().f(name, bVar);
    }

    public final n l() {
        switch (this.f43182b) {
            case 0:
                return (n) ((om.i) this.f43183c).invoke();
            default:
                return (n) this.f43183c;
        }
    }

    public j(om.o storageManager, jk.a aVar) {
        kotlin.jvm.internal.n.f(storageManager, "storageManager");
        this.f43183c = new om.i((om.l) storageManager, new al.l(aVar, 8));
    }
}
