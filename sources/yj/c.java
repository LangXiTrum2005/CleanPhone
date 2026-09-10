package yj;

import java.io.NotSerializableException;
import java.io.Serializable;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;
import kotlin.jvm.internal.n;
import qk.i0;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
public final class c extends xj.g implements RandomAccess, Serializable {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final c f54413d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Object[] f54414a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f54415b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f54416c;

    static {
        c cVar = new c(0);
        cVar.f54416c = true;
        f54413d = cVar;
    }

    public c(int i10) {
        if (i10 < 0) {
            throw new IllegalArgumentException("capacity must be non-negative.");
        }
        this.f54414a = new Object[i10];
    }

    private final Object writeReplace() throws NotSerializableException {
        if (this.f54416c) {
            return new i(this, 0);
        }
        throw new NotSerializableException("The list cannot be serialized while it is being built.");
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(Object obj) {
        s();
        int i10 = this.f54415b;
        ((AbstractList) this).modCount++;
        t(i10, 1);
        this.f54414a[i10] = obj;
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection elements) {
        n.f(elements, "elements");
        s();
        int size = elements.size();
        q(this.f54415b, elements, size);
        return size > 0;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final void clear() {
        s();
        v(0, this.f54415b);
    }

    @Override // java.util.AbstractList, java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof List) {
            List list = (List) obj;
            Object[] objArr = this.f54414a;
            int i10 = this.f54415b;
            if (i10 == list.size()) {
                for (int i11 = 0; i11 < i10; i11++) {
                    if (n.a(objArr[i11], list.get(i11))) {
                    }
                }
                return true;
            }
        }
        return false;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i10) {
        xj.c cVar = xj.f.Companion;
        int i11 = this.f54415b;
        cVar.getClass();
        xj.c.a(i10, i11);
        return this.f54414a[i10];
    }

    @Override // xj.g
    public final int h() {
        return this.f54415b;
    }

