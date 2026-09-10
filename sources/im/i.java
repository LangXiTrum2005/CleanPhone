package im;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Set;
import xj.v;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
public final class i extends o {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final n f43181b;

    public i(n workerScope) {
        kotlin.jvm.internal.n.f(workerScope, "workerScope");
        this.f43181b = workerScope;
    }

    @Override // im.o, im.n
    public final Set b() {
        return this.f43181b.b();
    }

    @Override // im.o, im.p
    public final zk.g c(yl.f name, hl.b location) {
        kotlin.jvm.internal.n.f(name, "name");
        kotlin.jvm.internal.n.f(location, "location");
        zk.g gVarC = this.f43181b.c(name, location);
        if (gVarC != null) {
            zk.e eVar = gVarC instanceof zk.e ? (zk.e) gVarC : null;
            if (eVar != null) {
                return eVar;
            }
            if (gVarC instanceof nm.s) {
                return (nm.s) gVarC;
            }
        }
        return null;
    }

    @Override // im.o, im.p
    public final Collection d(f kindFilter, jk.b bVar) {
        Collection collection;
        kotlin.jvm.internal.n.f(kindFilter, "kindFilter");
        int i10 = f.l & kindFilter.f43175b;
        f fVar = i10 == 0 ? null : new f(i10, kindFilter.f43174a);
        if (fVar == null) {
            collection = v.f53866a;
        } else {
            Collection collectionD = this.f43181b.d(fVar, bVar);
            ArrayList arrayList = new ArrayList();
            for (Object obj : collectionD) {
                if (obj instanceof zk.h) {
                    arrayList.add(obj);
                }
            }
            collection = arrayList;
        }
        return collection;
    }

    @Override // im.o, im.n
    public final Set e() {
        return this.f43181b.e();
    }

    @Override // im.o, im.n
    public final Set g() {
        return this.f43181b.g();
    }

    public final String toString() {
        return "Classes from " + this.f43181b;
    }
}
