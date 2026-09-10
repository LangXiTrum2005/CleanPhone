package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.client.zze;
import com.ironsource.Yf;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class si0 extends ky {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ti0 f19977a;

    public si0(ti0 ti0Var) {
        this.f19977a = ti0Var;
    }

    @Override // com.google.android.gms.internal.ads.ly
    public final void d0(fy fyVar) {
        ti0 ti0Var = this.f19977a;
        so0 so0Var = ti0Var.f20402b;
        long j10 = ti0Var.f20401a;
        v90 v90Var = new v90("rewarded");
        v90Var.f21135a = Long.valueOf(j10);
        v90Var.f21137c = "onUserEarnedReward";
        v90Var.f21139e = fyVar.zze();
        v90Var.f21140f = Integer.valueOf(fyVar.zzf());
        so0Var.n(v90Var);
    }

    @Override // com.google.android.gms.internal.ads.ly
    public final void e(int i10) {
        ti0 ti0Var = this.f19977a;
        so0 so0Var = ti0Var.f20402b;
        long j10 = ti0Var.f20401a;
        v90 v90Var = new v90("rewarded");
        v90Var.f21135a = Long.valueOf(j10);
        v90Var.f21137c = "onRewardedAdFailedToShow";
        v90Var.f21138d = Integer.valueOf(i10);
        so0Var.n(v90Var);
    }

    @Override // com.google.android.gms.internal.ads.ly
    public final void i0(zze zzeVar) {
        ti0 ti0Var = this.f19977a;
        so0 so0Var = ti0Var.f20402b;
        long j10 = ti0Var.f20401a;
        int i10 = zzeVar.zza;
        v90 v90Var = new v90("rewarded");
        v90Var.f21135a = Long.valueOf(j10);
        v90Var.f21137c = "onRewardedAdFailedToShow";
        v90Var.f21138d = Integer.valueOf(i10);
        so0Var.n(v90Var);
    }

    @Override // com.google.android.gms.internal.ads.ly
    public final void zze() {
        ti0 ti0Var = this.f19977a;
        so0 so0Var = ti0Var.f20402b;
        long j10 = ti0Var.f20401a;
        v90 v90Var = new v90("rewarded");
        v90Var.f21135a = Long.valueOf(j10);
        v90Var.f21137c = "onRewardedAdOpened";
        so0Var.n(v90Var);
    }

    @Override // com.google.android.gms.internal.ads.ly
    public final void zzf() {
        ti0 ti0Var = this.f19977a;
        so0 so0Var = ti0Var.f20402b;
        long j10 = ti0Var.f20401a;
        v90 v90Var = new v90("rewarded");
        v90Var.f21135a = Long.valueOf(j10);
        v90Var.f21137c = "onRewardedAdClosed";
        so0Var.n(v90Var);
    }

    @Override // com.google.android.gms.internal.ads.ly
    public final void zzj() {
        ti0 ti0Var = this.f19977a;
        so0 so0Var = ti0Var.f20402b;
        long j10 = ti0Var.f20401a;
        v90 v90Var = new v90("rewarded");
        v90Var.f21135a = Long.valueOf(j10);
        v90Var.f21137c = "onAdImpression";
        so0Var.n(v90Var);
    }

    @Override // com.google.android.gms.internal.ads.ly
    public final void zzk() {
        ti0 ti0Var = this.f19977a;
        so0 so0Var = ti0Var.f20402b;
        long j10 = ti0Var.f20401a;
        v90 v90Var = new v90("rewarded");
        v90Var.f21135a = Long.valueOf(j10);
        v90Var.f21137c = Yf.f28050f;
        so0Var.n(v90Var);
    }
}
