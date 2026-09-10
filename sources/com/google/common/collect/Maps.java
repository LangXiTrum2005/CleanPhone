package com.google.common.collect;

import com.google.common.base.Converter;
import com.google.common.base.Function;
import com.google.common.base.Objects;
import com.google.common.base.Preconditions;
import com.google.common.base.Predicate;
import com.google.common.base.Predicates;
import com.p004ironsource.dc;
import java.io.Serializable;
import java.util.AbstractCollection;
import java.util.AbstractMap;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.NavigableMap;
import java.util.NavigableSet;
import java.util.Set;
import java.util.SortedMap;
import java.util.SortedSet;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* JADX INFO: loaded from: classes4.dex */
@ElementTypesAreNonnullByDefault
public final class Maps {

    /* JADX INFO: renamed from: com.google.common.collect.Maps$1, reason: invalid class name */
    class AnonymousClass1 extends TransformedIterator<Map.Entry<Object, Object>, Object> {
        @Override // com.google.common.collect.TransformedIterator
        public final Object a(Object obj) {
            return ((Map.Entry) obj).getKey();
        }
    }

    /* JADX INFO: renamed from: com.google.common.collect.Maps$10, reason: invalid class name */
    class AnonymousClass10 implements Function<Object, Object> {
        public final /* synthetic */ EntryTransformer X;

        /* JADX INFO: renamed from: Y, reason: collision with root package name */
        public final /* synthetic */ Object f19910Y;

        public AnonymousClass10(EntryTransformer entryTransformer, Object obj) {
            this.X = entryTransformer;
            this.f19910Y = obj;
        }

        @Override // com.google.common.base.Function, androidx.arch.core.util.Function, com.google.android.datatransport.Transformer
        public final Object apply(Object obj) {
            return ((AnonymousClass9) this.X).X.apply(obj);
        }
    }

    /* JADX INFO: renamed from: com.google.common.collect.Maps$12, reason: invalid class name */
    class AnonymousClass12 extends AbstractMapEntry<Object, Object> {
        public final /* synthetic */ Map.Entry X;

        /* JADX INFO: renamed from: Y, reason: collision with root package name */
        public final /* synthetic */ EntryTransformer f19911Y;

        public AnonymousClass12(Map.Entry entry, EntryTransformer entryTransformer) {
            this.X = entry;
            this.f19911Y = entryTransformer;
        }

        @Override // java.util.Map.Entry
        public final Object getKey() {
            return this.X.getKey();
        }

        @Override // java.util.Map.Entry
        public final Object getValue() {
            Map.Entry entry = this.X;
            return this.f19911Y.a(entry.getKey(), entry.getValue());
        }
    }

    /* JADX INFO: renamed from: com.google.common.collect.Maps$13, reason: invalid class name */
    class AnonymousClass13 implements Function<Map.Entry<Object, Object>, Map.Entry<Object, Object>> {
        public final /* synthetic */ EntryTransformer X;

        public AnonymousClass13(EntryTransformer entryTransformer) {
            this.X = entryTransformer;
        }

        @Override // com.google.common.base.Function, androidx.arch.core.util.Function, com.google.android.datatransport.Transformer
        public final Object apply(Object obj) {
            Map.Entry entry = (Map.Entry) obj;
            EntryTransformer entryTransformer = this.X;
            entryTransformer.getClass();
            entry.getClass();
            return new AnonymousClass12(entry, entryTransformer);
        }
    }

    /* JADX INFO: renamed from: com.google.common.collect.Maps$2, reason: invalid class name */
    class AnonymousClass2 extends TransformedIterator<Map.Entry<Object, Object>, Object> {
        @Override // com.google.common.collect.TransformedIterator
        public final Object a(Object obj) {
            return ((Map.Entry) obj).getValue();
        }
    }

    /* JADX INFO: renamed from: com.google.common.collect.Maps$3, reason: invalid class name */
    class AnonymousClass3 extends TransformedIterator<Object, Map.Entry<Object, Object>> {

        /* JADX INFO: renamed from: Y, reason: collision with root package name */
        public final /* synthetic */ Function f19912Y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass3(Iterator it, Function function) {
            super(it);
            this.f19912Y = function;
        }

        @Override // com.google.common.collect.TransformedIterator
        public final Object a(Object obj) {
            return new ImmutableEntry(obj, this.f19912Y.apply(obj));
        }
    }

    /* JADX INFO: renamed from: com.google.common.collect.Maps$5, reason: invalid class name */
    class AnonymousClass5 extends ForwardingSortedSet<Object> {
        public final /* synthetic */ SortedSet X;

        public AnonymousClass5(SortedSet sortedSet) {
            this.X = sortedSet;
        }

        @Override // com.google.common.collect.ForwardingSortedSet, com.google.common.collect.ForwardingSet
        /* JADX INFO: renamed from: A */
        public final Set w() {
            return this.X;
        }

        @Override // com.google.common.collect.ForwardingSortedSet
        /* JADX INFO: renamed from: B */
        public final SortedSet w() {
            return this.X;
        }

        @Override // com.google.common.collect.ForwardingCollection, java.util.Collection, java.util.Queue
        public final boolean add(Object obj) {
            throw new UnsupportedOperationException();
        }

        @Override // com.google.common.collect.ForwardingCollection, java.util.Collection
        public final boolean addAll(Collection collection) {
            throw new UnsupportedOperationException();
        }

        @Override // com.google.common.collect.ForwardingSortedSet, java.util.SortedSet
        public final SortedSet headSet(Object obj) {
            return new AnonymousClass5(super.headSet(obj));
        }

        @Override // com.google.common.collect.ForwardingSortedSet, java.util.SortedSet
        public final SortedSet subSet(Object obj, Object obj2) {
            return new AnonymousClass5(super.subSet(obj, obj2));
        }

        @Override // com.google.common.collect.ForwardingSortedSet, java.util.SortedSet
        public final SortedSet tailSet(Object obj) {
            return new AnonymousClass5(super.tailSet(obj));
        }

        @Override // com.google.common.collect.ForwardingSortedSet, com.google.common.collect.ForwardingSet, com.google.common.collect.ForwardingCollection, com.google.common.collect.ForwardingObject
        public final Object w() {
            return this.X;
        }

        @Override // com.google.common.collect.ForwardingSortedSet, com.google.common.collect.ForwardingSet, com.google.common.collect.ForwardingCollection
        public final Collection x() {
            return this.X;
        }
    }

    /* JADX INFO: renamed from: com.google.common.collect.Maps$7, reason: invalid class name */
    class AnonymousClass7 extends AbstractMapEntry<Object, Object> {
        public final /* synthetic */ Map.Entry X;

        public AnonymousClass7(Map.Entry entry) {
            this.X = entry;
        }

        @Override // java.util.Map.Entry
        public final Object getKey() {
            return this.X.getKey();
        }

        @Override // java.util.Map.Entry
        public final Object getValue() {
            return this.X.getValue();
        }
    }

    /* JADX INFO: renamed from: com.google.common.collect.Maps$8, reason: invalid class name */
    class AnonymousClass8 extends UnmodifiableIterator<Map.Entry<Object, Object>> {
        public final /* synthetic */ Iterator X;

        public AnonymousClass8(Iterator it) {
            this.X = it;
        }

        @Override // java.util.Iterator
        public final boolean hasNext() {
            return this.X.hasNext();
        }

        @Override // java.util.Iterator
        public final Object next() {
            Map.Entry entry = (Map.Entry) this.X.next();
            entry.getClass();
            return new AnonymousClass7(entry);
        }
    }

    /* JADX INFO: renamed from: com.google.common.collect.Maps$9, reason: invalid class name */
    class AnonymousClass9 implements EntryTransformer<Object, Object, Object> {
        public final /* synthetic */ Function X;

        public AnonymousClass9(Function function) {
            this.X = function;
        }

        @Override // com.google.common.collect.Maps.EntryTransformer
        public final Object a(Object obj, Object obj2) {
            return this.X.apply(obj2);
        }
    }

    public static abstract class AbstractFilteredMap<K, V> extends ViewCachingAbstractMap<K, V> {
        public final SortedMap e0;
        public final Object f0;

        public AbstractFilteredMap(SortedMap sortedMap, Predicate predicate) {
            this.e0 = sortedMap;
            this.f0 = predicate;
        }

        /* JADX WARN: Type inference failed for: r1v0, types: [com.google.common.base.Predicate, java.lang.Object] */
        @Override // com.google.common.collect.Maps.ViewCachingAbstractMap
        public final Collection c() {
            return new FilteredMapValues(this, this.e0, this.f0);
        }

        @Override // java.util.AbstractMap, java.util.Map
        public boolean containsKey(Object obj) {
            SortedMap sortedMap = this.e0;
            return sortedMap.containsKey(obj) && d(obj, sortedMap.get(obj));
        }

        /* JADX WARN: Type inference failed for: r2v1, types: [com.google.common.base.Predicate, java.lang.Object] */
        public final boolean d(Object obj, Object obj2) {
            return this.f0.apply(new ImmutableEntry(obj, obj2));
        }

        @Override // java.util.AbstractMap, java.util.Map
        public final Object get(Object obj) {
            Object obj2 = this.e0.get(obj);
            if (obj2 == null || !d(obj, obj2)) {
                return null;
            }
            return obj2;
        }

