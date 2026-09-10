package xj;

import java.io.IOException;
import java.util.AbstractCollection;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.ListIterator;
import java.util.NoSuchElementException;
import java.util.RandomAccess;
import java.util.Set;
import qk.i0;

/* JADX INFO: loaded from: classes4.dex */
public abstract class n extends t {
    public static ArrayList A0(Iterable iterable, Object obj) {
        if (iterable instanceof Collection) {
            return D0((Collection) iterable, obj);
        }
        ArrayList arrayList = new ArrayList();
        t.a0(iterable, arrayList);
        arrayList.add(obj);
        return arrayList;
    }

    public static ArrayList B0(Iterable elements, Collection collection) {
        kotlin.jvm.internal.n.f(collection, "<this>");
        kotlin.jvm.internal.n.f(elements, "elements");
        if (!(elements instanceof Collection)) {
            ArrayList arrayList = new ArrayList(collection);
            t.a0(elements, arrayList);
            return arrayList;
        }
        Collection collection2 = (Collection) elements;
        ArrayList arrayList2 = new ArrayList(collection2.size() + collection.size());
        arrayList2.addAll(collection);
        arrayList2.addAll(collection2);
        return arrayList2;
    }

    public static ArrayList C0(ArrayList arrayList, Object[] elements) {
        kotlin.jvm.internal.n.f(elements, "elements");
        ArrayList arrayList2 = new ArrayList(arrayList.size() + elements.length);
        arrayList2.addAll(arrayList);
        t.b0(arrayList2, elements);
        return arrayList2;
    }

    public static ArrayList D0(Collection collection, Object obj) {
        kotlin.jvm.internal.n.f(collection, "<this>");
        ArrayList arrayList = new ArrayList(collection.size() + 1);
        arrayList.addAll(collection);
        arrayList.add(obj);
        return arrayList;
    }

    public static Object E0(Iterable iterable) {
        kotlin.jvm.internal.n.f(iterable, "<this>");
        if (iterable instanceof List) {
            return F0((List) iterable);
        }
        Iterator it = iterable.iterator();
        if (!it.hasNext()) {
            throw new NoSuchElementException("Collection is empty.");
        }
        Object next = it.next();
        if (it.hasNext()) {
            throw new IllegalArgumentException("Collection has more than one element.");
        }
        return next;
    }

    public static Object F0(List list) {
        kotlin.jvm.internal.n.f(list, "<this>");
        int size = list.size();
        if (size == 0) {
            throw new NoSuchElementException("List is empty.");
        }
        if (size == 1) {
            return list.get(0);
        }
        throw new IllegalArgumentException("List has more than one element.");
    }

    public static Object G0(Iterable iterable) {
        kotlin.jvm.internal.n.f(iterable, "<this>");
        if (iterable instanceof List) {
            List list = (List) iterable;
            if (list.size() == 1) {
                return list.get(0);
            }
            return null;
        }
        Iterator it = iterable.iterator();
        if (!it.hasNext()) {
            return null;
        }
        Object next = it.next();
        if (it.hasNext()) {
            return null;
        }
        return next;
    }

    public static Object H0(List list) {
        kotlin.jvm.internal.n.f(list, "<this>");
        if (list.size() == 1) {
            return list.get(0);
        }
        return null;
    }

    public static List I0(Iterable iterable, Comparator comparator) {
        kotlin.jvm.internal.n.f(iterable, "<this>");
        kotlin.jvm.internal.n.f(comparator, "comparator");
        if (!(iterable instanceof Collection)) {
            List listP0 = P0(iterable);
            s.Z(comparator, listP0);
            return listP0;
        }
        Collection collection = (Collection) iterable;
        if (collection.size() <= 1) {
            return N0(iterable);
        }
        Object[] array = collection.toArray(new Object[0]);
        kotlin.jvm.internal.n.f(array, "<this>");
        if (array.length > 1) {
            Arrays.sort(array, comparator);
        }
        return k.a0(array);
    }

    public static Set J0(Iterable iterable, Set other) {
        kotlin.jvm.internal.n.f(iterable, "<this>");
        kotlin.jvm.internal.n.f(other, "other");
        Set setQ0 = Q0(iterable);
        setQ0.removeAll(other);
        return setQ0;
    }

