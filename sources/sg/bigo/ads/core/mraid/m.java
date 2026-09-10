package sg.bigo.ads.core.mraid;

import android.graphics.Rect;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes7.dex */
final class m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    List<Rect> f48710a;

    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final int f48713a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final int f48714b;

        public a(int i2, int i3) {
            this.f48713a = i2;
            this.f48714b = i3;
        }

        public final boolean a(a aVar) {
            return this.f48713a <= aVar.f48714b && this.f48714b >= aVar.f48713a;
        }

        public final String toString() {
            return android.support.v4.media.a.g(this.f48713a, this.f48714b, "Range: ", " - ");
        }
    }

    public m(List<Rect> list, int[] iArr) {
        List<Integer> listA = a(list);
        this.f48710a = new ArrayList();
        int i2 = 0;
        while (i2 < listA.size() - 1) {
            int iIntValue = listA.get(i2).intValue();
            i2++;
            int iIntValue2 = listA.get(i2).intValue();
            if (iIntValue < iIntValue2) {
                a aVar = new a(iIntValue, iIntValue2);
                this.f48710a.addAll(b(aVar, a(aVar, list)));
            }
        }
        Collections.sort(this.f48710a, new Comparator<Rect>() { // from class: sg.bigo.ads.core.mraid.m.1
            @Override // java.util.Comparator
            public final /* synthetic */ int compare(Rect rect, Rect rect2) {
                Rect rect3 = rect;
                Rect rect4 = rect2;
                return (rect3.height() * rect3.width()) - (rect4.height() * rect4.width());
            }
        });
        Iterator<Rect> it = this.f48710a.iterator();
        while (it.hasNext()) {
            it.next().offset(-iArr[0], -iArr[1]);
        }
    }

    private static List<Rect> b(a aVar, List<a> list) {
        ArrayList arrayList = new ArrayList();
        for (a aVar2 : list) {
            arrayList.add(new Rect(aVar.f48713a, aVar2.f48713a, aVar.f48714b, aVar2.f48714b));
        }
        return arrayList;
    }

    public final float a() {
        float fHeight = 0.0f;
        for (Rect rect : this.f48710a) {
            fHeight += rect.height() * rect.width();
        }
        return fHeight;
    }

    private List<Integer> a(List<Rect> list) {
        ArrayList arrayList = new ArrayList();
        for (Rect rect : list) {
            arrayList.add(Integer.valueOf(rect.left));
            arrayList.add(Integer.valueOf(rect.right));
        }
        Collections.sort(arrayList, new Comparator<Integer>() { // from class: sg.bigo.ads.core.mraid.m.2
            @Override // java.util.Comparator
            public final /* synthetic */ int compare(Integer num, Integer num2) {
                return num.intValue() - num2.intValue();
            }
        });
        return arrayList;
    }

    private static List<a> a(List<a> list, a aVar) {
        ArrayList arrayList = new ArrayList();
        for (int i2 = 0; i2 < list.size(); i2++) {
            a aVar2 = list.get(i2);
            if (!aVar.a(aVar2)) {
                arrayList.add(aVar2);
            } else if (aVar.a(aVar2)) {
                int i3 = aVar.f48713a;
                int i4 = aVar2.f48713a;
                if (i3 >= i4) {
                    i3 = i4;
                }
                int i5 = aVar.f48714b;
                int i6 = aVar2.f48714b;
                if (i5 <= i6) {
                    i5 = i6;
                }
                aVar = new a(i3, i5);
            }
        }
        arrayList.add(aVar);
        return arrayList;
    }

    private static List<a> a(a aVar, List<Rect> list) {
        List<a> arrayList = new ArrayList<>();
        for (Rect rect : list) {
            if (aVar.f48713a < rect.right && aVar.f48714b > rect.left) {
                arrayList = a(arrayList, new a(rect.top, rect.bottom));
            }
        }
        return arrayList;
    }
}
