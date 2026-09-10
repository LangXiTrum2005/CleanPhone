package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes4.dex */
public final class zzcoe implements zzijg {
    private final zzcod zza;

    private zzcoe(zzcod zzcodVar) {
        this.zza = zzcodVar;
    }

    public static zzcoe zzc(zzcod zzcodVar) {
        return new zzcoe(zzcodVar);
    }

    public static com.google.android.gms.ads.internal.zza zzd(zzcod zzcodVar) {
        return new com.google.android.gms.ads.internal.zza(new zzcgh(), new zzcfc());
    }

    public final com.google.android.gms.ads.internal.zza zza() {
        return zzd(this.zza);
    }

    @Override // com.google.android.gms.internal.ads.zzijv, com.google.android.gms.internal.ads.zziju
    public final /* synthetic */ Object zzb() {
        return zzd(this.zza);
    }
}
