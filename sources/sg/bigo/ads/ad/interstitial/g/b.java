package sg.bigo.ads.ad.interstitial.g;

import android.view.ViewGroup;
import android.widget.TextView;
import sg.bigo.ads.R;
import sg.bigo.ads.ad.interstitial.r;
import sg.bigo.ads.api.a.m;
import sg.bigo.ads.common.p;

/* JADX INFO: loaded from: classes7.dex */
public final class b extends a {
    protected TextView s;
    protected TextView t;

    public b(sg.bigo.ads.ad.b.c cVar, m mVar, p pVar) {
        super(cVar, mVar, pVar);
    }

    @Override // sg.bigo.ads.ad.interstitial.g.a
    public final void d(r rVar) {
        ViewGroup viewGroup = this.k;
        if (viewGroup == null || rVar == null) {
            return;
        }
        this.s = (TextView) viewGroup.findViewById(R.id.inter_title);
        this.t = (TextView) this.k.findViewById(R.id.inter_description);
        sg.bigo.ads.ad.interstitial.d.a(this.s, -234881024);
        sg.bigo.ads.ad.interstitial.d.a(this.t, -234881024);
    }

    @Override // sg.bigo.ads.ad.interstitial.g.a
    public final boolean g() {
        p pVar = ((a) this).f46291h;
        return pVar != null && pVar.f47363c > 960;
    }

    @Override // sg.bigo.ads.ad.interstitial.g.a
    public final int h() {
        return R.layout.bigo_ad_view_click_guide_1;
    }

    @Override // sg.bigo.ads.ad.interstitial.v
    public final boolean d() {
        return false;
    }
}
