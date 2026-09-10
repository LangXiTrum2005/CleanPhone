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
public final class Sdk$SDKMetric extends GeneratedMessageLite<Sdk$SDKMetric, attabal> implements marial {
    public static final int ADAPTERADFORMAT_FIELD_NUMBER = 26;
    public static final int ADLOADTYPE_FIELD_NUMBER = 25;
    public static final int ADSOURCE_FIELD_NUMBER = 16;
    public static final int ADSTATE_FIELD_NUMBER = 23;
    public static final int APPSTATE_FIELD_NUMBER = 18;
    public static final int CONNECTIONTYPEDETAIL_FIELD_NUMBER = 9;
    public static final int CONNECTIONTYPE_FIELD_NUMBER = 8;
    public static final int CREATIVEID_FIELD_NUMBER = 11;
    private static final Sdk$SDKMetric DEFAULT_INSTANCE;
    public static final int EVENTID_FIELD_NUMBER = 12;
    public static final int EXPERIMENTS_FIELD_NUMBER = 24;
    public static final int ISADOENABLED_FIELD_NUMBER = 20;
    public static final int ISADPODDING_FIELD_NUMBER = 22;
    public static final int ISHBPLACEMENT_FIELD_NUMBER = 14;
    public static final int ISLOWDATAMODEENABLED_FIELD_NUMBER = 201;
    public static final int ISPARTIALDOWNLOADENABLED_FIELD_NUMBER = 21;
    public static final int MAKE_FIELD_NUMBER = 4;
    public static final int MEDIATIONNAME_FIELD_NUMBER = 17;
    public static final int META_FIELD_NUMBER = 3;
    public static final int MODEL_FIELD_NUMBER = 5;
    public static final int OSVERSION_FIELD_NUMBER = 7;
    public static final int OS_FIELD_NUMBER = 6;
    private static volatile Parser<Sdk$SDKMetric> PARSER = null;
    public static final int PLACEMENTREFERENCEID_FIELD_NUMBER = 10;
    public static final int PLACEMENTTYPE_FIELD_NUMBER = 15;
    public static final int SESSIONID_FIELD_NUMBER = 13;
    public static final int TYPE_FIELD_NUMBER = 1;
    public static final int VALUE_FIELD_NUMBER = 2;
    public static final int VMVERSION_FIELD_NUMBER = 19;
    private long adLoadType_;
    private long appState_;
    private boolean isAdPodding_;
    private boolean isAdoEnabled_;
    private long isHbPlacement_;
    private boolean isLowDataModeEnabled_;
    private boolean isPartialDownloadEnabled_;
    private int type_;
    private long value_;
    private String meta_ = "";
    private String make_ = "";
    private String model_ = "";
    private String os_ = "";
    private String osVersion_ = "";
    private String connectionType_ = "";
    private String connectionTypeDetail_ = "";
    private String placementReferenceId_ = "";
    private String creativeId_ = "";
    private String eventId_ = "";
    private String sessionId_ = "";
    private String placementType_ = "";
    private String adSource_ = "";
    private String mediationName_ = "";
    private String vmVersion_ = "";
    private String adState_ = "";
    private String experiments_ = "";
    private String adapterAdFormat_ = "";

    public enum SDKMetricType implements Internal.EnumLite {
        UNKNOWN_METRIC_TYPE(0),
        AD_REQUEST_TO_RESPONSE_DURATION_MS(1),
        AD_RESPONSE_TO_SHOW_DURATION_MS(2),
        AD_SHOW_TO_DISPLAY_DURATION_MS(3),
        AD_DISPLAY_TO_CLICK_DURATION_MS(4),
        IOS_STORE_KIT_LOAD_TIME_MS(5),
        INIT_REQUEST_TO_RESPONSE_DURATION_MS(6),
        ASSET_DOWNLOAD_DURATION_MS(7),
        LOCAL_ASSETS_USED(8),
        REMOTE_ASSETS_USED(9),
        TEMPLATE_DOWNLOAD_DURATION_MS(10),
        AD_REQUEST_TO_CALLBACK_DURATION_MS(11),
        AD_REQUEST_TO_CALLBACK_ADO_DURATION_MS(12),
        ASSET_FILE_SIZE(13),
        USER_AGENT_LOAD_DURATION_MS(14),
        TEMPLATE_ZIP_SIZE(15),
        CACHED_ASSETS_USED(16),
        LOAD_AD_API(17),
        TPAT_FIRED(18),
        TPAT_SUCCESS(19),
        WIN_NOTIF_FIRED(20),
        WIN_NOTIF_SUCCESS(21),
        AD_EXPIRED_BEFORE_PLAY(22),
        PLAY_AD_API(23),
        AD_LOAD_FAIL(24),
        VIEW_NOT_VISIBLE_ON_PLAY(25),
        MRAID_DOWNLOAD_JS_RETRY_SUCCESS(26),
        OMSDK_DOWNLOAD_JS_RETRY_SUCCESS(27),
        PRIVACY_URL_OPENED(28),
        NOTIFICATION_REDIRECT(29),
        AD_PLAY_RESET_ON_DEINIT(30),
        TEMPLATE_HTML_SIZE(31),
        CONFIG_LOADED_FROM_INIT(32),
        CONFIG_LOADED_FROM_AD_LOAD(33),
        CONFIG_LOADED_FROM_ADM_LOAD(34),
        AD_SHOW_TO_PRESENT_DURATION_MS(35),
        AD_SHOW_TO_FAIL_DURATION_MS(36),
        AD_PRESENT_TO_DISPLAY_DURATION_MS(37),
        BID_TOKEN_REQUESTED(38),
        BID_TOKEN_REQUEST_TO_RESPONSE_DURATION_MS(39),
        BID_TOKEN_REQUEST_TO_FAIL_DURATION_MS(40),
        AD_LOAD_TO_FAIL_CALLBACK_DURATION_MS(41),
        AD_SHOW_TO_CLOSE_DURATION_MS(42),
        AD_LOAD_TO_CALLBACK_DURATION_MS(43),
        AD_LOAD_TO_CALLBACK_ADO_DURATION_MS(44),
        SDK_INIT_API(45),
        AD_START_EVENT(46),
        AD_CLICK_EVENT(47),
        AD_SHOW_TO_VALIDATION_DURATION_MS(48),
        AD_VALIDATION_TO_PRESENT_DURATION_MS(49),
        AD_LEAVE_APPLICATION(50),
        AD_REWARD_USER(51),
        AD_REQUIRED_DOWNLOAD_DURATION_MS(52),
        AD_OPTIONAL_DOWNLOAD_DURATION_MS(53),
        AD_BACKGROUND_BEFORE_IMPRESSION(54),
        AD_CLOSED_BEFORE_IMPRESSION(55),
        AD_VISIBILITY(56),
        INIT_TO_SUCCESS_CALLBACK_DURATION_MS(57),
        INIT_TO_FAIL_CALLBACK_DURATION_MS(58),
        AD_START_TO_BACKGROUND_DURATION_MS(59),
        ASSET_PARTIAL_DOWNLOAD_DURATION_MS(60),
        APP_BACKGROUND_DURING_AD_LOAD(61),
        DEPRECATED_API_USED(62),
        AD_PLAY_WITH_PARTIAL_DOWNLOAD_ASSET(63),
        AD_PRELOAD_TO_READY_DURATION_MS(64),
        CONCURRENT_CACHED_WEBVIEW_COUNT(65),
        BLACK_SCREEN_IS_DETECTED(66),
        NATIVE_PLAY_ASSET_TYPE(67),
        NATIVE_VIDEO_PREPARE_DURATION_MS(68),
        NATIVE_AD_DISPLAY_DURATION(69),
        ASSET_DOWNLOAD_RETRY_STATUS(70),
        AD_VISIBLE_DURATION_MS(71),
        SKOVERLAY_PRESENTED_FOR_AD(2000),
        SAFARI_PRESENTED_FOR_AD(2001),
        STORE_KIT_PRESENTED_FOR_AD(2002),
        STORE_KIT_NOT_READY(2003),
        LAUNCH_STORE_KIT_REQUEST(2004),
        LAUNCH_SKOVERLAY_REQUEST(2005),
        LAUNCH_SAFARI_REQUEST(2006),
        IDFV_RESTRICTED(2007),
        NOTIFICATION_WAIT_FOR_CONNECTIVITY(2008),
        IDFV_VALUE_CHANGED(2009),
        AD_WILL_CLOSE(2010),
        APP_TERM_DURING_AD_BEFORE_IMPRESSION(2011),
        HANDLE_TAP_REQUEST(2012),
        HANDLE_TAP_SUCCESS(2013),
        HARDWARE_ACCELERATE_DISABLED(3001),
        BANNER_AUTO_REDIRECT(3002),
        BANNER_AUTO_REDIRECT_NOT_OVERRIDE_URL(3003),
        INLINE_INSTALL_STATUS(3004),
        UNRECOGNIZED(-1);

