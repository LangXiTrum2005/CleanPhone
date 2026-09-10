package com.smartdigimkt.k;

import android.graphics.Bitmap;
import android.net.http.SslError;
import android.webkit.SslErrorHandler;
import android.webkit.WebView;
import com.applovin.impl.sdk.utils.JsonUtils;

/* JADX INFO: loaded from: classes.dex */
public class a implements com.smartdigimkt.n.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    protected static final String f36127a = "RVWindVaneWebView";

    @Override // com.smartdigimkt.n.c
    public void a(WebView webView, String str, String str2, int i2, int i3) {
    }

    @Override // com.smartdigimkt.u4.c
    public void loadingResourceStatus(WebView webView, int i2) {
    }

    @Override // com.smartdigimkt.u4.c
    public void onPageFinished(WebView webView, String str) {
    }

    @Override // com.smartdigimkt.u4.c
    public void onPageStarted(WebView webView, String str, Bitmap bitmap) {
    }

    @Override // com.smartdigimkt.u4.c
    public void onProgressChanged(WebView webView, int i2) {
    }

    @Override // com.smartdigimkt.u4.c
    public void onReceivedError(WebView webView, int i2, String str, String str2) {
    }

    @Override // com.smartdigimkt.u4.c
    public void onReceivedSslError(WebView webView, SslErrorHandler sslErrorHandler, SslError sslError) {
    }

    @Override // com.smartdigimkt.u4.c
    public void onRenderProcessGone(WebView webView) {
    }

    @Override // com.smartdigimkt.n.c
    public void preloadSubPlayTemplateView(Object obj, String str) {
    }

    @Override // com.smartdigimkt.u4.c
    public void readyState(WebView webView, int i2) {
    }

    @Override // com.smartdigimkt.u4.c
    public boolean shouldOverrideUrlLoading(WebView webView, String str) {
        return true;
    }

    @Override // com.smartdigimkt.n.c
    public void a(Object obj) {
    }

    @Override // com.smartdigimkt.n.c
    public String a(WebView webView, String str, String str2) {
        return JsonUtils.EMPTY_JSON;
    }
}
