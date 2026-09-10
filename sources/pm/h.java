package pm;

import java.util.Collection;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
public abstract class h implements n0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f48434a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final om.d f48435b;

    public h(om.o storageManager) {
        kotlin.jvm.internal.n.f(storageManager, "storageManager");
        this.f48435b = new om.d((om.l) storageManager, new al.l(this, 18), new al.f(this, 19));
    }

    public abstract Collection b();

    public abstract y c();

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof n0) && obj.hashCode() == hashCode()) {
            n0 n0Var = (n0) obj;
            if (n0Var.getParameters().size() == getParameters().size()) {
                zk.g gVarE = e();
                zk.g gVarE2 = n0Var.e();
                if (gVarE2 == null || rm.i.f(gVarE) || bm.e.o(gVarE) || rm.i.f(gVarE2) || bm.e.o(gVarE2)) {
                    return false;
                }
                return j(gVarE2);
            }
        }
        return false;
    }

    public abstract zk.k0 h();

    public final int hashCode() {
        int i10 = this.f48434a;
        if (i10 != 0) {
            return i10;
        }
        zk.g gVarE = e();
        int iIdentityHashCode = (rm.i.f(gVarE) || bm.e.o(gVarE)) ? System.identityHashCode(this) : bm.e.g(gVarE).f54510a.hashCode();
        this.f48434a = iIdentityHashCode;
        return iIdentityHashCode;
    }

    @Override // pm.n0
    /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
    public final List f() {
        return ((g) this.f48435b.invoke()).f48432b;
    }

    public abstract boolean j(zk.g gVar);

    public List k(List list) {
        return list;
    }
}