        public static final int AD_BACKGROUND_BEFORE_IMPRESSION_VALUE = 54;
        public static final int AD_CLICK_EVENT_VALUE = 47;
        public static final int AD_CLOSED_BEFORE_IMPRESSION_VALUE = 55;
        public static final int AD_DISPLAY_TO_CLICK_DURATION_MS_VALUE = 4;

        @Deprecated
        public static final int AD_EXPIRED_BEFORE_PLAY_VALUE = 22;
        public static final int AD_LEAVE_APPLICATION_VALUE = 50;
        public static final int AD_LOAD_FAIL_VALUE = 24;
        public static final int AD_LOAD_TO_CALLBACK_ADO_DURATION_MS_VALUE = 44;
        public static final int AD_LOAD_TO_CALLBACK_DURATION_MS_VALUE = 43;
        public static final int AD_LOAD_TO_FAIL_CALLBACK_DURATION_MS_VALUE = 41;
        public static final int AD_OPTIONAL_DOWNLOAD_DURATION_MS_VALUE = 53;
        public static final int AD_PLAY_RESET_ON_DEINIT_VALUE = 30;
        public static final int AD_PLAY_WITH_PARTIAL_DOWNLOAD_ASSET_VALUE = 63;
        public static final int AD_PRELOAD_TO_READY_DURATION_MS_VALUE = 64;
        public static final int AD_PRESENT_TO_DISPLAY_DURATION_MS_VALUE = 37;
        public static final int AD_REQUEST_TO_CALLBACK_ADO_DURATION_MS_VALUE = 12;
        public static final int AD_REQUEST_TO_CALLBACK_DURATION_MS_VALUE = 11;
        public static final int AD_REQUEST_TO_RESPONSE_DURATION_MS_VALUE = 1;
        public static final int AD_REQUIRED_DOWNLOAD_DURATION_MS_VALUE = 52;
        public static final int AD_RESPONSE_TO_SHOW_DURATION_MS_VALUE = 2;
        public static final int AD_REWARD_USER_VALUE = 51;
        public static final int AD_SHOW_TO_CLOSE_DURATION_MS_VALUE = 42;
        public static final int AD_SHOW_TO_DISPLAY_DURATION_MS_VALUE = 3;
        public static final int AD_SHOW_TO_FAIL_DURATION_MS_VALUE = 36;

        @Deprecated
        public static final int AD_SHOW_TO_PRESENT_DURATION_MS_VALUE = 35;
        public static final int AD_SHOW_TO_VALIDATION_DURATION_MS_VALUE = 48;
        public static final int AD_START_EVENT_VALUE = 46;
        public static final int AD_START_TO_BACKGROUND_DURATION_MS_VALUE = 59;
        public static final int AD_VALIDATION_TO_PRESENT_DURATION_MS_VALUE = 49;
        public static final int AD_VISIBILITY_VALUE = 56;
        public static final int AD_VISIBLE_DURATION_MS_VALUE = 71;
        public static final int AD_WILL_CLOSE_VALUE = 2010;
        public static final int APP_BACKGROUND_DURING_AD_LOAD_VALUE = 61;
        public static final int APP_TERM_DURING_AD_BEFORE_IMPRESSION_VALUE = 2011;
        public static final int ASSET_DOWNLOAD_DURATION_MS_VALUE = 7;
        public static final int ASSET_DOWNLOAD_RETRY_STATUS_VALUE = 70;
        public static final int ASSET_FILE_SIZE_VALUE = 13;
        public static final int ASSET_PARTIAL_DOWNLOAD_DURATION_MS_VALUE = 60;
        public static final int BANNER_AUTO_REDIRECT_NOT_OVERRIDE_URL_VALUE = 3003;
        public static final int BANNER_AUTO_REDIRECT_VALUE = 3002;
        public static final int BID_TOKEN_REQUESTED_VALUE = 38;
        public static final int BID_TOKEN_REQUEST_TO_FAIL_DURATION_MS_VALUE = 40;
        public static final int BID_TOKEN_REQUEST_TO_RESPONSE_DURATION_MS_VALUE = 39;
        public static final int BLACK_SCREEN_IS_DETECTED_VALUE = 66;
        public static final int CACHED_ASSETS_USED_VALUE = 16;
        public static final int CONCURRENT_CACHED_WEBVIEW_COUNT_VALUE = 65;
        public static final int CONFIG_LOADED_FROM_ADM_LOAD_VALUE = 34;
        public static final int CONFIG_LOADED_FROM_AD_LOAD_VALUE = 33;
        public static final int CONFIG_LOADED_FROM_INIT_VALUE = 32;
        public static final int DEPRECATED_API_USED_VALUE = 62;
        public static final int HANDLE_TAP_REQUEST_VALUE = 2012;
        public static final int HANDLE_TAP_SUCCESS_VALUE = 2013;
        public static final int HARDWARE_ACCELERATE_DISABLED_VALUE = 3001;
        public static final int IDFV_RESTRICTED_VALUE = 2007;
        public static final int IDFV_VALUE_CHANGED_VALUE = 2009;
        public static final int INIT_REQUEST_TO_RESPONSE_DURATION_MS_VALUE = 6;
        public static final int INIT_TO_FAIL_CALLBACK_DURATION_MS_VALUE = 58;
        public static final int INIT_TO_SUCCESS_CALLBACK_DURATION_MS_VALUE = 57;
        public static final int INLINE_INSTALL_STATUS_VALUE = 3004;
        public static final int IOS_STORE_KIT_LOAD_TIME_MS_VALUE = 5;
        public static final int LAUNCH_SAFARI_REQUEST_VALUE = 2006;
        public static final int LAUNCH_SKOVERLAY_REQUEST_VALUE = 2005;
        public static final int LAUNCH_STORE_KIT_REQUEST_VALUE = 2004;
        public static final int LOAD_AD_API_VALUE = 17;

