package com.adjust.sdk.sig;

import java.lang.reflect.Array;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class e extends AbstractList implements List, q1 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final Object[] f6941d = new Object[0];

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f6942a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Object[] f6943b = f6941d;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f6944c;

    public final void a(int i10) {
        if (i10 < 0) {
            throw new IllegalStateException("Deque is too big.");
        }
        Object[] objArr = this.f6943b;
        if (i10 <= objArr.length) {
            return;
        }
        if (objArr == f6941d) {
            if (i10 < 10) {
                i10 = 10;
            }
            this.f6943b = new Object[i10];
            return;
        }
        int length = objArr.length;
        int i11 = length + (length >> 1);
        if (i11 - i10 < 0) {
            i11 = i10;
        }
        if (i11 - 2147483639 > 0) {
            i11 = i10 > 2147483639 ? Integer.MAX_VALUE : 2147483639;
        }
        Object[] objArr2 = new Object[i11];
        int i12 = this.f6942a;
        System.arraycopy(objArr, i12, objArr2, 0, objArr.length - i12);
        Object[] objArr3 = this.f6943b;
        int length2 = objArr3.length;
        int i13 = this.f6942a;
        System.arraycopy(objArr3, 0, objArr2, length2 - i13, i13);
        this.f6942a = 0;
        this.f6943b = objArr2;
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i10, Object obj) {
        int i11 = this.f6944c;
        if (i10 < 0 || i10 > i11) {
            throw new IndexOutOfBoundsException(defpackage.e.g(i10, i11, "index: ", ", size: "));
        }
        if (i10 == i11) {
            addLast(obj);
            return;
        }
        if (i10 == 0) {
            addFirst(obj);
            return;
        }
        ((AbstractList) this).modCount++;
        a(i11 + 1);
        int iC = c(this.f6942a + i10);
        int i12 = this.f6944c;
        int i13 = (i12 + 1) >> 1;
        int i14 = this.f6942a;
        if (i10 < i13) {
            int length = iC == 0 ? this.f6943b.length - 1 : iC - 1;
            int length2 = i14 == 0 ? this.f6943b.length - 1 : i14 - 1;
            Object[] objArr = this.f6943b;
            if (length >= i14) {
                objArr[length2] = objArr[i14];
                int i15 = i14 + 1;
                System.arraycopy(objArr, i15, objArr, i14, (length + 1) - i15);
            } else {
                System.arraycopy(objArr, i14, objArr, i14 - 1, objArr.length - i14);
                Object[] objArr2 = this.f6943b;
                objArr2[objArr2.length - 1] = objArr2[0];
                System.arraycopy(objArr2, 1, objArr2, 0, length);
            }
            this.f6943b[length] = obj;
            this.f6942a = length2;
        } else {
            int iC2 = c(i14 + i12);
            Object[] objArr3 = this.f6943b;
            if (iC < iC2) {
                System.arraycopy(objArr3, iC, objArr3, iC + 1, iC2 - iC);
            } else {
                System.arraycopy(objArr3, 0, objArr3, 1, iC2);
                Object[] objArr4 = this.f6943b;
                objArr4[0] = objArr4[objArr4.length - 1];
                System.arraycopy(objArr4, iC, objArr4, iC + 1, (objArr4.length - 1) - iC);
            }
            this.f6943b[iC] = obj;
        }
        this.f6944c++;
    }

    @Override // java.util.AbstractList, java.util.List
    public final boolean addAll(int i10, Collection collection) {
        int i11 = this.f6944c;
        if (i10 < 0 || i10 > i11) {
            throw new IndexOutOfBoundsException(defpackage.e.g(i10, i11, "index: ", ", size: "));
        }
        if (collection.isEmpty()) {
            return false;
        }
        int i12 = this.f6944c;
        if (i10 == i12) {
            return addAll(collection);
        }
        ((AbstractList) this).modCount++;
        a(collection.size() + i12);
        int iC = c(this.f6942a + this.f6944c);
        int iC2 = c(this.f6942a + i10);
        int size = collection.size();
        if (i10 < ((this.f6944c + 1) >> 1)) {
            int i13 = this.f6942a;
            int length = i13 - size;
            if (iC2 >= i13) {
                Object[] objArr = this.f6943b;
                if (length >= 0) {
                    System.arraycopy(objArr, i13, objArr, length, iC2 - i13);
                } else {
                    length += objArr.length;
                    int i14 = iC2 - i13;
                    int length2 = objArr.length - length;
                    if (length2 >= i14) {
                        System.arraycopy(objArr, i13, objArr, length, i14);
                    } else {
                        System.arraycopy(objArr, i13, objArr, length, (i13 + length2) - i13);
                        Object[] objArr2 = this.f6943b;
                        int i15 = this.f6942a + length2;
                        System.arraycopy(objArr2, i15, objArr2, 0, iC2 - i15);
                    }
                }
            } else {
                Object[] objArr3 = this.f6943b;
                System.arraycopy(objArr3, i13, objArr3, length, objArr3.length - i13);
                Object[] objArr4 = this.f6943b;
                if (size >= iC2) {
                    System.arraycopy(objArr4, 0, objArr4, objArr4.length - size, iC2);
                } else {
                    System.arraycopy(objArr4, 0, objArr4, objArr4.length - size, size);
                    Object[] objArr5 = this.f6943b;
                    System.arraycopy(objArr5, size, objArr5, 0, iC2 - size);
                }
            }
            this.f6942a = length;
            a(b(iC2 - size), collection);
        } else {
            int i16 = iC2 + size;
            Object[] objArr6 = this.f6943b;
            if (iC2 < iC) {
                int i17 = size + iC;
                if (i17 <= objArr6.length) {
                    System.arraycopy(objArr6, iC2, objArr6, i16, iC - iC2);
                } else if (i16 >= objArr6.length) {
                    System.arraycopy(objArr6, iC2, objArr6, i16 - objArr6.length, iC - iC2);
                } else {
                    int length3 = iC - (i17 - objArr6.length);
                    System.arraycopy(objArr6, length3, objArr6, 0, iC - length3);
                    Object[] objArr7 = this.f6943b;
                    System.arraycopy(objArr7, iC2, objArr7, i16, length3 - iC2);
                }
            } else {
                System.arraycopy(objArr6, 0, objArr6, size, iC);
                Object[] objArr8 = this.f6943b;
                if (i16 >= objArr8.length) {
                    System.arraycopy(objArr8, iC2, objArr8, i16 - objArr8.length, objArr8.length - iC2);
                } else {
                    int length4 = objArr8.length - size;
                    System.arraycopy(objArr8, length4, objArr8, 0, objArr8.length - length4);
                    Object[] objArr9 = this.f6943b;
                    System.arraycopy(objArr9, iC2, objArr9, i16, (objArr9.length - size) - iC2);
                }
            }
            a(iC2, collection);
        }
        return true;
    }

    public final void addFirst(Object obj) {
        ((AbstractList) this).modCount++;
        a(this.f6944c + 1);
        int length = this.f6942a;
        if (length == 0) {
            length = this.f6943b.length;
        }
        int i10 = length - 1;
        this.f6942a = i10;
        this.f6943b[i10] = obj;
        this.f6944c++;
    }

    public final void addLast(Object obj) {
        ((AbstractList) this).modCount++;
        a(this.f6944c + 1);
        this.f6943b[c(this.f6942a + this.f6944c)] = obj;
        this.f6944c++;
    }

    public final int b(int i10) {
        return i10 < 0 ? i10 + this.f6943b.length : i10;
    }

    public final int c(int i10) {
        Object[] objArr = this.f6943b;
        return i10 >= objArr.length ? i10 - objArr.length : i10;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final void clear() {
        if (!isEmpty()) {
            ((AbstractList) this).modCount++;
            int iC = c(this.f6942a + this.f6944c);
            int i10 = this.f6942a;
            Object[] objArr = this.f6943b;
            if (i10 < iC) {
                Arrays.fill(objArr, i10, iC, (Object) null);
            } else {
                Arrays.fill(objArr, i10, objArr.length, (Object) null);
                Arrays.fill(this.f6943b, 0, iC, (Object) null);
            }
        }
        this.f6942a = 0;
        this.f6944c = 0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        return indexOf(obj) != -1;
    }

    public final Object d(int i10) {
        int i11 = this.f6944c;
        if (i10 < 0 || i10 >= i11) {
            throw new IndexOutOfBoundsException(defpackage.e.g(i10, i11, "index: ", ", size: "));
        }
        if (i10 == i11 - 1) {
            return removeLast();
        }
        if (i10 == 0) {
            return removeFirst();
        }
        ((AbstractList) this).modCount++;
        int iC = c(this.f6942a + i10);
        Object[] objArr = this.f6943b;
        Object obj = objArr[iC];
        int i12 = this.f6944c;
        int i13 = i12 >> 1;
        int i14 = this.f6942a;
        if (i10 < i13) {
            if (iC >= i14) {
                System.arraycopy(objArr, i14, objArr, i14 + 1, iC - i14);
            } else {
                System.arraycopy(objArr, 0, objArr, 1, iC);
                Object[] objArr2 = this.f6943b;
                objArr2[0] = objArr2[objArr2.length - 1];
                int i15 = this.f6942a;
                System.arraycopy(objArr2, i15, objArr2, i15 + 1, (objArr2.length - 1) - i15);
            }
            Object[] objArr3 = this.f6943b;
            int i16 = this.f6942a;
            objArr3[i16] = null;
            this.f6942a = i16 != objArr3.length - 1 ? i16 + 1 : 0;
        } else {
            int iC2 = c((i12 - 1) + i14);
            Object[] objArr4 = this.f6943b;
            if (iC <= iC2) {
                int i17 = iC + 1;
                System.arraycopy(objArr4, i17, objArr4, iC, (iC2 + 1) - i17);
            } else {
                int i18 = iC + 1;
                System.arraycopy(objArr4, i18, objArr4, iC, objArr4.length - i18);
                Object[] objArr5 = this.f6943b;
                objArr5[objArr5.length - 1] = objArr5[0];
                System.arraycopy(objArr5, 1, objArr5, 0, iC2);
            }
            this.f6943b[iC2] = null;
        }
        this.f6944c--;
        return obj;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i10) {
        int i11 = this.f6944c;
        if (i10 < 0 || i10 >= i11) {
            throw new IndexOutOfBoundsException(defpackage.e.g(i10, i11, "index: ", ", size: "));
        }
        return this.f6943b[c(this.f6942a + i10)];
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        int i10;
        int iC = c(this.f6942a + this.f6944c);
        int length = this.f6942a;
        if (length < iC) {
            while (length < iC) {
                if (g1.a(obj, this.f6943b[length])) {
                    i10 = this.f6942a;
                } else {
                    length++;
                }
            }
            return -1;
        }
        if (length < iC) {
            return -1;
        }
        int length2 = this.f6943b.length;
        while (length < length2) {
            if (g1.a(obj, this.f6943b[length])) {
                i10 = this.f6942a;
            } else {
                length++;
            }
        }
        for (int i11 = 0; i11 < iC; i11++) {
            if (g1.a(obj, this.f6943b[i11])) {
                length = i11 + this.f6943b.length;
                i10 = this.f6942a;
            }
        }
        return -1;
        return length - i10;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean isEmpty() {
        return this.f6944c == 0;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int lastIndexOf(Object obj) {
        Object[] objArr;
        int length;
        int i10;
        int iC = c(this.f6942a + this.f6944c);
        int i11 = this.f6942a;
        if (i11 < iC) {
            length = iC - 1;
            if (i11 <= length) {
                while (!g1.a(obj, this.f6943b[length])) {
                    if (length != i11) {
                        length--;
                    }
                }
                i10 = this.f6942a;
                return length - i10;
            }
            return -1;
        }
        if (i11 > iC) {
            do {
                iC--;
                objArr = this.f6943b;
                if (-1 >= iC) {
                    length = objArr.length - 1;
                    int i12 = this.f6942a;
                    if (i12 <= length) {
                        while (!g1.a(obj, this.f6943b[length])) {
                            if (length != i12) {
                                length--;
                            }
                        }
                        i10 = this.f6942a;
                    }
                }
                return length - i10;
            } while (!g1.a(obj, objArr[iC]));
            length = iC + this.f6943b.length;
            i10 = this.f6942a;
            return length - i10;
        }
        return -1;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* bridge */ Object remove(int i10) {
        return d(i10);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean removeAll(Collection collection) {
        int iC;
        Object[] objArr;
        boolean z10 = false;
        if (!isEmpty() && this.f6943b.length != 0) {
            int iC2 = c(this.f6942a + this.f6944c);
            int i10 = this.f6942a;
            if (i10 < iC2) {
                iC = i10;
                while (true) {
                    objArr = this.f6943b;
                    if (i10 >= iC2) {
                        break;
                    }
                    Object obj = objArr[i10];
                    if (collection.contains(obj)) {
                        z10 = true;
                    } else {
                        this.f6943b[iC] = obj;
                        iC++;
                    }
                    i10++;
                }
                Arrays.fill(objArr, iC, iC2, (Object) null);
            } else {
                int length = this.f6943b.length;
                boolean z11 = false;
                int i11 = i10;
                while (i10 < length) {
                    Object[] objArr2 = this.f6943b;
                    Object obj2 = objArr2[i10];
                    objArr2[i10] = null;
                    if (collection.contains(obj2)) {
                        z11 = true;
                    } else {
                        this.f6943b[i11] = obj2;
                        i11++;
                    }
                    i10++;
                }
                iC = c(i11);
                for (int i12 = 0; i12 < iC2; i12++) {
                    Object[] objArr3 = this.f6943b;
                    Object obj3 = objArr3[i12];
                    objArr3[i12] = null;
                    if (collection.contains(obj3)) {
                        z11 = true;
                    } else {
                        Object[] objArr4 = this.f6943b;
                        objArr4[iC] = obj3;
                        iC = iC == objArr4.length - 1 ? 0 : iC + 1;
                    }
                }
                z10 = z11;
            }
            if (z10) {
                ((AbstractList) this).modCount++;
                this.f6944c = b(iC - this.f6942a);
            }
        }
        return z10;
    }

    public final Object removeFirst() {
        if (isEmpty()) {
            throw new NoSuchElementException("ArrayDeque is empty.");
        }
        ((AbstractList) this).modCount++;
        Object[] objArr = this.f6943b;
        int i10 = this.f6942a;
        Object obj = objArr[i10];
        objArr[i10] = null;
        this.f6942a = i10 == objArr.length + (-1) ? 0 : i10 + 1;
        this.f6944c--;
        return obj;
    }

    public final Object removeLast() {
        if (isEmpty()) {
            throw new NoSuchElementException("ArrayDeque is empty.");
        }
        ((AbstractList) this).modCount++;
        int iC = c((size() - 1) + this.f6942a);
        Object[] objArr = this.f6943b;
        Object obj = objArr[iC];
        objArr[iC] = null;
        this.f6944c--;
        return obj;
    }

    @Override // java.util.AbstractList
    public final void removeRange(int i10, int i11) {
        int i12 = this.f6944c;
        if (i10 < 0 || i11 > i12) {
            StringBuilder sbL = l1.d.l("fromIndex: ", i10, ", toIndex: ", i11, ", size: ");
            sbL.append(i12);
            throw new IndexOutOfBoundsException(sbL.toString());
        }
        if (i10 > i11) {
            throw new IllegalArgumentException(defpackage.e.g(i10, i11, "fromIndex: ", " > toIndex: "));
        }
        int i13 = i11 - i10;
        if (i13 == 0) {
            return;
        }
        if (i13 == i12) {
            clear();
            return;
        }
        if (i13 == 1) {
            d(i10);
            return;
        }
        ((AbstractList) this).modCount++;
        int i14 = i12 - i11;
        int i15 = this.f6942a;
        if (i10 < i14) {
            int iC = c((i10 - 1) + i15);
            int iC2 = c(this.f6942a + (i11 - 1));
            while (i10 > 0) {
                int i16 = iC + 1;
                int iMin = Math.min(i10, Math.min(i16, iC2 + 1));
                Object[] objArr = this.f6943b;
                int i17 = iC2 - iMin;
                int i18 = iC - iMin;
                int i19 = i18 + 1;
                System.arraycopy(objArr, i19, objArr, i17 + 1, i16 - i19);
                iC = b(i18);
                iC2 = b(i17);
                i10 -= iMin;
            }
            int iC3 = c(this.f6942a + i13);
            int i20 = this.f6942a;
            Object[] objArr2 = this.f6943b;
            if (i20 < iC3) {
                Arrays.fill(objArr2, i20, iC3, (Object) null);
            } else {
                Arrays.fill(objArr2, i20, objArr2.length, (Object) null);
                Arrays.fill(this.f6943b, 0, iC3, (Object) null);
            }
            this.f6942a = iC3;
        } else {
            int iC4 = c(i15 + i11);
            int iC5 = c(this.f6942a + i10);
            int i21 = this.f6944c;
            while (true) {
                i21 -= i11;
                if (i21 <= 0) {
                    break;
                }
                Object[] objArr3 = this.f6943b;
                i11 = Math.min(i21, Math.min(objArr3.length - iC4, objArr3.length - iC5));
                Object[] objArr4 = this.f6943b;
                int i22 = iC4 + i11;
                System.arraycopy(objArr4, iC4, objArr4, iC5, i22 - iC4);
                iC4 = c(i22);
                iC5 = c(iC5 + i11);
            }
            int iC6 = c(this.f6942a + this.f6944c);
            int iB = b(iC6 - i13);
            Object[] objArr5 = this.f6943b;
            if (iB < iC6) {
                Arrays.fill(objArr5, iB, iC6, (Object) null);
            } else {
                Arrays.fill(objArr5, iB, objArr5.length, (Object) null);
                Arrays.fill(this.f6943b, 0, iC6, (Object) null);
            }
        }
        this.f6944c -= i13;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean retainAll(Collection collection) {
        int iC;
        Object[] objArr;
        boolean z10 = false;
        if (!isEmpty() && this.f6943b.length != 0) {
            int iC2 = c(this.f6942a + this.f6944c);
            int i10 = this.f6942a;
            if (i10 < iC2) {
                iC = i10;
                while (true) {
                    objArr = this.f6943b;
                    if (i10 >= iC2) {
                        break;
                    }
                    Object obj = objArr[i10];
                    if (collection.contains(obj)) {
                        this.f6943b[iC] = obj;
                        iC++;
                    } else {
                        z10 = true;
                    }
                    i10++;
                }
                Arrays.fill(objArr, iC, iC2, (Object) null);
            } else {
                int length = this.f6943b.length;
                boolean z11 = false;
                int i11 = i10;
                while (i10 < length) {
                    Object[] objArr2 = this.f6943b;
                    Object obj2 = objArr2[i10];
                    objArr2[i10] = null;
                    if (collection.contains(obj2)) {
                        this.f6943b[i11] = obj2;
                        i11++;
                    } else {
                        z11 = true;
                    }
                    i10++;
                }
                iC = c(i11);
                for (int i12 = 0; i12 < iC2; i12++) {
                    Object[] objArr3 = this.f6943b;
                    Object obj3 = objArr3[i12];
                    objArr3[i12] = null;
                    if (collection.contains(obj3)) {
                        Object[] objArr4 = this.f6943b;
                        objArr4[iC] = obj3;
                        iC = iC == objArr4.length - 1 ? 0 : iC + 1;
                    } else {
                        z11 = true;
                    }
                }
                z10 = z11;
            }
            if (z10) {
                ((AbstractList) this).modCount++;
                this.f6944c = b(iC - this.f6942a);
            }
        }
        return z10;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i10, Object obj) {
        int i11 = this.f6944c;
        if (i10 < 0 || i10 >= i11) {
            throw new IndexOutOfBoundsException(defpackage.e.g(i10, i11, "index: ", ", size: "));
        }
        int iC = c(this.f6942a + i10);
        Object[] objArr = this.f6943b;
        Object obj2 = objArr[iC];
        objArr[iC] = obj;
        return obj2;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f6944c;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final Object[] toArray() {
        return toArray(new Object[this.f6944c]);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean remove(Object obj) {
        int iIndexOf = indexOf(obj);
        if (iIndexOf == -1) {
            return false;
        }
        d(iIndexOf);
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final Object[] toArray(Object[] objArr) {
        int length = objArr.length;
        int i10 = this.f6944c;
        if (length < i10) {
            objArr = (Object[]) Array.newInstance(objArr.getClass().getComponentType(), i10);
        }
        int iC = c(this.f6942a + this.f6944c);
        int i11 = this.f6942a;
        if (i11 < iC) {
            System.arraycopy(this.f6943b, i11, objArr, 0, iC - i11);
        } else if (!isEmpty()) {
            Object[] objArr2 = this.f6943b;
            int i12 = this.f6942a;
            System.arraycopy(objArr2, i12, objArr, 0, objArr2.length - i12);
            Object[] objArr3 = this.f6943b;
            System.arraycopy(objArr3, 0, objArr, objArr3.length - this.f6942a, iC);
        }
        int i13 = this.f6944c;
        if (i13 < objArr.length) {
            objArr[i13] = null;
        }
        return objArr;
    }

    public final void a(int i10, Collection collection) {
        Iterator it = collection.iterator();
        int length = this.f6943b.length;
        while (i10 < length && it.hasNext()) {
            this.f6943b[i10] = it.next();
            i10++;
        }
        int i11 = this.f6942a;
        for (int i12 = 0; i12 < i11 && it.hasNext(); i12++) {
            this.f6943b[i12] = it.next();
        }
        this.f6944c = collection.size() + this.f6944c;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(Object obj) {
        addLast(obj);
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        if (collection.isEmpty()) {
            return false;
        }
        ((AbstractList) this).modCount++;
        a(collection.size() + this.f6944c);
        a(c(this.f6942a + this.f6944c), collection);
        return true;
    }
}
