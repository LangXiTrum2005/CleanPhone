package com.google.android.gms.internal.measurement;

import com.google.android.gms.internal.ads.ur1;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.List;
import java.util.RandomAccess;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class m2 extends m0 implements RandomAccess {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final Object[] f23722d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final m2 f23723e;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Object[] f23724b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f23725c;

    static {
        Object[] objArr = new Object[0];
        f23722d = objArr;
        f23723e = new m2(objArr, 0, false);
    }

    public m2(Object[] objArr, int i10, boolean z10) {
        super(z10);
        this.f23724b = objArr;
        this.f23725c = i10;
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i10, Object obj) {
        int i11;
        b();
        if (i10 < 0 || i10 > (i11 = this.f23725c)) {
            throw new IndexOutOfBoundsException(ur1.a(this.f23725c, i10, (byte) 13, "Index:", ", Size:"));
        }
        int i12 = i10 + 1;
        Object[] objArr = this.f23724b;
        int length = objArr.length;
        if (i11 < length) {
            System.arraycopy(objArr, i10, objArr, i12, i11 - i10);
        } else {
            Object[] objArr2 = new Object[com.applovin.impl.ca.v(length, 3, 2, 1, 10)];
            System.arraycopy(this.f23724b, 0, objArr2, 0, i10);
            System.arraycopy(this.f23724b, i10, objArr2, i12, this.f23725c - i10);
            this.f23724b = objArr2;
        }
        this.f23724b[i10] = obj;
        this.f23725c++;
        ((AbstractList) this).modCount++;
    }

    @Override // com.google.android.gms.internal.measurement.m0, java.util.AbstractList, java.util.Collection, java.util.List
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
        int i10 = this.f23725c;
        if (i10 != list.size()) {
            return false;
        }
        if (!(obj instanceof m2)) {
            for (int i11 = 0; i11 < i10; i11++) {
                if (!this.f23724b[i11].equals(list.get(i11))) {
                    return false;
                }
            }
            return true;
        }
        m2 m2Var = (m2) obj;
        for (int i12 = 0; i12 < i10; i12++) {
            if (!this.f23724b[i12].equals(m2Var.f23724b[i12])) {
                return false;
            }
        }
        return true;
    }

    @Override // com.google.android.gms.internal.measurement.s1
    public final /* bridge */ /* synthetic */ s1 g(int i10) {
        if (i10 >= this.f23725c) {
            return new m2(i10 == 0 ? f23722d : Arrays.copyOf(this.f23724b, i10), this.f23725c, true);
        }
        throw new IllegalArgumentException();
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i10) {
        h(i10);
        return this.f23724b[i10];
    }

    public final void h(int i10) {
        if (i10 < 0 || i10 >= this.f23725c) {
            throw new IndexOutOfBoundsException(ur1.a(this.f23725c, i10, (byte) 13, "Index:", ", Size:"));
        }
    }

    @Override // java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int i10 = this.f23725c;
        int iHashCode = 1;
        for (int i11 = 0; i11 < i10; i11++) {
            iHashCode = (iHashCode * 31) + this.f23724b[i11].hashCode();
        }
        return iHashCode;
    }

    @Override // com.google.android.gms.internal.measurement.m0, java.util.AbstractList, java.util.List
    public final Object remove(int i10) {
        b();
        h(i10);
        Object[] objArr = this.f23724b;
        Object obj = objArr[i10];
        int i11 = this.f23725c;
        if (i10 < i11 - 1) {
            System.arraycopy(objArr, i10 + 1, objArr, i10, (i11 - i10) - 1);
        }
        this.f23725c--;
        ((AbstractList) this).modCount++;
        return obj;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i10, Object obj) {
        b();
        h(i10);
        Object[] objArr = this.f23724b;
        Object obj2 = objArr[i10];
        objArr[i10] = obj;
        ((AbstractList) this).modCount++;
        return obj2;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f23725c;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(Object obj) {
        b();
        int i10 = this.f23725c;
        int length = this.f23724b.length;
        if (i10 == length) {
            this.f23724b = Arrays.copyOf(this.f23724b, com.applovin.impl.ca.v(length, 3, 2, 1, 10));
        }
        Object[] objArr = this.f23724b;
        int i11 = this.f23725c;
        this.f23725c = i11 + 1;
        objArr[i11] = obj;
        ((AbstractList) this).modCount++;
        return true;
    }
}
