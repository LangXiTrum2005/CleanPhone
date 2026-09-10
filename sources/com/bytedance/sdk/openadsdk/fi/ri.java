package com.bytedance.sdk.openadsdk.fi;

import android.text.TextUtils;
import com.bytedance.sdk.component.mj.lr.ik;
import com.bytedance.sdk.component.utils.ac;
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
import com.bytedance.sdk.openadsdk.component.reward.bu;
import com.bytedance.sdk.openadsdk.component.reward.di;
import com.bytedance.sdk.openadsdk.component.reward.jbs;
import com.bytedance.sdk.openadsdk.component.reward.slm;
import com.bytedance.sdk.openadsdk.core.jbs.xha;
import com.bytedance.sdk.openadsdk.core.nr;
import com.bytedance.sdk.openadsdk.ri.lr.fi;
import com.bytedance.sdk.openadsdk.utils.ig;
import com.bytedance.sdk.openadsdk.utils.lr;
import com.bytedance.sdk.openadsdk.utils.qd;

/* JADX INFO: loaded from: classes2.dex */
public class ri implements IADTypeLoaderFactory {
    @Override // com.bytedance.sdk.openadsdk.api.factory.IADTypeLoaderFactory
    public IADLoader<PAGBannerRequest, PAGBannerAdLoadListener> createBannerAdLoader() {
        return new IADLoader<PAGBannerRequest, PAGBannerAdLoadListener>() { // from class: com.bytedance.sdk.openadsdk.fi.ri.2
            @Override // com.bytedance.sdk.openadsdk.api.factory.IADLoader
            /* JADX INFO: renamed from: ri, reason: merged with bridge method [inline-methods] */
            public void loadAd(String str, final PAGBannerRequest pAGBannerRequest, PAGBannerAdLoadListener pAGBannerAdLoadListener) {
                if (com.bytedance.sdk.openadsdk.ri.ri.ri(str, pAGBannerRequest, pAGBannerAdLoadListener)) {
                    return;
                }
                AdSlot.Builder codeId = new AdSlot.Builder().setCodeId(str);
                com.bytedance.sdk.openadsdk.ri.ri.ri(codeId, pAGBannerRequest);
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
                final com.bytedance.sdk.openadsdk.ri.ri.ri riVar = new com.bytedance.sdk.openadsdk.ri.ri.ri(pAGBannerAdLoadListener);
                com.bytedance.sdk.openadsdk.ri.ri.ri(new ik("loadBannerExpressAd") { // from class: com.bytedance.sdk.openadsdk.fi.ri.2.1
                    @Override // java.lang.Runnable
                    public void run() {
                        if (!nr.ka().slm() && ig.igq()) {
                            riVar.onError(-18, "Blind mode does not allow requesting ads");
                            return;
                        }
                        if (com.bytedance.sdk.openadsdk.ri.ri.ri(riVar)) {
                            return;
                        }
                        PAGBannerSize pAGBannerSize = adSize;
                        if (pAGBannerSize != null && ((pAGBannerSize.getType() == 2 || adSize.getType() == 3) && TextUtils.isEmpty(pAGBannerRequest.getAdString()))) {
                            int iKa = qd.ka(nr.ri());
                            int iXha = qd.xha(nr.ri());
                            int height = adSize.getType() == 2 ? adSize.getHeight() : adSize.getMaxHeight();
                            if (adSize.getWidth() > iKa || adSize.getWidth() <= 0 || height > iXha || height < 0) {
                                riVar.onError(-19, "The banner size invalid width=" + adSize.getWidth() + ",height=" + height);
                                return;
                            }
                        }
                        AdSlot adSlot = adSlotBuild;
                        if (adSlot == null) {
                            riVar.onError(-4, "adslot is null");
                        } else {
                            adSlot.setDurationSlotType(1);
                            xha.ri(nr.ri()).ri(adSlotBuild, 1, riVar);
                        }
                    }
                }, riVar, adSlotBuild);
            }
        };
    }

