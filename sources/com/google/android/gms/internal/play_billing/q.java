package com.google.android.gms.internal.play_billing;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class q extends r {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final transient int f24446c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final transient int f24447d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ r f24448e;

    public q(r rVar, int i10, int i11) {
        this.f24448e = rVar;
        this.f24446c = i10;
        this.f24447d = i11;
    }

    @Override // java.util.List
    public final Object get(int i10) {
        no.b.I(i10, this.f24447d);
        return this.f24448e.get(i10 + this.f24446c);
    }

    @Override // com.google.android.gms.internal.play_billing.o
    public final int h() {
        return this.f24448e.m() + this.f24446c + this.f24447d;
    }

    @Override // com.google.android.gms.internal.play_billing.o
    public final int m() {
        return this.f24448e.m() + this.f24446c;
    }

    @Override // com.google.android.gms.internal.play_billing.o
    public final boolean p() {
        return true;
    }

    @Override // com.google.android.gms.internal.play_billing.o
    public final Object[] q() {
        return this.f24448e.q();
    }

    @Override // com.google.android.gms.internal.play_billing.r, java.util.List
    /* JADX INFO: renamed from: r, reason: merged with bridge method [inline-methods] */
    public final r subList(int i10, int i11) {
        no.b.K(i10, i11, this.f24447d);
        int i12 = this.f24446c;
        return this.f24448e.subList(i10 + i12, i11 + i12);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f24447d;
    }
}
