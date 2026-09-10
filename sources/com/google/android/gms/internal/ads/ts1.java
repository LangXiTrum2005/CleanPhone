package com.google.android.gms.internal.ads;

import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class ts1 extends sr1 implements RandomAccess, ws1, ut1 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int[] f20488d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final ts1 f20489e;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int[] f20490b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f20491c;

    static {
        int[] iArr = new int[0];
        f20488d = iArr;
        f20489e = new ts1(iArr, 0, false);
    }

    public ts1(int[] iArr, int i10, boolean z10) {
        super(z10);
        this.f20490b = iArr;
        this.f20491c = i10;
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i10, Object obj) {
        int i11;
        int iIntValue = ((Integer) obj).intValue();
        b();
        if (i10 < 0 || i10 > (i11 = this.f20491c)) {
            throw new IndexOutOfBoundsException(q(i10));
        }
        int i12 = i10 + 1;
        int[] iArr = this.f20490b;
        int length = iArr.length;
        if (i11 < length) {
            System.arraycopy(iArr, i10, iArr, i12, i11 - i10);
        } else {
            int[] iArr2 = new int[com.applovin.impl.ca.v(length, 3, 2, 1, 10)];
            System.arraycopy(this.f20490b, 0, iArr2, 0, i10);
            System.arraycopy(this.f20490b, i10, iArr2, i12, this.f20491c - i10);
            this.f20490b = iArr2;
        }
        this.f20490b[i10] = iIntValue;
        this.f20491c++;
        ((AbstractList) this).modCount++;
    }

    @Override // com.google.android.gms.internal.ads.sr1, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        b();
        collection.getClass();
        if (!(collection instanceof ts1)) {
            return super.addAll(collection);
        }
        ts1 ts1Var = (ts1) collection;
        int i10 = ts1Var.f20491c;
        if (i10 == 0) {
            return false;
        }
        int i11 = this.f20491c;
        if (Integer.MAX_VALUE - i11 < i10) {
            throw new OutOfMemoryError();
        }
        int i12 = i11 + i10;
        int[] iArr = this.f20490b;
        if (i12 > iArr.length) {
            this.f20490b = Arrays.copyOf(iArr, i12);
        }
        System.arraycopy(ts1Var.f20490b, 0, this.f20490b, this.f20491c, ts1Var.f20491c);
        this.f20491c = i12;
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
        if (!(obj instanceof ts1)) {
            return super.equals(obj);
        }
        ts1 ts1Var = (ts1) obj;
        if (this.f20491c != ts1Var.f20491c) {
            return false;
        }
        int[] iArr = ts1Var.f20490b;
        for (int i10 = 0; i10 < this.f20491c; i10++) {
            if (this.f20490b[i10] != iArr[i10]) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ Object get(int i10) {
        p(i10);
        return Integer.valueOf(this.f20490b[i10]);
    }

    @Override // com.google.android.gms.internal.ads.at1
    /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
    public final ts1 e(int i10) {
        if (i10 >= this.f20491c) {
            return new ts1(i10 == 0 ? f20488d : Arrays.copyOf(this.f20490b, i10), this.f20491c, true);
        }
        throw new IllegalArgumentException();
    }

    @Override // java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int i10 = 1;
        for (int i11 = 0; i11 < this.f20491c; i11++) {
            i10 = (i10 * 31) + this.f20490b[i11];
        }
        return i10;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        if (!(obj instanceof Integer)) {
            return -1;
        }
        int iIntValue = ((Integer) obj).intValue();
        int i10 = this.f20491c;
        for (int i11 = 0; i11 < i10; i11++) {
            if (this.f20490b[i11] == iIntValue) {
                return i11;
            }
        }
        return -1;
    }

    public final int m(int i10) {
        p(i10);
        return this.f20490b[i10];
    }

    public final void n(int i10) {
        b();
        int i11 = this.f20491c;
        int length = this.f20490b.length;
        if (i11 == length) {
            int[] iArr = new int[com.applovin.impl.ca.v(length, 3, 2, 1, 10)];
            System.arraycopy(this.f20490b, 0, iArr, 0, this.f20491c);
            this.f20490b = iArr;
        }
        int[] iArr2 = this.f20490b;
        int i12 = this.f20491c;
        this.f20491c = i12 + 1;
        iArr2[i12] = i10;
    }

    public final void p(int i10) {
        if (i10 < 0 || i10 >= this.f20491c) {
            throw new IndexOutOfBoundsException(q(i10));
        }
    }

    public final String q(int i10) {
        int i11 = this.f20491c;
        return l1.d.j(new StringBuilder(String.valueOf(i10).length() + 13 + String.valueOf(i11).length()), i10, "Index:", i11, ", Size:");
    }

    @Override // com.google.android.gms.internal.ads.sr1, java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object remove(int i10) {
        b();
        p(i10);
        int[] iArr = this.f20490b;
        int i11 = iArr[i10];
        int i12 = this.f20491c;
        if (i10 < i12 - 1) {
            System.arraycopy(iArr, i10 + 1, iArr, i10, (i12 - i10) - 1);
        }
        this.f20491c--;
        ((AbstractList) this).modCount++;
        return Integer.valueOf(i11);
    }

    @Override // java.util.AbstractList
    public final void removeRange(int i10, int i11) {
        b();
        if (i11 < i10) {
            throw new IndexOutOfBoundsException("toIndex < fromIndex");
        }
        int[] iArr = this.f20490b;
        System.arraycopy(iArr, i11, iArr, i10, this.f20491c - i11);
        this.f20491c -= i11 - i10;
        ((AbstractList) this).modCount++;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i10, Object obj) {
        int iIntValue = ((Integer) obj).intValue();
        b();
        p(i10);
        int[] iArr = this.f20490b;
        int i11 = iArr[i10];
        iArr[i10] = iIntValue;
        return Integer.valueOf(i11);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f20491c;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ /* synthetic */ boolean add(Object obj) {
        n(((Integer) obj).intValue());
        return true;
    }
}
