package com.google.android.gms.internal.ads;

import java.util.Objects;

/* JADX INFO: loaded from: classes4.dex */
public final class zzdsk {
    private final zzdai zza;
    private final zzdbr zzb;
    private final zzdce zzc;
    private final zzdcv zzd;
    private final zzdfo zze;
    private final zzfhr zzf;
    private final zzfhu zzg;
    private final zzcra zzh;

    public zzdsk(zzdai zzdaiVar, zzdbr zzdbrVar, zzdce zzdceVar, zzdcv zzdcvVar, zzdfo zzdfoVar, zzfhr zzfhrVar, zzfhu zzfhuVar, zzcra zzcraVar) {
        this.zza = zzdaiVar;
        this.zzb = zzdbrVar;
        this.zzc = zzdceVar;
        this.zzd = zzdcvVar;
        this.zze = zzdfoVar;
        this.zzf = zzfhrVar;
        this.zzg = zzfhuVar;
        this.zzh = zzcraVar;
    }

    public final void zza(zzdsp zzdspVar) {
        final zzdbr zzdbrVar = this.zzb;
        zzdsd zzdsdVarZzk = zzdspVar.zzk();
        Objects.requireNonNull(zzdbrVar);
        zzdsdVarZzk.zzm(this.zza, this.zzc, this.zzd, this.zze, new com.google.android.gms.ads.internal.overlay.zzad() { // from class: com.google.android.gms.internal.ads.zzdsj
            @Override // com.google.android.gms.ads.internal.overlay.zzad
            public final /* synthetic */ void zzl() {
                zzdbrVar.zzb();
            }
        });
        zzdspVar.zzg(this.zzf, this.zzg, this.zzh);
    }
}
