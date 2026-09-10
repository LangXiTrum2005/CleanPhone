package com.smartdigimkt.sdk.api;

/* JADX INFO: loaded from: classes6.dex */
public class SDMAdConst {

    public static class AD_SIZE {
        public static final int NATIVE_EXPRESS_AUTO_HEIGHT = -2;
        public static final int NATIVE_EXPRESS_FULL_WIDTH = -1;
    }

    public static class ATDevFrameworkType {
        public static final String ADOBIE_AIR = "7";
        public static final String COCOS_2DX = "3";
        public static final String COCOS_CREATOR = "4";
        public static final String FLUTTER = "6";
        public static final String NATIVE = "1";
        public static final String REACT_NATIVE = "5";
        public static final String UNITY = "2";
    }

    public static class ATMixedFormatAdType {
        public static final int BANNER = 2;
        public static final int DEFAULT = -1;
        public static final int INTERSTITIAL = 3;
        public static final int MEDIA_VIDEO = 50;
        public static final int NATIVE = 0;
        public static final int REWARDED_VIDEO = 1;
        public static final int SPLASH = 4;
    }

    public static class CLICK_TYPE {
        public static final int APK_TYPE = 4;
        public static final int BROWSER_TYPE = 2;
        public static final int FAST_APP = 7;
        public static final int INNER_BROWSER_TYPE = 3;
        public static final int MARKET_TYPE = 1;
        public static final int WX_MINI_PROGRAM = 6;
    }

    public enum CURRENCY {
        RMB,
        RMB_CENT,
        USD
    }

    public static class DEBUGGER_CONFIG {
        public static final int SDM_BANNER_SIZE_300_250 = 3;
        public static final int SDM_BANNER_SIZE_320_50 = 1;
        public static final int SDM_BANNER_SIZE_320_90 = 2;
        public static final int SDM_BANNER_SIZE_728_90 = 4;
        public static final int SDM_INTERSTITIAL_FULL_SCREEN = 1;
        public static final int SDM_INTERSTITIAL_HALF_SCREEN = 2;
        public static final int SDM_NATIVE_EXPRESS_LEFT_PIC_RIGHT_TEXT = 1;
        public static final int SDM_NATIVE_EXPRESS_LEFT_TEXT_RIGHT_PIC = 2;
        public static final int SDM_NATIVE_EXPRESS_TOP_PIC_BOTTOM_TEXT = 3;
        public static final int SDM_NATIVE_EXPRESS_TOP_TEXT_BOTTOM_PIC = 4;
        public static final int SDM_NATIVE_SELF_RENDER = 6;
    }

    public static class EXTRA_PARAMS {
        public static final String E_L_PARAMS = "sdm_e_l_params";
        public static final String MEDIATION_VERSION = "sdm_mediation_version";
        public static final String SHOW_HIDE_SPLASH_SKIP_VIEW = "show_hide_splash_skip_view";
        public static final String SHOW_SCENARIO = "extra_scenario";
    }

    public static class GDPR {
        public static final int NONPERSONALIZED = 1;
        public static final int PERSONALIZED = 0;
        public static final int UNKNOWN = 2;
    }

    public static class NETWORK_CUSTOM_KEY {
        public static final String CREATIVE_ID = "creative_id";
        public static final String DSP_ID = "dsp_id";
        public static final String IS_DEEPLINK_OFFER = "is_deeplink";
        public static final String NETWORK_BIDDING_TYPE = "bidding_type";
        public static final String NETWORK_ECPM = "network_ecpm";
        public static final String NETWORK_ID = "network_id";
        public static final String NETWORK_NAME = "network_name";
        public static final String NETWORK_REQUEST_ID = "request_id";
        public static final String NETWORK_UNIT_ID = "network_unit_id";
        public static final String OFFER_ID = "offer_id";
        public static final String RV_ANIM_TYPE = "rv_anim_type";
        public static final String WS_ACTION = "ws_action";
        public static final String WS_IMP_SWITCH = "ws_imp_switch";
    }

    public static class PERSONALIZED_STATE {
        public static final int ALLOW_STATUS = 1;
        public static final int LIMIT_STATUS = 2;
    }
}
