package com.thinkup.core.express.web;

import android.net.http.SslError;
import android.view.ViewGroup;
import android.webkit.RenderProcessGoneDetail;
import android.webkit.SslErrorHandler;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import java.io.File;

/* JADX INFO: loaded from: classes6.dex */
public class m extends WebViewClient {
    private static final String o = "BaseWebViewClient";
    private o m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private n f42390n;

    private static boolean o(String str, String str2) {
        try {
            return new File(str).getCanonicalFile().getPath().startsWith(new File(str2).getCanonicalFile().getPath());
        } catch (Exception unused) {
            return false;
        }
    }

    @Override // android.webkit.WebViewClient
    public void onPageFinished(WebView webView, String str) {
        super.onPageFinished(webView, str);
    }

    @Override // android.webkit.WebViewClient
    public void onReceivedError(WebView webView, int i2, String str, String str2) {
        super.onReceivedError(webView, i2, str, str2);
    }

    @Override // android.webkit.WebViewClient
    public void onReceivedSslError(WebView webView, SslErrorHandler sslErrorHandler, SslError sslError) {
        super.onReceivedSslError(webView, sslErrorHandler, sslError);
    }

    @Override // android.webkit.WebViewClient
    public boolean onRenderProcessGone(WebView webView, RenderProcessGoneDetail renderProcessGoneDetail) {
        if (webView != null) {
            try {
                ViewGroup viewGroup = (ViewGroup) webView.getParent();
                if (viewGroup != null) {
                    viewGroup.removeView(webView);
                }
                if (webView instanceof BaseWebView) {
                    ((BaseWebView) webView).release();
                } else {
                    webView.destroy();
                }
            } catch (Throwable th) {
                th.getMessage();
            }
        }
        return true;
    }

    @Override // android.webkit.WebViewClient
    public boolean shouldOverrideUrlLoading(WebView webView, String str) {
        o oVar = this.m;
        if (oVar != null) {
            oVar.o(str);
        }
        return super.shouldOverrideUrlLoading(webView, str);
    }

    public final void o(o oVar) {
        this.m = oVar;
    }

    private o o() {
        return this.m;
    }

    private void o(n nVar) {
        this.f42390n = nVar;
    }
}
