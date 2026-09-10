package com.mbridge.msdk.click;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Bitmap;
import android.net.http.SslError;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.webkit.JsPromptResult;
import android.webkit.JsResult;
import android.webkit.RenderProcessGoneDetail;
import android.webkit.SslErrorHandler;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.google.android.gms.internal.measurement.f2;
import com.ironsource.B5;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.foundation.tools.q0;
import java.util.HashMap;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public class o {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private static final String f31695r = "o";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f31696a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f31697b;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private com.mbridge.msdk.setting.g f31699d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private f f31700e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private String f31701f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private String f31702g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private WebView f31703h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private boolean f31704i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private String f31705j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private int f31706k;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private boolean f31707m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    boolean f31708n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    boolean f31709o;
    private boolean l = false;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private final Runnable f31710p = new d();

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private final Runnable f31711q = new e();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Handler f31698c = new Handler(Looper.getMainLooper());

    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    public class a implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ String f31712a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f31713b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ Context f31714c;

        public a(String str, String str2, Context context) {
            this.f31712a = str;
            this.f31713b = str2;
            this.f31714c = context;
        }

        @Override // java.lang.Runnable
        public void run() {
            o oVar = o.this;
            oVar.a(this.f31712a, this.f31713b, this.f31714c, oVar.f31701f);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    public class b extends WebViewClient {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ String f31716a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f31717b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ Context f31718c;

        public b(String str, String str2, Context context) {
            this.f31716a = str;
            this.f31717b = str2;
            this.f31718c = context;
        }

        @Override // android.webkit.WebViewClient
        public void onPageFinished(WebView webView, String str) {
            super.onPageFinished(webView, str);
            try {
                webView.loadUrl("javascript:window.navigator.vibrate([]);");
            } catch (Exception e10) {
                e10.printStackTrace();
            }
        }

        @Override // android.webkit.WebViewClient
        public void onPageStarted(WebView webView, String str, Bitmap bitmap) {
            try {
                webView.loadUrl("javascript:window.navigator.vibrate([]);");
                if (o.this.f31707m) {
                    o.this.f31706k = 0;
                    o.this.f();
                    return;
                }
                o.this.f31709o = false;
                if (webView.getTag() == null) {
                    webView.setTag("has_first_started");
                } else {
                    o.this.f31708n = true;
                }
                synchronized (o.f31695r) {
                    try {
                        o.this.f31701f = str;
                        if (o.this.f31700e == null || !o.this.f31700e.a(str)) {
                            o.this.h();
                        } else {
                            o.this.f31707m = true;
                            o.this.f();
                        }
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
            } catch (Exception e10) {
                e10.printStackTrace();
            }
        }

        @Override // android.webkit.WebViewClient
        public void onReceivedError(WebView webView, int i10, String str, String str2) {
            synchronized (o.f31695r) {
                o.this.f31707m = true;
                o.this.b();
                o.this.f();
            }
            if (o.this.f31700e != null) {
                o.this.f31700e.a(i10, webView.getUrl(), str, o.this.f31705j);
            }
        }

        @Override // android.webkit.WebViewClient
        public void onReceivedSslError(WebView webView, SslErrorHandler sslErrorHandler, SslError sslError) {
            try {
                if (MBridgeConstans.IS_SP_CBT_CF && sslErrorHandler != null) {
                    sslErrorHandler.cancel();
                }
                if (TextUtils.isEmpty(this.f31716a) || TextUtils.isEmpty(this.f31717b)) {
                    return;
                }
                new com.mbridge.msdk.foundation.same.report.h(this.f31718c).a(this.f31717b, this.f31716a, webView.getUrl());
            } catch (Exception e10) {
                e10.printStackTrace();
            }
        }

        @Override // android.webkit.WebViewClient
        public boolean onRenderProcessGone(WebView webView, RenderProcessGoneDetail renderProcessGoneDetail) {
            try {
                synchronized (o.f31695r) {
                    o.this.f31707m = true;
                    o.this.b();
                    o.this.f();
                }
                if (o.this.f31700e != null) {
                    o.this.f31700e.a(-1, webView.getUrl(), "WebView render process crash.", o.this.f31705j);
                }
                if (webView != null) {
                    webView.destroy();
                }
                return true;
            } catch (Throwable th2) {
                q0.b(o.f31695r, th2.getMessage());
                return true;
            }
        }

        @Override // android.webkit.WebViewClient
        public boolean shouldOverrideUrlLoading(WebView webView, String str) {
            synchronized (o.f31695r) {
                try {
                    o oVar = o.this;
                    oVar.f31709o = true;
                    oVar.c();
                    if (o.this.f31707m) {
                        o.this.d();
                        o.this.f();
                        return true;
                    }
                    o.this.f31701f = str;
                    if (o.this.f31700e != null && o.this.f31700e.c(str)) {
                        o.this.f31707m = true;
                        o.this.d();
                        o.this.f();
                        return true;
                    }
                    if (o.this.f31704i) {
                        HashMap map = new HashMap();
                        if (o.this.f31703h.getUrl() != null) {
                            map.put("Referer", o.this.f31703h.getUrl());
                        }
                        o.this.f31703h.loadUrl(str, map);
                    } else {
                        o.this.f31703h.loadUrl(str);
                    }
                    return true;
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    public class c extends WebChromeClient {
        public c() {
        }

        @Override // android.webkit.WebChromeClient
        public boolean onJsAlert(WebView webView, String str, String str2, JsResult jsResult) {
            return true;
        }

        @Override // android.webkit.WebChromeClient
        public boolean onJsConfirm(WebView webView, String str, String str2, JsResult jsResult) {
            return true;
        }

        @Override // android.webkit.WebChromeClient
        public boolean onJsPrompt(WebView webView, String str, String str2, String str3, JsPromptResult jsPromptResult) {
            return true;
        }

        @Override // android.webkit.WebChromeClient
        public void onProgressChanged(WebView webView, int i10) {
            if (i10 == 100) {
                try {
                    webView.loadUrl("javascript:window.navigator.vibrate([]);");
                    if (!o.this.f31707m) {
                        o oVar = o.this;
                        if (!oVar.f31709o) {
                            oVar.g();
                        }
                    }
                    if (o.this.f31700e != null) {
                        o.this.f31700e.b(webView.getUrl());
                    }
                } catch (Exception e10) {
                    e10.printStackTrace();
                }
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    public class d implements Runnable {
        public d() {
        }

        @Override // java.lang.Runnable
        public void run() {
            o.this.l = true;
            o.this.f31706k = 1;
            o.this.e();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    public class e implements Runnable {
        public e() {
        }

        @Override // java.lang.Runnable
        public void run() {
            o.this.l = true;
            o.this.f31706k = 2;
            o.this.e();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    public interface f {
        void a(int i10, String str, String str2, String str3);

        void a(String str, boolean z10, String str2);

        boolean a(String str);

        boolean b(String str);

        boolean c(String str);
    }

    public o() {
        this.f31696a = 15000;
        this.f31697b = IronSourceError.ERROR_CAPPING_VALIDATION_FAILED;
        com.mbridge.msdk.setting.g gVarI = f2.i(com.mbridge.msdk.setting.i.b());
        this.f31699d = gVarI;
        if (gVarI == null) {
            this.f31699d = com.mbridge.msdk.setting.i.b().a();
        }
        this.f31704i = this.f31699d.O0();
        this.f31696a = (int) this.f31699d.u0();
        this.f31697b = (int) this.f31699d.u0();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c() {
        this.f31698c.removeCallbacks(this.f31710p);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d() {
        this.f31698c.removeCallbacks(this.f31711q);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void e() {
        synchronized (f31695r) {
            try {
                try {
                    b();
                    this.f31703h.destroy();
                    f fVar = this.f31700e;
                    if (fVar != null) {
                        fVar.a(this.f31701f, this.l, this.f31705j);
                    }
                } catch (Exception e10) {
                    q0.b(f31695r, e10.getMessage());
                } catch (Throwable th2) {
                    q0.b(f31695r, th2.getMessage());
                }
            } catch (Throwable th3) {
                throw th3;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void f() {
        synchronized (f31695r) {
            try {
                try {
                    try {
                        b();
                        f fVar = this.f31700e;
                        if (fVar != null) {
                            fVar.a(this.f31701f, this.l, this.f31705j);
                        }
                    } catch (Exception e10) {
                        q0.b(f31695r, e10.getMessage());
                    }
                } catch (Throwable th2) {
                    q0.b(f31695r, th2.getMessage());
                }
            } catch (Throwable th3) {
                throw th3;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void g() {
        c();
        i();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void h() {
        d();
        j();
    }

    private void i() {
        this.f31698c.postDelayed(this.f31710p, this.f31697b);
    }

    private void j() {
        this.f31698c.postDelayed(this.f31711q, this.f31696a);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b() {
        c();
        d();
    }

    public void a(String str, String str2, Context context, String str3, String str4, f fVar) {
        if (fVar != null) {
            this.f31702g = str4;
            this.f31701f = str3;
            this.f31700e = fVar;
            a(str, str2, context);
            return;
        }
        throw new NullPointerException("OverrideUrlLoadingListener can not be null");
    }

    public void a(String str, String str2, Context context, String str3, f fVar) {
        if (fVar != null) {
            this.f31701f = str3;
            this.f31700e = fVar;
            a(str, str2, context);
            return;
        }
        throw new NullPointerException("OverrideUrlLoadingListener can not be null");
    }

    private void a(String str, String str2, Context context) {
        if (Thread.currentThread() == Looper.getMainLooper().getThread()) {
            a(str, str2, context, this.f31701f);
        } else {
            this.f31698c.post(new a(str, str2, context));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(String str, String str2, Context context, String str3) {
        try {
            a(context, str, str2);
            if (!TextUtils.isEmpty(this.f31702g)) {
                this.f31703h.getSettings().setDefaultTextEncodingName(B5.O);
                this.f31697b = 2000;
                this.f31696a = 2000;
                q0.c(f31695r, this.f31702g);
                this.f31703h.loadDataWithBaseURL(str3, this.f31702g, "*/*", B5.O, str3);
                return;
            }
            if (this.f31704i) {
                HashMap map = new HashMap();
                if (this.f31703h.getUrl() != null) {
                    map.put("Referer", this.f31703h.getUrl());
                }
                this.f31703h.loadUrl(str3, map);
                return;
            }
            this.f31703h.loadUrl(str3);
        } catch (Throwable th2) {
            try {
                f fVar = this.f31700e;
                if (fVar != null) {
                    fVar.a(0, this.f31701f, th2.getMessage(), this.f31705j);
                }
            } catch (Exception e10) {
                e10.printStackTrace();
            }
        }
    }

    @SuppressLint({"SetJavaScriptEnabled"})
    private void a(Context context, String str, String str2) {
        WebView webView = new WebView(context);
        this.f31703h = webView;
        webView.getSettings().setJavaScriptEnabled(true);
        this.f31703h.getSettings().setCacheMode(2);
        this.f31703h.getSettings().setLoadsImagesAutomatically(false);
        this.f31703h.setWebViewClient(new b(str2, str, context));
        this.f31703h.setWebChromeClient(new c());
    }
}
