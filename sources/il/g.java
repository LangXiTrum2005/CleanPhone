package il;

import com.unity3d.ads.metadata.MediationMetaData;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
public abstract class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Object f43073a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final LinkedHashMap f43074b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Set f43075c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final Set f43076d;

    /* JADX WARN: Type inference failed for: r0v14, types: [java.lang.Object, java.util.Map] */
    static {
        yl.e eVar = wk.l.f53347j;
        wj.f fVar = new wj.f(eVar.b(yl.f.e("name")).g(), yl.f.e("name"));
        wj.f fVar2 = new wj.f(eVar.b(yl.f.e(MediationMetaData.KEY_ORDINAL)).g(), yl.f.e(MediationMetaData.KEY_ORDINAL));
        wj.f fVar3 = new wj.f(wk.l.B.c(yl.f.e("size")), yl.f.e("size"));
        yl.c cVar = wk.l.F;
        Map mapQ = xj.b0.Q(fVar, fVar2, fVar3, new wj.f(cVar.c(yl.f.e("size")), yl.f.e("size")), new wj.f(wk.l.f53342e.b(yl.f.e("length")).g(), yl.f.e("length")), new wj.f(cVar.c(yl.f.e("keys")), yl.f.e("keySet")), new wj.f(cVar.c(yl.f.e("values")), yl.f.e("values")), new wj.f(cVar.c(yl.f.e("entries")), yl.f.e("entrySet")));
        f43073a = mapQ;
        Set<Map.Entry> setEntrySet = mapQ.entrySet();
        ArrayList<wj.f> arrayList = new ArrayList(xj.p.W(setEntrySet, 10));
        for (Map.Entry entry : setEntrySet) {
            arrayList.add(new wj.f(((yl.c) entry.getKey()).f(), entry.getValue()));
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (wj.f fVar4 : arrayList) {
            yl.f fVar5 = (yl.f) fVar4.f53284b;
            Object arrayList2 = linkedHashMap.get(fVar5);
            if (arrayList2 == null) {
                arrayList2 = new ArrayList();
                linkedHashMap.put(fVar5, arrayList2);
            }
            ((List) arrayList2).add((yl.f) fVar4.f53283a);
        }
        LinkedHashMap linkedHashMap2 = new LinkedHashMap(xj.b0.O(linkedHashMap.size()));
        for (Map.Entry entry2 : linkedHashMap.entrySet()) {
            linkedHashMap2.put(entry2.getKey(), xj.n.j0((Iterable) entry2.getValue()));
        }
        f43074b = linkedHashMap2;
        Set setKeySet = f43073a.keySet();
        f43075c = setKeySet;
        ArrayList arrayList3 = new ArrayList(xj.p.W(setKeySet, 10));
        Iterator it = setKeySet.iterator();
        while (it.hasNext()) {
            arrayList3.add(((yl.c) it.next()).f());
        }
        f43076d = xj.n.R0(arrayList3);
    }
}
