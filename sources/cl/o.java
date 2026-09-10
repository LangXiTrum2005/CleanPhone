package cl;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
public final class o implements zk.d0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f6580a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f6581b;

    public o(String debugName, List list) {
        kotlin.jvm.internal.n.f(debugName, "debugName");
        this.f6580a = list;
        this.f6581b = debugName;
        list.size();
        xj.n.R0(list).size();
    }

    @Override // zk.d0
    public final void a(yl.c fqName, ArrayList arrayList) {
        kotlin.jvm.internal.n.f(fqName, "fqName");
        Iterator it = this.f6580a.iterator();
        while (it.hasNext()) {
            zk.u.b((zk.d0) it.next(), fqName, arrayList);
        }
    }

    @Override // zk.d0
    public final boolean b(yl.c fqName) {
        kotlin.jvm.internal.n.f(fqName, "fqName");
        List list = this.f6580a;
        if ((list instanceof Collection) && list.isEmpty()) {
            return true;
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            if (!zk.u.h((zk.d0) it.next(), fqName)) {
                return false;
            }
        }
        return true;
    }

    @Override // zk.d0
    public final Collection h(yl.c fqName, jk.b bVar) {
        kotlin.jvm.internal.n.f(fqName, "fqName");
        HashSet hashSet = new HashSet();
        Iterator it = this.f6580a.iterator();
        while (it.hasNext()) {
            hashSet.addAll(((zk.d0) it.next()).h(fqName, bVar));
        }
        return hashSet;
    }

    public final String toString() {
        return this.f6581b;
    }
}
