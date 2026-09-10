package com.google.common.collect;

import java.util.Iterator;
import java.util.Map;
import java.util.NavigableMap;
import java.util.NavigableSet;
import java.util.NoSuchElementException;

/* JADX INFO: loaded from: classes4.dex */
@ElementTypesAreNonnullByDefault
public abstract class ForwardingNavigableMap<K, V> extends ForwardingSortedMap<K, V> implements NavigableMap<K, V> {

    public class StandardDescendingMap extends Maps.DescendingMap<K, V> {

        /* JADX INFO: renamed from: com.google.common.collect.ForwardingNavigableMap$StandardDescendingMap$1, reason: invalid class name */
        class AnonymousClass1 implements Iterator<Map.Entry<Object, Object>> {
            @Override // java.util.Iterator
            public final boolean hasNext() {
                return false;
            }

            @Override // java.util.Iterator
            public final Map.Entry<Object, Object> next() {
                throw new NoSuchElementException();
            }

            @Override // java.util.Iterator
            public final void remove() {
                throw new IllegalStateException("no calls to next() since the last call to remove()");
            }
        }

        @Override // com.google.common.collect.Maps.DescendingMap
        public final NavigableMap A() {
            return null;
        }

        @Override // com.google.common.collect.Maps.DescendingMap
        public final Iterator z() {
            throw null;
        }
    }

    public class StandardNavigableKeySet extends Maps.NavigableKeySet<K, V> {
    }

    @Override // com.google.common.collect.ForwardingSortedMap
    /* JADX INFO: renamed from: A, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public abstract NavigableMap x();

    @Override // java.util.NavigableMap
    public final Map.Entry ceilingEntry(Object obj) {
        return w().ceilingEntry(obj);
    }

    @Override // java.util.NavigableMap
    public final Object ceilingKey(Object obj) {
        return w().ceilingKey(obj);
    }

    @Override // java.util.NavigableMap
    public final NavigableSet descendingKeySet() {
        return w().descendingKeySet();
    }

    @Override // java.util.NavigableMap
    public final NavigableMap descendingMap() {
        return w().descendingMap();
    }

    @Override // java.util.NavigableMap
    public final Map.Entry firstEntry() {
        return w().firstEntry();
    }

    @Override // java.util.NavigableMap
    public final Map.Entry floorEntry(Object obj) {
        return w().floorEntry(obj);
    }

    @Override // java.util.NavigableMap
    public final Object floorKey(Object obj) {
        return w().floorKey(obj);
    }

    @Override // java.util.NavigableMap
    public final NavigableMap headMap(Object obj, boolean z2) {
        return w().headMap(obj, z2);
    }

    @Override // java.util.NavigableMap
    public final Map.Entry higherEntry(Object obj) {
        return w().higherEntry(obj);
    }

    @Override // java.util.NavigableMap
    public final Object higherKey(Object obj) {
        return w().higherKey(obj);
    }

    @Override // java.util.NavigableMap
    public final Map.Entry lastEntry() {
        return w().lastEntry();
    }

    @Override // java.util.NavigableMap
    public final Map.Entry lowerEntry(Object obj) {
        return w().lowerEntry(obj);
    }

    @Override // java.util.NavigableMap
    public final Object lowerKey(Object obj) {
        return w().lowerKey(obj);
    }

    @Override // java.util.NavigableMap
    public final NavigableSet navigableKeySet() {
        return w().navigableKeySet();
    }

    @Override // java.util.NavigableMap
    public final Map.Entry pollFirstEntry() {
        return w().pollFirstEntry();
    }

    @Override // java.util.NavigableMap
    public final Map.Entry pollLastEntry() {
        return w().pollLastEntry();
    }

    @Override // java.util.NavigableMap
    public final NavigableMap subMap(Object obj, boolean z2, Object obj2, boolean z3) {
        return w().subMap(obj, z2, obj2, z3);
    }

    @Override // java.util.NavigableMap
    public final NavigableMap tailMap(Object obj, boolean z2) {
        return w().tailMap(obj, z2);
    }
}
