package com.adcolony.sdk;

import android.content.Context;
import android.content.Intent;
import android.graphics.Rect;
import android.graphics.drawable.GradientDrawable;
import android.net.Uri;
import android.view.View;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.AbsoluteLayout;
import android.widget.ImageView;
import com.iab.omid.library.adcolony.adsession.FriendlyObstructionPurpose;
import java.io.File;
import kotlin.text.Regex;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* JADX INFO: loaded from: classes.dex */
public final class l0 extends c1 {

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    private final int f9248F;
    private ImageView G;
    private String H;

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    private String f9249I;

    /* JADX INFO: renamed from: J, reason: collision with root package name */
    private int f9250J;
    private int K;
    private boolean L;
    private boolean M;

    public final class a extends c1.c {
        public a() {
            super();
        }

        @Override // com.adcolony.sdk.c1.c, com.adcolony.sdk.b1.b, android.webkit.WebViewClient
        public void onPageFinished(WebView webView, String str) {
            l0.this.new f().a();
            super.onPageFinished(webView, str);
        }
    }

    public final class b extends c1.d {
        public b() {
            super();
        }

        @Override // com.adcolony.sdk.c1.d, com.adcolony.sdk.b1.b, android.webkit.WebViewClient
        public void onPageFinished(WebView webView, String str) {
            l0.this.new f().a();
            super.onPageFinished(webView, str);
        }
    }

    public final class c extends c1.e {
        public c() {
            super();
        }

        @Override // com.adcolony.sdk.c1.e, com.adcolony.sdk.b1.b, android.webkit.WebViewClient
        public void onPageFinished(WebView webView, String str) {
            l0.this.new f().a();
            super.onPageFinished(webView, str);
        }
    }

    public final class d extends c1.f {
        public d() {
            super();
        }

        @Override // com.adcolony.sdk.c1.f, com.adcolony.sdk.b1.b, android.webkit.WebViewClient
        public void onPageFinished(WebView webView, String str) {
            l0.this.new f().a();
            super.onPageFinished(webView, str);
        }
    }

    public final class e extends c1.g {
        public e() {
            super();
        }

        @Override // com.adcolony.sdk.c1.g, com.adcolony.sdk.b1.b, android.webkit.WebViewClient
        public void onPageFinished(WebView webView, String str) {
            l0.this.new f().a();
            super.onPageFinished(webView, str);
        }
    }

    public final class f {
        public f() {
        }

        public final void a() {
            if (l0.this.getModuleInitialized()) {
                return;
            }
            float fS = com.adcolony.sdk.a.b().n().s();
            f1 info = l0.this.getInfo();
            l0 l0Var = l0.this;
            c0.b(info, "app_orientation", z0.d(z0.f()));
            c0.b(info, "x", z0.a(l0Var));
            c0.b(info, "y", z0.b(l0Var));
            c0.b(info, "width", (int) (l0Var.getCurrentWidth() / fS));
            c0.b(info, "height", (int) (l0Var.getCurrentHeight() / fS));
            c0.a(info, "ad_session_id", l0Var.getAdSessionId());
        }
    }

    public static final class g implements View.OnClickListener {
        public g() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            z0.a(new Intent("android.intent.action.VIEW", Uri.parse(l0.this.f9249I)));
            com.adcolony.sdk.a.b().A().c(l0.this.getAdSessionId());
        }
    }

    public l0(Context context, int i2, h0 h0Var, int i3) {
        super(context, i2, h0Var);
        this.f9248F = i3;
        this.H = "";
        this.f9249I = "";
    }

    private final void q() {
        Context contextA = com.adcolony.sdk.a.a();
        if (contextA == null || getParentContainer() == null || this.M) {
            return;
        }
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setColor(-1);
        gradientDrawable.setShape(1);
        ImageView imageView = new ImageView(contextA);
        imageView.setImageURI(Uri.fromFile(new File(this.H)));
        imageView.setBackground(gradientDrawable);
        imageView.setOnClickListener(new g());
        this.G = imageView;
        r();
        addView(this.G);
    }

    private final void r() {
        int iWidth;
        int iHeight;
        ImageView imageView = this.G;
        if (imageView == null) {
            return;
        }
        Rect rectW = com.adcolony.sdk.a.b().n().w();
        if (this.L) {
            iWidth = getCurrentWidth() + getCurrentX();
        } else {
            iWidth = rectW.width();
        }
        if (this.L) {
            iHeight = getCurrentHeight() + getCurrentY();
        } else {
            iHeight = rectW.height();
        }
        float fS = com.adcolony.sdk.a.b().n().s();
        int i2 = (int) (this.f9250J * fS);
        int i3 = (int) (this.K * fS);
        imageView.setLayoutParams(new AbsoluteLayout.LayoutParams(i2, i3, iWidth - i2, iHeight - i3));
    }

    @Override // com.adcolony.sdk.b1
    public /* synthetic */ void e() {
        super.e();
        if (this.H.length() <= 0 || this.f9249I.length() <= 0) {
            return;
        }
        q();
    }

    @Override // com.adcolony.sdk.c1
    public /* synthetic */ int getAdc3ModuleId() {
        return this.f9248F;
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

    @Override // com.adcolony.sdk.b1
    public /* synthetic */ void k() {
        if (getMraidFilepath().length() > 0) {
            setMUrl(a(new Regex("script\\s*src\\s*=\\s*\"mraid.js\"").e("script src=\"file://" + getMraidFilepath() + AbstractJsonLexerKt.STRING, getMUrl()), c0.h(c0.f(getInfo(), com.smartdigimkt.k6.b.c.d), "iab_filepath")));
        }
    }

    public final void p() {
        com.adcolony.sdk.c parentContainer;
        ImageView imageView = this.G;
        if (imageView == null || (parentContainer = getParentContainer()) == null) {
            return;
        }
        parentContainer.a(imageView, FriendlyObstructionPurpose.OTHER);
    }

    @Override // com.adcolony.sdk.b1
    public /* synthetic */ void setBounds(h0 h0Var) {
        super.setBounds(h0Var);
        r();
    }

    @Override // com.adcolony.sdk.c1, com.adcolony.sdk.b1
    public /* synthetic */ void a(h0 h0Var, int i2, com.adcolony.sdk.c cVar) {
        f1 f1VarA = h0Var.a();
        this.H = c0.h(f1VarA, "ad_choices_filepath");
        this.f9249I = c0.h(f1VarA, "ad_choices_url");
        this.f9250J = c0.d(f1VarA, "ad_choices_width");
        this.K = c0.d(f1VarA, "ad_choices_height");
        this.L = c0.b(f1VarA, "ad_choices_snap_to_webview");
        this.M = c0.b(f1VarA, "disable_ad_choices");
        super.a(h0Var, i2, cVar);
    }

    @Override // com.adcolony.sdk.b1
    public /* synthetic */ boolean a(f1 f1Var, String str) {
        if (super.a(f1Var, str)) {
            return true;
        }
        setEnableMessages(false);
        return true;
    }
}
