package com.mbridge.msdk.dycreator.baseview.webview.client;

import android.graphics.Bitmap;
import android.net.http.SslError;
import android.text.TextUtils;
import android.view.ViewGroup;
import android.webkit.RenderProcessGoneDetail;
import android.webkit.SslErrorHandler;
import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import androidx.annotation.Nullable;
import com.ironsource.B5;
import com.mbridge.msdk.dycreator.baseview.webview.MBWebView;
import com.mbridge.msdk.dycreator.baseview.webview.listener.WebViewEventListener;
import com.mbridge.msdk.dycreator.baseview.webview.util.MBHybridUtil;
import com.mbridge.msdk.foundation.controller.c;
import com.mbridge.msdk.foundation.same.image.a;
import com.mbridge.msdk.foundation.same.image.b;
import com.mbridge.msdk.foundation.tools.q0;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public class MBWebViewClient extends WebViewClient {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f33126a = "MBWebViewClient";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private WebViewEventListener f33127b;

    @Override // android.webkit.WebViewClient
    public void onPageFinished(WebView webView, String str) {
        super.onPageFinished(webView, str);
        WebViewEventListener webViewEventListener = this.f33127b;
        if (webViewEventListener != null) {
            webViewEventListener.onPageFinished(webView, str);
        }
    }

    @Override // android.webkit.WebViewClient
    public void onPageStarted(WebView webView, String str, Bitmap bitmap) {
        super.onPageStarted(webView, str, bitmap);
        WebViewEventListener webViewEventListener = this.f33127b;
        if (webViewEventListener != null) {
            webViewEventListener.onPageStarted(webView, str, bitmap);
        }
    }

    @Override // android.webkit.WebViewClient
    public void onReceivedError(WebView webView, WebResourceRequest webResourceRequest, WebResourceError webResourceError) {
        super.onReceivedError(webView, webResourceRequest, webResourceError);
    }

    @Override // android.webkit.WebViewClient
    public void onReceivedSslError(WebView webView, SslErrorHandler sslErrorHandler, SslError sslError) {
        super.onReceivedSslError(webView, sslErrorHandler, sslError);
        WebViewEventListener webViewEventListener = this.f33127b;
        if (webViewEventListener != null) {
            webViewEventListener.onReceivedSslError(webView, sslErrorHandler, sslError);
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
                if (webView instanceof MBWebView) {
                    MBWebView mBWebView = (MBWebView) webView;
                    if (!mBWebView.isDestroyed()) {
                        mBWebView.destroy();
                    }
                } else {
                    webView.destroy();
                }
            } catch (Throwable th2) {
                q0.b("MBWebViewClient", th2.getMessage());
                return true;
            }
        }
        WebViewEventListener webViewEventListener = this.f33127b;
        if (webViewEventListener != null) {
            webViewEventListener.onRenderProcessGone(webView);
        }
        return true;
    }

    public void setWebViewEventListener(WebViewEventListener webViewEventListener) {
        this.f33127b = webViewEventListener;
    }

    @Override // android.webkit.WebViewClient
    @Nullable
    public WebResourceResponse shouldInterceptRequest(WebView webView, String str) {
        Bitmap bitmapB;
        try {
            if (!TextUtils.isEmpty(str)) {
                String imageMimeType = MBHybridUtil.getImageMimeType(str);
                if (!TextUtils.isEmpty(imageMimeType) && (bitmapB = b.a(c.n().d()).b(str)) != null && !bitmapB.isRecycled()) {
                    return new WebResourceResponse(imageMimeType, B5.O, a.a(bitmapB));
                }
            }
        } catch (Throwable th2) {
            q0.b("MBWebViewClient", th2.getMessage());
        }
        return super.shouldInterceptRequest(webView, str);
    }

    @Override // android.webkit.WebViewClient
    public boolean shouldOverrideUrlLoading(WebView webView, String str) {
        WebViewEventListener webViewEventListener = this.f33127b;
        return webViewEventListener != null ? webViewEventListener.shouldOverrideUrlLoading(webView, str) : super.shouldOverrideUrlLoading(webView, str);
    }

    @Override // android.webkit.WebViewClient
    public void onReceivedError(WebView webView, int i10, String str, String str2) {
        super.onReceivedError(webView, i10, str, str2);
        WebViewEventListener webViewEventListener = this.f33127b;
        if (webViewEventListener != null) {
            webViewEventListener.onReceivedError(webView, i10, str, str2);
        }
    }

    @Override // android.webkit.WebViewClient
    public boolean shouldOverrideUrlLoading(WebView webView, WebResourceRequest webResourceRequest) {
        WebViewEventListener webViewEventListener = this.f33127b;
        if (webViewEventListener != null) {
            return webViewEventListener.shouldOverrideUrlLoading(webView, webResourceRequest.getUrl().toString());
        }
        return super.shouldOverrideUrlLoading(webView, webResourceRequest);
    }
}
