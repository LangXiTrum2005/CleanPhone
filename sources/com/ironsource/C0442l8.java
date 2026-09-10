package com.ironsource;

import android.annotation.SuppressLint;
import android.annotation.TargetApi;
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
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.sdk.controller.OpenUrlActivity;
import com.ironsource.sdk.utils.Logger;
import gatewayprotocol.v1.DiagnosticEventRequestOuterClass;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.ironsource.l8, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public class C0442l8 implements H8 {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final String f29155g = "loadWithUrl | webView is not null";

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final String f29156h = "l8";

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final String f29157i = "file://";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f29158a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private String f29159b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private WebView f29160c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private C0406j8 f29161d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private C0317e8 f29162e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private Context f29163f;

    /* JADX INFO: renamed from: com.ironsource.l8$a */
    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    public class a implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ String f29164a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ JSONObject f29165b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ String f29166c;

        public a(String str, JSONObject jSONObject, String str2) {
            this.f29164a = str;
            this.f29165b = jSONObject;
            this.f29166c = str2;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (C0442l8.this.f29160c != null) {
                C0639w8.a(C0377he.f28817q, new C0549r8().a(B5.A, C0442l8.f29155g).a());
            }
            try {
                C0442l8.this.b(this.f29164a);
                C0442l8.this.f29160c.loadUrl(C0442l8.this.a(this.f29165b.getString("urlForWebView")));
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("adViewId", C0442l8.this.f29158a);
                C0442l8.this.f29161d.a(this.f29166c, jSONObject);
            } catch (Exception e10) {
                C0474n4.d().a(e10);
                C0442l8.this.b(this.f29164a, e10.getMessage());
                C0639w8.a(C0377he.f28817q, new C0549r8().a(B5.A, e10.getMessage()).a());
            }
        }
    }

    /* JADX INFO: renamed from: com.ironsource.l8$b */
    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    public class b implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ String f29168a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f29169b;

        public b(String str, String str2) {
            this.f29168a = str;
            this.f29169b = str2;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                WebView webView = C0442l8.this.f29160c;
                if (webView != null) {
                    webView.destroy();
                }
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("adViewId", C0442l8.this.f29158a);
                C0406j8 c0406j8 = C0442l8.this.f29161d;
                if (c0406j8 != null) {
                    c0406j8.a(this.f29168a, jSONObject);
                    C0442l8.this.f29161d.b();
                }
                C0442l8 c0442l8 = C0442l8.this;
                c0442l8.f29161d = null;
                c0442l8.f29163f = null;
            } catch (Exception e10) {
                C0474n4.d().a(e10);
                Log.e(C0442l8.f29156h, "performCleanup | could not destroy ISNAdView webView ID: " + C0442l8.this.f29158a);
                C0639w8.a(C0377he.f28818r, new C0549r8().a(B5.A, e10.getMessage()).a());
                C0442l8.this.b(this.f29169b, e10.getMessage());
            }
        }
    }

    /* JADX INFO: renamed from: com.ironsource.l8$c */
    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    public class c implements H8.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ String f29171a;

        public c(String str) {
            this.f29171a = str;
        }

        @Override // com.ironsource.H8.a
        public void a(String str) {
            Logger.i(C0442l8.f29156h, "ISNAdViewWebPresenter | WebViewClient | reportOnError: " + str);
            C0442l8.this.b(this.f29171a, str);
        }

        @Override // com.ironsource.H8.a
        public void b(String str) {
            Logger.i(C0442l8.f29156h, "ISNAdViewWebPresenter | WebViewClient | onRenderProcessGone: " + str);
            try {
                ((ViewGroup) C0442l8.this.f29160c.getParent()).removeView(C0442l8.this.f29160c);
            } catch (Exception e10) {
                C0474n4.d().a(e10);
                IronLog.INTERNAL.error(e10.toString());
            }
            C0442l8.this.d();
        }
    }

    /* JADX INFO: renamed from: com.ironsource.l8$d */
    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    public class d extends WebChromeClient {
        public /* synthetic */ d(C0442l8 c0442l8, int i10) {
            this();
        }

        @Override // android.webkit.WebChromeClient
        public boolean onCreateWindow(WebView webView, boolean z10, boolean z11, Message message) {
            WebView webView2 = new WebView(webView.getContext());
            webView2.setWebChromeClient(C0442l8.this.new d());
            webView2.setWebViewClient(new e(C0442l8.this, 0));
            ((WebView.WebViewTransport) message.obj).setWebView(webView2);
            message.sendToTarget();
            Logger.i("onCreateWindow", "onCreateWindow");
            return true;
        }

        private d() {
        }
    }

    /* JADX INFO: renamed from: com.ironsource.l8$e */
    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    public class e extends WebViewClient {
        public /* synthetic */ e(C0442l8 c0442l8, int i10) {
            this();
        }

        @Override // android.webkit.WebViewClient
        @TargetApi(DiagnosticEventRequestOuterClass.DiagnosticEventType.DIAGNOSTIC_EVENT_TYPE_NATIVE_LOAD_STARTED_AD_VIEWER_VALUE)
        public boolean onRenderProcessGone(WebView webView, RenderProcessGoneDetail renderProcessGoneDetail) {
            Logger.e(C0442l8.f29156h, "Chromium process crashed - detail.didCrash(): " + renderProcessGoneDetail.didCrash());
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

    public C0442l8(InterfaceC0371h8 interfaceC0371h8, Context context, String str, C0317e8 c0317e8) {
        this.f29163f = context;
        C0406j8 c0406j8 = new C0406j8();
        this.f29161d = c0406j8;
        c0406j8.g(str);
        this.f29158a = str;
        this.f29161d.a(interfaceC0371h8);
        this.f29162e = c0317e8;
    }

    @Override // com.ironsource.H8
    public WebView getPresentingView() {
        return this.f29160c;
    }

    @JavascriptInterface
    public void handleMessageFromAd(String str) {
        this.f29161d.c(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public synchronized void d() {
        a("", "");
    }

    public String a() {
        return this.f29158a;
    }

    public C0406j8 b() {
        return this.f29161d;
    }

    public C0317e8 c() {
        return this.f29162e;
    }

    public void e(String str) {
        this.f29159b = str;
    }

    private String d(String str) {
        String strSubstring = str.substring(str.indexOf("/") + 1);
        return strSubstring.substring(strSubstring.indexOf("/"));
    }

    @Override // com.ironsource.H8
    public void a(JSONObject jSONObject, String str, String str2) {
        try {
            this.f29161d.e(str);
        } catch (Exception e10) {
            C0474n4.d().a(e10);
            Logger.i(f29156h, "sendHandleGetViewVisibility fail with reason: " + e10.getMessage());
        }
    }

    @Override // com.ironsource.H8
    public void b(JSONObject jSONObject, String str, String str2) {
        R7.f27125a.d(new a(str2, jSONObject, str));
    }

    @Override // com.ironsource.H8
    public void c(JSONObject jSONObject, String str, String str2) throws JSONException {
        try {
            this.f29161d.a(jSONObject.getString("params"), str, str2);
        } catch (Exception e10) {
            C0474n4.d().a(e10);
            Logger.i(f29156h, "sendMessageToAd fail message: " + e10.getMessage());
            throw e10;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    @SuppressLint({"AddJavascriptInterface"})
    public void b(String str) {
        Logger.i(f29156h, "ISNAdViewWebPresenter | createWebView");
        WebView webView = new WebView(this.f29163f);
        this.f29160c = webView;
        webView.addJavascriptInterface(new C0389i8(this), C0335f8.f28647e);
        this.f29160c.setWebViewClient(new C0424k8(new c(str)));
        this.f29160c.setWebChromeClient(new d(this, 0));
        hh.a(this.f29160c);
        this.f29161d.a(this.f29160c);
    }

    @Override // com.ironsource.H8
    public synchronized void a(String str, String str2) {
        if (this.f29163f == null) {
            return;
        }
        Logger.i(f29156h, "performCleanup");
        R7.f27125a.d(new b(str, str2));
    }

    private boolean c(String str) {
        return str.startsWith(".");
    }

    @Override // com.ironsource.H8
    public void a(String str, String str2, String str3) {
        if (TextUtils.isEmpty(str)) {
            b(str3, X3.c.D);
            return;
        }
        Logger.i(f29156h, "trying to perform WebView Action: " + str);
        try {
            if (str.equals(X3.i.t0)) {
                this.f29160c.onPause();
                this.f29161d.f(str2);
            } else if (str.equals(X3.i.f27817u0)) {
                this.f29160c.onResume();
                this.f29161d.f(str2);
            } else {
                b(str3, X3.c.C);
            }
        } catch (Exception e10) {
            C0474n4.d().a(e10);
            b(str3, X3.c.E);
        }
    }

    public void b(String str, String str2) {
        C0406j8 c0406j8 = this.f29161d;
        if (c0406j8 != null) {
            c0406j8.a(str, str2);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public String a(String str) {
        if (!c(str)) {
            return str;
        }
        return f29157i + this.f29159b + d(str);
    }
}
