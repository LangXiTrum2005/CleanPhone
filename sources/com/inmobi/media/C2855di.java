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
import kotlinx.coroutines.cutely;
import kotlinx.coroutines.saran;
import p002kotlin.jvm.functions.Function1;
import p002kotlin.jvm.internal.Intrinsics;
import p002kotlin.text.dovishness;

/* JADX INFO: renamed from: com.inmobi.media.di, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C2855di extends AbstractC3389z2 {
    public final C3081mi f;
    public final Function1 g;
    public boolean h;
    public final String i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2855di(C3081mi c3081mi, InterfaceC3072m9 interfaceC3072m9, Function1 onRenderViewProcessGone) {
        super(interfaceC3072m9);
        Intrinsics.checkNotNullParameter(onRenderViewProcessGone, "onRenderViewProcessGone");
        this.f = c3081mi;
        this.g = onRenderViewProcessGone;
        this.i = "redirect";
    }

    public final boolean a(WebView webView, String str) {
        boolean z;
        InterfaceC3072m9 interfaceC3072m9 = this.a;
        if (interfaceC3072m9 != null) {
            ((C3097n9) interfaceC3072m9).a("RenderViewClient", "onShouldOverrideUrlLoading  - url - " + str);
        }
        if (webView instanceof GestureDetectorOnGestureListenerC2829ci) {
            GestureDetectorOnGestureListenerC2829ci gestureDetectorOnGestureListenerC2829ci = (GestureDetectorOnGestureListenerC2829ci) webView;
            z = true;
            if (!gestureDetectorOnGestureListenerC2829ci.a()) {
                gestureDetectorOnGestureListenerC2829ci.a(this.i);
                return true;
            }
            InterfaceC3072m9 interfaceC3072m10 = this.a;
            if (interfaceC3072m10 != null) {
                ((C3097n9) interfaceC3072m10).a("RenderViewClient", "Placement type:  " + ((int) gestureDetectorOnGestureListenerC2829ci.getPlacementType()) + "  url:" + str);
            }
            a(gestureDetectorOnGestureListenerC2829ci, str);
        } else {
            z = false;
        }
        InterfaceC3072m9 interfaceC3072m11 = this.a;
        if (interfaceC3072m11 != null) {
            ((C3097n9) interfaceC3072m11).a("RenderViewClient", "Override URL loading :" + str + " returned " + z);
        }
        return z;
    }

    @Override // android.webkit.WebViewClient
    public final void onLoadResource(WebView webView, String str) {
        InterfaceC3072m9 interfaceC3072m9 = this.a;
        if (interfaceC3072m9 != null) {
            ((C3097n9) interfaceC3072m9).a("RenderViewClient", "Resource loading:" + str);
        }
        if (webView instanceof GestureDetectorOnGestureListenerC2829ci) {
            GestureDetectorOnGestureListenerC2829ci gestureDetectorOnGestureListenerC2829ci = (GestureDetectorOnGestureListenerC2829ci) webView;
            String url = gestureDetectorOnGestureListenerC2829ci.getUrl();
            if (str == null || url == null || dovishness.starveling(url, "file:", false, 2, null)) {
                return;
            }
            a(gestureDetectorOnGestureListenerC2829ci);
        }
    }

    @Override // com.inmobi.media.AbstractC3389z2, android.webkit.WebViewClient
    public final void onPageFinished(WebView webView, String str) {
        Gh gh;
        C3081mi c3081mi = this.f;
        if (c3081mi != null) {
            Map mapA = c3081mi.a();
            long j = c3081mi.c;
            saran saranVar = AbstractC2984il.a;
            mapA.put("latency", Long.valueOf(SystemClock.elapsedRealtime() - j));
            String strA = c3081mi.a("WebViewLoadFinished");
            Wj wj = Wj.a;
            Wj.b(strA, mapA, EnumC2779ak.SDK);
        }
        InterfaceC3072m9 interfaceC3072m9 = this.a;
        if (interfaceC3072m9 != null) {
            ((C3097n9) interfaceC3072m9).a("RenderViewClient", "Page load finished:" + str);
        }
        if (webView instanceof GestureDetectorOnGestureListenerC2829ci) {
            GestureDetectorOnGestureListenerC2829ci gestureDetectorOnGestureListenerC2829ci = (GestureDetectorOnGestureListenerC2829ci) webView;
            a(gestureDetectorOnGestureListenerC2829ci);
            if (Intrinsics.wireman("Loading", gestureDetectorOnGestureListenerC2829ci.z)) {
                gestureDetectorOnGestureListenerC2829ci.g("window.imaiview.broadcastEvent('ready');");
                gestureDetectorOnGestureListenerC2829ci.g("window.mraidview.broadcastEvent('ready');");
                cutely.wireman(A9.c, null, null, new Zh(gestureDetectorOnGestureListenerC2829ci, null), 3, null);
            }
        }
        InterfaceC3072m9 interfaceC3072m10 = this.a;
        if (interfaceC3072m10 != null) {
            ((C3097n9) interfaceC3072m10).a("RenderViewClient", "==== CHECKPOINT REACHED - PAGE FINISHED ====");
        }
        InterfaceC3072m9 interfaceC3072m11 = this.a;
        if (interfaceC3072m11 == null || (gh = ((C3097n9) interfaceC3072m11).a) == null) {
            return;
        }
        gh.a();
    }

    @Override // android.webkit.WebViewClient
    public final void onPageStarted(WebView webView, String str, Bitmap bitmap) {
        Gh gh;
        C3081mi c3081mi = this.f;
        if (c3081mi != null) {
            Map mapA = c3081mi.a();
            long j = c3081mi.c;
            saran saranVar = AbstractC2984il.a;
            mapA.put("latency", Long.valueOf(SystemClock.elapsedRealtime() - j));
            String strA = c3081mi.a("PageStarted");
            Wj wj = Wj.a;
            Wj.b(strA, mapA, EnumC2779ak.SDK);
        }
        InterfaceC3072m9 interfaceC3072m9 = this.a;
        if (interfaceC3072m9 != null) {
            ((C3097n9) interfaceC3072m9).a("RenderViewClient", "Page load started:" + str);
        }
        if (webView instanceof GestureDetectorOnGestureListenerC2829ci) {
            InterfaceC3072m9 interfaceC3072m10 = this.a;
            if (interfaceC3072m10 != null) {
                ((C3097n9) interfaceC3072m10).a("RenderViewClient", "Page load started renderview: " + ((GestureDetectorOnGestureListenerC2829ci) webView).getMarkupType());
            }
            GestureDetectorOnGestureListenerC2829ci gestureDetectorOnGestureListenerC2829ci = (GestureDetectorOnGestureListenerC2829ci) webView;
            a(gestureDetectorOnGestureListenerC2829ci);
            gestureDetectorOnGestureListenerC2829ci.setAndUpdateViewState("Loading");
        }
        InterfaceC3072m9 interfaceC3072m11 = this.a;
        if (interfaceC3072m11 != null) {
            ((C3097n9) interfaceC3072m11).a("RenderViewClient", "==== CHECKPOINT REACHED - PAGE STARTED ====");
        }
        InterfaceC3072m9 interfaceC3072m12 = this.a;
        if (interfaceC3072m12 == null || (gh = ((C3097n9) interfaceC3072m12).a) == null) {
            return;
        }
        gh.a();
    }

    @Override // android.webkit.WebViewClient
    public final void onReceivedError(WebView view, int i, String description, String failingUrl) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(description, "description");
        Intrinsics.checkNotNullParameter(failingUrl, "failingUrl");
        InterfaceC3072m9 interfaceC3072m9 = this.a;
        if (interfaceC3072m9 != null) {
            ((C3097n9) interfaceC3072m9).b("RenderViewClient", "OnReceivedError - errorCode - " + i + ", description - " + description + ", url - " + failingUrl);
        }
        super.onReceivedError(view, i, description, failingUrl);
    }

    @Override // android.webkit.WebViewClient
    public final void onReceivedHttpError(WebView webView, WebResourceRequest webResourceRequest, WebResourceResponse webResourceResponse) {
        super.onReceivedHttpError(webView, webResourceRequest, webResourceResponse);
        InterfaceC3072m9 interfaceC3072m9 = this.a;
        if (interfaceC3072m9 != null) {
            ((C3097n9) interfaceC3072m9).b("RenderViewClient", "ReceivedHttpError - error - " + (webResourceResponse != null ? webResourceResponse.getReasonPhrase() : null) + ", statusCode - " + (webResourceResponse != null ? Integer.valueOf(webResourceResponse.getStatusCode()) : null) + " url - " + (webResourceRequest != null ? webResourceRequest.getUrl() : null) + " isMainFrame - " + (webResourceRequest != null ? Boolean.valueOf(webResourceRequest.isForMainFrame()) : null));
        }
    }

    @Override // android.webkit.WebViewClient
    public final void onReceivedSslError(WebView webView, SslErrorHandler sslErrorHandler, SslError sslError) {
        super.onReceivedSslError(webView, sslErrorHandler, sslError);
        InterfaceC3072m9 interfaceC3072m9 = this.a;
        if (interfaceC3072m9 != null) {
            ((C3097n9) interfaceC3072m9).b("RenderViewClient", "onReceivedSSLError - error - " + (sslError != null ? Integer.valueOf(sslError.getPrimaryError()) : null) + " - url - " + (sslError != null ? sslError.getUrl() : null));
        }
    }

    @Override // com.inmobi.media.AbstractC3389z2, android.webkit.WebViewClient
    public final boolean onRenderProcessGone(WebView view, RenderProcessGoneDetail detail) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(detail, "detail");
        if (Build.VERSION.SDK_INT >= 26) {
            InterfaceC3072m9 interfaceC3072m9 = this.a;
            if (interfaceC3072m9 != null) {
                ((C3097n9) interfaceC3072m9).c("RenderViewClient", "onRenderProcessGone detail did crash- " + detail.didCrash() + " priority - " + detail.rendererPriorityAtExit());
            }
            this.g.invoke(Boolean.valueOf(detail.didCrash()));
        } else {
            InterfaceC3072m9 interfaceC3072m10 = this.a;
            if (interfaceC3072m10 != null) {
                ((C3097n9) interfaceC3072m10).c("RenderViewClient", "onRenderProcessGone");
            }
        }
        return super.onRenderProcessGone(view, detail);
    }

    @Override // com.inmobi.media.AbstractC3389z2, android.webkit.WebViewClient
    public final WebResourceResponse shouldInterceptRequest(WebView view, WebResourceRequest request) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(request, "request");
        WebResourceResponse webResourceResponseA = AbstractC2886eo.a(request, this.a);
        return webResourceResponseA == null ? super.shouldInterceptRequest(view, request) : webResourceResponseA;
    }

    @Override // android.webkit.WebViewClient
    public final boolean shouldOverrideUrlLoading(WebView view, WebResourceRequest request) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(request, "request");
        InterfaceC3072m9 interfaceC3072m9 = this.a;
        if (interfaceC3072m9 != null) {
            ((C3097n9) interfaceC3072m9).a("RenderViewClient", "shouldOverrideUrlLoading Called");
        }
        C3342x5.a.getClass();
        if (!C3342x5.v()) {
            return false;
        }
        String string = request.getUrl().toString();
        Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
        return a(view, string);
    }

    @Override // android.webkit.WebViewClient
    public final void onReceivedError(WebView view, WebResourceRequest request, WebResourceError error) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(request, "request");
        Intrinsics.checkNotNullParameter(error, "error");
        super.onReceivedError(view, request, error);
        C3342x5.a.getClass();
        if (C3342x5.x()) {
            InterfaceC3072m9 interfaceC3072m9 = this.a;
            if (interfaceC3072m9 != null) {
                int errorCode = error.getErrorCode();
                CharSequence description = error.getDescription();
                ((C3097n9) interfaceC3072m9).b("RenderViewClient", "OnReceivedError - errorCode - " + errorCode + ", description - " + ((Object) description) + ", url - " + request.getUrl() + ", method - " + request.getMethod() + ", isMainFrame - " + request.isForMainFrame());
                return;
            }
            return;
        }
        InterfaceC3072m9 interfaceC3072m10 = this.a;
        if (interfaceC3072m10 != null) {
            ((C3097n9) interfaceC3072m10).b("RenderViewClient", "OnReceivedError ");
        }
    }

    @Override // com.inmobi.media.AbstractC3389z2, android.webkit.WebViewClient
    public final WebResourceResponse shouldInterceptRequest(WebView view, String url) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(url, "url");
        WebResourceResponse webResourceResponseA = AbstractC2886eo.a(url, this.a);
        return webResourceResponseA == null ? super.shouldInterceptRequest(view, url) : webResourceResponseA;
    }

    @Override // android.webkit.WebViewClient
    public final boolean shouldOverrideUrlLoading(WebView view, String url) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(url, "url");
        InterfaceC3072m9 interfaceC3072m9 = this.a;
        if (interfaceC3072m9 != null) {
            ((C3097n9) interfaceC3072m9).a("RenderViewClient", "shouldOverrideUrlLoading Called " + url);
        }
        return a(view, url);
    }

    public final void a(GestureDetectorOnGestureListenerC2829ci gestureDetectorOnGestureListenerC2829ci, String str) {
        InterfaceC3072m9 interfaceC3072m9 = this.a;
        if (interfaceC3072m9 != null) {
            ((C3097n9) interfaceC3072m9).a("RenderViewClient", "Override URL loading :" + str);
        }
        gestureDetectorOnGestureListenerC2829ci.s();
        Ta taA = Ua.a(gestureDetectorOnGestureListenerC2829ci.getLandingPageHandler(), this.i, (String) null, str, (Ya) null, 24);
        InterfaceC3072m9 interfaceC3072m10 = this.a;
        if (interfaceC3072m10 != null) {
            ((C3097n9) interfaceC3072m10).a("RenderViewClient", "Current Index :" + gestureDetectorOnGestureListenerC2829ci.copyBackForwardList().getCurrentIndex() + " Original Url :" + gestureDetectorOnGestureListenerC2829ci.getOriginalUrl() + " URL: " + str);
        }
        InterfaceC3072m9 interfaceC3072m11 = this.a;
        if (interfaceC3072m11 != null) {
            ((C3097n9) interfaceC3072m11).c("RenderViewClient", "landingPage process result - " + taA.a);
        }
    }

    public final void a(GestureDetectorOnGestureListenerC2829ci gestureDetectorOnGestureListenerC2829ci) {
        if (this.h || gestureDetectorOnGestureListenerC2829ci.e) {
            return;
        }
        this.h = true;
        InterfaceC3072m9 interfaceC3072m9 = this.a;
        if (interfaceC3072m9 != null) {
            ((C3097n9) interfaceC3072m9).a("RenderViewClient", "Injecting MRAID javascript for two piece creatives.");
        }
        gestureDetectorOnGestureListenerC2829ci.g(gestureDetectorOnGestureListenerC2829ci.getMraidJsString());
    }
}
