package com.google.android.gms.internal.ads;

import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class jt1 extends sr1 implements RandomAccess, zs1, ut1 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final long[] f16180d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final jt1 f16181e;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public long[] f16182b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f16183c;

    static {
        long[] jArr = new long[0];
        f16180d = jArr;
        f16181e = new jt1(jArr, 0, false);
    }

    public jt1(long[] jArr, int i10, boolean z10) {
        super(z10);
        this.f16182b = jArr;
        this.f16183c = i10;
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i10, Object obj) {
        int i11;
        long jLongValue = ((Long) obj).longValue();
        b();
        if (i10 < 0 || i10 > (i11 = this.f16183c)) {
            throw new IndexOutOfBoundsException(q(i10));
        }
        int i12 = i10 + 1;
        long[] jArr = this.f16182b;
        int length = jArr.length;
        if (i11 < length) {
            System.arraycopy(jArr, i10, jArr, i12, i11 - i10);
        } else {
            long[] jArr2 = new long[com.applovin.impl.ca.v(length, 3, 2, 1, 10)];
            System.arraycopy(this.f16182b, 0, jArr2, 0, i10);
            System.arraycopy(this.f16182b, i10, jArr2, i12, this.f16183c - i10);
            this.f16182b = jArr2;
        }
        this.f16182b[i10] = jLongValue;
        this.f16183c++;
        ((AbstractList) this).modCount++;
    }

    @Override // com.google.android.gms.internal.ads.sr1, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        b();
        collection.getClass();
        if (!(collection instanceof jt1)) {
            return super.addAll(collection);
        }
        jt1 jt1Var = (jt1) collection;
        int i10 = jt1Var.f16183c;
        if (i10 == 0) {
            return false;
        }
        int i11 = this.f16183c;
        if (Integer.MAX_VALUE - i11 < i10) {
            throw new OutOfMemoryError();
        }
        int i12 = i11 + i10;
        long[] jArr = this.f16182b;
        if (i12 > jArr.length) {
            this.f16182b = Arrays.copyOf(jArr, i12);
        }
        System.arraycopy(jt1Var.f16182b, 0, this.f16182b, this.f16183c, jt1Var.f16183c);
        this.f16183c = i12;
        ((AbstractList) this).modCount++;
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        return indexOf(obj) != -1;
    }

    @Override // com.google.android.gms.internal.ads.sr1, java.util.AbstractList, java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jt1)) {
            return super.equals(obj);
        }
        jt1 jt1Var = (jt1) obj;
        if (this.f16183c != jt1Var.f16183c) {
            return false;
        }
        long[] jArr = jt1Var.f16182b;
        for (int i10 = 0; i10 < this.f16183c; i10++) {
            if (this.f16182b[i10] != jArr[i10]) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ Object get(int i10) {
        p(i10);
        return Long.valueOf(this.f16182b[i10]);
    }

    public final long h(int i10) {
        p(i10);
        return this.f16182b[i10];
    }

    @Override // java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int i10 = 1;
        for (int i11 = 0; i11 < this.f16183c; i11++) {
            long j10 = this.f16182b[i11];
            byte[] bArr = bt1.f12888a;
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
        int i10 = this.f16183c;
        for (int i11 = 0; i11 < i10; i11++) {
            if (this.f16182b[i11] == jLongValue) {
                return i11;
            }
        }
        return -1;
    }

    public final void m(long j10) {
        b();
        int i10 = this.f16183c;
        int length = this.f16182b.length;
        if (i10 == length) {
            long[] jArr = new long[com.applovin.impl.ca.v(length, 3, 2, 1, 10)];
            System.arraycopy(this.f16182b, 0, jArr, 0, this.f16183c);
            this.f16182b = jArr;
        }
        long[] jArr2 = this.f16182b;
        int i11 = this.f16183c;
        this.f16183c = i11 + 1;
        jArr2[i11] = j10;
    }

    @Override // com.google.android.gms.internal.ads.at1
    /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
    public final jt1 e(int i10) {
        if (i10 >= this.f16183c) {
            return new jt1(i10 == 0 ? f16180d : Arrays.copyOf(this.f16182b, i10), this.f16183c, true);
        }
        throw new IllegalArgumentException();
    }

    public final void p(int i10) {
        if (i10 < 0 || i10 >= this.f16183c) {
            throw new IndexOutOfBoundsException(q(i10));
        }
    }

    public final String q(int i10) {
        int i11 = this.f16183c;
        return l1.d.j(new StringBuilder(String.valueOf(i10).length() + 13 + String.valueOf(i11).length()), i10, "Index:", i11, ", Size:");
    }

    @Override // com.google.android.gms.internal.ads.sr1, java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object remove(int i10) {
        b();
        p(i10);
        long[] jArr = this.f16182b;
        long j10 = jArr[i10];
        int i11 = this.f16183c;
        if (i10 < i11 - 1) {
            System.arraycopy(jArr, i10 + 1, jArr, i10, (i11 - i10) - 1);
        }
        this.f16183c--;
        ((AbstractList) this).modCount++;
        return Long.valueOf(j10);
    }

    @Override // java.util.AbstractList
    public final void removeRange(int i10, int i11) {
        b();
        if (i11 < i10) {
            throw new IndexOutOfBoundsException("toIndex < fromIndex");
        }
        long[] jArr = this.f16182b;
        System.arraycopy(jArr, i11, jArr, i10, this.f16183c - i11);
        this.f16183c -= i11 - i10;
        ((AbstractList) this).modCount++;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i10, Object obj) {
        long jLongValue = ((Long) obj).longValue();
        b();
        p(i10);
        long[] jArr = this.f16182b;
        long j10 = jArr[i10];
        jArr[i10] = jLongValue;
        return Long.valueOf(j10);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f16183c;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ /* synthetic */ boolean add(Object obj) {
        m(((Long) obj).longValue());
        return true;
    }
}
