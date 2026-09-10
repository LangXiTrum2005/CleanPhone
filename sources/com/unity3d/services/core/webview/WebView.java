package com.unity3d.services.core.webview;

import an.i;
import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.net.Uri;
import android.view.View;
import android.webkit.ValueCallback;
import android.webkit.WebSettings;
import com.ironsource.C0663xe;
import com.ironsource.ph;
import com.unity3d.services.core.configuration.Experiments;
import com.unity3d.services.core.configuration.IExperiments;
import com.unity3d.services.core.di.IServiceComponent;
import com.unity3d.services.core.di.IServiceProvider;
import com.unity3d.services.core.log.DeviceLog;
import com.unity3d.services.core.misc.Utilities;
import com.unity3d.services.core.misc.ViewUtilities;
import com.unity3d.services.core.request.metrics.SDKMetricsSender;
import com.unity3d.services.core.webview.bridge.IInvocationCallbackInvoker;
import com.unity3d.services.core.webview.bridge.IWebViewBridge;
import com.unity3d.services.core.webview.bridge.SharedInstances;
import com.unity3d.services.core.webview.bridge.WebViewBridgeInterface;
import f0.b;
import gatewayprotocol.v1.DiagnosticEventRequestOuterClass;
import java.util.WeakHashMap;
import kotlin.Metadata;
import kotlin.jvm.internal.n;
import m0.l0;
import m0.o1;
import m0.r1;
import m0.s0;
import qk.i0;
import r4.f;
import t9.e;
import wj.d;
import wj.g;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0016\u0018\u00002\u00020\u00012\u00020\u0002B9\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007\u0012\b\b\u0002\u0010\n\u001a\u00020\t\u0012\b\b\u0002\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u0010\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J'\u0010\u0016\u001a\u00020\u000f2\u0006\u0010\u0013\u001a\u00020\u00122\u000e\u0010\u0015\u001a\n\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u0014H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u0017\u0010\u0019\u001a\u00020\u000f2\u0006\u0010\u0018\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u0019\u0010\u001aR\u001b\u0010 \u001a\u00020\u001b8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u0014\u0010\"\u001a\u00020!8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010#¨\u0006$"}, d2 = {"Lcom/unity3d/services/core/webview/WebView;", "Landroid/webkit/WebView;", "Lcom/unity3d/services/core/di/IServiceComponent;", "Landroid/content/Context;", "context", "", "shouldNotRequireGesturePlayback", "Lcom/unity3d/services/core/webview/bridge/IWebViewBridge;", "webViewBridge", "Lcom/unity3d/services/core/webview/bridge/IInvocationCallbackInvoker;", "callbackInvoker", "Lcom/unity3d/services/core/configuration/IExperiments;", C0663xe.f31076d, "<init>", "(Landroid/content/Context;ZLcom/unity3d/services/core/webview/bridge/IWebViewBridge;Lcom/unity3d/services/core/webview/bridge/IInvocationCallbackInvoker;Lcom/unity3d/services/core/configuration/IExperiments;)V", "Lwj/r;", "applySafeAreaInsets", "()V", "", "script", "Landroid/webkit/ValueCallback;", "resultCallback", "evaluateJavascript", "(Ljava/lang/String;Landroid/webkit/ValueCallback;)V", "url", "loadUrl", "(Ljava/lang/String;)V", "Lcom/unity3d/services/core/request/metrics/SDKMetricsSender;", "sdkMetricsSender$delegate", "Lwj/d;", "getSdkMetricsSender", "()Lcom/unity3d/services/core/request/metrics/SDKMetricsSender;", "sdkMetricsSender", "Lcom/unity3d/services/core/webview/bridge/WebViewBridgeInterface;", "webViewBridgeInterface", "Lcom/unity3d/services/core/webview/bridge/WebViewBridgeInterface;", "unity-ads_defaultRelease"}, k = 1, mv = {1, 8, 0}, xi = DiagnosticEventRequestOuterClass.DiagnosticEventType.DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_QUALITY_INIT_STARTED_VALUE)
public class WebView extends android.webkit.WebView implements IServiceComponent {

    /* JADX INFO: renamed from: sdkMetricsSender$delegate, reason: from kotlin metadata */
    private final d sdkMetricsSender;
    private final WebViewBridgeInterface webViewBridgeInterface;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public WebView(Context context) {
        this(context, false, null, null, null, 30, null);
        n.f(context, "context");
    }

