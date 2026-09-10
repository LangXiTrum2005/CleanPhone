package kotlin.collections;

import java.util.Collections;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"kotlin-stdlib"}, k = 5, mv = {2, 1, 0}, xi = 49, xs = "kotlin/collections/MapsKt")
class MapsKt__MapsJVMKt extends MapsKt__MapWithDefaultKt {
    public static final Map a(Map map) {
        Intrinsics.f(map, "<this>");
        Map.Entry entry = (Map.Entry) map.entrySet().iterator().next();
        Map mapSingletonMap = Collections.singletonMap(entry.getKey(), entry.getValue());
        Intrinsics.e(mapSingletonMap, "with(...)");
        return mapSingletonMap;
    }
}
