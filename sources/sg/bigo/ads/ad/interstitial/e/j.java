package sg.bigo.ads.ad.interstitial.e;

import android.graphics.Rect;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.Space;
import java.util.ArrayList;
import java.util.List;
import sg.bigo.ads.R;
import sg.bigo.ads.api.NativeAd;

/* JADX INFO: loaded from: classes7.dex */
public final class j extends d {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final int f46237i;
    private final b j;

    public j(sg.bigo.ads.ad.interstitial.e.b.a aVar, List<NativeAd> list, sg.bigo.ads.ad.interstitial.e.a.b bVar) {
        super(aVar, list, bVar);
        this.f46237i = sg.bigo.ads.common.utils.e.a(this.d, 72);
        this.j = new b(sg.bigo.ads.common.utils.e.a(this.d, 8), this.f46235h, this.g);
    }

    private List<View> a(View view, View view2, View view3, View view4, View view5, View view6) {
        c();
        this.f46231a.setOrientation(1);
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        arrayList.add(view2);
        arrayList.add(view3);
        arrayList.add(view4);
        arrayList.add(view5);
        a(0, 0, 0, 16);
        LinearLayout linearLayout = new LinearLayout(this.d);
        linearLayout.setOrientation(0);
        this.f46231a.addView(linearLayout, new LinearLayout.LayoutParams(-1, -2));
        linearLayout.addView(new Space(this.d), new LinearLayout.LayoutParams(0, 60, 1.0f));
        linearLayout.addView(view, new LinearLayout.LayoutParams(this.f46237i, -2));
        linearLayout.addView(new Space(this.d), new LinearLayout.LayoutParams(0, 60, 1.0f));
        linearLayout.addView(view2, new LinearLayout.LayoutParams(this.f46237i, -2));
        linearLayout.addView(new Space(this.d), new LinearLayout.LayoutParams(0, 60, 1.0f));
        linearLayout.addView(view3, new LinearLayout.LayoutParams(this.f46237i, -2));
        linearLayout.addView(new Space(this.d), new LinearLayout.LayoutParams(0, 60, 1.0f));
        LinearLayout linearLayout2 = new LinearLayout(this.d);
        linearLayout2.setOrientation(0);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
        layoutParams.topMargin = sg.bigo.ads.common.utils.e.a(this.d, 12);
        this.f46231a.addView(linearLayout2, layoutParams);
        linearLayout2.addView(new Space(this.d), new LinearLayout.LayoutParams(0, 60, 1.0f));
        linearLayout2.addView(view4, new LinearLayout.LayoutParams(this.f46237i, -2));
        linearLayout2.addView(new Space(this.d), new LinearLayout.LayoutParams(0, 60, 1.0f));
        linearLayout2.addView(view5, new LinearLayout.LayoutParams(this.f46237i, -2));
        linearLayout2.addView(new Space(this.d), new LinearLayout.LayoutParams(0, 60, 1.0f));
        if (view6 != null) {
            arrayList.add(view6);
            linearLayout2.addView(view6, new LinearLayout.LayoutParams(this.f46237i, -2));
        } else {
            linearLayout2.addView(new Space(this.d), new LinearLayout.LayoutParams(this.f46237i, -2));
        }
        linearLayout2.addView(new Space(this.d), new LinearLayout.LayoutParams(0, 60, 1.0f));
        return arrayList;
    }

