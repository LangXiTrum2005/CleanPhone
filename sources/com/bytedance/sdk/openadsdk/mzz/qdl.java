package com.bytedance.sdk.openadsdk.mzz;

import android.text.TextUtils;
import com.bytedance.sdk.component.jpc.jpc;
import com.bytedance.sdk.component.utils.aaj;
import com.bytedance.sdk.openadsdk.AdSlot;
import com.bytedance.sdk.openadsdk.api.banner.PAGBannerAdLoadListener;
import com.bytedance.sdk.openadsdk.api.banner.PAGBannerRequest;
import com.bytedance.sdk.openadsdk.api.banner.PAGBannerSize;
import com.bytedance.sdk.openadsdk.api.factory.IADLoader;
import com.bytedance.sdk.openadsdk.api.factory.IADTypeLoaderFactory;
import com.bytedance.sdk.openadsdk.api.interstitial.PAGInterstitialAdLoadListener;
import com.bytedance.sdk.openadsdk.api.interstitial.PAGInterstitialRequest;
import com.bytedance.sdk.openadsdk.api.nativeAd.PAGNativeAdLoadListener;
import com.bytedance.sdk.openadsdk.api.nativeAd.PAGNativeRequest;
import com.bytedance.sdk.openadsdk.api.open.PAGAppOpenAdLoadListener;
import com.bytedance.sdk.openadsdk.api.open.PAGAppOpenRequest;
import com.bytedance.sdk.openadsdk.api.reward.PAGRewardedAdLoadListener;
import com.bytedance.sdk.openadsdk.api.reward.PAGRewardedRequest;
import com.bytedance.sdk.openadsdk.component.lnr.ud;
import com.bytedance.sdk.openadsdk.component.reward.exu;
import com.bytedance.sdk.openadsdk.component.reward.mzz;
import com.bytedance.sdk.openadsdk.core.tvp.wd;
import com.bytedance.sdk.openadsdk.core.yt;
import com.bytedance.sdk.openadsdk.utils.ax;
import com.bytedance.sdk.openadsdk.utils.gy;

/* JADX INFO: loaded from: classes3.dex */
public class qdl implements IADTypeLoaderFactory {
    @Override // com.bytedance.sdk.openadsdk.api.factory.IADTypeLoaderFactory
    public IADLoader<PAGBannerRequest, PAGBannerAdLoadListener> createBannerAdLoader() {
        return new IADLoader<PAGBannerRequest, PAGBannerAdLoadListener>() { // from class: com.bytedance.sdk.openadsdk.mzz.qdl.2
            @Override // com.bytedance.sdk.openadsdk.api.factory.IADLoader
            /* JADX INFO: renamed from: qdl, reason: merged with bridge method [inline-methods] */
            public void loadAd(String str, final PAGBannerRequest pAGBannerRequest, PAGBannerAdLoadListener pAGBannerAdLoadListener) {
                if (com.bytedance.sdk.openadsdk.qdl.qdl.qdl(str, pAGBannerRequest, pAGBannerAdLoadListener)) {
                    return;
                }
                AdSlot.Builder codeId = new AdSlot.Builder().setCodeId(str);
                com.bytedance.sdk.openadsdk.qdl.qdl.qdl(codeId, pAGBannerRequest);
                if (!TextUtils.isEmpty(pAGBannerRequest.getAdString())) {
                    codeId.withBid(pAGBannerRequest.getAdString());
                }
                final PAGBannerSize adSize = pAGBannerRequest.getAdSize();
                if (adSize != null) {
                    if (adSize.getType() == 3) {
                        codeId.setExpressViewAcceptedSize(adSize.getWidth(), adSize.getMaxHeight());
                    } else {
                        codeId.setExpressViewAcceptedSize(adSize.getWidth(), adSize.getHeight());
                    }
                    codeId.setBannerType(adSize.getType());
                }
                final AdSlot adSlotBuild = codeId.setRequestExtraMap(pAGBannerRequest.getExtraInfo()).build();
                final com.bytedance.sdk.openadsdk.qdl.qdl.qdl qdlVar = new com.bytedance.sdk.openadsdk.qdl.qdl.qdl(pAGBannerAdLoadListener);
                com.bytedance.sdk.openadsdk.qdl.qdl.qdl(new jpc("loadBannerExpressAd") { // from class: com.bytedance.sdk.openadsdk.mzz.qdl.2.1
                    @Override // java.lang.Runnable
                    public void run() {
                        if (!yt.mml().yt() && gy.bqt()) {
                            qdlVar.onError(-18, "Blind mode does not allow requesting ads");
                            return;
                        }
                        if (com.bytedance.sdk.openadsdk.qdl.qdl.qdl(qdlVar)) {
                            return;
                        }
                        PAGBannerSize pAGBannerSize = adSize;
                        if (pAGBannerSize != null && ((pAGBannerSize.getType() == 2 || adSize.getType() == 3) && TextUtils.isEmpty(pAGBannerRequest.getAdString()))) {
                            int iMml = ax.mml(yt.qdl());
                            int iWd = ax.wd(yt.qdl());
                            int height = adSize.getType() == 2 ? adSize.getHeight() : adSize.getMaxHeight();
                            if (adSize.getWidth() > iMml || adSize.getWidth() <= 0 || height > iWd || height < 0) {
                                qdlVar.onError(-19, "The banner size invalid width=" + adSize.getWidth() + ",height=" + height);
                                return;
                            }
                        }
                        AdSlot adSlot = adSlotBuild;
                        if (adSlot == null) {
                            qdlVar.onError(-4, "adslot is null");
                        } else {
                            adSlot.setDurationSlotType(1);
                            wd.qdl(yt.qdl()).qdl(adSlotBuild, 1, qdlVar);
                        }
                    }
                }, qdlVar, adSlotBuild);
            }
        };
    }

