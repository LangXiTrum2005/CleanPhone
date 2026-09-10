package com.smartdigimkt.g5;

import android.webkit.JsPromptResult;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import com.smartdigimkt.sdk.basead.mraid.MraidBaseWebView;

/* JADX INFO: loaded from: classes5.dex */
public class j extends WebChromeClient {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final String f35463c = "H5_ENTRY";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    MraidBaseWebView f35464a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private com.smartdigimkt.u4.c f35465b;

    public j(MraidBaseWebView mraidBaseWebView) {
        this.f35464a = mraidBaseWebView;
    }

    public void a(com.smartdigimkt.u4.c cVar) {
        this.f35465b = cVar;
    }

    @Override // android.webkit.WebChromeClient
    public boolean onJsPrompt(WebView webView, String str, String str2, String str3, JsPromptResult jsPromptResult) {
        a signalCommunication = this.f35464a.getSignalCommunication();
        if (signalCommunication == null || str3 == null || !signalCommunication.c(str3)) {
            return false;
        }
        signalCommunication.a(str2);
        jsPromptResult.confirm("");
        return true;
    }

    @Override // android.webkit.WebChromeClient
    public void onProgressChanged(WebView webView, int i2) {
        super.onProgressChanged(webView, i2);
        com.smartdigimkt.u4.c cVar = this.f35465b;
        if (cVar != null) {
            cVar.onProgressChanged(webView, i2);
        }
    }
}
