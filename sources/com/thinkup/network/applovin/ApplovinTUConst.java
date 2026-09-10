package com.thinkup.network.applovin;

import com.applovin.sdk.AppLovinSdk;
import java.util.Map;

/* JADX INFO: loaded from: classes6.dex */
public class ApplovinTUConst {
    public static final int NETWORK_FIRM_ID = 5;

    public static class DEBUGGER_CONFIG {
        public static final int Applovin_NETWORK = 5;
    }

    public static String getNetworkVersion() {
        try {
            return AppLovinSdk.VERSION;
        } catch (Throwable unused) {
            return "";
        }
    }

    public static Object getUnitInfoObj(Map<String, Object> map) {
        try {
            for (String str : map.keySet()) {
                try {
                    if (str.contains("dynamic_unit_info")) {
                        return map.get(str);
                    }
                    continue;
                } catch (Throwable unused) {
                }
            }
            return null;
        } catch (Throwable unused2) {
            return null;
        }
    }
}
