package com.unity3d.ads.beta;

import kotlin.Metadata;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b`\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0018\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\bH&J\u0010\u0010\t\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&¨\u0006\n"}, d2 = {"Lcom/unity3d/ads/beta/BannerShowListener;", "", "unityAdsBannerDidClick", "", "banner", "Lcom/unity3d/ads/beta/BannerAd;", "unityAdsBannerDidFailShow", "error", "Lcom/unity3d/ads/beta/UnityAdsError;", "unityAdsBannerImpression", "unity-ads_defaultRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
public interface BannerShowListener {
    void unityAdsBannerDidClick(BannerAd banner);

    void unityAdsBannerDidFailShow(BannerAd banner, UnityAdsError error);

    void unityAdsBannerImpression(BannerAd banner);
}