    @Override // sg.bigo.ads.ad.interstitial.e.d
    public final List<View> a(a aVar) {
        int size = this.f46232b.size();
        if (size == 0) {
            return new ArrayList();
        }
        if (size == 1) {
            this.f = true;
            View viewA = sg.bigo.ads.common.utils.a.a(this.d, R.layout.bigo_ad_layout_interstitial_icon_item_cta_des_style1, this.f46231a, false);
            a(this.j);
            this.f46231a.setOrientation(0);
            ArrayList arrayList = new ArrayList();
            arrayList.add(viewA);
            a(20, 16, 20, 16);
            this.f46231a.addView(viewA, new LinearLayout.LayoutParams(-1, sg.bigo.ads.common.utils.e.a(this.d, 60)));
            return arrayList;
        }
        if (size == 2) {
            this.f = true;
            View viewA2 = sg.bigo.ads.common.utils.a.a(this.d, R.layout.bigo_ad_layout_interstitial_icon_item_cta_des_style1, this.f46231a, false);
            View viewA3 = sg.bigo.ads.common.utils.a.a(this.d, R.layout.bigo_ad_layout_interstitial_icon_item_cta_des_style1, this.f46231a, false);
            a(this.j);
            this.f46231a.setOrientation(1);
            ArrayList arrayList2 = new ArrayList();
            arrayList2.add(viewA2);
            arrayList2.add(viewA3);
            a(20, 16, 20, 16);
            int iA = sg.bigo.ads.common.utils.e.a(this.d, 60);
            this.f46231a.addView(viewA2, new LinearLayout.LayoutParams(-1, iA));
            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, iA);
            layoutParams.topMargin = sg.bigo.ads.common.utils.e.a(this.d, 20);
            this.f46231a.addView(viewA3, layoutParams);
            return arrayList2;
        }
        if (size == 3) {
            View viewA4 = sg.bigo.ads.common.utils.a.a(this.d, R.layout.bigo_ad_layout_interstitial_icon_item_style, this.f46231a, false);
            View viewA5 = sg.bigo.ads.common.utils.a.a(this.d, R.layout.bigo_ad_layout_interstitial_icon_item_style, this.f46231a, false);
            View viewA6 = sg.bigo.ads.common.utils.a.a(this.d, R.layout.bigo_ad_layout_interstitial_icon_item_style, this.f46231a, false);
            c();
            this.f46231a.setOrientation(0);
            ArrayList arrayList3 = new ArrayList();
            arrayList3.add(viewA4);
            arrayList3.add(viewA5);
            arrayList3.add(viewA6);
            a(0, 0, 0, 16);
            p005e.a.c(0, 60, 1.0f, this.f46231a, new Space(this.d));
            this.f46231a.addView(viewA4, new LinearLayout.LayoutParams(this.f46237i, -2));
            p005e.a.c(0, 60, 1.0f, this.f46231a, new Space(this.d));
            this.f46231a.addView(viewA5, new LinearLayout.LayoutParams(this.f46237i, -2));
            p005e.a.c(0, 60, 1.0f, this.f46231a, new Space(this.d));
            this.f46231a.addView(viewA6, new LinearLayout.LayoutParams(this.f46237i, -2));
            p005e.a.c(0, 60, 1.0f, this.f46231a, new Space(this.d));
            return arrayList3;
        }
        if (size != 4) {
            return size != 5 ? a(sg.bigo.ads.common.utils.a.a(this.d, R.layout.bigo_ad_layout_interstitial_icon_item_style, this.f46231a, false), sg.bigo.ads.common.utils.a.a(this.d, R.layout.bigo_ad_layout_interstitial_icon_item_style, this.f46231a, false), sg.bigo.ads.common.utils.a.a(this.d, R.layout.bigo_ad_layout_interstitial_icon_item_style, this.f46231a, false), sg.bigo.ads.common.utils.a.a(this.d, R.layout.bigo_ad_layout_interstitial_icon_item_style, this.f46231a, false), sg.bigo.ads.common.utils.a.a(this.d, R.layout.bigo_ad_layout_interstitial_icon_item_style, this.f46231a, false), sg.bigo.ads.common.utils.a.a(this.d, R.layout.bigo_ad_layout_interstitial_icon_item_style, this.f46231a, false)) : a(sg.bigo.ads.common.utils.a.a(this.d, R.layout.bigo_ad_layout_interstitial_icon_item_style, this.f46231a, false), sg.bigo.ads.common.utils.a.a(this.d, R.layout.bigo_ad_layout_interstitial_icon_item_style, this.f46231a, false), sg.bigo.ads.common.utils.a.a(this.d, R.layout.bigo_ad_layout_interstitial_icon_item_style, this.f46231a, false), sg.bigo.ads.common.utils.a.a(this.d, R.layout.bigo_ad_layout_interstitial_icon_item_style, this.f46231a, false), sg.bigo.ads.common.utils.a.a(this.d, R.layout.bigo_ad_layout_interstitial_icon_item_style, this.f46231a, false), null);
        }
        View viewA7 = sg.bigo.ads.common.utils.a.a(this.d, R.layout.bigo_ad_layout_interstitial_icon_item_style, this.f46231a, false);
        View viewA8 = sg.bigo.ads.common.utils.a.a(this.d, R.layout.bigo_ad_layout_interstitial_icon_item_style, this.f46231a, false);
        View viewA9 = sg.bigo.ads.common.utils.a.a(this.d, R.layout.bigo_ad_layout_interstitial_icon_item_style, this.f46231a, false);
        View viewA10 = sg.bigo.ads.common.utils.a.a(this.d, R.layout.bigo_ad_layout_interstitial_icon_item_style, this.f46231a, false);
        c();
        this.f46231a.setOrientation(1);
        this.f46231a.setGravity(1);
        ArrayList arrayList4 = new ArrayList();
        arrayList4.add(viewA7);
        arrayList4.add(viewA8);
        arrayList4.add(viewA9);
        arrayList4.add(viewA10);
        arrayList4.add(viewA10);
        a(0, 0, 0, 16);
        LinearLayout linearLayout = new LinearLayout(this.d);
        linearLayout.setOrientation(0);
        this.f46231a.addView(linearLayout, new LinearLayout.LayoutParams(-1, -2));
        linearLayout.addView(new Space(this.d), new LinearLayout.LayoutParams(0, 60, 1.0f));
        linearLayout.addView(viewA7, new LinearLayout.LayoutParams(this.f46237i, -2));
        linearLayout.addView(new Space(this.d), new LinearLayout.LayoutParams(0, 60, 1.0f));
        linearLayout.addView(viewA8, new LinearLayout.LayoutParams(this.f46237i, -2));
        linearLayout.addView(new Space(this.d), new LinearLayout.LayoutParams(0, 60, 1.0f));
        LinearLayout linearLayout2 = new LinearLayout(this.d);
        linearLayout2.setOrientation(0);
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-1, -2);
        layoutParams2.topMargin = sg.bigo.ads.common.utils.e.a(this.d, 12);
        this.f46231a.addView(linearLayout2, layoutParams2);
        linearLayout2.addView(new Space(this.d), new LinearLayout.LayoutParams(0, 60, 1.0f));
        linearLayout2.addView(viewA9, new LinearLayout.LayoutParams(this.f46237i, -1));
        linearLayout2.addView(new Space(this.d), new LinearLayout.LayoutParams(0, 60, 1.0f));
        linearLayout2.addView(viewA10, new LinearLayout.LayoutParams(this.f46237i, -2));
        linearLayout2.addView(new Space(this.d), new LinearLayout.LayoutParams(0, 60, 1.0f));
        return arrayList4;
    }

    @Override // sg.bigo.ads.ad.interstitial.e.d
    public final b a() {
        float fA = sg.bigo.ads.common.utils.e.a(this.d, 8);
        return new b(fA, fA, fA, fA, new Rect(0, sg.bigo.ads.common.utils.e.a(this.d, 12), 0, 0), this.f46235h, null, this.g);
    }
}
