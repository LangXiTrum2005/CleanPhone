package com.google.common.collect;

import com.google.common.base.Preconditions;
import java.io.Serializable;
import java.util.AbstractCollection;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.NavigableMap;
import java.util.NavigableSet;
import java.util.Objects;
import java.util.RandomAccess;
import java.util.Set;
import java.util.SortedMap;
import java.util.SortedSet;

/* JADX INFO: loaded from: classes4.dex */
@ElementTypesAreNonnullByDefault
abstract class AbstractMapBasedMultimap<K, V> extends AbstractMultimap<K, V> implements Serializable {
    private static final long serialVersionUID = 2447537837011683357L;
    public transient Map g0;
    public transient int h0;

    /* JADX INFO: renamed from: com.google.common.collect.AbstractMapBasedMultimap$1, reason: invalid class name */
    class AnonymousClass1 extends AbstractMapBasedMultimap<Object, Object>.Itr<Object> {
        @Override // com.google.common.collect.AbstractMapBasedMultimap.Itr
        public final Object a(Object obj, Object obj2) {
            return obj2;
        }
    }

    /* JADX INFO: renamed from: com.google.common.collect.AbstractMapBasedMultimap$2, reason: invalid class name */
    class AnonymousClass2 extends AbstractMapBasedMultimap<Object, Object>.Itr<Map.Entry<Object, Object>> {
        @Override // com.google.common.collect.AbstractMapBasedMultimap.Itr
        public final Object a(Object obj, Object obj2) {
            return new ImmutableEntry(obj, obj2);
        }
    }

    public class AsMap extends Maps.ViewCachingAbstractMap<K, Collection<V>> {
        public final transient Map e0;

        public class AsMapEntries extends Maps.EntrySet<K, Collection<V>> {
            public AsMapEntries() {
            }

            @Override // com.google.common.collect.Maps.EntrySet
            public final Map a() {
                return AsMap.this;
            }

            @Override // com.google.common.collect.Maps.EntrySet, java.util.AbstractCollection, java.util.Collection, java.util.Set
            public final boolean contains(Object obj) {
                return Collections2.c(obj, AsMap.this.e0.entrySet());
            }

            @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
            public final Iterator iterator() {
                return AsMap.this.new AsMapIterator();
            }

            @Override // com.google.common.collect.Maps.EntrySet, java.util.AbstractCollection, java.util.Collection, java.util.Set
            public final boolean remove(Object obj) {
                Object objRemove;
                if (!contains(obj)) {
                    return false;
                }
                Map.Entry entry = (Map.Entry) obj;
                Objects.requireNonNull(entry);
                AbstractMapBasedMultimap abstractMapBasedMultimap = AbstractMapBasedMultimap.this;
                Object key = entry.getKey();
                Map map = abstractMapBasedMultimap.g0;
                map.getClass();
                try {
                    objRemove = map.remove(key);
                } catch (ClassCastException | NullPointerException unused) {
                    objRemove = null;
                }
                Collection collection = (Collection) objRemove;
                if (collection == null) {
                    return true;
                }
                int size = collection.size();
                collection.clear();
                abstractMapBasedMultimap.h0 -= size;
                return true;
            }
        }

        public class AsMapIterator implements Iterator<Map.Entry<K, Collection<V>>> {
            public final Iterator X;

            /* JADX INFO: renamed from: Y, reason: collision with root package name */
            public Collection f19785Y;

            public AsMapIterator() {
                this.X = AsMap.this.e0.entrySet().iterator();
            }

            @Override // java.util.Iterator
            public final boolean hasNext() {
                return this.X.hasNext();
            }

            @Override // java.util.Iterator
            public final Object next() {
                Map.Entry entry = (Map.Entry) this.X.next();
                this.f19785Y = (Collection) entry.getValue();
                return AsMap.this.d(entry);
            }

            @Override // java.util.Iterator
            public final void remove() {
                Preconditions.o("no calls to next() since the last call to remove()", this.f19785Y != null);
                this.X.remove();
                AbstractMapBasedMultimap.this.h0 -= this.f19785Y.size();
                this.f19785Y.clear();
                this.f19785Y = null;
            }
        }

        public AsMap(Map map) {
            this.e0 = map;
        }

        @Override // com.google.common.collect.Maps.ViewCachingAbstractMap
        public final Set a() {
            return new AsMapEntries();
        }

        @Override // java.util.AbstractMap, java.util.Map
        public final void clear() {
            AbstractMapBasedMultimap abstractMapBasedMultimap = AbstractMapBasedMultimap.this;
            if (this.e0 == abstractMapBasedMultimap.g0) {
                abstractMapBasedMultimap.clear();
            } else {
                Iterators.b(new AsMapIterator());
            }
        }

        @Override // java.util.AbstractMap, java.util.Map
        public final boolean containsKey(Object obj) {
            return Maps.h(this.e0, obj);
        }

