package com.google.android.gms.internal.play_billing;

import com.applovin.impl.ca;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.RandomAccess;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class q2 extends d1 implements RandomAccess {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final Object[] f24452d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final q2 f24453e;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Object[] f24454b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f24455c;

    static {
        Object[] objArr = new Object[0];
        f24452d = objArr;
        f24453e = new q2(objArr, 0, false);
    }

    public q2(Object[] objArr, int i10, boolean z10) {
        super(z10);
        this.f24454b = objArr;
        this.f24455c = i10;
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i10, Object obj) {
        int i11;
        b();
        if (i10 < 0 || i10 > (i11 = this.f24455c)) {
            throw new IndexOutOfBoundsException(defpackage.e.g(i10, this.f24455c, "Index:", ", Size:"));
        }
        int i12 = i10 + 1;
        Object[] objArr = this.f24454b;
        int length = objArr.length;
        if (i11 < length) {
            System.arraycopy(objArr, i10, objArr, i12, i11 - i10);
        } else {
            Object[] objArr2 = new Object[ca.v(length, 3, 2, 1, 10)];
            System.arraycopy(this.f24454b, 0, objArr2, 0, i10);
            System.arraycopy(this.f24454b, i10, objArr2, i12, this.f24455c - i10);
            this.f24454b = objArr2;
        }
        this.f24454b[i10] = obj;
        this.f24455c++;
        ((AbstractList) this).modCount++;
    }

    @Override // com.google.android.gms.internal.play_billing.y1
    public final /* bridge */ /* synthetic */ y1 f(int i10) {
        if (i10 >= this.f24455c) {
            return new q2(i10 == 0 ? f24452d : Arrays.copyOf(this.f24454b, i10), this.f24455c, true);
        }
        throw new IllegalArgumentException();
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i10) {
        h(i10);
        return this.f24454b[i10];
    }

    public final void h(int i10) {
        if (i10 < 0 || i10 >= this.f24455c) {
            throw new IndexOutOfBoundsException(defpackage.e.g(i10, this.f24455c, "Index:", ", Size:"));
        }
    }

    @Override // com.google.android.gms.internal.play_billing.d1, java.util.AbstractList, java.util.List
    public final Object remove(int i10) {
        b();
        h(i10);
        Object[] objArr = this.f24454b;
        Object obj = objArr[i10];
        int i11 = this.f24455c;
        if (i10 < i11 - 1) {
            System.arraycopy(objArr, i10 + 1, objArr, i10, (i11 - i10) - 1);
        }
        this.f24455c--;
        ((AbstractList) this).modCount++;
        return obj;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i10, Object obj) {
        b();
        h(i10);
        Object[] objArr = this.f24454b;
        Object obj2 = objArr[i10];
        objArr[i10] = obj;
        ((AbstractList) this).modCount++;
        return obj2;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f24455c;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(Object obj) {
        b();
        int i10 = this.f24455c;
        int length = this.f24454b.length;
        if (i10 == length) {
            this.f24454b = Arrays.copyOf(this.f24454b, ca.v(length, 3, 2, 1, 10));
        }
        Object[] objArr = this.f24454b;
        int i11 = this.f24455c;
        this.f24455c = i11 + 1;
        objArr[i11] = obj;
        ((AbstractList) this).modCount++;
        return true;
    }
}
