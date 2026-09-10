package im;

import cl.q0;
import java.util.Collection;
import java.util.LinkedHashSet;
import java.util.Set;
import xj.v;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
public abstract class o implements n {
    @Override // im.n
    public Collection a(yl.f name, hl.b bVar) {
        kotlin.jvm.internal.n.f(name, "name");
        return v.f53866a;
    }

    @Override // im.n
    public Set b() {
        Collection collectionD = d(f.f43170p, ym.b.f54543e);
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        for (Object obj : collectionD) {
            if (obj instanceof q0) {
                yl.f name = ((q0) obj).getName();
                kotlin.jvm.internal.n.e(name, "it.name");
                linkedHashSet.add(name);
            }
        }
        return linkedHashSet;
    }

    @Override // im.p
    public zk.g c(yl.f name, hl.b location) {
        kotlin.jvm.internal.n.f(name, "name");
        kotlin.jvm.internal.n.f(location, "location");
        return null;
    }

    @Override // im.p
    public Collection d(f kindFilter, jk.b bVar) {
        kotlin.jvm.internal.n.f(kindFilter, "kindFilter");
        return v.f53866a;
    }

    @Override // im.n
    public Set e() {
        return null;
    }

    @Override // im.n
    public Collection f(yl.f name, hl.b bVar) {
        kotlin.jvm.internal.n.f(name, "name");
        return v.f53866a;
    }

    @Override // im.n
    public Set g() {
        Collection collectionD = d(f.f43171q, ym.b.f54543e);
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        for (Object obj : collectionD) {
            if (obj instanceof q0) {
                yl.f name = ((q0) obj).getName();
                kotlin.jvm.internal.n.e(name, "it.name");
                linkedHashSet.add(name);
            }
        }
        return linkedHashSet;
    }
}
