package com.smartdigimkt.v4;

import android.text.TextUtils;
import android.util.Base64;
import android.webkit.WebView;
import com.smartdigimkt.sdk.basead.express.web.BaseWebView;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes6.dex */
public abstract class a implements b {
    public void a(WebView webView, String str, String str2) {
        String strN = TextUtils.isEmpty(str2) ? android.support.v4.media.a.n("javascript:window.WindVane.fireEvent('", str, "', '');") : androidx.datastore.preferences.protobuf.a.n("javascript:window.WindVane.fireEvent('", str, "','", d.a(str2), "');");
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

    public void a(WebView webView) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("api_version", "1.0.0");
            a(webView, com.smartdigimkt.r4.c.f38085b, Base64.encodeToString(jSONObject.toString().getBytes(), 2));
        } catch (Exception unused) {
            a(webView, com.smartdigimkt.r4.c.f38085b, "");
        } catch (Throwable unused2) {
            a(webView, com.smartdigimkt.r4.c.f38085b, "");
        }
    }
}
