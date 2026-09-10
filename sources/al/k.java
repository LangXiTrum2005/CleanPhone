package al;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import xj.u;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
public final class k implements j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3646a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f3647b;

    public /* synthetic */ k(List list, int i10) {
        this.f3646a = i10;
        this.f3647b = list;
    }

    @Override // al.j
    public final boolean c(yl.c fqName) {
        switch (this.f3646a) {
            case 0:
                return com.google.android.gms.internal.auth.o.r(this, fqName);
            case 1:
                kotlin.jvm.internal.n.f(fqName, "fqName");
                Iterator it = ((Iterable) xj.n.g0((List) this.f3647b).f3793b).iterator();
                while (it.hasNext()) {
                    if (((j) it.next()).c(fqName)) {
                        return true;
                    }
                }
                return false;
            default:
                return com.google.android.gms.internal.auth.o.r(this, fqName);
        }
    }

    @Override // al.j
    public final c d(yl.c fqName) {
        switch (this.f3646a) {
            case 0:
                return com.google.android.gms.internal.auth.o.f(this, fqName);
            case 1:
                kotlin.jvm.internal.n.f(fqName, "fqName");
                zm.e eVar = new zm.e(zm.l.V(xj.n.g0((List) this.f3647b), new n(fqName, 0)));
                return (c) (!eVar.hasNext() ? null : eVar.next());
            default:
                kotlin.jvm.internal.n.f(fqName, "fqName");
                if (fqName.equals((yl.c) this.f3647b)) {
                    return ql.b.f49133a;
                }
                return null;
        }
    }

    @Override // al.j
    public final boolean isEmpty() {
        switch (this.f3646a) {
            case 0:
                return ((List) this.f3647b).isEmpty();
            case 1:
                List list = (List) this.f3647b;
                if ((list instanceof Collection) && list.isEmpty()) {
                    return true;
                }
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    if (!((j) it.next()).isEmpty()) {
                        return false;
                    }
                }
                return true;
            default:
                return false;
        }
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        switch (this.f3646a) {
            case 0:
                return ((List) this.f3647b).iterator();
            case 1:
                return new zm.e(new zm.g(xj.n.g0((List) this.f3647b), o.f3656e, zm.o.f55118b));
            default:
                return u.f53865a;
        }
    }

    public String toString() {
        switch (this.f3646a) {
            case 0:
                return ((List) this.f3647b).toString();
            default:
                return super.toString();
        }
    }

    public k(j[] jVarArr) {
        this.f3646a = 1;
        this.f3647b = xj.k.C0(jVarArr);
    }

    public k(yl.c fqNameToMatch) {
        this.f3646a = 2;
        kotlin.jvm.internal.n.f(fqNameToMatch, "fqNameToMatch");
        this.f3647b = fqNameToMatch;
    }
}
