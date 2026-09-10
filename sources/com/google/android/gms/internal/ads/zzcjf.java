package com.google.android.gms.internal.ads;

import android.content.Context;

/* JADX INFO: loaded from: classes3.dex */
final class zzcjf implements zzfbi {
    private final zzcih zza;
    private final zzhfa zzb;
    private final zzhfa zzc;
    private final zzhfa zzd;
    private final zzhfa zze;
    private final zzhfa zzf;
    private final zzhfa zzg;
    private final zzhfa zzh;
    private final zzhfa zzi;

    public /* synthetic */ zzcjf(zzcih zzcihVar, Context context, String str, zzcjm zzcjmVar) {
        this.zza = zzcihVar;
        zzher zzherVarZza = zzhes.zza(context);
        this.zzb = zzherVarZza;
        zzezi zzeziVar = new zzezi(zzherVarZza, zzcihVar.zzbh, zzcihVar.zzbi);
        this.zzc = zzeziVar;
        zzhfa zzhfaVarZzc = zzheq.zzc(new zzfas(zzcihVar.zzbh));
        this.zzd = zzhfaVarZzc;
        zzhfa zzhfaVarZzc2 = zzheq.zzc(zzfcg.zza());
        this.zze = zzhfaVarZzc2;
        zzhfa zzhfaVarZzc3 = zzheq.zzc(new zzfbc(zzherVarZza, zzcihVar.zzc, zzcihVar.zzS, zzeziVar, zzhfaVarZzc, zzfcl.zza(), zzhfaVarZzc2));
        this.zzf = zzhfaVarZzc3;
        this.zzg = zzheq.zzc(new zzfbm(zzhfaVarZzc3, zzhfaVarZzc, zzhfaVarZzc2));
        zzher zzherVarZzc = zzhes.zzc(str);
        this.zzh = zzherVarZzc;
        this.zzi = zzheq.zzc(new zzfbg(zzherVarZzc, zzhfaVarZzc3, zzherVarZza, zzhfaVarZzc, zzhfaVarZzc2, zzcihVar.zzl, zzcihVar.zzU, zzcihVar.zzM));
    }

    @Override // com.google.android.gms.internal.ads.zzfbi
    public final zzfbf zza() {
        return (zzfbf) this.zzi.zzb();
    }

    @Override // com.google.android.gms.internal.ads.zzfbi
    public final zzfbl zzb() {
        return (zzfbl) this.zzg.zzb();
    }
}
