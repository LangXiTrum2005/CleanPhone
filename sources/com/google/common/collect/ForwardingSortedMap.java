package com.google.common.collect;

import java.util.Comparator;
import java.util.SortedMap;

/* JADX INFO: loaded from: classes4.dex */
@ElementTypesAreNonnullByDefault
public abstract class ForwardingSortedMap<K, V> extends ForwardingMap<K, V> implements SortedMap<K, V> {

    public class StandardKeySet extends Maps.SortedKeySet<K, V> {
    }

    @Override // java.util.SortedMap
    public final Comparator comparator() {
        return x().comparator();
    }

    @Override // java.util.SortedMap
    public final Object firstKey() {
        return x().firstKey();
    }

    @Override // java.util.SortedMap
    public SortedMap headMap(Object obj) {
        return x().headMap(obj);
    }

    @Override // java.util.SortedMap
    public final Object lastKey() {
        return x().lastKey();
    }

    @Override // java.util.SortedMap
    public SortedMap subMap(Object obj, Object obj2) {
        return x().subMap(obj, obj2);
    }

    @Override // java.util.SortedMap
    public SortedMap tailMap(Object obj) {
        return x().tailMap(obj);
    }

    @Override // com.google.common.collect.ForwardingMap
    /* JADX INFO: renamed from: z, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public abstract SortedMap w();
}
