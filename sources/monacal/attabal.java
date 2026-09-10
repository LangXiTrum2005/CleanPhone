package monacal;

import androidx.core.app.NotificationCompat;
import asosan.formularize;
import com.google.android.gms.ads.RequestConfiguration;
import com.ironsource.C3414a2;
import com.ironsource.mediationsdk.metadata.a;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import com.mbridge.msdk.foundation.download.core.DownloadCommon;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.entity.b;
import com.mbridge.msdk.playercommon.exoplayer2.source.ExtractorMediaSource;
import com.vungle.ads.TpatError;
import com.vungle.ads.internal.model.AdAsset;
import com.vungle.ads.internal.model.ConfigPayload;
import com.vungle.ads.internal.protos.Sdk$SDKError;
import com.vungle.ads.internal.util.LogEntry;
import com.vungle.ads.internal.util.arytenoidectomy;
import cutwater.oilcan;
import cutwater.restrictive;
import cutwater.trm;
import java.io.File;
import java.net.URI;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.regex.Pattern;
import kotlinx.serialization.UnknownFieldException;
import org.jacoco.core.runtime.AgentOptions;
import org.objectweb.asm.Opcodes;
import p002kotlin.Metadata;
import p002kotlin.Pair;
import p002kotlin.Result;
import p002kotlin.Unit;
import p002kotlin.collections.CollectionsKt;
import p002kotlin.collections.dovishness;
import p002kotlin.collections.preprohormone;
import p002kotlin.jvm.internal.DefaultConstructorMarker;
import p002kotlin.jvm.internal.Intrinsics;
import p002kotlin.jvm.internal.gintrap;
import p002kotlin.jvm.internal.polloi;
import p002kotlin.text.Regex;
import p002kotlin.text.StringsKt;
import vinyl.coffeecake;
import vinyl.cultivated;
import vinyl.grimness;
import vinyl.immediately;
import vinyl.licking;
import vinyl.splinterproof;
import vinyl.vesuvio;

