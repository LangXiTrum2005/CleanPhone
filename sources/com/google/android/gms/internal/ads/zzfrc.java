package com.google.android.gms.internal.ads;

import java.util.Objects;

/* JADX INFO: loaded from: classes4.dex */
final class zzfrc extends zzcal {
    final /* synthetic */ zzgzf zza;
    final /* synthetic */ zzcaf zzb;
    final /* synthetic */ zzfrd zzc;

    public zzfrc(zzfrd zzfrdVar, zzgzf zzgzfVar, zzcaf zzcafVar) {
        this.zza = zzgzfVar;
        this.zzb = zzcafVar;
        Objects.requireNonNull(zzfrdVar);
        this.zzc = zzfrdVar;
    }

    @Override // com.google.android.gms.internal.ads.zzcam
    public final void zze() {
        Objects.requireNonNull(this.zzc);
        zzfpr.zza(this.zzb, this.zza);
    }

    @Override // com.google.android.gms.internal.ads.zzcam
    public final void zzf(int i2) {
    }

    @Override // com.google.android.gms.internal.ads.zzcam
    public final void zzg(com.google.android.gms.ads.internal.client.zze zzeVar) {
        String string = zzeVar.zzb().toString();
        zzfrd zzfrdVar = this.zzc;
        String str = zzfrdVar.zze.zza;
        StringBuilder sb = new StringBuilder(String.valueOf(string).length() + 51 + String.valueOf(str).length());
        sb.append("Failed to load rewarded ad with error: ");
        sb.append(string);
        sb.append(", adUnitId: ");
        sb.append(str);
        com.google.android.gms.ads.internal.util.client.zzo.zzi(sb.toString());
        zzfrdVar.zzB(zzeVar);
    }
}
