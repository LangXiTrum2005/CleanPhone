package com.unity3d.ads.core.domain;

import ak.k;
import androidx.core.app.NotificationCompat;
import cn.a0;
import com.google.protobuf.ByteString;
import com.ironsource.X3;
import com.unity3d.ads.UnityAdsLoadOptions;
import com.unity3d.ads.core.data.model.AdObject;
import gatewayprotocol.v1.DiagnosticEventRequestOuterClass;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.n;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010$\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u0000 \u00122\u00020\u0001:\u0001\u0012Jl\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0016\b\u0002\u0010\u0007\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00062\u0016\b\u0002\u0010\t\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\b\u0018\u00010\u00062\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\bH¦\u0002¢\u0006\u0004\b\u000e\u0010\u000fJl\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0003\u001a\u00020\u00102\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0016\b\u0002\u0010\u0007\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00062\u0016\b\u0002\u0010\t\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\b\u0018\u00010\u00062\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\bH¦\u0002¢\u0006\u0004\b\u000e\u0010\u0011¨\u0006\u0013"}, d2 = {"Lcom/unity3d/ads/core/domain/SendDiagnosticEvent;", "", "", NotificationCompat.CATEGORY_EVENT, "", X3.i.X, "", "tags", "", "intTags", "Lcom/unity3d/ads/core/data/model/AdObject;", "adObject", "tokenNumber", "Lwj/r;", "invoke", "(Ljava/lang/String;Ljava/lang/Double;Ljava/util/Map;Ljava/util/Map;Lcom/unity3d/ads/core/data/model/AdObject;Ljava/lang/Integer;)V", "Lgatewayprotocol/v1/DiagnosticEventRequestOuterClass$DiagnosticEventType;", "(Lgatewayprotocol/v1/DiagnosticEventRequestOuterClass$DiagnosticEventType;Ljava/lang/Double;Ljava/util/Map;Ljava/util/Map;Lcom/unity3d/ads/core/data/model/AdObject;Ljava/lang/Integer;)V", "Companion", "unity-ads_defaultRelease"}, k = 1, mv = {1, 8, 0}, xi = DiagnosticEventRequestOuterClass.DiagnosticEventType.DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_QUALITY_INIT_STARTED_VALUE)
public interface SendDiagnosticEvent {
    public static final String APP_ACTIVE = "app_active";
    public static final String ATTEMPT_INSERT_NULL_DIAGNOSTIC_EVENT = "attempt_insert_null_diagnostic_event";
    public static final String AWAITED_INIT = "awaited_init";
    public static final String BANNER_DESTROYED = "native_banner_destroyed";
    public static final String BRIDGE_SEND_EVENT_FAILED = "bridge_send_event_failed";
    public static final String CACHE_SOURCE = "cache_source";
    public static final String COMPLETE_STATE = "complete_state";
    public static final String COROUTINE_NAME = "coroutine_name";

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = Companion.$$INSTANCE;
    public static final String GAME_ID = "game_id";
    public static final String IMPRESSION_OPPORTUNITY_ID = "impressionOpportunityId";
    public static final String INIT_GAME_ID_CHANGED = "native_initialize_game_id_changed";
    public static final String INIT_GAME_ID_SAME = "native_initialize_game_id_same";
    public static final String INIT_MISSED_NATIVE_PARSING = "native_initialize_missed_native_parsing";
    public static final String INIT_TEST_MODE_CHANGED = "native_initialize_test_mode_changed";
    public static final String INIT_TEST_MODE_SAME = "native_initialize_test_mode_same";
    public static final String INSTALL_REFERRAL_FETCH_COMPLETED = "install_referral_fetch_completed";
    public static final String INSTALL_REFERRAL_FETCH_FAILED = "install_referral_fetch_failed";
    public static final String INSTALL_REFERRAL_FETCH_TIMED_OUT = "install_referral_fetch_timed_out";
    public static final String IS_RETRY = "is_retry";
    public static final String KOTLIN_VERSION = "kotlin_version";
    public static final String LOAD_CONFIG_FAILURE_TIME = "native_load_config_failure_time";
    public static final String LOAD_CONFIG_SUCCESS_TIME = "native_load_config_success_time";
    public static final String NETWORK_CLIENT = "network_client";
    public static final String NETWORK_FAILURE = "native_network_failure_time";
    public static final String NETWORK_PARSE = "native_network_parse_failure";
    public static final String NEW_API = "new_api";
    public static final String NULL_DIAGNOSTIC_EVENT = "null_diagnostic_event";
    public static final String OM_ACTIVATE_FAILURE = "om_activate_failure_time";
    public static final String OM_ACTIVATE_STARTED = "om_activate_started";
    public static final String OM_ACTIVATE_SUCCESS = "om_activate_success_time";
    public static final String OM_IMPRESSION_OCCURRED_FAILURE = "om_impression_occurred_failure";
    public static final String OM_IMPRESSION_OCCURRED_SUCCESS = "om_impression_occurred_success";
    public static final String OM_SESSION_FINISH_FAILURE = "om_session_finish_failure";
    public static final String OM_SESSION_FINISH_SUCCESS = "om_session_finish_success";
    public static final String OM_SESSION_START_FAILURE = "om_session_start_failure";
    public static final String OM_SESSION_START_SUCCESS = "om_session_start_success";
    public static final String OPERATION = "operation";
    public static final String PREVIOUS_GAME_ID = "previous_game_id";
    public static final String PREVIOUS_TEST_MODE = "previous_test_mode";
    public static final String PROTOCOL = "protocol";
    public static final String REASON = "reason";
    public static final String REASON_AD_MARKUP_PARSE = "invalid_admarkup";
    public static final String REASON_AD_OBJECT_EXPIRED = "ad_object_expired";
    public static final String REASON_AD_OBJECT_NOT_FOUND = "ad_object_not_found";
    public static final String REASON_AD_PLAYER_SCOPE = "ad_player_scope_not_active";
    public static final String REASON_AD_VIEWER = "adviewer";
    public static final String REASON_ALREADY_SHOWING = "already_showing";
    public static final String REASON_CODE = "reason_code";
    public static final String REASON_DEBUG = "reason_debug";
    public static final String REASON_GATEWAY = "gateway";
    public static final String REASON_INVALID_ENTRY_POINT = "invalid_url";
    public static final String REASON_INVALID_GAME_ID = "invalid_game_id";
    public static final String REASON_LISTENER_NULL = "listener_null";
    public static final String REASON_NETWORK = "network";
    public static final String REASON_NOT_INITIALIZED = "not_initialized";
    public static final String REASON_NO_FILL = "no_fill";
    public static final String REASON_NO_WEBVIEW_ENTRY_POINT = "no_webview_entry_point";
    public static final String REASON_OM_ALREADY_ACTIVE = "om_already_active";
    public static final String REASON_OM_CREATIVE_TYPE_INVALID = "om_creative_type_invalid";
    public static final String REASON_OM_CREATIVE_TYPE_NULL = "om_creative_type_null";
    public static final String REASON_OM_NOT_ACTIVE = "om_not_active";
    public static final String REASON_OM_SESSION_ALREADY_EXISTS = "om_session_already_exists";
    public static final String REASON_OM_SESSION_NOT_FOUND = "om_session_not_found";
    public static final String REASON_OPPORTUNITY_ID = "no_opportunity_id";
    public static final String REASON_OPPORTUNITY_USED = "opportunity_id_used";
    public static final String REASON_PLACEMENT_NOT_LOADED = "placement_not_loaded";
    public static final String REASON_PLACEMENT_NULL = "placement_null";
    public static final String REASON_PLACEMENT_VALIDATION = "placement_validation";
    public static final String REASON_PROTOBUF_PARSING = "protobuf_parsing";
    public static final String REASON_TIMEOUT = "timeout";
    public static final String REASON_TIMEOUT_INITIALIZATION = "timeout_initialization";
    public static final String REASON_UNCAUGHT_EXCEPTION = "uncaught_exception";
    public static final String REASON_UNKNOWN = "unknown";
    public static final String REASON_WEBVIEWLESS_AD_NOT_FOUND = "webviewless_ad_not_found";
    public static final String REASON_WEBVIEW_LESS_SHOW_FAIL = "webview_less_show_fail";
    public static final String RETRIES = "retries";
    public static final String SAME_SESSION = "same_session";
    public static final String SCAR_SIGNALS_COLLECTION_FAILURE = "native_scar_signals_collection_failure_time";
    public static final String SCAR_SIGNALS_COLLECTION_STARTED = "native_scar_signals_collection_started";
    public static final String SCAR_SIGNALS_COLLECTION_SUCCESS = "native_scar_signals_collection_success_time";
    public static final String SCAR_SIGNALS_UPLOAD_FAILURE = "native_scar_signals_upload_failure_time";
    public static final String SCAR_SIGNALS_UPLOAD_STARTED = "native_scar_signals_upload_started";
    public static final String SCAR_SIGNALS_UPLOAD_SUCCESS = "native_scar_signals_upload_success_time";
    public static final String SCAR_VIDEO_LENGTH_IN_SEC = "native_scar_video_length_in_sec";
    public static final String SHOW_ACTIVITY_NOT_AVAILABLE = "native_show_activity_not_available";
    public static final String SHOW_AD_VIEWER_FULLSCREEN = "native_show_ad_viewer_fullscreen";
    public static final String SHOW_CANCEL_TIMEOUT = "native_show_cancel_timeout";
    public static final String SHOW_IS_FILE_CACHED_FAILURE = "native_show_is_file_cached_failure_time";
    public static final String SHOW_IS_FILE_CACHED_SUCCESS = "native_show_is_file_cached_success_time";
    public static final String SIZE_KB = "size_kb";
    public static final String SOURCE = "source";
    public static final String SOURCE_GET_TOKEN_API = "get_token";
    public static final String SOURCE_INIT_API = "init";
    public static final String SOURCE_LOAD_API = "load";
    public static final String SOURCE_PUBLIC_API = "api";
    public static final String SOURCE_SHOW_API = "show";
    public static final String STATE = "state";
    public static final String SYNC = "sync";
    public static final String SYSTEM_CRONET_ENGINE_ERROR = "native_cronet_engine_error";
    public static final String SYSTEM_CRONET_FAILURE = "native_cronet_failure_time";
    public static final String SYSTEM_CRONET_INSTALL_ERROR = "native_cronet_install_error";
    public static final String SYSTEM_CRONET_SUCCESS = "native_cronet_success_time";
    public static final String SYSTEM_CRONET_TIMEOUT = "native_cronet_timeout";
    public static final String TEST_MODE = "test_mode";
    public static final String URL = "url";
    public static final String WEBVIEW_COULD_NOT_HANDLE_INTERCEPTED_URL = "webview_could_not_handle_intercepted_url";
    public static final String WEBVIEW_ERROR = "webview_error";
    public static final String WEBVIEW_ERROR_CODE = "webview_error_code";
    public static final String WEBVIEW_INVOCATION = "webview_invocation";
    public static final String WEBVIEW_INVOCATION_ERROR = "native_webview_invocation_error";
    public static final String WEBVIEW_LESS = "webviewless";
    public static final String WEBVIEW_LESS_AD_ACTIVITY_LAUNCHED = "native_webview_less_ad_activity_launched";
    public static final String WEBVIEW_LESS_AD_DISPLAY_STARTED = "native_webview_less_ad_display_started";
    public static final String WEBVIEW_LESS_ASSET_CACHE_FAIL = "native_webview_less_asset_cache_fail";
    public static final String WEBVIEW_LESS_ASSET_CACHE_TIMEOUT = "native_webview_less_asset_cache_timeout";
    public static final String WEBVIEW_LESS_SHOW_STARTED = "native_webview_less_show_started";
    public static final String WEBVIEW_URL = "webview_url";

    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\bu\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001:\u0002\u0085\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002JE\u0010y\u001a\u00020z2\u0006\u0010{\u001a\u00020|2\b\u0010}\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010~\u001a\u00020\u007f2\n\b\u0002\u0010\u0080\u0001\u001a\u00030\u0081\u00012\n\b\u0002\u0010\u0082\u0001\u001a\u00030\u0083\u00012\t\b\u0002\u0010\u0084\u0001\u001a\u00020\u007fR\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0017\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0018\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0019\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u001a\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u001b\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u001c\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u001d\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u001e\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u001f\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010 \u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010!\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\"\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010#\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010$\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010%\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010&\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010'\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010(\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010)\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010*\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010+\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010,\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010-\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010.\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010/\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u00100\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u00101\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u00102\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u00103\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u00104\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u00105\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u00106\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u00107\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u00108\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u00109\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010:\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010;\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010<\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010=\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010>\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010?\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010@\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010A\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010B\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010C\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010D\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010E\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010F\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010G\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010H\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010I\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010J\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010K\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010L\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010M\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010N\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010O\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010P\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010Q\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010R\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010S\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010T\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010U\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010V\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010W\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010X\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010Y\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010Z\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010[\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\\\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010]\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010^\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010_\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010`\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010a\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010b\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010c\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010d\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010e\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010f\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010g\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010h\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010i\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010j\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010k\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010l\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010m\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010n\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010o\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010p\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010q\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010r\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010s\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010t\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010u\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010v\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010w\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010x\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0086\u0001"}, d2 = {"Lcom/unity3d/ads/core/domain/SendDiagnosticEvent$Companion;", "", "()V", "APP_ACTIVE", "", "ATTEMPT_INSERT_NULL_DIAGNOSTIC_EVENT", "AWAITED_INIT", "BANNER_DESTROYED", "BRIDGE_SEND_EVENT_FAILED", "CACHE_SOURCE", "COMPLETE_STATE", "COROUTINE_NAME", "GAME_ID", "IMPRESSION_OPPORTUNITY_ID", "INIT_GAME_ID_CHANGED", "INIT_GAME_ID_SAME", "INIT_MISSED_NATIVE_PARSING", "INIT_TEST_MODE_CHANGED", "INIT_TEST_MODE_SAME", "INSTALL_REFERRAL_FETCH_COMPLETED", "INSTALL_REFERRAL_FETCH_FAILED", "INSTALL_REFERRAL_FETCH_TIMED_OUT", "IS_RETRY", "KOTLIN_VERSION", "LOAD_CONFIG_FAILURE_TIME", "LOAD_CONFIG_SUCCESS_TIME", "NETWORK_CLIENT", "NETWORK_FAILURE", "NETWORK_PARSE", "NEW_API", "NULL_DIAGNOSTIC_EVENT", "OM_ACTIVATE_FAILURE", "OM_ACTIVATE_STARTED", "OM_ACTIVATE_SUCCESS", "OM_IMPRESSION_OCCURRED_FAILURE", "OM_IMPRESSION_OCCURRED_SUCCESS", "OM_SESSION_FINISH_FAILURE", "OM_SESSION_FINISH_SUCCESS", "OM_SESSION_START_FAILURE", "OM_SESSION_START_SUCCESS", "OPERATION", "PREVIOUS_GAME_ID", "PREVIOUS_TEST_MODE", "PROTOCOL", "REASON", "REASON_AD_MARKUP_PARSE", "REASON_AD_OBJECT_EXPIRED", "REASON_AD_OBJECT_NOT_FOUND", "REASON_AD_PLAYER_SCOPE", "REASON_AD_VIEWER", "REASON_ALREADY_SHOWING", "REASON_CODE", "REASON_DEBUG", "REASON_GATEWAY", "REASON_INVALID_ENTRY_POINT", "REASON_INVALID_GAME_ID", "REASON_LISTENER_NULL", "REASON_NETWORK", "REASON_NOT_INITIALIZED", "REASON_NO_FILL", "REASON_NO_WEBVIEW_ENTRY_POINT", "REASON_OM_ALREADY_ACTIVE", "REASON_OM_CREATIVE_TYPE_INVALID", "REASON_OM_CREATIVE_TYPE_NULL", "REASON_OM_NOT_ACTIVE", "REASON_OM_SESSION_ALREADY_EXISTS", "REASON_OM_SESSION_NOT_FOUND", "REASON_OPPORTUNITY_ID", "REASON_OPPORTUNITY_USED", "REASON_PLACEMENT_NOT_LOADED", "REASON_PLACEMENT_NULL", "REASON_PLACEMENT_VALIDATION", "REASON_PROTOBUF_PARSING", "REASON_TIMEOUT", "REASON_TIMEOUT_INITIALIZATION", "REASON_UNCAUGHT_EXCEPTION", "REASON_UNKNOWN", "REASON_WEBVIEWLESS_AD_NOT_FOUND", "REASON_WEBVIEW_LESS_SHOW_FAIL", "RETRIES", "SAME_SESSION", "SCAR_SIGNALS_COLLECTION_FAILURE", "SCAR_SIGNALS_COLLECTION_STARTED", "SCAR_SIGNALS_COLLECTION_SUCCESS", "SCAR_SIGNALS_UPLOAD_FAILURE", "SCAR_SIGNALS_UPLOAD_STARTED", "SCAR_SIGNALS_UPLOAD_SUCCESS", "SCAR_VIDEO_LENGTH_IN_SEC", "SHOW_ACTIVITY_NOT_AVAILABLE", "SHOW_AD_VIEWER_FULLSCREEN", "SHOW_CANCEL_TIMEOUT", "SHOW_IS_FILE_CACHED_FAILURE", "SHOW_IS_FILE_CACHED_SUCCESS", "SIZE_KB", "SOURCE", "SOURCE_GET_TOKEN_API", "SOURCE_INIT_API", "SOURCE_LOAD_API", "SOURCE_PUBLIC_API", "SOURCE_SHOW_API", "STATE", "SYNC", "SYSTEM_CRONET_ENGINE_ERROR", "SYSTEM_CRONET_FAILURE", "SYSTEM_CRONET_INSTALL_ERROR", "SYSTEM_CRONET_SUCCESS", "SYSTEM_CRONET_TIMEOUT", "TEST_MODE", "URL", "WEBVIEW_COULD_NOT_HANDLE_INTERCEPTED_URL", "WEBVIEW_ERROR", "WEBVIEW_ERROR_CODE", "WEBVIEW_INVOCATION", "WEBVIEW_INVOCATION_ERROR", "WEBVIEW_LESS", "WEBVIEW_LESS_AD_ACTIVITY_LAUNCHED", "WEBVIEW_LESS_AD_DISPLAY_STARTED", "WEBVIEW_LESS_ASSET_CACHE_FAIL", "WEBVIEW_LESS_ASSET_CACHE_TIMEOUT", "WEBVIEW_LESS_SHOW_STARTED", "WEBVIEW_URL", "getTmpAdObjectForEventSending", "Lcom/unity3d/ads/core/data/model/AdObject;", "opportunityId", "Lcom/google/protobuf/ByteString;", "placement", HandleInvocationsFromAdViewer.KEY_IS_HEADER_BIDDING, "", HandleInvocationsFromAdViewer.KEY_LOAD_OPTIONS, "Lcom/unity3d/ads/UnityAdsLoadOptions;", "adType", "Lgatewayprotocol/v1/DiagnosticEventRequestOuterClass$DiagnosticAdType;", "isScarAd", "NoScopeCoroutineScope", "unity-ads_defaultRelease"}, k = 1, mv = {1, 8, 0}, xi = DiagnosticEventRequestOuterClass.DiagnosticEventType.DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_QUALITY_INIT_STARTED_VALUE)
    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();
        public static final String APP_ACTIVE = "app_active";
        public static final String ATTEMPT_INSERT_NULL_DIAGNOSTIC_EVENT = "attempt_insert_null_diagnostic_event";
        public static final String AWAITED_INIT = "awaited_init";
        public static final String BANNER_DESTROYED = "native_banner_destroyed";
        public static final String BRIDGE_SEND_EVENT_FAILED = "bridge_send_event_failed";
        public static final String CACHE_SOURCE = "cache_source";
        public static final String COMPLETE_STATE = "complete_state";
        public static final String COROUTINE_NAME = "coroutine_name";
        public static final String GAME_ID = "game_id";
        public static final String IMPRESSION_OPPORTUNITY_ID = "impressionOpportunityId";
        public static final String INIT_GAME_ID_CHANGED = "native_initialize_game_id_changed";
        public static final String INIT_GAME_ID_SAME = "native_initialize_game_id_same";
        public static final String INIT_MISSED_NATIVE_PARSING = "native_initialize_missed_native_parsing";
        public static final String INIT_TEST_MODE_CHANGED = "native_initialize_test_mode_changed";
        public static final String INIT_TEST_MODE_SAME = "native_initialize_test_mode_same";
        public static final String INSTALL_REFERRAL_FETCH_COMPLETED = "install_referral_fetch_completed";
        public static final String INSTALL_REFERRAL_FETCH_FAILED = "install_referral_fetch_failed";
        public static final String INSTALL_REFERRAL_FETCH_TIMED_OUT = "install_referral_fetch_timed_out";
        public static final String IS_RETRY = "is_retry";
        public static final String KOTLIN_VERSION = "kotlin_version";
        public static final String LOAD_CONFIG_FAILURE_TIME = "native_load_config_failure_time";
        public static final String LOAD_CONFIG_SUCCESS_TIME = "native_load_config_success_time";
        public static final String NETWORK_CLIENT = "network_client";
        public static final String NETWORK_FAILURE = "native_network_failure_time";
        public static final String NETWORK_PARSE = "native_network_parse_failure";
        public static final String NEW_API = "new_api";
        public static final String NULL_DIAGNOSTIC_EVENT = "null_diagnostic_event";
        public static final String OM_ACTIVATE_FAILURE = "om_activate_failure_time";
        public static final String OM_ACTIVATE_STARTED = "om_activate_started";
        public static final String OM_ACTIVATE_SUCCESS = "om_activate_success_time";
        public static final String OM_IMPRESSION_OCCURRED_FAILURE = "om_impression_occurred_failure";
        public static final String OM_IMPRESSION_OCCURRED_SUCCESS = "om_impression_occurred_success";
        public static final String OM_SESSION_FINISH_FAILURE = "om_session_finish_failure";
        public static final String OM_SESSION_FINISH_SUCCESS = "om_session_finish_success";
        public static final String OM_SESSION_START_FAILURE = "om_session_start_failure";
        public static final String OM_SESSION_START_SUCCESS = "om_session_start_success";
        public static final String OPERATION = "operation";
        public static final String PREVIOUS_GAME_ID = "previous_game_id";
        public static final String PREVIOUS_TEST_MODE = "previous_test_mode";
        public static final String PROTOCOL = "protocol";
        public static final String REASON = "reason";
        public static final String REASON_AD_MARKUP_PARSE = "invalid_admarkup";
        public static final String REASON_AD_OBJECT_EXPIRED = "ad_object_expired";
        public static final String REASON_AD_OBJECT_NOT_FOUND = "ad_object_not_found";
        public static final String REASON_AD_PLAYER_SCOPE = "ad_player_scope_not_active";
        public static final String REASON_AD_VIEWER = "adviewer";
        public static final String REASON_ALREADY_SHOWING = "already_showing";
        public static final String REASON_CODE = "reason_code";
        public static final String REASON_DEBUG = "reason_debug";
        public static final String REASON_GATEWAY = "gateway";
        public static final String REASON_INVALID_ENTRY_POINT = "invalid_url";
        public static final String REASON_INVALID_GAME_ID = "invalid_game_id";
        public static final String REASON_LISTENER_NULL = "listener_null";
        public static final String REASON_NETWORK = "network";
        public static final String REASON_NOT_INITIALIZED = "not_initialized";
        public static final String REASON_NO_FILL = "no_fill";
        public static final String REASON_NO_WEBVIEW_ENTRY_POINT = "no_webview_entry_point";
        public static final String REASON_OM_ALREADY_ACTIVE = "om_already_active";
        public static final String REASON_OM_CREATIVE_TYPE_INVALID = "om_creative_type_invalid";
        public static final String REASON_OM_CREATIVE_TYPE_NULL = "om_creative_type_null";
        public static final String REASON_OM_NOT_ACTIVE = "om_not_active";
        public static final String REASON_OM_SESSION_ALREADY_EXISTS = "om_session_already_exists";
        public static final String REASON_OM_SESSION_NOT_FOUND = "om_session_not_found";
        public static final String REASON_OPPORTUNITY_ID = "no_opportunity_id";
        public static final String REASON_OPPORTUNITY_USED = "opportunity_id_used";
        public static final String REASON_PLACEMENT_NOT_LOADED = "placement_not_loaded";
        public static final String REASON_PLACEMENT_NULL = "placement_null";
        public static final String REASON_PLACEMENT_VALIDATION = "placement_validation";
        public static final String REASON_PROTOBUF_PARSING = "protobuf_parsing";
        public static final String REASON_TIMEOUT = "timeout";
        public static final String REASON_TIMEOUT_INITIALIZATION = "timeout_initialization";
        public static final String REASON_UNCAUGHT_EXCEPTION = "uncaught_exception";
        public static final String REASON_UNKNOWN = "unknown";
        public static final String REASON_WEBVIEWLESS_AD_NOT_FOUND = "webviewless_ad_not_found";
        public static final String REASON_WEBVIEW_LESS_SHOW_FAIL = "webview_less_show_fail";
        public static final String RETRIES = "retries";
        public static final String SAME_SESSION = "same_session";
        public static final String SCAR_SIGNALS_COLLECTION_FAILURE = "native_scar_signals_collection_failure_time";
        public static final String SCAR_SIGNALS_COLLECTION_STARTED = "native_scar_signals_collection_started";
        public static final String SCAR_SIGNALS_COLLECTION_SUCCESS = "native_scar_signals_collection_success_time";
        public static final String SCAR_SIGNALS_UPLOAD_FAILURE = "native_scar_signals_upload_failure_time";
        public static final String SCAR_SIGNALS_UPLOAD_STARTED = "native_scar_signals_upload_started";
        public static final String SCAR_SIGNALS_UPLOAD_SUCCESS = "native_scar_signals_upload_success_time";
        public static final String SCAR_VIDEO_LENGTH_IN_SEC = "native_scar_video_length_in_sec";
        public static final String SHOW_ACTIVITY_NOT_AVAILABLE = "native_show_activity_not_available";
        public static final String SHOW_AD_VIEWER_FULLSCREEN = "native_show_ad_viewer_fullscreen";
        public static final String SHOW_CANCEL_TIMEOUT = "native_show_cancel_timeout";
        public static final String SHOW_IS_FILE_CACHED_FAILURE = "native_show_is_file_cached_failure_time";
        public static final String SHOW_IS_FILE_CACHED_SUCCESS = "native_show_is_file_cached_success_time";
        public static final String SIZE_KB = "size_kb";
        public static final String SOURCE = "source";
        public static final String SOURCE_GET_TOKEN_API = "get_token";
        public static final String SOURCE_INIT_API = "init";
        public static final String SOURCE_LOAD_API = "load";
        public static final String SOURCE_PUBLIC_API = "api";
        public static final String SOURCE_SHOW_API = "show";
        public static final String STATE = "state";
        public static final String SYNC = "sync";
        public static final String SYSTEM_CRONET_ENGINE_ERROR = "native_cronet_engine_error";
        public static final String SYSTEM_CRONET_FAILURE = "native_cronet_failure_time";
        public static final String SYSTEM_CRONET_INSTALL_ERROR = "native_cronet_install_error";
        public static final String SYSTEM_CRONET_SUCCESS = "native_cronet_success_time";
        public static final String SYSTEM_CRONET_TIMEOUT = "native_cronet_timeout";
        public static final String TEST_MODE = "test_mode";
        public static final String URL = "url";
        public static final String WEBVIEW_COULD_NOT_HANDLE_INTERCEPTED_URL = "webview_could_not_handle_intercepted_url";
        public static final String WEBVIEW_ERROR = "webview_error";
        public static final String WEBVIEW_ERROR_CODE = "webview_error_code";
        public static final String WEBVIEW_INVOCATION = "webview_invocation";
        public static final String WEBVIEW_INVOCATION_ERROR = "native_webview_invocation_error";
        public static final String WEBVIEW_LESS = "webviewless";
        public static final String WEBVIEW_LESS_AD_ACTIVITY_LAUNCHED = "native_webview_less_ad_activity_launched";
        public static final String WEBVIEW_LESS_AD_DISPLAY_STARTED = "native_webview_less_ad_display_started";
        public static final String WEBVIEW_LESS_ASSET_CACHE_FAIL = "native_webview_less_asset_cache_fail";
        public static final String WEBVIEW_LESS_ASSET_CACHE_TIMEOUT = "native_webview_less_asset_cache_timeout";
        public static final String WEBVIEW_LESS_SHOW_STARTED = "native_webview_less_show_started";
        public static final String WEBVIEW_URL = "webview_url";

        /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
        @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bÂ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0007\u001a\u00020\u00048VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006¨\u0006\b"}, d2 = {"Lcom/unity3d/ads/core/domain/SendDiagnosticEvent$Companion$NoScopeCoroutineScope;", "Lcn/a0;", "<init>", "()V", "Lak/k;", "getCoroutineContext", "()Lak/k;", "coroutineContext", "unity-ads_defaultRelease"}, k = 1, mv = {1, 8, 0}, xi = DiagnosticEventRequestOuterClass.DiagnosticEventType.DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_QUALITY_INIT_STARTED_VALUE)
        public static final class NoScopeCoroutineScope implements a0 {
            public static final NoScopeCoroutineScope INSTANCE = new NoScopeCoroutineScope();

            private NoScopeCoroutineScope() {
            }

            @Override // cn.a0
            public k getCoroutineContext() {
                throw new IllegalStateException("Scope access not allowed for temporary diagnostic AdObjects");
            }
        }

        private Companion() {
        }

        public static /* synthetic */ AdObject getTmpAdObjectForEventSending$default(Companion companion, ByteString byteString, String str, boolean z10, UnityAdsLoadOptions unityAdsLoadOptions, DiagnosticEventRequestOuterClass.DiagnosticAdType diagnosticAdType, boolean z11, int i10, Object obj) {
            if ((i10 & 4) != 0) {
                z10 = false;
            }
            if ((i10 & 8) != 0) {
                unityAdsLoadOptions = new UnityAdsLoadOptions();
            }
            if ((i10 & 16) != 0) {
                diagnosticAdType = DiagnosticEventRequestOuterClass.DiagnosticAdType.DIAGNOSTIC_AD_TYPE_UNSPECIFIED;
            }
            if ((i10 & 32) != 0) {
                z11 = false;
            }
            return companion.getTmpAdObjectForEventSending(byteString, str, z10, unityAdsLoadOptions, diagnosticAdType, z11);
        }

        public final AdObject getTmpAdObjectForEventSending(ByteString opportunityId, String placement, boolean isHeaderBidding, UnityAdsLoadOptions loadOptions, DiagnosticEventRequestOuterClass.DiagnosticAdType adType, boolean isScarAd) {
            n.f(opportunityId, "opportunityId");
            n.f(loadOptions, "loadOptions");
            n.f(adType, "adType");
            String str = placement == null ? "" : placement;
            ByteString EMPTY = ByteString.EMPTY;
            NoScopeCoroutineScope noScopeCoroutineScope = NoScopeCoroutineScope.INSTANCE;
            n.e(EMPTY, "EMPTY");
            return new AdObject(noScopeCoroutineScope, opportunityId, str, EMPTY, isScarAd, null, null, null, false, null, null, null, loadOptions, isHeaderBidding, adType, null, null, null, null, null, null, 2067424, null);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = DiagnosticEventRequestOuterClass.DiagnosticEventType.DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_QUALITY_INIT_STARTED_VALUE)
    public static final class DefaultImpls {
        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ void invoke$default(SendDiagnosticEvent sendDiagnosticEvent, String str, Double d10, Map map, Map map2, AdObject adObject, Integer num, int i10, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: invoke");
            }
            if ((i10 & 2) != 0) {
                d10 = null;
            }
            if ((i10 & 4) != 0) {
                map = null;
            }
            if ((i10 & 8) != 0) {
                map2 = null;
            }
            if ((i10 & 16) != 0) {
                adObject = null;
            }
            if ((i10 & 32) != 0) {
                num = null;
            }
            sendDiagnosticEvent.invoke(str, d10, (Map<String, String>) map, (Map<String, Integer>) map2, adObject, num);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ void invoke$default(SendDiagnosticEvent sendDiagnosticEvent, DiagnosticEventRequestOuterClass.DiagnosticEventType diagnosticEventType, Double d10, Map map, Map map2, AdObject adObject, Integer num, int i10, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: invoke");
            }
            if ((i10 & 2) != 0) {
                d10 = null;
            }
            if ((i10 & 4) != 0) {
                map = null;
            }
            if ((i10 & 8) != 0) {
                map2 = null;
            }
            if ((i10 & 16) != 0) {
                adObject = null;
            }
            if ((i10 & 32) != 0) {
                num = null;
            }
            sendDiagnosticEvent.invoke(diagnosticEventType, d10, (Map<String, String>) map, (Map<String, Integer>) map2, adObject, num);
        }
    }

    void invoke(DiagnosticEventRequestOuterClass.DiagnosticEventType event, Double value, Map<String, String> tags, Map<String, Integer> intTags, AdObject adObject, Integer tokenNumber);

    void invoke(String event, Double value, Map<String, String> tags, Map<String, Integer> intTags, AdObject adObject, Integer tokenNumber);
}
