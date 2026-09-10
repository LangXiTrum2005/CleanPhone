package com.appsflyer.adrevenue.adnetworks;

import com.appsflyer.adrevenue.AFProxyManager;
import com.appsflyer.adrevenue.data.model.AppsFlyerAdEvent;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public class AFWrapper {
    public static void event(String str, Map<String, Object> map, String str2) {
        AFProxyManager.send(new AppsFlyerAdEvent(str2, str, map));
    }
}
