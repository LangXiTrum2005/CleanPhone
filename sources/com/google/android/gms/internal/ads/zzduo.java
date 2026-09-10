package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes4.dex */
public final class zzduo {
    private final zzdxe zza;

    public zzduo(zzdxe zzdxeVar) {
        this.zza = zzdxeVar;
    }

    public final boolean zza(zzfxs zzfxsVar) {
        if (zzfxsVar.zzj()) {
            zzdxd zzdxdVarZza = this.zza.zza();
            zzdxdVarZza.zzc("action", "aq_ad_closed");
            zzdxdVarZza.zzc("gqi", zzfxsVar.zza());
            zzdxdVarZza.zzc("aq_ad_duration", String.valueOf(zzfxsVar.zzb()));
            zzdxdVarZza.zzc("aq_ad_bounce_cnt", String.valueOf(zzfxsVar.zzc()));
            zzdxdVarZza.zzc("aq_time_away", String.valueOf(zzfxsVar.zzg()));
            return zzdxdVarZza.zze().equals(com.google.android.gms.ads.internal.util.client.zzt.SUCCESS);
        }
        zzdxd zzdxdVarZza2 = this.zza.zza();
        zzdxdVarZza2.zzc("action", "aq_ad_kill");
        zzdxdVarZza2.zzc("gqi", zzfxsVar.zza());
        zzdxdVarZza2.zzc("aq_ad_duration", String.valueOf(zzfxsVar.zzb()));
        zzdxdVarZza2.zzc("aq_ad_bounce_cnt", String.valueOf(zzfxsVar.zzc()));
        zzdxdVarZza2.zzc("aq_time_away", String.valueOf(zzfxsVar.zzg()));
        zzdxdVarZza2.zzc("aq_is_os_kill", String.valueOf(zzfxsVar.zze()));
        return zzdxdVarZza2.zze().equals(com.google.android.gms.ads.internal.util.client.zzt.SUCCESS);
    }
}
