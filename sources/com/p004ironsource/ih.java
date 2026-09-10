package com.p004ironsource;

import android.content.Context;
import android.content.Intent;
import android.os.Message;
import android.text.TextUtils;
import android.util.Log;
import android.view.ViewGroup;
import android.webkit.JavascriptInterface;
import android.webkit.RenderProcessGoneDetail;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.p004ironsource.mediationsdk.logger.IronLog;
import com.p004ironsource.sdk.controller.OpenUrlActivity;
import com.p004ironsource.sdk.controller.k;
import com.p004ironsource.sdk.utils.Logger;
import com.thinkup.core.common.n.mo;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes5.dex */
public class ih implements di {
    private static final String g = "loadWithUrl | webView is not null";

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final String f25339h = "ih";

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final String f25340i = "file://";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f25341a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private String f25342b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private WebView f25343c;
    private gh d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private bh f25344e;
    private Context f;

    public class a implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ String f25345a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ JSONObject f25346b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ String f25347c;

        public a(String str, JSONObject jSONObject, String str2) {
            this.f25345a = str;
            this.f25346b = jSONObject;
            this.f25347c = str2;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (ih.this.f25343c != null) {
                th.a(hs.q, new oh().a(dc.f24769A, ih.g).a());
            }
            try {
                ih.this.b(this.f25345a);
                ih.this.f25343c.loadUrl(ih.this.a(this.f25346b.getString("urlForWebView")));
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("adViewId", ih.this.f25341a);
                ih.this.d.a(this.f25347c, jSONObject);
            } catch (Exception e2) {
                q9.d().a(e2);
                ih.this.b(this.f25345a, e2.getMessage());
                th.a(hs.q, new oh().a(dc.f24769A, e2.getMessage()).a());
            }
        }
    }

    public class b implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ String f25348a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f25349b;

        public b(String str, String str2) {
            this.f25348a = str;
            this.f25349b = str2;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                if (ih.this.f25343c != null) {
                    ih.this.f25343c.destroy();
                }
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("adViewId", ih.this.f25341a);
                if (ih.this.d != null) {
                    ih.this.d.a(this.f25348a, jSONObject);
                    ih.this.d.b();
                }
                ih.this.d = null;
                ih.this.f = null;
            } catch (Exception e2) {
                q9.d().a(e2);
                Log.e(ih.f25339h, "performCleanup | could not destroy ISNAdView webView ID: " + ih.this.f25341a);
                th.a(hs.r, new oh().a(dc.f24769A, e2.getMessage()).a());
                ih.this.b(this.f25349b, e2.getMessage());
            }
        }
    }

    public class c implements di.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ String f25351a;

        public c(String str) {
            this.f25351a = str;
        }

        @Override // com.ironsource.di.a
        public void a(String str) {
            Logger.i(ih.f25339h, "ISNAdViewWebPresenter | WebViewClient | reportOnError: " + str);
            ih.this.b(this.f25351a, str);
        }

        @Override // com.ironsource.di.a
        public void b(String str) {
            Logger.i(ih.f25339h, "ISNAdViewWebPresenter | WebViewClient | onRenderProcessGone: " + str);
            try {
                ((ViewGroup) ih.this.f25343c.getParent()).removeView(ih.this.f25343c);
            } catch (Exception e2) {
                q9.d().a(e2);
                IronLog.INTERNAL.error(e2.toString());
            }
            ih.this.e();
        }
    }

    public class d extends WebChromeClient {
        private d() {
        }

        @Override // android.webkit.WebChromeClient
        public boolean onCreateWindow(WebView webView, boolean z2, boolean z3, Message message) {
            WebView webView2 = new WebView(webView.getContext());
            webView2.setWebChromeClient(ih.this.new d());
            webView2.setWebViewClient(new e(ih.this, null));
            ((WebView.WebViewTransport) message.obj).setWebView(webView2);
            message.sendToTarget();
            Logger.i("onCreateWindow", "onCreateWindow");
            return true;
        }

        public /* synthetic */ d(ih ihVar, a aVar) {
            this();
        }
    }

    public class e extends WebViewClient {
        private e() {
        }

        @Override // android.webkit.WebViewClient
        public boolean onRenderProcessGone(WebView webView, RenderProcessGoneDetail renderProcessGoneDetail) {
            Logger.e(ih.f25339h, "Chromium process crashed - detail.didCrash(): " + renderProcessGoneDetail.didCrash());
            return true;
        }

        @Override // android.webkit.WebViewClient
        public boolean shouldOverrideUrlLoading(WebView webView, String str) {
            Context context = webView.getContext();
            Intent intentA = new OpenUrlActivity.e(new k.b()).a(str).b(false).a(context);
            intentA.addFlags(268435456);
            context.startActivity(intentA);
            return true;
        }

        public /* synthetic */ e(ih ihVar, a aVar) {
            this();
        }
    }

    public ih(eh ehVar, Context context, String str, bh bhVar) {
        this.f = context;
        gh ghVar = new gh();
        this.d = ghVar;
        ghVar.g(str);
        this.f25341a = str;
        this.d.a(ehVar);
        this.f25344e = bhVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public synchronized void e() {
        a("", "");
    }

    public String b() {
        return this.f25341a;
    }

    public gh c() {
        return this.d;
    }

    public bh d() {
        return this.f25344e;
    }

    @Override // com.p004ironsource.di
    public WebView getPresentingView() {
        return this.f25343c;
    }

    @JavascriptInterface
    public void handleMessageFromAd(String str) {
        this.d.c(str);
    }

    private String d(String str) {
        String strSubstring = str.substring(str.indexOf("/") + 1);
        return strSubstring.substring(strSubstring.indexOf("/"));
    }

    public void e(String str) {
        this.f25342b = str;
    }

    @Override // com.p004ironsource.di
    public void c(JSONObject jSONObject, String str, String str2) throws Exception {
        try {
            this.d.a(jSONObject.getString("params"), str, str2);
        } catch (Exception e2) {
            q9.d().a(e2);
            Logger.i(f25339h, "sendMessageToAd fail message: " + e2.getMessage());
            throw e2;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(String str) {
        Logger.i(f25339h, "ISNAdViewWebPresenter | createWebView");
        WebView webView = new WebView(this.f);
        this.f25343c = webView;
        webView.addJavascriptInterface(new fh(this), ch.f24527e);
        this.f25343c.setWebViewClient(new hh(new c(str)));
        this.f25343c.setWebChromeClient(new d(this, null));
        ux.a(this.f25343c);
        this.d.a(this.f25343c);
    }

    private boolean c(String str) {
        return str.startsWith(mo.ono);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public String a(String str) {
        if (!c(str)) {
            return str;
        }
        return "file://" + this.f25342b + d(str);
    }

    public void b(String str, String str2) {
        gh ghVar = this.d;
        if (ghVar != null) {
            ghVar.a(str, str2);
        }
    }

    @Override // com.p004ironsource.di
    public void b(JSONObject jSONObject, String str, String str2) {
        pg.f26494a.d(new a(str2, jSONObject, str));
    }

    @Override // com.p004ironsource.di
    public synchronized void a(String str, String str2) {
        if (this.f == null) {
            return;
        }
        Logger.i(f25339h, "performCleanup");
        pg.f26494a.d(new b(str, str2));
    }

    @Override // com.p004ironsource.di
    public void a(String str, String str2, String str3) {
        if (TextUtils.isEmpty(str)) {
            b(str3, d9.c.D);
            return;
        }
        Logger.i(f25339h, "trying to perform WebView Action: " + str);
        try {
            if (str.equals(d9.h.t0)) {
                this.f25343c.onPause();
            } else {
                if (!str.equals(d9.h.u0)) {
                    b(str3, d9.c.C);
                    return;
                }
                this.f25343c.onResume();
            }
            this.d.f(str2);
        } catch (Exception e2) {
            q9.d().a(e2);
            b(str3, d9.c.f24649E);
        }
    }

    @Override // com.p004ironsource.di
    public void a(JSONObject jSONObject, String str, String str2) {
        try {
            this.d.e(str);
        } catch (Exception e2) {
            q9.d().a(e2);
            Logger.i(f25339h, "sendHandleGetViewVisibility fail with reason: " + e2.getMessage());
        }
    }
}
