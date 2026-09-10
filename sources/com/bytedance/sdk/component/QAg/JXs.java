package com.bytedance.sdk.component.QAg;

import android.graphics.Bitmap;
import android.net.http.SslError;
import android.os.Build;
import android.webkit.RenderProcessGoneDetail;
import android.webkit.SslErrorHandler;
import android.webkit.WebBackForwardList;
import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public class JXs extends WebViewClient {
    private final Lxb.InterfaceC0051Lxb LD;
    private final WebViewClient Lxb;
    private final List<String> lk;

    public JXs(Lxb.InterfaceC0051Lxb interfaceC0051Lxb, WebViewClient webViewClient, List<String> list) {
        this.LD = interfaceC0051Lxb;
        this.Lxb = webViewClient;
        this.lk = list;
    }

    private int Lxb(WebView webView) {
        try {
            WebBackForwardList webBackForwardListCopyBackForwardList = webView.copyBackForwardList();
            if (webBackForwardListCopyBackForwardList != null) {
                return webBackForwardListCopyBackForwardList.getCurrentIndex() + 1;
            }
            return -1;
        } catch (Throwable unused) {
            return -1;
        }
    }

    @Override // android.webkit.WebViewClient
    public void onPageFinished(WebView webView, String str) {
        this.Lxb.onPageFinished(webView, str);
    }

    @Override // android.webkit.WebViewClient
    public void onPageStarted(WebView webView, String str, Bitmap bitmap) {
        Lxb.InterfaceC0051Lxb interfaceC0051Lxb = this.LD;
        if (interfaceC0051Lxb != null) {
            interfaceC0051Lxb.Lxb(Lxb(webView));
        }
        this.Lxb.onPageStarted(webView, str, bitmap);
    }

    @Override // android.webkit.WebViewClient
    public void onReceivedError(WebView webView, WebResourceRequest webResourceRequest, WebResourceError webResourceError) {
        if (Build.VERSION.SDK_INT >= 23) {
            this.Lxb.onReceivedError(webView, webResourceRequest, webResourceError);
        }
    }

    @Override // android.webkit.WebViewClient
    public void onReceivedHttpError(WebView webView, WebResourceRequest webResourceRequest, WebResourceResponse webResourceResponse) {
        if (Build.VERSION.SDK_INT >= 23) {
            this.Lxb.onReceivedHttpError(webView, webResourceRequest, webResourceResponse);
        }
    }

    @Override // android.webkit.WebViewClient
    public void onReceivedSslError(WebView webView, SslErrorHandler sslErrorHandler, SslError sslError) {
        this.Lxb.onReceivedSslError(webView, sslErrorHandler, sslError);
    }

    @Override // android.webkit.WebViewClient
    public boolean onRenderProcessGone(WebView webView, RenderProcessGoneDetail renderProcessGoneDetail) {
        return Build.VERSION.SDK_INT >= 26 ? this.Lxb.onRenderProcessGone(webView, renderProcessGoneDetail) : super.onRenderProcessGone(webView, renderProcessGoneDetail);
    }

    @Override // android.webkit.WebViewClient
    public WebResourceResponse shouldInterceptRequest(WebView webView, String str) {
        return this.Lxb.shouldInterceptRequest(webView, str);
    }

    @Override // android.webkit.WebViewClient
    public boolean shouldOverrideUrlLoading(WebView webView, String str) {
        Lxb.InterfaceC0051Lxb interfaceC0051Lxb = this.LD;
        if (interfaceC0051Lxb != null) {
            interfaceC0051Lxb.Lxb();
        }
        return this.Lxb.shouldOverrideUrlLoading(webView, str);
    }

    @Override // android.webkit.WebViewClient
    public WebResourceResponse shouldInterceptRequest(WebView webView, WebResourceRequest webResourceRequest) {
        Lxb.InterfaceC0051Lxb interfaceC0051Lxb;
        if (LD.Lxb(this.lk, webResourceRequest.getUrl().toString()) && (interfaceC0051Lxb = this.LD) != null) {
            interfaceC0051Lxb.Lxb();
        }
        return this.Lxb.shouldInterceptRequest(webView, webResourceRequest);
    }

    @Override // android.webkit.WebViewClient
    public void onReceivedError(WebView webView, int i, String str, String str2) {
        this.Lxb.onReceivedError(webView, i, str, str2);
    }
}
