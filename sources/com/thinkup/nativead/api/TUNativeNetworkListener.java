package com.thinkup.nativead.api;

import com.thinkup.core.api.AdError;

/* JADX INFO: loaded from: classes6.dex */
public interface TUNativeNetworkListener {
    void onNativeAdLoadFail(AdError adError);

    void onNativeAdLoaded();
}
