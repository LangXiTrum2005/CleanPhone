package com.smartdigimkt.v1;

import android.graphics.Bitmap;
import android.webkit.ValueCallback;
import android.webkit.WebView;
import com.smartdigimkt.expressad.atsignalcommon.windvane.WindVaneWebView;
import com.smartdigimkt.expressad.splash.js.SplashJSBridgeImpl;

/* JADX INFO: loaded from: classes6.dex */
public class b extends com.smartdigimkt.u4.b {
    private final String d = "SplashWebViewClient";

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    com.smartdigimkt.u1.a f39057e;

    public class a implements ValueCallback<String> {
        public a() {
        }

        @Override // android.webkit.ValueCallback
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void onReceiveValue(String str) {
        }
    }

    public void a(com.smartdigimkt.u1.a aVar) {
        if (aVar != null) {
            this.f39057e = aVar;
        }
    }

    @Override // android.webkit.WebViewClient
    public void onPageStarted(WebView webView, String str, Bitmap bitmap) {
        super.onPageStarted(webView, str, bitmap);
        try {
            webView.evaluateJavascript("javascript:" + com.smartdigimkt.j5.b.a().b(), new a());
        } catch (Throwable unused) {
        }
    }

    @Override // com.smartdigimkt.u4.b, android.webkit.WebViewClient
    public boolean shouldOverrideUrlLoading(WebView webView, String str) {
        try {
            WindVaneWebView windVaneWebView = (WindVaneWebView) webView;
            if (System.currentTimeMillis() - windVaneWebView.lastTouchTime > com.smartdigimkt.r.a.f37982e && com.smartdigimkt.r.a.a(((SplashJSBridgeImpl) windVaneWebView.getObject()).getmCampaignList().get(0), windVaneWebView.getUrl(), com.smartdigimkt.r.a.d)) {
                return false;
            }
            com.smartdigimkt.u1.a aVar = this.f39057e;
            if (aVar == null) {
                return true;
            }
            aVar.a(false, str);
            return true;
        } catch (Throwable unused) {
            return false;
        }
    }
}
