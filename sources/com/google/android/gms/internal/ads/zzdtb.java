package com.google.android.gms.internal.ads;

import javax.annotation.ParametersAreNonnullByDefault;

/* JADX INFO: loaded from: classes4.dex */
public final class zzdtb implements zzbof {
    private final zzdbr zza;
    private final zzbzy zzb;
    private final String zzc;
    private final String zzd;

    public zzdtb(zzdbr zzdbrVar, zzfhr zzfhrVar) {
        this.zza = zzdbrVar;
        this.zzb = zzfhrVar.zzl;
        this.zzc = zzfhrVar.zzj;
        this.zzd = zzfhrVar.zzk;
    }

    @Override // com.google.android.gms.internal.ads.zzbof
    public final void zza() {
        this.zza.zzd();
    }

    @Override // com.google.android.gms.internal.ads.zzbof
    @ParametersAreNonnullByDefault
    public final void zzb(zzbzy zzbzyVar) {
        int i2;
        String str;
        zzbzy zzbzyVar2 = this.zzb;
        if (zzbzyVar2 != null) {
            zzbzyVar = zzbzyVar2;
        }
        if (zzbzyVar != null) {
            str = zzbzyVar.zza;
            i2 = zzbzyVar.zzb;
        } else {
            i2 = 1;
            str = "";
        }
        this.zza.zze(new zzbzj(str, i2), this.zzc, this.zzd);
    }

    @Override // com.google.android.gms.internal.ads.zzbof
    public final void zzc() {
        this.zza.zzf();
    }
}
