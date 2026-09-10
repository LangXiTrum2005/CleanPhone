package com.vungle.ads.internal.presenter;

import android.content.Context;
import android.view.MotionEvent;
import android.webkit.WebView;
import android.webkit.WebViewRenderProcess;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.mbridge.msdk.playercommon.exoplayer2.text.ttml.TtmlNode;
import com.p004ironsource.d9;
import com.p004ironsource.sdk.controller.f;
import com.vungle.ads.AdConfig;
import com.vungle.ads.AnalyticsClient;
import com.vungle.ads.HeartbeatMissingError;
import com.vungle.ads.IndexHtmlError;
import com.vungle.ads.NetworkUnreachable;
import com.vungle.ads.ServiceLocator;
import com.vungle.ads.SingleValueMetric;
import com.vungle.ads.VungleError;
import com.vungle.ads.WebViewError;
import com.vungle.ads.WebViewRenderProcessUnresponsive;
import com.vungle.ads.WebViewRenderingProcessGone;
import com.vungle.ads.internal.ClickCoordinateTracker;
import com.vungle.ads.internal.ConfigManager;
import com.vungle.ads.internal.Constants;
import com.vungle.ads.internal.model.AdPayload;
import com.vungle.ads.internal.model.CommonRequestBody;
import com.vungle.ads.internal.model.Placement;
import com.vungle.ads.internal.network.Call;
import com.vungle.ads.internal.network.Callback;
import com.vungle.ads.internal.network.Response;
import com.vungle.ads.internal.network.TpatRequest;
import com.vungle.ads.internal.network.TpatSender;
import com.vungle.ads.internal.network.VungleApiClient;
import com.vungle.ads.internal.omsdk.OMTracker;
import com.vungle.ads.internal.platform.Platform;
import com.vungle.ads.internal.privacy.PrivacyManager;
import com.vungle.ads.internal.protos.Sdk;
import com.vungle.ads.internal.signals.SignalManager;
import com.vungle.ads.internal.ui.VungleWebClient;
import com.vungle.ads.internal.ui.view.MRAIDAdWidget;
import com.vungle.ads.internal.ui.view.WebViewAPI;
import com.vungle.ads.internal.util.HandlerScheduler;
import com.vungle.ads.internal.util.LogEntry;
import com.vungle.ads.internal.util.Logger;
import com.vungle.ads.internal.util.PathProvider;
import com.vungle.ads.internal.util.SuspendableTimer;
import com.vungle.ads.internal.util.ThreadUtil;
import java.io.File;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.MapsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000Þ\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u000f\u0018\u0000 ¡\u00012\u00020\u00012\u00020\u0002:\u0002¡\u0001B=\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\f\u0012\u0006\u0010\r\u001a\u00020\u000e\u0012\u0006\u0010\u000f\u001a\u00020\u0010¢\u0006\u0002\u0010\u0011J\b\u0010r\u001a\u00020sH\u0002J\u0010\u0010t\u001a\u00020s2\b\b\u0001\u0010u\u001a\u00020vJ\r\u0010w\u001a\u0004\u0018\u00010\u0013¢\u0006\u0002\u0010\u0017J\u0006\u0010x\u001a\u00020sJ$\u0010y\u001a\u00020s2\u0006\u0010z\u001a\u00020{2\u0006\u0010|\u001a\u00020\u001c2\n\b\u0002\u0010}\u001a\u0004\u0018\u00010cH\u0002J\n\u0010~\u001a\u0004\u0018\u00010{H\u0002J\u0010\u0010\u007f\u001a\u00020s2\u0006\u0010z\u001a\u00020{H\u0002J\u001b\u0010\u0080\u0001\u001a\u00020s2\u0007\u0010\u0081\u0001\u001a\u00020c2\u0007\u0010\u0082\u0001\u001a\u00020\u001cH\u0016J!\u0010\u0083\u0001\u001a\u00020s2\n\u0010\u0084\u0001\u001a\u0005\u0018\u00010\u0085\u00012\n\u0010\u0086\u0001\u001a\u0005\u0018\u00010\u0087\u0001H\u0016J\u0007\u0010\u0088\u0001\u001a\u00020sJ\u0013\u0010\u0089\u0001\u001a\u00020s2\n\u0010\u008a\u0001\u001a\u0005\u0018\u00010\u008b\u0001J&\u0010\u008c\u0001\u001a\u00020\u001c2\n\u0010\u008d\u0001\u001a\u0005\u0018\u00010\u0085\u00012\t\u0010\u0082\u0001\u001a\u0004\u0018\u00010\u001cH\u0016¢\u0006\u0003\u0010\u008e\u0001J\u0007\u0010\u008f\u0001\u001a\u00020sJ\u001c\u0010\u0090\u0001\u001a\u00020\u001c2\u0007\u0010\u0091\u0001\u001a\u00020c2\b\u0010\u0092\u0001\u001a\u00030\u0093\u0001H\u0016J\u0011\u0010\u0094\u0001\u001a\u00020s2\u0006\u0010z\u001a\u00020{H\u0002J\u0010\u0010\u0095\u0001\u001a\u00020s2\u0007\u0010\u0096\u0001\u001a\u00020\u001cJ\u0012\u0010\u0097\u0001\u001a\u00020s2\t\u0010\u0098\u0001\u001a\u0004\u0018\u00010#J\u0019\u0010\u0099\u0001\u001a\u00020s2\b\u0010J\u001a\u0004\u0018\u00010KH\u0000¢\u0006\u0003\b\u009a\u0001J\u000f\u0010\u009b\u0001\u001a\u00020\u001cH\u0000¢\u0006\u0003\b\u009c\u0001J\u0007\u0010\u009d\u0001\u001a\u00020sJ\u0007\u0010\u009e\u0001\u001a\u00020sJ\u0012\u0010\u009f\u0001\u001a\u00020s2\u0007\u0010 \u0001\u001a\u00020cH\u0002R(\u0010\u0012\u001a\u0004\u0018\u00010\u00138\u0000@\u0000X\u0081\u000e¢\u0006\u0016\n\u0002\u0010\u001a\u0012\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R$\u0010\u001b\u001a\u00020\u001c8\u0000@\u0000X\u0081\u000e¢\u0006\u0014\n\u0000\u0012\u0004\b\u001d\u0010\u0015\u001a\u0004\b\u001e\u0010\u001f\"\u0004\b \u0010!R&\u0010\"\u001a\u0004\u0018\u00010#8\u0006@\u0006X\u0087\u000e¢\u0006\u0014\n\u0000\u0012\u0004\b$\u0010\u0015\u001a\u0004\b%\u0010&\"\u0004\b'\u0010(R!\u0010)\u001a\u00020*8@X\u0081\u0084\u0002¢\u0006\u0012\n\u0004\b.\u0010/\u0012\u0004\b+\u0010\u0015\u001a\u0004\b,\u0010-R\u000e\u00100\u001a\u00020\u001cX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0082\u000e¢\u0006\u0002\n\u0000R$\u00101\u001a\u00020\u001c8\u0000@\u0000X\u0081\u000e¢\u0006\u0014\n\u0000\u0012\u0004\b2\u0010\u0015\u001a\u0004\b3\u0010\u001f\"\u0004\b4\u0010!R\u001c\u00105\u001a\u0002068\u0000X\u0081\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b7\u0010\u0015\u001a\u0004\b8\u00109R$\u0010:\u001a\u00020\u00138\u0000@\u0000X\u0081\u000e¢\u0006\u0014\n\u0000\u0012\u0004\b;\u0010\u0015\u001a\u0004\b<\u0010=\"\u0004\b>\u0010?R\u001d\u0010@\u001a\u0004\u0018\u00010A8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bD\u0010/\u001a\u0004\bB\u0010CR\u000e\u0010\r\u001a\u00020\u000eX\u0082\u0004¢\u0006\u0002\n\u0000R\u001b\u0010E\u001a\u00020F8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bI\u0010/\u001a\u0004\bG\u0010HR\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0010X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010J\u001a\u0004\u0018\u00010KX\u0082\u000e¢\u0006\u0002\n\u0000R\u001b\u0010L\u001a\u00020M8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bP\u0010/\u001a\u0004\bN\u0010OR\u000e\u0010Q\u001a\u000206X\u0082\u0004¢\u0006\u0002\n\u0000R\u001b\u0010R\u001a\u00020S8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bV\u0010/\u001a\u0004\bT\u0010UR!\u0010W\u001a\u00020X8@X\u0081\u0084\u0002¢\u0006\u0012\n\u0004\b\\\u0010/\u0012\u0004\bY\u0010\u0015\u001a\u0004\bZ\u0010[R\u001b\u0010]\u001a\u00020^8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\ba\u0010/\u001a\u0004\b_\u0010`R&\u0010b\u001a\u0004\u0018\u00010c8\u0000@\u0000X\u0081\u000e¢\u0006\u0014\n\u0000\u0012\u0004\bd\u0010\u0015\u001a\u0004\be\u0010f\"\u0004\bg\u0010hR$\u0010i\u001a\u00020\u00138\u0000@\u0000X\u0081\u000e¢\u0006\u0014\n\u0000\u0012\u0004\bj\u0010\u0015\u001a\u0004\bk\u0010=\"\u0004\bl\u0010?R\u001b\u0010m\u001a\u00020n8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bq\u0010/\u001a\u0004\bo\u0010pR\u000e\u0010\t\u001a\u00020\nX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006¢\u0001"}, d2 = {"Lcom/vungle/ads/internal/presenter/MRAIDPresenter;", "Lcom/vungle/ads/internal/ui/view/WebViewAPI$MraidDelegate;", "Lcom/vungle/ads/internal/ui/view/WebViewAPI$WebClientErrorHandler;", "adWidget", "Lcom/vungle/ads/internal/ui/view/MRAIDAdWidget;", "advertisement", "Lcom/vungle/ads/internal/model/AdPayload;", "placement", "Lcom/vungle/ads/internal/model/Placement;", "vungleWebClient", "Lcom/vungle/ads/internal/ui/VungleWebClient;", "executor", "Ljava/util/concurrent/Executor;", "omTracker", "Lcom/vungle/ads/internal/omsdk/OMTracker;", "platform", "Lcom/vungle/ads/internal/platform/Platform;", "(Lcom/vungle/ads/internal/ui/view/MRAIDAdWidget;Lcom/vungle/ads/internal/model/AdPayload;Lcom/vungle/ads/internal/model/Placement;Lcom/vungle/ads/internal/ui/VungleWebClient;Ljava/util/concurrent/Executor;Lcom/vungle/ads/internal/omsdk/OMTracker;Lcom/vungle/ads/internal/platform/Platform;)V", "adStartTime", "", "getAdStartTime$vungle_ads_release$annotations", "()V", "getAdStartTime$vungle_ads_release", "()Ljava/lang/Long;", "setAdStartTime$vungle_ads_release", "(Ljava/lang/Long;)V", "Ljava/lang/Long;", "backEnabled", "", "getBackEnabled$vungle_ads_release$annotations", "getBackEnabled$vungle_ads_release", "()Z", "setBackEnabled$vungle_ads_release", "(Z)V", "bus", "Lcom/vungle/ads/internal/presenter/AdEventListener;", "getBus$annotations", "getBus", "()Lcom/vungle/ads/internal/presenter/AdEventListener;", "setBus", "(Lcom/vungle/ads/internal/presenter/AdEventListener;)V", "clickCoordinateTracker", "Lcom/vungle/ads/internal/ClickCoordinateTracker;", "getClickCoordinateTracker$vungle_ads_release$annotations", "getClickCoordinateTracker$vungle_ads_release", "()Lcom/vungle/ads/internal/ClickCoordinateTracker;", "clickCoordinateTracker$delegate", "Lkotlin/Lazy;", "cp0Fired", "heartbeatEnabled", "getHeartbeatEnabled$vungle_ads_release$annotations", "getHeartbeatEnabled$vungle_ads_release", "setHeartbeatEnabled$vungle_ads_release", "isDestroying", "Ljava/util/concurrent/atomic/AtomicBoolean;", "isDestroying$vungle_ads_release$annotations", "isDestroying$vungle_ads_release", "()Ljava/util/concurrent/atomic/AtomicBoolean;", "lastUserInteractionTimestamp", "getLastUserInteractionTimestamp$vungle_ads_release$annotations", "getLastUserInteractionTimestamp$vungle_ads_release", "()J", "setLastUserInteractionTimestamp$vungle_ads_release", "(J)V", "logEntry", "Lcom/vungle/ads/internal/util/LogEntry;", "getLogEntry", "()Lcom/vungle/ads/internal/util/LogEntry;", "logEntry$delegate", "pathProvider", "Lcom/vungle/ads/internal/util/PathProvider;", "getPathProvider", "()Lcom/vungle/ads/internal/util/PathProvider;", "pathProvider$delegate", "presenterDelegate", "Lcom/vungle/ads/internal/presenter/PresenterDelegate;", "scheduler", "Lcom/vungle/ads/internal/util/HandlerScheduler;", "getScheduler", "()Lcom/vungle/ads/internal/util/HandlerScheduler;", "scheduler$delegate", "sendReportIncentivized", "signalManager", "Lcom/vungle/ads/internal/signals/SignalManager;", "getSignalManager", "()Lcom/vungle/ads/internal/signals/SignalManager;", "signalManager$delegate", "suspendableTimer", "Lcom/vungle/ads/internal/util/SuspendableTimer;", "getSuspendableTimer$vungle_ads_release$annotations", "getSuspendableTimer$vungle_ads_release", "()Lcom/vungle/ads/internal/util/SuspendableTimer;", "suspendableTimer$delegate", "tpatSender", "Lcom/vungle/ads/internal/network/TpatSender;", "getTpatSender", "()Lcom/vungle/ads/internal/network/TpatSender;", "tpatSender$delegate", "userId", "", "getUserId$vungle_ads_release$annotations", "getUserId$vungle_ads_release", "()Ljava/lang/String;", "setUserId$vungle_ads_release", "(Ljava/lang/String;)V", "videoLength", "getVideoLength$vungle_ads_release$annotations", "getVideoLength$vungle_ads_release", "setVideoLength$vungle_ads_release", "vungleApiClient", "Lcom/vungle/ads/internal/network/VungleApiClient;", "getVungleApiClient", "()Lcom/vungle/ads/internal/network/VungleApiClient;", "vungleApiClient$delegate", "closeView", "", "detach", "stopReason", "", "getViewStatus", "handleExit", "handleWebViewException", "reason", "Lcom/vungle/ads/VungleError;", "fatal", "errorMessage", "loadMraidAd", "makeBusError", "onReceivedError", "errorDesc", "didCrash", "onRenderProcessUnresponsive", "webView", "Landroid/webkit/WebView;", "webViewRenderProcess", "Landroid/webkit/WebViewRenderProcess;", "onViewConfigurationChanged", "onViewTouched", "event", "Landroid/view/MotionEvent;", "onWebRenderingProcessGone", "view", "(Landroid/webkit/WebView;Ljava/lang/Boolean;)Z", "prepare", "processCommand", f.b.COMMAND, "arguments", "Lkotlinx/serialization/json/JsonObject;", "reportErrorAndCloseAd", "setAdVisibility", d9.h.o, "setEventListener", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "setPresenterDelegate", "setPresenterDelegate$vungle_ads_release", "shouldBlockAutoRedirect", "shouldBlockAutoRedirect$vungle_ads_release", "start", "stop", "triggerEventMetricForTpat", "key", "Companion", "vungle-ads_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
public final class MRAIDPresenter implements WebViewAPI.MraidDelegate, WebViewAPI.WebClientErrorHandler {
    private static final String ACTION = "action";
    public static final String ACTION_WITH_VALUE = "actionWithValue";
    public static final String CLOSE = "close";
    public static final String CONSENT_ACTION = "consentAction";
    public static final String CREATIVE_HEARTBEAT = "creativeHeartbeat";
    public static final String ERROR = "error";
    public static final String GET_AVAILABLE_DISK_SPACE = "getAvailableDiskSpace";
    private static final double HEARTBEAT_INTERVAL = 6.0d;
    public static final String OPEN = "open";
    private static final String OPEN_NON_MRAID = "openNonMraid";
    public static final String OPEN_PRIVACY = "openPrivacy";
    public static final String PING_URL = "pingUrl";
    public static final String SET_ORIENTATION_PROPERTIES = "setOrientationProperties";
    public static final String SUCCESSFUL_VIEW = "successfulView";
    private static final String TAG = "MRAIDPresenter";
    public static final String TPAT = "tpat";
    public static final String UPDATE_SIGNALS = "updateSignals";
    private static final String USE_CUSTOM_CLOSE = "useCustomClose";
    private static final String USE_CUSTOM_PRIVACY = "useCustomPrivacy";
    public static final String VIDEO_LENGTH = "videoLength";
    private Long adStartTime;
    private final MRAIDAdWidget adWidget;
    private final AdPayload advertisement;
    private boolean backEnabled;
    private AdEventListener bus;

    /* JADX INFO: renamed from: clickCoordinateTracker$delegate, reason: from kotlin metadata */
    private final Lazy clickCoordinateTracker;
    private boolean cp0Fired;
    private Executor executor;
    private boolean heartbeatEnabled;
    private final AtomicBoolean isDestroying;
    private long lastUserInteractionTimestamp;

    /* JADX INFO: renamed from: logEntry$delegate, reason: from kotlin metadata */
    private final Lazy logEntry;
    private final OMTracker omTracker;

    /* JADX INFO: renamed from: pathProvider$delegate, reason: from kotlin metadata */
    private final Lazy pathProvider;
    private final Placement placement;
    private final Platform platform;
    private PresenterDelegate presenterDelegate;

    /* JADX INFO: renamed from: scheduler$delegate, reason: from kotlin metadata */
    private final Lazy scheduler;
    private final AtomicBoolean sendReportIncentivized;

    /* JADX INFO: renamed from: signalManager$delegate, reason: from kotlin metadata */
    private final Lazy signalManager;

    /* JADX INFO: renamed from: suspendableTimer$delegate, reason: from kotlin metadata */
    private final Lazy suspendableTimer;

    /* JADX INFO: renamed from: tpatSender$delegate, reason: from kotlin metadata */
    private final Lazy tpatSender;
    private String userId;
    private long videoLength;

    /* JADX INFO: renamed from: vungleApiClient$delegate, reason: from kotlin metadata */
    private final Lazy vungleApiClient;
    private final VungleWebClient vungleWebClient;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final Map<String, Sdk.SDKMetric.SDKMetricType> eventMap = MapsKt.j(new Pair(Constants.CHECKPOINT_0, Sdk.SDKMetric.SDKMetricType.AD_START_EVENT), new Pair(Constants.CLICK_URL, Sdk.SDKMetric.SDKMetricType.AD_CLICK_EVENT));

    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0010\u0006\n\u0002\b\u0015\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u0016\u0010\u0005\u001a\u00020\u00048\u0000X\u0081T¢\u0006\b\n\u0000\u0012\u0004\b\u0006\u0010\u0002R\u0016\u0010\u0007\u001a\u00020\u00048\u0000X\u0081T¢\u0006\b\n\u0000\u0012\u0004\b\b\u0010\u0002R\u0016\u0010\t\u001a\u00020\u00048\u0000X\u0081T¢\u0006\b\n\u0000\u0012\u0004\b\n\u0010\u0002R\u0016\u0010\u000b\u001a\u00020\u00048\u0000X\u0081T¢\u0006\b\n\u0000\u0012\u0004\b\f\u0010\u0002R\u0016\u0010\r\u001a\u00020\u00048\u0000X\u0081T¢\u0006\b\n\u0000\u0012\u0004\b\u000e\u0010\u0002R\u0016\u0010\u000f\u001a\u00020\u00048\u0000X\u0081T¢\u0006\b\n\u0000\u0012\u0004\b\u0010\u0010\u0002R\u000e\u0010\u0011\u001a\u00020\u0012X\u0082T¢\u0006\u0002\n\u0000R\u0016\u0010\u0013\u001a\u00020\u00048\u0000X\u0081T¢\u0006\b\n\u0000\u0012\u0004\b\u0014\u0010\u0002R\u000e\u0010\u0015\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u0016\u0010\u0016\u001a\u00020\u00048\u0000X\u0081T¢\u0006\b\n\u0000\u0012\u0004\b\u0017\u0010\u0002R\u0016\u0010\u0018\u001a\u00020\u00048\u0000X\u0081T¢\u0006\b\n\u0000\u0012\u0004\b\u0019\u0010\u0002R\u0016\u0010\u001a\u001a\u00020\u00048\u0000X\u0081T¢\u0006\b\n\u0000\u0012\u0004\b\u001b\u0010\u0002R\u0016\u0010\u001c\u001a\u00020\u00048\u0000X\u0081T¢\u0006\b\n\u0000\u0012\u0004\b\u001d\u0010\u0002R\u000e\u0010\u001e\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u0016\u0010\u001f\u001a\u00020\u00048\u0000X\u0081T¢\u0006\b\n\u0000\u0012\u0004\b \u0010\u0002R\u0016\u0010!\u001a\u00020\u00048\u0000X\u0081T¢\u0006\b\n\u0000\u0012\u0004\b\"\u0010\u0002R\u000e\u0010#\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010$\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u0016\u0010%\u001a\u00020\u00048\u0000X\u0081T¢\u0006\b\n\u0000\u0012\u0004\b&\u0010\u0002R(\u0010'\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020)0(8\u0000X\u0081\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b*\u0010\u0002\u001a\u0004\b+\u0010,¨\u0006-"}, d2 = {"Lcom/vungle/ads/internal/presenter/MRAIDPresenter$Companion;", "", "()V", "ACTION", "", "ACTION_WITH_VALUE", "getACTION_WITH_VALUE$vungle_ads_release$annotations", "CLOSE", "getCLOSE$vungle_ads_release$annotations", "CONSENT_ACTION", "getCONSENT_ACTION$vungle_ads_release$annotations", "CREATIVE_HEARTBEAT", "getCREATIVE_HEARTBEAT$vungle_ads_release$annotations", "ERROR", "getERROR$vungle_ads_release$annotations", "GET_AVAILABLE_DISK_SPACE", "getGET_AVAILABLE_DISK_SPACE$vungle_ads_release$annotations", "HEARTBEAT_INTERVAL", "", "OPEN", "getOPEN$vungle_ads_release$annotations", "OPEN_NON_MRAID", "OPEN_PRIVACY", "getOPEN_PRIVACY$vungle_ads_release$annotations", "PING_URL", "getPING_URL$vungle_ads_release$annotations", "SET_ORIENTATION_PROPERTIES", "getSET_ORIENTATION_PROPERTIES$vungle_ads_release$annotations", "SUCCESSFUL_VIEW", "getSUCCESSFUL_VIEW$vungle_ads_release$annotations", "TAG", "TPAT", "getTPAT$vungle_ads_release$annotations", "UPDATE_SIGNALS", "getUPDATE_SIGNALS$vungle_ads_release$annotations", "USE_CUSTOM_CLOSE", "USE_CUSTOM_PRIVACY", "VIDEO_LENGTH", "getVIDEO_LENGTH$vungle_ads_release$annotations", "eventMap", "", "Lcom/vungle/ads/internal/protos/Sdk$SDKMetric$SDKMetricType;", "getEventMap$vungle_ads_release$annotations", "getEventMap$vungle_ads_release", "()Ljava/util/Map;", "vungle-ads_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public static /* synthetic */ void getACTION_WITH_VALUE$vungle_ads_release$annotations() {
        }

        public static /* synthetic */ void getCLOSE$vungle_ads_release$annotations() {
        }

        public static /* synthetic */ void getCONSENT_ACTION$vungle_ads_release$annotations() {
        }

        public static /* synthetic */ void getCREATIVE_HEARTBEAT$vungle_ads_release$annotations() {
        }

        public static /* synthetic */ void getERROR$vungle_ads_release$annotations() {
        }

        public static /* synthetic */ void getEventMap$vungle_ads_release$annotations() {
        }

        public static /* synthetic */ void getGET_AVAILABLE_DISK_SPACE$vungle_ads_release$annotations() {
        }

        public static /* synthetic */ void getOPEN$vungle_ads_release$annotations() {
        }

        public static /* synthetic */ void getOPEN_PRIVACY$vungle_ads_release$annotations() {
        }

        public static /* synthetic */ void getPING_URL$vungle_ads_release$annotations() {
        }

        public static /* synthetic */ void getSET_ORIENTATION_PROPERTIES$vungle_ads_release$annotations() {
        }

        public static /* synthetic */ void getSUCCESSFUL_VIEW$vungle_ads_release$annotations() {
        }

        public static /* synthetic */ void getTPAT$vungle_ads_release$annotations() {
        }

        public static /* synthetic */ void getUPDATE_SIGNALS$vungle_ads_release$annotations() {
        }

        public static /* synthetic */ void getVIDEO_LENGTH$vungle_ads_release$annotations() {
        }

        public final Map<String, Sdk.SDKMetric.SDKMetricType> getEventMap$vungle_ads_release() {
            return MRAIDPresenter.eventMap;
        }

        private Companion() {
        }
    }

    public MRAIDPresenter(MRAIDAdWidget adWidget, AdPayload advertisement, Placement placement, VungleWebClient vungleWebClient, Executor executor, OMTracker omTracker, Platform platform) {
        Intrinsics.f(adWidget, "adWidget");
        Intrinsics.f(advertisement, "advertisement");
        Intrinsics.f(placement, "placement");
        Intrinsics.f(vungleWebClient, "vungleWebClient");
        Intrinsics.f(executor, "executor");
        Intrinsics.f(omTracker, "omTracker");
        Intrinsics.f(platform, "platform");
        this.adWidget = adWidget;
        this.advertisement = advertisement;
        this.placement = placement;
        this.vungleWebClient = vungleWebClient;
        this.executor = executor;
        this.omTracker = omTracker;
        this.platform = platform;
        this.isDestroying = new AtomicBoolean(false);
        this.sendReportIncentivized = new AtomicBoolean(false);
        ServiceLocator.Companion companion = ServiceLocator.INSTANCE;
        final Context context = adWidget.getContext();
        Intrinsics.e(context, "adWidget.context");
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.X;
        this.vungleApiClient = LazyKt.a(lazyThreadSafetyMode, new Function0<VungleApiClient>() { // from class: com.vungle.ads.internal.presenter.MRAIDPresenter$special$$inlined$inject$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [com.vungle.ads.internal.network.VungleApiClient, java.lang.Object] */
            @Override // kotlin.jvm.functions.Function0
            public final VungleApiClient invoke() {
                return ServiceLocator.INSTANCE.getInstance(context).getService(VungleApiClient.class);
            }
        });
        final Context context2 = adWidget.getContext();
        Intrinsics.e(context2, "adWidget.context");
        this.pathProvider = LazyKt.a(lazyThreadSafetyMode, new Function0<PathProvider>() { // from class: com.vungle.ads.internal.presenter.MRAIDPresenter$special$$inlined$inject$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [com.vungle.ads.internal.util.PathProvider, java.lang.Object] */
            @Override // kotlin.jvm.functions.Function0
            public final PathProvider invoke() {
                return ServiceLocator.INSTANCE.getInstance(context2).getService(PathProvider.class);
            }
        });
        final Context context3 = adWidget.getContext();
        Intrinsics.e(context3, "adWidget.context");
        this.signalManager = LazyKt.a(lazyThreadSafetyMode, new Function0<SignalManager>() { // from class: com.vungle.ads.internal.presenter.MRAIDPresenter$special$$inlined$inject$3
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [com.vungle.ads.internal.signals.SignalManager, java.lang.Object] */
            @Override // kotlin.jvm.functions.Function0
            public final SignalManager invoke() {
                return ServiceLocator.INSTANCE.getInstance(context3).getService(SignalManager.class);
            }
        });
        final Context context4 = adWidget.getContext();
        Intrinsics.e(context4, "adWidget.context");
        this.tpatSender = LazyKt.a(lazyThreadSafetyMode, new Function0<TpatSender>() { // from class: com.vungle.ads.internal.presenter.MRAIDPresenter$special$$inlined$inject$4
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [com.vungle.ads.internal.network.TpatSender, java.lang.Object] */
            @Override // kotlin.jvm.functions.Function0
            public final TpatSender invoke() {
                return ServiceLocator.INSTANCE.getInstance(context4).getService(TpatSender.class);
            }
        });
        this.scheduler = LazyKt.b(new Function0<HandlerScheduler>() { // from class: com.vungle.ads.internal.presenter.MRAIDPresenter$scheduler$2
            @Override // kotlin.jvm.functions.Function0
            public final HandlerScheduler invoke() {
                return new HandlerScheduler();
            }
        });
        this.logEntry = LazyKt.b(new Function0<LogEntry>() { // from class: com.vungle.ads.internal.presenter.MRAIDPresenter$logEntry$2
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public final LogEntry invoke() {
                return this.this$0.advertisement.getLogEntry();
            }
        });
        this.suspendableTimer = LazyKt.b(new Function0<SuspendableTimer>() { // from class: com.vungle.ads.internal.presenter.MRAIDPresenter$suspendableTimer$2
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public final SuspendableTimer invoke() {
                final MRAIDPresenter mRAIDPresenter = this.this$0;
                return new SuspendableTimer(6.0d, true, null, new Function0<Unit>() { // from class: com.vungle.ads.internal.presenter.MRAIDPresenter$suspendableTimer$2.1
                    {
                        super(0);
                    }

                    @Override // kotlin.jvm.functions.Function0
                    public /* bridge */ /* synthetic */ Object invoke() {
                        m3239invoke();
                        return Unit.f43263a;
                    }

                    /* JADX INFO: renamed from: invoke, reason: collision with other method in class */
                    public final void m3239invoke() {
                        mRAIDPresenter.reportErrorAndCloseAd(new HeartbeatMissingError());
                    }
                }, 4, null);
            }
        });
        this.clickCoordinateTracker = LazyKt.b(new Function0<ClickCoordinateTracker>() { // from class: com.vungle.ads.internal.presenter.MRAIDPresenter$clickCoordinateTracker$2
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public final ClickCoordinateTracker invoke() {
                Context context5 = this.this$0.adWidget.getContext();
                Intrinsics.e(context5, "adWidget.context");
                return new ClickCoordinateTracker(context5, this.this$0.advertisement);
            }
        });
    }

    private final void closeView() {
        Long l2 = this.adStartTime;
        if (l2 != null) {
            List<String> tpatUrls = this.advertisement.getTpatUrls(Constants.AD_CLOSE, String.valueOf(System.currentTimeMillis() - l2.longValue()), String.valueOf(this.platform.getVolumeLevel()));
            if (tpatUrls != null) {
                Iterator<T> it = tpatUrls.iterator();
                while (it.hasNext()) {
                    TpatSender.sendTpat$default(getTpatSender(), new TpatRequest.Builder((String) it.next()).tpatKey(Constants.AD_CLOSE).withLogEntry(getLogEntry()).build(), false, 2, null);
                }
            }
        }
        ThreadUtil.INSTANCE.runOnUiThread(new Function0<Unit>() { // from class: com.vungle.ads.internal.presenter.MRAIDPresenter.closeView.2
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ Object invoke() {
                m3237invoke();
                return Unit.f43263a;
            }

            /* JADX INFO: renamed from: invoke, reason: collision with other method in class */
            public final void m3237invoke() {
                MRAIDPresenter.this.adWidget.close();
            }
        });
    }

    public static /* synthetic */ void getAdStartTime$vungle_ads_release$annotations() {
    }

    public static /* synthetic */ void getBackEnabled$vungle_ads_release$annotations() {
    }

    public static /* synthetic */ void getBus$annotations() {
    }

    public static /* synthetic */ void getClickCoordinateTracker$vungle_ads_release$annotations() {
    }

    public static /* synthetic */ void getHeartbeatEnabled$vungle_ads_release$annotations() {
    }

    public static /* synthetic */ void getLastUserInteractionTimestamp$vungle_ads_release$annotations() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final LogEntry getLogEntry() {
        return (LogEntry) this.logEntry.getX();
    }

    private final PathProvider getPathProvider() {
        return (PathProvider) this.pathProvider.getX();
    }

    private final HandlerScheduler getScheduler() {
        return (HandlerScheduler) this.scheduler.getX();
    }

    private final SignalManager getSignalManager() {
        return (SignalManager) this.signalManager.getX();
    }

    public static /* synthetic */ void getSuspendableTimer$vungle_ads_release$annotations() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final TpatSender getTpatSender() {
        return (TpatSender) this.tpatSender.getX();
    }

    public static /* synthetic */ void getUserId$vungle_ads_release$annotations() {
    }

    public static /* synthetic */ void getVideoLength$vungle_ads_release$annotations() {
    }

    private final VungleApiClient getVungleApiClient() {
        return (VungleApiClient) this.vungleApiClient.getX();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void handleWebViewException(VungleError reason, boolean fatal, String errorMessage) {
        Logger.INSTANCE.e(TAG, "handleWebViewException: " + reason.getLocalizedMessage() + ", fatal: " + fatal + ", errorMsg: " + errorMessage);
        reason.setLogEntry$vungle_ads_release(getLogEntry()).logErrorNoReturnValue$vungle_ads_release();
        if (fatal) {
            makeBusError(reason);
            closeView();
        }
    }

    public static /* synthetic */ void handleWebViewException$default(MRAIDPresenter mRAIDPresenter, VungleError vungleError, boolean z2, String str, int i2, Object obj) {
        if ((i2 & 4) != 0) {
            str = null;
        }
        mRAIDPresenter.handleWebViewException(vungleError, z2, str);
    }

    public static /* synthetic */ void isDestroying$vungle_ads_release$annotations() {
    }

    private final VungleError loadMraidAd() {
        String indexFilePath = this.advertisement.getIndexFilePath();
        File file = indexFilePath != null ? new File(indexFilePath) : null;
        if (file == null || !file.exists()) {
            Sdk.SDKError.Reason reason = Sdk.SDKError.Reason.AD_HTML_FAILED_TO_LOAD;
            StringBuilder sb = new StringBuilder("Fail to load html ");
            sb.append(file != null ? file.getPath() : null);
            return new IndexHtmlError(reason, sb.toString());
        }
        this.adWidget.linkWebView(this.vungleWebClient, this.advertisement.getWebViewSettings());
        this.adWidget.showWebsite(AdPayload.FILE_SCHEME + file.getPath());
        return null;
    }

    private final void makeBusError(VungleError reason) {
        AdEventListener adEventListener = this.bus;
        if (adEventListener != null) {
            adEventListener.onError(reason, this.placement.getReferenceId());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: prepare$lambda-14, reason: not valid java name */
    public static final void m3232prepare$lambda14(MRAIDPresenter this$0) {
        Intrinsics.f(this$0, "this$0");
        this$0.backEnabled = true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: processCommand$lambda-10, reason: not valid java name */
    public static final void m3233processCommand$lambda10(MRAIDPresenter this$0) {
        Intrinsics.f(this$0, "this$0");
        this$0.getSuspendableTimer$vungle_ads_release().reset();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: processCommand$lambda-11, reason: not valid java name */
    public static final void m3234processCommand$lambda11(MRAIDPresenter this$0, long j, long j2) {
        Intrinsics.f(this$0, "this$0");
        this$0.vungleWebClient.notifyDiskAvailableSize(j, j2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: processCommand$lambda-5, reason: not valid java name */
    public static final void m3235processCommand$lambda5(MRAIDPresenter this$0) {
        Intrinsics.f(this$0, "this$0");
        this$0.adWidget.setVisibility(0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: processCommand$lambda-9, reason: not valid java name */
    public static final void m3236processCommand$lambda9(final MRAIDPresenter this$0) {
        Intrinsics.f(this$0, "this$0");
        List list = null;
        CommonRequestBody.AdSizeParam adSizeParam = null;
        Call<Void> callRi = this$0.getVungleApiClient().ri(new CommonRequestBody.RequestParam(list, adSizeParam, this$0.adStartTime, this$0.advertisement.advAppId(), this$0.placement.getReferenceId(), this$0.userId, 3, (DefaultConstructorMarker) null));
        if (callRi != null) {
            callRi.enqueue(new Callback<Void>() { // from class: com.vungle.ads.internal.presenter.MRAIDPresenter$processCommand$6$1
                @Override // com.vungle.ads.internal.network.Callback
                public void onFailure(Call<Void> call, Throwable t) {
                    Logger.INSTANCE.d("MRAIDPresenter", "send RI Failure");
                    StringBuilder sb = new StringBuilder("Error RI API calls: ");
                    sb.append(t != null ? t.getLocalizedMessage() : null);
                    new NetworkUnreachable(sb.toString()).setLogEntry$vungle_ads_release(this.this$0.getLogEntry()).logErrorNoReturnValue$vungle_ads_release();
                }

                @Override // com.vungle.ads.internal.network.Callback
                public void onResponse(Call<Void> call, Response<Void> response) {
                    Logger.INSTANCE.d("MRAIDPresenter", "send RI success");
                }
            });
            return;
        }
        Logger.INSTANCE.e(TAG, "Invalid ri call.");
        new NetworkUnreachable("Error RI API for placement: " + this$0.placement.getReferenceId()).setLogEntry$vungle_ads_release(this$0.getLogEntry()).logErrorNoReturnValue$vungle_ads_release();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void reportErrorAndCloseAd(VungleError reason) {
        reason.setLogEntry$vungle_ads_release(getLogEntry()).logErrorNoReturnValue$vungle_ads_release();
        makeBusError(reason);
        closeView();
    }

    private final void triggerEventMetricForTpat(String key) throws Throwable {
        Sdk.SDKMetric.SDKMetricType sDKMetricType = eventMap.get(key);
        if (sDKMetricType != null) {
            AnalyticsClient.logMetric$vungle_ads_release$default(AnalyticsClient.INSTANCE, new SingleValueMetric(sDKMetricType), getLogEntry(), (String) null, 4, (Object) null);
        }
    }

    public final void detach(@MRAIDAdWidget.AdStopReason int stopReason) {
        AdEventListener adEventListener;
        Logger.INSTANCE.d(TAG, "detach()");
        boolean z2 = (stopReason & 1) != 0;
        boolean z3 = (stopReason & 2) != 0;
        this.vungleWebClient.setWebViewObserver(null);
        this.vungleWebClient.setMraidDelegate(null);
        if (!z2 && z3 && !this.isDestroying.getAndSet(true) && (adEventListener = this.bus) != null) {
            adEventListener.onNext(TtmlNode.END, null, this.placement.getReferenceId());
        }
        this.adWidget.destroyWebView(this.omTracker.stop(), this.platform.isProblematicMaliDevice());
        if (this.heartbeatEnabled) {
            getSuspendableTimer$vungle_ads_release().cancel();
        }
    }

    /* JADX INFO: renamed from: getAdStartTime$vungle_ads_release, reason: from getter */
    public final Long getAdStartTime() {
        return this.adStartTime;
    }

    /* JADX INFO: renamed from: getBackEnabled$vungle_ads_release, reason: from getter */
    public final boolean getBackEnabled() {
        return this.backEnabled;
    }

    public final AdEventListener getBus() {
        return this.bus;
    }

    public final ClickCoordinateTracker getClickCoordinateTracker$vungle_ads_release() {
        return (ClickCoordinateTracker) this.clickCoordinateTracker.getX();
    }

    /* JADX INFO: renamed from: getHeartbeatEnabled$vungle_ads_release, reason: from getter */
    public final boolean getHeartbeatEnabled() {
        return this.heartbeatEnabled;
    }

    /* JADX INFO: renamed from: getLastUserInteractionTimestamp$vungle_ads_release, reason: from getter */
    public final long getLastUserInteractionTimestamp() {
        return this.lastUserInteractionTimestamp;
    }

    public final SuspendableTimer getSuspendableTimer$vungle_ads_release() {
        return (SuspendableTimer) this.suspendableTimer.getX();
    }

    /* JADX INFO: renamed from: getUserId$vungle_ads_release, reason: from getter */
    public final String getUserId() {
        return this.userId;
    }

    /* JADX INFO: renamed from: getVideoLength$vungle_ads_release, reason: from getter */
    public final long getVideoLength() {
        return this.videoLength;
    }

    public final Long getViewStatus() {
        return !this.cp0Fired ? 1L : null;
    }

    public final void handleExit() {
        if (this.backEnabled) {
            this.adWidget.showWebsite("javascript:window.vungle.mraidBridgeExt.requestMRAIDClose()");
        }
    }

    /* JADX INFO: renamed from: isDestroying$vungle_ads_release, reason: from getter */
    public final AtomicBoolean getIsDestroying() {
        return this.isDestroying;
    }

    @Override // com.vungle.ads.internal.ui.view.WebViewAPI.WebClientErrorHandler
    public void onReceivedError(String errorDesc, boolean didCrash) {
        Intrinsics.f(errorDesc, "errorDesc");
        if (didCrash) {
            reportErrorAndCloseAd(new WebViewError(errorDesc));
        }
    }

    @Override // com.vungle.ads.internal.ui.view.WebViewAPI.WebClientErrorHandler
    public void onRenderProcessUnresponsive(WebView webView, WebViewRenderProcess webViewRenderProcess) {
        handleWebViewException$default(this, new WebViewRenderProcessUnresponsive("fatal=true"), true, null, 4, null);
    }

    public final void onViewConfigurationChanged() {
        this.vungleWebClient.notifyPropertiesChange(true);
    }

    public final void onViewTouched(MotionEvent event) {
        if (event != null) {
            Logger.INSTANCE.d(TAG, "user interaction");
            this.lastUserInteractionTimestamp = System.currentTimeMillis();
            getClickCoordinateTracker$vungle_ads_release().trackCoordinate(event);
        }
    }

    @Override // com.vungle.ads.internal.ui.view.WebViewAPI.WebClientErrorHandler
    public boolean onWebRenderingProcessGone(WebView view, Boolean didCrash) {
        boolean zBooleanValue = didCrash != null ? didCrash.booleanValue() : true;
        handleWebViewException$default(this, new WebViewRenderingProcessGone("didCrash=" + zBooleanValue), zBooleanValue, null, 4, null);
        return true;
    }

    public final void prepare() {
        int i2;
        String alertTitleText;
        String alertBodyText;
        String alertContinueButtonText;
        String alertCloseButtonText;
        VungleError vungleErrorLoadMraidAd;
        int settings;
        this.isDestroying.set(false);
        AdConfig adConfig = this.advertisement.getAdConfig();
        if (adConfig != null && (settings = adConfig.getSettings()) > 0) {
            this.backEnabled = (settings & 2) == 2;
        }
        this.heartbeatEnabled = this.advertisement.heartbeatEnabled();
        AdConfig adConfig2 = this.advertisement.getAdConfig();
        Integer numValueOf = adConfig2 != null ? Integer.valueOf(adConfig2.getAdOrientation()) : null;
        if (numValueOf != null && numValueOf.intValue() == 0) {
            i2 = 7;
        } else {
            i2 = (numValueOf != null && numValueOf.intValue() == 1) ? 6 : 4;
        }
        this.adWidget.setOrientation(i2);
        this.omTracker.start();
        this.vungleWebClient.setMraidDelegate(this);
        this.vungleWebClient.setErrorHandler(this);
        this.vungleWebClient.setAdVisibility(false);
        if (!this.advertisement.usePreloading() && (vungleErrorLoadMraidAd = loadMraidAd()) != null) {
            reportErrorAndCloseAd(vungleErrorLoadMraidAd);
            return;
        }
        this.adStartTime = Long.valueOf(System.currentTimeMillis());
        PresenterDelegate presenterDelegate = this.presenterDelegate;
        this.userId = presenterDelegate != null ? presenterDelegate.getUserId() : null;
        PresenterDelegate presenterDelegate2 = this.presenterDelegate;
        if (presenterDelegate2 == null || (alertTitleText = presenterDelegate2.getAlertTitleText()) == null) {
            alertTitleText = "";
        }
        PresenterDelegate presenterDelegate3 = this.presenterDelegate;
        if (presenterDelegate3 == null || (alertBodyText = presenterDelegate3.getAlertBodyText()) == null) {
            alertBodyText = "";
        }
        PresenterDelegate presenterDelegate4 = this.presenterDelegate;
        if (presenterDelegate4 == null || (alertContinueButtonText = presenterDelegate4.getAlertContinueButtonText()) == null) {
            alertContinueButtonText = "";
        }
        PresenterDelegate presenterDelegate5 = this.presenterDelegate;
        if (presenterDelegate5 == null || (alertCloseButtonText = presenterDelegate5.getAlertCloseButtonText()) == null) {
            alertCloseButtonText = "";
        }
        this.advertisement.setIncentivizedText(alertTitleText, alertBodyText, alertContinueButtonText, alertCloseButtonText);
        ConfigManager configManager = ConfigManager.INSTANCE;
        boolean z2 = configManager.getGDPRIsCountryDataProtected() && "unknown".equals(PrivacyManager.INSTANCE.getConsentStatus());
        this.vungleWebClient.setConsentStatus(z2, configManager.getGDPRConsentTitle(), configManager.getGDPRConsentMessage(), configManager.getGDPRButtonAccept(), configManager.getGDPRButtonDeny());
        if (z2) {
            PrivacyManager.INSTANCE.updateGdprConsent("opted_out_by_timeout", "vungle_modal", "");
        }
        int showCloseDelay = this.advertisement.getShowCloseDelay(Boolean.valueOf(this.placement.isRewardedVideo()));
        if (showCloseDelay > 0) {
            getScheduler().schedule(new a(this, 3), showCloseDelay);
        } else {
            this.backEnabled = true;
        }
        AdEventListener adEventListener = this.bus;
        if (adEventListener != null) {
            adEventListener.onNext("start", null, this.placement.getReferenceId());
        }
        if (this.heartbeatEnabled) {
            getSuspendableTimer$vungle_ads_release().start();
        }
    }

    /* JADX WARN: Code duplicated, block: B:105:0x024e  */
    /* JADX WARN: Code duplicated, block: B:108:0x0260  */
    /* JADX WARN: Code duplicated, block: B:111:0x027e  */
    /* JADX WARN: Code duplicated, block: B:113:0x029b  */
    /* JADX WARN: Code duplicated, block: B:115:0x02b9  */
    /* JADX WARN: Code restructure failed: missing block: B:208:0x0505, code lost:
    
        if (r24.equals("action") == false) goto L212;
     */
    @Override // com.vungle.ads.internal.ui.view.WebViewAPI.MraidDelegate
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean processCommand(java.lang.String r24, kotlinx.serialization.json.JsonObject r25) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 1454
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.vungle.ads.internal.presenter.MRAIDPresenter.processCommand(java.lang.String, kotlinx.serialization.json.JsonObject):boolean");
    }

    public final void setAdStartTime$vungle_ads_release(Long l2) {
        this.adStartTime = l2;
    }

    public final void setAdVisibility(boolean isViewable) {
        this.vungleWebClient.setAdVisibility(isViewable);
    }

    public final void setBackEnabled$vungle_ads_release(boolean z2) {
        this.backEnabled = z2;
    }

    public final void setBus(AdEventListener adEventListener) {
        this.bus = adEventListener;
    }

    public final void setEventListener(AdEventListener listener) {
        this.bus = listener;
    }

    public final void setHeartbeatEnabled$vungle_ads_release(boolean z2) {
        this.heartbeatEnabled = z2;
    }

    public final void setLastUserInteractionTimestamp$vungle_ads_release(long j) {
        this.lastUserInteractionTimestamp = j;
    }

    public final void setPresenterDelegate$vungle_ads_release(PresenterDelegate presenterDelegate) {
        this.presenterDelegate = presenterDelegate;
    }

    public final void setUserId$vungle_ads_release(String str) {
        this.userId = str;
    }

    public final void setVideoLength$vungle_ads_release(long j) {
        this.videoLength = j;
    }

    public final boolean shouldBlockAutoRedirect$vungle_ads_release() {
        ConfigManager configManager = ConfigManager.INSTANCE;
        return !configManager.allowAutoRedirects() && (this.lastUserInteractionTimestamp == 0 || System.currentTimeMillis() - this.lastUserInteractionTimestamp > configManager.afterClickDuration());
    }

    public final void start() {
        Logger.INSTANCE.d(TAG, "start()");
        this.adWidget.resumeWeb();
        setAdVisibility(true);
    }

    public final void stop() {
        Logger.INSTANCE.d(TAG, "stop()");
        this.adWidget.pauseWeb();
        setAdVisibility(false);
    }
}
