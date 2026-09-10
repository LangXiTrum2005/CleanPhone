package com.appsflyer.internal;

import com.appsflyer.AFLogger;
import com.ironsource.A5;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public final class AFj1fSDK {
    public static Map<String, String> getRevenue(Map<String, String> map) {
        HashMap map2 = new HashMap();
        for (Map.Entry<String, String> entry : map.entrySet()) {
            try {
                map2.put(URLEncoder.encode(entry.getKey(), A5.O), URLEncoder.encode(entry.getValue(), A5.O));
            } catch (UnsupportedEncodingException e) {
                AFLogger.afErrorLogForExcManagerOnly("failed to encode map", e);
            }
        }
        return map2;
    }
}
