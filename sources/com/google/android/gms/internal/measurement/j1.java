package com.google.android.gms.internal.measurement;

import com.google.android.gms.internal.ads.ur1;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class j1 extends m0 implements RandomAccess, n1, k2 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int[] f23609d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final j1 f23610e;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int[] f23611b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f23612c;

    static {
        int[] iArr = new int[0];
        f23609d = iArr;
        f23610e = new j1(iArr, 0, false);
    }

    public j1(int[] iArr, int i10, boolean z10) {
        super(z10);
        this.f23611b = iArr;
        this.f23612c = i10;
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i10, Object obj) {
        int i11;
        int iIntValue = ((Integer) obj).intValue();
        b();
        if (i10 < 0 || i10 > (i11 = this.f23612c)) {
            throw new IndexOutOfBoundsException(ur1.a(this.f23612c, i10, (byte) 13, "Index:", ", Size:"));
        }
        int i12 = i10 + 1;
        int[] iArr = this.f23611b;
        int length = iArr.length;
        if (i11 < length) {
            System.arraycopy(iArr, i10, iArr, i12, i11 - i10);
        } else {
            int[] iArr2 = new int[com.applovin.impl.ca.v(length, 3, 2, 1, 10)];
            System.arraycopy(this.f23611b, 0, iArr2, 0, i10);
            System.arraycopy(this.f23611b, i10, iArr2, i12, this.f23612c - i10);
            this.f23611b = iArr2;
        }
        this.f23611b[i10] = iIntValue;
        this.f23612c++;
        ((AbstractList) this).modCount++;
    }

    @Override // com.google.android.gms.internal.measurement.m0, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        b();
        collection.getClass();
        if (!(collection instanceof j1)) {
            return super.addAll(collection);
        }
        j1 j1Var = (j1) collection;
        int i10 = j1Var.f23612c;
        if (i10 == 0) {
            return false;
        }
        int i11 = this.f23612c;
        if (Integer.MAX_VALUE - i11 < i10) {
            throw new OutOfMemoryError();
        }
        int i12 = i11 + i10;
        int[] iArr = this.f23611b;
        if (i12 > iArr.length) {
            this.f23611b = Arrays.copyOf(iArr, i12);
        }
        System.arraycopy(j1Var.f23611b, 0, this.f23611b, this.f23612c, j1Var.f23612c);
        this.f23612c = i12;
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
        if (!(obj instanceof j1)) {
            return super.equals(obj);
        }
        j1 j1Var = (j1) obj;
        if (this.f23612c != j1Var.f23612c) {
            return false;
        }
        int[] iArr = j1Var.f23611b;
        for (int i10 = 0; i10 < this.f23612c; i10++) {
            if (this.f23611b[i10] != iArr[i10]) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ Object get(int i10) {
        p(i10);
        return Integer.valueOf(this.f23611b[i10]);
    }

    @Override // com.google.android.gms.internal.measurement.s1
    /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
    public final j1 g(int i10) {
        if (i10 >= this.f23612c) {
            return new j1(i10 == 0 ? f23609d : Arrays.copyOf(this.f23611b, i10), this.f23612c, true);
        }
        throw new IllegalArgumentException();
    }

    @Override // java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int i10 = 1;
        for (int i11 = 0; i11 < this.f23612c; i11++) {
            i10 = (i10 * 31) + this.f23611b[i11];
        }
        return i10;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        if (!(obj instanceof Integer)) {
            return -1;
        }
        int iIntValue = ((Integer) obj).intValue();
        int i10 = this.f23612c;
        for (int i11 = 0; i11 < i10; i11++) {
            if (this.f23611b[i11] == iIntValue) {
                return i11;
            }
        }
        return -1;
    }

    public final int m(int i10) {
        p(i10);
        return this.f23611b[i10];
    }

    public final void n(int i10) {
        b();
        int i11 = this.f23612c;
        int length = this.f23611b.length;
        if (i11 == length) {
            int[] iArr = new int[com.applovin.impl.ca.v(length, 3, 2, 1, 10)];
            System.arraycopy(this.f23611b, 0, iArr, 0, this.f23612c);
            this.f23611b = iArr;
        }
        int[] iArr2 = this.f23611b;
        int i12 = this.f23612c;
        this.f23612c = i12 + 1;
        iArr2[i12] = i10;
    }

    public final void p(int i10) {
        if (i10 < 0 || i10 >= this.f23612c) {
            throw new IndexOutOfBoundsException(ur1.a(this.f23612c, i10, (byte) 13, "Index:", ", Size:"));
        }
    }

    @Override // com.google.android.gms.internal.measurement.m0, java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object remove(int i10) {
        b();
        p(i10);
        int[] iArr = this.f23611b;
        int i11 = iArr[i10];
        int i12 = this.f23612c;
        if (i10 < i12 - 1) {
            System.arraycopy(iArr, i10 + 1, iArr, i10, (i12 - i10) - 1);
        }
        this.f23612c--;
        ((AbstractList) this).modCount++;
        return Integer.valueOf(i11);
    }

    @Override // java.util.AbstractList
    public final void removeRange(int i10, int i11) {
        b();
        if (i11 < i10) {
            throw new IndexOutOfBoundsException("toIndex < fromIndex");
        }
        int[] iArr = this.f23611b;
        System.arraycopy(iArr, i11, iArr, i10, this.f23612c - i11);
        this.f23612c -= i11 - i10;
        ((AbstractList) this).modCount++;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object set(int i10, Object obj) {
        int iIntValue = ((Integer) obj).intValue();
        b();
        p(i10);
        int[] iArr = this.f23611b;
        int i11 = iArr[i10];
        iArr[i10] = iIntValue;
        return Integer.valueOf(i11);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f23612c;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ /* synthetic */ boolean add(Object obj) {
        n(((Integer) obj).intValue());
        return true;
    }
}