        @Deprecated
        public static final int LOCAL_ASSETS_USED_VALUE = 8;
        public static final int MRAID_DOWNLOAD_JS_RETRY_SUCCESS_VALUE = 26;
        public static final int NATIVE_AD_DISPLAY_DURATION_VALUE = 69;
        public static final int NATIVE_PLAY_ASSET_TYPE_VALUE = 67;
        public static final int NATIVE_VIDEO_PREPARE_DURATION_MS_VALUE = 68;
        public static final int NOTIFICATION_REDIRECT_VALUE = 29;
        public static final int NOTIFICATION_WAIT_FOR_CONNECTIVITY_VALUE = 2008;
        public static final int OMSDK_DOWNLOAD_JS_RETRY_SUCCESS_VALUE = 27;
        public static final int PLAY_AD_API_VALUE = 23;
        public static final int PRIVACY_URL_OPENED_VALUE = 28;

        @Deprecated
        public static final int REMOTE_ASSETS_USED_VALUE = 9;
        public static final int SAFARI_PRESENTED_FOR_AD_VALUE = 2001;
        public static final int SDK_INIT_API_VALUE = 45;
        public static final int SKOVERLAY_PRESENTED_FOR_AD_VALUE = 2000;
        public static final int STORE_KIT_NOT_READY_VALUE = 2003;
        public static final int STORE_KIT_PRESENTED_FOR_AD_VALUE = 2002;
        public static final int TEMPLATE_DOWNLOAD_DURATION_MS_VALUE = 10;
        public static final int TEMPLATE_HTML_SIZE_VALUE = 31;
        public static final int TEMPLATE_ZIP_SIZE_VALUE = 15;
        public static final int TPAT_FIRED_VALUE = 18;
        public static final int TPAT_SUCCESS_VALUE = 19;
        public static final int UNKNOWN_METRIC_TYPE_VALUE = 0;
        public static final int USER_AGENT_LOAD_DURATION_MS_VALUE = 14;

        @Deprecated
        public static final int VIEW_NOT_VISIBLE_ON_PLAY_VALUE = 25;
        public static final int WIN_NOTIF_FIRED_VALUE = 20;
        public static final int WIN_NOTIF_SUCCESS_VALUE = 21;
        private static final Internal.EnumLiteMap<SDKMetricType> internalValueMap = new attabal();
        private final int value;

        public class attabal implements Internal.EnumLiteMap<SDKMetricType> {
            @Override // com.google.protobuf.Internal.EnumLiteMap
            public SDKMetricType findValueByNumber(int i) {
                return SDKMetricType.forNumber(i);
            }
        }

        public static final class saneness implements Internal.EnumVerifier {
            static final Internal.EnumVerifier INSTANCE = new saneness();

            private saneness() {
            }

            @Override // com.google.protobuf.Internal.EnumVerifier
            public boolean isInRange(int i) {
                return SDKMetricType.forNumber(i) != null;
            }
        }

        SDKMetricType(int i) {
            this.value = i;
        }

