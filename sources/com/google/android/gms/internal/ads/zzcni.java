package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes4.dex */
final class zzcni implements zzdyo {
    private final zzcmv zza;
    private final zzcnl zzb;
    private Long zzc;
    private String zzd;

    public /* synthetic */ zzcni(zzcmv zzcmvVar, zzcnl zzcnlVar, byte[] bArr) {
        this.zza = zzcmvVar;
        this.zzb = zzcnlVar;
    }

    @Override // com.google.android.gms.internal.ads.zzdyo
    public final zzdyp zza() {
        zzijo.zzc(this.zzc, Long.class);
        zzijo.zzc(this.zzd, String.class);
        return new zzcnj(this.zza, this.zzb, this.zzc, this.zzd);
    }

    @Override // com.google.android.gms.internal.ads.zzdyo
    public final /* bridge */ /* synthetic */ zzdyo zzb(String str) {
        str.getClass();
        this.zzd = str;
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzdyo
    public final /* bridge */ /* synthetic */ zzdyo zzc(long j) {
        this.zzc = Long.valueOf(j);
        return this;
    }
}
