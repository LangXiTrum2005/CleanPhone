package com.mbridge.msdk.dycreator.baseview.webview.client;

import android.text.TextUtils;
import android.webkit.ConsoleMessage;
import android.webkit.JsPromptResult;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import com.mbridge.msdk.dycreator.baseview.webview.communicator.WebCommunicator;
import com.mbridge.msdk.dycreator.baseview.webview.listener.WebViewEventListener;
import com.mbridge.msdk.foundation.tools.q0;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public class MBWebChromeClient extends WebChromeClient {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f33123a = "MBWebChromeClient";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private WebViewEventListener f33124b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private WebCommunicator f33125c;

    private boolean a(String str) {
        WebCommunicator webCommunicator;
        try {
            if (!str.startsWith("mv:")) {
                if (str.startsWith("mraid:")) {
                }
                return false;
            }
            if (str.contains("wv_hybrid:")) {
                str = str.substring(0, str.lastIndexOf(" ") + 1);
            }
            q0.a("MBWebChromeClient", "onConsoleMessage: message.length() = " + str.length() + " " + str);
            if (!TextUtils.isEmpty(str) && (webCommunicator = this.f33125c) != null) {
                webCommunicator.onCommunication(str);
            }
            return true;
        } catch (Throwable th2) {
            q0.b("MBWebChromeClient", th2.getMessage());
        }
    }

    @Override // android.webkit.WebChromeClient
    public boolean onConsoleMessage(ConsoleMessage consoleMessage) {
        if (consoleMessage.messageLevel() != ConsoleMessage.MessageLevel.LOG) {
            return super.onConsoleMessage(consoleMessage);
        }
        if (TextUtils.isEmpty(consoleMessage.message()) || !a(consoleMessage.message())) {
            return super.onConsoleMessage(consoleMessage);
        }
        return true;
    }

    @Override // android.webkit.WebChromeClient
    public boolean onJsPrompt(WebView webView, String str, String str2, String str3, JsPromptResult jsPromptResult) {
        if (TextUtils.isEmpty(str2) || !a(str2)) {
            return false;
        }
        jsPromptResult.confirm("");
        return true;
    }

    @Override // android.webkit.WebChromeClient
    public void onProgressChanged(WebView webView, int i10) {
        super.onProgressChanged(webView, i10);
        WebViewEventListener webViewEventListener = this.f33124b;
        if (webViewEventListener != null) {
            webViewEventListener.onProgressChanged(webView, i10);
        }
    }

    public void setCommunicator(WebCommunicator webCommunicator) {
        this.f33125c = webCommunicator;
    }

    public void setWebViewEventListener(WebViewEventListener webViewEventListener) {
        this.f33124b = webViewEventListener;
    }
}
