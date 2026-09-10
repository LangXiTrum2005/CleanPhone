package com.appsflyer.internal;

import com.appsflyer.AppsFlyerConsent;

/* JADX INFO: loaded from: classes2.dex */
public final class AFc1eSDK {
    public AFb1rSDK AFAdRevenueData;
    public boolean areAllFieldsValid;
    public AppsFlyerConsent component1;
    public boolean component2;
    public AdvertisingIdData component3;
    public AFd1aSDK component4;
    public AFb1gSDK copydefault;
    public String getCurrencyIso4217Code;
    public String getMediationNetwork;
    public String getMonetizationNetwork;
    public AFb1tSDK getRevenue;

    public final boolean AFAdRevenueData() {
        return this.component2;
    }

    public final synchronized void getMediationNetwork(AFd1aSDK aFd1aSDK) {
        this.component4 = aFd1aSDK;
    }

    public final boolean getMediationNetwork() {
        return this.areAllFieldsValid;
    }
}
