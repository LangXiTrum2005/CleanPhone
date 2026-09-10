package com.bytedance.sdk.openadsdk.core.widget.ri;

import android.net.Uri;
import android.text.TextUtils;
import android.view.View;
import android.webkit.ConsoleMessage;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import com.bytedance.sdk.openadsdk.core.dzy;
import com.bytedance.sdk.openadsdk.core.vr;
import com.bytedance.sdk.openadsdk.ka.aw;
import com.bytedance.sdk.openadsdk.utils.tan;

/* JADX INFO: loaded from: classes2.dex */
public class ka extends WebChromeClient {
    private static final String ri = WebChromeClient.class.getSimpleName();
    private aw ik;
    private com.bytedance.sdk.openadsdk.common.fi ka;
    private final dzy lr;

    public ka(dzy dzyVar) {
        this.lr = dzyVar;
    }

    @Override // android.webkit.WebChromeClient
    public void onConsoleMessage(String str, int i, String str2) {
        if (!TextUtils.isEmpty(str)) {
            ri(str);
        }
        super.onConsoleMessage(str, i, str2);
    }

    @Override // android.webkit.WebChromeClient
    public void onProgressChanged(WebView webView, int i) {
        super.onProgressChanged(webView, i);
        aw awVar = this.ik;
        if (awVar != null) {
            awVar.ri(webView, i);
        }
        com.bytedance.sdk.openadsdk.common.fi fiVar = this.ka;
        if (fiVar != null) {
            fiVar.ri(webView, i);
        }
    }

    @Override // android.webkit.WebChromeClient
    public void onShowCustomView(View view, WebChromeClient.CustomViewCallback customViewCallback) {
        super.onShowCustomView(view, customViewCallback);
    }

    private boolean ri(final String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        try {
            if (str.regionMatches(true, 0, "bytedance:", 0, 10)) {
                vr.ik().post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.core.widget.ri.ka.1
                    @Override // java.lang.Runnable
                    public void run() {
                        tan.ri(Uri.parse(str), ka.this.lr);
                    }
                });
                return true;
            }
        } catch (Exception unused) {
        }
        return false;
    }

    public ka(dzy dzyVar, aw awVar, com.bytedance.sdk.openadsdk.common.fi fiVar) {
        this(dzyVar, awVar);
        this.ka = fiVar;
    }

    @Override // android.webkit.WebChromeClient
    public boolean onConsoleMessage(ConsoleMessage consoleMessage) {
        if (consoleMessage == null || TextUtils.isEmpty(consoleMessage.message()) || !ri(consoleMessage.message())) {
            return super.onConsoleMessage(consoleMessage);
        }
        return true;
    }

    public ka(dzy dzyVar, aw awVar) {
        this.lr = dzyVar;
        this.ik = awVar;
    }
}
