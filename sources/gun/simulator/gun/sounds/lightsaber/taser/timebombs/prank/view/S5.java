package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* JADX INFO: loaded from: classes4.dex */
public final class S5 extends P {
    public static final Object[] d = new Object[0];

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f3699a;
    public Object[] b = d;
    public int c;

    public final void a(int i, Collection collection) {
        Iterator it = collection.iterator();
        int length = this.b.length;
        while (i < length && it.hasNext()) {
            this.b[i] = it.next();
            i++;
        }
        int i2 = this.f3699a;
        for (int i3 = 0; i3 < i2 && it.hasNext(); i3++) {
            this.b[i3] = it.next();
        }
        this.c = collection.size() + this.c;
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i, Object obj) {
        int length;
        C2443Gk.c(i, this.c);
        int i2 = this.c;
        if (i == i2) {
            addLast(obj);
            return;
        }
        if (i == 0) {
            addFirst(obj);
            return;
        }
        b(i2 + 1);
        int iD = d(this.f3699a + i);
        int i3 = this.c;
        if (i < ((i3 + 1) >> 1)) {
            if (iD == 0) {
                Object[] objArr = this.b;
                AbstractC2995aW.q(objArr, "<this>");
                iD = objArr.length;
            }
            int i4 = iD - 1;
            int i5 = this.f3699a;
            if (i5 == 0) {
                Object[] objArr2 = this.b;
                AbstractC2995aW.q(objArr2, "<this>");
                length = objArr2.length - 1;
            } else {
                length = i5 - 1;
            }
            int i6 = this.f3699a;
            if (i4 >= i6) {
                Object[] objArr3 = this.b;
                objArr3[length] = objArr3[i6];
                U5.k0(objArr3, i6, objArr3, i6 + 1, i4 + 1);
            } else {
                Object[] objArr4 = this.b;
                U5.k0(objArr4, i6 - 1, objArr4, i6, objArr4.length);
                Object[] objArr5 = this.b;
                objArr5[objArr5.length - 1] = objArr5[0];
                U5.k0(objArr5, 0, objArr5, 1, i4 + 1);
            }
            this.b[i4] = obj;
            this.f3699a = length;
        } else {
            int iD2 = d(this.f3699a + i3);
            if (iD < iD2) {
                Object[] objArr6 = this.b;
                U5.k0(objArr6, iD + 1, objArr6, iD, iD2);
            } else {
                Object[] objArr7 = this.b;
                U5.k0(objArr7, 1, objArr7, 0, iD2);
                Object[] objArr8 = this.b;
                objArr8[0] = objArr8[objArr8.length - 1];
                U5.k0(objArr8, iD + 1, objArr8, iD, objArr8.length - 1);
            }
            this.b[iD] = obj;
        }
        this.c++;
    }

