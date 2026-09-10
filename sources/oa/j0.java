package oa;

import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class j0 extends c0 implements List, RandomAccess {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final f0 f47265b = new f0(n1.f47281e, 0);
    private static final long serialVersionUID = -889275714;

    public static n1 A(Long l, Long l10, Long l11, Long l12, Long l13) {
        Object[] objArr = {l, l10, l11, l12, l13};
        q.b(5, objArr);
        return t(5, objArr);
    }

    public static n1 B(Object obj) {
        Object[] objArr = {obj};
        q.b(1, objArr);
        return t(1, objArr);
    }

    public static n1 C(Object obj, Object obj2) {
        Object[] objArr = {obj, obj2};
        q.b(2, objArr);
        return t(2, objArr);
    }

    public static n1 D(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, Object... objArr) {
        go.k.h("the total number of elements must fit in an int", objArr.length <= 2147483635);
        int length = objArr.length + 12;
        Object[] objArr2 = new Object[length];
        objArr2[0] = str;
        objArr2[1] = str2;
        objArr2[2] = str3;
        objArr2[3] = str4;
        objArr2[4] = str5;
        objArr2[5] = str6;
        objArr2[6] = str7;
        objArr2[7] = str8;
        objArr2[8] = str9;
        objArr2[9] = str10;
        objArr2[10] = str11;
        objArr2[11] = str12;
        System.arraycopy(objArr, 0, objArr2, 12, objArr.length);
        q.b(length, objArr2);
        return t(length, objArr2);
    }

    public static n1 F(Comparator comparator, List list) {
        List list2;
        comparator.getClass();
        if (list instanceof Collection) {
            list2 = list;
        } else {
            Iterator it = list.iterator();
            ArrayList arrayList = new ArrayList();
            it.getClass();
            while (it.hasNext()) {
                arrayList.add(it.next());
            }
            list2 = arrayList;
        }
        Object[] array = list2.toArray();
        q.b(array.length, array);
        Arrays.sort(array, comparator);
        return t(array.length, array);
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Use SerializedForm");
    }

    public static n1 t(int i10, Object[] objArr) {
        return i10 == 0 ? n1.f47281e : new n1(i10, objArr);
    }

    public static e0 u() {
        return new e0(4);
    }

    public static e0 v(int i10) {
        q.d(i10, "expectedSize");
        return new e0(i10);
    }

    public static j0 w(Iterable iterable) {
        if (iterable instanceof Collection) {
            return x((Collection) iterable);
        }
        Iterator it = iterable.iterator();
        if (!it.hasNext()) {
            return n1.f47281e;
        }
        Object next = it.next();
        if (!it.hasNext()) {
            return B(next);
        }
        e0 e0Var = new e0(4);
        e0Var.b(next);
        while (it.hasNext()) {
            e0Var.b(it.next());
        }
        return e0Var.g();
    }

    public static j0 x(Collection collection) {
        if (!(collection instanceof c0)) {
            Object[] array = collection.toArray();
            q.b(array.length, array);
            return t(array.length, array);
        }
        j0 j0VarH = ((c0) collection).h();
        if (!j0VarH.r()) {
            return j0VarH;
        }
        Object[] array2 = j0VarH.toArray(c0.f47231a);
        return t(array2.length, array2);
    }

    public static n1 y(Object[] objArr) {
        if (objArr.length == 0) {
            return n1.f47281e;
        }
        Object[] objArr2 = (Object[]) objArr.clone();
        q.b(objArr2.length, objArr2);
        return t(objArr2.length, objArr2);
    }

    public j0 E() {
        return size() <= 1 ? this : new g0(this);
    }

    @Override // java.util.List
    /* JADX INFO: renamed from: G, reason: merged with bridge method [inline-methods] */
    public j0 subList(int i10, int i11) {
        go.k.r(i10, i11, size());
        int i12 = i11 - i10;
        if (i12 == size()) {
            return this;
        }
        return i12 == 0 ? n1.f47281e : new i0(this, i10, i12);
    }

    @Override // java.util.List
    public final void add(int i10, Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.List
    public final boolean addAll(int i10, Collection collection) {
        throw new UnsupportedOperationException();
    }

    @Override // oa.c0, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean contains(Object obj) {
        return indexOf(obj) >= 0;
    }

    @Override // java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (obj != this) {
            if (obj instanceof List) {
                List list = (List) obj;
                int size = size();
                if (size == list.size()) {
                    if (!(list instanceof RandomAccess)) {
                        Iterator it = iterator();
                        Iterator it2 = list.iterator();
                        while (it.hasNext()) {
                            if (it2.hasNext() && d0.c.h(it.next(), it2.next())) {
                            }
                        }
                        return !it2.hasNext();
                    }
                    for (int i10 = 0; i10 < size; i10++) {
                        if (d0.c.h(get(i10), list.get(i10))) {
                        }
                    }
                }
            }
            return false;
        }
        return true;
    }

    @Override // java.util.Collection, java.util.List
    public final int hashCode() {
        int size = size();
        int i10 = 1;
        for (int i11 = 0; i11 < size; i11++) {
            i10 = ~(~(get(i11).hashCode() + (i10 * 31)));
        }
        return i10;
    }

    public int indexOf(Object obj) {
        if (obj == null) {
            return -1;
        }
        int size = size();
        for (int i10 = 0; i10 < size; i10++) {
            if (obj.equals(get(i10))) {
                return i10;
            }
        }
        return -1;
    }

    @Override // oa.c0, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public Iterator iterator() {
        return listIterator(0);
    }

    public int lastIndexOf(Object obj) {
        if (obj == null) {
            return -1;
        }
        for (int size = size() - 1; size >= 0; size--) {
            if (obj.equals(get(size))) {
                return size;
            }
        }
        return -1;
    }

    @Override // oa.c0
    public int m(int i10, Object[] objArr) {
        int size = size();
        for (int i11 = 0; i11 < size; i11++) {
            objArr[i10 + i11] = get(i11);
        }
        return i10 + size;
    }

    @Override // java.util.List
    public final Object remove(int i10) {
        throw new UnsupportedOperationException();
    }

    @Override // oa.c0
    /* JADX INFO: renamed from: s */
    public final e2 iterator() {
        return listIterator(0);
    }

    @Override // java.util.List
    public final Object set(int i10, Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // oa.c0
    public Object writeReplace() {
        return new h0(toArray(c0.f47231a));
    }

    @Override // java.util.List
    /* JADX INFO: renamed from: z, reason: merged with bridge method [inline-methods] */
    public final f0 listIterator(int i10) {
        go.k.q(i10, size());
        return isEmpty() ? f47265b : new f0(this, i10);
    }

    public ListIterator listIterator() {
        return listIterator(0);
    }

    @Override // oa.c0
    public final j0 h() {
        return this;
    }
}
