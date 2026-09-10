package com.google.android.gms.internal.ads;

import java.util.Objects;

/* JADX INFO: loaded from: classes4.dex */
final class zzfpw extends zzbef {
    final /* synthetic */ zzgzf zza;
    final /* synthetic */ com.google.android.gms.ads.internal.client.zzft zzb;
    final /* synthetic */ zzfpx zzc;

    public zzfpw(zzfpx zzfpxVar, zzgzf zzgzfVar, com.google.android.gms.ads.internal.client.zzft zzftVar) {
        this.zza = zzgzfVar;
        this.zzb = zzftVar;
        Objects.requireNonNull(zzfpxVar);
        this.zzc = zzfpxVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbeg
    public final void zzb(zzbed zzbedVar) {
        Objects.requireNonNull(this.zzc);
        zzfpr.zza(zzbedVar, this.zza);
    }

    @Override // com.google.android.gms.internal.ads.zzbeg
    public final void zzc(int i2) {
    }

    @Override // com.google.android.gms.internal.ads.zzbeg
    public final void zzd(com.google.android.gms.ads.internal.client.zze zzeVar) {
        String string = zzeVar.zzb().toString();
        String str = this.zzb.zza;
        StringBuilder sb = new StringBuilder(String.valueOf(string).length() + 60 + String.valueOf(str).length());
        sb.append("Failed to load app open ad with error parcel: ");
        sb.append(string);
        sb.append(" for ad unit: ");
        sb.append(str);
        com.google.android.gms.ads.internal.util.client.zzo.zzi(sb.toString());
        zzfpx zzfpxVar = this.zzc;
        Objects.requireNonNull(zzfpxVar);
        zzfpxVar.zzB(zzeVar);
    }
}
