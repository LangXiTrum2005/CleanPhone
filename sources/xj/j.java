package xj;

import java.lang.reflect.Array;
import java.util.AbstractList;
import java.util.Collection;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
public final class j extends g {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final Object[] f53858d = new Object[0];

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f53859a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Object[] f53860b = f53858d;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f53861c;

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(Object obj) {
        addLast(obj);
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection elements) {
        kotlin.jvm.internal.n.f(elements, "elements");
        if (elements.isEmpty()) {
            return false;
        }
        v();
        q(elements.size() + h());
        p(u(h() + this.f53859a), elements);
        return true;
    }

    public final void addFirst(Object obj) {
        v();
        q(this.f53861c + 1);
        int length = this.f53859a;
        if (length == 0) {
            Object[] objArr = this.f53860b;
            kotlin.jvm.internal.n.f(objArr, "<this>");
            length = objArr.length;
        }
        int i10 = length - 1;
        this.f53859a = i10;
        this.f53860b[i10] = obj;
        this.f53861c++;
    }

    public final void addLast(Object obj) {
        v();
        q(h() + 1);
        this.f53860b[u(h() + this.f53859a)] = obj;
        this.f53861c = h() + 1;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final void clear() {
        if (!isEmpty()) {
            v();
            t(this.f53859a, u(h() + this.f53859a));
        }
        this.f53859a = 0;
        this.f53861c = 0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        return indexOf(obj) != -1;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i10) {
        c cVar = f.Companion;
        int i11 = this.f53861c;
        cVar.getClass();
        c.a(i10, i11);
        return this.f53860b[u(this.f53859a + i10)];
    }

    @Override // xj.g
    public final int h() {
        return this.f53861c;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        int i10;
        int iU = u(h() + this.f53859a);
        int length = this.f53859a;
        if (length < iU) {
            while (length < iU) {
                if (kotlin.jvm.internal.n.a(obj, this.f53860b[length])) {
                    i10 = this.f53859a;
                } else {
                    length++;
                }
            }
            return -1;
        }
        if (length < iU) {
            return -1;
        }
        int length2 = this.f53860b.length;
        while (length < length2) {
            if (kotlin.jvm.internal.n.a(obj, this.f53860b[length])) {
                i10 = this.f53859a;
            } else {
                length++;
            }
        }
        for (int i11 = 0; i11 < iU; i11++) {
            if (kotlin.jvm.internal.n.a(obj, this.f53860b[i11])) {
                length = i11 + this.f53860b.length;
                i10 = this.f53859a;
            }
        }
        return -1;
        return length - i10;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean isEmpty() {
        return h() == 0;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int lastIndexOf(Object obj) {
        int length;
        int i10;
        int iU = u(this.f53861c + this.f53859a);
        int i11 = this.f53859a;
        if (i11 < iU) {
            length = iU - 1;
            if (i11 <= length) {
                while (!kotlin.jvm.internal.n.a(obj, this.f53860b[length])) {
                    if (length != i11) {
                        length--;
                    }
                }
                i10 = this.f53859a;
                return length - i10;
            }
            return -1;
        }
        if (i11 > iU) {
            for (int i12 = iU - 1; -1 < i12; i12--) {
                if (kotlin.jvm.internal.n.a(obj, this.f53860b[i12])) {
                    length = i12 + this.f53860b.length;
                    i10 = this.f53859a;
                    return length - i10;
                }
            }
            Object[] objArr = this.f53860b;
            kotlin.jvm.internal.n.f(objArr, "<this>");
            length = objArr.length - 1;
            int i13 = this.f53859a;
            if (i13 <= length) {
                while (!kotlin.jvm.internal.n.a(obj, this.f53860b[length])) {
                    if (length != i13) {
                        length--;
                    }
                }
                i10 = this.f53859a;
                return length - i10;
            }
        }
        return -1;
    }

    @Override // xj.g
    public final Object m(int i10) {
        c cVar = f.Companion;
        int i11 = this.f53861c;
        cVar.getClass();
        c.a(i10, i11);
        if (i10 == o.P(this)) {
            return removeLast();
        }
        if (i10 == 0) {
            return removeFirst();
        }
        v();
        int iU = u(this.f53859a + i10);
        Object[] objArr = this.f53860b;
        Object obj = objArr[iU];
        if (i10 < (this.f53861c >> 1)) {
            int i12 = this.f53859a;
            if (iU >= i12) {
                k.e0(i12 + 1, i12, iU, objArr, objArr);
            } else {
                k.e0(1, 0, iU, objArr, objArr);
                Object[] objArr2 = this.f53860b;
                objArr2[0] = objArr2[objArr2.length - 1];
                int i13 = this.f53859a;
                k.e0(i13 + 1, i13, objArr2.length - 1, objArr2, objArr2);
            }
            Object[] objArr3 = this.f53860b;
            int i14 = this.f53859a;
            objArr3[i14] = null;
            this.f53859a = r(i14);
        } else {
            int iU2 = u(o.P(this) + this.f53859a);
            if (iU <= iU2) {
                Object[] objArr4 = this.f53860b;
                k.e0(iU, iU + 1, iU2 + 1, objArr4, objArr4);
            } else {
                Object[] objArr5 = this.f53860b;
                k.e0(iU, iU + 1, objArr5.length, objArr5, objArr5);
                Object[] objArr6 = this.f53860b;
                objArr6[objArr6.length - 1] = objArr6[0];
                k.e0(0, 1, iU2 + 1, objArr6, objArr6);
            }
            this.f53860b[iU2] = null;
        }
        this.f53861c--;
        return obj;
    }

    public final void p(int i10, Collection collection) {
        Iterator it = collection.iterator();
        int length = this.f53860b.length;
        while (i10 < length && it.hasNext()) {
            this.f53860b[i10] = it.next();
            i10++;
        }
        int i11 = this.f53859a;
        for (int i12 = 0; i12 < i11 && it.hasNext(); i12++) {
            this.f53860b[i12] = it.next();
        }
        this.f53861c = collection.size() + this.f53861c;
    }

    public final void q(int i10) {
        if (i10 < 0) {
            throw new IllegalStateException("Deque is too big.");
        }
        Object[] objArr = this.f53860b;
        if (i10 <= objArr.length) {
            return;
        }
        if (objArr == f53858d) {
            if (i10 < 10) {
                i10 = 10;
            }
            this.f53860b = new Object[i10];
            return;
        }
        c cVar = f.Companion;
        int length = objArr.length;
        cVar.getClass();
        Object[] objArr2 = new Object[c.d(length, i10)];
        Object[] objArr3 = this.f53860b;
        k.e0(0, this.f53859a, objArr3.length, objArr3, objArr2);
        Object[] objArr4 = this.f53860b;
        int length2 = objArr4.length;
        int i11 = this.f53859a;
        k.e0(length2 - i11, 0, i11, objArr4, objArr2);
        this.f53859a = 0;
        this.f53860b = objArr2;
    }

    public final int r(int i10) {
        Object[] objArr = this.f53860b;
        kotlin.jvm.internal.n.f(objArr, "<this>");
        if (i10 == objArr.length - 1) {
            return 0;
        }
        return i10 + 1;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean remove(Object obj) {
        int iIndexOf = indexOf(obj);
        if (iIndexOf == -1) {
            return false;
        }
        m(iIndexOf);
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean removeAll(Collection elements) {
        int iU;
        kotlin.jvm.internal.n.f(elements, "elements");
        boolean z10 = false;
        z10 = false;
        z10 = false;
        if (!isEmpty() && this.f53860b.length != 0) {
            int iU2 = u(h() + this.f53859a);
            int i10 = this.f53859a;
            if (i10 < iU2) {
                iU = i10;
                while (i10 < iU2) {
                    Object obj = this.f53860b[i10];
                    if (elements.contains(obj)) {
                        z10 = true;
                    } else {
                        this.f53860b[iU] = obj;
                        iU++;
                    }
                    i10++;
                }
                k.k0(this.f53860b, null, iU, iU2);
            } else {
                int length = this.f53860b.length;
                boolean z11 = false;
                int i11 = i10;
                while (i10 < length) {
                    Object[] objArr = this.f53860b;
                    Object obj2 = objArr[i10];
                    objArr[i10] = null;
                    if (elements.contains(obj2)) {
                        z11 = true;
                    } else {
                        this.f53860b[i11] = obj2;
                        i11++;
                    }
                    i10++;
                }
                iU = u(i11);
                for (int i12 = 0; i12 < iU2; i12++) {
                    Object[] objArr2 = this.f53860b;
                    Object obj3 = objArr2[i12];
                    objArr2[i12] = null;
                    if (elements.contains(obj3)) {
                        z11 = true;
                    } else {
                        this.f53860b[iU] = obj3;
                        iU = r(iU);
                    }
                }
                z10 = z11;
            }
            if (z10) {
                v();
                this.f53861c = s(iU - this.f53859a);
            }
        }
        return z10;
    }

    public final Object removeFirst() {
        if (isEmpty()) {
            throw new NoSuchElementException("ArrayDeque is empty.");
        }
        v();
        Object[] objArr = this.f53860b;
        int i10 = this.f53859a;
        Object obj = objArr[i10];
        objArr[i10] = null;
        this.f53859a = r(i10);
        this.f53861c = h() - 1;
        return obj;
    }

    public final Object removeLast() {
        if (isEmpty()) {
            throw new NoSuchElementException("ArrayDeque is empty.");
        }
        v();
        int iU = u(o.P(this) + this.f53859a);
        Object[] objArr = this.f53860b;
        Object obj = objArr[iU];
        objArr[iU] = null;
        this.f53861c = h() - 1;
        return obj;
    }

    @Override // java.util.AbstractList
    public final void removeRange(int i10, int i11) {
        c cVar = f.Companion;
        int i12 = this.f53861c;
        cVar.getClass();
        c.c(i10, i11, i12);
        int i13 = i11 - i10;
        if (i13 == 0) {
            return;
        }
        if (i13 == this.f53861c) {
            clear();
            return;
        }
        if (i13 == 1) {
            m(i10);
            return;
        }
        v();
        if (i10 < this.f53861c - i11) {
            int iU = u(this.f53859a + (i10 - 1));
            int iU2 = u(this.f53859a + (i11 - 1));
            while (i10 > 0) {
                int i14 = iU + 1;
                int iMin = Math.min(i10, Math.min(i14, iU2 + 1));
                Object[] objArr = this.f53860b;
                int i15 = iU2 - iMin;
                int i16 = iU - iMin;
                k.e0(i15 + 1, i16 + 1, i14, objArr, objArr);
                iU = s(i16);
                iU2 = s(i15);
                i10 -= iMin;
            }
            int iU3 = u(this.f53859a + i13);
            t(this.f53859a, iU3);
            this.f53859a = iU3;
        } else {
            int iU4 = u(this.f53859a + i11);
            int iU5 = u(this.f53859a + i10);
            int i17 = this.f53861c;
            while (true) {
                i17 -= i11;
                if (i17 <= 0) {
                    break;
                }
                Object[] objArr2 = this.f53860b;
                i11 = Math.min(i17, Math.min(objArr2.length - iU4, objArr2.length - iU5));
                Object[] objArr3 = this.f53860b;
                int i18 = iU4 + i11;
                k.e0(iU5, iU4, i18, objArr3, objArr3);
                iU4 = u(i18);
                iU5 = u(iU5 + i11);
            }
            int iU6 = u(this.f53861c + this.f53859a);
            t(s(iU6 - i13), iU6);
        }
        this.f53861c -= i13;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean retainAll(Collection elements) {
        int iU;
        kotlin.jvm.internal.n.f(elements, "elements");
        boolean z10 = false;
        z10 = false;
        z10 = false;
        if (!isEmpty() && this.f53860b.length != 0) {
            int iU2 = u(h() + this.f53859a);
            int i10 = this.f53859a;
            if (i10 < iU2) {
                iU = i10;
                while (i10 < iU2) {
                    Object obj = this.f53860b[i10];
                    if (elements.contains(obj)) {
                        this.f53860b[iU] = obj;
                        iU++;
                    } else {
                        z10 = true;
                    }
                    i10++;
                }
                k.k0(this.f53860b, null, iU, iU2);
            } else {
                int length = this.f53860b.length;
                boolean z11 = false;
                int i11 = i10;
                while (i10 < length) {
                    Object[] objArr = this.f53860b;
                    Object obj2 = objArr[i10];
                    objArr[i10] = null;
                    if (elements.contains(obj2)) {
                        this.f53860b[i11] = obj2;
                        i11++;
                    } else {
                        z11 = true;
                    }
                    i10++;
                }
                iU = u(i11);
                for (int i12 = 0; i12 < iU2; i12++) {
                    Object[] objArr2 = this.f53860b;
                    Object obj3 = objArr2[i12];
                    objArr2[i12] = null;
                    if (elements.contains(obj3)) {
                        this.f53860b[iU] = obj3;
                        iU = r(iU);
                    } else {
                        z11 = true;
                    }
                }
                z10 = z11;
            }
            if (z10) {
                v();
                this.f53861c = s(iU - this.f53859a);
            }
        }
        return z10;
    }

    public final int s(int i10) {
        return i10 < 0 ? i10 + this.f53860b.length : i10;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i10, Object obj) {
        c cVar = f.Companion;
        int i11 = this.f53861c;
        cVar.getClass();
        c.a(i10, i11);
        int iU = u(this.f53859a + i10);
        Object[] objArr = this.f53860b;
        Object obj2 = objArr[iU];
        objArr[iU] = obj;
        return obj2;
    }

    public final void t(int i10, int i11) {
        if (i10 < i11) {
            k.k0(this.f53860b, null, i10, i11);
            return;
        }
        Object[] objArr = this.f53860b;
        k.k0(objArr, null, i10, objArr.length);
        k.k0(this.f53860b, null, 0, i11);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final Object[] toArray() {
        return toArray(new Object[h()]);
    }

    public final int u(int i10) {
        Object[] objArr = this.f53860b;
        return i10 >= objArr.length ? i10 - objArr.length : i10;
    }

    public final void v() {
        ((AbstractList) this).modCount++;
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i10, Object obj) {
        int length;
        c cVar = f.Companion;
        int i11 = this.f53861c;
        cVar.getClass();
        c.b(i10, i11);
        if (i10 == this.f53861c) {
            addLast(obj);
            return;
        }
        if (i10 == 0) {
            addFirst(obj);
            return;
        }
        v();
        q(this.f53861c + 1);
        int iU = u(this.f53859a + i10);
        int i12 = this.f53861c;
        if (i10 < ((i12 + 1) >> 1)) {
            if (iU == 0) {
                Object[] objArr = this.f53860b;
                kotlin.jvm.internal.n.f(objArr, "<this>");
                iU = objArr.length;
            }
            int i13 = iU - 1;
            int i14 = this.f53859a;
            if (i14 == 0) {
                Object[] objArr2 = this.f53860b;
                kotlin.jvm.internal.n.f(objArr2, "<this>");
                length = objArr2.length - 1;
            } else {
                length = i14 - 1;
            }
            int i15 = this.f53859a;
            if (i13 >= i15) {
                Object[] objArr3 = this.f53860b;
                objArr3[length] = objArr3[i15];
                k.e0(i15, i15 + 1, i13 + 1, objArr3, objArr3);
            } else {
                Object[] objArr4 = this.f53860b;
                k.e0(i15 - 1, i15, objArr4.length, objArr4, objArr4);
                Object[] objArr5 = this.f53860b;
                objArr5[objArr5.length - 1] = objArr5[0];
                k.e0(0, 1, i13 + 1, objArr5, objArr5);
            }
            this.f53860b[i13] = obj;
            this.f53859a = length;
        } else {
            int iU2 = u(i12 + this.f53859a);
            if (iU < iU2) {
                Object[] objArr6 = this.f53860b;
                k.e0(iU + 1, iU, iU2, objArr6, objArr6);
            } else {
                Object[] objArr7 = this.f53860b;
                k.e0(1, 0, iU2, objArr7, objArr7);
                Object[] objArr8 = this.f53860b;
                objArr8[0] = objArr8[objArr8.length - 1];
                k.e0(iU + 1, iU, objArr8.length - 1, objArr8, objArr8);
            }
            this.f53860b[iU] = obj;
        }
        this.f53861c++;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final Object[] toArray(Object[] array) {
        kotlin.jvm.internal.n.f(array, "array");
        int length = array.length;
        int i10 = this.f53861c;
        if (length < i10) {
            Object objNewInstance = Array.newInstance(array.getClass().getComponentType(), i10);
            kotlin.jvm.internal.n.d(objNewInstance, "null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.arrayOfNulls>");
            array = (Object[]) objNewInstance;
        }
        int iU = u(this.f53861c + this.f53859a);
        int i11 = this.f53859a;
        if (i11 < iU) {
            k.h0(i11, iU, 2, this.f53860b, array);
        } else if (!isEmpty()) {
            Object[] objArr = this.f53860b;
            k.e0(0, this.f53859a, objArr.length, objArr, array);
            Object[] objArr2 = this.f53860b;
            k.e0(objArr2.length - this.f53859a, 0, iU, objArr2, array);
        }
        int i12 = this.f53861c;
        if (i12 < array.length) {
            array[i12] = null;
        }
        return array;
    }

    @Override // java.util.AbstractList, java.util.List
    public final boolean addAll(int i10, Collection elements) {
        kotlin.jvm.internal.n.f(elements, "elements");
        c cVar = f.Companion;
        int i11 = this.f53861c;
        cVar.getClass();
        c.b(i10, i11);
        if (elements.isEmpty()) {
            return false;
        }
        if (i10 == this.f53861c) {
            return addAll(elements);
        }
        v();
        q(elements.size() + this.f53861c);
        int iU = u(this.f53861c + this.f53859a);
        int iU2 = u(this.f53859a + i10);
        int size = elements.size();
        if (i10 < ((this.f53861c + 1) >> 1)) {
            int i12 = this.f53859a;
            int length = i12 - size;
            if (iU2 < i12) {
                Object[] objArr = this.f53860b;
                k.e0(length, i12, objArr.length, objArr, objArr);
                if (size >= iU2) {
                    Object[] objArr2 = this.f53860b;
                    k.e0(objArr2.length - size, 0, iU2, objArr2, objArr2);
                } else {
                    Object[] objArr3 = this.f53860b;
                    k.e0(objArr3.length - size, 0, size, objArr3, objArr3);
                    Object[] objArr4 = this.f53860b;
                    k.e0(0, size, iU2, objArr4, objArr4);
                }
            } else if (length >= 0) {
                Object[] objArr5 = this.f53860b;
                k.e0(length, i12, iU2, objArr5, objArr5);
            } else {
                Object[] objArr6 = this.f53860b;
                length += objArr6.length;
                int i13 = iU2 - i12;
                int length2 = objArr6.length - length;
                if (length2 >= i13) {
                    k.e0(length, i12, iU2, objArr6, objArr6);
                } else {
                    k.e0(length, i12, i12 + length2, objArr6, objArr6);
                    Object[] objArr7 = this.f53860b;
                    k.e0(0, this.f53859a + length2, iU2, objArr7, objArr7);
                }
            }
            this.f53859a = length;
            p(s(iU2 - size), elements);
            return true;
        }
        int i14 = iU2 + size;
        if (iU2 < iU) {
            int i15 = size + iU;
            Object[] objArr8 = this.f53860b;
            if (i15 <= objArr8.length) {
                k.e0(i14, iU2, iU, objArr8, objArr8);
            } else if (i14 >= objArr8.length) {
                k.e0(i14 - objArr8.length, iU2, iU, objArr8, objArr8);
            } else {
                int length3 = iU - (i15 - objArr8.length);
                k.e0(0, length3, iU, objArr8, objArr8);
                Object[] objArr9 = this.f53860b;
                k.e0(i14, iU2, length3, objArr9, objArr9);
            }
        } else {
            Object[] objArr10 = this.f53860b;
            k.e0(size, 0, iU, objArr10, objArr10);
            Object[] objArr11 = this.f53860b;
            if (i14 >= objArr11.length) {
                k.e0(i14 - objArr11.length, iU2, objArr11.length, objArr11, objArr11);
            } else {
                k.e0(0, objArr11.length - size, objArr11.length, objArr11, objArr11);
                Object[] objArr12 = this.f53860b;
                k.e0(i14, iU2, objArr12.length - size, objArr12, objArr12);
            }
        }
        p(iU2, elements);
        return true;
    }
}
