package com.thinkup.core.api;

/* JADX INFO: loaded from: classes6.dex */
public class TUAdConst {
    public static final int AD_CHOICES_PLACEMENT_BOTTOM_LEFT = 3;
    public static final int AD_CHOICES_PLACEMENT_BOTTOM_RIGHT = 2;
    public static final int AD_CHOICES_PLACEMENT_INVISIBLE = 4;
    public static final int AD_CHOICES_PLACEMENT_TOP_LEFT = 0;
    public static final int AD_CHOICES_PLACEMENT_TOP_RIGHT = 1;
    public static final String AD_SUPPORT_SDK_DSP_ID_ARRAY = "[262]";
    public static final String AD_SUPPORT_TYPE_ARRAY = "[1,2,3]";
    public static final String AD_SUPPORT_TYPE_ARRAY_ONLY_PMP_SELF_REDNER = "[3]";
    public static final int AD_SUPPORT_TYPE_H5_TEMPLATE = 4;
    public static final String AD_SUPPORT_VAST_VERSION_ARRAY = "[1,2,3,4,5,6]";
    public static final int ORIENTATION_HORIZONTAL = 2;
    public static final int ORIENTATION_VERTICAL = 1;

    public static class BIDDING_ADN_ID {
        public static final int LOSE_TO_HB_IN_SAME_ADN = 2;
        public static final int LOSE_TO_NORMAL_IN_SAME_ADN = 1;
        public static final int LOSE_TO_OTHER_ADN = 4;
        public static final int LOSE_TO_OWN_ADN = 3;
        public static final int WIN_TO_SECOND_OTHER_ADN = 6;
        public static final int WIN_TO_SECOND_OWN_ADN = 5;
    }

    public static class BIDDING_TYPE {
        public static final String BIDDING_LOSS_WITH_BIDDING_TIMEOUT = "2";
        public static final String BIDDING_LOSS_WITH_EXPIRE = "5";
        public static final String BIDDING_LOSS_WITH_LOW_FLOOR = "104";
        public static final String BIDDING_LOSS_WITH_LOW_PRICE_IN_HB = "102";
        public static final String BIDDING_LOSS_WITH_LOW_PRICE_IN_NORMAL = "103";
        public static final int BIDDING_WIN_SECOND_BIDDING_TYPE = 101;
        public static final int BIDDING_WIN_SECOND_NORMAL_TYPE = 100;
    }

    public static class BidType {
        public static final int C2S = 2;
        public static final int NORMAL = 0;
        public static final int S2S = 1;
    }

    public static class CHANNEL_SOURCE {
        public static final int CHANNEL_AM = 4;
        public static final int CHANNEL_GM = 5;
        public static final int CHANNEL_IS = 8;
        public static final int CHANNEL_MX = 3;
        public static final int CHANNEL_OTHER = 1;
        public static final int CHANNEL_TB = 6;
        public static final int CHANNEL_TP = 7;
    }

    public enum CURRENCY {
        RMB,
        RMB_CENT,
        USD
    }

    public static class DISMISS_TYPE {
        public static final int CLICKAD = 4;
        public static final int NORMAL = 1;
        public static final int SHOWFAILED = 99;
        public static final int SKIP = 2;
        public static final int TIMEOVER = 3;
        public static final int UNKNOWN = 0;
    }

    public static class KEY {
        public static final String AD_CHOICES_PLACEMENT = "ad_choices_placement";
        public static final String AD_CLICK_CONFIRM_STATUS = "ad_click_confirm_status";
        public static final String AD_HEIGHT = "key_height";
        public static final String AD_IS_SUPPORT_DEEP_LINK = "ad_is_support_deep_link";
        public static final String AD_ORIENTATION = "ad_orientation";
        public static final String AD_SOUND = "ad_sound";
        public static final String AD_WIDTH = "key_width";
        public static final String APP_LOGO_ID = "app_logo_id";
        public static final String APP_NAME = "app_name";
        public static final String CP_LOAD_MODE = "cp_pre_md";
        public static final String CP_PLACEMENT_ID = "cp_placement_id";
        public static final String CUSTOM_DISLIKE_DIALOG = "custom_dislike_dialog";
        public static final String INIT_ADX_RES_VALID = "init_adx_res_valid";
        public static final String M_S = "m_s";
        public static final String REWARD_AMOUNT = "reward_amount";
        public static final String REWARD_NAME = "reward_name";
        public static final String START_APP_PRIMARY_IMAGE_SIZE = "start_app_primary_image_size";
        public static final String START_APP_SECONDARY_IMAGE_SIZE = "start_app_secondary_image_size";
        public static final String USER_CUSTOM_DATA = "user_custom_data";
        public static final String USER_ID = "user_id";
        public static final String WECHAT_APPID = "wechat_app_id";
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

