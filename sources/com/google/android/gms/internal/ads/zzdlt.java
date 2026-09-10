package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes4.dex */
public final class zzdlt implements zzijg {
    private final zzdlq zza;

    private zzdlt(zzdlq zzdlqVar) {
        this.zza = zzdlqVar;
    }

    public static zzdlt zzc(zzdlq zzdlqVar) {
        return new zzdlt(zzdlqVar);
    }

    public static zzdnw zzd(zzdlq zzdlqVar) {
        zzdnw zzdnwVarZza = zzdlqVar.zza();
        zzijo.zzb(zzdnwVarZza);
        return zzdnwVarZza;
    }

    public final zzdnw zza() {
        return zzd(this.zza);
    }

    @Override // com.google.android.gms.internal.ads.zzijv, com.google.android.gms.internal.ads.zziju
    public final /* synthetic */ Object zzb() {
        return zzd(this.zza);
    }
}
