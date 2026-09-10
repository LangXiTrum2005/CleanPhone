package com.applovin.sdk;

import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public interface AppLovinAdRewardListener {
    void userOverQuota(AppLovinAd appLovinAd, Map<String, String> map);

    void userRewardRejected(AppLovinAd appLovinAd, Map<String, String> map);

    void userRewardVerified(AppLovinAd appLovinAd, Map<String, String> map);

    void validationRequestFailed(AppLovinAd appLovinAd, int i10);
}
