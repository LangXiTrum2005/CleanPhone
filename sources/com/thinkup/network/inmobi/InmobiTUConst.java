package com.thinkup.network.inmobi;

import com.inmobi.sdk.InMobiSdk;

/* JADX INFO: loaded from: classes6.dex */
public class InmobiTUConst {
    public static final int NETWORK_FIRM_ID = 3;

    public static class DEBUGGER_CONFIG {
        public static final int Inmobi_NETWORK = 3;
    }

    public static class REWARD_EXTRA {
        public static final String REWARD_EXTRA_KEY_REWARD_MAP = "inmobi_reward_map";
    }

    public static String getNetworkVersion() {
        try {
            return InMobiSdk.getVersion();
        } catch (Throwable unused) {
            return "";
        }
    }
}
