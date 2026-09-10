package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes4.dex */
public final class zzcwb implements zzijg {
    private final zzcwa zza;

    private zzcwb(zzcwa zzcwaVar) {
        this.zza = zzcwaVar;
    }

    public static zzcwb zzc(zzcwa zzcwaVar) {
        return new zzcwb(zzcwaVar);
    }

    public static zzfhr zzd(zzcwa zzcwaVar) {
        zzfhr zzfhrVarZzb = zzcwaVar.zzb();
        zzijo.zzb(zzfhrVarZzb);
        return zzfhrVarZzb;
    }

    public final zzfhr zza() {
        return zzd(this.zza);
    }

    @Override // com.google.android.gms.internal.ads.zzijv, com.google.android.gms.internal.ads.zziju
    public final /* synthetic */ Object zzb() {
        return zzd(this.zza);
    }
}
