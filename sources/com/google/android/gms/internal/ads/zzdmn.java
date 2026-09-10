package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes4.dex */
public final class zzdmn implements zzijg {
    private final zzdmi zza;

    private zzdmn(zzdmi zzdmiVar) {
        this.zza = zzdmiVar;
    }

    public static zzdmn zzc(zzdmi zzdmiVar) {
        return new zzdmn(zzdmiVar);
    }

    public static zzdsp zzd(zzdmi zzdmiVar) {
        zzdsp zzdspVarZzd = zzdmiVar.zzd();
        zzijo.zzb(zzdspVarZzd);
        return zzdspVarZzd;
    }

    public final zzdsp zza() {
        return zzd(this.zza);
    }

    @Override // com.google.android.gms.internal.ads.zzijv, com.google.android.gms.internal.ads.zziju
    public final /* synthetic */ Object zzb() {
        return zzd(this.zza);
    }
}
