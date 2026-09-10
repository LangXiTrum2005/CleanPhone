package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class cd0 implements gx1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f13136a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final lj1 f13137b;

    public /* synthetic */ cd0(lj1 lj1Var, int i10) {
        this.f13136a = i10;
        this.f13137b = lj1Var;
    }

    @Override // com.google.android.gms.internal.ads.kx1
    public final Object zzb() {
        int i10 = this.f13136a;
        lj1 lj1Var = this.f13137b;
        switch (i10) {
            case 0:
                b30 b30Var = (b30) lj1Var.f17037c;
                if (b30Var == null) {
                    return null;
                }
                return b30Var.zzD();
            case 1:
                b30 b30Var2 = (b30) lj1Var.f17037c;
                if (b30Var2 != null) {
                    return b30Var2.zzD();
                }
                return null;
            default:
                return (b30) lj1Var.f17037c;
        }
    }
}
