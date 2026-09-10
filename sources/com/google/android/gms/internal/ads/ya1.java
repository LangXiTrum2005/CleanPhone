package com.google.android.gms.internal.ads;

import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class ya1 extends ca1 {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final ya1 f22208e = new ya1(0, new Object[0]);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final transient Object[] f22209c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final transient int f22210d;

    public ya1(int i10, Object[] objArr) {
        this.f22209c = objArr;
        this.f22210d = i10;
    }

    @Override // java.util.List
    public final Object get(int i10) {
        ps1.f0(i10, this.f22210d);
        Object obj = this.f22209c[i10];
        Objects.requireNonNull(obj);
        return obj;
    }

    @Override // com.google.android.gms.internal.ads.y91
    public final Object[] m() {
        return this.f22209c;
    }

    @Override // com.google.android.gms.internal.ads.y91
    public final int n() {
        return 0;
    }

    @Override // com.google.android.gms.internal.ads.y91
    public final int p() {
        return this.f22210d;
    }

    @Override // com.google.android.gms.internal.ads.y91
    public final boolean r() {
        return false;
    }

    @Override // com.google.android.gms.internal.ads.ca1, com.google.android.gms.internal.ads.y91
    public final int s(Object[] objArr, int i10) {
        Object[] objArr2 = this.f22209c;
        int i11 = this.f22210d;
        System.arraycopy(objArr2, 0, objArr, i10, i11);
        return i10 + i11;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f22210d;
    }
}
