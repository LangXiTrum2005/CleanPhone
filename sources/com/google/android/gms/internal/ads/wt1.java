package com.google.android.gms.internal.ads;

import java.util.AbstractList;
import java.util.Arrays;
import java.util.List;
import java.util.RandomAccess;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class wt1 extends sr1 implements RandomAccess {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final Object[] f21605d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final wt1 f21606e;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Object[] f21607b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f21608c;

    static {
        Object[] objArr = new Object[0];
        f21605d = objArr;
        f21606e = new wt1(objArr, 0, false);
    }

    public wt1(Object[] objArr, int i10, boolean z10) {
        super(z10);
        this.f21607b = objArr;
        this.f21608c = i10;
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i10, Object obj) {
        int i11;
        b();
        if (i10 < 0 || i10 > (i11 = this.f21608c)) {
            throw new IndexOutOfBoundsException(m(i10));
        }
        int i12 = i10 + 1;
        Object[] objArr = this.f21607b;
        int length = objArr.length;
        if (i11 < length) {
            System.arraycopy(objArr, i10, objArr, i12, i11 - i10);
        } else {
            Object[] objArr2 = new Object[com.applovin.impl.ca.v(length, 3, 2, 1, 10)];
            System.arraycopy(this.f21607b, 0, objArr2, 0, i10);
            System.arraycopy(this.f21607b, i10, objArr2, i12, this.f21608c - i10);
            this.f21607b = objArr2;
        }
        this.f21607b[i10] = obj;
        this.f21608c++;
        ((AbstractList) this).modCount++;
    }

    @Override // com.google.android.gms.internal.ads.at1
    public final /* bridge */ /* synthetic */ at1 e(int i10) {
        if (i10 >= this.f21608c) {
            return new wt1(i10 == 0 ? f21605d : Arrays.copyOf(this.f21607b, i10), this.f21608c, true);
        }
        throw new IllegalArgumentException();
    }

    @Override // com.google.android.gms.internal.ads.sr1, java.util.AbstractList, java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof List)) {
            return false;
        }
        if (!(obj instanceof RandomAccess)) {
            return super.equals(obj);
        }
        List list = (List) obj;
        int i10 = this.f21608c;
        if (i10 != list.size()) {
            return false;
        }
        if (!(obj instanceof wt1)) {
            for (int i11 = 0; i11 < i10; i11++) {
                if (!this.f21607b[i11].equals(list.get(i11))) {
                    return false;
                }
            }
            return true;
        }
        wt1 wt1Var = (wt1) obj;
        for (int i12 = 0; i12 < i10; i12++) {
            if (!this.f21607b[i12].equals(wt1Var.f21607b[i12])) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i10) {
        h(i10);
        return this.f21607b[i10];
    }

    public final void h(int i10) {
        if (i10 < 0 || i10 >= this.f21608c) {
            throw new IndexOutOfBoundsException(m(i10));
        }
    }

    @Override // java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int i10 = this.f21608c;
        int iHashCode = 1;
        for (int i11 = 0; i11 < i10; i11++) {
            iHashCode = (iHashCode * 31) + this.f21607b[i11].hashCode();
        }
        return iHashCode;
    }

    public final String m(int i10) {
        int i11 = this.f21608c;
        return l1.d.j(new StringBuilder(String.valueOf(i10).length() + 13 + String.valueOf(i11).length()), i10, "Index:", i11, ", Size:");
    }

    @Override // com.google.android.gms.internal.ads.sr1, java.util.AbstractList, java.util.List
    public final Object remove(int i10) {
        b();
        h(i10);
        Object[] objArr = this.f21607b;
        Object obj = objArr[i10];
        int i11 = this.f21608c;
        if (i10 < i11 - 1) {
            System.arraycopy(objArr, i10 + 1, objArr, i10, (i11 - i10) - 1);
        }
        this.f21608c--;
        ((AbstractList) this).modCount++;
        return obj;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i10, Object obj) {
        b();
        h(i10);
        Object[] objArr = this.f21607b;
        Object obj2 = objArr[i10];
        objArr[i10] = obj;
        ((AbstractList) this).modCount++;
        return obj2;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f21608c;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(Object obj) {
        b();
        int i10 = this.f21608c;
        int length = this.f21607b.length;
        if (i10 == length) {
            this.f21607b = Arrays.copyOf(this.f21607b, com.applovin.impl.ca.v(length, 3, 2, 1, 10));
        }
        Object[] objArr = this.f21607b;
        int i11 = this.f21608c;
        this.f21608c = i11 + 1;
        objArr[i11] = obj;
        ((AbstractList) this).modCount++;
        return true;
    }
}
