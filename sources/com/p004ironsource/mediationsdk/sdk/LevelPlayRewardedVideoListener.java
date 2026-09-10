package com.p004ironsource.mediationsdk.sdk;

import com.p004ironsource.mediationsdk.adunit.adapter.utility.AdInfo;

/* JADX INFO: loaded from: classes5.dex */
@Deprecated
public interface LevelPlayRewardedVideoListener extends LevelPlayRewardedVideoBaseListener {
    void onAdAvailable(AdInfo adInfo);

    void onAdUnavailable();
}
