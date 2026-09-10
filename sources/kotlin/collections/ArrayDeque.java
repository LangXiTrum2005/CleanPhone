package kotlin.collections;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.NoSuchElementException;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lkotlin/collections/ArrayDeque;", "E", "Lkotlin/collections/AbstractMutableList;", "Companion", "kotlin-stdlib"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class ArrayDeque<E> extends AbstractMutableList<E> {
    public static final Object[] e0 = new Object[0];
    public int X;

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    public Object[] f43271Y = e0;
    public int Z;

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0011\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0080\u0003\u0018\u00002\u00020\u0001R\u001c\u0010\u0003\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lkotlin/collections/ArrayDeque$Companion;", "", "", "emptyElementData", "[Ljava/lang/Object;", "", "defaultMinCapacity", "I", "kotlin-stdlib"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(Object obj) {
        addLast(obj);
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection elements) {
        Intrinsics.f(elements, "elements");
        if (elements.isEmpty()) {
            return false;
        }
        t();
        g(elements.size() + getF43279Y());
        f(o(getF43279Y() + this.X), elements);
        return true;
    }

    public final void addFirst(Object obj) {
        t();
        g(this.Z + 1);
        int length = this.X;
        if (length == 0) {
            Object[] objArr = this.f43271Y;
            Intrinsics.f(objArr, "<this>");
            length = objArr.length;
        }
        int i2 = length - 1;
        this.X = i2;
        this.f43271Y[i2] = obj;
        this.Z++;
    }

    public final void addLast(Object obj) {
        t();
        g(getF43279Y() + 1);
        this.f43271Y[o(getF43279Y() + this.X)] = obj;
        this.Z = getF43279Y() + 1;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final void clear() {
        if (!isEmpty()) {
            t();
            l(this.X, o(getF43279Y() + this.X));
        }
        this.X = 0;
        this.Z = 0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        return indexOf(obj) != -1;
    }

    @Override // kotlin.collections.AbstractMutableList
    /* JADX INFO: renamed from: d, reason: from getter */
    public final int getF43279Y() {
        return this.Z;
    }

    @Override // kotlin.collections.AbstractMutableList
    public final Object e(int i2) {
        AbstractList.Companion companion = AbstractList.INSTANCE;
        int i3 = this.Z;
        companion.getClass();
        AbstractList.Companion.b(i2, i3);
        if (i2 == CollectionsKt.A(this)) {
            return removeLast();
        }
        if (i2 == 0) {
            return removeFirst();
        }
        t();
        int iO = o(this.X + i2);
        Object[] objArr = this.f43271Y;
        Object obj = objArr[iO];
        if (i2 < (this.Z >> 1)) {
            int i4 = this.X;
            if (iO >= i4) {
                ArraysKt.o(objArr, i4 + 1, objArr, i4, iO);
            } else {
                ArraysKt.o(objArr, 1, objArr, 0, iO);
                Object[] objArr2 = this.f43271Y;
                objArr2[0] = objArr2[objArr2.length - 1];
                int i5 = this.X;
                ArraysKt.o(objArr2, i5 + 1, objArr2, i5, objArr2.length - 1);
            }
            Object[] objArr3 = this.f43271Y;
            int i6 = this.X;
            objArr3[i6] = null;
            this.X = h(i6);
        } else {
            int iO2 = o(CollectionsKt.A(this) + this.X);
            if (iO <= iO2) {
                Object[] objArr4 = this.f43271Y;
                ArraysKt.o(objArr4, iO, objArr4, iO + 1, iO2 + 1);
            } else {
                Object[] objArr5 = this.f43271Y;
                ArraysKt.o(objArr5, iO, objArr5, iO + 1, objArr5.length);
                Object[] objArr6 = this.f43271Y;
                objArr6[objArr6.length - 1] = objArr6[0];
                ArraysKt.o(objArr6, 0, objArr6, 1, iO2 + 1);
            }
            this.f43271Y[iO2] = null;
        }
        this.Z--;
        return obj;
    }

    public final void f(int i2, Collection collection) {
        Iterator<E> it = collection.iterator();
        int length = this.f43271Y.length;
        while (i2 < length && it.hasNext()) {
            this.f43271Y[i2] = it.next();
            i2++;
        }
        int i3 = this.X;
        for (int i4 = 0; i4 < i3 && it.hasNext(); i4++) {
            this.f43271Y[i4] = it.next();
        }
        this.Z = collection.size() + this.Z;
    }

    public final void g(int i2) {
        if (i2 < 0) {
            throw new IllegalStateException("Deque is too big.");
        }
        Object[] objArr = this.f43271Y;
        if (i2 <= objArr.length) {
            return;
        }
        if (objArr == e0) {
            if (i2 < 10) {
                i2 = 10;
            }
            this.f43271Y = new Object[i2];
            return;
        }
        AbstractList.Companion companion = AbstractList.INSTANCE;
        int length = objArr.length;
        companion.getClass();
        Object[] objArr2 = new Object[AbstractList.Companion.e(length, i2)];
        Object[] objArr3 = this.f43271Y;
        ArraysKt.o(objArr3, 0, objArr2, this.X, objArr3.length);
        Object[] objArr4 = this.f43271Y;
        int length2 = objArr4.length;
        int i3 = this.X;
        ArraysKt.o(objArr4, length2 - i3, objArr2, 0, i3);
        this.X = 0;
        this.f43271Y = objArr2;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i2) {
        AbstractList.Companion companion = AbstractList.INSTANCE;
        int i3 = this.Z;
        companion.getClass();
        AbstractList.Companion.b(i2, i3);
        return this.f43271Y[o(this.X + i2)];
    }

    public final int h(int i2) {
        Object[] objArr = this.f43271Y;
        Intrinsics.f(objArr, "<this>");
        if (i2 == objArr.length - 1) {
            return 0;
        }
        return i2 + 1;
    }

    public final int i(int i2) {
        return i2 < 0 ? i2 + this.f43271Y.length : i2;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        int i2;
        int iO = o(getF43279Y() + this.X);
        int length = this.X;
        if (length < iO) {
            while (length < iO) {
                if (Intrinsics.a(obj, this.f43271Y[length])) {
                    i2 = this.X;
                } else {
                    length++;
                }
            }
            return -1;
        }
        if (length < iO) {
            return -1;
        }
        int length2 = this.f43271Y.length;
        while (length < length2) {
            if (Intrinsics.a(obj, this.f43271Y[length])) {
                i2 = this.X;
            } else {
                length++;
            }
        }
        for (int i3 = 0; i3 < iO; i3++) {
            if (Intrinsics.a(obj, this.f43271Y[i3])) {
                length = i3 + this.f43271Y.length;
                i2 = this.X;
            }
        }
        return -1;
        return length - i2;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean isEmpty() {
        return getF43279Y() == 0;
    }

    public final void l(int i2, int i3) {
        if (i2 < i3) {
            ArraysKt.s(this.f43271Y, null, i2, i3);
            return;
        }
        Object[] objArr = this.f43271Y;
        Arrays.fill(objArr, i2, objArr.length, (Object) null);
        ArraysKt.s(this.f43271Y, null, 0, i3);
    }

    @Override // java.util.AbstractList, java.util.List
    public final int lastIndexOf(Object obj) {
        int length;
        int i2;
        int iO = o(this.Z + this.X);
        int i3 = this.X;
        if (i3 < iO) {
            length = iO - 1;
            if (i3 <= length) {
                while (!Intrinsics.a(obj, this.f43271Y[length])) {
                    if (length != i3) {
                        length--;
                    }
                }
                i2 = this.X;
                return length - i2;
            }
            return -1;
        }
        if (i3 > iO) {
            for (int i4 = iO - 1; -1 < i4; i4--) {
                if (Intrinsics.a(obj, this.f43271Y[i4])) {
                    length = i4 + this.f43271Y.length;
                    i2 = this.X;
                    return length - i2;
                }
            }
            Object[] objArr = this.f43271Y;
            Intrinsics.f(objArr, "<this>");
            length = objArr.length - 1;
            int i5 = this.X;
            if (i5 <= length) {
                while (!Intrinsics.a(obj, this.f43271Y[length])) {
                    if (length != i5) {
                        length--;
                    }
                }
                i2 = this.X;
                return length - i2;
            }
        }
        return -1;
    }

    public final int o(int i2) {
        Object[] objArr = this.f43271Y;
        return i2 >= objArr.length ? i2 - objArr.length : i2;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean remove(Object obj) {
        int iIndexOf = indexOf(obj);
        if (iIndexOf == -1) {
            return false;
        }
        e(iIndexOf);
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean removeAll(Collection elements) {
        int iO;
        Intrinsics.f(elements, "elements");
        boolean z2 = false;
        z2 = false;
        z2 = false;
        if (!isEmpty() && this.f43271Y.length != 0) {
            int iO2 = o(this.Z + this.X);
            int i2 = this.X;
            if (i2 < iO2) {
                iO = i2;
                while (i2 < iO2) {
                    Object obj = this.f43271Y[i2];
                    if (elements.contains(obj)) {
                        z2 = true;
                    } else {
                        this.f43271Y[iO] = obj;
                        iO++;
                    }
                    i2++;
                }
                ArraysKt.s(this.f43271Y, null, iO, iO2);
            } else {
                int length = this.f43271Y.length;
                boolean z3 = false;
                int i3 = i2;
                while (i2 < length) {
                    Object[] objArr = this.f43271Y;
                    Object obj2 = objArr[i2];
                    objArr[i2] = null;
                    if (elements.contains(obj2)) {
                        z3 = true;
                    } else {
                        this.f43271Y[i3] = obj2;
                        i3++;
                    }
                    i2++;
                }
                iO = o(i3);
                for (int i4 = 0; i4 < iO2; i4++) {
                    Object[] objArr2 = this.f43271Y;
                    Object obj3 = objArr2[i4];
                    objArr2[i4] = null;
                    if (elements.contains(obj3)) {
                        z3 = true;
                    } else {
                        this.f43271Y[iO] = obj3;
                        iO = h(iO);
                    }
                }
                z2 = z3;
            }
            if (z2) {
                t();
                this.Z = i(iO - this.X);
            }
        }
        return z2;
    }

    public final Object removeFirst() {
        if (isEmpty()) {
            throw new NoSuchElementException("ArrayDeque is empty.");
        }
        t();
        Object[] objArr = this.f43271Y;
        int i2 = this.X;
        Object obj = objArr[i2];
        objArr[i2] = null;
        this.X = h(i2);
        this.Z = getF43279Y() - 1;
        return obj;
    }

    public final Object removeLast() {
        if (isEmpty()) {
            throw new NoSuchElementException("ArrayDeque is empty.");
        }
        t();
        int iO = o(CollectionsKt.A(this) + this.X);
        Object[] objArr = this.f43271Y;
        Object obj = objArr[iO];
        objArr[iO] = null;
        this.Z = getF43279Y() - 1;
        return obj;
    }

    @Override // java.util.AbstractList
    public final void removeRange(int i2, int i3) {
        AbstractList.Companion companion = AbstractList.INSTANCE;
        int i4 = this.Z;
        companion.getClass();
        AbstractList.Companion.d(i2, i3, i4);
        int i5 = i3 - i2;
        if (i5 == 0) {
            return;
        }
        if (i5 == this.Z) {
            clear();
            return;
        }
        if (i5 == 1) {
            e(i2);
            return;
        }
        t();
        if (i2 < this.Z - i3) {
            int iO = o((i2 - 1) + this.X);
            int iO2 = o((i3 - 1) + this.X);
            while (i2 > 0) {
                int i6 = iO + 1;
                int iMin = Math.min(i2, Math.min(i6, iO2 + 1));
                Object[] objArr = this.f43271Y;
                int i7 = iO2 - iMin;
                int i8 = iO - iMin;
                ArraysKt.o(objArr, i7 + 1, objArr, i8 + 1, i6);
                iO = i(i8);
                iO2 = i(i7);
                i2 -= iMin;
            }
            int iO3 = o(this.X + i5);
            l(this.X, iO3);
            this.X = iO3;
        } else {
            int iO4 = o(this.X + i3);
            int iO5 = o(this.X + i2);
            int i9 = this.Z;
            while (true) {
                i9 -= i3;
                if (i9 <= 0) {
                    break;
                }
                Object[] objArr2 = this.f43271Y;
                i3 = Math.min(i9, Math.min(objArr2.length - iO4, objArr2.length - iO5));
                Object[] objArr3 = this.f43271Y;
                int i10 = iO4 + i3;
                ArraysKt.o(objArr3, iO5, objArr3, iO4, i10);
                iO4 = o(i10);
                iO5 = o(iO5 + i3);
            }
            int iO6 = o(this.Z + this.X);
            l(i(iO6 - i5), iO6);
        }
        this.Z -= i5;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean retainAll(Collection elements) {
        int iO;
        Intrinsics.f(elements, "elements");
        boolean z2 = false;
        z2 = false;
        z2 = false;
        if (!isEmpty() && this.f43271Y.length != 0) {
            int iO2 = o(this.Z + this.X);
            int i2 = this.X;
            if (i2 < iO2) {
                iO = i2;
                while (i2 < iO2) {
                    Object obj = this.f43271Y[i2];
                    if (elements.contains(obj)) {
                        this.f43271Y[iO] = obj;
                        iO++;
                    } else {
                        z2 = true;
                    }
                    i2++;
                }
                ArraysKt.s(this.f43271Y, null, iO, iO2);
            } else {
                int length = this.f43271Y.length;
                boolean z3 = false;
                int i3 = i2;
                while (i2 < length) {
                    Object[] objArr = this.f43271Y;
                    Object obj2 = objArr[i2];
                    objArr[i2] = null;
                    if (elements.contains(obj2)) {
                        this.f43271Y[i3] = obj2;
                        i3++;
                    } else {
                        z3 = true;
                    }
                    i2++;
                }
                iO = o(i3);
                for (int i4 = 0; i4 < iO2; i4++) {
                    Object[] objArr2 = this.f43271Y;
                    Object obj3 = objArr2[i4];
                    objArr2[i4] = null;
                    if (elements.contains(obj3)) {
                        this.f43271Y[iO] = obj3;
                        iO = h(iO);
                    } else {
                        z3 = true;
                    }
                }
                z2 = z3;
            }
            if (z2) {
                t();
                this.Z = i(iO - this.X);
            }
        }
        return z2;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i2, Object obj) {
        AbstractList.Companion companion = AbstractList.INSTANCE;
        int i3 = this.Z;
        companion.getClass();
        AbstractList.Companion.b(i2, i3);
        int iO = o(this.X + i2);
        Object[] objArr = this.f43271Y;
        Object obj2 = objArr[iO];
        objArr[iO] = obj;
        return obj2;
    }

    public final void t() {
        ((java.util.AbstractList) this).modCount++;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final Object[] toArray() {
        return toArray(new Object[getF43279Y()]);
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i2, Object obj) {
        int length;
        AbstractList.Companion companion = AbstractList.INSTANCE;
        int i3 = this.Z;
        companion.getClass();
        AbstractList.Companion.c(i2, i3);
        if (i2 == this.Z) {
            addLast(obj);
            return;
        }
        if (i2 == 0) {
            addFirst(obj);
            return;
        }
        t();
        g(this.Z + 1);
        int iO = o(this.X + i2);
        int i4 = this.Z;
        if (i2 < ((i4 + 1) >> 1)) {
            if (iO == 0) {
                Object[] objArr = this.f43271Y;
                Intrinsics.f(objArr, "<this>");
                iO = objArr.length;
            }
            int i5 = iO - 1;
            int i6 = this.X;
            if (i6 == 0) {
                Object[] objArr2 = this.f43271Y;
                Intrinsics.f(objArr2, "<this>");
                length = objArr2.length - 1;
            } else {
                length = i6 - 1;
            }
            int i7 = this.X;
            if (i5 >= i7) {
                Object[] objArr3 = this.f43271Y;
                objArr3[length] = objArr3[i7];
                ArraysKt.o(objArr3, i7, objArr3, i7 + 1, i5 + 1);
            } else {
                Object[] objArr4 = this.f43271Y;
                ArraysKt.o(objArr4, i7 - 1, objArr4, i7, objArr4.length);
                Object[] objArr5 = this.f43271Y;
                objArr5[objArr5.length - 1] = objArr5[0];
                ArraysKt.o(objArr5, 0, objArr5, 1, i5 + 1);
            }
            this.f43271Y[i5] = obj;
            this.X = length;
        } else {
            int iO2 = o(i4 + this.X);
            if (iO < iO2) {
                Object[] objArr6 = this.f43271Y;
                ArraysKt.o(objArr6, iO + 1, objArr6, iO, iO2);
            } else {
                Object[] objArr7 = this.f43271Y;
                ArraysKt.o(objArr7, 1, objArr7, 0, iO2);
                Object[] objArr8 = this.f43271Y;
                objArr8[0] = objArr8[objArr8.length - 1];
                ArraysKt.o(objArr8, iO + 1, objArr8, iO, objArr8.length - 1);
            }
            this.f43271Y[iO] = obj;
        }
        this.Z++;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final Object[] toArray(Object[] array) {
        Intrinsics.f(array, "array");
        int length = array.length;
        int i2 = this.Z;
        if (length < i2) {
            Object objNewInstance = Array.newInstance(array.getClass().getComponentType(), i2);
            Intrinsics.d(objNewInstance, "null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.arrayOfNulls>");
            array = (Object[]) objNewInstance;
        }
        int iO = o(this.Z + this.X);
        int i3 = this.X;
        if (i3 < iO) {
            ArraysKt.p(this.f43271Y, i3, array, iO, 2);
        } else if (!isEmpty()) {
            Object[] objArr = this.f43271Y;
            ArraysKt.o(objArr, 0, array, this.X, objArr.length);
            Object[] objArr2 = this.f43271Y;
            ArraysKt.o(objArr2, objArr2.length - this.X, array, 0, iO);
        }
        int i4 = this.Z;
        if (i4 < array.length) {
            array[i4] = null;
        }
        return array;
    }

    @Override // java.util.AbstractList, java.util.List
    public final boolean addAll(int i2, Collection elements) {
        Intrinsics.f(elements, "elements");
        AbstractList.Companion companion = AbstractList.INSTANCE;
        int i3 = this.Z;
        companion.getClass();
        AbstractList.Companion.c(i2, i3);
        if (elements.isEmpty()) {
            return false;
        }
        if (i2 == this.Z) {
            return addAll(elements);
        }
        t();
        g(elements.size() + this.Z);
        int iO = o(this.Z + this.X);
        int iO2 = o(this.X + i2);
        int size = elements.size();
        if (i2 < ((this.Z + 1) >> 1)) {
            int i4 = this.X;
            int length = i4 - size;
            if (iO2 < i4) {
                Object[] objArr = this.f43271Y;
                ArraysKt.o(objArr, length, objArr, i4, objArr.length);
                if (size >= iO2) {
                    Object[] objArr2 = this.f43271Y;
                    ArraysKt.o(objArr2, objArr2.length - size, objArr2, 0, iO2);
                } else {
                    Object[] objArr3 = this.f43271Y;
                    ArraysKt.o(objArr3, objArr3.length - size, objArr3, 0, size);
                    Object[] objArr4 = this.f43271Y;
                    ArraysKt.o(objArr4, 0, objArr4, size, iO2);
                }
            } else if (length >= 0) {
                Object[] objArr5 = this.f43271Y;
                ArraysKt.o(objArr5, length, objArr5, i4, iO2);
            } else {
                Object[] objArr6 = this.f43271Y;
                length += objArr6.length;
                int i5 = iO2 - i4;
                int length2 = objArr6.length - length;
                if (length2 >= i5) {
                    ArraysKt.o(objArr6, length, objArr6, i4, iO2);
                } else {
                    ArraysKt.o(objArr6, length, objArr6, i4, i4 + length2);
                    Object[] objArr7 = this.f43271Y;
                    ArraysKt.o(objArr7, 0, objArr7, this.X + length2, iO2);
                }
            }
            this.X = length;
            f(i(iO2 - size), elements);
            return true;
        }
        int i6 = iO2 + size;
        if (iO2 < iO) {
            int i7 = size + iO;
            Object[] objArr8 = this.f43271Y;
            if (i7 <= objArr8.length) {
                ArraysKt.o(objArr8, i6, objArr8, iO2, iO);
            } else if (i6 >= objArr8.length) {
                ArraysKt.o(objArr8, i6 - objArr8.length, objArr8, iO2, iO);
            } else {
                int length3 = iO - (i7 - objArr8.length);
                ArraysKt.o(objArr8, 0, objArr8, length3, iO);
                Object[] objArr9 = this.f43271Y;
                ArraysKt.o(objArr9, i6, objArr9, iO2, length3);
            }
        } else {
            Object[] objArr10 = this.f43271Y;
            ArraysKt.o(objArr10, size, objArr10, 0, iO);
            Object[] objArr11 = this.f43271Y;
            if (i6 >= objArr11.length) {
                ArraysKt.o(objArr11, i6 - objArr11.length, objArr11, iO2, objArr11.length);
            } else {
                ArraysKt.o(objArr11, 0, objArr11, objArr11.length - size, objArr11.length);
                Object[] objArr12 = this.f43271Y;
                ArraysKt.o(objArr12, i6, objArr12, iO2, objArr12.length - size);
            }
        }
        f(iO2, elements);
        return true;
    }
}
