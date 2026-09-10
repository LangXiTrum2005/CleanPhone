package com.google.protobuf;

import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public final class r2 extends b implements Internal.LongList, RandomAccess, o3 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final r2 f24929c = new r2(new long[0], 0, false);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public long[] f24930a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f24931b;

    public r2() {
        this(new long[10], 0, true);
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i10, Object obj) {
        int i11;
        long jLongValue = ((Long) obj).longValue();
        ensureIsMutable();
        if (i10 < 0 || i10 > (i11 = this.f24931b)) {
            StringBuilder sbU = defpackage.e.u(i10, "Index:", ", Size:");
            sbU.append(this.f24931b);
            throw new IndexOutOfBoundsException(sbU.toString());
        }
        long[] jArr = this.f24930a;
        if (i11 < jArr.length) {
            System.arraycopy(jArr, i10, jArr, i10 + 1, i11 - i10);
        } else {
            long[] jArr2 = new long[defpackage.e.D(i11, 3, 2, 1)];
            System.arraycopy(jArr, 0, jArr2, 0, i10);
            System.arraycopy(this.f24930a, i10, jArr2, i10 + 1, this.f24931b - i10);
            this.f24930a = jArr2;
        }
        this.f24930a[i10] = jLongValue;
        this.f24931b++;
        ((AbstractList) this).modCount++;
    }

    @Override // com.google.protobuf.b, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        ensureIsMutable();
        Internal.checkNotNull(collection);
        if (!(collection instanceof r2)) {
            return super.addAll(collection);
        }
        r2 r2Var = (r2) collection;
        int i10 = r2Var.f24931b;
        if (i10 == 0) {
            return false;
        }
        int i11 = this.f24931b;
        if (Integer.MAX_VALUE - i11 < i10) {
            throw new OutOfMemoryError();
        }
        int i12 = i11 + i10;
        long[] jArr = this.f24930a;
        if (i12 > jArr.length) {
            this.f24930a = Arrays.copyOf(jArr, i12);
        }
        System.arraycopy(r2Var.f24930a, 0, this.f24930a, this.f24931b, r2Var.f24931b);
        this.f24931b = i12;
        ((AbstractList) this).modCount++;
        return true;
    }

    @Override // com.google.protobuf.Internal.LongList
    public final void addLong(long j10) {
        ensureIsMutable();
        int i10 = this.f24931b;
        long[] jArr = this.f24930a;
        if (i10 == jArr.length) {
            long[] jArr2 = new long[defpackage.e.D(i10, 3, 2, 1)];
            System.arraycopy(jArr, 0, jArr2, 0, i10);
            this.f24930a = jArr2;
        }
        long[] jArr3 = this.f24930a;
        int i11 = this.f24931b;
        this.f24931b = i11 + 1;
        jArr3[i11] = j10;
    }

    public final void b(int i10) {
        if (i10 < 0 || i10 >= this.f24931b) {
            StringBuilder sbU = defpackage.e.u(i10, "Index:", ", Size:");
            sbU.append(this.f24931b);
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
        if (!(obj instanceof r2)) {
            return super.equals(obj);
        }
        r2 r2Var = (r2) obj;
        if (this.f24931b != r2Var.f24931b) {
            return false;
        }
        long[] jArr = r2Var.f24930a;
        for (int i10 = 0; i10 < this.f24931b; i10++) {
            if (this.f24930a[i10] != jArr[i10]) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i10) {
        return Long.valueOf(getLong(i10));
    }

    @Override // com.google.protobuf.Internal.LongList
    public final long getLong(int i10) {
        b(i10);
        return this.f24930a[i10];
    }

    @Override // com.google.protobuf.b, java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int iHashLong = 1;
        for (int i10 = 0; i10 < this.f24931b; i10++) {
            iHashLong = (iHashLong * 31) + Internal.hashLong(this.f24930a[i10]);
        }
        return iHashLong;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        if (!(obj instanceof Long)) {
            return -1;
        }
        long jLongValue = ((Long) obj).longValue();
        int i10 = this.f24931b;
        for (int i11 = 0; i11 < i10; i11++) {
            if (this.f24930a[i11] == jLongValue) {
                return i11;
            }
        }
        return -1;
    }

    @Override // com.google.protobuf.b, java.util.AbstractList, java.util.List
    public final Object remove(int i10) {
        ensureIsMutable();
        b(i10);
        long[] jArr = this.f24930a;
        long j10 = jArr[i10];
        int i11 = this.f24931b;
        if (i10 < i11 - 1) {
            System.arraycopy(jArr, i10 + 1, jArr, i10, (i11 - i10) - 1);
        }
        this.f24931b--;
        ((AbstractList) this).modCount++;
        return Long.valueOf(j10);
    }

    @Override // java.util.AbstractList
    public final void removeRange(int i10, int i11) {
        ensureIsMutable();
        if (i11 < i10) {
            throw new IndexOutOfBoundsException("toIndex < fromIndex");
        }
        long[] jArr = this.f24930a;
        System.arraycopy(jArr, i11, jArr, i10, this.f24931b - i11);
        this.f24931b -= i11 - i10;
        ((AbstractList) this).modCount++;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i10, Object obj) {
        return Long.valueOf(setLong(i10, ((Long) obj).longValue()));
    }

    @Override // com.google.protobuf.Internal.LongList
    public final long setLong(int i10, long j10) {
        ensureIsMutable();
        b(i10);
        long[] jArr = this.f24930a;
        long j11 = jArr[i10];
        jArr[i10] = j10;
        return j11;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f24931b;
    }

    public r2(long[] jArr, int i10, boolean z10) {
        super(z10);
        this.f24930a = jArr;
        this.f24931b = i10;
    }

    @Override // com.google.protobuf.Internal.ProtobufList
    /* JADX INFO: renamed from: mutableCopyWithCapacity */
    public final Internal.ProtobufList<Long> mutableCopyWithCapacity2(int i10) {
        if (i10 >= this.f24931b) {
            return new r2(Arrays.copyOf(this.f24930a, i10), this.f24931b, true);
        }
        throw new IllegalArgumentException();
    }

    @Override // com.google.protobuf.b, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(Object obj) {
        addLong(((Long) obj).longValue());
        return true;
    }
}
