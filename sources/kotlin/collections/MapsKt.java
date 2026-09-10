package kotlin.collections;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.sequences.TransformingSequence;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"kotlin/collections/MapsKt__MapWithDefaultKt", "kotlin/collections/MapsKt__MapsJVMKt", "kotlin/collections/MapsKt__MapsKt", "kotlin/collections/MapsKt___MapsJvmKt", "kotlin/collections/MapsKt___MapsKt"}, k = 4, mv = {2, 1, 0}, xi = 49)
public final class MapsKt extends MapsKt___MapsKt {
    public static Object f(Map map, Object obj) {
        Intrinsics.f(map, "<this>");
        if (map instanceof MapWithDefault) {
            return ((MapWithDefault) map).s(obj);
        }
        Object obj2 = map.get(obj);
        if (obj2 != null || map.containsKey(obj)) {
            return obj2;
        }
        throw new NoSuchElementException("Key " + obj + " is missing in the map.");
    }

    public static HashMap g(Pair... pairArr) {
        HashMap map = new HashMap(h(pairArr.length));
        MapsKt__MapsKt.c(map, pairArr);
        return map;
    }

    public static int h(int i2) {
        if (i2 < 0) {
            return i2;
        }
        if (i2 < 3) {
            return i2 + 1;
        }
        if (i2 < 1073741824) {
            return (int) ((i2 / 0.75f) + 1.0f);
        }
        return Integer.MAX_VALUE;
    }

    public static Map i(Pair pair) {
        Intrinsics.f(pair, "pair");
        Map mapSingletonMap = Collections.singletonMap(pair.X, pair.f43249Y);
        Intrinsics.e(mapSingletonMap, "singletonMap(...)");
        return mapSingletonMap;
    }

    public static Map j(Pair... pairArr) {
        if (pairArr.length <= 0) {
            return EmptyMap.X;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(h(pairArr.length));
        MapsKt__MapsKt.c(linkedHashMap, pairArr);
        return linkedHashMap;
    }

    public static Map k(String str, Map map) {
        Intrinsics.f(map, "<this>");
        LinkedHashMap linkedHashMapS = s(map);
        linkedHashMapS.remove(str);
        return MapsKt__MapsKt.b(linkedHashMapS);
    }

    public static LinkedHashMap l(Pair... pairArr) {
        LinkedHashMap linkedHashMap = new LinkedHashMap(h(pairArr.length));
        MapsKt__MapsKt.c(linkedHashMap, pairArr);
        return linkedHashMap;
    }

    public static LinkedHashMap m(Map map, Map map2) {
        Intrinsics.f(map, "<this>");
        Intrinsics.f(map2, "map");
        LinkedHashMap linkedHashMap = new LinkedHashMap(map);
        linkedHashMap.putAll(map2);
        return linkedHashMap;
    }

    public static Map n(Map map, ArrayList arrayList) {
        Intrinsics.f(map, "<this>");
        if (map.isEmpty()) {
            return p(arrayList);
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(map);
        MapsKt__MapsKt.d(linkedHashMap, arrayList);
        return linkedHashMap;
    }

    public static Map o(Map map, Pair pair) {
        Intrinsics.f(map, "<this>");
        if (map.isEmpty()) {
            return i(pair);
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(map);
        linkedHashMap.put(pair.X, pair.f43249Y);
        return linkedHashMap;
    }

    public static Map p(List list) {
        if (!(list instanceof Collection)) {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            MapsKt__MapsKt.d(linkedHashMap, list);
            return MapsKt__MapsKt.b(linkedHashMap);
        }
        List list2 = list;
        int size = list2.size();
        if (size == 0) {
            return EmptyMap.X;
        }
        if (size == 1) {
            return i((Pair) (list instanceof List ? list.get(0) : list2.iterator().next()));
        }
        LinkedHashMap linkedHashMap2 = new LinkedHashMap(h(list2.size()));
        MapsKt__MapsKt.d(linkedHashMap2, list);
        return linkedHashMap2;
    }

    public static Map q(Map map) {
        Intrinsics.f(map, "<this>");
        int size = map.size();
        if (size != 0) {
            return size != 1 ? s(map) : MapsKt__MapsJVMKt.a(map);
        }
        return EmptyMap.X;
    }

    public static Map r(TransformingSequence transformingSequence) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        TransformingSequence.AnonymousClass1 anonymousClass1 = new TransformingSequence.AnonymousClass1();
        while (anonymousClass1.X.hasNext()) {
            Pair pair = (Pair) anonymousClass1.next();
            linkedHashMap.put(pair.X, pair.f43249Y);
        }
        return MapsKt__MapsKt.b(linkedHashMap);
    }

    public static LinkedHashMap s(Map map) {
        Intrinsics.f(map, "<this>");
        return new LinkedHashMap(map);
    }

    public static Map t(Map map, Function1 defaultValue) {
        Intrinsics.f(map, "<this>");
        Intrinsics.f(defaultValue, "defaultValue");
        return map instanceof MutableMapWithDefault ? t(((MutableMapWithDefault) map).getX(), defaultValue) : new MutableMapWithDefaultImpl(map, defaultValue);
    }
}
