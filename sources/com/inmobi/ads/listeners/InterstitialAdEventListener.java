package com.inmobi.ads.listeners;

import com.inmobi.ads.AdMetaInfo;
import com.inmobi.ads.InMobiAdRequestStatus;
import com.inmobi.ads.InMobiInterstitial;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public abstract class InterstitialAdEventListener extends AdEventListener<InMobiInterstitial> {
    public void onAdDismissed(InMobiInterstitial inMobiInterstitial) {
    }

    public void onAdDisplayFailed(InMobiInterstitial inMobiInterstitial) {
    }

    public void onAdDisplayed(InMobiInterstitial inMobiInterstitial, AdMetaInfo adMetaInfo) {
    }

    public void onAdFetchFailed(InMobiInterstitial inMobiInterstitial, InMobiAdRequestStatus inMobiAdRequestStatus) {
    }

    public void onAdWillDisplay(InMobiInterstitial inMobiInterstitial) {
    }

    public void onRewardsUnlocked(InMobiInterstitial inMobiInterstitial, Map<Object, Object> map) {
    }

    public void onUserLeftApplication(InMobiInterstitial inMobiInterstitial) {
    }
}
