package com.google.android.gms.internal.consent_sdk;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class n0 extends o0 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final transient int f23109c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final transient int f23110d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ o0 f23111e;

    public n0(o0 o0Var, int i10, int i11) {
        this.f23111e = o0Var;
        this.f23109c = i10;
        this.f23110d = i11;
    }

    @Override // java.util.List
    public final Object get(int i10) {
        j0.b(i10, this.f23110d);
        return this.f23111e.get(i10 + this.f23109c);
    }

    @Override // com.google.android.gms.internal.consent_sdk.l0
    public final int h() {
        return this.f23111e.m() + this.f23109c + this.f23110d;
    }

    @Override // com.google.android.gms.internal.consent_sdk.l0
    public final int m() {
        return this.f23111e.m() + this.f23109c;
    }

    @Override // com.google.android.gms.internal.consent_sdk.l0
    public final Object[] n() {
        return this.f23111e.n();
    }

    @Override // com.google.android.gms.internal.consent_sdk.o0, java.util.List
    /* JADX INFO: renamed from: p */
    public final o0 subList(int i10, int i11) {
        j0.f(i10, i11, this.f23110d);
        int i12 = this.f23109c;
        return this.f23111e.subList(i10 + i12, i11 + i12);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f23110d;
    }
}
