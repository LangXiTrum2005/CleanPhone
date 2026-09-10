package sg.bigo.ads.ad.interstitial.g;

import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import android.widget.TextView;
import java.util.Collection;
import java.util.List;
import sg.bigo.ads.R;
import sg.bigo.ads.ad.interstitial.multi_img.view.IconListView;
import sg.bigo.ads.ad.interstitial.r;
import sg.bigo.ads.api.a.m;
import sg.bigo.ads.common.p;
import sg.bigo.ads.common.utils.e;
import sg.bigo.ads.common.utils.k;

/* JADX INFO: loaded from: classes7.dex */
public final class d extends c {

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private TextView f46311w;
    private TextView x;
    private IconListView y;

    public d(sg.bigo.ads.ad.b.c cVar, m mVar, p pVar) {
        super(cVar, mVar, pVar);
    }

    @Override // sg.bigo.ads.ad.interstitial.g.c, sg.bigo.ads.ad.interstitial.g.a
    public final void a(int i2, boolean z2, boolean z3) {
        super.a(i2, z2, z3);
        m mVar = this.g;
        boolean z4 = true;
        if (mVar != null && mVar.a("layer.ad_component_clickable_switch") != 1) {
            z4 = false;
        }
        View view = this.s;
        if (view != null) {
            sg.bigo.ads.ad.b.a.a(view, 18);
            ViewGroup viewGroup = this.j;
            if (z4) {
                sg.bigo.ads.ad.b.a.a(viewGroup, this.s, 8, this.f, i2);
            } else {
                sg.bigo.ads.ad.b.a.a(viewGroup, this.s, 8, r.f46631F, 0);
            }
        }
        IconListView iconListView = this.y;
        if (iconListView != null) {
            List<IconListView.a> items = iconListView.getItems();
            for (int i3 = 0; items != null && i3 < items.size(); i3++) {
                IconListView.a aVar = items.get(i3);
                sg.bigo.ads.ad.b.a.a(aVar.d, 26);
                sg.bigo.ads.ad.b.a.a(this.j, aVar.d, 8, this.f, i2);
                sg.bigo.ads.ad.b.a.a(aVar.g, 26);
                sg.bigo.ads.ad.b.a.a(this.j, aVar.g, 8, this.f, i2);
            }
        }
    }

    @Override // sg.bigo.ads.ad.interstitial.g.c, sg.bigo.ads.ad.interstitial.g.a
    public final void d(r rVar) {
        IconListView iconListView;
        int i2;
        super.d(rVar);
        ViewGroup viewGroup = this.k;
        if (viewGroup == null) {
            return;
        }
        TextView textView = (TextView) viewGroup.findViewById(R.id.inter_description);
        this.x = textView;
        sg.bigo.ads.ad.interstitial.b bVar = sg.bigo.ads.ad.interstitial.b.f45825a;
        bVar.a(null, textView);
        IconListView iconListView2 = (IconListView) this.k.findViewById(R.id.inter_download_msg);
        this.y = iconListView2;
        iconListView2.a(((a) this).f46292i);
        if (k.a((Collection) this.y.getItems())) {
            iconListView = this.y;
            i2 = 8;
        } else {
            iconListView = this.y;
            i2 = 0;
        }
        iconListView.setVisibility(i2);
        int iA = e.a(this.k.getContext(), 16);
        View view = this.s;
        if (view != null) {
            float f = iA;
            view.setBackground(sg.bigo.ads.common.utils.d.a(f, f, f, f, (Rect) null, -1));
            bVar.b(this.s);
        }
        a(rVar, this.v);
    }

    @Override // sg.bigo.ads.ad.interstitial.g.c, sg.bigo.ads.ad.interstitial.g.a
    public final void f(r rVar) {
        super.f(rVar);
        ViewGroup viewGroup = this.k;
        if (viewGroup != null) {
            TextView textView = (TextView) viewGroup.findViewById(R.id.inter_company);
            this.f46311w = textView;
            if (textView != null) {
                textView.setTextColor(g(rVar));
            }
        }
    }

    @Override // sg.bigo.ads.ad.interstitial.g.c, sg.bigo.ads.ad.interstitial.g.a
    public final int h() {
        return R.layout.bigo_ad_view_click_guide_3;
    }

    @Override // sg.bigo.ads.ad.interstitial.g.c
    public final sg.bigo.ads.ad.interstitial.b l() {
        return sg.bigo.ads.ad.interstitial.b.f45825a;
    }

    @Override // sg.bigo.ads.ad.interstitial.g.c
    public final void a(r rVar, Rect rect) {
        RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) this.y.getLayoutParams();
        layoutParams.addRule(3, this.f46308u.getId());
        layoutParams.addRule(2, 0);
        this.y.requestLayout();
        RelativeLayout.LayoutParams layoutParams2 = (RelativeLayout.LayoutParams) this.f46294n.getLayoutParams();
        layoutParams2.addRule(12, 0);
        layoutParams2.addRule(3, (k.a((Collection) this.y.getItems()) ? this.f46308u : this.y).getId());
        this.f46294n.requestLayout();
        p pVarB = b(rVar);
        int iA = e.a(this.f46308u.getContext(), 16);
        int iWidth = rect.width();
        int iHeight = rect.height();
        RelativeLayout.LayoutParams layoutParams3 = (RelativeLayout.LayoutParams) this.f46308u.getLayoutParams();
        layoutParams3.addRule(2, 0);
        int i2 = p.b(pVarB.f47362b, pVarB.f47363c, iWidth).f47363c;
        if (i2 <= iHeight) {
            layoutParams3.height = i2;
        } else {
            int i3 = iA * 2;
            layoutParams3.height = p.a(pVarB.f47362b, pVarB.f47363c, iWidth - i3, iHeight - i3).f47363c + i3;
            ((ViewGroup.MarginLayoutParams) this.m.getLayoutParams()).setMargins(iA, iA, iA, iA);
            this.m.requestLayout();
        }
        this.f46308u.requestLayout();
    }
}
