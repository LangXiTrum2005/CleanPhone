package zm;

import com.ironsource.sdk.controller.y;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import qk.i0;
import xj.v;
import xj.x;

/* JADX INFO: loaded from: classes4.dex */
public abstract class l extends m {
    public static i M(Iterator it) {
        kotlin.jvm.internal.n.f(it, "<this>");
        return new a(new an.r(it, 5));
    }

    public static int N(i iVar) {
        Iterator it = iVar.iterator();
        int i10 = 0;
        while (it.hasNext()) {
            it.next();
            i10++;
            if (i10 < 0) {
                xj.o.U();
                throw null;
            }
        }
        return i10;
    }

    public static i O(i iVar, int i10) {
        if (i10 < 0) {
            throw new IllegalArgumentException(defpackage.e.h(i10, "Requested element count ", " is less than zero.").toString());
        }
        if (i10 == 0) {
            return iVar;
        }
        return iVar instanceof c ? ((c) iVar).a(i10) : new b(iVar, i10, 0);
    }

    public static f P(i iVar, jk.b predicate) {
        kotlin.jvm.internal.n.f(predicate, "predicate");
        return new f(iVar, true, predicate);
    }

    public static final g Q(i iVar) {
        n nVar = new n(0);
        if (!(iVar instanceof s)) {
            return new g(iVar, new n(1), nVar);
        }
        s sVar = (s) iVar;
        return new g(sVar.f55130a, sVar.f55131b, nVar);
    }

    public static i R(Object obj, jk.b bVar) {
        if (obj == null) {
            return d.f55098a;
        }
        return new hk.i(1, new f.q(obj, 9), bVar);
    }

    public static i S(jk.a aVar) {
        return new a(new hk.i(1, aVar, new y(aVar, 11)));
    }

    public static String T(i iVar, String str) {
        kotlin.jvm.internal.n.f(iVar, "<this>");
        StringBuilder sb2 = new StringBuilder();
        sb2.append((CharSequence) "");
        int i10 = 0;
        for (Object obj : iVar) {
            i10++;
            if (i10 > 1) {
                sb2.append((CharSequence) str);
            }
            go.k.a(sb2, obj, null);
        }
        sb2.append((CharSequence) "");
        return sb2.toString();
    }

    public static s U(i iVar, jk.b transform) {
        kotlin.jvm.internal.n.f(iVar, "<this>");
        kotlin.jvm.internal.n.f(transform, "transform");
        return new s(iVar, transform);
    }

    public static f V(i iVar, jk.b transform) {
        kotlin.jvm.internal.n.f(transform, "transform");
        return new f(new s(iVar, transform), false, new n(2));
    }

    public static List W(i iVar) {
        Iterator it = iVar.iterator();
        if (!it.hasNext()) {
            return v.f53866a;
        }
        Object next = it.next();
        if (!it.hasNext()) {
            return j1.f.C(next);
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add(next);
        while (it.hasNext()) {
            arrayList.add(it.next());
        }
        return arrayList;
    }

    public static Set X(i iVar) {
        Iterator it = iVar.iterator();
        if (!it.hasNext()) {
            return x.f53868a;
        }
        Object next = it.next();
        if (!it.hasNext()) {
            return i0.k0(next);
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        linkedHashSet.add(next);
        while (it.hasNext()) {
            linkedHashSet.add(it.next());
        }
        return linkedHashSet;
    }
}
