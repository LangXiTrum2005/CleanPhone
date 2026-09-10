package sg.bigo.ads.ad.banner;

import android.content.Context;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.View;
import android.webkit.WebView;
import android.widget.FrameLayout;
import com.p004ironsource.cs;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import sg.bigo.ads.api.AdError;
import sg.bigo.ads.api.BannerAd;
import sg.bigo.ads.api.InnerBannerAd;
import sg.bigo.ads.core.mraid.n;

/* JADX INFO: loaded from: classes7.dex */
public final class e extends sg.bigo.ads.ad.d<InnerBannerAd, sg.bigo.ads.api.core.i> implements InnerBannerAd {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    private boolean f45551A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    private final AtomicBoolean f45552B;
    private boolean C;
    private AdError[] D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    private boolean f45553E;
    private c<BannerAd> x;
    private FrameLayout y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private boolean f45554z;

    public e(sg.bigo.ads.api.core.g gVar) {
        super(gVar);
        this.D = new AdError[1];
        this.f45553E = false;
        this.f45552B = new AtomicBoolean(false);
        if (gVar.f47032a.w() == 3) {
            this.x = a(gVar, this.D);
        }
    }

    private boolean A() {
        try {
            return ((sg.bigo.ads.api.core.i) f()).az();
        } catch (Exception unused) {
            return false;
        }
    }

    private c<BannerAd> a(sg.bigo.ads.api.core.g gVar, AdError[] adErrorArr) {
        try {
            sg.bigo.ads.api.core.i iVar = (sg.bigo.ads.api.core.i) f();
            this.f45554z = iVar.av();
            Context context = this.f45584b.f47035e;
            int iC = gVar.f47034c.c();
            return new c<>(context, gVar, this, iVar, (iC == 3 || iC == 4) ? n.INTERSTITIAL : n.INLINE, new h() { // from class: sg.bigo.ads.ad.banner.e.1
                @Override // sg.bigo.ads.ad.banner.h
                public final void a() {
                }

                @Override // sg.bigo.ads.ad.banner.h
                public final void b() {
                    e.b(e.this);
                    if (e.this.n()) {
                        e.this.z();
                    }
                }

                /* JADX WARN: Type inference failed for: r6v3, types: [sg.bigo.ads.api.core.c] */
                @Override // sg.bigo.ads.ad.banner.h
                public final void a(String str) {
                    p005e.a.d(0, 3, str, "BannerAd onCustomJsOmImpression, adSessionId=", "BannerAd");
                    e.this.z();
                    sg.bigo.ads.core.d.b.a((sg.bigo.ads.api.core.c) e.this.f(), (String) e.this.b("show_proportion", ""), e.this.i(), ((Integer) e.this.b("render_style", 0)).intValue());
                }

                @Override // sg.bigo.ads.ad.banner.h
                public final void a(sg.bigo.ads.common.i iVar2, sg.bigo.ads.api.core.e eVar) {
                    e.this.a(iVar2, eVar);
                }
            }, this.f45554z);
        } catch (Exception unused) {
            adErrorArr[0] = new AdError(cs.c.INSTANCE_LOAD_FAILED, "Unable to init banner ad due to invalid ad data");
            return null;
        }
    }

    public static /* synthetic */ boolean b(e eVar) {
        eVar.f45551A = true;
        return true;
    }

    private AdError x() {
        if (this.x == null) {
            AdError[] adErrorArr = this.D;
            AdError adError = adErrorArr[0];
            if (adError == null) {
                return new AdError(cs.a.INSTANCE_SHOW, "Failed to create html ads.");
            }
            adErrorArr[0] = null;
            return adError;
        }
        try {
            sg.bigo.ads.api.core.i iVar = (sg.bigo.ads.api.core.i) f();
            if (iVar.aw() != null && !TextUtils.isEmpty(iVar.aw().c())) {
                return null;
            }
            return new AdError(cs.a.INSTANCE_SHOW_FAILED, "Empty content.");
        } catch (Exception unused) {
            return new AdError(cs.c.INSTANCE_LOAD_FAILED, "BannerAd with invalid AdData class type.");
        }
    }

