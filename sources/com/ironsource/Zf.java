package com.ironsource;

import com.unity3d.mediation.LevelPlayAdError;
import com.unity3d.mediation.LevelPlayAdInfo;
import com.unity3d.mediation.rewarded.LevelPlayReward;
import com.unity3d.mediation.rewarded.LevelPlayRewardedAdListener;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public final class Zf implements LevelPlayRewardedAdListener {
    @Override // com.unity3d.mediation.rewarded.LevelPlayRewardedAdListener
    public void onAdClicked(LevelPlayAdInfo adInfo) {
        kotlin.jvm.internal.n.f(adInfo, "adInfo");
        Md.a().a(new C0358gd(0, adInfo.getPlacementName(), false, "", 0, null), C0271bg.f28309a.a(adInfo));
    }

    @Override // com.unity3d.mediation.rewarded.LevelPlayRewardedAdListener
    public void onAdClosed(LevelPlayAdInfo adInfo) {
        kotlin.jvm.internal.n.f(adInfo, "adInfo");
        Md.a().b(C0271bg.f28309a.a(adInfo));
    }

    @Override // com.unity3d.mediation.rewarded.LevelPlayRewardedAdListener
    public void onAdDisplayFailed(LevelPlayAdError error, LevelPlayAdInfo adInfo) {
        kotlin.jvm.internal.n.f(error, "error");
        kotlin.jvm.internal.n.f(adInfo, "adInfo");
        Md mdA = Md.a();
        C0271bg c0271bg = C0271bg.f28309a;
        mdA.a(c0271bg.a(error), c0271bg.a(adInfo));
    }

    @Override // com.unity3d.mediation.rewarded.LevelPlayRewardedAdListener
    public void onAdDisplayed(LevelPlayAdInfo adInfo) {
        kotlin.jvm.internal.n.f(adInfo, "adInfo");
        Md.a().c(C0271bg.f28309a.a(adInfo));
    }

    @Override // com.unity3d.mediation.rewarded.LevelPlayRewardedAdListener
    public void onAdLoadFailed(LevelPlayAdError error) {
        kotlin.jvm.internal.n.f(error, "error");
        Md.a().a(C0271bg.f28309a.a(error));
    }

    @Override // com.unity3d.mediation.rewarded.LevelPlayRewardedAdListener
    public void onAdLoaded(LevelPlayAdInfo adInfo) {
        kotlin.jvm.internal.n.f(adInfo, "adInfo");
        Md.a().d(C0271bg.f28309a.a(adInfo));
    }

    @Override // com.unity3d.mediation.rewarded.LevelPlayRewardedAdListener
    public void onAdRewarded(LevelPlayReward reward, LevelPlayAdInfo adInfo) {
        kotlin.jvm.internal.n.f(reward, "reward");
        kotlin.jvm.internal.n.f(adInfo, "adInfo");
        Md.a().b(new C0358gd(0, adInfo.getPlacementName(), false, reward.getName(), reward.getAmount(), null), C0271bg.f28309a.a(adInfo));
    }
}
