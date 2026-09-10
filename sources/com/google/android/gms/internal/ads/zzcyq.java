package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes4.dex */
public final class zzcyq implements zzijg {
    private final zzijp zza;
    private final zzijp zzb;
    private final zzijp zzc;
    private final zzijp zzd;
    private final zzijp zze;
    private final zzijp zzf;
    private final zzijp zzg;

    private zzcyq(zzijp zzijpVar, zzijp zzijpVar2, zzijp zzijpVar3, zzijp zzijpVar4, zzijp zzijpVar5, zzijp zzijpVar6, zzijp zzijpVar7) {
        this.zza = zzijpVar;
        this.zzb = zzijpVar2;
        this.zzc = zzijpVar3;
        this.zzd = zzijpVar4;
        this.zze = zzijpVar5;
        this.zzf = zzijpVar6;
        this.zzg = zzijpVar7;
    }

    public static zzcyq zza(zzijp zzijpVar, zzijp zzijpVar2, zzijp zzijpVar3, zzijp zzijpVar4, zzijp zzijpVar5, zzijp zzijpVar6, zzijp zzijpVar7) {
        return new zzcyq(zzijpVar, zzijpVar2, zzijpVar3, zzijpVar4, zzijpVar5, zzijpVar6, zzijpVar7);
    }

    @Override // com.google.android.gms.internal.ads.zzijv, com.google.android.gms.internal.ads.zziju
    public final /* bridge */ /* synthetic */ Object zzb() {
        return new zzcyp(((zzclp) this.zza).zza(), ((zzdab) this.zzb).zza(), ((zzcmg) this.zzc).zza(), ((zzclj) this.zzd).zzb(), (zzdzp) this.zze.zzb(), (zzfnr) this.zzf.zzb(), (zzeak) this.zzg.zzb());
    }
}
