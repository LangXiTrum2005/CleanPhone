package com.adcolony.sdk;

import android.content.Context;
import android.graphics.Rect;
import android.net.Uri;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.iab.omid.library.adcolony.adsession.FriendlyObstructionPurpose;
import java.io.File;

/* JADX INFO: loaded from: classes.dex */
public class AdColonyAdView extends FrameLayout {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private com.adcolony.sdk.c f8894a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private AdColonyAdViewListener f8895b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private AdColonyAdSize f8896c;
    private String d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private String f8897e;
    private String f;
    private String g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private ImageView f8898h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private p0 f8899i;
    private h0 j;
    private boolean k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private boolean f8900l;
    private boolean m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private boolean f8901n;
    private boolean o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private boolean f8902p;
    private int q;
    private int r;
    private int s;
    private int t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private int f8903u;
    private c v;

    public class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            Context contextA = com.adcolony.sdk.a.a();
            if (contextA instanceof AdColonyAdViewActivity) {
                ((AdColonyAdViewActivity) contextA).b();
            }
            d dVarC = com.adcolony.sdk.a.b().c();
            dVarC.a(AdColonyAdView.this.d);
            dVarC.a(AdColonyAdView.this.f8894a);
            f1 f1VarB = c0.b();
            c0.a(f1VarB, "id", AdColonyAdView.this.d);
            new h0("AdSession.on_ad_view_destroyed", 1, f1VarB).c();
            if (AdColonyAdView.this.v != null) {
                AdColonyAdView.this.v.a();
            }
        }
    }

    public class b implements View.OnClickListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Context f8905a;

        public b(AdColonyAdView adColonyAdView, Context context) {
            this.f8905a = context;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            Context context = this.f8905a;
            if (context instanceof AdColonyAdViewActivity) {
                ((AdColonyAdViewActivity) context).b();
            }
        }
    }

    public interface c {
        void a();
    }

    public AdColonyAdView(Context context, h0 h0Var, AdColonyAdViewListener adColonyAdViewListener) throws RuntimeException {
        super(context);
        this.f8902p = true;
        this.f8895b = adColonyAdViewListener;
        this.f8897e = adColonyAdViewListener.c();
        f1 f1VarA = h0Var.a();
        this.d = c0.h(f1VarA, "id");
        this.f = c0.h(f1VarA, "close_button_filepath");
        this.k = c0.b(f1VarA, "trusted_demand_source");
        this.o = c0.b(f1VarA, "close_button_snap_to_webview");
        this.t = c0.d(f1VarA, "close_button_width");
        this.f8903u = c0.d(f1VarA, "close_button_height");
        com.adcolony.sdk.c cVar = com.adcolony.sdk.a.b().c().c().get(this.d);
        this.f8894a = cVar;
        if (cVar == null) {
            throw new RuntimeException("AdColonyAdView container cannot be null");
        }
        this.f8896c = adColonyAdViewListener.a();
        setLayoutParams(new FrameLayout.LayoutParams(this.f8894a.d(), this.f8894a.b()));
        setBackgroundColor(0);
        addView(this.f8894a);
    }

    public boolean d() {
        return this.f8900l;
    }

    public boolean destroy() {
        if (this.f8900l) {
            new e0.a().a("Ignoring duplicate call to destroy().").a(e0.f);
            return false;
        }
        this.f8900l = true;
        p0 p0Var = this.f8899i;
        if (p0Var != null && p0Var.c() != null) {
            this.f8899i.b();
        }
        z0.b(new a());
        return true;
    }

    public void e() {
        b1 webView = getWebView();
        if (this.f8899i == null || webView == null) {
            return;
        }
        webView.f();
    }

    public AdColonyAdSize getAdSize() {
        return this.f8896c;
    }

    public String getClickOverride() {
        return this.g;
    }

    public com.adcolony.sdk.c getContainer() {
        return this.f8894a;
    }

    public AdColonyAdViewListener getListener() {
        return this.f8895b;
    }

    public p0 getOmidManager() {
        return this.f8899i;
    }

    public int getOrientation() {
        return this.q;
    }

    public boolean getTrustedDemandSource() {
        return this.k;
    }

    public b1 getWebView() {
        com.adcolony.sdk.c cVar = this.f8894a;
        if (cVar == null) {
            return null;
        }
        return cVar.n().get(2);
    }

    public String getZoneId() {
        return this.f8897e;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (!this.f8902p || this.f8900l) {
            return;
        }
        this.f8902p = false;
        AdColonyAdViewListener adColonyAdViewListener = this.f8895b;
        if (adColonyAdViewListener != null) {
            adColonyAdViewListener.onShow(this);
        }
    }

    public void setClickOverride(String str) {
        this.g = str;
    }

    public void setExpandMessage(h0 h0Var) {
        this.j = h0Var;
    }

    public void setExpandedHeight(int i2) {
        this.s = (int) (i2 * com.adcolony.sdk.a.b().n().s());
    }

    public void setExpandedWidth(int i2) {
        this.r = (int) (i2 * com.adcolony.sdk.a.b().n().s());
    }

    public void setListener(AdColonyAdViewListener adColonyAdViewListener) {
        this.f8895b = adColonyAdViewListener;
    }

    public void setNoCloseButton(boolean z2) {
        this.m = this.k && z2;
    }

    public void setOmidManager(p0 p0Var) {
        this.f8899i = p0Var;
    }

    public void setOnDestroyListenerOrCall(c cVar) {
        if (this.f8900l) {
            cVar.a();
        } else {
            this.v = cVar;
        }
    }

    public void setOrientation(int i2) {
        this.q = i2;
    }

    public void setUserInteraction(boolean z2) {
        this.f8901n = z2;
    }

    public void a() {
        if (this.k || this.f8901n) {
            float fS = com.adcolony.sdk.a.b().n().s();
            this.f8894a.setLayoutParams(new FrameLayout.LayoutParams((int) (this.f8896c.getWidth() * fS), (int) (this.f8896c.getHeight() * fS)));
            b1 webView = getWebView();
            if (webView != null) {
                h0 h0Var = new h0("WebView.set_bounds", 0);
                f1 f1VarB = c0.b();
                c0.b(f1VarB, "x", webView.getInitialX());
                c0.b(f1VarB, "y", webView.getInitialY());
                c0.b(f1VarB, "width", webView.getInitialWidth());
                c0.b(f1VarB, "height", webView.getInitialHeight());
                h0Var.b(f1VarB);
                webView.a(h0Var);
                f1 f1VarB2 = c0.b();
                c0.a(f1VarB2, "ad_session_id", this.d);
                new h0("MRAID.on_close", this.f8894a.k(), f1VarB2).c();
            }
            ImageView imageView = this.f8898h;
            if (imageView != null) {
                this.f8894a.removeView(imageView);
                this.f8894a.a(this.f8898h);
            }
            addView(this.f8894a);
            AdColonyAdViewListener adColonyAdViewListener = this.f8895b;
            if (adColonyAdViewListener != null) {
                adColonyAdViewListener.onClosed(this);
            }
        }
    }

    public boolean b() {
        int iWidth;
        if (!this.k && !this.f8901n) {
            if (this.j != null) {
                f1 f1VarB = c0.b();
                c0.b(f1VarB, "success", false);
                this.j.a(f1VarB).c();
                this.j = null;
            }
            return false;
        }
        q qVarN = com.adcolony.sdk.a.b().n();
        Rect rectW = qVarN.w();
        int iWidth2 = this.r;
        if (iWidth2 <= 0) {
            iWidth2 = rectW.width();
        }
        int iHeight = this.s;
        if (iHeight <= 0) {
            iHeight = rectW.height();
        }
        int iWidth3 = (rectW.width() - iWidth2) / 2;
        int iHeight2 = (rectW.height() - iHeight) / 2;
        this.f8894a.setLayoutParams(new FrameLayout.LayoutParams(rectW.width(), rectW.height()));
        b1 webView = getWebView();
        if (webView != null) {
            h0 h0Var = new h0("WebView.set_bounds", 0);
            f1 f1VarB2 = c0.b();
            c0.b(f1VarB2, "x", iWidth3);
            c0.b(f1VarB2, "y", iHeight2);
            c0.b(f1VarB2, "width", iWidth2);
            c0.b(f1VarB2, "height", iHeight);
            h0Var.b(f1VarB2);
            webView.a(h0Var);
            float fS = qVarN.s();
            f1 f1VarB3 = c0.b();
            c0.b(f1VarB3, "app_orientation", z0.d(z0.f()));
            c0.b(f1VarB3, "width", (int) (iWidth2 / fS));
            c0.b(f1VarB3, "height", (int) (iHeight / fS));
            c0.b(f1VarB3, "x", z0.a(webView));
            c0.b(f1VarB3, "y", z0.b(webView));
            c0.a(f1VarB3, "ad_session_id", this.d);
            new h0("MRAID.on_size_change", this.f8894a.k(), f1VarB3).c();
        }
        ImageView imageView = this.f8898h;
        if (imageView != null) {
            this.f8894a.removeView(imageView);
        }
        Context contextA = com.adcolony.sdk.a.a();
        if (contextA != null && !this.m && webView != null) {
            float fS2 = com.adcolony.sdk.a.b().n().s();
            int i2 = (int) (this.t * fS2);
            int i3 = (int) (this.f8903u * fS2);
            if (this.o) {
                iWidth = webView.getCurrentWidth() + webView.getCurrentX();
            } else {
                iWidth = rectW.width();
            }
            int currentY = this.o ? webView.getCurrentY() : 0;
            ImageView imageView2 = new ImageView(contextA.getApplicationContext());
            this.f8898h = imageView2;
            imageView2.setImageURI(Uri.fromFile(new File(this.f)));
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(i2, i3);
            layoutParams.setMargins(iWidth - i2, currentY, 0, 0);
            this.f8898h.setOnClickListener(new b(this, contextA));
            this.f8894a.addView(this.f8898h, layoutParams);
            this.f8894a.a(this.f8898h, FriendlyObstructionPurpose.CLOSE_AD);
        }
        if (this.j != null) {
            f1 f1VarB4 = c0.b();
            c0.b(f1VarB4, "success", true);
            this.j.a(f1VarB4).c();
            this.j = null;
        }
        return true;
    }

    public boolean c() {
        return this.f8901n;
    }
}
