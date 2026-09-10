package com.unity3d.mediation.interstitial;

import com.unity3d.mediation.LevelPlayAdError;
import com.unity3d.mediation.LevelPlayAdInfo;
import kotlin.jvm.internal.n;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
public interface LevelPlayInterstitialAdListener {
    default void onAdClicked(LevelPlayAdInfo adInfo) {
        n.f(adInfo, "adInfo");
    }

    default void onAdClosed(LevelPlayAdInfo adInfo) {
        n.f(adInfo, "adInfo");
    }

    default void onAdDisplayFailed(LevelPlayAdError error, LevelPlayAdInfo adInfo) {
        n.f(error, "error");
        n.f(adInfo, "adInfo");
    }

    void onAdDisplayed(LevelPlayAdInfo levelPlayAdInfo);

    default void onAdInfoChanged(LevelPlayAdInfo adInfo) {
        n.f(adInfo, "adInfo");
    }

    void onAdLoadFailed(LevelPlayAdError levelPlayAdError);

    void onAdLoaded(LevelPlayAdInfo levelPlayAdInfo);
}
