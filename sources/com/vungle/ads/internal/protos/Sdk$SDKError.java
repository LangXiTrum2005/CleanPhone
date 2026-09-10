package com.vungle.ads.internal.protos;

import com.google.protobuf.AbstractMessageLite;
import com.google.protobuf.ByteString;
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.Internal;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.Parser;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes2.dex */
public final class Sdk$SDKError extends GeneratedMessageLite<Sdk$SDKError, attabal> implements wireman {
    public static final int ADAPTERADFORMAT_FIELD_NUMBER = 26;
    public static final int ADLOADTYPE_FIELD_NUMBER = 25;
    public static final int ADSOURCE_FIELD_NUMBER = 16;
    public static final int ADSTATE_FIELD_NUMBER = 23;
    public static final int APPSTATE_FIELD_NUMBER = 17;
    public static final int AT_FIELD_NUMBER = 1;
    public static final int CONNECTIONTYPEDETAILANDROID_FIELD_NUMBER = 101;
    public static final int CONNECTIONTYPEDETAIL_FIELD_NUMBER = 10;
    public static final int CONNECTIONTYPE_FIELD_NUMBER = 9;
    public static final int CREATIVEID_FIELD_NUMBER = 12;
    private static final Sdk$SDKError DEFAULT_INSTANCE;
    public static final int EVENTID_FIELD_NUMBER = 4;
    public static final int EXPERIMENTS_FIELD_NUMBER = 24;
    public static final int ISADOENABLED_FIELD_NUMBER = 20;
    public static final int ISADPODDING_FIELD_NUMBER = 22;
    public static final int ISHBPLACEMENT_FIELD_NUMBER = 14;
    public static final int ISLOWDATAMODEENABLED_FIELD_NUMBER = 201;
    public static final int ISPARTIALDOWNLOADENABLED_FIELD_NUMBER = 21;
    public static final int MAKE_FIELD_NUMBER = 5;
    public static final int MEDIATIONNAME_FIELD_NUMBER = 18;
    public static final int MESSAGE_FIELD_NUMBER = 3;
    public static final int MODEL_FIELD_NUMBER = 6;
    public static final int OSVERSION_FIELD_NUMBER = 8;
    public static final int OS_FIELD_NUMBER = 7;
    private static volatile Parser<Sdk$SDKError> PARSER = null;
    public static final int PLACEMENTREFERENCEID_FIELD_NUMBER = 11;
    public static final int PLACEMENTTYPE_FIELD_NUMBER = 15;
    public static final int REASON_FIELD_NUMBER = 2;
    public static final int SESSIONID_FIELD_NUMBER = 13;
    public static final int VMVERSION_FIELD_NUMBER = 19;
    private long adLoadType_;
    private long appState_;
    private long at_;
    private boolean isAdPodding_;
    private boolean isAdoEnabled_;
    private long isHbPlacement_;
    private boolean isLowDataModeEnabled_;
    private boolean isPartialDownloadEnabled_;
    private int reason_;
    private String message_ = "";
    private String eventId_ = "";
    private String make_ = "";
    private String model_ = "";
    private String os_ = "";
    private String osVersion_ = "";
    private String connectionType_ = "";
    private String connectionTypeDetail_ = "";
    private String placementReferenceId_ = "";
    private String creativeId_ = "";
    private String sessionId_ = "";
    private String placementType_ = "";
    private String adSource_ = "";
    private String mediationName_ = "";
    private String vmVersion_ = "";
    private String adState_ = "";
    private String experiments_ = "";
    private String adapterAdFormat_ = "";
    private String connectionTypeDetailAndroid_ = "";

    public enum Reason implements Internal.EnumLite {
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
        ASSET_FAILED_STATUS_CODE(117),
        PROTOBUF_SERIALIZATION_ERROR(118),
        JSON_ENCODE_ERROR(119),
        TPAT_ERROR(121),
        INVALID_ADS_ENDPOINT(122),
        INVALID_RI_ENDPOINT(123),
        INVALID_LOG_ERROR_ENDPOINT(124),
        INVALID_METRICS_ENDPOINT(125),
        ASSET_FAILED_INSUFFICIENT_SPACE(126),
        ASSET_FAILED_MAX_SPACE_EXCEEDED(127),
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
        AD_LOAD_FAIL_EMPTY_BID_PAYLOAD(224),
        AD_LOAD_FAIL_PLACEMENT_ID_MISMATCH(AD_LOAD_FAIL_PLACEMENT_ID_MISMATCH_VALUE),
        PRIVACY_ICON_FALLBACK_ERROR(PRIVACY_ICON_FALLBACK_ERROR_VALUE),
        INVALID_CSB_DATA(INVALID_CSB_DATA_VALUE),
        MRAID_ERROR(301),
        INVALID_IFA_STATUS(302),
        AD_EXPIRED(AD_EXPIRED_VALUE),
        MRAID_BRIDGE_ERROR(MRAID_BRIDGE_ERROR_VALUE),
        AD_EXPIRED_ON_PLAY(307),
        AD_WIN_NOTIFICATION_ERROR(308),
        ASSET_FAILED_TO_DELETE(ASSET_FAILED_TO_DELETE_VALUE),
        AD_HTML_FAILED_TO_LOAD(AD_HTML_FAILED_TO_LOAD_VALUE),
        MRAID_JS_CALL_EMPTY(MRAID_JS_CALL_EMPTY_VALUE),
        DEEPLINK_OPEN_FAILED(DEEPLINK_OPEN_FAILED_VALUE),
        EVALUATE_JAVASCRIPT_FAILED(EVALUATE_JAVASCRIPT_FAILED_VALUE),
        LINK_COMMAND_OPEN_FAILED(LINK_COMMAND_OPEN_FAILED_VALUE),
        JSON_PARAMS_ENCODE_ERROR(JSON_PARAMS_ENCODE_ERROR_VALUE),
        GENERATE_JSON_DATA_ERROR(GENERATE_JSON_DATA_ERROR_VALUE),
        AD_CLOSED_TEMPLATE_ERROR(AD_CLOSED_TEMPLATE_ERROR_VALUE),
        AD_CLOSED_MISSING_HEARTBEAT(AD_CLOSED_MISSING_HEARTBEAT_VALUE),
        SILENT_MODE_MONITOR_ERROR(SILENT_MODE_MONITOR_ERROR_VALUE),
        WEBVIEW_ERROR(320),
        BLACK_SCREEN_DETECTION_ERROR(BLACK_SCREEN_DETECTION_ERROR_VALUE),
        CONCURRENT_PLAYBACK_UNSUPPORTED(400),
        BANNER_VIEW_INVALID_SIZE(500),
        NATIVE_ASSET_ERROR(600),
        NATIVE_VIDEO_PLAYBACK_ERROR(601),
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
        STORE_OVERLAY_DISMISSAL_ERROR(2010),
        PRESENTER_DEALLOCATED_BEFORE_LOAD_COMPLETION(2011),
        APP_IMPRESSION_CREATION_FAILED(2012),
        HANDLE_TAP_FAILED(2013),
        OUT_OF_MEMORY(3001),
        INLINE_INSTALL_ERROR(3002),
        VUNGLE_OIT_CREATION_ERROR(4000),
        MEDIATION_ERROR(5000),
        AD_NO_FILL(10001),
        AD_LOAD_TOO_FREQUENTLY(AD_LOAD_TOO_FREQUENTLY_VALUE),
        AD_SERVER_ERROR(AD_SERVER_ERROR_VALUE),
        AD_PUBLISHER_MISMATCH(AD_PUBLISHER_MISMATCH_VALUE),
        AD_INTERNAL_INTEGRATION_ERROR(AD_INTERNAL_INTEGRATION_ERROR_VALUE),
        CONFIG_NOT_FOUND_ERROR(CONFIG_NOT_FOUND_ERROR_VALUE),
        UNRECOGNIZED(-1);

