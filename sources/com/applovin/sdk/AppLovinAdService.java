package com.applovin.sdk;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public interface AppLovinAdService {
    void collectBidToken(AppLovinBidTokenCollectionListener appLovinBidTokenCollectionListener);

    @Deprecated
    String getBidToken();

    void loadNextAd(AppLovinAdSize appLovinAdSize, AppLovinAdLoadListener appLovinAdLoadListener);

    void loadNextAdForAdToken(String str, AppLovinAdLoadListener appLovinAdLoadListener);

    void loadNextAdForZoneId(String str, AppLovinAdLoadListener appLovinAdLoadListener);
}
