package com.bytedance.sdk.openadsdk.core;

import android.view.ViewGroup;
import android.view.ViewParent;
import android.webkit.WebView;

/* JADX INFO: loaded from: classes2.dex */
public class hg {
    public static void Lxb(WebView webView) {
        if (webView == null) {
            return;
        }
        webView.setWebChromeClient(null);
        webView.setWebViewClient(null);
        ViewParent parent = webView.getParent();
        if (parent instanceof ViewGroup) {
            ((ViewGroup) parent).removeView(webView);
        }
        webView.removeAllViews();
        webView.destroy();
    }
}
