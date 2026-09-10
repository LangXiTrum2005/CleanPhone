package com.google.android.gms.internal.ads;

import java.util.Objects;

/* JADX INFO: loaded from: classes4.dex */
public final class zzdsu {
    private final zzdai zza;
    private final zzdbr zzb;
    private final zzdce zzc;
    private final zzdcv zzd;
    private final zzdfo zze;
    private final zzdip zzf;
    private final zzdxe zzg;
    private final zzfpi zzh;
    private final zzehu zzi;
    private final zzcra zzj;

    public zzdsu(zzdai zzdaiVar, zzdbr zzdbrVar, zzdce zzdceVar, zzdcv zzdcvVar, zzdfo zzdfoVar, zzdip zzdipVar, zzdxe zzdxeVar, zzfpi zzfpiVar, zzehu zzehuVar, zzcra zzcraVar) {
        this.zza = zzdaiVar;
        this.zzb = zzdbrVar;
        this.zzc = zzdceVar;
        this.zzd = zzdcvVar;
        this.zze = zzdfoVar;
        this.zzf = zzdipVar;
        this.zzg = zzdxeVar;
        this.zzh = zzfpiVar;
        this.zzi = zzehuVar;
        this.zzj = zzcraVar;
    }

    public final void zza(zzdsv zzdsvVar, zzcir zzcirVar) throws Throwable {
        zzdss zzdssVarZzb = zzdsvVar.zzb();
        final zzdbr zzdbrVar = this.zzb;
        Objects.requireNonNull(zzdbrVar);
        zzdssVarZzb.zzn(this.zza, this.zzc, this.zzd, this.zze, new com.google.android.gms.ads.internal.overlay.zzad() { // from class: com.google.android.gms.internal.ads.zzdst
            @Override // com.google.android.gms.ads.internal.overlay.zzad
            public final /* synthetic */ void zzl() {
                zzdbrVar.zzb();
            }
        }, this.zzf);
        if (!((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbgk.zzlz)).booleanValue() || zzcirVar == null || zzcirVar.zzP() == null) {
            return;
        }
        zzckp zzckpVarZzP = zzcirVar.zzP();
        zzcra zzcraVar = this.zzj;
        zzehu zzehuVar = this.zzi;
        zzckpVarZzP.zzd(zzcraVar, zzehuVar, this.zzh);
        zzckpVarZzP.zze(zzcraVar, zzehuVar, this.zzg);
    }
}
