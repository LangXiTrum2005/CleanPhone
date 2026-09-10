package sg.bigo.ads.ad.interstitial.j;

import android.app.Activity;
import sg.bigo.ads.R;
import sg.bigo.ads.ad.interstitial.d.w;

/* JADX INFO: loaded from: classes7.dex */
public class b extends a {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private w f46347c;

    public b(Activity activity) {
        super(activity);
    }

    private w b() {
        if (this.f46347c == null) {
            this.f46347c = sg.bigo.ads.ad.interstitial.d.a.a(this.C, ((a) this).f46344b, 0);
        }
        return this.f46347c;
    }

    @Override // sg.bigo.ads.ad.interstitial.i
    public final boolean O() {
        return true;
    }

    @Override // sg.bigo.ads.ad.interstitial.j.a, sg.bigo.ads.ad.interstitial.i
    public final int R() {
        return R.layout.bigo_ad_activity_popup_vpaid;
    }

    @Override // sg.bigo.ads.ad.interstitial.j.a, sg.bigo.ads.ad.interstitial.r, sg.bigo.ads.ad.interstitial.i
    public final void g(int i2) {
        super.g(i2);
        b().a(o(R.id.inter_container), o(R.id.media_layout));
        b().g(this.D);
    }
}
