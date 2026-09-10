package com.google.android.gms.internal.ads;

import com.google.android.gms.dynamic.IObjectWrapper;
import java.util.Objects;

/* JADX INFO: loaded from: classes4.dex */
final class zzeny extends zzbzw {
    final /* synthetic */ zzdcv zza;
    final /* synthetic */ zzdai zzb;
    final /* synthetic */ zzdbr zzc;
    final /* synthetic */ zzdja zzd;

    public zzeny(zzenz zzenzVar, zzdcv zzdcvVar, zzdai zzdaiVar, zzdbr zzdbrVar, zzdja zzdjaVar) {
        this.zza = zzdcvVar;
        this.zzb = zzdaiVar;
        this.zzc = zzdbrVar;
        this.zzd = zzdjaVar;
        Objects.requireNonNull(zzenzVar);
    }

    @Override // com.google.android.gms.internal.ads.zzbzx
    public final void zze(IObjectWrapper iObjectWrapper) {
    }

    @Override // com.google.android.gms.internal.ads.zzbzx
    public final void zzf(IObjectWrapper iObjectWrapper, int i2) {
    }

    @Override // com.google.android.gms.internal.ads.zzbzx
    public final void zzg(IObjectWrapper iObjectWrapper) {
    }

    @Override // com.google.android.gms.internal.ads.zzbzx
    public final void zzh(IObjectWrapper iObjectWrapper) {
        this.zza.zzh();
    }

    @Override // com.google.android.gms.internal.ads.zzbzx
    public final void zzi(IObjectWrapper iObjectWrapper) {
        this.zzd.zza();
    }

    @Override // com.google.android.gms.internal.ads.zzbzx
    public final void zzj(IObjectWrapper iObjectWrapper) {
        this.zza.zzdT(4);
    }

    @Override // com.google.android.gms.internal.ads.zzbzx
    public final void zzk(IObjectWrapper iObjectWrapper, zzbzy zzbzyVar) {
        this.zzd.zzb(zzbzyVar);
    }

    @Override // com.google.android.gms.internal.ads.zzbzx
    public final void zzl(IObjectWrapper iObjectWrapper) {
        this.zzb.onAdClicked();
    }

    @Override // com.google.android.gms.internal.ads.zzbzx
    public final void zzm(IObjectWrapper iObjectWrapper, int i2) {
    }

    @Override // com.google.android.gms.internal.ads.zzbzx
    public final void zzn(IObjectWrapper iObjectWrapper) {
        this.zzc.zzb();
    }

    @Override // com.google.android.gms.internal.ads.zzbzx
    public final void zzo(IObjectWrapper iObjectWrapper) {
        this.zzc.zzf();
    }

    @Override // com.google.android.gms.internal.ads.zzbzx
    public final void zzp(IObjectWrapper iObjectWrapper) {
        this.zzd.zzb(null);
    }
}
