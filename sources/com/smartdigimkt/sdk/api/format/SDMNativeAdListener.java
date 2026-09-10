package com.smartdigimkt.sdk.api.format;

import com.smartdigimkt.sdk.api.AdError;

/* JADX INFO: loaded from: classes6.dex */
public interface SDMNativeAdListener {
    void onAdClick();

    void onAdClosed();

    void onAdShow();

    void onDeeplinkCallback(boolean z2);

    void onShowFailed(AdError adError);
}
