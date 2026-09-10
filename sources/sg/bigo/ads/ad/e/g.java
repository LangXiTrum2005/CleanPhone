package sg.bigo.ads.ad.e;

import android.app.Activity;
import sg.bigo.ads.ad.interstitial.AdCountDownButton;
import sg.bigo.ads.ad.interstitial.d.m;
import sg.bigo.ads.ad.interstitial.t;
import sg.bigo.ads.ad.interstitial.u;
import sg.bigo.ads.ad.interstitial.x;
import sg.bigo.ads.ad.interstitial.z;
import sg.bigo.ads.api.VideoController;

/* JADX INFO: loaded from: classes7.dex */
class g extends z {
    protected h H;
    private boolean L;
    private boolean M;

    /* JADX INFO: renamed from: N, reason: collision with root package name */
    private boolean f45715N;
    private boolean O;

    public g(Activity activity) {
        super(activity);
        this.L = true;
        this.M = false;
        this.f45715N = false;
        this.O = false;
    }

    private void ar() {
        h hVar = this.H;
        if (hVar != null && !this.M) {
            this.M = true;
            hVar.H();
        } else if (hVar == null) {
            sg.bigo.ads.common.t.a.a(2, "", "Failed to claim reward because of null RewardVideoAd.");
        }
    }

    public static /* synthetic */ boolean f(g gVar) {
        gVar.O = true;
        return true;
    }

    @Override // sg.bigo.ads.ad.interstitial.z, sg.bigo.ads.ad.interstitial.a, sg.bigo.ads.ad.interstitial.i, sg.bigo.ads.ad.interstitial.k.b
    public final void C() {
        this.f45742e = true;
        if (G()) {
            F();
        }
    }

    @Override // sg.bigo.ads.ad.interstitial.i, sg.bigo.ads.controller.e.b, sg.bigo.ads.api.core.BaseAdActivityImpl
    public final void N() {
        super.N();
        T t = this.y;
        if (t == 0) {
            return;
        }
        if (t instanceof h) {
            this.H = (h) t;
        }
        if (this.H == null || !ab()) {
            a("Illegal video content.");
        }
    }

    @Override // sg.bigo.ads.ad.interstitial.i, sg.bigo.ads.controller.e.b, sg.bigo.ads.api.core.BaseAdActivityImpl
    public final void W() {
        if (this.L && c() == 0) {
            d(true);
        }
    }

    @Override // sg.bigo.ads.ad.interstitial.z, sg.bigo.ads.ad.interstitial.r
    public final int Y() {
        int i2 = ((sg.bigo.ads.ad.interstitial.a) this).f45740b.a("interstitial_video_style.video_play_page.icon_strategy") != 2 ? 1 : 2;
        if (this.f45747p.get()) {
            return 3;
        }
        return i2;
    }

    @Override // sg.bigo.ads.ad.interstitial.z, sg.bigo.ads.ad.interstitial.i, sg.bigo.ads.ad.interstitial.k.b
    public final void b(String str) {
        this.f45715N = true;
        super.b(str);
    }

    @Override // sg.bigo.ads.ad.interstitial.a
    public final void q() {
        super.q();
        sg.bigo.ads.core.a.a aVarF = ((t) this.y).f();
        if (!this.f45747p.get() || aVarF.bh() == null || this.L) {
            return;
        }
        x xVar = this.f45743h;
        xVar.f46713b = 0;
        xVar.f46714c = 15;
    }

    @Override // sg.bigo.ads.ad.interstitial.z, sg.bigo.ads.ad.interstitial.a
    public final void x() {
        super.x();
        AdCountDownButton adCountDownButton = this.f46325A;
        if (adCountDownButton != null) {
            adCountDownButton.setShowCloseButtonInCountdown(this.L);
        }
    }

