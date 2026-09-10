package sg.bigo.ads.ad.interstitial.e.b;

import android.content.Context;
import android.view.View;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import sg.bigo.ads.ad.b.c;
import sg.bigo.ads.ad.interstitial.e.d;
import sg.bigo.ads.ad.interstitial.e.j;
import sg.bigo.ads.api.NativeAd;
import sg.bigo.ads.common.view.RealtimeBlurLinearLayout;

/* JADX INFO: loaded from: classes7.dex */
public final class a extends RealtimeBlurLinearLayout {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public d f46191a;

    public a(Context context) {
        this(context, (byte) 0);
    }

    public static void a(List<NativeAd> list, List<NativeAd> list2, List<NativeAd> list3, List<NativeAd> list4, int i2) {
        if (list3 == null) {
            return;
        }
        ArrayList arrayList = new ArrayList();
        ArrayList<NativeAd> arrayList2 = new ArrayList();
        for (NativeAd nativeAd : list3) {
            if (!(nativeAd instanceof c) || ((c) nativeAd).n()) {
                arrayList.add(nativeAd);
            } else {
                arrayList2.add(nativeAd);
            }
        }
        for (NativeAd nativeAd2 : arrayList2) {
            if (list.size() < i2) {
                list.add(nativeAd2);
                list4.add(nativeAd2);
            } else {
                list2.add(nativeAd2);
            }
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext() && list.size() < i2) {
            NativeAd nativeAd3 = (NativeAd) it.next();
            list.add(nativeAd3);
            list4.add(nativeAd3);
            it.remove();
        }
        list2.addAll(arrayList);
        list4.addAll(list2);
    }

    public final d getIconAdsRenderStyle() {
        return this.f46191a;
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onMeasure(int i2, int i3) {
        super.onMeasure(i2, i3);
        d dVar = this.f46191a;
        if ((dVar instanceof j) && dVar.b() == 4) {
            int defaultSize = View.getDefaultSize(Integer.MIN_VALUE, i2);
            int i4 = ((j) this.f46191a).f46237i;
            int i5 = (int) ((((defaultSize - (i4 * 3.0f)) / 4.0f) * 3.0f) + (i4 * 2));
            setMeasuredDimension(i5, getMeasuredHeight());
            int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i5, 1073741824);
            int childCount = getChildCount();
            for (int i6 = 0; i6 < childCount; i6++) {
                measureChildWithMargins(getChildAt(i6), iMakeMeasureSpec, 0, i3, 0);
            }
        }
    }

    private a(Context context, byte b2) {
        this(context, (char) 0);
    }

    private a(Context context, char c2) {
        super(context, null, 0);
    }
}
