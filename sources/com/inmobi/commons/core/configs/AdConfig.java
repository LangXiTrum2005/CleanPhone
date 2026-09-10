package com.inmobi.commons.core.configs;

import android.graphics.Color;
import android.text.TextUtils;
import com.inmobi.media.B2;
import com.inmobi.media.C3151ne;
import com.inmobi.media.C3185q0;
import com.inmobi.media.D4;
import com.p004ironsource.x4;
import com.unity3d.services.UnityAdsConstants;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.collections.CollectionsKt;
import kotlin.collections.EmptyList;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000¸\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0016\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0010%\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b \b\u0007\u0018\u0000 ¢\u00012\u00020\u0001:0£\u0001¤\u0001¥\u0001¦\u0001§\u0001¨\u0001©\u0001ª\u0001«\u0001¬\u0001\u00ad\u0001®\u0001¯\u0001°\u0001±\u0001²\u0001³\u0001´\u0001µ\u0001¶\u0001·\u0001¸\u0001¹\u0001º\u0001B\u0011\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0006\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\f\u0010\rJ\r\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u000f\u0010\u0010J\u0015\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0011\u001a\u00020\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\r\u0010\u0016\u001a\u00020\u0015¢\u0006\u0004\b\u0016\u0010\u0017J\r\u0010\u0019\u001a\u00020\u0018¢\u0006\u0004\b\u0019\u0010\u001aJ\r\u0010\u001c\u001a\u00020\u001b¢\u0006\u0004\b\u001c\u0010\u001dJ\r\u0010\u001e\u001a\u00020\u000b¢\u0006\u0004\b\u001e\u0010\rJ\r\u0010 \u001a\u00020\u001f¢\u0006\u0004\b \u0010!J\r\u0010#\u001a\u00020\"¢\u0006\u0004\b#\u0010$R\u0016\u0010%\u001a\u00020\u000e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b%\u0010&R\"\u0010'\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b'\u0010(\u001a\u0004\b)\u0010\u0007\"\u0004\b*\u0010\u0005R\"\u0010+\u001a\u00020\u000b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b+\u0010,\u001a\u0004\b-\u0010\r\"\u0004\b.\u0010/R\"\u00100\u001a\u00020\u000b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b0\u0010,\u001a\u0004\b1\u0010\r\"\u0004\b2\u0010/R\"\u00103\u001a\u00020\u000b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b3\u0010,\u001a\u0004\b4\u0010\r\"\u0004\b5\u0010/R\"\u00106\u001a\u00020\u000b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b6\u0010,\u001a\u0004\b7\u0010\r\"\u0004\b8\u0010/R$\u0010:\u001a\u0004\u0018\u0001098\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b:\u0010;\u001a\u0004\b<\u0010=\"\u0004\b>\u0010?R\"\u0010@\u001a\u00020\u000e8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b@\u0010&\u001a\u0004\bA\u0010\u0010\"\u0004\bB\u0010CR\"\u0010D\u001a\u00020\u000e8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bD\u0010&\u001a\u0004\bE\u0010\u0010\"\u0004\bF\u0010CR\u0016\u0010G\u001a\u00020\u000b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bG\u0010,R\"\u0010H\u001a\u00020\u000b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bH\u0010,\u001a\u0004\bI\u0010\r\"\u0004\bJ\u0010/R$\u0010L\u001a\u00020\u000b2\u0006\u0010K\u001a\u00020\u000b8\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\bL\u0010,\u001a\u0004\bM\u0010\rR\"\u0010O\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00120N8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bO\u0010PR\u0016\u0010Q\u001a\u00020\u00158\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bQ\u0010RR\"\u0010T\u001a\u00020S8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bT\u0010U\u001a\u0004\bV\u0010W\"\u0004\bX\u0010YR\u0016\u0010Z\u001a\u00020\u00188\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bZ\u0010[R\"\u0010]\u001a\u00020\\8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b]\u0010^\u001a\u0004\b_\u0010`\"\u0004\ba\u0010bR\"\u0010d\u001a\u00020c8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bd\u0010e\u001a\u0004\bf\u0010g\"\u0004\bh\u0010iR\"\u0010k\u001a\u00020j8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bk\u0010l\u001a\u0004\bm\u0010n\"\u0004\bo\u0010pR\"\u0010r\u001a\u00020q8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\br\u0010s\u001a\u0004\bt\u0010u\"\u0004\bv\u0010wR\"\u0010y\u001a\u00020x8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\by\u0010z\u001a\u0004\b{\u0010|\"\u0004\b}\u0010~R)\u0010\u0080\u0001\u001a\u00020\u007f8\u0006@\u0006X\u0086\u000e¢\u0006\u0018\n\u0006\b\u0080\u0001\u0010\u0081\u0001\u001a\u0006\b\u0082\u0001\u0010\u0083\u0001\"\u0006\b\u0084\u0001\u0010\u0085\u0001R\u0019\u0010\u0086\u0001\u001a\u00020\u001f8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0086\u0001\u0010\u0087\u0001R\u0019\u0010\u0088\u0001\u001a\u00020\"8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0088\u0001\u0010\u0089\u0001R*\u0010\u008b\u0001\u001a\u00030\u008a\u00018\u0006@\u0006X\u0086\u000e¢\u0006\u0018\n\u0006\b\u008b\u0001\u0010\u008c\u0001\u001a\u0006\b\u008d\u0001\u0010\u008e\u0001\"\u0006\b\u008f\u0001\u0010\u0090\u0001R\u0019\u0010\u0091\u0001\u001a\u00020\u001b8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0091\u0001\u0010\u0092\u0001R*\u0010\u0094\u0001\u001a\u00030\u0093\u00018\u0006@\u0006X\u0086\u000e¢\u0006\u0018\n\u0006\b\u0094\u0001\u0010\u0095\u0001\u001a\u0006\b\u0096\u0001\u0010\u0097\u0001\"\u0006\b\u0098\u0001\u0010\u0099\u0001R\u001a\u0010\u009a\u0001\u001a\u0004\u0018\u00010\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b\u009a\u0001\u0010(R,\u0010\u009c\u0001\u001a\u0005\u0018\u00010\u009b\u00018F@\u0006X\u0086\u000e¢\u0006\u0018\n\u0006\b\u009c\u0001\u0010\u009d\u0001\u001a\u0006\b\u009e\u0001\u0010\u009f\u0001\"\u0006\b \u0001\u0010¡\u0001¨\u0006»\u0001"}, d2 = {"Lcom/inmobi/commons/core/configs/AdConfig;", "Lcom/inmobi/commons/core/configs/Config;", "", "accountId", "<init>", "(Ljava/lang/String;)V", "getType", "()Ljava/lang/String;", "Lorg/json/JSONObject;", "toJson", "()Lorg/json/JSONObject;", "", "isValid", "()Z", "", "getMaxPoolSize", "()I", "adType", "Lcom/inmobi/commons/core/configs/AdConfig$CacheConfig;", "getCacheConfig", "(Ljava/lang/String;)Lcom/inmobi/commons/core/configs/AdConfig$CacheConfig;", "Lcom/inmobi/commons/core/configs/AdConfig$ImaiConfig;", "getImaiConfig", "()Lcom/inmobi/commons/core/configs/AdConfig$ImaiConfig;", "Lcom/inmobi/commons/core/configs/AdConfig$MraidConfig;", "getMraidConfig", "()Lcom/inmobi/commons/core/configs/AdConfig$MraidConfig;", "Lcom/inmobi/commons/core/configs/AdConfig$AssetCacheConfig;", "getAssetCacheConfig", "()Lcom/inmobi/commons/core/configs/AdConfig$AssetCacheConfig;", "isCCTEnabled", "Lcom/inmobi/commons/core/configs/AdConfig$Mraid3Config;", "getMraid3Config", "()Lcom/inmobi/commons/core/configs/AdConfig$Mraid3Config;", "Lcom/inmobi/commons/core/configs/AdConfig$PingsV2Config;", "getPingsV2Config", "()Lcom/inmobi/commons/core/configs/AdConfig$PingsV2Config;", "maxPoolSize", "I", "url", "Ljava/lang/String;", "getUrl", "setUrl", "applyGzipReq", "Z", "getApplyGzipReq", "setApplyGzipReq", "(Z)V", "skipNetCheckHB", "getSkipNetCheckHB", "setSkipNetCheckHB", "enableCookiesOnInAppBrowser", "getEnableCookiesOnInAppBrowser", "setEnableCookiesOnInAppBrowser", "skipNetworkValidationFeatureEnabled", "getSkipNetworkValidationFeatureEnabled", "setSkipNetworkValidationFeatureEnabled", "Lcom/inmobi/commons/core/configs/AdConfig$CustomNetworkValidation;", "customNwValidation", "Lcom/inmobi/commons/core/configs/AdConfig$CustomNetworkValidation;", "getCustomNwValidation", "()Lcom/inmobi/commons/core/configs/AdConfig$CustomNetworkValidation;", "setCustomNwValidation", "(Lcom/inmobi/commons/core/configs/AdConfig$CustomNetworkValidation;)V", "minimumRefreshInterval", "getMinimumRefreshInterval", "setMinimumRefreshInterval", "(I)V", "defaultRefreshInterval", "getDefaultRefreshInterval", "setDefaultRefreshInterval", "cctEnabled", "partialTabsEnabled", "getPartialTabsEnabled", "setPartialTabsEnabled", "<set-?>", "watermarkEnabled", "getWatermarkEnabled", "", com.smartdigimkt.q0.b.O, "Ljava/util/Map;", "imai", "Lcom/inmobi/commons/core/configs/AdConfig$ImaiConfig;", "Lcom/inmobi/commons/core/configs/AdConfig$RenderingConfig;", "rendering", "Lcom/inmobi/commons/core/configs/AdConfig$RenderingConfig;", "getRendering", "()Lcom/inmobi/commons/core/configs/AdConfig$RenderingConfig;", "setRendering", "(Lcom/inmobi/commons/core/configs/AdConfig$RenderingConfig;)V", "mraid", "Lcom/inmobi/commons/core/configs/AdConfig$MraidConfig;", "Lcom/inmobi/commons/core/configs/AdConfig$ViewabilityConfig;", "viewability", "Lcom/inmobi/commons/core/configs/AdConfig$ViewabilityConfig;", "getViewability", "()Lcom/inmobi/commons/core/configs/AdConfig$ViewabilityConfig;", "setViewability", "(Lcom/inmobi/commons/core/configs/AdConfig$ViewabilityConfig;)V", "Lcom/inmobi/commons/core/configs/AdConfig$ContextualDataConfig;", "contextualData", "Lcom/inmobi/commons/core/configs/AdConfig$ContextualDataConfig;", "getContextualData", "()Lcom/inmobi/commons/core/configs/AdConfig$ContextualDataConfig;", "setContextualData", "(Lcom/inmobi/commons/core/configs/AdConfig$ContextualDataConfig;)V", "Lcom/inmobi/commons/core/configs/AdConfig$AdQualityConfig;", "adQuality", "Lcom/inmobi/commons/core/configs/AdConfig$AdQualityConfig;", "getAdQuality", "()Lcom/inmobi/commons/core/configs/AdConfig$AdQualityConfig;", "setAdQuality", "(Lcom/inmobi/commons/core/configs/AdConfig$AdQualityConfig;)V", "Lcom/inmobi/commons/core/configs/AdConfig$AdReportConfig;", "adReport", "Lcom/inmobi/commons/core/configs/AdConfig$AdReportConfig;", "getAdReport", "()Lcom/inmobi/commons/core/configs/AdConfig$AdReportConfig;", "setAdReport", "(Lcom/inmobi/commons/core/configs/AdConfig$AdReportConfig;)V", "Lcom/inmobi/commons/core/configs/AdConfig$AudioConfig;", "audio", "Lcom/inmobi/commons/core/configs/AdConfig$AudioConfig;", "getAudio", "()Lcom/inmobi/commons/core/configs/AdConfig$AudioConfig;", "setAudio", "(Lcom/inmobi/commons/core/configs/AdConfig$AudioConfig;)V", "Lcom/inmobi/commons/core/configs/AdConfig$WebAssetCacheConfig;", "webAssetCache", "Lcom/inmobi/commons/core/configs/AdConfig$WebAssetCacheConfig;", "getWebAssetCache", "()Lcom/inmobi/commons/core/configs/AdConfig$WebAssetCacheConfig;", "setWebAssetCache", "(Lcom/inmobi/commons/core/configs/AdConfig$WebAssetCacheConfig;)V", "mraid3", "Lcom/inmobi/commons/core/configs/AdConfig$Mraid3Config;", "pingV2", "Lcom/inmobi/commons/core/configs/AdConfig$PingsV2Config;", "Lcom/inmobi/commons/core/configs/AdConfig$VastVideoConfig;", "vastVideo", "Lcom/inmobi/commons/core/configs/AdConfig$VastVideoConfig;", "getVastVideo", "()Lcom/inmobi/commons/core/configs/AdConfig$VastVideoConfig;", "setVastVideo", "(Lcom/inmobi/commons/core/configs/AdConfig$VastVideoConfig;)V", "assetCache", "Lcom/inmobi/commons/core/configs/AdConfig$AssetCacheConfig;", "Lcom/inmobi/media/ne;", "timeouts", "Lcom/inmobi/media/ne;", "getTimeouts", "()Lcom/inmobi/media/ne;", "setTimeouts", "(Lcom/inmobi/media/ne;)V", "deprecate", "Lcom/inmobi/media/q0;", "adReqDeprecateChecker", "Lcom/inmobi/media/q0;", "getAdReqDeprecateChecker", "()Lcom/inmobi/media/q0;", "setAdReqDeprecateChecker", "(Lcom/inmobi/media/q0;)V", "Companion", "AdQualityConfig", "AdReportConfig", "AssetCacheConfig", "AudioConfig", "AudioViewabilityConfig", "BannerImpressionTypeConfig", "BitRateConfig", "CacheConfig", "com/inmobi/commons/core/configs/b", "CompanionViewabilityConfig", "ContextualDataConfig", "CustomNetworkValidation", "ImaiConfig", "InterstitialImpressionTypeConfig", "Mraid3Config", "MraidConfig", "OmidConfig", "PingsV2Config", "RenderingConfig", "VastVideoConfig", "VideoViewabilityConfig", "ViewabilityConfig", "WebAssetCacheConfig", "WebViewabilityConfig", "media_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class AdConfig extends Config {
    private static final String ALLOWED_CONTENT_TYPE = "allowedContentType";
    public static final long DEFAULT_AD_LOAD_RETRY_INTERVAL = 1000;
    public static final boolean DEFAULT_AD_QUALITY_KILL_SWITCH = true;
    public static final int DEFAULT_AD_QUALITY_MAX_IMAGE_SIZE = 153600;
    public static final int DEFAULT_AD_QUALITY_MAX_RETRIES = 3;
    public static final int DEFAULT_AD_QUALITY_RESIZE_PERCENTAGE = 100;
    public static final int DEFAULT_AD_QUALITY_RETRY_INTERVAL = 5000;
    public static final boolean DEFAULT_AD_REPORT_KILL_SWITCH = true;
    public static final int DEFAULT_AD_REPORT_LIST_SIZE = 10;
    public static final String DEFAULT_AD_SERVER_URL = "https://ads.inmobi.com/sdk";
    public static final long DEFAULT_AUDIO_PROCESSING_INTERVAL = 500;
    public static final boolean DEFAULT_CCT_ENABLED = false;
    public static final int DEFAULT_CONTEXTUAL_DATA_EXPIRY_TIME = 86400;
    public static final int DEFAULT_CONTEXTUAL_DATA_MAX_RECORDS = 1;
    public static final boolean DEFAULT_ENABLE_OKHTTP = false;
    public static final long DEFAULT_EXPOSURE_PROCESSING_INTERVAL = 500;
    public static final int DEFAULT_MAX_POOL_SIZE = 10;
    public static final int DEFAULT_MINIMUM_AUDIO_REFRESH_INTERVAL = 20;
    public static final int DEFAULT_MINIMUM_REFRESH_INTERVAL = 20;
    public static final int DEFAULT_MIN_VOLUME_AUDIO_REQUEST = 30;
    public static final short DEFAULT_NETWORK_LOAD_LIMIT = 50;
    public static final int DEFAULT_PING_V2_CALL_TIMEOUT = 60;
    public static final int DEFAULT_PING_V2_CONNECT_TIMEOUT = 30;
    public static final boolean DEFAULT_PING_V2_ENABLE = false;
    public static final int DEFAULT_PING_V2_EXPIRY_HIGH = 172800;
    public static final int DEFAULT_PING_V2_EXPIRY_NORMAL = 86400;
    public static final int DEFAULT_PING_V2_HIGH_MAX_BATCH_SIZE = 64;
    public static final int DEFAULT_PING_V2_INTERVAL_HIGH = 30;
    public static final int DEFAULT_PING_V2_INTERVAL_NORMAL = 120;
    public static final int DEFAULT_PING_V2_MAX_ENTRIES = 1000;
    public static final int DEFAULT_PING_V2_NORMAL_MAX_BATCH_SIZE = 20;
    public static final int DEFAULT_PING_V2_READ_TIMEOUT = 30;
    public static final double DEFAULT_PING_V2_RETRY_HIGH_FACTOR = 1.0d;
    public static final int DEFAULT_PING_V2_RETRY_HIGH_MAX_RETRIES = 5;
    public static final long DEFAULT_PING_V2_RETRY_HIGH_RETRY_INTERVAL = 10;
    public static final double DEFAULT_PING_V2_RETRY_NORMAL_FACTOR = 2.0d;
    public static final int DEFAULT_PING_V2_RETRY_NORMAL_MAX_RETRIES = 3;
    public static final long DEFAULT_PING_V2_RETRY_NORMAL_RETRY_INTERVAL = 120;
    public static final int DEFAULT_REFRESH_INTERVAL = 60;
    public static final long DEFAULT_SCROLL_THROTTLE_INTERVAL = 500;
    public static final int DEFAULT_TOUCH_RESET_TIME = 4;
    public static final boolean DEFAULT_WATERMARK_KILL_SWITCH = true;
    private static final String GESTURE_LIST = "gestures";
    public static final int MIN_IMPRESSION_POLL_INTERVAL_MILLIS = 50;
    public static final int MIN_VISIBILITY_THROTTLE_INTERVAL_MILLIS = 50;
    public static final byte NETWORK_LOAD_LIMIT_DISABLED = -1;
    private static final String SKIP_FIELDS = "skipFields";
    private AdQualityConfig adQuality;
    private AdReportConfig adReport;
    private C3185q0 adReqDeprecateChecker;
    private boolean applyGzipReq;
    private AssetCacheConfig assetCache;
    private AudioConfig audio;
    private Map<String, CacheConfig> cache;
    private boolean cctEnabled;
    private ContextualDataConfig contextualData;
    private CustomNetworkValidation customNwValidation;
    private int defaultRefreshInterval;
    private String deprecate;
    private boolean enableCookiesOnInAppBrowser;
    private ImaiConfig imai;
    private int maxPoolSize;
    private int minimumRefreshInterval;
    private MraidConfig mraid;
    private Mraid3Config mraid3;
    private boolean partialTabsEnabled;
    private PingsV2Config pingV2;
    private RenderingConfig rendering;
    private boolean skipNetCheckHB;
    private boolean skipNetworkValidationFeatureEnabled;
    private C3151ne timeouts;
    private String url;
    private VastVideoConfig vastVideo;
    private ViewabilityConfig viewability;
    private boolean watermarkEnabled;
    private WebAssetCacheConfig webAssetCache;
    public static final b Companion = new b();
    private static final List<String> DEFAULT_CONTEXTUAL_DATA_SKIP_FIELDS = EmptyList.X;

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u000b\n\u0002\u0010\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0006\u0010\u0012\u001a\u00020\u0004J\u0010\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u0004H\u0007J\u0010\u0010\u0016\u001a\u00020\u00142\u0006\u0010\u0017\u001a\u00020\bH\u0007R\u001e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0004@BX\u0086\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u001e\u0010\t\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\b@BX\u0086\u000e¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u001e\u0010\f\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\b@BX\u0086\u000e¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000bR\u0014\u0010\u000e\u001a\u00020\bX\u0086D¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000bR\u001e\u0010\u0010\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\b@BX\u0086\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u000b¨\u0006\u0018"}, d2 = {"Lcom/inmobi/commons/core/configs/AdConfig$AdQualityConfig;", "", "()V", "<set-?>", "", "enabled", "getEnabled", "()Z", "", "maxImageSize", "getMaxImageSize", "()I", "maxRetries", "getMaxRetries", "resizedPercentage", "getResizedPercentage", "retryInterval", "getRetryInterval", "isValid", "setEnableAdQuality", "", com.p004ironsource.mediationsdk.metadata.a.j, "setMaxImageSize", "size", "media_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class AdQualityConfig {
        private boolean enabled = true;
        private int maxRetries = 3;
        private int retryInterval = 5000;
        private int maxImageSize = AdConfig.DEFAULT_AD_QUALITY_MAX_IMAGE_SIZE;
        private final int resizedPercentage = 100;

        public final boolean getEnabled() {
            return this.enabled;
        }

        public final int getMaxImageSize() {
            return this.maxImageSize;
        }

        public final int getMaxRetries() {
            return this.maxRetries;
        }

        public final int getResizedPercentage() {
            return this.resizedPercentage;
        }

        public final int getRetryInterval() {
            return this.retryInterval;
        }

        public final boolean isValid() {
            return this.maxRetries >= 0 && this.retryInterval >= 0 && this.maxImageSize >= 1 && this.resizedPercentage <= 100;
        }

        public final void setEnableAdQuality(boolean enable) {
            this.enabled = enable;
        }

        public final void setMaxImageSize(int size) {
            this.maxImageSize = size;
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002R\u001a\u0010\u0003\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001a\u0010\t\u001a\u00020\nX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lcom/inmobi/commons/core/configs/AdConfig$AdReportConfig;", "", "()V", "cridls", "", "getCridls", "()I", "setCridls", "(I)V", "enabled", "", "getEnabled", "()Z", "setEnabled", "(Z)V", "media_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class AdReportConfig {
        private boolean enabled = true;
        private int cridls = 10;

        public final int getCridls() {
            return this.cridls;
        }

        public final boolean getEnabled() {
            return this.enabled;
        }

        public final void setCridls(int i2) {
            this.cridls = i2;
        }

        public final void setEnabled(boolean z2) {
            this.enabled = z2;
        }
    }

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0006\u0010\t\u001a\u00020\u0004J\u0006\u0010\n\u001a\u00020\u0006J\u0006\u0010\u000b\u001a\u00020\u0006J\u0006\u0010\f\u001a\u00020\u0004J\u0006\u0010\r\u001a\u00020\u000eR\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0006X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u000f"}, d2 = {"Lcom/inmobi/commons/core/configs/AdConfig$AssetCacheConfig;", "", "()V", "maxCacheSize", "", "maxRetries", "", "retryInterval", "timeToLive", "getMaxCacheSize", "getMaxRetries", "getRetryInterval", "getTimeToLive", "isValid", "", "media_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class AssetCacheConfig {
        private int maxRetries = 3;
        private int retryInterval = 1;
        private long maxCacheSize = 104857600;
        private long timeToLive = CrashConfig.DEFAULT_EVENT_TTL_SEC;

        public final long getMaxCacheSize() {
            return this.maxCacheSize;
        }

        public final int getMaxRetries() {
            return this.maxRetries;
        }

        public final int getRetryInterval() {
            return this.retryInterval;
        }

        public final long getTimeToLive() {
            return this.timeToLive;
        }

        public final boolean isValid() {
            return getRetryInterval() >= 0 && getTimeToLive() >= 0 && getMaxCacheSize() >= 0 && getMaxRetries() >= 0;
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\n\b\u0007\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0006\u0010\u0012\u001a\u00020\u0004R$\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0004@GX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR$\u0010\n\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\t@GX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR$\u0010\u000f\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\t@GX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\f\"\u0004\b\u0011\u0010\u000e¨\u0006\u0013"}, d2 = {"Lcom/inmobi/commons/core/configs/AdConfig$AudioConfig;", "", "()V", "<set-?>", "", "isAudioEnabled", "()Z", "setAudioEnabled", "(Z)V", "", "minDeviceVolume", "getMinDeviceVolume", "()I", "setMinDeviceVolume", "(I)V", "minRefreshInterval", "getMinRefreshInterval", "setMinRefreshInterval", "isValid", "media_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class AudioConfig {
        private boolean isAudioEnabled = true;
        private int minDeviceVolume = 30;
        private int minRefreshInterval = 20;

        public final int getMinDeviceVolume() {
            return this.minDeviceVolume;
        }

        public final int getMinRefreshInterval() {
            return this.minRefreshInterval;
        }

        /* JADX INFO: renamed from: isAudioEnabled, reason: from getter */
        public final boolean getIsAudioEnabled() {
            return this.isAudioEnabled;
        }

        public final boolean isValid() {
            return this.minDeviceVolume > 0 && this.minRefreshInterval > 0;
        }

        public final void setAudioEnabled(boolean z2) {
            this.isAudioEnabled = z2;
        }

        public final void setMinDeviceVolume(int i2) {
            this.minDeviceVolume = i2;
        }

        public final void setMinRefreshInterval(int i2) {
            this.minRefreshInterval = i2;
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0010\u0005\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002R\u001a\u0010\u0003\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001a\u0010\t\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u0006\"\u0004\b\u000b\u0010\bR\u001a\u0010\f\u001a\u00020\rX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, d2 = {"Lcom/inmobi/commons/core/configs/AdConfig$AudioViewabilityConfig;", "", "()V", "impressionMinPercentageViewed", "", "getImpressionMinPercentageViewed", "()I", "setImpressionMinPercentageViewed", "(I)V", "impressionMinTimeViewed", "getImpressionMinTimeViewed", "setImpressionMinTimeViewed", "impressionType", "", "getImpressionType", "()B", "setImpressionType", "(B)V", "media_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class AudioViewabilityConfig {
        private byte impressionType = 1;
        private int impressionMinPercentageViewed = 90;
        private int impressionMinTimeViewed = 2000;

        public final int getImpressionMinPercentageViewed() {
            return this.impressionMinPercentageViewed;
        }

        public final int getImpressionMinTimeViewed() {
            return this.impressionMinTimeViewed;
        }

        public final byte getImpressionType() {
            return this.impressionType;
        }

        public final void setImpressionMinPercentageViewed(int i2) {
            this.impressionMinPercentageViewed = i2;
        }

        public final void setImpressionMinTimeViewed(int i2) {
            this.impressionMinTimeViewed = i2;
        }

        public final void setImpressionType(byte b2) {
            this.impressionType = b2;
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0005\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002R\u001a\u0010\u0003\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lcom/inmobi/commons/core/configs/AdConfig$BannerImpressionTypeConfig;", "", "()V", "impressionType", "", "getImpressionType", "()B", "setImpressionType", "(B)V", "media_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class BannerImpressionTypeConfig {
        private byte impressionType;

        public final byte getImpressionType() {
            return this.impressionType;
        }

        public final void setImpressionType(byte b2) {
            this.impressionType = b2;
        }
    }

    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0006\u0010\u0007\u001a\u00020\u0006J\u0006\u0010\b\u001a\u00020\u0004R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\t"}, d2 = {"Lcom/inmobi/commons/core/configs/AdConfig$BitRateConfig;", "", "()V", "bitrate_mandatory", "", "headerTimeout", "", "getHeaderTimeout", "isBitRateMandatory", "media_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class BitRateConfig {
        private boolean bitrate_mandatory;
        private int headerTimeout = 2000;

        public final int getHeaderTimeout() {
            return this.headerTimeout;
        }

        /* JADX INFO: renamed from: isBitRateMandatory, reason: from getter */
        public final boolean getBitrate_mandatory() {
            return this.bitrate_mandatory;
        }
    }

    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0006\u0010\t\u001a\u00020\nR\u001a\u0010\u0003\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\b¨\u0006\u000b"}, d2 = {"Lcom/inmobi/commons/core/configs/AdConfig$CacheConfig;", "", "()V", "timeToLive", "", "getTimeToLive", "()J", "setTimeToLive", "(J)V", "isValid", "", "media_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class CacheConfig {
        private long timeToLive = 3300;

        public final long getTimeToLive() {
            return this.timeToLive;
        }

        public final boolean isValid() {
            return this.timeToLive >= 0;
        }

        public final void setTimeToLive(long j) {
            this.timeToLive = j;
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\b\b\u0007\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002R\u001a\u0010\u0003\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001a\u0010\t\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u0006\"\u0004\b\u000b\u0010\b¨\u0006\f"}, d2 = {"Lcom/inmobi/commons/core/configs/AdConfig$CompanionViewabilityConfig;", "", "()V", "impressionMinPercentageViewed", "", "getImpressionMinPercentageViewed", "()I", "setImpressionMinPercentageViewed", "(I)V", "visibilityPollIntervalMillis", "getVisibilityPollIntervalMillis", "setVisibilityPollIntervalMillis", "media_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class CompanionViewabilityConfig {
        private int impressionMinPercentageViewed = 10;
        private int visibilityPollIntervalMillis = 500;

        public final int getImpressionMinPercentageViewed() {
            return this.impressionMinPercentageViewed;
        }

        public final int getVisibilityPollIntervalMillis() {
            return this.visibilityPollIntervalMillis;
        }

        public final void setImpressionMinPercentageViewed(int i2) {
            this.impressionMinPercentageViewed = i2;
        }

        public final void setVisibilityPollIntervalMillis(int i2) {
            this.visibilityPollIntervalMillis = i2;
        }
    }

    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0006\u0010\u000f\u001a\u00020\u0010R\u001e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0004@BX\u0086\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u001e\u0010\b\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0004@BX\u0086\u000e¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\u0007R*\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n2\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u000b0\n@BX\u0086\u000e¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e¨\u0006\u0011"}, d2 = {"Lcom/inmobi/commons/core/configs/AdConfig$ContextualDataConfig;", "", "()V", "<set-?>", "", "expiryTime", "getExpiryTime", "()I", "maxAdRecords", "getMaxAdRecords", "", "", AdConfig.SKIP_FIELDS, "getSkipFields", "()Ljava/util/List;", "isValid", "", "media_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class ContextualDataConfig {
        private int expiryTime;
        private int maxAdRecords = 1;
        private List<String> skipFields;

        public ContextualDataConfig() {
            AdConfig.Companion.getClass();
            this.skipFields = AdConfig.DEFAULT_CONTEXTUAL_DATA_SKIP_FIELDS;
            this.expiryTime = 86400;
        }

        public final int getExpiryTime() {
            return this.expiryTime;
        }

        public final int getMaxAdRecords() {
            return this.maxAdRecords;
        }

        public final List<String> getSkipFields() {
            return this.skipFields;
        }

        public final boolean isValid() {
            return this.maxAdRecords >= 0 && this.expiryTime >= 0;
        }
    }

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\b\n\u0002\u0010\u000e\n\u0002\b\b\b\u0007\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002R\u001a\u0010\u0003\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001a\u0010\t\u001a\u00020\nX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u001a\u0010\u000f\u001a\u00020\nX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\f\"\u0004\b\u0011\u0010\u000eR\u001a\u0010\u0012\u001a\u00020\u0013X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R\u001a\u0010\u0018\u001a\u00020\nX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\f\"\u0004\b\u001a\u0010\u000e¨\u0006\u001b"}, d2 = {"Lcom/inmobi/commons/core/configs/AdConfig$CustomNetworkValidation;", "", "()V", "enabled", "", "getEnabled", "()Z", "setEnabled", "(Z)V", "nonValidatedExpiry", "", "getNonValidatedExpiry", "()J", "setNonValidatedExpiry", "(J)V", "refreshDebounceTime", "getRefreshDebounceTime", "setRefreshDebounceTime", "urlDomain", "", "getUrlDomain", "()Ljava/lang/String;", "setUrlDomain", "(Ljava/lang/String;)V", "validatedExpiry", "getValidatedExpiry", "setValidatedExpiry", "media_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class CustomNetworkValidation {
        private boolean enabled;
        private String urlDomain = "supply.inmobicdn.net";
        private long refreshDebounceTime = 1000;
        private long validatedExpiry = UnityAdsConstants.Timeout.INIT_TIMEOUT_MS;
        private long nonValidatedExpiry = CrashConfig.DEFAULT_INCOMPLETE_LOG_THRESHOLD_INTERVAL;

        public final boolean getEnabled() {
            return this.enabled;
        }

        public final long getNonValidatedExpiry() {
            return this.nonValidatedExpiry;
        }

        public final long getRefreshDebounceTime() {
            return this.refreshDebounceTime;
        }

        public final String getUrlDomain() {
            return this.urlDomain;
        }

        public final long getValidatedExpiry() {
            return this.validatedExpiry;
        }

        public final void setEnabled(boolean z2) {
            this.enabled = z2;
        }

        public final void setNonValidatedExpiry(long j) {
            this.nonValidatedExpiry = j;
        }

        public final void setRefreshDebounceTime(long j) {
            this.refreshDebounceTime = j;
        }

        public final void setUrlDomain(String str) {
            Intrinsics.f(str, "<set-?>");
            this.urlDomain = str;
        }

        public final void setValidatedExpiry(long j) {
            this.validatedExpiry = j;
        }
    }

    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\t\n\u0002\u0010\u000b\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0006\u0010\u000b\u001a\u00020\u0004J\u0006\u0010\f\u001a\u00020\u0004J\u0006\u0010\r\u001a\u00020\u0004J\u0006\u0010\u000e\u001a\u00020\bJ\u0006\u0010\u000f\u001a\u00020\u0004J\u0006\u0010\u0010\u001a\u00020\u0004J\u0006\u0010\u0011\u001a\u00020\u0012R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0004X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0004X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0013"}, d2 = {"Lcom/inmobi/commons/core/configs/AdConfig$ImaiConfig;", "", "()V", "maxDbEvents", "", "maxEventBatch", "maxRetries", "pingCacheExpiry", "", "pingInterval", "pingTimeout", "getMaxDbEvents", "getMaxEventBatch", "getMaxRetries", "getPingCacheExpiry", "getPingInterval", "getPingTimeout", "isValid", "", "media_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class ImaiConfig {
        private int maxRetries = 3;
        private int pingInterval = 60;
        private int pingTimeout = 120;
        private int maxDbEvents = 500;
        private int maxEventBatch = 10;
        private long pingCacheExpiry = 10800;

        public final int getMaxDbEvents() {
            return this.maxDbEvents;
        }

        public final int getMaxEventBatch() {
            return this.maxEventBatch;
        }

        public final int getMaxRetries() {
            return this.maxRetries;
        }

        public final long getPingCacheExpiry() {
            return this.pingCacheExpiry;
        }

        public final int getPingInterval() {
            return this.pingInterval;
        }

        public final int getPingTimeout() {
            return this.pingTimeout;
        }

        public final boolean isValid() {
            return getMaxDbEvents() >= 0 && getMaxEventBatch() >= 0 && getMaxRetries() >= 0 && getPingInterval() >= 0 && getPingTimeout() > 0 && getPingCacheExpiry() > 0;
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0005\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002R\u001a\u0010\u0003\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lcom/inmobi/commons/core/configs/AdConfig$InterstitialImpressionTypeConfig;", "", "()V", "impressionType", "", "getImpressionType", "()B", "setImpressionType", "(B)V", "media_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class InterstitialImpressionTypeConfig {
        private byte impressionType = 1;

        public final byte getImpressionType() {
            return this.impressionType;
        }

        public final void setImpressionType(byte b2) {
            this.impressionType = b2;
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\u000b\b\u0007\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002R\u001a\u0010\u0003\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001a\u0010\t\u001a\u00020\nX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u001a\u0010\u000f\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0006\"\u0004\b\u0011\u0010\bR\u001a\u0010\u0012\u001a\u00020\nX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\f\"\u0004\b\u0014\u0010\u000e¨\u0006\u0015"}, d2 = {"Lcom/inmobi/commons/core/configs/AdConfig$Mraid3Config;", "", "()V", "bannerEnabled", "", "getBannerEnabled", "()Z", "setBannerEnabled", "(Z)V", "exposureChangeInterval", "", "getExposureChangeInterval", "()J", "setExposureChangeInterval", "(J)V", "interstitialEnabled", "getInterstitialEnabled", "setInterstitialEnabled", "muteChangeInterval", "getMuteChangeInterval", "setMuteChangeInterval", "media_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Mraid3Config {
        private boolean bannerEnabled = true;
        private boolean interstitialEnabled = true;
        private long exposureChangeInterval = 500;
        private long muteChangeInterval = 500;

        public final boolean getBannerEnabled() {
            return this.bannerEnabled;
        }

        public final long getExposureChangeInterval() {
            return this.exposureChangeInterval;
        }

        public final boolean getInterstitialEnabled() {
            return this.interstitialEnabled;
        }

        public final long getMuteChangeInterval() {
            return this.muteChangeInterval;
        }

        public final void setBannerEnabled(boolean z2) {
            this.bannerEnabled = z2;
        }

        public final void setExposureChangeInterval(long j) {
            this.exposureChangeInterval = j;
        }

        public final void setInterstitialEnabled(boolean z2) {
            this.interstitialEnabled = z2;
        }

        public final void setMuteChangeInterval(long j) {
            this.muteChangeInterval = j;
        }
    }

    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0006\u0010\n\u001a\u00020\u0004J\u0006\u0010\u000b\u001a\u00020\u0006J\u0006\u0010\f\u001a\u00020\u0006J\u0006\u0010\r\u001a\u00020\tJ\u0006\u0010\u000e\u001a\u00020\u000fR\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0006X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0010"}, d2 = {"Lcom/inmobi/commons/core/configs/AdConfig$MraidConfig;", "", "()V", "expiry", "", "maxRetries", "", "retryInterval", "url", "", "getExpiry", "getMaxRetries", "getRetryInterval", "getUrl", "isValid", "", "media_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class MraidConfig {
        private long expiry = 432000;
        private int maxRetries = 3;
        private int retryInterval = 60;
        private String url = "https://supply.inmobicdn.net/sdk/sdk/1086/android/mraid.js";

        public final long getExpiry() {
            return this.expiry;
        }

        public final int getMaxRetries() {
            return this.maxRetries;
        }

        public final int getRetryInterval() {
            return this.retryInterval;
        }

        public final String getUrl() {
            return this.url;
        }

        public final boolean isValid() {
            return getExpiry() >= 0 && getRetryInterval() >= 0 && getMaxRetries() >= 0 && !D4.a(this.url);
        }
    }

    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\f\b\u0007\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0006\u0010\u0012\u001a\u00020\u0004J\u0006\u0010\u0013\u001a\u00020\u0006J\u0006\u0010\u0014\u001a\u00020\u000eJ\u0006\u0010\u0015\u001a\u00020\u0006J\b\u0010\u0016\u001a\u0004\u0018\u00010\u000eJ\u0006\u0010\u0017\u001a\u00020\u0004J\u0006\u0010\u0018\u001a\u00020\bJ\u0006\u0010\u0019\u001a\u00020\bR\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u000e¢\u0006\u0002\n\u0000R\u001a\u0010\u0007\u001a\u00020\bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR\u000e\u0010\r\u001a\u00020\u000eX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0006X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u000eX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0004X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u001a"}, d2 = {"Lcom/inmobi/commons/core/configs/AdConfig$OmidConfig;", "", "()V", "expiry", "", "maxRetries", "", "omidEnabled", "", "getOmidEnabled", "()Z", "setOmidEnabled", "(Z)V", "partnerKey", "", "retryInterval", "url", "webViewRetainTime", "getExpiry", "getMaxRetries", "getPartnerKey", "getRetryInterval", "getUrl", "getWebViewRetainTime", "isOmidEnabled", "isValid", "media_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class OmidConfig {
        private long expiry = 432000;
        private int maxRetries = 3;
        private int retryInterval = 60;
        private String partnerKey = "Inmobi";
        private String url = "https://supply.inmobicdn.net/javascript/1.5.5/omsdk-service.js";
        private boolean omidEnabled = true;
        private long webViewRetainTime = 1000;

        public final long getExpiry() {
            return this.expiry;
        }

        public final int getMaxRetries() {
            return this.maxRetries;
        }

        public final boolean getOmidEnabled() {
            return this.omidEnabled;
        }

        public final String getPartnerKey() {
            return this.partnerKey;
        }

        public final int getRetryInterval() {
            return this.retryInterval;
        }

        public final String getUrl() {
            return this.url;
        }

        public final long getWebViewRetainTime() {
            return this.webViewRetainTime;
        }

        public final boolean isOmidEnabled() {
            return this.omidEnabled;
        }

        public final boolean isValid() {
            String url;
            String string;
            return getMaxRetries() >= 0 && getRetryInterval() >= 0 && (url = getUrl()) != null && (string = StringsKt.a0(url).toString()) != null && B2.a(string) && !TextUtils.isEmpty(getPartnerKey());
        }

        public final void setOmidEnabled(boolean z2) {
            this.omidEnabled = z2;
        }
    }

    @Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u00002\u00020\u0001:\u0004#$%&B\u0005¢\u0006\u0002\u0010\u0002R\u0014\u0010\u0003\u001a\u00020\u0004X\u0086D¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u0004X\u0086D¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0006R\u0014\u0010\t\u001a\u00020\nX\u0086D¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0014\u0010\r\u001a\u00020\nX\u0086D¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\fR\u0011\u0010\u000f\u001a\u00020\u0010¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0011\u0010\u0013\u001a\u00020\u0014¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0011\u0010\u0017\u001a\u00020\u0018¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u0014\u0010\u001b\u001a\u00020\u0004X\u0086D¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u0006R\u0014\u0010\u001d\u001a\u00020\u0004X\u0086D¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u0006R\u0011\u0010\u001f\u001a\u00020 ¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\"¨\u0006'"}, d2 = {"Lcom/inmobi/commons/core/configs/AdConfig$PingsV2Config;", "", "()V", "callTimeout", "", "getCallTimeout", "()I", "connectTimeout", "getConnectTimeout", "enableOkhttp", "", "getEnableOkhttp", "()Z", "enabled", "getEnabled", "expiry", "Lcom/inmobi/commons/core/configs/AdConfig$PingsV2Config$PingExpiryConfig;", "getExpiry", "()Lcom/inmobi/commons/core/configs/AdConfig$PingsV2Config$PingExpiryConfig;", "interval", "Lcom/inmobi/commons/core/configs/AdConfig$PingsV2Config$PingIntervalConfig;", "getInterval", "()Lcom/inmobi/commons/core/configs/AdConfig$PingsV2Config$PingIntervalConfig;", "maxBatchSize", "Lcom/inmobi/commons/core/configs/AdConfig$PingsV2Config$PingBatchSizeConfig;", "getMaxBatchSize", "()Lcom/inmobi/commons/core/configs/AdConfig$PingsV2Config$PingBatchSizeConfig;", "maxEntries", "getMaxEntries", "readTimeout", "getReadTimeout", "retryConfig", "Lcom/inmobi/commons/core/configs/AdConfig$PingsV2Config$PingRetryConfig;", "getRetryConfig", "()Lcom/inmobi/commons/core/configs/AdConfig$PingsV2Config$PingRetryConfig;", "PingBatchSizeConfig", "PingExpiryConfig", "PingIntervalConfig", "PingRetryConfig", "media_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class PingsV2Config {
        private final boolean enableOkhttp;
        private final boolean enabled;
        private final int maxEntries = 1000;
        private final PingBatchSizeConfig maxBatchSize = new PingBatchSizeConfig();
        private final int readTimeout = 30;
        private final int connectTimeout = 30;
        private final int callTimeout = 60;
        private final PingExpiryConfig expiry = new PingExpiryConfig();
        private final PingRetryConfig retryConfig = new PingRetryConfig();
        private final PingIntervalConfig interval = new PingIntervalConfig();

        @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002R\u0014\u0010\u0003\u001a\u00020\u0004X\u0086D¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u0004X\u0086D¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0006¨\u0006\t"}, d2 = {"Lcom/inmobi/commons/core/configs/AdConfig$PingsV2Config$PingBatchSizeConfig;", "", "()V", "high", "", "getHigh", "()I", "normal", "getNormal", "media_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class PingBatchSizeConfig {
            private final int normal = 20;
            private final int high = 64;

            public final int getHigh() {
                return this.high;
            }

            public final int getNormal() {
                return this.normal;
            }
        }

        @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002R\u0014\u0010\u0003\u001a\u00020\u0004X\u0086D¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u0004X\u0086D¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0006¨\u0006\t"}, d2 = {"Lcom/inmobi/commons/core/configs/AdConfig$PingsV2Config$PingExpiryConfig;", "", "()V", "high", "", "getHigh", "()I", "normal", "getNormal", "media_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class PingExpiryConfig {
            private final int normal = 86400;
            private final int high = AdConfig.DEFAULT_PING_V2_EXPIRY_HIGH;

            public final int getHigh() {
                return this.high;
            }

            public final int getNormal() {
                return this.normal;
            }
        }

        @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\b\b\u0007\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002R\u001a\u0010\u0003\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001a\u0010\t\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u0006\"\u0004\b\u000b\u0010\b¨\u0006\f"}, d2 = {"Lcom/inmobi/commons/core/configs/AdConfig$PingsV2Config$PingIntervalConfig;", "", "()V", "high", "", "getHigh", "()I", "setHigh", "(I)V", "normal", "getNormal", "setNormal", "media_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class PingIntervalConfig {
            private int normal = 120;
            private int high = 30;

            public final int getHigh() {
                return this.high;
            }

            public final int getNormal() {
                return this.normal;
            }

            public final void setHigh(int i2) {
                this.high = i2;
            }

            public final void setNormal(int i2) {
                this.normal = i2;
            }
        }

        @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\b\u0007\u0018\u00002\u00020\u0001:\u0001\fB\u0005¢\u0006\u0002\u0010\u0002R\u001a\u0010\u0003\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001a\u0010\t\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u0006\"\u0004\b\u000b\u0010\b¨\u0006\r"}, d2 = {"Lcom/inmobi/commons/core/configs/AdConfig$PingsV2Config$PingRetryConfig;", "", "()V", "high", "Lcom/inmobi/commons/core/configs/AdConfig$PingsV2Config$PingRetryConfig$PriorityRetryConfig;", "getHigh", "()Lcom/inmobi/commons/core/configs/AdConfig$PingsV2Config$PingRetryConfig$PriorityRetryConfig;", "setHigh", "(Lcom/inmobi/commons/core/configs/AdConfig$PingsV2Config$PingRetryConfig$PriorityRetryConfig;)V", "normal", "getNormal", "setNormal", "PriorityRetryConfig", "media_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class PingRetryConfig {
            private PriorityRetryConfig normal = new PriorityRetryConfig(3, 120, 2.0d);
            private PriorityRetryConfig high = new PriorityRetryConfig(5, 10, 1.0d);

            @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u000e\b\u0007\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bR\u001a\u0010\u0006\u001a\u00020\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0004\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014¨\u0006\u0015"}, d2 = {"Lcom/inmobi/commons/core/configs/AdConfig$PingsV2Config$PingRetryConfig$PriorityRetryConfig;", "", "maxRetries", "", "retryInterval", "", "factor", "", "(IJD)V", "getFactor", "()D", "setFactor", "(D)V", "getMaxRetries", "()I", "setMaxRetries", "(I)V", "getRetryInterval", "()J", "setRetryInterval", "(J)V", "media_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
            public static final class PriorityRetryConfig {
                private double factor;
                private int maxRetries;
                private long retryInterval;

                public PriorityRetryConfig(int i2, long j, double d) {
                    this.maxRetries = i2;
                    this.retryInterval = j;
                    this.factor = d;
                }

                public final double getFactor() {
                    return this.factor;
                }

                public final int getMaxRetries() {
                    return this.maxRetries;
                }

                public final long getRetryInterval() {
                    return this.retryInterval;
                }

                public final void setFactor(double d) {
                    this.factor = d;
                }

                public final void setMaxRetries(int i2) {
                    this.maxRetries = i2;
                }

                public final void setRetryInterval(long j) {
                    this.retryInterval = j;
                }
            }

            public final PriorityRetryConfig getHigh() {
                return this.high;
            }

            public final PriorityRetryConfig getNormal() {
                return this.normal;
            }

            public final void setHigh(PriorityRetryConfig priorityRetryConfig) {
                Intrinsics.f(priorityRetryConfig, "<set-?>");
                this.high = priorityRetryConfig;
            }

            public final void setNormal(PriorityRetryConfig priorityRetryConfig) {
                Intrinsics.f(priorityRetryConfig, "<set-?>");
                this.normal = priorityRetryConfig;
            }
        }

        public final int getCallTimeout() {
            return this.callTimeout;
        }

        public final int getConnectTimeout() {
            return this.connectTimeout;
        }

        public final boolean getEnableOkhttp() {
            return this.enableOkhttp;
        }

        public final boolean getEnabled() {
            return this.enabled;
        }

        public final PingExpiryConfig getExpiry() {
            return this.expiry;
        }

        public final PingIntervalConfig getInterval() {
            return this.interval;
        }

        public final PingBatchSizeConfig getMaxBatchSize() {
            return this.maxBatchSize;
        }

        public final int getMaxEntries() {
            return this.maxEntries;
        }

        public final int getReadTimeout() {
            return this.readTimeout;
        }

        public final PingRetryConfig getRetryConfig() {
            return this.retryConfig;
        }
    }

    @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\n\n\u0002\u0010!\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0006\u0010\u001d\u001a\u00020\u0004J\u0006\u0010\u001e\u001a\u00020\u0006J\u0006\u0010\u001f\u001a\u00020\u0004J\u0006\u0010 \u001a\u00020\u0004J\f\u0010!\u001a\b\u0012\u0004\u0012\u00020\u00040\"J\u0006\u0010#\u001a\u00020\u0014J\u0006\u0010$\u001a\u00020\u0004J\u0006\u0010%\u001a\u00020\u0006J\u0006\u0010&\u001a\u00020\u0004J\u0006\u0010\u0019\u001a\u00020\u0006R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0082\u000e¢\u0006\u0002\n\u0000R\u001e\u0010\t\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0006@BX\u0086\u000e¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u001e\u0010\f\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0006@BX\u0086\u000e¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000bR\u001e\u0010\u000e\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0006@BX\u0086\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000bR\u0014\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00040\u0011X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0004X\u0082\u000e¢\u0006\u0002\n\u0000R\u001a\u0010\u0013\u001a\u00020\u0014X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018R\u000e\u0010\u0019\u001a\u00020\u0006X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u001a\u001a\u00020\u0014X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u001b\u001a\u00020\u001cX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006'"}, d2 = {"Lcom/inmobi/commons/core/configs/AdConfig$RenderingConfig;", "", "()V", "audioNetworkLoadsLimit", "", "autoRedirectionEnforcement", "", "bannerNetworkLoadsLimit", "<set-?>", "enableDomStorage", "getEnableDomStorage", "()Z", "enableImmersive", "getEnableImmersive", "enablePubMuteControl", "getEnablePubMuteControl", AdConfig.GESTURE_LIST, "", "otherNetworkLoadsLimit", "scrollThrottleInterval", "", "getScrollThrottleInterval", "()J", "setScrollThrottleInterval", "(J)V", "shouldRenderPopup", "userTouchResetTime", "webviewBackground", "", "getAudioNetworkLoadsLimit", "getAutoRedirectionEnforcement", "getBannerNetworkLoadsLimit", "getOtherNetworkLoadsLimit", "getSupportedGestures", "", "getUserTouchResetTime", "getWebviewBackgroundColor", "isValid", "parseColor", "media_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class RenderingConfig {
        private boolean enableDomStorage;
        private boolean enableImmersive;
        private boolean enablePubMuteControl;
        private boolean shouldRenderPopup;
        private String webviewBackground = "#00000000";
        private boolean autoRedirectionEnforcement = true;
        private long userTouchResetTime = 4;
        private int bannerNetworkLoadsLimit = 50;
        private int audioNetworkLoadsLimit = 50;
        private int otherNetworkLoadsLimit = -1;
        private List<Integer> gestures = CollectionsKt.L(0, 1, 2, 3, 4, 5);
        private long scrollThrottleInterval = 500;

        public final int getAudioNetworkLoadsLimit() {
            return this.audioNetworkLoadsLimit;
        }

        public final boolean getAutoRedirectionEnforcement() {
            return this.autoRedirectionEnforcement;
        }

        public final int getBannerNetworkLoadsLimit() {
            return this.bannerNetworkLoadsLimit;
        }

        public final boolean getEnableDomStorage() {
            return this.enableDomStorage;
        }

        public final boolean getEnableImmersive() {
            return this.enableImmersive;
        }

        public final boolean getEnablePubMuteControl() {
            return this.enablePubMuteControl;
        }

        public final int getOtherNetworkLoadsLimit() {
            return this.otherNetworkLoadsLimit;
        }

        public final long getScrollThrottleInterval() {
            return this.scrollThrottleInterval;
        }

        public final List<Integer> getSupportedGestures() {
            return this.gestures;
        }

        public final long getUserTouchResetTime() {
            return this.userTouchResetTime * ((long) 1000);
        }

        public final int getWebviewBackgroundColor() {
            try {
                return parseColor();
            } catch (IllegalArgumentException unused) {
                return Color.parseColor("#00000000");
            }
        }

        public final boolean isValid() {
            String string;
            String str = this.webviewBackground;
            if (str != null && (((string = StringsKt.a0(str).toString()) == null || string.length() != 0) && getUserTouchResetTime() >= 0 && !getSupportedGestures().isEmpty())) {
                try {
                    parseColor();
                    return true;
                } catch (IllegalArgumentException unused) {
                }
            }
            return false;
        }

        public final int parseColor() throws IllegalArgumentException {
            return Color.parseColor(this.webviewBackground);
        }

        public final void setScrollThrottleInterval(long j) {
            this.scrollThrottleInterval = j;
        }

        /* JADX INFO: renamed from: shouldRenderPopup, reason: from getter */
        public final boolean getShouldRenderPopup() {
            return this.shouldRenderPopup;
        }
    }

    @Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004J\u0006\u0010\u000e\u001a\u00020\u0007J\u0006\u0010\u000f\u001a\u00020\tJ\u0006\u0010\u0010\u001a\u00020\u000bJ\u0006\u0010\u0011\u001a\u00020\u000bJ\u0006\u0010\u0012\u001a\u00020\u0013R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u000bX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0014"}, d2 = {"Lcom/inmobi/commons/core/configs/AdConfig$VastVideoConfig;", "", "()V", AdConfig.ALLOWED_CONTENT_TYPE, "", "", "bitRate", "Lcom/inmobi/commons/core/configs/AdConfig$BitRateConfig;", "maxWrapperLimit", "", "optimalVastVideoSize", "", "vastMaxAssetSize", "getAllowedContentType", "getBitRate", "getMaxWrapperLimit", "getOptimalVastVideoSize", "getVastMaxAssetSize", "isValid", "", "media_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class VastVideoConfig {
        private int maxWrapperLimit = 3;
        private long optimalVastVideoSize = 3145728;
        private long vastMaxAssetSize = 31457280;
        private BitRateConfig bitRate = new BitRateConfig();
        private List<String> allowedContentType = CollectionsKt.L("video/mp4", "video/3gp", "video/3gpp", "video/webm", "image/jpeg", "image/jpg", "image/gif", "image/png");

        public final List<String> getAllowedContentType() {
            return this.allowedContentType;
        }

        public final BitRateConfig getBitRate() {
            return this.bitRate;
        }

        public final int getMaxWrapperLimit() {
            return this.maxWrapperLimit;
        }

        public final long getOptimalVastVideoSize() {
            return this.optimalVastVideoSize;
        }

        public final long getVastMaxAssetSize() {
            return this.vastMaxAssetSize;
        }

        public final boolean isValid() {
            return getOptimalVastVideoSize() <= 31457280 && getOptimalVastVideoSize() > 0 && getMaxWrapperLimit() >= 0 && getVastMaxAssetSize() > 0 && getVastMaxAssetSize() <= 31457280;
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u000b\b\u0007\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002R\u001a\u0010\u0003\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001a\u0010\t\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u0006\"\u0004\b\u000b\u0010\bR\u001a\u0010\f\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u0006\"\u0004\b\u000e\u0010\b¨\u0006\u000f"}, d2 = {"Lcom/inmobi/commons/core/configs/AdConfig$VideoViewabilityConfig;", "", "()V", "impressionMinPercentageViewed", "", "getImpressionMinPercentageViewed", "()I", "setImpressionMinPercentageViewed", "(I)V", "impressionMinTimeViewed", "getImpressionMinTimeViewed", "setImpressionMinTimeViewed", "videoMinPercentagePlay", "getVideoMinPercentagePlay", "setVideoMinPercentagePlay", "media_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class VideoViewabilityConfig {
        private int impressionMinPercentageViewed = 50;
        private int impressionMinTimeViewed = 2000;
        private int videoMinPercentagePlay = 50;

        public final int getImpressionMinPercentageViewed() {
            return this.impressionMinPercentageViewed;
        }

        public final int getImpressionMinTimeViewed() {
            return this.impressionMinTimeViewed;
        }

        public final int getVideoMinPercentagePlay() {
            return this.videoMinPercentagePlay;
        }

        public final void setImpressionMinPercentageViewed(int i2) {
            this.impressionMinPercentageViewed = i2;
        }

        public final void setImpressionMinTimeViewed(int i2) {
            this.impressionMinTimeViewed = i2;
        }

        public final void setVideoMinPercentagePlay(int i2) {
            this.videoMinPercentagePlay = i2;
        }
    }

    @Metadata(d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0005\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0006\u0010\u001b\u001a\u00020\nJ\u0006\u0010\u001c\u001a\u00020\nJ\u0006\u0010\u001d\u001a\u00020\u001eJ\u0006\u0010\u001f\u001a\u00020\u001eJ\u0006\u0010 \u001a\u00020\nJ\u0006\u0010!\u001a\u00020\nJ\u0006\u0010\"\u001a\u00020\nJ\u0006\u0010#\u001a\u00020\nJ\u0006\u0010$\u001a\u00020\nJ\u0006\u0010%\u001a\u00020\nJ\u0006\u0010&\u001a\u00020\u001eJ\u0006\u0010'\u001a\u00020\nJ\u0006\u0010(\u001a\u00020\nJ\u0006\u0010)\u001a\u00020\nJ\u0006\u0010*\u001a\u00020\nJ\u0006\u0010+\u001a\u00020\nJ\u0006\u0010,\u001a\u00020\nJ\u0006\u0010-\u001a\u00020\nJ\u0006\u0010.\u001a\u00020/J\u000e\u00100\u001a\u0002012\u0006\u00102\u001a\u00020\nR\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\nX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\nX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\nX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u0082\u000e¢\u0006\u0002\n\u0000R\u001a\u0010\u0010\u001a\u00020\u0011X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R\u000e\u0010\u0016\u001a\u00020\u0017X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0018\u001a\u00020\nX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0019\u001a\u00020\u001aX\u0082\u000e¢\u0006\u0002\n\u0000¨\u00063"}, d2 = {"Lcom/inmobi/commons/core/configs/AdConfig$ViewabilityConfig;", "", "()V", "audio", "Lcom/inmobi/commons/core/configs/AdConfig$AudioViewabilityConfig;", "banner", "Lcom/inmobi/commons/core/configs/AdConfig$BannerImpressionTypeConfig;", "companion", "Lcom/inmobi/commons/core/configs/AdConfig$CompanionViewabilityConfig;", "displayMinPercentageAnimate", "", "impressionMinPercentageViewed", "impressionMinTimeViewed", "impressionPollIntervalMillis", "int", "Lcom/inmobi/commons/core/configs/AdConfig$InterstitialImpressionTypeConfig;", "omidConfig", "Lcom/inmobi/commons/core/configs/AdConfig$OmidConfig;", "getOmidConfig", "()Lcom/inmobi/commons/core/configs/AdConfig$OmidConfig;", "setOmidConfig", "(Lcom/inmobi/commons/core/configs/AdConfig$OmidConfig;)V", "video", "Lcom/inmobi/commons/core/configs/AdConfig$VideoViewabilityConfig;", "visibilityThrottleMillis", "web", "Lcom/inmobi/commons/core/configs/AdConfig$WebViewabilityConfig;", "getAudioImpressionMinPercentageViewed", "getAudioImpressionMinTimeViewed", "getAudioImpressionType", "", "getBannerImpressionType", "getCompanionVisibilityMinPercentageViewed", "getCompanionVisibilityThrottleMillis", "getDisplayMinPercentageAnimate", "getImpressionMinPercentageViewed", "getImpressionMinTimeViewed", "getImpressionPollIntervalMillis", "getInterstitialImpressionType", "getVideoImpressionMinPercentageViewed", "getVideoImpressionMinTimeViewed", "getVideoMinPercentagePlay", "getVisibilityThrottleMillis", "getWebImpressionMinPercentageViewed", "getWebImpressionMinTimeViewed", "getWebVisibilityThrottleMillis", "isValid", "", "setVideoImpressionMinTimeViewed", "", "videoImpressionMinTimeViewed", "media_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class ViewabilityConfig {
        private int impressionMinPercentageViewed = 50;
        private int impressionMinTimeViewed = 1000;
        private int visibilityThrottleMillis = 100;
        private int impressionPollIntervalMillis = 250;
        private int displayMinPercentageAnimate = 67;
        private VideoViewabilityConfig video = new VideoViewabilityConfig();
        private AudioViewabilityConfig audio = new AudioViewabilityConfig();
        private WebViewabilityConfig web = new WebViewabilityConfig();
        private OmidConfig omidConfig = new OmidConfig();
        private BannerImpressionTypeConfig banner = new BannerImpressionTypeConfig();
        private InterstitialImpressionTypeConfig int = new InterstitialImpressionTypeConfig();
        private CompanionViewabilityConfig companion = new CompanionViewabilityConfig();

        public final int getAudioImpressionMinPercentageViewed() {
            return this.audio.getImpressionMinPercentageViewed();
        }

        public final int getAudioImpressionMinTimeViewed() {
            return this.audio.getImpressionMinTimeViewed();
        }

        public final byte getAudioImpressionType() {
            return this.audio.getImpressionType();
        }

        public final byte getBannerImpressionType() {
            return this.banner.getImpressionType();
        }

        public final int getCompanionVisibilityMinPercentageViewed() {
            return this.companion.getImpressionMinPercentageViewed();
        }

        public final int getCompanionVisibilityThrottleMillis() {
            return this.companion.getVisibilityPollIntervalMillis();
        }

        public final int getDisplayMinPercentageAnimate() {
            return this.displayMinPercentageAnimate;
        }

        public final int getImpressionMinPercentageViewed() {
            return this.impressionMinPercentageViewed;
        }

        public final int getImpressionMinTimeViewed() {
            return this.impressionMinTimeViewed;
        }

        public final int getImpressionPollIntervalMillis() {
            return this.impressionPollIntervalMillis;
        }

        public final byte getInterstitialImpressionType() {
            return this.int.getImpressionType();
        }

        public final OmidConfig getOmidConfig() {
            return this.omidConfig;
        }

        public final int getVideoImpressionMinPercentageViewed() {
            return this.video.getImpressionMinPercentageViewed();
        }

        public final int getVideoImpressionMinTimeViewed() {
            return this.video.getImpressionMinTimeViewed();
        }

        public final int getVideoMinPercentagePlay() {
            return this.video.getVideoMinPercentagePlay();
        }

        public final int getVisibilityThrottleMillis() {
            return this.visibilityThrottleMillis;
        }

        public final int getWebImpressionMinPercentageViewed() {
            return this.web.getImpressionMinPercentageViewed();
        }

        public final int getWebImpressionMinTimeViewed() {
            return this.web.getImpressionMinTimeViewed();
        }

        public final int getWebVisibilityThrottleMillis() {
            return this.web.getImpressionPollIntervalMillis();
        }

        public final boolean isValid() {
            return getImpressionMinPercentageViewed() > 0 && getImpressionMinPercentageViewed() <= 100 && getImpressionMinTimeViewed() >= 0 && getDisplayMinPercentageAnimate() > 0 && getDisplayMinPercentageAnimate() <= 100 && getVideoImpressionMinPercentageViewed() > 0 && getVideoImpressionMinPercentageViewed() <= 100 && getWebImpressionMinPercentageViewed() > 0 && getWebImpressionMinPercentageViewed() <= 100 && getWebVisibilityThrottleMillis() > 0 && getWebImpressionMinTimeViewed() >= 0 && getVideoImpressionMinTimeViewed() >= 0 && getCompanionVisibilityMinPercentageViewed() >= 0 && getVideoMinPercentagePlay() > 0 && getVideoMinPercentagePlay() <= 100 && getVisibilityThrottleMillis() >= 50 && getVisibilityThrottleMillis() * 5 <= getImpressionMinTimeViewed() && getImpressionPollIntervalMillis() >= 50 && getImpressionPollIntervalMillis() * 4 <= getImpressionMinTimeViewed() && getCompanionVisibilityThrottleMillis() >= 50 && this.omidConfig.isValid();
        }

        public final void setOmidConfig(OmidConfig omidConfig) {
            Intrinsics.f(omidConfig, "<set-?>");
            this.omidConfig = omidConfig;
        }

        public final void setVideoImpressionMinTimeViewed(int videoImpressionMinTimeViewed) {
            this.video.setImpressionMinTimeViewed(videoImpressionMinTimeViewed);
        }
    }

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u000f\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0087\b\u0018\u0000  2\u00020\u0001:\u0001!B9\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\f\u0010\u000bJ\u0010\u0010\r\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\r\u0010\u000bJ\u0010\u0010\u000e\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000e\u0010\u000bJ\u0010\u0010\u000f\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000f\u0010\u000bJB\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00022\b\b\u0002\u0010\u0007\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u000bJ\u001a\u0010\u0018\u001a\u00020\u00172\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0018\u0010\u0019R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u001a\u001a\u0004\b\u001b\u0010\u000bR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u001a\u001a\u0004\b\u001c\u0010\u000bR\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u001a\u001a\u0004\b\u001d\u0010\u000bR\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u001a\u001a\u0004\b\u001e\u0010\u000bR\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u001a\u001a\u0004\b\u001f\u0010\u000b¨\u0006\""}, d2 = {"Lcom/inmobi/commons/core/configs/AdConfig$WebAssetCacheConfig;", "", "", "cacheSize", "timeout", "maxRetries", "minAvailableDiskSpace", "cacheSizeToDiskSpaceMaxPercent", "<init>", "(IIIII)V", "component1", "()I", "component2", "component3", "component4", "component5", "copy", "(IIIII)Lcom/inmobi/commons/core/configs/AdConfig$WebAssetCacheConfig;", "", "toString", "()Ljava/lang/String;", "hashCode", x4.DEFAULT_AUCTION_FALLBACK_VALUE, "", "equals", "(Ljava/lang/Object;)Z", "I", "getCacheSize", "getTimeout", "getMaxRetries", "getMinAvailableDiskSpace", "getCacheSizeToDiskSpaceMaxPercent", "Companion", "com/inmobi/commons/core/configs/c", "media_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class WebAssetCacheConfig {
        public static final c Companion = new c();
        private static final int DEFAULT_CACHE_SIZE_MB = 15;
        private static final int DEFAULT_CACHE_SIZE_TO_DISK_SPACE_PERCENT = 10;
        private static final int DEFAULT_MAX_RETRIES = 1;
        private static final int DEFAULT_MIN_AVAILABLE_DISK_SPACE = 50;
        private static final int DEFAULT_TIMEOUT_MS = 5000;
        private final int cacheSize;
        private final int cacheSizeToDiskSpaceMaxPercent;
        private final int maxRetries;
        private final int minAvailableDiskSpace;
        private final int timeout;

        public WebAssetCacheConfig() {
            this(0, 0, 0, 0, 0, 31, null);
        }

        public static /* synthetic */ WebAssetCacheConfig copy$default(WebAssetCacheConfig webAssetCacheConfig, int i2, int i3, int i4, int i5, int i6, int i7, Object obj) {
            if ((i7 & 1) != 0) {
                i2 = webAssetCacheConfig.cacheSize;
            }
            if ((i7 & 2) != 0) {
                i3 = webAssetCacheConfig.timeout;
            }
            if ((i7 & 4) != 0) {
                i4 = webAssetCacheConfig.maxRetries;
            }
            if ((i7 & 8) != 0) {
                i5 = webAssetCacheConfig.minAvailableDiskSpace;
            }
            if ((i7 & 16) != 0) {
                i6 = webAssetCacheConfig.cacheSizeToDiskSpaceMaxPercent;
            }
            int i8 = i6;
            int i9 = i4;
            return webAssetCacheConfig.copy(i2, i3, i9, i5, i8);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final int getCacheSize() {
            return this.cacheSize;
        }

        /* JADX INFO: renamed from: component2, reason: from getter */
        public final int getTimeout() {
            return this.timeout;
        }

        /* JADX INFO: renamed from: component3, reason: from getter */
        public final int getMaxRetries() {
            return this.maxRetries;
        }

        /* JADX INFO: renamed from: component4, reason: from getter */
        public final int getMinAvailableDiskSpace() {
            return this.minAvailableDiskSpace;
        }

        /* JADX INFO: renamed from: component5, reason: from getter */
        public final int getCacheSizeToDiskSpaceMaxPercent() {
            return this.cacheSizeToDiskSpaceMaxPercent;
        }

        public final WebAssetCacheConfig copy(int cacheSize, int timeout, int maxRetries, int minAvailableDiskSpace, int cacheSizeToDiskSpaceMaxPercent) {
            return new WebAssetCacheConfig(cacheSize, timeout, maxRetries, minAvailableDiskSpace, cacheSizeToDiskSpaceMaxPercent);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof WebAssetCacheConfig)) {
                return false;
            }
            WebAssetCacheConfig webAssetCacheConfig = (WebAssetCacheConfig) other;
            return this.cacheSize == webAssetCacheConfig.cacheSize && this.timeout == webAssetCacheConfig.timeout && this.maxRetries == webAssetCacheConfig.maxRetries && this.minAvailableDiskSpace == webAssetCacheConfig.minAvailableDiskSpace && this.cacheSizeToDiskSpaceMaxPercent == webAssetCacheConfig.cacheSizeToDiskSpaceMaxPercent;
        }

        public final int getCacheSize() {
            return this.cacheSize;
        }

        public final int getCacheSizeToDiskSpaceMaxPercent() {
            return this.cacheSizeToDiskSpaceMaxPercent;
        }

        public final int getMaxRetries() {
            return this.maxRetries;
        }

        public final int getMinAvailableDiskSpace() {
            return this.minAvailableDiskSpace;
        }

        public final int getTimeout() {
            return this.timeout;
        }

        public int hashCode() {
            return Integer.hashCode(this.cacheSizeToDiskSpaceMaxPercent) + androidx.media3.extractor.text.ttml.a.a(this.minAvailableDiskSpace, androidx.media3.extractor.text.ttml.a.a(this.maxRetries, androidx.media3.extractor.text.ttml.a.a(this.timeout, Integer.hashCode(this.cacheSize) * 31, 31), 31), 31);
        }

        public String toString() {
            StringBuilder sb = new StringBuilder("WebAssetCacheConfig(cacheSize=");
            sb.append(this.cacheSize);
            sb.append(", timeout=");
            sb.append(this.timeout);
            sb.append(", maxRetries=");
            sb.append(this.maxRetries);
            sb.append(", minAvailableDiskSpace=");
            sb.append(this.minAvailableDiskSpace);
            sb.append(", cacheSizeToDiskSpaceMaxPercent=");
            return android.support.v4.media.a.p(sb, this.cacheSizeToDiskSpaceMaxPercent, ')');
        }

        public WebAssetCacheConfig(int i2, int i3, int i4, int i5, int i6) {
            this.cacheSize = i2;
            this.timeout = i3;
            this.maxRetries = i4;
            this.minAvailableDiskSpace = i5;
            this.cacheSizeToDiskSpaceMaxPercent = i6;
        }

        public /* synthetic */ WebAssetCacheConfig(int i2, int i3, int i4, int i5, int i6, int i7, DefaultConstructorMarker defaultConstructorMarker) {
            this((i7 & 1) != 0 ? 15 : i2, (i7 & 2) != 0 ? 5000 : i3, (i7 & 4) != 0 ? 1 : i4, (i7 & 8) != 0 ? 50 : i5, (i7 & 16) != 0 ? 10 : i6);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u000b\b\u0007\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002R\u001a\u0010\u0003\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001a\u0010\t\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u0006\"\u0004\b\u000b\u0010\bR\u001a\u0010\f\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u0006\"\u0004\b\u000e\u0010\b¨\u0006\u000f"}, d2 = {"Lcom/inmobi/commons/core/configs/AdConfig$WebViewabilityConfig;", "", "()V", "impressionMinPercentageViewed", "", "getImpressionMinPercentageViewed", "()I", "setImpressionMinPercentageViewed", "(I)V", "impressionMinTimeViewed", "getImpressionMinTimeViewed", "setImpressionMinTimeViewed", "impressionPollIntervalMillis", "getImpressionPollIntervalMillis", "setImpressionPollIntervalMillis", "media_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class WebViewabilityConfig {
        private int impressionMinPercentageViewed = 50;
        private int impressionMinTimeViewed = 1000;
        private int impressionPollIntervalMillis = 1000;

        public final int getImpressionMinPercentageViewed() {
            return this.impressionMinPercentageViewed;
        }

        public final int getImpressionMinTimeViewed() {
            return this.impressionMinTimeViewed;
        }

        public final int getImpressionPollIntervalMillis() {
            return this.impressionPollIntervalMillis;
        }

        public final void setImpressionMinPercentageViewed(int i2) {
            this.impressionMinPercentageViewed = i2;
        }

        public final void setImpressionMinTimeViewed(int i2) {
            this.impressionMinTimeViewed = i2;
        }

        public final void setImpressionPollIntervalMillis(int i2) {
            this.impressionPollIntervalMillis = i2;
        }
    }

    public AdConfig(String str) {
        super(str);
        this.maxPoolSize = 10;
        this.url = DEFAULT_AD_SERVER_URL;
        this.customNwValidation = new CustomNetworkValidation();
        this.minimumRefreshInterval = 20;
        this.defaultRefreshInterval = 60;
        this.watermarkEnabled = true;
        this.mraid3 = new Mraid3Config();
        this.pingV2 = new PingsV2Config();
        C3151ne.Companion.getClass();
        C3151ne c3151ne = new C3151ne();
        c3151ne.a0();
        this.timeouts = c3151ne;
        this.imai = new ImaiConfig();
        this.rendering = new RenderingConfig();
        this.mraid = new MraidConfig();
        this.viewability = new ViewabilityConfig();
        this.vastVideo = new VastVideoConfig();
        this.assetCache = new AssetCacheConfig();
        this.contextualData = new ContextualDataConfig();
        this.adQuality = new AdQualityConfig();
        this.adReport = new AdReportConfig();
        this.audio = new AudioConfig();
        this.webAssetCache = new WebAssetCacheConfig(0, 0, 0, 0, 0, 31, null);
        this.cache = MapsKt.l(new Pair("base", new CacheConfig()), new Pair("banner", new CacheConfig()), new Pair("audio", new CacheConfig()), new Pair("int", new CacheConfig()), new Pair("native", new CacheConfig()));
    }

    public final AdQualityConfig getAdQuality() {
        return this.adQuality;
    }

    public final AdReportConfig getAdReport() {
        return this.adReport;
    }

    public final C3185q0 getAdReqDeprecateChecker() {
        if (this.adReqDeprecateChecker == null) {
            String str = this.deprecate;
            C3185q0 c3185q0 = null;
            if (str != null) {
                if (!B2.a(str)) {
                    str = null;
                }
                if (str != null) {
                    c3185q0 = new C3185q0(str);
                }
            }
            this.adReqDeprecateChecker = c3185q0;
        }
        return this.adReqDeprecateChecker;
    }

    public final boolean getApplyGzipReq() {
        return this.applyGzipReq;
    }

    /* JADX INFO: renamed from: getAssetCacheConfig, reason: from getter */
    public final AssetCacheConfig getAssetCache() {
        return this.assetCache;
    }

    public final AudioConfig getAudio() {
        return this.audio;
    }

    public final CacheConfig getCacheConfig(String adType) {
        Intrinsics.f(adType, "adType");
        CacheConfig cacheConfig = this.cache.get(adType);
        if (cacheConfig != null) {
            return cacheConfig;
        }
        CacheConfig cacheConfig2 = this.cache.get("base");
        return cacheConfig2 == null ? new CacheConfig() : cacheConfig2;
    }

    public final ContextualDataConfig getContextualData() {
        return this.contextualData;
    }

    public final CustomNetworkValidation getCustomNwValidation() {
        return this.customNwValidation;
    }

    public final int getDefaultRefreshInterval() {
        return this.defaultRefreshInterval;
    }

    public final boolean getEnableCookiesOnInAppBrowser() {
        return this.enableCookiesOnInAppBrowser;
    }

    /* JADX INFO: renamed from: getImaiConfig, reason: from getter */
    public final ImaiConfig getImai() {
        return this.imai;
    }

    public final int getMaxPoolSize() {
        return this.maxPoolSize;
    }

    public final int getMinimumRefreshInterval() {
        return this.minimumRefreshInterval;
    }

    /* JADX INFO: renamed from: getMraid3Config, reason: from getter */
    public final Mraid3Config getMraid3() {
        return this.mraid3;
    }

    /* JADX INFO: renamed from: getMraidConfig, reason: from getter */
    public final MraidConfig getMraid() {
        return this.mraid;
    }

    public final boolean getPartialTabsEnabled() {
        return this.partialTabsEnabled;
    }

    /* JADX INFO: renamed from: getPingsV2Config, reason: from getter */
    public final PingsV2Config getPingV2() {
        return this.pingV2;
    }

    public final RenderingConfig getRendering() {
        return this.rendering;
    }

    public final boolean getSkipNetCheckHB() {
        return this.skipNetCheckHB;
    }

    public final boolean getSkipNetworkValidationFeatureEnabled() {
        return this.skipNetworkValidationFeatureEnabled;
    }

    public final C3151ne getTimeouts() {
        return this.timeouts;
    }

    @Override // com.inmobi.commons.core.configs.Config
    public String getType() {
        return "ads";
    }

    public final String getUrl() {
        return this.url;
    }

    public final VastVideoConfig getVastVideo() {
        return this.vastVideo;
    }

    public final ViewabilityConfig getViewability() {
        return this.viewability;
    }

    public final boolean getWatermarkEnabled() {
        return this.watermarkEnabled;
    }

    public final WebAssetCacheConfig getWebAssetCache() {
        return this.webAssetCache;
    }

    /* JADX INFO: renamed from: isCCTEnabled, reason: from getter */
    public final boolean getCctEnabled() {
        return this.cctEnabled;
    }

    @Override // com.inmobi.commons.core.configs.Config
    public boolean isValid() {
        int i2;
        int i3;
        if (this.maxPoolSize > 0 && !D4.a(this.url) && (i2 = this.minimumRefreshInterval) >= 0 && (i3 = this.defaultRefreshInterval) >= 0 && i2 <= i3) {
            Iterator<Map.Entry<String, CacheConfig>> it = this.cache.entrySet().iterator();
            while (it.hasNext()) {
                if (!it.next().getValue().isValid()) {
                    return false;
                }
            }
            this.timeouts.a0();
            if (this.contextualData.isValid() && this.adQuality.isValid() && this.imai.isValid() && this.mraid.isValid() && this.timeouts.Z() && this.rendering.isValid() && this.vastVideo.isValid() && this.assetCache.isValid() && this.viewability.isValid() && this.audio.isValid()) {
                return true;
            }
        }
        return false;
    }

    public final void setAdQuality(AdQualityConfig adQualityConfig) {
        Intrinsics.f(adQualityConfig, "<set-?>");
        this.adQuality = adQualityConfig;
    }

    public final void setAdReport(AdReportConfig adReportConfig) {
        Intrinsics.f(adReportConfig, "<set-?>");
        this.adReport = adReportConfig;
    }

    public final void setAdReqDeprecateChecker(C3185q0 c3185q0) {
        this.adReqDeprecateChecker = c3185q0;
    }

    public final void setApplyGzipReq(boolean z2) {
        this.applyGzipReq = z2;
    }

    public final void setAudio(AudioConfig audioConfig) {
        Intrinsics.f(audioConfig, "<set-?>");
        this.audio = audioConfig;
    }

    public final void setContextualData(ContextualDataConfig contextualDataConfig) {
        Intrinsics.f(contextualDataConfig, "<set-?>");
        this.contextualData = contextualDataConfig;
    }

    public final void setCustomNwValidation(CustomNetworkValidation customNetworkValidation) {
        this.customNwValidation = customNetworkValidation;
    }

    public final void setDefaultRefreshInterval(int i2) {
        this.defaultRefreshInterval = i2;
    }

    public final void setEnableCookiesOnInAppBrowser(boolean z2) {
        this.enableCookiesOnInAppBrowser = z2;
    }

    public final void setMinimumRefreshInterval(int i2) {
        this.minimumRefreshInterval = i2;
    }

    public final void setPartialTabsEnabled(boolean z2) {
        this.partialTabsEnabled = z2;
    }

    public final void setRendering(RenderingConfig renderingConfig) {
        Intrinsics.f(renderingConfig, "<set-?>");
        this.rendering = renderingConfig;
    }

    public final void setSkipNetCheckHB(boolean z2) {
        this.skipNetCheckHB = z2;
    }

    public final void setSkipNetworkValidationFeatureEnabled(boolean z2) {
        this.skipNetworkValidationFeatureEnabled = z2;
    }

    public final void setTimeouts(C3151ne c3151ne) {
        Intrinsics.f(c3151ne, "<set-?>");
        this.timeouts = c3151ne;
    }

    public final void setUrl(String str) {
        Intrinsics.f(str, "<set-?>");
        this.url = str;
    }

    public final void setVastVideo(VastVideoConfig vastVideoConfig) {
        Intrinsics.f(vastVideoConfig, "<set-?>");
        this.vastVideo = vastVideoConfig;
    }

    public final void setViewability(ViewabilityConfig viewabilityConfig) {
        Intrinsics.f(viewabilityConfig, "<set-?>");
        this.viewability = viewabilityConfig;
    }

    public final void setWebAssetCache(WebAssetCacheConfig webAssetCacheConfig) {
        Intrinsics.f(webAssetCacheConfig, "<set-?>");
        this.webAssetCache = webAssetCacheConfig;
    }

    @Override // com.inmobi.commons.core.configs.Config
    public JSONObject toJson() {
        Companion.getClass();
        JSONObject jSONObjectA = b.a().a(this);
        return jSONObjectA == null ? new JSONObject() : jSONObjectA;
    }
}
