package com.google.android.gms.internal.consent_sdk;

import com.applovin.impl.ca;
import java.nio.charset.Charset;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class x5 extends j5 implements RandomAccess, y5 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int[] f23266d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final x5 f23267e;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int[] f23268b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f23269c;

    static {
        int[] iArr = new int[0];
        f23266d = iArr;
        f23267e = new x5(iArr, 0, false);
    }

    public x5(int[] iArr, int i10, boolean z10) {
        super(z10);
        this.f23268b = iArr;
        this.f23269c = i10;
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i10, Object obj) {
        int i11;
        int iIntValue = ((Integer) obj).intValue();
        b();
        if (i10 < 0 || i10 > (i11 = this.f23269c)) {
            throw new IndexOutOfBoundsException(defpackage.e.g(i10, this.f23269c, "Index:", ", Size:"));
        }
        int i12 = i10 + 1;
        int[] iArr = this.f23268b;
        int length = iArr.length;
        if (i11 < length) {
            System.arraycopy(iArr, i10, iArr, i12, i11 - i10);
        } else {
            int[] iArr2 = new int[ca.v(length, 3, 2, 1, 10)];
            System.arraycopy(this.f23268b, 0, iArr2, 0, i10);
            System.arraycopy(this.f23268b, i10, iArr2, i12, this.f23269c - i10);
            this.f23268b = iArr2;
        }
        this.f23268b[i10] = iIntValue;
        this.f23269c++;
        ((AbstractList) this).modCount++;
    }

    @Override // com.google.android.gms.internal.consent_sdk.j5, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        b();
        Charset charset = a6.f22937a;
        collection.getClass();
        if (!(collection instanceof x5)) {
            return super.addAll(collection);
        }
        x5 x5Var = (x5) collection;
        int i10 = x5Var.f23269c;
        if (i10 == 0) {
            return false;
        }
        int i11 = this.f23269c;
        if (Integer.MAX_VALUE - i11 < i10) {
            throw new OutOfMemoryError();
        }
        int i12 = i11 + i10;
        int[] iArr = this.f23268b;
        if (i12 > iArr.length) {
            this.f23268b = Arrays.copyOf(iArr, i12);
        }
        System.arraycopy(x5Var.f23268b, 0, this.f23268b, this.f23269c, x5Var.f23269c);
        this.f23269c = i12;
        ((AbstractList) this).modCount++;
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        return indexOf(obj) != -1;
    }

    @Override // com.google.android.gms.internal.consent_sdk.j5, java.util.AbstractList, java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof x5)) {
            return super.equals(obj);
        }
        x5 x5Var = (x5) obj;
        if (this.f23269c != x5Var.f23269c) {
            return false;
        }
        int[] iArr = x5Var.f23268b;
        for (int i10 = 0; i10 < this.f23269c; i10++) {
            if (this.f23268b[i10] != iArr[i10]) {
                return false;
            }
        }
        return true;
    }

    @Override // com.google.android.gms.internal.consent_sdk.z5
    public final /* bridge */ /* synthetic */ z5 f(int i10) {
        if (i10 >= this.f23269c) {
            return new x5(i10 == 0 ? f23266d : Arrays.copyOf(this.f23268b, i10), this.f23269c, true);
        }
        throw new IllegalArgumentException();
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ Object get(int i10) {
        m(i10);
        return Integer.valueOf(this.f23268b[i10]);
    }

    public final int h(int i10) {
        m(i10);
        return this.f23268b[i10];
    }

    @Override // com.google.android.gms.internal.consent_sdk.j5, java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int i10 = 1;
        for (int i11 = 0; i11 < this.f23269c; i11++) {
            i10 = (i10 * 31) + this.f23268b[i11];
        }
        return i10;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        if (!(obj instanceof Integer)) {
            return -1;
        }
        int iIntValue = ((Integer) obj).intValue();
        int i10 = this.f23269c;
        for (int i11 = 0; i11 < i10; i11++) {
            if (this.f23268b[i11] == iIntValue) {
                return i11;
            }
        }
        return -1;
    }

    public final void m(int i10) {
        if (i10 < 0 || i10 >= this.f23269c) {
            throw new IndexOutOfBoundsException(defpackage.e.g(i10, this.f23269c, "Index:", ", Size:"));
        }
    }

    @Override // com.google.android.gms.internal.consent_sdk.j5, java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object remove(int i10) {
        b();
        m(i10);
        int[] iArr = this.f23268b;
        int i11 = iArr[i10];
        int i12 = this.f23269c;
        if (i10 < i12 - 1) {
            System.arraycopy(iArr, i10 + 1, iArr, i10, (i12 - i10) - 1);
        }
        this.f23269c--;
        ((AbstractList) this).modCount++;
        return Integer.valueOf(i11);
    }

    @Override // java.util.AbstractList
    public final void removeRange(int i10, int i11) {
        b();
        if (i11 < i10) {
            throw new IndexOutOfBoundsException("toIndex < fromIndex");
        }
        int[] iArr = this.f23268b;
        System.arraycopy(iArr, i11, iArr, i10, this.f23269c - i11);
        this.f23269c -= i11 - i10;
        ((AbstractList) this).modCount++;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object set(int i10, Object obj) {
        int iIntValue = ((Integer) obj).intValue();
        b();
        m(i10);
        int[] iArr = this.f23268b;
        int i11 = iArr[i10];
        iArr[i10] = iIntValue;
        return Integer.valueOf(i11);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f23269c;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(Object obj) {
        int iIntValue = ((Integer) obj).intValue();
        b();
        int i10 = this.f23269c;
        int length = this.f23268b.length;
        if (i10 == length) {
            int[] iArr = new int[ca.v(length, 3, 2, 1, 10)];
            System.arraycopy(this.f23268b, 0, iArr, 0, this.f23269c);
            this.f23268b = iArr;
        }
        int[] iArr2 = this.f23268b;
        int i11 = this.f23269c;
        this.f23269c = i11 + 1;
        iArr2[i11] = iIntValue;
        return true;
    }
}
