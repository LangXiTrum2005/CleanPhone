package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes4.dex */
public final class zzcuf implements zzijg {
    private final zzijp zza;
    private final zzijp zzb;
    private final zzijp zzc;

    private zzcuf(zzijp zzijpVar, zzijp zzijpVar2, zzijp zzijpVar3) {
        this.zza = zzijpVar;
        this.zzb = zzijpVar2;
        this.zzc = zzijpVar3;
    }

    public static zzcuf zzc(zzijp zzijpVar, zzijp zzijpVar2, zzijp zzijpVar3) {
        return new zzcuf(zzijpVar, zzijpVar2, zzijpVar3);
    }

    @Override // com.google.android.gms.internal.ads.zzijv, com.google.android.gms.internal.ads.zziju
    /* JADX INFO: renamed from: zza, reason: merged with bridge method [inline-methods] */
    public final zzcue zzb() {
        return new zzcue(((zzcua) this.zza).zza(), (zzdxe) this.zzb.zzb(), ((zzcwb) this.zzc).zza());
    }
}