    @Override // java.util.AbstractList, java.util.List
    public final boolean addAll(int i, Collection collection) {
        AbstractC2995aW.q(collection, "elements");
        C2443Gk.c(i, this.c);
        if (collection.isEmpty()) {
            return false;
        }
        int i2 = this.c;
        if (i == i2) {
            return addAll(collection);
        }
        b(collection.size() + i2);
        int iD = d(this.f3699a + this.c);
        int iD2 = d(this.f3699a + i);
        int size = collection.size();
        if (i < ((this.c + 1) >> 1)) {
            int i3 = this.f3699a;
            int length = i3 - size;
            if (iD2 < i3) {
                Object[] objArr = this.b;
                U5.k0(objArr, length, objArr, i3, objArr.length);
                if (size >= iD2) {
                    Object[] objArr2 = this.b;
                    U5.k0(objArr2, objArr2.length - size, objArr2, 0, iD2);
                } else {
                    Object[] objArr3 = this.b;
                    U5.k0(objArr3, objArr3.length - size, objArr3, 0, size);
                    Object[] objArr4 = this.b;
                    U5.k0(objArr4, 0, objArr4, size, iD2);
                }
            } else if (length >= 0) {
                Object[] objArr5 = this.b;
                U5.k0(objArr5, length, objArr5, i3, iD2);
            } else {
                Object[] objArr6 = this.b;
                length += objArr6.length;
                int i4 = iD2 - i3;
                int length2 = objArr6.length - length;
                if (length2 >= i4) {
                    U5.k0(objArr6, length, objArr6, i3, iD2);
                } else {
                    U5.k0(objArr6, length, objArr6, i3, i3 + length2);
                    Object[] objArr7 = this.b;
                    U5.k0(objArr7, 0, objArr7, this.f3699a + length2, iD2);
                }
            }
            this.f3699a = length;
            int length3 = iD2 - size;
            if (length3 < 0) {
                length3 += this.b.length;
            }
            a(length3, collection);
        } else {
            int i5 = iD2 + size;
            if (iD2 < iD) {
                int i6 = size + iD;
                Object[] objArr8 = this.b;
                if (i6 <= objArr8.length) {
                    U5.k0(objArr8, i5, objArr8, iD2, iD);
                } else if (i5 >= objArr8.length) {
                    U5.k0(objArr8, i5 - objArr8.length, objArr8, iD2, iD);
                } else {
                    int length4 = iD - (i6 - objArr8.length);
                    U5.k0(objArr8, 0, objArr8, length4, iD);
                    Object[] objArr9 = this.b;
                    U5.k0(objArr9, i5, objArr9, iD2, length4);
                }
            } else {
                Object[] objArr10 = this.b;
                U5.k0(objArr10, size, objArr10, 0, iD);
                Object[] objArr11 = this.b;
                if (i5 >= objArr11.length) {
                    U5.k0(objArr11, i5 - objArr11.length, objArr11, iD2, objArr11.length);
                } else {
                    U5.k0(objArr11, 0, objArr11, objArr11.length - size, objArr11.length);
                    Object[] objArr12 = this.b;
                    U5.k0(objArr12, i5, objArr12, iD2, objArr12.length - size);
                }
            }
            a(iD2, collection);
        }
        return true;
    }

    public final void addFirst(Object obj) {
        b(this.c + 1);
        int length = this.f3699a;
        if (length == 0) {
            Object[] objArr = this.b;
            AbstractC2995aW.q(objArr, "<this>");
            length = objArr.length;
        }
        int i = length - 1;
        this.f3699a = i;
        this.b[i] = obj;
        this.c++;
    }

    public final void addLast(Object obj) {
        b(this.c + 1);
        this.b[d(this.f3699a + this.c)] = obj;
        this.c++;
    }

    public final void b(int i) {
        if (i < 0) {
            throw new IllegalStateException("Deque is too big.");
        }
        Object[] objArr = this.b;
        if (i <= objArr.length) {
            return;
        }
        if (objArr == d) {
            if (i < 10) {
                i = 10;
            }
            this.b = new Object[i];
            return;
        }
        int length = objArr.length;
        int i2 = length + (length >> 1);
        if (i2 - i < 0) {
            i2 = i;
        }
        if (i2 - 2147483639 > 0) {
            i2 = i > 2147483639 ? Integer.MAX_VALUE : 2147483639;
        }
        Object[] objArr2 = new Object[i2];
        U5.k0(objArr, 0, objArr2, this.f3699a, objArr.length);
        Object[] objArr3 = this.b;
        int length2 = objArr3.length;
        int i3 = this.f3699a;
        U5.k0(objArr3, length2 - i3, objArr2, 0, i3);
        this.f3699a = 0;
        this.b = objArr2;
    }

