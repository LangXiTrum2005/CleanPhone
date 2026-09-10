package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes4.dex */
final class zzcnn implements zzdky {
    private final zzcmv zza;
    private zzffn zzb;
    private zzfer zzc;
    private zzdgk zzd;
    private zzczt zze;
    private zzeow zzf;

    public /* synthetic */ zzcnn(zzcmv zzcmvVar, byte[] bArr) {
        this.zza = zzcmvVar;
    }

    @Override // com.google.android.gms.internal.ads.zzdky, com.google.android.gms.internal.ads.zzczq
    /* JADX INFO: renamed from: zza */
    public final zzdkz zzh() {
        zzijo.zzc(this.zzd, zzdgk.class);
        zzijo.zzc(this.zze, zzczt.class);
        zzijo.zzc(this.zzf, zzeow.class);
        return new zzcno(this.zza, new zzcwq(), new zzfjq(), new zzcyr(), new zzdxt(), this.zzd, this.zze, zzenc.zza(), this.zzf, null, this.zzb, this.zzc);
    }

    @Override // com.google.android.gms.internal.ads.zzdky
    public final /* synthetic */ zzdky zzb(zzfer zzferVar) {
        this.zzc = zzferVar;
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzdky
    public final /* synthetic */ zzdky zzc(zzffn zzffnVar) {
        this.zzb = zzffnVar;
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzdky
    public final /* bridge */ /* synthetic */ zzdky zzd(zzeow zzeowVar) {
        this.zzf = zzeowVar;
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzdky
    public final /* bridge */ /* synthetic */ zzdky zze(zzczt zzcztVar) {
        this.zze = zzcztVar;
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzdky
    public final /* bridge */ /* synthetic */ zzdky zzf(zzdgk zzdgkVar) {
        this.zzd = zzdgkVar;
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzdky, com.google.android.gms.internal.ads.zzczq
    public final /* synthetic */ zzczq zzi(zzfer zzferVar) {
        this.zzc = zzferVar;
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzdky, com.google.android.gms.internal.ads.zzczq
    public final /* synthetic */ zzczq zzj(zzffn zzffnVar) {
        this.zzb = zzffnVar;
        return this;
    }
}
