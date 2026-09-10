package com.google.android.gms.internal.ads;

import android.view.View;

/* JADX INFO: loaded from: classes3.dex */
final class zzeit implements com.google.android.gms.ads.internal.zzg {
    final /* synthetic */ zzcab zza;
    final /* synthetic */ zzfca zzb;
    final /* synthetic */ zzfbo zzc;
    final /* synthetic */ zzeiz zzd;
    final /* synthetic */ zzeiu zze;

    public zzeit(zzeiu zzeiuVar, zzcab zzcabVar, zzfca zzfcaVar, zzfbo zzfboVar, zzeiz zzeizVar) {
        this.zza = zzcabVar;
        this.zzb = zzfcaVar;
        this.zzc = zzfboVar;
        this.zzd = zzeizVar;
        this.zze = zzeiuVar;
    }

    @Override // com.google.android.gms.ads.internal.zzg
    public final void zza(View view) {
        this.zza.zzc(this.zze.zzd.zza(this.zzb, this.zzc, view, this.zzd));
    }

    @Override // com.google.android.gms.ads.internal.zzg
    public final void zzb() {
    }

    @Override // com.google.android.gms.ads.internal.zzg
    public final void zzc() {
    }
}
