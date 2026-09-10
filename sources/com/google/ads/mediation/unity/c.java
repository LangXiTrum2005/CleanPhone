package com.google.ads.mediation.unity;

import com.unity3d.services.banners.BannerErrorInfo;
import com.unity3d.services.banners.BannerView;

/* JADX INFO: loaded from: classes2.dex */
public final class c extends BannerView.Listener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ UnityBannerAd f786a;

    public c(UnityBannerAd unityBannerAd) {
        this.f786a = unityBannerAd;
    }

    public static void a(String str, BannerView bannerView) {
        if (bannerView != null) {
            String.format(str, bannerView.getPlacementId());
        }
    }

    @Override // com.unity3d.services.banners.BannerView.Listener, com.unity3d.services.banners.BannerView.IListener
    public final void onBannerClick(BannerView bannerView) {
        a("Unity Ads banner ad was clicked for placement ID: %s", bannerView);
        UnityBannerAd unityBannerAd = this.f786a;
        unityBannerAd.eventAdapter.sendAdEvent(UnityAdsAdapterUtils.AdEvent.CLICKED);
        unityBannerAd.eventAdapter.sendAdEvent(UnityAdsAdapterUtils.AdEvent.OPENED);
    }

    @Override // com.unity3d.services.banners.BannerView.Listener, com.unity3d.services.banners.BannerView.IListener
    public final void onBannerFailedToLoad(BannerView bannerView, BannerErrorInfo bannerErrorInfo) {
        this.f786a.sendBannerFailedToLoad(UnityAdsAdapterUtils.e(bannerErrorInfo), bannerErrorInfo.errorMessage);
    }

    @Override // com.unity3d.services.banners.BannerView.Listener, com.unity3d.services.banners.BannerView.IListener
    public final void onBannerLeftApplication(BannerView bannerView) {
        a("Unity Ads banner ad left application for placement ID: %s", bannerView);
        this.f786a.eventAdapter.sendAdEvent(UnityAdsAdapterUtils.AdEvent.LEFT_APPLICATION);
    }

    @Override // com.unity3d.services.banners.BannerView.Listener, com.unity3d.services.banners.BannerView.IListener
    public final void onBannerLoaded(BannerView bannerView) {
        a("Unity Ads finished loading banner ad for placement ID: %s", bannerView);
        this.f786a.eventAdapter.sendAdEvent(UnityAdsAdapterUtils.AdEvent.LOADED);
    }

    @Override // com.unity3d.services.banners.BannerView.Listener, com.unity3d.services.banners.BannerView.IListener
    public final void onBannerShown(BannerView bannerView) {
        a("Unity Ads banner ad was shown for placement ID: %s", bannerView);
        this.f786a.eventAdapter.sendAdEvent(UnityAdsAdapterUtils.AdEvent.IMPRESSION);
    }
}
