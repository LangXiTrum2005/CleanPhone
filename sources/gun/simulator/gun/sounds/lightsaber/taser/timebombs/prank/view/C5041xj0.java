package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import android.net.Uri;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.webkit.RenderProcessGoneDetail;
import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import androidx.annotation.VisibleForTesting;
import androidx.webkit.ProxyConfig;
import com.bytedance.sdk.component.embedapplog.BuildConfig;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.newreward.player.view.hybrid.util.MRAIDCommunicatorUtil;
import com.unity3d.services.core.device.reader.JsonStorageKeyNames;
import java.util.LinkedHashMap;
import java.util.concurrent.ExecutorService;

/* JADX INFO: renamed from: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.xj0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C5041xj0 extends WebViewClient implements InterfaceC5133yl0 {
    public static final C4865vj0 Companion = new C4865vj0(null);
    private static final String TAG = "VungleWebClient";
    private final C4980x2 advertisement;
    private boolean collectConsent;
    private InterfaceC5045xl0 errorHandler;
    private String gdprAccept;
    private String gdprBody;
    private String gdprDeny;
    private String gdprTitle;
    private Boolean isViewable;
    private WebView loadedWebView;
    private InterfaceC4957wl0 mraidDelegate;
    private final ExecutorService offloadExecutor;
    private final C4664tU placement;
    private final InterfaceC5016xU platform;
    private boolean ready;
    private final L60 signalManager;
    private Al0 webViewObserver;

    public C5041xj0(C4980x2 c4980x2, C4664tU c4664tU, ExecutorService executorService, L60 l60, InterfaceC5016xU interfaceC5016xU) {
        AbstractC2995aW.q(c4980x2, "advertisement");
        AbstractC2995aW.q(c4664tU, "placement");
        AbstractC2995aW.q(executorService, "offloadExecutor");
        this.advertisement = c4980x2;
        this.placement = c4664tU;
        this.offloadExecutor = executorService;
        this.signalManager = l60;
        this.platform = interfaceC5016xU;
    }

    private final void handleWebViewError(String str, String str2, boolean z) {
        String str3 = str2 + ' ' + str;
        InterfaceC5045xl0 interfaceC5045xl0 = this.errorHandler;
        if (interfaceC5045xl0 != null) {
            ((C4304pL) interfaceC5045xl0).onReceivedError(str3, z);
        }
    }

    private final boolean isCriticalAsset(String str) {
        if (str.length() > 0) {
            return this.advertisement.isCriticalAsset(str);
        }
        return false;
    }

    private final void runJavascriptOnWebView(WebView webView, String str) {
        if (webView != null) {
            try {
                if (!webView.isAttachedToWindow()) {
                    return;
                }
            } catch (Throwable th) {
                new C2657Or("Evaluate js failed " + th.getLocalizedMessage()).setLogEntry$vungle_ads_release(this.advertisement.getLogEntry$vungle_ads_release()).logErrorNoReturnValue$vungle_ads_release();
                return;
            }
        }
        C4917wJ.Companion.w(TAG, "mraid Injecting JS " + str);
        if (webView != null) {
            webView.evaluateJavascript(str, null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: shouldOverrideUrlLoading$lambda-6$lambda-1, reason: not valid java name */
    public static final void m283shouldOverrideUrlLoading$lambda6$lambda1(C5041xj0 c5041xj0, Handler handler, WebView webView) {
        AbstractC2995aW.q(c5041xj0, "this$0");
        AbstractC2995aW.q(handler, "$handler");
        handler.post(new RunnableC4746uO(c5041xj0, webView, "window.vungle.mraidBridge.notifyReadyEvent(" + c5041xj0.advertisement.createMRAIDArgs() + ')', 19));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: shouldOverrideUrlLoading$lambda-6$lambda-1$lambda-0, reason: not valid java name */
    public static final void m284shouldOverrideUrlLoading$lambda6$lambda1$lambda0(C5041xj0 c5041xj0, WebView webView, String str) {
        AbstractC2995aW.q(c5041xj0, "this$0");
        AbstractC2995aW.q(str, "$injectJs");
        c5041xj0.runJavascriptOnWebView(webView, str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: shouldOverrideUrlLoading$lambda-6$lambda-5$lambda-4, reason: not valid java name */
    public static final void m285shouldOverrideUrlLoading$lambda6$lambda5$lambda4(InterfaceC4957wl0 interfaceC4957wl0, String str, FF ff, Handler handler, C5041xj0 c5041xj0, WebView webView) {
        AbstractC2995aW.q(interfaceC4957wl0, "$it");
        AbstractC2995aW.q(str, "$command");
        AbstractC2995aW.q(ff, "$args");
        AbstractC2995aW.q(handler, "$handler");
        AbstractC2995aW.q(c5041xj0, "this$0");
        if (((C4304pL) interfaceC4957wl0).processCommand(str, ff)) {
            handler.post(new Ff0(18, c5041xj0, webView));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: shouldOverrideUrlLoading$lambda-6$lambda-5$lambda-4$lambda-3, reason: not valid java name */
    public static final void m286shouldOverrideUrlLoading$lambda6$lambda5$lambda4$lambda3(C5041xj0 c5041xj0, WebView webView) {
        AbstractC2995aW.q(c5041xj0, "this$0");
        c5041xj0.runJavascriptOnWebView(webView, "window.vungle.mraidBridge.notifyCommandComplete()");
    }

    public final boolean getCollectConsent$vungle_ads_release() {
        return this.collectConsent;
    }

    public final InterfaceC5045xl0 getErrorHandler$vungle_ads_release() {
        return this.errorHandler;
    }

    public final String getGdprAccept$vungle_ads_release() {
        return this.gdprAccept;
    }

    public final String getGdprBody$vungle_ads_release() {
        return this.gdprBody;
    }

    public final String getGdprDeny$vungle_ads_release() {
        return this.gdprDeny;
    }

    public final String getGdprTitle$vungle_ads_release() {
        return this.gdprTitle;
    }

    public final WebView getLoadedWebView$vungle_ads_release() {
        return this.loadedWebView;
    }

    public final InterfaceC4957wl0 getMraidDelegate$vungle_ads_release() {
        return this.mraidDelegate;
    }

    public final boolean getReady$vungle_ads_release() {
        return this.ready;
    }

    public final Al0 getWebViewObserver$vungle_ads_release() {
        return this.webViewObserver;
    }

    public final Boolean isViewable$vungle_ads_release() {
        return this.isViewable;
    }

    public final void notifyDiskAvailableSize(long j) {
        WebView webView = this.loadedWebView;
        if (webView != null) {
            runJavascriptOnWebView(webView, "window.vungle.mraidBridgeExt.notifyAvailableDiskSpace(" + j + ')');
        }
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC5133yl0
    public void notifyPropertiesChange(boolean z) {
        WebView webView = this.loadedWebView;
        if (webView != null) {
            C4165nl c4165nl = new C4165nl(3);
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            FF ff = new FF(linkedHashMap);
            LinkedHashMap linkedHashMap2 = new LinkedHashMap();
            FF ff2 = new FF(linkedHashMap2);
            C4165nl c4165nl2 = new C4165nl(3);
            Boolean bool = Boolean.FALSE;
            WD.M(c4165nl2, "sms", bool);
            WD.M(c4165nl2, "tel", bool);
            WD.M(c4165nl2, "calendar", bool);
            WD.M(c4165nl2, "storePicture", bool);
            WD.M(c4165nl2, "inlineVideo", bool);
            FF ffA = c4165nl2.a();
            c4165nl.b("maxSize", ff);
            c4165nl.b("screenSize", ff);
            c4165nl.b("defaultPosition", ff2);
            c4165nl.b("currentPosition", ff2);
            c4165nl.b("supports", ffA);
            WD.N(c4165nl, MRAIDCommunicatorUtil.KEY_PLACEMENTTYPE, this.advertisement.templateType());
            Boolean bool2 = this.isViewable;
            if (bool2 != null) {
                WD.M(c4165nl, "isViewable", bool2);
            }
            WD.N(c4165nl, com.umeng.analytics.pro.bc.x, "android");
            WD.N(c4165nl, "osVersion", String.valueOf(Build.VERSION.SDK_INT));
            WD.M(c4165nl, "incentivized", Boolean.valueOf(this.placement.isRewardedVideo()));
            WD.N(c4165nl, "version", BuildConfig.VERSION_NAME);
            InterfaceC5016xU interfaceC5016xU = this.platform;
            if (interfaceC5016xU != null) {
                WD.M(c4165nl, "isSilent", Boolean.valueOf(((C5160z4) interfaceC5016xU).isSilentModeEnabled()));
            }
            if (this.collectConsent) {
                WD.M(c4165nl, "consentRequired", Boolean.TRUE);
                WD.N(c4165nl, "consentTitleText", this.gdprTitle);
                WD.N(c4165nl, "consentBodyText", this.gdprBody);
                WD.N(c4165nl, "consentAcceptButtonText", this.gdprAccept);
                WD.N(c4165nl, "consentDenyButtonText", this.gdprDeny);
            } else {
                WD.M(c4165nl, "consentRequired", bool);
            }
            if (!C3457fi.INSTANCE.signalsDisabled()) {
                L60 l60 = this.signalManager;
                String uuid = l60 != null ? l60.getUuid() : null;
                if (uuid != null && uuid.length() != 0) {
                    L60 l61 = this.signalManager;
                    WD.N(c4165nl, JsonStorageKeyNames.SESSION_ID_KEY, l61 != null ? l61.getUuid() : null);
                }
            }
            WD.N(c4165nl, "sdkVersion", "7.4.3");
            runJavascriptOnWebView(webView, "window.vungle.mraidBridge.notifyPropertiesChange(" + c4165nl.a() + ',' + z + ')');
        }
    }

    public final void notifySilentModeChange(boolean z) {
        WebView webView = this.loadedWebView;
        if (webView != null) {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            runJavascriptOnWebView(webView, "window.vungle.mraidBridge.notifyPropertiesChange(" + new FF(linkedHashMap) + ')');
        }
    }

    @Override // android.webkit.WebViewClient
    public void onPageFinished(WebView webView, String str) {
        super.onPageFinished(webView, str);
        if (webView == null) {
            return;
        }
        this.loadedWebView = webView;
        webView.setVisibility(0);
        notifyPropertiesChange(true);
        if (Build.VERSION.SDK_INT >= 29) {
            webView.setWebViewRenderProcessClient(new C4953wj0(this.errorHandler));
        }
        Al0 al0 = this.webViewObserver;
        if (al0 != null) {
            ((C3345eS) al0).onPageFinished(webView);
        }
    }

    @Override // android.webkit.WebViewClient
    public void onReceivedError(WebView webView, int i, String str, String str2) {
        AbstractC2995aW.q(str, "description");
        AbstractC2995aW.q(str2, "failingUrl");
        super.onReceivedError(webView, i, str, str2);
        if (Build.VERSION.SDK_INT < 23) {
            boolean zIsCriticalAsset = isCriticalAsset(str2);
            C4917wJ.Companion.e(TAG, AbstractC5044xl.m("Error desc ", str, " for URL ", str2));
            handleWebViewError(str, str2, zIsCriticalAsset);
        }
    }

    @Override // android.webkit.WebViewClient
    public void onReceivedHttpError(WebView webView, WebResourceRequest webResourceRequest, WebResourceResponse webResourceResponse) {
        super.onReceivedHttpError(webView, webResourceRequest, webResourceResponse);
        String strValueOf = String.valueOf(webResourceResponse != null ? Integer.valueOf(webResourceResponse.getStatusCode()) : null);
        String strValueOf2 = String.valueOf(webResourceRequest != null ? webResourceRequest.getUrl() : null);
        boolean z = false;
        boolean z2 = webResourceRequest != null && webResourceRequest.isForMainFrame();
        C4917wJ.Companion.e(TAG, "Http Error desc " + strValueOf + ' ' + z2 + " for URL " + strValueOf2);
        if (isCriticalAsset(strValueOf2) && z2) {
            z = true;
        }
        handleWebViewError(strValueOf, strValueOf2, z);
    }

    @Override // android.webkit.WebViewClient
    public boolean onRenderProcessGone(WebView webView, RenderProcessGoneDetail renderProcessGoneDetail) {
        this.loadedWebView = null;
        if (Build.VERSION.SDK_INT < 26) {
            C4829vJ c4829vJ = C4917wJ.Companion;
            StringBuilder sb = new StringBuilder("onRenderProcessGone url: ");
            sb.append(webView != null ? webView.getUrl() : null);
            c4829vJ.w(TAG, sb.toString());
            InterfaceC5045xl0 interfaceC5045xl0 = this.errorHandler;
            if (interfaceC5045xl0 != null) {
                return ((C4304pL) interfaceC5045xl0).onWebRenderingProcessGone(webView, Boolean.TRUE);
            }
            return true;
        }
        C4829vJ c4829vJ2 = C4917wJ.Companion;
        StringBuilder sb2 = new StringBuilder("onRenderProcessGone url: ");
        sb2.append(webView != null ? webView.getUrl() : null);
        sb2.append(", did crash: ");
        sb2.append(renderProcessGoneDetail != null ? Boolean.valueOf(renderProcessGoneDetail.didCrash()) : null);
        c4829vJ2.w(TAG, sb2.toString());
        InterfaceC5045xl0 interfaceC5045xl1 = this.errorHandler;
        if (interfaceC5045xl1 != null) {
            return ((C4304pL) interfaceC5045xl1).onWebRenderingProcessGone(webView, renderProcessGoneDetail != null ? Boolean.valueOf(renderProcessGoneDetail.didCrash()) : null);
        }
        return super.onRenderProcessGone(webView, renderProcessGoneDetail);
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC5133yl0
    public void setAdVisibility(boolean z) {
        this.isViewable = Boolean.valueOf(z);
        notifyPropertiesChange(false);
    }

    public final void setCollectConsent$vungle_ads_release(boolean z) {
        this.collectConsent = z;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC5133yl0
    public void setConsentStatus(boolean z, String str, String str2, String str3, String str4) {
        this.collectConsent = z;
        this.gdprTitle = str;
        this.gdprBody = str2;
        this.gdprAccept = str3;
        this.gdprDeny = str4;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC5133yl0
    public void setErrorHandler(InterfaceC5045xl0 interfaceC5045xl0) {
        AbstractC2995aW.q(interfaceC5045xl0, "errorHandler");
        this.errorHandler = interfaceC5045xl0;
    }

    public final void setErrorHandler$vungle_ads_release(InterfaceC5045xl0 interfaceC5045xl0) {
        this.errorHandler = interfaceC5045xl0;
    }

    public final void setGdprAccept$vungle_ads_release(String str) {
        this.gdprAccept = str;
    }

    public final void setGdprBody$vungle_ads_release(String str) {
        this.gdprBody = str;
    }

    public final void setGdprDeny$vungle_ads_release(String str) {
        this.gdprDeny = str;
    }

    public final void setGdprTitle$vungle_ads_release(String str) {
        this.gdprTitle = str;
    }

    public final void setLoadedWebView$vungle_ads_release(WebView webView) {
        this.loadedWebView = webView;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC5133yl0
    public void setMraidDelegate(InterfaceC4957wl0 interfaceC4957wl0) {
        this.mraidDelegate = interfaceC4957wl0;
    }

    public final void setMraidDelegate$vungle_ads_release(InterfaceC4957wl0 interfaceC4957wl0) {
        this.mraidDelegate = interfaceC4957wl0;
    }

    public final void setReady$vungle_ads_release(boolean z) {
        this.ready = z;
    }

    public final void setViewable$vungle_ads_release(Boolean bool) {
        this.isViewable = bool;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC5133yl0
    public void setWebViewObserver(Al0 al0) {
        this.webViewObserver = al0;
    }

    public final void setWebViewObserver$vungle_ads_release(Al0 al0) {
        this.webViewObserver = al0;
    }

    @Override // android.webkit.WebViewClient
    public boolean shouldOverrideUrlLoading(WebView webView, String str) {
        C4829vJ c4829vJ = C4917wJ.Companion;
        c4829vJ.d(TAG, "MRAID Command " + str);
        if (str == null || str.length() == 0) {
            c4829vJ.e(TAG, "Invalid URL ");
            return false;
        }
        Uri uri = Uri.parse(str);
        if (uri == null || uri.getScheme() == null) {
            return false;
        }
        String scheme = uri.getScheme();
        if (AbstractC2995aW.i(scheme, CampaignEx.JSON_KEY_MRAID)) {
            String host = uri.getHost();
            if (host != null) {
                if (!AbstractC2995aW.i("propertiesChangeCompleted", host)) {
                    InterfaceC4957wl0 interfaceC4957wl0 = this.mraidDelegate;
                    if (interfaceC4957wl0 != null) {
                        LinkedHashMap linkedHashMap = new LinkedHashMap();
                        for (String str2 : uri.getQueryParameterNames()) {
                            AbstractC2995aW.p(str2, "param");
                        }
                        this.offloadExecutor.submit(new RunnableC4777uj0(interfaceC4957wl0, host, new FF(linkedHashMap), new Handler(Looper.getMainLooper()), this, webView, 0));
                    }
                } else if (!this.ready) {
                    this.ready = true;
                    this.offloadExecutor.submit(new RunnableC4746uO(this, new Handler(Looper.getMainLooper()), webView, 20));
                }
                return true;
            }
        } else if (AbstractC3089ba0.o0(ProxyConfig.MATCH_HTTP, scheme) || AbstractC3089ba0.o0("https", scheme)) {
            c4829vJ.d(TAG, "Open URL".concat(str));
            InterfaceC4957wl0 interfaceC4957wl1 = this.mraidDelegate;
            if (interfaceC4957wl1 != null) {
                LinkedHashMap linkedHashMap2 = new LinkedHashMap();
                ((C4304pL) interfaceC4957wl1).processCommand("openNonMraid", new FF(linkedHashMap2));
            }
            return true;
        }
        return false;
    }

    public /* synthetic */ C5041xj0(C4980x2 c4980x2, C4664tU c4664tU, ExecutorService executorService, L60 l60, InterfaceC5016xU interfaceC5016xU, int i, AbstractC2471Hm abstractC2471Hm) {
        this(c4980x2, c4664tU, executorService, (i & 8) != 0 ? null : l60, (i & 16) != 0 ? null : interfaceC5016xU);
    }

    @Override // android.webkit.WebViewClient
    public void onReceivedError(WebView webView, WebResourceRequest webResourceRequest, WebResourceError webResourceError) {
        super.onReceivedError(webView, webResourceRequest, webResourceError);
        if (Build.VERSION.SDK_INT >= 23) {
            String strValueOf = String.valueOf(webResourceError != null ? webResourceError.getDescription() : null);
            String strValueOf2 = String.valueOf(webResourceRequest != null ? webResourceRequest.getUrl() : null);
            boolean z = false;
            boolean z2 = webResourceRequest != null && webResourceRequest.isForMainFrame();
            C4917wJ.Companion.e(TAG, "Error desc " + strValueOf + ' ' + z2 + " for URL " + strValueOf2);
            if (isCriticalAsset(strValueOf2) && z2) {
                z = true;
            }
            handleWebViewError(strValueOf, strValueOf2, z);
        }
    }

    @VisibleForTesting
    public static /* synthetic */ void getCollectConsent$vungle_ads_release$annotations() {
    }

    @VisibleForTesting
    public static /* synthetic */ void getErrorHandler$vungle_ads_release$annotations() {
    }

    @VisibleForTesting
    public static /* synthetic */ void getGdprAccept$vungle_ads_release$annotations() {
    }

    @VisibleForTesting
    public static /* synthetic */ void getGdprBody$vungle_ads_release$annotations() {
    }

    @VisibleForTesting
    public static /* synthetic */ void getGdprDeny$vungle_ads_release$annotations() {
    }

    @VisibleForTesting
    public static /* synthetic */ void getGdprTitle$vungle_ads_release$annotations() {
    }

    @VisibleForTesting
    public static /* synthetic */ void getLoadedWebView$vungle_ads_release$annotations() {
    }

    @VisibleForTesting
    public static /* synthetic */ void getMraidDelegate$vungle_ads_release$annotations() {
    }

    @VisibleForTesting
    public static /* synthetic */ void getReady$vungle_ads_release$annotations() {
    }

    @VisibleForTesting
    public static /* synthetic */ void getWebViewObserver$vungle_ads_release$annotations() {
    }

    @VisibleForTesting
    public static /* synthetic */ void isViewable$vungle_ads_release$annotations() {
    }
}
