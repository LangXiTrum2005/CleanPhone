package com.google.protobuf;

import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public final class j extends b implements Internal.BooleanList, RandomAccess, o3 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final j f24863c = new j(new boolean[0], 0, false);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean[] f24864a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f24865b;

    public j(boolean[] zArr, int i10, boolean z10) {
        super(z10);
        this.f24864a = zArr;
        this.f24865b = i10;
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i10, Object obj) {
        int i11;
        boolean zBooleanValue = ((Boolean) obj).booleanValue();
        ensureIsMutable();
        if (i10 < 0 || i10 > (i11 = this.f24865b)) {
            StringBuilder sbU = defpackage.e.u(i10, "Index:", ", Size:");
            sbU.append(this.f24865b);
            throw new IndexOutOfBoundsException(sbU.toString());
        }
        boolean[] zArr = this.f24864a;
        if (i11 < zArr.length) {
            System.arraycopy(zArr, i10, zArr, i10 + 1, i11 - i10);
        } else {
            boolean[] zArr2 = new boolean[defpackage.e.D(i11, 3, 2, 1)];
            System.arraycopy(zArr, 0, zArr2, 0, i10);
            System.arraycopy(this.f24864a, i10, zArr2, i10 + 1, this.f24865b - i10);
            this.f24864a = zArr2;
        }
        this.f24864a[i10] = zBooleanValue;
        this.f24865b++;
        ((AbstractList) this).modCount++;
    }

    @Override // com.google.protobuf.b, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        ensureIsMutable();
        Internal.checkNotNull(collection);
        if (!(collection instanceof j)) {
            return super.addAll(collection);
        }
        j jVar = (j) collection;
        int i10 = jVar.f24865b;
        if (i10 == 0) {
            return false;
        }
        int i11 = this.f24865b;
        if (Integer.MAX_VALUE - i11 < i10) {
            throw new OutOfMemoryError();
        }
        int i12 = i11 + i10;
        boolean[] zArr = this.f24864a;
        if (i12 > zArr.length) {
            this.f24864a = Arrays.copyOf(zArr, i12);
        }
        System.arraycopy(jVar.f24864a, 0, this.f24864a, this.f24865b, jVar.f24865b);
        this.f24865b = i12;
        ((AbstractList) this).modCount++;
        return true;
    }

    @Override // com.google.protobuf.Internal.BooleanList
    public final void addBoolean(boolean z10) {
        ensureIsMutable();
        int i10 = this.f24865b;
        boolean[] zArr = this.f24864a;
        if (i10 == zArr.length) {
            boolean[] zArr2 = new boolean[defpackage.e.D(i10, 3, 2, 1)];
            System.arraycopy(zArr, 0, zArr2, 0, i10);
            this.f24864a = zArr2;
        }
        boolean[] zArr3 = this.f24864a;
        int i11 = this.f24865b;
        this.f24865b = i11 + 1;
        zArr3[i11] = z10;
    }

    public final void b(int i10) {
        if (i10 < 0 || i10 >= this.f24865b) {
            StringBuilder sbU = defpackage.e.u(i10, "Index:", ", Size:");
            sbU.append(this.f24865b);
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
        if (!(obj instanceof j)) {
            return super.equals(obj);
        }
        j jVar = (j) obj;
        if (this.f24865b != jVar.f24865b) {
            return false;
        }
        boolean[] zArr = jVar.f24864a;
        for (int i10 = 0; i10 < this.f24865b; i10++) {
            if (this.f24864a[i10] != zArr[i10]) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i10) {
        return Boolean.valueOf(getBoolean(i10));
    }

    @Override // com.google.protobuf.Internal.BooleanList
    public final boolean getBoolean(int i10) {
        b(i10);
        return this.f24864a[i10];
    }

    @Override // com.google.protobuf.b, java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int iHashBoolean = 1;
        for (int i10 = 0; i10 < this.f24865b; i10++) {
            iHashBoolean = (iHashBoolean * 31) + Internal.hashBoolean(this.f24864a[i10]);
        }
        return iHashBoolean;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        if (!(obj instanceof Boolean)) {
            return -1;
        }
        boolean zBooleanValue = ((Boolean) obj).booleanValue();
        int i10 = this.f24865b;
        for (int i11 = 0; i11 < i10; i11++) {
            if (this.f24864a[i11] == zBooleanValue) {
                return i11;
            }
        }
        return -1;
    }

    @Override // com.google.protobuf.b, java.util.AbstractList, java.util.List
    public final Object remove(int i10) {
        ensureIsMutable();
        b(i10);
        boolean[] zArr = this.f24864a;
        boolean z10 = zArr[i10];
        int i11 = this.f24865b;
        if (i10 < i11 - 1) {
            System.arraycopy(zArr, i10 + 1, zArr, i10, (i11 - i10) - 1);
        }
        this.f24865b--;
        ((AbstractList) this).modCount++;
        return Boolean.valueOf(z10);
    }

    @Override // java.util.AbstractList
    public final void removeRange(int i10, int i11) {
        ensureIsMutable();
        if (i11 < i10) {
            throw new IndexOutOfBoundsException("toIndex < fromIndex");
        }
        boolean[] zArr = this.f24864a;
        System.arraycopy(zArr, i11, zArr, i10, this.f24865b - i11);
        this.f24865b -= i11 - i10;
        ((AbstractList) this).modCount++;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i10, Object obj) {
        return Boolean.valueOf(setBoolean(i10, ((Boolean) obj).booleanValue()));
    }

    @Override // com.google.protobuf.Internal.BooleanList
    public final boolean setBoolean(int i10, boolean z10) {
        ensureIsMutable();
        b(i10);
        boolean[] zArr = this.f24864a;
        boolean z11 = zArr[i10];
        zArr[i10] = z10;
        return z11;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f24865b;
    }

    @Override // com.google.protobuf.Internal.ProtobufList
    /* JADX INFO: renamed from: mutableCopyWithCapacity */
    public final Internal.ProtobufList<Boolean> mutableCopyWithCapacity2(int i10) {
        if (i10 >= this.f24865b) {
            return new j(Arrays.copyOf(this.f24864a, i10), this.f24865b, true);
        }
        throw new IllegalArgumentException();
    }

    @Override // com.google.protobuf.b, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(Object obj) {
        addBoolean(((Boolean) obj).booleanValue());
        return true;
    }
}
