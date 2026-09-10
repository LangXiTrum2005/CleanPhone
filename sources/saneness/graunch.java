package saneness;

import ads_mobile_sdk.t4;
import android.webkit.WebView;

/* JADX INFO: loaded from: classes.dex */
public final class graunch extends t4 {
    public graunch(WebView webView, String str) {
        super(str);
        if (webView != null && !webView.getSettings().getJavaScriptEnabled()) {
            webView.getSettings().setJavaScriptEnabled(true);
        }
        a(webView);
    }
}