        public static final int AD_ALREADY_FAILED_VALUE = 206;
        public static final int AD_ALREADY_LOADED_VALUE = 204;

        @Deprecated
        public static final int AD_CLOSED_MISSING_HEARTBEAT_VALUE = 318;
        public static final int AD_CLOSED_TEMPLATE_ERROR_VALUE = 317;
        public static final int AD_CONSUMED_VALUE = 202;
        public static final int AD_EXPIRED_ON_PLAY_VALUE = 307;
        public static final int AD_EXPIRED_VALUE = 304;
        public static final int AD_HTML_FAILED_TO_LOAD_VALUE = 310;
        public static final int AD_INTERNAL_INTEGRATION_ERROR_VALUE = 30002;
        public static final int AD_IS_LOADING_VALUE = 203;
        public static final int AD_IS_PLAYING_VALUE = 205;
        public static final int AD_LOAD_FAIL_EMPTY_BID_PAYLOAD_VALUE = 224;
        public static final int AD_LOAD_FAIL_PLACEMENT_ID_MISMATCH_VALUE = 225;
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

        @Deprecated
        public static final int AD_WIN_NOTIFICATION_ERROR_VALUE = 308;

        @Deprecated
        public static final int ALREADY_INITIALIZED_VALUE = 4;
        public static final int API_FAILED_STATUS_CODE_VALUE = 104;
        public static final int API_REQUEST_ERROR_VALUE = 101;
        public static final int API_RESPONSE_DATA_ERROR_VALUE = 102;
        public static final int API_RESPONSE_DECODE_ERROR_VALUE = 103;
        public static final int APP_IMPRESSION_CREATION_FAILED_VALUE = 2012;
        public static final int ASSET_FAILED_INSUFFICIENT_SPACE_VALUE = 126;

        @Deprecated
        public static final int ASSET_FAILED_MAX_SPACE_EXCEEDED_VALUE = 127;

        @Deprecated
        public static final int ASSET_FAILED_STATUS_CODE_VALUE = 117;
        public static final int ASSET_FAILED_TO_DELETE_VALUE = 309;
        public static final int ASSET_REQUEST_ERROR_VALUE = 112;

        @Deprecated
        public static final int ASSET_RESPONSE_DATA_ERROR_VALUE = 113;
        public static final int ASSET_WRITE_ERROR_VALUE = 114;
        public static final int BANNER_VIEW_INVALID_SIZE_VALUE = 500;
        public static final int BLACK_SCREEN_DETECTION_ERROR_VALUE = 321;
        public static final int CONCURRENT_PLAYBACK_UNSUPPORTED_VALUE = 400;
        public static final int CONFIG_NOT_FOUND_ERROR_VALUE = 30003;
        public static final int CONFIG_REFRESH_FAILED_VALUE = 138;

        @Deprecated
        public static final int CURRENTLY_INITIALIZING_VALUE = 3;
        public static final int DEEPLINK_OPEN_FAILED_VALUE = 312;
        public static final int EMPTY_TPAT_ERROR_VALUE = 129;
        public static final int EVALUATE_JAVASCRIPT_FAILED_VALUE = 313;
        public static final int GENERATE_JSON_DATA_ERROR_VALUE = 316;
        public static final int GZIP_ENCODE_ERROR_VALUE = 116;
        public static final int HANDLE_TAP_FAILED_VALUE = 2013;
        public static final int INLINE_INSTALL_ERROR_VALUE = 3002;
        public static final int INVALID_ADS_ENDPOINT_VALUE = 122;
        public static final int INVALID_ADUNIT_BID_PAYLOAD_VALUE = 213;
        public static final int INVALID_APP_ID_VALUE = 2;
        public static final int INVALID_ASSET_URL_VALUE = 111;
        public static final int INVALID_BID_PAYLOAD_VALUE = 208;
        public static final int INVALID_CONFIG_RESPONSE_VALUE = 135;
        public static final int INVALID_CSB_DATA_VALUE = 227;
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

        @Deprecated
        public static final int INVALID_WATERFALL_PLACEMENT_ID_VALUE = 222;
        public static final int JSON_ENCODE_ERROR_VALUE = 119;
        public static final int JSON_PARAMS_ENCODE_ERROR_VALUE = 315;
        public static final int LINK_COMMAND_OPEN_FAILED_VALUE = 314;
        public static final int MEDIATION_ERROR_VALUE = 5000;
        public static final int MRAID_BRIDGE_ERROR_VALUE = 305;
        public static final int MRAID_DOWNLOAD_JS_ERROR_VALUE = 130;
        public static final int MRAID_ERROR_VALUE = 301;
        public static final int MRAID_JS_CALL_EMPTY_VALUE = 311;
        public static final int MRAID_JS_COPY_FAILED_VALUE = 219;
        public static final int MRAID_JS_DOES_NOT_EXIST_VALUE = 218;
        public static final int MRAID_JS_WRITE_FAILED_VALUE = 131;
        public static final int NATIVE_ASSET_ERROR_VALUE = 600;
        public static final int NATIVE_VIDEO_PLAYBACK_ERROR_VALUE = 601;
        public static final int OMSDK_COPY_ERROR_VALUE = 2003;
        public static final int OMSDK_DOWNLOAD_JS_ERROR_VALUE = 132;
        public static final int OMSDK_JS_WRITE_FAILED_VALUE = 133;
        public static final int OUT_OF_MEMORY_VALUE = 3001;
        public static final int PLACEMENT_AD_TYPE_MISMATCH_VALUE = 207;
        public static final int PLACEMENT_SLEEP_VALUE = 212;
        public static final int PRESENTER_DEALLOCATED_BEFORE_LOAD_COMPLETION_VALUE = 2011;
        public static final int PRIVACY_ICON_FALLBACK_ERROR_VALUE = 226;
        public static final int PRIVACY_URL_ERROR_VALUE = 136;
        public static final int PROTOBUF_SERIALIZATION_ERROR_VALUE = 118;
        public static final int REACHABILITY_INITIALIZATION_FAILED_VALUE = 2005;
        public static final int SDK_NOT_INITIALIZED_VALUE = 6;
        public static final int SILENT_MODE_MONITOR_ERROR_VALUE = 319;
        public static final int STALE_CACHED_RESPONSE_VALUE = 223;
        public static final int STORE_KIT_LOAD_ERROR_VALUE = 2002;
        public static final int STORE_KIT_PRESENTATION_ERROR_VALUE = 2007;
        public static final int STORE_OVERLAY_DISMISSAL_ERROR_VALUE = 2010;
        public static final int STORE_OVERLAY_LOAD_ERROR_VALUE = 2004;
        public static final int STORE_OVERLAY_PRESENTATION_ERROR_VALUE = 2008;
        public static final int STORE_REGION_CODE_ERROR_VALUE = 134;
        public static final int TEMPLATE_UNZIP_ERROR_VALUE = 109;
        public static final int TPAT_ERROR_VALUE = 121;
        public static final int TPAT_RETRY_FAILED_VALUE = 137;
        public static final int UNKNOWN_ERROR_VALUE = 0;
        public static final int UNKNOWN_RADIO_ACCESS_TECHNOLOGY_VALUE = 2006;
        public static final int USER_AGENT_ERROR_VALUE = 7;
        public static final int VUNGLE_OIT_CREATION_ERROR_VALUE = 4000;
        public static final int WEBVIEW_ERROR_VALUE = 320;
        public static final int WEB_VIEW_FAILED_NAVIGATION_VALUE = 2001;
        public static final int WEB_VIEW_WEB_CONTENT_PROCESS_DID_TERMINATE_VALUE = 2000;
        private static final Internal.EnumLiteMap<Reason> internalValueMap = new attabal();
        private final int value;

