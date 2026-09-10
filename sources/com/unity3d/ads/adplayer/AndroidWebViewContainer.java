package com.unity3d.ads.adplayer;

import ak.f;
import ak.k;
import android.annotation.SuppressLint;
import android.content.Context;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.webkit.JavascriptInterface;
import android.webkit.WebView;
import ck.e;
import ck.i;
import cn.a0;
import cn.d0;
import cn.u1;
import cn.w;
import cn.z;
import com.google.android.gms.ads.RequestConfiguration;
import com.ironsource.InterfaceC0435l1;
import com.ironsource.X3;
import com.unity3d.ads.adplayer.model.ErrorReason;
import com.unity3d.ads.adplayer.model.WebViewBridgeInterface;
import com.unity3d.ads.adplayer.model.WebViewClientError;
import com.unity3d.ads.core.data.model.AdObject;
import com.unity3d.ads.core.domain.SendDiagnosticEvent;
import com.unity3d.ads.core.domain.SendWebViewClientErrorDiagnostics;
import fn.a1;
import fn.n0;
import fn.p0;
import fn.s;
import fn.y0;
import gatewayprotocol.v1.DiagnosticEventRequestOuterClass;
import hn.d;
import java.io.IOException;
import java.util.Map;
import java.util.WeakHashMap;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.jvm.internal.g;
import kotlin.jvm.internal.n;
import ln.c;
import m0.l0;
import m0.o1;
import m0.r1;
import m0.s0;
import wj.r;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000v\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0001\u0018\u0000 A2\u00020\u0001:\u0001ABO\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\n\u001a\u00020\b\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\u0006\u0010\u0010\u001a\u00020\u000f\u0012\u0006\u0010\u0012\u001a\u00020\u0011¢\u0006\u0004\b\u0013\u0010\u0014J\u0013\u0010\u0016\u001a\u00020\u0015H\u0082@ø\u0001\u0000¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0018\u001a\u00020\u0015H\u0002¢\u0006\u0004\b\u0018\u0010\u0019J\u001b\u0010\u001c\u001a\u00020\u00152\u0006\u0010\u001b\u001a\u00020\u001aH\u0096@ø\u0001\u0000¢\u0006\u0004\b\u001c\u0010\u001dJ#\u0010\"\u001a\u00020\u00152\u0006\u0010\u001f\u001a\u00020\u001e2\u0006\u0010!\u001a\u00020 H\u0096@ø\u0001\u0000¢\u0006\u0004\b\"\u0010#J#\u0010'\u001a\u00020\u00152\u0006\u0010%\u001a\u00020$2\u0006\u0010&\u001a\u00020\u001aH\u0096@ø\u0001\u0000¢\u0006\u0004\b'\u0010(J\u0013\u0010)\u001a\u00020\u0015H\u0096@ø\u0001\u0000¢\u0006\u0004\b)\u0010\u0017R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010*\u001a\u0004\b+\u0010,R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010-R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010.R\u0014\u0010\u000e\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010/R\u0014\u0010\u0010\u001a\u00020\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u00100R\u0014\u0010\u0012\u001a\u00020\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u00101R\u0017\u00102\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\b2\u00103\u001a\u0004\b4\u00105R\u001f\u00108\u001a\n\u0012\u0006\u0012\u0004\u0018\u000107068\u0006¢\u0006\f\n\u0004\b8\u00109\u001a\u0004\b:\u0010;R\"\u0010=\u001a\n\u0012\u0006\u0012\u0004\u0018\u0001070<8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b=\u0010>\u001a\u0004\b?\u0010@\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006B"}, d2 = {"Lcom/unity3d/ads/adplayer/AndroidWebViewContainer;", "Lcom/unity3d/ads/adplayer/WebViewContainer;", "Landroid/webkit/WebView;", "webView", "Lcom/unity3d/ads/adplayer/AndroidWebViewClient;", "webViewClient", "Lcom/unity3d/ads/core/domain/SendWebViewClientErrorDiagnostics;", "sendWebViewClientErrorDiagnostics", "Lcn/w;", "mainDispatcher", "defaultDispatcher", "Lcn/a0;", "adPlayerScope", "Landroid/content/Context;", "context", "Lcom/unity3d/ads/core/data/model/AdObject;", "adObject", "Lcom/unity3d/ads/core/domain/SendDiagnosticEvent;", "sendDiagnosticEvent", "<init>", "(Landroid/webkit/WebView;Lcom/unity3d/ads/adplayer/AndroidWebViewClient;Lcom/unity3d/ads/core/domain/SendWebViewClientErrorDiagnostics;Lcn/w;Lcn/w;Lcn/a0;Landroid/content/Context;Lcom/unity3d/ads/core/data/model/AdObject;Lcom/unity3d/ads/core/domain/SendDiagnosticEvent;)V", "Lwj/r;", "onRenderProcessGone", "(Lak/f;)Ljava/lang/Object;", "applySafeAreaInsets", "()V", "", "url", "loadUrl", "(Ljava/lang/String;Lak/f;)Ljava/lang/Object;", "Lcom/unity3d/ads/adplayer/HandlerType;", "handlerType", "Lorg/json/JSONArray;", "arguments", "evaluateJavascript", "(Lcom/unity3d/ads/adplayer/HandlerType;Lorg/json/JSONArray;Lak/f;)Ljava/lang/Object;", "Lcom/unity3d/ads/adplayer/WebViewBridge;", "webViewBridgeInterface", "name", "addJavascriptInterface", "(Lcom/unity3d/ads/adplayer/WebViewBridge;Ljava/lang/String;Lak/f;)Ljava/lang/Object;", "destroy", "Landroid/webkit/WebView;", "getWebView", "()Landroid/webkit/WebView;", "Lcom/unity3d/ads/adplayer/AndroidWebViewClient;", "Lcom/unity3d/ads/core/domain/SendWebViewClientErrorDiagnostics;", "Landroid/content/Context;", "Lcom/unity3d/ads/core/data/model/AdObject;", "Lcom/unity3d/ads/core/domain/SendDiagnosticEvent;", "scope", "Lcn/a0;", "getScope", "()Lcn/a0;", "Lfn/n0;", "Landroid/view/InputEvent;", "_lastInputEvent", "Lfn/n0;", "get_lastInputEvent", "()Lfn/n0;", "Lfn/y0;", "lastInputEvent", "Lfn/y0;", "getLastInputEvent", "()Lfn/y0;", "Companion", "unity-ads_defaultRelease"}, k = 1, mv = {1, 8, 0}, xi = DiagnosticEventRequestOuterClass.DiagnosticEventType.DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_QUALITY_INIT_STARTED_VALUE)
@SuppressLint({"ClickableViewAccessibility"})
public final class AndroidWebViewContainer implements WebViewContainer {
    private static final String JS_CLOSING_PARENTHESES = ")";
    private static final String JS_INSTRUCTION = "javascript:window.nativebridge.";
    private static final String JS_OPENING_PARENTHESES = "(";
    private static final String JS_SEMICOLON = ";";
    private final n0 _lastInputEvent;
    private final AdObject adObject;
    private final Context context;
    private final y0 lastInputEvent;
    private final a0 scope;
    private final SendDiagnosticEvent sendDiagnosticEvent;
    private final SendWebViewClientErrorDiagnostics sendWebViewClientErrorDiagnostics;
    private final WebView webView;
    private final AndroidWebViewClient webViewClient;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final StringBuilder SHARED_STRING_BUILDER = new StringBuilder(4096);
    private static final ln.a SHARED_STRING_MUTEX = new c();

