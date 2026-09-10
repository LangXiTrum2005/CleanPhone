package com.appsflyer.adrevenue;

import android.app.Application;
import com.appsflyer.AFLogger;
import com.appsflyer.adrevenue.adnetworks.AFWrapper;
import com.appsflyer.adrevenue.adnetworks.generic.MediationNetwork;
import com.appsflyer.adrevenue.adnetworks.generic.Scheme;
import com.appsflyer.adrevenue.data.model.AppsFlyerAdEvent;
import java.util.Currency;
import java.util.HashMap;
import java.util.Map;
import technofreak.saneness;

/* JADX INFO: loaded from: classes2.dex */
public class AppsFlyerAdRevenue {
    private static AppsFlyerAdRevenue instance;

    public static class Builder {
        private final Application application;
        private saneness<AppsFlyerAdEvent> listener;

        public Builder(Application application) {
            this.application = application;
        }

        public Builder adEventListener(saneness<AppsFlyerAdEvent> sanenessVar) {
            this.listener = sanenessVar;
            return this;
        }

        public AppsFlyerAdRevenue build() {
            return new AppsFlyerAdRevenue(this.application, this.listener);
        }
    }

    public static void initialize(AppsFlyerAdRevenue appsFlyerAdRevenue) {
        synchronized (AppsFlyerAdRevenue.class) {
            try {
                if (instance != null) {
                    throw new IllegalStateException("Singleton instance already exists.");
                }
                instance = appsFlyerAdRevenue;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static void logAdRevenue(String str, MediationNetwork mediationNetwork, Currency currency, Double d, Map<String, String> map) {
        String str2;
        if (str == null || mediationNetwork == null || currency == null || d == null || str.isEmpty()) {
            AFLogger.afWarnLog("logAdRevenue: null or empty mandatory parameter");
            return;
        }
        HashMap map2 = new HashMap();
        map2.put(Scheme.MONETIZATION_NETWORK, str);
        map2.put(Scheme.MEDIATION_NETWORK, mediationNetwork.toString());
        map2.put(Scheme.EVENT_REVENUE_CURRENCY, currency.getCurrencyCode());
        map2.put(Scheme.EVENT_REVENUE, d);
        if (map != null) {
            HashMap map3 = new HashMap(map);
            map3.remove(null);
            str2 = (String) map3.remove("ad_type");
            map2.putAll(map3);
        } else {
            str2 = null;
        }
        AFWrapper.event(str2, map2, null);
    }

    private AppsFlyerAdRevenue(Application application, saneness<AppsFlyerAdEvent> sanenessVar) {
        AFProxyManager.init(application, sanenessVar);
    }
}
