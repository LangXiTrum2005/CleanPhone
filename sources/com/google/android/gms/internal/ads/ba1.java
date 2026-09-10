package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class ba1 extends ca1 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final transient int f12704c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final transient int f12705d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ ca1 f12706e;

    public ba1(ca1 ca1Var, int i10, int i11) {
        this.f12706e = ca1Var;
        this.f12704c = i10;
        this.f12705d = i11;
    }

    @Override // java.util.List
    public final Object get(int i10) {
        ps1.f0(i10, this.f12705d);
        return this.f12706e.get(i10 + this.f12704c);
    }

    @Override // com.google.android.gms.internal.ads.y91
    public final Object[] m() {
        return this.f12706e.m();
    }

    @Override // com.google.android.gms.internal.ads.y91
    public final int n() {
        return this.f12706e.n() + this.f12704c;
    }

    @Override // com.google.android.gms.internal.ads.y91
    public final int p() {
        return this.f12706e.n() + this.f12704c + this.f12705d;
    }

    @Override // com.google.android.gms.internal.ads.y91
    public final boolean r() {
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f12705d;
    }

    @Override // com.google.android.gms.internal.ads.ca1, java.util.List
    /* JADX INFO: renamed from: t */
    public final ca1 subList(int i10, int i11) {
        ps1.h0(i10, i11, this.f12705d);
        int i12 = this.f12704c;
        return this.f12706e.subList(i10 + i12, i11 + i12);
    }
}
