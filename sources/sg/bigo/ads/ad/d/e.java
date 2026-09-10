package sg.bigo.ads.ad.d;

import android.content.Context;
import sg.bigo.ads.ad.interstitial.t;
import sg.bigo.ads.api.popup.PopupAd;

/* JADX INFO: loaded from: classes7.dex */
public final class e extends t implements PopupAd {
    public e(sg.bigo.ads.api.core.g gVar) {
        super(gVar);
    }

    @Override // sg.bigo.ads.ad.interstitial.t, sg.bigo.ads.ad.interstitial.k
    public final Class<? extends sg.bigo.ads.controller.e.b<?>> A() {
        if (y()) {
            return F() ? sg.bigo.ads.ad.interstitial.j.b.class : h.class;
        }
        return g.class;
    }

    @Override // sg.bigo.ads.ad.interstitial.k
    public final void a(Context context) {
        if (sg.bigo.ads.controller.landing.d.a(context, A(), this)) {
            return;
        }
        a(2004, "This ad cannot be open");
    }
}
