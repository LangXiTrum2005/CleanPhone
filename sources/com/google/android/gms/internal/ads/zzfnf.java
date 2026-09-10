package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes4.dex */
public final class zzfnf implements zzijg {
    private final zzijp zza;
    private final zzijp zzb;
    private final zzijp zzc;
    private final zzijp zzd;

    private zzfnf(zzijp zzijpVar, zzijp zzijpVar2, zzijp zzijpVar3, zzijp zzijpVar4, zzijp zzijpVar5, zzijp zzijpVar6) {
        this.zza = zzijpVar;
        this.zzb = zzijpVar2;
        this.zzc = zzijpVar3;
        this.zzd = zzijpVar6;
    }

    public static zzfnf zza(zzijp zzijpVar, zzijp zzijpVar2, zzijp zzijpVar3, zzijp zzijpVar4, zzijp zzijpVar5, zzijp zzijpVar6) {
        return new zzfnf(zzijpVar, zzijpVar2, zzijpVar3, zzijpVar4, zzijpVar5, zzijpVar6);
    }

    @Override // com.google.android.gms.internal.ads.zzijv, com.google.android.gms.internal.ads.zziju
    public final /* bridge */ /* synthetic */ Object zzb() {
        return new zzfnr(((zzclp) this.zza).zza(), ((zzcmg) this.zzb).zza(), (zzdur) this.zzc.zzb(), zzcmn.zza(), zzcmq.zza(), (zzcld) this.zzd.zzb());
    }
}
