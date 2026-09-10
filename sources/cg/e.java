package cg;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import xj.v;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f6385a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ec.a f6386b;

    public e(ArrayList arrayList, String str) {
        Iterable iterable;
        List<wj.f> listP0;
        this.f6385a = arrayList;
        this.f6386b = new ec.a(str);
        Iterator it = arrayList.iterator();
        if (it.hasNext()) {
            ArrayList arrayList2 = new ArrayList();
            Object next = it.next();
            while (it.hasNext()) {
                Object next2 = it.next();
                arrayList2.add(new wj.f(next, next2));
                next = next2;
            }
            iterable = arrayList2;
        } else {
            iterable = v.f53866a;
        }
        Iterable iterable2 = iterable;
        if (!(iterable2 instanceof Collection) || ((Collection) iterable2).size() > 1) {
            listP0 = xj.n.P0(iterable2);
            Collections.reverse(listP0);
        } else {
            listP0 = xj.n.N0(iterable2);
        }
        for (wj.f fVar : listP0) {
            f fVar2 = (f) fVar.f53283a;
            f next3 = (f) fVar.f53284b;
            fVar2.getClass();
            kotlin.jvm.internal.n.f(next3, "next");
            fVar2.f6393g = next3.f6389c;
            fVar2.f6387a.f(next3.f6387a.d());
        }
    }
}
