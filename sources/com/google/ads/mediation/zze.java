package com.google.ads.mediation;

import com.google.android.gms.ads.AdListener;
import com.google.android.gms.ads.LoadAdError;
import com.google.android.gms.ads.formats.UnifiedNativeAd;
import com.google.android.gms.ads.formats.zzg;
import com.google.android.gms.ads.mediation.MediationNativeListener;
import com.google.android.gms.internal.ads.zzbkt;

/* JADX INFO: loaded from: classes3.dex */
final class zze extends AdListener implements zzg, com.google.android.gms.ads.formats.zze, com.google.android.gms.ads.formats.zzd {
    public final AbstractAdViewAdapter X;

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    public final MediationNativeListener f16669Y;

    public zze(AbstractAdViewAdapter abstractAdViewAdapter, MediationNativeListener mediationNativeListener) {
        this.X = abstractAdViewAdapter;
        this.f16669Y = mediationNativeListener;
    }

    @Override // com.google.android.gms.ads.AdListener
    public final void onAdClicked() {
        this.f16669Y.onAdClicked(this.X);
    }

    @Override // com.google.android.gms.ads.AdListener
    public final void onAdClosed() {
        this.f16669Y.onAdClosed(this.X);
    }

    @Override // com.google.android.gms.ads.AdListener
    public final void onAdFailedToLoad(LoadAdError loadAdError) {
        this.f16669Y.onAdFailedToLoad(this.X, loadAdError);
    }

    @Override // com.google.android.gms.ads.AdListener
    public final void onAdImpression() {
        this.f16669Y.onAdImpression(this.X);
    }

    @Override // com.google.android.gms.ads.AdListener
    public final void onAdLoaded() {
    }

    @Override // com.google.android.gms.ads.AdListener
    public final void onAdOpened() {
        this.f16669Y.onAdOpened(this.X);
    }

    @Override // com.google.android.gms.ads.formats.zzg
    public final void zza(UnifiedNativeAd unifiedNativeAd) {
        zza zzaVar = new zza();
        zzaVar.setHeadline(unifiedNativeAd.zza());
        zzaVar.setImages(unifiedNativeAd.zzb());
        zzaVar.setBody(unifiedNativeAd.zzc());
        zzaVar.setIcon(unifiedNativeAd.zzd());
        zzaVar.setCallToAction(unifiedNativeAd.zze());
        zzaVar.setAdvertiser(unifiedNativeAd.zzf());
        zzaVar.setStarRating(unifiedNativeAd.zzg());
        zzaVar.setStore(unifiedNativeAd.zzh());
        zzaVar.setPrice(unifiedNativeAd.zzi());
        zzaVar.zzb(unifiedNativeAd.zzk());
        zzaVar.setOverrideImpressionRecording(true);
        zzaVar.setOverrideClickHandling(true);
        zzaVar.zza(unifiedNativeAd.zzj());
        this.f16669Y.onAdLoaded(this.X, zzaVar);
    }

    @Override // com.google.android.gms.ads.formats.zze
    public final void zzb(zzbkt zzbktVar) {
        this.f16669Y.zzc(this.X, zzbktVar);
    }

    @Override // com.google.android.gms.ads.formats.zzd
    public final void zzc(zzbkt zzbktVar, String str) {
        this.f16669Y.zzd(this.X, zzbktVar, str);
    }
}
