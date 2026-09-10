package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes4.dex */
public final class zzdoe implements zzijg {
    private final zzdnx zza;

    private zzdoe(zzdnx zzdnxVar) {
        this.zza = zzdnxVar;
    }

    public static zzdoe zzc(zzdnx zzdnxVar) {
        return new zzdoe(zzdnxVar);
    }

    public static zzdnm zzd(zzdnx zzdnxVar) {
        zzdnm zzdnmVarZza = zzdnxVar.zza();
        zzijo.zzb(zzdnmVarZza);
        return zzdnmVarZza;
    }

    public final zzdnm zza() {
        return zzd(this.zza);
    }

    @Override // com.google.android.gms.internal.ads.zzijv, com.google.android.gms.internal.ads.zziju
    public final /* synthetic */ Object zzb() {
        return zzd(this.zza);
    }
}
