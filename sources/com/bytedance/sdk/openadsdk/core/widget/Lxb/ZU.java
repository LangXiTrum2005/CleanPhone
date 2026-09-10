package com.bytedance.sdk.openadsdk.core.widget.Lxb;

import android.net.Uri;
import android.text.TextUtils;
import android.view.View;
import android.webkit.ConsoleMessage;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import androidx.annotation.NonNull;
import com.bytedance.sdk.openadsdk.ZU.JVA;
import com.bytedance.sdk.openadsdk.core.Ivz;
import com.bytedance.sdk.openadsdk.core.STP;
import com.bytedance.sdk.openadsdk.utils.kqm;

/* JADX INFO: loaded from: classes2.dex */
public class ZU extends WebChromeClient {
    private static final String Lxb = "WebChromeClient";
    private final Ivz LD;
    private com.bytedance.sdk.openadsdk.common.ZU ZU;
    private JVA lk;

    public ZU(Ivz ivz) {
        this.LD = ivz;
    }

    @Override // android.webkit.WebChromeClient
    public void onConsoleMessage(String str, int i, String str2) {
        if (!TextUtils.isEmpty(str)) {
            Lxb(str);
        }
        super.onConsoleMessage(str, i, str2);
    }

    @Override // android.webkit.WebChromeClient
    public void onProgressChanged(WebView webView, int i) {
        super.onProgressChanged(webView, i);
        JVA jva = this.lk;
        if (jva != null) {
            jva.Lxb(webView, i);
        }
        com.bytedance.sdk.openadsdk.common.ZU zu = this.ZU;
        if (zu != null) {
            zu.Lxb(webView, i);
        }
    }

    @Override // android.webkit.WebChromeClient
    public void onShowCustomView(View view, WebChromeClient.CustomViewCallback customViewCallback) {
        super.onShowCustomView(view, customViewCallback);
    }

    private boolean Lxb(@NonNull final String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        try {
            if (str.regionMatches(true, 0, "bytedance:", 0, 10)) {
                STP.lk().post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.core.widget.Lxb.ZU.1
                    @Override // java.lang.Runnable
                    public void run() {
                        kqm.Lxb(Uri.parse(str), ZU.this.LD);
                    }
                });
                return true;
            }
        } catch (Exception unused) {
        }
        return false;
    }

    public ZU(Ivz ivz, JVA jva, com.bytedance.sdk.openadsdk.common.ZU zu) {
        this(ivz, jva);
        this.ZU = zu;
    }

    @Override // android.webkit.WebChromeClient
    public boolean onConsoleMessage(ConsoleMessage consoleMessage) {
        if (consoleMessage == null || TextUtils.isEmpty(consoleMessage.message()) || !Lxb(consoleMessage.message())) {
            return super.onConsoleMessage(consoleMessage);
        }
        return true;
    }

    public ZU(Ivz ivz, JVA jva) {
        this.LD = ivz;
        this.lk = jva;
    }
}
