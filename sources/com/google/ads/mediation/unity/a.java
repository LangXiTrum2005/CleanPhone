package com.google.ads.mediation.unity;

import com.google.android.gms.ads.AdError;
import com.unity3d.ads.IUnityAdsLoadListener;
import com.unity3d.ads.UnityAds;

/* JADX INFO: loaded from: classes2.dex */
public final class a implements IUnityAdsLoadListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ UnityAdapter f784a;

    public a(UnityAdapter unityAdapter) {
        this.f784a = unityAdapter;
    }

    @Override // com.unity3d.ads.IUnityAdsLoadListener
    public final void onUnityAdsAdLoaded(String str) {
        new StringBuilder("Unity Ads interstitial ad successfully loaded for placement ID: ").append(str);
        UnityAdapter unityAdapter = this.f784a;
        unityAdapter.placementId = str;
        unityAdapter.eventAdapter.sendAdEvent(UnityAdsAdapterUtils.AdEvent.LOADED);
    }

    @Override // com.unity3d.ads.IUnityAdsLoadListener
    public final void onUnityAdsFailedToLoad(String str, UnityAds.UnityAdsLoadError unityAdsLoadError, String str2) {
        UnityAdapter unityAdapter = this.f784a;
        unityAdapter.placementId = str;
        AdError adErrorC = UnityAdsAdapterUtils.c(unityAdsLoadError, str2);
        adErrorC.toString();
        if (unityAdapter.mediationInterstitialListener != null) {
            unityAdapter.mediationInterstitialListener.onAdFailedToLoad(unityAdapter, adErrorC);
        }
    }
}
