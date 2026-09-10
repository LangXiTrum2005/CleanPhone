package sg.bigo.ads.ad.interstitial;

import android.app.Activity;
import android.view.ViewGroup;
import android.widget.Button;
import sg.bigo.ads.R;
import sg.bigo.ads.api.VideoController;

/* JADX INFO: loaded from: classes7.dex */
public abstract class r extends i<t> {

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    public static final sg.bigo.ads.core.adview.h f46631F = new sg.bigo.ads.core.adview.h() { // from class: sg.bigo.ads.ad.interstitial.r.1
        @Override // sg.bigo.ads.core.adview.h
        public final void a(int i2, int i3, int i4, int i5, int i6, int i7) {
            sg.bigo.ads.common.t.a.a(0, 4, "emptyClick", "emptyClick stop event Propagation");
        }
    };
    protected sg.bigo.ads.ad.b.c C;
    protected ViewGroup D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    protected Button f46632E;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private u f46633a;

    public r(Activity activity) {
        super(activity);
    }

    @Override // sg.bigo.ads.ad.interstitial.i, sg.bigo.ads.api.core.BaseAdActivityImpl
    public void D() {
        super.D();
        VideoController videoControllerAa = aa();
        if (videoControllerAa != null) {
            videoControllerAa.setVideoLifeCallback(null);
            videoControllerAa.setLoadHTMLCallback(null);
            videoControllerAa.setProgressChangeListener(null);
        }
    }

    public int Y() {
        return 1;
    }

    public final u Z() {
        if (this.f46633a == null) {
            this.f46633a = aq() ? sg.bigo.ads.ad.interstitial.d.a.a(this.C) : sg.bigo.ads.ad.interstitial.d.a.a(this.C, n());
        }
        return this.f46633a;
    }

    public final VideoController aa() {
        sg.bigo.ads.ad.b.c cVar = this.C;
        if (cVar != null) {
            return cVar.getVideoController();
        }
        return null;
    }

    public final boolean ab() {
        T t = this.y;
        return t != 0 && ((t) t).y();
    }

    public final boolean ac() {
        T t = this.y;
        return t != 0 && ((t) t).F();
    }

    @Override // sg.bigo.ads.ad.interstitial.i
    public void g(int i2) {
        ViewGroup viewGroup = (ViewGroup) o(R.id.inter_native_ad_view);
        this.D = viewGroup;
        if (viewGroup == null) {
            a("can not find ad root view.");
        }
    }

    @Override // sg.bigo.ads.ad.interstitial.i
    public void h() {
        super.h();
        sg.bigo.ads.common.t.a.a(0, 3, "InterstitialPage", "performResume");
        u uVar = this.f46633a;
        if (uVar != null) {
            uVar.b();
        }
    }

    @Override // sg.bigo.ads.ad.interstitial.i
    public void j() {
        sg.bigo.ads.common.t.a.a(0, 3, "InterstitialPage", "performPause");
        u uVar = this.f46633a;
        if (uVar != null) {
            uVar.c();
        }
        if (ab()) {
            h(true);
        } else {
            super.j();
        }
    }

    @Override // sg.bigo.ads.ad.interstitial.i
    public void m() {
        this.C = ((t) this.y).f46647z;
    }

    public abstract int n();
}
