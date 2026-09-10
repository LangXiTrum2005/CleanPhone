package com.unity3d.services.banners.bridge;

import com.unity3d.ads.BannerShowListenerWithOnFailedToShow;
import com.unity3d.ads.UnityAds;
import com.unity3d.ads.core.data.model.Listeners;
import com.unity3d.services.banners.BannerErrorInfo;
import com.unity3d.services.banners.BannerView;
import gatewayprotocol.v1.DiagnosticEventRequestOuterClass;
import kotlin.Metadata;
import kotlin.jvm.internal.n;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000'\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u001f\u0010\t\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\u000b\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000b\u0010\u0006J\u0017\u0010\f\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\f\u0010\u0006J'\u0010\u0010\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, d2 = {"com/unity3d/services/banners/bridge/BannerBridge$onBannerLoaded$1$2", "Lcom/unity3d/ads/core/data/model/Listeners;", "", "placementId", "Lwj/r;", "onLeftApplication", "(Ljava/lang/String;)V", "Lcom/unity3d/ads/UnityAds$UnityAdsShowCompletionState;", "state", "onComplete", "(Ljava/lang/String;Lcom/unity3d/ads/UnityAds$UnityAdsShowCompletionState;)V", "onClick", "onStart", "Lcom/unity3d/ads/UnityAds$UnityAdsShowError;", "error", "message", "onError", "(Ljava/lang/String;Lcom/unity3d/ads/UnityAds$UnityAdsShowError;Ljava/lang/String;)V", "unity-ads_defaultRelease"}, k = 1, mv = {1, 8, 0}, xi = DiagnosticEventRequestOuterClass.DiagnosticEventType.DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_QUALITY_INIT_STARTED_VALUE)
public final class BannerBridge$onBannerLoaded$1$2 implements Listeners {
    final /* synthetic */ BannerView $bannerAdView;
    final /* synthetic */ BannerView.IListener $bannerListener;

    public BannerBridge$onBannerLoaded$1$2(BannerView.IListener iListener, BannerView bannerView) {
        this.$bannerListener = iListener;
        this.$bannerAdView = bannerView;
    }

    @Override // com.unity3d.ads.core.data.model.Listeners
    public void onClick(String placementId) {
        n.f(placementId, "placementId");
        BannerView.IListener iListener = this.$bannerListener;
        if (iListener != null) {
            iListener.onBannerClick(this.$bannerAdView);
        }
    }

    @Override // com.unity3d.ads.core.data.model.Listeners
    public void onComplete(String placementId, UnityAds.UnityAdsShowCompletionState state) {
        n.f(placementId, "placementId");
        n.f(state, "state");
    }

    @Override // com.unity3d.ads.core.data.model.Listeners
    public void onError(String placementId, UnityAds.UnityAdsShowError error, String message) {
        n.f(placementId, "placementId");
        n.f(error, "error");
        n.f(message, "message");
        if (this.$bannerListener instanceof BannerShowListenerWithOnFailedToShow) {
            BannerErrorInfo bannerErrorInfo = BannerErrorInfo.fromShowError(error, message);
            BannerView.IListener iListener = this.$bannerListener;
            n.d(iListener, "null cannot be cast to non-null type com.unity3d.ads.BannerShowListenerWithOnFailedToShow");
            BannerView bannerView = this.$bannerAdView;
            n.e(bannerErrorInfo, "bannerErrorInfo");
            ((BannerShowListenerWithOnFailedToShow) iListener).onBannerFailedToShow(bannerView, bannerErrorInfo);
        }
    }

    @Override // com.unity3d.ads.core.data.model.Listeners
    public void onLeftApplication(String placementId) {
        n.f(placementId, "placementId");
        BannerView.IListener iListener = this.$bannerListener;
        if (iListener != null) {
            iListener.onBannerLeftApplication(this.$bannerAdView);
        }
    }

    @Override // com.unity3d.ads.core.data.model.Listeners
    public void onRewarded(String str) {
        Listeners.DefaultImpls.onRewarded(this, str);
    }

    @Override // com.unity3d.ads.core.data.model.Listeners
    public void onStart(String placementId) {
        n.f(placementId, "placementId");
        BannerView.IListener iListener = this.$bannerListener;
        if (iListener != null) {
            iListener.onBannerShown(this.$bannerAdView);
        }
    }
}
