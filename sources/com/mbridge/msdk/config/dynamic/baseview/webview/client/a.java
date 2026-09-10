package com.mbridge.msdk.config.dynamic.baseview.webview.client;

import android.webkit.WebChromeClient;
import android.webkit.WebView;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public class a extends WebChromeClient {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f32702a = "MBWebChromeClient";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private com.mbridge.msdk.config.dynamic.baseview.webview.listener.a f32703b;

    public void a(com.mbridge.msdk.config.dynamic.baseview.webview.listener.a aVar) {
        this.f32703b = aVar;
    }

    @Override // android.webkit.WebChromeClient
    public void onProgressChanged(WebView webView, int i10) {
        super.onProgressChanged(webView, i10);
        com.mbridge.msdk.config.dynamic.baseview.webview.listener.a aVar = this.f32703b;
        if (aVar != null) {
            aVar.onProgressChanged(webView, i10);
        }
    }
}
