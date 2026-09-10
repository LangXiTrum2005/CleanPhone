package com.smartdigimkt.e1;

import android.content.Intent;
import android.graphics.Bitmap;
import android.net.Uri;
import android.webkit.ValueCallback;
import android.webkit.WebResourceRequest;
import android.webkit.WebView;
import com.smartdigimkt.sdk.basead.express.web.BaseWebView;
import com.smartdigimkt.u4.b;
import com.smartdigimkt.x.d;
import java.util.List;

/* JADX INFO: loaded from: classes5.dex */
public class a extends b {
    private final String d = "BannerWebViewClient";

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    String f34603e;
    List<d> f;
    com.smartdigimkt.a1.a g;

    /* JADX INFO: renamed from: com.smartdigimkt.e1.a$a, reason: collision with other inner class name */
    public class C0465a implements ValueCallback<String> {
        public C0465a() {
        }

        @Override // android.webkit.ValueCallback
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void onReceiveValue(String str) {
        }
    }

    public a(String str, List<d> list, com.smartdigimkt.a1.a aVar) {
        this.f34603e = str;
        this.f = list;
        this.g = aVar;
    }

    @Override // android.webkit.WebViewClient
    public void onPageStarted(WebView webView, String str, Bitmap bitmap) {
        super.onPageStarted(webView, str, bitmap);
        try {
            webView.evaluateJavascript("javascript:" + com.smartdigimkt.j5.b.a().b(), new C0465a());
        } catch (Throwable unused) {
        }
    }

    @Override // android.webkit.WebViewClient
    public boolean shouldOverrideUrlLoading(WebView webView, WebResourceRequest webResourceRequest) {
        return super.shouldOverrideUrlLoading(webView, webResourceRequest);
    }

    @Override // com.smartdigimkt.u4.b, android.webkit.WebViewClient
    public boolean shouldOverrideUrlLoading(WebView webView, String str) {
        try {
            BaseWebView baseWebView = (BaseWebView) webView;
            if (System.currentTimeMillis() - baseWebView.lastTouchTime > com.smartdigimkt.r.a.f37982e && com.smartdigimkt.r.a.a(this.f.get(0), baseWebView.getUrl(), com.smartdigimkt.r.a.d)) {
                return false;
            }
            if (this.f.size() > 1) {
                com.smartdigimkt.m6.b.p().k().startActivity(new Intent("android.intent.action.VIEW", Uri.parse(str)));
                str = null;
            }
            com.smartdigimkt.a1.a aVar = this.g;
            if (aVar != null) {
                aVar.a(false, str);
            }
            return true;
        } catch (Throwable unused) {
            return false;
        }
    }
}
