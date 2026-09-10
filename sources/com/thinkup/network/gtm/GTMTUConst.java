package com.thinkup.network.gtm;

import com.mbridge.msdk.out.MBConfiguration;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;

/* JADX INFO: loaded from: classes6.dex */
public class GTMTUConst {
    public static final int NETWORK_FIRM_ID = 6;
    public static final String NOTCH_SCREEN_BOTTOM = "notch_screen_bottom";
    public static final String NOTCH_SCREEN_LEFT = "notch_screen_left";
    public static final String NOTCH_SCREEN_RIGHT = "notch_screen_right";
    public static final String NOTCH_SCREEN_TOP = "notch_screen_top";
    static String o;

    public static class DEBUGGER_CONFIG {
        public static final int GTM_INTERSTITIAL_IMAGE = 1;
        public static final int GTM_INTERSTITIAL_VIDEO = 2;
        public static final int GTM_NATIVE_SELF_RENDER = 1;
        public static final int GTM_NATIVE_TEMPLATE = 2;
        public static final int GTM_NETWORK = 6;
    }

    public static class REWARD_EXTRA {
        public static final String REWARD_EXTRA_KEY_REWARD_ALERT_STATUS = "gtm_reward_alert_status";
        public static final String REWARD_EXTRA_KEY_REWARD_AMOUNT = "gtm_reward_amount";
        public static final String REWARD_EXTRA_KEY_REWARD_NAME = "gtm_reward_name";
    }

    public static String getNetworkVersion() {
        String str = o;
        if (str != null) {
            return str;
        }
        try {
            for (Field field : MBConfiguration.class.getFields()) {
                field.setAccessible(true);
                if (field.getType().toString().endsWith("java.lang.String") && Modifier.isStatic(field.getModifiers())) {
                    String string = field.get(MBConfiguration.class).toString();
                    if (string.startsWith("MAL")) {
                        o = string;
                        return string;
                    }
                }
            }
        } catch (Throwable unused) {
        }
        o = "";
        return "";
    }
}
