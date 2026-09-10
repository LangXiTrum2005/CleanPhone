package com.mbridge.msdk.splash.view;

import android.graphics.Bitmap;
import android.webkit.ValueCallback;
import android.webkit.WebView;
import com.mbridge.msdk.foundation.tools.q0;
import com.mbridge.msdk.mbsignalcommon.base.b;
import com.mbridge.msdk.mbsignalcommon.windvane.WindVaneWebView;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public class a extends b {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final String f36067c = "SplashWebViewClient";

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    com.mbridge.msdk.splash.middle.a f36068d;

    public void a(com.mbridge.msdk.splash.middle.a aVar) {
        if (aVar != null) {
            this.f36068d = aVar;
        }
    }

    @Override // android.webkit.WebViewClient
    public void onPageStarted(WebView webView, String str, Bitmap bitmap) {
        super.onPageStarted(webView, str, bitmap);
        try {
            webView.evaluateJavascript("javascript:" + com.mbridge.msdk.setting.util.a.a().b(), new C0183a());
        } catch (Throwable th2) {
            q0.b("SplashWebViewClient", "onPageStarted", th2);
        }
    }

    @Override // com.mbridge.msdk.mbsignalcommon.base.b, android.webkit.WebViewClient
    public boolean shouldOverrideUrlLoading(WebView webView, String str) {
        try {
            WindVaneWebView windVaneWebView = (WindVaneWebView) webView;
            if (System.currentTimeMillis() - windVaneWebView.lastTouchTime > com.mbridge.msdk.click.utils.a.f31780d && com.mbridge.msdk.click.utils.a.a(((com.mbridge.msdk.splash.signal.b) windVaneWebView.getObject()).b().get(0), windVaneWebView.getUrl(), com.mbridge.msdk.click.utils.a.f31778b)) {
                return false;
            }
            com.mbridge.msdk.splash.middle.a aVar = this.f36068d;
            if (aVar == null) {
                return true;
            }
            aVar.a(false, str);
            return true;
        } catch (Throwable th2) {
            q0.b("SplashWebViewClient", "shouldOverrideUrlLoading", th2);
            return false;
        }
    }

    /* JADX INFO: renamed from: com.mbridge.msdk.splash.view.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    public class C0183a implements ValueCallback<String> {
        public C0183a() {
        }

        @Override // android.webkit.ValueCallback
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void onReceiveValue(String str) {
        }
    }
}