    @Override // com.bytedance.sdk.openadsdk.api.factory.IADTypeLoaderFactory
    public IADLoader<PAGInterstitialRequest, PAGInterstitialAdLoadListener> createInterstitialAdLoader() {
        return new IADLoader<PAGInterstitialRequest, PAGInterstitialAdLoadListener>() { // from class: com.bytedance.sdk.openadsdk.fi.ri.5
            @Override // com.bytedance.sdk.openadsdk.api.factory.IADLoader
            /* JADX INFO: renamed from: ri, reason: merged with bridge method [inline-methods] */
            public void loadAd(String str, PAGInterstitialRequest pAGInterstitialRequest, PAGInterstitialAdLoadListener pAGInterstitialAdLoadListener) {
                if (com.bytedance.sdk.openadsdk.ri.ri.ri(str, pAGInterstitialRequest, pAGInterstitialAdLoadListener)) {
                    return;
                }
                AdSlot.Builder codeId = new AdSlot.Builder().setRequestExtraMap(pAGInterstitialRequest.getExtraInfo()).setCodeId(str);
                com.bytedance.sdk.openadsdk.ri.ri.ri(codeId, pAGInterstitialRequest);
                if (!TextUtils.isEmpty(pAGInterstitialRequest.getAdString())) {
                    codeId.withBid(pAGInterstitialRequest.getAdString());
                }
                final AdSlot adSlotBuild = codeId.build();
                final com.bytedance.sdk.openadsdk.ri.ik.ri riVar = new com.bytedance.sdk.openadsdk.ri.ik.ri(pAGInterstitialAdLoadListener);
                com.bytedance.sdk.openadsdk.ri.ri.ri(new ik("loadInterstitialAd") { // from class: com.bytedance.sdk.openadsdk.fi.ri.5.1
                    @Override // java.lang.Runnable
                    public void run() {
                        if (!nr.ka().slm() && ig.igq()) {
                            riVar.onError(-18, "Blind mode does not allow requesting ads");
                            return;
                        }
                        if (com.bytedance.sdk.openadsdk.ri.ri.ri(riVar)) {
                            return;
                        }
                        AdSlot adSlot = adSlotBuild;
                        if (adSlot == null) {
                            riVar.onError(-4, "adslot is null");
                            return;
                        }
                        try {
                            adSlot.setDurationSlotType(8);
                            if (lr.lr()) {
                                com.bytedance.sdk.openadsdk.component.reward.xha.ri(nr.ri()).ri(adSlotBuild, new com.bytedance.sdk.openadsdk.component.ik.lr(riVar));
                            } else {
                                di.ri(nr.ri()).ri(adSlotBuild, new com.bytedance.sdk.openadsdk.component.ik.lr(riVar));
                            }
                        } catch (Throwable unused) {
                        }
                    }
                }, riVar, adSlotBuild);
            }
        };
    }

    @Override // com.bytedance.sdk.openadsdk.api.factory.IADTypeLoaderFactory
    public IADLoader<PAGNativeRequest, PAGNativeAdLoadListener> createNativeAdLoader() {
        return new IADLoader<PAGNativeRequest, PAGNativeAdLoadListener>() { // from class: com.bytedance.sdk.openadsdk.fi.ri.3
            @Override // com.bytedance.sdk.openadsdk.api.factory.IADLoader
            /* JADX INFO: renamed from: ri, reason: merged with bridge method [inline-methods] */
            public void loadAd(String str, PAGNativeRequest pAGNativeRequest, PAGNativeAdLoadListener pAGNativeAdLoadListener) {
                if (com.bytedance.sdk.openadsdk.ri.ri.ri(str, pAGNativeRequest, pAGNativeAdLoadListener)) {
                    return;
                }
                final fi fiVar = new fi(pAGNativeAdLoadListener);
                AdSlot.Builder builderWithBid = new AdSlot.Builder().setCodeId(str).withBid(pAGNativeRequest != null ? pAGNativeRequest.getAdString() : null);
                com.bytedance.sdk.openadsdk.ri.ri.ri(builderWithBid, pAGNativeRequest);
                final AdSlot adSlotBuild = builderWithBid.setRequestExtraMap(pAGNativeRequest.getExtraInfo()).build();
                com.bytedance.sdk.openadsdk.ri.ri.ri(new ik("loadFeedAd") { // from class: com.bytedance.sdk.openadsdk.fi.ri.3.1
                    @Override // java.lang.Runnable
                    public void run() {
                        if (!nr.ka().slm() && ig.igq()) {
                            fiVar.onError(-18, "Blind mode does not allow requesting ads");
                            return;
                        }
                        if (com.bytedance.sdk.openadsdk.ri.ri.ri(fiVar)) {
                            return;
                        }
                        AdSlot adSlot = adSlotBuild;
                        if (adSlot == null) {
                            fiVar.onError(-4, "adslot is null");
                            return;
                        }
                        try {
                            adSlot.setDurationSlotType(5);
                            com.bytedance.sdk.openadsdk.component.lr.ri.ri().ri(nr.ri(), adSlotBuild, fiVar);
                        } catch (Throwable unused) {
                        }
                    }
                }, fiVar, adSlotBuild);
            }
        };
    }

