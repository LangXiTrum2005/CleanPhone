package com.google.android.gms.ads;

import androidx.annotation.NonNull;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public abstract class FullScreenContentCallback {
    public static final int ERROR_CODE_AD_REUSED = 1;
    public static final int ERROR_CODE_APP_NOT_FOREGROUND = 3;
    public static final int ERROR_CODE_INTERNAL_ERROR = 0;
    public static final int ERROR_CODE_MEDIATION_SHOW_ERROR = 4;
    public static final int ERROR_CODE_NOT_READY = 2;

    public void onAdClicked() {
    }

    public void onAdDismissedFullScreenContent() {
    }

    public void onAdImpression() {
    }

    public void onAdShowedFullScreenContent() {
    }

    public void onAdFailedToShowFullScreenContent(@NonNull AdError adError) {
    }
}
