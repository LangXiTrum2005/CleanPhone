package s4;

import java.util.regex.Pattern;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public abstract class m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final b f50115a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final b f50116b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final b f50117c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final b f50118d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final b f50119e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final b f50120f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final l f50121g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final b f50122h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final b f50123i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final b f50124j;

    static {
        new b("VISUAL_STATE_CALLBACK", "VISUAL_STATE_CALLBACK", 0);
        new b("OFF_SCREEN_PRERASTER", "OFF_SCREEN_PRERASTER", 0);
        new b("SAFE_BROWSING_ENABLE", "SAFE_BROWSING_ENABLE", 3);
        new b("DISABLED_ACTION_MODE_MENU_ITEMS", "DISABLED_ACTION_MODE_MENU_ITEMS", 1);
        new b("START_SAFE_BROWSING", "START_SAFE_BROWSING", 4);
        new b("SAFE_BROWSING_WHITELIST", "SAFE_BROWSING_WHITELIST", 4);
        new b("SAFE_BROWSING_WHITELIST", "SAFE_BROWSING_ALLOWLIST", 4);
        new b("SAFE_BROWSING_ALLOWLIST", "SAFE_BROWSING_WHITELIST", 4);
        new b("SAFE_BROWSING_ALLOWLIST", "SAFE_BROWSING_ALLOWLIST", 4);
        new b("SAFE_BROWSING_PRIVACY_POLICY_URL", "SAFE_BROWSING_PRIVACY_POLICY_URL", 4);
        new b("SERVICE_WORKER_BASIC_USAGE", "SERVICE_WORKER_BASIC_USAGE", 1);
        new b("SERVICE_WORKER_CACHE_MODE", "SERVICE_WORKER_CACHE_MODE", 1);
        new b("SERVICE_WORKER_CONTENT_ACCESS", "SERVICE_WORKER_CONTENT_ACCESS", 1);
        new b("SERVICE_WORKER_FILE_ACCESS", "SERVICE_WORKER_FILE_ACCESS", 1);
        new b("SERVICE_WORKER_BLOCK_NETWORK_LOADS", "SERVICE_WORKER_BLOCK_NETWORK_LOADS", 1);
        new b("SERVICE_WORKER_SHOULD_INTERCEPT_REQUEST", "SERVICE_WORKER_SHOULD_INTERCEPT_REQUEST", 1);
        new b("RECEIVE_WEB_RESOURCE_ERROR", "RECEIVE_WEB_RESOURCE_ERROR", 0);
        new b("RECEIVE_HTTP_ERROR", "RECEIVE_HTTP_ERROR", 0);
        new b("SHOULD_OVERRIDE_WITH_REDIRECTS", "SHOULD_OVERRIDE_WITH_REDIRECTS", 1);
        new b("SAFE_BROWSING_HIT", "SAFE_BROWSING_HIT", 4);
        new b("WEB_RESOURCE_REQUEST_IS_REDIRECT", "WEB_RESOURCE_REQUEST_IS_REDIRECT", 1);
        new b("WEB_RESOURCE_ERROR_GET_DESCRIPTION", "WEB_RESOURCE_ERROR_GET_DESCRIPTION", 0);
        new b("WEB_RESOURCE_ERROR_GET_CODE", "WEB_RESOURCE_ERROR_GET_CODE", 0);
        new b("SAFE_BROWSING_RESPONSE_BACK_TO_SAFETY", "SAFE_BROWSING_RESPONSE_BACK_TO_SAFETY", 4);
        new b("SAFE_BROWSING_RESPONSE_PROCEED", "SAFE_BROWSING_RESPONSE_PROCEED", 4);
        f50115a = new b("SAFE_BROWSING_RESPONSE_SHOW_INTERSTITIAL", "SAFE_BROWSING_RESPONSE_SHOW_INTERSTITIAL", 4);
        new b("WEB_MESSAGE_PORT_POST_MESSAGE", "WEB_MESSAGE_PORT_POST_MESSAGE", 0);
        new b("WEB_MESSAGE_PORT_CLOSE", "WEB_MESSAGE_PORT_CLOSE", 0);
        f50116b = new b("WEB_MESSAGE_ARRAY_BUFFER", "WEB_MESSAGE_ARRAY_BUFFER", 2);
        new b("WEB_MESSAGE_PORT_SET_MESSAGE_CALLBACK", "WEB_MESSAGE_PORT_SET_MESSAGE_CALLBACK", 0);
        new b("CREATE_WEB_MESSAGE_CHANNEL", "CREATE_WEB_MESSAGE_CHANNEL", 0);
        new b("POST_WEB_MESSAGE", "POST_WEB_MESSAGE", 0);
        new b("WEB_MESSAGE_CALLBACK_ON_MESSAGE", "WEB_MESSAGE_CALLBACK_ON_MESSAGE", 0);
        new b("GET_WEB_VIEW_CLIENT", "GET_WEB_VIEW_CLIENT", 3);
        new b("GET_WEB_CHROME_CLIENT", "GET_WEB_CHROME_CLIENT", 3);
        new b("GET_WEB_VIEW_RENDERER", "GET_WEB_VIEW_RENDERER", 6);
        new b("WEB_VIEW_RENDERER_TERMINATE", "WEB_VIEW_RENDERER_TERMINATE", 6);
        new b("TRACING_CONTROLLER_BASIC_USAGE", "TRACING_CONTROLLER_BASIC_USAGE", 5);
        new h();
        new h();
        new h();
        new b("WEB_VIEW_RENDERER_CLIENT_BASIC_USAGE", "WEB_VIEW_RENDERER_CLIENT_BASIC_USAGE", 6);
        new b("ALGORITHMIC_DARKENING", "ALGORITHMIC_DARKENING", 7);
        Pattern.compile("\\A\\d+");
        new b("PROXY_OVERRIDE", "PROXY_OVERRIDE:3", 2);
        f50117c = new b("MULTI_PROCESS", "MULTI_PROCESS_QUERY", 2);
        new b("FORCE_DARK", "FORCE_DARK", 6);
        new b("FORCE_DARK_STRATEGY", "FORCE_DARK_BEHAVIOR", 2);
        f50118d = new b("WEB_MESSAGE_LISTENER", "WEB_MESSAGE_LISTENER", 2);
        f50119e = new b("DOCUMENT_START_SCRIPT", "DOCUMENT_START_SCRIPT:1", 2);
        new b("PROXY_OVERRIDE_REVERSE_BYPASS", "PROXY_OVERRIDE_REVERSE_BYPASS", 2);
        f50120f = new b("GET_VARIATIONS_HEADER", "GET_VARIATIONS_HEADER", 2);
        new b("ENTERPRISE_AUTHENTICATION_APP_LINK_POLICY", "ENTERPRISE_AUTHENTICATION_APP_LINK_POLICY", 2);
        new b("GET_COOKIE_INFO", "GET_COOKIE_INFO", 2);
        new b("REQUESTED_WITH_HEADER_ALLOW_LIST", "REQUESTED_WITH_HEADER_ALLOW_LIST", 2);
        new b("USER_AGENT_METADATA", "USER_AGENT_METADATA", 2);
        new l("USER_AGENT_METADATA_FORM_FACTORS", "USER_AGENT_METADATA", 0);
        f50121g = new l("MULTI_PROFILE", "MULTI_PROFILE", 1);
        new b("ATTRIBUTION_REGISTRATION_BEHAVIOR", "ATTRIBUTION_BEHAVIOR", 2);
        new b("WEBVIEW_MEDIA_INTEGRITY_API_STATUS", "WEBVIEW_INTEGRITY_API_STATUS", 2);
        f50122h = new b("MUTE_AUDIO", "MUTE_AUDIO", 2);
        new b("WEB_AUTHENTICATION", "WEB_AUTHENTICATION", 2);
        new b("SPECULATIVE_LOADING_STATUS", "SPECULATIVE_LOADING", 2);
        new b("BACK_FORWARD_CACHE", "BACK_FORWARD_CACHE", 2);
        new b("BACK_FORWARD_CACHE_SETTINGS", "BACK_FORWARD_CACHE_SETTINGS", 2);
        new b("DELETE_BROWSING_DATA", "WEB_STORAGE_DELETE_BROWSING_DATA", 2);
        new l("PREFETCH_URL_V5", "PREFETCH_URL_V5", 2);
        new b("IMPLEMENTATION_ONLY_FEATURE", "ASYNC_WEBVIEW_STARTUP", 2);
        new b("IMPLEMENTATION_ONLY_FEATURE", "ASYNC_WEBVIEW_STARTUP_ASYNC_STARTUP_LOCATIONS", 2);
        new b("DEFAULT_TRAFFICSTATS_TAGGING", "DEFAULT_TRAFFICSTATS_TAGGING", 2);
        new b("PRERENDER_URL_V2", "PRERENDER_URL_V3", 2);
        new b("SPECULATIVE_LOADING_CONFIG_V2", "SPECULATIVE_LOADING_CONFIG_V2", 2);
        new b("SAVE_STATE", "SAVE_STATE", 2);
        new b("WEB_VIEW_NAVIGATION_CLIENT_BASIC_USAGE", "WEB_VIEW_NAVIGATION_CLIENT_BASIC_USAGE", 2);
        new b("NAVIGATION_LISTENER_V1", "WEB_VIEW_NAVIGATION_LISTENER_V1", 2);
        f50123i = new b("PROVIDER_WEAKLY_REF_WEBVIEW", "PROVIDER_WEAKLY_REF_WEBVIEW", 2);
        f50124j = new b("PAYMENT_REQUEST", "PAYMENT_REQUEST", 2);
        new b("WEBVIEW_BUILDER_EXPERIMENTAL_V1", "WEBVIEW_BUILDER_V1", 2);
        new b("COOKIE_INTERCEPT", "COOKIE_INTERCEPT", 2);
        new b("WARM_UP_RENDERER_PROCESS", "WARM_UP_RENDERER_PROCESS", 2);
        new b("ORIGIN_MATCHED_HEADERS", "EXTRA_HEADER_FOR_ORIGINS", 2);
        new b("CUSTOM_REQUEST_HEADERS", "CUSTOM_REQUEST_HEADERS", 2);
        new h();
        new h();
        new h();
        new b("PRECONNECT", "PRECONNECT", 2);
        new b("ADD_QUIC_HINTS", "ADD_QUIC_HINTS_V1", 2);
        new b("HYPERLINK_CONTEXT_MENU_ITEMS", "HYPERLINK_CONTEXT_MENU_ITEMS", 2);
    }

    public static UnsupportedOperationException a() {
        return new UnsupportedOperationException("This method is not supported by the current version of the framework and the current WebView APK");
    }
}
