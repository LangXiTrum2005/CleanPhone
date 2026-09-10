package com.inmobi.media;

import android.graphics.Bitmap;
import android.net.http.SslError;
import android.os.Build;
import android.os.SystemClock;
import android.webkit.RenderProcessGoneDetail;
import android.webkit.SslErrorHandler;
import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import java.util.Map;
import java.util.concurrent.ScheduledExecutorService;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* JADX INFO: renamed from: com.inmobi.media.fc, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C3021fc extends Y1 {
    public final C3149nc f;
    public final Nb g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f23614h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final String f23615i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3021fc(C3149nc c3149nc, InterfaceC3333z5 interfaceC3333z5, Nb onRenderViewProcessGone) {
        super(interfaceC3333z5);
        Intrinsics.f(onRenderViewProcessGone, "onRenderViewProcessGone");
        this.f = c3149nc;
        this.g = onRenderViewProcessGone;
        this.f23615i = "redirect";
    }

    public final boolean a(WebView webView, String str) {
        String str2;
        boolean z2;
        InterfaceC3333z5 interfaceC3333z5 = this.f23358a;
        if (interfaceC3333z5 != null) {
            ((A5) interfaceC3333z5).a("RenderViewClient", AbstractC3041h0.a("onShouldOverrideUrlLoading  - url - ", str));
        }
        if (webView instanceof GestureDetectorOnGestureListenerC3005ec) {
            GestureDetectorOnGestureListenerC3005ec gestureDetectorOnGestureListenerC3005ec = (GestureDetectorOnGestureListenerC3005ec) webView;
            z2 = true;
            if (gestureDetectorOnGestureListenerC3005ec.y) {
                webView.loadUrl(str);
                return true;
            }
            if (!gestureDetectorOnGestureListenerC3005ec.a()) {
                gestureDetectorOnGestureListenerC3005ec.a(this.f23615i);
                return true;
            }
            InterfaceC3333z5 interfaceC3333z6 = this.f23358a;
            if (interfaceC3333z6 != null) {
                ((A5) interfaceC3333z6).a("RenderViewClient", "Placement type:  " + ((int) gestureDetectorOnGestureListenerC3005ec.getPlacementType()) + "  url:" + str);
            }
            InterfaceC3333z5 interfaceC3333z7 = this.f23358a;
            if (interfaceC3333z7 != null) {
                ((A5) interfaceC3333z7).a("RenderViewClient", AbstractC3041h0.a("Override URL loading :", str));
            }
            gestureDetectorOnGestureListenerC3005ec.l();
            str2 = str;
            K6 k6A = M6.a(gestureDetectorOnGestureListenerC3005ec.getLandingPageHandler(), this.f23615i, null, str2, null, false, 24);
            InterfaceC3333z5 interfaceC3333z8 = this.f23358a;
            if (interfaceC3333z8 != null) {
                ((A5) interfaceC3333z8).a("RenderViewClient", "Current Index :" + gestureDetectorOnGestureListenerC3005ec.copyBackForwardList().getCurrentIndex() + " Original Url :" + gestureDetectorOnGestureListenerC3005ec.getOriginalUrl() + " URL: " + str2);
            }
            InterfaceC3333z5 interfaceC3333z9 = this.f23358a;
            if (interfaceC3333z9 != null) {
                ((A5) interfaceC3333z9).c("RenderViewClient", "landingPage process result - " + k6A.f22922a);
            }
        } else {
            str2 = str;
            z2 = false;
        }
        InterfaceC3333z5 interfaceC3333z10 = this.f23358a;
        if (interfaceC3333z10 != null) {
            ((A5) interfaceC3333z10).a("RenderViewClient", "Override URL loading :" + str2 + " returned " + z2);
        }
        return z2;
    }

    @Override // android.webkit.WebViewClient
    public final void onLoadResource(WebView webView, String str) {
        InterfaceC3333z5 interfaceC3333z5 = this.f23358a;
        if (interfaceC3333z5 != null) {
            ((A5) interfaceC3333z5).a("RenderViewClient", AbstractC3041h0.a("Resource loading:", str));
        }
        if (webView instanceof GestureDetectorOnGestureListenerC3005ec) {
            GestureDetectorOnGestureListenerC3005ec gestureDetectorOnGestureListenerC3005ec = (GestureDetectorOnGestureListenerC3005ec) webView;
            String url = gestureDetectorOnGestureListenerC3005ec.getUrl();
            if (str == null || url == null || StringsKt.M(url, "file:", false)) {
                return;
            }
            a(gestureDetectorOnGestureListenerC3005ec);
        }
    }

    @Override // com.inmobi.media.Y1, android.webkit.WebViewClient
    public final void onPageFinished(WebView webView, String str) {
        C3149nc c3149nc = this.f;
        if (c3149nc != null) {
            Map mapA = c3149nc.a();
            long j = c3149nc.f23836c;
            ScheduledExecutorService scheduledExecutorService = Ie.f22893a;
            mapA.put("latency", Long.valueOf(SystemClock.elapsedRealtime() - j));
            String strA = c3149nc.a("WebViewLoadFinished");
            Pd pd = Pd.f23077a;
            Pd.b(strA, mapA, Td.SDK);
        }
        InterfaceC3333z5 interfaceC3333z5 = this.f23358a;
        if (interfaceC3333z5 != null) {
            ((A5) interfaceC3333z5).a("RenderViewClient", AbstractC3041h0.a("Page load finished:", str));
        }
        if (webView instanceof GestureDetectorOnGestureListenerC3005ec) {
            GestureDetectorOnGestureListenerC3005ec gestureDetectorOnGestureListenerC3005ec = (GestureDetectorOnGestureListenerC3005ec) webView;
            a(gestureDetectorOnGestureListenerC3005ec);
            if ("Loading".equals(gestureDetectorOnGestureListenerC3005ec.f23591u)) {
                gestureDetectorOnGestureListenerC3005ec.c("window.imaiview.broadcastEvent('ready');");
                gestureDetectorOnGestureListenerC3005ec.c("window.mraidview.broadcastEvent('ready');");
                gestureDetectorOnGestureListenerC3005ec.B();
            }
        }
        InterfaceC3333z5 interfaceC3333z6 = this.f23358a;
        if (interfaceC3333z6 != null) {
            ((A5) interfaceC3333z6).a("RenderViewClient", "==== CHECKPOINT REACHED - PAGE FINISHED ====");
        }
        InterfaceC3333z5 interfaceC3333z7 = this.f23358a;
        if (interfaceC3333z7 != null) {
            ((A5) interfaceC3333z7).b();
        }
    }

    @Override // android.webkit.WebViewClient
    public final void onPageStarted(WebView webView, String str, Bitmap bitmap) {
        C3149nc c3149nc = this.f;
        if (c3149nc != null) {
            Map mapA = c3149nc.a();
            long j = c3149nc.f23836c;
            ScheduledExecutorService scheduledExecutorService = Ie.f22893a;
            mapA.put("latency", Long.valueOf(SystemClock.elapsedRealtime() - j));
            String strA = c3149nc.a("PageStarted");
            Pd pd = Pd.f23077a;
            Pd.b(strA, mapA, Td.SDK);
        }
        InterfaceC3333z5 interfaceC3333z5 = this.f23358a;
        if (interfaceC3333z5 != null) {
            ((A5) interfaceC3333z5).a("RenderViewClient", AbstractC3041h0.a("Page load started:", str));
        }
        if (webView instanceof GestureDetectorOnGestureListenerC3005ec) {
            InterfaceC3333z5 interfaceC3333z6 = this.f23358a;
            if (interfaceC3333z6 != null) {
                ((A5) interfaceC3333z6).a("RenderViewClient", "Page load started renderview: " + ((GestureDetectorOnGestureListenerC3005ec) webView).getMarkupType());
            }
            GestureDetectorOnGestureListenerC3005ec gestureDetectorOnGestureListenerC3005ec = (GestureDetectorOnGestureListenerC3005ec) webView;
            a(gestureDetectorOnGestureListenerC3005ec);
            gestureDetectorOnGestureListenerC3005ec.setAndUpdateViewState("Loading");
        }
        InterfaceC3333z5 interfaceC3333z7 = this.f23358a;
        if (interfaceC3333z7 != null) {
            ((A5) interfaceC3333z7).a("RenderViewClient", "==== CHECKPOINT REACHED - PAGE STARTED ====");
        }
        InterfaceC3333z5 interfaceC3333z8 = this.f23358a;
        if (interfaceC3333z8 != null) {
            ((A5) interfaceC3333z8).b();
        }
    }

    @Override // android.webkit.WebViewClient
    public final void onReceivedError(WebView view, int i2, String description, String failingUrl) {
        Intrinsics.f(view, "view");
        Intrinsics.f(description, "description");
        Intrinsics.f(failingUrl, "failingUrl");
        InterfaceC3333z5 interfaceC3333z5 = this.f23358a;
        if (interfaceC3333z5 != null) {
            ((A5) interfaceC3333z5).b("RenderViewClient", "OnReceivedError - errorCode - " + i2 + ", description - " + description + ", url - " + failingUrl);
        }
        super.onReceivedError(view, i2, description, failingUrl);
    }

    @Override // android.webkit.WebViewClient
    public final void onReceivedHttpError(WebView webView, WebResourceRequest webResourceRequest, WebResourceResponse webResourceResponse) {
        super.onReceivedHttpError(webView, webResourceRequest, webResourceResponse);
        InterfaceC3333z5 interfaceC3333z5 = this.f23358a;
        if (interfaceC3333z5 != null) {
            StringBuilder sb = new StringBuilder("ReceivedHttpError - error - ");
            sb.append(webResourceResponse != null ? webResourceResponse.getReasonPhrase() : null);
            sb.append(", statusCode - ");
            sb.append(webResourceResponse != null ? Integer.valueOf(webResourceResponse.getStatusCode()) : null);
            sb.append(" url - ");
            sb.append(webResourceRequest != null ? webResourceRequest.getUrl() : null);
            sb.append(" isMainFrame - ");
            sb.append(webResourceRequest != null ? Boolean.valueOf(webResourceRequest.isForMainFrame()) : null);
            ((A5) interfaceC3333z5).b("RenderViewClient", sb.toString());
        }
    }

    @Override // android.webkit.WebViewClient
    public final void onReceivedSslError(WebView webView, SslErrorHandler sslErrorHandler, SslError sslError) {
        super.onReceivedSslError(webView, sslErrorHandler, sslError);
        InterfaceC3333z5 interfaceC3333z5 = this.f23358a;
        if (interfaceC3333z5 != null) {
            StringBuilder sb = new StringBuilder("onReceivedSSLError - error - ");
            sb.append(sslError != null ? Integer.valueOf(sslError.getPrimaryError()) : null);
            sb.append(" - url - ");
            sb.append(sslError != null ? sslError.getUrl() : null);
            ((A5) interfaceC3333z5).b("RenderViewClient", sb.toString());
        }
    }

    @Override // com.inmobi.media.Y1, android.webkit.WebViewClient
    public final boolean onRenderProcessGone(WebView view, RenderProcessGoneDetail detail) {
        Intrinsics.f(view, "view");
        Intrinsics.f(detail, "detail");
        if (Build.VERSION.SDK_INT >= 26) {
            InterfaceC3333z5 interfaceC3333z5 = this.f23358a;
            if (interfaceC3333z5 != null) {
                ((A5) interfaceC3333z5).c("RenderViewClient", "onRenderProcessGone detail did crash- " + detail.didCrash() + " priority - " + detail.rendererPriorityAtExit());
            }
            this.g.invoke(Boolean.valueOf(detail.didCrash()));
        } else {
            InterfaceC3333z5 interfaceC3333z6 = this.f23358a;
            if (interfaceC3333z6 != null) {
                ((A5) interfaceC3333z6).c("RenderViewClient", "onRenderProcessGone");
            }
        }
        return super.onRenderProcessGone(view, detail);
    }

    @Override // android.webkit.WebViewClient
    public final boolean shouldOverrideUrlLoading(WebView view, WebResourceRequest request) {
        Intrinsics.f(view, "view");
        Intrinsics.f(request, "request");
        InterfaceC3333z5 interfaceC3333z5 = this.f23358a;
        if (interfaceC3333z5 != null) {
            ((A5) interfaceC3333z5).a("RenderViewClient", "shouldOverrideUrlLoading Called");
        }
        if (!L3.G()) {
            return false;
        }
        String string = request.getUrl().toString();
        Intrinsics.e(string, "toString(...)");
        return a(view, string);
    }

    @Override // android.webkit.WebViewClient
    public final void onReceivedError(WebView view, WebResourceRequest request, WebResourceError error) {
        Intrinsics.f(view, "view");
        Intrinsics.f(request, "request");
        Intrinsics.f(error, "error");
        super.onReceivedError(view, request, error);
        InterfaceC3333z5 interfaceC3333z5 = this.f23358a;
        if (interfaceC3333z5 != null) {
            ((A5) interfaceC3333z5).b("RenderViewClient", "OnReceivedError - errorCode - " + error.getErrorCode() + ", description - " + ((Object) error.getDescription()) + ", url - " + request.getUrl() + ", method - " + request.getMethod() + ", isMainFrame - " + request.isForMainFrame());
        }
    }

    @Override // android.webkit.WebViewClient
    public final boolean shouldOverrideUrlLoading(WebView view, String url) {
        Intrinsics.f(view, "view");
        Intrinsics.f(url, "url");
        InterfaceC3333z5 interfaceC3333z5 = this.f23358a;
        if (interfaceC3333z5 != null) {
            ((A5) interfaceC3333z5).a("RenderViewClient", AbstractC3041h0.a("shouldOverrideUrlLoading Called ", url));
        }
        return a(view, url);
    }

    public final void a(GestureDetectorOnGestureListenerC3005ec gestureDetectorOnGestureListenerC3005ec) {
        if (this.f23614h || gestureDetectorOnGestureListenerC3005ec.f23585e) {
            return;
        }
        this.f23614h = true;
        InterfaceC3333z5 interfaceC3333z5 = this.f23358a;
        if (interfaceC3333z5 != null) {
            ((A5) interfaceC3333z5).a("RenderViewClient", "Injecting MRAID javascript for two piece creatives.");
        }
        gestureDetectorOnGestureListenerC3005ec.c(gestureDetectorOnGestureListenerC3005ec.getMraidJsString());
    }
}
