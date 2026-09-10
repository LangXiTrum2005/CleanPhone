package com.mbridge.msdk.mbsignalcommon.base;

import android.net.http.SslError;
import android.view.ViewGroup;
import android.webkit.RenderProcessGoneDetail;
import android.webkit.SslErrorHandler;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.mbridge.msdk.foundation.tools.q0;
import com.mbridge.msdk.mbsignalcommon.windvane.WindVaneWebView;
import java.io.File;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public class b extends WebViewClient {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private a f34802a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private com.mbridge.msdk.mbsignalcommon.windvane.c f34803b;

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
        com.mbridge.msdk.mbsignalcommon.windvane.c cVar = this.f34803b;
        if (cVar != null) {
            cVar.onPageFinished(webView, str);
        }
    }

    @Override // android.webkit.WebViewClient
    public void onReceivedError(WebView webView, int i10, String str, String str2) {
        super.onReceivedError(webView, i10, str, str2);
        com.mbridge.msdk.mbsignalcommon.windvane.c cVar = this.f34803b;
        if (cVar != null) {
            cVar.onReceivedError(webView, i10, str, str2);
        }
    }

    @Override // android.webkit.WebViewClient
    public void onReceivedSslError(WebView webView, SslErrorHandler sslErrorHandler, SslError sslError) {
        super.onReceivedSslError(webView, sslErrorHandler, sslError);
        com.mbridge.msdk.mbsignalcommon.windvane.c cVar = this.f34803b;
        if (cVar != null) {
            cVar.onReceivedSslError(webView, sslErrorHandler, sslError);
        }
    }

    @Override // android.webkit.WebViewClient
    public boolean onRenderProcessGone(WebView webView, RenderProcessGoneDetail renderProcessGoneDetail) {
        q0.b("BaseWebViewClient", "WebView called onRenderProcessGone");
        if (webView != null) {
            try {
                ViewGroup viewGroup = (ViewGroup) webView.getParent();
                if (viewGroup != null) {
                    viewGroup.removeView(webView);
                }
                if (webView instanceof WindVaneWebView) {
                    ((WindVaneWebView) webView).release();
                } else {
                    webView.destroy();
                }
            } catch (Throwable th2) {
                q0.b("BaseWebViewClient", th2.getMessage());
                return true;
            }
        }
        com.mbridge.msdk.mbsignalcommon.windvane.c cVar = this.f34803b;
        if (cVar != null) {
            cVar.onRenderProcessGone(webView);
        }
        return true;
    }

    @Override // android.webkit.WebViewClient
    public boolean shouldOverrideUrlLoading(WebView webView, String str) {
        a aVar = this.f34802a;
        if (aVar != null && aVar.a(str)) {
            return true;
        }
        com.mbridge.msdk.mbsignalcommon.windvane.c cVar = this.f34803b;
        if (cVar != null) {
            cVar.shouldOverrideUrlLoading(webView, str);
        }
        return super.shouldOverrideUrlLoading(webView, str);
    }

    public void a(a aVar) {
        this.f34802a = aVar;
    }

    public a a() {
        return this.f34802a;
    }

    public void a(com.mbridge.msdk.mbsignalcommon.windvane.c cVar) {
        this.f34803b = cVar;
    }
}
