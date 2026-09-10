package com.bytedance.sdk.openadsdk.JXs;

import android.content.Context;
import android.text.TextUtils;
import com.bytedance.sdk.component.OY.OY;
import com.bytedance.sdk.component.utils.eK;
import com.bytedance.sdk.component.utils.sLN;
import com.bytedance.sdk.openadsdk.AdSlot;
import com.bytedance.sdk.openadsdk.Lxb.JXs.LD;
import com.bytedance.sdk.openadsdk.Lxb.LD.JXs;
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
import com.bytedance.sdk.openadsdk.core.OY.ebl;
import com.bytedance.sdk.openadsdk.core.kqm;
import com.bytedance.sdk.openadsdk.utils.nJ;
import java.lang.reflect.Method;

/* JADX INFO: loaded from: classes2.dex */
public class Lxb implements IADTypeLoaderFactory {
    @Override // com.bytedance.sdk.openadsdk.api.factory.IADTypeLoaderFactory
    public IADLoader<PAGBannerRequest, PAGBannerAdLoadListener> createBannerAdLoader() {
        return new IADLoader<PAGBannerRequest, PAGBannerAdLoadListener>() { // from class: com.bytedance.sdk.openadsdk.JXs.Lxb.2
            @Override // com.bytedance.sdk.openadsdk.api.factory.IADLoader
            /* JADX INFO: renamed from: Lxb, reason: merged with bridge method [inline-methods] */
            public void loadAd(String str, PAGBannerRequest pAGBannerRequest, PAGBannerAdLoadListener pAGBannerAdLoadListener) {
                if (com.bytedance.sdk.openadsdk.Lxb.Lxb.Lxb(str, pAGBannerRequest, pAGBannerAdLoadListener)) {
                    return;
                }
                AdSlot.Builder codeId = new AdSlot.Builder().setCodeId(str);
                com.bytedance.sdk.openadsdk.Lxb.Lxb.Lxb(codeId, pAGBannerRequest);
                if (!TextUtils.isEmpty(pAGBannerRequest.getAdString())) {
                    codeId.withBid(pAGBannerRequest.getAdString());
                }
                PAGBannerSize adSize = pAGBannerRequest.getAdSize();
                if (adSize != null) {
                    codeId.setExpressViewAcceptedSize(adSize.getWidth(), adSize.getHeight());
                }
                final AdSlot adSlotBuild = codeId.setRequestExtraMap(pAGBannerRequest.getExtraInfo()).build();
                final com.bytedance.sdk.openadsdk.Lxb.Lxb.Lxb lxb = new com.bytedance.sdk.openadsdk.Lxb.Lxb.Lxb(pAGBannerAdLoadListener);
                com.bytedance.sdk.openadsdk.Lxb.Lxb.Lxb(new OY("loadBannerExpressAd") { // from class: com.bytedance.sdk.openadsdk.JXs.Lxb.2.1
                    @Override // java.lang.Runnable
                    public void run() {
                        if (!kqm.ZU().VVE() && nJ.tD()) {
                            lxb.onError(-18, "Blind mode does not allow requesting ads");
                            return;
                        }
                        if (com.bytedance.sdk.openadsdk.Lxb.Lxb.Lxb(lxb)) {
                            return;
                        }
                        AdSlot adSlot = adSlotBuild;
                        if (adSlot == null) {
                            lxb.onError(-4, "adslot is null");
                            return;
                        }
                        adSlot.setNativeAdType(1);
                        adSlotBuild.setDurationSlotType(1);
                        ebl.Lxb(kqm.Lxb()).Lxb(adSlotBuild, 1, lxb, 5000);
                    }
                }, lxb, adSlotBuild);
            }
        };
    }