        public static SDKMetricType forNumber(int i) {
            switch (i) {
                case 0:
                    return UNKNOWN_METRIC_TYPE;
                case 1:
                    return AD_REQUEST_TO_RESPONSE_DURATION_MS;
                case 2:
                    return AD_RESPONSE_TO_SHOW_DURATION_MS;
                case 3:
                    return AD_SHOW_TO_DISPLAY_DURATION_MS;
                case 4:
                    return AD_DISPLAY_TO_CLICK_DURATION_MS;
                case 5:
                    return IOS_STORE_KIT_LOAD_TIME_MS;
                case 6:
                    return INIT_REQUEST_TO_RESPONSE_DURATION_MS;
                case 7:
                    return ASSET_DOWNLOAD_DURATION_MS;
                case 8:
                    return LOCAL_ASSETS_USED;
                case 9:
                    return REMOTE_ASSETS_USED;
                case 10:
                    return TEMPLATE_DOWNLOAD_DURATION_MS;
                case 11:
                    return AD_REQUEST_TO_CALLBACK_DURATION_MS;
                case 12:
                    return AD_REQUEST_TO_CALLBACK_ADO_DURATION_MS;
                case 13:
                    return ASSET_FILE_SIZE;
                case 14:
                    return USER_AGENT_LOAD_DURATION_MS;
                case 15:
                    return TEMPLATE_ZIP_SIZE;
                case 16:
                    return CACHED_ASSETS_USED;
                case 17:
                    return LOAD_AD_API;
                case 18:
                    return TPAT_FIRED;
                case 19:
                    return TPAT_SUCCESS;
                case 20:
                    return WIN_NOTIF_FIRED;
                case 21:
                    return WIN_NOTIF_SUCCESS;
                case 22:
                    return AD_EXPIRED_BEFORE_PLAY;
                case 23:
                    return PLAY_AD_API;
                case 24:
                    return AD_LOAD_FAIL;
                case 25:
                    return VIEW_NOT_VISIBLE_ON_PLAY;
                case 26:
                    return MRAID_DOWNLOAD_JS_RETRY_SUCCESS;
                case 27:
                    return OMSDK_DOWNLOAD_JS_RETRY_SUCCESS;
                case 28:
                    return PRIVACY_URL_OPENED;
                case 29:
                    return NOTIFICATION_REDIRECT;
                case 30:
                    return AD_PLAY_RESET_ON_DEINIT;
                case 31:
                    return TEMPLATE_HTML_SIZE;
                case 32:
                    return CONFIG_LOADED_FROM_INIT;
                case 33:
                    return CONFIG_LOADED_FROM_AD_LOAD;
                case 34:
                    return CONFIG_LOADED_FROM_ADM_LOAD;
                case 35:
                    return AD_SHOW_TO_PRESENT_DURATION_MS;
                case 36:
                    return AD_SHOW_TO_FAIL_DURATION_MS;
                case 37:
                    return AD_PRESENT_TO_DISPLAY_DURATION_MS;
                case 38:
                    return BID_TOKEN_REQUESTED;
                case 39:
                    return BID_TOKEN_REQUEST_TO_RESPONSE_DURATION_MS;
                case 40:
                    return BID_TOKEN_REQUEST_TO_FAIL_DURATION_MS;
                case 41:
                    return AD_LOAD_TO_FAIL_CALLBACK_DURATION_MS;
                case 42:
                    return AD_SHOW_TO_CLOSE_DURATION_MS;
                case 43:
                    return AD_LOAD_TO_CALLBACK_DURATION_MS;
                case 44:
                    return AD_LOAD_TO_CALLBACK_ADO_DURATION_MS;
                case 45:
                    return SDK_INIT_API;
                case 46:
                    return AD_START_EVENT;
                case 47:
                    return AD_CLICK_EVENT;
                case 48:
                    return AD_SHOW_TO_VALIDATION_DURATION_MS;
                case 49:
                    return AD_VALIDATION_TO_PRESENT_DURATION_MS;
                case 50:
                    return AD_LEAVE_APPLICATION;
                case 51:
                    return AD_REWARD_USER;
                case 52:
                    return AD_REQUIRED_DOWNLOAD_DURATION_MS;
                case 53:
                    return AD_OPTIONAL_DOWNLOAD_DURATION_MS;
                case 54:
                    return AD_BACKGROUND_BEFORE_IMPRESSION;
                case 55:
                    return AD_CLOSED_BEFORE_IMPRESSION;
                case 56:
                    return AD_VISIBILITY;
                case 57:
                    return INIT_TO_SUCCESS_CALLBACK_DURATION_MS;
                case 58:
                    return INIT_TO_FAIL_CALLBACK_DURATION_MS;
                case 59:
                    return AD_START_TO_BACKGROUND_DURATION_MS;
                case 60:
                    return ASSET_PARTIAL_DOWNLOAD_DURATION_MS;
                case 61:
                    return APP_BACKGROUND_DURING_AD_LOAD;
                case 62:
                    return DEPRECATED_API_USED;
                case 63:
                    return AD_PLAY_WITH_PARTIAL_DOWNLOAD_ASSET;
                case 64:
                    return AD_PRELOAD_TO_READY_DURATION_MS;
                case 65:
                    return CONCURRENT_CACHED_WEBVIEW_COUNT;
                case 66:
                    return BLACK_SCREEN_IS_DETECTED;
                case 67:
                    return NATIVE_PLAY_ASSET_TYPE;
                case 68:
                    return NATIVE_VIDEO_PREPARE_DURATION_MS;
                case 69:
                    return NATIVE_AD_DISPLAY_DURATION;
                case 70:
                    return ASSET_DOWNLOAD_RETRY_STATUS;
                case 71:
                    return AD_VISIBLE_DURATION_MS;
                default:
                    switch (i) {
                        case 2000:
                            return SKOVERLAY_PRESENTED_FOR_AD;
                        case 2001:
                            return SAFARI_PRESENTED_FOR_AD;
                        case 2002:
                            return STORE_KIT_PRESENTED_FOR_AD;
                        case 2003:
                            return STORE_KIT_NOT_READY;
                        case 2004:
                            return LAUNCH_STORE_KIT_REQUEST;
                        case 2005:
                            return LAUNCH_SKOVERLAY_REQUEST;
                        case 2006:
                            return LAUNCH_SAFARI_REQUEST;
                        case 2007:
                            return IDFV_RESTRICTED;
                        case 2008:
                            return NOTIFICATION_WAIT_FOR_CONNECTIVITY;
                        case 2009:
                            return IDFV_VALUE_CHANGED;
                        case 2010:
                            return AD_WILL_CLOSE;
                        case 2011:
                            return APP_TERM_DURING_AD_BEFORE_IMPRESSION;
                        case 2012:
                            return HANDLE_TAP_REQUEST;
                        case 2013:
                            return HANDLE_TAP_SUCCESS;
                        default:
                            switch (i) {
                                case 3001:
                                    return HARDWARE_ACCELERATE_DISABLED;
                                case 3002:
                                    return BANNER_AUTO_REDIRECT;
                                case 3003:
                                    return BANNER_AUTO_REDIRECT_NOT_OVERRIDE_URL;
                                case 3004:
                                    return INLINE_INSTALL_STATUS;
                                default:
                                    return null;
                            }
                    }
            }
        }

        public static Internal.EnumLiteMap<SDKMetricType> internalGetValueMap() {
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
        public static SDKMetricType valueOf(int i) {
            return forNumber(i);
        }
    }

    public static final class attabal extends GeneratedMessageLite.Builder<Sdk$SDKMetric, attabal> implements marial {
        public /* synthetic */ attabal(com.vungle.ads.internal.protos.attabal attabalVar) {
            this();
        }

        public attabal clearAdLoadType() {
            copyOnWrite();
            ((Sdk$SDKMetric) this.instance).clearAdLoadType();
            return this;
        }

        public attabal clearAdSource() {
            copyOnWrite();
            ((Sdk$SDKMetric) this.instance).clearAdSource();
            return this;
        }

        public attabal clearAdState() {
            copyOnWrite();
            ((Sdk$SDKMetric) this.instance).clearAdState();
            return this;
        }

        public attabal clearAdapterAdFormat() {
            copyOnWrite();
            ((Sdk$SDKMetric) this.instance).clearAdapterAdFormat();
            return this;
        }

        public attabal clearAppState() {
            copyOnWrite();
            ((Sdk$SDKMetric) this.instance).clearAppState();
            return this;
        }

        public attabal clearConnectionType() {
            copyOnWrite();
            ((Sdk$SDKMetric) this.instance).clearConnectionType();
            return this;
        }

        public attabal clearConnectionTypeDetail() {
            copyOnWrite();
            ((Sdk$SDKMetric) this.instance).clearConnectionTypeDetail();
            return this;
        }

        public attabal clearCreativeId() {
            copyOnWrite();
            ((Sdk$SDKMetric) this.instance).clearCreativeId();
            return this;
        }

        public attabal clearEventId() {
            copyOnWrite();
            ((Sdk$SDKMetric) this.instance).clearEventId();
            return this;
        }

        public attabal clearExperiments() {
            copyOnWrite();
            ((Sdk$SDKMetric) this.instance).clearExperiments();
            return this;
        }

        public attabal clearIsAdPodding() {
            copyOnWrite();
            ((Sdk$SDKMetric) this.instance).clearIsAdPodding();
            return this;
        }

        public attabal clearIsAdoEnabled() {
            copyOnWrite();
            ((Sdk$SDKMetric) this.instance).clearIsAdoEnabled();
            return this;
        }

        public attabal clearIsHbPlacement() {
            copyOnWrite();
            ((Sdk$SDKMetric) this.instance).clearIsHbPlacement();
            return this;
        }

        public attabal clearIsLowDataModeEnabled() {
            copyOnWrite();
            ((Sdk$SDKMetric) this.instance).clearIsLowDataModeEnabled();
            return this;
        }

        public attabal clearIsPartialDownloadEnabled() {
            copyOnWrite();
            ((Sdk$SDKMetric) this.instance).clearIsPartialDownloadEnabled();
            return this;
        }

        public attabal clearMake() {
            copyOnWrite();
            ((Sdk$SDKMetric) this.instance).clearMake();
            return this;
        }

        public attabal clearMediationName() {
            copyOnWrite();
            ((Sdk$SDKMetric) this.instance).clearMediationName();
            return this;
        }

        public attabal clearMeta() {
            copyOnWrite();
            ((Sdk$SDKMetric) this.instance).clearMeta();
            return this;
        }

