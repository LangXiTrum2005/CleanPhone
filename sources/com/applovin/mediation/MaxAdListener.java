package com.applovin.mediation;

import androidx.annotation.NonNull;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public interface MaxAdListener {
    void onAdClicked(@NonNull MaxAd maxAd);

    void onAdDisplayFailed(@NonNull MaxAd maxAd, @NonNull MaxError maxError);

    void onAdDisplayed(@NonNull MaxAd maxAd);

    void onAdHidden(@NonNull MaxAd maxAd);

    void onAdLoadFailed(@NonNull String str, @NonNull MaxError maxError);

    void onAdLoaded(@NonNull MaxAd maxAd);
}
