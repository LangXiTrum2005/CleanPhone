package com.facebook.appevents.iap;

import an.h;
import android.content.SharedPreferences;
import com.facebook.appevents.internal.AutomaticAnalyticsLogger;
import com.facebook.appevents.internal.Constants;
import gatewayprotocol.v1.DiagnosticEventRequestOuterClass;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArraySet;
import kotlin.Metadata;
import kotlin.jvm.internal.n;
import l7.s;
import org.json.JSONObject;
import xj.b0;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010%\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\r\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0005\u0010\u0003J\u000f\u0010\u0006\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0006\u0010\u0003J\u000f\u0010\b\u001a\u00020\u0007H\u0007¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\n\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\n\u0010\u0003J\u000f\u0010\u000b\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u000b\u0010\u0003JY\u0010\u0017\u001a\u00020\u00042\u0012\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u000e0\f2\u0014\u0010\u0011\u001a\u0010\u0012\u0004\u0012\u00020\r\u0012\u0006\u0012\u0004\u0018\u00010\u000e0\u00102\u0006\u0010\u0012\u001a\u00020\u00072\u0006\u0010\u0013\u001a\u00020\r2\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0016\u001a\u00020\u0007H\u0007¢\u0006\u0004\b\u0017\u0010\u0018J;\u0010\u0019\u001a\u00020\u00042\u0012\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\r0\u00102\u0006\u0010\u0012\u001a\u00020\u00072\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0016\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ7\u0010\u001d\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u000e0\u00102\u0012\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u000e0\f2\u0006\u0010\u0012\u001a\u00020\u0007H\u0001¢\u0006\u0004\b\u001b\u0010\u001cJM\u0010 \u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\r0\u00102\u0012\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u000e0\u00102\u0014\u0010\u0011\u001a\u0010\u0012\u0004\u0012\u00020\r\u0012\u0006\u0012\u0004\u0018\u00010\u000e0\u00102\u0006\u0010\u0013\u001a\u00020\rH\u0001¢\u0006\u0004\b\u001e\u0010\u001fR\u0014\u0010\"\u001a\u00020!8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\"\u0010#R\u0014\u0010%\u001a\u00020$8\u0002X\u0082T¢\u0006\u0006\n\u0004\b%\u0010&R\u0014\u0010'\u001a\u00020\r8\u0002X\u0082T¢\u0006\u0006\n\u0004\b'\u0010(R\u0014\u0010)\u001a\u00020\r8\u0002X\u0082T¢\u0006\u0006\n\u0004\b)\u0010(R\u0014\u0010*\u001a\u00020\r8\u0002X\u0082T¢\u0006\u0006\n\u0004\b*\u0010(R\u0014\u0010+\u001a\u00020\r8\u0002X\u0082T¢\u0006\u0006\n\u0004\b+\u0010(R\u0014\u0010,\u001a\u00020\r8\u0002X\u0082T¢\u0006\u0006\n\u0004\b,\u0010(R\u0014\u0010-\u001a\u00020\r8\u0002X\u0082T¢\u0006\u0006\n\u0004\b-\u0010(R\u0014\u0010.\u001a\u00020\r8\u0002X\u0082T¢\u0006\u0006\n\u0004\b.\u0010(R\u0014\u0010/\u001a\u00020\r8\u0002X\u0082T¢\u0006\u0006\n\u0004\b/\u0010(R\u0014\u00100\u001a\u00020\r8\u0002X\u0082T¢\u0006\u0006\n\u0004\b0\u0010(¨\u00061"}, d2 = {"Lcom/facebook/appevents/iap/InAppPurchaseLoggerManager;", "", "<init>", "()V", "Lwj/r;", "migrateOldCacheHistory", "deleteOldCacheHistory", "", "getIsFirstAppLaunchWithNewIAP", "()Z", "setAppHasBeenLaunchedWithNewIAP", "updateLatestPossiblePurchaseTime", "", "", "Lorg/json/JSONObject;", "purchaseDetailsMap", "", "skuDetailsMap", "isSubscription", "packageName", "Lcom/facebook/appevents/iap/InAppPurchaseUtils$BillingClientVersion;", "billingClientVersion", "isFirstAppLaunch", "filterPurchaseLogging", "(Ljava/util/Map;Ljava/util/Map;ZLjava/lang/String;Lcom/facebook/appevents/iap/InAppPurchaseUtils$BillingClientVersion;Z)V", "logPurchases", "(Ljava/util/Map;ZLcom/facebook/appevents/iap/InAppPurchaseUtils$BillingClientVersion;Z)V", "cacheDeDupPurchase$facebook_core_release", "(Ljava/util/Map;Z)Ljava/util/Map;", "cacheDeDupPurchase", "constructLoggingReadyMap$facebook_core_release", "(Ljava/util/Map;Ljava/util/Map;Ljava/lang/String;)Ljava/util/Map;", "constructLoggingReadyMap", "", "APPROXIMATE_IAP_ENHANCEMENT_RELEASE_TIME", "J", "", "MILLISECONDS_IN_SECONDS", "D", "PURCHASE_TIME", "Ljava/lang/String;", "IAP_SKU_CACHE_GPBLV1", "IAP_PURCHASE_CACHE_GPBLV1", "IAP_CACHE_OLD", "IAP_CACHE_GPBLV2V7", "CACHED_PURCHASES_KEY", InAppPurchaseLoggerManager.APP_HAS_BEEN_LAUNCHED_KEY, "TIME_OF_LAST_LOGGED_PURCHASE_KEY", "TIME_OF_LAST_LOGGED_SUBSCRIPTION_KEY", "facebook-core_release"}, k = 1, mv = {1, 8, 0}, xi = DiagnosticEventRequestOuterClass.DiagnosticEventType.DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_QUALITY_INIT_STARTED_VALUE)
public final class InAppPurchaseLoggerManager {
    private static final long APPROXIMATE_IAP_ENHANCEMENT_RELEASE_TIME = 1736528400000L;
    private static final String APP_HAS_BEEN_LAUNCHED_KEY = "APP_HAS_BEEN_LAUNCHED_KEY";
    private static final String CACHED_PURCHASES_KEY = "PURCHASE_DETAILS_SET";
    private static final String IAP_CACHE_GPBLV2V7 = "com.facebook.internal.iap.IAP_CACHE_GPBLV2V7";
    private static final String IAP_CACHE_OLD = "com.facebook.internal.iap.PRODUCT_DETAILS";
    private static final String IAP_PURCHASE_CACHE_GPBLV1 = "com.facebook.internal.PURCHASE";
    private static final String IAP_SKU_CACHE_GPBLV1 = "com.facebook.internal.SKU_DETAILS";
    public static final InAppPurchaseLoggerManager INSTANCE = new InAppPurchaseLoggerManager();
    private static final double MILLISECONDS_IN_SECONDS = 1000.0d;
    private static final String PURCHASE_TIME = "purchaseTime";
    private static final String TIME_OF_LAST_LOGGED_PURCHASE_KEY = "TIME_OF_LAST_LOGGED_PURCHASE";
    private static final String TIME_OF_LAST_LOGGED_SUBSCRIPTION_KEY = "TIME_OF_LAST_LOGGED_SUBSCRIPTION";