        @Override // java.util.AbstractMap, java.util.Map
        public final boolean isEmpty() {
            return entrySet().isEmpty();
        }

        @Override // java.util.AbstractMap, java.util.Map
        public final Object put(Object obj, Object obj2) {
            Preconditions.f(d(obj, obj2));
            return this.e0.put(obj, obj2);
        }

        @Override // java.util.AbstractMap, java.util.Map
        public final void putAll(Map map) {
            for (Map.Entry<K, V> entry : map.entrySet()) {
                Preconditions.f(d(entry.getKey(), entry.getValue()));
            }
            this.e0.putAll(map);
        }

        @Override // java.util.AbstractMap, java.util.Map
        public final Object remove(Object obj) {
            if (containsKey(obj)) {
                return this.e0.remove(obj);
            }
            return null;
        }
    }

    public static class AsMapView<K, V> extends ViewCachingAbstractMap<K, V> {
        public final Set e0;
        public final Function f0;

        public AsMapView(Set set, Function function) {
            set.getClass();
            this.e0 = set;
            function.getClass();
            this.f0 = function;
        }

        @Override // com.google.common.collect.Maps.ViewCachingAbstractMap
        public final Set a() {
            return new EntrySet<Object, Object>() { // from class: com.google.common.collect.Maps.AsMapView.1EntrySetImpl
                @Override // com.google.common.collect.Maps.EntrySet
                public final Map a() {
                    return AsMapView.this;
                }

                @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
                public final Iterator iterator() {
                    AsMapView asMapView = AsMapView.this;
                    return new AnonymousClass3(asMapView.d().iterator(), asMapView.f0);
                }
            };
        }

        @Override // com.google.common.collect.Maps.ViewCachingAbstractMap
        public final Set b() {
            final Set setD = d();
            return new ForwardingSet<Object>() { // from class: com.google.common.collect.Maps.4
                @Override // com.google.common.collect.ForwardingSet
                /* JADX INFO: renamed from: A */
                public final Set w() {
                    return setD;
                }

                @Override // com.google.common.collect.ForwardingCollection, java.util.Collection, java.util.Queue
                public final boolean add(Object obj) {
                    throw new UnsupportedOperationException();
                }

                @Override // com.google.common.collect.ForwardingCollection, java.util.Collection
                public final boolean addAll(Collection collection) {
                    throw new UnsupportedOperationException();
                }

                @Override // com.google.common.collect.ForwardingSet, com.google.common.collect.ForwardingCollection, com.google.common.collect.ForwardingObject
                public final Object w() {
                    return setD;
                }

                @Override // com.google.common.collect.ForwardingSet, com.google.common.collect.ForwardingCollection
                public final Collection x() {
                    return setD;
                }
            };
        }

        @Override // com.google.common.collect.Maps.ViewCachingAbstractMap
        public final Collection c() {
            return new Collections2.TransformedCollection(this.e0, this.f0);
        }

        @Override // java.util.AbstractMap, java.util.Map
        public final void clear() {
            d().clear();
        }

        @Override // java.util.AbstractMap, java.util.Map
        public final boolean containsKey(Object obj) {
            return d().contains(obj);
        }

        public Set d() {
            return this.e0;
        }

        @Override // java.util.AbstractMap, java.util.Map
        public final Object get(Object obj) {
            if (Collections2.c(obj, d())) {
                return this.f0.apply(obj);
            }
            return null;
        }

        @Override // java.util.AbstractMap, java.util.Map
        public final Object remove(Object obj) {
            if (d().remove(obj)) {
                return this.f0.apply(obj);
            }
            return null;
        }

        @Override // java.util.AbstractMap, java.util.Map
        public final int size() {
            return d().size();
        }
    }

    public static final class BiMapConverter<A, B> extends Converter<A, B> implements Serializable {
        private static final long serialVersionUID = 0;

        @Override // com.google.common.base.Converter
        public final Object b(Object obj) {
            throw null;
        }

        @Override // com.google.common.base.Function
        public final boolean equals(Object obj) {
            if (!(obj instanceof BiMapConverter)) {
                return false;
            }
            ((BiMapConverter) obj).getClass();
            throw null;
        }

        public final int hashCode() {
            throw null;
        }

        public final String toString() {
            return "Maps.asConverter(null)";
        }
    }

    public static abstract class DescendingMap<K, V> extends ForwardingMap<K, V> implements NavigableMap<K, V> {
        public transient Ordering X;

        /* JADX INFO: renamed from: Y, reason: collision with root package name */
        public transient Set f19913Y;
        public transient NavigableSet Z;

        public abstract NavigableMap A();

        @Override // java.util.NavigableMap
        public final Map.Entry ceilingEntry(Object obj) {
            return A().floorEntry(obj);
        }

        @Override // java.util.NavigableMap
        public final Object ceilingKey(Object obj) {
            return A().floorKey(obj);
        }

        @Override // java.util.SortedMap
        public final Comparator comparator() {
            Ordering ordering = this.X;
            if (ordering != null) {
                return ordering;
            }
            Comparator<? super K> comparator = A().comparator();
            if (comparator == null) {
                comparator = NaturalOrdering.Z;
            }
            Ordering orderingJ = Ordering.b(comparator).j();
            this.X = orderingJ;
            return orderingJ;
        }

        @Override // java.util.NavigableMap
        public final NavigableSet descendingKeySet() {
            return A().navigableKeySet();
        }

        @Override // java.util.NavigableMap
        public final NavigableMap descendingMap() {
            return A();
        }

        @Override // com.google.common.collect.ForwardingMap, java.util.Map
        public final Set entrySet() {
            Set set = this.f19913Y;
            if (set != null) {
                return set;
            }
            EntrySet<Object, Object> entrySet = new EntrySet<Object, Object>() { // from class: com.google.common.collect.Maps.DescendingMap.1EntrySetImpl
                @Override // com.google.common.collect.Maps.EntrySet
                public final Map a() {
                    return DescendingMap.this;
                }

                @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
                public final Iterator iterator() {
                    return DescendingMap.this.z();
                }
            };
            this.f19913Y = entrySet;
            return entrySet;
        }

        @Override // java.util.NavigableMap
        public final Map.Entry firstEntry() {
            return A().lastEntry();
        }

        @Override // java.util.SortedMap
        public final Object firstKey() {
            return A().lastKey();
        }

        @Override // java.util.NavigableMap
        public final Map.Entry floorEntry(Object obj) {
            return A().ceilingEntry(obj);
        }

        @Override // java.util.NavigableMap
        public final Object floorKey(Object obj) {
            return A().ceilingKey(obj);
        }

        @Override // java.util.NavigableMap
        public final NavigableMap headMap(Object obj, boolean z2) {
            return A().tailMap(obj, z2).descendingMap();
        }

        @Override // java.util.NavigableMap
        public final Map.Entry higherEntry(Object obj) {
            return A().lowerEntry(obj);
        }

        @Override // java.util.NavigableMap
        public final Object higherKey(Object obj) {
            return A().lowerKey(obj);
        }

        @Override // com.google.common.collect.ForwardingMap, java.util.Map
        public final Set keySet() {
            return navigableKeySet();
        }

        @Override // java.util.NavigableMap
        public final Map.Entry lastEntry() {
            return A().firstEntry();
        }

        @Override // java.util.SortedMap
        public final Object lastKey() {
            return A().firstKey();
        }

        @Override // java.util.NavigableMap
        public final Map.Entry lowerEntry(Object obj) {
            return A().higherEntry(obj);
        }

        @Override // java.util.NavigableMap
        public final Object lowerKey(Object obj) {
            return A().higherKey(obj);
        }

        @Override // java.util.NavigableMap
        public final NavigableSet navigableKeySet() {
            NavigableSet navigableSet = this.Z;
            if (navigableSet != null) {
                return navigableSet;
            }
            NavigableKeySet navigableKeySet = new NavigableKeySet(this);
            this.Z = navigableKeySet;
            return navigableKeySet;
        }

        @Override // java.util.NavigableMap
        public final Map.Entry pollFirstEntry() {
            return A().pollLastEntry();
        }

        @Override // java.util.NavigableMap
        public final Map.Entry pollLastEntry() {
            return A().pollFirstEntry();
        }

        @Override // java.util.NavigableMap
        public final NavigableMap subMap(Object obj, boolean z2, Object obj2, boolean z3) {
            return A().subMap(obj2, z3, obj, z2).descendingMap();
        }

        @Override // java.util.NavigableMap
        public final NavigableMap tailMap(Object obj, boolean z2) {
            return A().headMap(obj, z2).descendingMap();
        }

        @Override // com.google.common.collect.ForwardingObject
        public final String toString() {
            return Maps.j(this);
        }

        @Override // com.google.common.collect.ForwardingMap, java.util.Map
        public final Collection values() {
            return new Values(this);
        }

        @Override // com.google.common.collect.ForwardingMap, com.google.common.collect.ForwardingObject
        public final Object w() {
            return A();
        }

        @Override // com.google.common.collect.ForwardingMap
        /* JADX INFO: renamed from: x */
        public final Map w() {
            return A();
        }

        public abstract Iterator z();

        @Override // java.util.NavigableMap, java.util.SortedMap
        public final SortedMap headMap(Object obj) {
            return headMap(obj, false);
        }

