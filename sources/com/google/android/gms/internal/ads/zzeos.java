package com.google.android.gms.internal.ads;

import android.view.View;
import java.util.Objects;

/* JADX INFO: loaded from: classes4.dex */
final class zzeos implements com.google.android.gms.ads.internal.zzg {
    final /* synthetic */ zzcdt zza;
    final /* synthetic */ zzfic zzb;
    final /* synthetic */ zzfhr zzc;
    final /* synthetic */ zzeoz zzd;
    final /* synthetic */ zzeou zze;

    public zzeos(zzeou zzeouVar, zzcdt zzcdtVar, zzfic zzficVar, zzfhr zzfhrVar, zzeoz zzeozVar) {
        this.zza = zzcdtVar;
        this.zzb = zzficVar;
        this.zzc = zzfhrVar;
        this.zzd = zzeozVar;
        Objects.requireNonNull(zzeouVar);
        this.zze = zzeouVar;
    }

    @Override // com.google.android.gms.ads.internal.zzg
    public final void zza(View view) {
        zzeoz zzeozVar = this.zzd;
        this.zza.zzc(this.zze.zzd().zza(this.zzb, this.zzc, view, zzeozVar));
    }

    @Override // com.google.android.gms.ads.internal.zzg
    public final void zzb() {
    }

    @Override // com.google.android.gms.ads.internal.zzg
    public final void zzc() {
    }
}
