package com.google.common.collect;

import com.google.common.base.Preconditions;
import com.google.common.primitives.Ints;
import java.io.IOException;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.AbstractSet;
import java.util.Arrays;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.NoSuchElementException;
import java.util.Objects;
import java.util.Set;

/* JADX INFO: loaded from: classes4.dex */
@ElementTypesAreNonnullByDefault
class CompactHashSet<E> extends AbstractSet<E> implements Serializable {
    public transient Object X;

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    public transient int[] f19804Y;
    public transient Object[] Z;
    public transient int e0;
    public transient int f0;

    public CompactHashSet(int i2) {
        o(i2);
    }

    private void readObject(ObjectInputStream objectInputStream) throws ClassNotFoundException, IOException {
        objectInputStream.defaultReadObject();
        int i2 = objectInputStream.readInt();
        if (i2 < 0) {
            throw new InvalidObjectException(android.support.v4.media.a.h(i2, "Invalid size: "));
        }
        o(i2);
        for (int i3 = 0; i3 < i2; i3++) {
            add(objectInputStream.readObject());
        }
    }

    private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
        objectOutputStream.defaultWriteObject();
        objectOutputStream.writeInt(size());
        Iterator it = iterator();
        while (it.hasNext()) {
            objectOutputStream.writeObject(it.next());
        }
    }

    public int a(int i2, int i3) {
        return i2 - 1;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean add(Object obj) {
        int iMin;
        if (t()) {
            d();
        }
        Set setH = h();
        if (setH != null) {
            return setH.add(obj);
        }
        int[] iArrV = v();
        Object[] objArrU = u();
        int i2 = this.f0;
        int i3 = i2 + 1;
        int iC = Hashing.c(obj);
        int iX = (1 << (this.e0 & 31)) - 1;
        int i4 = iC & iX;
        Object obj2 = this.X;
        Objects.requireNonNull(obj2);
        int iE = CompactHashing.e(i4, obj2);
        if (iE != 0) {
            int i5 = ~iX;
            int i6 = iC & i5;
            int i7 = 0;
            while (true) {
                int i8 = iE - 1;
                int i9 = iArrV[i8];
                if ((i9 & i5) == i6 && com.google.common.base.Objects.a(obj, objArrU[i8])) {
                    return false;
                }
                int i10 = i9 & iX;
                i7++;
                if (i10 == 0) {
                    if (i7 < 9) {
                        if (i3 <= iX) {
                            iArrV[i8] = CompactHashing.b(i9, i3, iX);
                            break;
                        }
                        iX = x(iX, CompactHashing.c(iX), iC, i2);
                        break;
                    }
                    return g().add(obj);
                }
                iE = i10;
            }
        } else if (i3 > iX) {
            iX = x(iX, CompactHashing.c(iX), iC, i2);
        } else {
            Object obj3 = this.X;
            Objects.requireNonNull(obj3);
            CompactHashing.f(i4, i3, obj3);
        }
        int length = v().length;
        if (i3 > length && (iMin = Math.min(1073741823, (Math.max(1, length >>> 1) + length) | 1)) != length) {
            w(iMin);
        }
        p(i2, iC, iX, obj);
        this.f0 = i3;
        this.e0 += 32;
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public void clear() {
        if (t()) {
            return;
        }
        this.e0 += 32;
        Set setH = h();
        if (setH != null) {
            this.e0 = Ints.c(size(), 3);
            setH.clear();
            this.X = null;
            this.f0 = 0;
            return;
        }
        Arrays.fill(u(), 0, this.f0, (Object) null);
        Object obj = this.X;
        Objects.requireNonNull(obj);
        if (obj instanceof byte[]) {
            Arrays.fill((byte[]) obj, (byte) 0);
        } else if (obj instanceof short[]) {
            Arrays.fill((short[]) obj, (short) 0);
        } else {
            Arrays.fill((int[]) obj, 0);
        }
        Arrays.fill(v(), 0, this.f0, 0);
        this.f0 = 0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        if (t()) {
            return false;
        }
        Set setH = h();
        if (setH != null) {
            return setH.contains(obj);
        }
        int iC = Hashing.c(obj);
        int i2 = (1 << (this.e0 & 31)) - 1;
        Object obj2 = this.X;
        Objects.requireNonNull(obj2);
        int iE = CompactHashing.e(iC & i2, obj2);
        if (iE == 0) {
            return false;
        }
        int i3 = ~i2;
        int i4 = iC & i3;
        do {
            int i5 = iE - 1;
            int i6 = v()[i5];
            if ((i6 & i3) == i4 && com.google.common.base.Objects.a(obj, u()[i5])) {
                return true;
            }
            iE = i6 & i2;
        } while (iE != 0);
        return false;
    }

    public int d() {
        Preconditions.o("Arrays already allocated", t());
        int i2 = this.e0;
        int iMax = Math.max(4, Hashing.a(i2 + 1, 1.0d));
        this.X = CompactHashing.a(iMax);
        this.e0 = CompactHashing.b(this.e0, 32 - Integer.numberOfLeadingZeros(iMax - 1), 31);
        this.f19804Y = new int[i2];
        this.Z = new Object[i2];
        return i2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public LinkedHashSet g() {
        LinkedHashSet linkedHashSet = new LinkedHashSet(1 << (this.e0 & 31), 1.0f);
        int i2 = i();
        while (i2 >= 0) {
            linkedHashSet.add(u()[i2]);
            i2 = l(i2);
        }
        this.X = linkedHashSet;
        this.f19804Y = null;
        this.Z = null;
        this.e0 += 32;
        return linkedHashSet;
    }

    public final Set h() {
        Object obj = this.X;
        if (obj instanceof Set) {
            return (Set) obj;
        }
        return null;
    }

    public int i() {
        return isEmpty() ? -1 : 0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean isEmpty() {
        return size() == 0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        Set setH = h();
        return setH != null ? setH.iterator() : new Iterator<Object>() { // from class: com.google.common.collect.CompactHashSet.1
            public int X;

            /* JADX INFO: renamed from: Y, reason: collision with root package name */
            public int f19805Y;
            public int Z = -1;

            {
                this.X = CompactHashSet.this.e0;
                this.f19805Y = CompactHashSet.this.i();
            }

            @Override // java.util.Iterator
            public final boolean hasNext() {
                return this.f19805Y >= 0;
            }

            @Override // java.util.Iterator
            public final Object next() {
                CompactHashSet compactHashSet = CompactHashSet.this;
                if (compactHashSet.e0 != this.X) {
                    throw new ConcurrentModificationException();
                }
                if (!hasNext()) {
                    throw new NoSuchElementException();
                }
                int i2 = this.f19805Y;
                this.Z = i2;
                Object obj = compactHashSet.u()[i2];
                this.f19805Y = compactHashSet.l(this.f19805Y);
                return obj;
            }

            @Override // java.util.Iterator
            public final void remove() {
                CompactHashSet compactHashSet = CompactHashSet.this;
                if (compactHashSet.e0 != this.X) {
                    throw new ConcurrentModificationException();
                }
                CollectPreconditions.d(this.Z >= 0);
                this.X += 32;
                compactHashSet.remove(compactHashSet.u()[this.Z]);
                this.f19805Y = compactHashSet.a(this.f19805Y, this.Z);
                this.Z = -1;
            }
        };
    }

    public int l(int i2) {
        int i3 = i2 + 1;
        if (i3 < this.f0) {
            return i3;
        }
        return -1;
    }

    public void o(int i2) {
        Preconditions.e("Expected size must be >= 0", i2 >= 0);
        this.e0 = Ints.c(i2, 1);
    }

    public void p(int i2, int i3, int i4, Object obj) {
        v()[i2] = CompactHashing.b(i3, 0, i4);
        u()[i2] = obj;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean remove(Object obj) {
        if (t()) {
            return false;
        }
        Set setH = h();
        if (setH != null) {
            return setH.remove(obj);
        }
        int i2 = (1 << (this.e0 & 31)) - 1;
        Object obj2 = this.X;
        Objects.requireNonNull(obj2);
        int iD = CompactHashing.d(obj, null, i2, obj2, v(), u(), null);
        if (iD == -1) {
            return false;
        }
        s(iD, i2);
        this.f0--;
        this.e0 += 32;
        return true;
    }

    public void s(int i2, int i3) {
        Object obj = this.X;
        Objects.requireNonNull(obj);
        int[] iArrV = v();
        Object[] objArrU = u();
        int size = size();
        int i4 = size - 1;
        if (i2 >= i4) {
            objArrU[i2] = null;
            iArrV[i2] = 0;
            return;
        }
        Object obj2 = objArrU[i4];
        objArrU[i2] = obj2;
        objArrU[i4] = null;
        iArrV[i2] = iArrV[i4];
        iArrV[i4] = 0;
        int iC = Hashing.c(obj2) & i3;
        int iE = CompactHashing.e(iC, obj);
        if (iE == size) {
            CompactHashing.f(iC, i2 + 1, obj);
            return;
        }
        while (true) {
            int i5 = iE - 1;
            int i6 = iArrV[i5];
            int i7 = i6 & i3;
            if (i7 == size) {
                iArrV[i5] = CompactHashing.b(i6, i2 + 1, i3);
                return;
            }
            iE = i7;
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        Set setH = h();
        return setH != null ? setH.size() : this.f0;
    }

    public final boolean t() {
        return this.X == null;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public Object[] toArray() {
        if (t()) {
            return new Object[0];
        }
        Set setH = h();
        return setH != null ? setH.toArray() : Arrays.copyOf(u(), this.f0);
    }

    public final Object[] u() {
        Object[] objArr = this.Z;
        Objects.requireNonNull(objArr);
        return objArr;
    }

    public final int[] v() {
        int[] iArr = this.f19804Y;
        Objects.requireNonNull(iArr);
        return iArr;
    }

    public void w(int i2) {
        this.f19804Y = Arrays.copyOf(v(), i2);
        this.Z = Arrays.copyOf(u(), i2);
    }

    public final int x(int i2, int i3, int i4, int i5) {
        Object objA = CompactHashing.a(i3);
        int i6 = i3 - 1;
        if (i5 != 0) {
            CompactHashing.f(i4 & i6, i5 + 1, objA);
        }
        Object obj = this.X;
        Objects.requireNonNull(obj);
        int[] iArrV = v();
        for (int i7 = 0; i7 <= i2; i7++) {
            int iE = CompactHashing.e(i7, obj);
            while (iE != 0) {
                int i8 = iE - 1;
                int i9 = iArrV[i8];
                int i10 = ((~i2) & i9) | i7;
                int i11 = i10 & i6;
                int iE2 = CompactHashing.e(i11, objA);
                CompactHashing.f(i11, iE, objA);
                iArrV[i8] = CompactHashing.b(i10, iE2, i6);
                iE = i9 & i2;
            }
        }
        this.X = objA;
        this.e0 = CompactHashing.b(this.e0, 32 - Integer.numberOfLeadingZeros(i6), 31);
        return i6;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public Object[] toArray(Object[] objArr) {
        if (t()) {
            if (objArr.length > 0) {
                objArr[0] = null;
            }
            return objArr;
        }
        Set setH = h();
        if (setH != null) {
            return setH.toArray(objArr);
        }
        Object[] objArrU = u();
        int i2 = this.f0;
        Preconditions.l(0, i2, objArrU.length);
        if (objArr.length < i2) {
            if (objArr.length != 0) {
                objArr = Arrays.copyOf(objArr, 0);
            }
            objArr = Arrays.copyOf(objArr, i2);
        } else if (objArr.length > i2) {
            objArr[i2] = null;
        }
        System.arraycopy(objArrU, 0, objArr, 0, i2);
        return objArr;
    }
}
