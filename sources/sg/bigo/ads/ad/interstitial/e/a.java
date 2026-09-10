package sg.bigo.ads.ad.interstitial.e;

import android.content.Context;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import sg.bigo.ads.R;
import sg.bigo.ads.api.NativeAd;
import sg.bigo.ads.common.view.RealtimeBlurLinearLayout;
import sg.bigo.ads.common.view.ViewFlow;

/* JADX INFO: loaded from: classes7.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final RealtimeBlurLinearLayout f46171a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ViewFlow f46172b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f46173c;

    private a(RealtimeBlurLinearLayout realtimeBlurLinearLayout, int i2) {
        this.f46171a = realtimeBlurLinearLayout;
        this.f46172b = (ViewFlow) realtimeBlurLinearLayout.findViewById(R.id.inter_icon_ads_view_flow);
        this.f46173c = i2;
    }

    public static a a(Context context, sg.bigo.ads.ad.interstitial.e.a.b bVar, List<NativeAd> list, List<NativeAd> list2) {
        int iA;
        boolean z2;
        d fVar;
        a aVar = new a((RealtimeBlurLinearLayout) sg.bigo.ads.common.utils.a.a(context, R.layout.bigo_ad_layout_interstitial_icon_view_flow, null, false), (int) bVar.k());
        aVar.f46172b.setViewStyle(3);
        aVar.f46172b.setDividerWidth(0);
        if (!bVar.a()) {
            switch (bVar.e()) {
                case 1:
                case 3:
                    aVar.f46172b.setContentMaxWidthSpace(sg.bigo.ads.common.utils.e.a(context, 20));
                    break;
                case 2:
                case 4:
                    aVar.f46172b.setContentMaxWidthSpace(0);
                    break;
                case 5:
                case 6:
                    aVar.f46172b.setContentMaxWidthSpace(sg.bigo.ads.common.utils.e.a(context, 47));
                    ((ViewGroup.MarginLayoutParams) aVar.f46172b.getLayoutParams()).bottomMargin = 0;
                    break;
            }
        } else {
            aVar.f46172b.setContentMaxWidthSpace(0);
            ((LinearLayout.LayoutParams) aVar.f46172b.getLayoutParams()).bottomMargin = 0;
        }
        list2.clear();
        while (!sg.bigo.ads.common.utils.k.a((Collection) list)) {
            sg.bigo.ads.ad.interstitial.e.b.a aVar2 = new sg.bigo.ads.ad.interstitial.e.b.a(context);
            if (!sg.bigo.ads.common.utils.k.a((Collection) list)) {
                if (bVar.a()) {
                    z2 = false;
                    iA = 1;
                } else {
                    iA = sg.bigo.ads.ad.interstitial.e.a.b.a(bVar);
                    z2 = true;
                }
                ArrayList arrayList = new ArrayList();
                ArrayList arrayList2 = new ArrayList();
                sg.bigo.ads.ad.interstitial.e.b.a.a(arrayList, arrayList2, list, list2, iA);
                if (iA == 1) {
                    list2.addAll(arrayList2);
                    arrayList2.clear();
                }
                if (bVar.a()) {
                    fVar = new k(aVar2, arrayList, bVar);
                } else {
                    int iE = bVar.e();
                    if (iE == 2) {
                        fVar = new f(aVar2, arrayList, bVar);
                    } else if (iE == 3) {
                        fVar = new g(aVar2, arrayList, bVar);
                    } else if (iE == 4) {
                        fVar = new h(aVar2, arrayList, bVar);
                    } else if (iE != 5) {
                        fVar = iE != 6 ? new e(aVar2, arrayList, bVar) : new j(aVar2, arrayList, bVar);
                    } else {
                        fVar = new i(aVar2, arrayList, bVar);
                    }
                }
                fVar.a(aVar, z2);
                aVar2.f46191a = fVar;
                list = arrayList2;
            }
            ViewFlow.b bVar2 = new ViewFlow.b();
            ((ViewGroup.LayoutParams) bVar2).width = -1;
            ((ViewGroup.LayoutParams) bVar2).height = -2;
            bVar2.f47656e = 48;
            bVar2.d = 3;
            aVar.f46172b.addView(aVar2, bVar2);
        }
        return aVar;
    }
}
