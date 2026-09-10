package com.google.android.gms.internal.auth;

import java.util.AbstractList;
import java.util.Arrays;
import java.util.RandomAccess;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class j1 extends d0 implements RandomAccess {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final j1 f22849d = new j1(new Object[0], 0, false);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Object[] f22850b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f22851c;

    public j1(Object[] objArr, int i10, boolean z10) {
        super(z10);
        this.f22850b = objArr;
        this.f22851c = i10;
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i10, Object obj) {
        int i11;
        b();
        if (i10 < 0 || i10 > (i11 = this.f22851c)) {
            throw new IndexOutOfBoundsException(defpackage.e.g(i10, this.f22851c, "Index:", ", Size:"));
        }
        Object[] objArr = this.f22850b;
        if (i11 < objArr.length) {
            System.arraycopy(objArr, i10, objArr, i10 + 1, i11 - i10);
        } else {
            Object[] objArr2 = new Object[defpackage.e.D(i11, 3, 2, 1)];
            System.arraycopy(objArr, 0, objArr2, 0, i10);
            System.arraycopy(this.f22850b, i10, objArr2, i10 + 1, this.f22851c - i10);
            this.f22850b = objArr2;
        }
        this.f22850b[i10] = obj;
        this.f22851c++;
        ((AbstractList) this).modCount++;
    }

    @Override // com.google.android.gms.internal.auth.n0
    public final /* bridge */ /* synthetic */ n0 f(int i10) {
        if (i10 >= this.f22851c) {
            return new j1(Arrays.copyOf(this.f22850b, i10), this.f22851c, true);
        }
        throw new IllegalArgumentException();
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i10) {
        h(i10);
        return this.f22850b[i10];
    }

    public final void h(int i10) {
        if (i10 < 0 || i10 >= this.f22851c) {
            throw new IndexOutOfBoundsException(defpackage.e.g(i10, this.f22851c, "Index:", ", Size:"));
        }
    }

    @Override // com.google.android.gms.internal.auth.d0, java.util.AbstractList, java.util.List
    public final Object remove(int i10) {
        b();
        h(i10);
        Object[] objArr = this.f22850b;
        Object obj = objArr[i10];
        int i11 = this.f22851c;
        if (i10 < i11 - 1) {
            System.arraycopy(objArr, i10 + 1, objArr, i10, (i11 - i10) - 1);
        }
        this.f22851c--;
        ((AbstractList) this).modCount++;
        return obj;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i10, Object obj) {
        b();
        h(i10);
        Object[] objArr = this.f22850b;
        Object obj2 = objArr[i10];
        objArr[i10] = obj;
        ((AbstractList) this).modCount++;
        return obj2;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f22851c;
    }

    @Override // com.google.android.gms.internal.auth.d0, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(Object obj) {
        b();
        int i10 = this.f22851c;
        Object[] objArr = this.f22850b;
        if (i10 == objArr.length) {
            this.f22850b = Arrays.copyOf(objArr, ((i10 * 3) / 2) + 1);
        }
        Object[] objArr2 = this.f22850b;
        int i11 = this.f22851c;
        this.f22851c = i11 + 1;
        objArr2[i11] = obj;
        ((AbstractList) this).modCount++;
        return true;
    }
}
