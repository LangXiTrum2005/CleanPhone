package com.smartdigimkt.g;

import android.graphics.Bitmap;
import android.net.Uri;
import android.text.TextUtils;
import android.webkit.ValueCallback;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import com.p004ironsource.d9;
import com.smartdigimkt.d7.d;
import com.smartdigimkt.expressad.advanced.js.NativeAdvancedJSBridgeImpl;
import com.smartdigimkt.expressad.atsignalcommon.windvane.WindVaneWebView;
import com.smartdigimkt.f.c;
import com.smartdigimkt.n8.t;
import com.smartdigimkt.u4.b;
import com.vungle.ads.internal.model.AdPayload;
import java.io.FileInputStream;
import java.net.URLDecoder;
import java.util.HashMap;

/* JADX INFO: loaded from: classes5.dex */
public class a extends b {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    String f35265e;
    com.smartdigimkt.f.a f;
    private c g;
    private final String d = "NativeAdvancedWebViewClient";

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final String f35266h = com.smartdigimkt.r4.a.b("YkRXhr5AWBPfNgzuH7JQ+2Ha");

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final String f35267i = com.smartdigimkt.r4.a.b("Y+xgWkl2");

    /* JADX INFO: renamed from: com.smartdigimkt.g.a$a, reason: collision with other inner class name */
    public class C0484a implements ValueCallback<String> {
        public C0484a() {
        }

        @Override // android.webkit.ValueCallback
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void onReceiveValue(String str) {
        }
    }

    public a(String str, com.smartdigimkt.f.a aVar, c cVar) {
        this.f35265e = str;
        this.f = aVar;
        this.g = cVar;
    }

    private WebResourceResponse a(WebView webView, String str) {
        if (!TextUtils.isEmpty(str) && this.g != null) {
            try {
                String strReplace = str.startsWith(d9.h.f24719b) ? str.replace(AdPayload.FILE_SCHEME, "") : "";
                if (a(str)) {
                    strReplace = this.g.a(URLDecoder.decode(Uri.parse(str).getQueryParameter("uri")));
                }
                if (webView.getContext() == null) {
                    com.smartdigimkt.u.a.f().d();
                }
                boolean zA = t.a(strReplace, d.c().b(4));
                boolean z2 = com.smartdigimkt.b.b.f33800a;
                if (!TextUtils.isEmpty(strReplace) && zA && !strReplace.contains("127.0.0.1") && !strReplace.startsWith("http")) {
                    HashMap map = new HashMap();
                    map.put("Access-Control-Allow-Origin", "*");
                    WebResourceResponse webResourceResponse = new WebResourceResponse("video/mp4", "utf-8", new FileInputStream(strReplace));
                    webResourceResponse.setResponseHeaders(map);
                    boolean z3 = com.smartdigimkt.b.b.f33800a;
                    return webResourceResponse;
                }
                return null;
            } catch (Throwable th) {
                th.getMessage();
            }
        }
        return null;
    }

    public void b() {
        if (this.g != null) {
            this.g = null;
        }
    }

    @Override // android.webkit.WebViewClient
    public void onPageStarted(WebView webView, String str, Bitmap bitmap) {
        super.onPageStarted(webView, str, bitmap);
        try {
            webView.evaluateJavascript("javascript:" + com.smartdigimkt.j5.b.a().b(), new C0484a());
        } catch (Throwable unused) {
        }
    }

    @Override // android.webkit.WebViewClient
    public WebResourceResponse shouldInterceptRequest(WebView webView, String str) {
        return a(webView, str);
    }

    @Override // com.smartdigimkt.u4.b, android.webkit.WebViewClient
    public boolean shouldOverrideUrlLoading(WebView webView, String str) {
        try {
            try {
                WindVaneWebView windVaneWebView = (WindVaneWebView) webView;
                if (System.currentTimeMillis() - windVaneWebView.lastTouchTime > com.smartdigimkt.r.a.f37982e && com.smartdigimkt.r.a.a(((NativeAdvancedJSBridgeImpl) windVaneWebView.getObject()).getmCampaignList().get(0), windVaneWebView.getUrl(), com.smartdigimkt.r.a.d)) {
                    return false;
                }
            } catch (Exception e2) {
                e2.printStackTrace();
            }
            com.smartdigimkt.f.a aVar = this.f;
            if (aVar == null) {
                return true;
            }
            aVar.a(false, str);
            return true;
        } catch (Throwable unused) {
            return false;
        }
    }

    @Override // android.webkit.WebViewClient
    public WebResourceResponse shouldInterceptRequest(WebView webView, WebResourceRequest webResourceRequest) {
        return a(webView, webResourceRequest.getUrl().toString());
    }

    private boolean a(String str) {
        Uri uri;
        String scheme;
        if (TextUtils.isEmpty(str) || (uri = Uri.parse(str)) == null || (scheme = uri.getScheme()) == null || TextUtils.isEmpty(scheme)) {
            return false;
        }
        return scheme.equals(this.f35267i) || scheme.equals("mb-h5");
    }
}
