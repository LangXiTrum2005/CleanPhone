package com.thinkup.network.startapp;

import com.startapp.sdk.adsbase.StartAppSDK;

/* JADX INFO: loaded from: classes6.dex */
public class StartAppTUConst {
    public static final int NETWORK_FIRM_ID = 25;

    public static class DEBUGGER_CONFIG {
        public static final int StartApp_NETWORK = 25;
    }

    public static String getNetworkVersion() {
        try {
            return StartAppSDK.getVersion();
        } catch (Throwable th) {
            th.printStackTrace();
            return "";
        }
    }
}
