package com.google.android.gms.internal.ads;

import com.google.android.gms.common.util.Clock;

/* JADX INFO: loaded from: classes4.dex */
final class zzcbn {
    private final com.google.android.gms.ads.internal.util.zzg zza;

    public zzcbn(Clock clock, com.google.android.gms.ads.internal.util.zzg zzgVar, zzcbw zzcbwVar) {
        this.zza = zzgVar;
    }

    public final void zza(int i2, long j) {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbgk.zzaY)).booleanValue()) {
            return;
        }
        com.google.android.gms.ads.internal.util.zzg zzgVar = this.zza;
        if (j - zzgVar.zzF() < 0) {
            com.google.android.gms.ads.internal.util.zze.zza("Receiving npa decision in the past, ignoring.");
            return;
        }
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbgk.zzaZ)).booleanValue()) {
            zzgVar.zzE(i2);
            zzgVar.zzG(j);
        } else {
            zzgVar.zzE(-1);
            zzgVar.zzG(j);
        }
    }
}