        @Override // java.util.NavigableMap, java.util.SortedMap
        public final SortedMap subMap(Object obj, Object obj2) {
            return subMap(obj, true, obj2, false);
        }

        @Override // java.util.NavigableMap, java.util.SortedMap
        public final SortedMap tailMap(Object obj) {
            return tailMap(obj, true);
        }
    }

    public enum EntryFunction implements Function<Map.Entry<?, ?>, Object> {
        X { // from class: com.google.common.collect.Maps.EntryFunction.1
            @Override // com.google.common.base.Function, androidx.arch.core.util.Function, com.google.android.datatransport.Transformer
            public final Object apply(Object obj) {
                return ((Map.Entry) obj).getKey();
            }
        },
        f19914Y { // from class: com.google.common.collect.Maps.EntryFunction.2
            @Override // com.google.common.base.Function, androidx.arch.core.util.Function, com.google.android.datatransport.Transformer
            public final Object apply(Object obj) {
                return ((Map.Entry) obj).getValue();
            }
        }
    }

    public static abstract class EntrySet<K, V> extends Sets.ImprovedAbstractSet<Map.Entry<K, V>> {
        public abstract Map a();

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final void clear() {
            a().clear();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(Object obj) {
            if (!(obj instanceof Map.Entry)) {
                return false;
            }
            Map.Entry entry = (Map.Entry) obj;
            Object key = entry.getKey();
            Object objI = Maps.i(a(), key);
            if (Objects.a(objI, entry.getValue())) {
                return objI != null || a().containsKey(key);
            }
            return false;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean isEmpty() {
            return a().isEmpty();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean remove(Object obj) {
            if (contains(obj) && (obj instanceof Map.Entry)) {
                return a().keySet().remove(((Map.Entry) obj).getKey());
            }
            return false;
        }

        @Override // com.google.common.collect.Sets.ImprovedAbstractSet, java.util.AbstractSet, java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean removeAll(Collection collection) {
            try {
                collection.getClass();
                return Sets.h(this, collection);
            } catch (UnsupportedOperationException unused) {
                return Sets.i(this, collection.iterator());
            }
        }

        @Override // com.google.common.collect.Sets.ImprovedAbstractSet, java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean retainAll(Collection collection) {
            try {
                collection.getClass();
                return super.retainAll(collection);
            } catch (UnsupportedOperationException unused) {
                HashSet hashSet = new HashSet(Maps.c(collection.size()));
                for (Object obj : collection) {
                    if (contains(obj) && (obj instanceof Map.Entry)) {
                        hashSet.add(((Map.Entry) obj).getKey());
                    }
                }
                return a().keySet().retainAll(hashSet);
            }
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
            return a().size();
        }
    }

    public interface EntryTransformer<K, V1, V2> {
        Object a(Object obj, Object obj2);
    }

    public static final class FilteredEntryBiMap<K, V> extends FilteredEntryMap<K, V> implements BiMap<K, V> {

        /* JADX INFO: renamed from: com.google.common.collect.Maps$FilteredEntryBiMap$1, reason: invalid class name */
        class AnonymousClass1 implements Predicate<Map.Entry<Object, Object>> {
            @Override // com.google.common.base.Predicate
            public final boolean apply(Object obj) {
                Map.Entry entry = (Map.Entry) obj;
                entry.getValue();
                entry.getKey();
                throw null;
            }
        }

        @Override // com.google.common.collect.BiMap
        public final BiMap H() {
            return null;
        }

        @Override // com.google.common.collect.Maps.ViewCachingAbstractMap, java.util.AbstractMap, java.util.Map
        public final Collection values() {
            throw null;
        }

        @Override // com.google.common.collect.Maps.ViewCachingAbstractMap, java.util.AbstractMap, java.util.Map
        public final Set values() {
            throw null;
        }
    }

    public static class FilteredEntryMap<K, V> extends AbstractFilteredMap<K, V> {
        public final Set g0;

        public class EntrySet extends ForwardingSet<Map.Entry<K, V>> {
            public EntrySet() {
            }

            @Override // com.google.common.collect.ForwardingSet
            /* JADX INFO: renamed from: A */
            public final Set w() {
                return FilteredEntryMap.this.g0;
            }

            @Override // com.google.common.collect.ForwardingCollection, java.util.Collection, java.lang.Iterable, java.util.Set
            public final Iterator iterator() {
                return new TransformedIterator<Map.Entry<Object, Object>, Map.Entry<Object, Object>>(FilteredEntryMap.this.g0.iterator()) { // from class: com.google.common.collect.Maps.FilteredEntryMap.EntrySet.1
                    @Override // com.google.common.collect.TransformedIterator
                    public final Object a(Object obj) {
                        final Map.Entry entry = (Map.Entry) obj;
                        return new ForwardingMapEntry<Object, Object>() { // from class: com.google.common.collect.Maps.FilteredEntryMap.EntrySet.1.1
                            @Override // com.google.common.collect.ForwardingMapEntry, java.util.Map.Entry
                            public final Object setValue(Object obj2) {
                                Preconditions.f(FilteredEntryMap.this.d(getKey(), obj2));
                                return super.setValue(obj2);
                            }

                            @Override // com.google.common.collect.ForwardingMapEntry, com.google.common.collect.ForwardingObject
                            public final Object w() {
                                return entry;
                            }

                            @Override // com.google.common.collect.ForwardingMapEntry
                            /* JADX INFO: renamed from: x */
                            public final Map.Entry w() {
                                return entry;
                            }
                        };
                    }
                };
            }

            @Override // com.google.common.collect.ForwardingSet, com.google.common.collect.ForwardingCollection, com.google.common.collect.ForwardingObject
            public final Object w() {
                return FilteredEntryMap.this.g0;
            }

            @Override // com.google.common.collect.ForwardingSet, com.google.common.collect.ForwardingCollection
            public final Collection x() {
                return FilteredEntryMap.this.g0;
            }
        }

        public class KeySet extends KeySet<K, V> {
            public KeySet() {
                super(FilteredEntryMap.this);
            }

            @Override // com.google.common.collect.Maps.KeySet, java.util.AbstractCollection, java.util.Collection, java.util.Set
            public final boolean remove(Object obj) {
                FilteredEntryMap filteredEntryMap = FilteredEntryMap.this;
                if (!filteredEntryMap.containsKey(obj)) {
                    return false;
                }
                filteredEntryMap.e0.remove(obj);
                return true;
            }

            /* JADX WARN: Type inference failed for: r0v1, types: [com.google.common.base.Predicate, java.lang.Object] */
            @Override // com.google.common.collect.Sets.ImprovedAbstractSet, java.util.AbstractSet, java.util.AbstractCollection, java.util.Collection, java.util.Set
            public final boolean removeAll(Collection collection) {
                FilteredEntryMap filteredEntryMap = FilteredEntryMap.this;
                return FilteredEntryMap.e(filteredEntryMap.e0, filteredEntryMap.f0, collection);
            }

            /* JADX WARN: Type inference failed for: r0v1, types: [com.google.common.base.Predicate, java.lang.Object] */
            @Override // com.google.common.collect.Sets.ImprovedAbstractSet, java.util.AbstractCollection, java.util.Collection, java.util.Set
            public final boolean retainAll(Collection collection) {
                FilteredEntryMap filteredEntryMap = FilteredEntryMap.this;
                return FilteredEntryMap.f(filteredEntryMap.e0, filteredEntryMap.f0, collection);
            }

            @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
            public final Object[] toArray() {
                return Lists.a(iterator()).toArray();
            }

            @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
            public final Object[] toArray(Object[] objArr) {
                return Lists.a(iterator()).toArray(objArr);
            }
        }

        /* JADX WARN: Type inference failed for: r2v1, types: [com.google.common.base.Predicate, java.lang.Object] */
        public FilteredEntryMap(SortedMap sortedMap, Predicate predicate) {
            super(sortedMap, predicate);
            this.g0 = Sets.d(sortedMap.entrySet(), this.f0);
        }

        public static boolean e(Map map, Predicate predicate, Collection collection) {
            Iterator<Map.Entry<K, V>> it = map.entrySet().iterator();
            boolean z2 = false;
            while (it.hasNext()) {
                Map.Entry<K, V> next = it.next();
                if (predicate.apply(next) && collection.contains(next.getKey())) {
                    it.remove();
                    z2 = true;
                }
            }
            return z2;
        }

        public static boolean f(Map map, Predicate predicate, Collection collection) {
            Iterator<Map.Entry<K, V>> it = map.entrySet().iterator();
            boolean z2 = false;
            while (it.hasNext()) {
                Map.Entry<K, V> next = it.next();
                if (predicate.apply(next) && !collection.contains(next.getKey())) {
                    it.remove();
                    z2 = true;
                }
            }
            return z2;
        }

        @Override // com.google.common.collect.Maps.ViewCachingAbstractMap
        public final Set a() {
            return new EntrySet();
        }

        @Override // com.google.common.collect.Maps.ViewCachingAbstractMap
        public Set b() {
            return new KeySet();
        }
    }

    public static class FilteredEntryNavigableMap<K, V> extends AbstractNavigableMap<K, V> {
        public final NavigableMap X;

        /* JADX INFO: renamed from: Y, reason: collision with root package name */
        public final Predicate f19918Y;
        public final Map Z;

