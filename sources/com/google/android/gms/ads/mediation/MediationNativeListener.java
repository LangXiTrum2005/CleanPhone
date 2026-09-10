package com.google.android.gms.ads.mediation;

import androidx.annotation.NonNull;
import com.google.android.gms.ads.AdError;
import com.google.android.gms.internal.ads.bp;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
@Deprecated
public interface MediationNativeListener {
    void onAdClicked(@NonNull MediationNativeAdapter mediationNativeAdapter);

    void onAdClosed(@NonNull MediationNativeAdapter mediationNativeAdapter);

    @Deprecated
    void onAdFailedToLoad(@NonNull MediationNativeAdapter mediationNativeAdapter, int i10);

    void onAdFailedToLoad(@NonNull MediationNativeAdapter mediationNativeAdapter, @NonNull AdError adError);

    void onAdImpression(@NonNull MediationNativeAdapter mediationNativeAdapter);

    void onAdLeftApplication(@NonNull MediationNativeAdapter mediationNativeAdapter);

    void onAdLoaded(@NonNull MediationNativeAdapter mediationNativeAdapter, @NonNull UnifiedNativeAdMapper unifiedNativeAdMapper);

    void onAdOpened(@NonNull MediationNativeAdapter mediationNativeAdapter);

    void onVideoEnd(@NonNull MediationNativeAdapter mediationNativeAdapter);

    void zzc(MediationNativeAdapter mediationNativeAdapter, bp bpVar);

    void zzd(MediationNativeAdapter mediationNativeAdapter, bp bpVar, String str);
}
