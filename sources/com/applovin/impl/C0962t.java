package com.applovin.impl;

import android.content.Intent;
import android.webkit.ConsoleMessage;
import android.webkit.JsResult;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import com.applovin.impl.sdk.AppLovinBroadcastManager;
import com.applovin.impl.sdk.ad.AppLovinAdImpl;
import java.util.Map;

/* JADX INFO: renamed from: com.applovin.impl.t, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C0962t extends WebChromeClient {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final com.applovin.impl.sdk.k f11893a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final com.applovin.impl.sdk.o f11894b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final com.applovin.impl.adview.a f11895c;

    public C0962t(com.applovin.impl.adview.a aVar, com.applovin.impl.sdk.k kVar) {
        this.f11893a = kVar;
        this.f11894b = kVar.O();
        this.f11895c = aVar;
    }

    private void a(String str, ConsoleMessage consoleMessage) {
        com.applovin.impl.sdk.ad.b bVarG = this.f11895c.g();
        if (bVarG != null) {
            String str2 = consoleMessage.messageLevel() + ": " + consoleMessage.sourceId() + ": " + consoleMessage.lineNumber();
            String strConcat = str == null ? "AdWebView" : "AdWebView:".concat(str);
            Map mapA = f2.a((AppLovinAdImpl) bVarG);
            mapA.putAll(f2.a(bVarG));
            mapA.put("source", strConcat);
            mapA.put("top_main_method", str2);
            mapA.put("error_message", consoleMessage.message());
            this.f11893a.D().d(d2.Z0, mapA);
        }
    }

    @Override // android.webkit.WebChromeClient
    public boolean onConsoleMessage(ConsoleMessage consoleMessage) {
        String str = consoleMessage.messageLevel() + ": " + consoleMessage.sourceId() + ": " + consoleMessage.lineNumber() + ": " + consoleMessage.message();
        if (com.applovin.impl.sdk.o.a()) {
            this.f11894b.a("AdWebView", str);
        }
        if (consoleMessage.messageLevel() != ConsoleMessage.MessageLevel.ERROR) {
            return true;
        }
        String strMessage = consoleMessage.message();
        if (strMessage.contains("al_onPoststitialShow")) {
            AppLovinBroadcastManager.sendBroadcast(new Intent("com.applovin.al_onPoststitialShow_evaluation_error"), null);
            a("onPoststitialShowEvaluationError", consoleMessage);
        } else if (strMessage.contains("SyntaxError")) {
            a(null, consoleMessage);
        }
        return true;
    }

    @Override // android.webkit.WebChromeClient
    public boolean onJsAlert(WebView webView, String str, String str2, JsResult jsResult) {
        if (!com.applovin.impl.sdk.o.a()) {
            return true;
        }
        this.f11894b.k("AdWebView", "Alert attempted: " + str2);
        return true;
    }

    @Override // android.webkit.WebChromeClient
    public boolean onJsBeforeUnload(WebView webView, String str, String str2, JsResult jsResult) {
        if (!com.applovin.impl.sdk.o.a()) {
            return true;
        }
        this.f11894b.k("AdWebView", "JS onBeforeUnload attempted: " + str2);
        return true;
    }

    @Override // android.webkit.WebChromeClient
    public boolean onJsConfirm(WebView webView, String str, String str2, JsResult jsResult) {
        if (!com.applovin.impl.sdk.o.a()) {
            return true;
        }
        this.f11894b.k("AdWebView", "JS confirm attempted: " + str2);
        return true;
    }

    @Override // android.webkit.WebChromeClient
    public void onProgressChanged(WebView webView, int i2) {
        com.applovin.impl.adview.a aVar;
        if (i2 != 100 || (aVar = this.f11895c) == null) {
            return;
        }
        aVar.c(webView);
    }

    @Override // android.webkit.WebChromeClient
    public void onConsoleMessage(String str, int i2, String str2) {
        if (com.applovin.impl.sdk.o.a()) {
            this.f11894b.k("AdWebView", "console.log[" + i2 + "] :" + str);
        }
    }
}
