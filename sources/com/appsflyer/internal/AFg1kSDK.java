package com.appsflyer.internal;

import com.appsflyer.AFLogger;
import java.util.Map;
import org.json.JSONException;

/* JADX INFO: loaded from: classes2.dex */
public final class AFg1kSDK extends AFe1mSDK<Void> {
    private final AFc1qSDK component1;
    private final AFe1wSDK<String> component2;
    private final Throwable component3;

    public AFg1kSDK(AFf1rSDK aFf1rSDK, AFc1qSDK aFc1qSDK) {
        super(AFe1pSDK.GCDSDK, new AFe1pSDK[]{AFe1pSDK.RC_CDN}, "GCD-CHECK");
        this.component3 = aFf1rSDK.component1();
        this.component2 = ((AFe1fSDK) aFf1rSDK).areAllFieldsValid;
        this.component1 = aFc1qSDK;
    }

    private Map<String, Object> component2() {
        String monetizationNetwork = this.component1.getMonetizationNetwork("attributionId", (String) null);
        if (monetizationNetwork == null) {
            return null;
        }
        try {
            new AFd1iSDK();
            return AFd1iSDK.getMediationNetwork(monetizationNetwork);
        } catch (JSONException e) {
            StringBuilder sb = new StringBuilder("[GCD] Failed to parse GCD response: ");
            sb.append(e.getMessage());
            AFLogger.afErrorLog(sb.toString(), e);
            return null;
        }
    }

    @Override // com.appsflyer.internal.AFe1mSDK
    public final long AFAdRevenueData() {
        return 1000L;
    }

    @Override // com.appsflyer.internal.AFe1mSDK
    public final boolean getMonetizationNetwork() {
        return false;
    }

    @Override // com.appsflyer.internal.AFe1mSDK
    public final AFe1uSDK getRevenue() throws Exception {
        AFLogger.afDebugLog("[GCD-A01] Loading conversion data. Counter: ".concat(String.valueOf(this.component1.getRevenue("appsFlyerCount", 0))));
        long monetizationNetwork = this.component1.getMonetizationNetwork("appsflyerConversionDataCacheExpiration", 0L);
        if (monetizationNetwork != 0 && System.currentTimeMillis() - monetizationNetwork > 5184000000L) {
            AFLogger.afDebugLog("[GCD-E02] Cached conversion data expired");
            this.component1.AFAdRevenueData("sixtyDayConversionData", true);
            this.component1.getRevenue("attributionId", (String) null);
            this.component1.AFAdRevenueData("appsflyerConversionDataCacheExpiration", 0L);
        }
        Map<String, Object> mapComponent2 = component2();
        if (mapComponent2 != null) {
            try {
                if (!mapComponent2.containsKey("is_first_launch")) {
                    mapComponent2.put("is_first_launch", Boolean.FALSE);
                }
                AFg1oSDK.getCurrencyIso4217Code(mapComponent2);
            } catch (Exception e) {
                StringBuilder sb = new StringBuilder("[GCD] Error executing conversion data callback: ");
                sb.append(e.getLocalizedMessage());
                AFLogger.afErrorLog(sb.toString(), e);
            }
            return AFe1uSDK.SUCCESS;
        }
        try {
            if (this.component3 != null) {
                StringBuilder sb2 = new StringBuilder("Launch exception: ");
                sb2.append(this.component3.getMessage());
                AFg1oSDK.getRevenue(sb2.toString());
                return AFe1uSDK.SUCCESS;
            }
            AFe1wSDK<String> aFe1wSDK = this.component2;
            if (aFe1wSDK != null && !aFe1wSDK.isSuccessful()) {
                StringBuilder sb3 = new StringBuilder("Launch status code: ");
                sb3.append(this.component2.getStatusCode());
                AFg1oSDK.getRevenue(sb3.toString());
                return AFe1uSDK.SUCCESS;
            }
            return AFe1uSDK.FAILURE;
        } catch (Exception e2) {
            StringBuilder sb4 = new StringBuilder("[GCD] Error executing conversion data callback: ");
            sb4.append(e2.getLocalizedMessage());
            AFLogger.afErrorLog(sb4.toString(), e2);
        }
    }
}
