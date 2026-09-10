package lyreflower;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import p002kotlin.collections.CollectionsKt;
import p002kotlin.collections.adultoid;
import p002kotlin.collections.graveside;
import p002kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: collections.kt */
/* JADX INFO: loaded from: classes5.dex */
public final class attabal {
    public static final <T> void attabal(Collection<T> collection2, T t) {
        Intrinsics.checkNotNullParameter(collection2, "<this>");
        if (t != null) {
            collection2.add(t);
        }
    }

    public static final <E> HashSet<E> beachfront(int i) {
        return new HashSet<>(saneness(i));
    }

    public static final <E> LinkedHashSet<E> competently(int i) {
        return new LinkedHashSet<>(saneness(i));
    }

    public static final <T> List<T> dern(ArrayList<T> arrayList) {
        Intrinsics.checkNotNullParameter(arrayList, "<this>");
        int size = arrayList.size();
        if (size == 0) {
            return adultoid.formularize();
        }
        if (size == 1) {
            return graveside.marial(CollectionsKt.lerp(arrayList));
        }
        arrayList.trimToSize();
        return arrayList;
    }

    public static final <K, V> HashMap<K, V> marial(int i) {
        return new HashMap<>(saneness(i));
    }

    public static final int saneness(int i) {
        if (i < 3) {
            return 3;
        }
        return i + (i / 3) + 1;
    }

    public static final <K> Map<K, Integer> wireman(Iterable<? extends K> iterable) {
        Intrinsics.checkNotNullParameter(iterable, "<this>");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Iterator<? extends K> it = iterable.iterator();
        int i = 0;
        while (it.hasNext()) {
            linkedHashMap.put(it.next(), Integer.valueOf(i));
            i++;
        }
        return linkedHashMap;
    }
}
