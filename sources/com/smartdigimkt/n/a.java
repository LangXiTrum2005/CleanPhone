package com.smartdigimkt.n;

import android.text.TextUtils;
import android.webkit.WebView;
import com.smartdigimkt.expressad.atsignalcommon.windvane.WindVaneWebView;

/* JADX INFO: loaded from: classes4.dex */
public abstract class a implements com.smartdigimkt.v4.b {
    @Override // com.smartdigimkt.v4.b
    public void a(Object obj, String str, String str2) {
        if (obj instanceof b) {
            b bVar = (b) obj;
            String strN = TextUtils.isEmpty(str2) ? android.support.v4.media.a.n("javascript:window.MvBridge.fireEvent('", str, "', '');") : androidx.datastore.preferences.protobuf.a.n("javascript:window.MvBridge.fireEvent('", str, "','", com.smartdigimkt.v4.d.a(str2), "');");
            WindVaneWebView windVaneWebView = bVar.f36886a;
            if (windVaneWebView != null) {
                try {
                    windVaneWebView.loadUrl(strN);
                } catch (Exception e2) {
                    e2.printStackTrace();
                } catch (Throwable th) {
                    th.printStackTrace();
                }
            }
        }
    }

    public void a(WebView webView, String str, String str2) {
        String strN;
        if (TextUtils.isEmpty(str2)) {
            strN = android.support.v4.media.a.n("javascript:window.MvBridge.fireEvent('", str, "', '');");
        } else {
            strN = androidx.datastore.preferences.protobuf.a.n("javascript:window.MvBridge.fireEvent('", str, "','", com.smartdigimkt.v4.d.a(str2), "');");
        }
        if (webView != null) {
            try {
                webView.loadUrl(strN);
            } catch (Exception e2) {
                e2.printStackTrace();
            } catch (Throwable th) {
                th.printStackTrace();
            }
        }
    }

    @Override // com.smartdigimkt.v4.b
    public void a(Object obj, String str) {
        if (obj instanceof b) {
            b bVar = (b) obj;
            if (TextUtils.isEmpty(str)) {
                String str2 = bVar.g;
            } else {
                str = com.smartdigimkt.v4.d.a(str);
            }
            String strN = androidx.datastore.preferences.protobuf.a.n("javascript:window.MvBridge.onFailure(", bVar.g, ",'", str, "');");
            WindVaneWebView windVaneWebView = bVar.f36886a;
            if (windVaneWebView != null) {
                try {
                    windVaneWebView.loadUrl(strN);
                } catch (Exception e2) {
                    e2.printStackTrace();
                } catch (Throwable th) {
                    th.printStackTrace();
                }
            }
        }
    }
}
