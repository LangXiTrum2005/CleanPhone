package xj;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
public abstract class p extends o {
    public static int W(Iterable iterable, int i10) {
        kotlin.jvm.internal.n.f(iterable, "<this>");
        return iterable instanceof Collection ? ((Collection) iterable).size() : i10;
    }

    public static ArrayList X(Iterable iterable) {
        kotlin.jvm.internal.n.f(iterable, "<this>");
        ArrayList arrayList = new ArrayList();
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            t.a0((Iterable) it.next(), arrayList);
        }
        return arrayList;
    }
}
