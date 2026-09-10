package com.vungle.ads;

import com.ironsource.If;
import p002kotlin.Metadata;

/* JADX INFO: compiled from: RewardedAdListener.kt */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/vungle/ads/cord;", "Lcom/vungle/ads/impassible;", "Lcom/vungle/ads/BaseAd;", "baseAd", "", If.i, "(Lcom/vungle/ads/BaseAd;)V", "vungle-ads_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
public interface cord extends impassible {
    @Override // com.vungle.ads.impassible, com.vungle.ads.impromptu
    /* synthetic */ void onAdClicked(BaseAd baseAd);

    @Override // com.vungle.ads.impassible, com.vungle.ads.impromptu
    /* synthetic */ void onAdEnd(BaseAd baseAd);

    @Override // com.vungle.ads.impassible, com.vungle.ads.impromptu
    /* synthetic */ void onAdFailedToLoad(BaseAd baseAd, VungleError vungleError);

    @Override // com.vungle.ads.impassible, com.vungle.ads.impromptu
    /* synthetic */ void onAdFailedToPlay(BaseAd baseAd, VungleError vungleError);

    @Override // com.vungle.ads.impassible, com.vungle.ads.impromptu
    /* synthetic */ void onAdImpression(BaseAd baseAd);

    @Override // com.vungle.ads.impassible, com.vungle.ads.impromptu
    /* synthetic */ void onAdLeftApplication(BaseAd baseAd);

    @Override // com.vungle.ads.impassible, com.vungle.ads.impromptu
    /* synthetic */ void onAdLoaded(BaseAd baseAd);

    void onAdRewarded(BaseAd baseAd);

    @Override // com.vungle.ads.impassible, com.vungle.ads.impromptu
    /* synthetic */ void onAdStart(BaseAd baseAd);
}
