package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes3.dex */
final class zzbnh implements zzcaf {
    final /* synthetic */ zzbnr zza;
    final /* synthetic */ zzfgw zzb;
    final /* synthetic */ zzbns zzc;

    public zzbnh(zzbns zzbnsVar, zzbnr zzbnrVar, zzfgw zzfgwVar) {
        this.zza = zzbnrVar;
        this.zzb = zzfgwVar;
        this.zzc = zzbnsVar;
    }

    @Override // com.google.android.gms.internal.ads.zzcaf
    public final /* bridge */ /* synthetic */ void zza(Object obj) {
        com.google.android.gms.ads.internal.util.zze.zza("loadNewJavascriptEngine (success): Trying to acquire lock");
        synchronized (this.zzc.zza) {
            try {
                com.google.android.gms.ads.internal.util.zze.zza("loadNewJavascriptEngine (success): Lock acquired");
                this.zzc.zzi = 0;
                zzbns zzbnsVar = this.zzc;
                if (zzbnsVar.zzh != null && this.zza != zzbnsVar.zzh) {
                    com.google.android.gms.ads.internal.util.zze.zza("New JS engine is loaded, marking previous one as destroyable.");
                    this.zzc.zzh.zzb();
                }
                this.zzc.zzh = this.zza;
                if (((Boolean) zzbee.zzd.zze()).booleanValue()) {
                    zzbns zzbnsVar2 = this.zzc;
                    if (zzbnsVar2.zze != null) {
                        zzfhk zzfhkVar = zzbnsVar2.zze;
                        zzfgw zzfgwVar = this.zzb;
                        zzfgwVar.zzg(true);
                        zzfhkVar.zzb(zzfgwVar.zzm());
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        com.google.android.gms.ads.internal.util.zze.zza("loadNewJavascriptEngine (success): Lock released");
    }
}
