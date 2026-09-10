package com.thinkup.network.facebook;

import java.lang.reflect.Field;

/* JADX INFO: loaded from: classes6.dex */
public class FacebookTUConst {
    public static final int NETWORK_FIRM_ID = 1;
    static String m = null;
    protected static final String o = "encrypted_cpm";

    public static class DEBUGGER_CONFIG {
        public static final int Facebook_NATIVE_BANNER_SELF_RENDER = 4;
        public static final int Facebook_NATIVE_BANNER_TEMPLATE = 2;
        public static final int Facebook_NATIVE_SELF_RENDER = 1;
        public static final int Facebook_NATIVE_TEMPLATE = 3;
        public static final int Facebook_NETWORK = 1;
    }

    public static String getNetworkVersion() {
        String str = m;
        if (str != null) {
            return str;
        }
        try {
            Field declaredField = com.facebook.ads.BuildConfig.class.getDeclaredField("VERSION_NAME");
            declaredField.setAccessible(true);
            String str2 = (String) declaredField.get(null);
            m = str2;
            return str2;
        } catch (Throwable unused) {
            m = "";
            return "";
        }
    }
}
