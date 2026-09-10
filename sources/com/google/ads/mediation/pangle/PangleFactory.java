package com.google.ads.mediation.pangle;

import com.bytedance.sdk.openadsdk.api.banner.PAGBannerRequest;
import com.bytedance.sdk.openadsdk.api.banner.PAGBannerSize;
import com.bytedance.sdk.openadsdk.api.init.PAGConfig;
import com.bytedance.sdk.openadsdk.api.interstitial.PAGInterstitialRequest;
import com.bytedance.sdk.openadsdk.api.nativeAd.PAGNativeRequest;
import com.bytedance.sdk.openadsdk.api.open.PAGAppOpenRequest;
import com.bytedance.sdk.openadsdk.api.reward.PAGRewardedRequest;
import com.google.ads.mediation.pangle.renderer.PangleAppOpenAd;
import com.google.ads.mediation.pangle.renderer.PangleBannerAd;
import com.google.ads.mediation.pangle.renderer.PangleInterstitialAd;
import com.google.ads.mediation.pangle.renderer.PangleNativeAd;
import com.google.ads.mediation.pangle.renderer.PangleRewardedAd;
import com.google.android.gms.ads.mediation.MediationAdLoadCallback;
import com.google.android.gms.ads.mediation.MediationAppOpenAd;
import com.google.android.gms.ads.mediation.MediationAppOpenAdCallback;
import com.google.android.gms.ads.mediation.MediationBannerAd;
import com.google.android.gms.ads.mediation.MediationBannerAdCallback;
import com.google.android.gms.ads.mediation.MediationInterstitialAd;
import com.google.android.gms.ads.mediation.MediationInterstitialAdCallback;
import com.google.android.gms.ads.mediation.MediationNativeAdCallback;
import com.google.android.gms.ads.mediation.MediationRewardedAd;
import com.google.android.gms.ads.mediation.MediationRewardedAdCallback;
import com.google.android.gms.ads.mediation.UnifiedNativeAdMapper;

/* JADX INFO: loaded from: classes2.dex */
public class PangleFactory {
    public PAGConfig.Builder attabal() {
        return new PAGConfig.Builder();
    }

    public PangleRewardedAd beachfront(MediationAdLoadCallback<MediationRewardedAd, MediationRewardedAdCallback> mediationAdLoadCallback, PangleInitializer pangleInitializer, PangleSdkWrapper pangleSdkWrapper) {
        return new PangleRewardedAd(mediationAdLoadCallback, pangleInitializer, pangleSdkWrapper, this);
    }

    public PAGAppOpenRequest createPagAppOpenRequest() {
        return new PAGAppOpenRequest();
    }

    public PAGBannerRequest createPagBannerRequest(PAGBannerSize pAGBannerSize) {
        return new PAGBannerRequest(pAGBannerSize);
    }

    public PAGInterstitialRequest createPagInterstitialRequest() {
        return new PAGInterstitialRequest();
    }

    public PAGNativeRequest createPagNativeRequest() {
        return new PAGNativeRequest();
    }

    public PAGRewardedRequest createPagRewardedRequest() {
        return new PAGRewardedRequest();
    }

    public PangleBannerAd dern(MediationAdLoadCallback<MediationBannerAd, MediationBannerAdCallback> mediationAdLoadCallback, PangleInitializer pangleInitializer, PangleSdkWrapper pangleSdkWrapper) {
        return new PangleBannerAd(mediationAdLoadCallback, pangleInitializer, pangleSdkWrapper, this);
    }

    public PangleNativeAd marial(MediationAdLoadCallback<UnifiedNativeAdMapper, MediationNativeAdCallback> mediationAdLoadCallback, PangleInitializer pangleInitializer, PangleSdkWrapper pangleSdkWrapper) {
        return new PangleNativeAd(mediationAdLoadCallback, pangleInitializer, pangleSdkWrapper, this);
    }

    public PangleAppOpenAd saneness(MediationAdLoadCallback<MediationAppOpenAd, MediationAppOpenAdCallback> mediationAdLoadCallback, PangleInitializer pangleInitializer, PangleSdkWrapper pangleSdkWrapper) {
        return new PangleAppOpenAd(mediationAdLoadCallback, pangleInitializer, pangleSdkWrapper, this);
    }

    public PangleInterstitialAd wireman(MediationAdLoadCallback<MediationInterstitialAd, MediationInterstitialAdCallback> mediationAdLoadCallback, PangleInitializer pangleInitializer, PangleSdkWrapper pangleSdkWrapper) {
        return new PangleInterstitialAd(mediationAdLoadCallback, pangleInitializer, pangleSdkWrapper, this);
    }
}
