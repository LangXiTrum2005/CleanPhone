package e5;

import d5.o;
import d5.p;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class e extends a.a {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final String f39087h = o.i("WorkContinuationImpl");

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final l f39088c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final List f39089d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final ArrayList f39090e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final ArrayList f39091f = new ArrayList();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f39092g;

    public e(l lVar, List list) {
        this.f39088c = lVar;
        this.f39089d = list;
        this.f39090e = new ArrayList(list.size());
        for (int i10 = 0; i10 < list.size(); i10++) {
            String string = ((p) list.get(i10)).f38704a.toString();
            this.f39090e.add(string);
            this.f39091f.add(string);
        }
    }

    public static HashSet P(e eVar) {
        HashSet hashSet = new HashSet();
        eVar.getClass();
        return hashSet;
    }
}