        public final Map.Entry d(Map.Entry entry) {
            Object key = entry.getKey();
            return new ImmutableEntry(key, AbstractMapBasedMultimap.this.z(key, (Collection) entry.getValue()));
        }

        @Override // java.util.AbstractMap, java.util.Map
        public final boolean equals(Object obj) {
            return this == obj || this.e0.equals(obj);
        }

        @Override // java.util.AbstractMap, java.util.Map
        public final Object get(Object obj) {
            Collection collection = (Collection) Maps.i(this.e0, obj);
            if (collection == null) {
                return null;
            }
            return AbstractMapBasedMultimap.this.z(obj, collection);
        }

        @Override // java.util.AbstractMap, java.util.Map
        public final int hashCode() {
            return this.e0.hashCode();
        }

        @Override // com.google.common.collect.Maps.ViewCachingAbstractMap, java.util.AbstractMap, java.util.Map
        public Set keySet() {
            return AbstractMapBasedMultimap.this.keySet();
        }

        @Override // java.util.AbstractMap, java.util.Map
        public final Object remove(Object obj) {
            Collection collection = (Collection) this.e0.remove(obj);
            if (collection == null) {
                return null;
            }
            AbstractMapBasedMultimap abstractMapBasedMultimap = AbstractMapBasedMultimap.this;
            Collection collectionO = abstractMapBasedMultimap.o();
            collectionO.addAll(collection);
            abstractMapBasedMultimap.h0 -= collection.size();
            collection.clear();
            return collectionO;
        }

        @Override // java.util.AbstractMap, java.util.Map
        public final int size() {
            return this.e0.size();
        }

        @Override // java.util.AbstractMap
        public final String toString() {
            return this.e0.toString();
        }
    }

    public abstract class Itr<T> implements Iterator<T> {
        public final Iterator X;

        /* JADX INFO: renamed from: Y, reason: collision with root package name */
        public Object f19786Y = null;
        public Collection Z = null;
        public Iterator e0 = Iterators.EmptyModifiableIterator.X;

        public Itr() {
            this.X = AbstractMapBasedMultimap.this.g0.entrySet().iterator();
        }

        public abstract Object a(Object obj, Object obj2);

        @Override // java.util.Iterator
        public final boolean hasNext() {
            return this.X.hasNext() || this.e0.hasNext();
        }

        @Override // java.util.Iterator
        public final Object next() {
            if (!this.e0.hasNext()) {
                Map.Entry entry = (Map.Entry) this.X.next();
                this.f19786Y = entry.getKey();
                Collection collection = (Collection) entry.getValue();
                this.Z = collection;
                this.e0 = collection.iterator();
            }
            return a(this.f19786Y, this.e0.next());
        }

        @Override // java.util.Iterator
        public final void remove() {
            this.e0.remove();
            Collection collection = this.Z;
            Objects.requireNonNull(collection);
            if (collection.isEmpty()) {
                this.X.remove();
            }
            AbstractMapBasedMultimap.this.h0--;
        }
    }

    public class KeySet extends Maps.KeySet<K, Collection<V>> {
        public KeySet(Map map) {
            super(map);
        }

        @Override // com.google.common.collect.Maps.KeySet, java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final void clear() {
            Iterators.b(iterator());
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final boolean containsAll(Collection collection) {
            return this.X.keySet().containsAll(collection);
        }

        @Override // java.util.AbstractSet, java.util.Collection, java.util.Set
        public final boolean equals(Object obj) {
            return this == obj || this.X.keySet().equals(obj);
        }

        @Override // java.util.AbstractSet, java.util.Collection, java.util.Set
        public final int hashCode() {
            return this.X.keySet().hashCode();
        }

        @Override // com.google.common.collect.Maps.KeySet, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public final Iterator iterator() {
            final Iterator<Map.Entry<K, V>> it = this.X.entrySet().iterator();
            return new Iterator<Object>() { // from class: com.google.common.collect.AbstractMapBasedMultimap.KeySet.1
                public Map.Entry X;

                @Override // java.util.Iterator
                public final boolean hasNext() {
                    return it.hasNext();
                }

                @Override // java.util.Iterator
                public final Object next() {
                    Map.Entry entry = (Map.Entry) it.next();
                    this.X = entry;
                    return entry.getKey();
                }

                @Override // java.util.Iterator
                public final void remove() {
                    Preconditions.o("no calls to next() since the last call to remove()", this.X != null);
                    Collection collection = (Collection) this.X.getValue();
                    it.remove();
                    KeySet keySet = KeySet.this;
                    AbstractMapBasedMultimap.this.h0 -= collection.size();
                    collection.clear();
                    this.X = null;
                }
            };
        }

