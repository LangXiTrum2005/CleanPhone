package com.thinkup.interstitial.api;

import com.thinkup.core.api.AdError;

/* JADX INFO: loaded from: classes6.dex */
public interface TUInterstitialAutoLoadListener {
    void onInterstitialAutoLoadFail(String str, AdError adError);

    void onInterstitialAutoLoaded(String str);
}
