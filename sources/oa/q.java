package oa;

import java.util.AbstractCollection;
import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.RandomAccess;
import java.util.Set;
import java.util.SortedSet;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f47295a = 2;

    public static int a(int i10) {
        if (i10 < 3) {
            d(i10, "expectedSize");
            return i10 + 1;
        }
        if (i10 < 1073741824) {
            return (int) Math.ceil(((double) i10) / 0.75d);
        }
        return Integer.MAX_VALUE;
    }

    public static void b(int i10, Object[] objArr) {
        for (int i11 = 0; i11 < i10; i11++) {
            if (objArr[i11] == null) {
                throw new NullPointerException(l1.d.e(i11, "at index "));
            }
        }
    }

    public static void c(Object obj, Object obj2) {
        if (obj == null) {
            throw new NullPointerException("null key in entry: null=" + obj2);
        }
        if (obj2 != null) {
            return;
        }
        throw new NullPointerException("null value in entry: " + obj + "=null");
    }

    public static void d(int i10, String str) {
        if (i10 >= 0) {
            return;
        }
        throw new IllegalArgumentException(str + " cannot be negative but was: " + i10);
    }

    public static Object e(int i10) {
        if (i10 < 2 || i10 > 1073741824 || Integer.highestOneBit(i10) != i10) {
            throw new IllegalArgumentException(l1.d.e(i10, "must be power of 2 between 2^1 and 2^30: "));
        }
        if (i10 <= 256) {
            return new byte[i10];
        }
        return i10 <= 65536 ? new short[i10] : new int[i10];
    }

    public static boolean g(Object obj, Map map) {
        if (map == obj) {
            return true;
        }
        if (obj instanceof Map) {
            return map.entrySet().equals(((Map) obj).entrySet());
        }
        return false;
    }

    public static boolean h(Set set, Object obj) {
        if (set == obj) {
            return true;
        }
        if (!(obj instanceof Set)) {
            return false;
        }
        Set set2 = (Set) obj;
        try {
            return set.size() == set2.size() && set.containsAll(set2);
        } catch (ClassCastException | NullPointerException unused) {
            return false;
        }
    }

    public static z1 i(Set set, na.i iVar) {
        if (set instanceof SortedSet) {
            Set set2 = (SortedSet) set;
            if (!(set2 instanceof z1)) {
                return new a2(set2, iVar);
            }
            z1 z1Var = (z1) set2;
            na.i iVar2 = z1Var.f47360b;
            iVar2.getClass();
            return new a2((SortedSet) z1Var.f47359a, new na.j(Arrays.asList(iVar2, iVar)));
        }
        if (!(set instanceof z1)) {
            set.getClass();
            return new z1(set, iVar);
        }
        z1 z1Var2 = (z1) set;
        na.i iVar3 = z1Var2.f47360b;
        iVar3.getClass();
        return new z1(z1Var2.f47359a, new na.j(Arrays.asList(iVar3, iVar)));
    }

    public static Object j(AbstractCollection abstractCollection, String str) {
        Iterator it = abstractCollection.iterator();
        return it.hasNext() ? it.next() : str;
    }

    public static Object k(Iterable iterable) {
        Object next;
        if (iterable instanceof List) {
            List list = (List) iterable;
            if (list.isEmpty()) {
                throw new NoSuchElementException();
            }
            return list.get(list.size() - 1);
        }
        Iterator it = iterable.iterator();
        do {
            next = it.next();
        } while (it.hasNext());
        return next;
    }

    public static boolean l(Comparator comparator, Collection collection) {
        Object objComparator;
        comparator.getClass();
        collection.getClass();
        if (collection instanceof SortedSet) {
            objComparator = ((SortedSet) collection).comparator();
            if (objComparator == null) {
                objComparator = l1.f47272a;
            }
        } else {
            if (!(collection instanceof c2)) {
                return false;
            }
            objComparator = ((x0) ((c2) collection)).f47343d;
        }
        return comparator.equals(objComparator);
    }

    public static int o(Set set) {
        Iterator it = set.iterator();
        int i10 = 0;
        while (it.hasNext()) {
            Object next = it.next();
            i10 = ~(~(i10 + (next != null ? next.hashCode() : 0)));
        }
        return i10;
    }

    public static y1 p(Set set, u0 u0Var) {
        go.k.o(set, "set1");
        go.k.o(u0Var, "set2");
        return new y1(set, u0Var);
    }

    public static int q(int i10, int i11, int i12) {
        return (i10 & (~i12)) | (i11 & i12);
    }

    public static ArrayList r(Object... objArr) {
        int length = objArr.length;
        d(length, "arraySize");
        ArrayList arrayList = new ArrayList(com.bumptech.glide.c.D(((long) length) + 5 + ((long) (length / 10))));
        Collections.addAll(arrayList, objArr);
        return arrayList;
    }

    public static int s(Object obj, Object obj2, int i10, Object obj3, int[] iArr, Object[] objArr, Object[] objArr2) {
        int iW = w(obj);
        int i11 = iW & i10;
        int iX = x(i11, obj3);
        if (iX != 0) {
            int i12 = ~i10;
            int i13 = iW & i12;
            int i14 = -1;
            while (true) {
                int i15 = iX - 1;
                int i16 = iArr[i15];
                if ((i16 & i12) == i13 && d0.c.h(obj, objArr[i15]) && (objArr2 == null || d0.c.h(obj2, objArr2[i15]))) {
                    int i17 = i16 & i10;
                    if (i14 == -1) {
                        y(i11, i17, obj3);
                        return i15;
                    }
                    iArr[i14] = q(iArr[i14], i17, i10);
                    return i15;
                }
                int i18 = i16 & i10;
                if (i18 == 0) {
                    break;
                }
                i14 = i15;
                iX = i18;
            }
        }
        return -1;
    }

    public static List t(List list) {
        if (list instanceof j0) {
            return ((j0) list).E();
        }
        if (list instanceof d1) {
            return ((d1) list).f47241a;
        }
        return list instanceof RandomAccess ? new b1(list) : new d1(list);
    }

    public static void u(List list, na.i iVar, int i10, int i11) {
        for (int size = list.size() - 1; size > i11; size--) {
            if (iVar.apply(list.get(size))) {
                list.remove(size);
            }
        }
        for (int i12 = i11 - 1; i12 >= i10; i12--) {
            list.remove(i12);
        }
    }

    public static int v(int i10) {
        return (int) (((long) Integer.rotateLeft((int) (((long) i10) * (-862048943)), 15)) * 461845907);
    }

    public static int w(Object obj) {
        return v(obj == null ? 0 : obj.hashCode());
    }

    public static int x(int i10, Object obj) {
        if (obj instanceof byte[]) {
            return ((byte[]) obj)[i10] & 255;
        }
        return obj instanceof short[] ? ((short[]) obj)[i10] & 65535 : ((int[]) obj)[i10];
    }

    public static void y(int i10, int i11, Object obj) {
        if (obj instanceof byte[]) {
            ((byte[]) obj)[i10] = (byte) i11;
        } else if (obj instanceof short[]) {
            ((short[]) obj)[i10] = (short) i11;
        } else {
            ((int[]) obj)[i10] = i11;
        }
    }

    public static AbstractList z(List list, na.e eVar) {
        return list instanceof RandomAccess ? new f1(list, eVar) : new g1(list, eVar);
    }

    public abstract Object f();

    public String toString() {
        switch (this.f47295a) {
            case 2:
                return f().toString();
            default:
                return super.toString();
        }
    }
}
