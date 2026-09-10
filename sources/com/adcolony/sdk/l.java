package com.adcolony.sdk;

import android.content.Context;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes.dex */
public final class l extends j {
    public static final f G = new f(null);
    public static boolean H;

    public final class a extends j.a {
        public a() {
            super();
        }

        @Override // com.adcolony.sdk.j.a, com.adcolony.sdk.c1.c, com.adcolony.sdk.b1.b, android.webkit.WebViewClient
        public void onPageFinished(WebView webView, String str) {
            l.this.new g().a();
            super.onPageFinished(webView, str);
        }
    }

    public final class b extends j.b {
        public b() {
            super();
        }

        @Override // com.adcolony.sdk.j.b, com.adcolony.sdk.c1.d, com.adcolony.sdk.b1.b, android.webkit.WebViewClient
        public void onPageFinished(WebView webView, String str) {
            l.this.new g().a();
            super.onPageFinished(webView, str);
        }
    }

    public final class c extends j.c {
        public c() {
            super();
        }

        @Override // com.adcolony.sdk.j.c, com.adcolony.sdk.c1.e, com.adcolony.sdk.b1.b, android.webkit.WebViewClient
        public void onPageFinished(WebView webView, String str) {
            l.this.new g().a();
            super.onPageFinished(webView, str);
        }
    }

    public final class d extends j.d {
        public d() {
            super();
        }

        @Override // com.adcolony.sdk.j.d, com.adcolony.sdk.c1.f, com.adcolony.sdk.b1.b, android.webkit.WebViewClient
        public void onPageFinished(WebView webView, String str) {
            l.this.new g().a();
            super.onPageFinished(webView, str);
        }
    }

    public final class e extends j.e {
        public e() {
            super();
        }

        @Override // com.adcolony.sdk.j.e, com.adcolony.sdk.c1.g, com.adcolony.sdk.b1.b, android.webkit.WebViewClient
        public void onPageFinished(WebView webView, String str) {
            l.this.new g().a();
            super.onPageFinished(webView, str);
        }
    }

    public static final class f {
        public /* synthetic */ f(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @JvmStatic
        public final l a(Context context, h0 h0Var) {
            l lVar = new l(context, h0Var, null);
            lVar.i();
            return lVar;
        }

        private f() {
        }
    }

    public final class g {
        public g() {
        }

        public final void a() {
            if (l.this.getModuleInitialized()) {
                return;
            }
            e1 e1Var = new e1();
            for (AdColonyInterstitial adColonyInterstitial : com.adcolony.sdk.a.b().c().g()) {
                f1 f1Var = new f1();
                c0.a(f1Var, "ad_session_id", adColonyInterstitial.b());
                c0.a(f1Var, "ad_id", adColonyInterstitial.a());
                c0.a(f1Var, "zone_id", adColonyInterstitial.getZoneID());
                c0.a(f1Var, "ad_request_id", adColonyInterstitial.g());
                e1Var.a(f1Var);
            }
            c0.a(l.this.getInfo(), "ads_to_restore", e1Var);
        }
    }

    public /* synthetic */ l(Context context, h0 h0Var, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, h0Var);
    }

    @JvmStatic
    public static final l b(Context context, h0 h0Var) {
        return G.a(context, h0Var);
    }

    @Override // com.adcolony.sdk.b1
    public /* synthetic */ boolean a(f1 f1Var, String str) {
        if (super.a(f1Var, str)) {
            return true;
        }
        new e0.a().a("Unable to communicate with controller, disabling AdColony.").a(e0.f9131h);
        AdColony.disable();
        return true;
    }

    @Override // com.adcolony.sdk.c1
    public /* synthetic */ String c(f1 f1Var) {
        return H ? "android_asset/ADCController.js" : super.c(f1Var);
    }

    @Override // com.adcolony.sdk.j, com.adcolony.sdk.c1, com.adcolony.sdk.b1
    public /* synthetic */ WebViewClient getWebViewClientApi21() {
        return new b();
    }

    @Override // com.adcolony.sdk.j, com.adcolony.sdk.c1, com.adcolony.sdk.b1
    public /* synthetic */ WebViewClient getWebViewClientApi23() {
        return new c();
    }

    @Override // com.adcolony.sdk.j, com.adcolony.sdk.c1, com.adcolony.sdk.b1
    public /* synthetic */ WebViewClient getWebViewClientApi24() {
        return new d();
    }

    @Override // com.adcolony.sdk.j, com.adcolony.sdk.c1, com.adcolony.sdk.b1
    public /* synthetic */ WebViewClient getWebViewClientApi26() {
        return new e();
    }

    @Override // com.adcolony.sdk.j, com.adcolony.sdk.c1, com.adcolony.sdk.b1
    public /* synthetic */ WebViewClient getWebViewClientDefault() {
        return new a();
    }

    private l(Context context, h0 h0Var) {
        super(context, 1, h0Var);
    }
}
