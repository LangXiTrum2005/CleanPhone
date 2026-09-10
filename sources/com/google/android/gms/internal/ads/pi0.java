package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.client.zzbg;
import com.google.android.gms.ads.internal.client.zze;
import com.ironsource.Yf;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class pi0 extends zzbg {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ so0 f18665a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ qi0 f18666b;

    public pi0(qi0 qi0Var, so0 so0Var) {
        this.f18665a = so0Var;
        this.f18666b = qi0Var;
    }

    @Override // com.google.android.gms.ads.internal.client.zzbh
    public final void zzb() {
        long j10 = this.f18666b.f19090a;
        v90 v90Var = new v90("interstitial");
        v90Var.f21135a = Long.valueOf(j10);
        v90Var.f21137c = Yf.f28051g;
        this.f18665a.n(v90Var);
    }

    @Override // com.google.android.gms.ads.internal.client.zzbh
    public final void zzc(int i10) {
        long j10 = this.f18666b.f19090a;
        v90 v90Var = new v90("interstitial");
        v90Var.f21135a = Long.valueOf(j10);
        v90Var.f21137c = "onAdFailedToLoad";
        v90Var.f21138d = Integer.valueOf(i10);
        this.f18665a.n(v90Var);
    }

    @Override // com.google.android.gms.ads.internal.client.zzbh
    public final void zzd(zze zzeVar) {
        long j10 = this.f18666b.f19090a;
        int i10 = zzeVar.zza;
        v90 v90Var = new v90("interstitial");
        v90Var.f21135a = Long.valueOf(j10);
        v90Var.f21137c = "onAdFailedToLoad";
        v90Var.f21138d = Integer.valueOf(i10);
        this.f18665a.n(v90Var);
    }

    @Override // com.google.android.gms.ads.internal.client.zzbh
    public final void zzf() {
        long j10 = this.f18666b.f19090a;
        v90 v90Var = new v90("interstitial");
        v90Var.f21135a = Long.valueOf(j10);
        v90Var.f21137c = Yf.f28054j;
        this.f18665a.n(v90Var);
    }

    @Override // com.google.android.gms.ads.internal.client.zzbh
    public final void zzg() {
        long j10 = this.f18666b.f19090a;
        v90 v90Var = new v90("interstitial");
        v90Var.f21135a = Long.valueOf(j10);
        v90Var.f21137c = Yf.f28047c;
        this.f18665a.n(v90Var);
    }

    @Override // com.google.android.gms.ads.internal.client.zzbh
    public final void zzh() {
        long j10 = this.f18666b.f19090a;
        v90 v90Var = new v90("interstitial");
        v90Var.f21135a = Long.valueOf(j10);
        v90Var.f21137c = Yf.f28050f;
        ((dr) this.f18665a.f20013b).b(v90Var.a());
    }

    @Override // com.google.android.gms.ads.internal.client.zzbh
    public final void zze() {
    }

    @Override // com.google.android.gms.ads.internal.client.zzbh
    public final void zzi() {
    }

    @Override // com.google.android.gms.ads.internal.client.zzbh
    public final void zzj() {
    }
}
