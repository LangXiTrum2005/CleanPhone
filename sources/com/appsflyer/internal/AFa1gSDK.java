package com.appsflyer.internal;

import com.appsflyer.AFLogger;
import java.util.Map;
import org.json.JSONObject;
import p002kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class AFa1gSDK implements AFa1lSDK {
    private final AFc1qSDK getRevenue;

    public AFa1gSDK(AFc1qSDK aFc1qSDK) {
        Intrinsics.checkNotNullParameter(aFc1qSDK, "");
        this.getRevenue = aFc1qSDK;
    }

    @Override // com.appsflyer.internal.AFa1lSDK
    public final void AFAdRevenueData() {
        this.getRevenue.AFAdRevenueData("deeplink_data");
    }

    @Override // com.appsflyer.internal.AFa1lSDK
    public final void getMonetizationNetwork(Map<String, ? extends Object> map) {
        Intrinsics.checkNotNullParameter(map, "");
        this.getRevenue.getRevenue("deeplink_data", new JSONObject(map).toString());
    }

    @Override // com.appsflyer.internal.AFa1lSDK
    public final Map<String, Object> getRevenue() {
        if (this.getRevenue.getMonetizationNetwork("deeplink_data")) {
            try {
                String monetizationNetwork = this.getRevenue.getMonetizationNetwork("deeplink_data", (String) null);
                return monetizationNetwork == null ? p002kotlin.collections.seminary.taiyuan() : AFj1bSDK.getMonetizationNetwork(new JSONObject(monetizationNetwork));
            } catch (Throwable th) {
                AFLogger.afErrorLog("Exception while parsing stored deeplink data", th, true, false);
            }
        }
        return p002kotlin.collections.seminary.taiyuan();
    }
}