    @Override // com.bytedance.sdk.openadsdk.api.factory.IADTypeLoaderFactory
    public IADLoader<PAGInterstitialRequest, PAGInterstitialAdLoadListener> createInterstitialAdLoader() {
        return new IADLoader<PAGInterstitialRequest, PAGInterstitialAdLoadListener>() { // from class: com.bytedance.sdk.openadsdk.JXs.Lxb.5
            @Override // com.bytedance.sdk.openadsdk.api.factory.IADLoader
            /* JADX INFO: renamed from: Lxb, reason: merged with bridge method [inline-methods] */
            public void loadAd(String str, PAGInterstitialRequest pAGInterstitialRequest, PAGInterstitialAdLoadListener pAGInterstitialAdLoadListener) {
                if (com.bytedance.sdk.openadsdk.Lxb.Lxb.Lxb(str, pAGInterstitialRequest, pAGInterstitialAdLoadListener)) {
                    return;
                }
                AdSlot.Builder codeId = new AdSlot.Builder().setRequestExtraMap(pAGInterstitialRequest.getExtraInfo()).setCodeId(str);
                com.bytedance.sdk.openadsdk.Lxb.Lxb.Lxb(codeId, pAGInterstitialRequest);
                if (!TextUtils.isEmpty(pAGInterstitialRequest.getAdString())) {
                    codeId.withBid(pAGInterstitialRequest.getAdString());
                }
                final AdSlot adSlotBuild = codeId.build();
                final com.bytedance.sdk.openadsdk.Lxb.lk.Lxb lxb = new com.bytedance.sdk.openadsdk.Lxb.lk.Lxb(pAGInterstitialAdLoadListener);
                com.bytedance.sdk.openadsdk.Lxb.Lxb.Lxb(new OY("loadInterstitialAd") { // from class: com.bytedance.sdk.openadsdk.JXs.Lxb.5.1
                    @Override // java.lang.Runnable
                    public void run() {
                        if (!kqm.ZU().VVE() && nJ.tD()) {
                            lxb.onError(-18, "Blind mode does not allow requesting ads");
                            return;
                        }
                        if (com.bytedance.sdk.openadsdk.Lxb.Lxb.Lxb(lxb)) {
                            return;
                        }
                        if (adSlotBuild == null) {
                            lxb.onError(-4, "adslot is null");
                            return;
                        }
                        try {
                            Method methodLxb = eK.Lxb("com.bytedance.sdk.openadsdk.TTC3Proxy", "loadFull", Context.class, AdSlot.class, PAGInterstitialAdLoadListener.class);
                            if (methodLxb != null) {
                                methodLxb.invoke(null, kqm.Lxb(), adSlotBuild, lxb);
                            }
                        } catch (Throwable unused) {
                        }
                    }
                }, lxb, adSlotBuild);
            }
        };
    }

    @Override // com.bytedance.sdk.openadsdk.api.factory.IADTypeLoaderFactory
    public IADLoader<PAGNativeRequest, PAGNativeAdLoadListener> createNativeAdLoader() {
        return new IADLoader<PAGNativeRequest, PAGNativeAdLoadListener>() { // from class: com.bytedance.sdk.openadsdk.JXs.Lxb.3
            @Override // com.bytedance.sdk.openadsdk.api.factory.IADLoader
            /* JADX INFO: renamed from: Lxb, reason: merged with bridge method [inline-methods] */
            public void loadAd(String str, PAGNativeRequest pAGNativeRequest, PAGNativeAdLoadListener pAGNativeAdLoadListener) {
                if (com.bytedance.sdk.openadsdk.Lxb.Lxb.Lxb(str, pAGNativeRequest, pAGNativeAdLoadListener)) {
                    return;
                }
                final JXs jXs = new JXs(pAGNativeAdLoadListener);
                AdSlot.Builder builderWithBid = new AdSlot.Builder().setCodeId(str).withBid(pAGNativeRequest != null ? pAGNativeRequest.getAdString() : null);
                com.bytedance.sdk.openadsdk.Lxb.Lxb.Lxb(builderWithBid, pAGNativeRequest);
                final AdSlot adSlotBuild = builderWithBid.setRequestExtraMap(pAGNativeRequest.getExtraInfo()).build();
                com.bytedance.sdk.openadsdk.Lxb.Lxb.Lxb(new OY("loadFeedAd") { // from class: com.bytedance.sdk.openadsdk.JXs.Lxb.3.1
                    @Override // java.lang.Runnable
                    public void run() {
                        if (!kqm.ZU().VVE() && nJ.tD()) {
                            jXs.onError(-18, "Blind mode does not allow requesting ads");
                            return;
                        }
                        if (com.bytedance.sdk.openadsdk.Lxb.Lxb.Lxb(jXs)) {
                            return;
                        }
                        if (adSlotBuild == null) {
                            jXs.onError(-4, "adslot is null");
                            return;
                        }
                        try {
                            Method methodLxb = eK.Lxb("com.bytedance.sdk.openadsdk.TTC5Proxy", "loadFeed", Context.class, AdSlot.class, PAGNativeAdLoadListener.class);
                            if (methodLxb != null) {
                                methodLxb.invoke(null, kqm.Lxb(), adSlotBuild, jXs);
                            }
                        } catch (Throwable unused) {
                        }
                    }
                }, jXs, adSlotBuild);
            }
        };
    }

