package al;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import pm.u0;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
public final class p implements j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final j f3657a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final u0 f3658b;

    public p(j jVar, u0 u0Var) {
        this.f3657a = jVar;
        this.f3658b = u0Var;
    }

    @Override // al.j
    public final boolean c(yl.c fqName) {
        kotlin.jvm.internal.n.f(fqName, "fqName");
        if (((Boolean) this.f3658b.invoke(fqName)).booleanValue()) {
            return this.f3657a.c(fqName);
        }
        return false;
    }

    @Override // al.j
    public final c d(yl.c fqName) {
        kotlin.jvm.internal.n.f(fqName, "fqName");
        if (((Boolean) this.f3658b.invoke(fqName)).booleanValue()) {
            return this.f3657a.d(fqName);
        }
        return null;
    }

    @Override // al.j
    public final boolean isEmpty() {
        j jVar = this.f3657a;
        if ((jVar instanceof Collection) && ((Collection) jVar).isEmpty()) {
            return false;
        }
        Iterator it = jVar.iterator();
        while (it.hasNext()) {
            yl.c cVarE = ((c) it.next()).e();
            if (cVarE != null && ((Boolean) this.f3658b.invoke(cVarE)).booleanValue()) {
                return true;
            }
        }
        return false;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        ArrayList arrayList = new ArrayList();
        for (Object obj : this.f3657a) {
            yl.c cVarE = ((c) obj).e();
            if (cVarE != null && ((Boolean) this.f3658b.invoke(cVarE)).booleanValue()) {
                arrayList.add(obj);
            }
        }
        return arrayList.iterator();
    }
}
