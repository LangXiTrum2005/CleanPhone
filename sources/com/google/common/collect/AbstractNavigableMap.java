package com.google.common.collect;

import java.util.Iterator;
import java.util.Map;
import java.util.NavigableMap;
import java.util.NavigableSet;
import java.util.NoSuchElementException;
import java.util.Set;
import java.util.SortedMap;

/* JADX INFO: loaded from: classes4.dex */
@ElementTypesAreNonnullByDefault
abstract class AbstractNavigableMap<K, V> extends Maps.IteratorBasedAbstractMap<K, V> implements NavigableMap<K, V> {

    public final class DescendingMap extends Maps.DescendingMap<K, V> {
        public DescendingMap() {
        }

        @Override // com.google.common.collect.Maps.DescendingMap
        public final NavigableMap A() {
            return AbstractNavigableMap.this;
        }

        @Override // com.google.common.collect.Maps.DescendingMap
        public final Iterator z() {
            return AbstractNavigableMap.this.b();
        }
    }

    public abstract Iterator b();

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.NavigableMap
    public final Map.Entry ceilingEntry(Object obj) {
        return tailMap(obj, true).firstEntry();
    }

    @Override // java.util.NavigableMap
    public final Object ceilingKey(Object obj) {
        return Maps.g(ceilingEntry(obj));
    }

    @Override // java.util.NavigableMap
    public final NavigableSet descendingKeySet() {
        return descendingMap().navigableKeySet();
    }

    @Override // java.util.NavigableMap
    public NavigableMap descendingMap() {
        return new DescendingMap();
    }

    @Override // java.util.NavigableMap
    public final Map.Entry firstEntry() {
        return (Map.Entry) Iterators.h(a(), null);
    }

    @Override // java.util.SortedMap
    public final Object firstKey() {
        Map.Entry entryFirstEntry = firstEntry();
        if (entryFirstEntry != null) {
            return entryFirstEntry.getKey();
        }
        throw new NoSuchElementException();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.NavigableMap
    public final Map.Entry floorEntry(Object obj) {
        return headMap(obj, true).lastEntry();
    }

    @Override // java.util.NavigableMap
    public final Object floorKey(Object obj) {
        return Maps.g(floorEntry(obj));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.NavigableMap, java.util.SortedMap
    public final SortedMap headMap(Object obj) {
        return headMap(obj, false);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.NavigableMap
    public final Map.Entry higherEntry(Object obj) {
        return tailMap(obj, false).firstEntry();
    }

    @Override // java.util.NavigableMap
    public final Object higherKey(Object obj) {
        return Maps.g(higherEntry(obj));
    }

    @Override // java.util.AbstractMap, java.util.Map, java.util.SortedMap
    public final Set keySet() {
        return navigableKeySet();
    }

    @Override // java.util.NavigableMap
    public final Map.Entry lastEntry() {
        return (Map.Entry) Iterators.h(b(), null);
    }

    @Override // java.util.SortedMap
    public final Object lastKey() {
        Map.Entry entryLastEntry = lastEntry();
        if (entryLastEntry != null) {
            return entryLastEntry.getKey();
        }
        throw new NoSuchElementException();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.NavigableMap
    public final Map.Entry lowerEntry(Object obj) {
        return headMap(obj, false).lastEntry();
    }

    @Override // java.util.NavigableMap
    public final Object lowerKey(Object obj) {
        return Maps.g(lowerEntry(obj));
    }

    @Override // java.util.NavigableMap
    public NavigableSet navigableKeySet() {
        return new Maps.NavigableKeySet(this);
    }

    @Override // java.util.NavigableMap
    public Map.Entry pollFirstEntry() {
        return (Map.Entry) Iterators.j(a());
    }

    @Override // java.util.NavigableMap
    public Map.Entry pollLastEntry() {
        return (Map.Entry) Iterators.j(b());
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.NavigableMap, java.util.SortedMap
    public final SortedMap subMap(Object obj, Object obj2) {
        return subMap(obj, true, obj2, false);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.NavigableMap, java.util.SortedMap
    public final SortedMap tailMap(Object obj) {
        return tailMap(obj, true);
    }
}
