package wk;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final LinkedHashSet f53304a;

    static {
        Set<j> set = j.f53317e;
        ArrayList arrayList = new ArrayList(xj.p.W(set, 10));
        for (j primitiveType : set) {
            kotlin.jvm.internal.n.f(primitiveType, "primitiveType");
            arrayList.add(m.f53373k.c(primitiveType.f53326a));
        }
        ArrayList arrayListD0 = xj.n.D0(xj.n.D0(xj.n.D0(arrayList, l.f53343f.g()), l.f53345h.g()), l.f53347j.g());
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        Iterator it = arrayListD0.iterator();
        while (it.hasNext()) {
            linkedHashSet.add(yl.b.j((yl.c) it.next()));
        }
        f53304a = linkedHashSet;
    }
}
