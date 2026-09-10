package com.appsflyer.internal;

import com.appsflyer.internal.AFe1oSDK.AnonymousClass1;
import java.util.Map;
import p002kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class AFa1tSDK implements Runnable {
    private final AFh1mSDK getCurrencyIso4217Code;
    private final AFd1zSDK getMonetizationNetwork;
    private final Map<String, Object> getRevenue;

    public AFa1tSDK(AFd1zSDK aFd1zSDK, AFh1mSDK aFh1mSDK, Map<String, ? extends Object> map) {
        Intrinsics.checkNotNullParameter(aFd1zSDK, "");
        Intrinsics.checkNotNullParameter(aFh1mSDK, "");
        this.getMonetizationNetwork = aFd1zSDK;
        this.getCurrencyIso4217Code = aFh1mSDK;
        this.getRevenue = map;
    }

    @Override // java.lang.Runnable
    public final void run() {
        AFe1mSDK aFf1tSDK;
        if (this.getCurrencyIso4217Code.getRevenue()) {
            AFf1rSDK aFf1rSDK = new AFf1rSDK(this.getCurrencyIso4217Code, this.getMonetizationNetwork);
            aFf1rSDK.hashCode = this.getRevenue;
            aFf1tSDK = aFf1rSDK;
        } else {
            aFf1tSDK = this.getCurrencyIso4217Code instanceof AFh1lSDK ? new AFf1tSDK((AFh1lSDK) this.getCurrencyIso4217Code, this.getMonetizationNetwork) : new AFf1sSDK(this.getCurrencyIso4217Code, this.getMonetizationNetwork);
        }
        AFe1oSDK aFe1oSDKCopydefault = this.getMonetizationNetwork.copydefault();
        aFe1oSDKCopydefault.getCurrencyIso4217Code.execute(aFe1oSDKCopydefault.new AnonymousClass1(aFf1tSDK));
        this.getMonetizationNetwork.AFKeystoreWrapper();
        if (AFe1vSDK.getMediationNetwork()) {
            AFe1sSDK currencyIso4217Code = this.getMonetizationNetwork.getCurrencyIso4217Code();
            AFh1mSDK aFh1mSDK = this.getCurrencyIso4217Code;
            Intrinsics.checkNotNullParameter(aFh1mSDK, "");
            if (AFj1kSDK.getRevenue(currencyIso4217Code.AFAdRevenueData.getMonetizationNetwork)) {
                AFe1rSDK.Companion companion = AFe1rSDK.INSTANCE;
                AFe1rSDK mediationNetwork = AFe1rSDK.Companion.getMediationNetwork(aFh1mSDK);
                if (mediationNetwork == null) {
                    return;
                }
                currencyIso4217Code.AFAdRevenueData(mediationNetwork, AFe1sSDK.AnonymousClass4.getCurrencyIso4217Code);
            }
        }
    }
}
