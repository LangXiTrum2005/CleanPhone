package com.p004ironsource;

import com.p004ironsource.mediationsdk.model.Placement;
import com.unity3d.mediation.LevelPlayAdError;
import com.unity3d.mediation.LevelPlayAdInfo;
import com.unity3d.mediation.rewarded.LevelPlayReward;
import com.unity3d.mediation.rewarded.LevelPlayRewardedAdListener;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u0010\b\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0016J\u0010\u0010\t\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0016J\u0010\u0010\n\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0016J\u0018\u0010\r\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016J\u0018\u0010\u000e\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0006H\u0016J\u0010\u0010\u000f\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¨\u0006\u0012"}, d2 = {"Lcom/ironsource/pv;", "Lcom/unity3d/mediation/rewarded/LevelPlayRewardedAdListener;", "Lcom/unity3d/mediation/LevelPlayAdError;", "error", "", sv.f27214b, "Lcom/unity3d/mediation/LevelPlayAdInfo;", "adInfo", sv.j, sv.f, "onAdDisplayed", "Lcom/unity3d/mediation/rewarded/LevelPlayReward;", "reward", sv.f27218i, "onAdDisplayFailed", sv.g, "<init>", "()V", "mediationsdk_release"}, k = 1, mv = {1, 8, 0})
public final class pv implements LevelPlayRewardedAdListener {
    @Override // com.unity3d.mediation.rewarded.LevelPlayRewardedAdListener
    public void onAdClicked(LevelPlayAdInfo adInfo) {
        Intrinsics.f(adInfo, "adInfo");
        fr.a().a(new Placement(0, adInfo.getPlacementName(), false, "", 0, null), vv.f27547a.a(adInfo));
    }

    @Override // com.unity3d.mediation.rewarded.LevelPlayRewardedAdListener
    public void onAdClosed(LevelPlayAdInfo adInfo) {
        Intrinsics.f(adInfo, "adInfo");
        fr.a().b(vv.f27547a.a(adInfo));
    }

    @Override // com.unity3d.mediation.rewarded.LevelPlayRewardedAdListener
    public void onAdDisplayFailed(LevelPlayAdError error, LevelPlayAdInfo adInfo) {
        Intrinsics.f(error, "error");
        Intrinsics.f(adInfo, "adInfo");
        fr frVarA = fr.a();
        vv vvVar = vv.f27547a;
        frVarA.a(vvVar.a(error), vvVar.a(adInfo));
    }

    @Override // com.unity3d.mediation.rewarded.LevelPlayRewardedAdListener
    public void onAdDisplayed(LevelPlayAdInfo adInfo) {
        Intrinsics.f(adInfo, "adInfo");
        fr.a().c(vv.f27547a.a(adInfo));
    }

    @Override // com.unity3d.mediation.rewarded.LevelPlayRewardedAdListener
    public void onAdLoadFailed(LevelPlayAdError error) {
        Intrinsics.f(error, "error");
        fr.a().a(vv.f27547a.a(error));
    }

    @Override // com.unity3d.mediation.rewarded.LevelPlayRewardedAdListener
    public void onAdLoaded(LevelPlayAdInfo adInfo) {
        Intrinsics.f(adInfo, "adInfo");
        fr.a().d(vv.f27547a.a(adInfo));
    }

    @Override // com.unity3d.mediation.rewarded.LevelPlayRewardedAdListener
    public void onAdRewarded(LevelPlayReward reward, LevelPlayAdInfo adInfo) {
        Intrinsics.f(reward, "reward");
        Intrinsics.f(adInfo, "adInfo");
        fr.a().b(new Placement(0, adInfo.getPlacementName(), false, reward.getName(), reward.getAmount(), null), vv.f27547a.a(adInfo));
    }
}
