package com.google.android.gms.ads.preload;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.ads.AdError;
import com.google.android.gms.ads.ResponseInfo;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public abstract class PreloadCallbackV2 {
    public void onAdsExhausted(@NonNull String str) {
    }

    public void onAdFailedToPreload(@NonNull String str, @NonNull AdError adError) {
    }

    public void onAdPreloaded(@NonNull String str, @Nullable ResponseInfo responseInfo) {
    }
}
