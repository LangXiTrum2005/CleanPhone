package com.startapp.sdk.internal;

import android.os.Handler;
import android.webkit.WebView;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicLong;

/* JADX INFO: loaded from: classes6.dex */
public final class ok extends sk {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Handler f41329a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ AtomicBoolean f41330b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ WebView f41331c;
    public final /* synthetic */ ti d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ AtomicLong f41332e;
    public final /* synthetic */ int f;
    public final /* synthetic */ rk g;

    public ok(rk rkVar, Handler handler, AtomicBoolean atomicBoolean, WebView webView, ti tiVar, AtomicLong atomicLong, int i2) {
        this.g = rkVar;
        this.f41329a = handler;
        this.f41330b = atomicBoolean;
        this.f41331c = webView;
        this.d = tiVar;
        this.f41332e = atomicLong;
        this.f = i2;
    }

    @Override // android.webkit.WebViewClient
    public final void onPageFinished(WebView webView, String str) {
        super.onPageFinished(webView, str);
        long jB = vi.b();
        this.f41329a.removeCallbacksAndMessages(null);
        this.f41329a.postDelayed(new mk(this, jB), this.f);
    }

    @Override // android.webkit.WebViewClient
    public final void onReceivedError(WebView webView, int i2, String str, String str2) {
        super.onReceivedError(webView, i2, str, str2);
        this.f41329a.removeCallbacksAndMessages(null);
        this.f41329a.post(new nk(this, str));
    }

    @Override // android.webkit.WebViewClient
    public final boolean shouldOverrideUrlLoading(WebView webView, String str) {
        if (webView == null || str == null || vi.c(webView.getContext(), str)) {
            return true;
        }
        return super.shouldOverrideUrlLoading(webView, str);
    }
}
