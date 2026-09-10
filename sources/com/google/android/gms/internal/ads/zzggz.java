package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes4.dex */
public final class zzggz implements zzijg {
    private final zzijp zza;
    private final zzijp zzb;
    private final zzijp zzc;
    private final zzijp zzd;

    private zzggz(zzijp zzijpVar, zzijp zzijpVar2, zzijp zzijpVar3, zzijp zzijpVar4) {
        this.zza = zzijpVar;
        this.zzb = zzijpVar2;
        this.zzc = zzijpVar3;
        this.zzd = zzijpVar4;
    }

    public static zzggz zza(zzijp zzijpVar, zzijp zzijpVar2, zzijp zzijpVar3, zzijp zzijpVar4) {
        return new zzggz(zzijpVar, zzijpVar2, zzijpVar3, zzijpVar4);
    }

    @Override // com.google.android.gms.internal.ads.zzijv, com.google.android.gms.internal.ads.zziju
    public final /* bridge */ /* synthetic */ Object zzb() {
        zzijp zzijpVar = this.zzd;
        zzijp zzijpVar2 = this.zzc;
        zzijp zzijpVar3 = this.zzb;
        zzija zzijaVarZzc = zzijf.zzc(this.zza);
        zzija zzijaVarZzc2 = zzijf.zzc(zzijpVar3);
        zzija zzijaVarZzc3 = zzijf.zzc(zzijpVar2);
        zzgad zzgadVar = (zzgad) zzijpVar.zzb();
        return new zzggy(zzijaVarZzc, zzijaVarZzc2, zzijaVarZzc3, zzgadVar.zzi().zza(), zzgadVar.zzi().zzd());
    }
}
