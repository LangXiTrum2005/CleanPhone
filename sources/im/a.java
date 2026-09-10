package im;

import java.util.Collection;
import java.util.LinkedHashSet;
import java.util.Set;
import xj.t;
import xj.v;
import xj.x;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
public final class a implements n {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f43151b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final n[] f43152c;

    public a(String str, n[] nVarArr) {
        this.f43151b = str;
        this.f43152c = nVarArr;
    }

    @Override // im.n
    public final Collection a(yl.f name, hl.b bVar) {
        kotlin.jvm.internal.n.f(name, "name");
        n[] nVarArr = this.f43152c;
        int length = nVarArr.length;
        if (length == 0) {
            return v.f53866a;
        }
        if (length == 1) {
            return nVarArr[0].a(name, bVar);
        }
        Collection collectionJ = null;
        for (n nVar : nVarArr) {
            collectionJ = x7.a.j(collectionJ, nVar.a(name, bVar));
        }
        return collectionJ == null ? x.f53868a : collectionJ;
    }

    @Override // im.n
    public final Set b() {
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        for (n nVar : this.f43152c) {
            t.a0(nVar.b(), linkedHashSet);
        }
        return linkedHashSet;
    }

    @Override // im.p
    public final zk.g c(yl.f name, hl.b location) {
        kotlin.jvm.internal.n.f(name, "name");
        kotlin.jvm.internal.n.f(location, "location");
        zk.g gVar = null;
        for (n nVar : this.f43152c) {
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
    public final Collection d(f kindFilter, jk.b bVar) {
        kotlin.jvm.internal.n.f(kindFilter, "kindFilter");
        n[] nVarArr = this.f43152c;
        int length = nVarArr.length;
        if (length == 0) {
            return v.f53866a;
        }
        if (length == 1) {
            return nVarArr[0].d(kindFilter, bVar);
        }
        Collection collectionJ = null;
        for (n nVar : nVarArr) {
            collectionJ = x7.a.j(collectionJ, nVar.d(kindFilter, bVar));
        }
        return collectionJ == null ? x.f53868a : collectionJ;
    }

    @Override // im.n
    public final Set e() {
        n[] nVarArr = this.f43152c;
        kotlin.jvm.internal.n.f(nVarArr, "<this>");
        return x7.a.t(nVarArr.length == 0 ? v.f53866a : new xj.m(nVarArr, 0));
    }

    @Override // im.n
    public final Collection f(yl.f name, hl.b bVar) {
        kotlin.jvm.internal.n.f(name, "name");
        n[] nVarArr = this.f43152c;
        int length = nVarArr.length;
        if (length == 0) {
            return v.f53866a;
        }
        if (length == 1) {
            return nVarArr[0].f(name, bVar);
        }
        Collection collectionJ = null;
        for (n nVar : nVarArr) {
            collectionJ = x7.a.j(collectionJ, nVar.f(name, bVar));
        }
        return collectionJ == null ? x.f53868a : collectionJ;
    }

    @Override // im.n
    public final Set g() {
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        for (n nVar : this.f43152c) {
            t.a0(nVar.g(), linkedHashSet);
        }
        return linkedHashSet;
    }

    public final String toString() {
        return this.f43151b;
    }
}
