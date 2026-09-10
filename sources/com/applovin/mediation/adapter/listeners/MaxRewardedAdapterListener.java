package com.applovin.mediation.adapter.listeners;

import android.os.Bundle;
import androidx.annotation.Nullable;
import com.applovin.mediation.MaxReward;
import com.applovin.mediation.adapter.MaxAdapterError;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public interface MaxRewardedAdapterListener extends MaxAdapterListener {
    void onRewardedAdClicked();

    void onRewardedAdClicked(@Nullable Bundle bundle);

    void onRewardedAdDisplayFailed(MaxAdapterError maxAdapterError);

    void onRewardedAdDisplayFailed(MaxAdapterError maxAdapterError, @Nullable Bundle bundle);

    void onRewardedAdDisplayed();

    void onRewardedAdDisplayed(@Nullable Bundle bundle);

    void onRewardedAdHidden();

    void onRewardedAdHidden(@Nullable Bundle bundle);

    void onRewardedAdLoadFailed(MaxAdapterError maxAdapterError);

    void onRewardedAdLoaded();

    void onRewardedAdLoaded(@Nullable Bundle bundle);

    void onUserRewarded(MaxReward maxReward);

    void onUserRewarded(MaxReward maxReward, @Nullable Bundle bundle);
}
