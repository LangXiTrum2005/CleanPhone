package com.google.android.gms.internal.ads;

import java.util.Objects;

/* JADX INFO: loaded from: classes4.dex */
final class zzdsi implements zzgyj {
    final /* synthetic */ zzfhr zza;
    final /* synthetic */ zzfhu zzb;
    final /* synthetic */ zzcra zzc;
    final /* synthetic */ zzdsp zzd;

    public zzdsi(zzdsp zzdspVar, zzfhr zzfhrVar, zzfhu zzfhuVar, zzcra zzcraVar) {
        this.zza = zzfhrVar;
        this.zzb = zzfhuVar;
        this.zzc = zzcraVar;
        Objects.requireNonNull(zzdspVar);
        this.zzd = zzdspVar;
    }

    @Override // com.google.android.gms.internal.ads.zzgyj
    public final void zza(Throwable th) {
    }

    @Override // com.google.android.gms.internal.ads.zzgyj
    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        zzcir zzcirVar = (zzcir) obj;
        zzfhr zzfhrVar = this.zza;
        zzcirVar.zzaD(zzfhrVar, this.zzb);
        zzckp zzckpVarZzP = zzcirVar.zzP();
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbgk.zzlx)).booleanValue() && zzckpVarZzP != null) {
            zzcra zzcraVar = this.zzc;
            zzdsp zzdspVar = this.zzd;
            zzckpVarZzP.zzd(zzcraVar, zzdspVar.zzm(), zzdspVar.zzn());
            zzckpVarZzP.zze(zzcraVar, zzdspVar.zzm(), zzdspVar.zzl());
        }
        if (!((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbgk.zzot)).booleanValue() || zzckpVarZzP == null) {
            return;
        }
        zzckpVarZzP.zzb(zzfhrVar);
    }
}
