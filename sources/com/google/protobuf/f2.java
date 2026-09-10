package com.google.protobuf;

import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public final class f2 extends b implements Internal.IntList, RandomAccess, o3 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final f2 f24831c = new f2(new int[0], 0, false);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int[] f24832a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f24833b;

    public f2() {
        this(new int[10], 0, true);
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i10, Object obj) {
        int i11;
        int iIntValue = ((Integer) obj).intValue();
        ensureIsMutable();
        if (i10 < 0 || i10 > (i11 = this.f24833b)) {
            StringBuilder sbU = defpackage.e.u(i10, "Index:", ", Size:");
            sbU.append(this.f24833b);
            throw new IndexOutOfBoundsException(sbU.toString());
        }
        int[] iArr = this.f24832a;
        if (i11 < iArr.length) {
            System.arraycopy(iArr, i10, iArr, i10 + 1, i11 - i10);
        } else {
            int[] iArr2 = new int[defpackage.e.D(i11, 3, 2, 1)];
            System.arraycopy(iArr, 0, iArr2, 0, i10);
            System.arraycopy(this.f24832a, i10, iArr2, i10 + 1, this.f24833b - i10);
            this.f24832a = iArr2;
        }
        this.f24832a[i10] = iIntValue;
        this.f24833b++;
        ((AbstractList) this).modCount++;
    }

    @Override // com.google.protobuf.b, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        ensureIsMutable();
        Internal.checkNotNull(collection);
        if (!(collection instanceof f2)) {
            return super.addAll(collection);
        }
        f2 f2Var = (f2) collection;
        int i10 = f2Var.f24833b;
        if (i10 == 0) {
            return false;
        }
        int i11 = this.f24833b;
        if (Integer.MAX_VALUE - i11 < i10) {
            throw new OutOfMemoryError();
        }
        int i12 = i11 + i10;
        int[] iArr = this.f24832a;
        if (i12 > iArr.length) {
            this.f24832a = Arrays.copyOf(iArr, i12);
        }
        System.arraycopy(f2Var.f24832a, 0, this.f24832a, this.f24833b, f2Var.f24833b);
        this.f24833b = i12;
        ((AbstractList) this).modCount++;
        return true;
    }

    @Override // com.google.protobuf.Internal.IntList
    public final void addInt(int i10) {
        ensureIsMutable();
        int i11 = this.f24833b;
        int[] iArr = this.f24832a;
        if (i11 == iArr.length) {
            int[] iArr2 = new int[defpackage.e.D(i11, 3, 2, 1)];
            System.arraycopy(iArr, 0, iArr2, 0, i11);
            this.f24832a = iArr2;
        }
        int[] iArr3 = this.f24832a;
        int i12 = this.f24833b;
        this.f24833b = i12 + 1;
        iArr3[i12] = i10;
    }

    public final void b(int i10) {
        if (i10 < 0 || i10 >= this.f24833b) {
            StringBuilder sbU = defpackage.e.u(i10, "Index:", ", Size:");
            sbU.append(this.f24833b);
            throw new IndexOutOfBoundsException(sbU.toString());
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        return indexOf(obj) != -1;
    }

    @Override // com.google.protobuf.b, java.util.AbstractList, java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f2)) {
            return super.equals(obj);
        }
        f2 f2Var = (f2) obj;
        if (this.f24833b != f2Var.f24833b) {
            return false;
        }
        int[] iArr = f2Var.f24832a;
        for (int i10 = 0; i10 < this.f24833b; i10++) {
            if (this.f24832a[i10] != iArr[i10]) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i10) {
        return Integer.valueOf(getInt(i10));
    }

    @Override // com.google.protobuf.Internal.IntList
    public final int getInt(int i10) {
        b(i10);
        return this.f24832a[i10];
    }

    @Override // com.google.protobuf.b, java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int i10 = 1;
        for (int i11 = 0; i11 < this.f24833b; i11++) {
            i10 = (i10 * 31) + this.f24832a[i11];
        }
        return i10;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        if (!(obj instanceof Integer)) {
            return -1;
        }
        int iIntValue = ((Integer) obj).intValue();
        int i10 = this.f24833b;
        for (int i11 = 0; i11 < i10; i11++) {
            if (this.f24832a[i11] == iIntValue) {
                return i11;
            }
        }
        return -1;
    }

    @Override // com.google.protobuf.b, java.util.AbstractList, java.util.List
    public final Object remove(int i10) {
        ensureIsMutable();
        b(i10);
        int[] iArr = this.f24832a;
        int i11 = iArr[i10];
        int i12 = this.f24833b;
        if (i10 < i12 - 1) {
            System.arraycopy(iArr, i10 + 1, iArr, i10, (i12 - i10) - 1);
        }
        this.f24833b--;
        ((AbstractList) this).modCount++;
        return Integer.valueOf(i11);
    }

    @Override // java.util.AbstractList
    public final void removeRange(int i10, int i11) {
        ensureIsMutable();
        if (i11 < i10) {
            throw new IndexOutOfBoundsException("toIndex < fromIndex");
        }
        int[] iArr = this.f24832a;
        System.arraycopy(iArr, i11, iArr, i10, this.f24833b - i11);
        this.f24833b -= i11 - i10;
        ((AbstractList) this).modCount++;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i10, Object obj) {
        return Integer.valueOf(setInt(i10, ((Integer) obj).intValue()));
    }

    @Override // com.google.protobuf.Internal.IntList
    public final int setInt(int i10, int i11) {
        ensureIsMutable();
        b(i10);
        int[] iArr = this.f24832a;
        int i12 = iArr[i10];
        iArr[i10] = i11;
        return i12;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f24833b;
    }

    public f2(int[] iArr, int i10, boolean z10) {
        super(z10);
        this.f24832a = iArr;
        this.f24833b = i10;
    }

    @Override // com.google.protobuf.Internal.ProtobufList
    /* JADX INFO: renamed from: mutableCopyWithCapacity */
    public final Internal.ProtobufList<Integer> mutableCopyWithCapacity2(int i10) {
        if (i10 >= this.f24833b) {
            return new f2(Arrays.copyOf(this.f24832a, i10), this.f24833b, true);
        }
        throw new IllegalArgumentException();
    }

    @Override // com.google.protobuf.b, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(Object obj) {
        addInt(((Integer) obj).intValue());
        return true;
    }
}
