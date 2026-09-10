package com.google.android.gms.internal.ads;

import com.google.android.gms.dynamic.IObjectWrapper;

/* JADX INFO: loaded from: classes3.dex */
final class zzehy extends zzbwg {
    final /* synthetic */ zzcxz zza;
    final /* synthetic */ zzcvr zzb;
    final /* synthetic */ zzcxa zzc;
    final /* synthetic */ zzdeb zzd;

    public zzehy(zzehz zzehzVar, zzcxz zzcxzVar, zzcvr zzcvrVar, zzcxa zzcxaVar, zzdeb zzdebVar) {
        this.zza = zzcxzVar;
        this.zzb = zzcvrVar;
        this.zzc = zzcxaVar;
        this.zzd = zzdebVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbwh
    public final void zze(IObjectWrapper iObjectWrapper) {
        this.zzb.onAdClicked();
    }

    @Override // com.google.android.gms.internal.ads.zzbwh
    public final void zzf(IObjectWrapper iObjectWrapper) {
        this.zza.zzds(4);
    }

    @Override // com.google.android.gms.internal.ads.zzbwh
    public final void zzg(IObjectWrapper iObjectWrapper, int i) {
    }

    @Override // com.google.android.gms.internal.ads.zzbwh
    public final void zzh(IObjectWrapper iObjectWrapper) {
        this.zzc.zzb();
    }

    @Override // com.google.android.gms.internal.ads.zzbwh
    public final void zzi(IObjectWrapper iObjectWrapper) {
    }

    @Override // com.google.android.gms.internal.ads.zzbwh
    public final void zzj(IObjectWrapper iObjectWrapper) {
        this.zza.zzdp();
    }

    @Override // com.google.android.gms.internal.ads.zzbwh
    public final void zzk(IObjectWrapper iObjectWrapper, int i) {
    }

    @Override // com.google.android.gms.internal.ads.zzbwh
    public final void zzl(IObjectWrapper iObjectWrapper) {
    }

    @Override // com.google.android.gms.internal.ads.zzbwh
    public final void zzm(IObjectWrapper iObjectWrapper, zzbwi zzbwiVar) {
        this.zzd.zza(zzbwiVar);
    }

    @Override // com.google.android.gms.internal.ads.zzbwh
    public final void zzn(IObjectWrapper iObjectWrapper) {
        this.zzc.zze();
    }

    @Override // com.google.android.gms.internal.ads.zzbwh
    public final void zzo(IObjectWrapper iObjectWrapper) {
        this.zzd.zzc();
    }
}
