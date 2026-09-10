package com.google.android.gms.internal.play_billing;

import com.applovin.impl.ca;
import java.nio.charset.Charset;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class u1 extends d1 implements RandomAccess, x1 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int[] f24481d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final u1 f24482e;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int[] f24483b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f24484c;

    static {
        int[] iArr = new int[0];
        f24481d = iArr;
        f24482e = new u1(iArr, 0, false);
    }

    public u1(int[] iArr, int i10, boolean z10) {
        super(z10);
        this.f24483b = iArr;
        this.f24484c = i10;
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i10, Object obj) {
        int i11;
        int iIntValue = ((Integer) obj).intValue();
        b();
        if (i10 < 0 || i10 > (i11 = this.f24484c)) {
            throw new IndexOutOfBoundsException(defpackage.e.g(i10, this.f24484c, "Index:", ", Size:"));
        }
        int i12 = i10 + 1;
        int[] iArr = this.f24483b;
        int length = iArr.length;
        if (i11 < length) {
            System.arraycopy(iArr, i10, iArr, i12, i11 - i10);
        } else {
            int[] iArr2 = new int[ca.v(length, 3, 2, 1, 10)];
            System.arraycopy(this.f24483b, 0, iArr2, 0, i10);
            System.arraycopy(this.f24483b, i10, iArr2, i12, this.f24484c - i10);
            this.f24483b = iArr2;
        }
        this.f24483b[i10] = iIntValue;
        this.f24484c++;
        ((AbstractList) this).modCount++;
    }

    @Override // com.google.android.gms.internal.play_billing.d1, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        b();
        Charset charset = z1.f24507a;
        collection.getClass();
        if (!(collection instanceof u1)) {
            return super.addAll(collection);
        }
        u1 u1Var = (u1) collection;
        int i10 = u1Var.f24484c;
        if (i10 == 0) {
            return false;
        }
        int i11 = this.f24484c;
        if (Integer.MAX_VALUE - i11 < i10) {
            throw new OutOfMemoryError();
        }
        int i12 = i11 + i10;
        int[] iArr = this.f24483b;
        if (i12 > iArr.length) {
            this.f24483b = Arrays.copyOf(iArr, i12);
        }
        System.arraycopy(u1Var.f24483b, 0, this.f24483b, this.f24484c, u1Var.f24484c);
        this.f24484c = i12;
        ((AbstractList) this).modCount++;
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        return indexOf(obj) != -1;
    }

    @Override // com.google.android.gms.internal.play_billing.d1, java.util.AbstractList, java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof u1)) {
            return super.equals(obj);
        }
        u1 u1Var = (u1) obj;
        if (this.f24484c != u1Var.f24484c) {
            return false;
        }
        int[] iArr = u1Var.f24483b;
        for (int i10 = 0; i10 < this.f24484c; i10++) {
            if (this.f24483b[i10] != iArr[i10]) {
                return false;
            }
        }
        return true;
    }

    @Override // com.google.android.gms.internal.play_billing.y1
    public final /* bridge */ /* synthetic */ y1 f(int i10) {
        if (i10 >= this.f24484c) {
            return new u1(i10 == 0 ? f24481d : Arrays.copyOf(this.f24483b, i10), this.f24484c, true);
        }
        throw new IllegalArgumentException();
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ Object get(int i10) {
        n(i10);
        return Integer.valueOf(this.f24483b[i10]);
    }

    public final int h(int i10) {
        n(i10);
        return this.f24483b[i10];
    }

    @Override // com.google.android.gms.internal.play_billing.d1, java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int i10 = 1;
        for (int i11 = 0; i11 < this.f24484c; i11++) {
            i10 = (i10 * 31) + this.f24483b[i11];
        }
        return i10;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        if (!(obj instanceof Integer)) {
            return -1;
        }
        int iIntValue = ((Integer) obj).intValue();
        int i10 = this.f24484c;
        for (int i11 = 0; i11 < i10; i11++) {
            if (this.f24483b[i11] == iIntValue) {
                return i11;
            }
        }
        return -1;
    }

    public final void m(int i10) {
        b();
        int i11 = this.f24484c;
        int length = this.f24483b.length;
        if (i11 == length) {
            int[] iArr = new int[ca.v(length, 3, 2, 1, 10)];
            System.arraycopy(this.f24483b, 0, iArr, 0, this.f24484c);
            this.f24483b = iArr;
        }
        int[] iArr2 = this.f24483b;
        int i12 = this.f24484c;
        this.f24484c = i12 + 1;
        iArr2[i12] = i10;
    }

    public final void n(int i10) {
        if (i10 < 0 || i10 >= this.f24484c) {
            throw new IndexOutOfBoundsException(defpackage.e.g(i10, this.f24484c, "Index:", ", Size:"));
        }
    }

    @Override // com.google.android.gms.internal.play_billing.d1, java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object remove(int i10) {
        b();
        n(i10);
        int[] iArr = this.f24483b;
        int i11 = iArr[i10];
        int i12 = this.f24484c;
        if (i10 < i12 - 1) {
            System.arraycopy(iArr, i10 + 1, iArr, i10, (i12 - i10) - 1);
        }
        this.f24484c--;
        ((AbstractList) this).modCount++;
        return Integer.valueOf(i11);
    }

    @Override // java.util.AbstractList
    public final void removeRange(int i10, int i11) {
        b();
        if (i11 < i10) {
            throw new IndexOutOfBoundsException("toIndex < fromIndex");
        }
        int[] iArr = this.f24483b;
        System.arraycopy(iArr, i11, iArr, i10, this.f24484c - i11);
        this.f24484c -= i11 - i10;
        ((AbstractList) this).modCount++;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object set(int i10, Object obj) {
        int iIntValue = ((Integer) obj).intValue();
        b();
        n(i10);
        int[] iArr = this.f24483b;
        int i11 = iArr[i10];
        iArr[i10] = iIntValue;
        return Integer.valueOf(i11);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f24484c;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ /* synthetic */ boolean add(Object obj) {
        m(((Integer) obj).intValue());
        return true;
    }
}