    public static class NETWORK_REQUEST_PARAMS_KEY {
        public static final String ACCOUNT_ID = "account_id";
        public static final String ADP_ACCEPT_TYPE = "adp_accept_type";
        public static final String ADP_ACCEPT_VAST_VER = "vst_m_v";
        public static final String ADX_APP_ID = "adx_app_id";
        public static final String ADX_APP_KEY = "adx_app_key";
        public static final String ADX_DELAY_INSPECT_TIME = "adx_delay_inspect_time";
        public static final String ADX_DENNY_DEVICE_INFO = "adx_denny_device_info";
        public static final String ADX_ENABLE_GET_DEVICE_INFO_IN_BG = "adx_enable_get_device_info_in_bg";
        public static final String ADX_ENABLE_GET_RUNNING_APP_PROCESSES = "adx_enable_get_running_app_processes";
        public static final String ADX_EXCLUDE_PKG_LIST = "adx_exclude_pkg_list";
        public static final String ADX_INSPECT_INTERVAL = "adx_inspect_interval";
        public static final String ADX_LOCATION = "adx_location";
        public static final String ADX_MTG_DSP_MIX_TYPE = "ad_mtg_mix_type";
        public static final String ADX_PLACEMENT_ID = "adx_placement_id";
        public static final String ADX_PRECHECK_MODE = "adx_precheck_mode";
        public static final String ADX_SYSTEM_DEV_FRAMEWORK_TYPE = "adx_system_dev_framework_type";
        public static final String ADX_USER_DEVICE_INFO = "adx_user_device_info";
        public static final String ADX_WX_INSTALL_STATUS = "adx_wx_install_status";
        public static final String AD_HEIGHT = "ad_height";
        public static final String AD_LOAD_SEQ = "thinkup_adload_seq";
        public static final String AD_SOURCE_ID = "ad_source_id";
        public static final String AD_S_REQ_F_MODE = "ad_s_reqf_mode";
        public static final String AD_WIDTH = "ad_width";
        public static final String APP_ID = "app_id";
        public static final String APP_KEY = "app_key";
        public static final String BANNER_SIZE = "size";
        public static final String BIDDING_FLOOR = "bidfloor";
        public static final String BID_FLOOR = "bid_floor";
        public static final String BID_REQUEST_INFO = "bid_info";
        public static final String BID_TOKEN = "bid_token";
        public static final String BUYERUID = "buyeruid";
        public static final String CONTENT = "thinkup_content";
        public static final String CUSTOM_INHOUSE_BID_RESULT = "custom_inhouse_bid_result";
        public static final String C_BID_FLOOR = "c_bidfloor";
        public static final String DIRECTLY_AD_SOURCEIDS = "unit_ids";
        public static final String DIRECTLY_DA_CREATIVE_CLICK = "c_cl";
        public static final String DIRECTLY_DA_CREATIVE_IMPRESSION = "c_im";
        public static final String DIRECTLY_DA_OFFER_CLICK = "o_cl";
        public static final String DIRECTLY_DA_OFFER_IMPRESSION = "o_im";
        public static final String EXCLUDE_OFFER = "ecpoffer";
        public static final String FORMAT = "ad_format";
        public static final String GET_OFFER = "get_offer";
        public static final String GM_REFRESH_KEY = "forbid_gm_refresh";
        public static final String INSTANCE_ID = "instance_id";
        public static final String MEDIATION_WF_ID = "thinkup_mediation_wf_id";
        public static final String NETWORK_SDK_VERSION = "display_manager_ver";
        public static final String NW_FIRM_ID = "nw_firm_id";
        public static final String P_BIDFLOOR = "p_bidfloor";
        public static final String SDK_INFO = "sdk_info";
        public static final String STACK_INFO = "thinkup_stk_info";
        public static final String SUPPORT_TEMPLATE_VERSION = "tpl_ver";
        public static final String UNIT_ID = "unit_id";
        public static final String UNIT_TYPE = "unit_type";
    }

    public class PRIVACY {
        public static final int PERSIONALIZED_ALLOW_STATUS = 1;
        public static final int PERSIONALIZED_LIMIT_STATUS = 2;

        public PRIVACY() {
        }
    }

    public static class REWARD_EXTRA {
        public static final String REWARD_INFO = "at_reward_info";
        public static final String REWARD_INFO_ERROR_CODE = "at_reward_error_code";
        public static final String REWARD_INFO_ERROR_MSG = "at_reward_error_msg";
    }

    public static class REWARD_EXTRA_REPLACE_HODLER_KEY {
        public static final String NETWORK_PLACEMENT_ID_HOLDER_NAME = "{network_placement_id}";
    }

    public static class START_APP_IMAGE_SIZE {
        public static final int SIZE_100x100 = 1;
        public static final int SIZE_1200x628 = 4;
        public static final int SIZE_150x150 = 2;
        public static final int SIZE_340x340 = 3;
        public static final int SIZE_72x72 = 0;
    }

    public static class TUDevFrameworkType {
        public static final String ADOBIE_AIR = "7";
        public static final String COCOS_2DX = "3";
        public static final String COCOS_CREATOR = "4";
        public static final String FLUTTER = "6";
        public static final String NATIVE = "1";
        public static final String REACT_NATIVE = "5";
        public static final String UNITY = "2";
    }

    public static class TUMixedFormatAdType {
        public static final int BANNER = 2;
        public static final int DEFAULT = -1;
        public static final int INTERSTITIAL = 3;
        public static final int MEDIA_VIDEO = 50;
        public static final int NATIVE = 0;
        public static final int REWARDED_VIDEO = 1;
        public static final int SPLASH = 4;
    }

    public static class TUPlacementType {
        public static final int NORMAL = 1;
        public static final int SHARED = 2;
    }
}