    private InAppPurchaseLoggerManager() {
    }

    public static final void deleteOldCacheHistory() {
        if (v7.a.b(InAppPurchaseLoggerManager.class)) {
            return;
        }
        try {
            SharedPreferences sharedPreferences = s.b().getSharedPreferences(IAP_SKU_CACHE_GPBLV1, 0);
            SharedPreferences sharedPreferences2 = s.b().getSharedPreferences(IAP_PURCHASE_CACHE_GPBLV1, 0);
            sharedPreferences.edit().clear().apply();
            sharedPreferences2.edit().clear().apply();
            s.b().getSharedPreferences(IAP_CACHE_OLD, 0).edit().clear().apply();
        } catch (Throwable th2) {
            v7.a.a(InAppPurchaseLoggerManager.class, th2);
        }
    }

    public static final void filterPurchaseLogging(Map<String, JSONObject> purchaseDetailsMap, Map<String, ? extends JSONObject> skuDetailsMap, boolean isSubscription, String packageName, InAppPurchaseUtils.BillingClientVersion billingClientVersion, boolean isFirstAppLaunch) {
        if (v7.a.b(InAppPurchaseLoggerManager.class)) {
            return;
        }
        try {
            n.f(purchaseDetailsMap, "purchaseDetailsMap");
            n.f(skuDetailsMap, "skuDetailsMap");
            n.f(packageName, "packageName");
            n.f(billingClientVersion, "billingClientVersion");
            InAppPurchaseLoggerManager inAppPurchaseLoggerManager = INSTANCE;
            inAppPurchaseLoggerManager.logPurchases(inAppPurchaseLoggerManager.constructLoggingReadyMap$facebook_core_release(inAppPurchaseLoggerManager.cacheDeDupPurchase$facebook_core_release(purchaseDetailsMap, isSubscription), skuDetailsMap, packageName), isSubscription, billingClientVersion, isFirstAppLaunch);
        } catch (Throwable th2) {
            v7.a.a(InAppPurchaseLoggerManager.class, th2);
        }
    }

