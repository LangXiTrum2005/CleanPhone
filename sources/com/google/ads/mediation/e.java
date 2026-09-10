package com.google.ads.mediation;

import com.google.android.gms.ads.AdListener;
import com.google.android.gms.ads.LoadAdError;
import com.google.android.gms.ads.formats.UnifiedNativeAd;
import com.google.android.gms.ads.formats.zzd;
import com.google.android.gms.ads.formats.zze;
import com.google.android.gms.ads.formats.zzg;
import com.google.android.gms.ads.mediation.MediationNativeListener;
import com.google.android.gms.internal.ads.bp;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class e extends AdListener implements zzg, zze, zzd {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final AbstractAdViewAdapter f10612a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final MediationNativeListener f10613b;

    public e(AbstractAdViewAdapter abstractAdViewAdapter, MediationNativeListener mediationNativeListener) {
        this.f10612a = abstractAdViewAdapter;
        this.f10613b = mediationNativeListener;
    }

    @Override // com.google.android.gms.ads.AdListener
    public final void onAdClicked() {
        this.f10613b.onAdClicked(this.f10612a);
    }

    @Override // com.google.android.gms.ads.AdListener
    public final void onAdClosed() {
        this.f10613b.onAdClosed(this.f10612a);
    }

    @Override // com.google.android.gms.ads.AdListener
    public final void onAdFailedToLoad(LoadAdError loadAdError) {
        this.f10613b.onAdFailedToLoad(this.f10612a, loadAdError);
    }

    @Override // com.google.android.gms.ads.AdListener
    public final void onAdImpression() {
        this.f10613b.onAdImpression(this.f10612a);
    }

    @Override // com.google.android.gms.ads.AdListener
    public final void onAdOpened() {
        this.f10613b.onAdOpened(this.f10612a);
    }

    @Override // com.google.android.gms.ads.formats.zzg
    public final void zza(UnifiedNativeAd unifiedNativeAd) {
        a aVar = new a();
        aVar.setHeadline(unifiedNativeAd.zza());
        aVar.setImages(unifiedNativeAd.zzb());
        aVar.setBody(unifiedNativeAd.zzc());
        aVar.setIcon(unifiedNativeAd.zzd());
        aVar.setCallToAction(unifiedNativeAd.zze());
        aVar.setAdvertiser(unifiedNativeAd.zzf());
        aVar.setStarRating(unifiedNativeAd.zzg());
        aVar.setStore(unifiedNativeAd.zzh());
        aVar.setPrice(unifiedNativeAd.zzi());
        aVar.zzb(unifiedNativeAd.zzk());
        aVar.setOverrideImpressionRecording(true);
        aVar.setOverrideClickHandling(true);
        aVar.zza(unifiedNativeAd.zzj());
        this.f10613b.onAdLoaded(this.f10612a, aVar);
    }

    @Override // com.google.android.gms.ads.formats.zze
    public final void zzb(bp bpVar) {
        this.f10613b.zzc(this.f10612a, bpVar);
    }

    @Override // com.google.android.gms.ads.formats.zzd
    public final void zzc(bp bpVar, String str) {
        this.f10613b.zzd(this.f10612a, bpVar, str);
    }

    @Override // com.google.android.gms.ads.AdListener
    public final void onAdLoaded() {
    }
}
