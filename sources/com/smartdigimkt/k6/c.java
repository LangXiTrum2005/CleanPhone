package com.smartdigimkt.k6;

import A.F;
import android.text.TextUtils;
import android.webkit.WebView;
import com.smartdigimkt.g6.e;
import com.smartdigimkt.g6.h;
import com.smartdigimkt.sdk.basead.webtemplet.WTWebView;

/* JADX INFO: loaded from: classes.dex */
public class c implements a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static volatile c f36233b;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f36234a = "c";

    private c() {
    }

    public static c a() {
        if (f36233b == null) {
            synchronized (c.class) {
                try {
                    if (f36233b == null) {
                        f36233b = new c();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return f36233b;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void b(Object obj, String str, String str2) {
        e eVar = (e) obj;
        WTWebView wTWebView = eVar.f35472b;
        if (wTWebView == null || wTWebView.isDestroyed()) {
            return;
        }
        try {
            eVar.f35472b.loadUrl(a(str, str2));
        } catch (Throwable th) {
            a(str, th);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void b(WebView webView, String str, String str2) {
        try {
            if ((webView instanceof WTWebView) && ((WTWebView) webView).isDestroyed()) {
                return;
            }
            webView.loadUrl(a(str, str2));
        } catch (Throwable th) {
            a(str, th);
        }
    }

    private String a(String str, String str2) {
        if (TextUtils.isEmpty(str2)) {
            return android.support.v4.media.a.n("javascript:window.ATWebTPL.fireEvent('", str, "', '');");
        }
        return androidx.datastore.preferences.protobuf.a.n("javascript:window.ATWebTPL.fireEvent('", str, "','", h.c(str2), "');");
    }

    @Override // com.smartdigimkt.k6.a
    public void b(Object obj, String str) {
        String strN;
        if (obj instanceof e) {
            e eVar = (e) obj;
            if (TextUtils.isEmpty(str)) {
                strN = android.support.v4.media.a.n("javascript:window.ATWebTPL.onSuccess('", eVar.f35475h, "','');");
            } else {
                strN = androidx.datastore.preferences.protobuf.a.n("javascript:window.ATWebTPL.onSuccess('", eVar.f35475h, "','", h.c(str), "');");
            }
            String str2 = eVar.f35475h;
            com.smartdigimkt.l7.b.a().e(new R.a(this, eVar, strN, 0));
        }
    }

    @Override // com.smartdigimkt.k6.a
    public void a(Object obj, String str, String str2) {
        if (!(obj instanceof e) || TextUtils.isEmpty(str)) {
            return;
        }
        com.smartdigimkt.l7.b.a().e(new F(this, (e) obj, str, str2, 6));
    }

    public void a(WebView webView, String str, String str2) {
        if (webView == null || TextUtils.isEmpty(str)) {
            return;
        }
        com.smartdigimkt.l7.b.a().e(new F(this, webView, str, str2, 7));
    }

    @Override // com.smartdigimkt.k6.a
    public void a(Object obj, String str) {
        String strN;
        if (obj instanceof e) {
            e eVar = (e) obj;
            if (TextUtils.isEmpty(str)) {
                strN = android.support.v4.media.a.n("javascript:window.ATWebTPL.onFailure('", eVar.f35475h, "','');");
            } else {
                strN = androidx.datastore.preferences.protobuf.a.n("javascript:window.ATWebTPL.onFailure('", eVar.f35475h, "','", h.c(str), "');");
            }
            String str2 = eVar.f35475h;
            com.smartdigimkt.l7.b.a().e(new R.a(this, eVar, strN, 1));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void b(e eVar, String str) {
        WTWebView wTWebView = eVar.f35472b;
        if (wTWebView == null || wTWebView.isDestroyed()) {
            return;
        }
        try {
            eVar.f35472b.loadUrl(str);
        } catch (Throwable th) {
            a("callSuccess", th);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(e eVar, String str) {
        WTWebView wTWebView = eVar.f35472b;
        if (wTWebView == null || wTWebView.isDestroyed()) {
            return;
        }
        try {
            eVar.f35472b.loadUrl(str);
        } catch (Throwable th) {
            a("callFailure", th);
        }
    }

    private void a(String str, Throwable th) {
        th.getMessage();
    }
}
