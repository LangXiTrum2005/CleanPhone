package com.smartdigimkt.o;

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
import java.util.HashMap;

/* JADX INFO: loaded from: classes.dex */
public class l {
    private static final String r = "l";
    private static final int s = 1;
    private static final int t = 2;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private static final int f37260u = 0;
    public static long v;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f37261a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f37262b;
    private com.smartdigimkt.n1.a d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private f f37264e;
    private String f;
    private String g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private WebView f37265h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private boolean f37266i;
    private String j;
    private int k;
    private boolean m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    boolean f37268n;
    boolean o;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private boolean f37267l = false;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private final Runnable f37269p = new d();
    private final Runnable q = new e();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Handler f37263c = new Handler(Looper.getMainLooper());

    public class a implements Runnable {
        final /* synthetic */ String X;

        /* JADX INFO: renamed from: Y, reason: collision with root package name */
        final /* synthetic */ String f37270Y;
        final /* synthetic */ Context Z;

        public a(String str, String str2, Context context) {
            this.X = str;
            this.f37270Y = str2;
            this.Z = context;
        }

        @Override // java.lang.Runnable
        public void run() {
            l lVar = l.this;
            lVar.a(this.X, this.f37270Y, this.Z, lVar.f);
        }
    }

    public class b extends WebViewClient {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ String f37271a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f37272b;

        public b(String str, String str2) {
            this.f37271a = str;
            this.f37272b = str2;
        }

        public boolean a() {
            l lVar = l.this;
            return lVar.f37268n || lVar.o;
        }

        @Override // android.webkit.WebViewClient
        public void onPageFinished(WebView webView, String str) {
            super.onPageFinished(webView, str);
            try {
                webView.loadUrl("javascript:window.navigator.vibrate([]);");
            } catch (Exception e2) {
                e2.printStackTrace();
            }
        }

