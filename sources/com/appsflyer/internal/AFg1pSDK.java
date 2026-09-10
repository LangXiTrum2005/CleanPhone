package com.appsflyer.internal;

import com.appsflyer.AFInAppEventParameterName;
import com.appsflyer.AFLogger;
import com.appsflyer.attribution.AppsFlyerRequestListener;
import com.appsflyer.internal.components.network.http.ResponseNetwork;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public final class AFg1pSDK extends AFe1fSDK<Map<String, Object>> {
    private static final List<String> component2 = Arrays.asList("googleplay", "playstore", "googleplaystore");
    private String AFKeystoreWrapper;
    private final AFh1xSDK copy;
    private final AFd1nSDK copydefault;
    private final AFc1oSDK equals;
    private Map<String, Object> hashCode;
    private final AFc1qSDK toString;

    public AFg1pSDK(AFd1zSDK aFd1zSDK) {
        super(AFe1pSDK.GCDSDK, new AFe1pSDK[]{AFe1pSDK.RC_CDN}, aFd1zSDK, "GCD-FETCH");
        this.copydefault = aFd1zSDK.getRevenue();
        this.toString = aFd1zSDK.component4();
        this.copy = aFd1zSDK.areAllFieldsValid();
        this.equals = aFd1zSDK.AFAdRevenueData();
        this.getCurrencyIso4217Code.add(AFe1pSDK.CONVERSION);
        this.getCurrencyIso4217Code.add(AFe1pSDK.LAUNCH);
    }

    @Override // com.appsflyer.internal.AFe1fSDK
    public final AFd1hSDK<Map<String, Object>> AFAdRevenueData(String str) {
        String strConcat;
        String strAFAdRevenueData = AFa1ySDK.AFAdRevenueData(this.toString, this.equals.component3());
        if (strAFAdRevenueData == null || strAFAdRevenueData.trim().isEmpty()) {
            strConcat = "";
        } else if (component2.contains(strAFAdRevenueData.toLowerCase(Locale.getDefault()))) {
            AFLogger.afWarnLog(String.format("[GCD] AF detected using redundant Google-Play channel for attribution - %s. Using without channel postfix.", strAFAdRevenueData));
            strConcat = "";
        } else {
            strConcat = "-".concat(strAFAdRevenueData);
        }
        AFd1hSDK<Map<String, Object>> monetizationNetwork = this.copydefault.getMonetizationNetwork(strConcat, str);
        StringBuilder sb = new StringBuilder("[GCD-B01] URL: ");
        sb.append(monetizationNetwork.getMonetizationNetwork.getMediationNetwork);
        AFLogger.afInfoLog(sb.toString());
        return monetizationNetwork;
    }

    @Override // com.appsflyer.internal.AFe1fSDK
    public final AppsFlyerRequestListener component2() {
        return null;
    }

    @Override // com.appsflyer.internal.AFe1fSDK
    public final boolean copydefault() {
        return false;
    }

    @Override // com.appsflyer.internal.AFe1fSDK, com.appsflyer.internal.AFe1mSDK
    public final void getCurrencyIso4217Code() {
        super.getCurrencyIso4217Code();
        Map<String, Object> map = this.hashCode;
        String str = this.AFKeystoreWrapper;
        if (map != null) {
            AFg1oSDK.getCurrencyIso4217Code(map);
        } else if (str == null || str.isEmpty()) {
            AFg1oSDK.getRevenue("Unknown error");
        } else {
            AFg1oSDK.getRevenue(str);
        }
    }

    @Override // com.appsflyer.internal.AFe1fSDK, com.appsflyer.internal.AFe1mSDK
    public final boolean getMonetizationNetwork() {
        return false;
    }

    @Override // com.appsflyer.internal.AFe1fSDK, com.appsflyer.internal.AFe1mSDK
    public final AFe1uSDK getRevenue() throws Exception {
        AFe1uSDK revenue;
        AFe1uSDK aFe1uSDK;
        if (((AFe1fSDK) this).component1.getCurrencyIso4217Code()) {
            AFLogger.afDebugLog("[GCD-E03] 'isStopTracking' enabled");
            this.AFKeystoreWrapper = "'isStopTracking' enabled";
            throw new AFe1iSDK();
        }
        AFe1uSDK aFe1uSDK2 = AFe1uSDK.FAILURE;
        int i = 0;
        while (i <= 2) {
            boolean z = true;
            boolean z2 = i >= 2;
            this.copy.toString = System.currentTimeMillis();
            try {
                try {
                    revenue = super.getRevenue();
                    ResponseNetwork responseNetwork = ((AFe1fSDK) this).areAllFieldsValid;
                    if (responseNetwork != null) {
                        int statusCode = responseNetwork.getStatusCode();
                        if (statusCode != 403 && statusCode < 500) {
                            z = false;
                        }
                        if (responseNetwork.isSuccessful() || statusCode == 404) {
                            Map<String, Object> map = (Map) responseNetwork.getBody();
                            int statusCode2 = responseNetwork.getStatusCode();
                            Boolean bool = (Boolean) map.get("iscache");
                            if (statusCode2 == 404) {
                                map.remove("error_reason");
                                map.remove("status_code");
                                map.put("af_status", "Organic");
                                map.put("af_message", "organic install");
                            }
                            if (bool != null && !bool.booleanValue()) {
                                this.toString.AFAdRevenueData("appsflyerConversionDataCacheExpiration", System.currentTimeMillis());
                            }
                            if (map.containsKey("af_siteid")) {
                                if (map.containsKey(AFInAppEventParameterName.AF_CHANNEL)) {
                                    StringBuilder sb = new StringBuilder("[Invite] Detected App-Invite via channel: ");
                                    sb.append(map.get(AFInAppEventParameterName.AF_CHANNEL));
                                    AFLogger.afDebugLog(sb.toString());
                                } else {
                                    AFLogger.afDebugLog(String.format("[CrossPromotion] App was installed via %s's Cross Promotion", map.get("af_siteid")));
                                }
                            }
                            map.put("is_first_launch", Boolean.FALSE);
                            this.toString.getRevenue("attributionId", new JSONObject(map).toString());
                            if (!this.toString.getMediationNetwork("sixtyDayConversionData", false)) {
                                map.put("is_first_launch", Boolean.TRUE);
                            }
                            this.hashCode = map;
                            aFe1uSDK = AFe1uSDK.SUCCESS;
                        } else {
                            if (!z2) {
                                if (!z) {
                                }
                            }
                            this.AFKeystoreWrapper = "Error connection to server: ".concat(String.valueOf(statusCode));
                            aFe1uSDK = AFe1uSDK.FAILURE;
                        }
                        this.copy.getMonetizationNetwork(i);
                        AFLogger.afDebugLog("[GCD-A03] Server retrieving attempt finished");
                        return aFe1uSDK;
                    }
                } catch (AFe1nSDK e) {
                    AFLogger.afDebugLog("[GCD-E05] AppsFlyer dev key is missing");
                    this.AFKeystoreWrapper = "AppsFlyer dev key is missing";
                    throw e;
                } catch (Exception e2) {
                    StringBuilder sb2 = new StringBuilder("[GCD] Error: ");
                    sb2.append(e2.getMessage());
                    AFLogger.afErrorLog(sb2.toString(), e2, false, false);
                    revenue = AFe1uSDK.FAILURE;
                    if (z2) {
                        this.AFKeystoreWrapper = e2.getMessage();
                        throw e2;
                    }
                }
                this.copy.getMonetizationNetwork(i);
                AFLogger.afDebugLog("[GCD-A03] Server retrieving attempt finished");
                aFe1uSDK2 = revenue;
                i++;
            } catch (Throwable th) {
                this.copy.getMonetizationNetwork(i);
                AFLogger.afDebugLog("[GCD-A03] Server retrieving attempt finished");
                throw th;
            }
        }
        return aFe1uSDK2;
    }
}
