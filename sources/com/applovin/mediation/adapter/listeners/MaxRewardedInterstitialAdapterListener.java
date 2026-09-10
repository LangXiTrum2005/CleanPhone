package com.applovin.mediation.adapter.listeners;

import android.os.Bundle;
import androidx.annotation.Nullable;
import com.applovin.mediation.MaxReward;
import com.applovin.mediation.adapter.MaxAdapterError;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
@Deprecated
public interface MaxRewardedInterstitialAdapterListener extends MaxAdapterListener {
    @Deprecated
    void onRewardedInterstitialAdClicked();

    @Deprecated
    void onRewardedInterstitialAdClicked(@Nullable Bundle bundle);

    @Deprecated
    void onRewardedInterstitialAdDisplayFailed(MaxAdapterError maxAdapterError);

    @Deprecated
    void onRewardedInterstitialAdDisplayFailed(MaxAdapterError maxAdapterError, @Nullable Bundle bundle);

    @Deprecated
    void onRewardedInterstitialAdDisplayed();

    @Deprecated
    void onRewardedInterstitialAdDisplayed(@Nullable Bundle bundle);

    @Deprecated
    void onRewardedInterstitialAdHidden();

    @Deprecated
    void onRewardedInterstitialAdHidden(@Nullable Bundle bundle);

    @Deprecated
    void onRewardedInterstitialAdLoadFailed(MaxAdapterError maxAdapterError);

    @Deprecated
    void onRewardedInterstitialAdLoaded();

    @Deprecated
    void onRewardedInterstitialAdLoaded(@Nullable Bundle bundle);

    @Deprecated
    void onUserRewarded(MaxReward maxReward);

    @Deprecated
    void onUserRewarded(MaxReward maxReward, @Nullable Bundle bundle);
}
