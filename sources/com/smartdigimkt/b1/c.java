package com.smartdigimkt.b1;

import android.content.Context;
import android.graphics.Bitmap;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.text.TextUtils;
import android.util.Base64;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import com.mbridge.msdk.interstitial.view.MBInterstitialActivity;
import com.p004ironsource.d9;
import com.smartdigimkt.expressad.atsignalcommon.bridge.CommonJSBridgeImpUtils;
import com.smartdigimkt.expressad.atsignalcommon.windvane.BaseAbsFeedBackForH5;
import com.smartdigimkt.expressad.mbbanner.view.ATBannerWebView;
import com.smartdigimkt.expressad.out.TemplateBannerView;
import com.smartdigimkt.expressad.widget.ATAdChoice;
import com.smartdigimkt.f1.q;
import com.smartdigimkt.v0.a0;
import com.smartdigimkt.v0.p;
import com.smartdigimkt.v0.u;
import com.smartdigimkt.v0.v;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes5.dex */
public class c {

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    private static final String f33865F = "BannerShowManager";

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    private float f33866A;
    com.smartdigimkt.f1.i D;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private com.smartdigimkt.a1.c f33869a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private boolean f33870b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private com.smartdigimkt.x.d f33871c;
    private final TemplateBannerView d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private ImageView f33872e;
    private ATBannerWebView f;
    private ImageView g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private ImageView f33873h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private boolean f33874i;
    private boolean j;
    private boolean k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private boolean f33875l;
    private boolean m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private boolean f33876n;
    private boolean o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private final String f33877p;
    private final String q;
    com.smartdigimkt.o.a r;
    private List<com.smartdigimkt.x.d> s;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private int f33878u;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private com.smartdigimkt.y0.c f33879w;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private float f33880z;
    private int t = 1;
    private final long v = MBInterstitialActivity.WEB_LOAD_TIME;
    private final Handler x = new d(Looper.getMainLooper());
    private final com.smartdigimkt.s0.a y = new e();

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    private final View.OnClickListener f33867B = new f();
    private com.smartdigimkt.a1.a C = new g();

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    private com.smartdigimkt.k.b f33868E = new b();

    public class a implements q.e {
        public a() {
        }

        @Override // com.smartdigimkt.f1.q.c
        public void a(int i2) {
        }

        @Override // com.smartdigimkt.f1.q.c
        public void b(com.smartdigimkt.f1.k kVar) {
        }

        @Override // com.smartdigimkt.f1.q.c
        public void c(com.smartdigimkt.f1.k kVar) {
        }

        @Override // com.smartdigimkt.f1.q.c
        public void d(com.smartdigimkt.f1.k kVar) {
        }

        @Override // com.smartdigimkt.f1.q.c
        public void onFinishRedirection(com.smartdigimkt.f1.k kVar, String str) {
            if (kVar == null) {
                return;
            }
            u.a(kVar, c.this.d);
        }

        @Override // com.smartdigimkt.f1.q.e
        public void onLeaveApp() {
            if (c.this.f33869a != null) {
                c.this.f33869a.onLeaveApp();
            }
        }

        @Override // com.smartdigimkt.f1.q.c
        public void onRedirectionFailed(com.smartdigimkt.f1.k kVar, String str) {
            if (kVar == null) {
                return;
            }
            u.a(kVar, c.this.d);
        }

        @Override // com.smartdigimkt.f1.q.c
        public void a(com.smartdigimkt.f1.k kVar) {
        }

        @Override // com.smartdigimkt.f1.q.c
        public boolean c() {
            return false;
        }

        @Override // com.smartdigimkt.f1.q.c
        public void a(com.smartdigimkt.x.d dVar, String str) {
            u.b(dVar, c.this.d);
        }
    }

    public class b extends com.smartdigimkt.k.b {
        public b() {
        }

        @Override // com.smartdigimkt.k.b, com.smartdigimkt.u4.c
        public void onPageFinished(WebView webView, String str) {
            c.this.k = true;
            com.smartdigimkt.y0.a.b(webView);
            c.this.m = true;
            if (c.this.f33871c == null || c.this.f33871c.I2()) {
                return;
            }
            c.this.l();
            c.this.a("", 1);
        }

