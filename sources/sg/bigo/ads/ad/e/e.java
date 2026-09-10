package sg.bigo.ads.ad.e;

import android.app.Activity;
import android.view.View;
import sg.bigo.ads.ad.interstitial.AdCountDownButton;
import sg.bigo.ads.ad.interstitial.t;
import sg.bigo.ads.ad.interstitial.x;
import sg.bigo.ads.ad.interstitial.y;

/* JADX INFO: loaded from: classes7.dex */
class e extends y {
    protected h H;
    private boolean L;
    private boolean M;

    public e(Activity activity) {
        super(activity);
        this.L = true;
        this.M = false;
    }

    public static /* synthetic */ boolean d(e eVar) {
        eVar.M = true;
        return true;
    }

    public static /* synthetic */ boolean i(e eVar) {
        eVar.f45742e = true;
        return true;
    }

    @Override // sg.bigo.ads.ad.interstitial.y, sg.bigo.ads.ad.interstitial.a, sg.bigo.ads.ad.interstitial.i, sg.bigo.ads.ad.interstitial.k.b
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
        if (this.H == null) {
            a("Illegal static content.");
        }
    }

    @Override // sg.bigo.ads.ad.interstitial.i, sg.bigo.ads.controller.e.b, sg.bigo.ads.api.core.BaseAdActivityImpl
    public final void W() {
        if (this.L && c() == 0) {
            d(true);
        }
    }

    @Override // sg.bigo.ads.ad.interstitial.r
    public final int Y() {
        return ((sg.bigo.ads.ad.interstitial.a) this).f45740b.a("interstitial_video_style.video_play_page.icon_strategy") == 2 ? 2 : 1;
    }

    @Override // sg.bigo.ads.ad.interstitial.y, sg.bigo.ads.ad.interstitial.a
    public final void x() {
        super.x();
        AdCountDownButton adCountDownButton = this.f46325A;
        if (adCountDownButton != null) {
            adCountDownButton.setShowCloseButtonInCountdown(this.L);
        }
    }

    @Override // sg.bigo.ads.ad.interstitial.y, sg.bigo.ads.ad.interstitial.a
    public final void y() {
        AdCountDownButton adCountDownButton = this.f46325A;
        if (adCountDownButton == null) {
            return;
        }
        if (adCountDownButton.getVisibility() != 0) {
            this.f46325A.setVisibility(0);
            sg.bigo.ads.ad.interstitial.c.b((View) this.f46325A);
        }
        if (c() == 0) {
            int i2 = this.f45743h.f46714c;
            if (i2 < 0) {
                i2 = 15;
            }
            this.f46325A.a(i2, new AdCountDownButton.b() { // from class: sg.bigo.ads.ad.e.e.1
                @Override // sg.bigo.ads.ad.interstitial.AdCountDownButton.b
                public final void a() {
                    sg.bigo.ads.common.n.d.a(2, new Runnable() { // from class: sg.bigo.ads.ad.e.e.1.1
                        @Override // java.lang.Runnable
                        public final void run() {
                            if (e.this.f46325A != null) {
                                e.this.f46325A.d();
                            }
                            e eVar = e.this;
                            if (eVar.H == null || eVar.M) {
                                sg.bigo.ads.common.t.a.a(2, "", "Failed to claim reward because of null RewardVideoAd.");
                            } else {
                                e.d(e.this);
                                e.this.H.H();
                            }
                            if (e.this.r != null) {
                                e.this.r.y.a(null);
                            }
                            if (e.this.f45743h.j != 3 || e.this.f45742e) {
                                return;
                            }
                            e.i(e.this);
                            sg.bigo.ads.common.t.a.a(0, 4, "Interstitial Static", "auto click when force staying finish");
                            ((t) e.this.y).f46647z.a(8, 22);
                        }
                    });
                }
            });
        }
    }

    @Override // sg.bigo.ads.ad.interstitial.y, sg.bigo.ads.ad.interstitial.a
    public final x b() {
        x xVarB = super.b();
        if (!this.L) {
            xVarB.f46713b = 0;
            xVarB.f46714c = -1;
        }
        return xVarB;
    }

    @Override // sg.bigo.ads.ad.interstitial.y, sg.bigo.ads.ad.interstitial.a
    public final boolean f(boolean z2) {
        if (this.f45747p.get() && !this.M) {
            AdCountDownButton adCountDownButton = this.f46325A;
            if (adCountDownButton != null) {
                adCountDownButton.d();
            }
            h hVar = this.H;
            if (hVar != null) {
                this.M = true;
                hVar.H();
            }
        }
        return super.f(z2);
    }
}
