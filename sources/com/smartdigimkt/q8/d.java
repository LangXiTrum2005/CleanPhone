package com.smartdigimkt.q8;

import com.smartdigimkt.sdk.api.AdError;

/* JADX INFO: loaded from: classes6.dex */
public interface d {
    void a(AdError adError);

    void a(com.smartdigimkt.y4.c cVar);

    void onAdClick();

    void onAdClose();

    void onAdLoadFail(AdError adError);

    void onAdLoadTimeout();

    void onAdLoaded();

    void onAdPlayEnd();

    void onAdPlayFailed(AdError adError);

    void onAdPlayStart();

    void onAdReward();

    void onAdShow();

    void onDeeplinkCallback(boolean z2);
}
