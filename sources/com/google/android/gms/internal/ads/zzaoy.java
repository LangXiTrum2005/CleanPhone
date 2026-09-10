package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes4.dex */
public final class zzaoy implements zzapg {
    private zzv zza;
    private zzfg zzb;
    private zzaga zzc;

    public zzaoy(String str, String str2) {
        zzt zztVar = new zzt();
        zztVar.zzl("video/mp2t");
        zztVar.zzm(str);
        this.zza = zztVar.zzM();
    }

    @Override // com.google.android.gms.internal.ads.zzapg
    public final void zza(zzfg zzfgVar, zzaer zzaerVar, zzapu zzapuVar) {
        this.zzb = zzfgVar;
        zzapuVar.zza();
        zzaga zzagaVarZzu = zzaerVar.zzu(zzapuVar.zzb(), 5);
        this.zzc = zzagaVarZzu;
        zzagaVarZzu.zzu(this.zza);
    }

    @Override // com.google.android.gms.internal.ads.zzapg
    public final void zzb(zzer zzerVar) {
        this.zzb.getClass();
        String str = zzfj.zza;
        long jZzb = this.zzb.zzb();
        long jZzc = this.zzb.zzc();
        if (jZzb == -9223372036854775807L || jZzc == -9223372036854775807L) {
            return;
        }
        zzv zzvVar = this.zza;
        if (jZzc != zzvVar.zzt) {
            zzt zztVarZza = zzvVar.zza();
            zztVarZza.zzr(jZzc);
            zzv zzvVarZzM = zztVarZza.zzM();
            this.zza = zzvVarZzM;
            this.zzc.zzu(zzvVarZzM);
        }
        int iZzd = zzerVar.zzd();
        this.zzc.zzz(zzerVar, iZzd);
        this.zzc.zzx(jZzb, 1, iZzd, 0, null);
    }
}
