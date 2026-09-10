package com.google.android.gms.internal.ads;

import android.content.Context;

/* JADX INFO: loaded from: classes3.dex */
final class zzciy implements zzdth {
    private final Context zza;
    private final zzbko zzb;
    private final zzcih zzc;
    private final zzciy zzd = this;
    private final zzhfa zze;
    private final zzhfa zzf;
    private final zzhfa zzg;
    private final zzhfa zzh;

    public /* synthetic */ zzciy(zzcih zzcihVar, Context context, zzbko zzbkoVar, zzcjm zzcjmVar) {
        this.zzc = zzcihVar;
        this.zza = context;
        this.zzb = zzbkoVar;
        zzher zzherVarZza = zzhes.zza(this);
        this.zze = zzherVarZza;
        zzher zzherVarZza2 = zzhes.zza(zzbkoVar);
        this.zzf = zzherVarZza2;
        zzdtd zzdtdVar = new zzdtd(zzherVarZza2);
        this.zzg = zzdtdVar;
        this.zzh = zzheq.zzc(new zzdtf(zzherVarZza, zzdtdVar));
    }

    @Override // com.google.android.gms.internal.ads.zzdth
    public final zzdsy zzb() {
        return new zzciv(this.zzc, this.zzd, null);
    }

    @Override // com.google.android.gms.internal.ads.zzdth
    public final zzdte zzd() {
        return (zzdte) this.zzh.zzb();
    }
}