    private void y() {
        if (!this.C) {
            this.C = true;
        }
        sg.bigo.ads.common.n.d.a(3, new Runnable() { // from class: sg.bigo.ads.ad.banner.e.2
            @Override // java.lang.Runnable
            public final void run() {
                f.a.f45563a.b(e.this);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void z() {
        if (this.f45552B.compareAndSet(false, true)) {
            sg.bigo.ads.common.t.a.a(0, 3, "BannerAd", "BannerAd report impression AdEvent");
            super.l();
        }
    }

    @Override // sg.bigo.ads.api.BannerAd
    public final View adView() {
        c<BannerAd> cVar = this.x;
        if (cVar == null) {
            return null;
        }
        if (!cVar.s) {
            a(false);
        }
        View viewC = this.x.c();
        if (this.y == null) {
            this.y = new FrameLayout(viewC.getContext());
        }
        this.y.removeAllViews();
        this.y.addView(viewC);
        t();
        a(this.y, this.f45553E);
        return this.y;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [sg.bigo.ads.api.core.c] */
    @Override // sg.bigo.ads.ad.d, sg.bigo.ads.ad.c
    public final void destroyInMainThread() {
        super.destroyInMainThread();
        c<BannerAd> cVar = this.x;
        if (cVar != null) {
            cVar.a();
        }
        y();
        sg.bigo.ads.core.d.b.a((sg.bigo.ads.api.core.c) f(), SystemClock.elapsedRealtime() - this.k);
    }

    @Override // sg.bigo.ads.api.Ad
    public final String getCreativeId() {
        c<BannerAd> cVar = this.x;
        return cVar != null ? cVar.d() : "";
    }

    @Override // sg.bigo.ads.api.BannerAd
    public final int getHeight() {
        c<BannerAd> cVar = this.x;
        if (cVar == null) {
            return 0;
        }
        sg.bigo.ads.api.core.i iVar = cVar.k;
        return (iVar == null || iVar.aw() == null || cVar.k.aw().a() <= 0 || cVar.k.aw().b() <= 0) ? cVar.i().getHeight() : cVar.k.aw().b();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [sg.bigo.ads.api.core.c] */
    @Override // sg.bigo.ads.api.InnerBannerAd
    public final sg.bigo.ads.api.core.c getInnerBannerAdData() {
        return f();
    }

    @Override // sg.bigo.ads.api.InnerBannerAd
    public final WebView getWebView() {
        c<BannerAd> cVar = this.x;
        if (cVar == null) {
            return null;
        }
        return cVar.f45520a;
    }

    @Override // sg.bigo.ads.api.BannerAd
    public final int getWidth() {
        c<BannerAd> cVar = this.x;
        if (cVar == null) {
            return 0;
        }
        sg.bigo.ads.api.core.i iVar = cVar.k;
        return (iVar == null || iVar.aw() == null || cVar.k.aw().a() <= 0 || cVar.k.aw().b() <= 0) ? cVar.i().getWidth() : cVar.k.aw().a();
    }

    @Override // sg.bigo.ads.ad.c
    public final void h() {
        c<BannerAd> cVar = this.x;
        if (cVar != null) {
            b.g(cVar);
            T t = cVar.j;
            if (t instanceof e) {
                ((e) t).a(b.i(cVar));
            }
        }
        super.h();
        c<BannerAd> cVar2 = this.x;
        if (cVar2 != null) {
            cVar2.f();
        }
        y();
    }

    @Override // sg.bigo.ads.api.InnerBannerAd
    public final void handleInnerBannerAdResponse(sg.bigo.ads.api.b.d.a<InnerBannerAd> aVar) {
        String str;
        this.C = false;
        AdError adErrorX = x();
        if (adErrorX != null) {
            aVar.a(this, 1005, adErrorX.getCode(), adErrorX.getMessage());
            return;
        }
        sg.bigo.ads.api.core.i.a aVarAx = this.x.k.ax();
        if (aVarAx != null && aVarAx.a() && !A()) {
            try {
                sg.bigo.ads.api.core.i iVar = (sg.bigo.ads.api.core.i) f();
                sg.bigo.ads.common.t.a.a(0, 3, "BannerAd", "Banner load when onAdLoaded() ");
                if (f.a.f45563a.a(this)) {
                    this.C = true;
                    iVar.aA();
                    a(true);
                } else {
                    str = "Banner preload limit 3 BannerAds.";
                    sg.bigo.ads.common.t.a.a(0, 5, "BannerAd", str);
                }
            } catch (Exception unused) {
                str = "Banner preload, not BannerAdData type.";
            }
        }
        aVar.a(this);
    }

    @Override // sg.bigo.ads.api.InnerBannerAd
    public final boolean isInnerBannerAdFromAutoRefresh() {
        return A();
    }

    @Override // sg.bigo.ads.ad.c
    public final void l() {
        if (!this.f45554z || this.f45551A) {
            z();
        } else {
            sg.bigo.ads.common.t.a.a(0, 3, "BannerAd", "BannerAd report impression AdEvent depend on om callback.");
        }
    }

    @Override // sg.bigo.ads.ad.c
    public final void m() {
        super.m();
        z();
    }

    @Override // sg.bigo.ads.api.InnerBannerAd
    public final void markFromAutoFresh(sg.bigo.ads.api.core.c cVar) {
        this.f45553E = true;
        if (cVar instanceof sg.bigo.ads.api.core.i) {
            ((sg.bigo.ads.api.core.i) cVar).ay();
        }
        a();
    }

    @Override // sg.bigo.ads.api.InnerBannerAd
    public final int updateFormOpenTimes() {
        return b_();
    }

    public final void a(long j) {
        a("attach_render_cost", Long.valueOf(j));
    }

    private void a(boolean z2) {
        if (this.x == null) {
            return;
        }
        final sg.bigo.ads.api.core.i iVar = (sg.bigo.ads.api.core.i) f();
        final long jElapsedRealtime = SystemClock.elapsedRealtime();
        final sg.bigo.ads.api.b.a.InterfaceC0830a interfaceC0830a = new sg.bigo.ads.api.b.a.InterfaceC0830a() { // from class: sg.bigo.ads.ad.banner.e.3
            @Override // sg.bigo.ads.api.b.a.InterfaceC0830a
            public final void a(sg.bigo.ads.api.core.d dVar) {
                sg.bigo.ads.core.d.b.a(iVar, "banner_load_cost", SystemClock.elapsedRealtime() - jElapsedRealtime, 0, (Map<String, String>) null);
                sg.bigo.ads.common.t.a.a(1, 5, "BannerAd", "Failed to load banner media.");
            }

            @Override // sg.bigo.ads.api.b.a.InterfaceC0830a
            public final void b() {
                sg.bigo.ads.core.d.b.a(iVar, "banner_load_cost", SystemClock.elapsedRealtime() - jElapsedRealtime, 1, (Map<String, String>) null);
                sg.bigo.ads.common.t.a.a(0, 3, "BannerAd", "banner load success");
            }
        };
        if (z2) {
            sg.bigo.ads.common.t.a.a(0, 3, "BannerAd", "Banner load when onAdLoaded() ");
            this.x.a(interfaceC0830a);
        } else {
            sg.bigo.ads.common.t.a.a(0, 3, "BannerAd", "Banner load when adView() ");
            sg.bigo.ads.common.n.d.b(new Runnable() { // from class: sg.bigo.ads.ad.banner.e.4
                @Override // java.lang.Runnable
                public final void run() {
                    if (e.this.x.b(interfaceC0830a)) {
                        return;
                    }
                    interfaceC0830a.a(new sg.bigo.ads.api.core.d(3001, 10102, "Adx media load error when load"));
                }
            });
        }
    }
}
