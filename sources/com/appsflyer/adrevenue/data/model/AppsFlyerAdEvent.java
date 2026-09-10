package com.appsflyer.adrevenue.data.model;

import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public class AppsFlyerAdEvent {
    private final String adNetworkActionName;
    private final String adNetworkEventType;
    private final Map<String, Object> payload;

    public AppsFlyerAdEvent(String str, String str2, Map<String, Object> map) {
        this.payload = map;
        this.adNetworkActionName = str;
        this.adNetworkEventType = str2;
    }

    public String getAdNetworkActionName() {
        return this.adNetworkActionName;
    }

    public String getAdNetworkEventType() {
        return this.adNetworkEventType;
    }

    public Map<String, Object> getAdNetworkPayload() {
        return this.payload;
    }

    public Map<String, Object> toHashMap() {
        HashMap map = new HashMap();
        map.put("name", "adrevenue_generic");
        String str = this.adNetworkEventType;
        if (str != null) {
            map.put("event_type", str);
        }
        String str2 = this.adNetworkActionName;
        if (str2 != null) {
            map.put("action_name", str2);
        }
        map.put("payload", this.payload);
        return map;
    }
}
