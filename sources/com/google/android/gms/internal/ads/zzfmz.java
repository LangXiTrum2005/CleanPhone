package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes4.dex */
public final class zzfmz implements zzijg {
    private final zzijp zza;
    private final zzijp zzb;
    private final zzijp zzc;

    private zzfmz(zzfmy zzfmyVar, zzijp zzijpVar, zzijp zzijpVar2, zzijp zzijpVar3) {
        this.zza = zzijpVar;
        this.zzb = zzijpVar2;
        this.zzc = zzijpVar3;
    }

    public static zzfmz zza(zzfmy zzfmyVar, zzijp zzijpVar, zzijp zzijpVar2, zzijp zzijpVar3) {
        return new zzfmz(zzfmyVar, zzijpVar, zzijpVar2, zzijpVar3);
    }

    @Override // com.google.android.gms.internal.ads.zzijv, com.google.android.gms.internal.ads.zziju
    public final /* bridge */ /* synthetic */ Object zzb() {
        zzbsf zzbsfVarZzb = new zzbrw().zzb(((zzclp) this.zza).zza(), ((zzcmg) this.zzb).zza(), (zzfnr) this.zzc.zzb());
        zzijo.zzb(zzbsfVarZzb);
        return zzbsfVarZzb;
    }
}
