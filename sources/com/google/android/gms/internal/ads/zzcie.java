package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;

/* JADX INFO: loaded from: classes3.dex */
final class zzcie implements zzdgp {
    private final zzcih zza;
    private zzezj zzb;
    private zzeym zzc;
    private zzdbm zzd;
    private zzcvc zze;
    private zzdgl zzf;
    private zzcoj zzg;

    public /* synthetic */ zzcie(zzcih zzcihVar, zzcjm zzcjmVar) {
        this.zza = zzcihVar;
    }

    @Override // com.google.android.gms.internal.ads.zzcuy
    public final /* synthetic */ zzcuy zza(@Nullable zzeym zzeymVar) {
        this.zzc = zzeymVar;
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzcuy
    public final /* synthetic */ zzcuy zzb(@Nullable zzezj zzezjVar) {
        this.zzb = zzezjVar;
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzdgp
    public final /* bridge */ /* synthetic */ zzdgp zzc(zzcoj zzcojVar) {
        this.zzg = zzcojVar;
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzdgp
    public final /* bridge */ /* synthetic */ zzdgp zzd(zzdgl zzdglVar) {
        this.zzf = zzdglVar;
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzdgp
    public final /* bridge */ /* synthetic */ zzdgp zze(zzdbm zzdbmVar) {
        this.zzd = zzdbmVar;
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzdgp
    public final /* bridge */ /* synthetic */ zzdgp zzf(zzcvc zzcvcVar) {
        this.zze = zzcvcVar;
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzcuy
    /* JADX INFO: renamed from: zzg, reason: merged with bridge method [inline-methods] */
    public final zzdgq zzh() {
        zzhez.zzc(this.zzd, zzdbm.class);
        zzhez.zzc(this.zze, zzcvc.class);
        zzhez.zzc(this.zzf, zzdgl.class);
        zzhez.zzc(this.zzg, zzcoj.class);
        return new zzcif(this.zza, this.zzg, this.zzf, new zzcsf(), new zzfdo(), new zzcue(), new zzdsl(), this.zzd, this.zze, zzehb.zza(), null, this.zzb, this.zzc, null);
    }
}