    @Override // com.bytedance.sdk.openadsdk.api.factory.IADTypeLoaderFactory
    public IADLoader<PAGInterstitialRequest, PAGInterstitialAdLoadListener> createInterstitialAdLoader() {
        return new IADLoader<PAGInterstitialRequest, PAGInterstitialAdLoadListener>() { // from class: com.bytedance.sdk.openadsdk.mzz.qdl.5
            @Override // com.bytedance.sdk.openadsdk.api.factory.IADLoader
            /* JADX INFO: renamed from: qdl, reason: merged with bridge method [inline-methods] */
            public void loadAd(String str, PAGInterstitialRequest pAGInterstitialRequest, PAGInterstitialAdLoadListener pAGInterstitialAdLoadListener) {
                if (com.bytedance.sdk.openadsdk.qdl.qdl.qdl(str, pAGInterstitialRequest, pAGInterstitialAdLoadListener)) {
                    return;
                }
                AdSlot.Builder codeId = new AdSlot.Builder().setRequestExtraMap(pAGInterstitialRequest.getExtraInfo()).setCodeId(str);
                com.bytedance.sdk.openadsdk.qdl.qdl.qdl(codeId, pAGInterstitialRequest);
                if (!TextUtils.isEmpty(pAGInterstitialRequest.getAdString())) {
                    codeId.withBid(pAGInterstitialRequest.getAdString());
                }
                final AdSlot adSlotBuild = codeId.build();
                final com.bytedance.sdk.openadsdk.qdl.lnr.qdl qdlVar = new com.bytedance.sdk.openadsdk.qdl.lnr.qdl(pAGInterstitialAdLoadListener);
                com.bytedance.sdk.openadsdk.qdl.qdl.qdl(new jpc("loadInterstitialAd") { // from class: com.bytedance.sdk.openadsdk.mzz.qdl.5.1
                    @Override // java.lang.Runnable
                    public void run() {
                        if (!yt.mml().yt() && gy.bqt()) {
                            qdlVar.onError(-18, "Blind mode does not allow requesting ads");
                            return;
                        }
                        if (com.bytedance.sdk.openadsdk.qdl.qdl.qdl(qdlVar)) {
                            return;
                        }
                        AdSlot adSlot = adSlotBuild;
                        if (adSlot == null) {
                            qdlVar.onError(-4, "adslot is null");
                            return;
                        }
                        try {
                            adSlot.setDurationSlotType(8);
                            mzz.qdl(yt.qdl()).qdl(adSlotBuild, new ud(qdlVar));
                        } catch (Throwable unused) {
                        }
                    }
                }, qdlVar, adSlotBuild);
            }
        };
    }