    /* JADX INFO: renamed from: com.unity3d.ads.adplayer.AndroidWebViewContainer$2, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "it", "Lwj/r;", "<anonymous>", "(Z)V"}, k = 3, mv = {1, 8, 0})
    @e(c = "com.unity3d.ads.adplayer.AndroidWebViewContainer$2", f = "AndroidWebViewContainer.kt", l = {DiagnosticEventRequestOuterClass.DiagnosticEventType.DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_REVENUE_SEND_FAILURE_TIME_VALUE}, m = "invokeSuspend")
    public static final class AnonymousClass2 extends i implements jk.c {
        int label;

        public AnonymousClass2(f fVar) {
            super(2, fVar);
        }

        @Override // ck.a
        public final f create(Object obj, f fVar) {
            return AndroidWebViewContainer.this.new AnonymousClass2(fVar);
        }

        @Override // jk.c
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            return invoke(((Boolean) obj).booleanValue(), (f) obj2);
        }

        @Override // ck.a
        public final Object invokeSuspend(Object obj) throws Throwable {
            int i10 = this.label;
            if (i10 == 0) {
                t9.e.z(obj);
                AndroidWebViewContainer androidWebViewContainer = AndroidWebViewContainer.this;
                this.label = 1;
                Object objOnRenderProcessGone = androidWebViewContainer.onRenderProcessGone(this);
                bk.a aVar = bk.a.f5708a;
                if (objOnRenderProcessGone == aVar) {
                    return aVar;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                t9.e.z(obj);
            }
            return r.f53297a;
        }

        public final Object invoke(boolean z10, f fVar) {
            return ((AnonymousClass2) create(Boolean.valueOf(z10), fVar)).invokeSuspend(r.f53297a);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R$\u0010\u0006\u001a\u00060\u0004j\u0002`\u00058\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0006\u0010\u0007\u0012\u0004\b\n\u0010\u0003\u001a\u0004\b\b\u0010\tR\u0017\u0010\f\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0011\u001a\u00020\u00108\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0013\u001a\u00020\u00108\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0013\u0010\u0012R\u0014\u0010\u0014\u001a\u00020\u00108\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0014\u0010\u0012R\u0014\u0010\u0015\u001a\u00020\u00108\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0015\u0010\u0012¨\u0006\u0016"}, d2 = {"Lcom/unity3d/ads/adplayer/AndroidWebViewContainer$Companion;", "", "<init>", "()V", "Ljava/lang/StringBuilder;", "Lkotlin/text/StringBuilder;", "SHARED_STRING_BUILDER", "Ljava/lang/StringBuilder;", "getSHARED_STRING_BUILDER", "()Ljava/lang/StringBuilder;", "getSHARED_STRING_BUILDER$annotations", "Lln/a;", "SHARED_STRING_MUTEX", "Lln/a;", "getSHARED_STRING_MUTEX", "()Lln/a;", "", "JS_CLOSING_PARENTHESES", "Ljava/lang/String;", "JS_INSTRUCTION", "JS_OPENING_PARENTHESES", "JS_SEMICOLON", "unity-ads_defaultRelease"}, k = 1, mv = {1, 8, 0}, xi = DiagnosticEventRequestOuterClass.DiagnosticEventType.DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_QUALITY_INIT_STARTED_VALUE)
    public static final class Companion {
        public /* synthetic */ Companion(g gVar) {
            this();
        }

