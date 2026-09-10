package com.bytedance.sdk.openadsdk.core.widget.Lxb;

import android.annotation.SuppressLint;
import android.content.Context;
import android.webkit.WebSettings;
import android.webkit.WebView;
import com.bytedance.sdk.component.utils.sLN;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes2.dex */
public class lk {
    private final WeakReference<Context> Lxb;
    private boolean LD = true;
    private final boolean lk = true;
    private final boolean ZU = true;
    private final boolean JXs = false;
    private final boolean lc = true;
    private boolean ebl = true;

    private lk(Context context) {
        this.Lxb = new WeakReference<>(context);
    }

    public static lk Lxb(Context context) {
        return new lk(context);
    }

    public lk LD(boolean z) {
        this.LD = z;
        return this;
    }

    public static void LD(WebView webView) {
        try {
            webView.removeJavascriptInterface("searchBoxJavaBridge_");
            webView.removeJavascriptInterface("accessibility");
            webView.removeJavascriptInterface("accessibilityTraversal");
        } catch (Throwable th) {
            sLN.LD(th.toString());
        }
    }

    public lk Lxb(boolean z) {
        this.ebl = z;
        return this;
    }

    @SuppressLint({"SetJavaScriptEnabled"})
    public void Lxb(WebView webView) {
        if (webView == null || this.Lxb.get() == null) {
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
        } catch (Exception e) {
            sLN.Lxb("SSWebSettings", e.getMessage());
        }
        try {
            if (this.LD) {
                settings.setSupportZoom(true);
                settings.setBuiltInZoomControls(true);
            } else {
                settings.setSupportZoom(false);
            }
        } catch (Throwable th) {
            sLN.Lxb("SSWebSettings", th.getMessage());
        }
        settings.setLoadWithOverviewMode(true);
        settings.setUseWideViewPort(true);
        settings.setDomStorageEnabled(true);
        settings.setAllowFileAccess(false);
        settings.setBlockNetworkImage(false);
        settings.setSavePassword(false);
        try {
            if (this.ebl) {
                webView.setLayerType(2, null);
            } else {
                webView.setLayerType(0, null);
            }
        } catch (Throwable th2) {
            sLN.Lxb("SSWebSettings", th2.getMessage());
        }
    }

    private void Lxb(WebSettings webSettings) {
        try {
            webSettings.setMediaPlaybackRequiresUserGesture(false);
        } catch (Throwable th) {
            sLN.LD(th.toString());
        }
    }

    public static void Lxb(com.bytedance.sdk.component.QAg.ZU zu) {
        if (zu == null) {
            return;
        }
        int iLxb = com.bytedance.sdk.openadsdk.DY.Lxb.Lxb("clear_web_cache_new", 0);
        if (iLxb == 0) {
            zu.Lxb(true);
        } else if (iLxb == 1) {
            zu.Lxb(false);
        }
    }
}
