package com.mbridge.msdk.mbsignalcommon.windvane;

import android.text.TextUtils;
import android.util.Base64;
import android.webkit.WebView;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static f f34933a = new f();

    private f() {
    }

    public static f a() {
        return f34933a;
    }

    public void b(Object obj, String str) {
        String strH;
        if (obj instanceof a) {
            a aVar = (a) obj;
            if (TextUtils.isEmpty(str)) {
                strH = defpackage.e.o("javascript:window.WindVane.onSuccess(", aVar.f34917g, ",'');");
            } else {
                strH = l1.d.h("javascript:window.WindVane.onSuccess(", aVar.f34917g, ",'", i.a(str), "');");
            }
            WindVaneWebView windVaneWebView = aVar.f34912b;
            if (windVaneWebView == null || windVaneWebView.isDestoryed()) {
                return;
            }
            try {
                aVar.f34912b.loadUrl(strH);
            } catch (Exception e10) {
                e10.printStackTrace();
            } catch (Throwable th2) {
                th2.printStackTrace();
            }
        }
    }

    public void a(Object obj, String str, String str2) {
        if (obj instanceof a) {
            a aVar = (a) obj;
            String strO = TextUtils.isEmpty(str2) ? defpackage.e.o("javascript:window.WindVane.fireEvent('", str, "', '');") : l1.d.h("javascript:window.WindVane.fireEvent('", str, "','", i.a(str2), "');");
            WindVaneWebView windVaneWebView = aVar.f34912b;
            if (windVaneWebView == null || windVaneWebView.isDestoryed()) {
                return;
            }
            try {
                aVar.f34912b.loadUrl(strO);
            } catch (Exception e10) {
                e10.printStackTrace();
            } catch (Throwable th2) {
                th2.printStackTrace();
            }
        }
    }

    public void a(WebView webView, String str, String str2) {
        String strH;
        if (TextUtils.isEmpty(str2)) {
            strH = defpackage.e.o("javascript:window.WindVane.fireEvent('", str, "', '');");
        } else {
            strH = l1.d.h("javascript:window.WindVane.fireEvent('", str, "','", i.a(str2), "');");
        }
        if (webView != null) {
            if ((webView instanceof WindVaneWebView) && ((WindVaneWebView) webView).isDestoryed()) {
                return;
            }
            try {
                webView.loadUrl(strH);
            } catch (Exception e10) {
                e10.printStackTrace();
            } catch (Throwable th2) {
                th2.printStackTrace();
            }
        }
    }

    public void a(Object obj, String str) {
        if (obj instanceof a) {
            a aVar = (a) obj;
            if (!TextUtils.isEmpty(str)) {
                str = i.a(str);
            }
            String strH = l1.d.h("javascript:window.WindVane.onFailure(", aVar.f34917g, ",'", str, "');");
            WindVaneWebView windVaneWebView = aVar.f34912b;
            if (windVaneWebView == null || windVaneWebView.isDestoryed()) {
                return;
            }
            try {
                aVar.f34912b.loadUrl(strH);
            } catch (Exception e10) {
                e10.printStackTrace();
            } catch (Throwable th2) {
                th2.printStackTrace();
            }
        }
    }

    public void a(WebView webView) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("api_version", "1.0.0");
            a().a(webView, com.mbridge.msdk.mbsignalcommon.base.e.f34814j, Base64.encodeToString(jSONObject.toString().getBytes(), 2));
        } catch (Exception unused) {
            a().a(webView, com.mbridge.msdk.mbsignalcommon.base.e.f34814j, "");
        } catch (Throwable unused2) {
            a().a(webView, com.mbridge.msdk.mbsignalcommon.base.e.f34814j, "");
        }
    }
}
