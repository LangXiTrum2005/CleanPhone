package com.vungle.ads.internal.ui;

import A.K;
import A.r0;
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
import android.webkit.WebViewRenderProcess;
import android.webkit.WebViewRenderProcessClient;
import com.applovin.impl.Z;
import com.bytedance.sdk.component.pglcrypt.PglCryptUtils;
import com.mbridge.msdk.foundation.download.Command;
import com.p004ironsource.d9;
import com.p004ironsource.ne;
import com.startapp.simple.bloomfilter.codec.IOUtils;
import com.startapp.simple.bloomfilter.parsing.TokenBuilder;
import com.unity3d.services.core.network.model.HttpRequest;
import com.vungle.ads.AnalyticsClient;
import com.vungle.ads.BuildConfig;
import com.vungle.ads.EvaluateJsError;
import com.vungle.ads.OneShotSingleValueMetric;
import com.vungle.ads.OutOfMemory;
import com.vungle.ads.SingleValueMetric;
import com.vungle.ads.internal.model.AdAsset;
import com.vungle.ads.internal.model.AdPayload;
import com.vungle.ads.internal.model.Placement;
import com.vungle.ads.internal.omsdk.WebViewObserver;
import com.vungle.ads.internal.platform.Platform;
import com.vungle.ads.internal.presenter.PreloadDelegate;
import com.vungle.ads.internal.protos.Sdk;
import com.vungle.ads.internal.ui.view.WebViewAPI;
import com.vungle.ads.internal.util.Logger;
import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.ExecutorService;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import kotlinx.serialization.json.JsonElementBuildersKt;
import kotlinx.serialization.json.JsonObject;
import kotlinx.serialization.json.JsonObjectBuilder;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000¬\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0012\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0015\u0018\u0000 \u008e\u00012\u00020\u00012\u00020\u0002:\u0004\u008e\u0001\u008f\u0001BA\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000e¢\u0006\u0002\u0010\u000fJ \u0010\\\u001a\u00020]2\u0006\u0010^\u001a\u00020 2\u0006\u0010_\u001a\u00020 2\u0006\u0010`\u001a\u00020\u0011H\u0002J\u0010\u0010a\u001a\u00020\u00112\u0006\u0010_\u001a\u00020 H\u0002J\u0016\u0010b\u001a\u00020]2\u0006\u0010c\u001a\u00020\u000e2\u0006\u0010d\u001a\u00020\u000eJ\u0010\u0010e\u001a\u00020]2\u0006\u0010f\u001a\u00020\u0011H\u0016J\u000e\u0010g\u001a\u00020]2\u0006\u0010h\u001a\u00020\u0011J\u001c\u0010i\u001a\u00020]2\b\u0010j\u001a\u0004\u0018\u00010?2\b\u0010_\u001a\u0004\u0018\u00010 H\u0016J&\u0010k\u001a\u00020]2\b\u0010j\u001a\u0004\u0018\u00010?2\b\u0010l\u001a\u0004\u0018\u00010m2\b\u0010n\u001a\u0004\u0018\u00010oH\u0016J*\u0010k\u001a\u00020]2\b\u0010j\u001a\u0004\u0018\u00010?2\u0006\u0010p\u001a\u00020q2\u0006\u0010r\u001a\u00020 2\u0006\u0010s\u001a\u00020 H\u0017J&\u0010t\u001a\u00020]2\b\u0010j\u001a\u0004\u0018\u00010?2\b\u0010l\u001a\u0004\u0018\u00010m2\b\u0010u\u001a\u0004\u0018\u00010vH\u0016J\u001c\u0010w\u001a\u00020\u00112\b\u0010j\u001a\u0004\u0018\u00010?2\b\u0010x\u001a\u0004\u0018\u00010yH\u0016J-\u0010z\u001a\u0010\u0012\u0004\u0012\u00020\u000e\u0012\u0006\u0012\u0004\u0018\u00010\u000e0{2\b\u0010|\u001a\u0004\u0018\u00010 2\u0006\u0010}\u001a\u00020\u000eH\u0000¢\u0006\u0002\b~J\u001c\u0010\u007f\u001a\u00020]2\t\u0010\u0080\u0001\u001a\u0004\u0018\u00010?2\u0007\u0010\u0081\u0001\u001a\u00020 H\u0002J\u0011\u0010\u0082\u0001\u001a\u00020]2\u0006\u00106\u001a\u00020\u0011H\u0016J>\u0010\u0083\u0001\u001a\u00020]2\u0007\u0010\u0084\u0001\u001a\u00020\u00112\t\u0010\u0085\u0001\u001a\u0004\u0018\u00010 2\t\u0010\u0086\u0001\u001a\u0004\u0018\u00010 2\t\u0010\u0087\u0001\u001a\u0004\u0018\u00010 2\t\u0010\u0088\u0001\u001a\u0004\u0018\u00010 H\u0016J\u0011\u0010\u0089\u0001\u001a\u00020]2\u0006\u0010\u0018\u001a\u00020\u0019H\u0016J\u0013\u0010\u008a\u0001\u001a\u00020]2\b\u0010E\u001a\u0004\u0018\u00010FH\u0016J\u0013\u0010\u008b\u0001\u001a\u00020]2\b\u0010U\u001a\u0004\u0018\u00010VH\u0016J\u001f\u0010\u008c\u0001\u001a\u0004\u0018\u00010v2\b\u0010j\u001a\u0004\u0018\u00010?2\b\u0010l\u001a\u0004\u0018\u00010mH\u0016J\u001d\u0010\u008d\u0001\u001a\u00020\u00112\b\u0010j\u001a\u0004\u0018\u00010?2\b\u0010_\u001a\u0004\u0018\u00010 H\u0017R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R$\u0010\u0010\u001a\u00020\u00118\u0000@\u0000X\u0081\u000e¢\u0006\u0014\n\u0000\u0012\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R\u0010\u0010\u000b\u001a\u0004\u0018\u00010\fX\u0082\u0004¢\u0006\u0002\n\u0000R&\u0010\u0018\u001a\u0004\u0018\u00010\u00198\u0000@\u0000X\u0081\u000e¢\u0006\u0014\n\u0000\u0012\u0004\b\u001a\u0010\u0013\u001a\u0004\b\u001b\u0010\u001c\"\u0004\b\u001d\u0010\u001eR&\u0010\u001f\u001a\u0004\u0018\u00010 8\u0000@\u0000X\u0081\u000e¢\u0006\u0014\n\u0000\u0012\u0004\b!\u0010\u0013\u001a\u0004\b\"\u0010#\"\u0004\b$\u0010%R&\u0010&\u001a\u0004\u0018\u00010 8\u0000@\u0000X\u0081\u000e¢\u0006\u0014\n\u0000\u0012\u0004\b'\u0010\u0013\u001a\u0004\b(\u0010#\"\u0004\b)\u0010%R&\u0010*\u001a\u0004\u0018\u00010 8\u0000@\u0000X\u0081\u000e¢\u0006\u0014\n\u0000\u0012\u0004\b+\u0010\u0013\u001a\u0004\b,\u0010#\"\u0004\b-\u0010%R&\u0010.\u001a\u0004\u0018\u00010 8\u0000@\u0000X\u0081\u000e¢\u0006\u0014\n\u0000\u0012\u0004\b/\u0010\u0013\u001a\u0004\b0\u0010#\"\u0004\b1\u0010%R\u0014\u00102\u001a\u000203X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b4\u00105R(\u00106\u001a\u0004\u0018\u00010\u00118\u0000@\u0000X\u0081\u000e¢\u0006\u0016\n\u0002\u0010<\u0012\u0004\b7\u0010\u0013\u001a\u0004\b8\u00109\"\u0004\b:\u0010;R\u0012\u0010\r\u001a\u0004\u0018\u00010\u000eX\u0082\u0004¢\u0006\u0004\n\u0002\u0010=R&\u0010>\u001a\u0004\u0018\u00010?8\u0000@\u0000X\u0081\u000e¢\u0006\u0014\n\u0000\u0012\u0004\b@\u0010\u0013\u001a\u0004\bA\u0010B\"\u0004\bC\u0010DR&\u0010E\u001a\u0004\u0018\u00010F8\u0000@\u0000X\u0081\u000e¢\u0006\u0014\n\u0000\u0012\u0004\bG\u0010\u0013\u001a\u0004\bH\u0010I\"\u0004\bJ\u0010KR\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010L\u001a\u00020MX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010N\u001a\u00020MX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\t\u001a\u0004\u0018\u00010\nX\u0082\u0004¢\u0006\u0002\n\u0000R$\u0010O\u001a\u00020\u00118\u0000@\u0000X\u0081\u000e¢\u0006\u0014\n\u0000\u0012\u0004\bP\u0010\u0013\u001a\u0004\bQ\u0010\u0015\"\u0004\bR\u0010\u0017R\u000e\u0010S\u001a\u00020TX\u0082\u0004¢\u0006\u0002\n\u0000R&\u0010U\u001a\u0004\u0018\u00010V8\u0000@\u0000X\u0081\u000e¢\u0006\u0014\n\u0000\u0012\u0004\bW\u0010\u0013\u001a\u0004\bX\u0010Y\"\u0004\bZ\u0010[¨\u0006\u0090\u0001"}, d2 = {"Lcom/vungle/ads/internal/ui/VungleWebClient;", "Landroid/webkit/WebViewClient;", "Lcom/vungle/ads/internal/ui/view/WebViewAPI;", "advertisement", "Lcom/vungle/ads/internal/model/AdPayload;", "placement", "Lcom/vungle/ads/internal/model/Placement;", "offloadExecutor", "Ljava/util/concurrent/ExecutorService;", "platform", "Lcom/vungle/ads/internal/platform/Platform;", "delegate", "Lcom/vungle/ads/internal/presenter/PreloadDelegate;", "loadDuration", "", "(Lcom/vungle/ads/internal/model/AdPayload;Lcom/vungle/ads/internal/model/Placement;Ljava/util/concurrent/ExecutorService;Lcom/vungle/ads/internal/platform/Platform;Lcom/vungle/ads/internal/presenter/PreloadDelegate;Ljava/lang/Long;)V", "collectConsent", "", "getCollectConsent$vungle_ads_release$annotations", "()V", "getCollectConsent$vungle_ads_release", "()Z", "setCollectConsent$vungle_ads_release", "(Z)V", "errorHandler", "Lcom/vungle/ads/internal/ui/view/WebViewAPI$WebClientErrorHandler;", "getErrorHandler$vungle_ads_release$annotations", "getErrorHandler$vungle_ads_release", "()Lcom/vungle/ads/internal/ui/view/WebViewAPI$WebClientErrorHandler;", "setErrorHandler$vungle_ads_release", "(Lcom/vungle/ads/internal/ui/view/WebViewAPI$WebClientErrorHandler;)V", "gdprAccept", "", "getGdprAccept$vungle_ads_release$annotations", "getGdprAccept$vungle_ads_release", "()Ljava/lang/String;", "setGdprAccept$vungle_ads_release", "(Ljava/lang/String;)V", "gdprBody", "getGdprBody$vungle_ads_release$annotations", "getGdprBody$vungle_ads_release", "setGdprBody$vungle_ads_release", "gdprDeny", "getGdprDeny$vungle_ads_release$annotations", "getGdprDeny$vungle_ads_release", "setGdprDeny$vungle_ads_release", "gdprTitle", "getGdprTitle$vungle_ads_release$annotations", "getGdprTitle$vungle_ads_release", "setGdprTitle$vungle_ads_release", "handler", "Landroid/os/Handler;", "getHandler$vungle_ads_release", "()Landroid/os/Handler;", d9.h.o, "isViewable$vungle_ads_release$annotations", "isViewable$vungle_ads_release", "()Ljava/lang/Boolean;", "setViewable$vungle_ads_release", "(Ljava/lang/Boolean;)V", "Ljava/lang/Boolean;", "Ljava/lang/Long;", "loadedWebView", "Landroid/webkit/WebView;", "getLoadedWebView$vungle_ads_release$annotations", "getLoadedWebView$vungle_ads_release", "()Landroid/webkit/WebView;", "setLoadedWebView$vungle_ads_release", "(Landroid/webkit/WebView;)V", "mraidDelegate", "Lcom/vungle/ads/internal/ui/view/WebViewAPI$MraidDelegate;", "getMraidDelegate$vungle_ads_release$annotations", "getMraidDelegate$vungle_ads_release", "()Lcom/vungle/ads/internal/ui/view/WebViewAPI$MraidDelegate;", "setMraidDelegate$vungle_ads_release", "(Lcom/vungle/ads/internal/ui/view/WebViewAPI$MraidDelegate;)V", "partialDownloadErrorMetric", "Lcom/vungle/ads/OneShotSingleValueMetric;", "partialDownloadMetric", d9.h.s, "getReady$vungle_ads_release$annotations", "getReady$vungle_ads_release", "setReady$vungle_ads_release", "skippedUrlMetric", "Lcom/vungle/ads/SingleValueMetric;", "webViewObserver", "Lcom/vungle/ads/internal/omsdk/WebViewObserver;", "getWebViewObserver$vungle_ads_release$annotations", "getWebViewObserver$vungle_ads_release", "()Lcom/vungle/ads/internal/omsdk/WebViewObserver;", "setWebViewObserver$vungle_ads_release", "(Lcom/vungle/ads/internal/omsdk/WebViewObserver;)V", "handleWebViewError", "", "errorMsg", "url", "didCrash", "isCriticalAsset", "notifyDiskAvailableSize", "availableDiskSize", "appFolderSize", "notifyPropertiesChange", "skipCmdQueue", "notifySilentModeChange", "silentModeEnabled", "onPageFinished", "view", "onReceivedError", "request", "Landroid/webkit/WebResourceRequest;", "error", "Landroid/webkit/WebResourceError;", "errorCode", "", "description", "failingUrl", "onReceivedHttpError", "errorResponse", "Landroid/webkit/WebResourceResponse;", "onRenderProcessGone", "detail", "Landroid/webkit/RenderProcessGoneDetail;", "parseRange", "Lkotlin/Pair;", "rangeHeader", "contentLength", "parseRange$vungle_ads_release", "runJavascriptOnWebView", "webView", "injectJs", "setAdVisibility", "setConsentStatus", "collectedConsent", "title", PglCryptUtils.KEY_MESSAGE, "accept", com.smartdigimkt.w7.a.m0, "setErrorHandler", "setMraidDelegate", "setWebViewObserver", "shouldInterceptRequest", "shouldOverrideUrlLoading", "Companion", "VungleWebViewRenderProcessClient", "vungle-ads_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
public final class VungleWebClient extends WebViewClient implements WebViewAPI {
    private static final String COMMAND_COMPLETE = "window.vungle.mraidBridge.notifyCommandComplete()";
    private static final String TAG = "VungleWebClient";
    private final AdPayload advertisement;
    private boolean collectConsent;
    private final PreloadDelegate delegate;
    private WebViewAPI.WebClientErrorHandler errorHandler;
    private String gdprAccept;
    private String gdprBody;
    private String gdprDeny;
    private String gdprTitle;
    private final Handler handler;
    private Boolean isViewable;
    private final Long loadDuration;
    private WebView loadedWebView;
    private WebViewAPI.MraidDelegate mraidDelegate;
    private final ExecutorService offloadExecutor;
    private final OneShotSingleValueMetric partialDownloadErrorMetric;
    private final OneShotSingleValueMetric partialDownloadMetric;
    private final Placement placement;
    private final Platform platform;
    private boolean ready;
    private final SingleValueMetric skippedUrlMetric;
    private WebViewObserver webViewObserver;

    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0001\u0018\u00002\u00020\u0001B\u000f\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0004J\u001a\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\b\u0010\t\u001a\u0004\u0018\u00010\nH\u0016J\u001a\u0010\u000b\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\b\u0010\t\u001a\u0004\u0018\u00010\nH\u0016R\u0010\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\f"}, d2 = {"Lcom/vungle/ads/internal/ui/VungleWebClient$VungleWebViewRenderProcessClient;", "Landroid/webkit/WebViewRenderProcessClient;", "errorHandler", "Lcom/vungle/ads/internal/ui/view/WebViewAPI$WebClientErrorHandler;", "(Lcom/vungle/ads/internal/ui/view/WebViewAPI$WebClientErrorHandler;)V", "onRenderProcessResponsive", "", "webView", "Landroid/webkit/WebView;", "webViewRenderProcess", "Landroid/webkit/WebViewRenderProcess;", "onRenderProcessUnresponsive", "vungle-ads_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
    public static final class VungleWebViewRenderProcessClient extends WebViewRenderProcessClient {
        private WebViewAPI.WebClientErrorHandler errorHandler;

        public VungleWebViewRenderProcessClient(WebViewAPI.WebClientErrorHandler webClientErrorHandler) {
            this.errorHandler = webClientErrorHandler;
        }

        public void onRenderProcessResponsive(WebView webView, WebViewRenderProcess webViewRenderProcess) {
            Intrinsics.f(webView, "webView");
        }

        public void onRenderProcessUnresponsive(WebView webView, WebViewRenderProcess webViewRenderProcess) {
            Intrinsics.f(webView, "webView");
            Logger.Companion companion = Logger.INSTANCE;
            StringBuilder sb = new StringBuilder("onRenderProcessUnresponsive(Title = ");
            sb.append(webView.getTitle());
            sb.append(", URL = ");
            sb.append(webView.getOriginalUrl());
            sb.append(", (webViewRenderProcess != null) = ");
            sb.append(webViewRenderProcess != null);
            companion.w(VungleWebClient.TAG, sb.toString());
            WebViewAPI.WebClientErrorHandler webClientErrorHandler = this.errorHandler;
            if (webClientErrorHandler != null) {
                webClientErrorHandler.onRenderProcessUnresponsive(webView, webViewRenderProcess);
            }
        }
    }

    public /* synthetic */ VungleWebClient(AdPayload adPayload, Placement placement, ExecutorService executorService, Platform platform, PreloadDelegate preloadDelegate, Long l2, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(adPayload, placement, executorService, (i2 & 8) != 0 ? null : platform, (i2 & 16) != 0 ? null : preloadDelegate, (i2 & 32) != 0 ? null : l2);
    }

    public static /* synthetic */ void getCollectConsent$vungle_ads_release$annotations() {
    }

    public static /* synthetic */ void getErrorHandler$vungle_ads_release$annotations() {
    }

    public static /* synthetic */ void getGdprAccept$vungle_ads_release$annotations() {
    }

    public static /* synthetic */ void getGdprBody$vungle_ads_release$annotations() {
    }

    public static /* synthetic */ void getGdprDeny$vungle_ads_release$annotations() {
    }

    public static /* synthetic */ void getGdprTitle$vungle_ads_release$annotations() {
    }

    public static /* synthetic */ void getLoadedWebView$vungle_ads_release$annotations() {
    }

    public static /* synthetic */ void getMraidDelegate$vungle_ads_release$annotations() {
    }

    public static /* synthetic */ void getReady$vungle_ads_release$annotations() {
    }

    public static /* synthetic */ void getWebViewObserver$vungle_ads_release$annotations() {
    }

    private final void handleWebViewError(String errorMsg, String url, boolean didCrash) {
        String str = url + ' ' + errorMsg;
        WebViewAPI.WebClientErrorHandler webClientErrorHandler = this.errorHandler;
        if (webClientErrorHandler != null) {
            webClientErrorHandler.onReceivedError(str, didCrash);
        }
    }

    private final boolean isCriticalAsset(String url) {
        if (url.length() > 0) {
            return this.advertisement.isCriticalAsset(url);
        }
        return false;
    }

    public static /* synthetic */ void isViewable$vungle_ads_release$annotations() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: notifyPropertiesChange$lambda-25, reason: not valid java name */
    public static final void m3259notifyPropertiesChange$lambda25(boolean z2, VungleWebClient this$0) {
        Intrinsics.f(this$0, "this$0");
        JsonObjectBuilder jsonObjectBuilder = new JsonObjectBuilder();
        JsonElementBuildersKt.put(jsonObjectBuilder, "placementType", this$0.advertisement.templateType());
        Boolean bool = this$0.isViewable;
        if (bool != null) {
            JsonElementBuildersKt.put(jsonObjectBuilder, d9.h.o, bool);
        }
        JsonElementBuildersKt.put(jsonObjectBuilder, ne.f26256E, "android");
        JsonElementBuildersKt.put(jsonObjectBuilder, "osVersion", String.valueOf(Build.VERSION.SDK_INT));
        JsonElementBuildersKt.put(jsonObjectBuilder, "incentivized", Boolean.valueOf(this$0.placement.isRewardedVideo()));
        Platform platform = this$0.platform;
        if (platform != null) {
            JsonElementBuildersKt.put(jsonObjectBuilder, "isSilent", Boolean.valueOf(platform.isSilentModeEnabled()));
        }
        Long l2 = this$0.loadDuration;
        if (l2 != null) {
            JsonElementBuildersKt.put(jsonObjectBuilder, "timeLoaded", l2);
        }
        if (this$0.collectConsent) {
            JsonElementBuildersKt.put(jsonObjectBuilder, "consentRequired", Boolean.TRUE);
            JsonElementBuildersKt.put(jsonObjectBuilder, "consentTitleText", this$0.gdprTitle);
            JsonElementBuildersKt.put(jsonObjectBuilder, "consentBodyText", this$0.gdprBody);
            JsonElementBuildersKt.put(jsonObjectBuilder, "consentAcceptButtonText", this$0.gdprAccept);
            JsonElementBuildersKt.put(jsonObjectBuilder, "consentDenyButtonText", this$0.gdprDeny);
        } else {
            JsonElementBuildersKt.put(jsonObjectBuilder, "consentRequired", Boolean.FALSE);
        }
        JsonElementBuildersKt.put(jsonObjectBuilder, "sdkVersion", BuildConfig.VERSION_NAME);
        this$0.handler.post(new com.google.android.exoplayer2.video.a(27, this$0, "window.vungle.mraidBridge.notifyPropertiesChange(" + jsonObjectBuilder.build() + AbstractJsonLexerKt.COMMA + z2 + ')'));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: notifyPropertiesChange$lambda-25$lambda-24, reason: not valid java name */
    public static final void m3260notifyPropertiesChange$lambda25$lambda24(VungleWebClient this$0, String injectJs) {
        Intrinsics.f(this$0, "this$0");
        Intrinsics.f(injectJs, "$injectJs");
        WebView webView = this$0.loadedWebView;
        if (webView != null) {
            this$0.runJavascriptOnWebView(webView, injectJs);
        }
    }

    private final void runJavascriptOnWebView(WebView webView, String injectJs) {
        try {
            Logger.INSTANCE.w(TAG, "mraid Injecting JS " + injectJs);
            if (webView != null) {
                webView.evaluateJavascript(injectJs, null);
            }
        } catch (Throwable th) {
            new EvaluateJsError("Evaluate js failed " + th.getLocalizedMessage()).setLogEntry$vungle_ads_release(this.advertisement.getLogEntry()).logErrorNoReturnValue$vungle_ads_release();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: shouldOverrideUrlLoading$lambda-16$lambda-10, reason: not valid java name */
    public static final void m3261shouldOverrideUrlLoading$lambda16$lambda10(VungleWebClient this$0, WebView webView) {
        Intrinsics.f(this$0, "this$0");
        PreloadDelegate preloadDelegate = this$0.delegate;
        if (preloadDelegate != null) {
            preloadDelegate.onAdFailedToPlay();
        }
        this$0.handler.post(new b(this$0, webView, 2));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: shouldOverrideUrlLoading$lambda-16$lambda-10$lambda-9, reason: not valid java name */
    public static final void m3262shouldOverrideUrlLoading$lambda16$lambda10$lambda9(VungleWebClient this$0, WebView webView) {
        Intrinsics.f(this$0, "this$0");
        this$0.runJavascriptOnWebView(webView, COMMAND_COMPLETE);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: shouldOverrideUrlLoading$lambda-16$lambda-11, reason: not valid java name */
    public static final void m3263shouldOverrideUrlLoading$lambda16$lambda11(VungleWebClient this$0, WebView webView) {
        Intrinsics.f(this$0, "this$0");
        this$0.runJavascriptOnWebView(webView, COMMAND_COMPLETE);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: shouldOverrideUrlLoading$lambda-16$lambda-15$lambda-14, reason: not valid java name */
    public static final void m3264shouldOverrideUrlLoading$lambda16$lambda15$lambda14(WebViewAPI.MraidDelegate it, String command, JsonObject args, VungleWebClient this$0, WebView webView) {
        Intrinsics.f(it, "$it");
        Intrinsics.f(command, "$command");
        Intrinsics.f(args, "$args");
        Intrinsics.f(this$0, "this$0");
        if (it.processCommand(command, args)) {
            this$0.handler.post(new b(this$0, webView, 3));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: shouldOverrideUrlLoading$lambda-16$lambda-15$lambda-14$lambda-13, reason: not valid java name */
    public static final void m3265shouldOverrideUrlLoading$lambda16$lambda15$lambda14$lambda13(VungleWebClient this$0, WebView webView) {
        Intrinsics.f(this$0, "this$0");
        this$0.runJavascriptOnWebView(webView, COMMAND_COMPLETE);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: shouldOverrideUrlLoading$lambda-16$lambda-6, reason: not valid java name */
    public static final void m3266shouldOverrideUrlLoading$lambda16$lambda6(VungleWebClient this$0, WebView webView) {
        Intrinsics.f(this$0, "this$0");
        this$0.handler.post(new com.unity3d.services.ads.operation.load.b(this$0, webView, "window.vungle.mraidBridge.notifyReadyEvent(" + this$0.advertisement.createMRAIDArgs() + ')', 6));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: shouldOverrideUrlLoading$lambda-16$lambda-6$lambda-5, reason: not valid java name */
    public static final void m3267shouldOverrideUrlLoading$lambda16$lambda6$lambda5(VungleWebClient this$0, WebView webView, String injectJs) {
        Intrinsics.f(this$0, "this$0");
        Intrinsics.f(injectJs, "$injectJs");
        this$0.runJavascriptOnWebView(webView, injectJs);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: shouldOverrideUrlLoading$lambda-16$lambda-8, reason: not valid java name */
    public static final void m3268shouldOverrideUrlLoading$lambda16$lambda8(VungleWebClient this$0, WebView webView) {
        Intrinsics.f(this$0, "this$0");
        PreloadDelegate preloadDelegate = this$0.delegate;
        if (preloadDelegate != null) {
            preloadDelegate.onAdReadyToPlay();
        }
        this$0.handler.post(new b(this$0, webView, 1));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: shouldOverrideUrlLoading$lambda-16$lambda-8$lambda-7, reason: not valid java name */
    public static final void m3269shouldOverrideUrlLoading$lambda16$lambda8$lambda7(VungleWebClient this$0, WebView webView) {
        Intrinsics.f(this$0, "this$0");
        this$0.runJavascriptOnWebView(webView, COMMAND_COMPLETE);
    }

    /* JADX INFO: renamed from: getCollectConsent$vungle_ads_release, reason: from getter */
    public final boolean getCollectConsent() {
        return this.collectConsent;
    }

    /* JADX INFO: renamed from: getErrorHandler$vungle_ads_release, reason: from getter */
    public final WebViewAPI.WebClientErrorHandler getErrorHandler() {
        return this.errorHandler;
    }

    /* JADX INFO: renamed from: getGdprAccept$vungle_ads_release, reason: from getter */
    public final String getGdprAccept() {
        return this.gdprAccept;
    }

    /* JADX INFO: renamed from: getGdprBody$vungle_ads_release, reason: from getter */
    public final String getGdprBody() {
        return this.gdprBody;
    }

    /* JADX INFO: renamed from: getGdprDeny$vungle_ads_release, reason: from getter */
    public final String getGdprDeny() {
        return this.gdprDeny;
    }

    /* JADX INFO: renamed from: getGdprTitle$vungle_ads_release, reason: from getter */
    public final String getGdprTitle() {
        return this.gdprTitle;
    }

    /* JADX INFO: renamed from: getHandler$vungle_ads_release, reason: from getter */
    public final Handler getHandler() {
        return this.handler;
    }

    /* JADX INFO: renamed from: getLoadedWebView$vungle_ads_release, reason: from getter */
    public final WebView getLoadedWebView() {
        return this.loadedWebView;
    }

    /* JADX INFO: renamed from: getMraidDelegate$vungle_ads_release, reason: from getter */
    public final WebViewAPI.MraidDelegate getMraidDelegate() {
        return this.mraidDelegate;
    }

    /* JADX INFO: renamed from: getReady$vungle_ads_release, reason: from getter */
    public final boolean getReady() {
        return this.ready;
    }

    /* JADX INFO: renamed from: getWebViewObserver$vungle_ads_release, reason: from getter */
    public final WebViewObserver getWebViewObserver() {
        return this.webViewObserver;
    }

    /* JADX INFO: renamed from: isViewable$vungle_ads_release, reason: from getter */
    public final Boolean getIsViewable() {
        return this.isViewable;
    }

    public final void notifyDiskAvailableSize(long availableDiskSize, long appFolderSize) {
        WebView webView = this.loadedWebView;
        if (webView != null) {
            StringBuilder sb = new StringBuilder("window.vungle.mraidBridgeExt.notifyAvailableDiskSpace(");
            sb.append(availableDiskSize);
            sb.append('-');
            runJavascriptOnWebView(webView, androidx.media3.extractor.text.ttml.a.o(sb, appFolderSize, ')'));
        }
    }

    @Override // com.vungle.ads.internal.ui.view.WebViewAPI
    public void notifyPropertiesChange(boolean skipCmdQueue) {
        this.offloadExecutor.submit(new K(skipCmdQueue, this));
    }

    public final void notifySilentModeChange(boolean silentModeEnabled) {
        WebView webView = this.loadedWebView;
        if (webView != null) {
            JsonObjectBuilder jsonObjectBuilder = new JsonObjectBuilder();
            JsonElementBuildersKt.put(jsonObjectBuilder, "isSilent", Boolean.valueOf(silentModeEnabled));
            runJavascriptOnWebView(webView, "window.vungle.mraidBridge.notifyPropertiesChange(" + jsonObjectBuilder.build() + ')');
        }
    }

    @Override // android.webkit.WebViewClient
    public void onPageFinished(WebView view, String url) {
        super.onPageFinished(view, url);
        Logger.INSTANCE.w(TAG, "onPageFinished.");
        if (view == null) {
            return;
        }
        this.loadedWebView = view;
        view.setVisibility(0);
        notifyPropertiesChange(true);
        if (Build.VERSION.SDK_INT >= 29) {
            view.setWebViewRenderProcessClient(new VungleWebViewRenderProcessClient(this.errorHandler));
        }
        WebViewObserver webViewObserver = this.webViewObserver;
        if (webViewObserver != null) {
            webViewObserver.onPageFinished(view);
        }
    }

    @Override // android.webkit.WebViewClient
    @Deprecated
    public void onReceivedError(WebView view, int errorCode, String description, String failingUrl) {
        Intrinsics.f(description, "description");
        Intrinsics.f(failingUrl, "failingUrl");
        super.onReceivedError(view, errorCode, description, failingUrl);
    }

    @Override // android.webkit.WebViewClient
    public void onReceivedHttpError(WebView view, WebResourceRequest request, WebResourceResponse errorResponse) {
        super.onReceivedHttpError(view, request, errorResponse);
        String strValueOf = String.valueOf(errorResponse != null ? Integer.valueOf(errorResponse.getStatusCode()) : null);
        String strValueOf2 = String.valueOf(request != null ? request.getUrl() : null);
        boolean z2 = false;
        boolean z3 = request != null && request.isForMainFrame();
        Logger.INSTANCE.e(TAG, "Http Error desc " + strValueOf + ' ' + z3 + " for URL " + strValueOf2);
        if (isCriticalAsset(strValueOf2) && z3) {
            z2 = true;
        }
        handleWebViewError(strValueOf, strValueOf2, z2);
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // android.webkit.WebViewClient
    public boolean onRenderProcessGone(WebView view, RenderProcessGoneDetail detail) {
        this.loadedWebView = null;
        if (Build.VERSION.SDK_INT < 26) {
            Logger.Companion companion = Logger.INSTANCE;
            StringBuilder sb = new StringBuilder("onRenderProcessGone url: ");
            sb.append(view != null ? view.getUrl() : null);
            companion.w(TAG, sb.toString());
            WebViewAPI.WebClientErrorHandler webClientErrorHandler = this.errorHandler;
            if (webClientErrorHandler != null) {
                return webClientErrorHandler.onWebRenderingProcessGone(view, Boolean.TRUE);
            }
            return true;
        }
        Logger.Companion companion2 = Logger.INSTANCE;
        StringBuilder sb2 = new StringBuilder("onRenderProcessGone url: ");
        sb2.append(view != null ? view.getUrl() : null);
        sb2.append(", did crash: ");
        sb2.append(detail != null ? Boolean.valueOf(detail.didCrash()) : null);
        companion2.w(TAG, sb2.toString());
        WebViewAPI.WebClientErrorHandler webClientErrorHandler2 = this.errorHandler;
        if (webClientErrorHandler2 != null) {
            return webClientErrorHandler2.onWebRenderingProcessGone(view, detail != null ? Boolean.valueOf(detail.didCrash()) : null);
        }
        return super.onRenderProcessGone(view, detail);
    }

    /* JADX WARN: Code duplicated, block: B:22:0x0055 A[Catch: all -> 0x002b, TRY_LEAVE, TryCatch #0 {all -> 0x002b, blocks: (B:5:0x0008, B:7:0x000f, B:9:0x0026, B:13:0x002e, B:15:0x0036, B:19:0x0040, B:20:0x0045, B:21:0x004f, B:22:0x0055), top: B:31:0x0008 }] */
    public final Pair<Long, Long> parseRange$vungle_ads_release(String rangeHeader, long contentLength) {
        Object pair;
        if (rangeHeader != null) {
            try {
                if (StringsKt.M(rangeHeader, "bytes=", false)) {
                    List listJ = StringsKt.J(StringsKt.D(rangeHeader, "bytes="), 0, 6, new String[]{TokenBuilder.TOKEN_DELIMITER});
                    String str = (String) CollectionsKt.B(0, listJ);
                    Long lZ = str != null ? StringsKt.Z(str) : null;
                    String str2 = (String) CollectionsKt.B(1, listJ);
                    Long lZ2 = str2 != null ? StringsKt.Z(str2) : null;
                    if (lZ == null) {
                        if (lZ2 == null) {
                            lZ = 0L;
                        } else {
                            lZ = Long.valueOf(contentLength - lZ2.longValue());
                            lZ2 = null;
                        }
                    }
                    pair = new Pair(lZ, lZ2);
                } else {
                    pair = new Pair(0L, null);
                }
            } catch (Throwable th) {
                pair = ResultKt.a(th);
            }
        } else {
            pair = new Pair(0L, null);
        }
        if (Result.a(pair) != null) {
            pair = new Pair(0L, null);
        }
        return (Pair) pair;
    }

    @Override // com.vungle.ads.internal.ui.view.WebViewAPI
    public void setAdVisibility(boolean isViewable) {
        this.isViewable = Boolean.valueOf(isViewable);
        notifyPropertiesChange(false);
    }

    public final void setCollectConsent$vungle_ads_release(boolean z2) {
        this.collectConsent = z2;
    }

    @Override // com.vungle.ads.internal.ui.view.WebViewAPI
    public void setConsentStatus(boolean collectedConsent, String title, String message, String accept, String deny) {
        this.collectConsent = collectedConsent;
        this.gdprTitle = title;
        this.gdprBody = message;
        this.gdprAccept = accept;
        this.gdprDeny = deny;
    }

    @Override // com.vungle.ads.internal.ui.view.WebViewAPI
    public void setErrorHandler(WebViewAPI.WebClientErrorHandler errorHandler) {
        Intrinsics.f(errorHandler, "errorHandler");
        this.errorHandler = errorHandler;
    }

    public final void setErrorHandler$vungle_ads_release(WebViewAPI.WebClientErrorHandler webClientErrorHandler) {
        this.errorHandler = webClientErrorHandler;
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

    @Override // com.vungle.ads.internal.ui.view.WebViewAPI
    public void setMraidDelegate(WebViewAPI.MraidDelegate mraidDelegate) {
        this.mraidDelegate = mraidDelegate;
    }

    public final void setMraidDelegate$vungle_ads_release(WebViewAPI.MraidDelegate mraidDelegate) {
        this.mraidDelegate = mraidDelegate;
    }

    public final void setReady$vungle_ads_release(boolean z2) {
        this.ready = z2;
    }

    public final void setViewable$vungle_ads_release(Boolean bool) {
        this.isViewable = bool;
    }

    @Override // com.vungle.ads.internal.ui.view.WebViewAPI
    public void setWebViewObserver(WebViewObserver webViewObserver) {
        this.webViewObserver = webViewObserver;
    }

    public final void setWebViewObserver$vungle_ads_release(WebViewObserver webViewObserver) {
        this.webViewObserver = webViewObserver;
    }

    @Override // android.webkit.WebViewClient
    public WebResourceResponse shouldInterceptRequest(WebView view, WebResourceRequest request) {
        String scheme;
        Uri url = request != null ? request.getUrl() : null;
        if (url != null && (scheme = url.getScheme()) != null) {
            Locale locale = Locale.ROOT;
            String strP = Z.p(locale, "ROOT", scheme, locale, "this as java.lang.String).toLowerCase(locale)");
            if (strP.equals("http") || strP.equals(HttpRequest.DEFAULT_SCHEME)) {
                if (!this.advertisement.isPartialDownloadEnabled()) {
                    Logger.INSTANCE.w(TAG, "shouldInterceptRequest called but partial download is disabled.");
                    return null;
                }
                String string = url.toString();
                Intrinsics.e(string, "uri.toString()");
                AdAsset localPartialDownloadAssets = this.advertisement.getLocalPartialDownloadAssets(string);
                String localPath = localPartialDownloadAssets != null ? localPartialDownloadAssets.getLocalPath() : null;
                if (localPath != null && localPath.length() != 0) {
                    File file = new File(localPath);
                    if (file.exists()) {
                        long contentLength = localPartialDownloadAssets.getContentLength();
                        if (contentLength > 0) {
                            long length = file.length();
                            String str = request.getRequestHeaders().get(Command.HTTP_HEADER_RANGE);
                            this.partialDownloadMetric.setMeta(str + " cached:" + length + ' ' + string);
                            AnalyticsClient.logMetric$vungle_ads_release$default(AnalyticsClient.INSTANCE, this.partialDownloadMetric, this.advertisement.getLogEntry(), (String) null, 4, (Object) null);
                            Pair<Long, Long> range$vungle_ads_release = parseRange$vungle_ads_release(str, contentLength);
                            localPartialDownloadAssets.setRangeStart(((Number) range$vungle_ads_release.X).longValue());
                            Long l2 = (Long) range$vungle_ads_release.f43249Y;
                            localPartialDownloadAssets.setRangeEnd(l2);
                            long jLongValue = ((Number) range$vungle_ads_release.X).longValue();
                            long j = length - jLongValue;
                            Logger.Companion companion = Logger.INSTANCE;
                            StringBuilder sb = new StringBuilder(">>request: ");
                            sb.append(str);
                            sb.append(" rangeStart=");
                            sb.append(jLongValue);
                            sb.append(" rangeEnd=");
                            sb.append(l2);
                            sb.append(" cachedFileLength=");
                            sb.append(length);
                            androidx.datastore.preferences.protobuf.a.A(sb, " availableBytes=", j, " contentLength=");
                            companion.i(TAG, androidx.media3.extractor.text.ttml.a.o(sb, contentLength, ' '));
                            if (j <= 0) {
                                companion.w(TAG, "Requested range exceeds cached file: " + str);
                                localPartialDownloadAssets.waitForDownload();
                                length = file.length();
                            }
                            long jLongValue2 = l2 != null ? l2.longValue() : length - 1;
                            long j2 = (jLongValue2 - jLongValue) + 1;
                            try {
                                FileInputStream fileInputStream = new FileInputStream(file);
                                WebResourceResponse webResourceResponse = new WebResourceResponse("video/mp4", "UTF-8", 206, "Partial Content", MapsKt.j(new Pair("Content-Type", "video/mp4"), new Pair("Accept-Ranges", "bytes"), new Pair("Content-Length", String.valueOf(j2)), new Pair("Content-Range", "bytes " + jLongValue + '-' + jLongValue2 + IOUtils.DIR_SEPARATOR_UNIX + contentLength)), new BufferedInputStream(fileInputStream, 1024));
                                StringBuilder sb2 = new StringBuilder("<<Return:");
                                sb2.append(webResourceResponse.getResponseHeaders());
                                companion.i(TAG, sb2.toString());
                                return webResourceResponse;
                            } catch (Throwable th) {
                                Throwable thA = Result.a(ResultKt.a(th));
                                if (thA == null) {
                                    return null;
                                }
                                Logger.INSTANCE.e(TAG, "Error serving local range video: " + thA.getMessage(), thA);
                                this.partialDownloadErrorMetric.setMeta(string + ' ' + thA.getMessage());
                                AnalyticsClient.logMetric$vungle_ads_release$default(AnalyticsClient.INSTANCE, this.partialDownloadErrorMetric, this.advertisement.getLogEntry(), (String) null, 4, (Object) null);
                                return null;
                            }
                        }
                    }
                }
            }
        }
        return null;
    }

    @Override // android.webkit.WebViewClient
    @Deprecated
    public boolean shouldOverrideUrlLoading(WebView view, String url) {
        try {
            Logger.Companion companion = Logger.INSTANCE;
            companion.d(TAG, "MRAID Command " + url);
            if (url != null && url.length() != 0) {
                Uri uri = Uri.parse(url);
                Intrinsics.e(uri, "parse(this)");
                String scheme = uri.getScheme();
                if (scheme != null && scheme.length() != 0) {
                    String scheme2 = uri.getScheme();
                    if (!Intrinsics.a(scheme2, "mraid")) {
                        if (!"http".equalsIgnoreCase(scheme2)) {
                            if (HttpRequest.DEFAULT_SCHEME.equalsIgnoreCase(scheme2)) {
                            }
                            this.skippedUrlMetric.setMeta("url: ".concat(url));
                            AnalyticsClient.logMetric$vungle_ads_release$default(AnalyticsClient.INSTANCE, this.skippedUrlMetric, this.advertisement.getLogEntry(), (String) null, 4, (Object) null);
                            companion.w(TAG, "skipped url: ".concat(url));
                            return false;
                        }
                        companion.d(TAG, "Open URL".concat(url));
                        WebViewAPI.MraidDelegate mraidDelegate = this.mraidDelegate;
                        if (mraidDelegate != null) {
                            JsonObjectBuilder jsonObjectBuilder = new JsonObjectBuilder();
                            JsonElementBuildersKt.put(jsonObjectBuilder, "url", url);
                            mraidDelegate.processCommand("openNonMraid", jsonObjectBuilder.build());
                        }
                        return true;
                    }
                    String host = uri.getHost();
                    if (host != null) {
                        int iHashCode = host.hashCode();
                        if (iHashCode != -1943542072) {
                            if (iHashCode != 88409791) {
                                if (iHashCode == 119543762 && host.equals("readyToPlay")) {
                                    this.offloadExecutor.submit(new b(this, view, 5));
                                    return true;
                                }
                            } else if (host.equals("failToLoad")) {
                                this.offloadExecutor.submit(new b(this, view, 6));
                                return true;
                            }
                        } else if (host.equals("propertiesChangeCompleted")) {
                            if (!this.ready) {
                                this.ready = true;
                                this.offloadExecutor.submit(new b(this, view, 4));
                                return true;
                            }
                            return true;
                        }
                        WebViewAPI.MraidDelegate mraidDelegate2 = this.mraidDelegate;
                        if (mraidDelegate2 == null) {
                            this.handler.post(new b(this, view, 0));
                            return true;
                        }
                        JsonObjectBuilder jsonObjectBuilder2 = new JsonObjectBuilder();
                        for (String param : uri.getQueryParameterNames()) {
                            Intrinsics.e(param, "param");
                            JsonElementBuildersKt.put(jsonObjectBuilder2, param, uri.getQueryParameter(param));
                        }
                        this.offloadExecutor.submit(new r0(mraidDelegate2, host, jsonObjectBuilder2.build(), this, view, 5));
                        return true;
                    }
                    this.skippedUrlMetric.setMeta("url: ".concat(url));
                    AnalyticsClient.logMetric$vungle_ads_release$default(AnalyticsClient.INSTANCE, this.skippedUrlMetric, this.advertisement.getLogEntry(), (String) null, 4, (Object) null);
                    companion.w(TAG, "skipped url: ".concat(url));
                    return false;
                }
                return false;
            }
            companion.e(TAG, "Invalid URL ");
            return false;
        } catch (Throwable th) {
            if (th instanceof OutOfMemoryError) {
                new OutOfMemory(android.support.v4.media.a.C("mraid:", url)).logErrorNoReturnValue$vungle_ads_release();
            }
        }
    }

    public VungleWebClient(AdPayload advertisement, Placement placement, ExecutorService offloadExecutor, Platform platform, PreloadDelegate preloadDelegate, Long l2) {
        Intrinsics.f(advertisement, "advertisement");
        Intrinsics.f(placement, "placement");
        Intrinsics.f(offloadExecutor, "offloadExecutor");
        this.advertisement = advertisement;
        this.placement = placement;
        this.offloadExecutor = offloadExecutor;
        this.platform = platform;
        this.delegate = preloadDelegate;
        this.loadDuration = l2;
        this.handler = new Handler(Looper.getMainLooper());
        Sdk.SDKMetric.SDKMetricType sDKMetricType = Sdk.SDKMetric.SDKMetricType.AD_PLAY_WITH_PARTIAL_DOWNLOAD_ASSET;
        this.partialDownloadMetric = new OneShotSingleValueMetric(sDKMetricType);
        this.partialDownloadErrorMetric = new OneShotSingleValueMetric(sDKMetricType);
        this.skippedUrlMetric = new SingleValueMetric(Sdk.SDKMetric.SDKMetricType.BANNER_AUTO_REDIRECT_NOT_OVERRIDE_URL);
    }

    @Override // android.webkit.WebViewClient
    public void onReceivedError(WebView view, WebResourceRequest request, WebResourceError error) {
        super.onReceivedError(view, request, error);
        String strValueOf = String.valueOf(error != null ? error.getDescription() : null);
        String strValueOf2 = String.valueOf(request != null ? request.getUrl() : null);
        boolean z2 = false;
        boolean z3 = request != null && request.isForMainFrame();
        Logger.INSTANCE.e(TAG, "Error desc " + strValueOf + ' ' + z3 + " for URL " + strValueOf2);
        if (isCriticalAsset(strValueOf2) && z3) {
            z2 = true;
        }
        handleWebViewError(strValueOf, strValueOf2, z2);
    }
}