/* JADX INFO: compiled from: AdPayload.kt */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000¨\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010%\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0018\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\u0014\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b \b\u0007\u0018\u0000 £\u00012\u00020\u0001:\u0018¤\u0001¥\u0001¦\u0001§\u0001¨\u0001©\u0001ª\u0001«\u0001¬\u0001\u00ad\u0001®\u0001¯\u0001B%\u0012\u0010\b\u0002\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bB\u0085\u0001\b\u0017\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0010\b\u0001\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002\u0012\n\b\u0001\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\u0016\b\u0001\u0010\u000f\u001a\u0010\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000e\u0018\u00010\r\u0012\u0016\b\u0001\u0010\u0011\u001a\u0010\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000e\u0018\u00010\u0010\u0012\u0006\u0010\u0013\u001a\u00020\u0012\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\u000e\u0012\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015¢\u0006\u0004\b\u0007\u0010\u0017J%\u0010\u001b\u001a\u0010\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u0018\u0018\u00010\u001a2\u0006\u0010\u0019\u001a\u00020\u0018H\u0002¢\u0006\u0004\b\u001b\u0010\u001cJ'\u0010\u001e\u001a\u0010\u0012\u0004\u0012\u00020\u0012\u0012\u0006\u0012\u0004\u0018\u00010\t0\u001a2\b\u0010\u001d\u001a\u0004\u0018\u00010\tH\u0002¢\u0006\u0004\b\u001e\u0010\u001fJ\u0019\u0010!\u001a\u00020\u000e2\b\u0010 \u001a\u0004\u0018\u00010\u000eH\u0002¢\u0006\u0004\b!\u0010\"J%\u0010%\u001a\u00020\u000e*\u00020\u000e2\u0006\u0010#\u001a\u00020\u000e2\b\u0010$\u001a\u0004\u0018\u00010\u000eH\u0002¢\u0006\u0004\b%\u0010&J(\u0010-\u001a\u00020,2\u0006\u0010'\u001a\u00020\u00002\u0006\u0010)\u001a\u00020(2\u0006\u0010+\u001a\u00020*HÇ\u0001¢\u0006\u0004\b-\u0010.J\u000f\u0010/\u001a\u0004\u0018\u00010\u000e¢\u0006\u0004\b/\u00100J\u000f\u00101\u001a\u0004\u0018\u00010\u000e¢\u0006\u0004\b1\u00100J\u000f\u00102\u001a\u0004\u0018\u00010\u000e¢\u0006\u0004\b2\u00100J\r\u00103\u001a\u00020\t¢\u0006\u0004\b3\u00104J\r\u00105\u001a\u00020\t¢\u0006\u0004\b5\u00104J\u000f\u00107\u001a\u0004\u0018\u000106¢\u0006\u0004\b7\u00108J\u000f\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u00109J\r\u0010:\u001a\u00020\u0012¢\u0006\u0004\b:\u0010;J\r\u0010<\u001a\u00020\u0012¢\u0006\u0004\b<\u0010;J\r\u0010=\u001a\u00020\u0012¢\u0006\u0004\b=\u0010;J\u000f\u0010>\u001a\u0004\u0018\u00010\u000e¢\u0006\u0004\b>\u00100J\r\u0010?\u001a\u00020\u0012¢\u0006\u0004\b?\u0010;J\r\u0010@\u001a\u00020\u0012¢\u0006\u0004\b@\u0010;J\u0015\u0010B\u001a\u00020\u00122\u0006\u0010A\u001a\u00020\u000e¢\u0006\u0004\bB\u0010CJ\u0017\u0010F\u001a\u0004\u0018\u00010E2\u0006\u0010D\u001a\u00020\u000e¢\u0006\u0004\bF\u0010GJ\u001b\u0010H\u001a\b\u0012\u0004\u0012\u00020E0\u00022\u0006\u0010\u0019\u001a\u00020\u0018¢\u0006\u0004\bH\u0010IJ5\u0010L\u001a\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\u00022\u0006\u0010J\u001a\u00020\u000e2\n\b\u0002\u0010 \u001a\u0004\u0018\u00010\u000e2\n\b\u0002\u0010K\u001a\u0004\u0018\u00010\u000e¢\u0006\u0004\bL\u0010MJ\r\u0010N\u001a\u00020,¢\u0006\u0004\bN\u0010OJ\r\u0010P\u001a\u00020\u0012¢\u0006\u0004\bP\u0010;J\u0015\u0010Q\u001a\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\u0002¢\u0006\u0004\bQ\u0010RJ\r\u0010S\u001a\u00020\u0012¢\u0006\u0004\bS\u0010;J\u000f\u0010T\u001a\u0004\u0018\u00010\u000e¢\u0006\u0004\bT\u00100J-\u0010Y\u001a\u00020,2\u0006\u0010U\u001a\u00020\u000e2\u0006\u0010V\u001a\u00020\u000e2\u0006\u0010W\u001a\u00020\u000e2\u0006\u0010X\u001a\u00020\u000e¢\u0006\u0004\bY\u0010ZJ\r\u0010[\u001a\u00020,¢\u0006\u0004\b[\u0010OJ\u0019\u0010\\\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000e0\u0010¢\u0006\u0004\b\\\u0010]J\r\u0010_\u001a\u00020^¢\u0006\u0004\b_\u0010`J\u0017\u0010b\u001a\u00020\t2\b\u0010a\u001a\u0004\u0018\u00010\u0012¢\u0006\u0004\bb\u0010cJ\r\u0010d\u001a\u00020\u000e¢\u0006\u0004\bd\u00100J\u000f\u0010e\u001a\u0004\u0018\u00010\u000e¢\u0006\u0004\be\u00100J\u000f\u0010f\u001a\u0004\u0018\u00010\u000e¢\u0006\u0004\bf\u00100J\u000f\u0010g\u001a\u0004\u0018\u00010\u000e¢\u0006\u0004\bg\u00100J\u000f\u0010i\u001a\u0004\u0018\u00010h¢\u0006\u0004\bi\u0010jJ\r\u0010k\u001a\u00020\u0012¢\u0006\u0004\bk\u0010;J\u001d\u0010n\u001a\u00020,2\u0006\u0010l\u001a\u00020\u000e2\u0006\u0010m\u001a\u00020\u0018¢\u0006\u0004\bn\u0010oJ\u000f\u0010q\u001a\u0004\u0018\u00010p¢\u0006\u0004\bq\u0010rJ\u000f\u0010t\u001a\u0004\u0018\u00010s¢\u0006\u0004\bt\u0010uJ\u0015\u0010v\u001a\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\u0002¢\u0006\u0004\bv\u0010RJ\u0015\u0010w\u001a\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\u0002¢\u0006\u0004\bw\u0010RR\"\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00028\u0002X\u0083\u0004¢\u0006\f\n\u0004\b\u0004\u0010x\u0012\u0004\by\u0010OR\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0002X\u0083\u0004¢\u0006\f\n\u0004\b\u0006\u0010z\u0012\u0004\b{\u0010OR\u0018\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\f\u0010|R(\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000e0\r8\u0002@\u0002X\u0083\u000e¢\u0006\f\n\u0004\b\u000f\u0010}\u0012\u0004\b~\u0010OR8\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000e0\u00108\u0006@\u0006X\u0087\u000e¢\u0006\u001c\n\u0004\b\u0011\u0010\u007f\u0012\u0005\b\u0083\u0001\u0010O\u001a\u0005\b\u0080\u0001\u0010]\"\u0006\b\u0081\u0001\u0010\u0082\u0001R&\u0010\u0013\u001a\u00020\u00128\u0006@\u0006X\u0086\u000e¢\u0006\u0016\n\u0005\b\u0013\u0010\u0084\u0001\u001a\u0005\b\u0085\u0001\u0010;\"\u0006\b\u0086\u0001\u0010\u0087\u0001R3\u0010\u0089\u0001\u001a\u0005\u0018\u00010\u0088\u00018\u0006@\u0006X\u0087\u000e¢\u0006\u001f\n\u0006\b\u0089\u0001\u0010\u008a\u0001\u0012\u0005\b\u008f\u0001\u0010O\u001a\u0006\b\u008b\u0001\u0010\u008c\u0001\"\u0006\b\u008d\u0001\u0010\u008e\u0001R3\u0010\u0091\u0001\u001a\u0005\u0018\u00010\u0090\u00018\u0000@\u0000X\u0081\u000e¢\u0006\u001f\n\u0006\b\u0091\u0001\u0010\u0092\u0001\u0012\u0005\b\u0097\u0001\u0010O\u001a\u0006\b\u0093\u0001\u0010\u0094\u0001\"\u0006\b\u0095\u0001\u0010\u0096\u0001R+\u0010\u0014\u001a\u0004\u0018\u00010\u000e2\t\u0010\u0098\u0001\u001a\u0004\u0018\u00010\u000e8\u0006@BX\u0086\u000e¢\u0006\u000e\n\u0005\b\u0014\u0010\u0099\u0001\u001a\u0005\b\u009a\u0001\u00100R0\u0010\u009b\u0001\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020E0\u00108\u0000X\u0081\u0004¢\u0006\u0015\n\u0005\b\u009b\u0001\u0010\u007f\u0012\u0005\b\u009d\u0001\u0010O\u001a\u0005\b\u009c\u0001\u0010]R\u0019\u0010 \u0001\u001a\u0004\u0018\u00010\u00038BX\u0082\u0004¢\u0006\b\u001a\u0006\b\u009e\u0001\u0010\u009f\u0001R\u0018\u0010¢\u0001\u001a\u0004\u0018\u0001068BX\u0082\u0004¢\u0006\u0007\u001a\u0005\b¡\u0001\u00108¨\u0006°\u0001"}, d2 = {"Lmonacal/attabal;", "", "", "Lmonacal/attabal$competently;", b.JSON_KEY_ADS, "Lcom/vungle/ads/internal/model/ConfigPayload;", "config", "<init>", "(Ljava/util/List;Lcom/vungle/ads/internal/model/ConfigPayload;)V", "", "seen1", "", "expiryWindowStart", "Ljava/util/concurrent/ConcurrentHashMap;", "", "mraidFiles", "", "incentivizedTextSettings", "", "assetsFullyDownloaded", "indexFilePath", "Lvinyl/immediately;", "serializationConstructorMarker", "(ILjava/util/List;Lcom/vungle/ads/internal/model/ConfigPayload;Ljava/lang/Long;Ljava/util/concurrent/ConcurrentHashMap;Ljava/util/Map;ZLjava/lang/String;Lvinyl/immediately;)V", "Ljava/io/File;", "dir", "Lkotlin/Pair;", "getIndexHtmlFile", "(Ljava/io/File;)Lkotlin/Pair;", "percentage", "computeAssetRequirement", "(Ljava/lang/Integer;)Lkotlin/Pair;", "value", "valueOrEmpty", "(Ljava/lang/String;)Ljava/lang/String;", "oldValue", "newValue", "complexReplace", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;", "self", "Lfastidiously/wireman;", AgentOptions.OUTPUT, "Lbristol/beachfront;", "serialDesc", "", "write$Self", "(Lmonacal/attabal;Lfastidiously/wireman;Lbristol/beachfront;)V", "placementId", "()Ljava/lang/String;", "eventId", "advAppId", "adWidth", "()I", "adHeight", "Lmonacal/attabal$dern;", "adUnit", "()Lmonacal/attabal$dern;", "()Lcom/vungle/ads/internal/model/ConfigPayload;", "adLoadOptimizationEnabled", "()Z", "isPartialDownloadEnabled", "isAdPoddingEnabled", "getExperiments", "omEnabled", "isClickCoordinatesTrackingEnabled", "failingUrl", "isCriticalAsset", "(Ljava/lang/String;)Z", "remoteUrl", "Lcom/vungle/ads/internal/model/AdAsset;", "getLocalPartialDownloadAssets", "(Ljava/lang/String;)Lcom/vungle/ads/internal/model/AdAsset;", "getDownloadableAssets", "(Ljava/io/File;)Ljava/util/List;", NotificationCompat.CATEGORY_EVENT, "secondValue", "getTpatUrls", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/util/List;", "recordExpiryWindowStart", "()V", "hasExpired", "getWinNotifications", "()Ljava/util/List;", "isNativeTemplateType", "templateType", "title", "body", "keepWatching", "close", "setIncentivizedText", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "setAssetFullyDownloaded", "getMRAIDArgsInMap", "()Ljava/util/Map;", "Lcutwater/trm;", "createMRAIDArgs", "()Lcutwater/trm;", "incentivized", "getShowCloseDelay", "(Ljava/lang/Boolean;)I", "getCreativeId", "getAdSource", "getMediationName", "getViewMasterVersion", "Lmonacal/attabal$formularize;", "getWebViewSettings", "()Lmonacal/attabal$formularize;", "usePreloading", "adIdentifier", "localFile", "updateAdAssetPath", "(Ljava/lang/String;Ljava/io/File;)V", "Lmonacal/attabal$wireman;", "getCSBResponse", "()Lmonacal/attabal$wireman;", "", "getWinningPrice", "()Ljava/lang/Double;", "getWinUrls", "getLossUrls", "Ljava/util/List;", "getAds$annotations", "Lcom/vungle/ads/internal/model/ConfigPayload;", "getConfig$annotations", "Ljava/lang/Long;", "Ljava/util/concurrent/ConcurrentHashMap;", "getMraidFiles$annotations", "Ljava/util/Map;", "getIncentivizedTextSettings", "setIncentivizedTextSettings", "(Ljava/util/Map;)V", "getIncentivizedTextSettings$annotations", "Z", "getAssetsFullyDownloaded", "setAssetsFullyDownloaded", "(Z)V", "Lcom/vungle/ads/saneness;", "adConfig", "Lcom/vungle/ads/saneness;", "getAdConfig", "()Lcom/vungle/ads/saneness;", "setAdConfig", "(Lcom/vungle/ads/saneness;)V", "getAdConfig$annotations", "Lcom/vungle/ads/internal/util/kowloon;", "logEntry", "Lcom/vungle/ads/internal/util/kowloon;", "getLogEntry$vungle_ads_release", "()Lcom/vungle/ads/internal/util/kowloon;", "setLogEntry$vungle_ads_release", "(Lcom/vungle/ads/internal/util/kowloon;)V", "getLogEntry$vungle_ads_release$annotations", "<set-?>", "Ljava/lang/String;", "getIndexFilePath", "partialDownloadAssets", "getPartialDownloadAssets$vungle_ads_release", "getPartialDownloadAssets$vungle_ads_release$annotations", "getAd", "()Lmonacal/attabal$competently;", "ad", "getAdMarkup", "adMarkup", "Companion", "attabal", "saneness", "dern", "wireman", "marial", "beachfront", "competently", "impromptu", "taiyuan", "cutely", "apical", "formularize", "vungle-ads_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
@formularize
public final class attabal {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final String FILE_SCHEME = "file://";
    public static final String INCENTIVIZED_BODY_TEXT = "INCENTIVIZED_BODY_TEXT";
    public static final String INCENTIVIZED_CLOSE_TEXT = "INCENTIVIZED_CLOSE_TEXT";
    public static final String INCENTIVIZED_CONTINUE_TEXT = "INCENTIVIZED_CONTINUE_TEXT";
    public static final String INCENTIVIZED_TITLE_TEXT = "INCENTIVIZED_TITLE_TEXT";
    public static final String KEY_VM = "vmURL";
    private static final String TAG = "AdPayload";
    private static final String UNKNOWN = "unknown";
    private com.vungle.ads.saneness adConfig;
    private final List<PlacementAdUnit> ads;
    private boolean assetsFullyDownloaded;
    private final ConfigPayload config;
    private Long expiryWindowStart;
    private Map<String, String> incentivizedTextSettings;
    private String indexFilePath;
    private LogEntry logEntry;
    private ConcurrentHashMap<String, String> mraidFiles;
    private final Map<String, AdAsset> partialDownloadAssets;

    /* JADX INFO: renamed from: monacal.attabal$apical, reason: from toString */
    /* JADX INFO: compiled from: AdPayload.kt */
    @Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0018\b\u0087\b\u0018\u0000 '2\u00020\u0001:\u0002()B\u001f\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007B3\b\u0017\u0012\u0006\u0010\t\u001a\u00020\b\u0012\n\b\u0001\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0001\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u0006\u0010\fJ(\u0010\u0013\u001a\u00020\u00122\u0006\u0010\r\u001a\u00020\u00002\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0010HÇ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0012\u0010\u0015\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0015\u0010\u0016J\u0012\u0010\u0017\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u0017\u0010\u0018J(\u0010\u0019\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÆ\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u001b\u0010\u0018J\u0010\u0010\u001c\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\u001c\u0010\u001dJ\u001a\u0010\u001f\u001a\u00020\u00022\b\u0010\u001e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001f\u0010 R\"\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0003\u0010!\u0012\u0004\b\"\u0010#\u001a\u0004\b\u0003\u0010\u0016R\"\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0005\u0010$\u0012\u0004\b&\u0010#\u001a\u0004\b%\u0010\u0018¨\u0006*"}, d2 = {"Lmonacal/attabal$apical;", "", "", "isEnabled", "", "extraVast", "<init>", "(Ljava/lang/Boolean;Ljava/lang/String;)V", "", "seen1", "Lvinyl/immediately;", "serializationConstructorMarker", "(ILjava/lang/Boolean;Ljava/lang/String;Lvinyl/immediately;)V", "self", "Lfastidiously/wireman;", AgentOptions.OUTPUT, "Lbristol/beachfront;", "serialDesc", "", "write$Self", "(Lmonacal/attabal$apical;Lfastidiously/wireman;Lbristol/beachfront;)V", "component1", "()Ljava/lang/Boolean;", "component2", "()Ljava/lang/String;", "copy", "(Ljava/lang/Boolean;Ljava/lang/String;)Lmonacal/attabal$apical;", "toString", "hashCode", "()I", C3414a2.d, "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/Boolean;", "isEnabled$annotations", "()V", "Ljava/lang/String;", "getExtraVast", "getExtraVast$annotations", "Companion", "attabal", "saneness", "vungle-ads_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
    @formularize
    public static final /* data */ class ViewAbilityInfo {

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private final String extraVast;
        private final Boolean isEnabled;

        /* JADX INFO: renamed from: monacal.attabal$apical$attabal, reason: collision with other inner class name */
        /* JADX INFO: compiled from: AdPayload.kt */
        @Metadata(d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001a\u0010\u0007\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00060\u0005HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0018\u0010\u000b\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ \u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0016\u001a\u00020\u00138VXÖ\u0005¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u0017"}, d2 = {"com/vungle/ads/internal/model/AdPayload.ViewAbilityInfo.$serializer", "Lvinyl/grimness;", "Lmonacal/attabal$apical;", "<init>", "()V", "", "Lasosan/wireman;", "childSerializers", "()[Lasosan/wireman;", "Lfastidiously/marial;", "decoder", "deserialize", "(Lfastidiously/marial;)Lmonacal/attabal$apical;", "Lfastidiously/beachfront;", "encoder", "value", "", "serialize", "(Lfastidiously/beachfront;Lmonacal/attabal$apical;)V", "Lbristol/beachfront;", "getDescriptor", "()Lbristol/beachfront;", "descriptor", "vungle-ads_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
        @patroclinal.wireman
        public static final class C0733attabal implements grimness<ViewAbilityInfo> {
            public static final C0733attabal INSTANCE;
            public static final /* synthetic */ bristol.beachfront descriptor;

            static {
                C0733attabal c0733attabal = new C0733attabal();
                INSTANCE = c0733attabal;
                vesuvio vesuvioVar = new vesuvio("com.vungle.ads.internal.model.AdPayload.ViewAbilityInfo", c0733attabal, 2);
                vesuvioVar.kowloon("is_enabled", true);
                vesuvioVar.kowloon("extra_vast", true);
                descriptor = vesuvioVar;
            }

            private C0733attabal() {
            }

            @Override // vinyl.grimness
            public asosan.wireman<?>[] childSerializers() {
                return new asosan.wireman[]{defendable.attabal.graveside(vinyl.taiyuan.f39500attabal), defendable.attabal.graveside(licking.f39425attabal)};
            }

            @Override // asosan.wireman, asosan.impassible, asosan.dern
            public bristol.beachfront getDescriptor() {
                return descriptor;
            }

            @Override // vinyl.grimness
            public asosan.wireman<?>[] typeParametersSerializers() {
                return grimness.attabal.attabal(this);
            }

            @Override // asosan.dern
            public ViewAbilityInfo deserialize(fastidiously.marial decoder) {
                Object objSealless;
                Object objSealless2;
                int i;
                Intrinsics.checkNotNullParameter(decoder, "decoder");
                bristol.beachfront descriptor2 = getDescriptor();
                fastidiously.dern dernVarSaneness = decoder.saneness(descriptor2);
                immediately immediatelyVar = null;
                if (dernVarSaneness.triweekly()) {
                    objSealless = dernVarSaneness.sealless(descriptor2, 0, vinyl.taiyuan.f39500attabal, null);
                    objSealless2 = dernVarSaneness.sealless(descriptor2, 1, licking.f39425attabal, null);
                    i = 3;
                } else {
                    boolean z = true;
                    int i2 = 0;
                    objSealless = null;
                    Object objSealless3 = null;
                    while (z) {
                        int iImpassible = dernVarSaneness.impassible(descriptor2);
                        if (iImpassible == -1) {
                            z = false;
                        } else if (iImpassible == 0) {
                            objSealless = dernVarSaneness.sealless(descriptor2, 0, vinyl.taiyuan.f39500attabal, objSealless);
                            i2 |= 1;
                        } else {
                            if (iImpassible != 1) {
                                throw new UnknownFieldException(iImpassible);
                            }
                            objSealless3 = dernVarSaneness.sealless(descriptor2, 1, licking.f39425attabal, objSealless3);
                            i2 |= 2;
                        }
                    }
                    objSealless2 = objSealless3;
                    i = i2;
                }
                dernVarSaneness.dern(descriptor2);
                return new ViewAbilityInfo(i, (Boolean) objSealless, (String) objSealless2, immediatelyVar);
            }

            @Override // asosan.impassible
            public void serialize(fastidiously.beachfront encoder, ViewAbilityInfo value) {
                Intrinsics.checkNotNullParameter(encoder, "encoder");
                Intrinsics.checkNotNullParameter(value, "value");
                bristol.beachfront descriptor2 = getDescriptor();
                fastidiously.wireman wiremanVarSaneness = encoder.saneness(descriptor2);
                ViewAbilityInfo.write$Self(value, wiremanVarSaneness, descriptor2);
                wiremanVarSaneness.dern(descriptor2);
            }
        }

        /* JADX INFO: renamed from: monacal.attabal$apical$saneness, reason: from kotlin metadata */
        /* JADX INFO: compiled from: AdPayload.kt */
        @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0016\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lmonacal/attabal$apical$saneness;", "", "<init>", "()V", "Lasosan/wireman;", "Lmonacal/attabal$apical;", "serializer", "()Lasosan/wireman;", "vungle-ads_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final asosan.wireman<ViewAbilityInfo> serializer() {
                return C0733attabal.INSTANCE;
            }

            private Companion() {
            }
        }

        public ViewAbilityInfo() {
            this((Boolean) null, (String) (0 == true ? 1 : 0), 3, (DefaultConstructorMarker) (0 == true ? 1 : 0));
        }

        public static /* synthetic */ ViewAbilityInfo copy$default(ViewAbilityInfo viewAbilityInfo, Boolean bool, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                bool = viewAbilityInfo.isEnabled;
            }
            if ((i & 2) != 0) {
                str = viewAbilityInfo.extraVast;
            }
            return viewAbilityInfo.copy(bool, str);
        }

        public static final void write$Self(ViewAbilityInfo self, fastidiously.wireman output, bristol.beachfront serialDesc) {
            Intrinsics.checkNotNullParameter(self, "self");
            Intrinsics.checkNotNullParameter(output, "output");
            Intrinsics.checkNotNullParameter(serialDesc, "serialDesc");
            if (output.cuirassed(serialDesc, 0) || self.isEnabled != null) {
                output.taiyuan(serialDesc, 0, vinyl.taiyuan.f39500attabal, self.isEnabled);
            }
            if (!output.cuirassed(serialDesc, 1) && self.extraVast == null) {
                return;
            }
            output.taiyuan(serialDesc, 1, licking.f39425attabal, self.extraVast);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final Boolean getIsEnabled() {
            return this.isEnabled;
        }

        /* JADX INFO: renamed from: component2, reason: from getter */
        public final String getExtraVast() {
            return this.extraVast;
        }

        public final ViewAbilityInfo copy(Boolean isEnabled, String extraVast) {
            return new ViewAbilityInfo(isEnabled, extraVast);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof ViewAbilityInfo)) {
                return false;
            }
            ViewAbilityInfo viewAbilityInfo = (ViewAbilityInfo) other;
            return Intrinsics.wireman(this.isEnabled, viewAbilityInfo.isEnabled) && Intrinsics.wireman(this.extraVast, viewAbilityInfo.extraVast);
        }

        public final String getExtraVast() {
            return this.extraVast;
        }

        public int hashCode() {
            Boolean bool = this.isEnabled;
            int iHashCode = (bool == null ? 0 : bool.hashCode()) * 31;
            String str = this.extraVast;
            return iHashCode + (str != null ? str.hashCode() : 0);
        }

        public final Boolean isEnabled() {
            return this.isEnabled;
        }

        public String toString() {
            return "ViewAbilityInfo(isEnabled=" + this.isEnabled + ", extraVast=" + this.extraVast + ')';
        }

        @patroclinal.wireman
        public /* synthetic */ ViewAbilityInfo(int i, Boolean bool, String str, immediately immediatelyVar) {
            if ((i & 1) == 0) {
                this.isEnabled = null;
            } else {
                this.isEnabled = bool;
            }
            if ((i & 2) == 0) {
                this.extraVast = null;
            } else {
                this.extraVast = str;
            }
        }

        public ViewAbilityInfo(Boolean bool, String str) {
            this.isEnabled = bool;
            this.extraVast = str;
        }

        public /* synthetic */ ViewAbilityInfo(Boolean bool, String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : bool, (i & 2) != 0 ? null : str);
        }

        public static /* synthetic */ void getExtraVast$annotations() {
        }

        public static /* synthetic */ void isEnabled$annotations() {
        }
    }

    /* JADX INFO: renamed from: monacal.attabal$attabal, reason: collision with other inner class name */
    /* JADX INFO: compiled from: AdPayload.kt */
    @Metadata(d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001a\u0010\u0007\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00060\u0005HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0018\u0010\u000b\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ \u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0016\u001a\u00020\u00138VXÖ\u0005¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u0017"}, d2 = {"com/vungle/ads/internal/model/AdPayload.$serializer", "Lvinyl/grimness;", "Lmonacal/attabal;", "<init>", "()V", "", "Lasosan/wireman;", "childSerializers", "()[Lasosan/wireman;", "Lfastidiously/marial;", "decoder", "deserialize", "(Lfastidiously/marial;)Lmonacal/attabal;", "Lfastidiously/beachfront;", "encoder", "value", "", "serialize", "(Lfastidiously/beachfront;Lmonacal/attabal;)V", "Lbristol/beachfront;", "getDescriptor", "()Lbristol/beachfront;", "descriptor", "vungle-ads_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
    @patroclinal.wireman
    public static final class C0734attabal implements grimness<attabal> {
        public static final C0734attabal INSTANCE;
        public static final /* synthetic */ bristol.beachfront descriptor;

        static {
            C0734attabal c0734attabal = new C0734attabal();
            INSTANCE = c0734attabal;
            vesuvio vesuvioVar = new vesuvio("com.vungle.ads.internal.model.AdPayload", c0734attabal, 7);
            vesuvioVar.kowloon(b.JSON_KEY_ADS, true);
            vesuvioVar.kowloon("config", true);
            vesuvioVar.kowloon("expiryWindowStart", true);
            vesuvioVar.kowloon("mraidFiles", true);
            vesuvioVar.kowloon("incentivizedTextSettings", true);
            vesuvioVar.kowloon("assetsFullyDownloaded", true);
            vesuvioVar.kowloon("indexFilePath", true);
            descriptor = vesuvioVar;
        }

        private C0734attabal() {
        }

        @Override // vinyl.grimness
        public asosan.wireman<?>[] childSerializers() {
            asosan.wireman<?> wiremanVarGraveside = defendable.attabal.graveside(new vinyl.beachfront(PlacementAdUnit.C0735attabal.INSTANCE));
            asosan.wireman<?> wiremanVarGraveside2 = defendable.attabal.graveside(ConfigPayload.attabal.INSTANCE);
            asosan.wireman<?> wiremanVarGraveside3 = defendable.attabal.graveside(coffeecake.f39367attabal);
            kurbash.wireman wiremanVarSaneness = polloi.saneness(ConcurrentHashMap.class);
            licking lickingVar = licking.f39425attabal;
            return new asosan.wireman[]{wiremanVarGraveside, wiremanVarGraveside2, wiremanVarGraveside3, new asosan.saneness(wiremanVarSaneness, null, new asosan.wireman[]{lickingVar, lickingVar}), new cultivated(lickingVar, lickingVar), vinyl.taiyuan.f39500attabal, defendable.attabal.graveside(lickingVar)};
        }

        @Override // asosan.wireman, asosan.impassible, asosan.dern
        public bristol.beachfront getDescriptor() {
            return descriptor;
        }

        @Override // vinyl.grimness
        public asosan.wireman<?>[] typeParametersSerializers() {
            return grimness.attabal.attabal(this);
        }

        @Override // asosan.dern
        public attabal deserialize(fastidiously.marial decoder) {
            Object objSealless;
            Object objSealless2;
            boolean z;
            Object objSupplicat;
            Object objSupplicat2;
            int i;
            Object objSealless3;
            Object objSealless4;
            char c;
            Intrinsics.checkNotNullParameter(decoder, "decoder");
            bristol.beachfront descriptor2 = getDescriptor();
            fastidiously.dern dernVarSaneness = decoder.saneness(descriptor2);
            int i2 = 6;
            int i3 = 5;
            if (dernVarSaneness.triweekly()) {
                objSealless = dernVarSaneness.sealless(descriptor2, 0, new vinyl.beachfront(PlacementAdUnit.C0735attabal.INSTANCE), null);
                objSealless4 = dernVarSaneness.sealless(descriptor2, 1, ConfigPayload.attabal.INSTANCE, null);
                objSealless3 = dernVarSaneness.sealless(descriptor2, 2, coffeecake.f39367attabal, null);
                kurbash.wireman wiremanVarSaneness = polloi.saneness(ConcurrentHashMap.class);
                licking lickingVar = licking.f39425attabal;
                objSupplicat = dernVarSaneness.supplicat(descriptor2, 3, new asosan.saneness(wiremanVarSaneness, null, new asosan.wireman[]{lickingVar, lickingVar}), null);
                objSupplicat2 = dernVarSaneness.supplicat(descriptor2, 4, new cultivated(lickingVar, lickingVar), null);
                boolean zRotuma = dernVarSaneness.rotuma(descriptor2, 5);
                objSealless2 = dernVarSaneness.sealless(descriptor2, 6, lickingVar, null);
                i = 127;
                z = zRotuma;
            } else {
                boolean z2 = true;
                boolean zRotuma2 = false;
                int i4 = 0;
                objSealless = null;
                Object objSealless5 = null;
                Object objSealless6 = null;
                Object objSealless7 = null;
                Object objSupplicat3 = null;
                Object objSupplicat4 = null;
                while (z2) {
                    int iImpassible = dernVarSaneness.impassible(descriptor2);
                    switch (iImpassible) {
                        case -1:
                            z2 = false;
                            i3 = 5;
                            break;
                        case 0:
                            objSealless = dernVarSaneness.sealless(descriptor2, 0, new vinyl.beachfront(PlacementAdUnit.C0735attabal.INSTANCE), objSealless);
                            i4 |= 1;
                            i2 = 6;
                            i3 = 5;
                            break;
                        case 1:
                            objSealless6 = dernVarSaneness.sealless(descriptor2, 1, ConfigPayload.attabal.INSTANCE, objSealless6);
                            i4 |= 2;
                            i2 = 6;
                            i3 = 5;
                            break;
                        case 2:
                            c = 3;
                            objSealless5 = dernVarSaneness.sealless(descriptor2, 2, coffeecake.f39367attabal, objSealless5);
                            i4 |= 4;
                            i2 = 6;
                            i3 = 5;
                            break;
                        case 3:
                            kurbash.wireman wiremanVarSaneness2 = polloi.saneness(ConcurrentHashMap.class);
                            licking lickingVar2 = licking.f39425attabal;
                            c = 3;
                            objSupplicat3 = dernVarSaneness.supplicat(descriptor2, 3, new asosan.saneness(wiremanVarSaneness2, null, new asosan.wireman[]{lickingVar2, lickingVar2}), objSupplicat3);
                            i4 |= 8;
                            i2 = 6;
                            i3 = 5;
                            break;
                        case 4:
                            licking lickingVar3 = licking.f39425attabal;
                            objSupplicat4 = dernVarSaneness.supplicat(descriptor2, 4, new cultivated(lickingVar3, lickingVar3), objSupplicat4);
                            i4 |= 16;
                            i2 = 6;
                            break;
                        case 5:
                            zRotuma2 = dernVarSaneness.rotuma(descriptor2, i3);
                            i4 |= 32;
                            break;
                        case 6:
                            objSealless7 = dernVarSaneness.sealless(descriptor2, i2, licking.f39425attabal, objSealless7);
                            i4 |= 64;
                            break;
                        default:
                            throw new UnknownFieldException(iImpassible);
                    }
                }
                objSealless2 = objSealless7;
                z = zRotuma2;
                objSupplicat = objSupplicat3;
                objSupplicat2 = objSupplicat4;
                i = i4;
                objSealless3 = objSealless5;
                objSealless4 = objSealless6;
            }
            dernVarSaneness.dern(descriptor2);
            return new attabal(i, (List) objSealless, (ConfigPayload) objSealless4, (Long) objSealless3, (ConcurrentHashMap) objSupplicat, (Map) objSupplicat2, z, (String) objSealless2, null);
        }

        @Override // asosan.impassible
        public void serialize(fastidiously.beachfront encoder, attabal value) {
            Intrinsics.checkNotNullParameter(encoder, "encoder");
            Intrinsics.checkNotNullParameter(value, "value");
            bristol.beachfront descriptor2 = getDescriptor();
            fastidiously.wireman wiremanVarSaneness = encoder.saneness(descriptor2);
            attabal.write$Self(value, wiremanVarSaneness, descriptor2);
            wiremanVarSaneness.dern(descriptor2);
        }
    }

    /* JADX INFO: renamed from: monacal.attabal$beachfront, reason: from kotlin metadata */
    /* JADX INFO: compiled from: AdPayload.kt */
    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\n\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0016\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¢\u0006\u0004\b\u0006\u0010\u0007R\u0014\u0010\t\u001a\u00020\b8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\t\u0010\nR\u0014\u0010\u000b\u001a\u00020\b8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000b\u0010\nR\u0014\u0010\f\u001a\u00020\b8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\f\u0010\nR\u0014\u0010\r\u001a\u00020\b8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\r\u0010\nR\u0014\u0010\u000e\u001a\u00020\b8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000e\u0010\nR\u0014\u0010\u000f\u001a\u00020\b8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000f\u0010\nR\u0014\u0010\u0010\u001a\u00020\b8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0010\u0010\nR\u0014\u0010\u0011\u001a\u00020\b8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0011\u0010\n¨\u0006\u0012"}, d2 = {"Lmonacal/attabal$beachfront;", "", "<init>", "()V", "Lasosan/wireman;", "Lmonacal/attabal;", "serializer", "()Lasosan/wireman;", "", "FILE_SCHEME", "Ljava/lang/String;", attabal.INCENTIVIZED_BODY_TEXT, attabal.INCENTIVIZED_CLOSE_TEXT, attabal.INCENTIVIZED_CONTINUE_TEXT, attabal.INCENTIVIZED_TITLE_TEXT, "KEY_VM", "TAG", "UNKNOWN", "vungle-ads_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final asosan.wireman<attabal> serializer() {
            return C0734attabal.INSTANCE;
        }

        private Companion() {
        }
    }

    /* JADX INFO: renamed from: monacal.attabal$competently, reason: from toString */
    /* JADX INFO: compiled from: AdPayload.kt */
    @Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0002\b\u0010\b\u0087\b\u0018\u0000 02\u00020\u0001:\u000212B+\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tB?\b\u0017\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\n\b\u0001\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0001\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0001\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\b\u0010\u000eJ(\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u000f\u001a\u00020\u00002\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u0012HÇ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0012\u0010\u0017\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0017\u0010\u0018J\u0012\u0010\u0019\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u001aJ\u0012\u0010\u001b\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u001cJ4\u0010\u001d\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006HÆ\u0001¢\u0006\u0004\b\u001d\u0010\u001eJ\u0010\u0010\u001f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001f\u0010\u0018J\u0010\u0010 \u001a\u00020\nHÖ\u0001¢\u0006\u0004\b \u0010!J\u001a\u0010$\u001a\u00020#2\b\u0010\"\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b$\u0010%R\"\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0003\u0010&\u0012\u0004\b(\u0010)\u001a\u0004\b'\u0010\u0018R\"\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0005\u0010*\u0012\u0004\b,\u0010)\u001a\u0004\b+\u0010\u001aR\"\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0007\u0010-\u0012\u0004\b/\u0010)\u001a\u0004\b.\u0010\u001c¨\u00063"}, d2 = {"Lmonacal/attabal$competently;", "", "", "placementReferenceId", "Lmonacal/attabal$dern;", "adMarkup", "Lmonacal/attabal$wireman;", "csb", "<init>", "(Ljava/lang/String;Lmonacal/attabal$dern;Lmonacal/attabal$wireman;)V", "", "seen1", "Lvinyl/immediately;", "serializationConstructorMarker", "(ILjava/lang/String;Lmonacal/attabal$dern;Lmonacal/attabal$wireman;Lvinyl/immediately;)V", "self", "Lfastidiously/wireman;", AgentOptions.OUTPUT, "Lbristol/beachfront;", "serialDesc", "", "write$Self", "(Lmonacal/attabal$competently;Lfastidiously/wireman;Lbristol/beachfront;)V", "component1", "()Ljava/lang/String;", "component2", "()Lmonacal/attabal$dern;", "component3", "()Lmonacal/attabal$wireman;", "copy", "(Ljava/lang/String;Lmonacal/attabal$dern;Lmonacal/attabal$wireman;)Lmonacal/attabal$competently;", "toString", "hashCode", "()I", C3414a2.d, "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getPlacementReferenceId", "getPlacementReferenceId$annotations", "()V", "Lmonacal/attabal$dern;", "getAdMarkup", "getAdMarkup$annotations", "Lmonacal/attabal$wireman;", "getCsb", "getCsb$annotations", "Companion", "attabal", "saneness", "vungle-ads_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
    @formularize
    public static final /* data */ class PlacementAdUnit {

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private final AdUnit adMarkup;
        private final CSBResponse csb;
        private final String placementReferenceId;

        /* JADX INFO: renamed from: monacal.attabal$competently$attabal, reason: collision with other inner class name */
        /* JADX INFO: compiled from: AdPayload.kt */
        @Metadata(d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001a\u0010\u0007\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00060\u0005HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0018\u0010\u000b\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ \u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0016\u001a\u00020\u00138VXÖ\u0005¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u0017"}, d2 = {"com/vungle/ads/internal/model/AdPayload.PlacementAdUnit.$serializer", "Lvinyl/grimness;", "Lmonacal/attabal$competently;", "<init>", "()V", "", "Lasosan/wireman;", "childSerializers", "()[Lasosan/wireman;", "Lfastidiously/marial;", "decoder", "deserialize", "(Lfastidiously/marial;)Lmonacal/attabal$competently;", "Lfastidiously/beachfront;", "encoder", "value", "", "serialize", "(Lfastidiously/beachfront;Lmonacal/attabal$competently;)V", "Lbristol/beachfront;", "getDescriptor", "()Lbristol/beachfront;", "descriptor", "vungle-ads_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
        @patroclinal.wireman
        public static final class C0735attabal implements grimness<PlacementAdUnit> {
            public static final C0735attabal INSTANCE;
            public static final /* synthetic */ bristol.beachfront descriptor;

            static {
                C0735attabal c0735attabal = new C0735attabal();
                INSTANCE = c0735attabal;
                vesuvio vesuvioVar = new vesuvio("com.vungle.ads.internal.model.AdPayload.PlacementAdUnit", c0735attabal, 3);
                vesuvioVar.kowloon("placement_reference_id", true);
                vesuvioVar.kowloon("ad_markup", true);
                vesuvioVar.kowloon("csb", true);
                descriptor = vesuvioVar;
            }

            private C0735attabal() {
            }

            @Override // vinyl.grimness
            public asosan.wireman<?>[] childSerializers() {
                return new asosan.wireman[]{defendable.attabal.graveside(licking.f39425attabal), defendable.attabal.graveside(AdUnit.C0737attabal.INSTANCE), defendable.attabal.graveside(CSBResponse.C0743attabal.INSTANCE)};
            }

            @Override // asosan.wireman, asosan.impassible, asosan.dern
            public bristol.beachfront getDescriptor() {
                return descriptor;
            }

            @Override // vinyl.grimness
            public asosan.wireman<?>[] typeParametersSerializers() {
                return grimness.attabal.attabal(this);
            }

            @Override // asosan.dern
            public PlacementAdUnit deserialize(fastidiously.marial decoder) {
                int i;
                Object objSealless;
                Object objSealless2;
                Object objSealless3;
                Intrinsics.checkNotNullParameter(decoder, "decoder");
                bristol.beachfront descriptor2 = getDescriptor();
                fastidiously.dern dernVarSaneness = decoder.saneness(descriptor2);
                Object objSealless4 = null;
                if (dernVarSaneness.triweekly()) {
                    objSealless = dernVarSaneness.sealless(descriptor2, 0, licking.f39425attabal, null);
                    objSealless2 = dernVarSaneness.sealless(descriptor2, 1, AdUnit.C0737attabal.INSTANCE, null);
                    objSealless3 = dernVarSaneness.sealless(descriptor2, 2, CSBResponse.C0743attabal.INSTANCE, null);
                    i = 7;
                } else {
                    boolean z = true;
                    int i2 = 0;
                    Object objSealless5 = null;
                    Object objSealless6 = null;
                    while (z) {
                        int iImpassible = dernVarSaneness.impassible(descriptor2);
                        if (iImpassible == -1) {
                            z = false;
                        } else if (iImpassible == 0) {
                            objSealless4 = dernVarSaneness.sealless(descriptor2, 0, licking.f39425attabal, objSealless4);
                            i2 |= 1;
                        } else if (iImpassible == 1) {
                            objSealless5 = dernVarSaneness.sealless(descriptor2, 1, AdUnit.C0737attabal.INSTANCE, objSealless5);
                            i2 |= 2;
                        } else {
                            if (iImpassible != 2) {
                                throw new UnknownFieldException(iImpassible);
                            }
                            objSealless6 = dernVarSaneness.sealless(descriptor2, 2, CSBResponse.C0743attabal.INSTANCE, objSealless6);
                            i2 |= 4;
                        }
                    }
                    Object obj = objSealless4;
                    i = i2;
                    objSealless = obj;
                    objSealless2 = objSealless5;
                    objSealless3 = objSealless6;
                }
                dernVarSaneness.dern(descriptor2);
                return new PlacementAdUnit(i, (String) objSealless, (AdUnit) objSealless2, (CSBResponse) objSealless3, (immediately) null);
            }

            @Override // asosan.impassible
            public void serialize(fastidiously.beachfront encoder, PlacementAdUnit value) {
                Intrinsics.checkNotNullParameter(encoder, "encoder");
                Intrinsics.checkNotNullParameter(value, "value");
                bristol.beachfront descriptor2 = getDescriptor();
                fastidiously.wireman wiremanVarSaneness = encoder.saneness(descriptor2);
                PlacementAdUnit.write$Self(value, wiremanVarSaneness, descriptor2);
                wiremanVarSaneness.dern(descriptor2);
            }
        }

        /* JADX INFO: renamed from: monacal.attabal$competently$saneness, reason: from kotlin metadata */
        /* JADX INFO: compiled from: AdPayload.kt */
        @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0016\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lmonacal/attabal$competently$saneness;", "", "<init>", "()V", "Lasosan/wireman;", "Lmonacal/attabal$competently;", "serializer", "()Lasosan/wireman;", "vungle-ads_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final asosan.wireman<PlacementAdUnit> serializer() {
                return C0735attabal.INSTANCE;
            }

            private Companion() {
            }
        }

        public PlacementAdUnit() {
            this((String) null, (AdUnit) null, (CSBResponse) null, 7, (DefaultConstructorMarker) null);
        }

        public static /* synthetic */ PlacementAdUnit copy$default(PlacementAdUnit placementAdUnit, String str, AdUnit adUnit, CSBResponse cSBResponse, int i, Object obj) {
            if ((i & 1) != 0) {
                str = placementAdUnit.placementReferenceId;
            }
            if ((i & 2) != 0) {
                adUnit = placementAdUnit.adMarkup;
            }
            if ((i & 4) != 0) {
                cSBResponse = placementAdUnit.csb;
            }
            return placementAdUnit.copy(str, adUnit, cSBResponse);
        }

        public static final void write$Self(PlacementAdUnit self, fastidiously.wireman output, bristol.beachfront serialDesc) {
            Intrinsics.checkNotNullParameter(self, "self");
            Intrinsics.checkNotNullParameter(output, "output");
            Intrinsics.checkNotNullParameter(serialDesc, "serialDesc");
            if (output.cuirassed(serialDesc, 0) || self.placementReferenceId != null) {
                output.taiyuan(serialDesc, 0, licking.f39425attabal, self.placementReferenceId);
            }
            if (output.cuirassed(serialDesc, 1) || self.adMarkup != null) {
                output.taiyuan(serialDesc, 1, AdUnit.C0737attabal.INSTANCE, self.adMarkup);
            }
            if (!output.cuirassed(serialDesc, 2) && self.csb == null) {
                return;
            }
            output.taiyuan(serialDesc, 2, CSBResponse.C0743attabal.INSTANCE, self.csb);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final String getPlacementReferenceId() {
            return this.placementReferenceId;
        }

        /* JADX INFO: renamed from: component2, reason: from getter */
        public final AdUnit getAdMarkup() {
            return this.adMarkup;
        }

        /* JADX INFO: renamed from: component3, reason: from getter */
        public final CSBResponse getCsb() {
            return this.csb;
        }

        public final PlacementAdUnit copy(String placementReferenceId, AdUnit adMarkup, CSBResponse csb) {
            return new PlacementAdUnit(placementReferenceId, adMarkup, csb);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof PlacementAdUnit)) {
                return false;
            }
            PlacementAdUnit placementAdUnit = (PlacementAdUnit) other;
            return Intrinsics.wireman(this.placementReferenceId, placementAdUnit.placementReferenceId) && Intrinsics.wireman(this.adMarkup, placementAdUnit.adMarkup) && Intrinsics.wireman(this.csb, placementAdUnit.csb);
        }

        public final AdUnit getAdMarkup() {
            return this.adMarkup;
        }

        public final CSBResponse getCsb() {
            return this.csb;
        }

        public final String getPlacementReferenceId() {
            return this.placementReferenceId;
        }

        public int hashCode() {
            String str = this.placementReferenceId;
            int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
            AdUnit adUnit = this.adMarkup;
            int iHashCode2 = (iHashCode + (adUnit == null ? 0 : adUnit.hashCode())) * 31;
            CSBResponse cSBResponse = this.csb;
            return iHashCode2 + (cSBResponse != null ? cSBResponse.hashCode() : 0);
        }

        public String toString() {
            return "PlacementAdUnit(placementReferenceId=" + this.placementReferenceId + ", adMarkup=" + this.adMarkup + ", csb=" + this.csb + ')';
        }

        @patroclinal.wireman
        public /* synthetic */ PlacementAdUnit(int i, String str, AdUnit adUnit, CSBResponse cSBResponse, immediately immediatelyVar) {
            if ((i & 1) == 0) {
                this.placementReferenceId = null;
            } else {
                this.placementReferenceId = str;
            }
            if ((i & 2) == 0) {
                this.adMarkup = null;
            } else {
                this.adMarkup = adUnit;
            }
            if ((i & 4) == 0) {
                this.csb = null;
            } else {
                this.csb = cSBResponse;
            }
        }

        public PlacementAdUnit(String str, AdUnit adUnit, CSBResponse cSBResponse) {
            this.placementReferenceId = str;
            this.adMarkup = adUnit;
            this.csb = cSBResponse;
        }

        public /* synthetic */ PlacementAdUnit(String str, AdUnit adUnit, CSBResponse cSBResponse, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : adUnit, (i & 4) != 0 ? null : cSBResponse);
        }

        public static /* synthetic */ void getAdMarkup$annotations() {
        }

        public static /* synthetic */ void getCsb$annotations() {
        }

        public static /* synthetic */ void getPlacementReferenceId$annotations() {
        }
    }

    /* JADX INFO: renamed from: monacal.attabal$cutely, reason: from toString */
    /* JADX INFO: compiled from: AdPayload.kt */
    @Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\b\b\u0087\b\u0018\u0000 \"2\u00020\u0001:\u0002#$B\u0013\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005B%\b\u0017\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\u0004\u0010\nJ(\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000b\u001a\u00020\u00002\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000eHÇ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0012\u0010\u0013\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0013\u0010\u0014J\u001c\u0010\u0015\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0018\u001a\u00020\u0017HÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u001a\u0010\u001e\u001a\u00020\u001d2\b\u0010\u001c\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001e\u0010\u001fR\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010 \u001a\u0004\b!\u0010\u0014¨\u0006%"}, d2 = {"Lmonacal/attabal$cutely;", "", "Lmonacal/attabal$apical;", "om", "<init>", "(Lmonacal/attabal$apical;)V", "", "seen1", "Lvinyl/immediately;", "serializationConstructorMarker", "(ILmonacal/attabal$apical;Lvinyl/immediately;)V", "self", "Lfastidiously/wireman;", AgentOptions.OUTPUT, "Lbristol/beachfront;", "serialDesc", "", "write$Self", "(Lmonacal/attabal$cutely;Lfastidiously/wireman;Lbristol/beachfront;)V", "component1", "()Lmonacal/attabal$apical;", "copy", "(Lmonacal/attabal$apical;)Lmonacal/attabal$cutely;", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", C3414a2.d, "", "equals", "(Ljava/lang/Object;)Z", "Lmonacal/attabal$apical;", "getOm", "Companion", "attabal", "saneness", "vungle-ads_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
    @formularize
    public static final /* data */ class ViewAbility {

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private final ViewAbilityInfo om;

        /* JADX INFO: renamed from: monacal.attabal$cutely$attabal, reason: collision with other inner class name */
        /* JADX INFO: compiled from: AdPayload.kt */
        @Metadata(d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001a\u0010\u0007\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00060\u0005HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0018\u0010\u000b\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ \u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0016\u001a\u00020\u00138VXÖ\u0005¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u0017"}, d2 = {"com/vungle/ads/internal/model/AdPayload.ViewAbility.$serializer", "Lvinyl/grimness;", "Lmonacal/attabal$cutely;", "<init>", "()V", "", "Lasosan/wireman;", "childSerializers", "()[Lasosan/wireman;", "Lfastidiously/marial;", "decoder", "deserialize", "(Lfastidiously/marial;)Lmonacal/attabal$cutely;", "Lfastidiously/beachfront;", "encoder", "value", "", "serialize", "(Lfastidiously/beachfront;Lmonacal/attabal$cutely;)V", "Lbristol/beachfront;", "getDescriptor", "()Lbristol/beachfront;", "descriptor", "vungle-ads_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
        @patroclinal.wireman
        public static final class C0736attabal implements grimness<ViewAbility> {
            public static final C0736attabal INSTANCE;
            public static final /* synthetic */ bristol.beachfront descriptor;

            static {
                C0736attabal c0736attabal = new C0736attabal();
                INSTANCE = c0736attabal;
                vesuvio vesuvioVar = new vesuvio("com.vungle.ads.internal.model.AdPayload.ViewAbility", c0736attabal, 1);
                vesuvioVar.kowloon("om", true);
                descriptor = vesuvioVar;
            }

            private C0736attabal() {
            }

            @Override // vinyl.grimness
            public asosan.wireman<?>[] childSerializers() {
                return new asosan.wireman[]{defendable.attabal.graveside(ViewAbilityInfo.C0733attabal.INSTANCE)};
            }

            @Override // asosan.wireman, asosan.impassible, asosan.dern
            public bristol.beachfront getDescriptor() {
                return descriptor;
            }

            @Override // vinyl.grimness
            public asosan.wireman<?>[] typeParametersSerializers() {
                return grimness.attabal.attabal(this);
            }

            @Override // asosan.dern
            public ViewAbility deserialize(fastidiously.marial decoder) {
                Object objSealless;
                Intrinsics.checkNotNullParameter(decoder, "decoder");
                bristol.beachfront descriptor2 = getDescriptor();
                fastidiously.dern dernVarSaneness = decoder.saneness(descriptor2);
                int i = 1;
                immediately immediatelyVar = null;
                if (dernVarSaneness.triweekly()) {
                    objSealless = dernVarSaneness.sealless(descriptor2, 0, ViewAbilityInfo.C0733attabal.INSTANCE, null);
                } else {
                    boolean z = true;
                    int i2 = 0;
                    objSealless = null;
                    while (z) {
                        int iImpassible = dernVarSaneness.impassible(descriptor2);
                        if (iImpassible == -1) {
                            z = false;
                        } else {
                            if (iImpassible != 0) {
                                throw new UnknownFieldException(iImpassible);
                            }
                            objSealless = dernVarSaneness.sealless(descriptor2, 0, ViewAbilityInfo.C0733attabal.INSTANCE, objSealless);
                            i2 = 1;
                        }
                    }
                    i = i2;
                }
                dernVarSaneness.dern(descriptor2);
                return new ViewAbility(i, (ViewAbilityInfo) objSealless, immediatelyVar);
            }

            @Override // asosan.impassible
            public void serialize(fastidiously.beachfront encoder, ViewAbility value) {
                Intrinsics.checkNotNullParameter(encoder, "encoder");
                Intrinsics.checkNotNullParameter(value, "value");
                bristol.beachfront descriptor2 = getDescriptor();
                fastidiously.wireman wiremanVarSaneness = encoder.saneness(descriptor2);
                ViewAbility.write$Self(value, wiremanVarSaneness, descriptor2);
                wiremanVarSaneness.dern(descriptor2);
            }
        }

        /* JADX INFO: renamed from: monacal.attabal$cutely$saneness, reason: from kotlin metadata */
        /* JADX INFO: compiled from: AdPayload.kt */
        @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0016\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lmonacal/attabal$cutely$saneness;", "", "<init>", "()V", "Lasosan/wireman;", "Lmonacal/attabal$cutely;", "serializer", "()Lasosan/wireman;", "vungle-ads_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final asosan.wireman<ViewAbility> serializer() {
                return C0736attabal.INSTANCE;
            }

            private Companion() {
            }
        }

        public ViewAbility() {
            this((ViewAbilityInfo) null, 1, (DefaultConstructorMarker) (0 == true ? 1 : 0));
        }

        public static /* synthetic */ ViewAbility copy$default(ViewAbility viewAbility, ViewAbilityInfo viewAbilityInfo, int i, Object obj) {
            if ((i & 1) != 0) {
                viewAbilityInfo = viewAbility.om;
            }
            return viewAbility.copy(viewAbilityInfo);
        }

        public static final void write$Self(ViewAbility self, fastidiously.wireman output, bristol.beachfront serialDesc) {
            Intrinsics.checkNotNullParameter(self, "self");
            Intrinsics.checkNotNullParameter(output, "output");
            Intrinsics.checkNotNullParameter(serialDesc, "serialDesc");
            if (!output.cuirassed(serialDesc, 0) && self.om == null) {
                return;
            }
            output.taiyuan(serialDesc, 0, ViewAbilityInfo.C0733attabal.INSTANCE, self.om);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final ViewAbilityInfo getOm() {
            return this.om;
        }

        public final ViewAbility copy(ViewAbilityInfo om) {
            return new ViewAbility(om);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof ViewAbility) && Intrinsics.wireman(this.om, ((ViewAbility) other).om);
        }

        public final ViewAbilityInfo getOm() {
            return this.om;
        }

        public int hashCode() {
            ViewAbilityInfo viewAbilityInfo = this.om;
            if (viewAbilityInfo == null) {
                return 0;
            }
            return viewAbilityInfo.hashCode();
        }

        public String toString() {
            return "ViewAbility(om=" + this.om + ')';
        }

        @patroclinal.wireman
        public /* synthetic */ ViewAbility(int i, ViewAbilityInfo viewAbilityInfo, immediately immediatelyVar) {
            if ((i & 1) == 0) {
                this.om = null;
            } else {
                this.om = viewAbilityInfo;
            }
        }

        public ViewAbility(ViewAbilityInfo viewAbilityInfo) {
            this.om = viewAbilityInfo;
        }

        public /* synthetic */ ViewAbility(ViewAbilityInfo viewAbilityInfo, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : viewAbilityInfo);
        }
    }

    /* JADX INFO: renamed from: monacal.attabal$dern, reason: from toString */
    /* JADX INFO: compiled from: AdPayload.kt */
    @Metadata(d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010$\n\u0002\u0010 \n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b{\b\u0087\b\u0018\u0000 ¬\u00012\u00020\u0001:\u0004\u00ad\u0001®\u0001B\u008d\u0003\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0006\u0012\u001c\b\u0002\u0010\u0013\u001a\u0016\u0012\u0004\u0012\u00020\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u0012\u0018\u00010\u0011\u0012\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u0002\u0012\u0010\b\u0002\u0010\u0017\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0012\u0012\u0010\b\u0002\u0010\u0018\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0012\u0012\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u0019\u0012\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u001c\u0012\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u001f\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010 \u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010!\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010#\u001a\u0004\u0018\u00010\"\u0012\n\b\u0002\u0010%\u001a\u0004\u0018\u00010$\u0012\n\b\u0002\u0010&\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010'\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010(\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b)\u0010*B¡\u0003\b\u0017\u0012\u0006\u0010+\u001a\u00020\u0006\u0012\n\b\u0001\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0001\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0001\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0001\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0001\u0010\b\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0001\u0010\t\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0001\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\n\b\u0001\u0010\f\u001a\u0004\u0018\u00010\n\u0012\n\b\u0001\u0010\r\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0001\u0010\u000e\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0001\u0010\u000f\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0001\u0010\u0010\u001a\u0004\u0018\u00010\u0006\u0012\u001c\b\u0001\u0010\u0013\u001a\u0016\u0012\u0004\u0012\u00020\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u0012\u0018\u00010\u0011\u0012\n\b\u0001\u0010\u0014\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0001\u0010\u0015\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0001\u0010\u0016\u001a\u0004\u0018\u00010\u0002\u0012\u0010\b\u0001\u0010\u0017\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0012\u0012\u0010\b\u0001\u0010\u0018\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0012\u0012\n\b\u0001\u0010\u001a\u001a\u0004\u0018\u00010\u0019\u0012\n\b\u0001\u0010\u001b\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0001\u0010\u001d\u001a\u0004\u0018\u00010\u001c\u0012\n\b\u0001\u0010\u001e\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0001\u0010\u001f\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0001\u0010 \u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0001\u0010!\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0001\u0010#\u001a\u0004\u0018\u00010\"\u0012\n\b\u0001\u0010%\u001a\u0004\u0018\u00010$\u0012\n\b\u0001\u0010&\u001a\u0004\u0018\u00010\n\u0012\n\b\u0001\u0010'\u001a\u0004\u0018\u00010\n\u0012\n\b\u0001\u0010(\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010-\u001a\u0004\u0018\u00010,¢\u0006\u0004\b)\u0010.J(\u00105\u001a\u0002042\u0006\u0010/\u001a\u00020\u00002\u0006\u00101\u001a\u0002002\u0006\u00103\u001a\u000202HÇ\u0001¢\u0006\u0004\b5\u00106J\u0012\u00107\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b7\u00108J\u0012\u00109\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b9\u00108J\u0012\u0010:\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b:\u00108J\u0012\u0010;\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b;\u0010<J\u0012\u0010=\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b=\u0010<J\u0012\u0010>\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b>\u00108J\u0012\u0010?\u001a\u0004\u0018\u00010\nHÆ\u0003¢\u0006\u0004\b?\u0010@J\u0012\u0010A\u001a\u0004\u0018\u00010\nHÆ\u0003¢\u0006\u0004\bA\u0010@J\u0012\u0010B\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\bB\u00108J\u0012\u0010C\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\bC\u00108J\u0012\u0010D\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\bD\u0010<J\u0012\u0010E\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\bE\u0010<J$\u0010F\u001a\u0016\u0012\u0004\u0012\u00020\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u0012\u0018\u00010\u0011HÆ\u0003¢\u0006\u0004\bF\u0010GJ\u0012\u0010H\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\bH\u00108J\u0012\u0010I\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\bI\u00108J\u0012\u0010J\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\bJ\u00108J\u0018\u0010K\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0012HÆ\u0003¢\u0006\u0004\bK\u0010LJ\u0018\u0010M\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0012HÆ\u0003¢\u0006\u0004\bM\u0010LJ\u0012\u0010N\u001a\u0004\u0018\u00010\u0019HÆ\u0003¢\u0006\u0004\bN\u0010OJ\u0012\u0010P\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\bP\u00108J\u0012\u0010Q\u001a\u0004\u0018\u00010\u001cHÆ\u0003¢\u0006\u0004\bQ\u0010RJ\u0012\u0010S\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\bS\u00108J\u0012\u0010T\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\bT\u00108J\u0012\u0010U\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\bU\u0010<J\u0012\u0010V\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\bV\u0010<J\u0012\u0010W\u001a\u0004\u0018\u00010\"HÆ\u0003¢\u0006\u0004\bW\u0010XJ\u0012\u0010Y\u001a\u0004\u0018\u00010$HÆ\u0003¢\u0006\u0004\bY\u0010ZJ\u0012\u0010[\u001a\u0004\u0018\u00010\nHÆ\u0003¢\u0006\u0004\b[\u0010@J\u0012\u0010\\\u001a\u0004\u0018\u00010\nHÆ\u0003¢\u0006\u0004\b\\\u0010@J\u0012\u0010]\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b]\u0010<J\u0096\u0003\u0010^\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00062\u001c\b\u0002\u0010\u0013\u001a\u0016\u0012\u0004\u0012\u00020\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u0012\u0018\u00010\u00112\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u00022\u0010\b\u0002\u0010\u0017\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00122\u0010\b\u0002\u0010\u0018\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00122\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u00192\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u001c2\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u001f\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010 \u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010!\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010#\u001a\u0004\u0018\u00010\"2\n\b\u0002\u0010%\u001a\u0004\u0018\u00010$2\n\b\u0002\u0010&\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010'\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010(\u001a\u0004\u0018\u00010\u0006HÆ\u0001¢\u0006\u0004\b^\u0010_J\u0010\u0010`\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b`\u00108J\u0010\u0010a\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\ba\u0010bJ\u001a\u0010d\u001a\u00020\n2\b\u0010c\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\bd\u0010eR\"\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0003\u0010f\u0012\u0004\bh\u0010i\u001a\u0004\bg\u00108R\"\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0004\u0010f\u0012\u0004\bk\u0010i\u001a\u0004\bj\u00108R\"\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0005\u0010f\u0012\u0004\bm\u0010i\u001a\u0004\bl\u00108R\"\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0007\u0010n\u0012\u0004\bp\u0010i\u001a\u0004\bo\u0010<R\"\u0010\b\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\b\u0010n\u0012\u0004\br\u0010i\u001a\u0004\bq\u0010<R\"\u0010\t\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\t\u0010f\u0012\u0004\bt\u0010i\u001a\u0004\bs\u00108R\"\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u000b\u0010u\u0012\u0004\bw\u0010i\u001a\u0004\bv\u0010@R\"\u0010\f\u001a\u0004\u0018\u00010\n8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\f\u0010u\u0012\u0004\by\u0010i\u001a\u0004\bx\u0010@R\"\u0010\r\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\r\u0010f\u0012\u0004\b{\u0010i\u001a\u0004\bz\u00108R\"\u0010\u000e\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u000e\u0010f\u0012\u0004\b}\u0010i\u001a\u0004\b|\u00108R\"\u0010\u000f\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u000f\u0010n\u0012\u0004\b\u007f\u0010i\u001a\u0004\b~\u0010<R$\u0010\u0010\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\u0014\n\u0004\b\u0010\u0010n\u0012\u0005\b\u0081\u0001\u0010i\u001a\u0005\b\u0080\u0001\u0010<R7\u0010\u0013\u001a\u0016\u0012\u0004\u0012\u00020\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u0012\u0018\u00010\u00118\u0006X\u0087\u0004¢\u0006\u0015\n\u0005\b\u0013\u0010\u0082\u0001\u0012\u0005\b\u0084\u0001\u0010i\u001a\u0005\b\u0083\u0001\u0010GR$\u0010\u0014\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0014\n\u0004\b\u0014\u0010f\u0012\u0005\b\u0086\u0001\u0010i\u001a\u0005\b\u0085\u0001\u00108R$\u0010\u0015\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0014\n\u0004\b\u0015\u0010f\u0012\u0005\b\u0088\u0001\u0010i\u001a\u0005\b\u0087\u0001\u00108R$\u0010\u0016\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0014\n\u0004\b\u0016\u0010f\u0012\u0005\b\u008a\u0001\u0010i\u001a\u0005\b\u0089\u0001\u00108R+\u0010\u0017\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00128\u0006X\u0087\u0004¢\u0006\u0015\n\u0005\b\u0017\u0010\u008b\u0001\u0012\u0005\b\u008d\u0001\u0010i\u001a\u0005\b\u008c\u0001\u0010LR+\u0010\u0018\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00128\u0006X\u0087\u0004¢\u0006\u0015\n\u0005\b\u0018\u0010\u008b\u0001\u0012\u0005\b\u008f\u0001\u0010i\u001a\u0005\b\u008e\u0001\u0010LR%\u0010\u001a\u001a\u0004\u0018\u00010\u00198\u0006X\u0087\u0004¢\u0006\u0015\n\u0005\b\u001a\u0010\u0090\u0001\u0012\u0005\b\u0092\u0001\u0010i\u001a\u0005\b\u0091\u0001\u0010OR$\u0010\u001b\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0014\n\u0004\b\u001b\u0010f\u0012\u0005\b\u0094\u0001\u0010i\u001a\u0005\b\u0093\u0001\u00108R%\u0010\u001d\u001a\u0004\u0018\u00010\u001c8\u0006X\u0087\u0004¢\u0006\u0015\n\u0005\b\u001d\u0010\u0095\u0001\u0012\u0005\b\u0097\u0001\u0010i\u001a\u0005\b\u0096\u0001\u0010RR$\u0010\u001e\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0014\n\u0004\b\u001e\u0010f\u0012\u0005\b\u0099\u0001\u0010i\u001a\u0005\b\u0098\u0001\u00108R$\u0010\u001f\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0014\n\u0004\b\u001f\u0010f\u0012\u0005\b\u009b\u0001\u0010i\u001a\u0005\b\u009a\u0001\u00108R$\u0010 \u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\u0014\n\u0004\b \u0010n\u0012\u0005\b\u009d\u0001\u0010i\u001a\u0005\b\u009c\u0001\u0010<R$\u0010!\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\u0014\n\u0004\b!\u0010n\u0012\u0005\b\u009f\u0001\u0010i\u001a\u0005\b\u009e\u0001\u0010<R%\u0010#\u001a\u0004\u0018\u00010\"8\u0006X\u0087\u0004¢\u0006\u0015\n\u0005\b#\u0010 \u0001\u0012\u0005\b¢\u0001\u0010i\u001a\u0005\b¡\u0001\u0010XR%\u0010%\u001a\u0004\u0018\u00010$8\u0006X\u0087\u0004¢\u0006\u0015\n\u0005\b%\u0010£\u0001\u0012\u0005\b¥\u0001\u0010i\u001a\u0005\b¤\u0001\u0010ZR$\u0010&\u001a\u0004\u0018\u00010\n8\u0006X\u0087\u0004¢\u0006\u0014\n\u0004\b&\u0010u\u0012\u0005\b§\u0001\u0010i\u001a\u0005\b¦\u0001\u0010@R$\u0010'\u001a\u0004\u0018\u00010\n8\u0006X\u0087\u0004¢\u0006\u0014\n\u0004\b'\u0010u\u0012\u0005\b©\u0001\u0010i\u001a\u0005\b¨\u0001\u0010@R$\u0010(\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\u0014\n\u0004\b(\u0010n\u0012\u0005\b«\u0001\u0010i\u001a\u0005\bª\u0001\u0010<¨\u0006¯\u0001"}, d2 = {"Lmonacal/attabal$dern;", "", "", "id", "adType", "adSource", "", "expiry", "expiryDuration", "deeplinkUrl", "", "clickCoordinatesEnabled", "adLoadOptimizationEnabled", "mediationName", "info", "sleep", IronSourceConstants.EVENTS_ERROR_CODE, "", "", "tpat", attabal.KEY_VM, "vmVersion", "adMarketId", "notification", "loadAdUrls", "Lmonacal/attabal$cutely;", "viewAbility", "templateType", "Lmonacal/attabal$impromptu;", "templateSettings", "creativeId", "advAppId", "showClose", "showCloseIncentivized", "Lmonacal/attabal$saneness;", "adSizeInfo", "Lmonacal/attabal$formularize;", "webViewSettings", "usePreloading", "partialDownloadEnabled", "maxDownloadRetryAttempts", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/util/Map;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Lmonacal/attabal$cutely;Ljava/lang/String;Lmonacal/attabal$impromptu;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Lmonacal/attabal$saneness;Lmonacal/attabal$formularize;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Integer;)V", "seen1", "Lvinyl/immediately;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/util/Map;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Lmonacal/attabal$cutely;Ljava/lang/String;Lmonacal/attabal$impromptu;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Lmonacal/attabal$saneness;Lmonacal/attabal$formularize;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Integer;Lvinyl/immediately;)V", "self", "Lfastidiously/wireman;", AgentOptions.OUTPUT, "Lbristol/beachfront;", "serialDesc", "", "write$Self", "(Lmonacal/attabal$dern;Lfastidiously/wireman;Lbristol/beachfront;)V", "component1", "()Ljava/lang/String;", "component2", "component3", "component4", "()Ljava/lang/Integer;", "component5", "component6", "component7", "()Ljava/lang/Boolean;", "component8", "component9", "component10", "component11", "component12", "component13", "()Ljava/util/Map;", "component14", "component15", "component16", "component17", "()Ljava/util/List;", "component18", "component19", "()Lmonacal/attabal$cutely;", "component20", "component21", "()Lmonacal/attabal$impromptu;", "component22", "component23", "component24", "component25", "component26", "()Lmonacal/attabal$saneness;", "component27", "()Lmonacal/attabal$formularize;", "component28", "component29", "component30", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/util/Map;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Lmonacal/attabal$cutely;Ljava/lang/String;Lmonacal/attabal$impromptu;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Lmonacal/attabal$saneness;Lmonacal/attabal$formularize;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Integer;)Lmonacal/attabal$dern;", "toString", "hashCode", "()I", C3414a2.d, "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getId", "getId$annotations", "()V", "getAdType", "getAdType$annotations", "getAdSource", "getAdSource$annotations", "Ljava/lang/Integer;", "getExpiry", "getExpiry$annotations", "getExpiryDuration", "getExpiryDuration$annotations", "getDeeplinkUrl", "getDeeplinkUrl$annotations", "Ljava/lang/Boolean;", "getClickCoordinatesEnabled", "getClickCoordinatesEnabled$annotations", "getAdLoadOptimizationEnabled", "getAdLoadOptimizationEnabled$annotations", "getMediationName", "getMediationName$annotations", "getInfo", "getInfo$annotations", "getSleep", "getSleep$annotations", "getErrorCode", "getErrorCode$annotations", "Ljava/util/Map;", "getTpat", "getTpat$annotations", "getVmURL", "getVmURL$annotations", "getVmVersion", "getVmVersion$annotations", "getAdMarketId", "getAdMarketId$annotations", "Ljava/util/List;", "getNotification", "getNotification$annotations", "getLoadAdUrls", "getLoadAdUrls$annotations", "Lmonacal/attabal$cutely;", "getViewAbility", "getViewAbility$annotations", "getTemplateType", "getTemplateType$annotations", "Lmonacal/attabal$impromptu;", "getTemplateSettings", "getTemplateSettings$annotations", "getCreativeId", "getCreativeId$annotations", "getAdvAppId", "getAdvAppId$annotations", "getShowClose", "getShowClose$annotations", "getShowCloseIncentivized", "getShowCloseIncentivized$annotations", "Lmonacal/attabal$saneness;", "getAdSizeInfo", "getAdSizeInfo$annotations", "Lmonacal/attabal$formularize;", "getWebViewSettings", "getWebViewSettings$annotations", "getUsePreloading", "getUsePreloading$annotations", "getPartialDownloadEnabled", "getPartialDownloadEnabled$annotations", "getMaxDownloadRetryAttempts", "getMaxDownloadRetryAttempts$annotations", "Companion", "attabal", "saneness", "vungle-ads_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
    @formularize
    public static final /* data */ class AdUnit {

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private final Boolean adLoadOptimizationEnabled;
        private final String adMarketId;
        private final AdSizeInfo adSizeInfo;
        private final String adSource;
        private final String adType;
        private final String advAppId;
        private final Boolean clickCoordinatesEnabled;
        private final String creativeId;
        private final String deeplinkUrl;
        private final Integer errorCode;
        private final Integer expiry;
        private final Integer expiryDuration;
        private final String id;
        private final String info;
        private final List<String> loadAdUrls;
        private final Integer maxDownloadRetryAttempts;
        private final String mediationName;
        private final List<String> notification;
        private final Boolean partialDownloadEnabled;
        private final Integer showClose;
        private final Integer showCloseIncentivized;
        private final Integer sleep;
        private final TemplateSettings templateSettings;
        private final String templateType;
        private final Map<String, List<String>> tpat;
        private final Boolean usePreloading;
        private final ViewAbility viewAbility;
        private final String vmURL;
        private final String vmVersion;
        private final WebViewSettings webViewSettings;

        /* JADX INFO: renamed from: monacal.attabal$dern$attabal, reason: collision with other inner class name */
        /* JADX INFO: compiled from: AdPayload.kt */
        @Metadata(d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001a\u0010\u0007\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00060\u0005HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0018\u0010\u000b\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ \u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0016\u001a\u00020\u00138VXÖ\u0005¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u0017"}, d2 = {"com/vungle/ads/internal/model/AdPayload.AdUnit.$serializer", "Lvinyl/grimness;", "Lmonacal/attabal$dern;", "<init>", "()V", "", "Lasosan/wireman;", "childSerializers", "()[Lasosan/wireman;", "Lfastidiously/marial;", "decoder", "deserialize", "(Lfastidiously/marial;)Lmonacal/attabal$dern;", "Lfastidiously/beachfront;", "encoder", "value", "", "serialize", "(Lfastidiously/beachfront;Lmonacal/attabal$dern;)V", "Lbristol/beachfront;", "getDescriptor", "()Lbristol/beachfront;", "descriptor", "vungle-ads_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
        @patroclinal.wireman
        public static final class C0737attabal implements grimness<AdUnit> {
            public static final C0737attabal INSTANCE;
            public static final /* synthetic */ bristol.beachfront descriptor;

            static {
                C0737attabal c0737attabal = new C0737attabal();
                INSTANCE = c0737attabal;
                vesuvio vesuvioVar = new vesuvio("com.vungle.ads.internal.model.AdPayload.AdUnit", c0737attabal, 30);
                vesuvioVar.kowloon("id", true);
                vesuvioVar.kowloon("ad_type", true);
                vesuvioVar.kowloon("ad_source", true);
                vesuvioVar.kowloon("expiry", true);
                vesuvioVar.kowloon("expiry_duration", true);
                vesuvioVar.kowloon("deeplink_url", true);
                vesuvioVar.kowloon("click_coordinates_enabled", true);
                vesuvioVar.kowloon("ad_load_optimization", true);
                vesuvioVar.kowloon("mediation_name", true);
                vesuvioVar.kowloon("info", true);
                vesuvioVar.kowloon("sleep", true);
                vesuvioVar.kowloon("error_code", true);
                vesuvioVar.kowloon("tpat", true);
                vesuvioVar.kowloon("vm_url", true);
                vesuvioVar.kowloon("vm_version", true);
                vesuvioVar.kowloon("ad_market_id", true);
                vesuvioVar.kowloon("notification", true);
                vesuvioVar.kowloon(com.vungle.ads.internal.saneness.LOAD_AD, true);
                vesuvioVar.kowloon("viewability", true);
                vesuvioVar.kowloon("template_type", true);
                vesuvioVar.kowloon("template_settings", true);
                vesuvioVar.kowloon(CampaignEx.JSON_KEY_CREATIVE_ID, true);
                vesuvioVar.kowloon("app_id", true);
                vesuvioVar.kowloon("show_close", true);
                vesuvioVar.kowloon("show_close_incentivized", true);
                vesuvioVar.kowloon("ad_size", true);
                vesuvioVar.kowloon("webview_settings", true);
                vesuvioVar.kowloon("use_preloading", true);
                vesuvioVar.kowloon("ad_partial_download_enabled", true);
                vesuvioVar.kowloon("max_download_retry_attempts", true);
                descriptor = vesuvioVar;
            }

            private C0737attabal() {
            }

            @Override // vinyl.grimness
            public asosan.wireman<?>[] childSerializers() {
                licking lickingVar = licking.f39425attabal;
                asosan.wireman<?> wiremanVarGraveside = defendable.attabal.graveside(lickingVar);
                asosan.wireman<?> wiremanVarGraveside2 = defendable.attabal.graveside(lickingVar);
                asosan.wireman<?> wiremanVarGraveside3 = defendable.attabal.graveside(lickingVar);
                splinterproof splinterproofVar = splinterproof.f39488attabal;
                asosan.wireman<?> wiremanVarGraveside4 = defendable.attabal.graveside(splinterproofVar);
                asosan.wireman<?> wiremanVarGraveside5 = defendable.attabal.graveside(splinterproofVar);
                asosan.wireman<?> wiremanVarGraveside6 = defendable.attabal.graveside(lickingVar);
                vinyl.taiyuan taiyuanVar = vinyl.taiyuan.f39500attabal;
                return new asosan.wireman[]{wiremanVarGraveside, wiremanVarGraveside2, wiremanVarGraveside3, wiremanVarGraveside4, wiremanVarGraveside5, wiremanVarGraveside6, defendable.attabal.graveside(taiyuanVar), defendable.attabal.graveside(taiyuanVar), defendable.attabal.graveside(lickingVar), defendable.attabal.graveside(lickingVar), defendable.attabal.graveside(splinterproofVar), defendable.attabal.graveside(splinterproofVar), defendable.attabal.graveside(taiyuan.INSTANCE), defendable.attabal.graveside(lickingVar), defendable.attabal.graveside(lickingVar), defendable.attabal.graveside(lickingVar), defendable.attabal.graveside(new vinyl.beachfront(lickingVar)), defendable.attabal.graveside(new vinyl.beachfront(lickingVar)), defendable.attabal.graveside(ViewAbility.C0736attabal.INSTANCE), defendable.attabal.graveside(lickingVar), defendable.attabal.graveside(TemplateSettings.C0739attabal.INSTANCE), defendable.attabal.graveside(lickingVar), defendable.attabal.graveside(lickingVar), defendable.attabal.graveside(splinterproofVar), defendable.attabal.graveside(splinterproofVar), defendable.attabal.graveside(AdSizeInfo.C0741attabal.INSTANCE), defendable.attabal.graveside(WebViewSettings.C0738attabal.INSTANCE), defendable.attabal.graveside(taiyuanVar), defendable.attabal.graveside(taiyuanVar), defendable.attabal.graveside(splinterproofVar)};
            }

            @Override // asosan.wireman, asosan.impassible, asosan.dern
            public bristol.beachfront getDescriptor() {
                return descriptor;
            }

            @Override // vinyl.grimness
            public asosan.wireman<?>[] typeParametersSerializers() {
                return grimness.attabal.attabal(this);
            }

            @Override // asosan.dern
            public AdUnit deserialize(fastidiously.marial decoder) {
                Object obj;
                Object objSealless;
                Object obj2;
                Object obj3;
                Object obj4;
                Object obj5;
                Object objSealless2;
                Object obj6;
                Object objSealless3;
                int i;
                Object obj7;
                Object obj8;
                Object objSealless4;
                Object objSealless5;
                Object objSealless6;
                Object objSealless7;
                Object objSealless8;
                Object objSealless9;
                Object objSealless10;
                Object obj9;
                Object obj10;
                Object objSealless11;
                Object objSealless12;
                Object obj11;
                Object objSealless13;
                Object objSealless14;
                Object objSealless15;
                Object obj12;
                Object obj13;
                Object objSealless16;
                Object objSealless17;
                Object objSealless18;
                Object obj14;
                Object objSealless19;
                int i2;
                int i3;
                Intrinsics.checkNotNullParameter(decoder, "decoder");
                bristol.beachfront descriptor2 = getDescriptor();
                fastidiously.dern dernVarSaneness = decoder.saneness(descriptor2);
                Object objSealless20 = null;
                if (dernVarSaneness.triweekly()) {
                    licking lickingVar = licking.f39425attabal;
                    objSealless15 = dernVarSaneness.sealless(descriptor2, 0, lickingVar, null);
                    Object objSealless21 = dernVarSaneness.sealless(descriptor2, 1, lickingVar, null);
                    Object objSealless22 = dernVarSaneness.sealless(descriptor2, 2, lickingVar, null);
                    splinterproof splinterproofVar = splinterproof.f39488attabal;
                    objSealless14 = dernVarSaneness.sealless(descriptor2, 3, splinterproofVar, null);
                    objSealless10 = dernVarSaneness.sealless(descriptor2, 4, splinterproofVar, null);
                    objSealless9 = dernVarSaneness.sealless(descriptor2, 5, lickingVar, null);
                    vinyl.taiyuan taiyuanVar = vinyl.taiyuan.f39500attabal;
                    objSealless12 = dernVarSaneness.sealless(descriptor2, 6, taiyuanVar, null);
                    objSealless3 = dernVarSaneness.sealless(descriptor2, 7, taiyuanVar, null);
                    Object objSealless23 = dernVarSaneness.sealless(descriptor2, 8, lickingVar, null);
                    objSealless11 = dernVarSaneness.sealless(descriptor2, 9, lickingVar, null);
                    obj9 = objSealless22;
                    objSealless2 = dernVarSaneness.sealless(descriptor2, 10, splinterproofVar, null);
                    Object objSealless24 = dernVarSaneness.sealless(descriptor2, 11, splinterproofVar, null);
                    Object objSealless25 = dernVarSaneness.sealless(descriptor2, 12, taiyuan.INSTANCE, null);
                    Object objSealless26 = dernVarSaneness.sealless(descriptor2, 13, lickingVar, null);
                    obj10 = objSealless25;
                    objSealless8 = dernVarSaneness.sealless(descriptor2, 14, lickingVar, null);
                    objSealless7 = dernVarSaneness.sealless(descriptor2, 15, lickingVar, null);
                    obj5 = objSealless26;
                    objSealless6 = dernVarSaneness.sealless(descriptor2, 16, new vinyl.beachfront(lickingVar), null);
                    objSealless5 = dernVarSaneness.sealless(descriptor2, 17, new vinyl.beachfront(lickingVar), null);
                    objSealless4 = dernVarSaneness.sealless(descriptor2, 18, ViewAbility.C0736attabal.INSTANCE, null);
                    objSealless = dernVarSaneness.sealless(descriptor2, 19, lickingVar, null);
                    Object objSealless27 = dernVarSaneness.sealless(descriptor2, 20, TemplateSettings.C0739attabal.INSTANCE, null);
                    Object objSealless28 = dernVarSaneness.sealless(descriptor2, 21, lickingVar, null);
                    obj8 = objSealless27;
                    Object objSealless29 = dernVarSaneness.sealless(descriptor2, 22, lickingVar, null);
                    Object objSealless30 = dernVarSaneness.sealless(descriptor2, 23, splinterproofVar, null);
                    objSealless17 = dernVarSaneness.sealless(descriptor2, 24, splinterproofVar, null);
                    obj3 = objSealless30;
                    objSealless16 = dernVarSaneness.sealless(descriptor2, 25, AdSizeInfo.C0741attabal.INSTANCE, null);
                    Object objSealless31 = dernVarSaneness.sealless(descriptor2, 26, WebViewSettings.C0738attabal.INSTANCE, null);
                    Object objSealless32 = dernVarSaneness.sealless(descriptor2, 27, taiyuanVar, null);
                    obj13 = objSealless31;
                    Object objSealless33 = dernVarSaneness.sealless(descriptor2, 28, taiyuanVar, null);
                    objSealless13 = dernVarSaneness.sealless(descriptor2, 29, splinterproofVar, null);
                    obj4 = objSealless32;
                    obj2 = objSealless28;
                    i = 1073741823;
                    obj6 = objSealless23;
                    obj = objSealless24;
                    obj11 = objSealless21;
                    obj12 = objSealless33;
                    obj7 = objSealless29;
                } else {
                    boolean z = true;
                    int i4 = 0;
                    Object obj15 = null;
                    Object objSealless34 = null;
                    Object objSealless35 = null;
                    Object objSealless36 = null;
                    Object obj16 = null;
                    Object obj17 = null;
                    Object obj18 = null;
                    Object obj19 = null;
                    Object obj20 = null;
                    Object obj21 = null;
                    Object obj22 = null;
                    obj = null;
                    Object obj23 = null;
                    Object obj24 = null;
                    Object obj25 = null;
                    Object obj26 = null;
                    Object obj27 = null;
                    Object obj28 = null;
                    Object obj29 = null;
                    Object obj30 = null;
                    Object obj31 = null;
                    Object obj32 = null;
                    Object obj33 = null;
                    Object obj34 = null;
                    Object obj35 = null;
                    Object obj36 = null;
                    Object obj37 = null;
                    Object obj38 = null;
                    Object obj39 = null;
                    while (z) {
                        int iImpassible = dernVarSaneness.impassible(descriptor2);
                        switch (iImpassible) {
                            case -1:
                                objSealless18 = obj39;
                                int i5 = i4;
                                Unit unit = Unit.f29295attabal;
                                z = false;
                                obj14 = obj23;
                                obj16 = obj16;
                                objSealless20 = objSealless20;
                                i4 = i5;
                                obj39 = objSealless18;
                                objSealless34 = objSealless34;
                                obj23 = obj14;
                                obj38 = obj38;
                                obj37 = obj37;
                                obj36 = obj36;
                                obj35 = obj35;
                                obj34 = obj34;
                                obj33 = obj33;
                                obj32 = obj32;
                                obj31 = obj31;
                                obj30 = obj30;
                                obj29 = obj29;
                                obj28 = obj28;
                                obj27 = obj27;
                                obj26 = obj26;
                                obj25 = obj25;
                                obj24 = obj24;
                                obj15 = obj15;
                                obj39 = obj39;
                                break;
                            case 0:
                                int i6 = i4;
                                objSealless18 = dernVarSaneness.sealless(descriptor2, 0, licking.f39425attabal, obj39);
                                int i7 = i6 | 1;
                                Unit unit2 = Unit.f29295attabal;
                                obj16 = obj16;
                                objSealless20 = objSealless20;
                                i4 = i7;
                                obj14 = obj23;
                                obj39 = objSealless18;
                                objSealless34 = objSealless34;
                                obj23 = obj14;
                                obj38 = obj38;
                                obj37 = obj37;
                                obj36 = obj36;
                                obj35 = obj35;
                                obj34 = obj34;
                                obj33 = obj33;
                                obj32 = obj32;
                                obj31 = obj31;
                                obj30 = obj30;
                                obj29 = obj29;
                                obj28 = obj28;
                                obj27 = obj27;
                                obj26 = obj26;
                                obj25 = obj25;
                                obj24 = obj24;
                                obj15 = obj15;
                                obj39 = obj39;
                                break;
                            case 1:
                                obj24 = obj24;
                                obj25 = obj25;
                                obj26 = obj26;
                                obj27 = obj27;
                                obj28 = obj28;
                                obj29 = obj29;
                                obj30 = obj30;
                                obj31 = obj31;
                                obj32 = obj32;
                                obj33 = obj33;
                                obj34 = obj34;
                                obj35 = obj35;
                                obj36 = obj36;
                                obj37 = obj37;
                                obj38 = obj38;
                                int i8 = i4;
                                Object objSealless37 = dernVarSaneness.sealless(descriptor2, 1, licking.f39425attabal, obj15);
                                int i9 = i8 | 2;
                                Unit unit3 = Unit.f29295attabal;
                                obj16 = obj16;
                                objSealless20 = objSealless20;
                                i4 = i9;
                                obj14 = obj23;
                                objSealless34 = objSealless34;
                                obj15 = objSealless37;
                                obj23 = obj14;
                                obj38 = obj38;
                                obj37 = obj37;
                                obj36 = obj36;
                                obj35 = obj35;
                                obj34 = obj34;
                                obj33 = obj33;
                                obj32 = obj32;
                                obj31 = obj31;
                                obj30 = obj30;
                                obj29 = obj29;
                                obj28 = obj28;
                                obj27 = obj27;
                                obj26 = obj26;
                                obj25 = obj25;
                                obj24 = obj24;
                                obj15 = obj15;
                                obj39 = obj39;
                                break;
                            case 2:
                                obj15 = obj15;
                                obj24 = obj24;
                                obj25 = obj25;
                                obj26 = obj26;
                                obj27 = obj27;
                                obj28 = obj28;
                                obj29 = obj29;
                                obj30 = obj30;
                                obj31 = obj31;
                                obj32 = obj32;
                                obj33 = obj33;
                                obj34 = obj34;
                                obj35 = obj35;
                                obj36 = obj36;
                                obj37 = obj37;
                                obj38 = obj38;
                                int i10 = i4;
                                Object obj40 = objSealless20;
                                Object objSealless38 = dernVarSaneness.sealless(descriptor2, 2, licking.f39425attabal, obj16);
                                Unit unit4 = Unit.f29295attabal;
                                obj16 = objSealless38;
                                objSealless20 = obj40;
                                i4 = i10 | 4;
                                obj14 = obj23;
                                obj15 = obj15;
                                obj23 = obj14;
                                obj38 = obj38;
                                obj37 = obj37;
                                obj36 = obj36;
                                obj35 = obj35;
                                obj34 = obj34;
                                obj33 = obj33;
                                obj32 = obj32;
                                obj31 = obj31;
                                obj30 = obj30;
                                obj29 = obj29;
                                obj28 = obj28;
                                obj27 = obj27;
                                obj26 = obj26;
                                obj25 = obj25;
                                obj24 = obj24;
                                obj15 = obj15;
                                obj39 = obj39;
                                break;
                            case 3:
                                objSealless19 = obj23;
                                obj24 = obj24;
                                objSealless36 = dernVarSaneness.sealless(descriptor2, 3, splinterproof.f39488attabal, objSealless36);
                                i2 = i4 | 8;
                                Unit unit5 = Unit.f29295attabal;
                                obj14 = objSealless19;
                                obj16 = obj16;
                                objSealless20 = objSealless20;
                                obj15 = obj15;
                                i4 = i2;
                                obj23 = obj14;
                                obj38 = obj38;
                                obj37 = obj37;
                                obj36 = obj36;
                                obj35 = obj35;
                                obj34 = obj34;
                                obj33 = obj33;
                                obj32 = obj32;
                                obj31 = obj31;
                                obj30 = obj30;
                                obj29 = obj29;
                                obj28 = obj28;
                                obj27 = obj27;
                                obj26 = obj26;
                                obj25 = obj25;
                                obj24 = obj24;
                                obj15 = obj15;
                                obj39 = obj39;
                                break;
                            case 4:
                                objSealless19 = obj23;
                                obj24 = obj24;
                                objSealless35 = dernVarSaneness.sealless(descriptor2, 4, splinterproof.f39488attabal, objSealless35);
                                i2 = i4 | 16;
                                Unit unit6 = Unit.f29295attabal;
                                obj14 = objSealless19;
                                obj16 = obj16;
                                objSealless20 = objSealless20;
                                obj15 = obj15;
                                i4 = i2;
                                obj23 = obj14;
                                obj38 = obj38;
                                obj37 = obj37;
                                obj36 = obj36;
                                obj35 = obj35;
                                obj34 = obj34;
                                obj33 = obj33;
                                obj32 = obj32;
                                obj31 = obj31;
                                obj30 = obj30;
                                obj29 = obj29;
                                obj28 = obj28;
                                obj27 = obj27;
                                obj26 = obj26;
                                obj25 = obj25;
                                obj24 = obj24;
                                obj15 = obj15;
                                obj39 = obj39;
                                break;
                            case 5:
                                objSealless19 = obj23;
                                obj24 = obj24;
                                objSealless34 = dernVarSaneness.sealless(descriptor2, 5, licking.f39425attabal, objSealless34);
                                i2 = i4 | 32;
                                Unit unit7 = Unit.f29295attabal;
                                obj14 = objSealless19;
                                obj16 = obj16;
                                objSealless20 = objSealless20;
                                obj15 = obj15;
                                i4 = i2;
                                obj23 = obj14;
                                obj38 = obj38;
                                obj37 = obj37;
                                obj36 = obj36;
                                obj35 = obj35;
                                obj34 = obj34;
                                obj33 = obj33;
                                obj32 = obj32;
                                obj31 = obj31;
                                obj30 = obj30;
                                obj29 = obj29;
                                obj28 = obj28;
                                obj27 = obj27;
                                obj26 = obj26;
                                obj25 = obj25;
                                obj24 = obj24;
                                obj15 = obj15;
                                obj39 = obj39;
                                break;
                            case 6:
                                Object objSealless39 = dernVarSaneness.sealless(descriptor2, 6, vinyl.taiyuan.f39500attabal, obj21);
                                i3 = i4 | 64;
                                Unit unit8 = Unit.f29295attabal;
                                obj21 = objSealless39;
                                objSealless20 = objSealless20;
                                i4 = i3;
                                obj14 = obj23;
                                obj16 = obj16;
                                obj15 = obj15;
                                obj23 = obj14;
                                obj38 = obj38;
                                obj37 = obj37;
                                obj36 = obj36;
                                obj35 = obj35;
                                obj34 = obj34;
                                obj33 = obj33;
                                obj32 = obj32;
                                obj31 = obj31;
                                obj30 = obj30;
                                obj29 = obj29;
                                obj28 = obj28;
                                obj27 = obj27;
                                obj26 = obj26;
                                obj25 = obj25;
                                obj24 = obj24;
                                obj15 = obj15;
                                obj39 = obj39;
                                break;
                            case 7:
                                Object objSealless40 = dernVarSaneness.sealless(descriptor2, 7, vinyl.taiyuan.f39500attabal, obj22);
                                i3 = i4 | 128;
                                Unit unit9 = Unit.f29295attabal;
                                obj22 = objSealless40;
                                objSealless20 = objSealless20;
                                i4 = i3;
                                obj14 = obj23;
                                obj16 = obj16;
                                obj15 = obj15;
                                obj23 = obj14;
                                obj38 = obj38;
                                obj37 = obj37;
                                obj36 = obj36;
                                obj35 = obj35;
                                obj34 = obj34;
                                obj33 = obj33;
                                obj32 = obj32;
                                obj31 = obj31;
                                obj30 = obj30;
                                obj29 = obj29;
                                obj28 = obj28;
                                obj27 = obj27;
                                obj26 = obj26;
                                obj25 = obj25;
                                obj24 = obj24;
                                obj15 = obj15;
                                obj39 = obj39;
                                break;
                            case 8:
                                Object objSealless41 = dernVarSaneness.sealless(descriptor2, 8, licking.f39425attabal, obj20);
                                i3 = i4 | 256;
                                Unit unit10 = Unit.f29295attabal;
                                obj20 = objSealless41;
                                objSealless20 = objSealless20;
                                i4 = i3;
                                obj14 = obj23;
                                obj16 = obj16;
                                obj15 = obj15;
                                obj23 = obj14;
                                obj38 = obj38;
                                obj37 = obj37;
                                obj36 = obj36;
                                obj35 = obj35;
                                obj34 = obj34;
                                obj33 = obj33;
                                obj32 = obj32;
                                obj31 = obj31;
                                obj30 = obj30;
                                obj29 = obj29;
                                obj28 = obj28;
                                obj27 = obj27;
                                obj26 = obj26;
                                obj25 = obj25;
                                obj24 = obj24;
                                obj15 = obj15;
                                obj39 = obj39;
                                break;
                            case 9:
                                Object objSealless42 = dernVarSaneness.sealless(descriptor2, 9, licking.f39425attabal, obj19);
                                i3 = i4 | 512;
                                Unit unit11 = Unit.f29295attabal;
                                obj19 = objSealless42;
                                objSealless20 = objSealless20;
                                i4 = i3;
                                obj14 = obj23;
                                obj16 = obj16;
                                obj15 = obj15;
                                obj23 = obj14;
                                obj38 = obj38;
                                obj37 = obj37;
                                obj36 = obj36;
                                obj35 = obj35;
                                obj34 = obj34;
                                obj33 = obj33;
                                obj32 = obj32;
                                obj31 = obj31;
                                obj30 = obj30;
                                obj29 = obj29;
                                obj28 = obj28;
                                obj27 = obj27;
                                obj26 = obj26;
                                obj25 = obj25;
                                obj24 = obj24;
                                obj15 = obj15;
                                obj39 = obj39;
                                break;
                            case 10:
                                Object objSealless43 = dernVarSaneness.sealless(descriptor2, 10, splinterproof.f39488attabal, obj18);
                                i3 = i4 | 1024;
                                Unit unit12 = Unit.f29295attabal;
                                obj18 = objSealless43;
                                objSealless20 = objSealless20;
                                i4 = i3;
                                obj14 = obj23;
                                obj16 = obj16;
                                obj15 = obj15;
                                obj23 = obj14;
                                obj38 = obj38;
                                obj37 = obj37;
                                obj36 = obj36;
                                obj35 = obj35;
                                obj34 = obj34;
                                obj33 = obj33;
                                obj32 = obj32;
                                obj31 = obj31;
                                obj30 = obj30;
                                obj29 = obj29;
                                obj28 = obj28;
                                obj27 = obj27;
                                obj26 = obj26;
                                obj25 = obj25;
                                obj24 = obj24;
                                obj15 = obj15;
                                obj39 = obj39;
                                break;
                            case 11:
                                Object objSealless44 = dernVarSaneness.sealless(descriptor2, 11, splinterproof.f39488attabal, obj);
                                i3 = i4 | 2048;
                                Unit unit13 = Unit.f29295attabal;
                                obj = objSealless44;
                                objSealless20 = objSealless20;
                                i4 = i3;
                                obj14 = obj23;
                                obj16 = obj16;
                                obj15 = obj15;
                                obj23 = obj14;
                                obj38 = obj38;
                                obj37 = obj37;
                                obj36 = obj36;
                                obj35 = obj35;
                                obj34 = obj34;
                                obj33 = obj33;
                                obj32 = obj32;
                                obj31 = obj31;
                                obj30 = obj30;
                                obj29 = obj29;
                                obj28 = obj28;
                                obj27 = obj27;
                                obj26 = obj26;
                                obj25 = obj25;
                                obj24 = obj24;
                                obj15 = obj15;
                                obj39 = obj39;
                                break;
                            case 12:
                                Object objSealless45 = dernVarSaneness.sealless(descriptor2, 12, taiyuan.INSTANCE, obj17);
                                i3 = i4 | 4096;
                                Unit unit14 = Unit.f29295attabal;
                                obj17 = objSealless45;
                                objSealless20 = objSealless20;
                                i4 = i3;
                                obj14 = obj23;
                                obj16 = obj16;
                                obj15 = obj15;
                                obj23 = obj14;
                                obj38 = obj38;
                                obj37 = obj37;
                                obj36 = obj36;
                                obj35 = obj35;
                                obj34 = obj34;
                                obj33 = obj33;
                                obj32 = obj32;
                                obj31 = obj31;
                                obj30 = obj30;
                                obj29 = obj29;
                                obj28 = obj28;
                                obj27 = obj27;
                                obj26 = obj26;
                                obj25 = obj25;
                                obj24 = obj24;
                                obj15 = obj15;
                                obj39 = obj39;
                                break;
                            case 13:
                                obj24 = obj24;
                                objSealless19 = dernVarSaneness.sealless(descriptor2, 13, licking.f39425attabal, obj23);
                                i2 = i4 | 8192;
                                Unit unit15 = Unit.f29295attabal;
                                obj14 = objSealless19;
                                obj16 = obj16;
                                objSealless20 = objSealless20;
                                obj15 = obj15;
                                i4 = i2;
                                obj23 = obj14;
                                obj38 = obj38;
                                obj37 = obj37;
                                obj36 = obj36;
                                obj35 = obj35;
                                obj34 = obj34;
                                obj33 = obj33;
                                obj32 = obj32;
                                obj31 = obj31;
                                obj30 = obj30;
                                obj29 = obj29;
                                obj28 = obj28;
                                obj27 = obj27;
                                obj26 = obj26;
                                obj25 = obj25;
                                obj24 = obj24;
                                obj15 = obj15;
                                obj39 = obj39;
                                break;
                            case 14:
                                obj15 = obj15;
                                obj26 = obj26;
                                obj27 = obj27;
                                obj28 = obj28;
                                obj29 = obj29;
                                obj30 = obj30;
                                obj31 = obj31;
                                obj32 = obj32;
                                obj33 = obj33;
                                obj34 = obj34;
                                obj35 = obj35;
                                obj36 = obj36;
                                obj37 = obj37;
                                obj38 = obj38;
                                int i11 = i4;
                                objSealless20 = objSealless20;
                                obj25 = obj25;
                                Object objSealless46 = dernVarSaneness.sealless(descriptor2, 14, licking.f39425attabal, obj24);
                                i2 = i11 | 16384;
                                Unit unit16 = Unit.f29295attabal;
                                obj24 = objSealless46;
                                obj16 = obj16;
                                obj14 = obj23;
                                objSealless20 = objSealless20;
                                obj15 = obj15;
                                i4 = i2;
                                obj23 = obj14;
                                obj38 = obj38;
                                obj37 = obj37;
                                obj36 = obj36;
                                obj35 = obj35;
                                obj34 = obj34;
                                obj33 = obj33;
                                obj32 = obj32;
                                obj31 = obj31;
                                obj30 = obj30;
                                obj29 = obj29;
                                obj28 = obj28;
                                obj27 = obj27;
                                obj26 = obj26;
                                obj25 = obj25;
                                obj24 = obj24;
                                obj15 = obj15;
                                obj39 = obj39;
                                break;
                            case 15:
                                obj15 = obj15;
                                Object obj41 = obj16;
                                obj27 = obj27;
                                obj28 = obj28;
                                obj29 = obj29;
                                obj30 = obj30;
                                obj31 = obj31;
                                obj32 = obj32;
                                obj33 = obj33;
                                obj34 = obj34;
                                obj35 = obj35;
                                obj36 = obj36;
                                obj37 = obj37;
                                obj38 = obj38;
                                int i12 = i4;
                                objSealless20 = objSealless20;
                                obj26 = obj26;
                                Object objSealless47 = dernVarSaneness.sealless(descriptor2, 15, licking.f39425attabal, obj25);
                                i2 = i12 | 32768;
                                Unit unit17 = Unit.f29295attabal;
                                obj25 = objSealless47;
                                obj16 = obj41;
                                obj14 = obj23;
                                obj24 = obj24;
                                objSealless20 = objSealless20;
                                obj15 = obj15;
                                i4 = i2;
                                obj23 = obj14;
                                obj38 = obj38;
                                obj37 = obj37;
                                obj36 = obj36;
                                obj35 = obj35;
                                obj34 = obj34;
                                obj33 = obj33;
                                obj32 = obj32;
                                obj31 = obj31;
                                obj30 = obj30;
                                obj29 = obj29;
                                obj28 = obj28;
                                obj27 = obj27;
                                obj26 = obj26;
                                obj25 = obj25;
                                obj24 = obj24;
                                obj15 = obj15;
                                obj39 = obj39;
                                break;
                            case 16:
                                obj15 = obj15;
                                obj28 = obj28;
                                obj29 = obj29;
                                obj30 = obj30;
                                obj31 = obj31;
                                obj32 = obj32;
                                obj33 = obj33;
                                obj34 = obj34;
                                obj35 = obj35;
                                obj36 = obj36;
                                obj37 = obj37;
                                obj38 = obj38;
                                int i13 = i4;
                                objSealless20 = objSealless20;
                                obj27 = obj27;
                                Object objSealless48 = dernVarSaneness.sealless(descriptor2, 16, new vinyl.beachfront(licking.f39425attabal), obj26);
                                i2 = i13 | 65536;
                                Unit unit18 = Unit.f29295attabal;
                                obj26 = objSealless48;
                                obj16 = obj16;
                                obj14 = obj23;
                                obj24 = obj24;
                                obj25 = obj25;
                                objSealless20 = objSealless20;
                                obj15 = obj15;
                                i4 = i2;
                                obj23 = obj14;
                                obj38 = obj38;
                                obj37 = obj37;
                                obj36 = obj36;
                                obj35 = obj35;
                                obj34 = obj34;
                                obj33 = obj33;
                                obj32 = obj32;
                                obj31 = obj31;
                                obj30 = obj30;
                                obj29 = obj29;
                                obj28 = obj28;
                                obj27 = obj27;
                                obj26 = obj26;
                                obj25 = obj25;
                                obj24 = obj24;
                                obj15 = obj15;
                                obj39 = obj39;
                                break;
                            case 17:
                                obj15 = obj15;
                                Object obj42 = obj16;
                                obj29 = obj29;
                                obj30 = obj30;
                                obj31 = obj31;
                                obj32 = obj32;
                                obj33 = obj33;
                                obj34 = obj34;
                                obj35 = obj35;
                                obj36 = obj36;
                                obj37 = obj37;
                                obj38 = obj38;
                                int i14 = i4;
                                objSealless20 = objSealless20;
                                obj28 = obj28;
                                Object objSealless49 = dernVarSaneness.sealless(descriptor2, 17, new vinyl.beachfront(licking.f39425attabal), obj27);
                                i2 = i14 | 131072;
                                Unit unit19 = Unit.f29295attabal;
                                obj27 = objSealless49;
                                obj16 = obj42;
                                obj14 = obj23;
                                obj24 = obj24;
                                obj25 = obj25;
                                obj26 = obj26;
                                objSealless20 = objSealless20;
                                obj15 = obj15;
                                i4 = i2;
                                obj23 = obj14;
                                obj38 = obj38;
                                obj37 = obj37;
                                obj36 = obj36;
                                obj35 = obj35;
                                obj34 = obj34;
                                obj33 = obj33;
                                obj32 = obj32;
                                obj31 = obj31;
                                obj30 = obj30;
                                obj29 = obj29;
                                obj28 = obj28;
                                obj27 = obj27;
                                obj26 = obj26;
                                obj25 = obj25;
                                obj24 = obj24;
                                obj15 = obj15;
                                obj39 = obj39;
                                break;
                            case 18:
                                obj15 = obj15;
                                obj30 = obj30;
                                obj31 = obj31;
                                obj32 = obj32;
                                obj33 = obj33;
                                obj34 = obj34;
                                obj35 = obj35;
                                obj36 = obj36;
                                obj37 = obj37;
                                obj38 = obj38;
                                int i15 = i4;
                                objSealless20 = objSealless20;
                                obj29 = obj29;
                                Object objSealless50 = dernVarSaneness.sealless(descriptor2, 18, ViewAbility.C0736attabal.INSTANCE, obj28);
                                i2 = i15 | Opcodes.ASM4;
                                Unit unit20 = Unit.f29295attabal;
                                obj28 = objSealless50;
                                obj16 = obj16;
                                obj14 = obj23;
                                obj24 = obj24;
                                obj25 = obj25;
                                obj26 = obj26;
                                obj27 = obj27;
                                objSealless20 = objSealless20;
                                obj15 = obj15;
                                i4 = i2;
                                obj23 = obj14;
                                obj38 = obj38;
                                obj37 = obj37;
                                obj36 = obj36;
                                obj35 = obj35;
                                obj34 = obj34;
                                obj33 = obj33;
                                obj32 = obj32;
                                obj31 = obj31;
                                obj30 = obj30;
                                obj29 = obj29;
                                obj28 = obj28;
                                obj27 = obj27;
                                obj26 = obj26;
                                obj25 = obj25;
                                obj24 = obj24;
                                obj15 = obj15;
                                obj39 = obj39;
                                break;
                            case 19:
                                obj15 = obj15;
                                Object obj43 = obj16;
                                obj31 = obj31;
                                obj32 = obj32;
                                obj33 = obj33;
                                obj34 = obj34;
                                obj35 = obj35;
                                obj36 = obj36;
                                obj37 = obj37;
                                obj38 = obj38;
                                int i16 = i4;
                                objSealless20 = objSealless20;
                                obj30 = obj30;
                                Object objSealless51 = dernVarSaneness.sealless(descriptor2, 19, licking.f39425attabal, obj29);
                                i2 = i16 | Opcodes.ASM8;
                                Unit unit21 = Unit.f29295attabal;
                                obj29 = objSealless51;
                                obj16 = obj43;
                                obj14 = obj23;
                                obj24 = obj24;
                                obj25 = obj25;
                                obj26 = obj26;
                                obj27 = obj27;
                                obj28 = obj28;
                                objSealless20 = objSealless20;
                                obj15 = obj15;
                                i4 = i2;
                                obj23 = obj14;
                                obj38 = obj38;
                                obj37 = obj37;
                                obj36 = obj36;
                                obj35 = obj35;
                                obj34 = obj34;
                                obj33 = obj33;
                                obj32 = obj32;
                                obj31 = obj31;
                                obj30 = obj30;
                                obj29 = obj29;
                                obj28 = obj28;
                                obj27 = obj27;
                                obj26 = obj26;
                                obj25 = obj25;
                                obj24 = obj24;
                                obj15 = obj15;
                                obj39 = obj39;
                                break;
                            case 20:
                                obj15 = obj15;
                                obj32 = obj32;
                                obj33 = obj33;
                                obj34 = obj34;
                                obj35 = obj35;
                                obj36 = obj36;
                                obj37 = obj37;
                                obj38 = obj38;
                                int i17 = i4;
                                objSealless20 = objSealless20;
                                obj31 = obj31;
                                Object objSealless52 = dernVarSaneness.sealless(descriptor2, 20, TemplateSettings.C0739attabal.INSTANCE, obj30);
                                i2 = i17 | ExtractorMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES;
                                Unit unit22 = Unit.f29295attabal;
                                obj30 = objSealless52;
                                obj16 = obj16;
                                obj14 = obj23;
                                obj24 = obj24;
                                obj25 = obj25;
                                obj26 = obj26;
                                obj27 = obj27;
                                obj28 = obj28;
                                obj29 = obj29;
                                objSealless20 = objSealless20;
                                obj15 = obj15;
                                i4 = i2;
                                obj23 = obj14;
                                obj38 = obj38;
                                obj37 = obj37;
                                obj36 = obj36;
                                obj35 = obj35;
                                obj34 = obj34;
                                obj33 = obj33;
                                obj32 = obj32;
                                obj31 = obj31;
                                obj30 = obj30;
                                obj29 = obj29;
                                obj28 = obj28;
                                obj27 = obj27;
                                obj26 = obj26;
                                obj25 = obj25;
                                obj24 = obj24;
                                obj15 = obj15;
                                obj39 = obj39;
                                break;
                            case 21:
                                obj15 = obj15;
                                Object obj44 = obj16;
                                obj33 = obj33;
                                obj34 = obj34;
                                obj35 = obj35;
                                obj36 = obj36;
                                obj37 = obj37;
                                obj38 = obj38;
                                int i18 = i4;
                                objSealless20 = objSealless20;
                                obj32 = obj32;
                                Object objSealless53 = dernVarSaneness.sealless(descriptor2, 21, licking.f39425attabal, obj31);
                                i2 = i18 | 2097152;
                                Unit unit23 = Unit.f29295attabal;
                                obj31 = objSealless53;
                                obj16 = obj44;
                                obj14 = obj23;
                                obj24 = obj24;
                                obj25 = obj25;
                                obj26 = obj26;
                                obj27 = obj27;
                                obj28 = obj28;
                                obj29 = obj29;
                                obj30 = obj30;
                                objSealless20 = objSealless20;
                                obj15 = obj15;
                                i4 = i2;
                                obj23 = obj14;
                                obj38 = obj38;
                                obj37 = obj37;
                                obj36 = obj36;
                                obj35 = obj35;
                                obj34 = obj34;
                                obj33 = obj33;
                                obj32 = obj32;
                                obj31 = obj31;
                                obj30 = obj30;
                                obj29 = obj29;
                                obj28 = obj28;
                                obj27 = obj27;
                                obj26 = obj26;
                                obj25 = obj25;
                                obj24 = obj24;
                                obj15 = obj15;
                                obj39 = obj39;
                                break;
                            case 22:
                                obj15 = obj15;
                                obj34 = obj34;
                                obj35 = obj35;
                                obj36 = obj36;
                                obj37 = obj37;
                                obj38 = obj38;
                                int i19 = i4;
                                objSealless20 = objSealless20;
                                obj33 = obj33;
                                Object objSealless54 = dernVarSaneness.sealless(descriptor2, 22, licking.f39425attabal, obj32);
                                i2 = i19 | 4194304;
                                Unit unit24 = Unit.f29295attabal;
                                obj32 = objSealless54;
                                obj16 = obj16;
                                obj14 = obj23;
                                obj24 = obj24;
                                obj25 = obj25;
                                obj26 = obj26;
                                obj27 = obj27;
                                obj28 = obj28;
                                obj29 = obj29;
                                obj30 = obj30;
                                obj31 = obj31;
                                objSealless20 = objSealless20;
                                obj15 = obj15;
                                i4 = i2;
                                obj23 = obj14;
                                obj38 = obj38;
                                obj37 = obj37;
                                obj36 = obj36;
                                obj35 = obj35;
                                obj34 = obj34;
                                obj33 = obj33;
                                obj32 = obj32;
                                obj31 = obj31;
                                obj30 = obj30;
                                obj29 = obj29;
                                obj28 = obj28;
                                obj27 = obj27;
                                obj26 = obj26;
                                obj25 = obj25;
                                obj24 = obj24;
                                obj15 = obj15;
                                obj39 = obj39;
                                break;
                            case 23:
                                obj15 = obj15;
                                Object obj45 = obj16;
                                obj35 = obj35;
                                obj36 = obj36;
                                obj37 = obj37;
                                obj38 = obj38;
                                int i20 = i4;
                                objSealless20 = objSealless20;
                                obj34 = obj34;
                                Object objSealless55 = dernVarSaneness.sealless(descriptor2, 23, splinterproof.f39488attabal, obj33);
                                i2 = i20 | 8388608;
                                Unit unit25 = Unit.f29295attabal;
                                obj33 = objSealless55;
                                obj16 = obj45;
                                obj14 = obj23;
                                obj24 = obj24;
                                obj25 = obj25;
                                obj26 = obj26;
                                obj27 = obj27;
                                obj28 = obj28;
                                obj29 = obj29;
                                obj30 = obj30;
                                obj31 = obj31;
                                obj32 = obj32;
                                objSealless20 = objSealless20;
                                obj15 = obj15;
                                i4 = i2;
                                obj23 = obj14;
                                obj38 = obj38;
                                obj37 = obj37;
                                obj36 = obj36;
                                obj35 = obj35;
                                obj34 = obj34;
                                obj33 = obj33;
                                obj32 = obj32;
                                obj31 = obj31;
                                obj30 = obj30;
                                obj29 = obj29;
                                obj28 = obj28;
                                obj27 = obj27;
                                obj26 = obj26;
                                obj25 = obj25;
                                obj24 = obj24;
                                obj15 = obj15;
                                obj39 = obj39;
                                break;
                            case 24:
                                obj15 = obj15;
                                obj36 = obj36;
                                obj37 = obj37;
                                obj38 = obj38;
                                int i21 = i4;
                                objSealless20 = objSealless20;
                                obj35 = obj35;
                                Object objSealless56 = dernVarSaneness.sealless(descriptor2, 24, splinterproof.f39488attabal, obj34);
                                i2 = i21 | 16777216;
                                Unit unit26 = Unit.f29295attabal;
                                obj34 = objSealless56;
                                obj16 = obj16;
                                obj14 = obj23;
                                obj24 = obj24;
                                obj25 = obj25;
                                obj26 = obj26;
                                obj27 = obj27;
                                obj28 = obj28;
                                obj29 = obj29;
                                obj30 = obj30;
                                obj31 = obj31;
                                obj32 = obj32;
                                obj33 = obj33;
                                objSealless20 = objSealless20;
                                obj15 = obj15;
                                i4 = i2;
                                obj23 = obj14;
                                obj38 = obj38;
                                obj37 = obj37;
                                obj36 = obj36;
                                obj35 = obj35;
                                obj34 = obj34;
                                obj33 = obj33;
                                obj32 = obj32;
                                obj31 = obj31;
                                obj30 = obj30;
                                obj29 = obj29;
                                obj28 = obj28;
                                obj27 = obj27;
                                obj26 = obj26;
                                obj25 = obj25;
                                obj24 = obj24;
                                obj15 = obj15;
                                obj39 = obj39;
                                break;
                            case 25:
                                obj15 = obj15;
                                Object obj46 = obj16;
                                obj37 = obj37;
                                obj38 = obj38;
                                int i22 = i4;
                                objSealless20 = objSealless20;
                                obj36 = obj36;
                                Object objSealless57 = dernVarSaneness.sealless(descriptor2, 25, AdSizeInfo.C0741attabal.INSTANCE, obj35);
                                i2 = i22 | 33554432;
                                Unit unit27 = Unit.f29295attabal;
                                obj35 = objSealless57;
                                obj16 = obj46;
                                obj14 = obj23;
                                obj24 = obj24;
                                obj25 = obj25;
                                obj26 = obj26;
                                obj27 = obj27;
                                obj28 = obj28;
                                obj29 = obj29;
                                obj30 = obj30;
                                obj31 = obj31;
                                obj32 = obj32;
                                obj33 = obj33;
                                obj34 = obj34;
                                objSealless20 = objSealless20;
                                obj15 = obj15;
                                i4 = i2;
                                obj23 = obj14;
                                obj38 = obj38;
                                obj37 = obj37;
                                obj36 = obj36;
                                obj35 = obj35;
                                obj34 = obj34;
                                obj33 = obj33;
                                obj32 = obj32;
                                obj31 = obj31;
                                obj30 = obj30;
                                obj29 = obj29;
                                obj28 = obj28;
                                obj27 = obj27;
                                obj26 = obj26;
                                obj25 = obj25;
                                obj24 = obj24;
                                obj15 = obj15;
                                obj39 = obj39;
                                break;
                            case 26:
                                obj15 = obj15;
                                obj38 = obj38;
                                int i23 = i4;
                                objSealless20 = objSealless20;
                                obj37 = obj37;
                                Object objSealless58 = dernVarSaneness.sealless(descriptor2, 26, WebViewSettings.C0738attabal.INSTANCE, obj36);
                                i2 = i23 | 67108864;
                                Unit unit28 = Unit.f29295attabal;
                                obj36 = objSealless58;
                                obj16 = obj16;
                                obj14 = obj23;
                                obj24 = obj24;
                                obj25 = obj25;
                                obj26 = obj26;
                                obj27 = obj27;
                                obj28 = obj28;
                                obj29 = obj29;
                                obj30 = obj30;
                                obj31 = obj31;
                                obj32 = obj32;
                                obj33 = obj33;
                                obj34 = obj34;
                                obj35 = obj35;
                                objSealless20 = objSealless20;
                                obj15 = obj15;
                                i4 = i2;
                                obj23 = obj14;
                                obj38 = obj38;
                                obj37 = obj37;
                                obj36 = obj36;
                                obj35 = obj35;
                                obj34 = obj34;
                                obj33 = obj33;
                                obj32 = obj32;
                                obj31 = obj31;
                                obj30 = obj30;
                                obj29 = obj29;
                                obj28 = obj28;
                                obj27 = obj27;
                                obj26 = obj26;
                                obj25 = obj25;
                                obj24 = obj24;
                                obj15 = obj15;
                                obj39 = obj39;
                                break;
                            case 27:
                                obj15 = obj15;
                                Object obj47 = obj16;
                                int i24 = i4;
                                objSealless20 = objSealless20;
                                obj38 = obj38;
                                Object objSealless59 = dernVarSaneness.sealless(descriptor2, 27, vinyl.taiyuan.f39500attabal, obj37);
                                i2 = i24 | 134217728;
                                Unit unit29 = Unit.f29295attabal;
                                obj37 = objSealless59;
                                obj16 = obj47;
                                obj14 = obj23;
                                obj24 = obj24;
                                obj25 = obj25;
                                obj26 = obj26;
                                obj27 = obj27;
                                obj28 = obj28;
                                obj29 = obj29;
                                obj30 = obj30;
                                obj31 = obj31;
                                obj32 = obj32;
                                obj33 = obj33;
                                obj34 = obj34;
                                obj35 = obj35;
                                obj36 = obj36;
                                objSealless20 = objSealless20;
                                obj15 = obj15;
                                i4 = i2;
                                obj23 = obj14;
                                obj38 = obj38;
                                obj37 = obj37;
                                obj36 = obj36;
                                obj35 = obj35;
                                obj34 = obj34;
                                obj33 = obj33;
                                obj32 = obj32;
                                obj31 = obj31;
                                obj30 = obj30;
                                obj29 = obj29;
                                obj28 = obj28;
                                obj27 = obj27;
                                obj26 = obj26;
                                obj25 = obj25;
                                obj24 = obj24;
                                obj15 = obj15;
                                obj39 = obj39;
                                break;
                            case 28:
                                obj15 = obj15;
                                int i25 = i4;
                                objSealless20 = objSealless20;
                                Object objSealless60 = dernVarSaneness.sealless(descriptor2, 28, vinyl.taiyuan.f39500attabal, obj38);
                                i2 = i25 | 268435456;
                                Unit unit30 = Unit.f29295attabal;
                                obj38 = objSealless60;
                                obj16 = obj16;
                                obj14 = obj23;
                                obj24 = obj24;
                                obj25 = obj25;
                                obj26 = obj26;
                                obj27 = obj27;
                                obj28 = obj28;
                                obj29 = obj29;
                                obj30 = obj30;
                                obj31 = obj31;
                                obj32 = obj32;
                                obj33 = obj33;
                                obj34 = obj34;
                                obj35 = obj35;
                                obj36 = obj36;
                                obj37 = obj37;
                                objSealless20 = objSealless20;
                                obj15 = obj15;
                                i4 = i2;
                                obj23 = obj14;
                                obj38 = obj38;
                                obj37 = obj37;
                                obj36 = obj36;
                                obj35 = obj35;
                                obj34 = obj34;
                                obj33 = obj33;
                                obj32 = obj32;
                                obj31 = obj31;
                                obj30 = obj30;
                                obj29 = obj29;
                                obj28 = obj28;
                                obj27 = obj27;
                                obj26 = obj26;
                                obj25 = obj25;
                                obj24 = obj24;
                                obj15 = obj15;
                                obj39 = obj39;
                                break;
                            case 29:
                                obj15 = obj15;
                                objSealless20 = dernVarSaneness.sealless(descriptor2, 29, splinterproof.f39488attabal, objSealless20);
                                i4 |= 536870912;
                                Unit unit31 = Unit.f29295attabal;
                                obj14 = obj23;
                                obj24 = obj24;
                                obj25 = obj25;
                                obj26 = obj26;
                                obj27 = obj27;
                                obj28 = obj28;
                                obj29 = obj29;
                                obj30 = obj30;
                                obj31 = obj31;
                                obj32 = obj32;
                                obj33 = obj33;
                                obj34 = obj34;
                                obj35 = obj35;
                                obj36 = obj36;
                                obj37 = obj37;
                                obj38 = obj38;
                                obj15 = obj15;
                                obj23 = obj14;
                                obj38 = obj38;
                                obj37 = obj37;
                                obj36 = obj36;
                                obj35 = obj35;
                                obj34 = obj34;
                                obj33 = obj33;
                                obj32 = obj32;
                                obj31 = obj31;
                                obj30 = obj30;
                                obj29 = obj29;
                                obj28 = obj28;
                                obj27 = obj27;
                                obj26 = obj26;
                                obj25 = obj25;
                                obj24 = obj24;
                                obj15 = obj15;
                                obj39 = obj39;
                                break;
                            default:
                                throw new UnknownFieldException(iImpassible);
                        }
                    }
                    Object obj48 = objSealless34;
                    objSealless = obj29;
                    obj2 = obj31;
                    obj3 = obj33;
                    obj4 = obj37;
                    Object obj49 = obj39;
                    int i26 = i4;
                    Object obj50 = obj15;
                    Object obj51 = objSealless20;
                    Object obj52 = obj16;
                    obj5 = obj23;
                    objSealless2 = obj18;
                    obj6 = obj20;
                    objSealless3 = obj22;
                    i = i26;
                    obj7 = obj32;
                    obj8 = obj30;
                    objSealless4 = obj28;
                    objSealless5 = obj27;
                    objSealless6 = obj26;
                    objSealless7 = obj25;
                    objSealless8 = obj24;
                    objSealless9 = obj48;
                    objSealless10 = objSealless35;
                    obj9 = obj52;
                    obj10 = obj17;
                    objSealless11 = obj19;
                    objSealless12 = obj21;
                    obj11 = obj50;
                    objSealless13 = obj51;
                    objSealless14 = objSealless36;
                    objSealless15 = obj49;
                    obj12 = obj38;
                    obj13 = obj36;
                    objSealless16 = obj35;
                    objSealless17 = obj34;
                }
                dernVarSaneness.dern(descriptor2);
                return new AdUnit(i, (String) objSealless15, (String) obj11, (String) obj9, (Integer) objSealless14, (Integer) objSealless10, (String) objSealless9, (Boolean) objSealless12, (Boolean) objSealless3, (String) obj6, (String) objSealless11, (Integer) objSealless2, (Integer) obj, (Map) obj10, (String) obj5, (String) objSealless8, (String) objSealless7, (List) objSealless6, (List) objSealless5, (ViewAbility) objSealless4, (String) objSealless, (TemplateSettings) obj8, (String) obj2, (String) obj7, (Integer) obj3, (Integer) objSealless17, (AdSizeInfo) objSealless16, (WebViewSettings) obj13, (Boolean) obj4, (Boolean) obj12, (Integer) objSealless13, (immediately) null);
            }

            @Override // asosan.impassible
            public void serialize(fastidiously.beachfront encoder, AdUnit value) {
                Intrinsics.checkNotNullParameter(encoder, "encoder");
                Intrinsics.checkNotNullParameter(value, "value");
                bristol.beachfront descriptor2 = getDescriptor();
                fastidiously.wireman wiremanVarSaneness = encoder.saneness(descriptor2);
                AdUnit.write$Self(value, wiremanVarSaneness, descriptor2);
                wiremanVarSaneness.dern(descriptor2);
            }
        }

        /* JADX INFO: renamed from: monacal.attabal$dern$saneness, reason: from kotlin metadata */
        /* JADX INFO: compiled from: AdPayload.kt */
        @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0016\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lmonacal/attabal$dern$saneness;", "", "<init>", "()V", "Lasosan/wireman;", "Lmonacal/attabal$dern;", "serializer", "()Lasosan/wireman;", "vungle-ads_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final asosan.wireman<AdUnit> serializer() {
                return C0737attabal.INSTANCE;
            }

            private Companion() {
            }
        }

        public AdUnit() {
            this((String) null, (String) null, (String) null, (Integer) null, (Integer) null, (String) null, (Boolean) null, (Boolean) null, (String) null, (String) null, (Integer) null, (Integer) null, (Map) null, (String) null, (String) null, (String) null, (List) null, (List) null, (ViewAbility) null, (String) null, (TemplateSettings) null, (String) null, (String) null, (Integer) null, (Integer) null, (AdSizeInfo) null, (WebViewSettings) null, (Boolean) null, (Boolean) null, (Integer) null, 1073741823, (DefaultConstructorMarker) null);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ AdUnit copy$default(AdUnit adUnit, String str, String str2, String str3, Integer num, Integer num2, String str4, Boolean bool, Boolean bool2, String str5, String str6, Integer num3, Integer num4, Map map, String str7, String str8, String str9, List list, List list2, ViewAbility viewAbility, String str10, TemplateSettings templateSettings, String str11, String str12, Integer num5, Integer num6, AdSizeInfo adSizeInfo, WebViewSettings webViewSettings, Boolean bool3, Boolean bool4, Integer num7, int i, Object obj) {
            Integer num8;
            Boolean bool5;
            String str13 = (i & 1) != 0 ? adUnit.id : str;
            String str14 = (i & 2) != 0 ? adUnit.adType : str2;
            String str15 = (i & 4) != 0 ? adUnit.adSource : str3;
            Integer num9 = (i & 8) != 0 ? adUnit.expiry : num;
            Integer num10 = (i & 16) != 0 ? adUnit.expiryDuration : num2;
            String str16 = (i & 32) != 0 ? adUnit.deeplinkUrl : str4;
            Boolean bool6 = (i & 64) != 0 ? adUnit.clickCoordinatesEnabled : bool;
            Boolean bool7 = (i & 128) != 0 ? adUnit.adLoadOptimizationEnabled : bool2;
            String str17 = (i & 256) != 0 ? adUnit.mediationName : str5;
            String str18 = (i & 512) != 0 ? adUnit.info : str6;
            Integer num11 = (i & 1024) != 0 ? adUnit.sleep : num3;
            Integer num12 = (i & 2048) != 0 ? adUnit.errorCode : num4;
            Map map2 = (i & 4096) != 0 ? adUnit.tpat : map;
            String str19 = (i & 8192) != 0 ? adUnit.vmURL : str7;
            String str20 = str13;
            String str21 = (i & 16384) != 0 ? adUnit.vmVersion : str8;
            String str22 = (i & 32768) != 0 ? adUnit.adMarketId : str9;
            List list3 = (i & 65536) != 0 ? adUnit.notification : list;
            List list4 = (i & 131072) != 0 ? adUnit.loadAdUrls : list2;
            ViewAbility viewAbility2 = (i & Opcodes.ASM4) != 0 ? adUnit.viewAbility : viewAbility;
            String str23 = (i & Opcodes.ASM8) != 0 ? adUnit.templateType : str10;
            TemplateSettings templateSettings2 = (i & ExtractorMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES) != 0 ? adUnit.templateSettings : templateSettings;
            String str24 = (i & 2097152) != 0 ? adUnit.creativeId : str11;
            String str25 = (i & 4194304) != 0 ? adUnit.advAppId : str12;
            Integer num13 = (i & 8388608) != 0 ? adUnit.showClose : num5;
            Integer num14 = (i & 16777216) != 0 ? adUnit.showCloseIncentivized : num6;
            AdSizeInfo adSizeInfo2 = (i & 33554432) != 0 ? adUnit.adSizeInfo : adSizeInfo;
            WebViewSettings webViewSettings2 = (i & 67108864) != 0 ? adUnit.webViewSettings : webViewSettings;
            Boolean bool8 = (i & 134217728) != 0 ? adUnit.usePreloading : bool3;
            Boolean bool9 = (i & 268435456) != 0 ? adUnit.partialDownloadEnabled : bool4;
            if ((i & 536870912) != 0) {
                bool5 = bool9;
                num8 = adUnit.maxDownloadRetryAttempts;
            } else {
                num8 = num7;
                bool5 = bool9;
            }
            return adUnit.copy(str20, str14, str15, num9, num10, str16, bool6, bool7, str17, str18, num11, num12, map2, str19, str21, str22, list3, list4, viewAbility2, str23, templateSettings2, str24, str25, num13, num14, adSizeInfo2, webViewSettings2, bool8, bool5, num8);
        }

        public static final void write$Self(AdUnit self, fastidiously.wireman output, bristol.beachfront serialDesc) {
            Integer num;
            Integer num2;
            Integer num3;
            Intrinsics.checkNotNullParameter(self, "self");
            Intrinsics.checkNotNullParameter(output, "output");
            Intrinsics.checkNotNullParameter(serialDesc, "serialDesc");
            if (output.cuirassed(serialDesc, 0) || self.id != null) {
                output.taiyuan(serialDesc, 0, licking.f39425attabal, self.id);
            }
            if (output.cuirassed(serialDesc, 1) || self.adType != null) {
                output.taiyuan(serialDesc, 1, licking.f39425attabal, self.adType);
            }
            if (output.cuirassed(serialDesc, 2) || self.adSource != null) {
                output.taiyuan(serialDesc, 2, licking.f39425attabal, self.adSource);
            }
            if (output.cuirassed(serialDesc, 3) || self.expiry != null) {
                output.taiyuan(serialDesc, 3, splinterproof.f39488attabal, self.expiry);
            }
            if (output.cuirassed(serialDesc, 4) || self.expiryDuration != null) {
                output.taiyuan(serialDesc, 4, splinterproof.f39488attabal, self.expiryDuration);
            }
            if (output.cuirassed(serialDesc, 5) || self.deeplinkUrl != null) {
                output.taiyuan(serialDesc, 5, licking.f39425attabal, self.deeplinkUrl);
            }
            if (output.cuirassed(serialDesc, 6) || self.clickCoordinatesEnabled != null) {
                output.taiyuan(serialDesc, 6, vinyl.taiyuan.f39500attabal, self.clickCoordinatesEnabled);
            }
            if (output.cuirassed(serialDesc, 7) || self.adLoadOptimizationEnabled != null) {
                output.taiyuan(serialDesc, 7, vinyl.taiyuan.f39500attabal, self.adLoadOptimizationEnabled);
            }
            if (output.cuirassed(serialDesc, 8) || self.mediationName != null) {
                output.taiyuan(serialDesc, 8, licking.f39425attabal, self.mediationName);
            }
            if (output.cuirassed(serialDesc, 9) || self.info != null) {
                output.taiyuan(serialDesc, 9, licking.f39425attabal, self.info);
            }
            if (output.cuirassed(serialDesc, 10) || self.sleep != null) {
                output.taiyuan(serialDesc, 10, splinterproof.f39488attabal, self.sleep);
            }
            if (output.cuirassed(serialDesc, 11) || self.errorCode != null) {
                output.taiyuan(serialDesc, 11, splinterproof.f39488attabal, self.errorCode);
            }
            if (output.cuirassed(serialDesc, 12) || self.tpat != null) {
                output.taiyuan(serialDesc, 12, taiyuan.INSTANCE, self.tpat);
            }
            if (output.cuirassed(serialDesc, 13) || self.vmURL != null) {
                output.taiyuan(serialDesc, 13, licking.f39425attabal, self.vmURL);
            }
            if (output.cuirassed(serialDesc, 14) || self.vmVersion != null) {
                output.taiyuan(serialDesc, 14, licking.f39425attabal, self.vmVersion);
            }
            if (output.cuirassed(serialDesc, 15) || self.adMarketId != null) {
                output.taiyuan(serialDesc, 15, licking.f39425attabal, self.adMarketId);
            }
            if (output.cuirassed(serialDesc, 16) || self.notification != null) {
                output.taiyuan(serialDesc, 16, new vinyl.beachfront(licking.f39425attabal), self.notification);
            }
            if (output.cuirassed(serialDesc, 17) || self.loadAdUrls != null) {
                output.taiyuan(serialDesc, 17, new vinyl.beachfront(licking.f39425attabal), self.loadAdUrls);
            }
            if (output.cuirassed(serialDesc, 18) || self.viewAbility != null) {
                output.taiyuan(serialDesc, 18, ViewAbility.C0736attabal.INSTANCE, self.viewAbility);
            }
            if (output.cuirassed(serialDesc, 19) || self.templateType != null) {
                output.taiyuan(serialDesc, 19, licking.f39425attabal, self.templateType);
            }
            if (output.cuirassed(serialDesc, 20) || self.templateSettings != null) {
                output.taiyuan(serialDesc, 20, TemplateSettings.C0739attabal.INSTANCE, self.templateSettings);
            }
            if (output.cuirassed(serialDesc, 21) || self.creativeId != null) {
                output.taiyuan(serialDesc, 21, licking.f39425attabal, self.creativeId);
            }
            if (output.cuirassed(serialDesc, 22) || self.advAppId != null) {
                output.taiyuan(serialDesc, 22, licking.f39425attabal, self.advAppId);
            }
            if (output.cuirassed(serialDesc, 23) || (num3 = self.showClose) == null || num3.intValue() != 0) {
                output.taiyuan(serialDesc, 23, splinterproof.f39488attabal, self.showClose);
            }
            if (output.cuirassed(serialDesc, 24) || (num2 = self.showCloseIncentivized) == null || num2.intValue() != 0) {
                output.taiyuan(serialDesc, 24, splinterproof.f39488attabal, self.showCloseIncentivized);
            }
            if (output.cuirassed(serialDesc, 25) || self.adSizeInfo != null) {
                output.taiyuan(serialDesc, 25, AdSizeInfo.C0741attabal.INSTANCE, self.adSizeInfo);
            }
            if (output.cuirassed(serialDesc, 26) || self.webViewSettings != null) {
                output.taiyuan(serialDesc, 26, WebViewSettings.C0738attabal.INSTANCE, self.webViewSettings);
            }
            if (output.cuirassed(serialDesc, 27) || !Intrinsics.wireman(self.usePreloading, Boolean.FALSE)) {
                output.taiyuan(serialDesc, 27, vinyl.taiyuan.f39500attabal, self.usePreloading);
            }
            if (output.cuirassed(serialDesc, 28) || self.partialDownloadEnabled != null) {
                output.taiyuan(serialDesc, 28, vinyl.taiyuan.f39500attabal, self.partialDownloadEnabled);
            }
            if (output.cuirassed(serialDesc, 29) || (num = self.maxDownloadRetryAttempts) == null || num.intValue() != 0) {
                output.taiyuan(serialDesc, 29, splinterproof.f39488attabal, self.maxDownloadRetryAttempts);
            }
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final String getId() {
            return this.id;
        }

        /* JADX INFO: renamed from: component10, reason: from getter */
        public final String getInfo() {
            return this.info;
        }

        /* JADX INFO: renamed from: component11, reason: from getter */
        public final Integer getSleep() {
            return this.sleep;
        }

        /* JADX INFO: renamed from: component12, reason: from getter */
        public final Integer getErrorCode() {
            return this.errorCode;
        }

        public final Map<String, List<String>> component13() {
            return this.tpat;
        }

        /* JADX INFO: renamed from: component14, reason: from getter */
        public final String getVmURL() {
            return this.vmURL;
        }

        /* JADX INFO: renamed from: component15, reason: from getter */
        public final String getVmVersion() {
            return this.vmVersion;
        }

        /* JADX INFO: renamed from: component16, reason: from getter */
        public final String getAdMarketId() {
            return this.adMarketId;
        }

        public final List<String> component17() {
            return this.notification;
        }

        public final List<String> component18() {
            return this.loadAdUrls;
        }

        /* JADX INFO: renamed from: component19, reason: from getter */
        public final ViewAbility getViewAbility() {
            return this.viewAbility;
        }

        /* JADX INFO: renamed from: component2, reason: from getter */
        public final String getAdType() {
            return this.adType;
        }

        /* JADX INFO: renamed from: component20, reason: from getter */
        public final String getTemplateType() {
            return this.templateType;
        }

        /* JADX INFO: renamed from: component21, reason: from getter */
        public final TemplateSettings getTemplateSettings() {
            return this.templateSettings;
        }

        /* JADX INFO: renamed from: component22, reason: from getter */
        public final String getCreativeId() {
            return this.creativeId;
        }

        /* JADX INFO: renamed from: component23, reason: from getter */
        public final String getAdvAppId() {
            return this.advAppId;
        }

        /* JADX INFO: renamed from: component24, reason: from getter */
        public final Integer getShowClose() {
            return this.showClose;
        }

        /* JADX INFO: renamed from: component25, reason: from getter */
        public final Integer getShowCloseIncentivized() {
            return this.showCloseIncentivized;
        }

        /* JADX INFO: renamed from: component26, reason: from getter */
        public final AdSizeInfo getAdSizeInfo() {
            return this.adSizeInfo;
        }

        /* JADX INFO: renamed from: component27, reason: from getter */
        public final WebViewSettings getWebViewSettings() {
            return this.webViewSettings;
        }

        /* JADX INFO: renamed from: component28, reason: from getter */
        public final Boolean getUsePreloading() {
            return this.usePreloading;
        }

        /* JADX INFO: renamed from: component29, reason: from getter */
        public final Boolean getPartialDownloadEnabled() {
            return this.partialDownloadEnabled;
        }

        /* JADX INFO: renamed from: component3, reason: from getter */
        public final String getAdSource() {
            return this.adSource;
        }

        /* JADX INFO: renamed from: component30, reason: from getter */
        public final Integer getMaxDownloadRetryAttempts() {
            return this.maxDownloadRetryAttempts;
        }

        /* JADX INFO: renamed from: component4, reason: from getter */
        public final Integer getExpiry() {
            return this.expiry;
        }

        /* JADX INFO: renamed from: component5, reason: from getter */
        public final Integer getExpiryDuration() {
            return this.expiryDuration;
        }

        /* JADX INFO: renamed from: component6, reason: from getter */
        public final String getDeeplinkUrl() {
            return this.deeplinkUrl;
        }

        /* JADX INFO: renamed from: component7, reason: from getter */
        public final Boolean getClickCoordinatesEnabled() {
            return this.clickCoordinatesEnabled;
        }

        /* JADX INFO: renamed from: component8, reason: from getter */
        public final Boolean getAdLoadOptimizationEnabled() {
            return this.adLoadOptimizationEnabled;
        }

        /* JADX INFO: renamed from: component9, reason: from getter */
        public final String getMediationName() {
            return this.mediationName;
        }

        public final AdUnit copy(String id, String adType, String adSource, Integer expiry, Integer expiryDuration, String deeplinkUrl, Boolean clickCoordinatesEnabled, Boolean adLoadOptimizationEnabled, String mediationName, String info, Integer sleep, Integer errorCode, Map<String, ? extends List<String>> tpat, String vmURL, String vmVersion, String adMarketId, List<String> notification, List<String> loadAdUrls, ViewAbility viewAbility, String templateType, TemplateSettings templateSettings, String creativeId, String advAppId, Integer showClose, Integer showCloseIncentivized, AdSizeInfo adSizeInfo, WebViewSettings webViewSettings, Boolean usePreloading, Boolean partialDownloadEnabled, Integer maxDownloadRetryAttempts) {
            return new AdUnit(id, adType, adSource, expiry, expiryDuration, deeplinkUrl, clickCoordinatesEnabled, adLoadOptimizationEnabled, mediationName, info, sleep, errorCode, tpat, vmURL, vmVersion, adMarketId, notification, loadAdUrls, viewAbility, templateType, templateSettings, creativeId, advAppId, showClose, showCloseIncentivized, adSizeInfo, webViewSettings, usePreloading, partialDownloadEnabled, maxDownloadRetryAttempts);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof AdUnit)) {
                return false;
            }
            AdUnit adUnit = (AdUnit) other;
            return Intrinsics.wireman(this.id, adUnit.id) && Intrinsics.wireman(this.adType, adUnit.adType) && Intrinsics.wireman(this.adSource, adUnit.adSource) && Intrinsics.wireman(this.expiry, adUnit.expiry) && Intrinsics.wireman(this.expiryDuration, adUnit.expiryDuration) && Intrinsics.wireman(this.deeplinkUrl, adUnit.deeplinkUrl) && Intrinsics.wireman(this.clickCoordinatesEnabled, adUnit.clickCoordinatesEnabled) && Intrinsics.wireman(this.adLoadOptimizationEnabled, adUnit.adLoadOptimizationEnabled) && Intrinsics.wireman(this.mediationName, adUnit.mediationName) && Intrinsics.wireman(this.info, adUnit.info) && Intrinsics.wireman(this.sleep, adUnit.sleep) && Intrinsics.wireman(this.errorCode, adUnit.errorCode) && Intrinsics.wireman(this.tpat, adUnit.tpat) && Intrinsics.wireman(this.vmURL, adUnit.vmURL) && Intrinsics.wireman(this.vmVersion, adUnit.vmVersion) && Intrinsics.wireman(this.adMarketId, adUnit.adMarketId) && Intrinsics.wireman(this.notification, adUnit.notification) && Intrinsics.wireman(this.loadAdUrls, adUnit.loadAdUrls) && Intrinsics.wireman(this.viewAbility, adUnit.viewAbility) && Intrinsics.wireman(this.templateType, adUnit.templateType) && Intrinsics.wireman(this.templateSettings, adUnit.templateSettings) && Intrinsics.wireman(this.creativeId, adUnit.creativeId) && Intrinsics.wireman(this.advAppId, adUnit.advAppId) && Intrinsics.wireman(this.showClose, adUnit.showClose) && Intrinsics.wireman(this.showCloseIncentivized, adUnit.showCloseIncentivized) && Intrinsics.wireman(this.adSizeInfo, adUnit.adSizeInfo) && Intrinsics.wireman(this.webViewSettings, adUnit.webViewSettings) && Intrinsics.wireman(this.usePreloading, adUnit.usePreloading) && Intrinsics.wireman(this.partialDownloadEnabled, adUnit.partialDownloadEnabled) && Intrinsics.wireman(this.maxDownloadRetryAttempts, adUnit.maxDownloadRetryAttempts);
        }

        public final Boolean getAdLoadOptimizationEnabled() {
            return this.adLoadOptimizationEnabled;
        }

        public final String getAdMarketId() {
            return this.adMarketId;
        }

        public final AdSizeInfo getAdSizeInfo() {
            return this.adSizeInfo;
        }

        public final String getAdSource() {
            return this.adSource;
        }

        public final String getAdType() {
            return this.adType;
        }

        public final String getAdvAppId() {
            return this.advAppId;
        }

        public final Boolean getClickCoordinatesEnabled() {
            return this.clickCoordinatesEnabled;
        }

        public final String getCreativeId() {
            return this.creativeId;
        }

        public final String getDeeplinkUrl() {
            return this.deeplinkUrl;
        }

        public final Integer getErrorCode() {
            return this.errorCode;
        }

        public final Integer getExpiry() {
            return this.expiry;
        }

        public final Integer getExpiryDuration() {
            return this.expiryDuration;
        }

        public final String getId() {
            return this.id;
        }

        public final String getInfo() {
            return this.info;
        }

        public final List<String> getLoadAdUrls() {
            return this.loadAdUrls;
        }

        public final Integer getMaxDownloadRetryAttempts() {
            return this.maxDownloadRetryAttempts;
        }

        public final String getMediationName() {
            return this.mediationName;
        }

        public final List<String> getNotification() {
            return this.notification;
        }

        public final Boolean getPartialDownloadEnabled() {
            return this.partialDownloadEnabled;
        }

        public final Integer getShowClose() {
            return this.showClose;
        }

        public final Integer getShowCloseIncentivized() {
            return this.showCloseIncentivized;
        }

        public final Integer getSleep() {
            return this.sleep;
        }

        public final TemplateSettings getTemplateSettings() {
            return this.templateSettings;
        }

        public final String getTemplateType() {
            return this.templateType;
        }

        public final Map<String, List<String>> getTpat() {
            return this.tpat;
        }

        public final Boolean getUsePreloading() {
            return this.usePreloading;
        }

        public final ViewAbility getViewAbility() {
            return this.viewAbility;
        }

        public final String getVmURL() {
            return this.vmURL;
        }

        public final String getVmVersion() {
            return this.vmVersion;
        }

        public final WebViewSettings getWebViewSettings() {
            return this.webViewSettings;
        }

        public int hashCode() {
            String str = this.id;
            int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
            String str2 = this.adType;
            int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
            String str3 = this.adSource;
            int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
            Integer num = this.expiry;
            int iHashCode4 = (iHashCode3 + (num == null ? 0 : num.hashCode())) * 31;
            Integer num2 = this.expiryDuration;
            int iHashCode5 = (iHashCode4 + (num2 == null ? 0 : num2.hashCode())) * 31;
            String str4 = this.deeplinkUrl;
            int iHashCode6 = (iHashCode5 + (str4 == null ? 0 : str4.hashCode())) * 31;
            Boolean bool = this.clickCoordinatesEnabled;
            int iHashCode7 = (iHashCode6 + (bool == null ? 0 : bool.hashCode())) * 31;
            Boolean bool2 = this.adLoadOptimizationEnabled;
            int iHashCode8 = (iHashCode7 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
            String str5 = this.mediationName;
            int iHashCode9 = (iHashCode8 + (str5 == null ? 0 : str5.hashCode())) * 31;
            String str6 = this.info;
            int iHashCode10 = (iHashCode9 + (str6 == null ? 0 : str6.hashCode())) * 31;
            Integer num3 = this.sleep;
            int iHashCode11 = (iHashCode10 + (num3 == null ? 0 : num3.hashCode())) * 31;
            Integer num4 = this.errorCode;
            int iHashCode12 = (iHashCode11 + (num4 == null ? 0 : num4.hashCode())) * 31;
            Map<String, List<String>> map = this.tpat;
            int iHashCode13 = (iHashCode12 + (map == null ? 0 : map.hashCode())) * 31;
            String str7 = this.vmURL;
            int iHashCode14 = (iHashCode13 + (str7 == null ? 0 : str7.hashCode())) * 31;
            String str8 = this.vmVersion;
            int iHashCode15 = (iHashCode14 + (str8 == null ? 0 : str8.hashCode())) * 31;
            String str9 = this.adMarketId;
            int iHashCode16 = (iHashCode15 + (str9 == null ? 0 : str9.hashCode())) * 31;
            List<String> list = this.notification;
            int iHashCode17 = (iHashCode16 + (list == null ? 0 : list.hashCode())) * 31;
            List<String> list2 = this.loadAdUrls;
            int iHashCode18 = (iHashCode17 + (list2 == null ? 0 : list2.hashCode())) * 31;
            ViewAbility viewAbility = this.viewAbility;
            int iHashCode19 = (iHashCode18 + (viewAbility == null ? 0 : viewAbility.hashCode())) * 31;
            String str10 = this.templateType;
            int iHashCode20 = (iHashCode19 + (str10 == null ? 0 : str10.hashCode())) * 31;
            TemplateSettings templateSettings = this.templateSettings;
            int iHashCode21 = (iHashCode20 + (templateSettings == null ? 0 : templateSettings.hashCode())) * 31;
            String str11 = this.creativeId;
            int iHashCode22 = (iHashCode21 + (str11 == null ? 0 : str11.hashCode())) * 31;
            String str12 = this.advAppId;
            int iHashCode23 = (iHashCode22 + (str12 == null ? 0 : str12.hashCode())) * 31;
            Integer num5 = this.showClose;
            int iHashCode24 = (iHashCode23 + (num5 == null ? 0 : num5.hashCode())) * 31;
            Integer num6 = this.showCloseIncentivized;
            int iHashCode25 = (iHashCode24 + (num6 == null ? 0 : num6.hashCode())) * 31;
            AdSizeInfo adSizeInfo = this.adSizeInfo;
            int iHashCode26 = (iHashCode25 + (adSizeInfo == null ? 0 : adSizeInfo.hashCode())) * 31;
            WebViewSettings webViewSettings = this.webViewSettings;
            int iHashCode27 = (iHashCode26 + (webViewSettings == null ? 0 : webViewSettings.hashCode())) * 31;
            Boolean bool3 = this.usePreloading;
            int iHashCode28 = (iHashCode27 + (bool3 == null ? 0 : bool3.hashCode())) * 31;
            Boolean bool4 = this.partialDownloadEnabled;
            int iHashCode29 = (iHashCode28 + (bool4 == null ? 0 : bool4.hashCode())) * 31;
            Integer num7 = this.maxDownloadRetryAttempts;
            return iHashCode29 + (num7 != null ? num7.hashCode() : 0);
        }

        public String toString() {
            return "AdUnit(id=" + this.id + ", adType=" + this.adType + ", adSource=" + this.adSource + ", expiry=" + this.expiry + ", expiryDuration=" + this.expiryDuration + ", deeplinkUrl=" + this.deeplinkUrl + ", clickCoordinatesEnabled=" + this.clickCoordinatesEnabled + ", adLoadOptimizationEnabled=" + this.adLoadOptimizationEnabled + ", mediationName=" + this.mediationName + ", info=" + this.info + ", sleep=" + this.sleep + ", errorCode=" + this.errorCode + ", tpat=" + this.tpat + ", vmURL=" + this.vmURL + ", vmVersion=" + this.vmVersion + ", adMarketId=" + this.adMarketId + ", notification=" + this.notification + ", loadAdUrls=" + this.loadAdUrls + ", viewAbility=" + this.viewAbility + ", templateType=" + this.templateType + ", templateSettings=" + this.templateSettings + ", creativeId=" + this.creativeId + ", advAppId=" + this.advAppId + ", showClose=" + this.showClose + ", showCloseIncentivized=" + this.showCloseIncentivized + ", adSizeInfo=" + this.adSizeInfo + ", webViewSettings=" + this.webViewSettings + ", usePreloading=" + this.usePreloading + ", partialDownloadEnabled=" + this.partialDownloadEnabled + ", maxDownloadRetryAttempts=" + this.maxDownloadRetryAttempts + ')';
        }

        /* JADX WARN: Multi-variable type inference failed */
        public AdUnit(String str, String str2, String str3, Integer num, Integer num2, String str4, Boolean bool, Boolean bool2, String str5, String str6, Integer num3, Integer num4, Map<String, ? extends List<String>> map, String str7, String str8, String str9, List<String> list, List<String> list2, ViewAbility viewAbility, String str10, TemplateSettings templateSettings, String str11, String str12, Integer num5, Integer num6, AdSizeInfo adSizeInfo, WebViewSettings webViewSettings, Boolean bool3, Boolean bool4, Integer num7) {
            this.id = str;
            this.adType = str2;
            this.adSource = str3;
            this.expiry = num;
            this.expiryDuration = num2;
            this.deeplinkUrl = str4;
            this.clickCoordinatesEnabled = bool;
            this.adLoadOptimizationEnabled = bool2;
            this.mediationName = str5;
            this.info = str6;
            this.sleep = num3;
            this.errorCode = num4;
            this.tpat = map;
            this.vmURL = str7;
            this.vmVersion = str8;
            this.adMarketId = str9;
            this.notification = list;
            this.loadAdUrls = list2;
            this.viewAbility = viewAbility;
            this.templateType = str10;
            this.templateSettings = templateSettings;
            this.creativeId = str11;
            this.advAppId = str12;
            this.showClose = num5;
            this.showCloseIncentivized = num6;
            this.adSizeInfo = adSizeInfo;
            this.webViewSettings = webViewSettings;
            this.usePreloading = bool3;
            this.partialDownloadEnabled = bool4;
            this.maxDownloadRetryAttempts = num7;
        }

        public static /* synthetic */ void getAdLoadOptimizationEnabled$annotations() {
        }

        public static /* synthetic */ void getAdMarketId$annotations() {
        }

        public static /* synthetic */ void getAdSizeInfo$annotations() {
        }

        public static /* synthetic */ void getAdSource$annotations() {
        }

        public static /* synthetic */ void getAdType$annotations() {
        }

        public static /* synthetic */ void getAdvAppId$annotations() {
        }

        public static /* synthetic */ void getClickCoordinatesEnabled$annotations() {
        }

        public static /* synthetic */ void getCreativeId$annotations() {
        }

        public static /* synthetic */ void getDeeplinkUrl$annotations() {
        }

        public static /* synthetic */ void getErrorCode$annotations() {
        }

        public static /* synthetic */ void getExpiry$annotations() {
        }

        public static /* synthetic */ void getExpiryDuration$annotations() {
        }

        public static /* synthetic */ void getId$annotations() {
        }

        public static /* synthetic */ void getInfo$annotations() {
        }

        public static /* synthetic */ void getLoadAdUrls$annotations() {
        }

        public static /* synthetic */ void getMaxDownloadRetryAttempts$annotations() {
        }

        public static /* synthetic */ void getMediationName$annotations() {
        }

        public static /* synthetic */ void getNotification$annotations() {
        }

        public static /* synthetic */ void getPartialDownloadEnabled$annotations() {
        }

        public static /* synthetic */ void getShowClose$annotations() {
        }

        public static /* synthetic */ void getShowCloseIncentivized$annotations() {
        }

        public static /* synthetic */ void getSleep$annotations() {
        }

        public static /* synthetic */ void getTemplateSettings$annotations() {
        }

        public static /* synthetic */ void getTemplateType$annotations() {
        }

        @formularize(with = taiyuan.class)
        public static /* synthetic */ void getTpat$annotations() {
        }

        public static /* synthetic */ void getUsePreloading$annotations() {
        }

        public static /* synthetic */ void getViewAbility$annotations() {
        }

        public static /* synthetic */ void getVmURL$annotations() {
        }

        public static /* synthetic */ void getVmVersion$annotations() {
        }

        public static /* synthetic */ void getWebViewSettings$annotations() {
        }

        @patroclinal.wireman
        public /* synthetic */ AdUnit(int i, String str, String str2, String str3, Integer num, Integer num2, String str4, Boolean bool, Boolean bool2, String str5, String str6, Integer num3, Integer num4, @formularize(with = taiyuan.class) Map map, String str7, String str8, String str9, List list, List list2, ViewAbility viewAbility, String str10, TemplateSettings templateSettings, String str11, String str12, Integer num5, Integer num6, AdSizeInfo adSizeInfo, WebViewSettings webViewSettings, Boolean bool3, Boolean bool4, Integer num7, immediately immediatelyVar) {
            if ((i & 1) == 0) {
                this.id = null;
            } else {
                this.id = str;
            }
            if ((i & 2) == 0) {
                this.adType = null;
            } else {
                this.adType = str2;
            }
            if ((i & 4) == 0) {
                this.adSource = null;
            } else {
                this.adSource = str3;
            }
            if ((i & 8) == 0) {
                this.expiry = null;
            } else {
                this.expiry = num;
            }
            if ((i & 16) == 0) {
                this.expiryDuration = null;
            } else {
                this.expiryDuration = num2;
            }
            if ((i & 32) == 0) {
                this.deeplinkUrl = null;
            } else {
                this.deeplinkUrl = str4;
            }
            if ((i & 64) == 0) {
                this.clickCoordinatesEnabled = null;
            } else {
                this.clickCoordinatesEnabled = bool;
            }
            if ((i & 128) == 0) {
                this.adLoadOptimizationEnabled = null;
            } else {
                this.adLoadOptimizationEnabled = bool2;
            }
            if ((i & 256) == 0) {
                this.mediationName = null;
            } else {
                this.mediationName = str5;
            }
            if ((i & 512) == 0) {
                this.info = null;
            } else {
                this.info = str6;
            }
            if ((i & 1024) == 0) {
                this.sleep = null;
            } else {
                this.sleep = num3;
            }
            if ((i & 2048) == 0) {
                this.errorCode = null;
            } else {
                this.errorCode = num4;
            }
            if ((i & 4096) == 0) {
                this.tpat = null;
            } else {
                this.tpat = map;
            }
            if ((i & 8192) == 0) {
                this.vmURL = null;
            } else {
                this.vmURL = str7;
            }
            if ((i & 16384) == 0) {
                this.vmVersion = null;
            } else {
                this.vmVersion = str8;
            }
            if ((32768 & i) == 0) {
                this.adMarketId = null;
            } else {
                this.adMarketId = str9;
            }
            if ((65536 & i) == 0) {
                this.notification = null;
            } else {
                this.notification = list;
            }
            if ((131072 & i) == 0) {
                this.loadAdUrls = null;
            } else {
                this.loadAdUrls = list2;
            }
            if ((262144 & i) == 0) {
                this.viewAbility = null;
            } else {
                this.viewAbility = viewAbility;
            }
            if ((524288 & i) == 0) {
                this.templateType = null;
            } else {
                this.templateType = str10;
            }
            if ((1048576 & i) == 0) {
                this.templateSettings = null;
            } else {
                this.templateSettings = templateSettings;
            }
            if ((2097152 & i) == 0) {
                this.creativeId = null;
            } else {
                this.creativeId = str11;
            }
            if ((4194304 & i) == 0) {
                this.advAppId = null;
            } else {
                this.advAppId = str12;
            }
            if ((8388608 & i) == 0) {
                this.showClose = 0;
            } else {
                this.showClose = num5;
            }
            if ((16777216 & i) == 0) {
                this.showCloseIncentivized = 0;
            } else {
                this.showCloseIncentivized = num6;
            }
            if ((33554432 & i) == 0) {
                this.adSizeInfo = null;
            } else {
                this.adSizeInfo = adSizeInfo;
            }
            if ((67108864 & i) == 0) {
                this.webViewSettings = null;
            } else {
                this.webViewSettings = webViewSettings;
            }
            this.usePreloading = (134217728 & i) == 0 ? Boolean.FALSE : bool3;
            if ((268435456 & i) == 0) {
                this.partialDownloadEnabled = null;
            } else {
                this.partialDownloadEnabled = bool4;
            }
            if ((i & 536870912) == 0) {
                this.maxDownloadRetryAttempts = 0;
            } else {
                this.maxDownloadRetryAttempts = num7;
            }
        }

        public /* synthetic */ AdUnit(String str, String str2, String str3, Integer num, Integer num2, String str4, Boolean bool, Boolean bool2, String str5, String str6, Integer num3, Integer num4, Map map, String str7, String str8, String str9, List list, List list2, ViewAbility viewAbility, String str10, TemplateSettings templateSettings, String str11, String str12, Integer num5, Integer num6, AdSizeInfo adSizeInfo, WebViewSettings webViewSettings, Boolean bool3, Boolean bool4, Integer num7, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? null : num, (i & 16) != 0 ? null : num2, (i & 32) != 0 ? null : str4, (i & 64) != 0 ? null : bool, (i & 128) != 0 ? null : bool2, (i & 256) != 0 ? null : str5, (i & 512) != 0 ? null : str6, (i & 1024) != 0 ? null : num3, (i & 2048) != 0 ? null : num4, (i & 4096) != 0 ? null : map, (i & 8192) != 0 ? null : str7, (i & 16384) != 0 ? null : str8, (i & 32768) != 0 ? null : str9, (i & 65536) != 0 ? null : list, (i & 131072) != 0 ? null : list2, (i & Opcodes.ASM4) != 0 ? null : viewAbility, (i & Opcodes.ASM8) != 0 ? null : str10, (i & ExtractorMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES) != 0 ? null : templateSettings, (i & 2097152) != 0 ? null : str11, (i & 4194304) != 0 ? null : str12, (i & 8388608) != 0 ? 0 : num5, (i & 16777216) != 0 ? 0 : num6, (i & 33554432) != 0 ? null : adSizeInfo, (i & 67108864) != 0 ? null : webViewSettings, (i & 134217728) != 0 ? Boolean.FALSE : bool3, (i & 268435456) != 0 ? null : bool4, (i & 536870912) != 0 ? 0 : num7);
        }
    }

    /* JADX INFO: renamed from: monacal.attabal$formularize, reason: from toString */
    /* JADX INFO: compiled from: AdPayload.kt */
    @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0011\b\u0087\b\u0018\u0000 '2\u00020\u0001:\u0002()B\u001f\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0005\u0010\u0006B3\b\u0017\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\n\b\u0001\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0001\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u0005\u0010\u000bJ(\u0010\u0012\u001a\u00020\u00112\u0006\u0010\f\u001a\u00020\u00002\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000fHÇ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0012\u0010\u0014\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0014\u0010\u0015J\u0012\u0010\u0016\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0016\u0010\u0015J(\u0010\u0017\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u001a\u001a\u00020\u0019HÖ\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001c\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\u001c\u0010\u001dJ\u001a\u0010\u001f\u001a\u00020\u00022\b\u0010\u001e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001f\u0010 R\"\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0003\u0010!\u0012\u0004\b#\u0010$\u001a\u0004\b\"\u0010\u0015R\"\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0004\u0010!\u0012\u0004\b&\u0010$\u001a\u0004\b%\u0010\u0015¨\u0006*"}, d2 = {"Lmonacal/attabal$formularize;", "", "", "allowFileAccessFromFileUrls", "allowUniversalAccessFromFileUrls", "<init>", "(Ljava/lang/Boolean;Ljava/lang/Boolean;)V", "", "seen1", "Lvinyl/immediately;", "serializationConstructorMarker", "(ILjava/lang/Boolean;Ljava/lang/Boolean;Lvinyl/immediately;)V", "self", "Lfastidiously/wireman;", AgentOptions.OUTPUT, "Lbristol/beachfront;", "serialDesc", "", "write$Self", "(Lmonacal/attabal$formularize;Lfastidiously/wireman;Lbristol/beachfront;)V", "component1", "()Ljava/lang/Boolean;", "component2", "copy", "(Ljava/lang/Boolean;Ljava/lang/Boolean;)Lmonacal/attabal$formularize;", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", C3414a2.d, "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/Boolean;", "getAllowFileAccessFromFileUrls", "getAllowFileAccessFromFileUrls$annotations", "()V", "getAllowUniversalAccessFromFileUrls", "getAllowUniversalAccessFromFileUrls$annotations", "Companion", "attabal", "saneness", "vungle-ads_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
    @formularize
    public static final /* data */ class WebViewSettings {

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private final Boolean allowFileAccessFromFileUrls;
        private final Boolean allowUniversalAccessFromFileUrls;

        /* JADX INFO: renamed from: monacal.attabal$formularize$attabal, reason: collision with other inner class name */
        /* JADX INFO: compiled from: AdPayload.kt */
        @Metadata(d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001a\u0010\u0007\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00060\u0005HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0018\u0010\u000b\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ \u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0016\u001a\u00020\u00138VXÖ\u0005¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u0017"}, d2 = {"com/vungle/ads/internal/model/AdPayload.WebViewSettings.$serializer", "Lvinyl/grimness;", "Lmonacal/attabal$formularize;", "<init>", "()V", "", "Lasosan/wireman;", "childSerializers", "()[Lasosan/wireman;", "Lfastidiously/marial;", "decoder", "deserialize", "(Lfastidiously/marial;)Lmonacal/attabal$formularize;", "Lfastidiously/beachfront;", "encoder", "value", "", "serialize", "(Lfastidiously/beachfront;Lmonacal/attabal$formularize;)V", "Lbristol/beachfront;", "getDescriptor", "()Lbristol/beachfront;", "descriptor", "vungle-ads_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
        @patroclinal.wireman
        public static final class C0738attabal implements grimness<WebViewSettings> {
            public static final C0738attabal INSTANCE;
            public static final /* synthetic */ bristol.beachfront descriptor;

            static {
                C0738attabal c0738attabal = new C0738attabal();
                INSTANCE = c0738attabal;
                vesuvio vesuvioVar = new vesuvio("com.vungle.ads.internal.model.AdPayload.WebViewSettings", c0738attabal, 2);
                vesuvioVar.kowloon("allow_file_access_from_file_urls", true);
                vesuvioVar.kowloon("allow_universal_access_from_file_urls", true);
                descriptor = vesuvioVar;
            }

            private C0738attabal() {
            }

            @Override // vinyl.grimness
            public asosan.wireman<?>[] childSerializers() {
                vinyl.taiyuan taiyuanVar = vinyl.taiyuan.f39500attabal;
                return new asosan.wireman[]{defendable.attabal.graveside(taiyuanVar), defendable.attabal.graveside(taiyuanVar)};
            }

            @Override // asosan.wireman, asosan.impassible, asosan.dern
            public bristol.beachfront getDescriptor() {
                return descriptor;
            }

            @Override // vinyl.grimness
            public asosan.wireman<?>[] typeParametersSerializers() {
                return grimness.attabal.attabal(this);
            }

            @Override // asosan.dern
            public WebViewSettings deserialize(fastidiously.marial decoder) {
                Object objSealless;
                int i;
                Object objSealless2;
                Intrinsics.checkNotNullParameter(decoder, "decoder");
                bristol.beachfront descriptor2 = getDescriptor();
                fastidiously.dern dernVarSaneness = decoder.saneness(descriptor2);
                immediately immediatelyVar = null;
                if (dernVarSaneness.triweekly()) {
                    vinyl.taiyuan taiyuanVar = vinyl.taiyuan.f39500attabal;
                    objSealless2 = dernVarSaneness.sealless(descriptor2, 0, taiyuanVar, null);
                    objSealless = dernVarSaneness.sealless(descriptor2, 1, taiyuanVar, null);
                    i = 3;
                } else {
                    boolean z = true;
                    int i2 = 0;
                    objSealless = null;
                    Object objSealless3 = null;
                    while (z) {
                        int iImpassible = dernVarSaneness.impassible(descriptor2);
                        if (iImpassible == -1) {
                            z = false;
                        } else if (iImpassible == 0) {
                            objSealless3 = dernVarSaneness.sealless(descriptor2, 0, vinyl.taiyuan.f39500attabal, objSealless3);
                            i2 |= 1;
                        } else {
                            if (iImpassible != 1) {
                                throw new UnknownFieldException(iImpassible);
                            }
                            objSealless = dernVarSaneness.sealless(descriptor2, 1, vinyl.taiyuan.f39500attabal, objSealless);
                            i2 |= 2;
                        }
                    }
                    i = i2;
                    objSealless2 = objSealless3;
                }
                dernVarSaneness.dern(descriptor2);
                return new WebViewSettings(i, (Boolean) objSealless2, (Boolean) objSealless, immediatelyVar);
            }

            @Override // asosan.impassible
            public void serialize(fastidiously.beachfront encoder, WebViewSettings value) {
                Intrinsics.checkNotNullParameter(encoder, "encoder");
                Intrinsics.checkNotNullParameter(value, "value");
                bristol.beachfront descriptor2 = getDescriptor();
                fastidiously.wireman wiremanVarSaneness = encoder.saneness(descriptor2);
                WebViewSettings.write$Self(value, wiremanVarSaneness, descriptor2);
                wiremanVarSaneness.dern(descriptor2);
            }
        }

        /* JADX INFO: renamed from: monacal.attabal$formularize$saneness, reason: from kotlin metadata */
        /* JADX INFO: compiled from: AdPayload.kt */
        @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0016\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lmonacal/attabal$formularize$saneness;", "", "<init>", "()V", "Lasosan/wireman;", "Lmonacal/attabal$formularize;", "serializer", "()Lasosan/wireman;", "vungle-ads_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final asosan.wireman<WebViewSettings> serializer() {
                return C0738attabal.INSTANCE;
            }

            private Companion() {
            }
        }

        public WebViewSettings() {
            this((Boolean) null, (Boolean) (0 == true ? 1 : 0), 3, (DefaultConstructorMarker) (0 == true ? 1 : 0));
        }

        public static /* synthetic */ WebViewSettings copy$default(WebViewSettings webViewSettings, Boolean bool, Boolean bool2, int i, Object obj) {
            if ((i & 1) != 0) {
                bool = webViewSettings.allowFileAccessFromFileUrls;
            }
            if ((i & 2) != 0) {
                bool2 = webViewSettings.allowUniversalAccessFromFileUrls;
            }
            return webViewSettings.copy(bool, bool2);
        }

        public static final void write$Self(WebViewSettings self, fastidiously.wireman output, bristol.beachfront serialDesc) {
            Intrinsics.checkNotNullParameter(self, "self");
            Intrinsics.checkNotNullParameter(output, "output");
            Intrinsics.checkNotNullParameter(serialDesc, "serialDesc");
            if (output.cuirassed(serialDesc, 0) || self.allowFileAccessFromFileUrls != null) {
                output.taiyuan(serialDesc, 0, vinyl.taiyuan.f39500attabal, self.allowFileAccessFromFileUrls);
            }
            if (!output.cuirassed(serialDesc, 1) && self.allowUniversalAccessFromFileUrls == null) {
                return;
            }
            output.taiyuan(serialDesc, 1, vinyl.taiyuan.f39500attabal, self.allowUniversalAccessFromFileUrls);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final Boolean getAllowFileAccessFromFileUrls() {
            return this.allowFileAccessFromFileUrls;
        }

        /* JADX INFO: renamed from: component2, reason: from getter */
        public final Boolean getAllowUniversalAccessFromFileUrls() {
            return this.allowUniversalAccessFromFileUrls;
        }

        public final WebViewSettings copy(Boolean allowFileAccessFromFileUrls, Boolean allowUniversalAccessFromFileUrls) {
            return new WebViewSettings(allowFileAccessFromFileUrls, allowUniversalAccessFromFileUrls);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof WebViewSettings)) {
                return false;
            }
            WebViewSettings webViewSettings = (WebViewSettings) other;
            return Intrinsics.wireman(this.allowFileAccessFromFileUrls, webViewSettings.allowFileAccessFromFileUrls) && Intrinsics.wireman(this.allowUniversalAccessFromFileUrls, webViewSettings.allowUniversalAccessFromFileUrls);
        }

        public final Boolean getAllowFileAccessFromFileUrls() {
            return this.allowFileAccessFromFileUrls;
        }

        public final Boolean getAllowUniversalAccessFromFileUrls() {
            return this.allowUniversalAccessFromFileUrls;
        }

        public int hashCode() {
            Boolean bool = this.allowFileAccessFromFileUrls;
            int iHashCode = (bool == null ? 0 : bool.hashCode()) * 31;
            Boolean bool2 = this.allowUniversalAccessFromFileUrls;
            return iHashCode + (bool2 != null ? bool2.hashCode() : 0);
        }

        public String toString() {
            return "WebViewSettings(allowFileAccessFromFileUrls=" + this.allowFileAccessFromFileUrls + ", allowUniversalAccessFromFileUrls=" + this.allowUniversalAccessFromFileUrls + ')';
        }

        @patroclinal.wireman
        public /* synthetic */ WebViewSettings(int i, Boolean bool, Boolean bool2, immediately immediatelyVar) {
            if ((i & 1) == 0) {
                this.allowFileAccessFromFileUrls = null;
            } else {
                this.allowFileAccessFromFileUrls = bool;
            }
            if ((i & 2) == 0) {
                this.allowUniversalAccessFromFileUrls = null;
            } else {
                this.allowUniversalAccessFromFileUrls = bool2;
            }
        }

        public WebViewSettings(Boolean bool, Boolean bool2) {
            this.allowFileAccessFromFileUrls = bool;
            this.allowUniversalAccessFromFileUrls = bool2;
        }

        public /* synthetic */ WebViewSettings(Boolean bool, Boolean bool2, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : bool, (i & 2) != 0 ? null : bool2);
        }

        public static /* synthetic */ void getAllowFileAccessFromFileUrls$annotations() {
        }

        public static /* synthetic */ void getAllowUniversalAccessFromFileUrls$annotations() {
        }
    }

    /* JADX INFO: compiled from: Comparisons.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u00002\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00018\u00008\u00002\u000e\u0010\u0003\u001a\n \u0001*\u0004\u0018\u00018\u00008\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {RequestConfiguration.MAX_AD_CONTENT_RATING_T, "kotlin.jvm.PlatformType", "a", DownloadCommon.DOWNLOAD_REPORT_FIND_FILE_RESULT_VALUE_B, "", "compare", "(Ljava/lang/Object;Ljava/lang/Object;)I", "<anonymous>"}, k = 3, mv = {1, 7, 1})
    public static final class impassible<T> implements Comparator {
        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.Comparator
        public final int compare(T t, T t2) {
            return frenchy.saneness.wireman(Boolean.valueOf(((AdAsset) t2).getIsRequired()), Boolean.valueOf(((AdAsset) t).getIsRequired()));
        }
    }

    /* JADX INFO: renamed from: monacal.attabal$impromptu, reason: from toString */
    /* JADX INFO: compiled from: AdPayload.kt */
    @Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\f\b\u0087\b\u0018\u0000 )2\u00020\u0001:\u0002*+B7\u0012\u0016\b\u0002\u0010\u0004\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002\u0012\u0016\b\u0002\u0010\u0006\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0002¢\u0006\u0004\b\u0007\u0010\bBK\b\u0017\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0016\b\u0001\u0010\u0004\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002\u0012\u0016\b\u0001\u0010\u0006\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0002\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\u0007\u0010\rJ(\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u000e\u001a\u00020\u00002\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u0011HÇ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u001e\u0010\u0016\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0016\u0010\u0017J\u001e\u0010\u0018\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0017J@\u0010\u0019\u001a\u00020\u00002\u0016\b\u0002\u0010\u0004\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00022\u0016\b\u0002\u0010\u0006\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001d\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\u001d\u0010\u001eJ\u001a\u0010!\u001a\u00020 2\b\u0010\u001f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b!\u0010\"R.\u0010\u0004\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0004\u0010#\u0012\u0004\b%\u0010&\u001a\u0004\b$\u0010\u0017R.\u0010\u0006\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0006\u0010#\u0012\u0004\b(\u0010&\u001a\u0004\b'\u0010\u0017¨\u0006,"}, d2 = {"Lmonacal/attabal$impromptu;", "", "", "", "normalReplacements", "Lmonacal/attabal$marial;", "cacheableReplacements", "<init>", "(Ljava/util/Map;Ljava/util/Map;)V", "", "seen1", "Lvinyl/immediately;", "serializationConstructorMarker", "(ILjava/util/Map;Ljava/util/Map;Lvinyl/immediately;)V", "self", "Lfastidiously/wireman;", AgentOptions.OUTPUT, "Lbristol/beachfront;", "serialDesc", "", "write$Self", "(Lmonacal/attabal$impromptu;Lfastidiously/wireman;Lbristol/beachfront;)V", "component1", "()Ljava/util/Map;", "component2", "copy", "(Ljava/util/Map;Ljava/util/Map;)Lmonacal/attabal$impromptu;", "toString", "()Ljava/lang/String;", "hashCode", "()I", C3414a2.d, "", "equals", "(Ljava/lang/Object;)Z", "Ljava/util/Map;", "getNormalReplacements", "getNormalReplacements$annotations", "()V", "getCacheableReplacements", "getCacheableReplacements$annotations", "Companion", "attabal", "saneness", "vungle-ads_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
    @formularize
    public static final /* data */ class TemplateSettings {

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private final Map<String, CacheableReplacement> cacheableReplacements;
        private final Map<String, String> normalReplacements;

        /* JADX INFO: renamed from: monacal.attabal$impromptu$attabal, reason: collision with other inner class name */
        /* JADX INFO: compiled from: AdPayload.kt */
        @Metadata(d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001a\u0010\u0007\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00060\u0005HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0018\u0010\u000b\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ \u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0016\u001a\u00020\u00138VXÖ\u0005¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u0017"}, d2 = {"com/vungle/ads/internal/model/AdPayload.TemplateSettings.$serializer", "Lvinyl/grimness;", "Lmonacal/attabal$impromptu;", "<init>", "()V", "", "Lasosan/wireman;", "childSerializers", "()[Lasosan/wireman;", "Lfastidiously/marial;", "decoder", "deserialize", "(Lfastidiously/marial;)Lmonacal/attabal$impromptu;", "Lfastidiously/beachfront;", "encoder", "value", "", "serialize", "(Lfastidiously/beachfront;Lmonacal/attabal$impromptu;)V", "Lbristol/beachfront;", "getDescriptor", "()Lbristol/beachfront;", "descriptor", "vungle-ads_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
        @patroclinal.wireman
        public static final class C0739attabal implements grimness<TemplateSettings> {
            public static final C0739attabal INSTANCE;
            public static final /* synthetic */ bristol.beachfront descriptor;

            static {
                C0739attabal c0739attabal = new C0739attabal();
                INSTANCE = c0739attabal;
                vesuvio vesuvioVar = new vesuvio("com.vungle.ads.internal.model.AdPayload.TemplateSettings", c0739attabal, 2);
                vesuvioVar.kowloon("normal_replacements", true);
                vesuvioVar.kowloon("cacheable_replacements", true);
                descriptor = vesuvioVar;
            }

            private C0739attabal() {
            }

            @Override // vinyl.grimness
            public asosan.wireman<?>[] childSerializers() {
                licking lickingVar = licking.f39425attabal;
                return new asosan.wireman[]{defendable.attabal.graveside(new cultivated(lickingVar, lickingVar)), defendable.attabal.graveside(new cultivated(lickingVar, CacheableReplacement.C0740attabal.INSTANCE))};
            }

            @Override // asosan.wireman, asosan.impassible, asosan.dern
            public bristol.beachfront getDescriptor() {
                return descriptor;
            }

            @Override // vinyl.grimness
            public asosan.wireman<?>[] typeParametersSerializers() {
                return grimness.attabal.attabal(this);
            }

            @Override // asosan.dern
            public TemplateSettings deserialize(fastidiously.marial decoder) {
                Object objSealless;
                Object objSealless2;
                int i;
                Intrinsics.checkNotNullParameter(decoder, "decoder");
                bristol.beachfront descriptor2 = getDescriptor();
                fastidiously.dern dernVarSaneness = decoder.saneness(descriptor2);
                immediately immediatelyVar = null;
                if (dernVarSaneness.triweekly()) {
                    licking lickingVar = licking.f39425attabal;
                    objSealless = dernVarSaneness.sealless(descriptor2, 0, new cultivated(lickingVar, lickingVar), null);
                    objSealless2 = dernVarSaneness.sealless(descriptor2, 1, new cultivated(lickingVar, CacheableReplacement.C0740attabal.INSTANCE), null);
                    i = 3;
                } else {
                    boolean z = true;
                    int i2 = 0;
                    objSealless = null;
                    Object objSealless3 = null;
                    while (z) {
                        int iImpassible = dernVarSaneness.impassible(descriptor2);
                        if (iImpassible == -1) {
                            z = false;
                        } else if (iImpassible == 0) {
                            licking lickingVar2 = licking.f39425attabal;
                            objSealless = dernVarSaneness.sealless(descriptor2, 0, new cultivated(lickingVar2, lickingVar2), objSealless);
                            i2 |= 1;
                        } else {
                            if (iImpassible != 1) {
                                throw new UnknownFieldException(iImpassible);
                            }
                            objSealless3 = dernVarSaneness.sealless(descriptor2, 1, new cultivated(licking.f39425attabal, CacheableReplacement.C0740attabal.INSTANCE), objSealless3);
                            i2 |= 2;
                        }
                    }
                    objSealless2 = objSealless3;
                    i = i2;
                }
                dernVarSaneness.dern(descriptor2);
                return new TemplateSettings(i, (Map) objSealless, (Map) objSealless2, immediatelyVar);
            }

            @Override // asosan.impassible
            public void serialize(fastidiously.beachfront encoder, TemplateSettings value) {
                Intrinsics.checkNotNullParameter(encoder, "encoder");
                Intrinsics.checkNotNullParameter(value, "value");
                bristol.beachfront descriptor2 = getDescriptor();
                fastidiously.wireman wiremanVarSaneness = encoder.saneness(descriptor2);
                TemplateSettings.write$Self(value, wiremanVarSaneness, descriptor2);
                wiremanVarSaneness.dern(descriptor2);
            }
        }

        /* JADX INFO: renamed from: monacal.attabal$impromptu$saneness, reason: from kotlin metadata */
        /* JADX INFO: compiled from: AdPayload.kt */
        @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0016\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lmonacal/attabal$impromptu$saneness;", "", "<init>", "()V", "Lasosan/wireman;", "Lmonacal/attabal$impromptu;", "serializer", "()Lasosan/wireman;", "vungle-ads_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final asosan.wireman<TemplateSettings> serializer() {
                return C0739attabal.INSTANCE;
            }

            private Companion() {
            }
        }

        public TemplateSettings() {
            this((Map) null, (Map) (0 == true ? 1 : 0), 3, (DefaultConstructorMarker) (0 == true ? 1 : 0));
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ TemplateSettings copy$default(TemplateSettings templateSettings, Map map, Map map2, int i, Object obj) {
            if ((i & 1) != 0) {
                map = templateSettings.normalReplacements;
            }
            if ((i & 2) != 0) {
                map2 = templateSettings.cacheableReplacements;
            }
            return templateSettings.copy(map, map2);
        }

        public static final void write$Self(TemplateSettings self, fastidiously.wireman output, bristol.beachfront serialDesc) {
            Intrinsics.checkNotNullParameter(self, "self");
            Intrinsics.checkNotNullParameter(output, "output");
            Intrinsics.checkNotNullParameter(serialDesc, "serialDesc");
            if (output.cuirassed(serialDesc, 0) || self.normalReplacements != null) {
                licking lickingVar = licking.f39425attabal;
                output.taiyuan(serialDesc, 0, new cultivated(lickingVar, lickingVar), self.normalReplacements);
            }
            if (!output.cuirassed(serialDesc, 1) && self.cacheableReplacements == null) {
                return;
            }
            output.taiyuan(serialDesc, 1, new cultivated(licking.f39425attabal, CacheableReplacement.C0740attabal.INSTANCE), self.cacheableReplacements);
        }

        public final Map<String, String> component1() {
            return this.normalReplacements;
        }

        public final Map<String, CacheableReplacement> component2() {
            return this.cacheableReplacements;
        }

        public final TemplateSettings copy(Map<String, String> normalReplacements, Map<String, CacheableReplacement> cacheableReplacements) {
            return new TemplateSettings(normalReplacements, cacheableReplacements);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof TemplateSettings)) {
                return false;
            }
            TemplateSettings templateSettings = (TemplateSettings) other;
            return Intrinsics.wireman(this.normalReplacements, templateSettings.normalReplacements) && Intrinsics.wireman(this.cacheableReplacements, templateSettings.cacheableReplacements);
        }

        public final Map<String, CacheableReplacement> getCacheableReplacements() {
            return this.cacheableReplacements;
        }

        public final Map<String, String> getNormalReplacements() {
            return this.normalReplacements;
        }

        public int hashCode() {
            Map<String, String> map = this.normalReplacements;
            int iHashCode = (map == null ? 0 : map.hashCode()) * 31;
            Map<String, CacheableReplacement> map2 = this.cacheableReplacements;
            return iHashCode + (map2 != null ? map2.hashCode() : 0);
        }

        public String toString() {
            return "TemplateSettings(normalReplacements=" + this.normalReplacements + ", cacheableReplacements=" + this.cacheableReplacements + ')';
        }

        @patroclinal.wireman
        public /* synthetic */ TemplateSettings(int i, Map map, Map map2, immediately immediatelyVar) {
            if ((i & 1) == 0) {
                this.normalReplacements = null;
            } else {
                this.normalReplacements = map;
            }
            if ((i & 2) == 0) {
                this.cacheableReplacements = null;
            } else {
                this.cacheableReplacements = map2;
            }
        }

        public TemplateSettings(Map<String, String> map, Map<String, CacheableReplacement> map2) {
            this.normalReplacements = map;
            this.cacheableReplacements = map2;
        }

        public /* synthetic */ TemplateSettings(Map map, Map map2, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : map, (i & 2) != 0 ? null : map2);
        }

        public static /* synthetic */ void getCacheableReplacements$annotations() {
        }

        public static /* synthetic */ void getNormalReplacements$annotations() {
        }
    }

    /* JADX INFO: renamed from: monacal.attabal$marial, reason: from toString */
    /* JADX INFO: compiled from: AdPayload.kt */
    @Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\r\b\u0087\b\u0018\u0000 *2\u00020\u0001:\u0002+,B+\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bB;\b\u0017\u0012\u0006\u0010\t\u001a\u00020\u0005\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0001\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u0007\u0010\fJ(\u0010\u0013\u001a\u00020\u00122\u0006\u0010\r\u001a\u00020\u00002\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0010HÇ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0012\u0010\u0015\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0015\u0010\u0016J\u0012\u0010\u0017\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0017\u0010\u0016J\u0012\u0010\u0018\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0019J4\u0010\u001a\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005HÆ\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001c\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001c\u0010\u0016J\u0010\u0010\u001d\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u001d\u0010\u001eJ\u001a\u0010!\u001a\u00020 2\b\u0010\u001f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b!\u0010\"R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010#\u001a\u0004\b$\u0010\u0016R\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010#\u001a\u0004\b%\u0010\u0016R\"\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0006\u0010&\u0012\u0004\b(\u0010)\u001a\u0004\b'\u0010\u0019¨\u0006-"}, d2 = {"Lmonacal/attabal$marial;", "", "", "url", "extension", "", "downloadPercent", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;)V", "seen1", "Lvinyl/immediately;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Lvinyl/immediately;)V", "self", "Lfastidiously/wireman;", AgentOptions.OUTPUT, "Lbristol/beachfront;", "serialDesc", "", "write$Self", "(Lmonacal/attabal$marial;Lfastidiously/wireman;Lbristol/beachfront;)V", "component1", "()Ljava/lang/String;", "component2", "component3", "()Ljava/lang/Integer;", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;)Lmonacal/attabal$marial;", "toString", "hashCode", "()I", C3414a2.d, "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getUrl", "getExtension", "Ljava/lang/Integer;", "getDownloadPercent", "getDownloadPercent$annotations", "()V", "Companion", "attabal", "saneness", "vungle-ads_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
    @formularize
    public static final /* data */ class CacheableReplacement {

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private final Integer downloadPercent;
        private final String extension;
        private final String url;

        /* JADX INFO: renamed from: monacal.attabal$marial$attabal, reason: collision with other inner class name */
        /* JADX INFO: compiled from: AdPayload.kt */
        @Metadata(d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001a\u0010\u0007\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00060\u0005HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0018\u0010\u000b\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ \u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0016\u001a\u00020\u00138VXÖ\u0005¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u0017"}, d2 = {"com/vungle/ads/internal/model/AdPayload.CacheableReplacement.$serializer", "Lvinyl/grimness;", "Lmonacal/attabal$marial;", "<init>", "()V", "", "Lasosan/wireman;", "childSerializers", "()[Lasosan/wireman;", "Lfastidiously/marial;", "decoder", "deserialize", "(Lfastidiously/marial;)Lmonacal/attabal$marial;", "Lfastidiously/beachfront;", "encoder", "value", "", "serialize", "(Lfastidiously/beachfront;Lmonacal/attabal$marial;)V", "Lbristol/beachfront;", "getDescriptor", "()Lbristol/beachfront;", "descriptor", "vungle-ads_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
        @patroclinal.wireman
        public static final class C0740attabal implements grimness<CacheableReplacement> {
            public static final C0740attabal INSTANCE;
            public static final /* synthetic */ bristol.beachfront descriptor;

            static {
                C0740attabal c0740attabal = new C0740attabal();
                INSTANCE = c0740attabal;
                vesuvio vesuvioVar = new vesuvio("com.vungle.ads.internal.model.AdPayload.CacheableReplacement", c0740attabal, 3);
                vesuvioVar.kowloon("url", true);
                vesuvioVar.kowloon("extension", true);
                vesuvioVar.kowloon("download_percent", true);
                descriptor = vesuvioVar;
            }

            private C0740attabal() {
            }

            @Override // vinyl.grimness
            public asosan.wireman<?>[] childSerializers() {
                licking lickingVar = licking.f39425attabal;
                return new asosan.wireman[]{defendable.attabal.graveside(lickingVar), defendable.attabal.graveside(lickingVar), defendable.attabal.graveside(splinterproof.f39488attabal)};
            }

            @Override // asosan.wireman, asosan.impassible, asosan.dern
            public bristol.beachfront getDescriptor() {
                return descriptor;
            }

            @Override // vinyl.grimness
            public asosan.wireman<?>[] typeParametersSerializers() {
                return grimness.attabal.attabal(this);
            }

            @Override // asosan.dern
            public CacheableReplacement deserialize(fastidiously.marial decoder) {
                int i;
                Object objSealless;
                Object objSealless2;
                Intrinsics.checkNotNullParameter(decoder, "decoder");
                bristol.beachfront descriptor2 = getDescriptor();
                fastidiously.dern dernVarSaneness = decoder.saneness(descriptor2);
                Object objSealless3 = null;
                if (dernVarSaneness.triweekly()) {
                    licking lickingVar = licking.f39425attabal;
                    Object objSealless4 = dernVarSaneness.sealless(descriptor2, 0, lickingVar, null);
                    objSealless = dernVarSaneness.sealless(descriptor2, 1, lickingVar, null);
                    objSealless2 = dernVarSaneness.sealless(descriptor2, 2, splinterproof.f39488attabal, null);
                    objSealless3 = objSealless4;
                    i = 7;
                } else {
                    boolean z = true;
                    int i2 = 0;
                    Object objSealless5 = null;
                    Object objSealless6 = null;
                    while (z) {
                        int iImpassible = dernVarSaneness.impassible(descriptor2);
                        if (iImpassible == -1) {
                            z = false;
                        } else if (iImpassible == 0) {
                            objSealless3 = dernVarSaneness.sealless(descriptor2, 0, licking.f39425attabal, objSealless3);
                            i2 |= 1;
                        } else if (iImpassible == 1) {
                            objSealless5 = dernVarSaneness.sealless(descriptor2, 1, licking.f39425attabal, objSealless5);
                            i2 |= 2;
                        } else {
                            if (iImpassible != 2) {
                                throw new UnknownFieldException(iImpassible);
                            }
                            objSealless6 = dernVarSaneness.sealless(descriptor2, 2, splinterproof.f39488attabal, objSealless6);
                            i2 |= 4;
                        }
                    }
                    i = i2;
                    objSealless = objSealless5;
                    objSealless2 = objSealless6;
                }
                dernVarSaneness.dern(descriptor2);
                return new CacheableReplacement(i, (String) objSealless3, (String) objSealless, (Integer) objSealless2, (immediately) null);
            }

            @Override // asosan.impassible
            public void serialize(fastidiously.beachfront encoder, CacheableReplacement value) {
                Intrinsics.checkNotNullParameter(encoder, "encoder");
                Intrinsics.checkNotNullParameter(value, "value");
                bristol.beachfront descriptor2 = getDescriptor();
                fastidiously.wireman wiremanVarSaneness = encoder.saneness(descriptor2);
                CacheableReplacement.write$Self(value, wiremanVarSaneness, descriptor2);
                wiremanVarSaneness.dern(descriptor2);
            }
        }

        /* JADX INFO: renamed from: monacal.attabal$marial$saneness, reason: from kotlin metadata */
        /* JADX INFO: compiled from: AdPayload.kt */
        @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0016\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lmonacal/attabal$marial$saneness;", "", "<init>", "()V", "Lasosan/wireman;", "Lmonacal/attabal$marial;", "serializer", "()Lasosan/wireman;", "vungle-ads_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final asosan.wireman<CacheableReplacement> serializer() {
                return C0740attabal.INSTANCE;
            }

            private Companion() {
            }
        }

        public CacheableReplacement() {
            this((String) null, (String) null, (Integer) null, 7, (DefaultConstructorMarker) null);
        }

        public static /* synthetic */ CacheableReplacement copy$default(CacheableReplacement cacheableReplacement, String str, String str2, Integer num, int i, Object obj) {
            if ((i & 1) != 0) {
                str = cacheableReplacement.url;
            }
            if ((i & 2) != 0) {
                str2 = cacheableReplacement.extension;
            }
            if ((i & 4) != 0) {
                num = cacheableReplacement.downloadPercent;
            }
            return cacheableReplacement.copy(str, str2, num);
        }

        public static final void write$Self(CacheableReplacement self, fastidiously.wireman output, bristol.beachfront serialDesc) {
            Intrinsics.checkNotNullParameter(self, "self");
            Intrinsics.checkNotNullParameter(output, "output");
            Intrinsics.checkNotNullParameter(serialDesc, "serialDesc");
            if (output.cuirassed(serialDesc, 0) || self.url != null) {
                output.taiyuan(serialDesc, 0, licking.f39425attabal, self.url);
            }
            if (output.cuirassed(serialDesc, 1) || self.extension != null) {
                output.taiyuan(serialDesc, 1, licking.f39425attabal, self.extension);
            }
            if (!output.cuirassed(serialDesc, 2) && self.downloadPercent == null) {
                return;
            }
            output.taiyuan(serialDesc, 2, splinterproof.f39488attabal, self.downloadPercent);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final String getUrl() {
            return this.url;
        }

        /* JADX INFO: renamed from: component2, reason: from getter */
        public final String getExtension() {
            return this.extension;
        }

        /* JADX INFO: renamed from: component3, reason: from getter */
        public final Integer getDownloadPercent() {
            return this.downloadPercent;
        }

        public final CacheableReplacement copy(String url, String extension, Integer downloadPercent) {
            return new CacheableReplacement(url, extension, downloadPercent);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof CacheableReplacement)) {
                return false;
            }
            CacheableReplacement cacheableReplacement = (CacheableReplacement) other;
            return Intrinsics.wireman(this.url, cacheableReplacement.url) && Intrinsics.wireman(this.extension, cacheableReplacement.extension) && Intrinsics.wireman(this.downloadPercent, cacheableReplacement.downloadPercent);
        }

        public final Integer getDownloadPercent() {
            return this.downloadPercent;
        }

        public final String getExtension() {
            return this.extension;
        }

        public final String getUrl() {
            return this.url;
        }

        public int hashCode() {
            String str = this.url;
            int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
            String str2 = this.extension;
            int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
            Integer num = this.downloadPercent;
            return iHashCode2 + (num != null ? num.hashCode() : 0);
        }

        public String toString() {
            return "CacheableReplacement(url=" + this.url + ", extension=" + this.extension + ", downloadPercent=" + this.downloadPercent + ')';
        }

        @patroclinal.wireman
        public /* synthetic */ CacheableReplacement(int i, String str, String str2, Integer num, immediately immediatelyVar) {
            if ((i & 1) == 0) {
                this.url = null;
            } else {
                this.url = str;
            }
            if ((i & 2) == 0) {
                this.extension = null;
            } else {
                this.extension = str2;
            }
            if ((i & 4) == 0) {
                this.downloadPercent = null;
            } else {
                this.downloadPercent = num;
            }
        }

        public CacheableReplacement(String str, String str2, Integer num) {
            this.url = str;
            this.extension = str2;
            this.downloadPercent = num;
        }

        public /* synthetic */ CacheableReplacement(String str, String str2, Integer num, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : num);
        }

        public static /* synthetic */ void getDownloadPercent$annotations() {
        }
    }

    /* JADX INFO: renamed from: monacal.attabal$saneness, reason: from toString */
    /* JADX INFO: compiled from: AdPayload.kt */
    @Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\f\b\u0087\b\u0018\u0000 '2\u00020\u0001:\u0002()B\u001f\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0005\u0010\u0006B3\b\u0017\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\n\b\u0001\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0001\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\u0005\u0010\nJ(\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000b\u001a\u00020\u00002\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000eHÇ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0012\u0010\u0013\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0013\u0010\u0014J\u0012\u0010\u0015\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0015\u0010\u0014J(\u0010\u0016\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0019\u001a\u00020\u0018HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u001a\u0010\u001f\u001a\u00020\u001e2\b\u0010\u001d\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001f\u0010 R\"\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0003\u0010!\u0012\u0004\b#\u0010$\u001a\u0004\b\"\u0010\u0014R\"\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0004\u0010!\u0012\u0004\b&\u0010$\u001a\u0004\b%\u0010\u0014¨\u0006*"}, d2 = {"Lmonacal/attabal$saneness;", "", "", "width", "height", "<init>", "(Ljava/lang/Integer;Ljava/lang/Integer;)V", "seen1", "Lvinyl/immediately;", "serializationConstructorMarker", "(ILjava/lang/Integer;Ljava/lang/Integer;Lvinyl/immediately;)V", "self", "Lfastidiously/wireman;", AgentOptions.OUTPUT, "Lbristol/beachfront;", "serialDesc", "", "write$Self", "(Lmonacal/attabal$saneness;Lfastidiously/wireman;Lbristol/beachfront;)V", "component1", "()Ljava/lang/Integer;", "component2", "copy", "(Ljava/lang/Integer;Ljava/lang/Integer;)Lmonacal/attabal$saneness;", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", C3414a2.d, "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/Integer;", "getWidth", "getWidth$annotations", "()V", "getHeight", "getHeight$annotations", "Companion", "attabal", "saneness", "vungle-ads_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
    @formularize
    public static final /* data */ class AdSizeInfo {

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private final Integer height;
        private final Integer width;

        /* JADX INFO: renamed from: monacal.attabal$saneness$attabal, reason: collision with other inner class name */
        /* JADX INFO: compiled from: AdPayload.kt */
        @Metadata(d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001a\u0010\u0007\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00060\u0005HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0018\u0010\u000b\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ \u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0016\u001a\u00020\u00138VXÖ\u0005¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u0017"}, d2 = {"com/vungle/ads/internal/model/AdPayload.AdSizeInfo.$serializer", "Lvinyl/grimness;", "Lmonacal/attabal$saneness;", "<init>", "()V", "", "Lasosan/wireman;", "childSerializers", "()[Lasosan/wireman;", "Lfastidiously/marial;", "decoder", "deserialize", "(Lfastidiously/marial;)Lmonacal/attabal$saneness;", "Lfastidiously/beachfront;", "encoder", "value", "", "serialize", "(Lfastidiously/beachfront;Lmonacal/attabal$saneness;)V", "Lbristol/beachfront;", "getDescriptor", "()Lbristol/beachfront;", "descriptor", "vungle-ads_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
        @patroclinal.wireman
        public static final class C0741attabal implements grimness<AdSizeInfo> {
            public static final C0741attabal INSTANCE;
            public static final /* synthetic */ bristol.beachfront descriptor;

            static {
                C0741attabal c0741attabal = new C0741attabal();
                INSTANCE = c0741attabal;
                vesuvio vesuvioVar = new vesuvio("com.vungle.ads.internal.model.AdPayload.AdSizeInfo", c0741attabal, 2);
                vesuvioVar.kowloon("w", true);
                vesuvioVar.kowloon("h", true);
                descriptor = vesuvioVar;
            }

            private C0741attabal() {
            }

            @Override // vinyl.grimness
            public asosan.wireman<?>[] childSerializers() {
                splinterproof splinterproofVar = splinterproof.f39488attabal;
                return new asosan.wireman[]{defendable.attabal.graveside(splinterproofVar), defendable.attabal.graveside(splinterproofVar)};
            }

            @Override // asosan.wireman, asosan.impassible, asosan.dern
            public bristol.beachfront getDescriptor() {
                return descriptor;
            }

            @Override // vinyl.grimness
            public asosan.wireman<?>[] typeParametersSerializers() {
                return grimness.attabal.attabal(this);
            }

            @Override // asosan.dern
            public AdSizeInfo deserialize(fastidiously.marial decoder) {
                Object objSealless;
                int i;
                Object objSealless2;
                Intrinsics.checkNotNullParameter(decoder, "decoder");
                bristol.beachfront descriptor2 = getDescriptor();
                fastidiously.dern dernVarSaneness = decoder.saneness(descriptor2);
                immediately immediatelyVar = null;
                if (dernVarSaneness.triweekly()) {
                    splinterproof splinterproofVar = splinterproof.f39488attabal;
                    objSealless2 = dernVarSaneness.sealless(descriptor2, 0, splinterproofVar, null);
                    objSealless = dernVarSaneness.sealless(descriptor2, 1, splinterproofVar, null);
                    i = 3;
                } else {
                    boolean z = true;
                    int i2 = 0;
                    objSealless = null;
                    Object objSealless3 = null;
                    while (z) {
                        int iImpassible = dernVarSaneness.impassible(descriptor2);
                        if (iImpassible == -1) {
                            z = false;
                        } else if (iImpassible == 0) {
                            objSealless3 = dernVarSaneness.sealless(descriptor2, 0, splinterproof.f39488attabal, objSealless3);
                            i2 |= 1;
                        } else {
                            if (iImpassible != 1) {
                                throw new UnknownFieldException(iImpassible);
                            }
                            objSealless = dernVarSaneness.sealless(descriptor2, 1, splinterproof.f39488attabal, objSealless);
                            i2 |= 2;
                        }
                    }
                    i = i2;
                    objSealless2 = objSealless3;
                }
                dernVarSaneness.dern(descriptor2);
                return new AdSizeInfo(i, (Integer) objSealless2, (Integer) objSealless, immediatelyVar);
            }

            @Override // asosan.impassible
            public void serialize(fastidiously.beachfront encoder, AdSizeInfo value) {
                Intrinsics.checkNotNullParameter(encoder, "encoder");
                Intrinsics.checkNotNullParameter(value, "value");
                bristol.beachfront descriptor2 = getDescriptor();
                fastidiously.wireman wiremanVarSaneness = encoder.saneness(descriptor2);
                AdSizeInfo.write$Self(value, wiremanVarSaneness, descriptor2);
                wiremanVarSaneness.dern(descriptor2);
            }
        }

        /* JADX INFO: renamed from: monacal.attabal$saneness$saneness, reason: collision with other inner class name and from kotlin metadata */
        /* JADX INFO: compiled from: AdPayload.kt */
        @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0016\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lmonacal/attabal$saneness$saneness;", "", "<init>", "()V", "Lasosan/wireman;", "Lmonacal/attabal$saneness;", "serializer", "()Lasosan/wireman;", "vungle-ads_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final asosan.wireman<AdSizeInfo> serializer() {
                return C0741attabal.INSTANCE;
            }

            private Companion() {
            }
        }

        public AdSizeInfo() {
            this((Integer) null, (Integer) (0 == true ? 1 : 0), 3, (DefaultConstructorMarker) (0 == true ? 1 : 0));
        }

        public static /* synthetic */ AdSizeInfo copy$default(AdSizeInfo adSizeInfo, Integer num, Integer num2, int i, Object obj) {
            if ((i & 1) != 0) {
                num = adSizeInfo.width;
            }
            if ((i & 2) != 0) {
                num2 = adSizeInfo.height;
            }
            return adSizeInfo.copy(num, num2);
        }

        public static final void write$Self(AdSizeInfo self, fastidiously.wireman output, bristol.beachfront serialDesc) {
            Integer num;
            Integer num2;
            Intrinsics.checkNotNullParameter(self, "self");
            Intrinsics.checkNotNullParameter(output, "output");
            Intrinsics.checkNotNullParameter(serialDesc, "serialDesc");
            if (output.cuirassed(serialDesc, 0) || (num2 = self.width) == null || num2.intValue() != 0) {
                output.taiyuan(serialDesc, 0, splinterproof.f39488attabal, self.width);
            }
            if (output.cuirassed(serialDesc, 1) || (num = self.height) == null || num.intValue() != 0) {
                output.taiyuan(serialDesc, 1, splinterproof.f39488attabal, self.height);
            }
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final Integer getWidth() {
            return this.width;
        }

        /* JADX INFO: renamed from: component2, reason: from getter */
        public final Integer getHeight() {
            return this.height;
        }

        public final AdSizeInfo copy(Integer width, Integer height) {
            return new AdSizeInfo(width, height);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof AdSizeInfo)) {
                return false;
            }
            AdSizeInfo adSizeInfo = (AdSizeInfo) other;
            return Intrinsics.wireman(this.width, adSizeInfo.width) && Intrinsics.wireman(this.height, adSizeInfo.height);
        }

        public final Integer getHeight() {
            return this.height;
        }

        public final Integer getWidth() {
            return this.width;
        }

        public int hashCode() {
            Integer num = this.width;
            int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
            Integer num2 = this.height;
            return iHashCode + (num2 != null ? num2.hashCode() : 0);
        }

        public String toString() {
            return "AdSizeInfo(width=" + this.width + ", height=" + this.height + ')';
        }

        public AdSizeInfo(Integer num, Integer num2) {
            this.width = num;
            this.height = num2;
        }

        @patroclinal.wireman
        public /* synthetic */ AdSizeInfo(int i, Integer num, Integer num2, immediately immediatelyVar) {
            if ((i & 1) == 0) {
                this.width = 0;
            } else {
                this.width = num;
            }
            if ((i & 2) == 0) {
                this.height = 0;
            } else {
                this.height = num2;
            }
        }

        public /* synthetic */ AdSizeInfo(Integer num, Integer num2, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? 0 : num, (i & 2) != 0 ? 0 : num2);
        }

        public static /* synthetic */ void getHeight$annotations() {
        }

        public static /* synthetic */ void getWidth$annotations() {
        }
    }

    /* JADX INFO: compiled from: AdPayload.kt */
    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\u001a\u0012\u0016\u0012\u0014\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00040\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\t\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u0007H\u0014¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lmonacal/attabal$taiyuan;", "Lcutwater/restrictive;", "", "", "", "<init>", "()V", "Lcutwater/impromptu;", "element", "transformDeserialize", "(Lcutwater/impromptu;)Lcutwater/impromptu;", "vungle-ads_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
    public static final class taiyuan extends restrictive<Map<String, ? extends List<? extends String>>> {
        public static final taiyuan INSTANCE = new taiyuan();

        /* JADX WARN: Illegal instructions before constructor call */
        private taiyuan() {
            gintrap gintrapVar = gintrap.f29390attabal;
            super(defendable.attabal.apical(defendable.attabal.oilcan(gintrapVar), defendable.attabal.impromptu(defendable.attabal.oilcan(gintrapVar))));
        }

        @Override // cutwater.restrictive
        public cutwater.impromptu transformDeserialize(cutwater.impromptu element) {
            Intrinsics.checkNotNullParameter(element, "element");
            trm trmVarCutely = cutwater.cutely.cutely(element);
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            for (Map.Entry<String, cutwater.impromptu> entry : trmVarCutely.entrySet()) {
                if (!Intrinsics.wireman(entry.getKey(), "moat")) {
                    linkedHashMap.put(entry.getKey(), entry.getValue());
                }
            }
            return new trm(linkedHashMap);
        }
    }

    /* JADX INFO: renamed from: monacal.attabal$wireman, reason: from toString */
    /* JADX INFO: compiled from: AdPayload.kt */
    @Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0002\b\u000f\b\u0087\b\u0018\u0000 /2\u00020\u0001:\u000201B7\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0010\b\u0002\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004\u0012\u0010\b\u0002\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004¢\u0006\u0004\b\b\u0010\tBK\b\u0017\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\n\b\u0001\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0010\b\u0001\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004\u0012\u0010\b\u0001\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\b\u0010\u000eJ(\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u000f\u001a\u00020\u00002\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u0012HÇ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0012\u0010\u0017\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0017\u0010\u0018J\u0018\u0010\u0019\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u001aJ\u0018\u0010\u001b\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u001aJ@\u0010\u001c\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0010\b\u0002\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00042\u0010\b\u0002\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004HÆ\u0001¢\u0006\u0004\b\u001c\u0010\u001dJ\u0010\u0010\u001e\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u001e\u0010\u001fJ\u0010\u0010 \u001a\u00020\nHÖ\u0001¢\u0006\u0004\b \u0010!J\u001a\u0010$\u001a\u00020#2\b\u0010\"\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b$\u0010%R\"\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0003\u0010&\u0012\u0004\b(\u0010)\u001a\u0004\b'\u0010\u0018R(\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0006\u0010*\u0012\u0004\b,\u0010)\u001a\u0004\b+\u0010\u001aR(\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0007\u0010*\u0012\u0004\b.\u0010)\u001a\u0004\b-\u0010\u001a¨\u00062"}, d2 = {"Lmonacal/attabal$wireman;", "", "", "price", "", "", "nurls", "lurls", "<init>", "(Ljava/lang/Double;Ljava/util/List;Ljava/util/List;)V", "", "seen1", "Lvinyl/immediately;", "serializationConstructorMarker", "(ILjava/lang/Double;Ljava/util/List;Ljava/util/List;Lvinyl/immediately;)V", "self", "Lfastidiously/wireman;", AgentOptions.OUTPUT, "Lbristol/beachfront;", "serialDesc", "", "write$Self", "(Lmonacal/attabal$wireman;Lfastidiously/wireman;Lbristol/beachfront;)V", "component1", "()Ljava/lang/Double;", "component2", "()Ljava/util/List;", "component3", "copy", "(Ljava/lang/Double;Ljava/util/List;Ljava/util/List;)Lmonacal/attabal$wireman;", "toString", "()Ljava/lang/String;", "hashCode", "()I", C3414a2.d, "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/Double;", "getPrice", "getPrice$annotations", "()V", "Ljava/util/List;", "getNurls", "getNurls$annotations", "getLurls", "getLurls$annotations", "Companion", "attabal", "saneness", "vungle-ads_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
    @formularize
    public static final /* data */ class CSBResponse {

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private final List<String> lurls;
        private final List<String> nurls;
        private final Double price;

        /* JADX INFO: renamed from: monacal.attabal$wireman$attabal, reason: collision with other inner class name */
        /* JADX INFO: compiled from: AdPayload.kt */
        @Metadata(d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001a\u0010\u0007\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00060\u0005HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0018\u0010\u000b\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ \u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0016\u001a\u00020\u00138VXÖ\u0005¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u0017"}, d2 = {"com/vungle/ads/internal/model/AdPayload.CSBResponse.$serializer", "Lvinyl/grimness;", "Lmonacal/attabal$wireman;", "<init>", "()V", "", "Lasosan/wireman;", "childSerializers", "()[Lasosan/wireman;", "Lfastidiously/marial;", "decoder", "deserialize", "(Lfastidiously/marial;)Lmonacal/attabal$wireman;", "Lfastidiously/beachfront;", "encoder", "value", "", "serialize", "(Lfastidiously/beachfront;Lmonacal/attabal$wireman;)V", "Lbristol/beachfront;", "getDescriptor", "()Lbristol/beachfront;", "descriptor", "vungle-ads_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
        @patroclinal.wireman
        public static final class C0743attabal implements grimness<CSBResponse> {
            public static final C0743attabal INSTANCE;
            public static final /* synthetic */ bristol.beachfront descriptor;

            static {
                C0743attabal c0743attabal = new C0743attabal();
                INSTANCE = c0743attabal;
                vesuvio vesuvioVar = new vesuvio("com.vungle.ads.internal.model.AdPayload.CSBResponse", c0743attabal, 3);
                vesuvioVar.kowloon("price", true);
                vesuvioVar.kowloon("nurls", true);
                vesuvioVar.kowloon("lurls", true);
                descriptor = vesuvioVar;
            }

            private C0743attabal() {
            }

            @Override // vinyl.grimness
            public asosan.wireman<?>[] childSerializers() {
                asosan.wireman<?> wiremanVarGraveside = defendable.attabal.graveside(vinyl.trm.f39509attabal);
                licking lickingVar = licking.f39425attabal;
                return new asosan.wireman[]{wiremanVarGraveside, defendable.attabal.graveside(new vinyl.beachfront(lickingVar)), defendable.attabal.graveside(new vinyl.beachfront(lickingVar))};
            }

            @Override // asosan.wireman, asosan.impassible, asosan.dern
            public bristol.beachfront getDescriptor() {
                return descriptor;
            }

            @Override // vinyl.grimness
            public asosan.wireman<?>[] typeParametersSerializers() {
                return grimness.attabal.attabal(this);
            }

            @Override // asosan.dern
            public CSBResponse deserialize(fastidiously.marial decoder) {
                int i;
                Object objSealless;
                Object objSealless2;
                Object objSealless3;
                Intrinsics.checkNotNullParameter(decoder, "decoder");
                bristol.beachfront descriptor2 = getDescriptor();
                fastidiously.dern dernVarSaneness = decoder.saneness(descriptor2);
                Object objSealless4 = null;
                if (dernVarSaneness.triweekly()) {
                    objSealless = dernVarSaneness.sealless(descriptor2, 0, vinyl.trm.f39509attabal, null);
                    licking lickingVar = licking.f39425attabal;
                    objSealless2 = dernVarSaneness.sealless(descriptor2, 1, new vinyl.beachfront(lickingVar), null);
                    objSealless3 = dernVarSaneness.sealless(descriptor2, 2, new vinyl.beachfront(lickingVar), null);
                    i = 7;
                } else {
                    boolean z = true;
                    int i2 = 0;
                    Object objSealless5 = null;
                    Object objSealless6 = null;
                    while (z) {
                        int iImpassible = dernVarSaneness.impassible(descriptor2);
                        if (iImpassible == -1) {
                            z = false;
                        } else if (iImpassible == 0) {
                            objSealless4 = dernVarSaneness.sealless(descriptor2, 0, vinyl.trm.f39509attabal, objSealless4);
                            i2 |= 1;
                        } else if (iImpassible == 1) {
                            objSealless5 = dernVarSaneness.sealless(descriptor2, 1, new vinyl.beachfront(licking.f39425attabal), objSealless5);
                            i2 |= 2;
                        } else {
                            if (iImpassible != 2) {
                                throw new UnknownFieldException(iImpassible);
                            }
                            objSealless6 = dernVarSaneness.sealless(descriptor2, 2, new vinyl.beachfront(licking.f39425attabal), objSealless6);
                            i2 |= 4;
                        }
                    }
                    Object obj = objSealless4;
                    i = i2;
                    objSealless = obj;
                    objSealless2 = objSealless5;
                    objSealless3 = objSealless6;
                }
                dernVarSaneness.dern(descriptor2);
                return new CSBResponse(i, (Double) objSealless, (List) objSealless2, (List) objSealless3, (immediately) null);
            }

            @Override // asosan.impassible
            public void serialize(fastidiously.beachfront encoder, CSBResponse value) {
                Intrinsics.checkNotNullParameter(encoder, "encoder");
                Intrinsics.checkNotNullParameter(value, "value");
                bristol.beachfront descriptor2 = getDescriptor();
                fastidiously.wireman wiremanVarSaneness = encoder.saneness(descriptor2);
                CSBResponse.write$Self(value, wiremanVarSaneness, descriptor2);
                wiremanVarSaneness.dern(descriptor2);
            }
        }

        /* JADX INFO: renamed from: monacal.attabal$wireman$saneness, reason: from kotlin metadata */
        /* JADX INFO: compiled from: AdPayload.kt */
        @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0016\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lmonacal/attabal$wireman$saneness;", "", "<init>", "()V", "Lasosan/wireman;", "Lmonacal/attabal$wireman;", "serializer", "()Lasosan/wireman;", "vungle-ads_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final asosan.wireman<CSBResponse> serializer() {
                return C0743attabal.INSTANCE;
            }

            private Companion() {
            }
        }

        public CSBResponse() {
            this((Double) null, (List) null, (List) null, 7, (DefaultConstructorMarker) null);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ CSBResponse copy$default(CSBResponse cSBResponse, Double d, List list, List list2, int i, Object obj) {
            if ((i & 1) != 0) {
                d = cSBResponse.price;
            }
            if ((i & 2) != 0) {
                list = cSBResponse.nurls;
            }
            if ((i & 4) != 0) {
                list2 = cSBResponse.lurls;
            }
            return cSBResponse.copy(d, list, list2);
        }

        public static final void write$Self(CSBResponse self, fastidiously.wireman output, bristol.beachfront serialDesc) {
            Intrinsics.checkNotNullParameter(self, "self");
            Intrinsics.checkNotNullParameter(output, "output");
            Intrinsics.checkNotNullParameter(serialDesc, "serialDesc");
            if (output.cuirassed(serialDesc, 0) || self.price != null) {
                output.taiyuan(serialDesc, 0, vinyl.trm.f39509attabal, self.price);
            }
            if (output.cuirassed(serialDesc, 1) || self.nurls != null) {
                output.taiyuan(serialDesc, 1, new vinyl.beachfront(licking.f39425attabal), self.nurls);
            }
            if (!output.cuirassed(serialDesc, 2) && self.lurls == null) {
                return;
            }
            output.taiyuan(serialDesc, 2, new vinyl.beachfront(licking.f39425attabal), self.lurls);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final Double getPrice() {
            return this.price;
        }

        public final List<String> component2() {
            return this.nurls;
        }

        public final List<String> component3() {
            return this.lurls;
        }

        public final CSBResponse copy(Double price, List<String> nurls, List<String> lurls) {
            return new CSBResponse(price, nurls, lurls);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof CSBResponse)) {
                return false;
            }
            CSBResponse cSBResponse = (CSBResponse) other;
            return Intrinsics.wireman(this.price, cSBResponse.price) && Intrinsics.wireman(this.nurls, cSBResponse.nurls) && Intrinsics.wireman(this.lurls, cSBResponse.lurls);
        }

        public final List<String> getLurls() {
            return this.lurls;
        }

        public final List<String> getNurls() {
            return this.nurls;
        }

        public final Double getPrice() {
            return this.price;
        }

        public int hashCode() {
            Double d = this.price;
            int iHashCode = (d == null ? 0 : d.hashCode()) * 31;
            List<String> list = this.nurls;
            int iHashCode2 = (iHashCode + (list == null ? 0 : list.hashCode())) * 31;
            List<String> list2 = this.lurls;
            return iHashCode2 + (list2 != null ? list2.hashCode() : 0);
        }

        public String toString() {
            return "CSBResponse(price=" + this.price + ", nurls=" + this.nurls + ", lurls=" + this.lurls + ')';
        }

        @patroclinal.wireman
        public /* synthetic */ CSBResponse(int i, Double d, List list, List list2, immediately immediatelyVar) {
            if ((i & 1) == 0) {
                this.price = null;
            } else {
                this.price = d;
            }
            if ((i & 2) == 0) {
                this.nurls = null;
            } else {
                this.nurls = list;
            }
            if ((i & 4) == 0) {
                this.lurls = null;
            } else {
                this.lurls = list2;
            }
        }

        public CSBResponse(Double d, List<String> list, List<String> list2) {
            this.price = d;
            this.nurls = list;
            this.lurls = list2;
        }

        public /* synthetic */ CSBResponse(Double d, List list, List list2, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : d, (i & 2) != 0 ? null : list, (i & 4) != 0 ? null : list2);
        }

        public static /* synthetic */ void getLurls$annotations() {
        }

        public static /* synthetic */ void getNurls$annotations() {
        }

        public static /* synthetic */ void getPrice$annotations() {
        }
    }

    public attabal() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    private final String complexReplace(String str, String str2, String str3) {
        String strQuote = Pattern.quote(str2);
        Intrinsics.checkNotNullExpressionValue(strQuote, "quote(oldValue)");
        return new Regex(strQuote).replace(str, valueOrEmpty(str3));
    }

    private final Pair<Boolean, Integer> computeAssetRequirement(Integer percentage) {
        if (isNativeTemplateType() || !adLoadOptimizationEnabled()) {
            return patroclinal.formularize.attabal(Boolean.TRUE, null);
        }
        if (isPartialDownloadEnabled()) {
            return patroclinal.formularize.attabal(Boolean.TRUE, Integer.valueOf(Math.max(0, percentage != null ? percentage.intValue() : 0)));
        }
        return patroclinal.formularize.attabal(Boolean.FALSE, null);
    }

    private final PlacementAdUnit getAd() {
        List<PlacementAdUnit> list = this.ads;
        if (list == null || list.isEmpty()) {
            return null;
        }
        return list.get(0);
    }

    private final AdUnit getAdMarkup() {
        PlacementAdUnit ad = getAd();
        if (ad != null) {
            return ad.getAdMarkup();
        }
        return null;
    }

    private final Pair<String, File> getIndexHtmlFile(File dir) {
        AdUnit adMarkup;
        String vmURL;
        Object objM3351constructorimpl;
        File parentFile;
        if (isNativeTemplateType() || (adMarkup = getAdMarkup()) == null || (vmURL = adMarkup.getVmURL()) == null) {
            return null;
        }
        String str = com.vungle.ads.internal.util.taiyuan.INSTANCE.isValidUrl(vmURL) ? vmURL : null;
        if (str == null) {
            return null;
        }
        try {
            Result.Companion companion = Result.INSTANCE;
            String path = new URI(str).getPath();
            Intrinsics.checkNotNullExpressionValue(path, "URI(url).path");
            List listHomozygous = StringsKt.homozygous(StringsKt.libya(path, '/'), new char[]{'/'}, false, 0, 6, null);
            objM3351constructorimpl = Result.m3351constructorimpl(listHomozygous.size() >= 2 ? CollectionsKt.preterite(CollectionsKt.attendance(listHomozygous, 2), "_", null, null, 0, null, null, 62, null) : "index.html");
        } catch (Throwable th) {
            Result.Companion companion2 = Result.INSTANCE;
            objM3351constructorimpl = Result.m3351constructorimpl(p002kotlin.dern.attabal(th));
        }
        if (Result.m3356isFailureimpl(objM3351constructorimpl)) {
            objM3351constructorimpl = null;
        }
        String str2 = (String) objM3351constructorimpl;
        if (str2 == null || (parentFile = dir.getParentFile()) == null) {
            return null;
        }
        return new Pair<>(str, new File(parentFile, str2));
    }

    public static /* synthetic */ List getTpatUrls$default(attabal attabalVar, String str, String str2, String str3, int i, Object obj) {
        if ((i & 2) != 0) {
            str2 = null;
        }
        if ((i & 4) != 0) {
            str3 = null;
        }
        return attabalVar.getTpatUrls(str, str2, str3);
    }

    private final String valueOrEmpty(String value) {
        return value == null ? "" : value;
    }

    public static final void write$Self(attabal self, fastidiously.wireman output, bristol.beachfront serialDesc) {
        Intrinsics.checkNotNullParameter(self, "self");
        Intrinsics.checkNotNullParameter(output, "output");
        Intrinsics.checkNotNullParameter(serialDesc, "serialDesc");
        if (output.cuirassed(serialDesc, 0) || self.ads != null) {
            output.taiyuan(serialDesc, 0, new vinyl.beachfront(PlacementAdUnit.C0735attabal.INSTANCE), self.ads);
        }
        if (output.cuirassed(serialDesc, 1) || self.config != null) {
            output.taiyuan(serialDesc, 1, ConfigPayload.attabal.INSTANCE, self.config);
        }
        if (output.cuirassed(serialDesc, 2) || self.expiryWindowStart != null) {
            output.taiyuan(serialDesc, 2, coffeecake.f39367attabal, self.expiryWindowStart);
        }
        if (output.cuirassed(serialDesc, 3) || !Intrinsics.wireman(self.mraidFiles, new ConcurrentHashMap())) {
            kurbash.wireman wiremanVarSaneness = polloi.saneness(ConcurrentHashMap.class);
            licking lickingVar = licking.f39425attabal;
            output.sealless(serialDesc, 3, new asosan.saneness(wiremanVarSaneness, null, new asosan.wireman[]{lickingVar, lickingVar}), self.mraidFiles);
        }
        if (output.cuirassed(serialDesc, 4) || !Intrinsics.wireman(self.incentivizedTextSettings, new HashMap())) {
            licking lickingVar2 = licking.f39425attabal;
            output.sealless(serialDesc, 4, new cultivated(lickingVar2, lickingVar2), self.incentivizedTextSettings);
        }
        if (output.cuirassed(serialDesc, 5) || self.assetsFullyDownloaded) {
            output.kowloon(serialDesc, 5, self.assetsFullyDownloaded);
        }
        if (!output.cuirassed(serialDesc, 6) && self.indexFilePath == null) {
            return;
        }
        output.taiyuan(serialDesc, 6, licking.f39425attabal, self.indexFilePath);
    }

    public final int adHeight() {
        AdSizeInfo adSizeInfo;
        Integer height;
        AdUnit adMarkup = getAdMarkup();
        if (adMarkup == null || (adSizeInfo = adMarkup.getAdSizeInfo()) == null || (height = adSizeInfo.getHeight()) == null) {
            return 0;
        }
        return height.intValue();
    }

    public final boolean adLoadOptimizationEnabled() {
        Boolean adLoadOptimizationEnabled;
        AdUnit adMarkup = getAdMarkup();
        if (adMarkup == null || (adLoadOptimizationEnabled = adMarkup.getAdLoadOptimizationEnabled()) == null) {
            return true;
        }
        return adLoadOptimizationEnabled.booleanValue();
    }

    public final AdUnit adUnit() {
        return getAdMarkup();
    }

    public final int adWidth() {
        AdSizeInfo adSizeInfo;
        Integer width;
        AdUnit adMarkup = getAdMarkup();
        if (adMarkup == null || (adSizeInfo = adMarkup.getAdSizeInfo()) == null || (width = adSizeInfo.getWidth()) == null) {
            return 0;
        }
        return width.intValue();
    }

    public final String advAppId() {
        AdUnit adMarkup = getAdMarkup();
        if (adMarkup != null) {
            return adMarkup.getAdvAppId();
        }
        return null;
    }

    /* JADX INFO: renamed from: config, reason: from getter */
    public final ConfigPayload getConfig() {
        return this.config;
    }

    public final trm createMRAIDArgs() {
        Map<String, String> mRAIDArgsInMap = getMRAIDArgsInMap();
        oilcan oilcanVar = new oilcan();
        for (Map.Entry<String, String> entry : mRAIDArgsInMap.entrySet()) {
            cutwater.taiyuan.dern(oilcanVar, entry.getKey(), entry.getValue());
        }
        return oilcanVar.attabal();
    }

    public final String eventId() {
        AdUnit adMarkup = getAdMarkup();
        if (adMarkup != null) {
            return adMarkup.getId();
        }
        return null;
    }

    public final com.vungle.ads.saneness getAdConfig() {
        return this.adConfig;
    }

    public final String getAdSource() {
        AdUnit adMarkup = getAdMarkup();
        if (adMarkup != null) {
            return adMarkup.getAdSource();
        }
        return null;
    }

    public final boolean getAssetsFullyDownloaded() {
        return this.assetsFullyDownloaded;
    }

    public final CSBResponse getCSBResponse() {
        PlacementAdUnit ad = getAd();
        if (ad != null) {
            return ad.getCsb();
        }
        return null;
    }

    public final String getCreativeId() {
        String creativeId;
        AdUnit adMarkup = getAdMarkup();
        return (adMarkup == null || (creativeId = adMarkup.getCreativeId()) == null) ? "unknown" : creativeId;
    }

    public final List<AdAsset> getDownloadableAssets(File dir) {
        TemplateSettings templateSettings;
        Map<String, CacheableReplacement> cacheableReplacements;
        Intrinsics.checkNotNullParameter(dir, "dir");
        ArrayList arrayList = new ArrayList();
        Pair<String, File> indexHtmlFile = getIndexHtmlFile(dir);
        if (indexHtmlFile != null) {
            String strComponent1 = indexHtmlFile.component1();
            File fileComponent2 = indexHtmlFile.component2();
            this.indexFilePath = fileComponent2.getAbsolutePath();
            if (!fileComponent2.exists()) {
                arytenoidectomy.INSTANCE.d(TAG, "No cacheable index file found, creating new one: " + fileComponent2);
                String absolutePath = fileComponent2.getAbsolutePath();
                Intrinsics.checkNotNullExpressionValue(absolutePath, "indexFile.absolutePath");
                arrayList.add(new AdAsset(KEY_VM, strComponent1, absolutePath, true, null, 16, null));
            }
        }
        AdUnit adMarkup = getAdMarkup();
        if (adMarkup != null && (templateSettings = adMarkup.getTemplateSettings()) != null && (cacheableReplacements = templateSettings.getCacheableReplacements()) != null) {
            for (Map.Entry<String, CacheableReplacement> entry : cacheableReplacements.entrySet()) {
                String key = entry.getKey();
                CacheableReplacement value = entry.getValue();
                String url = value.getUrl();
                if (url != null) {
                    com.vungle.ads.internal.util.taiyuan taiyuanVar = com.vungle.ads.internal.util.taiyuan.INSTANCE;
                    if (taiyuanVar.isValidUrl(url)) {
                        String filePath = new File(dir, taiyuanVar.guessFileName(url, value.getExtension())).getAbsolutePath();
                        Pair<Boolean, Integer> pairComputeAssetRequirement = computeAssetRequirement(value.getDownloadPercent());
                        boolean zBooleanValue = pairComputeAssetRequirement.component1().booleanValue();
                        Integer numComponent2 = pairComputeAssetRequirement.component2();
                        Intrinsics.checkNotNullExpressionValue(filePath, "filePath");
                        AdAsset adAsset = new AdAsset(key, url, filePath, zBooleanValue, numComponent2);
                        String extension = value.getExtension();
                        if (extension != null) {
                            adAsset.setMimeType(extension);
                        }
                        arrayList.add(adAsset);
                        if (zBooleanValue && numComponent2 != null) {
                            this.partialDownloadAssets.put(url, adAsset);
                        }
                    }
                }
            }
        }
        if (arrayList.size() > 1) {
            preprohormone.cuirassed(arrayList, new impassible());
        }
        return arrayList;
    }

    public final String getExperiments() {
        TemplateSettings templateSettings;
        Map<String, String> normalReplacements;
        AdUnit adMarkup = getAdMarkup();
        if (adMarkup == null || (templateSettings = adMarkup.getTemplateSettings()) == null || (normalReplacements = templateSettings.getNormalReplacements()) == null) {
            return null;
        }
        return normalReplacements.get(com.vungle.ads.internal.saneness.EXPERIMENTS_KEY);
    }

    public final Map<String, String> getIncentivizedTextSettings() {
        return this.incentivizedTextSettings;
    }

    public final String getIndexFilePath() {
        return this.indexFilePath;
    }

    public final AdAsset getLocalPartialDownloadAssets(String remoteUrl) {
        Intrinsics.checkNotNullParameter(remoteUrl, "remoteUrl");
        return this.partialDownloadAssets.get(remoteUrl);
    }

    /* JADX INFO: renamed from: getLogEntry$vungle_ads_release, reason: from getter */
    public final LogEntry getLogEntry() {
        return this.logEntry;
    }

    public final List<String> getLossUrls() {
        CSBResponse csb;
        PlacementAdUnit ad = getAd();
        if (ad == null || (csb = ad.getCsb()) == null) {
            return null;
        }
        return csb.getLurls();
    }

    public final Map<String, String> getMRAIDArgsInMap() {
        TemplateSettings templateSettings;
        Map<String, CacheableReplacement> cacheableReplacements;
        TemplateSettings templateSettings2;
        Map<String, String> normalReplacements;
        AdUnit adMarkup = getAdMarkup();
        if ((adMarkup != null ? adMarkup.getTemplateSettings() : null) == null) {
            throw new IllegalArgumentException("Advertisement does not have MRAID Arguments!");
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        AdUnit adMarkup2 = getAdMarkup();
        if (adMarkup2 != null && (templateSettings2 = adMarkup2.getTemplateSettings()) != null && (normalReplacements = templateSettings2.getNormalReplacements()) != null) {
            linkedHashMap.putAll(normalReplacements);
        }
        AdUnit adMarkup3 = getAdMarkup();
        if (adMarkup3 != null && (templateSettings = adMarkup3.getTemplateSettings()) != null && (cacheableReplacements = templateSettings.getCacheableReplacements()) != null) {
            for (Map.Entry<String, CacheableReplacement> entry : cacheableReplacements.entrySet()) {
                String url = entry.getValue().getUrl();
                if (url != null) {
                    linkedHashMap.put(entry.getKey(), url);
                }
            }
        }
        if (!this.mraidFiles.isEmpty()) {
            linkedHashMap.putAll(this.mraidFiles);
        }
        if (!this.incentivizedTextSettings.isEmpty()) {
            linkedHashMap.putAll(this.incentivizedTextSettings);
        }
        return linkedHashMap;
    }

    public final String getMediationName() {
        AdUnit adMarkup = getAdMarkup();
        if (adMarkup != null) {
            return adMarkup.getMediationName();
        }
        return null;
    }

    public final Map<String, AdAsset> getPartialDownloadAssets$vungle_ads_release() {
        return this.partialDownloadAssets;
    }

    public final int getShowCloseDelay(Boolean incentivized) {
        Integer showClose;
        int iIntValue;
        Integer showCloseIncentivized;
        if (Intrinsics.wireman(incentivized, Boolean.TRUE)) {
            AdUnit adMarkup = getAdMarkup();
            if (adMarkup == null || (showCloseIncentivized = adMarkup.getShowCloseIncentivized()) == null) {
                return 0;
            }
            iIntValue = showCloseIncentivized.intValue();
        } else {
            AdUnit adMarkup2 = getAdMarkup();
            if (adMarkup2 == null || (showClose = adMarkup2.getShowClose()) == null) {
                return 0;
            }
            iIntValue = showClose.intValue();
        }
        return iIntValue * 1000;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public final List<String> getTpatUrls(String event, String value, String secondValue) throws InterruptedException {
        Map<String, List<String>> tpat;
        Map<String, List<String>> tpat2;
        Intrinsics.checkNotNullParameter(event, "event");
        AdUnit adMarkup = getAdMarkup();
        if (adMarkup != null && (tpat2 = adMarkup.getTpat()) != null && !tpat2.containsKey(event)) {
            new TpatError(Sdk$SDKError.Reason.INVALID_TPAT_KEY, "Arbitrary tpat key: " + event).setLogEntry$vungle_ads_release(this.logEntry).logErrorNoReturnValue$vungle_ads_release();
            return null;
        }
        AdUnit adMarkup2 = getAdMarkup();
        List<String> list = (adMarkup2 == null || (tpat = adMarkup2.getTpat()) == null) ? null : tpat.get(event);
        List<String> list2 = list;
        if (list2 == null || list2.isEmpty()) {
            new TpatError(Sdk$SDKError.Reason.EMPTY_TPAT_ERROR, "Empty tpat key: " + event).setLogEntry$vungle_ads_release(this.logEntry).logErrorNoReturnValue$vungle_ads_release();
            return null;
        }
        switch (event) {
            case "checkpoint.0":
                List<String> list3 = list;
                ArrayList arrayList = new ArrayList(dovishness.gintrap(list3, 10));
                Iterator<T> it = list3.iterator();
                while (it.hasNext()) {
                    arrayList.add(complexReplace(complexReplace(complexReplace((String) it.next(), com.vungle.ads.internal.saneness.REMOTE_PLAY_KEY, String.valueOf(!this.assetsFullyDownloaded)), com.vungle.ads.internal.saneness.NETWORK_OPERATOR_KEY, value), com.vungle.ads.internal.saneness.DEVICE_VOLUME_KEY, secondValue));
                }
                return arrayList;
            case "video.length":
                List<String> list4 = list;
                ArrayList arrayList2 = new ArrayList(dovishness.gintrap(list4, 10));
                Iterator<T> it2 = list4.iterator();
                while (it2.hasNext()) {
                    arrayList2.add(complexReplace((String) it2.next(), com.vungle.ads.internal.saneness.VIDEO_LENGTH_KEY, value));
                }
                return arrayList2;
            case "ad.loadDuration":
                List<String> list5 = list;
                ArrayList arrayList3 = new ArrayList(dovishness.gintrap(list5, 10));
                Iterator<T> it3 = list5.iterator();
                while (it3.hasNext()) {
                    arrayList3.add(complexReplace((String) it3.next(), com.vungle.ads.internal.saneness.AD_LOAD_DURATION_KEY, value));
                }
                return arrayList3;
            case "ad.close":
                List<String> list6 = list;
                ArrayList arrayList4 = new ArrayList(dovishness.gintrap(list6, 10));
                Iterator<T> it4 = list6.iterator();
                while (it4.hasNext()) {
                    arrayList4.add(complexReplace(complexReplace((String) it4.next(), com.vungle.ads.internal.saneness.AD_DURATION_KEY, value), com.vungle.ads.internal.saneness.DEVICE_VOLUME_KEY, secondValue));
                }
                return arrayList4;
            case "deeplink.click":
                List<String> list7 = list;
                ArrayList arrayList5 = new ArrayList(dovishness.gintrap(list7, 10));
                Iterator<T> it5 = list7.iterator();
                while (it5.hasNext()) {
                    arrayList5.add(complexReplace((String) it5.next(), com.vungle.ads.internal.saneness.DEEPLINK_SUCCESS_KEY, value));
                }
                return arrayList5;
            default:
                if (event.equals(com.vungle.ads.internal.saneness.CHECKPOINT_0)) {
                    List<String> list8 = list;
                    ArrayList arrayList6 = new ArrayList(dovishness.gintrap(list8, 10));
                    Iterator<T> it6 = list8.iterator();
                    while (it6.hasNext()) {
                        arrayList6.add(complexReplace(complexReplace(complexReplace((String) it6.next(), com.vungle.ads.internal.saneness.REMOTE_PLAY_KEY, String.valueOf(!this.assetsFullyDownloaded)), com.vungle.ads.internal.saneness.NETWORK_OPERATOR_KEY, value), com.vungle.ads.internal.saneness.DEVICE_VOLUME_KEY, secondValue));
                    }
                    return arrayList6;
                }
                return list;
        }
    }

    public final String getViewMasterVersion() {
        AdUnit adMarkup = getAdMarkup();
        if (adMarkup != null) {
            return adMarkup.getVmVersion();
        }
        return null;
    }

    public final WebViewSettings getWebViewSettings() {
        AdUnit adMarkup = getAdMarkup();
        if (adMarkup != null) {
            return adMarkup.getWebViewSettings();
        }
        return null;
    }

    public final List<String> getWinNotifications() {
        AdUnit adMarkup = getAdMarkup();
        if (adMarkup != null) {
            return adMarkup.getNotification();
        }
        return null;
    }

    public final List<String> getWinUrls() {
        CSBResponse csb;
        PlacementAdUnit ad = getAd();
        if (ad == null || (csb = ad.getCsb()) == null) {
            return null;
        }
        return csb.getNurls();
    }

    public final Double getWinningPrice() {
        CSBResponse csb;
        PlacementAdUnit ad = getAd();
        if (ad == null || (csb = ad.getCsb()) == null) {
            return null;
        }
        return csb.getPrice();
    }

    public final boolean hasExpired() {
        AdUnit adMarkup = getAdMarkup();
        if (adMarkup == null) {
            return false;
        }
        Long l = this.expiryWindowStart;
        if (adMarkup.getExpiryDuration() != null && l != null) {
            long jCurrentTimeMillis = (System.currentTimeMillis() - l.longValue()) / 1000;
            Integer expiryDuration = adMarkup.getExpiryDuration();
            return jCurrentTimeMillis > (expiryDuration != null ? Long.valueOf((long) expiryDuration.intValue()) : null).longValue();
        }
        if (adMarkup.getExpiry() != null) {
            long jCurrentTimeMillis2 = System.currentTimeMillis() / 1000;
            Integer expiry = adMarkup.getExpiry();
            if (jCurrentTimeMillis2 > (expiry != null ? Long.valueOf(expiry.intValue()) : null).longValue()) {
                return true;
            }
        }
        return false;
    }

    public final boolean isAdPoddingEnabled() {
        TemplateSettings templateSettings;
        Map<String, String> normalReplacements;
        String str;
        AdUnit adMarkup = getAdMarkup();
        return (adMarkup == null || (templateSettings = adMarkup.getTemplateSettings()) == null || (normalReplacements = templateSettings.getNormalReplacements()) == null || (str = normalReplacements.get(com.vungle.ads.internal.saneness.AD_PODDING_KEY)) == null || !p002kotlin.text.dovishness.stratoscope(str, a.g, true)) ? false : true;
    }

    public final boolean isClickCoordinatesTrackingEnabled() {
        Boolean clickCoordinatesEnabled;
        AdUnit adMarkup = getAdMarkup();
        if (adMarkup == null || (clickCoordinatesEnabled = adMarkup.getClickCoordinatesEnabled()) == null) {
            return false;
        }
        return clickCoordinatesEnabled.booleanValue();
    }

    public final boolean isCriticalAsset(String failingUrl) {
        TemplateSettings templateSettings;
        Map<String, CacheableReplacement> cacheableReplacements;
        Intrinsics.checkNotNullParameter(failingUrl, "failingUrl");
        if (!isNativeTemplateType()) {
            AdUnit adMarkup = getAdMarkup();
            if (Intrinsics.wireman(adMarkup != null ? adMarkup.getVmURL() : null, failingUrl)) {
                return true;
            }
        }
        AdUnit adMarkup2 = getAdMarkup();
        if (adMarkup2 == null || (templateSettings = adMarkup2.getTemplateSettings()) == null || (cacheableReplacements = templateSettings.getCacheableReplacements()) == null) {
            return false;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry<String, CacheableReplacement> entry : cacheableReplacements.entrySet()) {
            if (Intrinsics.wireman(entry.getValue().getUrl(), failingUrl)) {
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        return !linkedHashMap.isEmpty();
    }

    public final boolean isNativeTemplateType() {
        return Intrinsics.wireman(templateType(), "native");
    }

    public final boolean isPartialDownloadEnabled() {
        Boolean partialDownloadEnabled;
        AdUnit adMarkup = getAdMarkup();
        return ((adMarkup == null || (partialDownloadEnabled = adMarkup.getPartialDownloadEnabled()) == null) ? false : partialDownloadEnabled.booleanValue()) && !isNativeTemplateType();
    }

    public final boolean omEnabled() {
        ViewAbility viewAbility;
        ViewAbilityInfo om;
        Boolean boolIsEnabled;
        AdUnit adMarkup = getAdMarkup();
        if (adMarkup == null || (viewAbility = adMarkup.getViewAbility()) == null || (om = viewAbility.getOm()) == null || (boolIsEnabled = om.isEnabled()) == null) {
            return false;
        }
        return boolIsEnabled.booleanValue();
    }

    public final String placementId() {
        PlacementAdUnit ad = getAd();
        if (ad != null) {
            return ad.getPlacementReferenceId();
        }
        return null;
    }

    public final void recordExpiryWindowStart() {
        this.expiryWindowStart = Long.valueOf(System.currentTimeMillis());
    }

    public final void setAdConfig(com.vungle.ads.saneness sanenessVar) {
        this.adConfig = sanenessVar;
    }

    public final void setAssetFullyDownloaded() {
        this.assetsFullyDownloaded = true;
    }

    public final void setAssetsFullyDownloaded(boolean z) {
        this.assetsFullyDownloaded = z;
    }

    public final void setIncentivizedText(String title, String body, String keepWatching, String close) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(body, "body");
        Intrinsics.checkNotNullParameter(keepWatching, "keepWatching");
        Intrinsics.checkNotNullParameter(close, "close");
        if (title.length() > 0) {
            this.incentivizedTextSettings.put(INCENTIVIZED_TITLE_TEXT, title);
        }
        if (body.length() > 0) {
            this.incentivizedTextSettings.put(INCENTIVIZED_BODY_TEXT, body);
        }
        if (keepWatching.length() > 0) {
            this.incentivizedTextSettings.put(INCENTIVIZED_CONTINUE_TEXT, keepWatching);
        }
        if (close.length() > 0) {
            this.incentivizedTextSettings.put(INCENTIVIZED_CLOSE_TEXT, close);
        }
    }

    public final void setIncentivizedTextSettings(Map<String, String> map) {
        Intrinsics.checkNotNullParameter(map, "<set-?>");
        this.incentivizedTextSettings = map;
    }

    public final void setLogEntry$vungle_ads_release(LogEntry logEntry) {
        this.logEntry = logEntry;
    }

    public final String templateType() {
        AdUnit adMarkup = getAdMarkup();
        if (adMarkup != null) {
            return adMarkup.getTemplateType();
        }
        return null;
    }

    public final synchronized void updateAdAssetPath(String adIdentifier, File localFile) {
        Intrinsics.checkNotNullParameter(adIdentifier, "adIdentifier");
        Intrinsics.checkNotNullParameter(localFile, "localFile");
        if (localFile.exists()) {
            this.mraidFiles.put(adIdentifier, FILE_SCHEME + localFile.getAbsolutePath());
        }
    }

    public final boolean usePreloading() {
        AdUnit adMarkup = getAdMarkup();
        return (adMarkup != null ? Intrinsics.wireman(adMarkup.getUsePreloading(), Boolean.TRUE) : false) && !isNativeTemplateType();
    }

    @patroclinal.wireman
    public /* synthetic */ attabal(int i, List list, ConfigPayload configPayload, Long l, ConcurrentHashMap concurrentHashMap, Map map, boolean z, String str, immediately immediatelyVar) {
        if ((i & 1) == 0) {
            this.ads = null;
        } else {
            this.ads = list;
        }
        if ((i & 2) == 0) {
            this.config = null;
        } else {
            this.config = configPayload;
        }
        if ((i & 4) == 0) {
            this.expiryWindowStart = null;
        } else {
            this.expiryWindowStart = l;
        }
        if ((i & 8) == 0) {
            this.mraidFiles = new ConcurrentHashMap<>();
        } else {
            this.mraidFiles = concurrentHashMap;
        }
        if ((i & 16) == 0) {
            this.incentivizedTextSettings = new HashMap();
        } else {
            this.incentivizedTextSettings = map;
        }
        if ((i & 32) == 0) {
            this.assetsFullyDownloaded = false;
        } else {
            this.assetsFullyDownloaded = z;
        }
        this.adConfig = null;
        this.logEntry = null;
        if ((i & 64) == 0) {
            this.indexFilePath = null;
        } else {
            this.indexFilePath = str;
        }
        this.partialDownloadAssets = new LinkedHashMap();
    }

    public attabal(List<PlacementAdUnit> list, ConfigPayload configPayload) {
        this.ads = list;
        this.config = configPayload;
        this.mraidFiles = new ConcurrentHashMap<>();
        this.incentivizedTextSettings = new HashMap();
        this.partialDownloadAssets = new LinkedHashMap();
    }

    public /* synthetic */ attabal(List list, ConfigPayload configPayload, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : list, (i & 2) != 0 ? null : configPayload);
    }

    public static /* synthetic */ void getAdConfig$annotations() {
    }

    private static /* synthetic */ void getAds$annotations() {
    }

    private static /* synthetic */ void getConfig$annotations() {
    }

    public static /* synthetic */ void getIncentivizedTextSettings$annotations() {
    }

    public static /* synthetic */ void getLogEntry$vungle_ads_release$annotations() {
    }

    private static /* synthetic */ void getMraidFiles$annotations() {
    }

    public static /* synthetic */ void getPartialDownloadAssets$vungle_ads_release$annotations() {
    }
}