        @Override // android.webkit.WebViewClient
        public void onPageStarted(WebView webView, String str, Bitmap bitmap) {
            try {
                webView.loadUrl("javascript:window.navigator.vibrate([]);");
                if (l.this.m) {
                    l.this.k = 0;
                    l.this.f();
                    return;
                }
                l.this.o = false;
                if (webView.getTag() == null) {
                    webView.setTag("has_first_started");
                } else {
                    l.this.f37268n = true;
                }
                synchronized (l.r) {
                    try {
                        l.this.f = str;
                        if (l.this.f37264e == null || !l.this.f37264e.a(str)) {
                            l.this.h();
                        } else {
                            l.this.m = true;
                            l.this.f();
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            } catch (Exception e2) {
                e2.printStackTrace();
            }
        }

        @Override // android.webkit.WebViewClient
        public void onReceivedError(WebView webView, int i2, String str, String str2) {
            String unused = l.r;
            webView.getUrl();
            synchronized (l.r) {
                l.this.m = true;
                l.this.b();
                l.this.f();
            }
            if (l.this.f37264e != null) {
                l.this.f37264e.a(i2, webView.getUrl(), str, l.this.j);
            }
        }

        @Override // android.webkit.WebViewClient
        public void onReceivedSslError(WebView webView, SslErrorHandler sslErrorHandler, SslError sslError) {
            try {
                String unused = l.r;
                if (com.smartdigimkt.b.b.r && sslErrorHandler != null) {
                    sslErrorHandler.cancel();
                }
                if (TextUtils.isEmpty(this.f37271a)) {
                    return;
                }
                TextUtils.isEmpty(this.f37272b);
            } catch (Exception e2) {
                e2.printStackTrace();
            }
        }

        @Override // android.webkit.WebViewClient
        public boolean onRenderProcessGone(WebView webView, RenderProcessGoneDetail renderProcessGoneDetail) {
            try {
                synchronized (l.r) {
                    l.this.m = true;
                    l.this.b();
                    l.this.f();
                }
                if (l.this.f37264e != null) {
                    l.this.f37264e.a(-1, webView.getUrl(), "WebView render process crash.", l.this.j);
                }
                if (webView != null) {
                    webView.destroy();
                }
                return true;
            } catch (Throwable th) {
                String unused = l.r;
                th.getMessage();
                return true;
            }
        }

        @Override // android.webkit.WebViewClient
        public boolean shouldOverrideUrlLoading(WebView webView, String str) {
            synchronized (l.r) {
                try {
                    String unused = l.r;
                    l lVar = l.this;
                    lVar.o = true;
                    lVar.c();
                    if (l.this.m) {
                        l.this.d();
                        l.this.f();
                        return true;
                    }
                    l.this.f = str;
                    if (l.this.f37264e != null && l.this.f37264e.c(str)) {
                        l.this.m = true;
                        l.this.d();
                        l.this.f();
                        return true;
                    }
                    if (l.this.f37266i) {
                        HashMap map = new HashMap();
                        if (l.this.f37265h.getUrl() != null) {
                            map.put("Referer", l.this.f37265h.getUrl());
                        }
                        l.this.f37265h.loadUrl(str, map);
                    } else {
                        l.this.f37265h.loadUrl(str);
                    }
                    return true;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

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
        public void onProgressChanged(WebView webView, int i2) {
            if (i2 == 100) {
                try {
                    String unused = l.r;
                    webView.getUrl();
                    webView.loadUrl("javascript:window.navigator.vibrate([]);");
                    if (!l.this.m) {
                        l lVar = l.this;
                        if (!lVar.o) {
                            lVar.g();
                        }
                    }
                    if (l.this.f37264e != null) {
                        l.this.f37264e.b(webView.getUrl());
                    }
                } catch (Exception e2) {
                    e2.printStackTrace();
                }
            }
        }
    }

    public class d implements Runnable {
        public d() {
        }

        @Override // java.lang.Runnable
        public void run() {
            l.this.f37267l = true;
            l.this.k = 1;
            String unused = l.r;
            int unused2 = l.this.f37262b;
            l.this.e();
        }
    }

    public class e implements Runnable {
        public e() {
        }

        @Override // java.lang.Runnable
        public void run() {
            l.this.f37267l = true;
            l.this.k = 2;
            String unused = l.r;
            int unused2 = l.this.f37261a;
            l.this.e();
        }
    }

    public interface f {
        void a(int i2, String str, String str2, String str3);

        void a(String str, boolean z2, String str2);

        boolean a(String str);

        boolean b(String str);

        boolean c(String str);
    }

    public l() {
        this.f37261a = 15000;
        this.f37262b = 3000;
        com.smartdigimkt.n1.a aVarC = com.smartdigimkt.n1.b.b().c(com.smartdigimkt.u.a.f().a());
        this.d = aVarC;
        if (aVarC == null) {
            this.d = com.smartdigimkt.n1.b.b().a();
        }
        this.f37266i = this.d.u1();
        this.f37261a = (int) this.d.V0();
        this.f37262b = (int) this.d.V0();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c() {
        this.f37263c.removeCallbacks(this.f37269p);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d() {
        this.f37263c.removeCallbacks(this.q);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void e() {
        synchronized (r) {
            try {
                b();
                this.f37265h.destroy();
                f fVar = this.f37264e;
                if (fVar != null) {
                    fVar.a(this.f, this.f37267l, this.j);
                }
            } catch (Throwable unused) {
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void f() {
        synchronized (r) {
            try {
                b();
                f fVar = this.f37264e;
                if (fVar != null) {
                    fVar.a(this.f, this.f37267l, this.j);
                }
            } catch (Throwable unused) {
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
        this.f37263c.postDelayed(this.f37269p, this.f37262b);
    }

    private void j() {
        this.f37263c.postDelayed(this.q, this.f37261a);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b() {
        c();
        d();
    }

    public void a(String str, String str2, Context context, String str3, String str4, f fVar) {
        if (fVar != null) {
            this.g = str4;
            this.f = str3;
            this.f37264e = fVar;
            a(str, str2, context);
            return;
        }
        throw new NullPointerException("OverrideUrlLoadingListener can not be null");
    }

    public void a(String str, String str2, Context context, String str3, f fVar) {
        if (fVar != null) {
            this.f = str3;
            this.f37264e = fVar;
            a(str, str2, context);
            return;
        }
        throw new NullPointerException("OverrideUrlLoadingListener can not be null");
    }

    private void a(String str, String str2, Context context) {
        if (Thread.currentThread() == Looper.getMainLooper().getThread()) {
            a(str, str2, context, this.f);
        } else {
            this.f37263c.post(new a(str, str2, context));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(String str, String str2, Context context, String str3) {
        try {
            a(context, str, str2);
            if (!TextUtils.isEmpty(this.g)) {
                this.f37265h.getSettings().setDefaultTextEncodingName("utf-8");
                this.f37262b = 2000;
                this.f37261a = 2000;
                this.f37265h.loadDataWithBaseURL(str3, this.g, "*/*", "utf-8", str3);
                return;
            }
            if (this.f37266i) {
                HashMap map = new HashMap();
                if (this.f37265h.getUrl() != null) {
                    map.put("Referer", this.f37265h.getUrl());
                }
                this.f37265h.loadUrl(str3, map);
                return;
            }
            this.f37265h.loadUrl(str3);
        } catch (Throwable th) {
            try {
                f fVar = this.f37264e;
                if (fVar != null) {
                    fVar.a(0, this.f, th.getMessage(), this.j);
                }
            } catch (Exception e2) {
                e2.printStackTrace();
            }
        }
    }

    private void a(Context context, String str, String str2) {
        WebView webView = new WebView(context);
        this.f37265h = webView;
        webView.getSettings().setJavaScriptEnabled(true);
        this.f37265h.getSettings().setCacheMode(2);
        this.f37265h.getSettings().setLoadsImagesAutomatically(false);
        this.f37265h.setWebViewClient(new b(str2, str));
        this.f37265h.setWebChromeClient(new c());
    }
}