    @Override // com.bytedance.sdk.openadsdk.api.factory.IADTypeLoaderFactory
    public IADLoader<PAGAppOpenRequest, PAGAppOpenAdLoadListener> createOpenAdLoader() {
        return new IADLoader<PAGAppOpenRequest, PAGAppOpenAdLoadListener>() { // from class: com.bytedance.sdk.openadsdk.fi.ri.1
            private int lr;

            @Override // com.bytedance.sdk.openadsdk.api.factory.IADLoader
            /* JADX INFO: renamed from: ri, reason: merged with bridge method [inline-methods] */
            public void loadAd(String str, PAGAppOpenRequest pAGAppOpenRequest, PAGAppOpenAdLoadListener pAGAppOpenAdLoadListener) {
                if (com.bytedance.sdk.openadsdk.ri.ri.ri(str, pAGAppOpenRequest, pAGAppOpenAdLoadListener)) {
                    return;
                }
                AdSlot.Builder builder = new AdSlot.Builder();
                com.bytedance.sdk.openadsdk.ri.ri.ri(builder, pAGAppOpenRequest);
                if (!TextUtils.isEmpty(pAGAppOpenRequest.getAdString())) {
                    builder.withBid(pAGAppOpenRequest.getAdString());
                }
                final AdSlot adSlotBuild = builder.setCodeId(str).setRequestExtraMap(pAGAppOpenRequest.getExtraInfo()).build();
                this.lr = pAGAppOpenRequest.getTimeout();
                final com.bytedance.sdk.openadsdk.ri.ka.ri riVar = new com.bytedance.sdk.openadsdk.ri.ka.ri(pAGAppOpenAdLoadListener);
                com.bytedance.sdk.openadsdk.ri.ri.ri(new ik("loadSplashAd") { // from class: com.bytedance.sdk.openadsdk.fi.ri.1.1
                    @Override // java.lang.Runnable
                    public void run() {
                        try {
                            if (!nr.ka().slm() && ig.igq()) {
                                riVar.onError(-18, "Blind mode does not allow requesting ads");
                                return;
                            }
                            if (com.bytedance.sdk.openadsdk.ri.ri.ri(riVar)) {
                                return;
                            }
                            AdSlot adSlot = adSlotBuild;
                            if (adSlot == null) {
                                riVar.onError(-4, "adslot is null");
                            } else {
                                adSlot.setDurationSlotType(3);
                                com.bytedance.sdk.openadsdk.component.xha.ri(nr.ri()).ri(adSlotBuild, riVar, AnonymousClass1.this.lr);
                            }
                        } catch (Throwable th) {
                            ac.ri("ADNFactory", "open component maybe not exist, please check", th);
                        }
                    }
                }, riVar, adSlotBuild);
            }
        };
    }

    @Override // com.bytedance.sdk.openadsdk.api.factory.IADTypeLoaderFactory
    public IADLoader<PAGRewardedRequest, PAGRewardedAdLoadListener> createRewardAdLoader() {
        return new IADLoader<PAGRewardedRequest, PAGRewardedAdLoadListener>() { // from class: com.bytedance.sdk.openadsdk.fi.ri.4
            @Override // com.bytedance.sdk.openadsdk.api.factory.IADLoader
            /* JADX INFO: renamed from: ri, reason: merged with bridge method [inline-methods] */
            public void loadAd(String str, PAGRewardedRequest pAGRewardedRequest, PAGRewardedAdLoadListener pAGRewardedAdLoadListener) {
                if (com.bytedance.sdk.openadsdk.ri.ri.ri(str, pAGRewardedRequest, pAGRewardedAdLoadListener)) {
                    return;
                }
                AdSlot.Builder codeId = new AdSlot.Builder().setCodeId(str);
                if (!TextUtils.isEmpty(pAGRewardedRequest.getAdString())) {
                    codeId.withBid(pAGRewardedRequest.getAdString());
                }
                com.bytedance.sdk.openadsdk.ri.ri.ri(codeId, pAGRewardedRequest);
                final AdSlot adSlotBuild = codeId.setRequestExtraMap(pAGRewardedRequest.getExtraInfo()).build();
                final com.bytedance.sdk.openadsdk.ri.fi.lr lrVar = new com.bytedance.sdk.openadsdk.ri.fi.lr(pAGRewardedAdLoadListener);
                com.bytedance.sdk.openadsdk.ri.ri.ri(new ik("loadRewardVideoAd") { // from class: com.bytedance.sdk.openadsdk.fi.ri.4.1
                    @Override // java.lang.Runnable
                    public void run() {
                        if (!nr.ka().slm() && ig.igq()) {
                            lrVar.onError(-18, "Blind mode does not allow requesting ads");
                            return;
                        }
                        if (com.bytedance.sdk.openadsdk.ri.ri.ri(lrVar)) {
                            return;
                        }
                        AdSlot adSlot = adSlotBuild;
                        if (adSlot == null) {
                            lrVar.onError(-4, "adslot is null");
                            return;
                        }
                        try {
                            adSlot.setDurationSlotType(7);
                            if (lr.lr()) {
                                bu.ri(nr.ri()).ri(adSlotBuild, new jbs(lrVar));
                            } else {
                                slm.ri(nr.ri()).ri(adSlotBuild, new jbs(lrVar));
                            }
                        } catch (Throwable unused) {
                        }
                    }
                }, lrVar, adSlotBuild);
            }
        };
    }
}