        public FilteredEntryNavigableMap(NavigableMap navigableMap, Predicate predicate) {
            navigableMap.getClass();
            this.X = navigableMap;
            this.f19918Y = predicate;
            this.Z = new FilteredEntryMap(navigableMap, predicate);
        }

        @Override // com.google.common.collect.Maps.IteratorBasedAbstractMap
        public final Iterator a() {
            return Iterators.e(this.X.entrySet().iterator(), this.f19918Y);
        }

        @Override // com.google.common.collect.AbstractNavigableMap
        public final Iterator b() {
            return Iterators.e(this.X.descendingMap().entrySet().iterator(), this.f19918Y);
        }

        @Override // com.google.common.collect.Maps.IteratorBasedAbstractMap, java.util.AbstractMap, java.util.Map
        public final void clear() {
            ((AbstractMap) this.Z).clear();
        }

        @Override // java.util.SortedMap
        public final Comparator comparator() {
            return this.X.comparator();
        }

        @Override // java.util.AbstractMap, java.util.Map
        public final boolean containsKey(Object obj) {
            return ((AbstractFilteredMap) this.Z).containsKey(obj);
        }

        @Override // com.google.common.collect.AbstractNavigableMap, java.util.NavigableMap
        public final NavigableMap descendingMap() {
            return Maps.e(this.X.descendingMap(), this.f19918Y);
        }

        @Override // com.google.common.collect.Maps.IteratorBasedAbstractMap, java.util.AbstractMap, java.util.Map, java.util.SortedMap
        public final Set entrySet() {
            return ((ViewCachingAbstractMap) this.Z).entrySet();
        }

        @Override // java.util.AbstractMap, java.util.Map
        public final Object get(Object obj) {
            return ((AbstractFilteredMap) this.Z).get(obj);
        }

        @Override // java.util.NavigableMap
        public final NavigableMap headMap(Object obj, boolean z2) {
            return Maps.e(this.X.headMap(obj, z2), this.f19918Y);
        }

        @Override // java.util.AbstractMap, java.util.Map
        public final boolean isEmpty() {
            return !Iterables.a(this.X.entrySet(), this.f19918Y);
        }

        @Override // com.google.common.collect.AbstractNavigableMap, java.util.NavigableMap
        public final NavigableSet navigableKeySet() {
            return new NavigableKeySet<Object, Object>(this) { // from class: com.google.common.collect.Maps.FilteredEntryNavigableMap.1
                @Override // com.google.common.collect.Sets.ImprovedAbstractSet, java.util.AbstractSet, java.util.AbstractCollection, java.util.Collection, java.util.Set
                public final boolean removeAll(Collection collection) {
                    FilteredEntryNavigableMap filteredEntryNavigableMap = FilteredEntryNavigableMap.this;
                    return FilteredEntryMap.e(filteredEntryNavigableMap.X, filteredEntryNavigableMap.f19918Y, collection);
                }

                @Override // com.google.common.collect.Sets.ImprovedAbstractSet, java.util.AbstractCollection, java.util.Collection, java.util.Set
                public final boolean retainAll(Collection collection) {
                    FilteredEntryNavigableMap filteredEntryNavigableMap = FilteredEntryNavigableMap.this;
                    return FilteredEntryMap.f(filteredEntryNavigableMap.X, filteredEntryNavigableMap.f19918Y, collection);
                }
            };
        }

        @Override // com.google.common.collect.AbstractNavigableMap, java.util.NavigableMap
        public final Map.Entry pollFirstEntry() {
            return (Map.Entry) Iterables.e(this.X.entrySet(), this.f19918Y);
        }

        @Override // com.google.common.collect.AbstractNavigableMap, java.util.NavigableMap
        public final Map.Entry pollLastEntry() {
            return (Map.Entry) Iterables.e(this.X.descendingMap().entrySet(), this.f19918Y);
        }

        @Override // java.util.AbstractMap, java.util.Map
        public final Object put(Object obj, Object obj2) {
            return ((AbstractFilteredMap) this.Z).put(obj, obj2);
        }

        @Override // java.util.AbstractMap, java.util.Map
        public final void putAll(Map map) {
            ((AbstractFilteredMap) this.Z).putAll(map);
        }

        @Override // java.util.AbstractMap, java.util.Map
        public final Object remove(Object obj) {
            return ((AbstractFilteredMap) this.Z).remove(obj);
        }

        @Override // java.util.AbstractMap, java.util.Map
        public final int size() {
            return ((AbstractMap) this.Z).size();
        }

        @Override // java.util.NavigableMap
        public final NavigableMap subMap(Object obj, boolean z2, Object obj2, boolean z3) {
            return Maps.e(this.X.subMap(obj, z2, obj2, z3), this.f19918Y);
        }

        @Override // java.util.NavigableMap
        public final NavigableMap tailMap(Object obj, boolean z2) {
            return Maps.e(this.X.tailMap(obj, z2), this.f19918Y);
        }

        @Override // java.util.AbstractMap, java.util.Map, java.util.SortedMap
        public final Collection values() {
            return new FilteredMapValues(this, this.X, this.f19918Y);
        }
    }

    public static class FilteredEntrySortedMap<K, V> extends FilteredEntryMap<K, V> implements SortedMap<K, V> {

        public class SortedKeySet extends FilteredEntryMap<K, V>.KeySet implements SortedSet<K> {
            public SortedKeySet() {
                super();
            }

            @Override // java.util.SortedSet
            public final Comparator comparator() {
                return FilteredEntrySortedMap.this.e0.comparator();
            }

            @Override // java.util.SortedSet
            public final Object first() {
                return FilteredEntrySortedMap.this.firstKey();
            }

            @Override // java.util.SortedSet
            public final SortedSet headSet(Object obj) {
                return (SortedSet) ((FilteredEntrySortedMap) FilteredEntrySortedMap.this.headMap(obj)).keySet();
            }

            @Override // java.util.SortedSet
            public final Object last() {
                return FilteredEntrySortedMap.this.lastKey();
            }

            @Override // java.util.SortedSet
            public final SortedSet subSet(Object obj, Object obj2) {
                return (SortedSet) ((FilteredEntrySortedMap) FilteredEntrySortedMap.this.subMap(obj, obj2)).keySet();
            }

            @Override // java.util.SortedSet
            public final SortedSet tailSet(Object obj) {
                return (SortedSet) ((FilteredEntrySortedMap) FilteredEntrySortedMap.this.tailMap(obj)).keySet();
            }
        }

        @Override // com.google.common.collect.Maps.FilteredEntryMap, com.google.common.collect.Maps.ViewCachingAbstractMap
        public final Set b() {
            return new SortedKeySet();
        }

        @Override // java.util.SortedMap
        public final Comparator comparator() {
            return this.e0.comparator();
        }

        @Override // java.util.SortedMap
        public final Object firstKey() {
            return ((SortedSet) super.keySet()).iterator().next();
        }

        /* JADX WARN: Type inference failed for: r1v1, types: [com.google.common.base.Predicate, java.lang.Object] */
        @Override // java.util.SortedMap
        public final SortedMap headMap(Object obj) {
            return new FilteredEntrySortedMap(this.e0.headMap(obj), this.f0);
        }

        @Override // com.google.common.collect.Maps.ViewCachingAbstractMap, java.util.AbstractMap, java.util.Map
        public final Set keySet() {
            return (SortedSet) super.keySet();
        }

        @Override // java.util.SortedMap
        public final Object lastKey() {
            SortedMap sortedMap = this.e0;
            SortedMap sortedMapHeadMap = sortedMap;
            while (true) {
                Object objLastKey = sortedMapHeadMap.lastKey();
                if (d(objLastKey, sortedMap.get(objLastKey))) {
                    return objLastKey;
                }
                sortedMapHeadMap = sortedMap.headMap(objLastKey);
            }
        }

        /* JADX WARN: Type inference failed for: r4v1, types: [com.google.common.base.Predicate, java.lang.Object] */
        @Override // java.util.SortedMap
        public final SortedMap subMap(Object obj, Object obj2) {
            return new FilteredEntrySortedMap(this.e0.subMap(obj, obj2), this.f0);
        }

        /* JADX WARN: Type inference failed for: r1v1, types: [com.google.common.base.Predicate, java.lang.Object] */
        @Override // java.util.SortedMap
        public final SortedMap tailMap(Object obj) {
            return new FilteredEntrySortedMap(this.e0.tailMap(obj), this.f0);
        }
    }

    public static class FilteredKeyMap<K, V> extends AbstractFilteredMap<K, V> {
        /* JADX WARN: Type inference failed for: r1v0, types: [com.google.common.base.Predicate, java.lang.Object] */
        @Override // com.google.common.collect.Maps.ViewCachingAbstractMap
        public final Set a() {
            return Sets.d(this.e0.entrySet(), this.f0);
        }

        @Override // com.google.common.collect.Maps.ViewCachingAbstractMap
        public final Set b() {
            return Sets.d(this.e0.keySet(), null);
        }

        @Override // com.google.common.collect.Maps.AbstractFilteredMap, java.util.AbstractMap, java.util.Map
        public final boolean containsKey(Object obj) {
            if (this.e0.containsKey(obj)) {
                throw null;
            }
            return false;
        }
    }

