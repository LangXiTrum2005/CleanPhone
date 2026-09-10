package sg.bigo.ads.ad.d;

import android.app.Activity;
import android.view.View;
import android.view.ViewGroup;
import sg.bigo.ads.R;
import sg.bigo.ads.ad.interstitial.AdCountDownButton;
import sg.bigo.ads.ad.interstitial.d.w;
import sg.bigo.ads.ad.interstitial.q;
import sg.bigo.ads.ad.interstitial.s;
import sg.bigo.ads.ad.interstitial.t;
import sg.bigo.ads.ad.interstitial.x;
import sg.bigo.ads.ad.interstitial.z;
import sg.bigo.ads.api.MediaView;
import sg.bigo.ads.api.VideoController;
import sg.bigo.ads.api.a.m;
import sg.bigo.ads.common.utils.n;
import sg.bigo.ads.controller.landing.LandingPageStyleConfig;

/* JADX INFO: loaded from: classes7.dex */
public class h extends z implements f.a {
    private w H;
    private sg.bigo.ads.ad.interstitial.c.w L;

    public h(Activity activity) {
        super(activity);
        activity.overridePendingTransition(0, 0);
    }

    private boolean ar() {
        sg.bigo.ads.core.a.a aVarF = ((t) this.y).f();
        sg.bigo.ads.ad.interstitial.a.b bVar = ((t) this.y).f46643A;
        return (aVarF.bh() == null) && (bVar == null || !bVar.b());
    }

    private w as() {
        if (this.H == null) {
            this.H = sg.bigo.ads.ad.interstitial.d.a.a(this.C, ((sg.bigo.ads.ad.interstitial.a) this).f45741c, n());
        }
        return this.H;
    }

    private sg.bigo.ads.ad.interstitial.c.w at() {
        if (this.L == null) {
            this.L = sg.bigo.ads.ad.interstitial.d.a.b(this.C, ((sg.bigo.ads.ad.interstitial.a) this).f45741c, n());
        }
        return this.L;
    }

    @Override // sg.bigo.ads.ad.interstitial.a
    public final void I() {
        MediaView mediaView;
        ViewGroup viewGroup = this.D;
        if (viewGroup == null || (mediaView = (MediaView) viewGroup.findViewById(R.id.inter_media)) == null) {
            return;
        }
        as().a((ViewGroup) mediaView);
    }

    @Override // sg.bigo.ads.ad.interstitial.i
    public final boolean O() {
        return true;
    }

    @Override // sg.bigo.ads.ad.interstitial.z, sg.bigo.ads.ad.interstitial.i
    public final int R() {
        int iN = n();
        if (iN == 2) {
            return R.layout.bigo_ad_activity_pop_up_style_2;
        }
        if (iN == 3) {
            return R.layout.bigo_ad_activity_pop_up_style_3;
        }
        if (iN == 4) {
            return R.layout.bigo_ad_activity_pop_up_style_4;
        }
        if (iN != 5) {
            return iN != 6 ? R.layout.bigo_ad_activity_pop_up_style_1 : R.layout.bigo_ad_activity_pop_up_style_6;
        }
        return R.layout.bigo_ad_activity_pop_up_style_5;
    }

    @Override // sg.bigo.ads.ad.interstitial.i, sg.bigo.ads.controller.e.b, sg.bigo.ads.api.core.BaseAdActivityImpl
    public final void X() {
        super.X();
        this.f47011I.overridePendingTransition(0, 0);
    }

    @Override // sg.bigo.ads.ad.interstitial.a
    public final void a(ViewGroup viewGroup) {
        as().c(viewGroup);
    }

    @Override // sg.bigo.ads.ad.interstitial.z
    public final boolean ad() {
        at().i();
        return false;
    }

    @Override // sg.bigo.ads.ad.interstitial.z
    public final boolean aj() {
        return !this.f45747p.get();
    }

    @Override // sg.bigo.ads.ad.interstitial.z
    public final LandingPageStyleConfig an() {
        int iN = at().n();
        int iO = at().o();
        ViewGroup viewGroup = this.D;
        return new LandingPageStyleConfig(sg.bigo.ads.ad.interstitial.f.e.class, 1, iN, iO, viewGroup != null ? viewGroup.getMeasuredHeight() : 0, s.a(this.C, 0), 0.8f);
    }

    @Override // sg.bigo.ads.ad.interstitial.z, sg.bigo.ads.ad.interstitial.a
    public final x b() {
        x xVar = new x();
        m mVar = ((sg.bigo.ads.ad.interstitial.a) this).f45741c;
        if (mVar != null) {
            xVar.f = mVar.c("video_play_page.media_view_clickable_switch");
            xVar.f46716h = ((sg.bigo.ads.ad.interstitial.a) this).f45741c.c("video_play_page.ad_component_clickable_switch");
            xVar.g = ((sg.bigo.ads.ad.interstitial.a) this).f45741c.c("video_play_page.other_space_clickable_switch");
            xVar.f46717i = ((sg.bigo.ads.ad.interstitial.a) this).f45741c.a("video_play_page.click_type");
            xVar.k = ((sg.bigo.ads.ad.interstitial.a) this).f45741c.c("layer.other_space_clickable_switch");
            xVar.f46718l = ((sg.bigo.ads.ad.interstitial.a) this).f45741c.a("layer.click_type");
            xVar.f46714c = ((sg.bigo.ads.ad.interstitial.a) this).f45741c.a("video_play_page.force_staying_time");
            xVar.f46715e = ((sg.bigo.ads.ad.interstitial.a) this).f45741c.a("layer.force_staying_time");
            xVar.j = ((sg.bigo.ads.ad.interstitial.a) this).f45741c.a("video_play_page.auto_click");
            xVar.m = ((sg.bigo.ads.ad.interstitial.a) this).f45741c.a("video_play_page.time_for_auto_click", -1);
            xVar.f46719n = ((sg.bigo.ads.ad.interstitial.a) this).f45741c.a("video_play_page.time_for_show_backup", -1);
            this.d = true;
            xVar.f46712a = false;
            xVar.f46713b = 0;
            xVar.d = false;
        }
        return xVar;
    }

