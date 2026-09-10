package sg.bigo.ads.ad.interstitial;

import android.app.Activity;
import android.view.View;
import android.widget.RelativeLayout;
import sg.bigo.ads.R;

/* JADX INFO: loaded from: classes7.dex */
public class m extends i<o> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public sg.bigo.ads.common.utils.n f46358a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private RelativeLayout f46359b;

    public m(Activity activity) {
        super(activity);
    }

    @Override // sg.bigo.ads.ad.interstitial.i, sg.bigo.ads.api.core.BaseAdActivityImpl
    public void D() {
        super.D();
        RelativeLayout relativeLayout = this.f46359b;
        if (relativeLayout != null) {
            relativeLayout.removeAllViews();
        }
        sg.bigo.ads.common.utils.n nVar = this.f46358a;
        if (nVar != null) {
            nVar.b();
            this.f46358a = null;
        }
    }

    @Override // sg.bigo.ads.ad.interstitial.i
    public int R() {
        return R.layout.bigo_ad_activity_interstitial_banner;
    }

    @Override // sg.bigo.ads.ad.interstitial.i
    public final boolean S() {
        return false;
    }

    public void a() {
        n nVarC;
        T t = this.y;
        if (t == 0 || (nVarC = ((o) t).C()) == null) {
            return;
        }
        int iMax = Math.max(nVarC.f46446b, 0);
        this.f46325A.setTakeoverTickEvent(true);
        this.f46325A.a(iMax, (AdCountDownButton.b) null);
        sg.bigo.ads.common.utils.n nVar = new sg.bigo.ads.common.utils.n(sg.bigo.ads.common.utils.r.f47535a.a(Math.max(nVarC.f46448e, 0))) { // from class: sg.bigo.ads.ad.interstitial.m.2
            @Override // sg.bigo.ads.common.utils.n
            public final void a() {
                AdCountDownButton adCountDownButton = m.this.f46325A;
                if (adCountDownButton != null) {
                    adCountDownButton.d();
                    m.this.f46325A.setTakeoverTickEvent(false);
                }
            }

            @Override // sg.bigo.ads.common.utils.n
            public final void a(long j) {
                AdCountDownButton adCountDownButton = m.this.f46325A;
                if (adCountDownButton != null) {
                    adCountDownButton.a(j);
                }
            }
        };
        this.f46358a = nVar;
        nVar.c();
    }

    @Override // sg.bigo.ads.ad.interstitial.i
    public final boolean f() {
        return false;
    }

    @Override // sg.bigo.ads.ad.interstitial.i
    public void g(int i2) {
        T t = this.y;
        if (t == 0) {
            a("Illegal InterstitialAd.");
            return;
        }
        ((o) t).f46449A = new sg.bigo.ads.ad.banner.h() { // from class: sg.bigo.ads.ad.interstitial.m.1
            @Override // sg.bigo.ads.ad.banner.h
            public final void a() {
                m.this.d(true);
            }

            @Override // sg.bigo.ads.ad.banner.h
            public final void b() {
            }

            @Override // sg.bigo.ads.ad.banner.h
            public final void a(String str) {
            }

            @Override // sg.bigo.ads.ad.banner.h
            public final void a(sg.bigo.ads.common.i iVar, sg.bigo.ads.api.core.e eVar) {
            }
        };
        this.f46359b = (RelativeLayout) this.f46330z.findViewById(R.id.inter_banner_container);
        ((o) this.y).a(this.f46325A, o(R.id.click_proxy));
        o oVar = (o) this.y;
        if (!sg.bigo.ads.common.n.d.b()) {
            sg.bigo.ads.common.utils.t.a("adView() must run on UI thread");
        }
        View viewC = oVar.f46452z.c();
        oVar.a(viewC, false);
        if (viewC != null) {
            sg.bigo.ads.common.utils.u.a(viewC, this.f46359b, androidx.media3.extractor.text.ttml.a.f(-1, -1, 13), 0);
        }
        a();
    }

    @Override // sg.bigo.ads.ad.interstitial.i
    public final void h() {
        super.h();
        sg.bigo.ads.common.utils.n nVar = this.f46358a;
        if (nVar == null || !nVar.e()) {
            return;
        }
        this.f46358a.c();
    }

    @Override // sg.bigo.ads.ad.interstitial.i
    public final void j() {
        super.j();
        sg.bigo.ads.common.utils.n nVar = this.f46358a;
        if (nVar != null) {
            nVar.d();
        }
    }

    @Override // sg.bigo.ads.ad.interstitial.i
    public final void m() {
    }
}
