package com.ironsource;

import com.ironsource.mediationsdk.logger.IronLog;
import com.unity3d.mediation.LevelPlayAdError;
import com.unity3d.mediation.LevelPlayAdInfo;
import com.unity3d.mediation.rewarded.LevelPlayReward;
import com.unity3d.mediation.rewarded.LevelPlayRewardedAdListener;

/* JADX INFO: renamed from: com.ironsource.qb, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public final class C0535qb {

    /* JADX INFO: renamed from: com.ironsource.qb$a */
    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    public static final class a implements Za {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ LevelPlayRewardedAdListener f30117a;

        public a(LevelPlayRewardedAdListener levelPlayRewardedAdListener) {
            this.f30117a = levelPlayRewardedAdListener;
        }

        @Override // com.ironsource.Za
        public void onAdClicked(LevelPlayAdInfo adInfo) {
            kotlin.jvm.internal.n.f(adInfo, "adInfo");
            IronLog.CALLBACK.info("LevelPlayRewardedAdListener.onAdClicked() adInfo: " + adInfo);
            this.f30117a.onAdClicked(adInfo);
        }

        @Override // com.ironsource.Za
        public void onAdClosed(LevelPlayAdInfo adInfo) {
            kotlin.jvm.internal.n.f(adInfo, "adInfo");
            IronLog.CALLBACK.info("LevelPlayRewardedAdListener.onAdClosed() adInfo: " + adInfo);
            this.f30117a.onAdClosed(adInfo);
        }

        @Override // com.ironsource.Za
        public void onAdDisplayFailed(LevelPlayAdError error, LevelPlayAdInfo adInfo) {
            kotlin.jvm.internal.n.f(error, "error");
            kotlin.jvm.internal.n.f(adInfo, "adInfo");
            IronLog.CALLBACK.info("LevelPlayRewardedAdListener.onAdDisplayFailed() adInfo: " + adInfo + " error: " + error);
            this.f30117a.onAdDisplayFailed(error, adInfo);
        }

        @Override // com.ironsource.Za
        public void onAdDisplayed(LevelPlayAdInfo adInfo) {
            kotlin.jvm.internal.n.f(adInfo, "adInfo");
            IronLog.CALLBACK.info("LevelPlayRewardedAdListener.onAdDisplayed() adInfo: " + adInfo);
            this.f30117a.onAdDisplayed(adInfo);
        }

        @Override // com.ironsource.Za
        public void onAdInfoChanged(LevelPlayAdInfo adInfo) {
            kotlin.jvm.internal.n.f(adInfo, "adInfo");
            IronLog.CALLBACK.info("LevelPlayRewardedAdListener.onAdInfoChanged() adInfo: " + adInfo);
            this.f30117a.onAdInfoChanged(adInfo);
        }

        @Override // com.ironsource.Za
        public void onAdLoadFailed(LevelPlayAdError error) {
            kotlin.jvm.internal.n.f(error, "error");
            IronLog.CALLBACK.info("LevelPlayRewardedAdListener.onAdLoadFailed() error: " + error);
            this.f30117a.onAdLoadFailed(error);
        }

        @Override // com.ironsource.Za
        public void onAdLoaded(LevelPlayAdInfo adInfo) {
            kotlin.jvm.internal.n.f(adInfo, "adInfo");
            IronLog.CALLBACK.info("LevelPlayRewardedAdListener.onAdLoaded() adInfo: " + adInfo);
            this.f30117a.onAdLoaded(adInfo);
        }

        @Override // com.ironsource.Za
        public void onAdRewarded(LevelPlayReward reward, LevelPlayAdInfo adInfo) {
            kotlin.jvm.internal.n.f(reward, "reward");
            kotlin.jvm.internal.n.f(adInfo, "adInfo");
            IronLog.CALLBACK.info("LevelPlayRewardedAdListener.onAdRewarded() reward: " + reward + " adInfo: " + adInfo);
            this.f30117a.onAdRewarded(reward, adInfo);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Za b(LevelPlayRewardedAdListener levelPlayRewardedAdListener) {
        return new a(levelPlayRewardedAdListener);
    }
}