        public attabal clearModel() {
            copyOnWrite();
            ((Sdk$SDKMetric) this.instance).clearModel();
            return this;
        }

        public attabal clearOs() {
            copyOnWrite();
            ((Sdk$SDKMetric) this.instance).clearOs();
            return this;
        }

        public attabal clearOsVersion() {
            copyOnWrite();
            ((Sdk$SDKMetric) this.instance).clearOsVersion();
            return this;
        }

        public attabal clearPlacementReferenceId() {
            copyOnWrite();
            ((Sdk$SDKMetric) this.instance).clearPlacementReferenceId();
            return this;
        }

        public attabal clearPlacementType() {
            copyOnWrite();
            ((Sdk$SDKMetric) this.instance).clearPlacementType();
            return this;
        }

        public attabal clearSessionId() {
            copyOnWrite();
            ((Sdk$SDKMetric) this.instance).clearSessionId();
            return this;
        }

        public attabal clearType() {
            copyOnWrite();
            ((Sdk$SDKMetric) this.instance).clearType();
            return this;
        }

        public attabal clearValue() {
            copyOnWrite();
            ((Sdk$SDKMetric) this.instance).clearValue();
            return this;
        }

        public attabal clearVmVersion() {
            copyOnWrite();
            ((Sdk$SDKMetric) this.instance).clearVmVersion();
            return this;
        }

        @Override // com.vungle.ads.internal.protos.marial
        public long getAdLoadType() {
            return ((Sdk$SDKMetric) this.instance).getAdLoadType();
        }

        @Override // com.vungle.ads.internal.protos.marial
        public String getAdSource() {
            return ((Sdk$SDKMetric) this.instance).getAdSource();
        }

        @Override // com.vungle.ads.internal.protos.marial
        public ByteString getAdSourceBytes() {
            return ((Sdk$SDKMetric) this.instance).getAdSourceBytes();
        }

        @Override // com.vungle.ads.internal.protos.marial
        public String getAdState() {
            return ((Sdk$SDKMetric) this.instance).getAdState();
        }

        @Override // com.vungle.ads.internal.protos.marial
        public ByteString getAdStateBytes() {
            return ((Sdk$SDKMetric) this.instance).getAdStateBytes();
        }

        @Override // com.vungle.ads.internal.protos.marial
        public String getAdapterAdFormat() {
            return ((Sdk$SDKMetric) this.instance).getAdapterAdFormat();
        }

        @Override // com.vungle.ads.internal.protos.marial
        public ByteString getAdapterAdFormatBytes() {
            return ((Sdk$SDKMetric) this.instance).getAdapterAdFormatBytes();
        }

        @Override // com.vungle.ads.internal.protos.marial
        public long getAppState() {
            return ((Sdk$SDKMetric) this.instance).getAppState();
        }

        @Override // com.vungle.ads.internal.protos.marial
        public String getConnectionType() {
            return ((Sdk$SDKMetric) this.instance).getConnectionType();
        }

        @Override // com.vungle.ads.internal.protos.marial
        public ByteString getConnectionTypeBytes() {
            return ((Sdk$SDKMetric) this.instance).getConnectionTypeBytes();
        }

        @Override // com.vungle.ads.internal.protos.marial
        public String getConnectionTypeDetail() {
            return ((Sdk$SDKMetric) this.instance).getConnectionTypeDetail();
        }

        @Override // com.vungle.ads.internal.protos.marial
        public ByteString getConnectionTypeDetailBytes() {
            return ((Sdk$SDKMetric) this.instance).getConnectionTypeDetailBytes();
        }

        @Override // com.vungle.ads.internal.protos.marial
        public String getCreativeId() {
            return ((Sdk$SDKMetric) this.instance).getCreativeId();
        }

        @Override // com.vungle.ads.internal.protos.marial
        public ByteString getCreativeIdBytes() {
            return ((Sdk$SDKMetric) this.instance).getCreativeIdBytes();
        }

        @Override // com.vungle.ads.internal.protos.marial
        public String getEventId() {
            return ((Sdk$SDKMetric) this.instance).getEventId();
        }

        @Override // com.vungle.ads.internal.protos.marial
        public ByteString getEventIdBytes() {
            return ((Sdk$SDKMetric) this.instance).getEventIdBytes();
        }

        @Override // com.vungle.ads.internal.protos.marial
        public String getExperiments() {
            return ((Sdk$SDKMetric) this.instance).getExperiments();
        }

        @Override // com.vungle.ads.internal.protos.marial
        public ByteString getExperimentsBytes() {
            return ((Sdk$SDKMetric) this.instance).getExperimentsBytes();
        }

        @Override // com.vungle.ads.internal.protos.marial
        public boolean getIsAdPodding() {
            return ((Sdk$SDKMetric) this.instance).getIsAdPodding();
        }

        @Override // com.vungle.ads.internal.protos.marial
        public boolean getIsAdoEnabled() {
            return ((Sdk$SDKMetric) this.instance).getIsAdoEnabled();
        }

        @Override // com.vungle.ads.internal.protos.marial
        public long getIsHbPlacement() {
            return ((Sdk$SDKMetric) this.instance).getIsHbPlacement();
        }

        @Override // com.vungle.ads.internal.protos.marial
        public boolean getIsLowDataModeEnabled() {
            return ((Sdk$SDKMetric) this.instance).getIsLowDataModeEnabled();
        }

        @Override // com.vungle.ads.internal.protos.marial
        public boolean getIsPartialDownloadEnabled() {
            return ((Sdk$SDKMetric) this.instance).getIsPartialDownloadEnabled();
        }

        @Override // com.vungle.ads.internal.protos.marial
        public String getMake() {
            return ((Sdk$SDKMetric) this.instance).getMake();
        }

        @Override // com.vungle.ads.internal.protos.marial
        public ByteString getMakeBytes() {
            return ((Sdk$SDKMetric) this.instance).getMakeBytes();
        }

        @Override // com.vungle.ads.internal.protos.marial
        public String getMediationName() {
            return ((Sdk$SDKMetric) this.instance).getMediationName();
        }

        @Override // com.vungle.ads.internal.protos.marial
        public ByteString getMediationNameBytes() {
            return ((Sdk$SDKMetric) this.instance).getMediationNameBytes();
        }

        @Override // com.vungle.ads.internal.protos.marial
        public String getMeta() {
            return ((Sdk$SDKMetric) this.instance).getMeta();
        }

        @Override // com.vungle.ads.internal.protos.marial
        public ByteString getMetaBytes() {
            return ((Sdk$SDKMetric) this.instance).getMetaBytes();
        }

        @Override // com.vungle.ads.internal.protos.marial
        public String getModel() {
            return ((Sdk$SDKMetric) this.instance).getModel();
        }

        @Override // com.vungle.ads.internal.protos.marial
        public ByteString getModelBytes() {
            return ((Sdk$SDKMetric) this.instance).getModelBytes();
        }

        @Override // com.vungle.ads.internal.protos.marial
        public String getOs() {
            return ((Sdk$SDKMetric) this.instance).getOs();
        }

        @Override // com.vungle.ads.internal.protos.marial
        public ByteString getOsBytes() {
            return ((Sdk$SDKMetric) this.instance).getOsBytes();
        }

