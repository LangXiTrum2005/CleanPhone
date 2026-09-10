package com.kochava.tracker;

/* JADX INFO: loaded from: classes5.dex */
public final class BuildConfig {
    public static final String BUILD_TYPE = "release";
    public static final boolean DEBUG = false;
    public static final String LIBRARY_PACKAGE_NAME = "com.kochava.tracker";
    public static final String PROFILE_CLICKS_QUEUE_NAME = "com.kochava.tracker.tracker.profile.clicks_queue";
    public static final String PROFILE_EVENTS_QUEUE_NAME = "com.kochava.tracker.tracker.profile.events_queue";
    public static final String PROFILE_IDENTITYLINK_QUEUE_NAME = "com.kochava.tracker.tracker.profile.identitylink_queue";
    public static final String PROFILE_NAME = "com.kochava.tracker.tracker.profile";
    public static final int PROFILE_QUEUE_MAX_COUNT = 100;
    public static final String PROFILE_SESSION_QUEUE_NAME = "com.kochava.tracker.tracker.profile.session_queue";
    public static final String PROFILE_TOKEN_QUEUE_NAME = "com.kochava.tracker.tracker.profile.token_queue";
    public static final String PROFILE_UPDATES_QUEUE_NAME = "com.kochava.tracker.tracker.profile.updates_queue";
    public static final long SDK_BUILD_TIME_MILLIS = 1678745715444L;
    public static final String SDK_COMPANY = "KVA";
    public static final String SDK_DEPENDENCIES = "[{\"name\":\"AndroidXCore\",\"path\":\"androidx.core.app.NotificationManagerCompat\"},{\"name\":\"GoogleAdsIdentifier\",\"path\":\"com.google.android.gms.ads.identifier.AdvertisingIdClient\"},{\"name\":\"GoogleInstallReferrer\",\"path\":\"com.android.installreferrer.api.InstallReferrerClient\"},{\"name\":\"GoogleAppSetID\",\"path\":\"com.google.android.gms.appset.AppSet\"},{\"name\":\"HuaweiAdsIdentifier\",\"path\":\"com.huawei.hms.ads.identifier.AdvertisingIdClient\"},{\"name\":\"HuaweiInstallReferrer\",\"path\":\"com.huawei.hms.ads.installreferrer.api.InstallReferrerClient\"},{\"name\":\"SamsungInstallReferrer\",\"path\":\"com.samsung.android.sdk.sinstallreferrer.api.InstallReferrerClient\"}]";
    public static final int SDK_ENGAGEMENT_PUSH_MAX_HISTORY = 5;
    public static final int SDK_MAX_IDENTITIES = 100;
    public static final String SDK_MODULE_NAME = "Tracker";
    public static final String SDK_NAME = "AndroidTracker";
    public static final String SDK_PERMISSIONS = "[{\"name\":\"AccessNetworkState\",\"path\":\"android.permission.ACCESS_NETWORK_STATE\"}]";
    public static final String SDK_PROTOCOL = "18";
    public static final int SDK_TRUNCATE_LENGTH = 128;
    public static final String SDK_VERSION = "4.3.0";
    public static final String SDK_VERSION_DECLARATION = "!SDK-VERSION-STRING!:com.kochava.tracker:tracker:release:4.3.0";
    public static final int TRACKER_QUEUE_MAX_COUNT = 100;
    public static final String URL_EVENT = "https://control.kochava.com/track/json";
    public static final String URL_GET_ATTRIBUTION = "https://control.kochava.com/track/kvquery";
    public static final String URL_IDENTITY_LINK = "https://control.kochava.com/track/json";
    public static final String URL_INIT = "https://kvinit-prod.api.kochava.com/track/kvinit";
    public static final String URL_INIT_ROTATION = "{\"type_id\":\"init\",\"variations\":[{\"start_ymd\":\"20220101\",\"urls\":[\"https://kvinit-prod.api.kochava.com/track/kvinit\",\"https://int.dewrain.life/track/kvinit\",\"https://int.vaicore.site/track/kvinit\",\"https://int.akisinn.info/track/kvinit\",\"https://int.dewrain.site/track/kvinit\",\"https://int.akisinn.site/track/kvinit\",\"https://int.vaicore.xyz/track/kvinit\",\"https://int.vaicore.store/track/kvinit\",\"https://int.dewrain.world/track/kvinit\"]},{\"start_ymd\":\"20250101\",\"urls\":[\"https://kvinit-prod.api.kochava.com/track/kvinit\"]}]}";
    public static final String URL_INSTALL = "https://control.kochava.com/track/json";
    public static final String URL_PUSH_TOKEN_ADD = "https://token.api.kochava.com/token/add";
    public static final String URL_PUSH_TOKEN_REMOVE = "https://token.api.kochava.com/token/remove";
    public static final String URL_SESSION_BEGIN = "https://control.kochava.com/track/json";
    public static final String URL_SESSION_END = "https://control.kochava.com/track/json";
    public static final String URL_SMARTLINK = "https://smart.link/v1/links-sdk";
    public static final String URL_UPDATE = "https://control.kochava.com/track/json";
}