    @Override // com.bytedance.sdk.openadsdk.api.factory.IADTypeLoaderFactory
    public IADLoader<PAGNativeRequest, PAGNativeAdLoadListener> createNativeAdLoader() {
        return new IADLoader<PAGNativeRequest, PAGNativeAdLoadListener>() { // from class: com.bytedance.sdk.openadsdk.mzz.qdl.3
            @Override // com.bytedance.sdk.openadsdk.api.factory.IADLoader
            /* JADX INFO: renamed from: qdl, reason: merged with bridge method [inline-methods] */
            public void loadAd(String str, PAGNativeRequest pAGNativeRequest, PAGNativeAdLoadListener pAGNativeAdLoadListener) {
                if (com.bytedance.sdk.openadsdk.qdl.qdl.qdl(str, pAGNativeRequest, pAGNativeAdLoadListener)) {
                    return;
                }
                final com.bytedance.sdk.openadsdk.qdl.ud.mzz mzzVar = new com.bytedance.sdk.openadsdk.qdl.ud.mzz(pAGNativeAdLoadListener);
                AdSlot.Builder builderWithBid = new AdSlot.Builder().setCodeId(str).withBid(pAGNativeRequest != null ? pAGNativeRequest.getAdString() : null);
                com.bytedance.sdk.openadsdk.qdl.qdl.qdl(builderWithBid, pAGNativeRequest);
                final AdSlot adSlotBuild = builderWithBid.setRequestExtraMap(pAGNativeRequest.getExtraInfo()).build();
                com.bytedance.sdk.openadsdk.qdl.qdl.qdl(new jpc("loadFeedAd") { // from class: com.bytedance.sdk.openadsdk.mzz.qdl.3.1
                    @Override // java.lang.Runnable
                    public void run() {
                        if (!yt.mml().yt() && gy.bqt()) {
                            mzzVar.onError(-18, "Blind mode does not allow requesting ads");
                            return;
                        }
                        if (com.bytedance.sdk.openadsdk.qdl.qdl.qdl(mzzVar)) {
                            return;
                        }
                        AdSlot adSlot = adSlotBuild;
                        if (adSlot == null) {
                            mzzVar.onError(-4, "adslot is null");
                            return;
                        }
                        try {
                            adSlot.setDurationSlotType(5);
                            com.bytedance.sdk.openadsdk.component.ud.qdl.qdl().qdl(yt.qdl(), adSlotBuild, mzzVar);
                        } catch (Throwable unused) {
                        }
                    }
                }, mzzVar, adSlotBuild);
            }
        };
    }

