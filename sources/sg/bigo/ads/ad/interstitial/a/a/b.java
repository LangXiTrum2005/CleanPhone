package sg.bigo.ads.ad.interstitial.a.a;

import android.app.Activity;
import android.content.Context;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.View;
import android.webkit.JavascriptInterface;
import android.webkit.WebView;
import android.widget.FrameLayout;
import java.lang.ref.WeakReference;
import sg.bigo.ads.ad.banner.h;
import sg.bigo.ads.ad.interstitial.t;
import sg.bigo.ads.api.Ad;
import sg.bigo.ads.common.i;
import sg.bigo.ads.common.utils.u;
import sg.bigo.ads.controller.landing.d;
import sg.bigo.ads.core.f.a.p;
import sg.bigo.ads.core.mraid.e;
import sg.bigo.ads.core.mraid.n;

/* JADX INFO: loaded from: classes7.dex */
public final class b implements sg.bigo.ads.ad.banner.b.InterfaceC0789b, sg.bigo.ads.ad.interstitial.a.b.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final sg.bigo.ads.api.core.c f45778a;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    long f45781e;
    sg.bigo.ads.core.c.b f;
    public h g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    WebView f45782h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public View f45783i;
    boolean j;
    boolean k;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    final sg.bigo.ads.ad.interstitial.a.b.b.a f45785n;
    private final boolean o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private final String f45786p;
    private final sg.bigo.ads.core.f.a.a.C0869a q;
    private final sg.bigo.ads.core.player.c r;
    private final p s;
    private final Ad t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private e f45787u;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    boolean f45779b = false;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    boolean f45780c = false;
    boolean d = false;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    boolean f45784l = false;
    final C0798b m = new C0798b(0);

    public final class a {
        private a() {
        }

        @JavascriptInterface
        public final void gameEnd(String str) {
            sg.bigo.ads.ad.interstitial.a.b.b.a aVar = b.this.f45785n;
            if (aVar != null) {
                aVar.b();
            }
        }

        @JavascriptInterface
        public final void onBGNDomContentLoaded() {
            b bVar = b.this;
            bVar.k = true;
            sg.bigo.ads.ad.interstitial.a.b.b.a aVar = bVar.f45785n;
            if (aVar != null) {
                aVar.c(bVar.f45778a, SystemClock.elapsedRealtime() - b.this.f45781e);
            }
        }

        @JavascriptInterface
        public final void onBGNLoaded() {
            b bVar = b.this;
            bVar.j = true;
            sg.bigo.ads.ad.interstitial.a.b.b.a aVar = bVar.f45785n;
            if (aVar != null) {
                aVar.b(bVar.f45778a, SystemClock.elapsedRealtime() - b.this.f45781e);
            }
        }

        public /* synthetic */ a(b bVar, byte b2) {
            this();
        }
    }

    /* JADX INFO: renamed from: sg.bigo.ads.ad.interstitial.a.a.b$b, reason: collision with other inner class name */
    public static final class C0798b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private boolean f45792a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private int f45793b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private WeakReference<Activity> f45794c;

        private C0798b() {
            this.f45792a = false;
            this.f45793b = -1;
        }

        private void b() {
            if (this.f45792a) {
                int i2 = this.f45793b;
                this.f45793b = -1;
                if (i2 == 0 || i2 == 1) {
                    WeakReference<Activity> weakReference = this.f45794c;
                    Activity activity = weakReference == null ? null : weakReference.get();
                    if (activity == null) {
                        return;
                    }
                    activity.setRequestedOrientation(i2);
                }
            }
        }

        public final void a() {
            this.f45792a = true;
            b();
        }

        public /* synthetic */ C0798b(byte b2) {
            this();
        }

        public final void a(Activity activity, int i2) {
            this.f45793b = i2;
            this.f45794c = new WeakReference<>(activity);
            b();
        }
    }

    public b(Ad ad, sg.bigo.ads.api.core.c cVar, sg.bigo.ads.core.player.c cVar2, p pVar, sg.bigo.ads.core.f.a.a.C0869a c0869a, sg.bigo.ads.ad.interstitial.a.b.b.a aVar) {
        this.q = c0869a;
        String str = c0869a == null ? null : c0869a.f48474b;
        this.f45786p = str;
        this.r = cVar2;
        this.s = pVar;
        this.t = ad;
        this.f45778a = cVar;
        this.f45785n = aVar;
        this.o = !TextUtils.isEmpty(str);
    }

    @Override // sg.bigo.ads.ad.interstitial.a.b.a
    public final View a() {
        return this.f45783i;
    }

    @Override // sg.bigo.ads.ad.interstitial.a.b.a
    public final boolean b() {
        if (this.o) {
            return this.f45780c;
        }
        return false;
    }

    @Override // sg.bigo.ads.ad.interstitial.a.b.a
    public final void c() {
        sg.bigo.ads.common.t.a.a(0, 3, "HtmlVastCompanion", "resume");
        e eVar = this.f45787u;
        if (eVar != null) {
            eVar.d();
        }
    }

    @Override // sg.bigo.ads.ad.interstitial.a.b.a
    public final void d() {
        sg.bigo.ads.common.t.a.a(0, 3, "HtmlVastCompanion", "pause");
        e eVar = this.f45787u;
        if (eVar != null) {
            eVar.a(false);
        }
    }

    @Override // sg.bigo.ads.ad.interstitial.a.b.a
    public final void e() {
        sg.bigo.ads.common.t.a.a(0, 3, "HtmlVastCompanion", "release");
        sg.bigo.ads.ad.banner.b.h(this);
        sg.bigo.ads.core.c.b bVar = this.f;
        if (bVar != null) {
            bVar.b();
        }
        e eVar = this.f45787u;
        if (eVar != null) {
            eVar.e();
            this.f45787u = null;
        }
        WebView webView = this.f45782h;
        if (webView != null) {
            u.b(webView);
            this.f45782h = null;
        }
        this.g = null;
    }

    @Override // sg.bigo.ads.ad.interstitial.a.b.a
    public final void f() {
        sg.bigo.ads.ad.interstitial.a.b.b.a aVar;
        if (this.j || this.k || this.f45784l || (aVar = this.f45785n) == null || this.f45781e <= 0) {
            return;
        }
        aVar.d(this.f45778a, SystemClock.elapsedRealtime() - this.f45781e);
    }

    @Override // sg.bigo.ads.ad.interstitial.a.b.a
    public final void a(int i2) {
        if (i2 == 1) {
            this.m.a();
            sg.bigo.ads.core.player.c cVar = this.r;
            if (cVar != null) {
                cVar.b();
            }
        }
    }

    @Override // sg.bigo.ads.ad.interstitial.a.b.a
    public final void a(int i2, int i3) {
        int i4;
        int i5;
        WebView webView = this.f45782h;
        if (webView == null) {
            return;
        }
        Context context = webView.getContext();
        sg.bigo.ads.core.f.a.a.C0869a c0869a = this.q;
        int i6 = 0;
        if (c0869a != null) {
            i5 = c0869a.f48475c;
            i4 = c0869a.d;
        } else {
            i4 = 0;
            i5 = 0;
        }
        if (sg.bigo.ads.common.utils.e.a(context, i5) <= i2 && sg.bigo.ads.common.utils.e.a(context, i4) <= i3) {
            i6 = i5;
        }
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.f45782h.getLayoutParams();
        if (i6 <= 0 || i4 <= 0) {
            layoutParams.width = i2;
            layoutParams.height = i3;
        } else {
            layoutParams.gravity = 17;
            layoutParams.width = sg.bigo.ads.common.utils.e.a(context, i6);
            layoutParams.height = sg.bigo.ads.common.utils.e.a(context, i4);
        }
    }

    public final void a(Context context, String str, i iVar) {
        sg.bigo.ads.api.core.e eVarA;
        sg.bigo.ads.common.t.a.a(0, 3, "HtmlVastCompanion", "handle ad click.");
        sg.bigo.ads.ad.interstitial.a.b.b.a aVar = this.f45785n;
        if (aVar == null || !aVar.c()) {
            str = null;
        }
        String str2 = str;
        if (this.f45778a.f().c() == 0 || !(this.t instanceof sg.bigo.ads.ad.c)) {
            eVarA = sg.bigo.ads.ad.interstitial.a.a.a.a(context, this.t, this.f45778a, str2, this.s, this.q);
            eVarA.g = 0;
        } else {
            Context context2 = this.f45783i.getContext();
            Ad ad = this.t;
            d.a(context2, (sg.bigo.ads.ad.c<?, ?>) (ad instanceof t ? ((t) ad).f46647z : (sg.bigo.ads.ad.c) ad));
            eVarA = new sg.bigo.ads.api.core.e();
            eVarA.g = 1;
        }
        sg.bigo.ads.core.player.c cVar = this.r;
        if (cVar != null && !cVar.c()) {
            this.r.a();
        }
        h hVar = this.g;
        if (hVar != null) {
            hVar.a(iVar, eVarA);
        }
    }

    @Override // sg.bigo.ads.ad.interstitial.a.b.a
    public final boolean a(final Context context) {
        int i2;
        int i3;
        byte b2 = 0;
        if (!this.o) {
            return false;
        }
        if (this.f45787u == null) {
            try {
                this.f45787u = new e(context, n.INTERSTITIAL);
            } catch (NoClassDefFoundError unused) {
                sg.bigo.ads.common.t.a.a(0, "HtmlVastCompanion", "Banner webview is not support");
            }
            e eVar = this.f45787u;
            if (eVar == null) {
                return false;
            }
            eVar.g = new e.b() { // from class: sg.bigo.ads.ad.interstitial.a.a.b.1
                @Override // sg.bigo.ads.core.mraid.e.b
                public final void a() {
                    b bVar = b.this;
                    bVar.f45780c = true;
                    bVar.d = false;
                    bVar.f = sg.bigo.ads.core.c.c.a.f48343a.a(b.this.f45782h, new View[0]);
                    b bVar2 = b.this;
                    if (bVar2.f45779b) {
                        if (bVar2.f45782h != null) {
                            sg.bigo.ads.common.t.a.a(0, 3, "HtmlVastCompanion", "javascript:onViewImpression()");
                            bVar2.f45782h.loadUrl("javascript:onViewImpression()");
                        }
                        sg.bigo.ads.core.c.b bVar3 = b.this.f;
                        if (bVar3 != null) {
                            bVar3.a();
                        }
                    }
                    sg.bigo.ads.ad.banner.b.b(b.this);
                    sg.bigo.ads.ad.interstitial.a.b.b.a aVar = b.this.f45785n;
                    if (aVar != null) {
                        aVar.a();
                    }
                }

                @Override // sg.bigo.ads.core.mraid.e.b
                public final void b() {
                    b bVar = b.this;
                    bVar.d = false;
                    bVar.f45784l = true;
                    sg.bigo.ads.ad.banner.b.c(bVar);
                    b bVar2 = b.this;
                    sg.bigo.ads.ad.interstitial.a.b.b.a aVar = bVar2.f45785n;
                    if (aVar != null) {
                        aVar.a(bVar2.f45778a, SystemClock.elapsedRealtime() - b.this.f45781e);
                    }
                }

                @Override // sg.bigo.ads.core.mraid.e.b
                public final void c() {
                    sg.bigo.ads.common.t.a.a(0, "HtmlVastCompanion", "onRenderProcessGone");
                }

                @Override // sg.bigo.ads.core.mraid.e.b
                public final void d() {
                    sg.bigo.ads.common.t.a.a(0, 3, "HtmlVastCompanion", "onExpand");
                }

                @Override // sg.bigo.ads.core.mraid.e.b
                public final void e() {
                    sg.bigo.ads.common.t.a.a(0, 3, "HtmlVastCompanion", "onResize");
                }

                @Override // sg.bigo.ads.core.mraid.e.b
                public final void f() {
                    h hVar = b.this.g;
                    if (hVar != null) {
                        hVar.a();
                    }
                }

                @Override // sg.bigo.ads.core.mraid.e.b
                public final void g() {
                    h hVar = b.this.g;
                    if (hVar != null) {
                        hVar.a();
                    }
                }

                @Override // sg.bigo.ads.core.mraid.e.b
                public final void a(String str, i iVar) {
                    b.this.a(context, str, iVar);
                }

                @Override // sg.bigo.ads.core.mraid.e.b
                public final boolean b(Activity activity, int i4) {
                    b.this.m.a(activity, i4);
                    return true;
                }

                @Override // sg.bigo.ads.core.mraid.e.b
                public final boolean a(Activity activity, int i4) {
                    b.this.m.a(activity, i4);
                    return true;
                }
            };
            String strM = android.support.v4.media.a.m(android.support.v4.media.a.m(sg.bigo.ads.core.c.c.a.f48343a.c(this.f45786p), "\n<script>document.addEventListener('DOMContentLoaded',function(){BGN_PLAYABLE.onBGNDomContentLoaded()});\nwindow.addEventListener('load',function(){BGN_PLAYABLE.onBGNLoaded()});</script>"), "\n<script type=\"text/javascript\">\n    document.body.style.margin = '0px';\n</script>");
            this.f45781e = SystemClock.elapsedRealtime();
            sg.bigo.ads.ad.interstitial.a.b.b.a aVar = this.f45785n;
            if (aVar != null) {
                aVar.a(this.f45778a);
            }
            this.f45787u.a(strM, new e.d() { // from class: sg.bigo.ads.ad.interstitial.a.a.b.2
                @Override // sg.bigo.ads.core.mraid.e.d
                public final void a() {
                    sg.bigo.ads.common.t.a.a(0, 3, "HtmlVastCompanion", "onReady");
                }
            });
            this.d = true;
            sg.bigo.ads.common.utils.t.a();
        }
        sg.bigo.ads.core.mraid.c.C0874c c0874cB = this.f45787u.b();
        this.f45782h = c0874cB;
        if (c0874cB != null) {
            c0874cB.setOverScrollMode(2);
            this.f45782h.setHorizontalScrollBarEnabled(false);
            this.f45782h.setHorizontalScrollbarOverlay(false);
            this.f45782h.setVerticalScrollBarEnabled(false);
            this.f45782h.setVerticalScrollbarOverlay(false);
            this.f45782h.getSettings().setSupportZoom(false);
            this.f45782h.setBackgroundColor(-1);
            sg.bigo.ads.core.f.a.a.C0869a c0869a = this.q;
            if (c0869a != null) {
                i3 = c0869a.f48475c;
                i2 = c0869a.d;
            } else {
                i2 = 0;
                i3 = 0;
            }
            WebView webView = this.f45782h;
            if (webView != null) {
                Object parent = webView.getParent();
                if (parent instanceof FrameLayout) {
                    this.f45783i = (View) parent;
                    sg.bigo.ads.ad.banner.b.a(this);
                    Context context2 = webView.getContext();
                    int i4 = context2.getResources().getDisplayMetrics().widthPixels;
                    int iC = sg.bigo.ads.common.utils.e.c(context2);
                    if (sg.bigo.ads.common.utils.e.a(context2, i3) > i4 || sg.bigo.ads.common.utils.e.a(context2, i2) > iC) {
                        i3 = 0;
                    }
                    FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) webView.getLayoutParams();
                    if (i3 <= 0 || i2 <= 0) {
                        layoutParams.width = -1;
                        layoutParams.height = -1;
                    } else {
                        layoutParams.gravity = 17;
                        layoutParams.width = sg.bigo.ads.common.utils.e.a(context2, i3);
                        layoutParams.height = sg.bigo.ads.common.utils.e.a(context2, i2);
                    }
                }
            }
            this.f45782h.addJavascriptInterface(new a(this, b2), "BGN_PLAYABLE");
        }
        return true;
    }
}