        @Override // com.google.common.collect.Maps.KeySet, java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final boolean remove(Object obj) {
            int size;
            Collection collection = (Collection) this.X.remove(obj);
            if (collection != null) {
                size = collection.size();
                collection.clear();
                AbstractMapBasedMultimap.this.h0 -= size;
            } else {
                size = 0;
            }
            return size > 0;
        }
    }

    public final class NavigableAsMap extends AbstractMapBasedMultimap<K, V>.SortedAsMap implements NavigableMap<K, Collection<V>> {
        public NavigableAsMap(NavigableMap navigableMap) {
            super(navigableMap);
        }

        @Override // com.google.common.collect.AbstractMapBasedMultimap.SortedAsMap, com.google.common.collect.Maps.ViewCachingAbstractMap
        public final Set b() {
            return new NavigableKeySet(g());
        }

        @Override // java.util.NavigableMap
        public final Map.Entry ceilingEntry(Object obj) {
            Map.Entry<K, V> entryCeilingEntry = g().ceilingEntry(obj);
            if (entryCeilingEntry == null) {
                return null;
            }
            return d(entryCeilingEntry);
        }

        @Override // java.util.NavigableMap
        public final Object ceilingKey(Object obj) {
            return g().ceilingKey(obj);
        }

        @Override // java.util.NavigableMap
        public final NavigableSet descendingKeySet() {
            return (NavigableSet) super.keySet();
        }

        @Override // java.util.NavigableMap
        public final NavigableMap descendingMap() {
            return new NavigableAsMap(g().descendingMap());
        }

        @Override // com.google.common.collect.AbstractMapBasedMultimap.SortedAsMap
        /* JADX INFO: renamed from: e */
        public final SortedSet b() {
            return new NavigableKeySet(g());
        }

        @Override // com.google.common.collect.AbstractMapBasedMultimap.SortedAsMap
        /* JADX INFO: renamed from: f */
        public final SortedSet keySet() {
            return (NavigableSet) super.keySet();
        }

        @Override // java.util.NavigableMap
        public final Map.Entry firstEntry() {
            Map.Entry<K, V> entryFirstEntry = g().firstEntry();
            if (entryFirstEntry == null) {
                return null;
            }
            return d(entryFirstEntry);
        }

        @Override // java.util.NavigableMap
        public final Map.Entry floorEntry(Object obj) {
            Map.Entry<K, V> entryFloorEntry = g().floorEntry(obj);
            if (entryFloorEntry == null) {
                return null;
            }
            return d(entryFloorEntry);
        }

        @Override // java.util.NavigableMap
        public final Object floorKey(Object obj) {
            return g().floorKey(obj);
        }

        public final Map.Entry h(Iterator it) {
            if (!it.hasNext()) {
                return null;
            }
            Map.Entry entry = (Map.Entry) it.next();
            AbstractMapBasedMultimap abstractMapBasedMultimap = AbstractMapBasedMultimap.this;
            Collection collectionO = abstractMapBasedMultimap.o();
            collectionO.addAll((Collection) entry.getValue());
            it.remove();
            return new ImmutableEntry(entry.getKey(), abstractMapBasedMultimap.x(collectionO));
        }

        @Override // com.google.common.collect.AbstractMapBasedMultimap.SortedAsMap, java.util.SortedMap, java.util.NavigableMap
        public final SortedMap headMap(Object obj) {
            return headMap(obj, false);
        }

        @Override // java.util.NavigableMap
        public final Map.Entry higherEntry(Object obj) {
            Map.Entry<K, V> entryHigherEntry = g().higherEntry(obj);
            if (entryHigherEntry == null) {
                return null;
            }
            return d(entryHigherEntry);
        }

        @Override // java.util.NavigableMap
        public final Object higherKey(Object obj) {
            return g().higherKey(obj);
        }

        @Override // com.google.common.collect.AbstractMapBasedMultimap.SortedAsMap
        /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
        public final NavigableMap g() {
            return (NavigableMap) ((SortedMap) this.e0);
        }

        @Override // com.google.common.collect.AbstractMapBasedMultimap.SortedAsMap, com.google.common.collect.AbstractMapBasedMultimap.AsMap, com.google.common.collect.Maps.ViewCachingAbstractMap, java.util.AbstractMap, java.util.Map
        public final Set keySet() {
            return (NavigableSet) super.keySet();
        }

        @Override // java.util.NavigableMap
        public final Map.Entry lastEntry() {
            Map.Entry<K, V> entryLastEntry = g().lastEntry();
            if (entryLastEntry == null) {
                return null;
            }
            return d(entryLastEntry);
        }

        @Override // java.util.NavigableMap
        public final Map.Entry lowerEntry(Object obj) {
            Map.Entry<K, V> entryLowerEntry = g().lowerEntry(obj);
            if (entryLowerEntry == null) {
                return null;
            }
            return d(entryLowerEntry);
        }

        @Override // java.util.NavigableMap
        public final Object lowerKey(Object obj) {
            return g().lowerKey(obj);
        }

        @Override // java.util.NavigableMap
        public final NavigableSet navigableKeySet() {
            return (NavigableSet) super.keySet();
        }

        @Override // java.util.NavigableMap
        public final Map.Entry pollFirstEntry() {
            return h(entrySet().iterator());
        }

        @Override // java.util.NavigableMap
        public final Map.Entry pollLastEntry() {
            return h(((Maps.ViewCachingAbstractMap) descendingMap()).entrySet().iterator());
        }

        @Override // com.google.common.collect.AbstractMapBasedMultimap.SortedAsMap, java.util.SortedMap, java.util.NavigableMap
        public final SortedMap subMap(Object obj, Object obj2) {
            return subMap(obj, true, obj2, false);
        }

        @Override // com.google.common.collect.AbstractMapBasedMultimap.SortedAsMap, java.util.SortedMap, java.util.NavigableMap
        public final SortedMap tailMap(Object obj) {
            return tailMap(obj, true);
        }

        @Override // java.util.NavigableMap
        public final NavigableMap headMap(Object obj, boolean z2) {
            return new NavigableAsMap(g().headMap(obj, z2));
        }

        @Override // java.util.NavigableMap
        public final NavigableMap subMap(Object obj, boolean z2, Object obj2, boolean z3) {
            return new NavigableAsMap(g().subMap(obj, z2, obj2, z3));
        }

        @Override // java.util.NavigableMap
        public final NavigableMap tailMap(Object obj, boolean z2) {
            return new NavigableAsMap(g().tailMap(obj, z2));
        }
    }

    public final class NavigableKeySet extends AbstractMapBasedMultimap<K, V>.SortedKeySet implements NavigableSet<K> {
        public NavigableKeySet(NavigableMap navigableMap) {
            super(navigableMap);
        }

        @Override // java.util.NavigableSet
        public final Object ceiling(Object obj) {
            return c().ceilingKey(obj);
        }

        @Override // java.util.NavigableSet
        public final Iterator descendingIterator() {
            return ((KeySet) descendingSet()).iterator();
        }

        @Override // java.util.NavigableSet
        public final NavigableSet descendingSet() {
            return new NavigableKeySet(c().descendingMap());
        }

        @Override // java.util.NavigableSet
        public final Object floor(Object obj) {
            return c().floorKey(obj);
        }

        @Override // com.google.common.collect.AbstractMapBasedMultimap.SortedKeySet
        /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
        public final NavigableMap c() {
            return (NavigableMap) ((SortedMap) this.X);
        }

        @Override // com.google.common.collect.AbstractMapBasedMultimap.SortedKeySet, java.util.SortedSet, java.util.NavigableSet
        public final SortedSet headSet(Object obj) {
            return headSet(obj, false);
        }

        @Override // java.util.NavigableSet
        public final Object higher(Object obj) {
            return c().higherKey(obj);
        }

        @Override // java.util.NavigableSet
        public final Object lower(Object obj) {
            return c().lowerKey(obj);
        }

        @Override // java.util.NavigableSet
        public final Object pollFirst() {
            return Iterators.j(iterator());
        }

        @Override // java.util.NavigableSet
        public final Object pollLast() {
            return Iterators.j(descendingIterator());
        }

        @Override // com.google.common.collect.AbstractMapBasedMultimap.SortedKeySet, java.util.SortedSet, java.util.NavigableSet
        public final SortedSet subSet(Object obj, Object obj2) {
            return subSet(obj, true, obj2, false);
        }

        @Override // com.google.common.collect.AbstractMapBasedMultimap.SortedKeySet, java.util.SortedSet, java.util.NavigableSet
        public final SortedSet tailSet(Object obj) {
            return tailSet(obj, true);
        }

        @Override // java.util.NavigableSet
        public final NavigableSet headSet(Object obj, boolean z2) {
            return new NavigableKeySet(c().headMap(obj, z2));
        }

        @Override // java.util.NavigableSet
        public final NavigableSet subSet(Object obj, boolean z2, Object obj2, boolean z3) {
            return new NavigableKeySet(c().subMap(obj, z2, obj2, z3));
        }

        @Override // java.util.NavigableSet
        public final NavigableSet tailSet(Object obj, boolean z2) {
            return new NavigableKeySet(c().tailMap(obj, z2));
        }
    }

    public class RandomAccessWrappedList extends AbstractMapBasedMultimap<K, V>.WrappedList implements RandomAccess {
    }

    public class SortedAsMap extends AbstractMapBasedMultimap<K, V>.AsMap implements SortedMap<K, Collection<V>> {
        public SortedSet g0;

        public SortedAsMap(SortedMap sortedMap) {
            super(sortedMap);
        }

        @Override // java.util.SortedMap
        public final Comparator comparator() {
            return g().comparator();
        }

        @Override // com.google.common.collect.Maps.ViewCachingAbstractMap
        /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
        public SortedSet b() {
            return new SortedKeySet(g());
        }

        @Override // com.google.common.collect.AbstractMapBasedMultimap.AsMap, com.google.common.collect.Maps.ViewCachingAbstractMap, java.util.AbstractMap, java.util.Map
        /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
        public SortedSet keySet() {
            SortedSet sortedSet = this.g0;
            if (sortedSet != null) {
                return sortedSet;
            }
            SortedSet sortedSetB = b();
            this.g0 = sortedSetB;
            return sortedSetB;
        }

        @Override // java.util.SortedMap
        public final Object firstKey() {
            return g().firstKey();
        }

        public SortedMap g() {
            return (SortedMap) this.e0;
        }

        public SortedMap headMap(Object obj) {
            return new SortedAsMap(g().headMap(obj));
        }

        @Override // java.util.SortedMap
        public final Object lastKey() {
            return g().lastKey();
        }

        public SortedMap subMap(Object obj, Object obj2) {
            return new SortedAsMap(g().subMap(obj, obj2));
        }

        public SortedMap tailMap(Object obj) {
            return new SortedAsMap(g().tailMap(obj));
        }
    }

    public class SortedKeySet extends AbstractMapBasedMultimap<K, V>.KeySet implements SortedSet<K> {
        public SortedKeySet(SortedMap sortedMap) {
            super(sortedMap);
        }

        public SortedMap c() {
            return (SortedMap) this.X;
        }

        @Override // java.util.SortedSet
        public final Comparator comparator() {
            return c().comparator();
        }

        @Override // java.util.SortedSet
        public final Object first() {
            return c().firstKey();
        }

        public SortedSet headSet(Object obj) {
            return new SortedKeySet(c().headMap(obj));
        }

        @Override // java.util.SortedSet
        public final Object last() {
            return c().lastKey();
        }

        public SortedSet subSet(Object obj, Object obj2) {
            return new SortedKeySet(c().subMap(obj, obj2));
        }

        public SortedSet tailSet(Object obj) {
            return new SortedKeySet(c().tailMap(obj));
        }
    }

    public class WrappedNavigableSet extends AbstractMapBasedMultimap<K, V>.WrappedSortedSet implements NavigableSet<V> {
        public WrappedNavigableSet(Object obj, NavigableSet navigableSet, WrappedCollection wrappedCollection) {
            super(obj, navigableSet, wrappedCollection);
        }

        @Override // java.util.NavigableSet
        public final Object ceiling(Object obj) {
            return e().ceiling(obj);
        }

        @Override // java.util.NavigableSet
        public final Iterator descendingIterator() {
            return new WrappedCollection.WrappedIterator(e().descendingIterator());
        }

        @Override // java.util.NavigableSet
        public final NavigableSet descendingSet() {
            return g(e().descendingSet());
        }

        @Override // com.google.common.collect.AbstractMapBasedMultimap.WrappedSortedSet
        /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
        public final NavigableSet e() {
            return (NavigableSet) ((SortedSet) this.f19789Y);
        }

        @Override // java.util.NavigableSet
        public final Object floor(Object obj) {
            return e().floor(obj);
        }

        public final NavigableSet g(NavigableSet navigableSet) {
            WrappedCollection wrappedCollection = this.Z;
            if (wrappedCollection == null) {
                wrappedCollection = this;
            }
            return new WrappedNavigableSet(this.X, navigableSet, wrappedCollection);
        }

        @Override // java.util.NavigableSet
        public final NavigableSet headSet(Object obj, boolean z2) {
            return g(e().headSet(obj, z2));
        }

        @Override // java.util.NavigableSet
        public final Object higher(Object obj) {
            return e().higher(obj);
        }

        @Override // java.util.NavigableSet
        public final Object lower(Object obj) {
            return e().lower(obj);
        }

        @Override // java.util.NavigableSet
        public final Object pollFirst() {
            return Iterators.j(iterator());
        }

        @Override // java.util.NavigableSet
        public final Object pollLast() {
            return Iterators.j(descendingIterator());
        }

        @Override // java.util.NavigableSet
        public final NavigableSet subSet(Object obj, boolean z2, Object obj2, boolean z3) {
            return g(e().subSet(obj, z2, obj2, z3));
        }

        @Override // java.util.NavigableSet
        public final NavigableSet tailSet(Object obj, boolean z2) {
            return g(e().tailSet(obj, z2));
        }
    }

    public class WrappedSet extends AbstractMapBasedMultimap<K, V>.WrappedCollection implements Set<V> {
        public WrappedSet(Object obj, Set set) {
            super(obj, set, null);
        }

        @Override // com.google.common.collect.AbstractMapBasedMultimap.WrappedCollection, java.util.AbstractCollection, java.util.Collection
        public final boolean removeAll(Collection collection) {
            if (collection.isEmpty()) {
                return false;
            }
            int size = size();
            boolean zH = Sets.h((Set) this.f19789Y, collection);
            if (zH) {
                int size2 = this.f19789Y.size();
                AbstractMapBasedMultimap.this.h0 += size2 - size;
                d();
            }
            return zH;
        }
    }

    public class WrappedSortedSet extends AbstractMapBasedMultimap<K, V>.WrappedCollection implements SortedSet<V> {
        public WrappedSortedSet(Object obj, SortedSet sortedSet, WrappedCollection wrappedCollection) {
            super(obj, sortedSet, wrappedCollection);
        }

        @Override // java.util.SortedSet
        public final Comparator comparator() {
            return e().comparator();
        }

        public SortedSet e() {
            return (SortedSet) this.f19789Y;
        }

        @Override // java.util.SortedSet
        public final Object first() {
            c();
            return e().first();
        }

        @Override // java.util.SortedSet
        public final SortedSet headSet(Object obj) {
            c();
            SortedSet sortedSetHeadSet = e().headSet(obj);
            WrappedCollection wrappedCollection = this.Z;
            if (wrappedCollection == null) {
                wrappedCollection = this;
            }
            return new WrappedSortedSet(this.X, sortedSetHeadSet, wrappedCollection);
        }

        @Override // java.util.SortedSet
        public final Object last() {
            c();
            return e().last();
        }

        @Override // java.util.SortedSet
        public final SortedSet subSet(Object obj, Object obj2) {
            c();
            SortedSet sortedSetSubSet = e().subSet(obj, obj2);
            WrappedCollection wrappedCollection = this.Z;
            if (wrappedCollection == null) {
                wrappedCollection = this;
            }
            return new WrappedSortedSet(this.X, sortedSetSubSet, wrappedCollection);
        }

        @Override // java.util.SortedSet
        public final SortedSet tailSet(Object obj) {
            c();
            SortedSet sortedSetTailSet = e().tailSet(obj);
            WrappedCollection wrappedCollection = this.Z;
            if (wrappedCollection == null) {
                wrappedCollection = this;
            }
            return new WrappedSortedSet(this.X, sortedSetTailSet, wrappedCollection);
        }
    }

    @Override // com.google.common.collect.Multimap, com.google.common.collect.ListMultimap
    public Collection a(Object obj) {
        Collection collection = (Collection) this.g0.remove(obj);
        if (collection == null) {
            return s();
        }
        Collection collectionO = o();
        collectionO.addAll(collection);
        this.h0 -= collection.size();
        collection.clear();
        return x(collectionO);
    }

    @Override // com.google.common.collect.Multimap
    public void clear() {
        Iterator<V> it = this.g0.values().iterator();
        while (it.hasNext()) {
            ((Collection) it.next()).clear();
        }
        this.g0.clear();
        this.h0 = 0;
    }

    @Override // com.google.common.collect.Multimap
    public boolean containsKey(Object obj) {
        return this.g0.containsKey(obj);
    }

    @Override // com.google.common.collect.AbstractMultimap
    public Map g() {
        return new AsMap(this.g0);
    }

    @Override // com.google.common.collect.Multimap, com.google.common.collect.ListMultimap
    public Collection get(Object obj) {
        Collection collectionP = (Collection) this.g0.get(obj);
        if (collectionP == null) {
            collectionP = p(obj);
        }
        return z(obj, collectionP);
    }

    @Override // com.google.common.collect.AbstractMultimap
    public final Collection j() {
        return this instanceof SetMultimap ? new AbstractMultimap.EntrySet() : new AbstractMultimap.Entries();
    }

    @Override // com.google.common.collect.AbstractMultimap
    public Set k() {
        return new KeySet(this.g0);
    }

    @Override // com.google.common.collect.AbstractMultimap
    public final Multiset l() {
        return new Multimaps.Keys(this);
    }

    @Override // com.google.common.collect.AbstractMultimap
    public final Collection m() {
        return new AbstractMultimap.Values(this);
    }

    @Override // com.google.common.collect.AbstractMultimap
    public Iterator n() {
        return new AnonymousClass2();
    }

    public abstract Collection o();

    public Collection p(Object obj) {
        return o();
    }

    @Override // com.google.common.collect.AbstractMultimap, com.google.common.collect.Multimap
    public boolean put(Object obj, Object obj2) {
        Collection collection = (Collection) this.g0.get(obj);
        if (collection != null) {
            if (!collection.add(obj2)) {
                return false;
            }
            this.h0++;
            return true;
        }
        Collection collectionP = p(obj);
        if (!collectionP.add(obj2)) {
            throw new AssertionError("New Collection violated the Collection spec");
        }
        this.h0++;
        this.g0.put(obj, collectionP);
        return true;
    }

    public final Map q() {
        Map map = this.g0;
        if (map instanceof NavigableMap) {
            return new NavigableAsMap((NavigableMap) this.g0);
        }
        return map instanceof SortedMap ? new SortedAsMap((SortedMap) this.g0) : new AsMap(this.g0);
    }

    public final Set r() {
        Map map = this.g0;
        if (map instanceof NavigableMap) {
            return new NavigableKeySet((NavigableMap) this.g0);
        }
        return map instanceof SortedMap ? new SortedKeySet((SortedMap) this.g0) : new KeySet(this.g0);
    }

    public Collection s() {
        return x(o());
    }

    @Override // com.google.common.collect.Multimap
    public int size() {
        return this.h0;
    }

    public final void w(Map map) {
        this.g0 = map;
        this.h0 = 0;
        for (V v : map.values()) {
            Preconditions.f(!v.isEmpty());
            this.h0 = v.size() + this.h0;
        }
    }

    public Collection x(Collection collection) {
        return Collections.unmodifiableCollection(collection);
    }

    public Iterator y() {
        return new AnonymousClass1();
    }

    public Collection z(Object obj, Collection collection) {
        return new WrappedCollection(obj, collection, null);
    }

    public class WrappedList extends AbstractMapBasedMultimap<K, V>.WrappedCollection implements List<V> {

        public class WrappedListIterator extends AbstractMapBasedMultimap<K, V>.WrappedCollection.WrappedIterator implements ListIterator<V> {
            public WrappedListIterator() {
                super();
            }

            @Override // java.util.ListIterator
            public final void add(Object obj) {
                WrappedList wrappedList = WrappedList.this;
                boolean zIsEmpty = wrappedList.isEmpty();
                b().add(obj);
                AbstractMapBasedMultimap.this.h0++;
                if (zIsEmpty) {
                    wrappedList.a();
                }
            }

            public final ListIterator b() {
                a();
                return (ListIterator) this.X;
            }

            @Override // java.util.ListIterator
            public final boolean hasPrevious() {
                return b().hasPrevious();
            }

            @Override // java.util.ListIterator
            public final int nextIndex() {
                return b().nextIndex();
            }

            @Override // java.util.ListIterator
            public final Object previous() {
                return b().previous();
            }

            @Override // java.util.ListIterator
            public final int previousIndex() {
                return b().previousIndex();
            }

            @Override // java.util.ListIterator
            public final void set(Object obj) {
                b().set(obj);
            }

            public WrappedListIterator(int i2) {
                super(((List) WrappedList.this.f19789Y).listIterator(i2));
            }
        }

        public WrappedList(Object obj, List list, WrappedCollection wrappedCollection) {
            super(obj, list, wrappedCollection);
        }

        @Override // java.util.List
        public final void add(int i2, Object obj) {
            c();
            boolean zIsEmpty = this.f19789Y.isEmpty();
            ((List) this.f19789Y).add(i2, obj);
            AbstractMapBasedMultimap.this.h0++;
            if (zIsEmpty) {
                a();
            }
        }

        @Override // java.util.List
        public final boolean addAll(int i2, Collection collection) {
            if (collection.isEmpty()) {
                return false;
            }
            int size = size();
            boolean zAddAll = ((List) this.f19789Y).addAll(i2, collection);
            if (zAddAll) {
                AbstractMapBasedMultimap.this.h0 += this.f19789Y.size() - size;
                if (size == 0) {
                    a();
                }
            }
            return zAddAll;
        }

        @Override // java.util.List
        public final Object get(int i2) {
            c();
            return ((List) this.f19789Y).get(i2);
        }

        @Override // java.util.List
        public final int indexOf(Object obj) {
            c();
            return ((List) this.f19789Y).indexOf(obj);
        }

        @Override // java.util.List
        public final int lastIndexOf(Object obj) {
            c();
            return ((List) this.f19789Y).lastIndexOf(obj);
        }

        @Override // java.util.List
        public final ListIterator listIterator() {
            c();
            return new WrappedListIterator();
        }

        @Override // java.util.List
        public final Object remove(int i2) {
            c();
            Object objRemove = ((List) this.f19789Y).remove(i2);
            AbstractMapBasedMultimap.this.h0--;
            d();
            return objRemove;
        }

        @Override // java.util.List
        public final Object set(int i2, Object obj) {
            c();
            return ((List) this.f19789Y).set(i2, obj);
        }

        @Override // java.util.List
        public final List subList(int i2, int i3) {
            c();
            List listSubList = ((List) this.f19789Y).subList(i2, i3);
            WrappedCollection wrappedCollection = this.Z;
            if (wrappedCollection == null) {
                wrappedCollection = this;
            }
            AbstractMapBasedMultimap abstractMapBasedMultimap = AbstractMapBasedMultimap.this;
            abstractMapBasedMultimap.getClass();
            boolean z2 = listSubList instanceof RandomAccess;
            Object obj = this.X;
            return z2 ? new RandomAccessWrappedList(obj, listSubList, wrappedCollection) : new WrappedList(obj, listSubList, wrappedCollection);
        }

        @Override // java.util.List
        public final ListIterator listIterator(int i2) {
            c();
            return new WrappedListIterator(i2);
        }
    }

    public class WrappedCollection extends AbstractCollection<V> {
        public final Object X;

        /* JADX INFO: renamed from: Y, reason: collision with root package name */
        public Collection f19789Y;
        public final WrappedCollection Z;
        public final Collection e0;

        public WrappedCollection(Object obj, Collection collection, WrappedCollection wrappedCollection) {
            this.X = obj;
            this.f19789Y = collection;
            this.Z = wrappedCollection;
            this.e0 = wrappedCollection == null ? null : wrappedCollection.f19789Y;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public final void a() {
            WrappedCollection wrappedCollection = this.Z;
            if (wrappedCollection != null) {
                wrappedCollection.a();
            } else {
                AbstractMapBasedMultimap.this.g0.put(this.X, this.f19789Y);
            }
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public final boolean add(Object obj) {
            c();
            boolean zIsEmpty = this.f19789Y.isEmpty();
            boolean zAdd = this.f19789Y.add(obj);
            if (zAdd) {
                AbstractMapBasedMultimap.this.h0++;
                if (zIsEmpty) {
                    a();
                }
            }
            return zAdd;
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public final boolean addAll(Collection collection) {
            if (collection.isEmpty()) {
                return false;
            }
            int size = size();
            boolean zAddAll = this.f19789Y.addAll(collection);
            if (zAddAll) {
                AbstractMapBasedMultimap.this.h0 += this.f19789Y.size() - size;
                if (size == 0) {
                    a();
                }
            }
            return zAddAll;
        }

        public final void c() {
            Collection collection;
            WrappedCollection wrappedCollection = this.Z;
            if (wrappedCollection != null) {
                wrappedCollection.c();
                if (wrappedCollection.f19789Y != this.e0) {
                    throw new ConcurrentModificationException();
                }
            } else {
                if (!this.f19789Y.isEmpty() || (collection = (Collection) AbstractMapBasedMultimap.this.g0.get(this.X)) == null) {
                    return;
                }
                this.f19789Y = collection;
            }
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public final void clear() {
            int size = size();
            if (size == 0) {
                return;
            }
            this.f19789Y.clear();
            AbstractMapBasedMultimap.this.h0 -= size;
            d();
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public final boolean contains(Object obj) {
            c();
            return this.f19789Y.contains(obj);
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public final boolean containsAll(Collection collection) {
            c();
            return this.f19789Y.containsAll(collection);
        }

        public final void d() {
            WrappedCollection wrappedCollection = this.Z;
            if (wrappedCollection != null) {
                wrappedCollection.d();
            } else if (this.f19789Y.isEmpty()) {
                AbstractMapBasedMultimap.this.g0.remove(this.X);
            }
        }

        @Override // java.util.Collection
        public final boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            c();
            return this.f19789Y.equals(obj);
        }

        @Override // java.util.Collection
        public final int hashCode() {
            c();
            return this.f19789Y.hashCode();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
        public final Iterator iterator() {
            c();
            return new WrappedIterator();
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public final boolean remove(Object obj) {
            c();
            boolean zRemove = this.f19789Y.remove(obj);
            if (zRemove) {
                AbstractMapBasedMultimap.this.h0--;
                d();
            }
            return zRemove;
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean removeAll(Collection collection) {
            if (collection.isEmpty()) {
                return false;
            }
            int size = size();
            boolean zRemoveAll = this.f19789Y.removeAll(collection);
            if (zRemoveAll) {
                AbstractMapBasedMultimap.this.h0 += this.f19789Y.size() - size;
                d();
            }
            return zRemoveAll;
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public final boolean retainAll(Collection collection) {
            collection.getClass();
            int size = size();
            boolean zRetainAll = this.f19789Y.retainAll(collection);
            if (zRetainAll) {
                AbstractMapBasedMultimap.this.h0 += this.f19789Y.size() - size;
                d();
            }
            return zRetainAll;
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public final int size() {
            c();
            return this.f19789Y.size();
        }

        @Override // java.util.AbstractCollection
        public final String toString() {
            c();
            return this.f19789Y.toString();
        }

        public class WrappedIterator implements Iterator<V> {
            public final Iterator X;

            /* JADX INFO: renamed from: Y, reason: collision with root package name */
            public final Collection f19790Y;

            public WrappedIterator() {
                Collection collection = WrappedCollection.this.f19789Y;
                this.f19790Y = collection;
                this.X = collection instanceof List ? ((List) collection).listIterator() : collection.iterator();
            }

            public final void a() {
                WrappedCollection wrappedCollection = WrappedCollection.this;
                wrappedCollection.c();
                if (wrappedCollection.f19789Y != this.f19790Y) {
                    throw new ConcurrentModificationException();
                }
            }

            @Override // java.util.Iterator
            public final boolean hasNext() {
                a();
                return this.X.hasNext();
            }

            @Override // java.util.Iterator
            public final Object next() {
                a();
                return this.X.next();
            }

            @Override // java.util.Iterator
            public final void remove() {
                this.X.remove();
                WrappedCollection wrappedCollection = WrappedCollection.this;
                AbstractMapBasedMultimap.this.h0--;
                wrappedCollection.d();
            }

            public WrappedIterator(Iterator it) {
                this.f19790Y = WrappedCollection.this.f19789Y;
                this.X = it;
            }
        }
    }
}
