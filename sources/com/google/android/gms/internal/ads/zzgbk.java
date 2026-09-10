package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes4.dex */
public final class zzgbk implements zzijg {
    private final zzijp zza;
    private final zzijp zzb;
    private final zzijp zzc;

    private zzgbk(zzijp zzijpVar, zzijp zzijpVar2, zzijp zzijpVar3) {
        this.zza = zzijpVar;
        this.zzb = zzijpVar2;
        this.zzc = zzijpVar3;
    }

    public static zzgbk zza(zzijp zzijpVar, zzijp zzijpVar2, zzijp zzijpVar3) {
        return new zzgbk(zzijpVar, zzijpVar2, zzijpVar3);
    }

    @Override // com.google.android.gms.internal.ads.zzijv, com.google.android.gms.internal.ads.zziju
    public final /* bridge */ /* synthetic */ Object zzb() {
        zzgbj zzgbjVar = ((zzgad) this.zzc.zzb()).zzt() ? (zzgbj) zzijf.zzc(this.zza).zzb() : (zzgbj) zzijf.zzc(this.zzb).zzb();
        zzijo.zzb(zzgbjVar);
        return zzgbjVar;
    }
}
