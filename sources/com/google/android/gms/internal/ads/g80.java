package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class g80 implements gx1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f14796a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final md0 f14797b;

    public /* synthetic */ g80(md0 md0Var, int i10) {
        this.f14796a = i10;
        this.f14797b = md0Var;
    }

    @Override // com.google.android.gms.internal.ads.kx1
    public final Object zzb() {
        switch (this.f14796a) {
            case 0:
                ub0 ub0Var = (ub0) this.f14797b.f17400c;
                return ub0Var != null ? new nc0(ub0Var, l00.f16615h) : new nc0(new f80(), l00.f16615h);
            default:
                return (ub0) this.f14797b.f17400c;
        }
    }
}
