package com.adcolony.sdk;

import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.net.Uri;
import android.webkit.JavascriptInterface;
import android.webkit.WebMessage;
import android.webkit.WebMessagePort;
import android.webkit.WebResourceRequest;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.iab.omid.library.adcolony.ScriptInjector;
import com.mbridge.msdk.playercommon.exoplayer2.text.ttml.TtmlNode;
import java.io.IOException;
import java.util.List;
import kotlin.collections.ArraysKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Regex;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* JADX INFO: loaded from: classes.dex */
public class c1 extends b1 implements k0 {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    private i f9062A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    private boolean f9063B;
    private f1 C;
    private boolean D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    private boolean f9064E;
    private boolean v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private boolean f9065w;
    private final Object x;
    private e1 y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private String f9066z;

    public class a {
        public a() {
        }

        @JavascriptInterface
        public final void dispatch_messages(String str, String str2) {
            if (Intrinsics.a(str2, c1.this.f9066z)) {
                c1.this.c(str);
            }
        }

        @JavascriptInterface
        public final void enable_reverse_messaging(String str) {
            if (Intrinsics.a(str, c1.this.f9066z)) {
                c1.this.v = true;
            }
        }

        @JavascriptInterface
        public final String pull_messages(String str) {
            if (!Intrinsics.a(str, c1.this.f9066z)) {
                return "[]";
            }
            String string = "[]";
            Object obj = c1.this.x;
            c1 c1Var = c1.this;
            synchronized (obj) {
                try {
                    if (c1Var.y.b() > 0) {
                        string = c1Var.getEnableMessages() ? c1Var.y.toString() : "[]";
                        c1Var.y = c0.a();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            return string;
        }

        @JavascriptInterface
        public final void push_messages(String str, String str2) {
            if (Intrinsics.a(str2, c1.this.f9066z)) {
                c1.this.c(str);
            }
        }
    }

    public final class b extends a {
        public b() {
            super();
        }

        @JavascriptInterface
        public final void enable_event_messaging(String str) {
            if (Intrinsics.a(str, c1.this.f9066z)) {
                c1.this.f9065w = true;
            }
        }
    }

    public class c extends b1.b {
        public c() {
            super();
        }

        @Override // com.adcolony.sdk.b1.b, android.webkit.WebViewClient
        public void onPageFinished(WebView webView, String str) {
            super.onPageFinished(webView, str);
            c1.this.new l().a();
        }

        @Override // android.webkit.WebViewClient
        public void onPageStarted(WebView webView, String str, Bitmap bitmap) {
            c1.this.new l().b();
        }

        @Override // android.webkit.WebViewClient
        public boolean shouldOverrideUrlLoading(WebView webView, String str) {
            return c1.this.new l().a(str);
        }
    }

    public class d extends b1.c {
        public d() {
            super();
        }

        @Override // com.adcolony.sdk.b1.b, android.webkit.WebViewClient
        public void onPageFinished(WebView webView, String str) {
            super.onPageFinished(webView, str);
            c1.this.new l().a();
        }

        @Override // android.webkit.WebViewClient
        public void onPageStarted(WebView webView, String str, Bitmap bitmap) {
            c1.this.new l().b();
        }

        @Override // android.webkit.WebViewClient
        public boolean shouldOverrideUrlLoading(WebView webView, String str) {
            return c1.this.new l().a(str);
        }
    }

    public class e extends b1.d {
        public e() {
            super();
        }

        @Override // com.adcolony.sdk.b1.b, android.webkit.WebViewClient
        public void onPageFinished(WebView webView, String str) {
            super.onPageFinished(webView, str);
            c1.this.new j().a(str);
        }

        @Override // android.webkit.WebViewClient
        public void onPageStarted(WebView webView, String str, Bitmap bitmap) {
            c1.this.new l().b();
        }

        @Override // android.webkit.WebViewClient
        public boolean shouldOverrideUrlLoading(WebView webView, String str) {
            return c1.this.new l().a(str);
        }
    }

    public class f extends b1.e {
        public f() {
            super(c1.this);
        }

        @Override // com.adcolony.sdk.b1.b, android.webkit.WebViewClient
        public void onPageFinished(WebView webView, String str) {
            super.onPageFinished(webView, str);
            c1.this.new j().a(str);
        }

        @Override // android.webkit.WebViewClient
        public void onPageStarted(WebView webView, String str, Bitmap bitmap) {
            c1.this.new l().b();
        }

        @Override // android.webkit.WebViewClient
        public boolean shouldOverrideUrlLoading(WebView webView, WebResourceRequest webResourceRequest) {
            return c1.this.new k().a(webResourceRequest);
        }
    }

    public class g extends b1.f {
        public g() {
            super();
        }

        @Override // com.adcolony.sdk.b1.b, android.webkit.WebViewClient
        public void onPageFinished(WebView webView, String str) {
            super.onPageFinished(webView, str);
            c1.this.new j().a(str);
        }

        @Override // android.webkit.WebViewClient
        public void onPageStarted(WebView webView, String str, Bitmap bitmap) {
            c1.this.new l().b();
        }

        @Override // android.webkit.WebViewClient
        public boolean shouldOverrideUrlLoading(WebView webView, WebResourceRequest webResourceRequest) {
            return c1.this.new k().a(webResourceRequest);
        }
    }

    public static final class h {
        public /* synthetic */ h(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private h() {
        }
    }

    public static final class i {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final WebMessagePort[] f9072a;

        public i(WebMessagePort[] webMessagePortArr) {
            this.f9072a = webMessagePortArr;
        }

        public final WebMessagePort a() {
            return (WebMessagePort) ArraysKt.A(1, this.f9072a);
        }

        public final WebMessagePort b() {
            return (WebMessagePort) ArraysKt.A(0, this.f9072a);
        }
    }

    public final class j {
        public j() {
        }

        public final void a(String str) {
            c1.this.new l().a();
            if (str != null) {
                c1.this.d(str);
            } else {
                new e0.a().a("ADCWebViewModule: initializeEventMessaging failed due to url = null").a(e0.g);
            }
        }
    }

    public final class k {
        public k() {
        }

        public final boolean a(WebResourceRequest webResourceRequest) {
            if (!c1.this.getModuleInitialized() || webResourceRequest == null || !webResourceRequest.isForMainFrame()) {
                return false;
            }
            String clickOverride = c1.this.getClickOverride();
            Uri url = clickOverride == null ? null : Uri.parse(clickOverride);
            if (url == null) {
                url = webResourceRequest.getUrl();
            }
            if (url != null) {
                z0.a(new Intent("android.intent.action.VIEW", url));
                f1 f1VarB = c0.b();
                c1 c1Var = c1.this;
                c0.a(f1VarB, "url", url.toString());
                c0.a(f1VarB, "ad_session_id", c1Var.getAdSessionId());
                com.adcolony.sdk.c parentContainer = c1.this.getParentContainer();
                new h0("WebView.redirect_detected", parentContainer != null ? parentContainer.k() : 0, f1VarB).c();
                x0 x0VarA = com.adcolony.sdk.a.b().A();
                c1 c1Var2 = c1.this;
                x0VarA.a(c1Var2.getAdSessionId());
                x0VarA.c(c1Var2.getAdSessionId());
            } else {
                new e0.a().a(Intrinsics.k(c1.this.h(), "shouldOverrideUrlLoading called with null request url, with ad id: ")).a(e0.f9132i);
            }
            return true;
        }
    }

    public static final class m extends WebMessagePort.WebMessageCallback {
        public m() {
        }

        @Override // android.webkit.WebMessagePort.WebMessageCallback
        public void onMessage(WebMessagePort webMessagePort, WebMessage webMessage) {
            String data;
            if (webMessage == null || (data = webMessage.getData()) == null) {
                return;
            }
            c1 c1Var = c1.this;
            List listF = new Regex(":").f(data, 2);
            if (listF.size() == 2 && Intrinsics.a(listF.get(0), c1Var.f9066z)) {
                c1Var.b((String) listF.get(1));
            }
        }
    }

    public static final class n implements Runnable {
        public n() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            c1.this.removeJavascriptInterface("NativeLayer");
        }
    }

    public static final class o implements Runnable {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f9079b;

        public o(String str) {
            this.f9079b = str;
        }

        @Override // java.lang.Runnable
        public final void run() {
            if (c1.this.getEnableMessages()) {
                c1.this.a("NativeLayer.dispatch_messages(ADC3_update(" + this.f9079b + "), '" + c1.this.f9066z + "');");
            }
        }
    }

    static {
        new h(null);
    }

    public c1(Context context, int i2, h0 h0Var) {
        super(context, i2, h0Var);
        this.x = new Object();
        this.y = c0.a();
        this.f9066z = "";
        this.f9063B = true;
        this.C = c0.b();
    }

    private final void e(f1 f1Var) {
        WebMessagePort webMessagePortB;
        if (this.f9063B) {
            i iVar = this.f9062A;
            if (iVar == null || (webMessagePortB = iVar.b()) == null) {
                webMessagePortB = null;
            } else {
                e1 e1VarA = c0.a();
                e1VarA.a(f1Var);
                webMessagePortB.postMessage(new WebMessage(e1VarA.toString()));
            }
            if (webMessagePortB == null) {
                new e0.a().a("Sending message before event messaging is initialized").a(e0.g);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final String getClickOverride() {
        AdColonyInterstitial interstitial = getInterstitial();
        String strC = interstitial == null ? null : interstitial.c();
        if (strC != null) {
            return strC;
        }
        AdColonyAdView adView = getAdView();
        if (adView == null) {
            return null;
        }
        return adView.getClickOverride();
    }

    private final a m() {
        return new b();
    }

    private final void o() {
        String string = "";
        synchronized (this.x) {
            try {
                if (this.y.b() > 0) {
                    string = getEnableMessages() ? this.y.toString() : "";
                    this.y = c0.a();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        z0.b(new o(string));
    }

    @Override // com.adcolony.sdk.k0
    public int getAdcModuleId() {
        return getAdc3ModuleId();
    }

    public final /* synthetic */ boolean getEnableMessages() {
        return this.f9063B;
    }

    public final /* synthetic */ f1 getIab() {
        return this.C;
    }

    @Override // 
    /* JADX INFO: renamed from: getModuleId, reason: merged with bridge method [inline-methods] */
    public int getAdc3ModuleId() {
        return getWebViewModuleId();
    }

    public final /* synthetic */ boolean getModuleInitialized() {
        return this.D;
    }

    @Override // com.adcolony.sdk.b1
    public /* synthetic */ WebViewClient getWebViewClientApi21() {
        return new d();
    }

    @Override // com.adcolony.sdk.b1
    public /* synthetic */ WebViewClient getWebViewClientApi23() {
        return new e();
    }

    @Override // com.adcolony.sdk.b1
    public /* synthetic */ WebViewClient getWebViewClientApi24() {
        return new f();
    }

    @Override // com.adcolony.sdk.b1
    public /* synthetic */ WebViewClient getWebViewClientApi26() {
        return new g();
    }

    @Override // com.adcolony.sdk.b1
    public /* synthetic */ WebViewClient getWebViewClientDefault() {
        return new c();
    }

    @Override // com.adcolony.sdk.b1
    public /* synthetic */ void i() {
        addJavascriptInterface(m(), "NativeLayer");
        com.adcolony.sdk.a.b().r().a(this);
        super.i();
    }

    public final /* synthetic */ boolean n() {
        return this.f9064E;
    }

    public final /* synthetic */ void setEnableMessages(boolean z2) {
        this.f9063B = z2;
    }

    public final /* synthetic */ void setIab(f1 f1Var) {
        this.C = f1Var;
    }

    public /* synthetic */ String d(f1 f1Var) {
        return Intrinsics.k(c(f1Var), "file:///");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void d(String str) {
        if (this.f9062A == null) {
            i iVar = new i(createWebMessageChannel());
            WebMessagePort webMessagePortB = iVar.b();
            if (webMessagePortB != null) {
                webMessagePortB.setWebMessageCallback(new m());
            }
            postWebMessage(new WebMessage("", new WebMessagePort[]{iVar.a()}), Uri.parse(str));
            this.f9062A = iVar;
        }
    }

    @Override // com.adcolony.sdk.k0
    public void b() {
        if (!com.adcolony.sdk.a.c() || !this.D || this.v || this.f9065w) {
            return;
        }
        o();
    }

    public /* synthetic */ String c(f1 f1Var) {
        return c0.h(f1Var, "filepath");
    }

    @Override // com.adcolony.sdk.b1
    public /* synthetic */ void a(h0 h0Var, int i2, com.adcolony.sdk.c cVar) {
        f1 f1VarA = h0Var.a();
        this.f9063B = c0.b(f1VarA, "enable_messages");
        if (this.C.b()) {
            this.C = c0.f(f1VarA, "iab");
        }
        super.a(h0Var, i2, cVar);
    }

    @Override // com.adcolony.sdk.k0
    public void c() {
        if (getDestroyed()) {
            return;
        }
        l();
        z0.b(new n());
    }

    public final class l {
        public l() {
        }

        public final void a() {
            if (!c1.this.getEnableMessages() || c1.this.getModuleInitialized()) {
                return;
            }
            c1.this.f9066z = z0.a();
            f1 f1VarA = c0.a(c0.b(), c1.this.getInfo());
            c0.a(f1VarA, "message_key", c1.this.f9066z);
            c1.this.a("ADC3_init(" + c1.this.getAdcModuleId() + AbstractJsonLexerKt.COMMA + f1VarA + ");");
            c1.this.D = true;
        }

        public final void b() {
            c1.this.D = false;
        }

        public final boolean a(String str) {
            if (!c1.this.getModuleInitialized()) {
                return false;
            }
            String clickOverride = c1.this.getClickOverride();
            if (clickOverride != null) {
                str = clickOverride;
            }
            if (str != null) {
                z0.a(new Intent("android.intent.action.VIEW", Uri.parse(str)));
                f1 f1VarB = c0.b();
                c1 c1Var = c1.this;
                c0.a(f1VarB, "url", str);
                c0.a(f1VarB, "ad_session_id", c1Var.getAdSessionId());
                com.adcolony.sdk.c parentContainer = c1.this.getParentContainer();
                new h0("WebView.redirect_detected", parentContainer != null ? parentContainer.k() : 0, f1VarB).c();
                x0 x0VarA = com.adcolony.sdk.a.b().A();
                c1 c1Var2 = c1.this;
                x0VarA.a(c1Var2.getAdSessionId());
                x0VarA.c(c1Var2.getAdSessionId());
                return true;
            }
            new e0.a().a(Intrinsics.k(c1.this.h(), "shouldOverrideUrlLoading called with null request url, with ad id: ")).a(e0.f9132i);
            return true;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void b(String str) {
        b(c0.b(str));
    }

    private final void b(f1 f1Var) {
        com.adcolony.sdk.a.b().r().c(f1Var);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void c(String str) {
        for (f1 f1Var : c0.a(str).c()) {
            b(f1Var);
        }
    }

    public /* synthetic */ void b(Exception exc) {
        new e0.a().a(exc.getClass().toString()).a(" during metadata injection w/ metadata = ").a(c0.h(getInfo(), TtmlNode.TAG_METADATA)).a(e0.f9132i);
    }

    @Override // com.adcolony.sdk.k0
    public void a(f1 f1Var) {
        synchronized (this.x) {
            try {
                if (this.f9065w) {
                    e(f1Var);
                } else {
                    this.y.a(f1Var);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // com.adcolony.sdk.k0
    public boolean a() {
        return (this.v || this.f9065w) ? false : true;
    }

    public final /* synthetic */ String a(String str, String str2) {
        p0 p0VarE;
        if (!this.C.b()) {
            AdColonyInterstitial interstitial = getInterstitial();
            p0 p0Var = null;
            if (interstitial == null || Intrinsics.a(c0.h(getIab(), "ad_type"), "video")) {
                p0VarE = null;
            } else {
                interstitial.a(getIab());
                p0VarE = interstitial.e();
            }
            if (p0VarE == null) {
                AdColonyAdViewListener adColonyAdViewListener = com.adcolony.sdk.a.b().c().e().get(getAdSessionId());
                if (adColonyAdViewListener != null) {
                    adColonyAdViewListener.a(new p0(getIab(), getAdSessionId()));
                    p0Var = adColonyAdViewListener.f8908c;
                }
            } else {
                p0Var = p0VarE;
            }
            if (p0Var != null && p0Var.d() == 2) {
                this.f9064E = true;
                if (str2.length() > 0) {
                    try {
                        return ScriptInjector.injectScriptContentIntoHtml(com.adcolony.sdk.a.b().p().a(str2, false).toString(), str);
                    } catch (IOException e2) {
                        b(e2);
                    }
                }
            }
        }
        return str;
    }
}