    public static List K0(Iterable iterable, int i10) {
        kotlin.jvm.internal.n.f(iterable, "<this>");
        if (i10 < 0) {
            throw new IllegalArgumentException(defpackage.e.h(i10, "Requested element count ", " is less than zero.").toString());
        }
        if (i10 == 0) {
            return v.f53866a;
        }
        if (iterable instanceof Collection) {
            if (i10 >= ((Collection) iterable).size()) {
                return N0(iterable);
            }
            if (i10 == 1) {
                return j1.f.C(n0(iterable));
            }
        }
        ArrayList arrayList = new ArrayList(i10);
        Iterator it = iterable.iterator();
        int i11 = 0;
        while (it.hasNext()) {
            arrayList.add(it.next());
            i11++;
            if (i11 == i10) {
                break;
            }
        }
        return o.T(arrayList);
    }

    public static void L0(Iterable iterable, AbstractCollection abstractCollection) {
        kotlin.jvm.internal.n.f(iterable, "<this>");
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            abstractCollection.add(it.next());
        }
    }

    public static HashSet M0(Iterable iterable) {
        kotlin.jvm.internal.n.f(iterable, "<this>");
        HashSet hashSet = new HashSet(b0.O(p.W(iterable, 12)));
        L0(iterable, hashSet);
        return hashSet;
    }

    public static List N0(Iterable iterable) {
        kotlin.jvm.internal.n.f(iterable, "<this>");
        if (!(iterable instanceof Collection)) {
            return o.T(P0(iterable));
        }
        Collection collection = (Collection) iterable;
        int size = collection.size();
        if (size == 0) {
            return v.f53866a;
        }
        if (size != 1) {
            return O0(collection);
        }
        return j1.f.C(iterable instanceof List ? ((List) iterable).get(0) : collection.iterator().next());
    }

    public static ArrayList O0(Collection collection) {
        kotlin.jvm.internal.n.f(collection, "<this>");
        return new ArrayList(collection);
    }

    public static final List P0(Iterable iterable) {
        kotlin.jvm.internal.n.f(iterable, "<this>");
        if (iterable instanceof Collection) {
            return O0((Collection) iterable);
        }
        ArrayList arrayList = new ArrayList();
        L0(iterable, arrayList);
        return arrayList;
    }

    public static Set Q0(Iterable iterable) {
        kotlin.jvm.internal.n.f(iterable, "<this>");
        if (iterable instanceof Collection) {
            return new LinkedHashSet((Collection) iterable);
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        L0(iterable, linkedHashSet);
        return linkedHashSet;
    }

    public static Set R0(Iterable iterable) {
        kotlin.jvm.internal.n.f(iterable, "<this>");
        if (iterable instanceof Collection) {
            Collection collection = (Collection) iterable;
            int size = collection.size();
            if (size != 0) {
                if (size == 1) {
                    return i0.k0(iterable instanceof List ? ((List) iterable).get(0) : collection.iterator().next());
                }
                LinkedHashSet linkedHashSet = new LinkedHashSet(b0.O(collection.size()));
                L0(iterable, linkedHashSet);
                return linkedHashSet;
            }
        } else {
            LinkedHashSet linkedHashSet2 = new LinkedHashSet();
            L0(iterable, linkedHashSet2);
            int size2 = linkedHashSet2.size();
            if (size2 != 0) {
                return size2 != 1 ? linkedHashSet2 : i0.k0(linkedHashSet2.iterator().next());
            }
        }
        return x.f53868a;
    }

    public static Set S0(Set set, Collection other) {
        kotlin.jvm.internal.n.f(set, "<this>");
        kotlin.jvm.internal.n.f(other, "other");
        Set setQ0 = Q0(set);
        t.a0(other, setQ0);
        return setQ0;
    }

    public static m T0(Iterable iterable) {
        kotlin.jvm.internal.n.f(iterable, "<this>");
        return new m(new f.q(iterable, 7), 1);
    }

    public static ArrayList U0(Iterable iterable, Iterable other) {
        kotlin.jvm.internal.n.f(iterable, "<this>");
        kotlin.jvm.internal.n.f(other, "other");
        Iterator it = iterable.iterator();
        Iterator it2 = other.iterator();
        ArrayList arrayList = new ArrayList(Math.min(p.W(iterable, 10), p.W(other, 10)));
        while (it.hasNext() && it2.hasNext()) {
            arrayList.add(new wj.f(it.next(), it2.next()));
        }
        return arrayList;
    }

    public static final int e0(d0 d0Var, int i10) {
        if (i10 >= 0 && i10 <= o.P(d0Var)) {
            return o.P(d0Var) - i10;
        }
        StringBuilder sbU = defpackage.e.u(i10, "Element index ", " must be in range [");
        sbU.append(new pk.c(0, o.P(d0Var), 1));
        sbU.append("].");
        throw new IndexOutOfBoundsException(sbU.toString());
    }

    public static final int f0(d0 d0Var, int i10) {
        if (i10 >= 0 && i10 <= d0Var.size()) {
            return d0Var.size() - i10;
        }
        StringBuilder sbU = defpackage.e.u(i10, "Position index ", " must be in range [");
        sbU.append(new pk.c(0, d0Var.size(), 1));
        sbU.append("].");
        throw new IndexOutOfBoundsException(sbU.toString());
    }

    public static an.r g0(Iterable iterable) {
        kotlin.jvm.internal.n.f(iterable, "<this>");
        return new an.r(iterable, 3);
    }

    public static ArrayList h0(Iterable iterable) {
        kotlin.jvm.internal.n.f(iterable, "<this>");
        if (!(iterable instanceof RandomAccess) || !(iterable instanceof List)) {
            ArrayList arrayList = new ArrayList();
            Iterator iterator = iterable.iterator();
            kotlin.jvm.internal.n.f(iterator, "iterator");
            Iterator itY = !iterator.hasNext() ? u.f53865a : no.b.y(new h0(iterator, null));
            while (itY.hasNext()) {
                arrayList.add((List) itY.next());
            }
            return arrayList;
        }
        List list = (List) iterable;
        int size = list.size();
        ArrayList arrayList2 = new ArrayList((size / 400) + (size % 400 == 0 ? 0 : 1));
        for (int i10 = 0; i10 >= 0 && i10 < size; i10 += 400) {
            int i11 = size - i10;
            if (400 <= i11) {
                i11 = 400;
            }
            ArrayList arrayList3 = new ArrayList(i11);
            for (int i12 = 0; i12 < i11; i12++) {
                arrayList3.add(list.get(i12 + i10));
            }
            arrayList2.add(arrayList3);
        }
        return arrayList2;
    }

    public static boolean i0(Iterable iterable, Object obj) {
        int iIndexOf;
        kotlin.jvm.internal.n.f(iterable, "<this>");
        if (iterable instanceof Collection) {
            return ((Collection) iterable).contains(obj);
        }
        if (iterable instanceof List) {
            iIndexOf = ((List) iterable).indexOf(obj);
        } else {
            int i10 = 0;
            for (Object obj2 : iterable) {
                if (i10 < 0) {
                    o.V();
                    throw null;
                }
                if (kotlin.jvm.internal.n.a(obj, obj2)) {
                    iIndexOf = i10;
                } else {
                    i10++;
                }
            }
            iIndexOf = -1;
        }
        return iIndexOf >= 0;
    }

    public static List j0(Iterable iterable) {
        kotlin.jvm.internal.n.f(iterable, "<this>");
        return N0(Q0(iterable));
    }

    public static List k0(Iterable iterable, int i10) {
        ArrayList arrayList;
        kotlin.jvm.internal.n.f(iterable, "<this>");
        if (i10 < 0) {
            throw new IllegalArgumentException(defpackage.e.h(i10, "Requested element count ", " is less than zero.").toString());
        }
        if (i10 == 0) {
            return N0(iterable);
        }
        if (iterable instanceof Collection) {
            int size = ((Collection) iterable).size() - i10;
            if (size <= 0) {
                return v.f53866a;
            }
            if (size == 1) {
                return j1.f.C(v0(iterable));
            }
            arrayList = new ArrayList(size);
            if (iterable instanceof List) {
                if (iterable instanceof RandomAccess) {
                    List list = (List) iterable;
                    int size2 = list.size();
                    while (i10 < size2) {
                        arrayList.add(list.get(i10));
                        i10++;
                    }
                } else {
                    ListIterator listIterator = ((List) iterable).listIterator(i10);
                    while (listIterator.hasNext()) {
                        arrayList.add(listIterator.next());
                    }
                }
                return arrayList;
            }
        } else {
            arrayList = new ArrayList();
        }
        int i11 = 0;
        for (Object obj : iterable) {
            if (i11 >= i10) {
                arrayList.add(obj);
            } else {
                i11++;
            }
        }
        return o.T(arrayList);
    }

    public static List l0(List list) {
        kotlin.jvm.internal.n.f(list, "<this>");
        List list2 = list;
        int size = list.size() - 1;
        if (size < 0) {
            size = 0;
        }
        return K0(list2, size);
    }

    public static ArrayList m0(Iterable iterable) {
        kotlin.jvm.internal.n.f(iterable, "<this>");
        ArrayList arrayList = new ArrayList();
        for (Object obj : iterable) {
            if (obj != null) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    public static Object n0(Iterable iterable) {
        kotlin.jvm.internal.n.f(iterable, "<this>");
        if (iterable instanceof List) {
            return o0((List) iterable);
        }
        Iterator it = iterable.iterator();
        if (it.hasNext()) {
            return it.next();
        }
        throw new NoSuchElementException("Collection is empty.");
    }

    public static Object o0(List list) {
        kotlin.jvm.internal.n.f(list, "<this>");
        if (list.isEmpty()) {
            throw new NoSuchElementException("List is empty.");
        }
        return list.get(0);
    }

    public static Object p0(Iterable iterable) {
        if (iterable instanceof List) {
            List list = (List) iterable;
            if (list.isEmpty()) {
                return null;
            }
            return list.get(0);
        }
        Iterator it = iterable.iterator();
        if (it.hasNext()) {
            return it.next();
        }
        return null;
    }

    public static Object q0(List list) {
        kotlin.jvm.internal.n.f(list, "<this>");
        if (list.isEmpty()) {
            return null;
        }
        return list.get(0);
    }

    public static Object r0(int i10, List list) {
        kotlin.jvm.internal.n.f(list, "<this>");
        if (i10 < 0 || i10 >= list.size()) {
            return null;
        }
        return list.get(i10);
    }

    public static final void s0(Iterable iterable, Appendable buffer, CharSequence charSequence, CharSequence prefix, CharSequence postfix, CharSequence charSequence2, jk.b bVar) throws IOException {
        kotlin.jvm.internal.n.f(iterable, "<this>");
        kotlin.jvm.internal.n.f(buffer, "buffer");
        kotlin.jvm.internal.n.f(prefix, "prefix");
        kotlin.jvm.internal.n.f(postfix, "postfix");
        buffer.append(prefix);
        int i10 = 0;
        for (Object obj : iterable) {
            i10++;
            if (i10 > 1) {
                buffer.append(charSequence);
            }
            go.k.a(buffer, obj, bVar);
        }
        buffer.append(postfix);
    }

    public static /* synthetic */ void t0(Iterable iterable, StringBuilder sb2, String str, String str2, String str3, jk.b bVar, int i10) throws IOException {
        if ((i10 & 4) != 0) {
            str2 = "";
        }
        if ((i10 & 8) != 0) {
            str3 = "";
        }
        if ((i10 & 64) != 0) {
            bVar = null;
        }
        s0(iterable, sb2, str, str2, str3, "...", bVar);
    }

    public static String u0(Iterable iterable, String str, String str2, String str3, jk.b bVar, int i10) throws IOException {
        if ((i10 & 1) != 0) {
            str = ", ";
        }
        String str4 = str;
        String prefix = (i10 & 2) != 0 ? "" : str2;
        String str5 = (i10 & 4) != 0 ? "" : str3;
        if ((i10 & 32) != 0) {
            bVar = null;
        }
        kotlin.jvm.internal.n.f(iterable, "<this>");
        kotlin.jvm.internal.n.f(prefix, "prefix");
        StringBuilder sb2 = new StringBuilder();
        s0(iterable, sb2, str4, prefix, str5, "...", bVar);
        return sb2.toString();
    }

    public static Object v0(Iterable iterable) {
        kotlin.jvm.internal.n.f(iterable, "<this>");
        if (iterable instanceof List) {
            return w0((List) iterable);
        }
        Iterator it = iterable.iterator();
        if (!it.hasNext()) {
            throw new NoSuchElementException("Collection is empty.");
        }
        Object next = it.next();
        while (it.hasNext()) {
            next = it.next();
        }
        return next;
    }

    public static Object w0(List list) {
        kotlin.jvm.internal.n.f(list, "<this>");
        if (list.isEmpty()) {
            throw new NoSuchElementException("List is empty.");
        }
        return list.get(o.P(list));
    }

    public static Object x0(List list) {
        kotlin.jvm.internal.n.f(list, "<this>");
        if (list.isEmpty()) {
            return null;
        }
        return list.get(list.size() - 1);
    }

    public static ArrayList y0(Iterable iterable, Object obj) {
        kotlin.jvm.internal.n.f(iterable, "<this>");
        ArrayList arrayList = new ArrayList(p.W(iterable, 10));
        boolean z10 = false;
        for (Object obj2 : iterable) {
            boolean z11 = true;
            if (!z10 && kotlin.jvm.internal.n.a(obj2, obj)) {
                z10 = true;
                z11 = false;
            }
            if (z11) {
                arrayList.add(obj2);
            }
        }
        return arrayList;
    }

    public static ArrayList z0(Iterable iterable, Iterable iterable2) {
        kotlin.jvm.internal.n.f(iterable, "<this>");
        if (iterable instanceof Collection) {
            return B0(iterable2, (Collection) iterable);
        }
        ArrayList arrayList = new ArrayList();
        t.a0(iterable, arrayList);
        t.a0(iterable2, arrayList);
        return arrayList;
    }
}
