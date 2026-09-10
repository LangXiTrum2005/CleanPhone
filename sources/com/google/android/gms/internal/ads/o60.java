package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class o60 implements da0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final du0 f18176a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final h00 f18177b;

    public o60(du0 du0Var, h00 h00Var) {
        this.f18176a = du0Var;
        this.f18177b = h00Var;
    }

    @Override // com.google.android.gms.internal.ads.da0
    public final void J() {
        if (this.f18176a.r0) {
            h00 h00Var = this.f18177b;
            synchronized (h00Var.f15012a) {
                g00 g00Var = h00Var.f15015d;
                synchronized (g00Var.f14633f) {
                    g00Var.l++;
                }
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.da0
    public final void Q() {
    }

    @Override // com.google.android.gms.internal.ads.da0
    public final void Z() {
    }

    @Override // com.google.android.gms.internal.ads.da0
    public final void zze() {
    }

    @Override // com.google.android.gms.internal.ads.da0
    public final void zzf() {
    }

    @Override // com.google.android.gms.internal.ads.da0
    public final void f(sx sxVar, String str, String str2) {
    }
}
