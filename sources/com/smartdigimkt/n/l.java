package com.smartdigimkt.n;

import android.text.TextUtils;
import android.webkit.ConsoleMessage;
import android.webkit.JsPromptResult;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import com.smartdigimkt.expressad.atsignalcommon.windvane.WindVaneWebView;

/* JADX INFO: loaded from: classes4.dex */
public class l extends WebChromeClient {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final String f36900c = "H5_ENTRY";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    WindVaneWebView f36901a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private com.smartdigimkt.u4.c f36902b;

    public l(WindVaneWebView windVaneWebView) {
        this.f36901a = windVaneWebView;
    }

    public void a(com.smartdigimkt.u4.c cVar) {
        this.f36902b = cVar;
    }

    @Override // android.webkit.WebChromeClient
    public boolean onConsoleMessage(ConsoleMessage consoleMessage) {
        if (consoleMessage.messageLevel() != ConsoleMessage.MessageLevel.LOG) {
            return super.onConsoleMessage(consoleMessage);
        }
        d signalCommunication = this.f36901a.getSignalCommunication();
        if (signalCommunication != null) {
            String strMessage = consoleMessage.message();
            if (TextUtils.isEmpty(strMessage) || !strMessage.startsWith("mv://")) {
                return false;
            }
            if (strMessage.contains("wv_hybrid:") && signalCommunication.c("wv_hybrid:")) {
                signalCommunication.a(strMessage.substring(0, strMessage.lastIndexOf(" ") + 1));
                return true;
            }
        }
        return super.onConsoleMessage(consoleMessage);
    }

    @Override // android.webkit.WebChromeClient
    public boolean onJsPrompt(WebView webView, String str, String str2, String str3, JsPromptResult jsPromptResult) {
        d signalCommunication = this.f36901a.getSignalCommunication();
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
        com.smartdigimkt.u4.c cVar = this.f36902b;
        if (cVar != null) {
            cVar.onProgressChanged(webView, i2);
        }
    }
}
