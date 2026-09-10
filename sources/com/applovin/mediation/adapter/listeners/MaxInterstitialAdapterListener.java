package com.applovin.mediation.adapter.listeners;

import android.os.Bundle;
import androidx.annotation.Nullable;
import com.applovin.mediation.adapter.MaxAdapterError;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public interface MaxInterstitialAdapterListener extends MaxAdapterListener {
    void onInterstitialAdClicked();

    void onInterstitialAdClicked(@Nullable Bundle bundle);

    void onInterstitialAdDisplayFailed(MaxAdapterError maxAdapterError);

    void onInterstitialAdDisplayFailed(MaxAdapterError maxAdapterError, @Nullable Bundle bundle);

    void onInterstitialAdDisplayed();

    void onInterstitialAdDisplayed(@Nullable Bundle bundle);

    void onInterstitialAdHidden();

    void onInterstitialAdHidden(@Nullable Bundle bundle);

    void onInterstitialAdLoadFailed(MaxAdapterError maxAdapterError);

    void onInterstitialAdLoaded();

    void onInterstitialAdLoaded(@Nullable Bundle bundle);
}
