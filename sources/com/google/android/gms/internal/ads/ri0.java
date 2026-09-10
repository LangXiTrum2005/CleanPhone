package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.client.zze;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class ri0 extends oy {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ti0 f19598a;

    public ri0(ti0 ti0Var) {
        this.f19598a = ti0Var;
    }

    @Override // com.google.android.gms.internal.ads.py
    public final void a(zze zzeVar) {
        ti0 ti0Var = this.f19598a;
        so0 so0Var = ti0Var.f20402b;
        long j10 = ti0Var.f20401a;
        int i10 = zzeVar.zza;
        v90 v90Var = new v90("rewarded");
        v90Var.f21135a = Long.valueOf(j10);
        v90Var.f21137c = "onRewardedAdFailedToLoad";
        v90Var.f21138d = Integer.valueOf(i10);
        so0Var.n(v90Var);
    }

    @Override // com.google.android.gms.internal.ads.py
    public final void zze() {
        ti0 ti0Var = this.f19598a;
        so0 so0Var = ti0Var.f20402b;
        long j10 = ti0Var.f20401a;
        v90 v90Var = new v90("rewarded");
        v90Var.f21135a = Long.valueOf(j10);
        v90Var.f21137c = "onRewardedAdLoaded";
        so0Var.n(v90Var);
    }

    @Override // com.google.android.gms.internal.ads.py
    public final void zzf(int i10) {
        ti0 ti0Var = this.f19598a;
        so0 so0Var = ti0Var.f20402b;
        long j10 = ti0Var.f20401a;
        v90 v90Var = new v90("rewarded");
        v90Var.f21135a = Long.valueOf(j10);
        v90Var.f21137c = "onRewardedAdFailedToLoad";
        v90Var.f21138d = Integer.valueOf(i10);
        so0Var.n(v90Var);
    }
}
