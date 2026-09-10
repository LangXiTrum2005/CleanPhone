package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes4.dex */
final class zzcnc implements zzcug {
    private final zzcmv zza;
    private zzffn zzb;
    private zzfer zzc;
    private zzdgk zzd;
    private zzczt zze;
    private zzeow zzf;
    private zzcvc zzg;
    private zzena zzh;
    private zzcsz zzi;
    private zzdlq zzj;

    public /* synthetic */ zzcnc(zzcmv zzcmvVar, byte[] bArr) {
        this.zza = zzcmvVar;
    }

    @Override // com.google.android.gms.internal.ads.zzcug, com.google.android.gms.internal.ads.zzczq
    /* JADX INFO: renamed from: zza */
    public final zzcuh zzh() {
        zzijo.zzc(this.zzd, zzdgk.class);
        zzijo.zzc(this.zze, zzczt.class);
        zzijo.zzc(this.zzf, zzeow.class);
        zzijo.zzc(this.zzg, zzcvc.class);
        if (this.zzh == null) {
            this.zzh = zzenc.zza();
        }
        zzijo.zzc(this.zzi, zzcsz.class);
        zzijo.zzc(this.zzj, zzdlq.class);
        return new zzcnd(this.zza, this.zzi, this.zzj, new zzcwq(), new zzfjq(), new zzcyr(), new zzdxt(), this.zzd, this.zze, this.zzh, this.zzf, this.zzg, null, this.zzb, this.zzc);
    }

    @Override // com.google.android.gms.internal.ads.zzcug
    public final /* synthetic */ zzcug zzb(zzfer zzferVar) {
        this.zzc = zzferVar;
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzcug
    public final /* synthetic */ zzcug zzc(zzffn zzffnVar) {
        this.zzb = zzffnVar;
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzcug
    public final /* bridge */ /* synthetic */ zzcug zzd(zzdlq zzdlqVar) {
        this.zzj = zzdlqVar;
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzcug
    public final /* bridge */ /* synthetic */ zzcug zze(zzcsz zzcszVar) {
        this.zzi = zzcszVar;
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzcug
    public final /* bridge */ /* synthetic */ zzcug zzf(zzena zzenaVar) {
        this.zzh = zzenaVar;
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzcug
    public final /* bridge */ /* synthetic */ zzcug zzg(zzcvc zzcvcVar) {
        this.zzg = zzcvcVar;
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzcug, com.google.android.gms.internal.ads.zzczq
    public final /* synthetic */ zzczq zzi(zzfer zzferVar) {
        this.zzc = zzferVar;
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzcug, com.google.android.gms.internal.ads.zzczq
    public final /* synthetic */ zzczq zzj(zzffn zzffnVar) {
        this.zzb = zzffnVar;
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzcug
    public final /* bridge */ /* synthetic */ zzcug zzk(zzeow zzeowVar) {
        this.zzf = zzeowVar;
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzcug
    public final /* bridge */ /* synthetic */ zzcug zzl(zzczt zzcztVar) {
        this.zze = zzcztVar;
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzcug
    public final /* bridge */ /* synthetic */ zzcug zzm(zzdgk zzdgkVar) {
        this.zzd = zzdgkVar;
        return this;
    }
}
