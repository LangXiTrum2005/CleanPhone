package kotlin.collections;

import androidx.media3.extractor.text.ttml.a;
import androidx.room.c;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.ListIterator;
import java.util.NoSuchElementException;
import java.util.RandomAccess;
import java.util.Set;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.collections.builders.ListBuilder;
import kotlin.comparisons.ComparisonsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.TypeIntrinsics;
import kotlin.jvm.internal.markers.KMappedMarker;
import kotlin.jvm.internal.markers.KMutableIterable;
import kotlin.ranges.IntRange;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"kotlin/collections/CollectionsKt__CollectionsJVMKt", "kotlin/collections/CollectionsKt__CollectionsKt", "kotlin/collections/CollectionsKt__IterablesKt", "kotlin/collections/CollectionsKt__IteratorsJVMKt", "kotlin/collections/CollectionsKt__IteratorsKt", "kotlin/collections/CollectionsKt__MutableCollectionsJVMKt", "kotlin/collections/CollectionsKt__MutableCollectionsKt", "kotlin/collections/CollectionsKt__ReversedViewsKt", "kotlin/collections/CollectionsKt___CollectionsJvmKt", "kotlin/collections/CollectionsKt___CollectionsKt"}, k = 4, mv = {2, 1, 0}, xi = 49)
public final class CollectionsKt extends CollectionsKt___CollectionsKt {
    public static int A(List list) {
        Intrinsics.f(list, "<this>");
        return list.size() - 1;
    }

    public static Object B(int i2, List list) {
        Intrinsics.f(list, "<this>");
        if (i2 < 0 || i2 >= list.size()) {
            return null;
        }
        return list.get(i2);
    }

    public static /* synthetic */ void C(Iterable iterable, StringBuilder sb, String str, String str2, String str3, Function1 function1, int i2) {
        if ((i2 & 4) != 0) {
            str2 = "";
        }
        if ((i2 & 8) != 0) {
            str3 = "";
        }
        if ((i2 & 64) != 0) {
            function1 = null;
        }
        CollectionsKt___CollectionsKt.e(iterable, sb, str, str2, str3, "...", function1);
    }

    public static String D(Iterable iterable, String str, String str2, String str3, Function1 function1, int i2) {
        if ((i2 & 1) != 0) {
            str = ", ";
        }
        String str4 = str;
        String prefix = (i2 & 2) != 0 ? "" : str2;
        String str5 = (i2 & 4) != 0 ? "" : str3;
        if ((i2 & 32) != 0) {
            function1 = null;
        }
        Intrinsics.f(iterable, "<this>");
        Intrinsics.f(prefix, "prefix");
        StringBuilder sb = new StringBuilder();
        CollectionsKt___CollectionsKt.e(iterable, sb, str4, prefix, str5, "...", function1);
        return sb.toString();
    }

