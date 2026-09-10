package sg.bigo.ads.ad.interstitial.c;

import android.view.View;
import android.view.ViewGroup;
import sg.bigo.ads.R;

/* JADX INFO: loaded from: classes7.dex */
public final class x extends w {
    public x(sg.bigo.ads.ad.b.c cVar, sg.bigo.ads.api.a.m mVar) {
        super(cVar, mVar);
    }

    @Override // sg.bigo.ads.ad.interstitial.c.w, sg.bigo.ads.ad.d.f
    public final void d(ViewGroup viewGroup) {
        View viewFindViewById;
        super.d(viewGroup);
        if (!((w) this).k || viewGroup == null || (viewFindViewById = viewGroup.findViewById(R.id.inter_btn_cta)) == null) {
            return;
        }
        viewFindViewById.setVisibility(8);
    }
}
