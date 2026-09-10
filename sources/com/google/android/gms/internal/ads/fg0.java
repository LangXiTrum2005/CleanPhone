package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class fg0 implements gx1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f14401a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final t80 f14402b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final er0 f14403c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final e60 f14404d;

    public /* synthetic */ fg0(t80 t80Var, er0 er0Var, e60 e60Var, int i10) {
        this.f14401a = i10;
        this.f14402b = t80Var;
        this.f14403c = er0Var;
        this.f14404d = e60Var;
    }

    @Override // com.google.android.gms.internal.ads.kx1
    public final Object zzb() {
        switch (this.f14401a) {
            case 0:
                return new eg0((String) this.f14402b.f20240b.f21276d, (ee0) this.f14403c.zzb(), this.f14404d.a());
            default:
                return new gg0((String) this.f14402b.f20240b.f21276d, (ee0) this.f14403c.zzb(), this.f14404d.a());
        }
    }
}