        @Override // com.smartdigimkt.k.b, com.smartdigimkt.u4.c
        public void onReceivedError(WebView webView, int i2, String str, String str2) {
            c.this.a(str);
            c.this.a(str, 2);
        }

        @Override // com.smartdigimkt.k.b, com.smartdigimkt.u4.c
        public void onRenderProcessGone(WebView webView) {
            c.this.g();
        }
    }

    public class d extends Handler {
        public d(Looper looper) {
            super(looper);
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            super.handleMessage(message);
            int i2 = message.what;
        }
    }

    public class e extends com.smartdigimkt.s0.a {
        public e() {
        }

        @Override // com.smartdigimkt.s0.a
        public void a(boolean z2) {
        }

        @Override // com.smartdigimkt.s0.a
        public void c() {
        }

        @Override // com.smartdigimkt.s0.a
        public void f() {
            c.this.a(com.smartdigimkt.x0.a.f39862n);
        }
    }

    public class f implements View.OnClickListener {
        public f() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (c.this.o) {
                c.this.b();
            }
        }
    }

    public class g implements com.smartdigimkt.a1.a {
        public g() {
        }

        @Override // com.smartdigimkt.a1.a
        public void a(com.smartdigimkt.x.d dVar) {
            c.this.a(dVar, false, "");
        }

        @Override // com.smartdigimkt.a1.a
        public void close() {
            c.this.b();
        }

        @Override // com.smartdigimkt.a1.a
        public void readyStatus(int i2) {
            if (i2 != 1) {
                c.this.g();
            } else {
                c.this.l();
                c.this.a("", 1);
            }
        }

        @Override // com.smartdigimkt.a1.a
        public void toggleCloseBtn(int i2) {
            if (i2 == 2) {
                c.this.e();
            } else {
                c.this.j();
            }
        }

        @Override // com.smartdigimkt.a1.a
        public void triggerCloseBtn(String str) {
            c.this.b();
        }

        @Override // com.smartdigimkt.a1.a
        public void a(boolean z2) {
            if (c.this.f33869a != null) {
                c.this.f33876n = z2;
                if (z2) {
                    c.this.f33869a.showFullScreen();
                } else {
                    c.this.f33869a.closeFullScreen();
                }
            }
        }

        @Override // com.smartdigimkt.a1.a
        public void a(boolean z2, String str) {
            try {
                if (c.this.f33869a != null) {
                    if (TextUtils.isEmpty(str)) {
                        c.this.f33869a.onClick(c.this.f33871c);
                        c.this.f33869a.onLeaveApp();
                    } else {
                        com.smartdigimkt.x.d dVarB = com.smartdigimkt.x.d.b(com.smartdigimkt.x.d.b(c.this.f33871c));
                        dVarB.H(str);
                        c.this.a(dVarB, z2, str);
                    }
                }
            } catch (Exception e2) {
                e2.getMessage();
            }
        }
    }

    public class h implements Runnable {
        public h() {
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                if (c.this.f != null) {
                    String str = c.this.t == 2 ? "false" : com.p004ironsource.mediationsdk.metadata.a.g;
                    c.this.f.evaluateJavascript("(function() {\n    var videos = document.getElementsByTagName('video');\n    for (var i = 0; i < videos.length; i++) {\n    videos[i].muted = " + str + ";\n    }\n    var audios = document.getElementsByTagName('audio');\n    for (var i = 0; i < audios.length; i++) {\n    audios[i].muted = " + str + ";\n    }\n    })()", null);
                }
            } catch (Throwable unused) {
            }
        }
    }

    public class i implements View.OnTouchListener {
        public i() {
        }

        @Override // android.view.View.OnTouchListener
        public boolean onTouch(View view, MotionEvent motionEvent) {
            c.this.f33880z = motionEvent.getRawX();
            c.this.f33866A = motionEvent.getRawY();
            float unused = c.this.f33880z;
            float unused2 = c.this.f33866A;
            return false;
        }
    }

    public class j implements View.OnClickListener {
        public j() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            c.this.a(com.smartdigimkt.c1.b.a(CommonJSBridgeImpUtils.buildClickJsonObject(c.this.f33880z, c.this.f33866A), c.this.f33871c), false, "");
        }
    }

    public class l implements Runnable {
        public l() {
        }

        @Override // java.lang.Runnable
        public void run() {
            c.this.l();
        }
    }

    public c(TemplateBannerView templateBannerView, com.smartdigimkt.a1.c cVar, String str, String str2, boolean z2, com.smartdigimkt.n1.c cVar2) {
        this.f33870b = z2;
        this.d = templateBannerView;
        this.f33877p = str2;
        this.q = str;
        this.f33869a = new com.smartdigimkt.a1.e(cVar, cVar2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(String str, int i2) {
    }

    private synchronized boolean d() {
        boolean zM2;
        zM2 = this.f33871c.M2();
        if (!zM2) {
            this.f33871c.m(true);
        }
        return zM2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void e() {
        ImageView imageView;
        if (this.f33870b && (imageView = this.g) != null && imageView.getVisibility() == 0) {
            this.g.setVisibility(8);
            this.g.setOnClickListener(null);
            if (this.d == null || this.g.getParent() == null) {
                return;
            }
            this.d.removeView(this.g);
        }
    }

    private void f() {
        if (this.f33870b && this.g == null) {
            ImageView imageView = new ImageView(com.smartdigimkt.m6.b.p().k());
            this.g = imageView;
            imageView.setBackgroundResource(com.smartdigimkt.v0.k.a(com.smartdigimkt.m6.b.p().k(), "sdm_banner_close", com.smartdigimkt.v0.k.d));
            this.g.setVisibility(8);
            this.g.setContentDescription("closeButton");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void g() {
        if (this.d == null) {
            a(com.smartdigimkt.x0.a.f39860i);
            return;
        }
        ATBannerWebView aTBannerWebView = this.f;
        if (aTBannerWebView != null && aTBannerWebView.getParent() != null) {
            this.d.removeView(this.f);
        }
        if (this.f33872e == null) {
            ImageView imageView = new ImageView(com.smartdigimkt.m6.b.p().k());
            this.f33872e = imageView;
            imageView.setOnTouchListener(new i());
            this.f33872e.setOnClickListener(new j());
        }
        String strK = this.f33871c.k();
        if (TextUtils.isEmpty(strK)) {
            a(com.smartdigimkt.x0.a.f39859h);
        } else {
            com.smartdigimkt.f0.b.a(com.smartdigimkt.m6.b.p().k()).a(strK, new k());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void i() {
        if (this.d == null) {
            return;
        }
        com.smartdigimkt.x.d dVar = this.f33871c;
        if (dVar == null || dVar.E1() == 1) {
            ATAdChoice aTAdChoice = new ATAdChoice(com.smartdigimkt.m6.b.p().k());
            aTAdChoice.setCampaign(this.f33871c);
            RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(v.a(com.smartdigimkt.m6.b.p().k(), 6.0f), v.a(com.smartdigimkt.m6.b.p().k(), 6.0f));
            layoutParams.addRule(11);
            layoutParams.addRule(12);
            this.d.addView(aTAdChoice, layoutParams);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void j() {
        ImageView imageView;
        if (!this.f33870b || (imageView = this.g) == null) {
            return;
        }
        if (imageView.getVisibility() != 0) {
            this.g.setVisibility(0);
            this.g.setOnClickListener(this.f33867B);
        }
        if (this.g.getParent() != null || this.d == null) {
            return;
        }
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(v.a(com.smartdigimkt.m6.b.p().k(), 12.0f), v.a(com.smartdigimkt.m6.b.p().k(), 12.0f));
        layoutParams.addRule(11);
        layoutParams.addRule(10);
        this.d.addView(this.g, layoutParams);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void k() {
        if (this.f33872e != null) {
            ATBannerWebView aTBannerWebView = this.f;
            if (aTBannerWebView != null) {
                aTBannerWebView.setVisibility(8);
            }
            if (this.f33872e.getVisibility() != 0) {
                this.f33872e.setVisibility(0);
            }
            if (this.d != null) {
                RelativeLayout.LayoutParams layoutParamsF = androidx.media3.extractor.text.ttml.a.f(-1, -1, 10);
                this.f33872e.setScaleType(ImageView.ScaleType.FIT_XY);
                if (this.f33872e.getParent() == null) {
                    this.d.addView(this.f33872e, layoutParamsF);
                }
                a(true);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void l() {
        TemplateBannerView templateBannerView;
        if (this.k && !this.f33875l && this.f33869a != null) {
            this.f33875l = true;
            this.x.removeCallbacks(this.y);
            com.smartdigimkt.x.d dVar = this.f33871c;
            if (dVar != null && !dVar.F2()) {
                this.f33871c.c(true);
                this.f33869a.a(this.s);
            }
        }
        if (this.k && this.f33874i && this.j && this.f33875l && this.f33871c != null && !d()) {
            boolean zA = a();
            if (!zA && (templateBannerView = this.d) != null) {
                templateBannerView.postDelayed(new l(), 1000L);
            }
            if (this.m && zA) {
                int[] iArr = new int[2];
                this.d.getLocationInWindow(iArr);
                com.smartdigimkt.y0.a.a(this.f, iArr[0], iArr[1]);
                com.smartdigimkt.y0.a.a(this.f, iArr[0], iArr[1], this.d.getWidth(), this.d.getHeight());
                this.m = false;
                if (!TextUtils.isEmpty(this.f33871c.k())) {
                    com.smartdigimkt.f0.b.a(com.smartdigimkt.m6.b.p().k()).a(this.f33871c.k());
                }
            }
            this.f33871c.j();
            if (!zA) {
                this.f33871c.m(false);
                return;
            }
            ImageView imageView = this.f33872e;
            if (imageView == null || imageView.getVisibility() != 0) {
                List<com.smartdigimkt.x.d> list = this.s;
                if (list != null && list.size() > 0) {
                    boolean z2 = false;
                    int i2 = 0;
                    for (int i3 = 0; i3 < this.s.size(); i3++) {
                        if (!this.s.get(i3).I2() && (i3 == 0 || !this.s.get(i3).M2())) {
                            a(this.s.get(i3), com.smartdigimkt.m6.b.p().k(), this.f33877p);
                            this.s.get(i3).m(true);
                            com.smartdigimkt.c0.f.a(this.f33877p, this.s.get(i3), "banner");
                            i2 = i3;
                            z2 = true;
                        }
                    }
                    if (z2) {
                        b(this.s.get(i2), com.smartdigimkt.m6.b.p().k(), this.f33877p);
                        c(this.s.get(i2), com.smartdigimkt.m6.b.p().k(), this.f33877p);
                    }
                }
            } else {
                com.smartdigimkt.x.d dVar2 = this.f33871c;
                if (dVar2 != null) {
                    b(dVar2);
                    this.f33871c.m(true);
                    com.smartdigimkt.c0.f.a(this.f33877p, this.f33871c, "banner");
                }
            }
            this.o = true;
            com.smartdigimkt.a1.c cVar = this.f33869a;
            if (cVar != null) {
                cVar.a(this.f33871c, false);
            }
            this.x.sendEmptyMessageDelayed(1, 1000L);
        }
    }

    private boolean m() {
        String strA = a(this.f33871c);
        if (TextUtils.isEmpty(strA)) {
            return false;
        }
        if (this.d == null) {
            a(com.smartdigimkt.x0.a.f39861l, 2);
            a(com.smartdigimkt.x0.a.f39860i);
            return true;
        }
        if (this.f == null) {
            try {
                ATBannerWebView aTBannerWebView = new ATBannerWebView(com.smartdigimkt.m6.b.p().k());
                this.f = aTBannerWebView;
                aTBannerWebView.setLayoutParams(new RelativeLayout.LayoutParams(-1, -1));
                this.f.setWebViewClient(new com.smartdigimkt.e1.a(this.f33877p, this.s, this.C));
            } catch (Throwable unused) {
                return false;
            }
        }
        ImageView imageView = this.f33872e;
        if (imageView != null) {
            imageView.setVisibility(8);
        }
        if (this.f.getVisibility() != 0) {
            this.f.setVisibility(0);
        }
        if (this.f.getParent() == null) {
            this.d.addView(this.f);
            a(this.f33871c.K2());
        }
        if (this.f33871c.K2()) {
            i();
        }
        j();
        com.smartdigimkt.y0.c cVar = new com.smartdigimkt.y0.c(this.d.getContext(), this.q, this.f33877p);
        this.f33879w = cVar;
        cVar.setCampaignList(this.s);
        this.f33879w.a(this.C);
        this.f33879w.setDevCloseBtnStatus(this.f33878u);
        this.f.setWebViewListener(this.f33868E);
        this.f.setObject(this.f33879w);
        if (strA.startsWith(d9.h.f24719b)) {
            this.f.loadUrl(strA);
        } else {
            this.f.loadDataWithBaseURL(this.f33871c.d0(), strA, "text/html", "utf-8", null);
        }
        ATBannerWebView aTBannerWebView2 = this.f;
        if (aTBannerWebView2 == null) {
            return true;
        }
        aTBannerWebView2.postDelayed(new h(), 1000L);
        return true;
    }

    public void h() {
        if (this.f33869a != null) {
            this.f33869a = null;
        }
        ATBannerWebView aTBannerWebView = this.f;
        if (aTBannerWebView != null) {
            aTBannerWebView.setWebViewListener(null);
        }
        if (this.f33868E != null) {
            this.f33868E = null;
        }
        ImageView imageView = this.g;
        if (imageView != null) {
            imageView.setOnClickListener(null);
        }
        ImageView imageView2 = this.f33872e;
        if (imageView2 != null) {
            imageView2.setOnClickListener(null);
        }
        TemplateBannerView templateBannerView = this.d;
        if (templateBannerView != null) {
            templateBannerView.removeAllViews();
        }
        ATBannerWebView aTBannerWebView2 = this.f;
        if (aTBannerWebView2 != null) {
            aTBannerWebView2.release();
        }
        com.smartdigimkt.y0.c cVar = this.f33879w;
        if (cVar != null) {
            cVar.release();
        }
        if (this.C != null) {
            this.C = null;
        }
        com.smartdigimkt.z.b.b().d(this.f33877p);
    }

    public void c(boolean z2) {
        this.f33870b = z2;
    }

    private void c(com.smartdigimkt.x.d dVar, Context context, String str) {
        if (dVar != null) {
            try {
                List<String> listH1 = dVar.H1();
                if (listH1 == null || listH1.size() <= 0) {
                    return;
                }
                Iterator<String> it = listH1.iterator();
                while (it.hasNext()) {
                    com.smartdigimkt.x.d dVar2 = dVar;
                    Context context2 = context;
                    String str2 = str;
                    com.smartdigimkt.o.a.a(context2, dVar2, str2, it.next(), false, true);
                    context = context2;
                    dVar = dVar2;
                    str = str2;
                }
            } catch (Throwable th) {
                th.getMessage();
            }
        }
    }

    public void b(com.smartdigimkt.x.e eVar) {
        com.smartdigimkt.x.d dVarA = a(eVar);
        this.f33871c = dVarA;
        if (dVarA == null) {
            a(com.smartdigimkt.x0.a.f39859h);
            return;
        }
        this.x.removeCallbacks(this.y);
        f();
        this.k = false;
        this.f33875l = false;
        this.o = false;
        if (TextUtils.isEmpty(this.f33871c.c0())) {
            TextUtils.isEmpty(this.f33871c.d0());
        }
        this.x.postDelayed(this.y, MBInterstitialActivity.WEB_LOAD_TIME);
        if (m()) {
            return;
        }
        if (!TextUtils.isEmpty(this.f33871c.c0()) || !TextUtils.isEmpty(this.f33871c.d0())) {
            a(com.smartdigimkt.x0.a.m, 2);
        }
        g();
    }

    public void d(boolean z2) {
        this.j = z2;
        l();
    }

    public void a(com.smartdigimkt.f1.i iVar) {
        this.D = iVar;
    }

    /* JADX INFO: renamed from: com.smartdigimkt.b1.c$c, reason: collision with other inner class name */
    public class C0442c implements com.smartdigimkt.z.a {
        public C0442c() {
        }

        @Override // com.smartdigimkt.z.a
        public void a() {
            String string;
            c.this.d.onPause();
            try {
                JSONObject jSONObject = new JSONObject();
                if (com.smartdigimkt.m6.b.p().k() != null) {
                    jSONObject.put("status", 1);
                }
                string = jSONObject.toString();
            } catch (Throwable th) {
                th.getMessage();
                string = "";
            }
            com.smartdigimkt.n.h.a().a((WebView) c.this.f, BaseAbsFeedBackForH5.g, Base64.encodeToString(string.getBytes(), 2));
        }

        @Override // com.smartdigimkt.z.a
        public void close() {
            String string;
            c.this.d.onResume();
            try {
                JSONObject jSONObject = new JSONObject();
                if (com.smartdigimkt.m6.b.p().k() != null) {
                    jSONObject.put("status", 2);
                }
                string = jSONObject.toString();
            } catch (Throwable th) {
                th.getMessage();
                string = "";
            }
            com.smartdigimkt.n.h.a().a((WebView) c.this.f, BaseAbsFeedBackForH5.g, Base64.encodeToString(string.getBytes(), 2));
        }

        @Override // com.smartdigimkt.z.a
        public void a(String str) {
            String string;
            c.this.d.onResume();
            try {
                JSONObject jSONObject = new JSONObject();
                if (com.smartdigimkt.m6.b.p().k() != null) {
                    jSONObject.put("status", 2);
                }
                string = jSONObject.toString();
            } catch (Throwable th) {
                th.getMessage();
                string = "";
            }
            com.smartdigimkt.n.h.a().a((WebView) c.this.f, BaseAbsFeedBackForH5.g, Base64.encodeToString(string.getBytes(), 2));
        }
    }

    public class k implements com.smartdigimkt.f0.c {
        public k() {
        }

        @Override // com.smartdigimkt.f0.c
        public void a(Bitmap bitmap, String str) {
            if (c.this.f33872e != null) {
                c.this.f33872e.setImageBitmap(bitmap);
            }
            c.this.k = true;
            c.this.k();
            c.this.j();
            c.this.i();
            if (c.this.o) {
                return;
            }
            c.this.l();
        }

        @Override // com.smartdigimkt.f0.c
        public void a(String str, String str2) {
            c.this.a(com.smartdigimkt.x0.a.j);
        }
    }

    public void a(boolean z2, int i2) {
        this.f33878u = i2;
        if (i2 != 0) {
            this.f33870b = z2;
            return;
        }
        com.smartdigimkt.n1.c cVarE = com.smartdigimkt.n1.b.b().e(com.smartdigimkt.u.a.f().a(), this.f33877p);
        if (cVarE != null) {
            this.f33870b = cVarE.f() == 1;
        }
    }

    public int c() {
        return this.t;
    }

    private com.smartdigimkt.x.d a(com.smartdigimkt.x.e eVar) {
        if (eVar == null) {
            return null;
        }
        ArrayList<com.smartdigimkt.x.d> arrayListF = eVar.f();
        this.s = arrayListF;
        if (arrayListF == null || arrayListF.size() <= 0) {
            return null;
        }
        return this.s.get(0);
    }

    private String a(com.smartdigimkt.x.d dVar) {
        if (dVar == null) {
            return "";
        }
        String strA = com.smartdigimkt.c3.j.b().a(dVar.d0());
        if (!TextUtils.isEmpty(strA)) {
            return strA;
        }
        String strC0 = dVar.c0();
        if (dVar.C2()) {
            try {
                File file = new File(strC0);
                if (!file.exists()) {
                    return "";
                }
                return p.e(file);
            } catch (Exception unused) {
                File file2 = new File(strC0);
                return (file2.exists() && file2.isFile() && file2.canRead()) ? android.support.v4.media.a.C("file:////", strC0) : strC0;
            }
        }
        File file3 = new File(strC0);
        return (file3.exists() && file3.isFile() && file3.canRead()) ? android.support.v4.media.a.C("file:////", strC0) : strC0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b() {
        com.smartdigimkt.a1.c cVar = this.f33869a;
        if (cVar != null) {
            cVar.onCloseBanner();
        }
    }

    public void b(boolean z2) {
        this.f33874i = z2;
        l();
    }

    private void b(com.smartdigimkt.x.d dVar) {
        if (dVar != null) {
            a(dVar, com.smartdigimkt.m6.b.p().k(), this.f33877p);
            b(dVar, com.smartdigimkt.m6.b.p().k(), this.f33877p);
            c(dVar, com.smartdigimkt.m6.b.p().k(), this.f33877p);
        }
    }

    private void b(com.smartdigimkt.x.d dVar, Context context, String str) {
        if (dVar != null) {
            try {
                if (TextUtils.isEmpty(dVar.y1())) {
                    return;
                }
                com.smartdigimkt.o.a.a(context, dVar, str, dVar.y1(), false, true, com.smartdigimkt.q.a.q);
            } catch (Throwable th) {
                th.getMessage();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(String str) {
        if (this.f33871c == null || d()) {
            return;
        }
        this.x.removeCallbacks(this.y);
        com.smartdigimkt.a1.c cVar = this.f33869a;
        if (cVar != null) {
            cVar.onShowFailed(str);
        }
    }

    private boolean a() {
        if (this.d == null) {
            return false;
        }
        com.smartdigimkt.x.d dVar = this.f33871c;
        return (a0.a(this.d, dVar != null ? dVar.N0() : 0) || this.f33876n) ? false : true;
    }

    private void a(com.smartdigimkt.x.d dVar, Context context, String str) {
        if (!TextUtils.isEmpty(dVar.P0())) {
            com.smartdigimkt.o.a.a(context, dVar, str, dVar.P0(), false, true, com.smartdigimkt.q.a.f37742p);
        }
        if (TextUtils.isEmpty(str) || dVar.p1() == null || dVar.p1().l() == null) {
            return;
        }
        com.smartdigimkt.o.a.a(context, dVar, str, dVar.p1().l(), false, false);
    }

    public void a(com.smartdigimkt.x.d dVar, boolean z2, String str) {
        if (this.o) {
            if (this.r == null) {
                this.r = new com.smartdigimkt.o.a(com.smartdigimkt.m6.b.p().k(), this.f33877p);
            }
            this.r.a(new a());
            dVar.G(this.f33877p);
            this.r.a(dVar);
            if (!this.f33871c.N2()) {
                this.f33871c.n(true);
            }
            com.smartdigimkt.a1.c cVar = this.f33869a;
            if (cVar != null) {
                cVar.onClick(dVar);
            }
            if (z2) {
                TextUtils.isEmpty(str);
            }
        }
    }

    public void a(int i2, int i3, int i4, int i5) {
        if (i2 == i4 && i3 == i5) {
            return;
        }
        com.smartdigimkt.y0.a.a((WebView) this.f, i2, i3);
    }

    private void a(boolean z2) {
        if (this.d != null) {
            View viewA = com.smartdigimkt.z.b.b().a(this.f33877p);
            if (com.smartdigimkt.z.b.b().a() && z2 && viewA != null) {
                ViewGroup viewGroup = (ViewGroup) viewA.getParent();
                if (viewGroup != null) {
                    viewGroup.removeView(viewA);
                }
                viewA.setVisibility(0);
                RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) viewA.getLayoutParams();
                if (layoutParams == null) {
                    layoutParams = new RelativeLayout.LayoutParams(com.smartdigimkt.z.b.d, com.smartdigimkt.z.b.f40278e);
                }
                layoutParams.addRule(12);
                viewA.setLayoutParams(layoutParams);
                this.d.addView(viewA);
            }
            com.smartdigimkt.z.b.b().a(this.f33877p, new C0442c());
            this.f33871c.G(this.f33877p);
            com.smartdigimkt.z.b.b().a(this.f33877p, this.f33871c);
        }
    }

    public void a(int i2) {
        this.t = i2;
    }
}
