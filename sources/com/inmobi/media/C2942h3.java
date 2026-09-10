package com.inmobi.media;

import android.webkit.RenderProcessGoneDetail;
import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import java.util.concurrent.atomic.AtomicBoolean;
import p002kotlin.jvm.internal.Intrinsics;
import p002kotlin.jvm.internal.Ref$ObjectRef;

/* JADX INFO: renamed from: com.inmobi.media.h3, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C2942h3 extends WebViewClient {
    public final /* synthetic */ AtomicBoolean a;
    public final /* synthetic */ Ref$ObjectRef b;
    public final /* synthetic */ C2967i3 c;
    public final /* synthetic */ S2 d;

    public C2942h3(AtomicBoolean atomicBoolean, Ref$ObjectRef ref$ObjectRef, C2967i3 c2967i3, S2 s2) {
        this.a = atomicBoolean;
        this.b = ref$ObjectRef;
        this.c = c2967i3;
        this.d = s2;
    }

    @Override // android.webkit.WebViewClient
    public final void onPageFinished(WebView webView, String str) {
        C2967i3.a(this.a, this.b, this.c, this.d, true);
    }

    @Override // android.webkit.WebViewClient
    public final void onReceivedError(WebView view, int i, String description, String failingUrl) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(description, "description");
        Intrinsics.checkNotNullParameter(failingUrl, "failingUrl");
        C2967i3.a(this.a, this.b, this.c, this.d, false);
    }

    @Override // android.webkit.WebViewClient
    public final void onReceivedHttpError(WebView view, WebResourceRequest request, WebResourceResponse errorResponse) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(request, "request");
        Intrinsics.checkNotNullParameter(errorResponse, "errorResponse");
        C2967i3.a(this.a, this.b, this.c, this.d, false);
    }

    @Override // android.webkit.WebViewClient
    public final boolean onRenderProcessGone(WebView view, RenderProcessGoneDetail detail) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(detail, "detail");
        C2967i3.a(this.a, this.b, this.c, this.d, false);
        return oo.a(view, detail, "click_mgr");
    }

    @Override // android.webkit.WebViewClient
    public final boolean shouldOverrideUrlLoading(WebView view, WebResourceRequest request) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(request, "request");
        return (this.d.d || Intrinsics.wireman(request.getUrl().toString(), this.d.b)) ? false : true;
    }

    @Override // android.webkit.WebViewClient
    public final void onReceivedError(WebView view, WebResourceRequest request, WebResourceError error) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(request, "request");
        Intrinsics.checkNotNullParameter(error, "error");
        C2967i3.a(this.a, this.b, this.c, this.d, false);
    }

    @Override // android.webkit.WebViewClient
    public final boolean shouldOverrideUrlLoading(WebView view, String url) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(url, "url");
        S2 s2 = this.d;
        return (s2.d || Intrinsics.wireman(url, s2.b)) ? false : true;
    }
}
