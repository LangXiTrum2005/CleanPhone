package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes4.dex */
public final class zzgkj implements zzijg {
    private final zzijp zza;
    private final zzijp zzb;
    private final zzijp zzc;

    private zzgkj(zzijp zzijpVar, zzijp zzijpVar2, zzijp zzijpVar3) {
        this.zza = zzijpVar;
        this.zzb = zzijpVar2;
        this.zzc = zzijpVar3;
    }

    public static zzgkj zza(zzijp zzijpVar, zzijp zzijpVar2, zzijp zzijpVar3) {
        return new zzgkj(zzijpVar, zzijpVar2, zzijpVar3);
    }

    @Override // com.google.android.gms.internal.ads.zzijv, com.google.android.gms.internal.ads.zziju
    public final /* bridge */ /* synthetic */ Object zzb() {
        zzijp zzijpVar = this.zzc;
        zzijp zzijpVar2 = this.zzb;
        zzija zzijaVarZzc = zzijf.zzc(this.zza);
        zzija zzijaVarZzc2 = zzijf.zzc(zzijpVar2);
        if (true == ((zzgad) zzijpVar.zzb()).zzs()) {
            zzijaVarZzc = zzijaVarZzc2;
        }
        zzgjw zzgjwVar = (zzgjw) zzijaVarZzc.zzb();
        zzijo.zzb(zzgjwVar);
        return zzgjwVar;
    }
}