    public final int c(int i) {
        Object[] objArr = this.b;
        AbstractC2995aW.q(objArr, "<this>");
        if (i == objArr.length - 1) {
            return 0;
        }
        return i + 1;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final void clear() {
        int iD = d(this.f3699a + this.c);
        int i = this.f3699a;
        if (i < iD) {
            U5.l0(null, this.b, i, iD);
        } else if (!isEmpty()) {
            Object[] objArr = this.b;
            Arrays.fill(objArr, this.f3699a, objArr.length, (Object) null);
            U5.l0(null, this.b, 0, iD);
        }
        this.f3699a = 0;
        this.c = 0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        return indexOf(obj) != -1;
    }

    public final int d(int i) {
        Object[] objArr = this.b;
        return i >= objArr.length ? i - objArr.length : i;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i) {
        C2443Gk.b(i, this.c);
        return this.b[d(this.f3699a + i)];
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        int i;
        int iD = d(this.f3699a + this.c);
        int length = this.f3699a;
        if (length < iD) {
            while (length < iD) {
                if (AbstractC2995aW.i(obj, this.b[length])) {
                    i = this.f3699a;
                } else {
                    length++;
                }
            }
            return -1;
        }
        if (length < iD) {
            return -1;
        }
        int length2 = this.b.length;
        while (length < length2) {
            if (AbstractC2995aW.i(obj, this.b[length])) {
                i = this.f3699a;
            } else {
                length++;
            }
        }
        for (int i2 = 0; i2 < iD; i2++) {
            if (AbstractC2995aW.i(obj, this.b[i2])) {
                length = i2 + this.b.length;
                i = this.f3699a;
            }
        }
        return -1;
        return length - i;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean isEmpty() {
        return this.c == 0;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int lastIndexOf(Object obj) {
        int length;
        int i;
        int iD = d(this.f3699a + this.c);
        int i2 = this.f3699a;
        if (i2 < iD) {
            length = iD - 1;
            if (i2 <= length) {
                while (!AbstractC2995aW.i(obj, this.b[length])) {
                    if (length != i2) {
                        length--;
                    }
                }
                i = this.f3699a;
                return length - i;
            }
            return -1;
        }
        if (i2 > iD) {
            for (int i3 = iD - 1; -1 < i3; i3--) {
                if (AbstractC2995aW.i(obj, this.b[i3])) {
                    length = i3 + this.b.length;
                    i = this.f3699a;
                    return length - i;
                }
            }
            Object[] objArr = this.b;
            AbstractC2995aW.q(objArr, "<this>");
            length = objArr.length - 1;
            int i4 = this.f3699a;
            if (i4 <= length) {
                while (!AbstractC2995aW.i(obj, this.b[length])) {
                    if (length != i4) {
                        length--;
                    }
                }
                i = this.f3699a;
                return length - i;
            }
        }
        return -1;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean remove(Object obj) {
        int iIndexOf = indexOf(obj);
        if (iIndexOf == -1) {
            return false;
        }
        remove(iIndexOf);
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean removeAll(Collection collection) {
        int iD;
        AbstractC2995aW.q(collection, "elements");
        boolean z = false;
        z = false;
        z = false;
        if (!isEmpty() && this.b.length != 0) {
            int iD2 = d(this.f3699a + this.c);
            int i = this.f3699a;
            if (i < iD2) {
                iD = i;
                while (i < iD2) {
                    Object obj = this.b[i];
                    if (!collection.contains(obj)) {
                        this.b[iD] = obj;
                        iD++;
                    } else {
                        z = true;
                    }
                    i++;
                }
                U5.l0(null, this.b, iD, iD2);
            } else {
                int length = this.b.length;
                int i2 = i;
                boolean z2 = false;
                while (i < length) {
                    Object[] objArr = this.b;
                    Object obj2 = objArr[i];
                    objArr[i] = null;
                    if (!collection.contains(obj2)) {
                        this.b[i2] = obj2;
                        i2++;
                    } else {
                        z2 = true;
                    }
                    i++;
                }
                iD = d(i2);
                for (int i3 = 0; i3 < iD2; i3++) {
                    Object[] objArr2 = this.b;
                    Object obj3 = objArr2[i3];
                    objArr2[i3] = null;
                    if (!collection.contains(obj3)) {
                        this.b[iD] = obj3;
                        iD = c(iD);
                    } else {
                        z2 = true;
                    }
                }
                z = z2;
            }
            if (z) {
                int length2 = iD - this.f3699a;
                if (length2 < 0) {
                    length2 += this.b.length;
                }
                this.c = length2;
            }
        }
        return z;
    }

    public final Object removeFirst() {
        if (isEmpty()) {
            throw new NoSuchElementException("ArrayDeque is empty.");
        }
        Object[] objArr = this.b;
        int i = this.f3699a;
        Object obj = objArr[i];
        objArr[i] = null;
        this.f3699a = c(i);
        this.c--;
        return obj;
    }

    public final Object removeLast() {
        if (isEmpty()) {
            throw new NoSuchElementException("ArrayDeque is empty.");
        }
        int iD = d(AbstractC2340Cl.y(this) + this.f3699a);
        Object[] objArr = this.b;
        Object obj = objArr[iD];
        objArr[iD] = null;
        this.c--;
        return obj;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean retainAll(Collection collection) {
        int iD;
        AbstractC2995aW.q(collection, "elements");
        boolean z = false;
        z = false;
        z = false;
        if (!isEmpty() && this.b.length != 0) {
            int iD2 = d(this.f3699a + this.c);
            int i = this.f3699a;
            if (i < iD2) {
                iD = i;
                while (i < iD2) {
                    Object obj = this.b[i];
                    if (collection.contains(obj)) {
                        this.b[iD] = obj;
                        iD++;
                    } else {
                        z = true;
                    }
                    i++;
                }
                U5.l0(null, this.b, iD, iD2);
            } else {
                int length = this.b.length;
                int i2 = i;
                boolean z2 = false;
                while (i < length) {
                    Object[] objArr = this.b;
                    Object obj2 = objArr[i];
                    objArr[i] = null;
                    if (collection.contains(obj2)) {
                        this.b[i2] = obj2;
                        i2++;
                    } else {
                        z2 = true;
                    }
                    i++;
                }
                iD = d(i2);
                for (int i3 = 0; i3 < iD2; i3++) {
                    Object[] objArr2 = this.b;
                    Object obj3 = objArr2[i3];
                    objArr2[i3] = null;
                    if (collection.contains(obj3)) {
                        this.b[iD] = obj3;
                        iD = c(iD);
                    } else {
                        z2 = true;
                    }
                }
                z = z2;
            }
            if (z) {
                int length2 = iD - this.f3699a;
                if (length2 < 0) {
                    length2 += this.b.length;
                }
                this.c = length2;
            }
        }
        return z;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i, Object obj) {
        C2443Gk.b(i, this.c);
        int iD = d(this.f3699a + i);
        Object[] objArr = this.b;
        Object obj2 = objArr[iD];
        objArr[iD] = obj;
        return obj2;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final Object[] toArray(Object[] objArr) {
        AbstractC2995aW.q(objArr, "array");
        int length = objArr.length;
        int i = this.c;
        if (length < i) {
            Object objNewInstance = Array.newInstance(objArr.getClass().getComponentType(), i);
            AbstractC2995aW.o(objNewInstance, "null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.arrayOfNulls>");
            objArr = (Object[]) objNewInstance;
        }
        int iD = d(this.f3699a + this.c);
        int i2 = this.f3699a;
        if (i2 < iD) {
            U5.k0(this.b, 0, objArr, i2, iD);
        } else if (!isEmpty()) {
            Object[] objArr2 = this.b;
            U5.k0(objArr2, 0, objArr, this.f3699a, objArr2.length);
            Object[] objArr3 = this.b;
            U5.k0(objArr3, objArr3.length - this.f3699a, objArr, 0, iD);
        }
        int length2 = objArr.length;
        int i3 = this.c;
        if (length2 > i3) {
            objArr[i3] = null;
        }
        return objArr;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final Object[] toArray() {
        return toArray(new Object[this.c]);
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(Object obj) {
        addLast(obj);
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        AbstractC2995aW.q(collection, "elements");
        if (collection.isEmpty()) {
            return false;
        }
        b(collection.size() + this.c);
        a(d(this.f3699a + this.c), collection);
        return true;
    }
}