    public static final class FilteredMapValues<K, V> extends Values<K, V> {

        /* JADX INFO: renamed from: Y, reason: collision with root package name */
        public final Map f19920Y;
        public final Object Z;

        public FilteredMapValues(AbstractMap abstractMap, Map map, Predicate predicate) {
            super(abstractMap);
            this.f19920Y = map;
            this.Z = predicate;
        }

        /* JADX WARN: Type inference failed for: r2v0, types: [com.google.common.base.Predicate, java.lang.Object] */
        @Override // com.google.common.collect.Maps.Values, java.util.AbstractCollection, java.util.Collection
        public final boolean remove(Object obj) {
            Iterator<Map.Entry<K, V>> it = this.f19920Y.entrySet().iterator();
            while (it.hasNext()) {
                Map.Entry<K, V> next = it.next();
                if (this.Z.apply(next) && Objects.a(next.getValue(), obj)) {
                    it.remove();
                    return true;
                }
            }
            return false;
        }

        /* JADX WARN: Type inference failed for: r3v0, types: [com.google.common.base.Predicate, java.lang.Object] */
        @Override // com.google.common.collect.Maps.Values, java.util.AbstractCollection, java.util.Collection
        public final boolean removeAll(Collection collection) {
            Iterator<Map.Entry<K, V>> it = this.f19920Y.entrySet().iterator();
            boolean z2 = false;
            while (it.hasNext()) {
                Map.Entry<K, V> next = it.next();
                if (this.Z.apply(next) && collection.contains(next.getValue())) {
                    it.remove();
                    z2 = true;
                }
            }
            return z2;
        }

