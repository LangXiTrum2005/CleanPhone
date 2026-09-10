package com.p004ironsource.mediationsdk.sdk;

import com.p004ironsource.mediationsdk.adunit.adapter.utility.AdInfo;
import com.p004ironsource.mediationsdk.logger.IronSourceError;

/* JADX INFO: loaded from: classes5.dex */
@Deprecated
public interface LevelPlayRewardedVideoManualListener extends LevelPlayRewardedVideoBaseListener {
    void onAdLoadFailed(IronSourceError ironSourceError);

    void onAdReady(AdInfo adInfo);
}
