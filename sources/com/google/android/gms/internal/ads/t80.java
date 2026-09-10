package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class t80 implements gx1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f20239a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final vu0 f20240b;

    public /* synthetic */ t80(vu0 vu0Var, int i10) {
        this.f20239a = i10;
        this.f20240b = vu0Var;
    }

    public du0 a() {
        du0 du0Var = (du0) this.f20240b.f21275c;
        ic1.h(du0Var);
        return du0Var;
    }

    public ju0 b() {
        ju0 ju0Var = (ju0) this.f20240b.f21274b;
        ic1.h(ju0Var);
        return ju0Var;
    }

    @Override // com.google.android.gms.internal.ads.kx1
    public final Object zzb() {
        switch (this.f20239a) {
            case 0:
                du0 du0Var = (du0) this.f20240b.f21275c;
                ic1.h(du0Var);
                return du0Var;
            case 1:
                return (String) this.f20240b.f21276d;
            case 2:
                return this.f20240b.n();
            default:
                ju0 ju0Var = (ju0) this.f20240b.f21274b;
                ic1.h(ju0Var);
                return ju0Var;
        }
    }
}