        public class attabal implements Internal.EnumLiteMap<Reason> {
            @Override // com.google.protobuf.Internal.EnumLiteMap
            public Reason findValueByNumber(int i) {
                return Reason.forNumber(i);
            }
        }

        public static final class saneness implements Internal.EnumVerifier {
            static final Internal.EnumVerifier INSTANCE = new saneness();

            private saneness() {
            }

            @Override // com.google.protobuf.Internal.EnumVerifier
            public boolean isInRange(int i) {
                return Reason.forNumber(i) != null;
            }
        }

        Reason(int i) {
            this.value = i;
        }

        public static Reason forNumber(int i) {
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
                    case 125:
                        return INVALID_METRICS_ENDPOINT;
                    case 126:
                        return ASSET_FAILED_INSUFFICIENT_SPACE;
                    case 127:
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
                    case 601:
                        return NATIVE_VIDEO_PLAYBACK_ERROR;
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
                    case 2010:
                        return STORE_OVERLAY_DISMISSAL_ERROR;
                    case 2011:
                        return PRESENTER_DEALLOCATED_BEFORE_LOAD_COMPLETION;
                    case 2012:
                        return APP_IMPRESSION_CREATION_FAILED;
                    case 2013:
                        return HANDLE_TAP_FAILED;
                    case 3001:
                        return OUT_OF_MEMORY;
                    case 3002:
                        return INLINE_INSTALL_ERROR;
                    case 4000:
                        return VUNGLE_OIT_CREATION_ERROR;
                    case 5000:
                        return MEDIATION_ERROR;
                    case 10001:
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
                                    case 117:
                                        return ASSET_FAILED_STATUS_CODE;
                                    case 118:
                                        return PROTOBUF_SERIALIZATION_ERROR;
                                    case 119:
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
                                                    case 224:
                                                        return AD_LOAD_FAIL_EMPTY_BID_PAYLOAD;
                                                    case AD_LOAD_FAIL_PLACEMENT_ID_MISMATCH_VALUE:
                                                        return AD_LOAD_FAIL_PLACEMENT_ID_MISMATCH;
                                                    case PRIVACY_ICON_FALLBACK_ERROR_VALUE:
                                                        return PRIVACY_ICON_FALLBACK_ERROR;
                                                    case INVALID_CSB_DATA_VALUE:
                                                        return INVALID_CSB_DATA;
                                                    default:
                                                        switch (i) {
                                                            case 307:
                                                                return AD_EXPIRED_ON_PLAY;
                                                            case 308:
                                                                return AD_WIN_NOTIFICATION_ERROR;
                                                            case ASSET_FAILED_TO_DELETE_VALUE:
                                                                return ASSET_FAILED_TO_DELETE;
                                                            case AD_HTML_FAILED_TO_LOAD_VALUE:
                                                                return AD_HTML_FAILED_TO_LOAD;
                                                            case MRAID_JS_CALL_EMPTY_VALUE:
                                                                return MRAID_JS_CALL_EMPTY;
                                                            case DEEPLINK_OPEN_FAILED_VALUE:
                                                                return DEEPLINK_OPEN_FAILED;
                                                            case EVALUATE_JAVASCRIPT_FAILED_VALUE:
                                                                return EVALUATE_JAVASCRIPT_FAILED;
                                                            case LINK_COMMAND_OPEN_FAILED_VALUE:
                                                                return LINK_COMMAND_OPEN_FAILED;
                                                            case JSON_PARAMS_ENCODE_ERROR_VALUE:
                                                                return JSON_PARAMS_ENCODE_ERROR;
                                                            case GENERATE_JSON_DATA_ERROR_VALUE:
                                                                return GENERATE_JSON_DATA_ERROR;
                                                            case AD_CLOSED_TEMPLATE_ERROR_VALUE:
                                                                return AD_CLOSED_TEMPLATE_ERROR;
                                                            case AD_CLOSED_MISSING_HEARTBEAT_VALUE:
                                                                return AD_CLOSED_MISSING_HEARTBEAT;
                                                            case SILENT_MODE_MONITOR_ERROR_VALUE:
                                                                return SILENT_MODE_MONITOR_ERROR;
                                                            case 320:
                                                                return WEBVIEW_ERROR;
                                                            case BLACK_SCREEN_DETECTION_ERROR_VALUE:
                                                                return BLACK_SCREEN_DETECTION_ERROR;
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

        public static Internal.EnumLiteMap<Reason> internalGetValueMap() {
            return internalValueMap;
        }

        public static Internal.EnumVerifier internalGetVerifier() {
            return saneness.INSTANCE;
        }

        @Override // com.google.protobuf.Internal.EnumLite
        public final int getNumber() {
            if (this != UNRECOGNIZED) {
                return this.value;
            }
            throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
        }

        @Deprecated
        public static Reason valueOf(int i) {
            return forNumber(i);
        }
    }

    public static final class attabal extends GeneratedMessageLite.Builder<Sdk$SDKError, attabal> implements wireman {
        public /* synthetic */ attabal(com.vungle.ads.internal.protos.attabal attabalVar) {
            this();
        }

        public attabal clearAdLoadType() {
            copyOnWrite();
            ((Sdk$SDKError) this.instance).clearAdLoadType();
            return this;
        }

        public attabal clearAdSource() {
            copyOnWrite();
            ((Sdk$SDKError) this.instance).clearAdSource();
            return this;
        }

        public attabal clearAdState() {
            copyOnWrite();
            ((Sdk$SDKError) this.instance).clearAdState();
            return this;
        }

        public attabal clearAdapterAdFormat() {
            copyOnWrite();
            ((Sdk$SDKError) this.instance).clearAdapterAdFormat();
            return this;
        }

        public attabal clearAppState() {
            copyOnWrite();
            ((Sdk$SDKError) this.instance).clearAppState();
            return this;
        }

        public attabal clearAt() {
            copyOnWrite();
            ((Sdk$SDKError) this.instance).clearAt();
            return this;
        }

        public attabal clearConnectionType() {
            copyOnWrite();
            ((Sdk$SDKError) this.instance).clearConnectionType();
            return this;
        }

        public attabal clearConnectionTypeDetail() {
            copyOnWrite();
            ((Sdk$SDKError) this.instance).clearConnectionTypeDetail();
            return this;
        }

        public attabal clearConnectionTypeDetailAndroid() {
            copyOnWrite();
            ((Sdk$SDKError) this.instance).clearConnectionTypeDetailAndroid();
            return this;
        }

        public attabal clearCreativeId() {
            copyOnWrite();
            ((Sdk$SDKError) this.instance).clearCreativeId();
            return this;
        }

        public attabal clearEventId() {
            copyOnWrite();
            ((Sdk$SDKError) this.instance).clearEventId();
            return this;
        }

        public attabal clearExperiments() {
            copyOnWrite();
            ((Sdk$SDKError) this.instance).clearExperiments();
            return this;
        }

        public attabal clearIsAdPodding() {
            copyOnWrite();
            ((Sdk$SDKError) this.instance).clearIsAdPodding();
            return this;
        }

        public attabal clearIsAdoEnabled() {
            copyOnWrite();
            ((Sdk$SDKError) this.instance).clearIsAdoEnabled();
            return this;
        }

        public attabal clearIsHbPlacement() {
            copyOnWrite();
            ((Sdk$SDKError) this.instance).clearIsHbPlacement();
            return this;
        }

        public attabal clearIsLowDataModeEnabled() {
            copyOnWrite();
            ((Sdk$SDKError) this.instance).clearIsLowDataModeEnabled();
            return this;
        }

        public attabal clearIsPartialDownloadEnabled() {
            copyOnWrite();
            ((Sdk$SDKError) this.instance).clearIsPartialDownloadEnabled();
            return this;
        }

        public attabal clearMake() {
            copyOnWrite();
            ((Sdk$SDKError) this.instance).clearMake();
            return this;
        }

        public attabal clearMediationName() {
            copyOnWrite();
            ((Sdk$SDKError) this.instance).clearMediationName();
            return this;
        }

        public attabal clearMessage() {
            copyOnWrite();
            ((Sdk$SDKError) this.instance).clearMessage();
            return this;
        }

        public attabal clearModel() {
            copyOnWrite();
            ((Sdk$SDKError) this.instance).clearModel();
            return this;
        }

        public attabal clearOs() {
            copyOnWrite();
            ((Sdk$SDKError) this.instance).clearOs();
            return this;
        }

        public attabal clearOsVersion() {
            copyOnWrite();
            ((Sdk$SDKError) this.instance).clearOsVersion();
            return this;
        }

        public attabal clearPlacementReferenceId() {
            copyOnWrite();
            ((Sdk$SDKError) this.instance).clearPlacementReferenceId();
            return this;
        }

        public attabal clearPlacementType() {
            copyOnWrite();
            ((Sdk$SDKError) this.instance).clearPlacementType();
            return this;
        }

        public attabal clearReason() {
            copyOnWrite();
            ((Sdk$SDKError) this.instance).clearReason();
            return this;
        }

        public attabal clearSessionId() {
            copyOnWrite();
            ((Sdk$SDKError) this.instance).clearSessionId();
            return this;
        }

        public attabal clearVmVersion() {
            copyOnWrite();
            ((Sdk$SDKError) this.instance).clearVmVersion();
            return this;
        }

        @Override // com.vungle.ads.internal.protos.wireman
        public long getAdLoadType() {
            return ((Sdk$SDKError) this.instance).getAdLoadType();
        }

        @Override // com.vungle.ads.internal.protos.wireman
        public String getAdSource() {
            return ((Sdk$SDKError) this.instance).getAdSource();
        }

        @Override // com.vungle.ads.internal.protos.wireman
        public ByteString getAdSourceBytes() {
            return ((Sdk$SDKError) this.instance).getAdSourceBytes();
        }

        @Override // com.vungle.ads.internal.protos.wireman
        public String getAdState() {
            return ((Sdk$SDKError) this.instance).getAdState();
        }

        @Override // com.vungle.ads.internal.protos.wireman
        public ByteString getAdStateBytes() {
            return ((Sdk$SDKError) this.instance).getAdStateBytes();
        }

        @Override // com.vungle.ads.internal.protos.wireman
        public String getAdapterAdFormat() {
            return ((Sdk$SDKError) this.instance).getAdapterAdFormat();
        }

        @Override // com.vungle.ads.internal.protos.wireman
        public ByteString getAdapterAdFormatBytes() {
            return ((Sdk$SDKError) this.instance).getAdapterAdFormatBytes();
        }

        @Override // com.vungle.ads.internal.protos.wireman
        public long getAppState() {
            return ((Sdk$SDKError) this.instance).getAppState();
        }

        @Override // com.vungle.ads.internal.protos.wireman
        public long getAt() {
            return ((Sdk$SDKError) this.instance).getAt();
        }

        @Override // com.vungle.ads.internal.protos.wireman
        public String getConnectionType() {
            return ((Sdk$SDKError) this.instance).getConnectionType();
        }

        @Override // com.vungle.ads.internal.protos.wireman
        public ByteString getConnectionTypeBytes() {
            return ((Sdk$SDKError) this.instance).getConnectionTypeBytes();
        }

        @Override // com.vungle.ads.internal.protos.wireman
        public String getConnectionTypeDetail() {
            return ((Sdk$SDKError) this.instance).getConnectionTypeDetail();
        }

        @Override // com.vungle.ads.internal.protos.wireman
        public String getConnectionTypeDetailAndroid() {
            return ((Sdk$SDKError) this.instance).getConnectionTypeDetailAndroid();
        }

        @Override // com.vungle.ads.internal.protos.wireman
        public ByteString getConnectionTypeDetailAndroidBytes() {
            return ((Sdk$SDKError) this.instance).getConnectionTypeDetailAndroidBytes();
        }

        @Override // com.vungle.ads.internal.protos.wireman
        public ByteString getConnectionTypeDetailBytes() {
            return ((Sdk$SDKError) this.instance).getConnectionTypeDetailBytes();
        }

        @Override // com.vungle.ads.internal.protos.wireman
        public String getCreativeId() {
            return ((Sdk$SDKError) this.instance).getCreativeId();
        }

        @Override // com.vungle.ads.internal.protos.wireman
        public ByteString getCreativeIdBytes() {
            return ((Sdk$SDKError) this.instance).getCreativeIdBytes();
        }

        @Override // com.vungle.ads.internal.protos.wireman
        public String getEventId() {
            return ((Sdk$SDKError) this.instance).getEventId();
        }

        @Override // com.vungle.ads.internal.protos.wireman
        public ByteString getEventIdBytes() {
            return ((Sdk$SDKError) this.instance).getEventIdBytes();
        }

        @Override // com.vungle.ads.internal.protos.wireman
        public String getExperiments() {
            return ((Sdk$SDKError) this.instance).getExperiments();
        }

        @Override // com.vungle.ads.internal.protos.wireman
        public ByteString getExperimentsBytes() {
            return ((Sdk$SDKError) this.instance).getExperimentsBytes();
        }

        @Override // com.vungle.ads.internal.protos.wireman
        public boolean getIsAdPodding() {
            return ((Sdk$SDKError) this.instance).getIsAdPodding();
        }

        @Override // com.vungle.ads.internal.protos.wireman
        public boolean getIsAdoEnabled() {
            return ((Sdk$SDKError) this.instance).getIsAdoEnabled();
        }

        @Override // com.vungle.ads.internal.protos.wireman
        public long getIsHbPlacement() {
            return ((Sdk$SDKError) this.instance).getIsHbPlacement();
        }

        @Override // com.vungle.ads.internal.protos.wireman
        public boolean getIsLowDataModeEnabled() {
            return ((Sdk$SDKError) this.instance).getIsLowDataModeEnabled();
        }

        @Override // com.vungle.ads.internal.protos.wireman
        public boolean getIsPartialDownloadEnabled() {
            return ((Sdk$SDKError) this.instance).getIsPartialDownloadEnabled();
        }

        @Override // com.vungle.ads.internal.protos.wireman
        public String getMake() {
            return ((Sdk$SDKError) this.instance).getMake();
        }

        @Override // com.vungle.ads.internal.protos.wireman
        public ByteString getMakeBytes() {
            return ((Sdk$SDKError) this.instance).getMakeBytes();
        }

        @Override // com.vungle.ads.internal.protos.wireman
        public String getMediationName() {
            return ((Sdk$SDKError) this.instance).getMediationName();
        }

        @Override // com.vungle.ads.internal.protos.wireman
        public ByteString getMediationNameBytes() {
            return ((Sdk$SDKError) this.instance).getMediationNameBytes();
        }

        @Override // com.vungle.ads.internal.protos.wireman
        public String getMessage() {
            return ((Sdk$SDKError) this.instance).getMessage();
        }

        @Override // com.vungle.ads.internal.protos.wireman
        public ByteString getMessageBytes() {
            return ((Sdk$SDKError) this.instance).getMessageBytes();
        }

        @Override // com.vungle.ads.internal.protos.wireman
        public String getModel() {
            return ((Sdk$SDKError) this.instance).getModel();
        }

        @Override // com.vungle.ads.internal.protos.wireman
        public ByteString getModelBytes() {
            return ((Sdk$SDKError) this.instance).getModelBytes();
        }

        @Override // com.vungle.ads.internal.protos.wireman
        public String getOs() {
            return ((Sdk$SDKError) this.instance).getOs();
        }

        @Override // com.vungle.ads.internal.protos.wireman
        public ByteString getOsBytes() {
            return ((Sdk$SDKError) this.instance).getOsBytes();
        }

        @Override // com.vungle.ads.internal.protos.wireman
        public String getOsVersion() {
            return ((Sdk$SDKError) this.instance).getOsVersion();
        }

        @Override // com.vungle.ads.internal.protos.wireman
        public ByteString getOsVersionBytes() {
            return ((Sdk$SDKError) this.instance).getOsVersionBytes();
        }

        @Override // com.vungle.ads.internal.protos.wireman
        public String getPlacementReferenceId() {
            return ((Sdk$SDKError) this.instance).getPlacementReferenceId();
        }

        @Override // com.vungle.ads.internal.protos.wireman
        public ByteString getPlacementReferenceIdBytes() {
            return ((Sdk$SDKError) this.instance).getPlacementReferenceIdBytes();
        }

        @Override // com.vungle.ads.internal.protos.wireman
        public String getPlacementType() {
            return ((Sdk$SDKError) this.instance).getPlacementType();
        }

        @Override // com.vungle.ads.internal.protos.wireman
        public ByteString getPlacementTypeBytes() {
            return ((Sdk$SDKError) this.instance).getPlacementTypeBytes();
        }

        @Override // com.vungle.ads.internal.protos.wireman
        public Reason getReason() {
            return ((Sdk$SDKError) this.instance).getReason();
        }

        @Override // com.vungle.ads.internal.protos.wireman
        public int getReasonValue() {
            return ((Sdk$SDKError) this.instance).getReasonValue();
        }

        @Override // com.vungle.ads.internal.protos.wireman
        public String getSessionId() {
            return ((Sdk$SDKError) this.instance).getSessionId();
        }

        @Override // com.vungle.ads.internal.protos.wireman
        public ByteString getSessionIdBytes() {
            return ((Sdk$SDKError) this.instance).getSessionIdBytes();
        }

        @Override // com.vungle.ads.internal.protos.wireman
        public String getVmVersion() {
            return ((Sdk$SDKError) this.instance).getVmVersion();
        }

        @Override // com.vungle.ads.internal.protos.wireman
        public ByteString getVmVersionBytes() {
            return ((Sdk$SDKError) this.instance).getVmVersionBytes();
        }

        public attabal setAdLoadType(long j) {
            copyOnWrite();
            ((Sdk$SDKError) this.instance).setAdLoadType(j);
            return this;
        }

        public attabal setAdSource(String str) {
            copyOnWrite();
            ((Sdk$SDKError) this.instance).setAdSource(str);
            return this;
        }

        public attabal setAdSourceBytes(ByteString byteString) {
            copyOnWrite();
            ((Sdk$SDKError) this.instance).setAdSourceBytes(byteString);
            return this;
        }

        public attabal setAdState(String str) {
            copyOnWrite();
            ((Sdk$SDKError) this.instance).setAdState(str);
            return this;
        }

        public attabal setAdStateBytes(ByteString byteString) {
            copyOnWrite();
            ((Sdk$SDKError) this.instance).setAdStateBytes(byteString);
            return this;
        }

        public attabal setAdapterAdFormat(String str) {
            copyOnWrite();
            ((Sdk$SDKError) this.instance).setAdapterAdFormat(str);
            return this;
        }

        public attabal setAdapterAdFormatBytes(ByteString byteString) {
            copyOnWrite();
            ((Sdk$SDKError) this.instance).setAdapterAdFormatBytes(byteString);
            return this;
        }

        public attabal setAppState(long j) {
            copyOnWrite();
            ((Sdk$SDKError) this.instance).setAppState(j);
            return this;
        }

        public attabal setAt(long j) {
            copyOnWrite();
            ((Sdk$SDKError) this.instance).setAt(j);
            return this;
        }

        public attabal setConnectionType(String str) {
            copyOnWrite();
            ((Sdk$SDKError) this.instance).setConnectionType(str);
            return this;
        }

        public attabal setConnectionTypeBytes(ByteString byteString) {
            copyOnWrite();
            ((Sdk$SDKError) this.instance).setConnectionTypeBytes(byteString);
            return this;
        }

        public attabal setConnectionTypeDetail(String str) {
            copyOnWrite();
            ((Sdk$SDKError) this.instance).setConnectionTypeDetail(str);
            return this;
        }

        public attabal setConnectionTypeDetailAndroid(String str) {
            copyOnWrite();
            ((Sdk$SDKError) this.instance).setConnectionTypeDetailAndroid(str);
            return this;
        }

        public attabal setConnectionTypeDetailAndroidBytes(ByteString byteString) {
            copyOnWrite();
            ((Sdk$SDKError) this.instance).setConnectionTypeDetailAndroidBytes(byteString);
            return this;
        }

        public attabal setConnectionTypeDetailBytes(ByteString byteString) {
            copyOnWrite();
            ((Sdk$SDKError) this.instance).setConnectionTypeDetailBytes(byteString);
            return this;
        }

        public attabal setCreativeId(String str) {
            copyOnWrite();
            ((Sdk$SDKError) this.instance).setCreativeId(str);
            return this;
        }

        public attabal setCreativeIdBytes(ByteString byteString) {
            copyOnWrite();
            ((Sdk$SDKError) this.instance).setCreativeIdBytes(byteString);
            return this;
        }

        public attabal setEventId(String str) {
            copyOnWrite();
            ((Sdk$SDKError) this.instance).setEventId(str);
            return this;
        }

        public attabal setEventIdBytes(ByteString byteString) {
            copyOnWrite();
            ((Sdk$SDKError) this.instance).setEventIdBytes(byteString);
            return this;
        }

        public attabal setExperiments(String str) {
            copyOnWrite();
            ((Sdk$SDKError) this.instance).setExperiments(str);
            return this;
        }

        public attabal setExperimentsBytes(ByteString byteString) {
            copyOnWrite();
            ((Sdk$SDKError) this.instance).setExperimentsBytes(byteString);
            return this;
        }

        public attabal setIsAdPodding(boolean z) {
            copyOnWrite();
            ((Sdk$SDKError) this.instance).setIsAdPodding(z);
            return this;
        }

        public attabal setIsAdoEnabled(boolean z) {
            copyOnWrite();
            ((Sdk$SDKError) this.instance).setIsAdoEnabled(z);
            return this;
        }

        public attabal setIsHbPlacement(long j) {
            copyOnWrite();
            ((Sdk$SDKError) this.instance).setIsHbPlacement(j);
            return this;
        }

        public attabal setIsLowDataModeEnabled(boolean z) {
            copyOnWrite();
            ((Sdk$SDKError) this.instance).setIsLowDataModeEnabled(z);
            return this;
        }

        public attabal setIsPartialDownloadEnabled(boolean z) {
            copyOnWrite();
            ((Sdk$SDKError) this.instance).setIsPartialDownloadEnabled(z);
            return this;
        }

        public attabal setMake(String str) {
            copyOnWrite();
            ((Sdk$SDKError) this.instance).setMake(str);
            return this;
        }

        public attabal setMakeBytes(ByteString byteString) {
            copyOnWrite();
            ((Sdk$SDKError) this.instance).setMakeBytes(byteString);
            return this;
        }

        public attabal setMediationName(String str) {
            copyOnWrite();
            ((Sdk$SDKError) this.instance).setMediationName(str);
            return this;
        }

        public attabal setMediationNameBytes(ByteString byteString) {
            copyOnWrite();
            ((Sdk$SDKError) this.instance).setMediationNameBytes(byteString);
            return this;
        }

        public attabal setMessage(String str) {
            copyOnWrite();
            ((Sdk$SDKError) this.instance).setMessage(str);
            return this;
        }

        public attabal setMessageBytes(ByteString byteString) {
            copyOnWrite();
            ((Sdk$SDKError) this.instance).setMessageBytes(byteString);
            return this;
        }

        public attabal setModel(String str) {
            copyOnWrite();
            ((Sdk$SDKError) this.instance).setModel(str);
            return this;
        }

        public attabal setModelBytes(ByteString byteString) {
            copyOnWrite();
            ((Sdk$SDKError) this.instance).setModelBytes(byteString);
            return this;
        }

        public attabal setOs(String str) {
            copyOnWrite();
            ((Sdk$SDKError) this.instance).setOs(str);
            return this;
        }

        public attabal setOsBytes(ByteString byteString) {
            copyOnWrite();
            ((Sdk$SDKError) this.instance).setOsBytes(byteString);
            return this;
        }

        public attabal setOsVersion(String str) {
            copyOnWrite();
            ((Sdk$SDKError) this.instance).setOsVersion(str);
            return this;
        }

        public attabal setOsVersionBytes(ByteString byteString) {
            copyOnWrite();
            ((Sdk$SDKError) this.instance).setOsVersionBytes(byteString);
            return this;
        }

        public attabal setPlacementReferenceId(String str) {
            copyOnWrite();
            ((Sdk$SDKError) this.instance).setPlacementReferenceId(str);
            return this;
        }

        public attabal setPlacementReferenceIdBytes(ByteString byteString) {
            copyOnWrite();
            ((Sdk$SDKError) this.instance).setPlacementReferenceIdBytes(byteString);
            return this;
        }

        public attabal setPlacementType(String str) {
            copyOnWrite();
            ((Sdk$SDKError) this.instance).setPlacementType(str);
            return this;
        }

        public attabal setPlacementTypeBytes(ByteString byteString) {
            copyOnWrite();
            ((Sdk$SDKError) this.instance).setPlacementTypeBytes(byteString);
            return this;
        }

        public attabal setReason(Reason reason) {
            copyOnWrite();
            ((Sdk$SDKError) this.instance).setReason(reason);
            return this;
        }

        public attabal setReasonValue(int i) {
            copyOnWrite();
            ((Sdk$SDKError) this.instance).setReasonValue(i);
            return this;
        }

        public attabal setSessionId(String str) {
            copyOnWrite();
            ((Sdk$SDKError) this.instance).setSessionId(str);
            return this;
        }

        public attabal setSessionIdBytes(ByteString byteString) {
            copyOnWrite();
            ((Sdk$SDKError) this.instance).setSessionIdBytes(byteString);
            return this;
        }

        public attabal setVmVersion(String str) {
            copyOnWrite();
            ((Sdk$SDKError) this.instance).setVmVersion(str);
            return this;
        }

        public attabal setVmVersionBytes(ByteString byteString) {
            copyOnWrite();
            ((Sdk$SDKError) this.instance).setVmVersionBytes(byteString);
            return this;
        }

        private attabal() {
            super(Sdk$SDKError.DEFAULT_INSTANCE);
        }
    }

    static {
        Sdk$SDKError sdk$SDKError = new Sdk$SDKError();
        DEFAULT_INSTANCE = sdk$SDKError;
        GeneratedMessageLite.registerDefaultInstance(Sdk$SDKError.class, sdk$SDKError);
    }

    private Sdk$SDKError() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearAdLoadType() {
        this.adLoadType_ = 0L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearAdSource() {
        this.adSource_ = getDefaultInstance().getAdSource();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearAdState() {
        this.adState_ = getDefaultInstance().getAdState();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearAdapterAdFormat() {
        this.adapterAdFormat_ = getDefaultInstance().getAdapterAdFormat();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearAppState() {
        this.appState_ = 0L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearAt() {
        this.at_ = 0L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearConnectionType() {
        this.connectionType_ = getDefaultInstance().getConnectionType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearConnectionTypeDetail() {
        this.connectionTypeDetail_ = getDefaultInstance().getConnectionTypeDetail();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearConnectionTypeDetailAndroid() {
        this.connectionTypeDetailAndroid_ = getDefaultInstance().getConnectionTypeDetailAndroid();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearCreativeId() {
        this.creativeId_ = getDefaultInstance().getCreativeId();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearEventId() {
        this.eventId_ = getDefaultInstance().getEventId();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearExperiments() {
        this.experiments_ = getDefaultInstance().getExperiments();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearIsAdPodding() {
        this.isAdPodding_ = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearIsAdoEnabled() {
        this.isAdoEnabled_ = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearIsHbPlacement() {
        this.isHbPlacement_ = 0L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearIsLowDataModeEnabled() {
        this.isLowDataModeEnabled_ = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearIsPartialDownloadEnabled() {
        this.isPartialDownloadEnabled_ = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearMake() {
        this.make_ = getDefaultInstance().getMake();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearMediationName() {
        this.mediationName_ = getDefaultInstance().getMediationName();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearMessage() {
        this.message_ = getDefaultInstance().getMessage();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearModel() {
        this.model_ = getDefaultInstance().getModel();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearOs() {
        this.os_ = getDefaultInstance().getOs();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearOsVersion() {
        this.osVersion_ = getDefaultInstance().getOsVersion();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearPlacementReferenceId() {
        this.placementReferenceId_ = getDefaultInstance().getPlacementReferenceId();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearPlacementType() {
        this.placementType_ = getDefaultInstance().getPlacementType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearReason() {
        this.reason_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearSessionId() {
        this.sessionId_ = getDefaultInstance().getSessionId();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearVmVersion() {
        this.vmVersion_ = getDefaultInstance().getVmVersion();
    }

    public static Sdk$SDKError getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static attabal newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static Sdk$SDKError parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (Sdk$SDKError) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static Sdk$SDKError parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (Sdk$SDKError) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static Parser<Sdk$SDKError> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setAdLoadType(long j) {
        this.adLoadType_ = j;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setAdSource(String str) {
        str.getClass();
        this.adSource_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setAdSourceBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.adSource_ = byteString.toStringUtf8();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setAdState(String str) {
        str.getClass();
        this.adState_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setAdStateBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.adState_ = byteString.toStringUtf8();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setAdapterAdFormat(String str) {
        str.getClass();
        this.adapterAdFormat_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setAdapterAdFormatBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.adapterAdFormat_ = byteString.toStringUtf8();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setAppState(long j) {
        this.appState_ = j;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setAt(long j) {
        this.at_ = j;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setConnectionType(String str) {
        str.getClass();
        this.connectionType_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setConnectionTypeBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.connectionType_ = byteString.toStringUtf8();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setConnectionTypeDetail(String str) {
        str.getClass();
        this.connectionTypeDetail_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setConnectionTypeDetailAndroid(String str) {
        str.getClass();
        this.connectionTypeDetailAndroid_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setConnectionTypeDetailAndroidBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.connectionTypeDetailAndroid_ = byteString.toStringUtf8();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setConnectionTypeDetailBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.connectionTypeDetail_ = byteString.toStringUtf8();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setCreativeId(String str) {
        str.getClass();
        this.creativeId_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setCreativeIdBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.creativeId_ = byteString.toStringUtf8();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setEventId(String str) {
        str.getClass();
        this.eventId_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setEventIdBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.eventId_ = byteString.toStringUtf8();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setExperiments(String str) {
        str.getClass();
        this.experiments_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setExperimentsBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.experiments_ = byteString.toStringUtf8();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setIsAdPodding(boolean z) {
        this.isAdPodding_ = z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setIsAdoEnabled(boolean z) {
        this.isAdoEnabled_ = z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setIsHbPlacement(long j) {
        this.isHbPlacement_ = j;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setIsLowDataModeEnabled(boolean z) {
        this.isLowDataModeEnabled_ = z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setIsPartialDownloadEnabled(boolean z) {
        this.isPartialDownloadEnabled_ = z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setMake(String str) {
        str.getClass();
        this.make_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setMakeBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.make_ = byteString.toStringUtf8();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setMediationName(String str) {
        str.getClass();
        this.mediationName_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setMediationNameBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.mediationName_ = byteString.toStringUtf8();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setMessage(String str) {
        str.getClass();
        this.message_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setMessageBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.message_ = byteString.toStringUtf8();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setModel(String str) {
        str.getClass();
        this.model_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setModelBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.model_ = byteString.toStringUtf8();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setOs(String str) {
        str.getClass();
        this.os_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setOsBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.os_ = byteString.toStringUtf8();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setOsVersion(String str) {
        str.getClass();
        this.osVersion_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setOsVersionBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.osVersion_ = byteString.toStringUtf8();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPlacementReferenceId(String str) {
        str.getClass();
        this.placementReferenceId_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPlacementReferenceIdBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.placementReferenceId_ = byteString.toStringUtf8();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPlacementType(String str) {
        str.getClass();
        this.placementType_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPlacementTypeBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.placementType_ = byteString.toStringUtf8();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setReason(Reason reason) {
        this.reason_ = reason.getNumber();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setReasonValue(int i) {
        this.reason_ = i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSessionId(String str) {
        str.getClass();
        this.sessionId_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSessionIdBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.sessionId_ = byteString.toStringUtf8();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setVmVersion(String str) {
        str.getClass();
        this.vmVersion_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setVmVersionBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.vmVersion_ = byteString.toStringUtf8();
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        Parser defaultInstanceBasedParser;
        com.vungle.ads.internal.protos.attabal attabalVar = null;
        switch (com.vungle.ads.internal.protos.attabal.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[methodToInvoke.ordinal()]) {
            case 1:
                return new Sdk$SDKError();
            case 2:
                return new attabal(attabalVar);
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u001c\u0000\u0000\u0001É\u001c\u0000\u0000\u0000\u0001\u0002\u0002\f\u0003Ȉ\u0004Ȉ\u0005Ȉ\u0006Ȉ\u0007Ȉ\bȈ\tȈ\nȈ\u000bȈ\fȈ\rȈ\u000e\u0002\u000fȈ\u0010Ȉ\u0011\u0002\u0012Ȉ\u0013Ȉ\u0014\u0007\u0015\u0007\u0016\u0007\u0017Ȉ\u0018Ȉ\u0019\u0002\u001aȈeȈÉ\u0007", new Object[]{"at_", "reason_", "message_", "eventId_", "make_", "model_", "os_", "osVersion_", "connectionType_", "connectionTypeDetail_", "placementReferenceId_", "creativeId_", "sessionId_", "isHbPlacement_", "placementType_", "adSource_", "appState_", "mediationName_", "vmVersion_", "isAdoEnabled_", "isPartialDownloadEnabled_", "isAdPodding_", "adState_", "experiments_", "adLoadType_", "adapterAdFormat_", "connectionTypeDetailAndroid_", "isLowDataModeEnabled_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<Sdk$SDKError> parser = PARSER;
                if (parser != null) {
                    return parser;
                }
                synchronized (Sdk$SDKError.class) {
                    try {
                        defaultInstanceBasedParser = PARSER;
                        if (defaultInstanceBasedParser == null) {
                            defaultInstanceBasedParser = new GeneratedMessageLite.DefaultInstanceBasedParser(DEFAULT_INSTANCE);
                            PARSER = defaultInstanceBasedParser;
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                    break;
                }
                return defaultInstanceBasedParser;
            case 6:
                return (byte) 1;
            case 7:
                return null;
            default:
                throw new UnsupportedOperationException();
        }
    }

    @Override // com.vungle.ads.internal.protos.wireman
    public long getAdLoadType() {
        return this.adLoadType_;
    }

    @Override // com.vungle.ads.internal.protos.wireman
    public String getAdSource() {
        return this.adSource_;
    }

    @Override // com.vungle.ads.internal.protos.wireman
    public ByteString getAdSourceBytes() {
        return ByteString.copyFromUtf8(this.adSource_);
    }

    @Override // com.vungle.ads.internal.protos.wireman
    public String getAdState() {
        return this.adState_;
    }

    @Override // com.vungle.ads.internal.protos.wireman
    public ByteString getAdStateBytes() {
        return ByteString.copyFromUtf8(this.adState_);
    }

    @Override // com.vungle.ads.internal.protos.wireman
    public String getAdapterAdFormat() {
        return this.adapterAdFormat_;
    }

    @Override // com.vungle.ads.internal.protos.wireman
    public ByteString getAdapterAdFormatBytes() {
        return ByteString.copyFromUtf8(this.adapterAdFormat_);
    }

    @Override // com.vungle.ads.internal.protos.wireman
    public long getAppState() {
        return this.appState_;
    }

    @Override // com.vungle.ads.internal.protos.wireman
    public long getAt() {
        return this.at_;
    }

    @Override // com.vungle.ads.internal.protos.wireman
    public String getConnectionType() {
        return this.connectionType_;
    }

    @Override // com.vungle.ads.internal.protos.wireman
    public ByteString getConnectionTypeBytes() {
        return ByteString.copyFromUtf8(this.connectionType_);
    }

    @Override // com.vungle.ads.internal.protos.wireman
    public String getConnectionTypeDetail() {
        return this.connectionTypeDetail_;
    }

    @Override // com.vungle.ads.internal.protos.wireman
    public String getConnectionTypeDetailAndroid() {
        return this.connectionTypeDetailAndroid_;
    }

    @Override // com.vungle.ads.internal.protos.wireman
    public ByteString getConnectionTypeDetailAndroidBytes() {
        return ByteString.copyFromUtf8(this.connectionTypeDetailAndroid_);
    }

    @Override // com.vungle.ads.internal.protos.wireman
    public ByteString getConnectionTypeDetailBytes() {
        return ByteString.copyFromUtf8(this.connectionTypeDetail_);
    }

    @Override // com.vungle.ads.internal.protos.wireman
    public String getCreativeId() {
        return this.creativeId_;
    }

    @Override // com.vungle.ads.internal.protos.wireman
    public ByteString getCreativeIdBytes() {
        return ByteString.copyFromUtf8(this.creativeId_);
    }

    @Override // com.vungle.ads.internal.protos.wireman
    public String getEventId() {
        return this.eventId_;
    }

    @Override // com.vungle.ads.internal.protos.wireman
    public ByteString getEventIdBytes() {
        return ByteString.copyFromUtf8(this.eventId_);
    }

    @Override // com.vungle.ads.internal.protos.wireman
    public String getExperiments() {
        return this.experiments_;
    }

    @Override // com.vungle.ads.internal.protos.wireman
    public ByteString getExperimentsBytes() {
        return ByteString.copyFromUtf8(this.experiments_);
    }

    @Override // com.vungle.ads.internal.protos.wireman
    public boolean getIsAdPodding() {
        return this.isAdPodding_;
    }

    @Override // com.vungle.ads.internal.protos.wireman
    public boolean getIsAdoEnabled() {
        return this.isAdoEnabled_;
    }

    @Override // com.vungle.ads.internal.protos.wireman
    public long getIsHbPlacement() {
        return this.isHbPlacement_;
    }

    @Override // com.vungle.ads.internal.protos.wireman
    public boolean getIsLowDataModeEnabled() {
        return this.isLowDataModeEnabled_;
    }

    @Override // com.vungle.ads.internal.protos.wireman
    public boolean getIsPartialDownloadEnabled() {
        return this.isPartialDownloadEnabled_;
    }

    @Override // com.vungle.ads.internal.protos.wireman
    public String getMake() {
        return this.make_;
    }

    @Override // com.vungle.ads.internal.protos.wireman
    public ByteString getMakeBytes() {
        return ByteString.copyFromUtf8(this.make_);
    }

    @Override // com.vungle.ads.internal.protos.wireman
    public String getMediationName() {
        return this.mediationName_;
    }

    @Override // com.vungle.ads.internal.protos.wireman
    public ByteString getMediationNameBytes() {
        return ByteString.copyFromUtf8(this.mediationName_);
    }

    @Override // com.vungle.ads.internal.protos.wireman
    public String getMessage() {
        return this.message_;
    }

    @Override // com.vungle.ads.internal.protos.wireman
    public ByteString getMessageBytes() {
        return ByteString.copyFromUtf8(this.message_);
    }

    @Override // com.vungle.ads.internal.protos.wireman
    public String getModel() {
        return this.model_;
    }

    @Override // com.vungle.ads.internal.protos.wireman
    public ByteString getModelBytes() {
        return ByteString.copyFromUtf8(this.model_);
    }

    @Override // com.vungle.ads.internal.protos.wireman
    public String getOs() {
        return this.os_;
    }

    @Override // com.vungle.ads.internal.protos.wireman
    public ByteString getOsBytes() {
        return ByteString.copyFromUtf8(this.os_);
    }

    @Override // com.vungle.ads.internal.protos.wireman
    public String getOsVersion() {
        return this.osVersion_;
    }

    @Override // com.vungle.ads.internal.protos.wireman
    public ByteString getOsVersionBytes() {
        return ByteString.copyFromUtf8(this.osVersion_);
    }

    @Override // com.vungle.ads.internal.protos.wireman
    public String getPlacementReferenceId() {
        return this.placementReferenceId_;
    }

    @Override // com.vungle.ads.internal.protos.wireman
    public ByteString getPlacementReferenceIdBytes() {
        return ByteString.copyFromUtf8(this.placementReferenceId_);
    }

    @Override // com.vungle.ads.internal.protos.wireman
    public String getPlacementType() {
        return this.placementType_;
    }

    @Override // com.vungle.ads.internal.protos.wireman
    public ByteString getPlacementTypeBytes() {
        return ByteString.copyFromUtf8(this.placementType_);
    }

    @Override // com.vungle.ads.internal.protos.wireman
    public Reason getReason() {
        Reason reasonForNumber = Reason.forNumber(this.reason_);
        return reasonForNumber == null ? Reason.UNRECOGNIZED : reasonForNumber;
    }

    @Override // com.vungle.ads.internal.protos.wireman
    public int getReasonValue() {
        return this.reason_;
    }

    @Override // com.vungle.ads.internal.protos.wireman
    public String getSessionId() {
        return this.sessionId_;
    }

    @Override // com.vungle.ads.internal.protos.wireman
    public ByteString getSessionIdBytes() {
        return ByteString.copyFromUtf8(this.sessionId_);
    }

    @Override // com.vungle.ads.internal.protos.wireman
    public String getVmVersion() {
        return this.vmVersion_;
    }

    @Override // com.vungle.ads.internal.protos.wireman
    public ByteString getVmVersionBytes() {
        return ByteString.copyFromUtf8(this.vmVersion_);
    }

    public static attabal newBuilder(Sdk$SDKError sdk$SDKError) {
        return DEFAULT_INSTANCE.createBuilder(sdk$SDKError);
    }

    public static Sdk$SDKError parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (Sdk$SDKError) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static Sdk$SDKError parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (Sdk$SDKError) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static Sdk$SDKError parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (Sdk$SDKError) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static Sdk$SDKError parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (Sdk$SDKError) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static Sdk$SDKError parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (Sdk$SDKError) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static Sdk$SDKError parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (Sdk$SDKError) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static Sdk$SDKError parseFrom(InputStream inputStream) throws IOException {
        return (Sdk$SDKError) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static Sdk$SDKError parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (Sdk$SDKError) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static Sdk$SDKError parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (Sdk$SDKError) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static Sdk$SDKError parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (Sdk$SDKError) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }
}
