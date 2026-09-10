package com.thinkup.network.unityads;

import com.unity3d.ads.UnityAds;

/* JADX INFO: loaded from: classes6.dex */
public class UnityAdsTUConst {
    public static final int NETWORK_FIRM_ID = 12;
    static String o;

    public static class DEBUGGER_CONFIG {
        public static final int UnityAds_NETWORK = 12;
    }

    public static String getNetworkVersion() {
        String str = o;
        if (str != null) {
            return str;
        }
        try {
            String version = UnityAds.getVersion();
            o = version;
            return version;
        } catch (Throwable unused) {
            o = "";
            return "";
        }
    }
}
