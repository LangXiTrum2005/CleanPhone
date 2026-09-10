package com.inmobi.media;

import android.webkit.WebView;
import android.webkit.WebViewRenderProcess;
import android.webkit.WebViewRenderProcessClient;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.inmobi.media.jc, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C3085jc extends WebViewRenderProcessClient {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final InterfaceC3333z5 f23725a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final C3149nc f23726b;

    public C3085jc(InterfaceC3333z5 interfaceC3333z5, C3149nc c3149nc) {
        this.f23725a = interfaceC3333z5;
        this.f23726b = c3149nc;
    }

    public final void onRenderProcessResponsive(WebView view, WebViewRenderProcess webViewRenderProcess) {
        Intrinsics.f(view, "view");
        InterfaceC3333z5 interfaceC3333z5 = this.f23725a;
        if (interfaceC3333z5 != null) {
            ((A5) interfaceC3333z5).a("RenderViewRenderProcessClient", "onRenderProcessResponsive " + view + ' ' + webViewRenderProcess);
        }
        C3149nc c3149nc = this.f23726b;
        if (c3149nc != null) {
            Map mapA = c3149nc.a();
            mapA.put("creativeId", c3149nc.f23834a.f);
            int i2 = c3149nc.f23837e + 1;
            c3149nc.f23837e = i2;
            mapA.put("count", Integer.valueOf(i2));
            String strA = c3149nc.a("RenderProcessResponsive");
            Pd pd = Pd.f23077a;
            Pd.b(strA, mapA, Td.SDK);
        }
    }

    public final void onRenderProcessUnresponsive(WebView view, WebViewRenderProcess webViewRenderProcess) {
        Intrinsics.f(view, "view");
        InterfaceC3333z5 interfaceC3333z5 = this.f23725a;
        if (interfaceC3333z5 != null) {
            ((A5) interfaceC3333z5).a("RenderViewRenderProcessClient", "onRenderProcessUnresponsive " + view + ' ' + webViewRenderProcess);
        }
        C3149nc c3149nc = this.f23726b;
        if (c3149nc != null) {
            Map mapA = c3149nc.a();
            mapA.put("creativeId", c3149nc.f23834a.f);
            int i2 = c3149nc.d + 1;
            c3149nc.d = i2;
            mapA.put("count", Integer.valueOf(i2));
            String strA = c3149nc.a("RenderProcessUnResponsive");
            Pd pd = Pd.f23077a;
            Pd.b(strA, mapA, Td.SDK);
        }
    }
}
