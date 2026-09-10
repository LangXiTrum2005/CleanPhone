package com.google.android.gms.ads.mediation;

import androidx.annotation.NonNull;
import com.google.android.gms.ads.AdError;
import com.google.android.gms.ads.rewarded.RewardItem;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public interface MediationRewardedAdCallback extends MediationAdCallback {
    void onAdFailedToShow(@NonNull AdError adError);

    void onUserEarnedReward();

    @Deprecated
    void onUserEarnedReward(@NonNull RewardItem rewardItem);

    void onVideoComplete();

    void onVideoStart();
}
