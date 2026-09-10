package com.smartdigimkt.g6;

import android.graphics.Bitmap;
import android.net.http.SslError;
import android.text.TextUtils;
import android.view.ViewGroup;
import android.webkit.RenderProcessGoneDetail;
import android.webkit.SslErrorHandler;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.smartdigimkt.n8.t;
import com.smartdigimkt.sdk.basead.webtemplet.WTWebView;
import com.vungle.ads.internal.model.AdPayload;
import java.io.File;
import java.io.FileInputStream;

/* JADX INFO: loaded from: classes5.dex */
public class j extends WebViewClient {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f35492a = "j";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private c f35493b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private String f35494c;
    g d;

    public void a(WTWebView wTWebView) {
        this.d = new g(wTWebView);
    }

    @Override // android.webkit.WebViewClient
    public void onPageFinished(WebView webView, String str) {
        super.onPageFinished(webView, str);
        c cVar = this.f35493b;
        if (cVar != null) {
            cVar.onPageFinished(webView, str);
        }
    }

    @Override // android.webkit.WebViewClient
    public void onPageStarted(WebView webView, String str, Bitmap bitmap) {
        super.onPageStarted(webView, str, bitmap);
        this.f35494c = str;
        c cVar = this.f35493b;
        if (cVar != null) {
            cVar.onPageStarted(webView, str, bitmap);
        }
    }

    @Override // android.webkit.WebViewClient
    public void onReceivedError(WebView webView, int i2, String str, String str2) {
        super.onReceivedError(webView, i2, str, str2);
        c cVar = this.f35493b;
        if (cVar != null) {
            cVar.onReceivedError(webView, i2, str, str2);
        }
    }

    @Override // android.webkit.WebViewClient
    public void onReceivedSslError(WebView webView, SslErrorHandler sslErrorHandler, SslError sslError) {
        super.onReceivedSslError(webView, sslErrorHandler, sslError);
        sslError.toString();
        c cVar = this.f35493b;
        if (cVar != null) {
            cVar.onReceivedSslError(webView, sslErrorHandler, sslError);
        }
    }

    /* JADX WARN: Code duplicated, block: B:16:0x0033 A[Catch: all -> 0x0036, TRY_LEAVE, TryCatch #0 {all -> 0x0036, blocks: (B:7:0x0016, B:9:0x001e, B:10:0x0021, B:12:0x0025, B:13:0x002c, B:14:0x002f, B:16:0x0033), top: B:19:0x0016 }] */
    @Override // android.webkit.WebViewClient
    public boolean onRenderProcessGone(WebView webView, RenderProcessGoneDetail renderProcessGoneDetail) {
        c cVar;
        if (("onRenderProcessGone:" + renderProcessGoneDetail) != null) {
            renderProcessGoneDetail.toString();
        }
        if (webView != null) {
            try {
                ViewGroup viewGroup = (ViewGroup) webView.getParent();
                if (viewGroup != null) {
                    viewGroup.removeView(webView);
                }
                if (webView instanceof WTWebView) {
                    ((WTWebView) webView).release();
                } else {
                    webView.destroy();
                }
                cVar = this.f35493b;
                if (cVar != null) {
                    cVar.onRenderProcessGone(webView);
                }
            } catch (Throwable unused) {
            }
        } else {
            cVar = this.f35493b;
            if (cVar != null) {
                cVar.onRenderProcessGone(webView);
            }
        }
        return true;
    }

    @Override // android.webkit.WebViewClient
    public WebResourceResponse shouldInterceptRequest(WebView webView, String str) {
        if (str.startsWith("file:")) {
            String str2 = "";
            String strReplace = str.replace(AdPayload.FILE_SCHEME, "");
            if (!t.a(strReplace, com.smartdigimkt.d7.d.c().b(6))) {
                return null;
            }
            if (str.endsWith(".js")) {
                str2 = "application/javascript";
            } else if (str.endsWith(".html")) {
                str2 = "text/html";
            } else if (str.endsWith(".css")) {
                str2 = "text/css";
            }
            if (!TextUtils.isEmpty(str2)) {
                try {
                    File file = new File(strReplace);
                    if (file.exists()) {
                        return new WebResourceResponse(str2, "UTF-8", new FileInputStream(file));
                    }
                } catch (Throwable unused) {
                }
            }
        }
        WebResourceResponse webResourceResponseA = a(str);
        return webResourceResponseA != null ? webResourceResponseA : super.shouldInterceptRequest(webView, str);
    }

    @Override // android.webkit.WebViewClient
    public boolean shouldOverrideUrlLoading(WebView webView, String str) {
        if (TextUtils.isEmpty(str) || !str.startsWith(h.f35485a)) {
            c cVar = this.f35493b;
            if (cVar != null) {
                cVar.shouldOverrideUrlLoading(webView, str);
            }
            return super.shouldOverrideUrlLoading(webView, str);
        }
        if (!TextUtils.isEmpty(str) && str.startsWith(h.f35485a) && this.d.c(h.f35485a)) {
            this.d.a(str);
        }
        return true;
    }

    private WebResourceResponse a(String str) {
        Bitmap bitmapB;
        try {
            if (TextUtils.isEmpty(str) || !h.g(str) || (bitmapB = com.smartdigimkt.d7.b.a(com.smartdigimkt.m6.b.p().k()).b(new com.smartdigimkt.d7.e(1, str), 0, 0)) == null || bitmapB.isRecycled()) {
                return null;
            }
            return new WebResourceResponse(h.d(str), "utf-8", com.smartdigimkt.o8.b.a(bitmapB));
        } catch (Throwable th) {
            th.getMessage();
            return null;
        }
    }

    public void a(c cVar) {
        this.f35493b = cVar;
    }
}
