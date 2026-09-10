package sg.bigo.ads.ad.interstitial.c;

import android.graphics.Rect;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import sg.bigo.ads.R;
import sg.bigo.ads.common.view.RoundedImageView;

/* JADX INFO: loaded from: classes7.dex */
public class k extends a {
    protected View o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    protected RoundedImageView f45921p;
    protected TextView q;
    protected View r;
    protected RoundedImageView s;
    protected RoundedImageView t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    protected Button f45922u;

    public k(sg.bigo.ads.ad.b.c cVar, int i2, sg.bigo.ads.api.a.m mVar, sg.bigo.ads.ad.interstitial.e.c cVar2) {
        super(cVar, i2, mVar, cVar2);
    }

    @Override // sg.bigo.ads.ad.interstitial.c.a
    public final void a(double d) {
        TextView textView;
        int i2;
        if (d <= 3.0d) {
            textView = this.f45877l;
            if (textView == null) {
                return;
            } else {
                i2 = sg.bigo.ads.ad.interstitial.d.f45977b;
            }
        } else {
            textView = this.f45877l;
            if (textView == null) {
                return;
            } else {
                i2 = sg.bigo.ads.ad.interstitial.d.f45976a;
            }
        }
        textView.setTextColor(sg.bigo.ads.common.w.b.a(i2, 0.6f));
    }

    @Override // sg.bigo.ads.ad.interstitial.c.a
    public void d(final sg.bigo.ads.ad.interstitial.r rVar) {
        ViewGroup viewGroup = this.k;
        if (viewGroup == null) {
            return;
        }
        this.o = viewGroup.findViewById(R.id.inter_end_page);
        this.f45921p = (RoundedImageView) this.k.findViewById(R.id.inter_icon);
        this.q = (TextView) this.k.findViewById(R.id.inter_title);
        l().a(this.f45921p);
        l().a(this.q, null);
        this.r = this.k.findViewById(R.id.inter_end_page_image_layout);
        this.s = (RoundedImageView) this.k.findViewById(R.id.inter_end_page_image);
        this.t = (RoundedImageView) this.k.findViewById(R.id.inter_end_page_image_background);
        float fA = sg.bigo.ads.common.utils.e.a(this.s.getContext(), 8);
        this.s.setCornerRadius(fA);
        this.t.setCornerRadius(fA);
        this.t.setBackgroundColor(654311423);
        sg.bigo.ads.common.utils.u.a(this.r, new sg.bigo.ads.common.utils.u.a() { // from class: sg.bigo.ads.ad.interstitial.c.k.1
            @Override // sg.bigo.ads.common.utils.u.a
            public final void a(Rect rect) {
                k.this.a(rVar, rect);
            }
        });
        a(f(rVar));
    }

    @Override // sg.bigo.ads.ad.interstitial.v
    public final boolean f() {
        return true;
    }

    @Override // sg.bigo.ads.ad.interstitial.c.a
    public int h() {
        return R.layout.bigo_ad_activity_interstitial_rich_video_end_18;
    }

    @Override // sg.bigo.ads.ad.interstitial.c.a
    public final void i() {
        String strI = ((sg.bigo.ads.core.a.a) this.f.f()).i();
        TextView textView = (TextView) this.k.findViewById(R.id.inter_advertiser);
        if (TextUtils.isEmpty(strI)) {
            textView.setVisibility(8);
        } else {
            textView.setText(strI);
        }
    }

    public sg.bigo.ads.ad.interstitial.b l() {
        return sg.bigo.ads.ad.interstitial.b.d;
    }

    public final void m() {
        if (this.f45922u == null || !j()) {
            return;
        }
        sg.bigo.ads.ad.interstitial.c.e(this.f45922u);
    }

    public void a(int i2) {
        Button button = (Button) this.k.findViewById(R.id.inter_btn_cta);
        this.f45922u = button;
        if (button != null) {
            float fA = sg.bigo.ads.common.utils.e.a(this.k.getContext(), 8);
            this.f45922u.setBackground(sg.bigo.ads.common.utils.d.a(fA, fA, fA, fA, (Rect) null, i2));
            sg.bigo.ads.ad.interstitial.d.a(this.f45922u, sg.bigo.ads.common.w.b.a(i2));
            l().a(this.f45922u);
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

    @Override // sg.bigo.ads.ad.interstitial.c.a
    public void a(int i2, boolean z2, boolean z3) {
        sg.bigo.ads.ad.b.a.a(this.s, 5);
        sg.bigo.ads.ad.b.a.a(this.t, 5);
        if (z2) {
            sg.bigo.ads.ad.b.a.a(this.j, this.s, 4, this.f, i2);
            sg.bigo.ads.ad.b.a.a(this.j, this.t, 4, this.f, i2);
        } else {
            ViewGroup viewGroup = this.j;
            RoundedImageView roundedImageView = this.s;
            sg.bigo.ads.core.adview.h hVar = sg.bigo.ads.ad.interstitial.r.f46631F;
            sg.bigo.ads.ad.b.a.a(viewGroup, roundedImageView, 4, hVar, 0);
            sg.bigo.ads.ad.b.a.a(this.j, this.t, 4, hVar, 0);
        }
        sg.bigo.ads.ad.b.a.a(this.k, 9);
        if (z3) {
            sg.bigo.ads.ad.b.a.a(this.j, this.k, 4, this.f, i2);
        } else {
            sg.bigo.ads.ad.b.a.a(this.j, this.k, 4, sg.bigo.ads.ad.interstitial.r.f46631F, 0);
        }
    }

    @Override // sg.bigo.ads.ad.interstitial.c.a
    public final void a(final Runnable runnable) {
        super.a(new Runnable() { // from class: sg.bigo.ads.ad.interstitial.c.k.2
            @Override // java.lang.Runnable
            public final void run() {
                k.this.m();
                Runnable runnable2 = runnable;
                if (runnable2 != null) {
                    runnable2.run();
                }
            }
        });
    }

    public void a(sg.bigo.ads.ad.interstitial.r rVar, Rect rect) {
        sg.bigo.ads.common.p pVarB = b(rVar);
        int iA = sg.bigo.ads.common.utils.e.a(this.r.getContext(), 16);
        int iWidth = rect.width();
        int iHeight = rect.height();
        int i2 = iA * 2;
        int i3 = iWidth - i2;
        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) this.r.getLayoutParams();
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.s.getLayoutParams();
        ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) this.t.getLayoutParams();
        sg.bigo.ads.common.p pVarA = sg.bigo.ads.common.p.a(pVarB.f47362b, pVarB.f47363c, iWidth, iHeight - i2);
        sg.bigo.ads.common.p pVarA2 = sg.bigo.ads.common.p.a(pVarB.f47362b, pVarB.f47363c, i3, iHeight);
        if (pVarA.a(pVarA2)) {
            layoutParams.width = pVarA.f47362b;
            layoutParams.height = pVarA.f47363c + i2;
            marginLayoutParams.topMargin = iA;
            marginLayoutParams.bottomMargin = iA;
            marginLayoutParams2.leftMargin = iA;
            marginLayoutParams2.rightMargin = iA;
        } else {
            layoutParams.width = pVarA2.f47362b + i2;
            layoutParams.height = pVarA2.f47363c;
            marginLayoutParams.leftMargin = iA;
            marginLayoutParams.rightMargin = iA;
            marginLayoutParams2.topMargin = iA;
            marginLayoutParams2.bottomMargin = iA;
        }
        this.r.requestLayout();
        this.s.requestLayout();
        this.t.requestLayout();
    }
}
