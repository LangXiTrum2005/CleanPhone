package p002kotlin.collections;

import com.ironsource.X3;
import java.util.Map;
import java.util.NoSuchElementException;
import p002kotlin.Metadata;
import p002kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: MapWithDefault.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\b\u0004\u001a3\u0010\u0004\u001a\u00028\u0001\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00022\u0006\u0010\u0003\u001a\u00028\u0000H\u0001¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"K", "V", "", X3.i.W, "attabal", "(Ljava/util/Map;Ljava/lang/Object;)Ljava/lang/Object;", "kotlin-stdlib"}, k = 5, mv = {2, 2, 0}, xi = 49, xs = "kotlin/collections/MapsKt")
public class merc {
    public static final <K, V> V attabal(Map<K, ? extends V> map, K k) {
        Intrinsics.checkNotNullParameter(map, "<this>");
        if (map instanceof restrictive) {
            return (V) ((restrictive) map).apical(k);
        }
        V v = map.get(k);
        if (v != null || map.containsKey(k)) {
            return v;
        }
        throw new NoSuchElementException("Key " + k + " is missing in the map.");
    }
}
