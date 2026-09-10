package ml;

import cc.a2;
import com.google.android.gms.internal.measurement.nf;
import java.util.Collection;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
public final class d implements im.n {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ qk.w[] f46165f;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final nf f46166b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final r f46167c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final w f46168d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final om.i f46169e;

    static {
        kotlin.jvm.internal.e0 e0Var = kotlin.jvm.internal.d0.f44761a;
        f46165f = new qk.w[]{e0Var.g(new kotlin.jvm.internal.v(e0Var.b(d.class), "kotlinScopes", "getKotlinScopes()[Lorg/jetbrains/kotlin/resolve/scopes/MemberScope;"))};
    }

    public d(nf nfVar, fl.x xVar, r rVar) {
        this.f46166b = nfVar;
        this.f46167c = rVar;
        this.f46168d = new w(nfVar, xVar, rVar);
        om.o oVar = ((ll.a) nfVar.f23782b).f45485a;
        al.l lVar = new al.l(this, 14);
        om.l lVar2 = (om.l) oVar;
        lVar2.getClass();
        this.f46169e = new om.i(lVar2, lVar);
    }

    @Override // im.n
    public final Collection a(yl.f name, hl.b bVar) {
        kotlin.jvm.internal.n.f(name, "name");
        i(name, bVar);
        im.n[] nVarArrH = h();
        Collection collectionA = this.f46168d.a(name, bVar);
        for (im.n nVar : nVarArrH) {
            collectionA = x7.a.j(collectionA, nVar.a(name, bVar));
        }
        return collectionA == null ? xj.x.f53868a : collectionA;
    }

    @Override // im.n
    public final Set b() {
        im.n[] nVarArrH = h();
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        for (im.n nVar : nVarArrH) {
            xj.t.a0(nVar.b(), linkedHashSet);
        }
        linkedHashSet.addAll(this.f46168d.b());
        return linkedHashSet;
    }

    @Override // im.p
    public final zk.g c(yl.f name, hl.b location) {
        kotlin.jvm.internal.n.f(name, "name");
        kotlin.jvm.internal.n.f(location, "location");
        i(name, location);
        w wVar = this.f46168d;
        wVar.getClass();
        zk.g gVar = null;
        zk.e eVarV = wVar.v(name, null);
        if (eVarV != null) {
            return eVarV;
        }
        for (im.n nVar : h()) {
            zk.g gVarC = nVar.c(name, location);
            if (gVarC != null) {
                if (!(gVarC instanceof zk.h) || !((zk.h) gVarC).f0()) {
                    return gVarC;
                }
                if (gVar == null) {
                    gVar = gVarC;
                }
            }
        }
        return gVar;
    }

    @Override // im.p
    public final Collection d(im.f kindFilter, jk.b bVar) {
        kotlin.jvm.internal.n.f(kindFilter, "kindFilter");
        im.n[] nVarArrH = h();
        Collection collectionD = this.f46168d.d(kindFilter, bVar);
        for (im.n nVar : nVarArrH) {
            collectionD = x7.a.j(collectionD, nVar.d(kindFilter, bVar));
        }
        return collectionD == null ? xj.x.f53868a : collectionD;
    }

    @Override // im.n
    public final Set e() {
        im.n[] nVarArrH = h();
        kotlin.jvm.internal.n.f(nVarArrH, "<this>");
        HashSet hashSetT = x7.a.t(nVarArrH.length == 0 ? xj.v.f53866a : new xj.m(nVarArrH, 0));
        if (hashSetT == null) {
            return null;
        }
        hashSetT.addAll(this.f46168d.e());
        return hashSetT;
    }

    @Override // im.n
    public final Collection f(yl.f name, hl.b bVar) {
        kotlin.jvm.internal.n.f(name, "name");
        i(name, bVar);
        im.n[] nVarArrH = h();
        this.f46168d.getClass();
        Collection collectionJ = xj.v.f53866a;
        for (im.n nVar : nVarArrH) {
            collectionJ = x7.a.j(collectionJ, nVar.f(name, bVar));
        }
        return collectionJ == null ? xj.x.f53868a : collectionJ;
    }

    @Override // im.n
    public final Set g() {
        im.n[] nVarArrH = h();
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        for (im.n nVar : nVarArrH) {
            xj.t.a0(nVar.g(), linkedHashSet);
        }
        linkedHashSet.addAll(this.f46168d.g());
        return linkedHashSet;
    }

    public final im.n[] h() {
        return (im.n[]) j1.f.w(this.f46169e, f46165f[0]);
    }

    public final void i(yl.f name, hl.b location) {
        kotlin.jvm.internal.n.f(name, "name");
        kotlin.jvm.internal.n.f(location, "location");
        a2.H(((ll.a) this.f46166b.f23782b).f45497n, location, this.f46167c, name);
    }

    public final String toString() {
        return "scope for " + this.f46167c;
    }
}