    @Override // sg.bigo.ads.ad.d.f.a
    public final void d_() {
        e(true);
    }

    @Override // sg.bigo.ads.ad.interstitial.z, sg.bigo.ads.ad.interstitial.a
    public final boolean f(boolean z2) {
        int iC = c();
        if (!J() || iC != 0) {
            return z2;
        }
        b(true);
        l(3);
        return c() == 0;
    }

    @Override // sg.bigo.ads.ad.interstitial.z, sg.bigo.ads.ad.interstitial.a, sg.bigo.ads.ad.interstitial.r, sg.bigo.ads.ad.interstitial.i
    public final void g(int i2) {
        super.g(i2);
        if (this.D == null) {
            return;
        }
        q qVar = this.r;
        if (qVar != null) {
            qVar.b();
        }
        as().g(this.D);
        as().h(this.D);
        as().d(this.D);
        as().a(o(R.id.inter_container), this.D.findViewById(R.id.media_layout));
    }

    @Override // sg.bigo.ads.ad.interstitial.z, sg.bigo.ads.ad.interstitial.a, sg.bigo.ads.ad.interstitial.r, sg.bigo.ads.ad.interstitial.i
    public final void h() {
        super.h();
        if (this.f46325A == null) {
            as().q();
            at().q();
        }
    }

    @Override // sg.bigo.ads.ad.interstitial.z, sg.bigo.ads.api.VideoController.a
    public final void i(boolean z2) {
        super.i(z2);
        ae();
    }

    @Override // sg.bigo.ads.ad.interstitial.z, sg.bigo.ads.ad.interstitial.a, sg.bigo.ads.ad.interstitial.r, sg.bigo.ads.ad.interstitial.i
    public final void j() {
        super.j();
        if (this.f46325A == null) {
            as().p();
            at().p();
        }
    }

    @Override // sg.bigo.ads.ad.interstitial.z
    public final void k(int i2) {
        as();
        w.a(this.D, this.f45745l);
        n nVarE = as().e(this.D);
        this.f45748u = nVarE;
        if (nVarE == null) {
            as().f(this.D);
        }
    }

    @Override // sg.bigo.ads.ad.interstitial.z
    public final void l(int i2) {
        int iA;
        if (this.D == null) {
            return;
        }
        if (c() != 0) {
            sg.bigo.ads.common.t.a.a(0, "PopupVideoActivityImpl", "end page can be shown but current page is not main");
            return;
        }
        if (this.f45747p.get() && ar()) {
            return;
        }
        View viewFindViewById = this.D.findViewById(R.id.inter_btn_cta);
        if (viewFindViewById != null) {
            viewFindViewById.setBackgroundColor(this.f45746n);
        }
        View viewFindViewById2 = this.D.findViewById(R.id.inter_btn_mute);
        if (viewFindViewById2 != null) {
            viewFindViewById2.setVisibility(4);
        }
        MediaView mediaView = (MediaView) this.D.findViewById(R.id.inter_media);
        if (mediaView == null || (iA = at().a(mediaView, (t) this.y, this.f45747p.get())) == 0) {
            return;
        }
        at().g(this.D);
        at().c(this.D);
        at().f(this.D);
        at().a(this.f46325A, this.D, this);
        at().d(this.D);
        f(iA);
        sg.bigo.ads.core.d.b.a((sg.bigo.ads.api.core.c) ((t) this.y).f(), c(), i2);
    }

    @Override // sg.bigo.ads.ad.interstitial.a
    public final void p() {
        as().a(this.f46325A, this.D, this);
    }

    @Override // sg.bigo.ads.ad.interstitial.z, sg.bigo.ads.ad.interstitial.a
    public final void s() {
        e(true);
    }

    @Override // sg.bigo.ads.ad.interstitial.a
    public final void u() {
    }

    @Override // sg.bigo.ads.ad.interstitial.z, sg.bigo.ads.ad.interstitial.a
    public final void x() {
        super.x();
        AdCountDownButton adCountDownButton = this.f46325A;
        if (adCountDownButton != null) {
            adCountDownButton.setShowCloseButtonInCountdown(false);
            this.f46325A.setTakeoverTickEvent(false);
        }
    }

    @Override // sg.bigo.ads.ad.interstitial.a
    public final void a(boolean z2) {
    }

    @Override // sg.bigo.ads.ad.interstitial.z, sg.bigo.ads.ad.interstitial.b.a.InterfaceC0802a
    public final void a(boolean z2, boolean z3) {
        AdCountDownButton adCountDownButton = this.f46325A;
        if (adCountDownButton != null) {
            adCountDownButton.d();
        }
        if (z3 && c() == 0) {
            a(((z) this).G, new Runnable() { // from class: sg.bigo.ads.ad.d.h.1
                @Override // java.lang.Runnable
                public final void run() {
                    h.this.ag();
                    if (h.this.J()) {
                        h.this.l(1);
                        return;
                    }
                    VideoController videoControllerAa = h.this.aa();
                    if (videoControllerAa != null) {
                        videoControllerAa.play();
                    }
                }
            });
        }
    }
}
