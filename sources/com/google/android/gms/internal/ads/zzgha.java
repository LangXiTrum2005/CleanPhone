package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes4.dex */
public final class zzgha implements zzijg {
    private final zzijp zza;
    private final zzijp zzb;
    private final zzijp zzc;
    private final zzijp zzd;
    private final zzijp zze;
    private final zzijp zzf;

    private zzgha(zzijp zzijpVar, zzijp zzijpVar2, zzijp zzijpVar3, zzijp zzijpVar4, zzijp zzijpVar5, zzijp zzijpVar6) {
        this.zza = zzijpVar;
        this.zzb = zzijpVar2;
        this.zzc = zzijpVar3;
        this.zzd = zzijpVar4;
        this.zze = zzijpVar5;
        this.zzf = zzijpVar6;
    }

    public static zzgha zza(zzijp zzijpVar, zzijp zzijpVar2, zzijp zzijpVar3, zzijp zzijpVar4, zzijp zzijpVar5, zzijp zzijpVar6) {
        return new zzgha(zzijpVar, zzijpVar2, zzijpVar3, zzijpVar4, zzijpVar5, zzijpVar6);
    }

    @Override // com.google.android.gms.internal.ads.zzijv, com.google.android.gms.internal.ads.zziju
    public final /* bridge */ /* synthetic */ Object zzb() {
        zzgls zzglsVar = (zzgls) this.zza.zzb();
        zzgje zzgjeVar = (zzgje) this.zzb.zzb();
        zzgjv zzgjvVar = (zzgjv) this.zzc.zzb();
        zzgnc zzgncVar = (zzgnc) this.zzd.zzb();
        zzgbj zzgbjVar = (zzgbj) this.zze.zzb();
        zzgad zzgadVar = (zzgad) this.zzf.zzb();
        return new zzghq(zzglsVar, zzgjeVar, zzgjvVar, zzgncVar, zzgbjVar, zzgadVar.zzi().zze(), zzgadVar.zzi().zzg(), zzgadVar.zzi().zzh());
    }
}
