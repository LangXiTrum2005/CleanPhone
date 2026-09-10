package com.smartdigimkt.g5;

import android.graphics.Bitmap;
import android.net.http.SslError;
import android.webkit.SslErrorHandler;
import android.webkit.WebView;

/* JADX INFO: loaded from: classes5.dex */
public class b implements com.smartdigimkt.u4.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    protected static final String f35447a = "MraidBaseWebView";

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

    @Override // com.smartdigimkt.u4.c
    public void readyState(WebView webView, int i2) {
    }

    @Override // com.smartdigimkt.u4.c
    public boolean shouldOverrideUrlLoading(WebView webView, String str) {
        return true;
    }
}
