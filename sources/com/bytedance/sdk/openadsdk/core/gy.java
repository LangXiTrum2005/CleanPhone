package com.bytedance.sdk.openadsdk.core;

import android.view.ViewGroup;
import android.view.ViewParent;
import android.webkit.WebView;

/* JADX INFO: loaded from: classes3.dex */
public class gy {
    public static void qdl(WebView webView) {
        if (webView == null) {
            return;
        }
        try {
            webView.setWebChromeClient(null);
            webView.setWebViewClient(null);
            ViewParent parent = webView.getParent();
            if (parent instanceof ViewGroup) {
                ((ViewGroup) parent).removeView(webView);
            }
            webView.removeAllViews();
            webView.destroy();
        } catch (Exception unused) {
        }
    }
}
