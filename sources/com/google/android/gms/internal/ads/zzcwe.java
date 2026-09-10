package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes4.dex */
public final class zzcwe implements zzijg {
    private final zzcwa zza;

    private zzcwe(zzcwa zzcwaVar) {
        this.zza = zzcwaVar;
    }

    public static zzcwe zzc(zzcwa zzcwaVar) {
        return new zzcwe(zzcwaVar);
    }

    public static zzfic zzd(zzcwa zzcwaVar) {
        zzfic zzficVarZza = zzcwaVar.zza();
        zzijo.zzb(zzficVarZza);
        return zzficVarZza;
    }

    public final zzfic zza() {
        return zzd(this.zza);
    }

    @Override // com.google.android.gms.internal.ads.zzijv, com.google.android.gms.internal.ads.zziju
    public final /* synthetic */ Object zzb() {
        return zzd(this.zza);
    }
}