        @Override // com.vungle.ads.internal.protos.marial
        public String getOsVersion() {
            return ((Sdk$SDKMetric) this.instance).getOsVersion();
        }

        @Override // com.vungle.ads.internal.protos.marial
        public ByteString getOsVersionBytes() {
            return ((Sdk$SDKMetric) this.instance).getOsVersionBytes();
        }

        @Override // com.vungle.ads.internal.protos.marial
        public String getPlacementReferenceId() {
            return ((Sdk$SDKMetric) this.instance).getPlacementReferenceId();
        }

        @Override // com.vungle.ads.internal.protos.marial
        public ByteString getPlacementReferenceIdBytes() {
            return ((Sdk$SDKMetric) this.instance).getPlacementReferenceIdBytes();
        }

        @Override // com.vungle.ads.internal.protos.marial
        public String getPlacementType() {
            return ((Sdk$SDKMetric) this.instance).getPlacementType();
        }

        @Override // com.vungle.ads.internal.protos.marial
        public ByteString getPlacementTypeBytes() {
            return ((Sdk$SDKMetric) this.instance).getPlacementTypeBytes();
        }

        @Override // com.vungle.ads.internal.protos.marial
        public String getSessionId() {
            return ((Sdk$SDKMetric) this.instance).getSessionId();
        }

        @Override // com.vungle.ads.internal.protos.marial
        public ByteString getSessionIdBytes() {
            return ((Sdk$SDKMetric) this.instance).getSessionIdBytes();
        }

        @Override // com.vungle.ads.internal.protos.marial
        public SDKMetricType getType() {
            return ((Sdk$SDKMetric) this.instance).getType();
        }

        @Override // com.vungle.ads.internal.protos.marial
        public int getTypeValue() {
            return ((Sdk$SDKMetric) this.instance).getTypeValue();
        }

        @Override // com.vungle.ads.internal.protos.marial
        public long getValue() {
            return ((Sdk$SDKMetric) this.instance).getValue();
        }

        @Override // com.vungle.ads.internal.protos.marial
        public String getVmVersion() {
            return ((Sdk$SDKMetric) this.instance).getVmVersion();
        }

        @Override // com.vungle.ads.internal.protos.marial
        public ByteString getVmVersionBytes() {
            return ((Sdk$SDKMetric) this.instance).getVmVersionBytes();
        }

        public attabal setAdLoadType(long j) {
            copyOnWrite();
            ((Sdk$SDKMetric) this.instance).setAdLoadType(j);
            return this;
        }

        public attabal setAdSource(String str) {
            copyOnWrite();
            ((Sdk$SDKMetric) this.instance).setAdSource(str);
            return this;
        }

        public attabal setAdSourceBytes(ByteString byteString) {
            copyOnWrite();
            ((Sdk$SDKMetric) this.instance).setAdSourceBytes(byteString);
            return this;
        }

        public attabal setAdState(String str) {
            copyOnWrite();
            ((Sdk$SDKMetric) this.instance).setAdState(str);
            return this;
        }

        public attabal setAdStateBytes(ByteString byteString) {
            copyOnWrite();
            ((Sdk$SDKMetric) this.instance).setAdStateBytes(byteString);
            return this;
        }

        public attabal setAdapterAdFormat(String str) {
            copyOnWrite();
            ((Sdk$SDKMetric) this.instance).setAdapterAdFormat(str);
            return this;
        }

        public attabal setAdapterAdFormatBytes(ByteString byteString) {
            copyOnWrite();
            ((Sdk$SDKMetric) this.instance).setAdapterAdFormatBytes(byteString);
            return this;
        }

        public attabal setAppState(long j) {
            copyOnWrite();
            ((Sdk$SDKMetric) this.instance).setAppState(j);
            return this;
        }

        public attabal setConnectionType(String str) {
            copyOnWrite();
            ((Sdk$SDKMetric) this.instance).setConnectionType(str);
            return this;
        }

        public attabal setConnectionTypeBytes(ByteString byteString) {
            copyOnWrite();
            ((Sdk$SDKMetric) this.instance).setConnectionTypeBytes(byteString);
            return this;
        }

        public attabal setConnectionTypeDetail(String str) {
            copyOnWrite();
            ((Sdk$SDKMetric) this.instance).setConnectionTypeDetail(str);
            return this;
        }

        public attabal setConnectionTypeDetailBytes(ByteString byteString) {
            copyOnWrite();
            ((Sdk$SDKMetric) this.instance).setConnectionTypeDetailBytes(byteString);
            return this;
        }

        public attabal setCreativeId(String str) {
            copyOnWrite();
            ((Sdk$SDKMetric) this.instance).setCreativeId(str);
            return this;
        }

        public attabal setCreativeIdBytes(ByteString byteString) {
            copyOnWrite();
            ((Sdk$SDKMetric) this.instance).setCreativeIdBytes(byteString);
            return this;
        }

        public attabal setEventId(String str) {
            copyOnWrite();
            ((Sdk$SDKMetric) this.instance).setEventId(str);
            return this;
        }

        public attabal setEventIdBytes(ByteString byteString) {
            copyOnWrite();
            ((Sdk$SDKMetric) this.instance).setEventIdBytes(byteString);
            return this;
        }

        public attabal setExperiments(String str) {
            copyOnWrite();
            ((Sdk$SDKMetric) this.instance).setExperiments(str);
            return this;
        }

        public attabal setExperimentsBytes(ByteString byteString) {
            copyOnWrite();
            ((Sdk$SDKMetric) this.instance).setExperimentsBytes(byteString);
            return this;
        }

        public attabal setIsAdPodding(boolean z) {
            copyOnWrite();
            ((Sdk$SDKMetric) this.instance).setIsAdPodding(z);
            return this;
        }

        public attabal setIsAdoEnabled(boolean z) {
            copyOnWrite();
            ((Sdk$SDKMetric) this.instance).setIsAdoEnabled(z);
            return this;
        }

        public attabal setIsHbPlacement(long j) {
            copyOnWrite();
            ((Sdk$SDKMetric) this.instance).setIsHbPlacement(j);
            return this;
        }

        public attabal setIsLowDataModeEnabled(boolean z) {
            copyOnWrite();
            ((Sdk$SDKMetric) this.instance).setIsLowDataModeEnabled(z);
            return this;
        }

        public attabal setIsPartialDownloadEnabled(boolean z) {
            copyOnWrite();
            ((Sdk$SDKMetric) this.instance).setIsPartialDownloadEnabled(z);
            return this;
        }

        public attabal setMake(String str) {
            copyOnWrite();
            ((Sdk$SDKMetric) this.instance).setMake(str);
            return this;
        }

        public attabal setMakeBytes(ByteString byteString) {
            copyOnWrite();
            ((Sdk$SDKMetric) this.instance).setMakeBytes(byteString);
            return this;
        }

        public attabal setMediationName(String str) {
            copyOnWrite();
            ((Sdk$SDKMetric) this.instance).setMediationName(str);
            return this;
        }

