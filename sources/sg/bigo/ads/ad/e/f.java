package sg.bigo.ads.ad.e;

import android.app.Activity;
import sg.bigo.ads.ad.interstitial.AdCountDownButton;
import sg.bigo.ads.ad.interstitial.x;

/* JADX INFO: loaded from: classes7.dex */
public class f extends sg.bigo.ads.ad.interstitial.j.a {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    protected h f45713c;
    private boolean d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private boolean f45714e;

    public f(Activity activity) {
        super(activity);
        this.d = true;
        this.f45714e = false;
    }

    @Override // sg.bigo.ads.ad.interstitial.i, sg.bigo.ads.controller.e.b, sg.bigo.ads.api.core.BaseAdActivityImpl
    public final void N() {
        super.N();
        T t = this.y;
        if (t == 0) {
            return;
        }
        if (t instanceof h) {
            this.f45713c = (h) t;
        }
        if (this.f45713c == null || !ac()) {
            a("Illegal VPAID content.");
        }
    }

    @Override // sg.bigo.ads.ad.interstitial.i, sg.bigo.ads.controller.e.b, sg.bigo.ads.api.core.BaseAdActivityImpl
    public final void W() {
        if (this.d) {
            d(true);
        }
    }

    @Override // sg.bigo.ads.ad.interstitial.r
    public final int Y() {
        return 2;
    }

    @Override // sg.bigo.ads.ad.interstitial.j.a
    public final void a() {
        AdCountDownButton adCountDownButton = this.f46325A;
        if (adCountDownButton != null) {
            adCountDownButton.setShowCloseButtonInCountdown(false);
        }
        super.a();
    }

    @Override // sg.bigo.ads.ad.interstitial.i
    public final void d(boolean z2) {
        if (this.f46325A.getVisibility() == 0) {
            AdCountDownButton adCountDownButton = this.f46325A;
            if (adCountDownButton.f45723c) {
                if (!this.f45714e) {
                    adCountDownButton.d();
                    h hVar = this.f45713c;
                    if (hVar != null) {
                        this.f45714e = true;
                        hVar.H();
                    }
                }
                super.d(true);
            }
        }
    }

    @Override // sg.bigo.ads.ad.interstitial.j.a, sg.bigo.ads.ad.interstitial.r, sg.bigo.ads.ad.interstitial.i
    public final void m() {
        super.m();
        x xVar = ((sg.bigo.ads.ad.interstitial.j.a) this).f46343a;
        if (xVar != null) {
            xVar.f46714c = 15;
            xVar.f = true;
            xVar.g = false;
        }
    }
}
