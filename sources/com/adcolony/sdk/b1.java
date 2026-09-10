package com.adcolony.sdk;

import android.content.Context;
import android.net.Uri;
import android.os.Build;
import android.view.MotionEvent;
import android.view.ViewGroup;
import android.webkit.ConsoleMessage;
import android.webkit.JsResult;
import android.webkit.RenderProcessGoneDetail;
import android.webkit.WebChromeClient;
import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.FrameLayout;
import com.mbridge.msdk.playercommon.exoplayer2.text.ttml.TtmlNode;
import com.p004ironsource.d9;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.nio.charset.Charset;
import java.util.ArrayList;
import kotlin.Unit;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.text.Regex;
import kotlin.text.StringsKt;

/* JADX INFO: loaded from: classes.dex */
public class b1 extends WebView {

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public static final g f9007u = new g(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f9008a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final h0 f9009b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f9010c;
    private String d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private String f9011e;
    private String f;
    private String g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private String f9012h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private String f9013i;
    private f1 j;
    private boolean k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private com.adcolony.sdk.c f9014l;
    private int m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private int f9015n;
    private int o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private int f9016p;
    private int q;
    private int r;
    private int s;
    private int t;

    public final class a extends WebChromeClient {
        public a() {
        }

        @Override // android.webkit.WebChromeClient
        public boolean onConsoleMessage(ConsoleMessage consoleMessage) {
            String strA;
            ConsoleMessage.MessageLevel messageLevel = consoleMessage == null ? null : consoleMessage.messageLevel();
            String strMessage = consoleMessage == null ? null : consoleMessage.message();
            boolean z2 = (strMessage != null && StringsKt.l(strMessage, "Viewport target-densitydpi is not supported.", false)) || (strMessage != null && StringsKt.l(strMessage, "Viewport argument key \"shrink-to-fit\" not recognized and ignored", false));
            boolean z3 = messageLevel == ConsoleMessage.MessageLevel.ERROR;
            boolean z4 = messageLevel == ConsoleMessage.MessageLevel.WARNING;
            if ((strMessage != null && StringsKt.l(strMessage, "ADC3_update is not defined", false)) || (strMessage != null && StringsKt.l(strMessage, "NativeLayer.dispatch_messages is not a function", false))) {
                b1 b1Var = b1.this;
                h0 message = b1Var.getMessage();
                f1 f1VarA = message != null ? message.a() : null;
                if (f1VarA == null) {
                    f1VarA = new f1();
                }
                b1Var.a(f1VarA, "Unable to communicate with AdColony. Please ensure that you have added an exception for our Javascript interface in your ProGuard configuration and that you do not have a faulty proxy enabled on your device.");
            }
            if (!z2 && (z4 || z3)) {
                AdColonyInterstitial interstitial = b1.this.getInterstitial();
                if (interstitial == null || (strA = interstitial.a()) == null) {
                    strA = "unknown";
                }
                new e0.a().a("onConsoleMessage: " + ((Object) strMessage) + " with ad id: " + strA).a(z3 ? e0.f9132i : e0.g);
            }
            return true;
        }

        @Override // android.webkit.WebChromeClient
        public boolean onJsAlert(WebView webView, String str, String str2, JsResult jsResult) {
            if (jsResult == null) {
                return true;
            }
            jsResult.confirm();
            return true;
        }
    }

    public class b extends WebViewClient {
        public b() {
        }

        @Override // android.webkit.WebViewClient
        public void onPageFinished(WebView webView, String str) {
            Unit unit;
            f1 f1VarB = c0.b();
            c0.b(f1VarB, "id", b1.this.f9010c);
            c0.a(f1VarB, "url", str);
            com.adcolony.sdk.c parentContainer = b1.this.getParentContainer();
            if (parentContainer == null) {
                unit = null;
            } else {
                c0.a(f1VarB, "ad_session_id", b1.this.getAdSessionId());
                c0.b(f1VarB, "container_id", parentContainer.c());
                new h0("WebView.on_load", parentContainer.k(), f1VarB).c();
                unit = Unit.f43263a;
            }
            if (unit == null) {
                new h0("WebView.on_load", b1.this.getWebViewModuleId(), f1VarB).c();
            }
        }

        @Override // android.webkit.WebViewClient
        public void onReceivedError(WebView webView, int i2, String str, String str2) {
            b1.this.a(i2, str, str2);
        }

        @Override // android.webkit.WebViewClient
        public WebResourceResponse shouldInterceptRequest(WebView webView, String str) {
            if (str == null || !StringsKt.p(str, "mraid.js", false)) {
                return null;
            }
            String str2 = b1.this.f9011e;
            Charset charset = com.adcolony.sdk.h.f9168a;
            if (str2 == null) {
                throw new NullPointerException("null cannot be cast to non-null type java.lang.String");
            }
            return new WebResourceResponse("text/javascript", charset.name(), new ByteArrayInputStream(str2.getBytes(charset)));
        }
    }

    public class c extends b {
        public c() {
            super();
        }

        @Override // com.adcolony.sdk.b1.b, android.webkit.WebViewClient
        public WebResourceResponse shouldInterceptRequest(WebView webView, String str) {
            return null;
        }

        @Override // android.webkit.WebViewClient
        public WebResourceResponse shouldInterceptRequest(WebView webView, WebResourceRequest webResourceRequest) {
            Uri url;
            String string;
            if (webResourceRequest == null || (url = webResourceRequest.getUrl()) == null || (string = url.toString()) == null || !StringsKt.p(string, "mraid.js", false)) {
                return null;
            }
            String str = b1.this.f9011e;
            Charset charset = com.adcolony.sdk.h.f9168a;
            if (str != null) {
                return new WebResourceResponse("text/javascript", charset.name(), new ByteArrayInputStream(str.getBytes(charset)));
            }
            throw new NullPointerException("null cannot be cast to non-null type java.lang.String");
        }
    }

    public class d extends c {
        public d() {
            super();
        }

        @Override // com.adcolony.sdk.b1.b, android.webkit.WebViewClient
        public void onReceivedError(WebView webView, int i2, String str, String str2) {
        }

        @Override // android.webkit.WebViewClient
        public void onReceivedError(WebView webView, WebResourceRequest webResourceRequest, WebResourceError webResourceError) {
            Uri url;
            if (webResourceError == null) {
                return;
            }
            b1.this.a(webResourceError.getErrorCode(), webResourceError.getDescription().toString(), (webResourceRequest == null || (url = webResourceRequest.getUrl()) == null) ? null : url.toString());
        }
    }

    public class e extends d {
        public e(b1 b1Var) {
            super();
        }
    }

    public class f extends e {
        public f() {
            super(b1.this);
        }

        @Override // android.webkit.WebViewClient
        public boolean onRenderProcessGone(WebView webView, RenderProcessGoneDetail renderProcessGoneDetail) {
            if (renderProcessGoneDetail != null && renderProcessGoneDetail.didCrash()) {
                b1.this.a(c0.b(), "An error occurred while rendering the ad. Ad closing.");
            }
            return true;
        }
    }

    public static final class g {
        public /* synthetic */ g(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @JvmStatic
        public final b1 a(Context context, h0 h0Var, int i2, com.adcolony.sdk.c cVar) {
            b1 c1Var;
            int iE = com.adcolony.sdk.a.b().r().e();
            f1 f1VarA = h0Var.a();
            if (c0.b(f1VarA, "use_mraid_module")) {
                c1Var = new l0(context, iE, h0Var, com.adcolony.sdk.a.b().r().e());
            } else {
                c1Var = c0.b(f1VarA, "enable_messages") ? new c1(context, iE, h0Var) : new b1(context, iE, h0Var);
            }
            c1Var.a(h0Var, i2, cVar);
            c1Var.i();
            return c1Var;
        }

        private g() {
        }
    }

    public static final class h implements j0 {

        public static final class a extends Lambda implements Function0<Unit> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ b1 f9022a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ h0 f9023b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(b1 b1Var, h0 h0Var) {
                super(0);
                this.f9022a = b1Var;
                this.f9023b = h0Var;
            }

            public final void a() {
                this.f9022a.a(c0.h(this.f9023b.a(), "custom_js"));
            }

            @Override // kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ Object invoke() {
                a();
                return Unit.f43263a;
            }
        }

        public h() {
        }

        @Override // com.adcolony.sdk.j0
        public void a(h0 h0Var) {
            b1 b1Var = b1.this;
            b1Var.a(h0Var, new a(b1Var, h0Var));
        }
    }

