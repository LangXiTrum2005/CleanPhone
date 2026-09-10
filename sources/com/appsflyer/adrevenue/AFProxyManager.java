package com.appsflyer.adrevenue;

import android.app.Application;
import com.appsflyer.AppsFlyerLib;
import com.appsflyer.adrevenue.data.model.AppsFlyerAdEvent;
import technofreak.saneness;

/* JADX INFO: loaded from: classes2.dex */
public class AFProxyManager {
    private static Application application;
    private static saneness<AppsFlyerAdEvent> listener;

    public static void init(Application application2, saneness<AppsFlyerAdEvent> sanenessVar) {
        application = application2;
        listener = sanenessVar;
    }

    public static void send(AppsFlyerAdEvent appsFlyerAdEvent) {
        AppsFlyerLib.getInstance().sendAdRevenue(application, appsFlyerAdEvent.toHashMap());
        saneness<AppsFlyerAdEvent> sanenessVar = listener;
        if (sanenessVar != null) {
            sanenessVar.accept(appsFlyerAdEvent);
        }
    }
}
