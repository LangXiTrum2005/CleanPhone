package com.google.ads.mediation.unity;

import com.unity3d.ads.IUnityAdsShowListener;
import com.unity3d.ads.UnityAds;

/* JADX INFO: loaded from: classes2.dex */
public final class b implements IUnityAdsShowListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ UnityAdapter f785a;

    public b(UnityAdapter unityAdapter) {
        this.f785a = unityAdapter;
    }

    @Override // com.unity3d.ads.IUnityAdsShowListener
    public final void onUnityAdsShowClick(String str) {
        UnityAdapter unityAdapter = this.f785a;
        new StringBuilder("Unity Ads interstitial ad was clicked for placement ID: ").append(unityAdapter.placementId);
        unityAdapter.eventAdapter.sendAdEvent(UnityAdsAdapterUtils.AdEvent.CLICKED);
        unityAdapter.eventAdapter.sendAdEvent(UnityAdsAdapterUtils.AdEvent.LEFT_APPLICATION);
    }

    @Override // com.unity3d.ads.IUnityAdsShowListener
    public final void onUnityAdsShowComplete(String str, UnityAds.UnityAdsShowCompletionState unityAdsShowCompletionState) {
        UnityAdapter unityAdapter = this.f785a;
        new StringBuilder("Unity Ads interstitial ad finished playing for placement ID: ").append(unityAdapter.placementId);
        unityAdapter.eventAdapter.sendAdEvent(UnityAdsAdapterUtils.AdEvent.CLOSED);
    }

    @Override // com.unity3d.ads.IUnityAdsShowListener
    public final void onUnityAdsShowFailure(String str, UnityAds.UnityAdsShowError unityAdsShowError, String str2) {
        UnityAdsAdapterUtils.d(unityAdsShowError, str2).toString();
        UnityAdapter unityAdapter = this.f785a;
        unityAdapter.eventAdapter.sendAdEvent(UnityAdsAdapterUtils.AdEvent.OPENED);
        unityAdapter.eventAdapter.sendAdEvent(UnityAdsAdapterUtils.AdEvent.CLOSED);
    }

    @Override // com.unity3d.ads.IUnityAdsShowListener
    public final void onUnityAdsShowStart(String str) {
        UnityAdapter unityAdapter = this.f785a;
        new StringBuilder("Unity Ads interstitial ad started for placement ID: ").append(unityAdapter.placementId);
        unityAdapter.eventAdapter.sendAdEvent(UnityAdsAdapterUtils.AdEvent.OPENED);
    }
}