        public attabal setMediationNameBytes(ByteString byteString) {
            copyOnWrite();
            ((Sdk$SDKMetric) this.instance).setMediationNameBytes(byteString);
            return this;
        }

        public attabal setMeta(String str) {
            copyOnWrite();
            ((Sdk$SDKMetric) this.instance).setMeta(str);
            return this;
        }

        public attabal setMetaBytes(ByteString byteString) {
            copyOnWrite();
            ((Sdk$SDKMetric) this.instance).setMetaBytes(byteString);
            return this;
        }

        public attabal setModel(String str) {
            copyOnWrite();
            ((Sdk$SDKMetric) this.instance).setModel(str);
            return this;
        }

        public attabal setModelBytes(ByteString byteString) {
            copyOnWrite();
            ((Sdk$SDKMetric) this.instance).setModelBytes(byteString);
            return this;
        }

        public attabal setOs(String str) {
            copyOnWrite();
            ((Sdk$SDKMetric) this.instance).setOs(str);
            return this;
        }

        public attabal setOsBytes(ByteString byteString) {
            copyOnWrite();
            ((Sdk$SDKMetric) this.instance).setOsBytes(byteString);
            return this;
        }

        public attabal setOsVersion(String str) {
            copyOnWrite();
            ((Sdk$SDKMetric) this.instance).setOsVersion(str);
            return this;
        }

        public attabal setOsVersionBytes(ByteString byteString) {
            copyOnWrite();
            ((Sdk$SDKMetric) this.instance).setOsVersionBytes(byteString);
            return this;
        }

        public attabal setPlacementReferenceId(String str) {
            copyOnWrite();
            ((Sdk$SDKMetric) this.instance).setPlacementReferenceId(str);
            return this;
        }

        public attabal setPlacementReferenceIdBytes(ByteString byteString) {
            copyOnWrite();
            ((Sdk$SDKMetric) this.instance).setPlacementReferenceIdBytes(byteString);
            return this;
        }

        public attabal setPlacementType(String str) {
            copyOnWrite();
            ((Sdk$SDKMetric) this.instance).setPlacementType(str);
            return this;
        }

        public attabal setPlacementTypeBytes(ByteString byteString) {
            copyOnWrite();
            ((Sdk$SDKMetric) this.instance).setPlacementTypeBytes(byteString);
            return this;
        }

        public attabal setSessionId(String str) {
            copyOnWrite();
            ((Sdk$SDKMetric) this.instance).setSessionId(str);
            return this;
        }

        public attabal setSessionIdBytes(ByteString byteString) {
            copyOnWrite();
            ((Sdk$SDKMetric) this.instance).setSessionIdBytes(byteString);
            return this;
        }

        public attabal setType(SDKMetricType sDKMetricType) {
            copyOnWrite();
            ((Sdk$SDKMetric) this.instance).setType(sDKMetricType);
            return this;
        }

        public attabal setTypeValue(int i) {
            copyOnWrite();
            ((Sdk$SDKMetric) this.instance).setTypeValue(i);
            return this;
        }

        public attabal setValue(long j) {
            copyOnWrite();
            ((Sdk$SDKMetric) this.instance).setValue(j);
            return this;
        }

        public attabal setVmVersion(String str) {
            copyOnWrite();
            ((Sdk$SDKMetric) this.instance).setVmVersion(str);
            return this;
        }

        public attabal setVmVersionBytes(ByteString byteString) {
            copyOnWrite();
            ((Sdk$SDKMetric) this.instance).setVmVersionBytes(byteString);
            return this;
        }

        private attabal() {
            super(Sdk$SDKMetric.DEFAULT_INSTANCE);
        }
    }

    static {
        Sdk$SDKMetric sdk$SDKMetric = new Sdk$SDKMetric();
        DEFAULT_INSTANCE = sdk$SDKMetric;
        GeneratedMessageLite.registerDefaultInstance(Sdk$SDKMetric.class, sdk$SDKMetric);
    }

