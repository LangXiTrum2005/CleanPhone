package com.chartboost.sdk.impl;

import android.webkit.WebResourceRequest;
import android.webkit.WebView;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class n2 extends j5 {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final t9 f14524e;
    public final zf f;
    public boolean g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n2(t9 impressionInterface, zf gestureDetector, k5 callback, y6 eventTracker) {
        super(callback, eventTracker, impressionInterface, (qf) w3.f15454b.a().b().get());
        Intrinsics.f(impressionInterface, "impressionInterface");
        Intrinsics.f(gestureDetector, "gestureDetector");
        Intrinsics.f(callback, "callback");
        Intrinsics.f(eventTracker, "eventTracker");
        this.f14524e = impressionInterface;
        this.f = gestureDetector;
    }

    public final zf a() {
        return this.f;
    }

    public final boolean b(String str) {
        if (!this.g) {
            za.b(android.support.v4.media.a.n("Attempt to open ", str, " detected before WebView loading finished."), (Throwable) null, 2, (Object) null);
            this.f14524e.d(new f3(str, Boolean.FALSE));
            return true;
        }
        if (!this.f.a()) {
            return false;
        }
        this.f14524e.c(new f3(str, Boolean.FALSE));
        this.f.b();
        return true;
    }

    @Override // com.chartboost.sdk.impl.j5, android.webkit.WebViewClient
    public void onPageFinished(WebView webView, String str) {
        super.onPageFinished(webView, str);
        this.g = true;
    }

    @Override // com.chartboost.sdk.impl.j5, android.webkit.WebViewClient
    public boolean shouldOverrideUrlLoading(WebView view, WebResourceRequest request) {
        Intrinsics.f(view, "view");
        Intrinsics.f(request, "request");
        String string = request.getUrl().toString();
        Intrinsics.e(string, "toString(...)");
        return b(string);
    }

    @Override // com.chartboost.sdk.impl.j5, android.webkit.WebViewClient
    public boolean shouldOverrideUrlLoading(WebView webView, String url) {
        Intrinsics.f(url, "url");
        return b(url);
    }
}
