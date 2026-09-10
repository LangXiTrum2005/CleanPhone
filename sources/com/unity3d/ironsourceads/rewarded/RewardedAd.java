package com.unity3d.ironsourceads.rewarded;

import android.app.Activity;
import com.ironsource.Wd;
import com.ironsource.Xd;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.mediationsdk.logger.IronSourceError;
import kotlin.jvm.internal.n;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
public final class RewardedAd implements Xd {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Wd f38479a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private RewardedAdListener f38480b;

    public RewardedAd(Wd rewardedAdInternal) {
        n.f(rewardedAdInternal, "rewardedAdInternal");
        this.f38479a = rewardedAdInternal;
        rewardedAdInternal.a(this);
    }

    public final RewardedAdInfo getAdInfo() {
        return this.f38479a.b();
    }

    public final RewardedAdListener getListener() {
        return this.f38480b;
    }

    public final boolean isReadyToShow() {
        IronLog.API.info();
        return this.f38479a.d();
    }

    @Override // com.ironsource.Xd
    public void onAdInstanceDidBecomeVisible() {
        IronLog.CALLBACK.info("RewardedAdListener onRewardedAdShown adInfo: " + getAdInfo());
        RewardedAdListener rewardedAdListener = this.f38480b;
        if (rewardedAdListener != null) {
            rewardedAdListener.onRewardedAdShown(this);
        }
    }

    @Override // com.ironsource.Xd
    public void onRewardedAdClicked() {
        IronLog.CALLBACK.info("RewardedAdListener onRewardedAdClicked adInfo: " + getAdInfo());
        RewardedAdListener rewardedAdListener = this.f38480b;
        if (rewardedAdListener != null) {
            rewardedAdListener.onRewardedAdClicked(this);
        }
    }

    @Override // com.ironsource.Xd
    public void onRewardedAdDismissed() {
        IronLog.CALLBACK.info("RewardedAdListener onRewardedAdDismissed adInfo: " + getAdInfo());
        RewardedAdListener rewardedAdListener = this.f38480b;
        if (rewardedAdListener != null) {
            rewardedAdListener.onRewardedAdDismissed(this);
        }
    }

    @Override // com.ironsource.Xd
    public void onRewardedAdFailedToShow(IronSourceError error) {
        n.f(error, "error");
        IronLog.CALLBACK.info("RewardedAdListener onRewardedAdFailedToShow error: " + error + " adInfo: " + getAdInfo());
        RewardedAdListener rewardedAdListener = this.f38480b;
        if (rewardedAdListener != null) {
            rewardedAdListener.onRewardedAdFailedToShow(this, error);
        }
    }

    @Override // com.ironsource.Xd
    public void onRewardedAdShown() {
        IronLog.CALLBACK.info("RewardedAdListener onRewardedAdShown adInfo: " + getAdInfo());
        RewardedAdListener rewardedAdListener = this.f38480b;
        if (rewardedAdListener != null) {
            rewardedAdListener.onRewardedAdShown(this);
        }
    }

    @Override // com.ironsource.Xd
    public void onUserEarnedReward() {
        IronLog.CALLBACK.info("RewardedAdListener onUserEarnedReward adInfo: " + getAdInfo());
        RewardedAdListener rewardedAdListener = this.f38480b;
        if (rewardedAdListener != null) {
            rewardedAdListener.onUserEarnedReward(this);
        }
    }

    public final void setListener(RewardedAdListener rewardedAdListener) {
        this.f38480b = rewardedAdListener;
    }

    public final void show(Activity activity) {
        n.f(activity, "activity");
        IronLog.API.info();
        this.f38479a.a(activity);
    }
}
