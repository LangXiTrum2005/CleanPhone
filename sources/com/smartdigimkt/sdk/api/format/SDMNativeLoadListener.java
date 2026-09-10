package com.smartdigimkt.sdk.api.format;

import com.smartdigimkt.sdk.api.AdError;

/* JADX INFO: loaded from: classes6.dex */
public interface SDMNativeLoadListener {
    void onAdLoadFail(AdError adError);

    void onAdLoaded(SDMNativeAd sDMNativeAd);
}
