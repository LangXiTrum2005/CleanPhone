package sg.bigo.ads.ad.interstitial.c;

import android.graphics.Rect;
import android.widget.Button;
import sg.bigo.ads.R;

/* JADX INFO: loaded from: classes7.dex */
public class h extends g {
    private Button t;

    public h(sg.bigo.ads.ad.b.c cVar, int i2, sg.bigo.ads.api.a.m mVar, sg.bigo.ads.ad.interstitial.e.c cVar2) {
        super(cVar, i2, mVar, cVar2);
    }

    @Override // sg.bigo.ads.ad.interstitial.c.g
    public final void a(int i2) {
        super.a(i2);
        Button button = (Button) this.k.findViewById(R.id.inter_btn_cta_main);
        this.t = button;
        if (button != null) {
            button.setVisibility(0);
            float fA = sg.bigo.ads.common.utils.e.a(this.k.getContext(), 8);
            this.t.setBackground(sg.bigo.ads.common.utils.d.a(fA, fA, fA, fA, (Rect) null, -16724924));
            this.t.setTextColor(sg.bigo.ads.ad.interstitial.d.f45976a);
            sg.bigo.ads.ad.interstitial.b.f45825a.a(this.t);
        }
    }

    @Override // sg.bigo.ads.ad.interstitial.c.g
    public final void m() {
        super.m();
        if (this.t == null || !j()) {
            return;
        }
        sg.bigo.ads.ad.interstitial.c.e(this.t);
    }
}
