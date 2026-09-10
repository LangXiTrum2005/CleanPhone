package yj;

import java.io.InvalidObjectException;
import java.io.NotSerializableException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;
import kotlin.jvm.internal.n;
import qk.i0;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
public final class b extends xj.g implements RandomAccess, Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Object[] f54408a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f54409b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f54410c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final b f54411d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final c f54412e;

    public b(Object[] backing, int i10, int i11, b bVar, c root) {
        n.f(backing, "backing");
        n.f(root, "root");
        this.f54408a = backing;
        this.f54409b = i10;
        this.f54410c = i11;
        this.f54411d = bVar;
        this.f54412e = root;
        ((AbstractList) this).modCount = ((AbstractList) root).modCount;
    }

    private final void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Deserialization is supported via proxy only");
    }

    private final Object writeReplace() throws NotSerializableException {
        if (this.f54412e.f54416c) {
            return new i(this, 0);
        }
        throw new NotSerializableException("The list cannot be serialized while it is being built.");
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(Object obj) {
        t();
        s();
        r(this.f54409b + this.f54410c, obj);
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection elements) {
        n.f(elements, "elements");
        t();
        s();
        int size = elements.size();
        q(this.f54409b + this.f54410c, elements, size);
        return size > 0;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final void clear() {
        t();
        s();
        v(this.f54409b, this.f54410c);
    }

    @Override // java.util.AbstractList, java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        s();
        if (obj == this) {
            return true;
        }
        if (obj instanceof List) {
            List list = (List) obj;
            Object[] objArr = this.f54408a;
            int i10 = this.f54410c;
            if (i10 == list.size()) {
                for (int i11 = 0; i11 < i10; i11++) {
                    if (n.a(objArr[this.f54409b + i11], list.get(i11))) {
                    }
                }
                return true;
            }
        }
        return false;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i10) {
        s();
        xj.c cVar = xj.f.Companion;
        int i11 = this.f54410c;
        cVar.getClass();
        xj.c.a(i10, i11);
        return this.f54408a[this.f54409b + i10];
    }

    @Override // xj.g
    public final int h() {
        s();
        return this.f54410c;
    }

    @Override // java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        s();
        Object[] objArr = this.f54408a;
        int i10 = this.f54410c;
        int iHashCode = 1;
        for (int i11 = 0; i11 < i10; i11++) {
            Object obj = objArr[this.f54409b + i11];
            iHashCode = (iHashCode * 31) + (obj != null ? obj.hashCode() : 0);
        }
        return iHashCode;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        s();
        for (int i10 = 0; i10 < this.f54410c; i10++) {
            if (n.a(this.f54408a[this.f54409b + i10], obj)) {
                return i10;
            }
        }
        return -1;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean isEmpty() {
        s();
        return this.f54410c == 0;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public final Iterator iterator() {
        return listIterator(0);
    }

    @Override // java.util.AbstractList, java.util.List
    public final int lastIndexOf(Object obj) {
        s();
        for (int i10 = this.f54410c - 1; i10 >= 0; i10--) {
            if (n.a(this.f54408a[this.f54409b + i10], obj)) {
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
        t();
        s();
        xj.c cVar = xj.f.Companion;
        int i11 = this.f54410c;
        cVar.getClass();
        xj.c.a(i10, i11);
        return u(this.f54409b + i10);
    }

    public final void q(int i10, Collection collection, int i11) {
        ((AbstractList) this).modCount++;
        c cVar = this.f54412e;
        b bVar = this.f54411d;
        if (bVar != null) {
            bVar.q(i10, collection, i11);
        } else {
            c cVar2 = c.f54413d;
            cVar.q(i10, collection, i11);
        }
        this.f54408a = cVar.f54414a;
        this.f54410c += i11;
    }

    public final void r(int i10, Object obj) {
        ((AbstractList) this).modCount++;
        c cVar = this.f54412e;
        b bVar = this.f54411d;
        if (bVar != null) {
            bVar.r(i10, obj);
        } else {
            c cVar2 = c.f54413d;
            cVar.r(i10, obj);
        }
        this.f54408a = cVar.f54414a;
        this.f54410c++;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean remove(Object obj) {
        t();
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
        t();
        s();
        return w(this.f54409b, this.f54410c, elements, false) > 0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean retainAll(Collection elements) {
        n.f(elements, "elements");
        t();
        s();
        return w(this.f54409b, this.f54410c, elements, true) > 0;
    }

    public final void s() {
        if (((AbstractList) this.f54412e).modCount != ((AbstractList) this).modCount) {
            throw new ConcurrentModificationException();
        }
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i10, Object obj) {
        t();
        s();
        xj.c cVar = xj.f.Companion;
        int i11 = this.f54410c;
        cVar.getClass();
        xj.c.a(i10, i11);
        Object[] objArr = this.f54408a;
        int i12 = this.f54409b + i10;
        Object obj2 = objArr[i12];
        objArr[i12] = obj;
        return obj2;
    }

    @Override // java.util.AbstractList, java.util.List
    public final List subList(int i10, int i11) {
        xj.c cVar = xj.f.Companion;
        int i12 = this.f54410c;
        cVar.getClass();
        xj.c.c(i10, i11, i12);
        return new b(this.f54408a, this.f54409b + i10, i11 - i10, this, this.f54412e);
    }

    public final void t() {
        if (this.f54412e.f54416c) {
            throw new UnsupportedOperationException();
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final Object[] toArray(Object[] array) {
        n.f(array, "array");
        s();
        int length = array.length;
        int i10 = this.f54410c;
        int i11 = this.f54409b;
        if (length < i10) {
            Object[] objArrCopyOfRange = Arrays.copyOfRange(this.f54408a, i11, i10 + i11, array.getClass());
            n.e(objArrCopyOfRange, "copyOfRange(...)");
            return objArrCopyOfRange;
        }
        xj.k.e0(0, i11, i10 + i11, this.f54408a, array);
        int i12 = this.f54410c;
        if (i12 < array.length) {
            array[i12] = null;
        }
        return array;
    }

    @Override // java.util.AbstractCollection
    public final String toString() {
        s();
        return i0.a(this.f54408a, this.f54409b, this.f54410c, this);
    }

    public final Object u(int i10) {
        Object objU;
        ((AbstractList) this).modCount++;
        b bVar = this.f54411d;
        if (bVar != null) {
            objU = bVar.u(i10);
        } else {
            c cVar = c.f54413d;
            objU = this.f54412e.u(i10);
        }
        this.f54410c--;
        return objU;
    }

    public final void v(int i10, int i11) {
        if (i11 > 0) {
            ((AbstractList) this).modCount++;
        }
        b bVar = this.f54411d;
        if (bVar != null) {
            bVar.v(i10, i11);
        } else {
            c cVar = c.f54413d;
            this.f54412e.v(i10, i11);
        }
        this.f54410c -= i11;
    }

    public final int w(int i10, int i11, Collection collection, boolean z10) {
        int iW;
        b bVar = this.f54411d;
        if (bVar != null) {
            iW = bVar.w(i10, i11, collection, z10);
        } else {
            c cVar = c.f54413d;
            iW = this.f54412e.w(i10, i11, collection, z10);
        }
        if (iW > 0) {
            ((AbstractList) this).modCount++;
        }
        this.f54410c -= iW;
        return iW;
    }

    @Override // java.util.AbstractList, java.util.List
    public final ListIterator listIterator(int i10) {
        s();
        xj.c cVar = xj.f.Companion;
        int i11 = this.f54410c;
        cVar.getClass();
        xj.c.b(i10, i11);
        return new a(this, i10);
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i10, Object obj) {
        t();
        s();
        xj.c cVar = xj.f.Companion;
        int i11 = this.f54410c;
        cVar.getClass();
        xj.c.b(i10, i11);
        r(this.f54409b + i10, obj);
    }

    @Override // java.util.AbstractList, java.util.List
    public final boolean addAll(int i10, Collection elements) {
        n.f(elements, "elements");
        t();
        s();
        xj.c cVar = xj.f.Companion;
        int i11 = this.f54410c;
        cVar.getClass();
        xj.c.b(i10, i11);
        int size = elements.size();
        q(this.f54409b + i10, elements, size);
        return size > 0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final Object[] toArray() {
        s();
        Object[] objArr = this.f54408a;
        int i10 = this.f54410c;
        int i11 = this.f54409b;
        return xj.k.j0(i11, i10 + i11, objArr);
    }
}
