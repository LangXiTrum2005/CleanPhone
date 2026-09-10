package com.smartdigimkt.u4;

import android.net.http.SslError;
import android.view.ViewGroup;
import android.webkit.RenderProcessGoneDetail;
import android.webkit.SslErrorHandler;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.smartdigimkt.sdk.basead.express.web.BaseWebView;
import java.io.File;

/* JADX INFO: loaded from: classes6.dex */
public class b extends WebViewClient {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final String f38824c = "BaseWebViewClient";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private a f38825a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private c f38826b;

    public boolean a(String str, String str2) {
        try {
            return new File(str).getCanonicalFile().getPath().startsWith(new File(str2).getCanonicalFile().getPath());
        } catch (Exception unused) {
            return false;
        }
    }

    @Override // android.webkit.WebViewClient
    public void onPageFinished(WebView webView, String str) {
        super.onPageFinished(webView, str);
        c cVar = this.f38826b;
        if (cVar != null) {
            cVar.onPageFinished(webView, str);
        }
    }

    @Override // android.webkit.WebViewClient
    public void onReceivedError(WebView webView, int i2, String str, String str2) {
        super.onReceivedError(webView, i2, str, str2);
        c cVar = this.f38826b;
        if (cVar != null) {
            cVar.onReceivedError(webView, i2, str, str2);
        }
    }

    @Override // android.webkit.WebViewClient
    public void onReceivedSslError(WebView webView, SslErrorHandler sslErrorHandler, SslError sslError) {
        super.onReceivedSslError(webView, sslErrorHandler, sslError);
        c cVar = this.f38826b;
        if (cVar != null) {
            cVar.onReceivedSslError(webView, sslErrorHandler, sslError);
        }
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
                return true;
            }
        }
        c cVar = this.f38826b;
        if (cVar != null) {
            cVar.onRenderProcessGone(webView);
        }
        return true;
    }

    @Override // android.webkit.WebViewClient
    public boolean shouldOverrideUrlLoading(WebView webView, String str) {
        a aVar = this.f38825a;
        if (aVar != null && aVar.a(str)) {
            return true;
        }
        c cVar = this.f38826b;
        if (cVar != null) {
            cVar.shouldOverrideUrlLoading(webView, str);
        }
        return super.shouldOverrideUrlLoading(webView, str);
    }

    public void a(a aVar) {
        this.f38825a = aVar;
    }

    public a a() {
        return this.f38825a;
    }

    public void a(c cVar) {
        this.f38826b = cVar;
    }
}
