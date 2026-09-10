package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes4.dex */
public final class zzdwh implements zzijg {
    private final zzijp zza;
    private final zzijp zzb;

    private zzdwh(zzijp zzijpVar, zzijp zzijpVar2) {
        this.zza = zzijpVar;
        this.zzb = zzijpVar2;
    }

    public static zzdwh zzc(zzijp zzijpVar, zzijp zzijpVar2) {
        return new zzdwh(zzijpVar, zzijpVar2);
    }

    @Override // com.google.android.gms.internal.ads.zzijv, com.google.android.gms.internal.ads.zziju
    /* JADX INFO: renamed from: zza, reason: merged with bridge method [inline-methods] */
    public final zzdwg zzb() {
        return new zzdwg((zzbfj) this.zza.zzb(), ((zzijk) this.zzb).zzb());
    }
}
