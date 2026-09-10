package com.inmobi.ads.listeners;

import com.inmobi.ads.InMobiAdRequestStatus;
import com.inmobi.ads.InMobiBanner;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public abstract class BannerAdEventListener extends AdEventListener<InMobiBanner> {
    public void onAdDismissed(InMobiBanner inMobiBanner) {
    }

    public void onAdDisplayed(InMobiBanner inMobiBanner) {
    }

    public void onAdFetchFailed(InMobiBanner inMobiBanner, InMobiAdRequestStatus inMobiAdRequestStatus) {
    }

    public void onRewardsUnlocked(InMobiBanner inMobiBanner, Map<Object, Object> map) {
    }

    public void onUserLeftApplication(InMobiBanner inMobiBanner) {
    }
}
