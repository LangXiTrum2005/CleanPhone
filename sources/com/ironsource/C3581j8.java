package com.ironsource;

import android.content.Context;
import android.content.Intent;
import android.os.Message;
import android.text.TextUtils;
import android.view.ViewGroup;
import android.webkit.JavascriptInterface;
import android.webkit.RenderProcessGoneDetail;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.sdk.controller.OpenUrlActivity;
import com.ironsource.sdk.utils.Logger;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.ironsource.j8, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public class C3581j8 implements F8 {
    private static final String g = "loadWithUrl | webView is not null";
    private static final String h = "j8";
    private static final String i = "file://";
    private final String a;
    private String b;
    private WebView c;
    private C3546h8 d;
    private C3456c8 e;
    private Context f;

    /* JADX INFO: renamed from: com.ironsource.j8$a */
    public class a implements Runnable {
        final /* synthetic */ String a;
        final /* synthetic */ JSONObject b;
        final /* synthetic */ String c;

        public a(String str, JSONObject jSONObject, String str2) {
            this.a = str;
            this.b = jSONObject;
            this.c = str2;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (C3581j8.this.c != null) {
                C3773u8.a(Ud.q, new C3689p8().a(A5.A, C3581j8.g).a());
            }
            try {
                C3581j8.this.b(this.a);
                C3581j8.this.c.loadUrl(C3581j8.this.a(this.b.getString("urlForWebView")));
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("adViewId", C3581j8.this.a);
                C3581j8.this.d.a(this.c, jSONObject);
            } catch (Exception e) {
                C3631m4.d().a(e);
                C3581j8.this.b(this.a, e.getMessage());
                C3773u8.a(Ud.q, new C3689p8().a(A5.A, e.getMessage()).a());
            }
        }
    }

    /* JADX INFO: renamed from: com.ironsource.j8$b */
    public class b implements Runnable {
        final /* synthetic */ String a;
        final /* synthetic */ String b;

        public b(String str, String str2) {
            this.a = str;
            this.b = str2;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                WebView webView = C3581j8.this.c;
                if (webView != null) {
                    webView.destroy();
                }
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("adViewId", C3581j8.this.a);
                C3546h8 c3546h8 = C3581j8.this.d;
                if (c3546h8 != null) {
                    c3546h8.a(this.a, jSONObject);
                    C3581j8.this.d.b();
                }
                C3581j8 c3581j8 = C3581j8.this;
                c3581j8.d = null;
                c3581j8.f = null;
            } catch (Exception e) {
                C3631m4.d().a(e);
                String unused = C3581j8.h;
                String unused2 = C3581j8.this.a;
                C3773u8.a(Ud.r, new C3689p8().a(A5.A, e.getMessage()).a());
                C3581j8.this.b(this.b, e.getMessage());
            }
        }
    }

    /* JADX INFO: renamed from: com.ironsource.j8$c */
    public class c implements F8.a {
        final /* synthetic */ String a;

        public c(String str) {
            this.a = str;
        }

        @Override // com.ironsource.F8.a
        public void a(String str) {
            Logger.i(C3581j8.h, "ISNAdViewWebPresenter | WebViewClient | reportOnError: " + str);
            C3581j8.this.b(this.a, str);
        }

        @Override // com.ironsource.F8.a
        public void b(String str) {
            Logger.i(C3581j8.h, "ISNAdViewWebPresenter | WebViewClient | onRenderProcessGone: " + str);
            try {
                ((ViewGroup) C3581j8.this.c.getParent()).removeView(C3581j8.this.c);
            } catch (Exception e) {
                C3631m4.d().a(e);
                IronLog.INTERNAL.error(e.toString());
            }
            C3581j8.this.d();
        }
    }

    /* JADX INFO: renamed from: com.ironsource.j8$d */
    public class d extends WebChromeClient {
        @Override // android.webkit.WebChromeClient
        public boolean onCreateWindow(WebView webView, boolean z, boolean z2, Message message) {
            WebView webView2 = new WebView(webView.getContext());
            webView2.setWebChromeClient(C3581j8.this.new d());
            webView2.setWebViewClient(new e());
            ((WebView.WebViewTransport) message.obj).setWebView(webView2);
            message.sendToTarget();
            Logger.i("onCreateWindow", "onCreateWindow");
            return true;
        }

        private d() {
        }
    }

    /* JADX INFO: renamed from: com.ironsource.j8$e */
    public class e extends WebViewClient {
        @Override // android.webkit.WebViewClient
        public boolean onRenderProcessGone(WebView webView, RenderProcessGoneDetail renderProcessGoneDetail) {
            Logger.e(C3581j8.h, "Chromium process crashed - detail.didCrash(): " + renderProcessGoneDetail.didCrash());
            return true;
        }

        @Override // android.webkit.WebViewClient
        public boolean shouldOverrideUrlLoading(WebView webView, String str) {
            Context context = webView.getContext();
            Intent intentA = new OpenUrlActivity.e(new com.ironsource.sdk.controller.k.c()).a(str).b(false).a(context);
            intentA.addFlags(268435456);
            context.startActivity(intentA);
            return true;
        }

        private e() {
        }
    }

    public C3581j8(InterfaceC3510f8 interfaceC3510f8, Context context, String str, C3456c8 c3456c8) {
        this.f = context;
        C3546h8 c3546h8 = new C3546h8();
        this.d = c3546h8;
        c3546h8.g(str);
        this.a = str;
        this.d.a(interfaceC3510f8);
        this.e = c3456c8;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public synchronized void d() {
        a("", "");
    }

    public String a() {
        return this.a;
    }

    public C3546h8 b() {
        return this.d;
    }

    public C3456c8 c() {
        return this.e;
    }

    public void e(String str) {
        this.b = str;
    }

    @Override // com.ironsource.F8
    public WebView getPresentingView() {
        return this.c;
    }

    @JavascriptInterface
    public void handleMessageFromAd(String str) {
        this.d.c(str);
    }

    private String d(String str) {
        String strSubstring = str.substring(str.indexOf("/") + 1);
        return strSubstring.substring(strSubstring.indexOf("/"));
    }

    @Override // com.ironsource.F8
    public void a(JSONObject jSONObject, String str, String str2) {
        try {
            this.d.e(str);
        } catch (Exception e2) {
            C3631m4.d().a(e2);
            Logger.i(h, "sendHandleGetViewVisibility fail with reason: " + e2.getMessage());
        }
    }

    @Override // com.ironsource.F8
    public void b(JSONObject jSONObject, String str, String str2) {
        P7.a.d(new a(str2, jSONObject, str));
    }

    @Override // com.ironsource.F8
    public void c(JSONObject jSONObject, String str, String str2) throws JSONException {
        try {
            this.d.a(jSONObject.getString("params"), str, str2);
        } catch (Exception e2) {
            C3631m4.d().a(e2);
            Logger.i(h, "sendMessageToAd fail message: " + e2.getMessage());
            throw e2;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(String str) {
        Logger.i(h, "ISNAdViewWebPresenter | createWebView");
        WebView webView = new WebView(this.f);
        this.c = webView;
        webView.addJavascriptInterface(new C3528g8(this), C3474d8.e);
        this.c.setWebViewClient(new C3564i8(new c(str)));
        this.c.setWebChromeClient(new d());
        Og.a(this.c);
        this.d.a(this.c);
    }

    @Override // com.ironsource.F8
    public synchronized void a(String str, String str2) {
        if (this.f == null) {
            return;
        }
        Logger.i(h, "performCleanup");
        P7.a.d(new b(str, str2));
    }

    private boolean c(String str) {
        return str.startsWith(".");
    }

    @Override // com.ironsource.F8
    public void a(String str, String str2, String str3) {
        if (TextUtils.isEmpty(str)) {
            b(str3, X3.c.D);
            return;
        }
        Logger.i(h, "trying to perform WebView Action: " + str);
        try {
            if (str.equals(X3.i.t0)) {
                this.c.onPause();
                this.d.f(str2);
            } else if (str.equals(X3.i.u0)) {
                this.c.onResume();
                this.d.f(str2);
            } else {
                b(str3, X3.c.C);
            }
        } catch (Exception e2) {
            C3631m4.d().a(e2);
            b(str3, X3.c.E);
        }
    }

    public void b(String str, String str2) {
        C3546h8 c3546h8 = this.d;
        if (c3546h8 != null) {
            c3546h8.a(str, str2);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public String a(String str) {
        if (!c(str)) {
            return str;
        }
        return "file://" + this.b + d(str);
    }
}
