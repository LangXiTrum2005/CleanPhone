package w1;

import android.net.Uri;
import i1.l0;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class p extends q {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final p f52861n;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final List f52862d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final List f52863e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final List f52864f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final List f52865g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final List f52866h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final List f52867i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final i1.p f52868j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final List f52869k;
    public final Map l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final List f52870m;

    static {
        List list = Collections.EMPTY_LIST;
        f52861n = new p("", list, list, list, list, list, list, null, list, false, Collections.EMPTY_MAP, list);
    }

    public p(String str, List list, List list2, List list3, List list4, List list5, List list6, i1.p pVar, List list7, boolean z10, Map map, List list8) {
        super(str, list, z10);
        ArrayList arrayList = new ArrayList();
        for (int i10 = 0; i10 < list2.size(); i10++) {
            Uri uri = ((o) list2.get(i10)).f52855a;
            if (!arrayList.contains(uri)) {
                arrayList.add(uri);
            }
        }
        a(list3, arrayList);
        a(list4, arrayList);
        a(list5, arrayList);
        a(list6, arrayList);
        this.f52862d = Collections.unmodifiableList(arrayList);
        this.f52863e = Collections.unmodifiableList(list2);
        this.f52864f = Collections.unmodifiableList(list3);
        this.f52865g = Collections.unmodifiableList(list4);
        this.f52866h = Collections.unmodifiableList(list5);
        this.f52867i = Collections.unmodifiableList(list6);
        this.f52868j = pVar;
        this.f52869k = list7 != null ? Collections.unmodifiableList(list7) : null;
        this.l = Collections.unmodifiableMap(map);
        this.f52870m = Collections.unmodifiableList(list8);
    }

    public static void a(List list, ArrayList arrayList) {
        for (int i10 = 0; i10 < list.size(); i10++) {
            Uri uri = ((n) list.get(i10)).f52852a;
            if (!arrayList.contains(uri)) {
                arrayList.add(uri);
            }
        }
    }

    public static ArrayList b(List list, int i10, List list2) {
        ArrayList arrayList = new ArrayList(list2.size());
        for (int i11 = 0; i11 < list.size(); i11++) {
            Object obj = list.get(i11);
            for (int i12 = 0; i12 < list2.size(); i12++) {
                l0 l0Var = (l0) list2.get(i12);
                if (l0Var.f42575b == i10 && l0Var.f42576c == i11) {
                    arrayList.add(obj);
                    break;
                }
            }
        }
        return arrayList;
    }

    @Override // a2.a
    public final Object copy(List list) {
        ArrayList arrayListB = b(this.f52863e, 0, list);
        List list2 = Collections.EMPTY_LIST;
        return new p(this.f52871a, this.f52872b, arrayListB, list2, b(this.f52865g, 1, list), b(this.f52866h, 2, list), list2, this.f52868j, this.f52869k, this.f52873c, this.l, this.f52870m);
    }
}