    public static Object E(Iterable iterable) {
        if (iterable instanceof List) {
            return F((List) iterable);
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

    public static Object F(List list) {
        Intrinsics.f(list, "<this>");
        if (list.isEmpty()) {
            throw new NoSuchElementException("List is empty.");
        }
        return list.get(A(list));
    }

    public static Object G(List list) {
        Intrinsics.f(list, "<this>");
        if (list.isEmpty()) {
            return null;
        }
        return a.h(1, list);
    }

    public static List H(Object obj) {
        List listSingletonList = Collections.singletonList(obj);
        Intrinsics.e(listSingletonList, "singletonList(...)");
        return listSingletonList;
    }

    public static List I(Object... elements) {
        Intrinsics.f(elements, "elements");
        return elements.length > 0 ? ArraysKt.e(elements) : EmptyList.X;
    }

    public static List J(Object obj) {
        return obj != null ? H(obj) : EmptyList.X;
    }

    public static ArrayList K(Iterable iterable, Object obj) {
        Intrinsics.f(iterable, "<this>");
        ArrayList arrayList = new ArrayList(n(iterable, 10));
        boolean z2 = false;
        for (Object obj2 : iterable) {
            boolean z3 = true;
            if (!z2 && Intrinsics.a(obj2, obj)) {
                z2 = true;
                z3 = false;
            }
            if (z3) {
                arrayList.add(obj2);
            }
        }
        return arrayList;
    }

    public static ArrayList L(Object... elements) {
        Intrinsics.f(elements, "elements");
        return elements.length == 0 ? new ArrayList() : new ArrayList(new ArrayAsCollection(elements, true));
    }

    public static ArrayList M(Iterable iterable, Iterable iterable2) {
        Intrinsics.f(iterable, "<this>");
        if (iterable instanceof Collection) {
            return O(iterable2, (Collection) iterable);
        }
        ArrayList arrayList = new ArrayList();
        g(iterable, arrayList);
        g(iterable2, arrayList);
        return arrayList;
    }

    public static ArrayList N(Iterable iterable, Object obj) {
        if (iterable instanceof Collection) {
            return P(obj, (Collection) iterable);
        }
        ArrayList arrayList = new ArrayList();
        g(iterable, arrayList);
        arrayList.add(obj);
        return arrayList;
    }

    public static ArrayList O(Iterable elements, Collection collection) {
        Intrinsics.f(collection, "<this>");
        Intrinsics.f(elements, "elements");
        if (!(elements instanceof Collection)) {
            ArrayList arrayList = new ArrayList(collection);
            g(elements, arrayList);
            return arrayList;
        }
        Collection collection2 = (Collection) elements;
        ArrayList arrayList2 = new ArrayList(collection2.size() + collection.size());
        arrayList2.addAll(collection);
        arrayList2.addAll(collection2);
        return arrayList2;
    }

    public static ArrayList P(Object obj, Collection collection) {
        Intrinsics.f(collection, "<this>");
        ArrayList arrayList = new ArrayList(collection.size() + 1);
        arrayList.addAll(collection);
        arrayList.add(obj);
        return arrayList;
    }

    public static void Q(List list, Function1 predicate) {
        int iA;
        Intrinsics.f(list, "<this>");
        Intrinsics.f(predicate, "predicate");
        if (!(list instanceof RandomAccess)) {
            if ((list instanceof KMappedMarker) && !(list instanceof KMutableIterable)) {
                TypeIntrinsics.f(list, "kotlin.collections.MutableIterable");
                throw null;
            }
            try {
                CollectionsKt__MutableCollectionsKt.b(list, predicate, true);
                return;
            } catch (ClassCastException e2) {
                Intrinsics.j(e2, TypeIntrinsics.class.getName());
                throw e2;
            }
        }
        int iA2 = A(list);
        int i2 = 0;
        if (iA2 >= 0) {
            int i3 = 0;
            while (true) {
                Object obj = list.get(i2);
                if (!((Boolean) predicate.invoke(obj)).booleanValue()) {
                    if (i3 != i2) {
                        list.set(i3, obj);
                    }
                    i3++;
                }
                if (i2 == iA2) {
                    break;
                } else {
                    i2++;
                }
            }
            i2 = i3;
        }
        if (i2 >= list.size() || i2 > (iA = A(list))) {
            return;
        }
        while (true) {
            list.remove(iA);
            if (iA == i2) {
                return;
            } else {
                iA--;
            }
        }
    }

    public static Object R(List list) {
        Intrinsics.f(list, "<this>");
        if (list.isEmpty()) {
            throw new NoSuchElementException("List is empty.");
        }
        return list.remove(0);
    }

    public static Object S(List list) {
        Intrinsics.f(list, "<this>");
        if (list.isEmpty()) {
            return null;
        }
        return list.remove(0);
    }

    public static Object T(List list) {
        Intrinsics.f(list, "<this>");
        if (list.isEmpty()) {
            throw new NoSuchElementException("List is empty.");
        }
        return list.remove(A(list));
    }

    public static void U(Iterable iterable, Function1 function1) {
        CollectionsKt__MutableCollectionsKt.b((Collection) iterable, function1, false);
    }

    public static Object V(Iterable iterable) {
        Intrinsics.f(iterable, "<this>");
        if (iterable instanceof List) {
            return W((List) iterable);
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

    public static Object W(List list) {
        Intrinsics.f(list, "<this>");
        int size = list.size();
        if (size == 0) {
            throw new NoSuchElementException("List is empty.");
        }
        if (size == 1) {
            return list.get(0);
        }
        throw new IllegalArgumentException("List has more than one element.");
    }

    public static Object X(Iterable iterable) {
        Intrinsics.f(iterable, "<this>");
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

    public static Object Y(List list) {
        Intrinsics.f(list, "<this>");
        if (list.size() == 1) {
            return list.get(0);
        }
        return null;
    }

    public static void Z(List list) {
        if (list.size() > 1) {
            Collections.sort(list);
        }
    }

    public static void a0(List list, Comparator comparator) {
        Intrinsics.f(list, "<this>");
        Intrinsics.f(comparator, "comparator");
        if (list.size() > 1) {
            Collections.sort(list, comparator);
        }
    }

    public static List b0(Iterable iterable) {
        Intrinsics.f(iterable, "<this>");
        if (!(iterable instanceof Collection)) {
            List listF = CollectionsKt___CollectionsKt.f(iterable);
            Z(listF);
            return listF;
        }
        Collection collection = (Collection) iterable;
        if (collection.size() <= 1) {
            return i0(iterable);
        }
        Object[] array = collection.toArray(new Comparable[0]);
        Comparable[] comparableArr = (Comparable[]) array;
        Intrinsics.f(comparableArr, "<this>");
        if (comparableArr.length > 1) {
            Arrays.sort(comparableArr);
        }
        return ArraysKt.e(array);
    }

    public static List c0(Comparator comparator, Iterable iterable) {
        Intrinsics.f(iterable, "<this>");
        Intrinsics.f(comparator, "comparator");
        if (!(iterable instanceof Collection)) {
            List listF = CollectionsKt___CollectionsKt.f(iterable);
            a0(listF, comparator);
            return listF;
        }
        Collection collection = (Collection) iterable;
        if (collection.size() <= 1) {
            return i0(iterable);
        }
        Object[] array = collection.toArray(new Object[0]);
        Intrinsics.f(array, "<this>");
        if (array.length > 1) {
            Arrays.sort(array, comparator);
        }
        return ArraysKt.e(array);
    }

    public static List d0(Iterable iterable, int i2) {
        Intrinsics.f(iterable, "<this>");
        if (i2 < 0) {
            throw new IllegalArgumentException(androidx.datastore.preferences.protobuf.a.k("Requested element count ", i2, " is less than zero.").toString());
        }
        if (i2 == 0) {
            return EmptyList.X;
        }
        if (iterable instanceof Collection) {
            if (i2 >= ((Collection) iterable).size()) {
                return i0(iterable);
            }
            if (i2 == 1) {
                return H(v(iterable));
            }
        }
        ArrayList arrayList = new ArrayList(i2);
        Iterator it = iterable.iterator();
        int i3 = 0;
        while (it.hasNext()) {
            arrayList.add(it.next());
            i3++;
            if (i3 == i2) {
                break;
            }
        }
        return CollectionsKt__CollectionsKt.a(arrayList);
    }

    public static List e0(int i2, List list) {
        Intrinsics.f(list, "<this>");
        if (i2 < 0) {
            throw new IllegalArgumentException(androidx.datastore.preferences.protobuf.a.k("Requested element count ", i2, " is less than zero.").toString());
        }
        if (i2 == 0) {
            return EmptyList.X;
        }
        int size = list.size();
        if (i2 >= size) {
            return i0(list);
        }
        if (i2 == 1) {
            return H(F(list));
        }
        ArrayList arrayList = new ArrayList(i2);
        if (list instanceof RandomAccess) {
            for (int i3 = size - i2; i3 < size; i3++) {
                arrayList.add(list.get(i3));
            }
        } else {
            ListIterator listIterator = list.listIterator(size - i2);
            while (listIterator.hasNext()) {
                arrayList.add(listIterator.next());
            }
        }
        return arrayList;
    }

    public static void f0() {
        throw new ArithmeticException("Index overflow has happened.");
    }

    public static void g(Iterable elements, Collection collection) {
        Intrinsics.f(collection, "<this>");
        Intrinsics.f(elements, "elements");
        if (elements instanceof Collection) {
            collection.addAll((Collection) elements);
            return;
        }
        Iterator it = elements.iterator();
        while (it.hasNext()) {
            collection.add(it.next());
        }
    }

    public static void g0(Iterable iterable, java.util.AbstractCollection destination) {
        Intrinsics.f(iterable, "<this>");
        Intrinsics.f(destination, "destination");
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            destination.add(it.next());
        }
    }

    public static void h(Collection collection, Object[] elements) {
        Intrinsics.f(collection, "<this>");
        Intrinsics.f(elements, "elements");
        collection.addAll(ArraysKt.e(elements));
    }

    public static int[] h0(Collection collection) {
        int[] iArr = new int[collection.size()];
        Iterator it = collection.iterator();
        int i2 = 0;
        while (it.hasNext()) {
            iArr[i2] = ((Number) it.next()).intValue();
            i2++;
        }
        return iArr;
    }

    public static ArrayList i(Object... objArr) {
        return objArr.length == 0 ? new ArrayList() : new ArrayList(new ArrayAsCollection(objArr, true));
    }

    public static List i0(Iterable iterable) {
        Intrinsics.f(iterable, "<this>");
        if (!(iterable instanceof Collection)) {
            return CollectionsKt__CollectionsKt.a(CollectionsKt___CollectionsKt.f(iterable));
        }
        Collection collection = (Collection) iterable;
        int size = collection.size();
        if (size == 0) {
            return EmptyList.X;
        }
        if (size != 1) {
            return j0(collection);
        }
        return H(iterable instanceof List ? ((List) iterable).get(0) : collection.iterator().next());
    }

    public static List j(ArrayList arrayList) {
        return new ReversedList(arrayList);
    }

    public static ArrayList j0(Collection collection) {
        Intrinsics.f(collection, "<this>");
        return new ArrayList(collection);
    }

    public static CollectionsKt___CollectionsKt$asSequence$$inlined$Sequence$1 k(Iterable iterable) {
        Intrinsics.f(iterable, "<this>");
        return new CollectionsKt___CollectionsKt$asSequence$$inlined$Sequence$1(iterable);
    }

    public static LinkedHashSet k0(Iterable iterable) {
        Intrinsics.f(iterable, "<this>");
        if (iterable instanceof Collection) {
            return new LinkedHashSet((Collection) iterable);
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        g0(iterable, linkedHashSet);
        return linkedHashSet;
    }

    public static int l(ArrayList arrayList, Comparable comparable) {
        int size = arrayList.size();
        int size2 = arrayList.size();
        int i2 = 0;
        if (size < 0) {
            throw new IllegalArgumentException(androidx.datastore.preferences.protobuf.a.e(0, size, "fromIndex (", ") is greater than toIndex (", ")."));
        }
        if (size > size2) {
            throw new IndexOutOfBoundsException(androidx.datastore.preferences.protobuf.a.e(size, size2, "toIndex (", ") is greater than size (", ")."));
        }
        int i3 = size - 1;
        while (i2 <= i3) {
            int i4 = (i2 + i3) >>> 1;
            int iA = ComparisonsKt.a((Comparable) arrayList.get(i4), comparable);
            if (iA < 0) {
                i2 = i4 + 1;
            } else {
                if (iA <= 0) {
                    return i4;
                }
                i3 = i4 - 1;
            }
        }
        return -(i2 + 1);
    }

    public static Set l0(Iterable iterable) {
        Intrinsics.f(iterable, "<this>");
        boolean z2 = iterable instanceof Collection;
        EmptySet emptySet = EmptySet.X;
        if (z2) {
            Collection collection = (Collection) iterable;
            int size = collection.size();
            if (size != 0) {
                if (size == 1) {
                    return SetsKt.h(iterable instanceof List ? ((List) iterable).get(0) : collection.iterator().next());
                }
                LinkedHashSet linkedHashSet = new LinkedHashSet(MapsKt.h(collection.size()));
                g0(iterable, linkedHashSet);
                return linkedHashSet;
            }
        } else {
            LinkedHashSet linkedHashSet2 = new LinkedHashSet();
            g0(iterable, linkedHashSet2);
            int size2 = linkedHashSet2.size();
            if (size2 != 0) {
                return size2 != 1 ? linkedHashSet2 : SetsKt.h(linkedHashSet2.iterator().next());
            }
        }
        return emptySet;
    }

    public static ListBuilder m(List builder) {
        Intrinsics.f(builder, "builder");
        ListBuilder listBuilder = (ListBuilder) builder;
        listBuilder.i();
        listBuilder.Z = true;
        return listBuilder.f43279Y > 0 ? listBuilder : ListBuilder.e0;
    }

    public static IndexingIterable m0(Iterable iterable) {
        Intrinsics.f(iterable, "<this>");
        return new IndexingIterable(new c(iterable, 7));
    }

    public static int n(Iterable iterable, int i2) {
        Intrinsics.f(iterable, "<this>");
        return iterable instanceof Collection ? ((Collection) iterable).size() : i2;
    }

    public static ArrayList n0(Iterable iterable, Iterable other) {
        Intrinsics.f(iterable, "<this>");
        Intrinsics.f(other, "other");
        Iterator it = iterable.iterator();
        Iterator it2 = other.iterator();
        ArrayList arrayList = new ArrayList(Math.min(n(iterable, 10), n(other, 10)));
        while (it.hasNext() && it2.hasNext()) {
            arrayList.add(new Pair(it.next(), it2.next()));
        }
        return arrayList;
    }

    public static boolean o(Iterable iterable, Object obj) {
        int iIndexOf;
        Intrinsics.f(iterable, "<this>");
        if (iterable instanceof Collection) {
            return ((Collection) iterable).contains(obj);
        }
        if (iterable instanceof List) {
            iIndexOf = ((List) iterable).indexOf(obj);
        } else {
            int i2 = 0;
            for (Object obj2 : iterable) {
                if (i2 < 0) {
                    f0();
                    throw null;
                }
                if (Intrinsics.a(obj, obj2)) {
                    iIndexOf = i2;
                } else {
                    i2++;
                }
            }
            iIndexOf = -1;
        }
        return iIndexOf >= 0;
    }

    public static ListBuilder p() {
        return new ListBuilder(10);
    }

    public static List q(Iterable iterable) {
        Intrinsics.f(iterable, "<this>");
        return i0(k0(iterable));
    }

    public static List r(Iterable iterable) {
        ArrayList arrayList;
        if (iterable instanceof Collection) {
            int size = ((Collection) iterable).size() - 1;
            if (size <= 0) {
                return EmptyList.X;
            }
            if (size == 1) {
                return H(E(iterable));
            }
            arrayList = new ArrayList(size);
            if (iterable instanceof List) {
                if (iterable instanceof RandomAccess) {
                    List list = (List) iterable;
                    int size2 = list.size();
                    for (int i2 = 1; i2 < size2; i2++) {
                        arrayList.add(list.get(i2));
                    }
                } else {
                    ListIterator listIterator = ((List) iterable).listIterator(1);
                    while (listIterator.hasNext()) {
                        arrayList.add(listIterator.next());
                    }
                }
                return arrayList;
            }
        } else {
            arrayList = new ArrayList();
        }
        int i3 = 0;
        for (Object obj : iterable) {
            if (i3 >= 1) {
                arrayList.add(obj);
            } else {
                i3++;
            }
        }
        return CollectionsKt__CollectionsKt.a(arrayList);
    }

    public static List s(List list) {
        Intrinsics.f(list, "<this>");
        List list2 = list;
        int size = list.size() - 1;
        if (size < 0) {
            size = 0;
        }
        return d0(list2, size);
    }

    public static ArrayList t(Collection collection, Function1 function1) {
        Intrinsics.f(collection, "<this>");
        ArrayList arrayList = new ArrayList();
        for (Object obj : collection) {
            if (((Boolean) function1.invoke(obj)).booleanValue()) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    public static ArrayList u(Iterable iterable) {
        Intrinsics.f(iterable, "<this>");
        ArrayList arrayList = new ArrayList();
        for (Object obj : iterable) {
            if (obj != null) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    public static Object v(Iterable iterable) {
        Intrinsics.f(iterable, "<this>");
        if (iterable instanceof List) {
            return w((List) iterable);
        }
        Iterator it = iterable.iterator();
        if (it.hasNext()) {
            return it.next();
        }
        throw new NoSuchElementException("Collection is empty.");
    }

    public static Object w(List list) {
        Intrinsics.f(list, "<this>");
        if (list.isEmpty()) {
            throw new NoSuchElementException("List is empty.");
        }
        return list.get(0);
    }

    public static Object x(Iterable iterable) {
        Intrinsics.f(iterable, "<this>");
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

    public static Object y(List list) {
        Intrinsics.f(list, "<this>");
        if (list.isEmpty()) {
            return null;
        }
        return list.get(0);
    }

    public static IntRange z(Collection collection) {
        Intrinsics.f(collection, "<this>");
        return new IntRange(0, collection.size() - 1, 1);
    }
}
