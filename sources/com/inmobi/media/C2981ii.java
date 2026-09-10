package com.inmobi.media;

import android.webkit.WebView;
import android.webkit.WebViewRenderProcess;
import android.webkit.WebViewRenderProcessClient;
import java.util.Map;
import p002kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.inmobi.media.ii, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C2981ii extends WebViewRenderProcessClient {
    public final InterfaceC3072m9 a;
    public final C3081mi b;

    public C2981ii(InterfaceC3072m9 interfaceC3072m9, C3081mi c3081mi) {
        this.a = interfaceC3072m9;
        this.b = c3081mi;
    }

    public final void onRenderProcessResponsive(WebView view, WebViewRenderProcess webViewRenderProcess) {
        Gh gh;
        Intrinsics.checkNotNullParameter(view, "view");
        InterfaceC3072m9 interfaceC3072m9 = this.a;
        if (interfaceC3072m9 != null) {
            ((C3097n9) interfaceC3072m9).a("RenderViewRenderProcessClient", "onRenderProcessResponsive " + view + " " + webViewRenderProcess);
        }
        C3081mi c3081mi = this.b;
        if (c3081mi != null) {
            Map mapA = c3081mi.a();
            mapA.put("creativeId", c3081mi.a.g);
            int i = c3081mi.e + 1;
            c3081mi.e = i;
            mapA.put("count", Integer.valueOf(i));
            String strA = c3081mi.a("RenderProcessResponsive");
            Wj wj = Wj.a;
            Wj.b(strA, mapA, EnumC2779ak.SDK);
        }
        InterfaceC3072m9 interfaceC3072m10 = this.a;
        if (interfaceC3072m10 == null || (gh = ((C3097n9) interfaceC3072m10).a) == null) {
            return;
        }
        gh.a();
    }

    public final void onRenderProcessUnresponsive(WebView view, WebViewRenderProcess webViewRenderProcess) {
        Gh gh;
        Intrinsics.checkNotNullParameter(view, "view");
        InterfaceC3072m9 interfaceC3072m9 = this.a;
        if (interfaceC3072m9 != null) {
            ((C3097n9) interfaceC3072m9).a("RenderViewRenderProcessClient", "onRenderProcessUnresponsive " + view + " " + webViewRenderProcess);
        }
        C3081mi c3081mi = this.b;
        if (c3081mi != null) {
            Map mapA = c3081mi.a();
            mapA.put("creativeId", c3081mi.a.g);
            int i = c3081mi.d + 1;
            c3081mi.d = i;
            mapA.put("count", Integer.valueOf(i));
            String strA = c3081mi.a("RenderProcessUnResponsive");
            Wj wj = Wj.a;
            Wj.b(strA, mapA, EnumC2779ak.SDK);
        }
        InterfaceC3072m9 interfaceC3072m10 = this.a;
        if (interfaceC3072m10 == null || (gh = ((C3097n9) interfaceC3072m10).a) == null) {
            return;
        }
        gh.a();
    }
}
