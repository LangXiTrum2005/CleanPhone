package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes4.dex */
final class zzcms implements zzdlu {
    private final zzcmv zza;
    private zzffn zzb;
    private zzfer zzc;
    private zzdgk zzd;
    private zzczt zze;
    private zzdlq zzf;
    private zzcsz zzg;

    public /* synthetic */ zzcms(zzcmv zzcmvVar, byte[] bArr) {
        this.zza = zzcmvVar;
    }

    @Override // com.google.android.gms.internal.ads.zzdlu, com.google.android.gms.internal.ads.zzczq
    /* JADX INFO: renamed from: zza */
    public final zzdlv zzh() {
        zzijo.zzc(this.zzd, zzdgk.class);
        zzijo.zzc(this.zze, zzczt.class);
        zzijo.zzc(this.zzf, zzdlq.class);
        zzijo.zzc(this.zzg, zzcsz.class);
        return new zzcmt(this.zza, this.zzg, this.zzf, new zzcwq(), new zzfjq(), new zzcyr(), new zzdxt(), this.zzd, this.zze, zzenc.zza(), null, this.zzb, this.zzc);
    }

    @Override // com.google.android.gms.internal.ads.zzdlu
    public final /* synthetic */ zzdlu zzb(zzfer zzferVar) {
        this.zzc = zzferVar;
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzdlu
    public final /* synthetic */ zzdlu zzc(zzffn zzffnVar) {
        this.zzb = zzffnVar;
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzdlu
    public final /* bridge */ /* synthetic */ zzdlu zzd(zzcsz zzcszVar) {
        this.zzg = zzcszVar;
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzdlu
    public final /* bridge */ /* synthetic */ zzdlu zze(zzdlq zzdlqVar) {
        this.zzf = zzdlqVar;
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzdlu
    public final /* bridge */ /* synthetic */ zzdlu zzf(zzczt zzcztVar) {
        this.zze = zzcztVar;
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzdlu
    public final /* bridge */ /* synthetic */ zzdlu zzg(zzdgk zzdgkVar) {
        this.zzd = zzdgkVar;
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzdlu, com.google.android.gms.internal.ads.zzczq
    public final /* synthetic */ zzczq zzi(zzfer zzferVar) {
        this.zzc = zzferVar;
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzdlu, com.google.android.gms.internal.ads.zzczq
    public final /* synthetic */ zzczq zzj(zzffn zzffnVar) {
        this.zzb = zzffnVar;
        return this;
    }
}
