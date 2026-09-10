package com.bytedance.sdk.openadsdk.tD;

import android.os.Build;
import android.webkit.WebSettings;
import android.webkit.WebView;

/* JADX INFO: loaded from: classes2.dex */
public class QAg {
    private static void LD(WebView webView) {
        try {
            webView.removeJavascriptInterface("searchBoxJavaBridge_");
            webView.removeJavascriptInterface("accessibility");
            webView.removeJavascriptInterface("accessibilityTraversal");
        } catch (Throwable th) {
            ebl.Lxb("WebViewSettings", "removeJavascriptInterfacesSafe error", th);
        }
    }

    private static void Lxb(WebSettings webSettings) {
        try {
            webSettings.setMediaPlaybackRequiresUserGesture(false);
        } catch (Throwable th) {
            ebl.Lxb("WebViewSettings", "allowMediaPlayWithoutUserGesture error", th);
        }
    }

    public static void Lxb(WebView webView) {
        if (webView == null) {
            return;
        }
        LD(webView);
        WebSettings settings = webView.getSettings();
        Lxb(settings);
        if (settings == null) {
            return;
        }
        try {
            settings.setJavaScriptEnabled(true);
        } catch (Throwable th) {
            ebl.Lxb("WebViewSettings", "setJavaScriptEnabled error", th);
        }
        try {
            settings.setSupportZoom(false);
        } catch (Throwable th2) {
            ebl.Lxb("WebViewSettings", "setSupportZoom error", th2);
        }
        settings.setLoadWithOverviewMode(true);
        settings.setUseWideViewPort(true);
        settings.setDomStorageEnabled(true);
        settings.setAllowFileAccess(false);
        settings.setBlockNetworkImage(false);
        settings.setDisplayZoomControls(false);
        int i = Build.VERSION.SDK_INT;
        settings.setAllowFileAccessFromFileURLs(false);
        settings.setAllowUniversalAccessFromFileURLs(false);
        settings.setSavePassword(false);
        boolean z = i >= 28;
        try {
            if (!z) {
                webView.setLayerType(0, null);
            } else {
                if (z) {
                    webView.setLayerType(2, null);
                }
                webView.getSettings().setMixedContentMode(0);
            }
        } catch (Throwable th3) {
            ebl.Lxb("WebViewSettings", "setLayerType error", th3);
        }
        webView.getSettings().setMixedContentMode(0);
    }
}
