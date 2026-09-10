package com.appsflyer.internal;

import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public interface AFc1cSDK {
    String AFAdRevenueData(Throwable th, String str);

    void getCurrencyIso4217Code(int i, int i2);

    boolean getCurrencyIso4217Code();

    int getMediationNetwork();

    boolean getMonetizationNetwork(String... strArr);

    List<ExceptionInfo> getRevenue();
}
