package com.bytedance.sdk.component.utils;

import android.annotation.TargetApi;
import android.webkit.WebView;

/* JADX INFO: loaded from: classes2.dex */
public class JVA {
    private static final Lxb Lxb = new LD();

    @TargetApi(19)
    public static class LD extends Lxb {
        private LD() {
            super();
        }

        @Override // com.bytedance.sdk.component.utils.JVA.Lxb
        public void Lxb(WebView webView, String str) {
            if (webView == null) {
                return;
            }
            if (str != null && str.startsWith("javascript:")) {
                try {
                    webView.evaluateJavascript(str, null);
                    return;
                } catch (Throwable th) {
                    boolean z = th instanceof IllegalStateException;
                }
            }
            try {
                webView.loadUrl(str);
            } catch (Throwable unused) {
            }
        }
    }

    public static class Lxb {
        private Lxb() {
        }

        public void Lxb(WebView webView, String str) {
            if (webView == null) {
                return;
            }
            try {
                webView.loadUrl(str);
            } catch (Throwable unused) {
            }
        }
    }

    public static void Lxb(WebView webView, String str) {
        Lxb.Lxb(webView, str);
    }
}
