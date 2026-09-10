package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes4.dex */
public final class zzesu implements zzijg {
    private final zzijp zza;
    private final zzijp zzb;
    private final zzijp zzc;

    private zzesu(zzijp zzijpVar, zzijp zzijpVar2, zzijp zzijpVar3, zzijp zzijpVar4) {
        this.zza = zzijpVar2;
        this.zzb = zzijpVar3;
        this.zzc = zzijpVar4;
    }

    public static zzesu zzc(zzijp zzijpVar, zzijp zzijpVar2, zzijp zzijpVar3, zzijp zzijpVar4) {
        return new zzesu(zzijpVar, zzijpVar2, zzijpVar3, zzijpVar4);
    }

    @Override // com.google.android.gms.internal.ads.zzijv, com.google.android.gms.internal.ads.zziju
    /* JADX INFO: renamed from: zza, reason: merged with bridge method [inline-methods] */
    public final zzesp zzb() {
        return new zzesp(zzflk.zzc(), (zzduu) this.zza.zzb(), (zzdzp) this.zzb.zzb(), (zzesr) this.zzc.zzb());
    }
}
