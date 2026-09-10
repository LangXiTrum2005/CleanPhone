package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes4.dex */
public final class zzcue implements zzdbe {
    private final zzcir zza;
    private final zzdxe zzb;
    private final zzfhr zzc;

    public zzcue(zzcir zzcirVar, zzdxe zzdxeVar, zzfhr zzfhrVar) {
        this.zza = zzcirVar;
        this.zzb = zzdxeVar;
        this.zzc = zzfhrVar;
    }

    @Override // com.google.android.gms.internal.ads.zzdbe
    public final void zzdr() {
        zzcir zzcirVar;
        if (!((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbgk.zzon)).booleanValue() || (zzcirVar = this.zza) == null) {
            return;
        }
        String str = true != com.google.android.gms.ads.internal.util.zzab.zza(zzcirVar.zzE()) ? "0" : "1";
        zzdxd zzdxdVarZza = this.zzb.zza();
        zzdxdVarZza.zzc("action", "hcp");
        zzdxdVarZza.zzc("hcp", str);
        zzdxdVarZza.zzb(this.zzc);
        zzdxdVarZza.zzd();
    }
}
