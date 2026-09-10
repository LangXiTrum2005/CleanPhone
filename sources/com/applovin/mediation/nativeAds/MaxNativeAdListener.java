package com.applovin.mediation.nativeAds;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.applovin.mediation.MaxAd;
import com.applovin.mediation.MaxError;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public abstract class MaxNativeAdListener {
    public void onNativeAdClicked(@NonNull MaxAd maxAd) {
    }

    public void onNativeAdExpired(@NonNull MaxAd maxAd) {
    }

    public void onNativeAdLoadFailed(@NonNull String str, @NonNull MaxError maxError) {
    }

    public void onNativeAdLoaded(@Nullable MaxNativeAdView maxNativeAdView, @NonNull MaxAd maxAd) {
    }
}
