package com.appsflyer.internal;

import com.appsflyer.AFAdRevenueData;
import com.appsflyer.adrevenue.adnetworks.generic.Scheme;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import p002kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class AFf1tSDK extends AFf1sSDK {
    private final AFh1lSDK copydefault;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AFf1tSDK(AFh1lSDK aFh1lSDK, AFd1zSDK aFd1zSDK) {
        super(aFh1lSDK, aFd1zSDK);
        Intrinsics.checkNotNullParameter(aFh1lSDK, "");
        Intrinsics.checkNotNullParameter(aFd1zSDK, "");
        this.copydefault = aFh1lSDK;
    }

    @Override // com.appsflyer.internal.AFf1sSDK
    public final void AFAdRevenueData(AFh1mSDK aFh1mSDK) {
        Intrinsics.checkNotNullParameter(aFh1mSDK, "");
        super.AFAdRevenueData(aFh1mSDK);
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        AFAdRevenueData aFAdRevenueData = this.copydefault.toString;
        Intrinsics.checkNotNullExpressionValue(aFAdRevenueData, "");
        linkedHashMap.put(Scheme.MONETIZATION_NETWORK, aFAdRevenueData.getMonetizationNetwork());
        linkedHashMap.put(Scheme.EVENT_REVENUE_CURRENCY, aFAdRevenueData.getCurrencyIso4217Code());
        linkedHashMap.put(Scheme.MEDIATION_NETWORK, aFAdRevenueData.getMediationNetwork().getValue());
        linkedHashMap.put(Scheme.EVENT_REVENUE, Double.valueOf(aFAdRevenueData.getRevenue()));
        Map<String, Object> map = this.copydefault.equals;
        if (map != null && !map.isEmpty()) {
            List listKowloon = p002kotlin.collections.adultoid.kowloon("ad_type", "ad_unit", "country", "placement");
            for (Map.Entry<String, Object> entry : map.entrySet()) {
                String key = entry.getKey();
                Object value = entry.getValue();
                if (listKowloon.contains(key)) {
                    linkedHashMap.put(key, value);
                } else {
                    linkedHashMap2.put(key, value);
                }
            }
            linkedHashMap.put("custom_parameters", linkedHashMap2);
        }
        LinkedHashMap linkedHashMap3 = new LinkedHashMap();
        linkedHashMap3.put("name", "adrevenue_sdk");
        linkedHashMap3.put("payload", linkedHashMap);
        Map<String, Object> map2 = aFh1mSDK.AFAdRevenueData;
        Intrinsics.checkNotNullExpressionValue(map2, "");
        map2.put("ad_network", linkedHashMap3);
    }
}
