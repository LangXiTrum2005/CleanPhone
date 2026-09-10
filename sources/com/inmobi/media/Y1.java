package com.inmobi.media;

import A.RunnableC0883c;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.webkit.RenderProcessGoneDetail;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.p004ironsource.ko;
import java.util.LinkedHashMap;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public abstract class Y1 extends WebViewClient {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final InterfaceC3333z5 f23358a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f23360c;
    public boolean d;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f23359b = -1;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final AtomicBoolean f23361e = new AtomicBoolean(false);

    public Y1(InterfaceC3333z5 interfaceC3333z5) {
        this.f23358a = interfaceC3333z5;
    }

    public final void a(WebView view) {
        Intrinsics.f(view, "view");
        this.f23361e.set(true);
        view.postDelayed(new RunnableC0883c(this, 10), 1000L);
    }

    public final void b(WebView webView) {
        String str;
        Z z2;
        String strB;
        String str2;
        String str3;
        Z z3;
        String strM;
        T0 t0;
        int i2 = this.f23359b;
        if (-1 != i2) {
            if (i2 > 0) {
                this.f23359b = i2 - 1;
                return;
            }
            if (this.f23360c) {
                return;
            }
            new Handler(Looper.getMainLooper()).post(new G9(webView));
            this.f23360c = true;
            if (webView instanceof GestureDetectorOnGestureListenerC3005ec) {
                GestureDetectorOnGestureListenerC3005ec gestureDetectorOnGestureListenerC3005ec = (GestureDetectorOnGestureListenerC3005ec) webView;
                InterfaceC3333z5 interfaceC3333z5 = gestureDetectorOnGestureListenerC3005ec.f23587i;
                if (interfaceC3333z5 != null) {
                    String str4 = GestureDetectorOnGestureListenerC3005ec.a1;
                    ((A5) interfaceC3333z5).a(str4, Ob.a(gestureDetectorOnGestureListenerC3005ec, str4, "TAG", "sendTelemetryEventForNetworkLoad "));
                }
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                String creativeId = gestureDetectorOnGestureListenerC3005ec.getCreativeId();
                if (creativeId != null) {
                    linkedHashMap.put("creativeId", creativeId);
                }
                String impressionId = gestureDetectorOnGestureListenerC3005ec.getImpressionId();
                if (impressionId != null) {
                    linkedHashMap.put("impressionId", impressionId);
                }
                linkedHashMap.put("errorCode", Short.valueOf(gestureDetectorOnGestureListenerC3005ec.x0 ? (short) 2212 : (short) 2211));
                C3053hc c3053hc = gestureDetectorOnGestureListenerC3005ec.f23586h;
                if (c3053hc != null && (t0 = c3053hc.f23669i) != null) {
                    linkedHashMap.put("latency", Long.valueOf(SystemClock.elapsedRealtime() - t0.f23192a.f23243c));
                }
                C3053hc c3053hc2 = gestureDetectorOnGestureListenerC3005ec.f23586h;
                if (c3053hc2 != null && (z3 = c3053hc2.f23664a) != null && (strM = z3.m()) != null) {
                    linkedHashMap.put("plType", strM);
                }
                C3053hc c3053hc3 = gestureDetectorOnGestureListenerC3005ec.f23586h;
                if (c3053hc3 != null && (str3 = c3053hc3.f23667e) != null) {
                    linkedHashMap.put("creativeType", str3);
                }
                C3053hc c3053hc4 = gestureDetectorOnGestureListenerC3005ec.f23586h;
                if (c3053hc4 != null && (str2 = c3053hc4.f23665b) != null) {
                    linkedHashMap.put("markupType", str2);
                }
                C3053hc c3053hc5 = gestureDetectorOnGestureListenerC3005ec.f23586h;
                if (c3053hc5 != null && (z2 = c3053hc5.f23664a) != null && (strB = z2.b()) != null) {
                    linkedHashMap.put("adType", strB);
                }
                C3053hc c3053hc6 = gestureDetectorOnGestureListenerC3005ec.f23586h;
                if (c3053hc6 != null && (str = c3053hc6.f23666c) != null) {
                    linkedHashMap.put("metadataBlob", str);
                }
                C3053hc c3053hc7 = gestureDetectorOnGestureListenerC3005ec.f23586h;
                if (c3053hc7 != null) {
                    linkedHashMap.put("isRewarded", Boolean.valueOf(c3053hc7.g));
                }
                InterfaceC3333z5 interfaceC3333z6 = gestureDetectorOnGestureListenerC3005ec.f23587i;
                if (interfaceC3333z6 != null) {
                    String str5 = GestureDetectorOnGestureListenerC3005ec.a1;
                    ((A5) interfaceC3333z6).a(str5, Ob.a(gestureDetectorOnGestureListenerC3005ec, str5, "TAG", "processTelemetryEvent "));
                }
                gestureDetectorOnGestureListenerC3005ec.getListener().a("NetworkLoadLimitExceeded", linkedHashMap);
            }
        }
    }

    @Override // android.webkit.WebViewClient
    public void onPageFinished(WebView webView, String str) {
        if (this.d) {
            this.d = false;
            if (webView != null) {
                webView.clearHistory();
            }
        }
        super.onPageFinished(webView, str);
    }

    @Override // android.webkit.WebViewClient
    public boolean onRenderProcessGone(WebView view, RenderProcessGoneDetail detail) {
        Intrinsics.f(view, "view");
        Intrinsics.f(detail, "detail");
        if (Build.VERSION.SDK_INT < 26) {
            return false;
        }
        AbstractC3048h7.a((byte) 1, "BaseWebViewClient", "WebView crash detected, destroying ad");
        view.destroy();
        return true;
    }

    @Override // android.webkit.WebViewClient
    public final WebResourceResponse shouldInterceptRequest(WebView view, String url) {
        Intrinsics.f(view, "view");
        Intrinsics.f(url, "url");
        WebResourceResponse webResourceResponseA = qf.a(url, this.f23358a);
        return webResourceResponseA == null ? super.shouldInterceptRequest(view, url) : webResourceResponseA;
    }

    public static final void a(Y1 this$0) {
        Intrinsics.f(this$0, "this$0");
        this$0.f23361e.set(false);
    }

    @Override // android.webkit.WebViewClient
    public final WebResourceResponse shouldInterceptRequest(WebView view, WebResourceRequest request) {
        WebResourceResponse webResourceResponseA;
        Intrinsics.f(view, "view");
        Intrinsics.f(request, "request");
        b(view);
        InterfaceC3333z5 interfaceC3333z5 = this.f23358a;
        if (ko.f25534a.equalsIgnoreCase(request.getMethod())) {
            String string = request.getUrl().toString();
            Intrinsics.e(string, "toString(...)");
            webResourceResponseA = qf.a(string, interfaceC3333z5);
        } else {
            webResourceResponseA = null;
        }
        return webResourceResponseA == null ? super.shouldInterceptRequest(view, request) : webResourceResponseA;
    }
}
