package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes4.dex */
final class zzcnt implements zzefd {
    private final zzcmv zza;
    private final zzcns zzb;
    private zzedk zzc;

    public /* synthetic */ zzcnt(zzcmv zzcmvVar, zzcns zzcnsVar, byte[] bArr) {
        this.zza = zzcmvVar;
        this.zzb = zzcnsVar;
    }

    @Override // com.google.android.gms.internal.ads.zzefd
    public final zzefe zza() {
        zzijo.zzc(this.zzc, zzedk.class);
        return new zzcnu(this.zza, this.zzb, this.zzc);
    }

    @Override // com.google.android.gms.internal.ads.zzefd
    public final /* bridge */ /* synthetic */ zzefd zzb(zzedk zzedkVar) {
        this.zzc = zzedkVar;
        return this;
    }
}
