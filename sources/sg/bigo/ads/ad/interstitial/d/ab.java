package sg.bigo.ads.ad.interstitial.d;

import android.view.ViewGroup;
import sg.bigo.ads.ad.interstitial.AdCountDownButton;

/* JADX INFO: loaded from: classes7.dex */
public class ab extends w {
    public ab(sg.bigo.ads.ad.b.c cVar, sg.bigo.ads.api.a.m mVar) {
        super(cVar, mVar);
    }

    @Override // sg.bigo.ads.ad.d.f
    public final void a(AdCountDownButton adCountDownButton, ViewGroup viewGroup, sg.bigo.ads.ad.d.f.a aVar) {
        if (viewGroup == null) {
            return;
        }
        if (this.o == null) {
            this.o = new sg.bigo.ads.ad.d.d();
        }
        this.o.a();
        this.o.a(viewGroup, m(), aVar);
    }
}
