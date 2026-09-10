package com.adcolony.sdk;

import android.content.Context;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public class j extends c1 {

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    public static final f f9186F = new f(null);

    public class a extends c1.c {
        public a() {
            super();
        }

        @Override // com.adcolony.sdk.c1.c, com.adcolony.sdk.b1.b, android.webkit.WebViewClient
        public void onPageFinished(WebView webView, String str) {
            super.onPageFinished(webView, str);
            j.this.new g().a();
        }
    }

    public class b extends c1.d {
        public b() {
            super();
        }

        @Override // com.adcolony.sdk.c1.d, com.adcolony.sdk.b1.b, android.webkit.WebViewClient
        public void onPageFinished(WebView webView, String str) {
            super.onPageFinished(webView, str);
            j.this.new g().a();
        }
    }

    public class c extends c1.e {
        public c() {
            super();
        }

        @Override // com.adcolony.sdk.c1.e, com.adcolony.sdk.b1.b, android.webkit.WebViewClient
        public void onPageFinished(WebView webView, String str) {
            super.onPageFinished(webView, str);
            j.this.new g().a();
        }
    }

    public class d extends c1.f {
        public d() {
            super();
        }

        @Override // com.adcolony.sdk.c1.f, com.adcolony.sdk.b1.b, android.webkit.WebViewClient
        public void onPageFinished(WebView webView, String str) {
            super.onPageFinished(webView, str);
            j.this.new g().a();
        }
    }

    public class e extends c1.g {
        public e() {
            super();
        }

        @Override // com.adcolony.sdk.c1.g, com.adcolony.sdk.b1.b, android.webkit.WebViewClient
        public void onPageFinished(WebView webView, String str) {
            super.onPageFinished(webView, str);
            j.this.new g().a();
        }
    }

    public static final class f {
        public /* synthetic */ f(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @JvmStatic
        public final j a(Context context, h0 h0Var) {
            int iE = com.adcolony.sdk.a.b().r().e();
            j eVar = Intrinsics.a(c0.h(h0Var.a(), "type"), "aurora") ? new com.adcolony.sdk.e(context, iE, h0Var) : new j(context, iE, h0Var);
            eVar.i();
            return eVar;
        }

        private f() {
        }
    }

    public final class g {
        public g() {
        }

        public final void a() {
            h0 h0VarA;
            if (j.this instanceof l) {
                return;
            }
            f1 f1VarB = c0.b();
            j jVar = j.this;
            c0.b(f1VarB, "success", true);
            c0.b(f1VarB, "id", jVar.getAdc3ModuleId());
            h0 message = j.this.getMessage();
            if (message == null || (h0VarA = message.a(f1VarB)) == null) {
                return;
            }
            h0VarA.c();
        }
    }

    public j(Context context, int i2, h0 h0Var) {
        super(context, i2, h0Var);
    }

    @JvmStatic
    public static final j a(Context context, h0 h0Var) {
        return f9186F.a(context, h0Var);
    }

    @Override // com.adcolony.sdk.c1, com.adcolony.sdk.b1
    public /* synthetic */ WebViewClient getWebViewClientApi21() {
        return new b();
    }

    @Override // com.adcolony.sdk.c1, com.adcolony.sdk.b1
    public /* synthetic */ WebViewClient getWebViewClientApi23() {
        return new c();
    }

    @Override // com.adcolony.sdk.c1, com.adcolony.sdk.b1
    public /* synthetic */ WebViewClient getWebViewClientApi24() {
        return new d();
    }

    @Override // com.adcolony.sdk.c1, com.adcolony.sdk.b1
    public /* synthetic */ WebViewClient getWebViewClientApi26() {
        return new e();
    }

    @Override // com.adcolony.sdk.c1, com.adcolony.sdk.b1
    public /* synthetic */ WebViewClient getWebViewClientDefault() {
        return new a();
    }

    @Override // com.adcolony.sdk.c1, com.adcolony.sdk.b1
    public /* synthetic */ void i() {
        h0 message = getMessage();
        f1 f1VarA = message == null ? null : message.a();
        if (f1VarA == null) {
            f1VarA = c0.b();
        }
        setMraidFilepath(c0.h(f1VarA, "mraid_filepath"));
        setBaseUrl(c0.h(f1VarA, "base_url"));
        setIab(c0.f(f1VarA, "iab"));
        setInfo(c0.f(f1VarA, "info"));
        setAdSessionId(c0.h(f1VarA, "ad_session_id"));
        setMUrl(d(f1VarA));
        super.i();
    }

    @Override // com.adcolony.sdk.b1
    public /* synthetic */ void setBounds(h0 h0Var) {
        super.setBounds(h0Var);
        f1 f1VarB = c0.b();
        c0.b(f1VarB, "success", true);
        c0.b(f1VarB, "id", getAdc3ModuleId());
        h0Var.a(f1VarB).c();
    }

    @Override // com.adcolony.sdk.b1
    public /* synthetic */ void setVisible(h0 h0Var) {
        super.setVisible(h0Var);
        f1 f1VarB = c0.b();
        c0.b(f1VarB, "success", true);
        c0.b(f1VarB, "id", getAdc3ModuleId());
        h0Var.a(f1VarB).c();
    }
}
