package com.vungle.ads;

import p002kotlin.Metadata;

/* JADX INFO: compiled from: NativeAdListener.kt */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/vungle/ads/graveside;", "Lcom/vungle/ads/impromptu;", "vungle-ads_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
public interface graveside extends impromptu {
    @Override // com.vungle.ads.impromptu
    /* synthetic */ void onAdClicked(BaseAd baseAd);

    @Override // com.vungle.ads.impromptu
    /* synthetic */ void onAdEnd(BaseAd baseAd);

    @Override // com.vungle.ads.impromptu
    /* synthetic */ void onAdFailedToLoad(BaseAd baseAd, VungleError vungleError);

    @Override // com.vungle.ads.impromptu
    /* synthetic */ void onAdFailedToPlay(BaseAd baseAd, VungleError vungleError);

    @Override // com.vungle.ads.impromptu
    /* synthetic */ void onAdImpression(BaseAd baseAd);

    @Override // com.vungle.ads.impromptu
    /* synthetic */ void onAdLeftApplication(BaseAd baseAd);

    @Override // com.vungle.ads.impromptu
    /* synthetic */ void onAdLoaded(BaseAd baseAd);

    @Override // com.vungle.ads.impromptu
    /* synthetic */ void onAdStart(BaseAd baseAd);
}
