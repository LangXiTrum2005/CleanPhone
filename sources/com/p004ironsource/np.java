package com.p004ironsource;

import org.json.JSONObject;

/* JADX INFO: loaded from: classes5.dex */
public interface np extends kp {
    void onInterstitialAdRewarded(String str, int i2);

    void onInterstitialClick();

    void onInterstitialClose();

    void onInterstitialEventNotificationReceived(String str, JSONObject jSONObject);

    void onInterstitialInitFailed(String str);

    void onInterstitialInitSuccess();

    void onInterstitialLoadFailed(String str);

    void onInterstitialLoadSuccess(zj zjVar);

    void onInterstitialOpen();

    void onInterstitialShowFailed(String str);

    void onInterstitialShowSuccess();
}
