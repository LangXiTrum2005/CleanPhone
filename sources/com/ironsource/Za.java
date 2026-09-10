package com.ironsource;

import com.unity3d.mediation.LevelPlayAdError;
import com.unity3d.mediation.LevelPlayAdInfo;
import com.unity3d.mediation.rewarded.LevelPlayReward;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public interface Za {
    void onAdClicked(LevelPlayAdInfo levelPlayAdInfo);

    void onAdClosed(LevelPlayAdInfo levelPlayAdInfo);

    void onAdDisplayFailed(LevelPlayAdError levelPlayAdError, LevelPlayAdInfo levelPlayAdInfo);

    void onAdDisplayed(LevelPlayAdInfo levelPlayAdInfo);

    void onAdInfoChanged(LevelPlayAdInfo levelPlayAdInfo);

    void onAdLoadFailed(LevelPlayAdError levelPlayAdError);

    void onAdLoaded(LevelPlayAdInfo levelPlayAdInfo);

    default void onAdRewarded(LevelPlayReward reward, LevelPlayAdInfo adInfo) {
        kotlin.jvm.internal.n.f(reward, "reward");
        kotlin.jvm.internal.n.f(adInfo, "adInfo");
    }
}
