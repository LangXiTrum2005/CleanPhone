package com.google.android.gms.internal.ads;

import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class cb1 extends ca1 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final transient Object[] f13126c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final transient int f13127d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final transient int f13128e;

    public cb1(int i10, int i11, Object[] objArr) {
        this.f13126c = objArr;
        this.f13127d = i10;
        this.f13128e = i11;
    }

    @Override // java.util.List
    public final Object get(int i10) {
        ps1.f0(i10, this.f13128e);
        Object obj = this.f13126c[i10 + i10 + this.f13127d];
        Objects.requireNonNull(obj);
        return obj;
    }

    @Override // com.google.android.gms.internal.ads.y91
    public final boolean r() {
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f13128e;
    }
}