    public static final boolean getIsFirstAppLaunchWithNewIAP() {
        if (v7.a.b(InAppPurchaseLoggerManager.class)) {
            return false;
        }
        try {
            return !s.b().getSharedPreferences(IAP_CACHE_GPBLV2V7, 0).contains(APP_HAS_BEEN_LAUNCHED_KEY);
        } catch (Throwable th2) {
            v7.a.a(InAppPurchaseLoggerManager.class, th2);
            return false;
        }
    }

    private final void logPurchases(Map<String, String> purchaseDetailsMap, boolean isSubscription, InAppPurchaseUtils.BillingClientVersion billingClientVersion, boolean isFirstAppLaunch) {
        if (v7.a.b(this)) {
            return;
        }
        try {
            for (Map.Entry<String, String> entry : purchaseDetailsMap.entrySet()) {
                AutomaticAnalyticsLogger.logPurchase(entry.getKey(), entry.getValue(), isSubscription, billingClientVersion, isFirstAppLaunch);
            }
        } catch (Throwable th2) {
            v7.a.a(this, th2);
        }
    }

    public static final void migrateOldCacheHistory() {
        if (v7.a.b(InAppPurchaseLoggerManager.class)) {
            return;
        }
        try {
            SharedPreferences sharedPreferences = s.b().getSharedPreferences(IAP_CACHE_GPBLV2V7, 0);
            long jMax = Math.max(Math.max(sharedPreferences.getLong(TIME_OF_LAST_LOGGED_PURCHASE_KEY, 0L), sharedPreferences.getLong(TIME_OF_LAST_LOGGED_SUBSCRIPTION_KEY, 0L)), APPROXIMATE_IAP_ENHANCEMENT_RELEASE_TIME);
            CopyOnWriteArraySet copyOnWriteArraySet = new CopyOnWriteArraySet();
            SharedPreferences sharedPreferences2 = s.b().getSharedPreferences(IAP_CACHE_OLD, 0);
            if (sharedPreferences2.contains(CACHED_PURCHASES_KEY)) {
                Set<String> stringSet = sharedPreferences2.getStringSet(CACHED_PURCHASES_KEY, new HashSet());
                if (stringSet == null) {
                    stringSet = new HashSet<>();
                }
                copyOnWriteArraySet.addAll(stringSet);
                Iterator it = copyOnWriteArraySet.iterator();
                while (it.hasNext()) {
                    try {
                        long j10 = Long.parseLong((String) h.I0((String) it.next(), new String[]{";"}, 2, 2).get(1)) * 1000;
                        if (Math.abs(String.valueOf(j10).length() - 13) < Math.log10(MILLISECONDS_IN_SECONDS)) {
                            jMax = Math.max(jMax, j10);
                        }
                    } catch (Exception unused) {
                    }
                }
            }
            sharedPreferences.edit().putLong(TIME_OF_LAST_LOGGED_SUBSCRIPTION_KEY, jMax).apply();
            sharedPreferences.edit().putLong(TIME_OF_LAST_LOGGED_PURCHASE_KEY, jMax).apply();
            deleteOldCacheHistory();
        } catch (Throwable th2) {
            v7.a.a(InAppPurchaseLoggerManager.class, th2);
        }
    }

    public static final void setAppHasBeenLaunchedWithNewIAP() {
        if (v7.a.b(InAppPurchaseLoggerManager.class)) {
            return;
        }
        try {
            try {
                s.b().getSharedPreferences(IAP_CACHE_GPBLV2V7, 0).edit().putBoolean(APP_HAS_BEEN_LAUNCHED_KEY, true).apply();
            } catch (Exception unused) {
            }
        } catch (Throwable th2) {
            v7.a.a(InAppPurchaseLoggerManager.class, th2);
        }
    }

