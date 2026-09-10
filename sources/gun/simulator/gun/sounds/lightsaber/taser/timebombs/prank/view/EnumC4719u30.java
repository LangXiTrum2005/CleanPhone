package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import com.google.protobuf.Internal;

/* JADX INFO: renamed from: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.u30, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public enum EnumC4719u30 implements Internal.EnumLite {
    UNKNOWN_ERROR(0),
    INVALID_APP_ID(2),
    CURRENTLY_INITIALIZING(3),
    ALREADY_INITIALIZED(4),
    SDK_NOT_INITIALIZED(6),
    USER_AGENT_ERROR(7),
    API_REQUEST_ERROR(101),
    API_RESPONSE_DATA_ERROR(102),
    API_RESPONSE_DECODE_ERROR(103),
    API_FAILED_STATUS_CODE(104),
    INVALID_TEMPLATE_URL(105),
    INVALID_REQUEST_BUILDER_ERROR(106),
    TEMPLATE_UNZIP_ERROR(109),
    INVALID_CTA_URL(110),
    INVALID_ASSET_URL(111),
    ASSET_REQUEST_ERROR(112),
    ASSET_RESPONSE_DATA_ERROR(113),
    ASSET_WRITE_ERROR(114),
    INVALID_INDEX_URL(115),
    GZIP_ENCODE_ERROR(116),
    ASSET_FAILED_STATUS_CODE(ASSET_FAILED_STATUS_CODE_VALUE),
    PROTOBUF_SERIALIZATION_ERROR(PROTOBUF_SERIALIZATION_ERROR_VALUE),
    JSON_ENCODE_ERROR(JSON_ENCODE_ERROR_VALUE),
    TPAT_ERROR(121),
    INVALID_ADS_ENDPOINT(122),
    INVALID_RI_ENDPOINT(123),
    INVALID_LOG_ERROR_ENDPOINT(124),
    INVALID_METRICS_ENDPOINT(INVALID_METRICS_ENDPOINT_VALUE),
    ASSET_FAILED_INSUFFICIENT_SPACE(ASSET_FAILED_INSUFFICIENT_SPACE_VALUE),
    ASSET_FAILED_MAX_SPACE_EXCEEDED(ASSET_FAILED_MAX_SPACE_EXCEEDED_VALUE),
    INVALID_TPAT_KEY(128),
    EMPTY_TPAT_ERROR(129),
    MRAID_DOWNLOAD_JS_ERROR(130),
    MRAID_JS_WRITE_FAILED(131),
    OMSDK_DOWNLOAD_JS_ERROR(132),
    OMSDK_JS_WRITE_FAILED(133),
    STORE_REGION_CODE_ERROR(134),
    INVALID_CONFIG_RESPONSE(135),
    PRIVACY_URL_ERROR(136),
    TPAT_RETRY_FAILED(137),
    CONFIG_REFRESH_FAILED(138),
    INVALID_EVENT_ID_ERROR(200),
    INVALID_PLACEMENT_ID(201),
    AD_CONSUMED(202),
    AD_IS_LOADING(203),
    AD_ALREADY_LOADED(204),
    AD_IS_PLAYING(205),
    AD_ALREADY_FAILED(206),
    PLACEMENT_AD_TYPE_MISMATCH(207),
    INVALID_BID_PAYLOAD(INVALID_BID_PAYLOAD_VALUE),
    INVALID_JSON_BID_PAYLOAD(INVALID_JSON_BID_PAYLOAD_VALUE),
    AD_NOT_LOADED(AD_NOT_LOADED_VALUE),
    PLACEMENT_SLEEP(PLACEMENT_SLEEP_VALUE),
    INVALID_ADUNIT_BID_PAYLOAD(INVALID_ADUNIT_BID_PAYLOAD_VALUE),
    INVALID_GZIP_BID_PAYLOAD(INVALID_GZIP_BID_PAYLOAD_VALUE),
    AD_RESPONSE_EMPTY(AD_RESPONSE_EMPTY_VALUE),
    AD_RESPONSE_INVALID_TEMPLATE_TYPE(AD_RESPONSE_INVALID_TEMPLATE_TYPE_VALUE),
    AD_RESPONSE_TIMED_OUT(AD_RESPONSE_TIMED_OUT_VALUE),
    MRAID_JS_DOES_NOT_EXIST(MRAID_JS_DOES_NOT_EXIST_VALUE),
    MRAID_JS_COPY_FAILED(MRAID_JS_COPY_FAILED_VALUE),
    AD_RESPONSE_RETRY_AFTER(AD_RESPONSE_RETRY_AFTER_VALUE),
    AD_LOAD_FAIL_RETRY_AFTER(AD_LOAD_FAIL_RETRY_AFTER_VALUE),
    INVALID_WATERFALL_PLACEMENT_ID(INVALID_WATERFALL_PLACEMENT_ID_VALUE),
    STALE_CACHED_RESPONSE(STALE_CACHED_RESPONSE_VALUE),
    AD_NO_FILL(AD_NO_FILL_VALUE),
    AD_LOAD_TOO_FREQUENTLY(AD_LOAD_TOO_FREQUENTLY_VALUE),
    AD_SERVER_ERROR(AD_SERVER_ERROR_VALUE),
    AD_PUBLISHER_MISMATCH(AD_PUBLISHER_MISMATCH_VALUE),
    AD_INTERNAL_INTEGRATION_ERROR(AD_INTERNAL_INTEGRATION_ERROR_VALUE),
    CONFIG_NOT_FOUND_ERROR(CONFIG_NOT_FOUND_ERROR_VALUE),
    MRAID_ERROR(301),
    INVALID_IFA_STATUS(302),
    AD_EXPIRED(304),
    MRAID_BRIDGE_ERROR(305),
    AD_EXPIRED_ON_PLAY(307),
    AD_WIN_NOTIFICATION_ERROR(308),
    ASSET_FAILED_TO_DELETE(309),
    AD_HTML_FAILED_TO_LOAD(310),
    MRAID_JS_CALL_EMPTY(311),
    DEEPLINK_OPEN_FAILED(312),
    EVALUATE_JAVASCRIPT_FAILED(313),
    LINK_COMMAND_OPEN_FAILED(314),
    JSON_PARAMS_ENCODE_ERROR(315),
    GENERATE_JSON_DATA_ERROR(316),
    AD_CLOSED_TEMPLATE_ERROR(317),
    AD_CLOSED_MISSING_HEARTBEAT(318),
    SILENT_MODE_MONITOR_ERROR(SILENT_MODE_MONITOR_ERROR_VALUE),
    WEBVIEW_ERROR(WEBVIEW_ERROR_VALUE),
    CONCURRENT_PLAYBACK_UNSUPPORTED(400),
    BANNER_VIEW_INVALID_SIZE(500),
    NATIVE_ASSET_ERROR(600),
    WEB_VIEW_WEB_CONTENT_PROCESS_DID_TERMINATE(2000),
    WEB_VIEW_FAILED_NAVIGATION(2001),
    STORE_KIT_LOAD_ERROR(2002),
    OMSDK_COPY_ERROR(2003),
    STORE_OVERLAY_LOAD_ERROR(2004),
    REACHABILITY_INITIALIZATION_FAILED(2005),
    UNKNOWN_RADIO_ACCESS_TECHNOLOGY(2006),
    STORE_KIT_PRESENTATION_ERROR(2007),
    STORE_OVERLAY_PRESENTATION_ERROR(2008),
    INVALID_PLAY_PARAMETER(2009),
    OUT_OF_MEMORY(3001),
    UNRECOGNIZED(-1);

    public static final int AD_ALREADY_FAILED_VALUE = 206;
    public static final int AD_ALREADY_LOADED_VALUE = 204;
    public static final int AD_CLOSED_MISSING_HEARTBEAT_VALUE = 318;
    public static final int AD_CLOSED_TEMPLATE_ERROR_VALUE = 317;
    public static final int AD_CONSUMED_VALUE = 202;
    public static final int AD_EXPIRED_ON_PLAY_VALUE = 307;
    public static final int AD_EXPIRED_VALUE = 304;
    public static final int AD_HTML_FAILED_TO_LOAD_VALUE = 310;
    public static final int AD_INTERNAL_INTEGRATION_ERROR_VALUE = 30002;
    public static final int AD_IS_LOADING_VALUE = 203;
    public static final int AD_IS_PLAYING_VALUE = 205;
    public static final int AD_LOAD_FAIL_RETRY_AFTER_VALUE = 221;
    public static final int AD_LOAD_TOO_FREQUENTLY_VALUE = 10002;
    public static final int AD_NOT_LOADED_VALUE = 210;
    public static final int AD_NO_FILL_VALUE = 10001;
    public static final int AD_PUBLISHER_MISMATCH_VALUE = 30001;
    public static final int AD_RESPONSE_EMPTY_VALUE = 215;
    public static final int AD_RESPONSE_INVALID_TEMPLATE_TYPE_VALUE = 216;
    public static final int AD_RESPONSE_RETRY_AFTER_VALUE = 220;
    public static final int AD_RESPONSE_TIMED_OUT_VALUE = 217;
    public static final int AD_SERVER_ERROR_VALUE = 20001;
    public static final int AD_WIN_NOTIFICATION_ERROR_VALUE = 308;
    public static final int ALREADY_INITIALIZED_VALUE = 4;
    public static final int API_FAILED_STATUS_CODE_VALUE = 104;
    public static final int API_REQUEST_ERROR_VALUE = 101;
    public static final int API_RESPONSE_DATA_ERROR_VALUE = 102;
    public static final int API_RESPONSE_DECODE_ERROR_VALUE = 103;
    public static final int ASSET_FAILED_INSUFFICIENT_SPACE_VALUE = 126;
    public static final int ASSET_FAILED_MAX_SPACE_EXCEEDED_VALUE = 127;
    public static final int ASSET_FAILED_STATUS_CODE_VALUE = 117;
    public static final int ASSET_FAILED_TO_DELETE_VALUE = 309;
    public static final int ASSET_REQUEST_ERROR_VALUE = 112;
    public static final int ASSET_RESPONSE_DATA_ERROR_VALUE = 113;
    public static final int ASSET_WRITE_ERROR_VALUE = 114;
    public static final int BANNER_VIEW_INVALID_SIZE_VALUE = 500;
    public static final int CONCURRENT_PLAYBACK_UNSUPPORTED_VALUE = 400;
    public static final int CONFIG_NOT_FOUND_ERROR_VALUE = 30003;
    public static final int CONFIG_REFRESH_FAILED_VALUE = 138;
    public static final int CURRENTLY_INITIALIZING_VALUE = 3;
    public static final int DEEPLINK_OPEN_FAILED_VALUE = 312;
    public static final int EMPTY_TPAT_ERROR_VALUE = 129;
    public static final int EVALUATE_JAVASCRIPT_FAILED_VALUE = 313;
    public static final int GENERATE_JSON_DATA_ERROR_VALUE = 316;
    public static final int GZIP_ENCODE_ERROR_VALUE = 116;
    public static final int INVALID_ADS_ENDPOINT_VALUE = 122;
    public static final int INVALID_ADUNIT_BID_PAYLOAD_VALUE = 213;
    public static final int INVALID_APP_ID_VALUE = 2;
    public static final int INVALID_ASSET_URL_VALUE = 111;
    public static final int INVALID_BID_PAYLOAD_VALUE = 208;
    public static final int INVALID_CONFIG_RESPONSE_VALUE = 135;
    public static final int INVALID_CTA_URL_VALUE = 110;
    public static final int INVALID_EVENT_ID_ERROR_VALUE = 200;
    public static final int INVALID_GZIP_BID_PAYLOAD_VALUE = 214;
    public static final int INVALID_IFA_STATUS_VALUE = 302;
    public static final int INVALID_INDEX_URL_VALUE = 115;
    public static final int INVALID_JSON_BID_PAYLOAD_VALUE = 209;
    public static final int INVALID_LOG_ERROR_ENDPOINT_VALUE = 124;
    public static final int INVALID_METRICS_ENDPOINT_VALUE = 125;
    public static final int INVALID_PLACEMENT_ID_VALUE = 201;
    public static final int INVALID_PLAY_PARAMETER_VALUE = 2009;
    public static final int INVALID_REQUEST_BUILDER_ERROR_VALUE = 106;
    public static final int INVALID_RI_ENDPOINT_VALUE = 123;
    public static final int INVALID_TEMPLATE_URL_VALUE = 105;
    public static final int INVALID_TPAT_KEY_VALUE = 128;
    public static final int INVALID_WATERFALL_PLACEMENT_ID_VALUE = 222;
    public static final int JSON_ENCODE_ERROR_VALUE = 119;
    public static final int JSON_PARAMS_ENCODE_ERROR_VALUE = 315;
    public static final int LINK_COMMAND_OPEN_FAILED_VALUE = 314;
    public static final int MRAID_BRIDGE_ERROR_VALUE = 305;
    public static final int MRAID_DOWNLOAD_JS_ERROR_VALUE = 130;
    public static final int MRAID_ERROR_VALUE = 301;
    public static final int MRAID_JS_CALL_EMPTY_VALUE = 311;
    public static final int MRAID_JS_COPY_FAILED_VALUE = 219;
    public static final int MRAID_JS_DOES_NOT_EXIST_VALUE = 218;
    public static final int MRAID_JS_WRITE_FAILED_VALUE = 131;
    public static final int NATIVE_ASSET_ERROR_VALUE = 600;
    public static final int OMSDK_COPY_ERROR_VALUE = 2003;
    public static final int OMSDK_DOWNLOAD_JS_ERROR_VALUE = 132;
    public static final int OMSDK_JS_WRITE_FAILED_VALUE = 133;
    public static final int OUT_OF_MEMORY_VALUE = 3001;
    public static final int PLACEMENT_AD_TYPE_MISMATCH_VALUE = 207;
    public static final int PLACEMENT_SLEEP_VALUE = 212;
    public static final int PRIVACY_URL_ERROR_VALUE = 136;
    public static final int PROTOBUF_SERIALIZATION_ERROR_VALUE = 118;
    public static final int REACHABILITY_INITIALIZATION_FAILED_VALUE = 2005;
    public static final int SDK_NOT_INITIALIZED_VALUE = 6;
    public static final int SILENT_MODE_MONITOR_ERROR_VALUE = 319;
    public static final int STALE_CACHED_RESPONSE_VALUE = 223;
    public static final int STORE_KIT_LOAD_ERROR_VALUE = 2002;
    public static final int STORE_KIT_PRESENTATION_ERROR_VALUE = 2007;
    public static final int STORE_OVERLAY_LOAD_ERROR_VALUE = 2004;
    public static final int STORE_OVERLAY_PRESENTATION_ERROR_VALUE = 2008;
    public static final int STORE_REGION_CODE_ERROR_VALUE = 134;
    public static final int TEMPLATE_UNZIP_ERROR_VALUE = 109;
    public static final int TPAT_ERROR_VALUE = 121;
    public static final int TPAT_RETRY_FAILED_VALUE = 137;
    public static final int UNKNOWN_ERROR_VALUE = 0;
    public static final int UNKNOWN_RADIO_ACCESS_TECHNOLOGY_VALUE = 2006;
    public static final int USER_AGENT_ERROR_VALUE = 7;
    public static final int WEBVIEW_ERROR_VALUE = 320;
    public static final int WEB_VIEW_FAILED_NAVIGATION_VALUE = 2001;
    public static final int WEB_VIEW_WEB_CONTENT_PROCESS_DID_TERMINATE_VALUE = 2000;
    private static final Internal.EnumLiteMap<EnumC4719u30> internalValueMap = new Internal.EnumLiteMap() { // from class: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.s30
        @Override // com.google.protobuf.Internal.EnumLiteMap
        public EnumC4719u30 findValueByNumber(int i) {
            return EnumC4719u30.forNumber(i);
        }
    };
    private final int value;

    EnumC4719u30(int i) {
        this.value = i;
    }

    public static EnumC4719u30 forNumber(int i) {
        if (i != 0) {
            if (i == 2) {
                return INVALID_APP_ID;
            }
            if (i == 3) {
                return CURRENTLY_INITIALIZING;
            }
            if (i == 4) {
                return ALREADY_INITIALIZED;
            }
            if (i == 6) {
                return SDK_NOT_INITIALIZED;
            }
            if (i == 7) {
                return USER_AGENT_ERROR;
            }
            if (i == 301) {
                return MRAID_ERROR;
            }
            if (i == 302) {
                return INVALID_IFA_STATUS;
            }
            if (i == 304) {
                return AD_EXPIRED;
            }
            if (i == 305) {
                return MRAID_BRIDGE_ERROR;
            }
            switch (i) {
                case 0:
                    break;
                case 121:
                    return TPAT_ERROR;
                case 122:
                    return INVALID_ADS_ENDPOINT;
                case 123:
                    return INVALID_RI_ENDPOINT;
                case 124:
                    return INVALID_LOG_ERROR_ENDPOINT;
                case INVALID_METRICS_ENDPOINT_VALUE:
                    return INVALID_METRICS_ENDPOINT;
                case ASSET_FAILED_INSUFFICIENT_SPACE_VALUE:
                    return ASSET_FAILED_INSUFFICIENT_SPACE;
                case ASSET_FAILED_MAX_SPACE_EXCEEDED_VALUE:
                    return ASSET_FAILED_MAX_SPACE_EXCEEDED;
                case 128:
                    return INVALID_TPAT_KEY;
                case 129:
                    return EMPTY_TPAT_ERROR;
                case 130:
                    return MRAID_DOWNLOAD_JS_ERROR;
                case 131:
                    return MRAID_JS_WRITE_FAILED;
                case 132:
                    return OMSDK_DOWNLOAD_JS_ERROR;
                case 133:
                    return OMSDK_JS_WRITE_FAILED;
                case 134:
                    return STORE_REGION_CODE_ERROR;
                case 135:
                    return INVALID_CONFIG_RESPONSE;
                case 136:
                    return PRIVACY_URL_ERROR;
                case 137:
                    return TPAT_RETRY_FAILED;
                case 138:
                    return CONFIG_REFRESH_FAILED;
                case 400:
                    return CONCURRENT_PLAYBACK_UNSUPPORTED;
                case 500:
                    return BANNER_VIEW_INVALID_SIZE;
                case 600:
                    return NATIVE_ASSET_ERROR;
                case 2000:
                    return WEB_VIEW_WEB_CONTENT_PROCESS_DID_TERMINATE;
                case 2001:
                    return WEB_VIEW_FAILED_NAVIGATION;
                case 2002:
                    return STORE_KIT_LOAD_ERROR;
                case 2003:
                    return OMSDK_COPY_ERROR;
                case 2004:
                    return STORE_OVERLAY_LOAD_ERROR;
                case 2005:
                    return REACHABILITY_INITIALIZATION_FAILED;
                case 2006:
                    return UNKNOWN_RADIO_ACCESS_TECHNOLOGY;
                case 2007:
                    return STORE_KIT_PRESENTATION_ERROR;
                case 2008:
                    return STORE_OVERLAY_PRESENTATION_ERROR;
                case 2009:
                    return INVALID_PLAY_PARAMETER;
                case 3001:
                    return OUT_OF_MEMORY;
                case AD_NO_FILL_VALUE:
                    return AD_NO_FILL;
                case AD_LOAD_TOO_FREQUENTLY_VALUE:
                    return AD_LOAD_TOO_FREQUENTLY;
                case AD_SERVER_ERROR_VALUE:
                    return AD_SERVER_ERROR;
                case AD_PUBLISHER_MISMATCH_VALUE:
                    return AD_PUBLISHER_MISMATCH;
                case AD_INTERNAL_INTEGRATION_ERROR_VALUE:
                    return AD_INTERNAL_INTEGRATION_ERROR;
                case CONFIG_NOT_FOUND_ERROR_VALUE:
                    return CONFIG_NOT_FOUND_ERROR;
                default:
                    switch (i) {
                        case 101:
                            return API_REQUEST_ERROR;
                        case 102:
                            return API_RESPONSE_DATA_ERROR;
                        case 103:
                            return API_RESPONSE_DECODE_ERROR;
                        case 104:
                            return API_FAILED_STATUS_CODE;
                        case 105:
                            return INVALID_TEMPLATE_URL;
                        case 106:
                            return INVALID_REQUEST_BUILDER_ERROR;
                        default:
                            switch (i) {
                                case 109:
                                    return TEMPLATE_UNZIP_ERROR;
                                case 110:
                                    return INVALID_CTA_URL;
                                case 111:
                                    return INVALID_ASSET_URL;
                                case 112:
                                    return ASSET_REQUEST_ERROR;
                                case 113:
                                    return ASSET_RESPONSE_DATA_ERROR;
                                case 114:
                                    return ASSET_WRITE_ERROR;
                                case 115:
                                    return INVALID_INDEX_URL;
                                case 116:
                                    return GZIP_ENCODE_ERROR;
                                case ASSET_FAILED_STATUS_CODE_VALUE:
                                    return ASSET_FAILED_STATUS_CODE;
                                case PROTOBUF_SERIALIZATION_ERROR_VALUE:
                                    return PROTOBUF_SERIALIZATION_ERROR;
                                case JSON_ENCODE_ERROR_VALUE:
                                    return JSON_ENCODE_ERROR;
                                default:
                                    switch (i) {
                                        case 200:
                                            return INVALID_EVENT_ID_ERROR;
                                        case 201:
                                            return INVALID_PLACEMENT_ID;
                                        case 202:
                                            return AD_CONSUMED;
                                        case 203:
                                            return AD_IS_LOADING;
                                        case 204:
                                            return AD_ALREADY_LOADED;
                                        case 205:
                                            return AD_IS_PLAYING;
                                        case 206:
                                            return AD_ALREADY_FAILED;
                                        case 207:
                                            return PLACEMENT_AD_TYPE_MISMATCH;
                                        case INVALID_BID_PAYLOAD_VALUE:
                                            return INVALID_BID_PAYLOAD;
                                        case INVALID_JSON_BID_PAYLOAD_VALUE:
                                            return INVALID_JSON_BID_PAYLOAD;
                                        case AD_NOT_LOADED_VALUE:
                                            return AD_NOT_LOADED;
                                        default:
                                            switch (i) {
                                                case PLACEMENT_SLEEP_VALUE:
                                                    return PLACEMENT_SLEEP;
                                                case INVALID_ADUNIT_BID_PAYLOAD_VALUE:
                                                    return INVALID_ADUNIT_BID_PAYLOAD;
                                                case INVALID_GZIP_BID_PAYLOAD_VALUE:
                                                    return INVALID_GZIP_BID_PAYLOAD;
                                                case AD_RESPONSE_EMPTY_VALUE:
                                                    return AD_RESPONSE_EMPTY;
                                                case AD_RESPONSE_INVALID_TEMPLATE_TYPE_VALUE:
                                                    return AD_RESPONSE_INVALID_TEMPLATE_TYPE;
                                                case AD_RESPONSE_TIMED_OUT_VALUE:
                                                    return AD_RESPONSE_TIMED_OUT;
                                                case MRAID_JS_DOES_NOT_EXIST_VALUE:
                                                    return MRAID_JS_DOES_NOT_EXIST;
                                                case MRAID_JS_COPY_FAILED_VALUE:
                                                    return MRAID_JS_COPY_FAILED;
                                                case AD_RESPONSE_RETRY_AFTER_VALUE:
                                                    return AD_RESPONSE_RETRY_AFTER;
                                                case AD_LOAD_FAIL_RETRY_AFTER_VALUE:
                                                    return AD_LOAD_FAIL_RETRY_AFTER;
                                                case INVALID_WATERFALL_PLACEMENT_ID_VALUE:
                                                    return INVALID_WATERFALL_PLACEMENT_ID;
                                                case STALE_CACHED_RESPONSE_VALUE:
                                                    return STALE_CACHED_RESPONSE;
                                                default:
                                                    switch (i) {
                                                        case 307:
                                                            return AD_EXPIRED_ON_PLAY;
                                                        case 308:
                                                            return AD_WIN_NOTIFICATION_ERROR;
                                                        case 309:
                                                            return ASSET_FAILED_TO_DELETE;
                                                        case 310:
                                                            return AD_HTML_FAILED_TO_LOAD;
                                                        case 311:
                                                            return MRAID_JS_CALL_EMPTY;
                                                        case 312:
                                                            return DEEPLINK_OPEN_FAILED;
                                                        case 313:
                                                            return EVALUATE_JAVASCRIPT_FAILED;
                                                        case 314:
                                                            return LINK_COMMAND_OPEN_FAILED;
                                                        case 315:
                                                            return JSON_PARAMS_ENCODE_ERROR;
                                                        case 316:
                                                            return GENERATE_JSON_DATA_ERROR;
                                                        case 317:
                                                            return AD_CLOSED_TEMPLATE_ERROR;
                                                        case 318:
                                                            return AD_CLOSED_MISSING_HEARTBEAT;
                                                        case SILENT_MODE_MONITOR_ERROR_VALUE:
                                                            return SILENT_MODE_MONITOR_ERROR;
                                                        case WEBVIEW_ERROR_VALUE:
                                                            return WEBVIEW_ERROR;
                                                        default:
                                                            return null;
                                                    }
                                            }
                                    }
                            }
                    }
            }
        }
        return UNKNOWN_ERROR;
    }

    public static Internal.EnumLiteMap<EnumC4719u30> internalGetValueMap() {
        return internalValueMap;
    }

    public static Internal.EnumVerifier internalGetVerifier() {
        return C4631t30.INSTANCE;
    }

    @Override // com.google.protobuf.Internal.EnumLite
    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.value;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }

    @Deprecated
    public static EnumC4719u30 valueOf(int i) {
        return forNumber(i);
    }
}
