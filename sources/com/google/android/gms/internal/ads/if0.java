package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class if0 implements gx1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f15725a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final hf0 f15726b;

    public /* synthetic */ if0(hf0 hf0Var, int i10) {
        this.f15725a = i10;
        this.f15726b = hf0Var;
    }

    @Override // com.google.android.gms.internal.ads.kx1
    public final Object zzb() {
        int i10 = this.f15725a;
        hf0 hf0Var = this.f15726b;
        switch (i10) {
            case 0:
                return hf0Var.f15274c;
            case 1:
                return hf0Var.f15273b;
            default:
                return hf0Var.f15272a;
        }
    }
}
