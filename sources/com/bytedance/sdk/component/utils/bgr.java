package com.bytedance.sdk.component.utils;

import android.webkit.WebView;

/* JADX INFO: loaded from: classes2.dex */
public class bgr {
    private static final ri ri = new lr();

    public static class lr extends ri {
        private lr() {
            super();
        }

        @Override // com.bytedance.sdk.component.utils.bgr.ri
        public void ri(WebView webView, String str) {
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

    public static class ri {
        private ri() {
        }

        public void ri(WebView webView, String str) {
            if (webView == null) {
                return;
            }
            try {
                webView.loadUrl(str);
            } catch (Throwable unused) {
            }
        }
    }

    public static void ri(WebView webView, String str) {
        ri.ri(webView, str);
    }
}
