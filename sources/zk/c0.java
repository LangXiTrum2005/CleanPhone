package zk;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
public final class c0 implements d0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f54962a;

    public c0(ArrayList arrayList) {
        this.f54962a = arrayList;
    }

    @Override // zk.d0
    public final void a(yl.c fqName, ArrayList arrayList) {
        kotlin.jvm.internal.n.f(fqName, "fqName");
        for (Object obj : this.f54962a) {
            if (kotlin.jvm.internal.n.a(((cl.h0) ((b0) obj)).f6518e, fqName)) {
                arrayList.add(obj);
            }
        }
    }

    @Override // zk.d0
    public final boolean b(yl.c fqName) {
        kotlin.jvm.internal.n.f(fqName, "fqName");
        ArrayList arrayList = this.f54962a;
        if (arrayList.isEmpty()) {
            return true;
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            if (kotlin.jvm.internal.n.a(((cl.h0) ((b0) it.next())).f6518e, fqName)) {
                return false;
            }
        }
        return true;
    }

    @Override // zk.d0
    public final Collection h(yl.c fqName, jk.b bVar) {
        kotlin.jvm.internal.n.f(fqName, "fqName");
        return zm.l.W(zm.l.P(zm.l.U(xj.n.g0(this.f54962a), q.f54991g), new al.n(fqName, 1)));
    }
}