    private final void applySafeAreaInsets() {
        a4.a aVar = new a4.a(this, 21);
        WeakHashMap weakHashMap = s0.f45746a;
        l0.b(this, aVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final r1 applySafeAreaInsets$lambda$3(WebView this$0, View v4, r1 insets) {
        Object objC;
        n.f(this$0, "this$0");
        n.f(v4, "v");
        n.f(insets, "insets");
        o1 o1Var = insets.f45740a;
        b bVarH = o1Var.h(519);
        n.e(bVarH, "insets.getInsets(WindowI…Compat.Type.systemBars())");
        b bVarH2 = o1Var.h(128);
        n.e(bVarH2, "insets.getInsets(WindowI…pat.Type.displayCutout())");
        try {
            objC = Float.valueOf(this$0.getContext().getResources().getDisplayMetrics().density);
        } catch (Throwable th2) {
            objC = e.c(th2);
        }
        Object objValueOf = Float.valueOf(1.0f);
        if (objC instanceof g) {
            objC = objValueOf;
        }
        float fFloatValue = ((Number) objC).floatValue();
        int iApplySafeAreaInsets$lambda$3$toPx = applySafeAreaInsets$lambda$3$toPx(Math.max(bVarH.f40258a, bVarH2.f40258a), fFloatValue);
        int iApplySafeAreaInsets$lambda$3$toPx2 = applySafeAreaInsets$lambda$3$toPx(Math.max(bVarH.f40259b, bVarH2.f40259b), fFloatValue);
        int iApplySafeAreaInsets$lambda$3$toPx3 = applySafeAreaInsets$lambda$3$toPx(Math.max(bVarH.f40260c, bVarH2.f40260c), fFloatValue);
        int iApplySafeAreaInsets$lambda$3$toPx4 = applySafeAreaInsets$lambda$3$toPx(Math.max(bVarH.f40261d, bVarH2.f40261d), fFloatValue);
        StringBuilder sbL = l1.d.l("\n                (function() {\n                    const root = document.documentElement;\n                    root.style.setProperty('--safe-area-inset-left', '", iApplySafeAreaInsets$lambda$3$toPx, "px');\n                    root.style.setProperty('--safe-area-inset-right', '", iApplySafeAreaInsets$lambda$3$toPx3, "px');\n                    root.style.setProperty('--safe-area-inset-top', '");
        sbL.append(iApplySafeAreaInsets$lambda$3$toPx2);
        sbL.append("px');\n                    root.style.setProperty('--safe-area-inset-bottom', '");
        sbL.append(iApplySafeAreaInsets$lambda$3$toPx4);
        sbL.append("px');\n                })();\n            ");
        this$0.evaluateJavascript(i.a0(sbL.toString()), null);
        return insets;
    }

    private static final int applySafeAreaInsets$lambda$3$toPx(int i10, float f10) {
        return (int) (i10 / f10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void evaluateJavascript$lambda$1(WebView this$0, String script, ValueCallback valueCallback) {
        n.f(this$0, "this$0");
        n.f(script, "$script");
        super.evaluateJavascript(script, valueCallback);
    }

    private final SDKMetricsSender getSdkMetricsSender() {
        return (SDKMetricsSender) this.sdkMetricsSender.getValue();
    }

    @Override // android.webkit.WebView
    public void evaluateJavascript(String script, ValueCallback<String> resultCallback) {
        n.f(script, "script");
        Utilities.runOnUiThread(new ph(this, script, resultCallback, 23));
    }

    @Override // com.unity3d.services.core.di.IServiceComponent
    public IServiceProvider getServiceProvider() {
        return IServiceComponent.DefaultImpls.getServiceProvider(this);
    }

    @Override // android.webkit.WebView
    public void loadUrl(String url) {
        n.f(url, "url");
        DeviceLog.debug("Loading url: ".concat(url));
        super.loadUrl(url);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public WebView(Context context, boolean z10) {
        this(context, z10, null, null, null, 28, null);
        n.f(context, "context");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public WebView(Context context, boolean z10, IWebViewBridge webViewBridge) {
        this(context, z10, webViewBridge, null, null, 24, null);
        n.f(context, "context");
        n.f(webViewBridge, "webViewBridge");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public WebView(Context context, boolean z10, IWebViewBridge webViewBridge, IInvocationCallbackInvoker callbackInvoker) {
        this(context, z10, webViewBridge, callbackInvoker, null, 16, null);
        n.f(context, "context");
        n.f(webViewBridge, "webViewBridge");
        n.f(callbackInvoker, "callbackInvoker");
    }

    public /* synthetic */ WebView(Context context, boolean z10, IWebViewBridge iWebViewBridge, IInvocationCallbackInvoker iInvocationCallbackInvoker, IExperiments iExperiments, int i10, kotlin.jvm.internal.g gVar) {
        this(context, (i10 & 2) != 0 ? false : z10, (i10 & 4) != 0 ? SharedInstances.INSTANCE.getWebViewBridge() : iWebViewBridge, (i10 & 8) != 0 ? SharedInstances.INSTANCE.getWebViewAppInvocationCallbackInvoker() : iInvocationCallbackInvoker, (i10 & 16) != 0 ? new Experiments() : iExperiments);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WebView(Context context, boolean z10, IWebViewBridge webViewBridge, IInvocationCallbackInvoker callbackInvoker, IExperiments experiments) {
        super(context);
        n.f(context, "context");
        n.f(webViewBridge, "webViewBridge");
        n.f(callbackInvoker, "callbackInvoker");
        n.f(experiments, "experiments");
        this.sdkMetricsSender = r9.b.t(wj.e.f53281b, new WebView$special$$inlined$inject$default$1(this, ""));
        final WebViewBridgeInterface webViewBridgeInterface = new WebViewBridgeInterface(webViewBridge, callbackInvoker);
        this.webViewBridgeInterface = webViewBridgeInterface;
        WebSettings settings = getSettings();
        settings.setAllowFileAccessFromFileURLs(true);
        settings.setAllowUniversalAccessFromFileURLs(true);
        settings.setAllowFileAccess(true);
        settings.setBlockNetworkImage(false);
        settings.setBlockNetworkLoads(false);
        settings.setBuiltInZoomControls(false);
        settings.setCacheMode(2);
        settings.setDatabaseEnabled(false);
        settings.setDisplayZoomControls(false);
        settings.setDomStorageEnabled(false);
        settings.setEnableSmoothTransition(false);
        settings.setGeolocationEnabled(false);
        settings.setJavaScriptCanOpenWindowsAutomatically(false);
        settings.setJavaScriptEnabled(true);
        settings.setLightTouchEnabled(false);
        settings.setLoadWithOverviewMode(false);
        settings.setLoadsImagesAutomatically(true);
        settings.setMediaPlaybackRequiresUserGesture(false);
        settings.setMixedContentMode(1);
        settings.setNeedInitialFocus(true);
        settings.setPluginState(WebSettings.PluginState.OFF);
        settings.setRenderPriority(WebSettings.RenderPriority.NORMAL);
        settings.setSaveFormData(false);
        settings.setSavePassword(false);
        settings.setSupportMultipleWindows(false);
        settings.setSupportZoom(false);
        settings.setUseWideViewPort(true);
        settings.setMediaPlaybackRequiresUserGesture(!z10);
        setHorizontalScrollBarEnabled(false);
        setVerticalScrollBarEnabled(false);
        setInitialScale(0);
        setBackgroundColor(0);
        ViewUtilities.setBackground(this, new ColorDrawable(0));
        setBackgroundResource(0);
        boolean zIsWebMessageEnabled = experiments.isWebMessageEnabled();
        if (zIsWebMessageEnabled) {
            getSdkMetricsSender().sendMetric(WebViewMetricKt.webMessageListenerEnabledMetric());
        } else {
            getSdkMetricsSender().sendMetric(WebViewMetricKt.webMessageListenerDisabledMetric());
        }
        boolean zX = a.a.x("WEB_MESSAGE_LISTENER");
        if (zX) {
            getSdkMetricsSender().sendMetric(WebViewMetricKt.webMessageListenerSupportedMetric());
        } else {
            getSdkMetricsSender().sendMetric(WebViewMetricKt.webMessageListenerUnsupportedMetric());
        }
        if (zIsWebMessageEnabled && zX) {
            final int i10 = 0;
            r4.g.a(this, "handleInvocation", i0.k0("*"), new f() { // from class: com.unity3d.services.core.webview.a
                @Override // r4.f
                public final void onPostMessage(android.webkit.WebView webView, r4.d dVar, Uri uri, boolean z11, r4.a aVar) throws Exception {
                    switch (i10) {
                        case 0:
                            webViewBridgeInterface.onHandleInvocation(webView, dVar, uri, z11, aVar);
                            break;
                        default:
                            webViewBridgeInterface.onHandleCallback(webView, dVar, uri, z11, aVar);
                            break;
                    }
                }
            });
            final int i11 = 1;
            r4.g.a(this, "handleCallback", i0.k0("*"), new f() { // from class: com.unity3d.services.core.webview.a
                @Override // r4.f
                public final void onPostMessage(android.webkit.WebView webView, r4.d dVar, Uri uri, boolean z11, r4.a aVar) throws Exception {
                    switch (i11) {
                        case 0:
                            webViewBridgeInterface.onHandleInvocation(webView, dVar, uri, z11, aVar);
                            break;
                        default:
                            webViewBridgeInterface.onHandleCallback(webView, dVar, uri, z11, aVar);
                            break;
                    }
                }
            });
        } else {
            addJavascriptInterface(webViewBridgeInterface, "webviewbridge");
        }
        applySafeAreaInsets();
    }
}
