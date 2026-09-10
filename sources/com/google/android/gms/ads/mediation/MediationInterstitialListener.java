package com.google.android.gms.ads.mediation;

import androidx.annotation.NonNull;
import com.google.android.gms.ads.AdError;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
@Deprecated
public interface MediationInterstitialListener {
    void onAdClicked(@NonNull MediationInterstitialAdapter mediationInterstitialAdapter);

    void onAdClosed(@NonNull MediationInterstitialAdapter mediationInterstitialAdapter);

    @Deprecated
    void onAdFailedToLoad(@NonNull MediationInterstitialAdapter mediationInterstitialAdapter, int i10);

    void onAdFailedToLoad(@NonNull MediationInterstitialAdapter mediationInterstitialAdapter, @NonNull AdError adError);

    void onAdLeftApplication(@NonNull MediationInterstitialAdapter mediationInterstitialAdapter);

    void onAdLoaded(@NonNull MediationInterstitialAdapter mediationInterstitialAdapter);

    void onAdOpened(@NonNull MediationInterstitialAdapter mediationInterstitialAdapter);
}