    @Override // com.bytedance.sdk.openadsdk.api.factory.IADTypeLoaderFactory
    public IADLoader<PAGAppOpenRequest, PAGAppOpenAdLoadListener> createOpenAdLoader() {
        return new IADLoader<PAGAppOpenRequest, PAGAppOpenAdLoadListener>() { // from class: com.bytedance.sdk.openadsdk.JXs.Lxb.1
            private int LD;

            @Override // com.bytedance.sdk.openadsdk.api.factory.IADLoader
            /* JADX INFO: renamed from: Lxb, reason: merged with bridge method [inline-methods] */
            public void loadAd(String str, PAGAppOpenRequest pAGAppOpenRequest, PAGAppOpenAdLoadListener pAGAppOpenAdLoadListener) {
                if (com.bytedance.sdk.openadsdk.Lxb.Lxb.Lxb(str, pAGAppOpenRequest, pAGAppOpenAdLoadListener)) {
                    return;
                }
                AdSlot.Builder builder = new AdSlot.Builder();
                com.bytedance.sdk.openadsdk.Lxb.Lxb.Lxb(builder, pAGAppOpenRequest);
                if (!TextUtils.isEmpty(pAGAppOpenRequest.getAdString())) {
                    builder.withBid(pAGAppOpenRequest.getAdString());
                }
                final AdSlot adSlotBuild = builder.setCodeId(str).setRequestExtraMap(pAGAppOpenRequest.getExtraInfo()).build();
                this.LD = pAGAppOpenRequest.getTimeout();
                final com.bytedance.sdk.openadsdk.Lxb.ZU.Lxb lxb = new com.bytedance.sdk.openadsdk.Lxb.ZU.Lxb(pAGAppOpenAdLoadListener);
                com.bytedance.sdk.openadsdk.Lxb.Lxb.Lxb(new OY("loadSplashAd") { // from class: com.bytedance.sdk.openadsdk.JXs.Lxb.1.1
                    @Override // java.lang.Runnable
                    public void run() {
                        try {
                            if (!kqm.ZU().VVE() && nJ.tD()) {
                                lxb.onError(-18, "Blind mode does not allow requesting ads");
                                return;
                            }
                            if (com.bytedance.sdk.openadsdk.Lxb.Lxb.Lxb(lxb)) {
                                return;
                            }
                            if (adSlotBuild == null) {
                                lxb.onError(-4, "adslot is null");
                                return;
                            }
                            Method methodLxb = eK.Lxb("com.bytedance.sdk.openadsdk.TTC2Proxy", "load", Context.class, AdSlot.class, PAGAppOpenAdLoadListener.class, Integer.TYPE);
                            if (methodLxb != null) {
                                methodLxb.invoke(null, kqm.Lxb(), adSlotBuild, lxb, Integer.valueOf(AnonymousClass1.this.LD));
                            }
                        } catch (Throwable th) {
                            sLN.Lxb("ADNFactory", "open component maybe not exist, please check", th);
                        }
                    }
                }, lxb, adSlotBuild);
            }
        };
    }

    @Override // com.bytedance.sdk.openadsdk.api.factory.IADTypeLoaderFactory
    public IADLoader<PAGRewardedRequest, PAGRewardedAdLoadListener> createRewardAdLoader() {
        return new IADLoader<PAGRewardedRequest, PAGRewardedAdLoadListener>() { // from class: com.bytedance.sdk.openadsdk.JXs.Lxb.4
            @Override // com.bytedance.sdk.openadsdk.api.factory.IADLoader
            /* JADX INFO: renamed from: Lxb, reason: merged with bridge method [inline-methods] */
            public void loadAd(String str, PAGRewardedRequest pAGRewardedRequest, PAGRewardedAdLoadListener pAGRewardedAdLoadListener) {
                if (com.bytedance.sdk.openadsdk.Lxb.Lxb.Lxb(str, pAGRewardedRequest, pAGRewardedAdLoadListener)) {
                    return;
                }
                AdSlot.Builder codeId = new AdSlot.Builder().setCodeId(str);
                if (!TextUtils.isEmpty(pAGRewardedRequest.getAdString())) {
                    codeId.withBid(pAGRewardedRequest.getAdString());
                }
                com.bytedance.sdk.openadsdk.Lxb.Lxb.Lxb(codeId, pAGRewardedRequest);
                final AdSlot adSlotBuild = codeId.setRequestExtraMap(pAGRewardedRequest.getExtraInfo()).build();
                final LD ld = new LD(pAGRewardedAdLoadListener);
                com.bytedance.sdk.openadsdk.Lxb.Lxb.Lxb(new OY("loadRewardVideoAd") { // from class: com.bytedance.sdk.openadsdk.JXs.Lxb.4.1
                    @Override // java.lang.Runnable
                    public void run() {
                        if (!kqm.ZU().VVE() && nJ.tD()) {
                            ld.onError(-18, "Blind mode does not allow requesting ads");
                            return;
                        }
                        if (com.bytedance.sdk.openadsdk.Lxb.Lxb.Lxb(ld)) {
                            return;
                        }
                        if (adSlotBuild == null) {
                            ld.onError(-4, "adslot is null");
                            return;
                        }
                        try {
                            Method methodLxb = eK.Lxb("com.bytedance.sdk.openadsdk.TTC3Proxy", "loadReward", Context.class, AdSlot.class, PAGRewardedAdLoadListener.class);
                            if (methodLxb != null) {
                                methodLxb.invoke(null, kqm.Lxb(), adSlotBuild, ld);
                            }
                        } catch (Throwable unused) {
                        }
                    }
                }, ld, adSlotBuild);
            }
        };
    }
}
