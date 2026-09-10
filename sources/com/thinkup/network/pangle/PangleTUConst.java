package com.thinkup.network.pangle;

import com.bytedance.sdk.openadsdk.api.init.PAGSdk;

/* JADX INFO: loaded from: classes6.dex */
public class PangleTUConst {
    public static final String NATIVE_AD_IMAGE_HEIGHT = "tt_image_height";
    public static final String NATIVE_AD_INTERRUPT_VIDEOPLAY = "tt_can_interrupt_video";
    public static final String NATIVE_AD_VIDEOPLAY_BTN_BITMAP = "tt_video_play_btn_bitmap";
    public static final String NATIVE_AD_VIDEOPLAY_BTN_SIZE = "tt_video_play_btn_SIZE";
    public static final int NETWORK_FIRM_ID = 50;
    static String o;

    public static class DEBUGGER_CONFIG {
        public static final int Pangle_NETWORK = 50;
    }

    public static class REWARD_EXTRA {
        public static final String REWARD_EXTRA_KEY_REWARD_AMOUNT = "pangle_reward_amount";
        public static final String REWARD_EXTRA_KEY_REWARD_NAME = "pangle_reward_name";
    }

    public static String getNetworkVersion() {
        String str = o;
        if (str != null) {
            return str;
        }
        try {
            String sDKVersion = PAGSdk.getSDKVersion();
            o = sDKVersion;
            return sDKVersion;
        } catch (Throwable unused) {
            o = "";
            return "";
        }
    }
}
