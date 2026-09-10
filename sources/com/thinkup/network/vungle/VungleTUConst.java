package com.thinkup.network.vungle;

import com.vungle.ads.VungleAds;
import java.lang.reflect.Method;

/* JADX INFO: loaded from: classes6.dex */
public class VungleTUConst {
    public static final int NETWORK_FIRM_ID = 13;
    static String o;

    public static class DEBUGGER_CONFIG {
        public static final int Vungle_NETWORK = 13;
    }

    public static String getNetworkVersion() {
        String str = o;
        if (str != null) {
            return str;
        }
        try {
            Method declaredMethod = VungleAds.class.getDeclaredMethod("getSdkVersion", new Class[0]);
            declaredMethod.setAccessible(true);
            String str2 = (String) declaredMethod.invoke(null, new Object[0]);
            o = str2;
            return str2;
        } catch (Throwable unused) {
            o = "";
            return "";
        }
    }
}
