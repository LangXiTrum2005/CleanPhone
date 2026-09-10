package sg.bigo.ads.ad.interstitial.c;

import android.util.Pair;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import sg.bigo.ads.R;

/* JADX INFO: loaded from: classes7.dex */
public class t extends s {
    public t(sg.bigo.ads.ad.b.c cVar, int i2, sg.bigo.ads.api.a.m mVar, sg.bigo.ads.ad.interstitial.multi_img.b bVar, sg.bigo.ads.ad.interstitial.e.c cVar2) {
        super(cVar, i2, mVar, bVar, cVar2);
    }

    @Override // sg.bigo.ads.ad.interstitial.c.s, sg.bigo.ads.ad.interstitial.c.b
    public final void g(sg.bigo.ads.ad.interstitial.r rVar) {
        super.g(rVar);
        this.r.setVisibility(4);
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.f45877l.getLayoutParams();
        marginLayoutParams.topMargin = sg.bigo.ads.common.utils.e.a(this.f45877l.getContext(), 0);
        this.f45877l.setLayoutParams(marginLayoutParams);
    }

    @Override // sg.bigo.ads.ad.interstitial.c.s, sg.bigo.ads.ad.interstitial.c.a
    public final int h() {
        return R.layout.bigo_ad_activity_interstitial_rich_video_end_7;
    }

    @Override // sg.bigo.ads.ad.interstitial.c.s, sg.bigo.ads.ad.interstitial.c.a
    public final void a(sg.bigo.ads.ad.interstitial.r rVar, int i2) {
        super.a(rVar, i2);
        if (this.g == null) {
            return;
        }
        final View viewFindViewById = this.k.findViewById(R.id.inter_btn_cta_layout);
        final Button button = (Button) this.k.findViewById(R.id.inter_btn_cta);
        if (button == null) {
            return;
        }
        int iMax = Math.max(1, i2);
        final Pair<Integer, Boolean> pairE = e(rVar);
        button.postDelayed(new Runnable() { // from class: sg.bigo.ads.ad.interstitial.c.t.1
            @Override // java.lang.Runnable
            public final void run() {
                if (sg.bigo.ads.ad.c.a((sg.bigo.ads.ad.c) t.this.f)) {
                    return;
                }
                sg.bigo.ads.ad.interstitial.d.a(button, ((Integer) pairE.first).intValue(), new sg.bigo.ads.common.w.b.a() { // from class: sg.bigo.ads.ad.interstitial.c.t.1.1
                    @Override // sg.bigo.ads.common.w.b.a
                    public final void b(int i3) {
                        AnonymousClass1 anonymousClass1 = AnonymousClass1.this;
                        if (viewFindViewById == null || !((Boolean) pairE.second).booleanValue()) {
                            return;
                        }
                        sg.bigo.ads.ad.interstitial.c.e(viewFindViewById);
                    }
                });
            }
        }, ((long) iMax) * 1000);
    }
}
