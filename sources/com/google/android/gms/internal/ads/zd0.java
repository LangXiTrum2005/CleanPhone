package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class zd0 implements gx1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f22580a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final e60 f22581b;

    public /* synthetic */ zd0(e60 e60Var, int i10) {
        this.f22580a = i10;
        this.f22581b = e60Var;
    }

    @Override // com.google.android.gms.internal.ads.kx1
    public final Object zzb() {
        switch (this.f22580a) {
            case 0:
                return new yd0(this.f22581b.a());
            default:
                return new sg0(this.f22581b.a());
        }
    }
}
