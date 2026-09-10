package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes4.dex */
public final class zzdab implements zzijg {
    private final zzczt zza;

    private zzdab(zzczt zzcztVar) {
        this.zza = zzcztVar;
    }

    public static zzdab zzc(zzczt zzcztVar) {
        return new zzdab(zzcztVar);
    }

    public static zzfik zzd(zzczt zzcztVar) {
        zzfik zzfikVarZzb = zzcztVar.zzb();
        zzijo.zzb(zzfikVarZzb);
        return zzfikVarZzb;
    }

    public final zzfik zza() {
        return zzd(this.zza);
    }

    @Override // com.google.android.gms.internal.ads.zzijv, com.google.android.gms.internal.ads.zziju
    public final /* synthetic */ Object zzb() {
        return zzd(this.zza);
    }
}