    public static final void updateLatestPossiblePurchaseTime() {
        if (v7.a.b(InAppPurchaseLoggerManager.class)) {
            return;
        }
        try {
            setAppHasBeenLaunchedWithNewIAP();
            try {
                SharedPreferences sharedPreferences = s.b().getSharedPreferences(IAP_CACHE_GPBLV2V7, 0);
                long jCurrentTimeMillis = System.currentTimeMillis();
                sharedPreferences.edit().putLong(TIME_OF_LAST_LOGGED_SUBSCRIPTION_KEY, jCurrentTimeMillis).apply();
                sharedPreferences.edit().putLong(TIME_OF_LAST_LOGGED_PURCHASE_KEY, jCurrentTimeMillis).apply();
            } catch (Exception unused) {
            }
        } catch (Throwable th2) {
            v7.a.a(InAppPurchaseLoggerManager.class, th2);
        }
    }

    public final Map<String, JSONObject> cacheDeDupPurchase$facebook_core_release(Map<String, JSONObject> purchaseDetailsMap, boolean isSubscription) {
        if (v7.a.b(this)) {
            return null;
        }
        try {
            n.f(purchaseDetailsMap, "purchaseDetailsMap");
            SharedPreferences sharedPreferences = s.b().getSharedPreferences(IAP_CACHE_GPBLV2V7, 0);
            long j10 = isSubscription ? sharedPreferences.getLong(TIME_OF_LAST_LOGGED_SUBSCRIPTION_KEY, APPROXIMATE_IAP_ENHANCEMENT_RELEASE_TIME) : sharedPreferences.getLong(TIME_OF_LAST_LOGGED_PURCHASE_KEY, APPROXIMATE_IAP_ENHANCEMENT_RELEASE_TIME);
            long jMax = 0;
            for (Map.Entry entry : b0.X(purchaseDetailsMap).entrySet()) {
                String str = (String) entry.getKey();
                JSONObject jSONObject = (JSONObject) entry.getValue();
                try {
                    if (jSONObject.has(Constants.GP_IAP_PURCHASE_TOKEN) && jSONObject.has("purchaseTime")) {
                        long j11 = jSONObject.getLong("purchaseTime");
                        if (j11 <= j10) {
                            purchaseDetailsMap.remove(str);
                        }
                        jMax = Math.max(jMax, j11);
                    }
                } catch (Exception unused) {
                }
            }
            if (jMax >= j10) {
                if (isSubscription) {
                    sharedPreferences.edit().putLong(TIME_OF_LAST_LOGGED_SUBSCRIPTION_KEY, jMax).apply();
                } else {
                    sharedPreferences.edit().putLong(TIME_OF_LAST_LOGGED_PURCHASE_KEY, jMax).apply();
                }
            }
            return new HashMap(purchaseDetailsMap);
        } catch (Throwable th2) {
            v7.a.a(this, th2);
            return null;
        }
    }

    public final Map<String, String> constructLoggingReadyMap$facebook_core_release(Map<String, ? extends JSONObject> purchaseDetailsMap, Map<String, ? extends JSONObject> skuDetailsMap, String packageName) {
        if (v7.a.b(this)) {
            return null;
        }
        try {
            n.f(purchaseDetailsMap, "purchaseDetailsMap");
            n.f(skuDetailsMap, "skuDetailsMap");
            n.f(packageName, "packageName");
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            for (Map.Entry<String, ? extends JSONObject> entry : purchaseDetailsMap.entrySet()) {
                String key = entry.getKey();
                JSONObject value = entry.getValue();
                JSONObject jSONObject = skuDetailsMap.get(key);
                try {
                    value.put("packageName", packageName);
                    if (jSONObject != null) {
                        String string = value.toString();
                        n.e(string, "purchaseDetail.toString()");
                        String string2 = jSONObject.toString();
                        n.e(string2, "skuDetail.toString()");
                        linkedHashMap.put(string, string2);
                    }
                } catch (Exception unused) {
                }
            }
            return linkedHashMap;
        } catch (Throwable th2) {
            v7.a.a(this, th2);
            return null;
        }
    }
}
