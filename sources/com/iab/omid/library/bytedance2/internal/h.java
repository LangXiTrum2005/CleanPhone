package com.iab.omid.library.bytedance2.internal;

import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.webkit.WebView;
import com.iab.omid.library.bytedance2.adsession.ErrorType;
import com.p004ironsource.d9;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
public class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static h f21758a = new h();

    public class a implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ WebView f21759a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f21760b;

        public a(WebView webView, String str) {
            this.f21759a = webView;
            this.f21760b = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            h.this.c(this.f21759a, this.f21760b);
        }
    }

    private h() {
    }

    public static final h a() {
        return f21758a;
    }

    public void b(WebView webView, String str) {
        a(webView, "publishImpressionEvent", str);
    }

    public void c(WebView webView, String str, String str2) {
        if (str == null || TextUtils.isEmpty(str2)) {
            return;
        }
        c(webView, "(function() {this.omidVerificationProperties = this.omidVerificationProperties || {};Object.defineProperty(this.omidVerificationProperties, 'injectionId', {get: function() {var currentScript = document && document.currentScript;return currentScript && currentScript.getAttribute('data-injection-id');}, configurable: true});var script = document.createElement('script');script.setAttribute(\"type\",\"text/javascript\");script.setAttribute(\"src\",\"%SCRIPT_SRC%\");script.setAttribute(\"data-injection-id\",\"%INJECTION_ID%\");document.body.appendChild(script);})();".replace("%SCRIPT_SRC%", str).replace("%INJECTION_ID%", str2));
    }

    public void a(WebView webView, String str) {
        a(webView, "finishSession", str);
    }

    public void b(WebView webView, String str, String str2) {
        a(webView, "setState", str2, str);
    }

    public boolean c(WebView webView, String str) {
        if (webView == null || TextUtils.isEmpty(str)) {
            return false;
        }
        try {
            webView.evaluateJavascript(str, null);
            return true;
        } catch (IllegalStateException unused) {
            webView.loadUrl("javascript: ".concat(String.valueOf(str)));
            return true;
        }
    }

    public void a(WebView webView, String str, float f) {
        a(webView, "setDeviceVolume", Float.valueOf(f), str);
    }

    public void b(WebView webView, String str, JSONObject jSONObject) {
        a(webView, "publishLoadedEvent", jSONObject, str);
    }

    public void a(WebView webView, String str, ErrorType errorType, String str2) {
        a(webView, "error", errorType.toString(), str2, str);
    }

    public void a(WebView webView, String str, String str2) {
        a(webView, "setNativeViewHierarchy", str2, str);
    }

    public void a(WebView webView, String str, String str2, JSONObject jSONObject) {
        a(webView, "publishMediaEvent", str2, jSONObject, str);
    }

    public void a(WebView webView, String str, JSONObject jSONObject) {
        a(webView, d9.a.f, jSONObject, str);
    }

    public void a(WebView webView, String str, JSONObject jSONObject, JSONObject jSONObject2, JSONObject jSONObject3) {
        a(webView, "startSession", str, jSONObject, jSONObject2, jSONObject3);
    }

    public void a(WebView webView, String str, Object... objArr) {
        if (webView == null) {
            com.iab.omid.library.bytedance2.utils.d.a("The WebView is null for ".concat(String.valueOf(str)));
            return;
        }
        StringBuilder sb = new StringBuilder(128);
        sb.append("if(window.omidBridge!==undefined){omidBridge.");
        sb.append(str);
        sb.append("(");
        a(sb, objArr);
        sb.append(")}");
        a(webView, sb);
    }

    public void a(WebView webView, StringBuilder sb) {
        String string = sb.toString();
        Handler handler = webView.getHandler();
        if (handler == null || Looper.myLooper() == handler.getLooper()) {
            c(webView, string);
        } else {
            handler.post(new a(webView, string));
        }
    }

    public void a(WebView webView, JSONObject jSONObject) {
        a(webView, "setLastActivity", jSONObject);
    }

    public void a(StringBuilder sb, Object[] objArr) {
        String string;
        if (objArr == null || objArr.length <= 0) {
            return;
        }
        for (Object obj : objArr) {
            if (obj == null) {
                string = AbstractJsonLexerKt.NULL;
            } else {
                if (obj instanceof String) {
                    string = obj.toString();
                    if (!string.startsWith("{")) {
                        sb.append(AbstractJsonLexerKt.STRING);
                        sb.append(string);
                        sb.append(AbstractJsonLexerKt.STRING);
                    }
                } else {
                    sb.append(obj);
                }
                sb.append(",");
            }
            sb.append(string);
            sb.append(",");
        }
        sb.setLength(sb.length() - 1);
    }
}
