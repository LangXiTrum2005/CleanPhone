package com.google.android.gms.internal.measurement;

import com.google.android.gms.internal.ads.ur1;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class y1 extends m0 implements RandomAccess, r1, k2 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final long[] f24162d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final y1 f24163e;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public long[] f24164b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f24165c;

    static {
        long[] jArr = new long[0];
        f24162d = jArr;
        f24163e = new y1(jArr, 0, false);
    }

    public y1(long[] jArr, int i10, boolean z10) {
        super(z10);
        this.f24164b = jArr;
        this.f24165c = i10;
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i10, Object obj) {
        int i11;
        long jLongValue = ((Long) obj).longValue();
        b();
        if (i10 < 0 || i10 > (i11 = this.f24165c)) {
            throw new IndexOutOfBoundsException(ur1.a(this.f24165c, i10, (byte) 13, "Index:", ", Size:"));
        }
        int i12 = i10 + 1;
        long[] jArr = this.f24164b;
        int length = jArr.length;
        if (i11 < length) {
            System.arraycopy(jArr, i10, jArr, i12, i11 - i10);
        } else {
            long[] jArr2 = new long[com.applovin.impl.ca.v(length, 3, 2, 1, 10)];
            System.arraycopy(this.f24164b, 0, jArr2, 0, i10);
            System.arraycopy(this.f24164b, i10, jArr2, i12, this.f24165c - i10);
            this.f24164b = jArr2;
        }
        this.f24164b[i10] = jLongValue;
        this.f24165c++;
        ((AbstractList) this).modCount++;
    }

    @Override // com.google.android.gms.internal.measurement.m0, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        b();
        collection.getClass();
        if (!(collection instanceof y1)) {
            return super.addAll(collection);
        }
        y1 y1Var = (y1) collection;
        int i10 = y1Var.f24165c;
        if (i10 == 0) {
            return false;
        }
        int i11 = this.f24165c;
        if (Integer.MAX_VALUE - i11 < i10) {
            throw new OutOfMemoryError();
        }
        int i12 = i11 + i10;
        long[] jArr = this.f24164b;
        if (i12 > jArr.length) {
            this.f24164b = Arrays.copyOf(jArr, i12);
        }
        System.arraycopy(y1Var.f24164b, 0, this.f24164b, this.f24165c, y1Var.f24165c);
        this.f24165c = i12;
        ((AbstractList) this).modCount++;
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        return indexOf(obj) != -1;
    }

    @Override // com.google.android.gms.internal.measurement.m0, java.util.AbstractList, java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof y1)) {
            return super.equals(obj);
        }
        y1 y1Var = (y1) obj;
        if (this.f24165c != y1Var.f24165c) {
            return false;
        }
        long[] jArr = y1Var.f24164b;
        for (int i10 = 0; i10 < this.f24165c; i10++) {
            if (this.f24164b[i10] != jArr[i10]) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ Object get(int i10) {
        p(i10);
        return Long.valueOf(this.f24164b[i10]);
    }

    public final long h(int i10) {
        p(i10);
        return this.f24164b[i10];
    }

    @Override // java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int i10 = 1;
        for (int i11 = 0; i11 < this.f24165c; i11++) {
            long j10 = this.f24164b[i11];
            byte[] bArr = q1.f23877a;
            i10 = (i10 * 31) + ((int) (j10 ^ (j10 >>> 32)));
        }
        return i10;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        if (!(obj instanceof Long)) {
            return -1;
        }
        long jLongValue = ((Long) obj).longValue();
        int i10 = this.f24165c;
        for (int i11 = 0; i11 < i10; i11++) {
            if (this.f24164b[i11] == jLongValue) {
                return i11;
            }
        }
        return -1;
    }

    @Override // com.google.android.gms.internal.measurement.s1
    /* JADX INFO: renamed from: m, reason: merged with bridge method [inline-methods] */
    public final y1 g(int i10) {
        if (i10 >= this.f24165c) {
            return new y1(i10 == 0 ? f24162d : Arrays.copyOf(this.f24164b, i10), this.f24165c, true);
        }
        throw new IllegalArgumentException();
    }

    public final void n(long j10) {
        b();
        int i10 = this.f24165c;
        int length = this.f24164b.length;
        if (i10 == length) {
            long[] jArr = new long[com.applovin.impl.ca.v(length, 3, 2, 1, 10)];
            System.arraycopy(this.f24164b, 0, jArr, 0, this.f24165c);
            this.f24164b = jArr;
        }
        long[] jArr2 = this.f24164b;
        int i11 = this.f24165c;
        this.f24165c = i11 + 1;
        jArr2[i11] = j10;
    }

    public final void p(int i10) {
        if (i10 < 0 || i10 >= this.f24165c) {
            throw new IndexOutOfBoundsException(ur1.a(this.f24165c, i10, (byte) 13, "Index:", ", Size:"));
        }
    }

    @Override // com.google.android.gms.internal.measurement.m0, java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object remove(int i10) {
        b();
        p(i10);
        long[] jArr = this.f24164b;
        long j10 = jArr[i10];
        int i11 = this.f24165c;
        if (i10 < i11 - 1) {
            System.arraycopy(jArr, i10 + 1, jArr, i10, (i11 - i10) - 1);
        }
        this.f24165c--;
        ((AbstractList) this).modCount++;
        return Long.valueOf(j10);
    }

    @Override // java.util.AbstractList
    public final void removeRange(int i10, int i11) {
        b();
        if (i11 < i10) {
            throw new IndexOutOfBoundsException("toIndex < fromIndex");
        }
        long[] jArr = this.f24164b;
        System.arraycopy(jArr, i11, jArr, i10, this.f24165c - i11);
        this.f24165c -= i11 - i10;
        ((AbstractList) this).modCount++;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object set(int i10, Object obj) {
        long jLongValue = ((Long) obj).longValue();
        b();
        p(i10);
        long[] jArr = this.f24164b;
        long j10 = jArr[i10];
        jArr[i10] = jLongValue;
        return Long.valueOf(j10);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f24165c;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ /* synthetic */ boolean add(Object obj) {
        n(((Long) obj).longValue());
        return true;
    }
}
