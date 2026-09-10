package com.startapp.sdk.adsbase.adlisteners;

import com.startapp.sdk.adsbase.Ad;

/* JADX INFO: loaded from: classes6.dex */
public interface AdEventListener {
    void onFailedToReceiveAd(Ad ad);

    void onReceiveAd(Ad ad);
}
