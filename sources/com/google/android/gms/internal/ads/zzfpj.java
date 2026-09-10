package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes4.dex */
public final class zzfpj implements zzijg {
    private final zzijp zza;
    private final zzijp zzb;
    private final zzijp zzc;
    private final zzijp zzd;
    private final zzijp zze;
    private final zzijp zzf;

    private zzfpj(zzijp zzijpVar, zzijp zzijpVar2, zzijp zzijpVar3, zzijp zzijpVar4, zzijp zzijpVar5, zzijp zzijpVar6, zzijp zzijpVar7) {
        this.zza = zzijpVar;
        this.zzb = zzijpVar3;
        this.zzc = zzijpVar4;
        this.zzd = zzijpVar5;
        this.zze = zzijpVar6;
        this.zzf = zzijpVar7;
    }

    public static zzfpj zza(zzijp zzijpVar, zzijp zzijpVar2, zzijp zzijpVar3, zzijp zzijpVar4, zzijp zzijpVar5, zzijp zzijpVar6, zzijp zzijpVar7) {
        return new zzfpj(zzijpVar, zzijpVar2, zzijpVar3, zzijpVar4, zzijpVar5, zzijpVar6, zzijpVar7);
    }

    @Override // com.google.android.gms.internal.ads.zzijv, com.google.android.gms.internal.ads.zziju
    public final /* bridge */ /* synthetic */ Object zzb() {
        return new zzfpi(((zzclp) this.zza).zza(), zzflk.zzc(), (zzgyx) this.zzb.zzb(), (com.google.android.gms.ads.internal.util.client.zzu) this.zzc.zzb(), (zzfpa) this.zzd.zzb(), (zzfnr) this.zze.zzb(), (zzcld) this.zzf.zzb());
    }
}
