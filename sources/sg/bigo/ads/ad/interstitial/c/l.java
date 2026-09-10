package sg.bigo.ads.ad.interstitial.c;

import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import java.util.Collection;
import java.util.List;
import sg.bigo.ads.R;
import sg.bigo.ads.ad.interstitial.multi_img.view.IconListView;
import sg.bigo.ads.common.view.RoundedImageView;

/* JADX INFO: loaded from: classes7.dex */
public class l extends k {
    private TextView v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private TextView f45927w;
    private IconListView x;

    public l(sg.bigo.ads.ad.b.c cVar, int i2, sg.bigo.ads.api.a.m mVar, sg.bigo.ads.ad.interstitial.e.c cVar2) {
        super(cVar, i2, mVar, cVar2);
    }

    @Override // sg.bigo.ads.ad.interstitial.c.k
    public final void a(int i2) {
        super.a(i2);
        sg.bigo.ads.ad.interstitial.b.f45825a.a(this.f45922u);
        ViewGroup viewGroup = this.k;
        if (viewGroup != null) {
            TextView textView = (TextView) viewGroup.findViewById(R.id.inter_company);
            this.v = textView;
            if (textView != null) {
                textView.setTextColor(i2);
            }
        }
    }

    @Override // sg.bigo.ads.ad.interstitial.c.k, sg.bigo.ads.ad.interstitial.c.a
    public final void d(sg.bigo.ads.ad.interstitial.r rVar) {
        IconListView iconListView;
        int i2;
        super.d(rVar);
        ViewGroup viewGroup = this.k;
        if (viewGroup == null) {
            return;
        }
        TextView textView = (TextView) viewGroup.findViewById(R.id.inter_description);
        this.f45927w = textView;
        sg.bigo.ads.ad.interstitial.b bVar = sg.bigo.ads.ad.interstitial.b.f45825a;
        bVar.a(null, textView);
        IconListView iconListView2 = (IconListView) this.k.findViewById(R.id.inter_download_msg);
        this.x = iconListView2;
        iconListView2.a(((a) this).f45876i);
        if (sg.bigo.ads.common.utils.k.a((Collection) this.x.getItems())) {
            iconListView = this.x;
            i2 = 8;
        } else {
            iconListView = this.x;
            i2 = 0;
        }
        iconListView.setVisibility(i2);
        int iA = sg.bigo.ads.common.utils.e.a(this.k.getContext(), 16);
        View view = this.o;
        if (view != null) {
            float f = iA;
            view.setBackground(sg.bigo.ads.common.utils.d.a(f, f, f, f, (Rect) null, -1));
            bVar.b(this.o);
        }
        a(rVar, this.t);
    }

    @Override // sg.bigo.ads.ad.interstitial.c.k, sg.bigo.ads.ad.interstitial.c.a
    public final int h() {
        return R.layout.bigo_ad_activity_interstitial_rich_video_end_19;
    }

    @Override // sg.bigo.ads.ad.interstitial.c.k
    public final sg.bigo.ads.ad.interstitial.b l() {
        return sg.bigo.ads.ad.interstitial.b.f45825a;
    }

    @Override // sg.bigo.ads.ad.interstitial.c.k, sg.bigo.ads.ad.interstitial.c.a
    public final void a(int i2, boolean z2, boolean z3) {
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
        ViewGroup viewGroup2 = this.j;
        if (z3) {
            sg.bigo.ads.ad.b.a.a(viewGroup2, this.k, 4, this.f, i2);
        } else {
            sg.bigo.ads.ad.b.a.a(viewGroup2, this.k, 4, sg.bigo.ads.ad.interstitial.r.f46631F, 0);
        }
        sg.bigo.ads.api.a.m mVar = this.g;
        boolean z4 = true;
        if (mVar != null && mVar.a("endpage.ad_component_clickable_switch") != 1) {
            z4 = false;
        }
        View view = this.o;
        if (view != null) {
            sg.bigo.ads.ad.b.a.a(view, 18);
            ViewGroup viewGroup3 = this.j;
            if (z4) {
                sg.bigo.ads.ad.b.a.a(viewGroup3, this.o, 8, this.f, i2);
            } else {
                sg.bigo.ads.ad.b.a.a(viewGroup3, this.o, 8, sg.bigo.ads.ad.interstitial.r.f46631F, 0);
            }
        }
        IconListView iconListView = this.x;
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

    @Override // sg.bigo.ads.ad.interstitial.c.k
    public final void a(sg.bigo.ads.ad.interstitial.r rVar, Rect rect) {
        sg.bigo.ads.common.p pVarB = b(rVar);
        int iA = sg.bigo.ads.common.utils.e.a(this.r.getContext(), 16);
        int iWidth = rect.width();
        int iHeight = rect.height();
        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) this.r.getLayoutParams();
        int i2 = sg.bigo.ads.common.p.b(pVarB.f47362b, pVarB.f47363c, iWidth).f47363c;
        if (i2 <= iHeight) {
            layoutParams.height = i2;
        } else {
            int i3 = iA * 2;
            layoutParams.height = sg.bigo.ads.common.p.a(pVarB.f47362b, pVarB.f47363c, iWidth - i3, iHeight - i3).f47363c + i3;
            ((ViewGroup.MarginLayoutParams) this.s.getLayoutParams()).setMargins(iA, iA, iA, iA);
            this.s.requestLayout();
        }
        this.r.requestLayout();
    }
}
