package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes4.dex */
public final class zzduj implements zzijg {
    private final zzijp zza;

    private zzduj(zzijp zzijpVar) {
        this.zza = zzijpVar;
    }

    public static zzduj zzc(zzijp zzijpVar) {
        return new zzduj(zzijpVar);
    }

    @Override // com.google.android.gms.internal.ads.zzijv, com.google.android.gms.internal.ads.zziju
    /* JADX INFO: renamed from: zza, reason: merged with bridge method [inline-methods] */
    public final zzdui zzb() {
        return new zzdui((zzcir) this.zza.zzb());
    }
}
