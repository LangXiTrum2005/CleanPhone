package sg.bigo.ads.ad.e;

import android.app.Activity;
import sg.bigo.ads.ad.interstitial.AdCountDownButton;
import sg.bigo.ads.common.utils.n;
import sg.bigo.ads.common.utils.r;

/* JADX INFO: loaded from: classes7.dex */
public class d extends sg.bigo.ads.ad.interstitial.h.a {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private h f45706e;
    private boolean f;
    private boolean g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private n f45707h;

    public d(Activity activity) {
        super(activity);
        this.f = false;
        this.g = false;
    }

    public static /* synthetic */ void h(d dVar) {
        n nVar = dVar.f45707h;
        if (nVar != null) {
            nVar.d();
        }
        AdCountDownButton adCountDownButton = dVar.f46325A;
        if (adCountDownButton != null) {
            adCountDownButton.b();
        }
    }

    public static /* synthetic */ boolean i(d dVar) {
        dVar.g = true;
        return true;
    }

    public static /* synthetic */ void k(d dVar) {
        n nVar = dVar.f45707h;
        if (nVar != null) {
            nVar.c();
        }
        AdCountDownButton adCountDownButton = dVar.f46325A;
        if (adCountDownButton != null) {
            adCountDownButton.c();
        }
    }

    @Override // sg.bigo.ads.ad.interstitial.h.a, sg.bigo.ads.ad.interstitial.i, sg.bigo.ads.controller.e.b, sg.bigo.ads.api.core.BaseAdActivityImpl
    public final void N() {
        super.N();
        T t = this.y;
        if (t == 0) {
            return;
        }
        if (t instanceof h) {
            this.f45706e = (h) t;
        } else {
            a("Illegal SAB content.");
        }
        if (this.f46325A != null) {
            this.f45707h = new n(r.f47535a.a(1)) { // from class: sg.bigo.ads.ad.e.d.1
                @Override // sg.bigo.ads.common.utils.n
                public final void a() {
                    sg.bigo.ads.common.n.d.a(2, new Runnable() { // from class: sg.bigo.ads.ad.e.d.1.1
                        @Override // java.lang.Runnable
                        public final void run() {
                            if (d.this.f45706e == null || d.this.f) {
                                sg.bigo.ads.common.t.a.a(2, "", "Failed to claim reward because of null RewardVideoAd.");
                            } else {
                                d.e(d.this);
                                d.this.f45706e.H();
                            }
                            if (d.this.f46325A != null) {
                                d.this.f46325A.d();
                            }
                        }
                    });
                }

                @Override // sg.bigo.ads.common.utils.n
                public final void a(long j) {
                    if (d.this.f46325A != null) {
                        d.this.f46325A.a(j);
                    }
                }
            };
            this.f46325A.setVisibility(0);
            this.f46325A.setTakeoverTickEvent(true);
            this.f46325A.setShowCloseButtonInCountdown(true);
            this.f46325A.a(1, (AdCountDownButton.b) null);
            this.f45707h.c();
        }
    }

    @Override // sg.bigo.ads.ad.interstitial.i
    public final void d(boolean z2) {
        if (this.f46325A.getVisibility() != 0) {
            return;
        }
        if (!this.f) {
            new c(this.f47011I).a(new c.a() { // from class: sg.bigo.ads.ad.e.d.2
                @Override // sg.bigo.ads.ad.e.c.a
                public final void a() {
                    d.h(d.this);
                }

                @Override // sg.bigo.ads.ad.e.c.a
                public final void b() {
                }

                @Override // sg.bigo.ads.ad.e.c.a
                public final void c() {
                    d.i(d.this);
                    d.this.T();
                }

                @Override // sg.bigo.ads.ad.e.c.a
                public final void d() {
                    d.k(d.this);
                }
            });
            return;
        }
        n nVar = this.f45707h;
        if (nVar != null) {
            nVar.b();
            this.f45707h = null;
        }
        AdCountDownButton adCountDownButton = this.f46325A;
        if (adCountDownButton != null) {
            adCountDownButton.d();
        }
        super.d(true);
    }

    @Override // sg.bigo.ads.ad.interstitial.h.a
    public final boolean e() {
        return true;
    }

    public static /* synthetic */ boolean e(d dVar) {
        dVar.f = true;
        return true;
    }

    @Override // sg.bigo.ads.ad.interstitial.h.a
    public final boolean k() {
        return this.f;
    }
}