        public final StringBuilder getSHARED_STRING_BUILDER() {
            return AndroidWebViewContainer.SHARED_STRING_BUILDER;
        }

        public final ln.a getSHARED_STRING_MUTEX() {
            return AndroidWebViewContainer.SHARED_STRING_MUTEX;
        }

        private Companion() {
        }

        public static /* synthetic */ void getSHARED_STRING_BUILDER$annotations() {
        }
    }

    /* JADX INFO: renamed from: com.unity3d.ads.adplayer.AndroidWebViewContainer$addJavascriptInterface$1, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    @e(c = "com.unity3d.ads.adplayer.AndroidWebViewContainer", f = "AndroidWebViewContainer.kt", l = {158}, m = "addJavascriptInterface")
    @Metadata(k = 3, mv = {1, 8, 0}, xi = DiagnosticEventRequestOuterClass.DiagnosticEventType.DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_QUALITY_INIT_STARTED_VALUE)
    public static final class AnonymousClass1 extends ck.c {
        int label;
        /* synthetic */ Object result;

        public AnonymousClass1(f fVar) {
            super(fVar);
        }

        @Override // ck.a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return AndroidWebViewContainer.this.addJavascriptInterface(null, null, this);
        }
    }

    /* JADX INFO: renamed from: com.unity3d.ads.adplayer.AndroidWebViewContainer$addJavascriptInterface$2, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcn/a0;", "Lwj/r;", "<anonymous>", "(Lcn/a0;)V"}, k = 3, mv = {1, 8, 0})
    @e(c = "com.unity3d.ads.adplayer.AndroidWebViewContainer$addJavascriptInterface$2", f = "AndroidWebViewContainer.kt", l = {}, m = "invokeSuspend")
    public static final class C07042 extends i implements jk.c {
        final /* synthetic */ String $name;
        final /* synthetic */ WebViewBridge $webViewBridgeInterface;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C07042(String str, WebViewBridge webViewBridge, f fVar) {
            super(2, fVar);
            this.$name = str;
            this.$webViewBridgeInterface = webViewBridge;
        }

        @Override // ck.a
        public final f create(Object obj, f fVar) {
            return AndroidWebViewContainer.this.new C07042(this.$name, this.$webViewBridgeInterface, fVar);
        }

        @Override // jk.c
        public final Object invoke(a0 a0Var, f fVar) {
            return ((C07042) create(a0Var, fVar)).invokeSuspend(r.f53297a);
        }

        @Override // ck.a
        public final Object invokeSuspend(Object obj) {
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            t9.e.z(obj);
            final WebViewBridge webViewBridge = this.$webViewBridgeInterface;
            AndroidWebViewContainer.this.getWebView().addJavascriptInterface(new WebViewBridgeInterface() { // from class: com.unity3d.ads.adplayer.AndroidWebViewContainer$addJavascriptInterface$2$wrapper$1
                @Override // com.unity3d.ads.adplayer.model.WebViewBridgeInterface
                @JavascriptInterface
                public void handleCallback(String callbackId, String callbackStatus, String rawParameters) {
                    n.f(callbackId, "callbackId");
                    n.f(callbackStatus, "callbackStatus");
                    n.f(rawParameters, "rawParameters");
                    webViewBridge.handleCallback(callbackId, callbackStatus, rawParameters);
                }

                @Override // com.unity3d.ads.adplayer.model.WebViewBridgeInterface
                @JavascriptInterface
                public void handleInvocation(String message) {
                    n.f(message, "message");
                    webViewBridge.handleInvocation(message);
                }
            }, this.$name);
            return r.f53297a;
        }
    }

    /* JADX INFO: renamed from: com.unity3d.ads.adplayer.AndroidWebViewContainer$destroy$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    @e(c = "com.unity3d.ads.adplayer.AndroidWebViewContainer", f = "AndroidWebViewContainer.kt", l = {176}, m = "destroy")
    @Metadata(k = 3, mv = {1, 8, 0}, xi = DiagnosticEventRequestOuterClass.DiagnosticEventType.DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_QUALITY_INIT_STARTED_VALUE)
    public static final class C07051 extends ck.c {
        Object L$0;
        int label;
        /* synthetic */ Object result;

        public C07051(f fVar) {
            super(fVar);
        }

        @Override // ck.a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return AndroidWebViewContainer.this.destroy(this);
        }
    }

    /* JADX INFO: renamed from: com.unity3d.ads.adplayer.AndroidWebViewContainer$destroy$2, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcn/a0;", "Lwj/r;", "<anonymous>", "(Lcn/a0;)V"}, k = 3, mv = {1, 8, 0})
    @e(c = "com.unity3d.ads.adplayer.AndroidWebViewContainer$destroy$2", f = "AndroidWebViewContainer.kt", l = {}, m = "invokeSuspend")
    public static final class C07062 extends i implements jk.c {
        int label;

        public C07062(f fVar) {
            super(2, fVar);
        }

        @Override // ck.a
        public final f create(Object obj, f fVar) {
            return AndroidWebViewContainer.this.new C07062(fVar);
        }

        @Override // jk.c
        public final Object invoke(a0 a0Var, f fVar) {
            return ((C07062) create(a0Var, fVar)).invokeSuspend(r.f53297a);
        }

        @Override // ck.a
        public final Object invokeSuspend(Object obj) {
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            t9.e.z(obj);
            ViewParent parent = AndroidWebViewContainer.this.getWebView().getParent();
            ViewGroup viewGroup = parent instanceof ViewGroup ? (ViewGroup) parent : null;
            if (viewGroup != null) {
                viewGroup.removeView(AndroidWebViewContainer.this.getWebView());
            }
            AndroidWebViewContainer.this.getWebView().destroy();
            return r.f53297a;
        }
    }

    /* JADX INFO: renamed from: com.unity3d.ads.adplayer.AndroidWebViewContainer$evaluateJavascript$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    @e(c = "com.unity3d.ads.adplayer.AndroidWebViewContainer", f = "AndroidWebViewContainer.kt", l = {221, 150}, m = "evaluateJavascript")
    @Metadata(k = 3, mv = {1, 8, 0}, xi = DiagnosticEventRequestOuterClass.DiagnosticEventType.DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_QUALITY_INIT_STARTED_VALUE)
    public static final class C07071 extends ck.c {
        Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        int label;
        /* synthetic */ Object result;

        public C07071(f fVar) {
            super(fVar);
        }

        @Override // ck.a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return AndroidWebViewContainer.this.evaluateJavascript(null, null, this);
        }
    }

    /* JADX INFO: renamed from: com.unity3d.ads.adplayer.AndroidWebViewContainer$evaluateJavascript$2, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcn/a0;", "Lwj/r;", "<anonymous>", "(Lcn/a0;)V"}, k = 3, mv = {1, 8, 0})
    @e(c = "com.unity3d.ads.adplayer.AndroidWebViewContainer$evaluateJavascript$2", f = "AndroidWebViewContainer.kt", l = {}, m = "invokeSuspend")
    public static final class C07082 extends i implements jk.c {
        final /* synthetic */ String $selectedString;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C07082(String str, f fVar) {
            super(2, fVar);
            this.$selectedString = str;
        }

        @Override // ck.a
        public final f create(Object obj, f fVar) {
            return AndroidWebViewContainer.this.new C07082(this.$selectedString, fVar);
        }

        @Override // jk.c
        public final Object invoke(a0 a0Var, f fVar) {
            return ((C07082) create(a0Var, fVar)).invokeSuspend(r.f53297a);
        }

        @Override // ck.a
        public final Object invokeSuspend(Object obj) {
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            t9.e.z(obj);
            AndroidWebViewContainer.this.getWebView().evaluateJavascript(this.$selectedString, null);
            return r.f53297a;
        }
    }

    /* JADX INFO: renamed from: com.unity3d.ads.adplayer.AndroidWebViewContainer$loadUrl$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    @e(c = "com.unity3d.ads.adplayer.AndroidWebViewContainer", f = "AndroidWebViewContainer.kt", l = {99, InterfaceC0435l1.d.b.f29107d, InterfaceC0435l1.d.b.f29109f}, m = "loadUrl")
    @Metadata(k = 3, mv = {1, 8, 0}, xi = DiagnosticEventRequestOuterClass.DiagnosticEventType.DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_QUALITY_INIT_STARTED_VALUE)
    public static final class C07091 extends ck.c {
        Object L$0;
        Object L$1;
        int label;
        /* synthetic */ Object result;

        public C07091(f fVar) {
            super(fVar);
        }

        @Override // ck.a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return AndroidWebViewContainer.this.loadUrl(null, this);
        }
    }

    /* JADX INFO: renamed from: com.unity3d.ads.adplayer.AndroidWebViewContainer$loadUrl$2, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcn/a0;", "Lwj/r;", "<anonymous>", "(Lcn/a0;)V"}, k = 3, mv = {1, 8, 0})
    @e(c = "com.unity3d.ads.adplayer.AndroidWebViewContainer$loadUrl$2", f = "AndroidWebViewContainer.kt", l = {}, m = "invokeSuspend")
    public static final class C07102 extends i implements jk.c {
        final /* synthetic */ String $url;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C07102(String str, f fVar) {
            super(2, fVar);
            this.$url = str;
        }

        @Override // ck.a
        public final f create(Object obj, f fVar) {
            return AndroidWebViewContainer.this.new C07102(this.$url, fVar);
        }

        @Override // jk.c
        public final Object invoke(a0 a0Var, f fVar) {
            return ((C07102) create(a0Var, fVar)).invokeSuspend(r.f53297a);
        }

        @Override // ck.a
        public final Object invokeSuspend(Object obj) {
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            t9.e.z(obj);
            AndroidWebViewContainer.this.getWebView().loadUrl(this.$url);
            return r.f53297a;
        }
    }

    /* JADX INFO: renamed from: com.unity3d.ads.adplayer.AndroidWebViewContainer$onRenderProcessGone$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    @e(c = "com.unity3d.ads.adplayer.AndroidWebViewContainer", f = "AndroidWebViewContainer.kt", l = {81}, m = "onRenderProcessGone")
    @Metadata(k = 3, mv = {1, 8, 0}, xi = DiagnosticEventRequestOuterClass.DiagnosticEventType.DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_QUALITY_INIT_STARTED_VALUE)
    public static final class C07111 extends ck.c {
        Object L$0;
        int label;
        /* synthetic */ Object result;

        public C07111(f fVar) {
            super(fVar);
        }

        @Override // ck.a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return AndroidWebViewContainer.this.onRenderProcessGone(this);
        }
    }

    public AndroidWebViewContainer(WebView webView, AndroidWebViewClient webViewClient, SendWebViewClientErrorDiagnostics sendWebViewClientErrorDiagnostics, w mainDispatcher, w defaultDispatcher, a0 adPlayerScope, Context context, AdObject adObject, SendDiagnosticEvent sendDiagnosticEvent) {
        n.f(webView, "webView");
        n.f(webViewClient, "webViewClient");
        n.f(sendWebViewClientErrorDiagnostics, "sendWebViewClientErrorDiagnostics");
        n.f(mainDispatcher, "mainDispatcher");
        n.f(defaultDispatcher, "defaultDispatcher");
        n.f(adPlayerScope, "adPlayerScope");
        n.f(context, "context");
        n.f(adObject, "adObject");
        n.f(sendDiagnosticEvent, "sendDiagnosticEvent");
        this.webView = webView;
        this.webViewClient = webViewClient;
        this.sendWebViewClientErrorDiagnostics = sendWebViewClientErrorDiagnostics;
        this.context = context;
        this.adObject = adObject;
        this.sendDiagnosticEvent = sendDiagnosticEvent;
        d dVarY = d0.y(d0.y(adPlayerScope, mainDispatcher), new z("AndroidWebViewContainer"));
        this.scope = dVarY;
        a1 a1VarC = fn.g.c(null);
        this._lastInputEvent = a1VarC;
        this.lastInputEvent = new p0(a1VarC);
        final y0 y0VarIsRenderProcessGone = webViewClient.getIsRenderProcessGone();
        fn.g.o(new s(new fn.e() { // from class: com.unity3d.ads.adplayer.AndroidWebViewContainer$special$$inlined$filter$1

            /* JADX INFO: renamed from: com.unity3d.ads.adplayer.AndroidWebViewContainer$special$$inlined$filter$1$2, reason: invalid class name */
            /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
            @Metadata(d1 = {"\u0000\f\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u00012\u0006\u0010\u0002\u001a\u00028\u0000H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {RequestConfiguration.MAX_AD_CONTENT_RATING_T, "R", X3.i.X, "Lwj/r;", "emit", "(Ljava/lang/Object;Lak/f;)Ljava/lang/Object;", "<anonymous>"}, k = 3, mv = {1, 8, 0})
            public static final class AnonymousClass2<T> implements fn.f {
                final /* synthetic */ fn.f $this_unsafeFlow;

                /* JADX INFO: renamed from: com.unity3d.ads.adplayer.AndroidWebViewContainer$special$$inlined$filter$1$2$1, reason: invalid class name */
                /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
                @e(c = "com.unity3d.ads.adplayer.AndroidWebViewContainer$special$$inlined$filter$1$2", f = "AndroidWebViewContainer.kt", l = {223}, m = "emit")
                @Metadata(k = 3, mv = {1, 8, 0}, xi = DiagnosticEventRequestOuterClass.DiagnosticEventType.DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_QUALITY_INIT_STARTED_VALUE)
                public static final class AnonymousClass1 extends ck.c {
                    Object L$0;
                    Object L$1;
                    int label;
                    /* synthetic */ Object result;

                    public AnonymousClass1(f fVar) {
                        super(fVar);
                    }

                    @Override // ck.a
                    public final Object invokeSuspend(Object obj) {
                        this.result = obj;
                        this.label |= Integer.MIN_VALUE;
                        return AnonymousClass2.this.emit(null, this);
                    }
                }

                public AnonymousClass2(fn.f fVar) {
                    this.$this_unsafeFlow = fVar;
                }

                /* JADX WARN: Code duplicated, block: B:7:0x0013  */
                @Override // fn.f
                public final Object emit(Object obj, f fVar) {
                    AnonymousClass1 anonymousClass1;
                    if (fVar instanceof AnonymousClass1) {
                        anonymousClass1 = (AnonymousClass1) fVar;
                        int i10 = anonymousClass1.label;
                        if ((i10 & Integer.MIN_VALUE) != 0) {
                            anonymousClass1.label = i10 - Integer.MIN_VALUE;
                        } else {
                            anonymousClass1 = new AnonymousClass1(fVar);
                        }
                    } else {
                        anonymousClass1 = new AnonymousClass1(fVar);
                    }
                    Object obj2 = anonymousClass1.result;
                    int i11 = anonymousClass1.label;
                    if (i11 == 0) {
                        t9.e.z(obj2);
                        fn.f fVar2 = this.$this_unsafeFlow;
                        if (((Boolean) obj).booleanValue()) {
                            anonymousClass1.label = 1;
                            Object objEmit = fVar2.emit(obj, anonymousClass1);
                            bk.a aVar = bk.a.f5708a;
                            if (objEmit == aVar) {
                                return aVar;
                            }
                        }
                    } else {
                        if (i11 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        t9.e.z(obj2);
                    }
                    return r.f53297a;
                }
            }

            @Override // fn.e
            public Object collect(fn.f fVar, f fVar2) {
                Object objCollect = y0VarIsRenderProcessGone.collect(new AnonymousClass2(fVar), fVar2);
                return objCollect == bk.a.f5708a ? objCollect : r.f53297a;
            }
        }, new AnonymousClass2(null), 2), d0.y(dVarY, defaultDispatcher));
        webView.setOnTouchListener(new View.OnTouchListener() { // from class: com.unity3d.ads.adplayer.a
            @Override // android.view.View.OnTouchListener
            public final boolean onTouch(View view, MotionEvent motionEvent) {
                return AndroidWebViewContainer._init_$lambda$1(this.f38410a, view, motionEvent);
            }
        });
        applySafeAreaInsets();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean _init_$lambda$1(AndroidWebViewContainer this$0, View view, MotionEvent motionEvent) {
        n.f(this$0, "this$0");
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked != 0 && actionMasked != 1 && actionMasked != 5 && actionMasked != 6) {
            return false;
        }
        a1 a1Var = (a1) this$0._lastInputEvent;
        a1Var.getClass();
        a1Var.e0(null, motionEvent);
        return false;
    }

    private final void applySafeAreaInsets() {
        WebView webView = this.webView;
        a4.a aVar = new a4.a(this, 20);
        WeakHashMap weakHashMap = s0.f45746a;
        l0.b(webView, aVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final r1 applySafeAreaInsets$lambda$6(AndroidWebViewContainer this$0, View v4, r1 insets) throws IOException {
        Object objC;
        n.f(this$0, "this$0");
        n.f(v4, "v");
        n.f(insets, "insets");
        o1 o1Var = insets.f45740a;
        f0.b bVarH = o1Var.h(519);
        n.e(bVarH, "insets.getInsets(WindowI…Compat.Type.systemBars())");
        f0.b bVarH2 = o1Var.h(128);
        n.e(bVarH2, "insets.getInsets(WindowI…pat.Type.displayCutout())");
        try {
            objC = Float.valueOf(this$0.context.getResources().getDisplayMetrics().density);
        } catch (Throwable th2) {
            objC = t9.e.c(th2);
        }
        Object objValueOf = Float.valueOf(1.0f);
        if (objC instanceof wj.g) {
            objC = objValueOf;
        }
        float fFloatValue = ((Number) objC).floatValue();
        int iApplySafeAreaInsets$lambda$6$toPx = applySafeAreaInsets$lambda$6$toPx(Math.max(bVarH.f40258a, bVarH2.f40258a), fFloatValue);
        int iApplySafeAreaInsets$lambda$6$toPx2 = applySafeAreaInsets$lambda$6$toPx(Math.max(bVarH.f40259b, bVarH2.f40259b), fFloatValue);
        int iApplySafeAreaInsets$lambda$6$toPx3 = applySafeAreaInsets$lambda$6$toPx(Math.max(bVarH.f40260c, bVarH2.f40260c), fFloatValue);
        int iApplySafeAreaInsets$lambda$6$toPx4 = applySafeAreaInsets$lambda$6$toPx(Math.max(bVarH.f40261d, bVarH2.f40261d), fFloatValue);
        StringBuilder sbL = l1.d.l("\n                (function() {\n                    const root = document.documentElement;\n                    root.style.setProperty('--safe-area-inset-left', '", iApplySafeAreaInsets$lambda$6$toPx, "px');\n                    root.style.setProperty('--safe-area-inset-right', '", iApplySafeAreaInsets$lambda$6$toPx3, "px');\n                    root.style.setProperty('--safe-area-inset-top', '");
        sbL.append(iApplySafeAreaInsets$lambda$6$toPx2);
        sbL.append("px');\n                    root.style.setProperty('--safe-area-inset-bottom', '");
        sbL.append(iApplySafeAreaInsets$lambda$6$toPx4);
        sbL.append("px');\n                })();\n            ");
        d0.w(this$0.scope, null, new AndroidWebViewContainer$applySafeAreaInsets$1$1(this$0, an.i.a0(sbL.toString()), null), 3);
        return insets;
    }

    private static final int applySafeAreaInsets$lambda$6$toPx(int i10, float f10) {
        return (int) (i10 / f10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object onRenderProcessGone(f fVar) throws Throwable {
        C07111 c07111;
        if (fVar instanceof C07111) {
            c07111 = (C07111) fVar;
            int i10 = c07111.label;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                c07111.label = i10 - Integer.MIN_VALUE;
            } else {
                c07111 = new C07111(fVar);
            }
        } else {
            c07111 = new C07111(fVar);
        }
        Object obj = c07111.result;
        int i11 = c07111.label;
        if (i11 == 0) {
            t9.e.z(obj);
            c07111.L$0 = this;
            c07111.label = 1;
            Object objDestroy = destroy(c07111);
            bk.a aVar = bk.a.f5708a;
            if (objDestroy == aVar) {
                return aVar;
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            this = (AndroidWebViewContainer) c07111.L$0;
            t9.e.z(obj);
        }
        SendDiagnosticEvent.DefaultImpls.invoke$default(this.sendDiagnosticEvent, DiagnosticEventRequestOuterClass.DiagnosticEventType.DIAGNOSTIC_EVENT_TYPE_NATIVE_WEBVIEW_TERMINATED, (Double) null, (Map) null, (Map) null, (AdObject) null, (Integer) null, 62, (Object) null);
        this.sendWebViewClientErrorDiagnostics.invoke(j1.f.C(new WebViewClientError("Render process gone", ErrorReason.REASON_WEBVIEW_RENDER_PROCESS_GONE, null, 4, null)), this.adObject);
        return r.f53297a;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // com.unity3d.ads.adplayer.WebViewContainer
    public Object addJavascriptInterface(WebViewBridge webViewBridge, String str, f fVar) throws Throwable {
        AnonymousClass1 anonymousClass1;
        if (fVar instanceof AnonymousClass1) {
            anonymousClass1 = (AnonymousClass1) fVar;
            int i10 = anonymousClass1.label;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                anonymousClass1.label = i10 - Integer.MIN_VALUE;
            } else {
                anonymousClass1 = new AnonymousClass1(fVar);
            }
        } else {
            anonymousClass1 = new AnonymousClass1(fVar);
        }
        Object obj = anonymousClass1.result;
        int i11 = anonymousClass1.label;
        try {
            if (i11 == 0) {
                t9.e.z(obj);
                k coroutineContext = this.scope.getCoroutineContext();
                C07042 c07042 = new C07042(str, webViewBridge, null);
                anonymousClass1.label = 1;
                Object objJ = d0.J(coroutineContext, c07042, anonymousClass1);
                bk.a aVar = bk.a.f5708a;
                if (objJ == aVar) {
                    return aVar;
                }
            } else {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                t9.e.z(obj);
            }
        } catch (CancellationException unused) {
        }
        return r.f53297a;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // com.unity3d.ads.adplayer.WebViewContainer
    public Object destroy(f fVar) throws Throwable {
        C07051 c07051;
        if (fVar instanceof C07051) {
            c07051 = (C07051) fVar;
            int i10 = c07051.label;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                c07051.label = i10 - Integer.MIN_VALUE;
            } else {
                c07051 = new C07051(fVar);
            }
        } else {
            c07051 = new C07051(fVar);
        }
        Object obj = c07051.result;
        int i11 = c07051.label;
        if (i11 == 0) {
            t9.e.z(obj);
            k kVarPlus = this.scope.getCoroutineContext().plus(u1.f6774a);
            C07062 c07062 = new C07062(null);
            c07051.L$0 = this;
            c07051.label = 1;
            Object objJ = d0.J(kVarPlus, c07062, c07051);
            bk.a aVar = bk.a.f5708a;
            if (objJ == aVar) {
                return aVar;
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            this = (AndroidWebViewContainer) c07051.L$0;
            t9.e.z(obj);
        }
        d0.j(this.scope);
        return r.f53297a;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0015  */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x00f7, code lost:
    
        if (r10.N(r1) == r8) goto L31;
     */
    @Override // com.unity3d.ads.adplayer.WebViewContainer
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Object evaluateJavascript(com.unity3d.ads.adplayer.HandlerType r11, org.json.JSONArray r12, ak.f r13) {
        /*
            Method dump skipped, instruction units count: 260
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.unity3d.ads.adplayer.AndroidWebViewContainer.evaluateJavascript(com.unity3d.ads.adplayer.HandlerType, org.json.JSONArray, ak.f):java.lang.Object");
    }

    @Override // com.unity3d.ads.adplayer.WebViewContainer
    public y0 getLastInputEvent() {
        return this.lastInputEvent;
    }

    public final a0 getScope() {
        return this.scope;
    }

    public final WebView getWebView() {
        return this.webView;
    }

    public final n0 get_lastInputEvent() {
        return this._lastInputEvent;
    }

    /* JADX WARN: Code duplicated, block: B:27:0x0085  */
    /* JADX WARN: Code duplicated, block: B:32:0x009f  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x008f, code lost:
    
        if (r8.destroy(r0) == r5) goto L29;
     */
    @Override // com.unity3d.ads.adplayer.WebViewContainer
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Object loadUrl(java.lang.String r8, ak.f r9) throws com.unity3d.ads.adplayer.LoadWebViewError {
        /*
            r7 = this;
            boolean r0 = r9 instanceof com.unity3d.ads.adplayer.AndroidWebViewContainer.C07091
            if (r0 == 0) goto L13
            r0 = r9
            com.unity3d.ads.adplayer.AndroidWebViewContainer$loadUrl$1 r0 = (com.unity3d.ads.adplayer.AndroidWebViewContainer.C07091) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            com.unity3d.ads.adplayer.AndroidWebViewContainer$loadUrl$1 r0 = new com.unity3d.ads.adplayer.AndroidWebViewContainer$loadUrl$1
            r0.<init>(r9)
        L18:
            java.lang.Object r9 = r0.result
            int r1 = r0.label
            r2 = 3
            r3 = 2
            r4 = 1
            bk.a r5 = bk.a.f5708a
            if (r1 == 0) goto L4e
            if (r1 == r4) goto L46
            if (r1 == r3) goto L3d
            if (r1 == r2) goto L31
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L31:
            java.lang.Object r7 = r0.L$1
            java.util.List r7 = (java.util.List) r7
            java.lang.Object r8 = r0.L$0
            com.unity3d.ads.adplayer.AndroidWebViewContainer r8 = (com.unity3d.ads.adplayer.AndroidWebViewContainer) r8
            t9.e.z(r9)
            goto L92
        L3d:
            java.lang.Object r7 = r0.L$0
            com.unity3d.ads.adplayer.AndroidWebViewContainer r7 = (com.unity3d.ads.adplayer.AndroidWebViewContainer) r7
            t9.e.z(r9)
        L44:
            r8 = r7
            goto L79
        L46:
            java.lang.Object r7 = r0.L$0
            com.unity3d.ads.adplayer.AndroidWebViewContainer r7 = (com.unity3d.ads.adplayer.AndroidWebViewContainer) r7
            t9.e.z(r9)
            goto L68
        L4e:
            t9.e.z(r9)
            cn.a0 r9 = r7.scope
            ak.k r9 = r9.getCoroutineContext()
            com.unity3d.ads.adplayer.AndroidWebViewContainer$loadUrl$2 r1 = new com.unity3d.ads.adplayer.AndroidWebViewContainer$loadUrl$2
            r6 = 0
            r1.<init>(r8, r6)
            r0.L$0 = r7
            r0.label = r4
            java.lang.Object r8 = cn.d0.J(r9, r1, r0)
            if (r8 != r5) goto L68
            goto L91
        L68:
            com.unity3d.ads.adplayer.AndroidWebViewClient r8 = r7.webViewClient
            cn.g0 r8 = r8.getOnLoadFinished()
            r0.L$0 = r7
            r0.label = r3
            java.lang.Object r9 = r8.o(r0)
            if (r9 != r5) goto L44
            goto L91
        L79:
            r7 = r9
            java.util.List r7 = (java.util.List) r7
            r9 = r7
            java.util.Collection r9 = (java.util.Collection) r9
            boolean r9 = r9.isEmpty()
            if (r9 != 0) goto L9f
            r0.L$0 = r8
            r0.L$1 = r7
            r0.label = r2
            java.lang.Object r9 = r8.destroy(r0)
            if (r9 != r5) goto L92
        L91:
            return r5
        L92:
            com.unity3d.ads.core.domain.SendWebViewClientErrorDiagnostics r9 = r8.sendWebViewClientErrorDiagnostics
            com.unity3d.ads.core.data.model.AdObject r8 = r8.adObject
            r9.invoke(r7, r8)
            com.unity3d.ads.adplayer.LoadWebViewError r8 = new com.unity3d.ads.adplayer.LoadWebViewError
            r8.<init>(r7)
            throw r8
        L9f:
            wj.r r7 = wj.r.f53297a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.unity3d.ads.adplayer.AndroidWebViewContainer.loadUrl(java.lang.String, ak.f):java.lang.Object");
    }
}
