package com.appsflyer.internal;

import p002kotlin.Pair;
import p002kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class AFd1pSDK {
    public static boolean getCurrencyIso4217Code(String str, String str2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        int mediationNetwork = AFk1xSDK.getMediationNetwork(str);
        int mediationNetwork2 = AFk1xSDK.getMediationNetwork(str2);
        Pair<Integer, Integer> monetizationNetwork = AFd1rSDK.getMonetizationNetwork(str2);
        Pair<Integer, Integer> pairAFAdRevenueData = AFd1rSDK.AFAdRevenueData(str2);
        if (mediationNetwork2 != -1 && monetizationNetwork == null) {
            return mediationNetwork2 == mediationNetwork;
        }
        if (pairAFAdRevenueData != null) {
            return pairAFAdRevenueData.getFirst().intValue() <= mediationNetwork && mediationNetwork <= pairAFAdRevenueData.getSecond().intValue();
        }
        return monetizationNetwork != null && monetizationNetwork.getFirst().intValue() <= mediationNetwork && mediationNetwork <= monetizationNetwork.getSecond().intValue();
    }
}
