package sg.bigo.ads.ad.interstitial.c;

import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import sg.bigo.ads.R;
import sg.bigo.ads.common.view.RoundedImageView;

/* JADX INFO: loaded from: classes7.dex */
public class i extends g {
    private View t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private RoundedImageView f45916u;

    public i(sg.bigo.ads.ad.b.c cVar, int i2, sg.bigo.ads.api.a.m mVar, sg.bigo.ads.ad.interstitial.e.c cVar2) {
        super(cVar, i2, mVar, cVar2);
    }

    @Override // sg.bigo.ads.ad.interstitial.c.g, sg.bigo.ads.ad.interstitial.c.a
    public final void d(final sg.bigo.ads.ad.interstitial.r rVar) {
        super.d(rVar);
        ViewGroup viewGroup = this.k;
        if (viewGroup == null) {
            return;
        }
        this.t = viewGroup.findViewById(R.id.inter_end_page_image_layout);
        this.f45916u = (RoundedImageView) this.k.findViewById(R.id.inter_end_page_image);
        sg.bigo.ads.common.utils.u.a(this.t, new sg.bigo.ads.common.utils.u.a() { // from class: sg.bigo.ads.ad.interstitial.c.i.1
            @Override // sg.bigo.ads.common.utils.u.a
            public final void a(Rect rect) {
                int iA;
                float fA;
                int i2;
                int i3;
                sg.bigo.ads.common.p pVarB = i.this.b(rVar);
                if (pVarB.a(rect.width(), rect.height())) {
                    i3 = -1;
                    fA = 0.0f;
                    iA = 0;
                    i2 = -1;
                } else {
                    iA = sg.bigo.ads.common.utils.e.a(i.this.f45916u.getContext(), 20);
                    int i4 = iA * 2;
                    sg.bigo.ads.common.p pVarA = sg.bigo.ads.common.p.a(pVarB.f47362b, pVarB.f47363c, rect.width() - i4, rect.height() - i4);
                    int i5 = pVarA.f47362b;
                    int i6 = pVarA.f47363c;
                    fA = sg.bigo.ads.common.utils.e.a(i.this.f45916u.getContext(), 8);
                    i2 = i6;
                    i3 = i5;
                }
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) i.this.f45916u.getLayoutParams();
                marginLayoutParams.setMargins(iA, iA, iA, iA);
                marginLayoutParams.width = i3;
                marginLayoutParams.height = i2;
                i.this.f45916u.requestLayout();
                i.this.f45916u.setCornerRadius(fA);
            }
        });
        TextView textView = this.f45877l;
        if (textView != null) {
            sg.bigo.ads.ad.interstitial.d.a(textView, -1);
        }
    }

    @Override // sg.bigo.ads.ad.interstitial.c.g, sg.bigo.ads.ad.interstitial.c.a
    public final int h() {
        return R.layout.bigo_ad_activity_interstitial_rich_video_end_16_17;
    }

    @Override // sg.bigo.ads.ad.interstitial.c.g
    public final void l() {
        View view = this.o;
        if (view != null) {
            view.setBackgroundColor(-1);
        }
    }

    @Override // sg.bigo.ads.ad.interstitial.v
    public final boolean d() {
        sg.bigo.ads.core.a.a aVar;
        sg.bigo.ads.ad.b.c cVar = this.f;
        if (cVar == null || (aVar = (sg.bigo.ads.core.a.a) cVar.f()) == null) {
            return true;
        }
        return aVar.aR();
    }

    @Override // sg.bigo.ads.ad.interstitial.c.g, sg.bigo.ads.ad.interstitial.c.a
    public final void a(double d) {
    }

    @Override // sg.bigo.ads.ad.interstitial.c.g, sg.bigo.ads.ad.interstitial.c.a
    public final void a(int i2, boolean z2, boolean z3) {
        sg.bigo.ads.ad.b.a.a(this.f45916u, 5);
        if (z2) {
            sg.bigo.ads.ad.b.a.a(this.j, this.f45916u, 4, this.f, i2);
        } else {
            sg.bigo.ads.ad.b.a.a(this.j, this.f45916u, 4, sg.bigo.ads.ad.interstitial.r.f46631F, 0);
        }
        sg.bigo.ads.ad.b.a.a(this.t, 9);
        ViewGroup viewGroup = this.j;
        if (z3) {
            sg.bigo.ads.ad.b.a.a(viewGroup, this.t, 4, this.f, i2);
        } else {
            sg.bigo.ads.ad.b.a.a(viewGroup, this.t, 4, sg.bigo.ads.ad.interstitial.r.f46631F, 0);
        }
        sg.bigo.ads.api.a.m mVar = this.g;
        boolean z4 = true;
        if (mVar != null && mVar.a("endpage.ad_component_clickable_switch") != 1) {
            z4 = false;
        }
        View view = this.o;
        if (view != null) {
            sg.bigo.ads.ad.b.a.a(view, 18);
            if (z4) {
                sg.bigo.ads.ad.b.a.a(this.j, this.o, 8, this.f, i2);
            } else {
                sg.bigo.ads.ad.b.a.a(this.j, this.o, 8, sg.bigo.ads.ad.interstitial.r.f46631F, 0);
            }
        }
    }

    @Override // sg.bigo.ads.ad.interstitial.c.g, sg.bigo.ads.ad.interstitial.c.a
    public final void a(final Runnable runnable) {
        b(new Runnable() { // from class: sg.bigo.ads.ad.interstitial.c.i.2
            @Override // java.lang.Runnable
            public final void run() {
                Runnable runnable2 = runnable;
                if (runnable2 != null) {
                    runnable2.run();
                }
                i.this.m();
            }
        });
    }
}
