package com.ironsource;

import com.unity3d.mediation.LevelPlayAdError;
import com.unity3d.mediation.LevelPlayAdInfo;
import com.unity3d.mediation.rewarded.LevelPlayReward;

/* JADX INFO: renamed from: com.ironsource.d6, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public interface InterfaceC3472d6 {
    void a();

    void a(LevelPlayAdError levelPlayAdError);

    void a(LevelPlayReward levelPlayReward);

    void onAdClicked();

    void onAdClosed();

    void onAdDisplayed(LevelPlayAdInfo levelPlayAdInfo);

    void onAdInfoChanged(LevelPlayAdInfo levelPlayAdInfo);

    void onAdLoadFailed(LevelPlayAdError levelPlayAdError);

    void onAdLoaded(LevelPlayAdInfo levelPlayAdInfo);
}
