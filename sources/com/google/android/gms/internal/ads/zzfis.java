package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes4.dex */
final class zzfis implements zzgyj {
    final /* synthetic */ zzcir zza;
    final /* synthetic */ zzcra zzb;
    final /* synthetic */ zzfpi zzc;
    final /* synthetic */ zzehu zzd;

    public zzfis(zzcir zzcirVar, zzcra zzcraVar, zzfpi zzfpiVar, zzehu zzehuVar) {
        this.zza = zzcirVar;
        this.zzb = zzcraVar;
        this.zzc = zzfpiVar;
        this.zzd = zzehuVar;
    }

    @Override // com.google.android.gms.internal.ads.zzgyj
    public final void zza(Throwable th) {
    }

    @Override // com.google.android.gms.internal.ads.zzgyj
    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        zzcra zzcraVar;
        String str = (String) obj;
        zzcir zzcirVar = this.zza;
        zzfhr zzfhrVarZzC = zzcirVar.zzC();
        if (zzfhrVarZzC != null && !zzfhrVarZzC.zzai) {
            com.google.android.gms.ads.internal.util.client.zzv zzvVar = zzfhrVarZzC.zzax;
            if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbgk.zzlt)).booleanValue() && (zzcraVar = this.zzb) != null && zzcra.zzc(str)) {
                zzcraVar.zza(str, this.zzc, com.google.android.gms.ads.internal.client.zzbb.zzh(), zzvVar);
                return;
            } else {
                this.zzc.zzb(str, zzvVar, null, null);
                return;
            }
        }
        zzfhu zzfhuVarZzaC = zzcirVar.zzaC();
        if (zzfhuVarZzaC == null) {
            com.google.android.gms.ads.internal.zzt.zzh().zzg(new IllegalArgumentException("Common configuration cannot be null"), "BufferingGmsgHandlers.getBufferingClickGmsgHandler");
            return;
        }
        long jCurrentTimeMillis = com.google.android.gms.ads.internal.zzt.zzk().currentTimeMillis();
        boolean zZzs = com.google.android.gms.ads.internal.zzt.zzh().zzs(zzcirVar.getContext());
        boolean z2 = false;
        boolean z3 = ((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbgk.zzhc)).booleanValue() && zzfhrVarZzC != null && zzfhrVarZzC.zzS;
        if (zzfhrVarZzC != null && zzfhrVarZzC.zzad != null) {
            z2 = true;
        }
        this.zzd.zze(new zzehw(jCurrentTimeMillis, zzfhuVarZzaC.zzb, str, (zZzs || z3 || z2) ? 2 : 1));
    }
}
