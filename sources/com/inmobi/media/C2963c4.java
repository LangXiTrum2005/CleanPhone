package com.inmobi.media;

import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Build;
import android.view.ViewParent;
import android.webkit.RenderProcessGoneDetail;
import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import android.webkit.WebView;
import java.util.LinkedHashMap;
import kotlin.Pair;
import kotlin.collections.MapsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: renamed from: com.inmobi.media.c4, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C2963c4 extends Y1 {
    public final String f;
    public final Lambda g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Lambda f23480h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final Lambda f23481i;
    public R6 j;
    public O6 k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C2963c4(String api, Function0 onUserLandingCompleted, Function1 onLpLifecycleEvent, Function2 fireLandingPageTracker, InterfaceC3333z5 interfaceC3333z5) {
        super(interfaceC3333z5);
        Intrinsics.f(api, "api");
        Intrinsics.f(onUserLandingCompleted, "onUserLandingCompleted");
        Intrinsics.f(onLpLifecycleEvent, "onLpLifecycleEvent");
        Intrinsics.f(fireLandingPageTracker, "fireLandingPageTracker");
        this.f = api;
        this.g = (Lambda) onUserLandingCompleted;
        this.f23480h = (Lambda) onLpLifecycleEvent;
        this.f23481i = (Lambda) fireLandingPageTracker;
    }

    /* JADX WARN: Type inference failed for: r12v4, types: [kotlin.jvm.functions.Function1, kotlin.jvm.internal.Lambda] */
    public final boolean a(WebView webView, String str) {
        String str2;
        Integer num;
        int i2;
        InterfaceC2946b4 interfaceC2946b4;
        Fe userLeftApplicationListener;
        if (this.f23361e.get()) {
            return true;
        }
        InterfaceC3333z5 interfaceC3333z5 = this.f23358a;
        if (interfaceC3333z5 != null) {
            ((A5) interfaceC3333z5).a("EmbeddedBrowserViewClient", AbstractC3041h0.a("onShouldOverrideUrlLoading: ", str));
        }
        if (webView instanceof X1) {
            str2 = str;
            K6 k6A = M6.a(((X1) webView).getLandingPageHandler(), this.f, null, str2, this.j, false, 16);
            num = k6A.f22923b;
            i2 = k6A.f22922a;
        } else {
            str2 = str;
            num = null;
            i2 = 0;
        }
        if (i2 != 1) {
            if (i2 != 2 && i2 != 3) {
                return false;
            }
            a(3, false, str2, Integer.valueOf(num != null ? num.intValue() : 10));
            return true;
        }
        if (webView instanceof C3045h4) {
            ViewParent parent = ((C3045h4) webView).getParent();
            if ((parent instanceof Y3) && (userLeftApplicationListener = ((Y3) parent).getUserLeftApplicationListener()) != null) {
                userLeftApplicationListener.a();
            }
        }
        ?? r12 = this.f23480h;
        Gb gb = GestureDetectorOnGestureListenerC3005ec.Y0;
        String str3 = this.f;
        gb.getClass();
        r12.invoke(Gb.a(str3, "onNavigatingAway"));
        a(webView);
        if (!AbstractC3330z2.a(str2)) {
            if (webView.canGoBack()) {
                webView.goBack();
            } else if (webView instanceof C3045h4) {
                ViewParent parent2 = ((C3045h4) webView).getParent();
                if ((parent2 instanceof Y3) && (interfaceC2946b4 = ((Y3) parent2).d) != null) {
                    C3078j5.a(((C3062i5) interfaceC2946b4).f23690a);
                }
            }
        }
        a(this, 2, false, str2, 8);
        return true;
    }

    @Override // android.webkit.WebViewClient
    public final void onPageCommitVisible(WebView webView, String str) {
        InterfaceC3333z5 interfaceC3333z5 = this.f23358a;
        if (interfaceC3333z5 != null) {
            ((A5) interfaceC3333z5).a("EmbeddedBrowserViewClient", AbstractC3041h0.a("onPageCommitVisible: ", str));
        }
        a(this, 4, true, str, 8);
    }

    @Override // com.inmobi.media.Y1, android.webkit.WebViewClient
    public final void onPageFinished(WebView webView, String str) {
        super.onPageFinished(webView, str);
        InterfaceC3333z5 interfaceC3333z5 = this.f23358a;
        if (interfaceC3333z5 != null) {
            ((A5) interfaceC3333z5).a("EmbeddedBrowserViewClient", AbstractC3041h0.a("onPageFinished: ", str));
        }
        a(this, 2, true, str, 8);
    }

    /* JADX WARN: Type inference failed for: r2v2, types: [kotlin.jvm.functions.Function1, kotlin.jvm.internal.Lambda] */
    @Override // android.webkit.WebViewClient
    public final void onPageStarted(WebView webView, String str, Bitmap bitmap) {
        super.onPageStarted(webView, str, bitmap);
        InterfaceC3333z5 interfaceC3333z5 = this.f23358a;
        if (interfaceC3333z5 != null) {
            ((A5) interfaceC3333z5).a("EmbeddedBrowserViewClient", AbstractC3041h0.a("onPageStarted: ", str));
        }
        ?? r2 = this.f23480h;
        Gb gb = GestureDetectorOnGestureListenerC3005ec.Y0;
        String str2 = this.f;
        gb.getClass();
        r2.invoke(Gb.a(str2, "onPageStart"));
        a(this, 1, true, str, 8);
    }

    @Override // android.webkit.WebViewClient
    public final void onReceivedError(WebView view, int i2, String description, String failingUrl) {
        Intrinsics.f(view, "view");
        Intrinsics.f(description, "description");
        Intrinsics.f(failingUrl, "failingUrl");
        a(3, false, failingUrl, Integer.valueOf(i2));
        InterfaceC3333z5 interfaceC3333z5 = this.f23358a;
        if (interfaceC3333z5 != null) {
            ((A5) interfaceC3333z5).a("EmbeddedBrowserViewClient", AbstractC3041h0.a("onReceivedError: ", failingUrl));
        }
    }

    @Override // com.inmobi.media.Y1, android.webkit.WebViewClient
    public final boolean onRenderProcessGone(WebView view, RenderProcessGoneDetail detail) {
        Intrinsics.f(view, "view");
        Intrinsics.f(detail, "detail");
        boolean zOnRenderProcessGone = super.onRenderProcessGone(view, detail);
        if (Build.VERSION.SDK_INT >= 26) {
            a(3, true, null, 8007);
            LinkedHashMap linkedHashMapL = MapsKt.l(new Pair("source", "embedded_browser"), new Pair("isCrashed", Boolean.valueOf(detail.didCrash())));
            Pd pd = Pd.f23077a;
            Pd.b("WebViewRenderProcessGoneEvent", linkedHashMapL, Td.SDK);
        }
        return zOnRenderProcessGone;
    }

    @Override // android.webkit.WebViewClient
    public final boolean shouldOverrideUrlLoading(WebView webView, WebResourceRequest webResourceRequest) {
        String string;
        Uri url;
        InterfaceC3333z5 interfaceC3333z5 = this.f23358a;
        if (interfaceC3333z5 != null) {
            ((A5) interfaceC3333z5).a("EmbeddedBrowserViewClient", "shouldOverrideUrlLoading Called");
        }
        if (!L3.G()) {
            return false;
        }
        if (webResourceRequest == null || (url = webResourceRequest.getUrl()) == null || (string = url.toString()) == null) {
            string = "";
        }
        if (webView == null || string.length() <= 0) {
            return false;
        }
        return a(webView, string);
    }

    @Override // android.webkit.WebViewClient
    public final void onReceivedError(WebView view, WebResourceRequest request, WebResourceError error) {
        Intrinsics.f(view, "view");
        Intrinsics.f(request, "request");
        Intrinsics.f(error, "error");
        InterfaceC3333z5 interfaceC3333z5 = this.f23358a;
        if (interfaceC3333z5 != null) {
            ((A5) interfaceC3333z5).a("EmbeddedBrowserViewClient", "onReceivedError: " + request.getUrl());
        }
        if (request.isForMainFrame()) {
            a(3, true, request.getUrl().toString(), Integer.valueOf(error.getErrorCode()));
        }
    }

    @Override // android.webkit.WebViewClient
    public final boolean shouldOverrideUrlLoading(WebView webView, String str) {
        InterfaceC3333z5 interfaceC3333z5 = this.f23358a;
        if (interfaceC3333z5 != null) {
            ((A5) interfaceC3333z5).a("EmbeddedBrowserViewClient", "shouldOverrideUrlLoading Called");
        }
        if (webView == null || str == null) {
            return false;
        }
        return a(webView, str);
    }

    public static /* synthetic */ void a(C2963c4 c2963c4, int i2, boolean z2, String str, int i3) {
        if ((i3 & 4) != 0) {
            str = null;
        }
        c2963c4.a(i2, z2, str, null);
    }

    /* JADX WARN: Type inference failed for: r9v11, types: [kotlin.jvm.functions.Function2, kotlin.jvm.internal.Lambda] */
    /* JADX WARN: Type inference failed for: r9v15, types: [kotlin.jvm.functions.Function2, kotlin.jvm.internal.Lambda] */
    /* JADX WARN: Type inference failed for: r9v17, types: [kotlin.jvm.functions.Function2, kotlin.jvm.internal.Lambda] */
    /* JADX WARN: Type inference failed for: r9v23, types: [kotlin.jvm.functions.Function2, kotlin.jvm.internal.Lambda] */
    /* JADX WARN: Type inference failed for: r9v3, types: [kotlin.jvm.functions.Function2, kotlin.jvm.internal.Lambda] */
    /* JADX WARN: Type inference failed for: r9v7, types: [kotlin.jvm.functions.Function0, kotlin.jvm.internal.Lambda] */
    /* JADX WARN: Type inference failed for: r9v9, types: [kotlin.jvm.functions.Function2, kotlin.jvm.internal.Lambda] */
    public final void a(int i2, boolean z2, String str, Integer num) {
        O6 o6 = this.k;
        if (o6 != null) {
            try {
                if (o6.f23039e) {
                    return;
                }
                R6 r6 = o6.f23036a;
                if (r6 != null) {
                    r6.g = "IN_CUSTOM";
                }
                int i3 = 8100;
                switch (i2) {
                    case 1:
                        if (z2) {
                            o6.d = str;
                            C2963c4 c2963c4 = o6.f23037b;
                            F6 funnelState = F6.LPPageStart;
                            c2963c4.getClass();
                            Intrinsics.f(funnelState, "funnelState");
                            J6.a(funnelState, r6, (Integer) null, (Function2) c2963c4.f23481i);
                        }
                        break;
                    case 2:
                        if (z2) {
                            o6.d = str;
                            o6.f23039e = true;
                            if (!o6.f23038c.contains(1)) {
                                C2963c4 c2963c5 = o6.f23037b;
                                F6 funnelState2 = F6.LPPageStart;
                                R6 r7 = o6.f23036a;
                                c2963c5.getClass();
                                Intrinsics.f(funnelState2, "funnelState");
                                J6.a(funnelState2, r7, (Integer) 8006, (Function2) c2963c5.f23481i);
                            }
                            o6.f23037b.g.invoke();
                            C2963c4 c2963c6 = o6.f23037b;
                            F6 funnelState3 = F6.LPCompleteSuccess;
                            R6 r8 = o6.f23036a;
                            c2963c6.getClass();
                            Intrinsics.f(funnelState3, "funnelState");
                            J6.a(funnelState3, r8, (Integer) null, (Function2) c2963c6.f23481i);
                        }
                        break;
                    case 3:
                        if (z2 || (str != null && str.equals(o6.d))) {
                            o6.f23039e = true;
                            if (!o6.f23038c.contains(1)) {
                                C2963c4 c2963c7 = o6.f23037b;
                                F6 funnelState4 = F6.LPPageStart;
                                R6 r9 = o6.f23036a;
                                c2963c7.getClass();
                                Intrinsics.f(funnelState4, "funnelState");
                                J6.a(funnelState4, r9, (Integer) 8006, (Function2) c2963c7.f23481i);
                            }
                            C2963c4 c2963c8 = o6.f23037b;
                            F6 funnelState5 = F6.LPCompleteFailed;
                            R6 r10 = o6.f23036a;
                            Integer numValueOf = Integer.valueOf(num != null ? num.intValue() : 8100);
                            c2963c8.getClass();
                            Intrinsics.f(funnelState5, "funnelState");
                            J6.a(funnelState5, r10, numValueOf, (Function2) c2963c8.f23481i);
                        }
                        break;
                    case 4:
                        if (z2) {
                            o6.d = str;
                        }
                        break;
                    case 5:
                    case 6:
                    case 7:
                    case 8:
                    case 9:
                        o6.f23039e = true;
                        switch (i2) {
                            case 5:
                                i3 = 8200;
                                break;
                            case 6:
                                i3 = 8300;
                                break;
                            case 7:
                                i3 = 8400;
                                break;
                            case 8:
                                i3 = 8600;
                                break;
                            case 9:
                                i3 = 8500;
                                break;
                        }
                        int i4 = 4;
                        if (!o6.f23038c.contains(4)) {
                            i4 = 0;
                        }
                        int i5 = i3 + i4;
                        C2963c4 c2963c9 = o6.f23037b;
                        F6 funnelState6 = F6.LPCompleteFailed;
                        R6 r11 = o6.f23036a;
                        Integer numValueOf2 = Integer.valueOf(i5);
                        c2963c9.getClass();
                        Intrinsics.f(funnelState6, "funnelState");
                        J6.a(funnelState6, r11, numValueOf2, (Function2) c2963c9.f23481i);
                        break;
                }
                o6.f23038c.add(Integer.valueOf(i2));
            } catch (Exception e2) {
                e2.toString();
            }
        }
    }
}
