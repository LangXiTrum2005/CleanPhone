package com.smartdigimkt.g5;

import android.graphics.Bitmap;
import android.text.TextUtils;
import android.webkit.ValueCallback;
import android.webkit.WebResourceRequest;
import android.webkit.WebView;

/* JADX INFO: loaded from: classes5.dex */
public class k extends com.smartdigimkt.u4.b {
    final String d = getClass().getSimpleName();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    String f35466e;
    e f;

    public class a implements ValueCallback<String> {
        public a() {
        }

        @Override // android.webkit.ValueCallback
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void onReceiveValue(String str) {
        }
    }

    public k(String str) {
        this.f35466e = str;
    }

    public void a(e eVar) {
        this.f = eVar;
    }

    @Override // android.webkit.WebViewClient
    public void onPageStarted(WebView webView, String str, Bitmap bitmap) {
        super.onPageStarted(webView, str, bitmap);
        try {
            webView.evaluateJavascript("javascript:" + com.smartdigimkt.j5.b.a().b(), new a());
        } catch (Throwable unused) {
        }
    }

    @Override // android.webkit.WebViewClient
    public boolean shouldOverrideUrlLoading(WebView webView, WebResourceRequest webResourceRequest) {
        return super.shouldOverrideUrlLoading(webView, webResourceRequest);
    }

    @Override // com.smartdigimkt.u4.b, android.webkit.WebViewClient
    public boolean shouldOverrideUrlLoading(WebView webView, String str) {
        e eVar;
        try {
            if (!TextUtils.equals(str, this.f35466e) && (eVar = this.f) != null) {
                eVar.open(str);
            }
            return true;
        } catch (Throwable unused) {
            return false;
        }
    }
}
