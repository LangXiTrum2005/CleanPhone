package com.thinkup.network.chartboost;

import com.chartboost.sdk.Chartboost;

/* JADX INFO: loaded from: classes6.dex */
public class ChartboostTUConst {
    public static final int NETWORK_FIRM_ID = 9;

    public static class DEBUGGER_CONFIG {
        public static final int Chartboost_NETWORK = 9;
    }

    public static String getNetworkVersion() {
        try {
            return Chartboost.getSDKVersion();
        } catch (Throwable unused) {
            return "";
        }
    }
}
