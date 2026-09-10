package com.mbridge.msdk.advanced.view;

import android.graphics.Bitmap;
import android.net.Uri;
import android.text.TextUtils;
import android.webkit.ValueCallback;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import androidx.annotation.Nullable;
import com.ironsource.B5;
import com.ironsource.X3;
import com.mbridge.msdk.advanced.middle.c;
import com.mbridge.msdk.foundation.same.directory.e;
import com.mbridge.msdk.foundation.tools.k0;
import com.mbridge.msdk.foundation.tools.q0;
import com.mbridge.msdk.mbsignalcommon.base.b;
import com.mbridge.msdk.mbsignalcommon.windvane.WindVaneWebView;
import com.mbridge.msdk.playercommon.exoplayer2.util.MimeTypes;
import java.io.FileInputStream;
import java.net.URLDecoder;
import java.util.HashMap;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public class a extends b {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final String f31597c = "NativeAdvancedWebViewClient";

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final String f31598d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final String f31599e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    String f31600f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    com.mbridge.msdk.advanced.middle.a f31601g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private c f31602h;

    public a(String str, com.mbridge.msdk.advanced.middle.a aVar, c cVar) {
        com.mbridge.msdk.foundation.same.directory.c cVar2 = com.mbridge.msdk.foundation.same.directory.c.MBRIDGE_VC;
        this.f31598d = e.b(cVar2) != null ? e.b(cVar2) : k0.a("YkRXhr5AWBPfNgzuH7JQ+2Ha");
        this.f31599e = k0.a("Y+xgWkl2");
        this.f31600f = str;
        this.f31601g = aVar;
        this.f31602h = cVar;
    }

    private WebResourceResponse a(WebView webView, String str) {
        if (!TextUtils.isEmpty(str) && this.f31602h != null) {
            try {
                String strA = "";
                if (str.startsWith(X3.i.f27782b) && str.startsWith(this.f31598d)) {
                    strA = str.replace("file://", "");
                }
                if (a(str)) {
                    strA = this.f31602h.a(URLDecoder.decode(Uri.parse(str).getQueryParameter("uri")));
                }
                if (!TextUtils.isEmpty(strA) && a(strA, this.f31598d)) {
                    q0.a("NativeAdvancedWebViewClient", "replace url : " + strA);
                    if (!strA.contains("127.0.0.1") && !strA.startsWith("http")) {
                        HashMap map = new HashMap();
                        map.put("Access-Control-Allow-Origin", "*");
                        WebResourceResponse webResourceResponse = new WebResourceResponse(MimeTypes.VIDEO_MP4, B5.O, new FileInputStream(strA));
                        webResourceResponse.setResponseHeaders(map);
                        return webResourceResponse;
                    }
                    return null;
                }
            } catch (Throwable th2) {
                q0.b("NativeAdvancedWebViewClient", th2.getMessage());
            }
        }
        return null;
    }

    public void b() {
        if (this.f31602h != null) {
            this.f31602h = null;
        }
    }

    @Override // android.webkit.WebViewClient
    public void onPageStarted(WebView webView, String str, Bitmap bitmap) {
        super.onPageStarted(webView, str, bitmap);
        try {
            webView.evaluateJavascript("javascript:" + com.mbridge.msdk.setting.util.a.a().b(), new C0099a());
        } catch (Throwable th2) {
            q0.b("NativeAdvancedWebViewClient", "onPageStarted", th2);
        }
    }

    @Override // android.webkit.WebViewClient
    @Nullable
    public WebResourceResponse shouldInterceptRequest(WebView webView, String str) {
        return a(webView, str);
    }

    @Override // com.mbridge.msdk.mbsignalcommon.base.b, android.webkit.WebViewClient
    public boolean shouldOverrideUrlLoading(WebView webView, String str) {
        try {
            try {
                WindVaneWebView windVaneWebView = (WindVaneWebView) webView;
                if (System.currentTimeMillis() - windVaneWebView.lastTouchTime > com.mbridge.msdk.click.utils.a.f31780d && com.mbridge.msdk.click.utils.a.a(((com.mbridge.msdk.advanced.signal.b) windVaneWebView.getObject()).a().get(0), windVaneWebView.getUrl(), com.mbridge.msdk.click.utils.a.f31778b)) {
                    return false;
                }
            } catch (Exception e10) {
                q0.b("NativeAdvancedWebViewClient", e10.getMessage());
            }
            q0.b("NativeAdvancedWebViewClient", "Use html to open url.");
            com.mbridge.msdk.advanced.middle.a aVar = this.f31601g;
            if (aVar == null) {
                return true;
            }
            aVar.a(false, str);
            return true;
        } catch (Throwable th2) {
            q0.b("NativeAdvancedWebViewClient", "shouldOverrideUrlLoading", th2);
            return false;
        }
    }

    @Override // android.webkit.WebViewClient
    @Nullable
    public WebResourceResponse shouldInterceptRequest(WebView webView, WebResourceRequest webResourceRequest) {
        return a(webView, webResourceRequest.getUrl().toString());
    }

    private boolean a(String str) {
        Uri uri;
        String scheme;
        if (TextUtils.isEmpty(str) || (uri = Uri.parse(str)) == null || (scheme = uri.getScheme()) == null || TextUtils.isEmpty(scheme)) {
            return false;
        }
        return scheme.equals(this.f31599e) || scheme.equals("mb-h5");
    }

    /* JADX INFO: renamed from: com.mbridge.msdk.advanced.view.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    public class C0099a implements ValueCallback<String> {
        public C0099a() {
        }

        @Override // android.webkit.ValueCallback
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void onReceiveValue(String str) {
        }
    }
}