        /* JADX WARN: Type inference failed for: r3v0, types: [com.google.common.base.Predicate, java.lang.Object] */
        @Override // com.google.common.collect.Maps.Values, java.util.AbstractCollection, java.util.Collection
        public final boolean retainAll(Collection collection) {
            Iterator<Map.Entry<K, V>> it = this.f19920Y.entrySet().iterator();
            boolean z2 = false;
            while (it.hasNext()) {
                Map.Entry<K, V> next = it.next();
                if (this.Z.apply(next) && !collection.contains(next.getValue())) {
                    it.remove();
                    z2 = true;
                }
            }
            return z2;
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public final Object[] toArray() {
            return Lists.a(iterator()).toArray();
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public final Object[] toArray(Object[] objArr) {
            return Lists.a(iterator()).toArray(objArr);
        }
    }

    public static abstract class IteratorBasedAbstractMap<K, V> extends AbstractMap<K, V> {
        public abstract Iterator a();

        @Override // java.util.AbstractMap, java.util.Map
        public void clear() {
            Iterators.b(a());
        }

        @Override // java.util.AbstractMap, java.util.Map, java.util.SortedMap
        public Set entrySet() {
            return new EntrySet<Object, Object>() { // from class: com.google.common.collect.Maps.IteratorBasedAbstractMap.1
                @Override // com.google.common.collect.Maps.EntrySet
                public final Map a() {
                    return IteratorBasedAbstractMap.this;
                }

                @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
                public final Iterator iterator() {
                    return IteratorBasedAbstractMap.this.a();
                }
            };
        }
    }

    public static class KeySet<K, V> extends Sets.ImprovedAbstractSet<K> {
        public final Map X;

        public KeySet(Map map) {
            map.getClass();
            this.X = map;
        }

        public Map a() {
            return this.X;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public void clear() {
            a().clear();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(Object obj) {
            return a().containsKey(obj);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final boolean isEmpty() {
            return a().isEmpty();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public Iterator iterator() {
            return new AnonymousClass1(a().entrySet().iterator());
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean remove(Object obj) {
            if (!contains(obj)) {
                return false;
            }
            a().remove(obj);
            return true;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final int size() {
            return a().size();
        }
    }

    public static class MapDifferenceImpl<K, V> implements MapDifference<K, V> {
        @Override // com.google.common.collect.MapDifference
        public Map a() {
            return null;
        }

        public final boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof MapDifference)) {
                return false;
            }
            ((MapDifference) obj).a();
            throw null;
        }

        public final int hashCode() {
            return Arrays.hashCode(new Object[]{null, null, null, null});
        }

        public final String toString() {
            throw null;
        }
    }

    public static final class NavigableAsMapView<K, V> extends AbstractNavigableMap<K, V> {
        public final NavigableSet X;

        public NavigableAsMapView(NavigableSet navigableSet) {
            navigableSet.getClass();
            this.X = navigableSet;
            throw null;
        }

        @Override // com.google.common.collect.Maps.IteratorBasedAbstractMap
        public final Iterator a() {
            return new AnonymousClass3(this.X.iterator(), null);
        }

        @Override // com.google.common.collect.AbstractNavigableMap
        public final Iterator b() {
            descendingMap();
            throw null;
        }

        @Override // com.google.common.collect.Maps.IteratorBasedAbstractMap, java.util.AbstractMap, java.util.Map
        public final void clear() {
            this.X.clear();
        }

        @Override // java.util.SortedMap
        public final Comparator comparator() {
            return this.X.comparator();
        }

        @Override // com.google.common.collect.AbstractNavigableMap, java.util.NavigableMap
        public final NavigableMap descendingMap() {
            new NavigableAsMapView(this.X.descendingSet());
            throw null;
        }

        @Override // java.util.AbstractMap, java.util.Map
        public final Object get(Object obj) {
            if (Collections2.c(obj, this.X)) {
                throw null;
            }
            return null;
        }

        @Override // java.util.NavigableMap
        public final NavigableMap headMap(Object obj, boolean z2) {
            new NavigableAsMapView(this.X.headSet(obj, z2));
            throw null;
        }

        @Override // com.google.common.collect.AbstractNavigableMap, java.util.NavigableMap
        public final NavigableSet navigableKeySet() {
            return new AnonymousClass6(this.X);
        }

        @Override // java.util.AbstractMap, java.util.Map
        public final int size() {
            return this.X.size();
        }

        @Override // java.util.NavigableMap
        public final NavigableMap subMap(Object obj, boolean z2, Object obj2, boolean z3) {
            new NavigableAsMapView(this.X.subSet(obj, z2, obj2, z3));
            throw null;
        }

        @Override // java.util.NavigableMap
        public final NavigableMap tailMap(Object obj, boolean z2) {
            new NavigableAsMapView(this.X.tailSet(obj, z2));
            throw null;
        }
    }

    public static class SortedAsMapView<K, V> extends AsMapView<K, V> implements SortedMap<K, V> {
        @Override // java.util.SortedMap
        public final Comparator comparator() {
            return ((SortedSet) this.e0).comparator();
        }

        @Override // com.google.common.collect.Maps.AsMapView
        public final Set d() {
            return (SortedSet) this.e0;
        }

        @Override // java.util.SortedMap
        public final Object firstKey() {
            return ((SortedSet) this.e0).first();
        }

        @Override // java.util.SortedMap
        public final SortedMap headMap(Object obj) {
            return new SortedAsMapView(((SortedSet) this.e0).headSet(obj), this.f0);
        }

        @Override // com.google.common.collect.Maps.ViewCachingAbstractMap, java.util.AbstractMap, java.util.Map
        public final Set keySet() {
            return new AnonymousClass5((SortedSet) this.e0);
        }

        @Override // java.util.SortedMap
        public final Object lastKey() {
            return ((SortedSet) this.e0).last();
        }

        @Override // java.util.SortedMap
        public final SortedMap subMap(Object obj, Object obj2) {
            return new SortedAsMapView(((SortedSet) this.e0).subSet(obj, obj2), this.f0);
        }

        @Override // java.util.SortedMap
        public final SortedMap tailMap(Object obj) {
            return new SortedAsMapView(((SortedSet) this.e0).tailSet(obj), this.f0);
        }
    }

    public static class SortedKeySet<K, V> extends KeySet<K, V> implements SortedSet<K> {
        @Override // com.google.common.collect.Maps.KeySet
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public SortedMap a() {
            return (SortedMap) this.X;
        }

        @Override // java.util.SortedSet
        public final Comparator comparator() {
            return a().comparator();
        }

        @Override // java.util.SortedSet
        public final Object first() {
            return a().firstKey();
        }

        public SortedSet headSet(Object obj) {
            return new SortedKeySet(a().headMap(obj));
        }

        @Override // java.util.SortedSet
        public final Object last() {
            return a().lastKey();
        }

        public SortedSet subSet(Object obj, Object obj2) {
            return new SortedKeySet(a().subMap(obj, obj2));
        }

        public SortedSet tailSet(Object obj) {
            return new SortedKeySet(a().tailMap(obj));
        }
    }

    public static class SortedMapDifferenceImpl<K, V> extends MapDifferenceImpl<K, V> implements SortedMapDifference<K, V> {
        @Override // com.google.common.collect.Maps.MapDifferenceImpl, com.google.common.collect.MapDifference
        public final /* bridge */ /* synthetic */ Map a() {
            return null;
        }
    }

    public static class TransformedEntriesMap<K, V1, V2> extends IteratorBasedAbstractMap<K, V2> {
        public final Map X;

        /* JADX INFO: renamed from: Y, reason: collision with root package name */
        public final EntryTransformer f19921Y;

        public TransformedEntriesMap(Map map, EntryTransformer entryTransformer) {
            map.getClass();
            this.X = map;
            entryTransformer.getClass();
            this.f19921Y = entryTransformer;
        }

        @Override // com.google.common.collect.Maps.IteratorBasedAbstractMap
        public final Iterator a() {
            Iterator it = this.X.entrySet().iterator();
            EntryTransformer entryTransformer = this.f19921Y;
            entryTransformer.getClass();
            return new Iterators.AnonymousClass6(it, new AnonymousClass13(entryTransformer));
        }

        @Override // com.google.common.collect.Maps.IteratorBasedAbstractMap, java.util.AbstractMap, java.util.Map
        public final void clear() {
            this.X.clear();
        }

        @Override // java.util.AbstractMap, java.util.Map
        public final boolean containsKey(Object obj) {
            return this.X.containsKey(obj);
        }

        @Override // java.util.AbstractMap, java.util.Map
        public final Object get(Object obj) {
            Map map = this.X;
            Object obj2 = map.get(obj);
            if (obj2 != null || map.containsKey(obj)) {
                return this.f19921Y.a(obj, obj2);
            }
            return null;
        }

        @Override // java.util.AbstractMap, java.util.Map
        public final Set keySet() {
            return this.X.keySet();
        }

        @Override // java.util.AbstractMap, java.util.Map
        public final Object remove(Object obj) {
            Map map = this.X;
            if (!map.containsKey(obj)) {
                return null;
            }
            return this.f19921Y.a(obj, map.remove(obj));
        }

        @Override // java.util.AbstractMap, java.util.Map
        public final int size() {
            return this.X.size();
        }

        @Override // java.util.AbstractMap, java.util.Map
        public final Collection values() {
            return new Values(this);
        }
    }

    public static class TransformedEntriesNavigableMap<K, V1, V2> extends TransformedEntriesSortedMap<K, V1, V2> implements NavigableMap<K, V2> {
        @Override // com.google.common.collect.Maps.TransformedEntriesSortedMap
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public final NavigableMap b() {
            return (NavigableMap) ((SortedMap) this.X);
        }

        @Override // java.util.NavigableMap
        public final Map.Entry ceilingEntry(Object obj) {
            return d(b().ceilingEntry(obj));
        }

        @Override // java.util.NavigableMap
        public final Object ceilingKey(Object obj) {
            return b().ceilingKey(obj);
        }

        public final Map.Entry d(Map.Entry entry) {
            if (entry == null) {
                return null;
            }
            EntryTransformer entryTransformer = this.f19921Y;
            entryTransformer.getClass();
            return new AnonymousClass12(entry, entryTransformer);
        }

        @Override // java.util.NavigableMap
        public final NavigableSet descendingKeySet() {
            return b().descendingKeySet();
        }

        @Override // java.util.NavigableMap
        public final NavigableMap descendingMap() {
            return new TransformedEntriesNavigableMap(b().descendingMap(), this.f19921Y);
        }

        @Override // java.util.NavigableMap
        public final Map.Entry firstEntry() {
            return d(b().firstEntry());
        }

        @Override // java.util.NavigableMap
        public final Map.Entry floorEntry(Object obj) {
            return d(b().floorEntry(obj));
        }

        @Override // java.util.NavigableMap
        public final Object floorKey(Object obj) {
            return b().floorKey(obj);
        }

        @Override // com.google.common.collect.Maps.TransformedEntriesSortedMap, java.util.SortedMap, java.util.NavigableMap
        public final SortedMap headMap(Object obj) {
            return headMap(obj, false);
        }

        @Override // java.util.NavigableMap
        public final Map.Entry higherEntry(Object obj) {
            return d(b().higherEntry(obj));
        }

        @Override // java.util.NavigableMap
        public final Object higherKey(Object obj) {
            return b().higherKey(obj);
        }

        @Override // java.util.NavigableMap
        public final Map.Entry lastEntry() {
            return d(b().lastEntry());
        }

        @Override // java.util.NavigableMap
        public final Map.Entry lowerEntry(Object obj) {
            return d(b().lowerEntry(obj));
        }

        @Override // java.util.NavigableMap
        public final Object lowerKey(Object obj) {
            return b().lowerKey(obj);
        }

        @Override // java.util.NavigableMap
        public final NavigableSet navigableKeySet() {
            return b().navigableKeySet();
        }

        @Override // java.util.NavigableMap
        public final Map.Entry pollFirstEntry() {
            return d(b().pollFirstEntry());
        }

        @Override // java.util.NavigableMap
        public final Map.Entry pollLastEntry() {
            return d(b().pollLastEntry());
        }

        @Override // java.util.NavigableMap
        public final NavigableMap subMap(Object obj, boolean z2, Object obj2, boolean z3) {
            return new TransformedEntriesNavigableMap(b().subMap(obj, z2, obj2, z3), this.f19921Y);
        }

        @Override // com.google.common.collect.Maps.TransformedEntriesSortedMap, java.util.SortedMap, java.util.NavigableMap
        public final SortedMap tailMap(Object obj) {
            return tailMap(obj, true);
        }

        @Override // java.util.NavigableMap
        public final NavigableMap headMap(Object obj, boolean z2) {
            return new TransformedEntriesNavigableMap(b().headMap(obj, z2), this.f19921Y);
        }

        @Override // java.util.NavigableMap
        public final NavigableMap tailMap(Object obj, boolean z2) {
            return new TransformedEntriesNavigableMap(b().tailMap(obj, z2), this.f19921Y);
        }

        @Override // com.google.common.collect.Maps.TransformedEntriesSortedMap, java.util.SortedMap, java.util.NavigableMap
        public final SortedMap subMap(Object obj, Object obj2) {
            return subMap(obj, true, obj2, false);
        }
    }

    public static class TransformedEntriesSortedMap<K, V1, V2> extends TransformedEntriesMap<K, V1, V2> implements SortedMap<K, V2> {
        public SortedMap b() {
            return (SortedMap) this.X;
        }

        @Override // java.util.SortedMap
        public final Comparator comparator() {
            return b().comparator();
        }

        @Override // java.util.SortedMap
        public final Object firstKey() {
            return b().firstKey();
        }

        public SortedMap headMap(Object obj) {
            return new TransformedEntriesSortedMap(b().headMap(obj), this.f19921Y);
        }

        @Override // java.util.SortedMap
        public final Object lastKey() {
            return b().lastKey();
        }

        public SortedMap subMap(Object obj, Object obj2) {
            return new TransformedEntriesSortedMap(b().subMap(obj, obj2), this.f19921Y);
        }

        public SortedMap tailMap(Object obj) {
            return new TransformedEntriesSortedMap(b().tailMap(obj), this.f19921Y);
        }
    }

    public static class UnmodifiableBiMap<K, V> extends ForwardingMap<K, V> implements BiMap<K, V>, Serializable {
        private static final long serialVersionUID = 0;
        public final Map X;

        /* JADX INFO: renamed from: Y, reason: collision with root package name */
        public final BiMap f19922Y;
        public BiMap Z;
        public transient Set e0;

        public UnmodifiableBiMap(BiMap biMap, BiMap biMap2) {
            this.X = Collections.unmodifiableMap(biMap);
            this.f19922Y = biMap;
            this.Z = biMap2;
        }

        @Override // com.google.common.collect.BiMap
        public final BiMap H() {
            BiMap biMap = this.Z;
            if (biMap != null) {
                return biMap;
            }
            UnmodifiableBiMap unmodifiableBiMap = new UnmodifiableBiMap(this.f19922Y.H(), this);
            this.Z = unmodifiableBiMap;
            return unmodifiableBiMap;
        }

        @Override // com.google.common.collect.ForwardingMap, com.google.common.collect.ForwardingObject
        public final Object w() {
            return this.X;
        }

        @Override // com.google.common.collect.ForwardingMap
        /* JADX INFO: renamed from: x */
        public final Map w() {
            return this.X;
        }

        @Override // com.google.common.collect.ForwardingMap, java.util.Map
        public final Set values() {
            Set set = this.e0;
            if (set != null) {
                return set;
            }
            Set setUnmodifiableSet = Collections.unmodifiableSet(this.f19922Y.values());
            this.e0 = setUnmodifiableSet;
            return setUnmodifiableSet;
        }
    }

    public static class UnmodifiableEntries<K, V> extends ForwardingCollection<Map.Entry<K, V>> {
        @Override // com.google.common.collect.ForwardingCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public final Iterator iterator() {
            throw null;
        }

        @Override // com.google.common.collect.ForwardingCollection, java.util.Collection, java.util.Set
        public final Object[] toArray(Object[] objArr) {
            return ObjectArrays.c(this, objArr);
        }

        @Override // com.google.common.collect.ForwardingCollection, com.google.common.collect.ForwardingObject
        public final Object w() {
            return null;
        }

        @Override // com.google.common.collect.ForwardingCollection
        public final Collection x() {
            return null;
        }

        @Override // com.google.common.collect.ForwardingCollection, java.util.Collection, java.util.Set
        public final Object[] toArray() {
            return y();
        }
    }

    public static class UnmodifiableEntrySet<K, V> extends UnmodifiableEntries<K, V> implements Set<Map.Entry<K, V>> {
        @Override // java.util.Collection, java.util.Set
        public final boolean equals(Object obj) {
            return Sets.b(this, obj);
        }

        @Override // java.util.Collection, java.util.Set
        public final int hashCode() {
            return Sets.e(this);
        }
    }

    public static class UnmodifiableNavigableMap<K, V> extends ForwardingSortedMap<K, V> implements NavigableMap<K, V>, Serializable {
        public final NavigableMap X;

        /* JADX INFO: renamed from: Y, reason: collision with root package name */
        public transient UnmodifiableNavigableMap f19923Y;

        public UnmodifiableNavigableMap(NavigableMap navigableMap) {
            this.X = navigableMap;
        }

        @Override // java.util.NavigableMap
        public final Map.Entry ceilingEntry(Object obj) {
            return Maps.a(this.X.ceilingEntry(obj));
        }

        @Override // java.util.NavigableMap
        public final Object ceilingKey(Object obj) {
            return this.X.ceilingKey(obj);
        }

        @Override // java.util.NavigableMap
        public final NavigableSet descendingKeySet() {
            return Sets.k(this.X.descendingKeySet());
        }

        @Override // java.util.NavigableMap
        public final NavigableMap descendingMap() {
            UnmodifiableNavigableMap unmodifiableNavigableMap = this.f19923Y;
            if (unmodifiableNavigableMap != null) {
                return unmodifiableNavigableMap;
            }
            UnmodifiableNavigableMap unmodifiableNavigableMap2 = new UnmodifiableNavigableMap(this.X.descendingMap(), this);
            this.f19923Y = unmodifiableNavigableMap2;
            return unmodifiableNavigableMap2;
        }

        @Override // java.util.NavigableMap
        public final Map.Entry firstEntry() {
            return Maps.a(this.X.firstEntry());
        }

        @Override // java.util.NavigableMap
        public final Map.Entry floorEntry(Object obj) {
            return Maps.a(this.X.floorEntry(obj));
        }

        @Override // java.util.NavigableMap
        public final Object floorKey(Object obj) {
            return this.X.floorKey(obj);
        }

        @Override // com.google.common.collect.ForwardingSortedMap, java.util.SortedMap
        public final SortedMap headMap(Object obj) {
            return headMap(obj, false);
        }

        @Override // java.util.NavigableMap
        public final Map.Entry higherEntry(Object obj) {
            return Maps.a(this.X.higherEntry(obj));
        }

        @Override // java.util.NavigableMap
        public final Object higherKey(Object obj) {
            return this.X.higherKey(obj);
        }

        @Override // com.google.common.collect.ForwardingMap, java.util.Map
        public final Set keySet() {
            return navigableKeySet();
        }

        @Override // java.util.NavigableMap
        public final Map.Entry lastEntry() {
            return Maps.a(this.X.lastEntry());
        }

        @Override // java.util.NavigableMap
        public final Map.Entry lowerEntry(Object obj) {
            return Maps.a(this.X.lowerEntry(obj));
        }

        @Override // java.util.NavigableMap
        public final Object lowerKey(Object obj) {
            return this.X.lowerKey(obj);
        }

        @Override // java.util.NavigableMap
        public final NavigableSet navigableKeySet() {
            return Sets.k(this.X.navigableKeySet());
        }

        @Override // java.util.NavigableMap
        public final Map.Entry pollFirstEntry() {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.NavigableMap
        public final Map.Entry pollLastEntry() {
            throw new UnsupportedOperationException();
        }

        @Override // com.google.common.collect.ForwardingSortedMap, java.util.SortedMap
        public final SortedMap subMap(Object obj, Object obj2) {
            return subMap(obj, true, obj2, false);
        }

        @Override // com.google.common.collect.ForwardingSortedMap, java.util.SortedMap
        public final SortedMap tailMap(Object obj) {
            return tailMap(obj, true);
        }

        @Override // com.google.common.collect.ForwardingSortedMap, com.google.common.collect.ForwardingMap, com.google.common.collect.ForwardingObject
        public final Object w() {
            return Collections.unmodifiableSortedMap(this.X);
        }

        @Override // com.google.common.collect.ForwardingSortedMap, com.google.common.collect.ForwardingMap
        /* JADX INFO: renamed from: x */
        public final Map w() {
            return Collections.unmodifiableSortedMap(this.X);
        }

        @Override // com.google.common.collect.ForwardingSortedMap
        /* JADX INFO: renamed from: z */
        public final SortedMap x() {
            return Collections.unmodifiableSortedMap(this.X);
        }

        @Override // java.util.NavigableMap
        public final NavigableMap headMap(Object obj, boolean z2) {
            NavigableMap<K, V> navigableMapHeadMap = this.X.headMap(obj, z2);
            navigableMapHeadMap.getClass();
            return navigableMapHeadMap instanceof UnmodifiableNavigableMap ? navigableMapHeadMap : new UnmodifiableNavigableMap(navigableMapHeadMap);
        }

        @Override // java.util.NavigableMap
        public final NavigableMap subMap(Object obj, boolean z2, Object obj2, boolean z3) {
            NavigableMap<K, V> navigableMapSubMap = this.X.subMap(obj, z2, obj2, z3);
            navigableMapSubMap.getClass();
            return navigableMapSubMap instanceof UnmodifiableNavigableMap ? navigableMapSubMap : new UnmodifiableNavigableMap(navigableMapSubMap);
        }

        @Override // java.util.NavigableMap
        public final NavigableMap tailMap(Object obj, boolean z2) {
            NavigableMap<K, V> navigableMapTailMap = this.X.tailMap(obj, z2);
            navigableMapTailMap.getClass();
            return navigableMapTailMap instanceof UnmodifiableNavigableMap ? navigableMapTailMap : new UnmodifiableNavigableMap(navigableMapTailMap);
        }

        public UnmodifiableNavigableMap(NavigableMap navigableMap, UnmodifiableNavigableMap unmodifiableNavigableMap) {
            this.X = navigableMap;
            this.f19923Y = unmodifiableNavigableMap;
        }
    }

    public static class ValueDifferenceImpl<V> implements MapDifference.ValueDifference<V> {
        public final boolean equals(Object obj) {
            if (!(obj instanceof MapDifference.ValueDifference)) {
                return false;
            }
            ((MapDifference.ValueDifference) obj).getClass();
            return Objects.a(null, null) && Objects.a(null, null);
        }

        public final int hashCode() {
            return Arrays.hashCode(new Object[]{null, null});
        }

        public final String toString() {
            return "(null, null)";
        }
    }

    public static class Values<K, V> extends AbstractCollection<V> {
        public final Map X;

        public Values(Map map) {
            map.getClass();
            this.X = map;
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public final void clear() {
            this.X.clear();
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public final boolean contains(Object obj) {
            return this.X.containsValue(obj);
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public final boolean isEmpty() {
            return this.X.isEmpty();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
        public final Iterator iterator() {
            return new AnonymousClass2(this.X.entrySet().iterator());
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean remove(Object obj) {
            try {
                return super.remove(obj);
            } catch (UnsupportedOperationException unused) {
                Map map = this.X;
                for (Map.Entry<K, V> entry : map.entrySet()) {
                    if (Objects.a(obj, entry.getValue())) {
                        map.remove(entry.getKey());
                        return true;
                    }
                }
                return false;
            }
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean removeAll(Collection collection) {
            try {
                collection.getClass();
                return super.removeAll(collection);
            } catch (UnsupportedOperationException unused) {
                HashSet hashSet = new HashSet();
                Map map = this.X;
                for (Map.Entry<K, V> entry : map.entrySet()) {
                    if (collection.contains(entry.getValue())) {
                        hashSet.add(entry.getKey());
                    }
                }
                return map.keySet().removeAll(hashSet);
            }
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean retainAll(Collection collection) {
            try {
                collection.getClass();
                return super.retainAll(collection);
            } catch (UnsupportedOperationException unused) {
                HashSet hashSet = new HashSet();
                Map map = this.X;
                for (Map.Entry<K, V> entry : map.entrySet()) {
                    if (collection.contains(entry.getValue())) {
                        hashSet.add(entry.getKey());
                    }
                }
                return map.keySet().retainAll(hashSet);
            }
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public final int size() {
            return this.X.size();
        }
    }

    public static abstract class ViewCachingAbstractMap<K, V> extends AbstractMap<K, V> {
        public transient Set X;

        /* JADX INFO: renamed from: Y, reason: collision with root package name */
        public transient Set f19924Y;
        public transient Collection Z;

        public abstract Set a();

        public Set b() {
            return new KeySet(this);
        }

        public Collection c() {
            return new Values(this);
        }

        @Override // java.util.AbstractMap, java.util.Map
        public final Set entrySet() {
            Set set = this.X;
            if (set != null) {
                return set;
            }
            Set setA = a();
            this.X = setA;
            return setA;
        }

        @Override // java.util.AbstractMap, java.util.Map
        public Set keySet() {
            Set set = this.f19924Y;
            if (set != null) {
                return set;
            }
            Set setB = b();
            this.f19924Y = setB;
            return setB;
        }

        @Override // java.util.AbstractMap, java.util.Map
        public Collection values() {
            Collection collection = this.Z;
            if (collection != null) {
                return collection;
            }
            Collection collectionC = c();
            this.Z = collectionC;
            return collectionC;
        }
    }

    public static Map.Entry a(Map.Entry entry) {
        if (entry == null) {
            return null;
        }
        return new AnonymousClass7(entry);
    }

    public static Map b(Set set, Function function) {
        return new AsMapView(set, function);
    }

    public static int c(int i2) {
        if (i2 < 3) {
            CollectPreconditions.b(i2, "expectedSize");
            return i2 + 1;
        }
        if (i2 < 1073741824) {
            return (int) Math.ceil(((double) i2) / 0.75d);
        }
        return Integer.MAX_VALUE;
    }

    public static boolean d(Map map, Object obj) {
        if (map == obj) {
            return true;
        }
        if (obj instanceof Map) {
            return map.entrySet().equals(((Map) obj).entrySet());
        }
        return false;
    }

    public static NavigableMap e(NavigableMap navigableMap, Predicate predicate) {
        predicate.getClass();
        if (!(navigableMap instanceof FilteredEntryNavigableMap)) {
            navigableMap.getClass();
            return new FilteredEntryNavigableMap(navigableMap, predicate);
        }
        FilteredEntryNavigableMap filteredEntryNavigableMap = (FilteredEntryNavigableMap) navigableMap;
        return new FilteredEntryNavigableMap(filteredEntryNavigableMap.X, Predicates.c(filteredEntryNavigableMap.f19918Y, predicate));
    }

    public static ImmutableMap f(ImmutableSet immutableSet) {
        ImmutableMap.Builder builder = new ImmutableMap.Builder(immutableSet.size());
        Iterator<E> it = immutableSet.iterator();
        int i2 = 0;
        while (it.hasNext()) {
            builder.c(it.next(), Integer.valueOf(i2));
            i2++;
        }
        return builder.a(true);
    }

    public static Object g(Map.Entry entry) {
        if (entry == null) {
            return null;
        }
        return entry.getKey();
    }

    public static boolean h(Map map, Object obj) {
        map.getClass();
        try {
            return map.containsKey(obj);
        } catch (ClassCastException | NullPointerException unused) {
            return false;
        }
    }

    public static Object i(Map map, Object obj) {
        map.getClass();
        try {
            return map.get(obj);
        } catch (ClassCastException | NullPointerException unused) {
            return null;
        }
    }

    public static String j(Map map) {
        int size = map.size();
        CollectPreconditions.b(size, "size");
        StringBuilder sb = new StringBuilder((int) Math.min(((long) size) * 8, 1073741824L));
        sb.append(AbstractJsonLexerKt.BEGIN_OBJ);
        boolean z2 = true;
        for (Map.Entry entry : map.entrySet()) {
            if (!z2) {
                sb.append(", ");
            }
            sb.append(entry.getKey());
            sb.append(dc.T);
            sb.append(entry.getValue());
            z2 = false;
        }
        sb.append(AbstractJsonLexerKt.END_OBJ);
        return sb.toString();
    }

    public static Map k(Map map, com.google.common.net.a aVar) {
        aVar.getClass();
        return new TransformedEntriesMap(map, new AnonymousClass9(aVar));
    }

    /* JADX INFO: renamed from: com.google.common.collect.Maps$6, reason: invalid class name */
    class AnonymousClass6 extends ForwardingNavigableSet<Object> {
        public final /* synthetic */ NavigableSet X;

        public AnonymousClass6(NavigableSet navigableSet) {
            this.X = navigableSet;
        }

        @Override // com.google.common.collect.ForwardingNavigableSet, com.google.common.collect.ForwardingSortedSet, com.google.common.collect.ForwardingSet
        /* JADX INFO: renamed from: A */
        public final Set w() {
            return this.X;
        }

        @Override // com.google.common.collect.ForwardingNavigableSet, com.google.common.collect.ForwardingSortedSet
        /* JADX INFO: renamed from: B */
        public final SortedSet w() {
            return this.X;
        }

        @Override // com.google.common.collect.ForwardingNavigableSet
        /* JADX INFO: renamed from: C */
        public final NavigableSet x() {
            return this.X;
        }

        @Override // com.google.common.collect.ForwardingCollection, java.util.Collection, java.util.Queue
        public final boolean add(Object obj) {
            throw new UnsupportedOperationException();
        }

        @Override // com.google.common.collect.ForwardingCollection, java.util.Collection
        public final boolean addAll(Collection collection) {
            throw new UnsupportedOperationException();
        }

        @Override // com.google.common.collect.ForwardingNavigableSet, java.util.NavigableSet
        public final NavigableSet descendingSet() {
            return new AnonymousClass6(super.descendingSet());
        }

        @Override // com.google.common.collect.ForwardingSortedSet, java.util.SortedSet
        public final SortedSet headSet(Object obj) {
            return new AnonymousClass5(super.headSet(obj));
        }

        @Override // com.google.common.collect.ForwardingSortedSet, java.util.SortedSet
        public final SortedSet subSet(Object obj, Object obj2) {
            return new AnonymousClass5(super.subSet(obj, obj2));
        }

        @Override // com.google.common.collect.ForwardingSortedSet, java.util.SortedSet
        public final SortedSet tailSet(Object obj) {
            return new AnonymousClass5(super.tailSet(obj));
        }

        @Override // com.google.common.collect.ForwardingNavigableSet, com.google.common.collect.ForwardingSortedSet, com.google.common.collect.ForwardingSet, com.google.common.collect.ForwardingCollection, com.google.common.collect.ForwardingObject
        public final Object w() {
            return this.X;
        }

        @Override // com.google.common.collect.ForwardingNavigableSet, com.google.common.collect.ForwardingSortedSet, com.google.common.collect.ForwardingSet, com.google.common.collect.ForwardingCollection
        public final Collection x() {
            return this.X;
        }

        @Override // com.google.common.collect.ForwardingNavigableSet, java.util.NavigableSet
        public final NavigableSet headSet(Object obj, boolean z2) {
            return new AnonymousClass6(super.headSet(obj, z2));
        }

        @Override // com.google.common.collect.ForwardingNavigableSet, java.util.NavigableSet
        public final NavigableSet subSet(Object obj, boolean z2, Object obj2, boolean z3) {
            return new AnonymousClass6(super.subSet(obj, z2, obj2, z3));
        }

        @Override // com.google.common.collect.ForwardingNavigableSet, java.util.NavigableSet
        public final NavigableSet tailSet(Object obj, boolean z2) {
            return new AnonymousClass6(super.tailSet(obj, z2));
        }
    }

    public static class NavigableKeySet<K, V> extends SortedKeySet<K, V> implements NavigableSet<K> {
        @Override // com.google.common.collect.Maps.SortedKeySet, com.google.common.collect.Maps.KeySet
        public final Map a() {
            return (NavigableMap) this.X;
        }

        @Override // com.google.common.collect.Maps.SortedKeySet
        /* JADX INFO: renamed from: c */
        public final SortedMap a() {
            return (NavigableMap) this.X;
        }

        @Override // java.util.NavigableSet
        public final Object ceiling(Object obj) {
            return ((NavigableMap) this.X).ceilingKey(obj);
        }

        @Override // java.util.NavigableSet
        public final Iterator descendingIterator() {
            return descendingSet().iterator();
        }

        @Override // java.util.NavigableSet
        public final NavigableSet descendingSet() {
            return ((NavigableMap) this.X).descendingKeySet();
        }

        @Override // java.util.NavigableSet
        public final Object floor(Object obj) {
            return ((NavigableMap) this.X).floorKey(obj);
        }

        @Override // java.util.NavigableSet
        public final NavigableSet headSet(Object obj, boolean z2) {
            return ((NavigableMap) this.X).headMap(obj, z2).navigableKeySet();
        }

        @Override // java.util.NavigableSet
        public final Object higher(Object obj) {
            return ((NavigableMap) this.X).higherKey(obj);
        }

        @Override // java.util.NavigableSet
        public final Object lower(Object obj) {
            return ((NavigableMap) this.X).lowerKey(obj);
        }

        @Override // java.util.NavigableSet
        public final Object pollFirst() {
            return Maps.g(((NavigableMap) this.X).pollFirstEntry());
        }

        @Override // java.util.NavigableSet
        public final Object pollLast() {
            return Maps.g(((NavigableMap) this.X).pollLastEntry());
        }

        @Override // java.util.NavigableSet
        public final NavigableSet subSet(Object obj, boolean z2, Object obj2, boolean z3) {
            return ((NavigableMap) this.X).subMap(obj, z2, obj2, z3).navigableKeySet();
        }

        @Override // java.util.NavigableSet
        public final NavigableSet tailSet(Object obj, boolean z2) {
            return ((NavigableMap) this.X).tailMap(obj, z2).navigableKeySet();
        }

        @Override // com.google.common.collect.Maps.SortedKeySet, java.util.SortedSet, java.util.NavigableSet
        public final SortedSet headSet(Object obj) {
            return headSet(obj, false);
        }

        @Override // com.google.common.collect.Maps.SortedKeySet, java.util.SortedSet, java.util.NavigableSet
        public final SortedSet subSet(Object obj, Object obj2) {
            return subSet(obj, true, obj2, false);
        }

        @Override // com.google.common.collect.Maps.SortedKeySet, java.util.SortedSet, java.util.NavigableSet
        public final SortedSet tailSet(Object obj) {
            return tailSet(obj, true);
        }
    }
}