    @Override // sg.bigo.ads.ad.interstitial.z, sg.bigo.ads.ad.interstitial.a
    public final boolean f(boolean z2) {
        if (this.f45747p.get()) {
            AdCountDownButton adCountDownButton = this.f46325A;
            if (adCountDownButton != null) {
                adCountDownButton.d();
            }
        } else if (!this.M && this.L && c() == 0 && !this.O) {
            final VideoController videoControllerAa = aa();
            new c(this.f47011I).a(new c.a() { // from class: sg.bigo.ads.ad.e.g.1

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                private int f45718c = -1;
                private boolean d = false;

                /* JADX INFO: renamed from: e, reason: collision with root package name */
                private boolean f45719e = false;

                private void e() {
                    if (g.this.c() == 3) {
                        g.this.f(this.f45718c);
                    }
                }

                @Override // sg.bigo.ads.ad.e.c.a
                public final void a() {
                    this.f45718c = g.this.c();
                    g.this.f(3);
                    VideoController videoController = videoControllerAa;
                    if (videoController != null && videoController.isPlaying()) {
                        videoControllerAa.pause();
                        this.d = true;
                    }
                    h hVar = g.this.H;
                    if (hVar != null) {
                        sg.bigo.ads.core.d.b.a((sg.bigo.ads.api.core.c) hVar.f(), g.this.c(), 2);
                    }
                    g.this.Z().c();
                    ((z) g.this).G.b(false);
                }

                @Override // sg.bigo.ads.ad.e.c.a
                public final void b() {
                    VideoController videoController;
                    e();
                    if (!this.f45719e && this.d && (videoController = videoControllerAa) != null && videoController.isPaused()) {
                        videoControllerAa.play();
                    }
                    g.this.Z().b();
                    ((z) g.this).G.a(false);
                }

                @Override // sg.bigo.ads.ad.e.c.a
                public final void c() {
                    this.f45719e = true;
                    g.f(g.this);
                    if (g.this.K() || g.this.L()) {
                        g.this.T();
                        return;
                    }
                    if (g.this.r != null && g.this.r.y.a()) {
                        e();
                    } else if (!g.this.d && ((sg.bigo.ads.ad.interstitial.a) g.this).f45740b.a("interstitial_video_style.video_play_page.skip_type") != 2) {
                        g.this.T();
                    } else {
                        e();
                        g.this.l(6);
                    }
                }

                @Override // sg.bigo.ads.ad.e.c.a
                public final void d() {
                    u uVarZ = g.this.Z();
                    if (uVarZ instanceof m) {
                        ((m) uVarZ).A();
                    }
                }
            });
            return false;
        }
        boolean zF = super.f(z2);
        if (zF && (this.f45747p.get() || this.f45715N)) {
            ar();
        }
        return zF;
    }

    @Override // sg.bigo.ads.ad.interstitial.z, sg.bigo.ads.api.VideoController.a
    public final void i(boolean z2) {
        AdCountDownButton adCountDownButton;
        super.i(z2);
        if (z2 || c() != 0 || this.L || (adCountDownButton = this.f46325A) == null) {
            return;
        }
        adCountDownButton.setTakeoverTickEvent(false);
        this.f46325A.a(15, (AdCountDownButton.b) null);
    }

    @Override // sg.bigo.ads.ad.interstitial.z, sg.bigo.ads.ad.interstitial.a, sg.bigo.ads.ad.interstitial.r, sg.bigo.ads.ad.interstitial.i
    public final void m() {
        boolean z2;
        super.m();
        sg.bigo.ads.api.a.m mVar = ((sg.bigo.ads.ad.interstitial.a) this).f45741c;
        if (mVar != null) {
            z2 = this.L & (mVar.a("video_play_page.force_staying_time") != -1);
        } else {
            z2 = this.L & (((sg.bigo.ads.ad.interstitial.a) this).f45740b.a("interstitial_video_style.style") != 2);
        }
        this.L = z2;
        if (this.L) {
            return;
        }
        x xVar = this.f45743h;
        xVar.f46713b = 0;
        xVar.f46714c = -1;
    }

    @Override // sg.bigo.ads.ad.interstitial.z, sg.bigo.ads.ad.interstitial.b.a.InterfaceC0802a
    public final void a(boolean z2, boolean z3) {
        super.a(z2, z3);
        if (z2 || z3) {
            AdCountDownButton adCountDownButton = this.f46325A;
            if (adCountDownButton != null) {
                adCountDownButton.d();
            }
            ar();
        }
    }
}