    private Sdk$SDKMetric() {
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
    public void clearConnectionType() {
        this.connectionType_ = getDefaultInstance().getConnectionType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearConnectionTypeDetail() {
        this.connectionTypeDetail_ = getDefaultInstance().getConnectionTypeDetail();
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
    public void clearMeta() {
        this.meta_ = getDefaultInstance().getMeta();
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
    public void clearSessionId() {
        this.sessionId_ = getDefaultInstance().getSessionId();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearType() {
        this.type_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearValue() {
        this.value_ = 0L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearVmVersion() {
        this.vmVersion_ = getDefaultInstance().getVmVersion();
    }

    public static Sdk$SDKMetric getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static attabal newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static Sdk$SDKMetric parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (Sdk$SDKMetric) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static Sdk$SDKMetric parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (Sdk$SDKMetric) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static Parser<Sdk$SDKMetric> parser() {
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
    public void setMeta(String str) {
        str.getClass();
        this.meta_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setMetaBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.meta_ = byteString.toStringUtf8();
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
    public void setType(SDKMetricType sDKMetricType) {
        this.type_ = sDKMetricType.getNumber();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setTypeValue(int i) {
        this.type_ = i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setValue(long j) {
        this.value_ = j;
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
                return new Sdk$SDKMetric();
            case 2:
                return new attabal(attabalVar);
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u001b\u0000\u0000\u0001É\u001b\u0000\u0000\u0000\u0001\f\u0002\u0002\u0003Ȉ\u0004Ȉ\u0005Ȉ\u0006Ȉ\u0007Ȉ\bȈ\tȈ\nȈ\u000bȈ\fȈ\rȈ\u000e\u0002\u000fȈ\u0010Ȉ\u0011Ȉ\u0012\u0002\u0013Ȉ\u0014\u0007\u0015\u0007\u0016\u0007\u0017Ȉ\u0018Ȉ\u0019\u0002\u001aȈÉ\u0007", new Object[]{"type_", "value_", "meta_", "make_", "model_", "os_", "osVersion_", "connectionType_", "connectionTypeDetail_", "placementReferenceId_", "creativeId_", "eventId_", "sessionId_", "isHbPlacement_", "placementType_", "adSource_", "mediationName_", "appState_", "vmVersion_", "isAdoEnabled_", "isPartialDownloadEnabled_", "isAdPodding_", "adState_", "experiments_", "adLoadType_", "adapterAdFormat_", "isLowDataModeEnabled_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<Sdk$SDKMetric> parser = PARSER;
                if (parser != null) {
                    return parser;
                }
                synchronized (Sdk$SDKMetric.class) {
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

    @Override // com.vungle.ads.internal.protos.marial
    public long getAdLoadType() {
        return this.adLoadType_;
    }

    @Override // com.vungle.ads.internal.protos.marial
    public String getAdSource() {
        return this.adSource_;
    }

    @Override // com.vungle.ads.internal.protos.marial
    public ByteString getAdSourceBytes() {
        return ByteString.copyFromUtf8(this.adSource_);
    }

    @Override // com.vungle.ads.internal.protos.marial
    public String getAdState() {
        return this.adState_;
    }

    @Override // com.vungle.ads.internal.protos.marial
    public ByteString getAdStateBytes() {
        return ByteString.copyFromUtf8(this.adState_);
    }

    @Override // com.vungle.ads.internal.protos.marial
    public String getAdapterAdFormat() {
        return this.adapterAdFormat_;
    }

    @Override // com.vungle.ads.internal.protos.marial
    public ByteString getAdapterAdFormatBytes() {
        return ByteString.copyFromUtf8(this.adapterAdFormat_);
    }

    @Override // com.vungle.ads.internal.protos.marial
    public long getAppState() {
        return this.appState_;
    }

    @Override // com.vungle.ads.internal.protos.marial
    public String getConnectionType() {
        return this.connectionType_;
    }

    @Override // com.vungle.ads.internal.protos.marial
    public ByteString getConnectionTypeBytes() {
        return ByteString.copyFromUtf8(this.connectionType_);
    }

    @Override // com.vungle.ads.internal.protos.marial
    public String getConnectionTypeDetail() {
        return this.connectionTypeDetail_;
    }

    @Override // com.vungle.ads.internal.protos.marial
    public ByteString getConnectionTypeDetailBytes() {
        return ByteString.copyFromUtf8(this.connectionTypeDetail_);
    }

    @Override // com.vungle.ads.internal.protos.marial
    public String getCreativeId() {
        return this.creativeId_;
    }

    @Override // com.vungle.ads.internal.protos.marial
    public ByteString getCreativeIdBytes() {
        return ByteString.copyFromUtf8(this.creativeId_);
    }

    @Override // com.vungle.ads.internal.protos.marial
    public String getEventId() {
        return this.eventId_;
    }

    @Override // com.vungle.ads.internal.protos.marial
    public ByteString getEventIdBytes() {
        return ByteString.copyFromUtf8(this.eventId_);
    }

    @Override // com.vungle.ads.internal.protos.marial
    public String getExperiments() {
        return this.experiments_;
    }

    @Override // com.vungle.ads.internal.protos.marial
    public ByteString getExperimentsBytes() {
        return ByteString.copyFromUtf8(this.experiments_);
    }

    @Override // com.vungle.ads.internal.protos.marial
    public boolean getIsAdPodding() {
        return this.isAdPodding_;
    }

    @Override // com.vungle.ads.internal.protos.marial
    public boolean getIsAdoEnabled() {
        return this.isAdoEnabled_;
    }

    @Override // com.vungle.ads.internal.protos.marial
    public long getIsHbPlacement() {
        return this.isHbPlacement_;
    }

    @Override // com.vungle.ads.internal.protos.marial
    public boolean getIsLowDataModeEnabled() {
        return this.isLowDataModeEnabled_;
    }

    @Override // com.vungle.ads.internal.protos.marial
    public boolean getIsPartialDownloadEnabled() {
        return this.isPartialDownloadEnabled_;
    }

    @Override // com.vungle.ads.internal.protos.marial
    public String getMake() {
        return this.make_;
    }

    @Override // com.vungle.ads.internal.protos.marial
    public ByteString getMakeBytes() {
        return ByteString.copyFromUtf8(this.make_);
    }

    @Override // com.vungle.ads.internal.protos.marial
    public String getMediationName() {
        return this.mediationName_;
    }

    @Override // com.vungle.ads.internal.protos.marial
    public ByteString getMediationNameBytes() {
        return ByteString.copyFromUtf8(this.mediationName_);
    }

    @Override // com.vungle.ads.internal.protos.marial
    public String getMeta() {
        return this.meta_;
    }

    @Override // com.vungle.ads.internal.protos.marial
    public ByteString getMetaBytes() {
        return ByteString.copyFromUtf8(this.meta_);
    }

    @Override // com.vungle.ads.internal.protos.marial
    public String getModel() {
        return this.model_;
    }

    @Override // com.vungle.ads.internal.protos.marial
    public ByteString getModelBytes() {
        return ByteString.copyFromUtf8(this.model_);
    }

    @Override // com.vungle.ads.internal.protos.marial
    public String getOs() {
        return this.os_;
    }

    @Override // com.vungle.ads.internal.protos.marial
    public ByteString getOsBytes() {
        return ByteString.copyFromUtf8(this.os_);
    }

    @Override // com.vungle.ads.internal.protos.marial
    public String getOsVersion() {
        return this.osVersion_;
    }

    @Override // com.vungle.ads.internal.protos.marial
    public ByteString getOsVersionBytes() {
        return ByteString.copyFromUtf8(this.osVersion_);
    }

    @Override // com.vungle.ads.internal.protos.marial
    public String getPlacementReferenceId() {
        return this.placementReferenceId_;
    }

    @Override // com.vungle.ads.internal.protos.marial
    public ByteString getPlacementReferenceIdBytes() {
        return ByteString.copyFromUtf8(this.placementReferenceId_);
    }

    @Override // com.vungle.ads.internal.protos.marial
    public String getPlacementType() {
        return this.placementType_;
    }

    @Override // com.vungle.ads.internal.protos.marial
    public ByteString getPlacementTypeBytes() {
        return ByteString.copyFromUtf8(this.placementType_);
    }

    @Override // com.vungle.ads.internal.protos.marial
    public String getSessionId() {
        return this.sessionId_;
    }

    @Override // com.vungle.ads.internal.protos.marial
    public ByteString getSessionIdBytes() {
        return ByteString.copyFromUtf8(this.sessionId_);
    }

    @Override // com.vungle.ads.internal.protos.marial
    public SDKMetricType getType() {
        SDKMetricType sDKMetricTypeForNumber = SDKMetricType.forNumber(this.type_);
        return sDKMetricTypeForNumber == null ? SDKMetricType.UNRECOGNIZED : sDKMetricTypeForNumber;
    }

    @Override // com.vungle.ads.internal.protos.marial
    public int getTypeValue() {
        return this.type_;
    }

    @Override // com.vungle.ads.internal.protos.marial
    public long getValue() {
        return this.value_;
    }

    @Override // com.vungle.ads.internal.protos.marial
    public String getVmVersion() {
        return this.vmVersion_;
    }

    @Override // com.vungle.ads.internal.protos.marial
    public ByteString getVmVersionBytes() {
        return ByteString.copyFromUtf8(this.vmVersion_);
    }

    public static attabal newBuilder(Sdk$SDKMetric sdk$SDKMetric) {
        return DEFAULT_INSTANCE.createBuilder(sdk$SDKMetric);
    }

    public static Sdk$SDKMetric parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (Sdk$SDKMetric) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static Sdk$SDKMetric parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (Sdk$SDKMetric) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static Sdk$SDKMetric parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (Sdk$SDKMetric) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static Sdk$SDKMetric parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (Sdk$SDKMetric) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static Sdk$SDKMetric parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (Sdk$SDKMetric) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static Sdk$SDKMetric parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (Sdk$SDKMetric) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static Sdk$SDKMetric parseFrom(InputStream inputStream) throws IOException {
        return (Sdk$SDKMetric) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static Sdk$SDKMetric parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (Sdk$SDKMetric) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static Sdk$SDKMetric parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (Sdk$SDKMetric) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static Sdk$SDKMetric parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (Sdk$SDKMetric) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }
}
