package sg.bigo.ads.ad.interstitial.g;

import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import android.widget.TextView;
import sg.bigo.ads.R;
import sg.bigo.ads.ad.interstitial.r;
import sg.bigo.ads.api.a.m;
import sg.bigo.ads.common.p;
import sg.bigo.ads.common.utils.e;
import sg.bigo.ads.common.utils.u;
import sg.bigo.ads.common.view.RoundedImageView;

/* JADX INFO: loaded from: classes7.dex */
public class c extends a {
    protected View s;
    protected TextView t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    protected View f46308u;
    protected RoundedImageView v;

    public c(sg.bigo.ads.ad.b.c cVar, m mVar, p pVar) {
        super(cVar, mVar, pVar);
    }

    @Override // sg.bigo.ads.ad.interstitial.g.a
    public void a(int i2, boolean z2, boolean z3) {
        super.a(i2, z2, z3);
        sg.bigo.ads.ad.b.a.a(this.v, 5);
        RoundedImageView roundedImageView = this.v;
        if (roundedImageView != null) {
            if (z2) {
                sg.bigo.ads.ad.b.a.a(this.j, roundedImageView, 10, this.f, i2);
            } else {
                sg.bigo.ads.ad.b.a.a(this.j, roundedImageView, 10, r.f46631F, 0);
            }
        }
    }

    @Override // sg.bigo.ads.ad.interstitial.g.a
    public void d(final r rVar) {
        ViewGroup viewGroup = this.k;
        if (viewGroup == null) {
            return;
        }
        this.s = viewGroup.findViewById(R.id.inter_click_guide_container);
        this.f46308u = this.k.findViewById(R.id.inter_click_guide_image_layout);
        this.v = (RoundedImageView) this.k.findViewById(R.id.inter_click_guide_image_background);
        this.v.setCornerRadius(e.a(this.k.getContext(), 8));
        this.v.setBackgroundColor(654311423);
        u.a(this.f46308u, new u.a() { // from class: sg.bigo.ads.ad.interstitial.g.c.1
            @Override // sg.bigo.ads.common.utils.u.a
            public final void a(Rect rect) {
                c.this.a(rVar, rect);
            }
        });
        l().a(this.t, null);
    }

    @Override // sg.bigo.ads.ad.interstitial.g.a
    public final void e(r rVar) {
        super.e(rVar);
        RoundedImageView roundedImageView = this.m;
        if (roundedImageView != null) {
            roundedImageView.setCornerRadius(e.a(roundedImageView.getContext(), 8));
        }
    }

    @Override // sg.bigo.ads.ad.interstitial.g.a
    public void f(r rVar) {
        super.f(rVar);
        l().a(this.f46294n);
    }

    @Override // sg.bigo.ads.ad.interstitial.g.a
    public final boolean g() {
        return false;
    }

    @Override // sg.bigo.ads.ad.interstitial.g.a
    public int h() {
        return R.layout.bigo_ad_view_click_guide_2;
    }

    @Override // sg.bigo.ads.ad.interstitial.g.a
    public final void k() {
        super.k();
        l().a(this.f46293l);
    }

    public sg.bigo.ads.ad.interstitial.b l() {
        return sg.bigo.ads.ad.interstitial.b.d;
    }

    public void a(r rVar, Rect rect) {
        RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) this.f46294n.getLayoutParams();
        layoutParams.addRule(12, 0);
        layoutParams.addRule(3, this.f46308u.getId());
        this.f46294n.requestLayout();
        p pVarB = b(rVar);
        int iA = e.a(this.f46308u.getContext(), 16);
        int iWidth = rect.width();
        int iHeight = rect.height();
        int i2 = iA * 2;
        int i3 = iWidth - i2;
        RelativeLayout.LayoutParams layoutParams2 = (RelativeLayout.LayoutParams) this.f46308u.getLayoutParams();
        layoutParams2.addRule(2, 0);
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.m.getLayoutParams();
        ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) this.v.getLayoutParams();
        p pVarA = p.a(pVarB.f47362b, pVarB.f47363c, iWidth, iHeight - i2);
        p pVarA2 = p.a(pVarB.f47362b, pVarB.f47363c, i3, iHeight);
        if (pVarA.a(pVarA2)) {
            layoutParams2.width = pVarA.f47362b;
            layoutParams2.height = pVarA.f47363c + i2;
            marginLayoutParams.topMargin = iA;
            marginLayoutParams.bottomMargin = iA;
            marginLayoutParams2.leftMargin = iA;
            marginLayoutParams2.rightMargin = iA;
        } else {
            layoutParams2.width = pVarA2.f47362b + i2;
            layoutParams2.height = pVarA2.f47363c;
            marginLayoutParams.leftMargin = iA;
            marginLayoutParams.rightMargin = iA;
            marginLayoutParams2.topMargin = iA;
            marginLayoutParams2.bottomMargin = iA;
        }
        this.m.requestLayout();
        this.v.requestLayout();
        this.f46308u.requestLayout();
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
}
