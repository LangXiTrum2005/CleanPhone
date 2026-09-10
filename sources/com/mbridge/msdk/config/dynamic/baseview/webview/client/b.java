package com.mbridge.msdk.config.dynamic.baseview.webview.client;

import android.graphics.Bitmap;
import android.net.http.SslError;
import android.view.ViewGroup;
import android.webkit.RenderProcessGoneDetail;
import android.webkit.SslErrorHandler;
import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.mbridge.msdk.config.dynamic.baseview.webview.ComponentWebView;
import com.mbridge.msdk.foundation.tools.q0;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public class b extends WebViewClient {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f32704a = "MBWebViewClient";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private com.mbridge.msdk.config.dynamic.baseview.webview.listener.a f32705b;

    public void a(com.mbridge.msdk.config.dynamic.baseview.webview.listener.a aVar) {
        this.f32705b = aVar;
    }

    @Override // android.webkit.WebViewClient
    public void onPageFinished(WebView webView, String str) {
        super.onPageFinished(webView, str);
        com.mbridge.msdk.config.dynamic.baseview.webview.listener.a aVar = this.f32705b;
        if (aVar != null) {
            aVar.onPageFinished(webView, str);
        }
    }

    @Override // android.webkit.WebViewClient
    public void onPageStarted(WebView webView, String str, Bitmap bitmap) {
        super.onPageStarted(webView, str, bitmap);
        com.mbridge.msdk.config.dynamic.baseview.webview.listener.a aVar = this.f32705b;
        if (aVar != null) {
            aVar.onPageStarted(webView, str, bitmap);
        }
    }

    @Override // android.webkit.WebViewClient
    public void onReceivedError(WebView webView, WebResourceRequest webResourceRequest, WebResourceError webResourceError) {
        super.onReceivedError(webView, webResourceRequest, webResourceError);
    }

    @Override // android.webkit.WebViewClient
    public void onReceivedSslError(WebView webView, SslErrorHandler sslErrorHandler, SslError sslError) {
        super.onReceivedSslError(webView, sslErrorHandler, sslError);
        com.mbridge.msdk.config.dynamic.baseview.webview.listener.a aVar = this.f32705b;
        if (aVar != null) {
            aVar.onReceivedSslError(webView, sslErrorHandler, sslError);
        }
    }

    @Override // android.webkit.WebViewClient
    public boolean onRenderProcessGone(WebView webView, RenderProcessGoneDetail renderProcessGoneDetail) {
        q0.b("MBWebViewClient", "WebView called onRenderProcessGone");
        if (webView != null) {
            try {
                ViewGroup viewGroup = (ViewGroup) webView.getParent();
                if (viewGroup != null) {
                    viewGroup.removeView(webView);
                }
                if (webView instanceof ComponentWebView) {
                    ComponentWebView componentWebView = (ComponentWebView) webView;
                    if (!componentWebView.isDestroyed()) {
                        componentWebView.destroy();
                    }
                } else {
                    webView.destroy();
                }
            } catch (Throwable th2) {
                q0.b("MBWebViewClient", th2.getMessage());
                return true;
            }
        }
        com.mbridge.msdk.config.dynamic.baseview.webview.listener.a aVar = this.f32705b;
        if (aVar != null) {
            aVar.onRenderProcessGone(webView);
        }
        return true;
    }

    @Override // android.webkit.WebViewClient
    public boolean shouldOverrideUrlLoading(WebView webView, String str) {
        com.mbridge.msdk.config.dynamic.baseview.webview.listener.a aVar = this.f32705b;
        return aVar != null ? aVar.shouldOverrideUrlLoading(webView, str) : super.shouldOverrideUrlLoading(webView, str);
    }

    @Override // android.webkit.WebViewClient
    public void onReceivedError(WebView webView, int i10, String str, String str2) {
        super.onReceivedError(webView, i10, str, str2);
        com.mbridge.msdk.config.dynamic.baseview.webview.listener.a aVar = this.f32705b;
        if (aVar != null) {
            aVar.onReceivedError(webView, i10, str, str2);
        }
    }

    @Override // android.webkit.WebViewClient
    public boolean shouldOverrideUrlLoading(WebView webView, WebResourceRequest webResourceRequest) {
        com.mbridge.msdk.config.dynamic.baseview.webview.listener.a aVar = this.f32705b;
        if (aVar != null) {
            return aVar.shouldOverrideUrlLoading(webView, webResourceRequest.getUrl().toString());
        }
        return super.shouldOverrideUrlLoading(webView, webResourceRequest);
    }
}
