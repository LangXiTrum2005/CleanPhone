package com.thinkup.core.express.o0;

import android.support.v4.media.a;
import android.text.TextUtils;
import android.util.Base64;
import android.webkit.WebView;
import com.thinkup.core.express.web.BaseWebView;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes6.dex */
public abstract class o implements m {
    private static void o(WebView webView, String str, String str2) {
        String strN = TextUtils.isEmpty(str2) ? a.n("javascript:window.WindVane.fireEvent('", str, "', '');") : androidx.datastore.preferences.protobuf.a.n("javascript:window.WindVane.fireEvent('", str, "','", o0.o(str2), "');");
        if (webView != null) {
            if ((webView instanceof BaseWebView) && ((BaseWebView) webView).isDestroyed()) {
                return;
            }
            try {
                webView.loadUrl(strN);
            } catch (Exception e2) {
                e2.printStackTrace();
            } catch (Throwable th) {
                th.printStackTrace();
            }
        }
    }

    private static void o(WebView webView) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("api_version", "1.0.0");
            o(webView, com.thinkup.core.express.o.n.m, Base64.encodeToString(jSONObject.toString().getBytes(), 2));
        } catch (Exception unused) {
            o(webView, com.thinkup.core.express.o.n.m, "");
        } catch (Throwable unused2) {
            o(webView, com.thinkup.core.express.o.n.m, "");
        }
    }
}
