package com.google.android.gms.internal.ads;

import java.util.Objects;

/* JADX INFO: loaded from: classes4.dex */
final class zzfpz extends com.google.android.gms.ads.internal.client.zzbm {
    final /* synthetic */ zzgzf zza;
    final /* synthetic */ com.google.android.gms.ads.internal.client.zzbx zzb;
    final /* synthetic */ zzfqa zzc;

    public zzfpz(zzfqa zzfqaVar, zzgzf zzgzfVar, com.google.android.gms.ads.internal.client.zzbx zzbxVar) {
        this.zza = zzgzfVar;
        this.zzb = zzbxVar;
        Objects.requireNonNull(zzfqaVar);
        this.zzc = zzfqaVar;
    }

    @Override // com.google.android.gms.ads.internal.client.zzbn
    public final void zzb() {
        Objects.requireNonNull(this.zzc);
        zzfpr.zza(this.zzb, this.zza);
    }

    @Override // com.google.android.gms.ads.internal.client.zzbn
    public final void zzc(com.google.android.gms.ads.internal.client.zze zzeVar) {
        String string = zzeVar.zzb().toString();
        zzfqa zzfqaVar = this.zzc;
        String str = zzfqaVar.zze.zza;
        StringBuilder sb = new StringBuilder(String.valueOf(string).length() + 57 + String.valueOf(str).length());
        sb.append("Failed to load interstitial ad with error: ");
        sb.append(string);
        sb.append(" for ad unit: ");
        sb.append(str);
        com.google.android.gms.ads.internal.util.client.zzo.zzi(sb.toString());
        zzfqaVar.zzB(zzeVar);
    }
}
