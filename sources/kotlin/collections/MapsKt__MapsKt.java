package kotlin.collections;

import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Pair;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"kotlin-stdlib"}, k = 5, mv = {2, 1, 0}, xi = 49, xs = "kotlin/collections/MapsKt")
class MapsKt__MapsKt extends MapsKt__MapsJVMKt {
    public static final Map b(LinkedHashMap linkedHashMap) {
        int size = linkedHashMap.size();
        if (size != 0) {
            return size != 1 ? linkedHashMap : MapsKt__MapsJVMKt.a(linkedHashMap);
        }
        return EmptyMap.X;
    }

    public static final void c(HashMap map, Pair[] pairArr) {
        for (Pair pair : pairArr) {
            map.put(pair.X, pair.f43249Y);
        }
    }

    public static final void d(LinkedHashMap linkedHashMap, List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            Pair pair = (Pair) it.next();
            linkedHashMap.put(pair.X, pair.f43249Y);
        }
    }
}
