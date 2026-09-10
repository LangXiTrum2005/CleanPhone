package com.chartboost.sdk.impl;

import android.app.Activity;
import android.content.pm.PackageInfo;
import android.graphics.Bitmap;
import android.net.http.SslError;
import android.os.Build;
import android.webkit.RenderProcessGoneDetail;
import android.webkit.SslErrorHandler;
import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import android.webkit.WebViewClient;

/* JADX INFO: loaded from: classes3.dex */
public class j5 extends WebViewClient {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final k5 f14234a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final y6 f14235b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final t9 f14236c;
    public final qf d;

    public j5(k5 k5Var, y6 y6Var, t9 t9Var, qf qfVar) {
        this.f14234a = k5Var;
        this.f14235b = y6Var;
        this.f14236c = t9Var;
        this.d = qfVar;
    }

    public final void a(String str) {
        k5 k5Var = this.f14234a;
        if (k5Var != null) {
            k5Var.a(str);
        }
    }

    @Override // android.webkit.WebViewClient
    public void onPageFinished(WebView webView, String str) {
        super.onPageFinished(webView, str);
        k5 k5Var = this.f14234a;
        if (k5Var != null) {
            k5Var.c();
        }
    }

    @Override // android.webkit.WebViewClient
    public void onPageStarted(WebView webView, String str, Bitmap bitmap) {
        super.onPageStarted(webView, str, bitmap);
        if (Build.VERSION.SDK_INT >= 26) {
            PackageInfo currentWebViewPackage = WebView.getCurrentWebViewPackage();
            if (currentWebViewPackage != null) {
                za.a("WebView version: " + currentWebViewPackage.versionName, null);
            } else {
                a("Device was not set up correctly.");
            }
        }
        this.f14234a.b();
    }

    @Override // android.webkit.WebViewClient
    public void onReceivedError(WebView webView, int i2, String str, String str2) {
        a("Error loading " + str2 + ": " + str);
    }

    @Override // android.webkit.WebViewClient
    public void onReceivedHttpError(WebView webView, WebResourceRequest webResourceRequest, WebResourceResponse webResourceResponse) {
        StringBuilder sb = new StringBuilder("Error loading ");
        sb.append(webResourceRequest.getUrl().toString());
        sb.append(": ");
        sb.append(webResourceResponse == null ? "unknown error" : webResourceResponse.getReasonPhrase());
        za.a(sb.toString(), null);
    }

    @Override // android.webkit.WebViewClient
    public void onReceivedSslError(WebView webView, SslErrorHandler sslErrorHandler, SslError sslError) {
        this.f14235b.mo189track(u6.a(fh.i.WEBVIEW_SSL_ERROR, sslError.toString()));
        super.onReceivedSslError(webView, sslErrorHandler, sslError);
    }

    @Override // android.webkit.WebViewClient
    public boolean onRenderProcessGone(WebView webView, RenderProcessGoneDetail renderProcessGoneDetail) {
        String str;
        if (renderProcessGoneDetail.didCrash()) {
            str = "Webview crashed: " + renderProcessGoneDetail;
        } else {
            str = "Webview killed, likely due to low memory";
        }
        a(str);
        if (webView == null || !(webView.getContext() instanceof Activity)) {
            return true;
        }
        ((Activity) webView.getContext()).finish();
        return true;
    }

    @Override // android.webkit.WebViewClient
    public boolean shouldOverrideUrlLoading(WebView webView, WebResourceRequest webResourceRequest) {
        if (!this.d.f14934A) {
            return false;
        }
        this.f14236c.b(new f3(webResourceRequest.getUrl().toString(), Boolean.FALSE));
        return true;
    }

    @Override // android.webkit.WebViewClient
    public void onReceivedError(WebView webView, WebResourceRequest webResourceRequest, WebResourceError webResourceError) {
        if (webResourceRequest.isForMainFrame()) {
            a("Error loading " + webResourceRequest.getUrl().toString() + ": " + ((Object) webResourceError.getDescription()));
        }
    }

    @Override // android.webkit.WebViewClient
    public boolean shouldOverrideUrlLoading(WebView webView, String str) {
        if (!this.d.f14934A) {
            return false;
        }
        this.f14236c.b(new f3(str, Boolean.FALSE));
        return true;
    }
}