    @Override // com.bytedance.sdk.openadsdk.api.factory.IADTypeLoaderFactory
    public IADLoader<PAGAppOpenRequest, PAGAppOpenAdLoadListener> createOpenAdLoader() {
        return new IADLoader<PAGAppOpenRequest, PAGAppOpenAdLoadListener>() { // from class: com.bytedance.sdk.openadsdk.mzz.qdl.1
            private int ud;

            @Override // com.bytedance.sdk.openadsdk.api.factory.IADLoader
            /* JADX INFO: renamed from: qdl, reason: merged with bridge method [inline-methods] */
            public void loadAd(String str, PAGAppOpenRequest pAGAppOpenRequest, PAGAppOpenAdLoadListener pAGAppOpenAdLoadListener) {
                if (com.bytedance.sdk.openadsdk.qdl.qdl.qdl(str, pAGAppOpenRequest, pAGAppOpenAdLoadListener)) {
                    return;
                }
                AdSlot.Builder builder = new AdSlot.Builder();
                com.bytedance.sdk.openadsdk.qdl.qdl.qdl(builder, pAGAppOpenRequest);
                if (!TextUtils.isEmpty(pAGAppOpenRequest.getAdString())) {
                    builder.withBid(pAGAppOpenRequest.getAdString());
                }
                final AdSlot adSlotBuild = builder.setCodeId(str).setRequestExtraMap(pAGAppOpenRequest.getExtraInfo()).build();
                this.ud = pAGAppOpenRequest.getTimeout();
                final com.bytedance.sdk.openadsdk.qdl.mml.qdl qdlVar = new com.bytedance.sdk.openadsdk.qdl.mml.qdl(pAGAppOpenAdLoadListener);
                com.bytedance.sdk.openadsdk.qdl.qdl.qdl(new jpc("loadSplashAd") { // from class: com.bytedance.sdk.openadsdk.mzz.qdl.1.1
                    @Override // java.lang.Runnable
                    public void run() {
                        try {
                            if (!yt.mml().yt() && gy.bqt()) {
                                qdlVar.onError(-18, "Blind mode does not allow requesting ads");
                                return;
                            }
                            if (com.bytedance.sdk.openadsdk.qdl.qdl.qdl(qdlVar)) {
                                return;
                            }
                            AdSlot adSlot = adSlotBuild;
                            if (adSlot == null) {
                                qdlVar.onError(-4, "adslot is null");
                            } else {
                                adSlot.setDurationSlotType(3);
                                com.bytedance.sdk.openadsdk.component.wd.qdl(yt.qdl()).qdl(adSlotBuild, qdlVar, AnonymousClass1.this.ud);
                            }
                        } catch (Throwable th) {
                            aaj.qdl("ADNFactory", "open component maybe not exist, please check", th);
                        }
                    }
                }, qdlVar, adSlotBuild);
            }
        };
    }

    @Override // com.bytedance.sdk.openadsdk.api.factory.IADTypeLoaderFactory
    public IADLoader<PAGRewardedRequest, PAGRewardedAdLoadListener> createRewardAdLoader() {
        return new IADLoader<PAGRewardedRequest, PAGRewardedAdLoadListener>() { // from class: com.bytedance.sdk.openadsdk.mzz.qdl.4
            @Override // com.bytedance.sdk.openadsdk.api.factory.IADLoader
            /* JADX INFO: renamed from: qdl, reason: merged with bridge method [inline-methods] */
            public void loadAd(String str, PAGRewardedRequest pAGRewardedRequest, PAGRewardedAdLoadListener pAGRewardedAdLoadListener) {
                if (com.bytedance.sdk.openadsdk.qdl.qdl.qdl(str, pAGRewardedRequest, pAGRewardedAdLoadListener)) {
                    return;
                }
                AdSlot.Builder codeId = new AdSlot.Builder().setCodeId(str);
                if (!TextUtils.isEmpty(pAGRewardedRequest.getAdString())) {
                    codeId.withBid(pAGRewardedRequest.getAdString());
                }
                com.bytedance.sdk.openadsdk.qdl.qdl.qdl(codeId, pAGRewardedRequest);
                final AdSlot adSlotBuild = codeId.setRequestExtraMap(pAGRewardedRequest.getExtraInfo()).build();
                final com.bytedance.sdk.openadsdk.qdl.mzz.ud udVar = new com.bytedance.sdk.openadsdk.qdl.mzz.ud(pAGRewardedAdLoadListener);
                com.bytedance.sdk.openadsdk.qdl.qdl.qdl(new jpc("loadRewardVideoAd") { // from class: com.bytedance.sdk.openadsdk.mzz.qdl.4.1
                    @Override // java.lang.Runnable
                    public void run() {
                        if (!yt.mml().yt() && gy.bqt()) {
                            udVar.onError(-18, "Blind mode does not allow requesting ads");
                            return;
                        }
                        if (com.bytedance.sdk.openadsdk.qdl.qdl.qdl(udVar)) {
                            return;
                        }
                        AdSlot adSlot = adSlotBuild;
                        if (adSlot == null) {
                            udVar.onError(-4, "adslot is null");
                            return;
                        }
                        try {
                            adSlot.setDurationSlotType(7);
                            exu.qdl(yt.qdl()).qdl(adSlotBuild, new com.bytedance.sdk.openadsdk.component.reward.wd(udVar));
                        } catch (Throwable unused) {
                        }
                    }
                }, udVar, adSlotBuild);
            }
        };
    }
}
