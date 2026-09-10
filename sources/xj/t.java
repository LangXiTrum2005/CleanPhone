package xj;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.RandomAccess;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
public abstract class t extends s {
    public static void a0(Iterable elements, Collection collection) {
        kotlin.jvm.internal.n.f(collection, "<this>");
        kotlin.jvm.internal.n.f(elements, "elements");
        if (elements instanceof Collection) {
            collection.addAll((Collection) elements);
            return;
        }
        Iterator it = elements.iterator();
        while (it.hasNext()) {
            collection.add(it.next());
        }
    }

    public static void b0(Collection collection, Object[] elements) {
        kotlin.jvm.internal.n.f(collection, "<this>");
        kotlin.jvm.internal.n.f(elements, "elements");
        collection.addAll(k.a0(elements));
    }

    public static final boolean c0(Collection collection, jk.b bVar, boolean z10) {
        Iterator it = collection.iterator();
        boolean z11 = false;
        while (it.hasNext()) {
            if (((Boolean) bVar.invoke(it.next())).booleanValue() == z10) {
                it.remove();
                z11 = true;
            }
        }
        return z11;
    }

    public static void d0(List list, jk.b bVar) {
        int iP;
        kotlin.jvm.internal.n.f(list, "<this>");
        if (!(list instanceof RandomAccess)) {
            if ((list instanceof kk.a) && !(list instanceof kk.b)) {
                kotlin.jvm.internal.h0.f(list, "kotlin.collections.MutableIterable");
                throw null;
            }
            try {
                c0(list, bVar, true);
                return;
            } catch (ClassCastException e10) {
                kotlin.jvm.internal.n.i(e10, kotlin.jvm.internal.h0.class.getName());
                throw e10;
            }
        }
        int iP2 = o.P(list);
        int i10 = 0;
        if (iP2 >= 0) {
            int i11 = 0;
            while (true) {
                Object obj = list.get(i10);
                if (!((Boolean) bVar.invoke(obj)).booleanValue()) {
                    if (i11 != i10) {
                        list.set(i11, obj);
                    }
                    i11++;
                }
                if (i10 == iP2) {
                    break;
                } else {
                    i10++;
                }
            }
            i10 = i11;
        }
        if (i10 >= list.size() || i10 > (iP = o.P(list))) {
            return;
        }
        while (true) {
            list.remove(iP);
            if (iP == i10) {
                return;
            } else {
                iP--;
            }
        }
    }
}
