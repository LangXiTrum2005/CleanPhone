package xj;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.NoSuchElementException;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
public abstract class b0 extends no.b {
    public static Object M(Object obj, Map map) {
        kotlin.jvm.internal.n.f(map, "<this>");
        if (map instanceof a0) {
            return ((a0) map).n();
        }
        Object obj2 = map.get(obj);
        if (obj2 != null || map.containsKey(obj)) {
            return obj2;
        }
        throw new NoSuchElementException("Key " + obj + " is missing in the map.");
    }

    public static HashMap N(wj.f... fVarArr) {
        HashMap map = new HashMap(O(fVarArr.length));
        V(map, fVarArr);
        return map;
    }

    public static int O(int i10) {
        if (i10 < 0) {
            return i10;
        }
        if (i10 < 3) {
            return i10 + 1;
        }
        if (i10 < 1073741824) {
            return (int) ((i10 / 0.75f) + 1.0f);
        }
        return Integer.MAX_VALUE;
    }

    public static Map P(wj.f pair) {
        kotlin.jvm.internal.n.f(pair, "pair");
        Map mapSingletonMap = Collections.singletonMap(pair.f53283a, pair.f53284b);
        kotlin.jvm.internal.n.e(mapSingletonMap, "singletonMap(...)");
        return mapSingletonMap;
    }

    public static Map Q(wj.f... fVarArr) {
        if (fVarArr.length <= 0) {
            return w.f53867a;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(O(fVarArr.length));
        V(linkedHashMap, fVarArr);
        return linkedHashMap;
    }

    public static LinkedHashMap R(wj.f... fVarArr) {
        LinkedHashMap linkedHashMap = new LinkedHashMap(O(fVarArr.length));
        V(linkedHashMap, fVarArr);
        return linkedHashMap;
    }

    public static final Map S(LinkedHashMap linkedHashMap) {
        int size = linkedHashMap.size();
        if (size != 0) {
            return size != 1 ? linkedHashMap : Z(linkedHashMap);
        }
        return w.f53867a;
    }

    public static LinkedHashMap T(Map map, Map map2) {
        kotlin.jvm.internal.n.f(map, "<this>");
        kotlin.jvm.internal.n.f(map2, "map");
        LinkedHashMap linkedHashMap = new LinkedHashMap(map);
        linkedHashMap.putAll(map2);
        return linkedHashMap;
    }

    public static Map U(Map map, wj.f fVar) {
        kotlin.jvm.internal.n.f(map, "<this>");
        if (map.isEmpty()) {
            return P(fVar);
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(map);
        linkedHashMap.put(fVar.f53283a, fVar.f53284b);
        return linkedHashMap;
    }

    public static final void V(HashMap map, wj.f[] fVarArr) {
        for (wj.f fVar : fVarArr) {
            map.put(fVar.f53283a, fVar.f53284b);
        }
    }

    public static Map W(ArrayList arrayList) {
        int size = arrayList.size();
        if (size == 0) {
            return w.f53867a;
        }
        if (size == 1) {
            return P((wj.f) arrayList.get(0));
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(O(arrayList.size()));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            wj.f fVar = (wj.f) it.next();
            linkedHashMap.put(fVar.f53283a, fVar.f53284b);
        }
        return linkedHashMap;
    }

    public static Map X(Map map) {
        kotlin.jvm.internal.n.f(map, "<this>");
        int size = map.size();
        if (size != 0) {
            return size != 1 ? Y(map) : Z(map);
        }
        return w.f53867a;
    }

    public static LinkedHashMap Y(Map map) {
        kotlin.jvm.internal.n.f(map, "<this>");
        return new LinkedHashMap(map);
    }

    public static final Map Z(Map map) {
        kotlin.jvm.internal.n.f(map, "<this>");
        Map.Entry entry = (Map.Entry) map.entrySet().iterator().next();
        Map mapSingletonMap = Collections.singletonMap(entry.getKey(), entry.getValue());
        kotlin.jvm.internal.n.e(mapSingletonMap, "with(...)");
        return mapSingletonMap;
    }
}
