package com.google.android.gms.ads.internal.client;

import com.google.android.gms.ads.AdListener;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class zzg extends zzbg {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final AdListener f10880a;

    public zzg(AdListener adListener) {
        this.f10880a = adListener;
    }

    @Override // com.google.android.gms.ads.internal.client.zzbh
    public final void zzb() {
        AdListener adListener = this.f10880a;
        if (adListener != null) {
            adListener.onAdClosed();
        }
    }

    @Override // com.google.android.gms.ads.internal.client.zzbh
    public final void zzd(zze zzeVar) {
        AdListener adListener = this.f10880a;
        if (adListener != null) {
            adListener.onAdFailedToLoad(zzeVar.zzb());
        }
    }

    @Override // com.google.android.gms.ads.internal.client.zzbh
    public final void zzf() {
        AdListener adListener = this.f10880a;
        if (adListener != null) {
            adListener.onAdLoaded();
        }
    }

    @Override // com.google.android.gms.ads.internal.client.zzbh
    public final void zzg() {
        AdListener adListener = this.f10880a;
        if (adListener != null) {
            adListener.onAdOpened();
        }
    }

    @Override // com.google.android.gms.ads.internal.client.zzbh
    public final void zzh() {
        AdListener adListener = this.f10880a;
        if (adListener != null) {
            adListener.onAdClicked();
        }
    }

    @Override // com.google.android.gms.ads.internal.client.zzbh
    public final void zzi() {
        AdListener adListener = this.f10880a;
        if (adListener != null) {
            adListener.onAdSwipeGestureClicked();
        }
    }

    @Override // com.google.android.gms.ads.internal.client.zzbh
    public final void zzj() {
        AdListener adListener = this.f10880a;
        if (adListener != null) {
            adListener.onAdImpression();
        }
    }

    public final AdListener zzk() {
        return this.f10880a;
    }

    @Override // com.google.android.gms.ads.internal.client.zzbh
    public final void zze() {
    }

    @Override // com.google.android.gms.ads.internal.client.zzbh
    public final void zzc(int i10) {
    }
}
