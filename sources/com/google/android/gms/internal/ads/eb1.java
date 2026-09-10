package com.google.android.gms.internal.ads;

import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class eb1 extends ia1 {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final Object[] f13922i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final eb1 f13923j;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final transient Object[] f13924d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final transient int f13925e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final transient Object[] f13926f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final transient int f13927g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final transient int f13928h;

    static {
        Object[] objArr = new Object[0];
        f13922i = objArr;
        f13923j = new eb1(0, 0, 0, objArr, objArr);
    }

    public eb1(int i10, int i11, int i12, Object[] objArr, Object[] objArr2) {
        this.f13924d = objArr;
        this.f13925e = i10;
        this.f13926f = objArr2;
        this.f13927g = i11;
        this.f13928h = i12;
    }

    @Override // com.google.android.gms.internal.ads.y91, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        if (obj != null) {
            Object[] objArr = this.f13926f;
            if (objArr.length != 0) {
                int iM = dv.m(obj);
                while (true) {
                    int i10 = iM & this.f13927g;
                    Object obj2 = objArr[i10];
                    if (obj2 == null) {
                        return false;
                    }
                    if (obj2.equals(obj)) {
                        return true;
                    }
                    iM = i10 + 1;
                }
            }
        }
        return false;
    }

    @Override // com.google.android.gms.internal.ads.y91
    public final mb1 h() {
        return q().listIterator(0);
    }

    @Override // com.google.android.gms.internal.ads.ia1, java.util.Collection, java.util.Set
    public final int hashCode() {
        return this.f13925e;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final /* synthetic */ Iterator iterator() {
        return q().listIterator(0);
    }

    @Override // com.google.android.gms.internal.ads.y91
    public final Object[] m() {
        return this.f13924d;
    }

    @Override // com.google.android.gms.internal.ads.y91
    public final int n() {
        return 0;
    }

    @Override // com.google.android.gms.internal.ads.y91
    public final int p() {
        return this.f13928h;
    }

    @Override // com.google.android.gms.internal.ads.y91
    public final boolean r() {
        return false;
    }

    @Override // com.google.android.gms.internal.ads.y91
    public final int s(Object[] objArr, int i10) {
        Object[] objArr2 = this.f13924d;
        int i11 = this.f13928h;
        System.arraycopy(objArr2, 0, objArr, i10, i11);
        return i10 + i11;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.f13928h;
    }

    @Override // com.google.android.gms.internal.ads.ia1
    public final ca1 x() {
        return ca1.A(this.f13928h, this.f13924d);
    }
}
