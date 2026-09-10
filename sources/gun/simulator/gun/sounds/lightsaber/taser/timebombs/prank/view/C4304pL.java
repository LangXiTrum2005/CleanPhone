package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import android.content.Context;
import android.view.MotionEvent;
import android.webkit.WebView;
import android.webkit.WebViewRenderProcess;
import androidx.annotation.VisibleForTesting;
import com.mbridge.msdk.playercommon.exoplayer2.text.ttml.TtmlNode;
import com.vungle.ads.ServiceLocator$Companion;
import com.vungle.ads.internal.network.VungleApiClient;
import java.io.File;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: renamed from: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.pL, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C4304pL implements InterfaceC4957wl0, InterfaceC5045xl0 {
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
    public static final String VIDEO_VIEWED = "videoViewed";
    private Long adStartTime;
    private boolean adViewed;
    private final C2984aL adWidget;
    private final C4980x2 advertisement;
    private boolean backEnabled;
    private final C3967la bidPayload;
    private C4099n1 bus;
    private final InterfaceC3069bH clickCoordinateTracker$delegate;
    private Executor executor;
    private final InterfaceC3069bH executors$delegate;
    private boolean heartbeatEnabled;
    private final AtomicBoolean isDestroying;
    private long lastUserInteractionTimestamp;
    private final InterfaceC3069bH logEntry$delegate;
    private final C3345eS omTracker;
    private final InterfaceC3069bH pathProvider$delegate;
    private final C4664tU placement;
    private final InterfaceC5016xU platform;
    private InterfaceC5105yV presenterDelegate;
    private final InterfaceC3069bH scheduler$delegate;
    private final AtomicBoolean sendReportIncentivized;
    private final InterfaceC3069bH signalManager$delegate;
    private final InterfaceC3069bH suspendableTimer$delegate;
    private String userId;
    private long videoLength;
    private final InterfaceC3069bH vungleApiClient$delegate;
    private final C5041xj0 vungleWebClient;
    public static final C3250dL Companion = new C3250dL(null);
    private static final Map<String, B30> eventMap = U5.u0(new C4839vT(C2390Ej.CHECKPOINT_0, B30.AD_START_EVENT), new C4839vT(C2390Ej.CLICK_URL, B30.AD_CLICK_EVENT));

    public C4304pL(C2984aL c2984aL, C4980x2 c4980x2, C4664tU c4664tU, C5041xj0 c5041xj0, Executor executor, C3345eS c3345eS, C3967la c3967la, InterfaceC5016xU interfaceC5016xU) {
        AbstractC2995aW.q(c2984aL, "adWidget");
        AbstractC2995aW.q(c4980x2, "advertisement");
        AbstractC2995aW.q(c4664tU, "placement");
        AbstractC2995aW.q(c5041xj0, "vungleWebClient");
        AbstractC2995aW.q(executor, "executor");
        AbstractC2995aW.q(c3345eS, "omTracker");
        AbstractC2995aW.q(interfaceC5016xU, "platform");
        this.adWidget = c2984aL;
        this.advertisement = c4980x2;
        this.placement = c4664tU;
        this.vungleWebClient = c5041xj0;
        this.executor = executor;
        this.omTracker = c3345eS;
        this.bidPayload = c3967la;
        this.platform = interfaceC5016xU;
        this.isDestroying = new AtomicBoolean(false);
        this.sendReportIncentivized = new AtomicBoolean(false);
        ServiceLocator$Companion serviceLocator$Companion = C3756j50.Companion;
        Context context = c2984aL.getContext();
        AbstractC2995aW.p(context, "adWidget.context");
        EnumC4124nH enumC4124nH = EnumC4124nH.f4736a;
        this.vungleApiClient$delegate = AbstractC2340Cl.H(enumC4124nH, new C3776jL(context));
        Context context2 = c2984aL.getContext();
        AbstractC2995aW.p(context2, "adWidget.context");
        this.executors$delegate = AbstractC2340Cl.H(enumC4124nH, new C3864kL(context2));
        Context context3 = c2984aL.getContext();
        AbstractC2995aW.p(context3, "adWidget.context");
        this.pathProvider$delegate = AbstractC2340Cl.H(enumC4124nH, new C3952lL(context3));
        Context context4 = c2984aL.getContext();
        AbstractC2995aW.p(context4, "adWidget.context");
        this.signalManager$delegate = AbstractC2340Cl.H(enumC4124nH, new C4040mL(context4));
        this.scheduler$delegate = AbstractC2340Cl.I(C3690iL.INSTANCE);
        this.logEntry$delegate = AbstractC2340Cl.I(new C3426fL(this));
        this.suspendableTimer$delegate = AbstractC2340Cl.I(new C4216oL(this));
        this.clickCoordinateTracker$delegate = AbstractC2340Cl.I(new C3338eL(this));
    }

    private final void closeView() {
        Long l = this.adStartTime;
        if (l != null) {
            long jCurrentTimeMillis = System.currentTimeMillis() - l.longValue();
            C3624hd0 c3624hd0 = new C3624hd0(getVungleApiClient$vungle_ads_release(), getLogEntry(), ((C4893w20) getExecutors()).getIoExecutor(), getPathProvider(), getSignalManager());
            List<String> tpatUrls = this.advertisement.getTpatUrls(C2390Ej.AD_CLOSE, String.valueOf(jCurrentTimeMillis), String.valueOf(((C5160z4) this.platform).getVolumeLevel()));
            if (tpatUrls != null) {
                c3624hd0.sendTpats(tpatUrls, this.executor);
            }
        }
        C3622hc0.INSTANCE.runOnUiThread(new RunnableC3073bL(this, 0));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: closeView$lambda-3, reason: not valid java name */
    public static final void m261closeView$lambda3(C4304pL c4304pL) {
        AbstractC2995aW.q(c4304pL, "this$0");
        c4304pL.adWidget.close();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final InterfaceC4615ss getExecutors() {
        return (InterfaceC4615ss) this.executors$delegate.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final C4126nJ getLogEntry() {
        return (C4126nJ) this.logEntry$delegate.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final ZT getPathProvider() {
        return (ZT) this.pathProvider$delegate.getValue();
    }

    private final C3393ez getScheduler() {
        return (C3393ez) this.scheduler$delegate.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final L60 getSignalManager() {
        return (L60) this.signalManager$delegate.getValue();
    }

    private final void handleWebViewException(Ei0 ei0, boolean z, String str) {
        C4917wJ.Companion.e(TAG, "handleWebViewException: " + ei0.getLocalizedMessage() + ", fatal: " + z + ", errorMsg: " + str);
        if (z) {
            makeBusError(ei0);
            closeView();
        }
    }

    public static /* synthetic */ void handleWebViewException$default(C4304pL c4304pL, Ei0 ei0, boolean z, String str, int i, Object obj) {
        if ((i & 4) != 0) {
            str = null;
        }
        c4304pL.handleWebViewException(ei0, z, str);
    }

    private final boolean loadMraidAd(File file) {
        File file2 = new File(file.getPath(), C2390Ej.AD_INDEX_FILE_NAME);
        if (file2.exists()) {
            this.adWidget.showWebsite(C4980x2.FILE_SCHEME + file2.getPath());
            return true;
        }
        new ZC(EnumC4719u30.AD_HTML_FAILED_TO_LOAD, "Fail to load html " + file2.getPath()).setLogEntry$vungle_ads_release(getLogEntry()).logErrorNoReturnValue$vungle_ads_release();
        return false;
    }

    private final void makeBusError(Ei0 ei0) {
        C4099n1 c4099n1 = this.bus;
        if (c4099n1 != null) {
            c4099n1.onError(ei0, this.placement.getReferenceId());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: prepare$lambda-16, reason: not valid java name */
    public static final void m262prepare$lambda16(C4304pL c4304pL) {
        AbstractC2995aW.q(c4304pL, "this$0");
        c4304pL.backEnabled = true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: processCommand$lambda-11, reason: not valid java name */
    public static final void m263processCommand$lambda11(C4304pL c4304pL) {
        AbstractC2995aW.q(c4304pL, "this$0");
        List list = null;
        C4155ng c4155ng = null;
        InterfaceC2435Gc interfaceC2435GcRi = c4304pL.getVungleApiClient$vungle_ads_release().ri(new C2439Gg(list, c4155ng, c4304pL.adStartTime, c4304pL.advertisement.advAppId(), c4304pL.placement.getReferenceId(), c4304pL.userId, 3, (AbstractC2471Hm) null));
        if (interfaceC2435GcRi != null) {
            ((C4662tS) interfaceC2435GcRi).enqueue(new C3514gL(c4304pL));
        } else {
            C4917wJ.Companion.e(TAG, "Invalid ri call.");
            new CR("Error RI API for placement: " + c4304pL.placement.getReferenceId()).setLogEntry$vungle_ads_release(c4304pL.getLogEntry()).logErrorNoReturnValue$vungle_ads_release();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: processCommand$lambda-12, reason: not valid java name */
    public static final void m264processCommand$lambda12(C4304pL c4304pL, Ei0 ei0, boolean z, String str) {
        AbstractC2995aW.q(c4304pL, "this$0");
        AbstractC2995aW.q(ei0, "$exception");
        AbstractC2995aW.q(str, "$message");
        c4304pL.handleWebViewException(ei0, z, str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: processCommand$lambda-13, reason: not valid java name */
    public static final void m265processCommand$lambda13(C4304pL c4304pL) {
        AbstractC2995aW.q(c4304pL, "this$0");
        c4304pL.getSuspendableTimer$vungle_ads_release().reset();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: processCommand$lambda-14, reason: not valid java name */
    public static final void m266processCommand$lambda14(C4304pL c4304pL, long j) {
        AbstractC2995aW.q(c4304pL, "this$0");
        c4304pL.vungleWebClient.notifyDiskAvailableSize(j);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: processCommand$lambda-7, reason: not valid java name */
    public static final void m267processCommand$lambda7(C4304pL c4304pL) {
        AbstractC2995aW.q(c4304pL, "this$0");
        c4304pL.adWidget.setVisibility(0);
    }

    private final void recordPlayAssetMetric() {
        C2961a4.logMetric$vungle_ads_release$default(C2961a4.INSTANCE, new C3586h70(this.advertisement.getAssetsFullyDownloaded() ? B30.LOCAL_ASSETS_USED : B30.REMOTE_ASSETS_USED), getLogEntry(), (String) null, 4, (Object) null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void reportErrorAndCloseAd(Ei0 ei0) {
        makeBusError(ei0);
        closeView();
    }

    private final void triggerEventMetricForTpat(String str) {
        B30 b30 = eventMap.get(str);
        if (b30 != null) {
            C2961a4.logMetric$vungle_ads_release$default(C2961a4.INSTANCE, new C3586h70(b30), getLogEntry(), (String) null, 4, (Object) null);
        }
    }

    public final void detach(int i) {
        C4099n1 c4099n1;
        C4917wJ.Companion.d(TAG, "detach()");
        boolean z = (i & 1) != 0;
        boolean z2 = (i & 2) != 0;
        this.vungleWebClient.setWebViewObserver(null);
        this.vungleWebClient.setMraidDelegate(null);
        if (!z && z2 && !this.isDestroying.getAndSet(true) && (c4099n1 = this.bus) != null) {
            c4099n1.onNext(TtmlNode.END, null, this.placement.getReferenceId());
        }
        this.adWidget.destroyWebView(this.omTracker.stop());
        if (this.heartbeatEnabled) {
            getSuspendableTimer$vungle_ads_release().cancel();
        }
    }

    public final Long getAdStartTime$vungle_ads_release() {
        return this.adStartTime;
    }

    public final boolean getBackEnabled$vungle_ads_release() {
        return this.backEnabled;
    }

    public final C4099n1 getBus() {
        return this.bus;
    }

    public final C4680tf getClickCoordinateTracker$vungle_ads_release() {
        return (C4680tf) this.clickCoordinateTracker$delegate.getValue();
    }

    public final boolean getHeartbeatEnabled$vungle_ads_release() {
        return this.heartbeatEnabled;
    }

    public final long getLastUserInteractionTimestamp$vungle_ads_release() {
        return this.lastUserInteractionTimestamp;
    }

    public final Ha0 getSuspendableTimer$vungle_ads_release() {
        return (Ha0) this.suspendableTimer$delegate.getValue();
    }

    public final String getUserId$vungle_ads_release() {
        return this.userId;
    }

    public final long getVideoLength$vungle_ads_release() {
        return this.videoLength;
    }

    public final VungleApiClient getVungleApiClient$vungle_ads_release() {
        return (VungleApiClient) this.vungleApiClient$delegate.getValue();
    }

    public final void handleExit() {
        if (this.backEnabled) {
            this.adWidget.showWebsite("javascript:window.vungle.mraidBridgeExt.requestMRAIDClose()");
        }
    }

    public final AtomicBoolean isDestroying$vungle_ads_release() {
        return this.isDestroying;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC5045xl0
    public void onReceivedError(String str, boolean z) {
        AbstractC2995aW.q(str, "errorDesc");
        if (z) {
            reportErrorAndCloseAd(new C5221zl0(str).setLogEntry$vungle_ads_release(getLogEntry()).logError$vungle_ads_release());
        }
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC5045xl0
    public void onRenderProcessUnresponsive(WebView webView, WebViewRenderProcess webViewRenderProcess) {
        handleWebViewException$default(this, new Bl0("fatal=true"), true, null, 4, null);
    }

    public final void onViewConfigurationChanged() {
        this.vungleWebClient.notifyPropertiesChange(true);
    }

    public final void onViewTouched(MotionEvent motionEvent) {
        if (motionEvent != null) {
            C4917wJ.Companion.d(TAG, "user interaction");
            this.lastUserInteractionTimestamp = System.currentTimeMillis();
            getClickCoordinateTracker$vungle_ads_release().trackCoordinate(motionEvent);
        }
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC5045xl0
    public boolean onWebRenderingProcessGone(WebView webView, Boolean bool) {
        boolean zBooleanValue = bool != null ? bool.booleanValue() : true;
        handleWebViewException$default(this, new Cl0("didCrash=" + zBooleanValue), zBooleanValue, null, 4, null);
        return true;
    }

    public final void prepare() {
        int i;
        String alertTitleText;
        String alertBodyText;
        String alertContinueButtonText;
        String alertCloseButtonText;
        int settings;
        boolean z = false;
        this.isDestroying.set(false);
        this.adWidget.linkWebView(this.vungleWebClient);
        C3573h1 adConfig = this.advertisement.getAdConfig();
        if (adConfig != null && (settings = adConfig.getSettings()) > 0) {
            this.backEnabled = (settings & 2) == 2;
        }
        this.heartbeatEnabled = this.advertisement.heartbeatEnabled();
        C3573h1 adConfig2 = this.advertisement.getAdConfig();
        Integer numValueOf = adConfig2 != null ? Integer.valueOf(adConfig2.getAdOrientation()) : null;
        int i2 = 4;
        if (numValueOf != null && numValueOf.intValue() == 0) {
            i = 7;
        } else {
            i = (numValueOf != null && numValueOf.intValue() == 1) ? 6 : 4;
        }
        this.adWidget.setOrientation(i);
        this.omTracker.start();
        this.vungleWebClient.setMraidDelegate(this);
        this.vungleWebClient.setErrorHandler(this);
        File assetDirectory = this.advertisement.getAssetDirectory();
        if (assetDirectory == null || !assetDirectory.exists()) {
            reportErrorAndCloseAd(new X1("adv dir not exists.").setLogEntry$vungle_ads_release(getLogEntry()).logError$vungle_ads_release());
            return;
        }
        if (!loadMraidAd(assetDirectory)) {
            reportErrorAndCloseAd(new X1("ad index html not exists.").setLogEntry$vungle_ads_release(getLogEntry()).logError$vungle_ads_release());
            return;
        }
        this.adStartTime = Long.valueOf(System.currentTimeMillis());
        InterfaceC5105yV interfaceC5105yV = this.presenterDelegate;
        this.userId = interfaceC5105yV != null ? ((C2954a00) interfaceC5105yV).getUserId() : null;
        InterfaceC5105yV interfaceC5105yV2 = this.presenterDelegate;
        if (interfaceC5105yV2 == null || (alertTitleText = ((C2954a00) interfaceC5105yV2).getAlertTitleText()) == null) {
            alertTitleText = "";
        }
        InterfaceC5105yV interfaceC5105yV3 = this.presenterDelegate;
        if (interfaceC5105yV3 == null || (alertBodyText = ((C2954a00) interfaceC5105yV3).getAlertBodyText()) == null) {
            alertBodyText = "";
        }
        InterfaceC5105yV interfaceC5105yV4 = this.presenterDelegate;
        if (interfaceC5105yV4 == null || (alertContinueButtonText = ((C2954a00) interfaceC5105yV4).getAlertContinueButtonText()) == null) {
            alertContinueButtonText = "";
        }
        InterfaceC5105yV interfaceC5105yV5 = this.presenterDelegate;
        if (interfaceC5105yV5 == null || (alertCloseButtonText = ((C2954a00) interfaceC5105yV5).getAlertCloseButtonText()) == null) {
            alertCloseButtonText = "";
        }
        this.advertisement.setIncentivizedText(alertTitleText, alertBodyText, alertContinueButtonText, alertCloseButtonText);
        C3457fi c3457fi = C3457fi.INSTANCE;
        if (c3457fi.getGDPRIsCountryDataProtected() && AbstractC2995aW.i("unknown", OV.INSTANCE.getConsentStatus())) {
            z = true;
        }
        this.vungleWebClient.setConsentStatus(z, c3457fi.getGDPRConsentTitle(), c3457fi.getGDPRConsentMessage(), c3457fi.getGDPRButtonAccept(), c3457fi.getGDPRButtonDeny());
        if (z) {
            OV.INSTANCE.updateGdprConsent("opted_out_by_timeout", "vungle_modal", "");
        }
        int showCloseDelay = this.advertisement.getShowCloseDelay(Boolean.valueOf(this.placement.isRewardedVideo()));
        if (showCloseDelay > 0) {
            getScheduler().schedule(new RunnableC3073bL(this, i2), showCloseDelay);
        } else {
            this.backEnabled = true;
        }
        C4099n1 c4099n1 = this.bus;
        if (c4099n1 != null) {
            c4099n1.onNext("start", null, this.placement.getReferenceId());
        }
        if (this.heartbeatEnabled) {
            getSuspendableTimer$vungle_ads_release().start();
        }
        if (this.advertisement.adLoadOptimizationEnabled()) {
            recordPlayAssetMetric();
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:100:0x025c, code lost:
    
        if (r2 == null) goto L102;
     */
    /* JADX WARN: Code restructure failed: missing block: B:101:0x025e, code lost:
    
        r2.onNext(gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.C4304pL.OPEN, "adClick", r23.placement.getReferenceId());
     */
    /* JADX WARN: Code restructure failed: missing block: B:102:0x0269, code lost:
    
        if (r0 == false) goto L106;
     */
    /* JADX WARN: Code restructure failed: missing block: B:103:0x026b, code lost:
    
        r0 = r23.bus;
     */
    /* JADX WARN: Code restructure failed: missing block: B:104:0x026d, code lost:
    
        if (r0 == null) goto L106;
     */
    /* JADX WARN: Code restructure failed: missing block: B:105:0x026f, code lost:
    
        r0.onNext(gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.C4304pL.OPEN, "adLeftApplication", r23.placement.getReferenceId());
     */
    /* JADX WARN: Code restructure failed: missing block: B:83:0x01f6, code lost:
    
        if (r24.equals(gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.C4304pL.OPEN) == false) goto L216;
     */
    /* JADX WARN: Code restructure failed: missing block: B:90:0x020b, code lost:
    
        if (r24.equals(gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.C4304pL.OPEN_NON_MRAID) == false) goto L216;
     */
    /* JADX WARN: Code restructure failed: missing block: B:92:0x020f, code lost:
    
        r0 = r23.advertisement.adUnit();
     */
    /* JADX WARN: Code restructure failed: missing block: B:93:0x0215, code lost:
    
        if (r0 == null) goto L95;
     */
    /* JADX WARN: Code restructure failed: missing block: B:94:0x0217, code lost:
    
        r14 = r0.getDeeplinkUrl();
     */
    /* JADX WARN: Code restructure failed: missing block: B:95:0x021b, code lost:
    
        r0 = gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.XF.INSTANCE.getContentStringValue(r25, "url");
     */
    /* JADX WARN: Code restructure failed: missing block: B:96:0x0225, code lost:
    
        if (shouldBlockAutoRedirect$vungle_ads_release() == false) goto L99;
     */
    /* JADX WARN: Code restructure failed: missing block: B:97:0x0227, code lost:
    
        r23.lastUserInteractionTimestamp = 0;
        gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.C2961a4.logMetric$vungle_ads_release$default(gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.C2961a4.INSTANCE, new gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.C3586h70(gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.B30.BANNER_AUTO_REDIRECT), getLogEntry(), (java.lang.String) null, 4, (java.lang.Object) null);
     */
    /* JADX WARN: Code restructure failed: missing block: B:99:0x0242, code lost:
    
        r23.lastUserInteractionTimestamp = 0;
        r2 = r23.adWidget.getContext();
        gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC2995aW.p(r2, "adWidget.context");
        r0 = gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.C4089mt.launch(r14, r0, r2, getLogEntry(), new gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.C3602hL(r14, r23));
        r2 = r23.bus;
     */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC4957wl0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean processCommand(java.lang.String r24, gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.FF r25) {
        /*
            Method dump skipped, instruction units count: 1426
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.C4304pL.processCommand(java.lang.String, gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.FF):boolean");
    }

    public final void setAdStartTime$vungle_ads_release(Long l) {
        this.adStartTime = l;
    }

    public final void setAdVisibility(boolean z) {
        this.vungleWebClient.setAdVisibility(z);
    }

    public final void setBackEnabled$vungle_ads_release(boolean z) {
        this.backEnabled = z;
    }

    public final void setBus(C4099n1 c4099n1) {
        this.bus = c4099n1;
    }

    public final void setEventListener(C4099n1 c4099n1) {
        this.bus = c4099n1;
    }

    public final void setHeartbeatEnabled$vungle_ads_release(boolean z) {
        this.heartbeatEnabled = z;
    }

    public final void setLastUserInteractionTimestamp$vungle_ads_release(long j) {
        this.lastUserInteractionTimestamp = j;
    }

    public final void setPresenterDelegate$vungle_ads_release(InterfaceC5105yV interfaceC5105yV) {
        this.presenterDelegate = interfaceC5105yV;
    }

    public final void setUserId$vungle_ads_release(String str) {
        this.userId = str;
    }

    public final void setVideoLength$vungle_ads_release(long j) {
        this.videoLength = j;
    }

    public final boolean shouldBlockAutoRedirect$vungle_ads_release() {
        C3457fi c3457fi = C3457fi.INSTANCE;
        if (c3457fi.allowAutoRedirects()) {
            return false;
        }
        if (this.placement.isBanner() || this.placement.isMREC() || this.placement.isInline()) {
            return this.lastUserInteractionTimestamp == 0 || System.currentTimeMillis() - this.lastUserInteractionTimestamp > c3457fi.afterClickDuration();
        }
        return false;
    }

    public final void start() {
        C4917wJ.Companion.d(TAG, "start()");
        this.adWidget.resumeWeb();
        setAdVisibility(true);
    }

    public final void stop() {
        C4917wJ.Companion.d(TAG, "stop()");
        this.adWidget.pauseWeb();
        setAdVisibility(false);
    }

    @VisibleForTesting
    public static /* synthetic */ void getAdStartTime$vungle_ads_release$annotations() {
    }

    @VisibleForTesting
    public static /* synthetic */ void getBackEnabled$vungle_ads_release$annotations() {
    }

    @VisibleForTesting
    public static /* synthetic */ void getBus$annotations() {
    }

    @VisibleForTesting
    public static /* synthetic */ void getClickCoordinateTracker$vungle_ads_release$annotations() {
    }

    @VisibleForTesting
    public static /* synthetic */ void getHeartbeatEnabled$vungle_ads_release$annotations() {
    }

    @VisibleForTesting
    public static /* synthetic */ void getLastUserInteractionTimestamp$vungle_ads_release$annotations() {
    }

    @VisibleForTesting
    public static /* synthetic */ void getSuspendableTimer$vungle_ads_release$annotations() {
    }

    @VisibleForTesting
    public static /* synthetic */ void getUserId$vungle_ads_release$annotations() {
    }

    @VisibleForTesting
    public static /* synthetic */ void getVideoLength$vungle_ads_release$annotations() {
    }

    @VisibleForTesting
    public static /* synthetic */ void getVungleApiClient$vungle_ads_release$annotations() {
    }

    @VisibleForTesting
    public static /* synthetic */ void isDestroying$vungle_ads_release$annotations() {
    }
}
