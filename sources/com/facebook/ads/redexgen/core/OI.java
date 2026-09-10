package com.facebook.ads.redexgen.core;

import com.facebook.ads.Ad;
import com.facebook.ads.AdError;
import com.facebook.ads.RewardedVideoAdListener;

/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public class OI implements RewardedVideoAdListener {
    public final /* synthetic */ C2413ib A00;

    public OI(C2413ib c2413ib) {
        this.A00 = c2413ib;
    }

    @Override // com.facebook.ads.AdListener
    public final void onAdClicked(Ad ad) {
    }

    @Override // com.facebook.ads.AdListener
    public final void onAdLoaded(Ad ad) {
        this.A00.A00.A07.onAdLoaded(this.A00.A00.A08.A6k());
    }

    @Override // com.facebook.ads.AdListener
    public final void onError(Ad ad, AdError adError) {
        this.A00.A00.A02 = null;
        ((AbstractC2465jd) this.A00.A00.A03).A2J(false);
        this.A00.A00.A07.onAdLoaded(this.A00.A00.A08.A6k());
    }

    @Override // com.facebook.ads.AdListener
    public final void onLoggingImpression(Ad ad) {
    }

    @Override // com.facebook.ads.RewardedVideoAdListener
    public final void onRewardedVideoClosed() {
        this.A00.A00.A07.onRewardedVideoClosed();
    }

    @Override // com.facebook.ads.RewardedVideoAdListener
    public final void onRewardedVideoCompleted() {
        this.A00.A00.A07.onRewardedVideoCompleted();
    }
}
