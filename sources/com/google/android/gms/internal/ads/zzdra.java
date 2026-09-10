package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes4.dex */
public final class zzdra implements zzijg {
    private final zzijp zza;
    private final zzijp zzb;

    private zzdra(zzijp zzijpVar, zzijp zzijpVar2, zzijp zzijpVar3) {
        this.zza = zzijpVar2;
        this.zzb = zzijpVar3;
    }

    public static zzdra zzc(zzijp zzijpVar, zzijp zzijpVar2, zzijp zzijpVar3) {
        return new zzdra(zzijpVar, zzijpVar2, zzijpVar3);
    }

    @Override // com.google.android.gms.internal.ads.zzijv, com.google.android.gms.internal.ads.zziju
    /* JADX INFO: renamed from: zza, reason: merged with bridge method [inline-methods] */
    public final zzdqz zzb() {
        return new zzdqz(zzflk.zzc(), ((zzdqv) this.zza).zzb(), (zzdwy) this.zzb.zzb());
    }
}
