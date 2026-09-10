package com.google.android.gms.internal.ads;

import android.content.Context;

/* JADX INFO: loaded from: classes3.dex */
final class zzcjd implements zzezu {
    private final zzcih zza;
    private final zzhfa zzb;
    private final zzhfa zzc;
    private final zzhfa zzd;
    private final zzhfa zze;
    private final zzhfa zzf;
    private final zzhfa zzg;
    private final zzhfa zzh;

    public /* synthetic */ zzcjd(zzcih zzcihVar, Context context, String str, com.google.android.gms.ads.internal.client.zzs zzsVar, zzcjm zzcjmVar) {
        this.zza = zzcihVar;
        zzher zzherVarZza = zzhes.zza(context);
        this.zzb = zzherVarZza;
        zzher zzherVarZza2 = zzhes.zza(zzsVar);
        this.zzc = zzherVarZza2;
        zzher zzherVarZza3 = zzhes.zza(str);
        this.zzd = zzherVarZza3;
        zzhfa zzhfaVarZzc = zzheq.zzc(new zzeko(zzcihVar.zzM));
        this.zze = zzhfaVarZzc;
        zzhfa zzhfaVarZzc2 = zzheq.zzc(new zzfas(zzcihVar.zzbh));
        this.zzf = zzhfaVarZzc2;
        zzhfa zzhfaVarZzc3 = zzheq.zzc(new zzezs(zzherVarZza, zzcihVar.zzc, zzcihVar.zzS, zzhfaVarZzc, zzhfaVarZzc2, zzfcl.zza()));
        this.zzg = zzhfaVarZzc3;
        this.zzh = zzheq.zzc(new zzekw(zzherVarZza, zzherVarZza2, zzherVarZza3, zzhfaVarZzc3, zzhfaVarZzc, zzhfaVarZzc2, zzcihVar.zzl, zzcihVar.zzU, zzcihVar.zzM));
    }

    @Override // com.google.android.gms.internal.ads.zzezu
    public final zzekv zza() {
        return (zzekv) this.zzh.zzb();
    }
}
