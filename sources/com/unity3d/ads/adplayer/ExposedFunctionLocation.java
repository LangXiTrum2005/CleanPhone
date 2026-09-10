package com.unity3d.ads.adplayer;

import gatewayprotocol.v1.DiagnosticEventRequestOuterClass;
import java.util.Set;
import kotlin.Metadata;
import xj.k;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\"\n\u0002\b<\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u0017\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00040\r¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u000e\u0010\u0010\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0017\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0018\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0019\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u001a\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u001b\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u001c\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u001d\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u001e\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u001f\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010 \u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010!\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\"\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010#\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010$\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010%\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010&\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010'\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010(\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u0017\u0010)\u001a\b\u0012\u0004\u0012\u00020\u00040\r¢\u0006\b\n\u0000\u001a\u0004\b*\u0010\u000fR\u000e\u0010+\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010,\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010-\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010.\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010/\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u00100\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u00101\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u00102\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u00103\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u00104\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u00105\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u00106\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u00107\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u00108\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u00109\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010:\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010;\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010<\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010=\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010>\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010?\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010@\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010A\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010B\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010C\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010D\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010E\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010F\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010G\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010H\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000¨\u0006I"}, d2 = {"Lcom/unity3d/ads/adplayer/ExposedFunctionLocation;", "", "()V", "ATTRIBUTION_REGISTER_CLICK", "", "ATTRIBUTION_REGISTER_VIEW", "BROADCAST_EVENT", "CANCEL_SHOW_TIMEOUT", "CLICKED", "COMPLETED", "DOWNLOAD", "DOWNLOAD_WITH_PROGRESS", "EVENT_LOCATIONS", "", "getEVENT_LOCATIONS", "()Ljava/util/Set;", "FAILED", "GET_AD_CONTEXT", "GET_ALLOWED_PII", "GET_CONNECTION_TYPE", "GET_DEVICE_MAX_VOLUME", "GET_DEVICE_VOLUME", "GET_EXTRA", "GET_PRIVACY", "GET_PRIVACY_FSM", "GET_SCREEN_HEIGHT", "GET_SCREEN_WIDTH", "GET_SESSION_TOKEN", "HEADER_BIDDING_TOKEN_INCREMENT_STARTS", "HEADER_BIDDING_TOKEN_INCREMENT_WINS", "HEADER_BIDDING_TOKEN_RESET", "INCREMENT_BANNER_IMPRESSION_COUNT", "IS_ATTRIBUTION_AVAILABLE", "IS_FILE_CACHED", "IS_OFFERWALL_AD_READY", "LEFT_APPLICATION", "LOAD_COMPLETE", "LOAD_ERROR", "LOAD_OFFERWALL_AD", "LOAD_SCAR_AD", "MARK_CAMPAIGN_STATE_SHOWN", "NON_CANCELLABLE_LOCATIONS", "getNON_CANCELLABLE_LOCATIONS", "OM_FINISH_SESSION", "OM_GET_DATA", "OM_IMPRESSION", "OM_START_SESSION", "OPEN_URL", "RECEIVED_REWARD", "REFRESH_AD_DATA", "REQUEST_GET", "REQUEST_HEAD", "REQUEST_POST", "SEND_DIAGNOSTIC_EVENT", "SEND_OPERATIVE_EVENT", "SEND_PRIVACY_UPDATE_REQUEST", "SET_ALLOWED_PII", "SET_OPPORTUNITY_TTL", "SET_ORIENTATION", "SET_PRIVACY", "SET_PRIVACY_FSM", "SHOW_OFFERWALL_AD", "SHOW_SCAR_AD", "STARTED", "STORAGE_CLEAR", "STORAGE_DELETE", "STORAGE_GET", "STORAGE_GET_KEYS", "STORAGE_READ", "STORAGE_SET", "STORAGE_WRITE", "UPDATE_CAMPAIGN_STATE", "UPDATE_TRACKING_TOKEN", "unity-ads_defaultRelease"}, k = 1, mv = {1, 8, 0}, xi = DiagnosticEventRequestOuterClass.DiagnosticEventType.DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_QUALITY_INIT_STARTED_VALUE)
public final class ExposedFunctionLocation {
    public static final String ATTRIBUTION_REGISTER_CLICK = "com.unity3d.services.ads.api.AdViewer.attributionRegisterClick";
    public static final String ATTRIBUTION_REGISTER_VIEW = "com.unity3d.services.ads.api.AdViewer.attributionRegisterView";
    public static final String DOWNLOAD = "com.unity3d.services.ads.api.AdViewer.download";
    public static final String DOWNLOAD_WITH_PROGRESS = "com.unity3d.services.ads.api.AdViewer.downloadWithProgress";
    public static final String GET_AD_CONTEXT = "com.unity3d.services.ads.api.AdViewer.getAdContext";
    public static final String GET_ALLOWED_PII = "com.unity3d.services.ads.api.AdViewer.getPrivacyAllowedPii";
    public static final String GET_CONNECTION_TYPE = "com.unity3d.services.core.api.DeviceInfo.getConnectionType";
    public static final String GET_DEVICE_MAX_VOLUME = "com.unity3d.services.core.api.DeviceInfo.getDeviceMaxVolume";
    public static final String GET_DEVICE_VOLUME = "com.unity3d.services.core.api.DeviceInfo.getDeviceVolume";
    public static final String GET_EXTRA = "com.unity3d.services.ads.api.AdViewer.getExtra";
    public static final String GET_PRIVACY = "com.unity3d.services.ads.api.AdViewer.getPrivacyPayload";
    public static final String GET_PRIVACY_FSM = "com.unity3d.services.ads.api.AdViewer.getPrivacyFsm";
    public static final String GET_SCREEN_HEIGHT = "com.unity3d.services.core.api.DeviceInfo.getScreenHeight";
    public static final String GET_SCREEN_WIDTH = "com.unity3d.services.core.api.DeviceInfo.getScreenWidth";
    public static final String GET_SESSION_TOKEN = "com.unity3d.services.ads.api.AdViewer.getSessionToken";
    public static final String HEADER_BIDDING_TOKEN_INCREMENT_STARTS = "com.unity3d.services.ads.api.AdViewer.hbTokenIncrementStarts";
    public static final String HEADER_BIDDING_TOKEN_INCREMENT_WINS = "com.unity3d.services.ads.api.AdViewer.hbTokenIncrementWins";
    public static final String HEADER_BIDDING_TOKEN_RESET = "com.unity3d.services.ads.api.AdViewer.hbTokenReset";
    public static final String INCREMENT_BANNER_IMPRESSION_COUNT = "com.unity3d.services.ads.api.AdViewer.incrementBannerImpressionCount";
    public static final String IS_ATTRIBUTION_AVAILABLE = "com.unity3d.services.ads.api.AdViewer.isAttributionAvailable";
    public static final String IS_FILE_CACHED = "com.unity3d.services.ads.api.AdViewer.isFileCached";
    public static final String IS_OFFERWALL_AD_READY = "com.unity3d.services.ads.api.AdViewer.isOfferwallAdReady";
    public static final String LOAD_OFFERWALL_AD = "com.unity3d.services.ads.api.AdViewer.loadOfferwallAd";
    public static final String LOAD_SCAR_AD = "com.unity3d.services.ads.api.AdViewer.loadScarAd";
    public static final String MARK_CAMPAIGN_STATE_SHOWN = "com.unity3d.services.ads.api.AdViewer.markCampaignStateAsShown";
    public static final String OM_FINISH_SESSION = "com.unity3d.services.ads.api.AdViewer.omidFinishSession";
    public static final String OM_GET_DATA = "com.unity3d.services.ads.api.AdViewer.omidGetData";
    public static final String OM_IMPRESSION = "com.unity3d.services.ads.api.AdViewer.omidImpression";
    public static final String OM_START_SESSION = "com.unity3d.services.ads.api.AdViewer.omidStartSession";
    public static final String OPEN_URL = "com.unity3d.services.ads.api.AdViewer.openUrl";
    public static final String REFRESH_AD_DATA = "com.unity3d.services.ads.api.AdViewer.refreshAdData";
    public static final String REQUEST_GET = "com.unity3d.services.core.api.Request.get";
    public static final String REQUEST_HEAD = "com.unity3d.services.core.api.Request.head";
    public static final String REQUEST_POST = "com.unity3d.services.core.api.Request.post";
    public static final String SEND_PRIVACY_UPDATE_REQUEST = "com.unity3d.services.ads.api.AdViewer.sendPrivacyUpdateRequest";
    public static final String SET_ALLOWED_PII = "com.unity3d.services.ads.api.AdViewer.setPrivacyAllowedPii";
    public static final String SET_OPPORTUNITY_TTL = "com.unity3d.services.ads.api.AdViewer.setOpportunityTTL";
    public static final String SET_ORIENTATION = "com.unity3d.services.ads.api.AdViewer.setOrientation";
    public static final String SET_PRIVACY = "com.unity3d.services.ads.api.AdViewer.setPrivacyPayload";
    public static final String SET_PRIVACY_FSM = "com.unity3d.services.ads.api.AdViewer.setPrivacyFsm";
    public static final String SHOW_OFFERWALL_AD = "com.unity3d.services.ads.api.AdViewer.showOfferwallAd";
    public static final String SHOW_SCAR_AD = "com.unity3d.services.ads.api.AdViewer.showScarAd";
    public static final String STORAGE_CLEAR = "com.unity3d.services.core.api.Storage.clear";
    public static final String STORAGE_DELETE = "com.unity3d.services.core.api.Storage.delete";
    public static final String STORAGE_GET = "com.unity3d.services.core.api.Storage.get";
    public static final String STORAGE_GET_KEYS = "com.unity3d.services.core.api.Storage.getKeys";
    public static final String STORAGE_READ = "com.unity3d.services.core.api.Storage.read";
    public static final String STORAGE_SET = "com.unity3d.services.core.api.Storage.set";
    public static final String STORAGE_WRITE = "com.unity3d.services.core.api.Storage.write";
    public static final String UPDATE_CAMPAIGN_STATE = "com.unity3d.services.ads.api.AdViewer.updateCampaignState";
    public static final String UPDATE_TRACKING_TOKEN = "com.unity3d.services.ads.api.AdViewer.updateTrackingToken";
    public static final ExposedFunctionLocation INSTANCE = new ExposedFunctionLocation();
    public static final String LOAD_COMPLETE = "com.unity3d.services.ads.api.AdViewer.loadComplete";
    public static final String LOAD_ERROR = "com.unity3d.services.ads.api.AdViewer.loadError";
    public static final String STARTED = "com.unity3d.services.ads.api.AdViewer.started";
    public static final String CLICKED = "com.unity3d.services.ads.api.AdViewer.clicked";
    public static final String RECEIVED_REWARD = "com.unity3d.services.ads.api.AdViewer.receivedReward";
    public static final String COMPLETED = "com.unity3d.services.ads.api.AdViewer.completed";
    public static final String FAILED = "com.unity3d.services.ads.api.AdViewer.failed";
    public static final String CANCEL_SHOW_TIMEOUT = "com.unity3d.services.ads.api.AdViewer.cancelShowTimeout";
    public static final String LEFT_APPLICATION = "com.unity3d.services.ads.api.AdViewer.leftApplication";
    public static final String BROADCAST_EVENT = "com.unity3d.services.ads.api.AdViewer.broadcastEvent";
    private static final Set<String> EVENT_LOCATIONS = k.E0(new String[]{LOAD_COMPLETE, LOAD_ERROR, STARTED, CLICKED, RECEIVED_REWARD, COMPLETED, FAILED, CANCEL_SHOW_TIMEOUT, LEFT_APPLICATION, BROADCAST_EVENT});
    public static final String SEND_OPERATIVE_EVENT = "com.unity3d.services.ads.api.AdViewer.sendOperativeEvent";
    public static final String SEND_DIAGNOSTIC_EVENT = "com.unity3d.services.ads.api.AdViewer.sendDiagnosticEvent";
    private static final Set<String> NON_CANCELLABLE_LOCATIONS = k.E0(new String[]{SEND_OPERATIVE_EVENT, SEND_DIAGNOSTIC_EVENT});

    private ExposedFunctionLocation() {
    }

    public final Set<String> getEVENT_LOCATIONS() {
        return EVENT_LOCATIONS;
    }

    public final Set<String> getNON_CANCELLABLE_LOCATIONS() {
        return NON_CANCELLABLE_LOCATIONS;
    }
}
