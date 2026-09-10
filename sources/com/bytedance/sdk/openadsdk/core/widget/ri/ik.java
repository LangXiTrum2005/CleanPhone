package com.bytedance.sdk.openadsdk.core.widget.ri;

import android.content.Context;
import android.webkit.WebSettings;
import android.webkit.WebView;
import com.bytedance.sdk.component.utils.ac;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes2.dex */
public class ik {
    private final WeakReference<Context> ri;
    private boolean lr = true;
    private final boolean ik = true;
    private final boolean ka = true;
    private final boolean fi = false;
    private final boolean di = true;
    private boolean xha = true;

    private ik(Context context) {
        this.ri = new WeakReference<>(context);
    }

    public static ik ri(Context context) {
        return new ik(context);
    }

    public ik lr(boolean z) {
        this.lr = z;
        return this;
    }

    public static void lr(WebView webView) {
        if (webView == null) {
            return;
        }
        try {
            webView.removeJavascriptInterface("searchBoxJavaBridge_");
            webView.removeJavascriptInterface("accessibility");
            webView.removeJavascriptInterface("accessibilityTraversal");
        } catch (Throwable th) {
            ac.ik(th.toString(), new Object[0]);
        }
    }

    public ik ri(boolean z) {
        this.xha = z;
        return this;
    }

    public void ri(WebView webView) {
        if (webView == null || this.ri.get() == null) {
            return;
        }
        lr(webView);
        WebSettings settings = webView.getSettings();
        ri(settings);
        if (settings == null) {
            return;
        }
        try {
            settings.setJavaScriptEnabled(true);
        } catch (Exception e) {
            ac.ik("SSWebSettings", e.getMessage());
        }
        try {
            if (this.lr) {
                settings.setSupportZoom(true);
                settings.setBuiltInZoomControls(true);
            } else {
                settings.setSupportZoom(false);
            }
        } catch (Throwable th) {
            ac.ik("SSWebSettings", th.getMessage());
        }
        settings.setLoadWithOverviewMode(true);
        settings.setUseWideViewPort(true);
        settings.setDomStorageEnabled(true);
        settings.setAllowFileAccess(false);
        settings.setBlockNetworkImage(false);
        settings.setSavePassword(false);
        try {
            if (this.xha) {
                webView.setLayerType(2, null);
            } else {
                webView.setLayerType(0, null);
            }
        } catch (Throwable th2) {
            ac.ik("SSWebSettings", th2.getMessage());
        }
    }

    private void ri(WebSettings webSettings) {
        try {
            webSettings.setMediaPlaybackRequiresUserGesture(false);
        } catch (Throwable th) {
            ac.ik(th.toString(), new Object[0]);
        }
    }

    public static void ri(com.bytedance.sdk.component.jbs.di diVar) {
        if (diVar == null) {
            return;
        }
        int iRi = com.bytedance.sdk.openadsdk.wjv.fi.ri("clear_web_cache_new", 0);
        if (iRi == 0) {
            diVar.ri(true);
        } else if (iRi == 1) {
            diVar.ri(false);
        }
    }
}
