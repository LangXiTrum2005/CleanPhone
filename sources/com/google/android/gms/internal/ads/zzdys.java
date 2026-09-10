package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes4.dex */
public final class zzdys implements zzijg {
    private final zzijp zza;

    private zzdys(zzijp zzijpVar) {
        this.zza = zzijpVar;
    }

    public static zzdys zzc(zzijp zzijpVar) {
        return new zzdys(zzijpVar);
    }

    public static zzdyr zzd(zzbon zzbonVar) {
        return new zzdyr(zzbonVar);
    }

    @Override // com.google.android.gms.internal.ads.zzijv, com.google.android.gms.internal.ads.zziju
    /* JADX INFO: renamed from: zza, reason: merged with bridge method [inline-methods] */
    public final zzdyr zzb() {
        return new zzdyr((zzbon) this.zza.zzb());
    }
}
