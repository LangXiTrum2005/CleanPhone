package xj;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
public abstract class o extends j1.f {
    public static ArrayList M(Object... elements) {
        kotlin.jvm.internal.n.f(elements, "elements");
        return elements.length == 0 ? new ArrayList() : new ArrayList(new i(elements, true));
    }

    public static int N(ArrayList arrayList, Comparable comparable) {
        int size = arrayList.size();
        int size2 = arrayList.size();
        int i10 = 0;
        if (size < 0) {
            throw new IllegalArgumentException(l1.d.f("fromIndex (", 0, ") is greater than toIndex (", size, ")."));
        }
        if (size > size2) {
            throw new IndexOutOfBoundsException(l1.d.f("toIndex (", size, ") is greater than size (", size2, ")."));
        }
        int i11 = size - 1;
        while (i10 <= i11) {
            int i12 = (i10 + i11) >>> 1;
            int iH = j1.f.h((Comparable) arrayList.get(i12), comparable);
            if (iH < 0) {
                i10 = i12 + 1;
            } else {
                if (iH <= 0) {
                    return i12;
                }
                i11 = i12 - 1;
            }
        }
        return -(i10 + 1);
    }

    public static pk.c O(Collection collection) {
        kotlin.jvm.internal.n.f(collection, "<this>");
        return new pk.c(0, collection.size() - 1, 1);
    }

    public static int P(List list) {
        kotlin.jvm.internal.n.f(list, "<this>");
        return list.size() - 1;
    }

    public static List Q(Object... elements) {
        kotlin.jvm.internal.n.f(elements, "elements");
        return elements.length > 0 ? k.a0(elements) : v.f53866a;
    }

    public static List R(Object obj) {
        return obj != null ? j1.f.C(obj) : v.f53866a;
    }

    public static ArrayList S(Object... elements) {
        kotlin.jvm.internal.n.f(elements, "elements");
        return elements.length == 0 ? new ArrayList() : new ArrayList(new i(elements, true));
    }

    public static final List T(List list) {
        int size = list.size();
        if (size != 0) {
            return size != 1 ? list : j1.f.C(list.get(0));
        }
        return v.f53866a;
    }

    public static void U() {
        throw new ArithmeticException("Count overflow has happened.");
    }

    public static void V() {
        throw new ArithmeticException("Index overflow has happened.");
    }
}
