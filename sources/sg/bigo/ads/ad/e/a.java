package sg.bigo.ads.ad.e;

import android.app.Activity;
import android.view.View;
import sg.bigo.ads.ad.interstitial.AdCountDownButton;
import sg.bigo.ads.ad.interstitial.m;
import sg.bigo.ads.ad.interstitial.n;
import sg.bigo.ads.ad.interstitial.o;
import sg.bigo.ads.common.utils.r;

/* JADX INFO: loaded from: classes7.dex */
class a extends m {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    protected b f45694b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f45695c;
    private boolean d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private boolean f45696e;
    private boolean f;

    public a(Activity activity) {
        super(activity);
        this.f45695c = true;
        this.d = false;
        this.f45696e = false;
        this.f = false;
    }

    public static /* synthetic */ boolean c(a aVar) {
        aVar.f = true;
        return true;
    }

    public static /* synthetic */ boolean s(a aVar) {
        aVar.f45696e = true;
        return true;
    }

    @Override // sg.bigo.ads.ad.interstitial.i, sg.bigo.ads.controller.e.b, sg.bigo.ads.api.core.BaseAdActivityImpl
    public final void N() {
        super.N();
        T t = this.y;
        if (t == 0) {
            return;
        }
        if (t instanceof b) {
            this.f45694b = (b) t;
        }
        if (this.f45694b == null) {
            a("Illegal reward banner content.");
        }
        if (this.f46325A.getVisibility() != 0) {
            this.f46325A.setVisibility(0);
            sg.bigo.ads.ad.interstitial.c.b((View) this.f46325A);
        }
    }

    @Override // sg.bigo.ads.ad.interstitial.i, sg.bigo.ads.controller.e.b, sg.bigo.ads.api.core.BaseAdActivityImpl
    public final void W() {
        if (this.f45695c) {
            d(true);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b() {
        b bVar = this.f45694b;
        if (bVar != null && !this.d) {
            this.d = true;
            bVar.D();
        } else if (bVar == null) {
            sg.bigo.ads.common.t.a.a(2, "", "Failed to claim reward because of null RewardVideoAd.");
        }
    }

    @Override // sg.bigo.ads.ad.interstitial.m
    public final void a() {
        T t = this.y;
        if (t == 0) {
            return;
        }
        n nVarC = ((o) t).C();
        if (nVarC == null) {
            this.f46325A.a(15, new AdCountDownButton.b() { // from class: sg.bigo.ads.ad.e.a.1
                @Override // sg.bigo.ads.ad.interstitial.AdCountDownButton.b
                public final void a() {
                    sg.bigo.ads.common.n.d.b(new Runnable() { // from class: sg.bigo.ads.ad.e.a.1.1
                        @Override // java.lang.Runnable
                        public final void run() {
                            if (a.this.f46325A != null) {
                                a.this.f46325A.d();
                            }
                            a.c(a.this);
                            a.this.b();
                        }
                    });
                }
            });
            return;
        }
        int i2 = nVarC.f46446b;
        if (i2 < 0) {
            this.f46325A.setShowCloseButtonInCountdown(false);
        }
        this.f46325A.setTakeoverTickEvent(true);
        this.f46325A.a(i2, (AdCountDownButton.b) null);
        int i3 = nVarC.f46448e;
        sg.bigo.ads.common.utils.n nVar = new sg.bigo.ads.common.utils.n(r.f47535a.a(i3 >= 5 ? i3 : 15)) { // from class: sg.bigo.ads.ad.e.a.2
            @Override // sg.bigo.ads.common.utils.n
            public final void a() {
                sg.bigo.ads.common.n.d.a(2, new Runnable() { // from class: sg.bigo.ads.ad.e.a.2.1
                    @Override // java.lang.Runnable
                    public final void run() {
                        if (a.this.f46325A != null) {
                            a.this.f46325A.d();
                        }
                        a.c(a.this);
                        a.this.b();
                    }
                });
            }

            @Override // sg.bigo.ads.common.utils.n
            public final void a(long j) {
                if (a.this.f46325A != null) {
                    a.this.f46325A.a(j);
                }
            }
        };
        ((m) this).f46358a = nVar;
        nVar.c();
    }

    @Override // sg.bigo.ads.ad.interstitial.i
    public final void d(boolean z2) {
        if (this.f46325A.getVisibility() == 0) {
            AdCountDownButton adCountDownButton = this.f46325A;
            if (adCountDownButton.f45723c) {
                if (!this.f45696e && !this.f) {
                    new c(this.f47011I).a(new c.a() { // from class: sg.bigo.ads.ad.e.a.3
                        @Override // sg.bigo.ads.ad.e.c.a
                        public final void a() {
                            if (((m) a.this).f46358a != null) {
                                ((m) a.this).f46358a.d();
                            }
                            if (a.this.f46325A != null) {
                                a.this.f46325A.b();
                            }
                        }

                        @Override // sg.bigo.ads.ad.e.c.a
                        public final void b() {
                            if (((m) a.this).f46358a != null && ((m) a.this).f46358a.e()) {
                                ((m) a.this).f46358a.c();
                            }
                            if (a.this.f46325A == null || a.this.f46325A.f45723c) {
                                return;
                            }
                            a.this.f46325A.c();
                        }

                        @Override // sg.bigo.ads.ad.e.c.a
                        public final void c() {
                            a.s(a.this);
                            a.this.T();
                        }

                        @Override // sg.bigo.ads.ad.e.c.a
                        public final void d() {
                        }
                    });
                    return;
                }
                adCountDownButton.d();
                b();
                super.d(true);
            }
        }
    }

    @Override // sg.bigo.ads.ad.interstitial.m, sg.bigo.ads.ad.interstitial.i
    public final void g(int i2) {
        super.g(i2);
    }
}
