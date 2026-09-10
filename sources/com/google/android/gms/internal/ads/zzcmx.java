package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes4.dex */
final class zzcmx implements zzcsp {
    private final zzcmv zza;
    private zzffn zzb;
    private zzfer zzc;
    private zzdgk zzd;
    private zzczt zze;

    public /* synthetic */ zzcmx(zzcmv zzcmvVar, byte[] bArr) {
        this.zza = zzcmvVar;
    }

    @Override // com.google.android.gms.internal.ads.zzcsp, com.google.android.gms.internal.ads.zzczq
    /* JADX INFO: renamed from: zza */
    public final zzcsq zzh() {
        zzijo.zzc(this.zzd, zzdgk.class);
        zzijo.zzc(this.zze, zzczt.class);
        return new zzcmy(this.zza, new zzcwq(), new zzfjq(), new zzcyr(), new zzdxt(), this.zzd, this.zze, zzenc.zza(), null, this.zzb, this.zzc);
    }

    @Override // com.google.android.gms.internal.ads.zzcsp
    public final /* synthetic */ zzcsp zzb(zzfer zzferVar) {
        this.zzc = zzferVar;
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzcsp
    public final /* synthetic */ zzcsp zzc(zzffn zzffnVar) {
        this.zzb = zzffnVar;
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzcsp
    public final /* bridge */ /* synthetic */ zzcsp zzd(zzczt zzcztVar) {
        this.zze = zzcztVar;
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzcsp
    public final /* bridge */ /* synthetic */ zzcsp zze(zzdgk zzdgkVar) {
        this.zzd = zzdgkVar;
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzcsp, com.google.android.gms.internal.ads.zzczq
    public final /* synthetic */ zzczq zzi(zzfer zzferVar) {
        this.zzc = zzferVar;
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzcsp, com.google.android.gms.internal.ads.zzczq
    public final /* synthetic */ zzczq zzj(zzffn zzffnVar) {
        this.zzb = zzffnVar;
        return this;
    }
}