    @Override // java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        Object[] objArr = this.f54414a;
        int i10 = this.f54415b;
        int iHashCode = 1;
        for (int i11 = 0; i11 < i10; i11++) {
            Object obj = objArr[i11];
            iHashCode = (iHashCode * 31) + (obj != null ? obj.hashCode() : 0);
        }
        return iHashCode;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        for (int i10 = 0; i10 < this.f54415b; i10++) {
            if (n.a(this.f54414a[i10], obj)) {
                return i10;
            }
        }
        return -1;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean isEmpty() {
        return this.f54415b == 0;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public final Iterator iterator() {
        return listIterator(0);
    }

    @Override // java.util.AbstractList, java.util.List
    public final int lastIndexOf(Object obj) {
        for (int i10 = this.f54415b - 1; i10 >= 0; i10--) {
            if (n.a(this.f54414a[i10], obj)) {
                return i10;
            }
        }
        return -1;
    }

    @Override // java.util.AbstractList, java.util.List
    public final ListIterator listIterator() {
        return listIterator(0);
    }

    @Override // xj.g
    public final Object m(int i10) {
        s();
        xj.c cVar = xj.f.Companion;
        int i11 = this.f54415b;
        cVar.getClass();
        xj.c.a(i10, i11);
        return u(i10);
    }

    public final void q(int i10, Collection collection, int i11) {
        ((AbstractList) this).modCount++;
        t(i10, i11);
        Iterator it = collection.iterator();
        for (int i12 = 0; i12 < i11; i12++) {
            this.f54414a[i10 + i12] = it.next();
        }
    }

    public final void r(int i10, Object obj) {
        ((AbstractList) this).modCount++;
        t(i10, 1);
        this.f54414a[i10] = obj;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean remove(Object obj) {
        s();
        int iIndexOf = indexOf(obj);
        if (iIndexOf >= 0) {
            m(iIndexOf);
        }
        return iIndexOf >= 0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean removeAll(Collection elements) {
        n.f(elements, "elements");
        s();
        return w(0, this.f54415b, elements, false) > 0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean retainAll(Collection elements) {
        n.f(elements, "elements");
        s();
        return w(0, this.f54415b, elements, true) > 0;
    }

    public final void s() {
        if (this.f54416c) {
            throw new UnsupportedOperationException();
        }
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i10, Object obj) {
        s();
        xj.c cVar = xj.f.Companion;
        int i11 = this.f54415b;
        cVar.getClass();
        xj.c.a(i10, i11);
        Object[] objArr = this.f54414a;
        Object obj2 = objArr[i10];
        objArr[i10] = obj;
        return obj2;
    }

    @Override // java.util.AbstractList, java.util.List
    public final List subList(int i10, int i11) {
        xj.c cVar = xj.f.Companion;
        int i12 = this.f54415b;
        cVar.getClass();
        xj.c.c(i10, i11, i12);
        return new b(this.f54414a, i10, i11 - i10, null, this);
    }

    public final void t(int i10, int i11) {
        int i12 = this.f54415b + i11;
        if (i12 < 0) {
            throw new OutOfMemoryError();
        }
        Object[] objArr = this.f54414a;
        if (i12 > objArr.length) {
            xj.c cVar = xj.f.Companion;
            int length = objArr.length;
            cVar.getClass();
            int iD = xj.c.d(length, i12);
            Object[] objArr2 = this.f54414a;
            n.f(objArr2, "<this>");
            Object[] objArrCopyOf = Arrays.copyOf(objArr2, iD);
            n.e(objArrCopyOf, "copyOf(...)");
            this.f54414a = objArrCopyOf;
        }
        Object[] objArr3 = this.f54414a;
        xj.k.e0(i10 + i11, i10, this.f54415b, objArr3, objArr3);
        this.f54415b += i11;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final Object[] toArray(Object[] array) {
        n.f(array, "array");
        int length = array.length;
        int i10 = this.f54415b;
        if (length < i10) {
            Object[] objArrCopyOfRange = Arrays.copyOfRange(this.f54414a, 0, i10, array.getClass());
            n.e(objArrCopyOfRange, "copyOfRange(...)");
            return objArrCopyOfRange;
        }
        xj.k.e0(0, 0, i10, this.f54414a, array);
        int i11 = this.f54415b;
        if (i11 < array.length) {
            array[i11] = null;
        }
        return array;
    }

    @Override // java.util.AbstractCollection
    public final String toString() {
        return i0.a(this.f54414a, 0, this.f54415b, this);
    }

    public final Object u(int i10) {
        ((AbstractList) this).modCount++;
        Object[] objArr = this.f54414a;
        Object obj = objArr[i10];
        xj.k.e0(i10, i10 + 1, this.f54415b, objArr, objArr);
        Object[] objArr2 = this.f54414a;
        int i11 = this.f54415b - 1;
        n.f(objArr2, "<this>");
        objArr2[i11] = null;
        this.f54415b--;
        return obj;
    }

    public final void v(int i10, int i11) {
        if (i11 > 0) {
            ((AbstractList) this).modCount++;
        }
        Object[] objArr = this.f54414a;
        xj.k.e0(i10, i10 + i11, this.f54415b, objArr, objArr);
        Object[] objArr2 = this.f54414a;
        int i12 = this.f54415b;
        i0.i0(i12 - i11, i12, objArr2);
        this.f54415b -= i11;
    }

    public final int w(int i10, int i11, Collection collection, boolean z10) {
        int i12 = 0;
        int i13 = 0;
        while (i12 < i11) {
            int i14 = i10 + i12;
            if (collection.contains(this.f54414a[i14]) == z10) {
                Object[] objArr = this.f54414a;
                i12++;
                objArr[i13 + i10] = objArr[i14];
                i13++;
            } else {
                i12++;
            }
        }
        int i15 = i11 - i13;
        Object[] objArr2 = this.f54414a;
        xj.k.e0(i10 + i13, i11 + i10, this.f54415b, objArr2, objArr2);
        Object[] objArr3 = this.f54414a;
        int i16 = this.f54415b;
        i0.i0(i16 - i15, i16, objArr3);
        if (i15 > 0) {
            ((AbstractList) this).modCount++;
        }
        this.f54415b -= i15;
        return i15;
    }

    @Override // java.util.AbstractList, java.util.List
    public final ListIterator listIterator(int i10) {
        xj.c cVar = xj.f.Companion;
        int i11 = this.f54415b;
        cVar.getClass();
        xj.c.b(i10, i11);
        return new a(this, i10);
    }

    @Override // java.util.AbstractList, java.util.List
    public final boolean addAll(int i10, Collection elements) {
        n.f(elements, "elements");
        s();
        xj.c cVar = xj.f.Companion;
        int i11 = this.f54415b;
        cVar.getClass();
        xj.c.b(i10, i11);
        int size = elements.size();
        q(i10, elements, size);
        return size > 0;
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i10, Object obj) {
        s();
        xj.c cVar = xj.f.Companion;
        int i11 = this.f54415b;
        cVar.getClass();
        xj.c.b(i10, i11);
        ((AbstractList) this).modCount++;
        t(i10, 1);
        this.f54414a[i10] = obj;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final Object[] toArray() {
        return xj.k.j0(0, this.f54415b, this.f54414a);
    }
}