    public static final class i implements j0 {

        public static final class a extends Lambda implements Function0<Unit> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ b1 f9025a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ h0 f9026b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(b1 b1Var, h0 h0Var) {
                super(0);
                this.f9025a = b1Var;
                this.f9026b = h0Var;
            }

            public final void a() {
                this.f9025a.setVisible(this.f9026b);
            }

            @Override // kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ Object invoke() {
                a();
                return Unit.f43263a;
            }
        }

        public i() {
        }

        @Override // com.adcolony.sdk.j0
        public void a(h0 h0Var) {
            b1 b1Var = b1.this;
            b1Var.a(h0Var, new a(b1Var, h0Var));
        }
    }

    public static final class j implements j0 {

        public static final class a extends Lambda implements Function0<Unit> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ b1 f9028a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ h0 f9029b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(b1 b1Var, h0 h0Var) {
                super(0);
                this.f9028a = b1Var;
                this.f9029b = h0Var;
            }

            public final void a() {
                this.f9028a.setBounds(this.f9029b);
            }

            @Override // kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ Object invoke() {
                a();
                return Unit.f43263a;
            }
        }

        public j() {
        }

        @Override // com.adcolony.sdk.j0
        public void a(h0 h0Var) {
            b1 b1Var = b1.this;
            b1Var.a(h0Var, new a(b1Var, h0Var));
        }
    }

    public static final class k implements j0 {

        public static final class a extends Lambda implements Function0<Unit> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ b1 f9031a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ h0 f9032b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(b1 b1Var, h0 h0Var) {
                super(0);
                this.f9031a = b1Var;
                this.f9032b = h0Var;
            }

            public final void a() {
                this.f9031a.setTransparent(c0.b(this.f9032b.a(), d9.h.T));
            }

            @Override // kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ Object invoke() {
                a();
                return Unit.f43263a;
            }
        }

        public k() {
        }

        @Override // com.adcolony.sdk.j0
        public void a(h0 h0Var) {
            b1 b1Var = b1.this;
            b1Var.a(h0Var, new a(b1Var, h0Var));
        }
    }

    public static final class l implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final /* synthetic */ Function0 f9033a;

        public l(Function0 function0) {
            this.f9033a = function0;
        }

        @Override // java.lang.Runnable
        public final /* synthetic */ void run() {
            this.f9033a.invoke();
        }
    }

    public static final class m implements Runnable {

        public static final class a extends WebViewClient {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ b1 f9035a;

            public a(b1 b1Var) {
                this.f9035a = b1Var;
            }

            @Override // android.webkit.WebViewClient
            public void onPageFinished(WebView webView, String str) {
                this.f9035a.destroy();
            }
        }

        public m() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            b1.this.setWebChromeClient(null);
            b1.this.setWebViewClient(new a(b1.this));
            b1.this.clearCache(true);
            b1.this.removeAllViews();
            b1.this.loadUrl("about:blank");
        }
    }

    public b1(Context context, int i2, h0 h0Var) {
        super(context);
        this.f9008a = i2;
        this.f9009b = h0Var;
        this.d = "";
        this.f9011e = "";
        this.f = "";
        this.g = "";
        this.f9012h = "";
        this.f9013i = "";
        this.j = c0.b();
    }

    @JvmStatic
    public static final b1 a(Context context, h0 h0Var, int i2, com.adcolony.sdk.c cVar) {
        return f9007u.a(context, h0Var, i2, cVar);
    }

    private final void d() {
        ArrayList<String> arrayListJ;
        ArrayList<j0> arrayListI;
        com.adcolony.sdk.c cVar = this.f9014l;
        if (cVar != null && (arrayListI = cVar.i()) != null) {
            arrayListI.add(com.adcolony.sdk.a.a("WebView.execute_js", (j0) new h(), true));
            arrayListI.add(com.adcolony.sdk.a.a("WebView.set_visible", (j0) new i(), true));
            arrayListI.add(com.adcolony.sdk.a.a("WebView.set_bounds", (j0) new j(), true));
            arrayListI.add(com.adcolony.sdk.a.a("WebView.set_transparent", (j0) new k(), true));
        }
        com.adcolony.sdk.c cVar2 = this.f9014l;
        if (cVar2 == null || (arrayListJ = cVar2.j()) == null) {
            return;
        }
        arrayListJ.add("WebView.execute_js");
        arrayListJ.add("WebView.set_visible");
        arrayListJ.add("WebView.set_bounds");
        arrayListJ.add("WebView.set_transparent");
    }

    private final WebViewClient g() {
        return Build.VERSION.SDK_INT >= 26 ? getWebViewClientApi26() : getWebViewClientApi24();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void setTransparent(boolean z2) {
        setBackgroundColor(z2 ? 0 : -1);
    }

    public /* synthetic */ void e() {
        d();
        setVisibility(4);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(this.o, this.f9016p);
        layoutParams.setMargins(getCurrentX(), getCurrentY(), 0, 0);
        layoutParams.gravity = 0;
        com.adcolony.sdk.c cVar = this.f9014l;
        if (cVar == null) {
            return;
        }
        cVar.addView(this, layoutParams);
    }

    public final void f() {
        com.adcolony.sdk.a.b().c().a(this, this.f9012h, this.f9014l);
    }

    public final /* synthetic */ String getAdSessionId() {
        return this.f9012h;
    }

    public final /* synthetic */ AdColonyAdView getAdView() {
        return com.adcolony.sdk.a.b().c().d().get(this.f9012h);
    }

    public final /* synthetic */ String getBaseUrl() {
        return this.g;
    }

    public final int getCurrentHeight() {
        return this.f9016p;
    }

    public final int getCurrentWidth() {
        return this.o;
    }

    public final int getCurrentX() {
        return this.m;
    }

    public final int getCurrentY() {
        return this.f9015n;
    }

    public final /* synthetic */ boolean getDestroyed() {
        return this.k;
    }

    public final /* synthetic */ f1 getInfo() {
        return this.j;
    }

    public final int getInitialHeight() {
        return this.t;
    }

    public final int getInitialWidth() {
        return this.s;
    }

    public final int getInitialX() {
        return this.q;
    }

    public final int getInitialY() {
        return this.r;
    }

    public final /* synthetic */ AdColonyInterstitial getInterstitial() {
        return com.adcolony.sdk.a.b().c().f().get(this.f9012h);
    }

    public final /* synthetic */ String getMUrl() {
        return this.f;
    }

    public final /* synthetic */ h0 getMessage() {
        return this.f9009b;
    }

    public final /* synthetic */ String getMraidFilepath() {
        return this.f9013i;
    }

    public final /* synthetic */ com.adcolony.sdk.c getParentContainer() {
        return this.f9014l;
    }

    public /* synthetic */ WebViewClient getWebViewClientApi21() {
        return new c();
    }

    public /* synthetic */ WebViewClient getWebViewClientApi23() {
        return new d();
    }

    public /* synthetic */ WebViewClient getWebViewClientApi24() {
        return new e(this);
    }

    public /* synthetic */ WebViewClient getWebViewClientApi26() {
        return new f();
    }

    public /* synthetic */ WebViewClient getWebViewClientDefault() {
        return new b();
    }

    public final int getWebViewModuleId() {
        return this.f9008a;
    }

    public final /* synthetic */ String h() {
        AdColonyInterstitial interstitial = getInterstitial();
        if (interstitial != null) {
            String str = ((Object) interstitial.a()) + " : " + interstitial.getZoneID();
            if (str != null) {
                return str;
            }
        }
        return "unknown";
    }

    public /* synthetic */ void i() {
        setFocusable(true);
        setHorizontalScrollBarEnabled(false);
        setVerticalScrollBarEnabled(false);
        WebView.setWebContentsDebuggingEnabled(false);
        setWebChromeClient(new a());
        WebSettings settings = getSettings();
        settings.setJavaScriptEnabled(true);
        settings.setBuiltInZoomControls(true);
        settings.setDisplayZoomControls(false);
        settings.setUseWideViewPort(true);
        settings.setGeolocationEnabled(true);
        settings.setMediaPlaybackRequiresUserGesture(false);
        settings.setAllowFileAccessFromFileURLs(true);
        settings.setAllowUniversalAccessFromFileURLs(true);
        settings.setAllowFileAccess(true);
        setWebViewClient(g());
        j();
        if (!(this instanceof com.adcolony.sdk.j)) {
            e();
        }
        if (this.d.length() > 0) {
            a(this.d);
        }
    }

    public /* synthetic */ void j() {
        if (!StringsKt.M(this.f, "http", false) && !StringsKt.M(this.f, d9.h.f24719b, false)) {
            loadDataWithBaseURL(this.g, this.f, "text/html", null, null);
        } else if (StringsKt.l(this.f, ".html", false) || !StringsKt.M(this.f, d9.h.f24719b, false)) {
            loadUrl(this.f);
        } else {
            loadDataWithBaseURL(this.f, android.support.v4.media.a.r(new StringBuilder("<html><script src=\""), this.f, "\"></script></html>"), "text/html", null, null);
        }
    }

    public /* synthetic */ void k() {
        if (this.f9013i.length() > 0) {
            try {
                this.f9011e = com.adcolony.sdk.a.b().p().a(this.f9013i, false).toString();
                this.f9011e = new Regex("bridge.os_name\\s*=\\s*\"\"\\s*;").e("bridge.os_name = \"\";\nvar ADC_DEVICE_INFO = " + this.j + ";\n", this.f9011e);
            } catch (IOException e2) {
                a(e2);
            } catch (IllegalArgumentException e3) {
                a(e3);
            } catch (IndexOutOfBoundsException e4) {
                a(e4);
            }
        }
    }

    public final void l() {
        if (this.k) {
            return;
        }
        this.k = true;
        z0.b(new m());
    }

    @Override // android.webkit.WebView, android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (motionEvent != null && motionEvent.getAction() == 1) {
            AdColonyAdView adView = getAdView();
            if (adView != null && !adView.c()) {
                f1 f1VarB = c0.b();
                c0.a(f1VarB, "ad_session_id", getAdSessionId());
                new h0("WebView.on_first_click", 1, f1VarB).c();
                adView.setUserInteraction(true);
            }
            AdColonyInterstitial interstitial = getInterstitial();
            if (interstitial != null) {
                interstitial.b(true);
            }
        }
        return super.onTouchEvent(motionEvent);
    }

    public final /* synthetic */ void setAdSessionId(String str) {
        this.f9012h = str;
    }

    public final /* synthetic */ void setBaseUrl(String str) {
        this.g = str;
    }

    public /* synthetic */ void setBounds(h0 h0Var) {
        f1 f1VarA = h0Var.a();
        this.m = c0.d(f1VarA, "x");
        this.f9015n = c0.d(f1VarA, "y");
        this.o = c0.d(f1VarA, "width");
        this.f9016p = c0.d(f1VarA, "height");
        ViewGroup.LayoutParams layoutParams = getLayoutParams();
        if (layoutParams == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams");
        }
        FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) layoutParams;
        layoutParams2.setMargins(getCurrentX(), getCurrentY(), 0, 0);
        layoutParams2.width = getCurrentWidth();
        layoutParams2.height = getCurrentHeight();
        setLayoutParams(layoutParams2);
    }

    public final /* synthetic */ void setInfo(f1 f1Var) {
        this.j = f1Var;
    }

    public final /* synthetic */ void setMUrl(String str) {
        this.f = str;
    }

    public final /* synthetic */ void setMraidFilepath(String str) {
        this.f9013i = str;
    }

    public /* synthetic */ void setVisible(h0 h0Var) {
        setVisibility(c0.b(h0Var.a(), "visible") ? 0 : 4);
    }

    public final void b(h0 h0Var, int i2, com.adcolony.sdk.c cVar) {
        a(h0Var, i2, cVar);
        e();
    }

    public /* synthetic */ void a(h0 h0Var, int i2, com.adcolony.sdk.c cVar) {
        this.f9010c = i2;
        this.f9014l = cVar;
        f1 f1VarA = h0Var.a();
        String strI = c0.i(f1VarA, "url");
        if (strI == null) {
            strI = c0.h(f1VarA, "data");
        }
        this.f = strI;
        this.g = c0.h(f1VarA, "base_url");
        this.d = c0.h(f1VarA, "custom_js");
        this.f9012h = c0.h(f1VarA, "ad_session_id");
        this.j = c0.f(f1VarA, "info");
        this.f9013i = c0.h(f1VarA, "mraid_filepath");
        this.o = c0.d(f1VarA, "width");
        this.f9016p = c0.d(f1VarA, "height");
        this.m = c0.d(f1VarA, "x");
        int iD = c0.d(f1VarA, "y");
        this.f9015n = iD;
        this.s = this.o;
        this.t = this.f9016p;
        this.q = this.m;
        this.r = iD;
        k();
        f();
    }

    public final /* synthetic */ void a(String str) {
        if (this.k) {
            new e0.a().a("Ignoring call to execute_js as WebView has been destroyed.").a(e0.f9129c);
            return;
        }
        try {
            evaluateJavascript(str, null);
        } catch (IllegalStateException unused) {
            new e0.a().a("Device reporting incorrect OS version, evaluateJavascript ").a("is not available. Disabling AdColony.").a(e0.f9131h);
            AdColony.disable();
        }
    }

    public /* synthetic */ boolean a(f1 f1Var, String str) {
        Context contextA = com.adcolony.sdk.a.a();
        com.adcolony.sdk.b bVar = contextA instanceof com.adcolony.sdk.b ? (com.adcolony.sdk.b) contextA : null;
        if (bVar == null) {
            return false;
        }
        com.adcolony.sdk.a.b().c().a(bVar, f1Var, str);
        return true;
    }

    private final void a(Exception exc) {
        new e0.a().a(exc.getClass().toString()).a(" during metadata injection w/ metadata = ").a(c0.h(this.j, TtmlNode.TAG_METADATA)).a(e0.f9132i);
        com.adcolony.sdk.c cVar = this.f9014l;
        if (cVar == null) {
            return;
        }
        f1 f1VarB = c0.b();
        c0.a(f1VarB, "id", getAdSessionId());
        new h0("AdSession.on_error", cVar.k(), f1VarB).c();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void a(int i2, String str, String str2) {
        com.adcolony.sdk.c cVar = this.f9014l;
        if (cVar != null) {
            f1 f1VarB = c0.b();
            c0.b(f1VarB, "id", this.f9010c);
            c0.a(f1VarB, "ad_session_id", getAdSessionId());
            c0.b(f1VarB, "container_id", cVar.c());
            c0.b(f1VarB, "code", i2);
            c0.a(f1VarB, "error", str);
            c0.a(f1VarB, "url", str2);
            new h0("WebView.on_error", cVar.k(), f1VarB).c();
        }
        e0.a aVarA = new e0.a().a("onReceivedError: ");
        if (str == null) {
            str = "WebViewErrorMessage: null description";
        }
        aVarA.a(str).a(e0.f9132i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void a(h0 h0Var, Function0<Unit> function0) {
        f1 f1VarA = h0Var.a();
        if (c0.d(f1VarA, "id") == this.f9010c) {
            int iD = c0.d(f1VarA, "container_id");
            com.adcolony.sdk.c cVar = this.f9014l;
            if (cVar != null && iD == cVar.c()) {
                String strH = c0.h(f1VarA, "ad_session_id");
                com.adcolony.sdk.c cVar2 = this.f9014l;
                if (Intrinsics.a(strH, cVar2 == null ? null : cVar2.a())) {
                    z0.b(new l(function0));
                }
            }
        }
    }

    public final void a(h0 h0Var) {
        setBounds(h0Var);
    }
}
