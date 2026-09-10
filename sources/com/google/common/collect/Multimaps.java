package com.google.common.collect;

import com.google.common.base.Function;
import com.google.common.base.Supplier;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.AbstractCollection;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.NavigableSet;
import java.util.NoSuchElementException;
import java.util.Objects;
import java.util.RandomAccess;
import java.util.Set;
import java.util.SortedSet;

/* JADX INFO: loaded from: classes4.dex */
@ElementTypesAreNonnullByDefault
public final class Multimaps {

    public static final class AsMap<K, V> extends Maps.ViewCachingAbstractMap<K, Collection<V>> {
        public final Multimap e0;

        public class EntrySet extends Maps.EntrySet<K, Collection<V>> {
            public EntrySet() {
            }

            @Override // com.google.common.collect.Maps.EntrySet
            public final Map a() {
                return AsMap.this;
            }

            @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
            public final Iterator iterator() {
                Set setKeySet = AsMap.this.e0.keySet();
                return new Maps.AnonymousClass3(setKeySet.iterator(), new f(this));
            }

            @Override // com.google.common.collect.Maps.EntrySet, java.util.AbstractCollection, java.util.Collection, java.util.Set
            public final boolean remove(Object obj) {
                if (!contains(obj)) {
                    return false;
                }
                Map.Entry entry = (Map.Entry) obj;
                Objects.requireNonNull(entry);
                AsMap.this.e0.keySet().remove(entry.getKey());
                return true;
            }
        }

        public AsMap(Multimap multimap) {
            this.e0 = multimap;
        }

        @Override // com.google.common.collect.Maps.ViewCachingAbstractMap
        public final Set a() {
            return new EntrySet();
        }

        @Override // java.util.AbstractMap, java.util.Map
        public final void clear() {
            this.e0.clear();
        }

        @Override // java.util.AbstractMap, java.util.Map
        public final boolean containsKey(Object obj) {
            return this.e0.containsKey(obj);
        }

        @Override // java.util.AbstractMap, java.util.Map
        public final Object get(Object obj) {
            Multimap multimap = this.e0;
            if (multimap.containsKey(obj)) {
                return multimap.get(obj);
            }
            return null;
        }

        @Override // java.util.AbstractMap, java.util.Map
        public final boolean isEmpty() {
            return this.e0.isEmpty();
        }

        @Override // com.google.common.collect.Maps.ViewCachingAbstractMap, java.util.AbstractMap, java.util.Map
        public final Set keySet() {
            return this.e0.keySet();
        }

        @Override // java.util.AbstractMap, java.util.Map
        public final Object remove(Object obj) {
            Multimap multimap = this.e0;
            if (multimap.containsKey(obj)) {
                return multimap.a(obj);
            }
            return null;
        }

        @Override // java.util.AbstractMap, java.util.Map
        public final int size() {
            return this.e0.keySet().size();
        }
    }

    public static class CustomListMultimap<K, V> extends AbstractListMultimap<K, V> {
        private static final long serialVersionUID = 0;
        public transient Supplier i0;

        private void readObject(ObjectInputStream objectInputStream) throws ClassNotFoundException, IOException {
            objectInputStream.defaultReadObject();
            Object object = objectInputStream.readObject();
            Objects.requireNonNull(object);
            this.i0 = (Supplier) object;
            Object object2 = objectInputStream.readObject();
            Objects.requireNonNull(object2);
            w((Map) object2);
        }

        private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
            objectOutputStream.defaultWriteObject();
            objectOutputStream.writeObject(this.i0);
            objectOutputStream.writeObject(this.g0);
        }

        @Override // com.google.common.collect.AbstractListMultimap, com.google.common.collect.AbstractMapBasedMultimap
        /* JADX INFO: renamed from: A */
        public final List o() {
            return (List) this.i0.get();
        }

        @Override // com.google.common.collect.AbstractMapBasedMultimap, com.google.common.collect.AbstractMultimap
        public final Map g() {
            return q();
        }

        @Override // com.google.common.collect.AbstractMapBasedMultimap, com.google.common.collect.AbstractMultimap
        public final Set k() {
            return r();
        }
    }

    public static class CustomMultimap<K, V> extends AbstractMapBasedMultimap<K, V> {
        private static final long serialVersionUID = 0;
        public transient Supplier i0;

        private void readObject(ObjectInputStream objectInputStream) throws ClassNotFoundException, IOException {
            objectInputStream.defaultReadObject();
            Object object = objectInputStream.readObject();
            Objects.requireNonNull(object);
            this.i0 = (Supplier) object;
            Object object2 = objectInputStream.readObject();
            Objects.requireNonNull(object2);
            w((Map) object2);
        }

        private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
            objectOutputStream.defaultWriteObject();
            objectOutputStream.writeObject(this.i0);
            objectOutputStream.writeObject(this.g0);
        }

        @Override // com.google.common.collect.AbstractMapBasedMultimap, com.google.common.collect.AbstractMultimap
        public final Map g() {
            return q();
        }

        @Override // com.google.common.collect.AbstractMapBasedMultimap, com.google.common.collect.AbstractMultimap
        public final Set k() {
            return r();
        }

        @Override // com.google.common.collect.AbstractMapBasedMultimap
        public final Collection o() {
            return (Collection) this.i0.get();
        }

        @Override // com.google.common.collect.AbstractMapBasedMultimap
        public final Collection x(Collection collection) {
            if (collection instanceof NavigableSet) {
                return Sets.k((NavigableSet) collection);
            }
            if (collection instanceof SortedSet) {
                return Collections.unmodifiableSortedSet((SortedSet) collection);
            }
            if (collection instanceof Set) {
                return Collections.unmodifiableSet((Set) collection);
            }
            return collection instanceof List ? Collections.unmodifiableList((List) collection) : Collections.unmodifiableCollection(collection);
        }

        @Override // com.google.common.collect.AbstractMapBasedMultimap
        public final Collection z(Object obj, Collection collection) {
            if (collection instanceof List) {
                List list = (List) collection;
                return list instanceof RandomAccess ? new AbstractMapBasedMultimap.RandomAccessWrappedList(obj, list, null) : new AbstractMapBasedMultimap.WrappedList(obj, list, null);
            }
            if (collection instanceof NavigableSet) {
                return new AbstractMapBasedMultimap.WrappedNavigableSet(obj, (NavigableSet) collection, null);
            }
            if (collection instanceof SortedSet) {
                return new AbstractMapBasedMultimap.WrappedSortedSet(obj, (SortedSet) collection, null);
            }
            return collection instanceof Set ? new AbstractMapBasedMultimap.WrappedSet(obj, (Set) collection) : new AbstractMapBasedMultimap.WrappedCollection(obj, collection, null);
        }
    }

    public static class CustomSetMultimap<K, V> extends AbstractSetMultimap<K, V> {
        private static final long serialVersionUID = 0;
        public transient Supplier i0;

        private void readObject(ObjectInputStream objectInputStream) throws ClassNotFoundException, IOException {
            objectInputStream.defaultReadObject();
            Object object = objectInputStream.readObject();
            Objects.requireNonNull(object);
            this.i0 = (Supplier) object;
            Object object2 = objectInputStream.readObject();
            Objects.requireNonNull(object2);
            w((Map) object2);
        }

        private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
            objectOutputStream.defaultWriteObject();
            objectOutputStream.writeObject(this.i0);
            objectOutputStream.writeObject(this.g0);
        }

        @Override // com.google.common.collect.AbstractSetMultimap, com.google.common.collect.AbstractMapBasedMultimap
        /* JADX INFO: renamed from: A */
        public final Set o() {
            return (Set) this.i0.get();
        }

        @Override // com.google.common.collect.AbstractMapBasedMultimap, com.google.common.collect.AbstractMultimap
        public final Map g() {
            return q();
        }

        @Override // com.google.common.collect.AbstractMapBasedMultimap, com.google.common.collect.AbstractMultimap
        public final Set k() {
            return r();
        }

        @Override // com.google.common.collect.AbstractSetMultimap, com.google.common.collect.AbstractMapBasedMultimap
        public final Collection x(Collection collection) {
            if (collection instanceof NavigableSet) {
                return Sets.k((NavigableSet) collection);
            }
            return collection instanceof SortedSet ? Collections.unmodifiableSortedSet((SortedSet) collection) : Collections.unmodifiableSet((Set) collection);
        }

        @Override // com.google.common.collect.AbstractSetMultimap, com.google.common.collect.AbstractMapBasedMultimap
        public final Collection z(Object obj, Collection collection) {
            if (collection instanceof NavigableSet) {
                return new AbstractMapBasedMultimap.WrappedNavigableSet(obj, (NavigableSet) collection, null);
            }
            return collection instanceof SortedSet ? new AbstractMapBasedMultimap.WrappedSortedSet(obj, (SortedSet) collection, null) : new AbstractMapBasedMultimap.WrappedSet(obj, (Set) collection);
        }
    }

    public static class CustomSortedSetMultimap<K, V> extends AbstractSortedSetMultimap<K, V> {
        private static final long serialVersionUID = 0;
        public transient Supplier i0;

        private void readObject(ObjectInputStream objectInputStream) throws ClassNotFoundException, IOException {
            objectInputStream.defaultReadObject();
            Object object = objectInputStream.readObject();
            Objects.requireNonNull(object);
            Supplier supplier = (Supplier) object;
            this.i0 = supplier;
            ((SortedSet) supplier.get()).comparator();
            Object object2 = objectInputStream.readObject();
            Objects.requireNonNull(object2);
            w((Map) object2);
        }

        private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
            objectOutputStream.defaultWriteObject();
            objectOutputStream.writeObject(this.i0);
            objectOutputStream.writeObject(this.g0);
        }

        @Override // com.google.common.collect.AbstractSortedSetMultimap, com.google.common.collect.AbstractSetMultimap, com.google.common.collect.AbstractMapBasedMultimap
        /* JADX INFO: renamed from: C, reason: merged with bridge method [inline-methods] */
        public final SortedSet o() {
            return (SortedSet) this.i0.get();
        }

        @Override // com.google.common.collect.AbstractMapBasedMultimap, com.google.common.collect.AbstractMultimap
        public final Map g() {
            return q();
        }

        @Override // com.google.common.collect.AbstractMapBasedMultimap, com.google.common.collect.AbstractMultimap
        public final Set k() {
            return r();
        }
    }

    public static abstract class Entries<K, V> extends AbstractCollection<Map.Entry<K, V>> {
        public abstract Multimap a();

        @Override // java.util.AbstractCollection, java.util.Collection
        public final void clear() {
            a().clear();
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public final boolean contains(Object obj) {
            if (!(obj instanceof Map.Entry)) {
                return false;
            }
            Map.Entry entry = (Map.Entry) obj;
            return a().v(entry.getKey(), entry.getValue());
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public final boolean remove(Object obj) {
            if (!(obj instanceof Map.Entry)) {
                return false;
            }
            Map.Entry entry = (Map.Entry) obj;
            return a().remove(entry.getKey(), entry.getValue());
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public final int size() {
            return a().size();
        }
    }

    public static class Keys<K, V> extends AbstractMultiset<K> {
        public final Multimap Z;

        /* JADX INFO: renamed from: com.google.common.collect.Multimaps$Keys$1, reason: invalid class name */
        class AnonymousClass1 extends TransformedIterator<Map.Entry<Object, Collection<Object>>, Multiset.Entry<Object>> {
            @Override // com.google.common.collect.TransformedIterator
            public final Object a(Object obj) {
                final Map.Entry entry = (Map.Entry) obj;
                return new Multisets.AbstractEntry<Object>() { // from class: com.google.common.collect.Multimaps.Keys.1.1
                    @Override // com.google.common.collect.Multiset.Entry
                    public final Object d() {
                        return entry.getKey();
                    }

                    @Override // com.google.common.collect.Multiset.Entry
                    public final int getCount() {
                        return ((Collection) entry.getValue()).size();
                    }
                };
            }
        }

        public Keys(Multimap multimap) {
            this.Z = multimap;
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public final void clear() {
            this.Z.clear();
        }

        @Override // com.google.common.collect.AbstractMultiset, java.util.AbstractCollection, java.util.Collection
        public final boolean contains(Object obj) {
            return this.Z.containsKey(obj);
        }

        @Override // com.google.common.collect.AbstractMultiset
        public final int h() {
            return this.Z.u().size();
        }

        @Override // com.google.common.collect.AbstractMultiset
        public final Iterator i() {
            throw new AssertionError("should never be called");
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
        public final Iterator iterator() {
            return new Maps.AnonymousClass1(this.Z.d().iterator());
        }

        @Override // com.google.common.collect.AbstractMultiset, com.google.common.collect.Multiset
        public final Set k() {
            return this.Z.keySet();
        }

        @Override // com.google.common.collect.AbstractMultiset
        public final Iterator l() {
            return new AnonymousClass1(this.Z.u().entrySet().iterator());
        }

        @Override // com.google.common.collect.AbstractMultiset, com.google.common.collect.Multiset
        public int m(int i2, Object obj) {
            CollectPreconditions.b(i2, "occurrences");
            if (i2 == 0) {
                return w0(obj);
            }
            Collection collection = (Collection) Maps.i(this.Z.u(), obj);
            if (collection == null) {
                return 0;
            }
            int size = collection.size();
            if (i2 >= size) {
                collection.clear();
                return size;
            }
            Iterator it = collection.iterator();
            for (int i3 = 0; i3 < i2; i3++) {
                it.next();
                it.remove();
            }
            return size;
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public final int size() {
            return this.Z.size();
        }

        @Override // com.google.common.collect.Multiset
        public final int w0(Object obj) {
            Collection collection = (Collection) Maps.i(this.Z.u(), obj);
            if (collection == null) {
                return 0;
            }
            return collection.size();
        }
    }

    public static class MapMultimap<K, V> extends AbstractMultimap<K, V> implements SetMultimap<K, V>, Serializable {
        private static final long serialVersionUID = 7845222491160860175L;

        /* JADX INFO: renamed from: com.google.common.collect.Multimaps$MapMultimap$1, reason: invalid class name */
        class AnonymousClass1 extends Sets.ImprovedAbstractSet<Object> {
            public final /* synthetic */ Object X;

            public AnonymousClass1(Object obj) {
                this.X = obj;
            }

            @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
            public final Iterator iterator() {
                return new Iterator<Object>() { // from class: com.google.common.collect.Multimaps.MapMultimap.1.1
                    public int X;

                    @Override // java.util.Iterator
                    public final boolean hasNext() {
                        if (this.X != 0) {
                            return false;
                        }
                        AnonymousClass1 anonymousClass1 = AnonymousClass1.this;
                        MapMultimap.this.getClass();
                        Object obj = anonymousClass1.X;
                        throw null;
                    }

                    @Override // java.util.Iterator
                    public final Object next() {
                        hasNext();
                        throw new NoSuchElementException();
                    }

                    @Override // java.util.Iterator
                    public final void remove() {
                        CollectPreconditions.d(this.X == 1);
                        this.X = -1;
                        MapMultimap.this.getClass();
                        throw null;
                    }
                };
            }

            @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
            public final int size() {
                MapMultimap.this.getClass();
                throw null;
            }
        }

        @Override // com.google.common.collect.Multimap, com.google.common.collect.ListMultimap
        public final /* bridge */ /* synthetic */ Collection a(Object obj) {
            a(obj);
            throw null;
        }

        @Override // com.google.common.collect.Multimap
        public final void clear() {
            throw null;
        }

        @Override // com.google.common.collect.Multimap
        public final boolean containsKey(Object obj) {
            throw null;
        }

        @Override // com.google.common.collect.AbstractMultimap, com.google.common.collect.Multimap
        public final boolean containsValue(Object obj) {
            throw null;
        }

        @Override // com.google.common.collect.AbstractMultimap, com.google.common.collect.Multimap
        public final Collection d() {
            throw null;
        }

        @Override // com.google.common.collect.AbstractMultimap
        public final Map g() {
            return new AsMap(this);
        }

        @Override // com.google.common.collect.Multimap, com.google.common.collect.ListMultimap
        public final Collection get(Object obj) {
            return new AnonymousClass1(obj);
        }

        @Override // com.google.common.collect.AbstractMultimap, com.google.common.collect.Multimap
        public final int hashCode() {
            throw null;
        }

        @Override // com.google.common.collect.AbstractMultimap
        public final Collection j() {
            throw new AssertionError("unreachable");
        }

        @Override // com.google.common.collect.AbstractMultimap
        public final Set k() {
            throw null;
        }

        @Override // com.google.common.collect.AbstractMultimap
        public final Multiset l() {
            return new Keys(this);
        }

        @Override // com.google.common.collect.AbstractMultimap
        public final Collection m() {
            throw null;
        }

        @Override // com.google.common.collect.AbstractMultimap
        public final Iterator n() {
            throw null;
        }

        @Override // com.google.common.collect.AbstractMultimap, com.google.common.collect.Multimap
        public final boolean put(Object obj, Object obj2) {
            throw new UnsupportedOperationException();
        }

        @Override // com.google.common.collect.AbstractMultimap, com.google.common.collect.Multimap
        public final boolean remove(Object obj, Object obj2) {
            throw null;
        }

        @Override // com.google.common.collect.Multimap
        public final int size() {
            throw null;
        }

        @Override // com.google.common.collect.AbstractMultimap, com.google.common.collect.Multimap
        public final boolean v(Object obj, Object obj2) {
            throw null;
        }

        @Override // com.google.common.collect.Multimap, com.google.common.collect.ListMultimap
        public final Set a(Object obj) {
            new HashSet(2);
            throw null;
        }

        @Override // com.google.common.collect.AbstractMultimap, com.google.common.collect.Multimap
        public final Set d() {
            throw null;
        }

        @Override // com.google.common.collect.Multimap, com.google.common.collect.ListMultimap
        public final Set get(Object obj) {
            return new AnonymousClass1(obj);
        }
    }

    public static final class TransformedEntriesListMultimap<K, V1, V2> extends TransformedEntriesMultimap<K, V1, V2> implements ListMultimap<K, V2> {
        @Override // com.google.common.collect.Multimaps.TransformedEntriesMultimap
        public final Collection o(Object obj, Collection collection) {
            return Lists.c((List) collection, new Maps.AnonymousClass10(this.h0, obj));
        }

        @Override // com.google.common.collect.Multimaps.TransformedEntriesMultimap, com.google.common.collect.Multimap, com.google.common.collect.ListMultimap
        public final List a(Object obj) {
            return Lists.c((List) this.g0.a(obj), new Maps.AnonymousClass10(this.h0, obj));
        }

        @Override // com.google.common.collect.Multimaps.TransformedEntriesMultimap, com.google.common.collect.Multimap, com.google.common.collect.ListMultimap
        public final List get(Object obj) {
            return Lists.c((List) this.g0.get(obj), new Maps.AnonymousClass10(this.h0, obj));
        }
    }

    public static class TransformedEntriesMultimap<K, V1, V2> extends AbstractMultimap<K, V2> {
        public final ListMultimap g0;
        public final Maps.EntryTransformer h0;

        public TransformedEntriesMultimap(ListMultimap listMultimap, Maps.EntryTransformer entryTransformer) {
            listMultimap.getClass();
            this.g0 = listMultimap;
            this.h0 = entryTransformer;
        }

        @Override // com.google.common.collect.Multimap, com.google.common.collect.ListMultimap
        public Collection a(Object obj) {
            return o(obj, this.g0.a(obj));
        }

        @Override // com.google.common.collect.Multimap
        public final void clear() {
            this.g0.clear();
        }

        @Override // com.google.common.collect.Multimap
        public final boolean containsKey(Object obj) {
            return this.g0.containsKey(obj);
        }

        @Override // com.google.common.collect.AbstractMultimap
        public final Map g() {
            return new Maps.TransformedEntriesMap(this.g0.u(), new f(this));
        }

        @Override // com.google.common.collect.Multimap, com.google.common.collect.ListMultimap
        public Collection get(Object obj) {
            return o(obj, this.g0.get(obj));
        }

        @Override // com.google.common.collect.AbstractMultimap, com.google.common.collect.Multimap
        public final boolean isEmpty() {
            return this.g0.isEmpty();
        }

        @Override // com.google.common.collect.AbstractMultimap
        public final Collection j() {
            return new AbstractMultimap.Entries();
        }

        @Override // com.google.common.collect.AbstractMultimap
        public final Set k() {
            return this.g0.keySet();
        }

        @Override // com.google.common.collect.AbstractMultimap
        public final Multiset l() {
            return this.g0.h();
        }

        @Override // com.google.common.collect.AbstractMultimap
        public final Collection m() {
            Collection collectionD = this.g0.d();
            final Maps.EntryTransformer entryTransformer = this.h0;
            return new Collections2.TransformedCollection(collectionD, new Function<Map.Entry<Object, Object>, Object>() { // from class: com.google.common.collect.Maps.11
                public AnonymousClass11() {
                }

                @Override // com.google.common.base.Function, androidx.arch.core.util.Function, com.google.android.datatransport.Transformer
                public final Object apply(Object obj) {
                    Map.Entry entry = (Map.Entry) obj;
                    entry.getKey();
                    return ((AnonymousClass9) entryTransformer).X.apply(entry.getValue());
                }
            });
        }

        @Override // com.google.common.collect.AbstractMultimap
        public final Iterator n() {
            return new Iterators.AnonymousClass6(this.g0.d().iterator(), new Maps.AnonymousClass13(this.h0));
        }

        public Collection o(Object obj, Collection collection) {
            Maps.AnonymousClass10 anonymousClass10 = new Maps.AnonymousClass10(this.h0, obj);
            return collection instanceof List ? Lists.c((List) collection, anonymousClass10) : new Collections2.TransformedCollection(collection, anonymousClass10);
        }

        @Override // com.google.common.collect.AbstractMultimap, com.google.common.collect.Multimap
        public final boolean put(Object obj, Object obj2) {
            throw new UnsupportedOperationException();
        }

        @Override // com.google.common.collect.AbstractMultimap, com.google.common.collect.Multimap
        public final boolean remove(Object obj, Object obj2) {
            return get(obj).remove(obj2);
        }

        @Override // com.google.common.collect.Multimap
        public final int size() {
            return this.g0.size();
        }
    }

    public static class UnmodifiableListMultimap<K, V> extends UnmodifiableMultimap<K, V> implements ListMultimap<K, V> {
        private static final long serialVersionUID = 0;

        @Override // com.google.common.collect.Multimaps.UnmodifiableMultimap, com.google.common.collect.ForwardingMultimap, com.google.common.collect.Multimap, com.google.common.collect.ListMultimap
        public final Collection a(Object obj) {
            throw new UnsupportedOperationException();
        }

        @Override // com.google.common.collect.Multimaps.UnmodifiableMultimap, com.google.common.collect.ForwardingMultimap, com.google.common.collect.Multimap, com.google.common.collect.ListMultimap
        public final Collection get(Object obj) {
            throw null;
        }

        @Override // com.google.common.collect.Multimaps.UnmodifiableMultimap, com.google.common.collect.ForwardingMultimap, com.google.common.collect.ForwardingObject
        public final /* bridge */ /* synthetic */ Object w() {
            return null;
        }

        @Override // com.google.common.collect.Multimaps.UnmodifiableMultimap, com.google.common.collect.ForwardingMultimap
        public final /* bridge */ /* synthetic */ Multimap x() {
            return null;
        }

        @Override // com.google.common.collect.Multimaps.UnmodifiableMultimap, com.google.common.collect.ForwardingMultimap, com.google.common.collect.Multimap, com.google.common.collect.ListMultimap
        public final List a(Object obj) {
            throw new UnsupportedOperationException();
        }

        @Override // com.google.common.collect.Multimaps.UnmodifiableMultimap, com.google.common.collect.ForwardingMultimap, com.google.common.collect.Multimap, com.google.common.collect.ListMultimap
        public final List get(Object obj) {
            throw null;
        }
    }

    public static class UnmodifiableMultimap<K, V> extends ForwardingMultimap<K, V> implements Serializable {
        private static final long serialVersionUID = 0;

        @Override // com.google.common.collect.ForwardingMultimap, com.google.common.collect.Multimap, com.google.common.collect.ListMultimap
        public Collection a(Object obj) {
            throw new UnsupportedOperationException();
        }

        @Override // com.google.common.collect.ForwardingMultimap, com.google.common.collect.Multimap
        public final void clear() {
            throw new UnsupportedOperationException();
        }

        @Override // com.google.common.collect.ForwardingMultimap, com.google.common.collect.Multimap
        public Collection d() {
            throw null;
        }

        @Override // com.google.common.collect.ForwardingMultimap, com.google.common.collect.Multimap, com.google.common.collect.ListMultimap
        public Collection get(Object obj) {
            throw null;
        }

        @Override // com.google.common.collect.ForwardingMultimap, com.google.common.collect.Multimap
        public final Multiset h() {
            throw null;
        }

        @Override // com.google.common.collect.ForwardingMultimap, com.google.common.collect.Multimap
        public final Set keySet() {
            throw null;
        }

        @Override // com.google.common.collect.ForwardingMultimap, com.google.common.collect.Multimap
        public final boolean put(Object obj, Object obj2) {
            throw new UnsupportedOperationException();
        }

        @Override // com.google.common.collect.ForwardingMultimap, com.google.common.collect.Multimap
        public final boolean remove(Object obj, Object obj2) {
            throw new UnsupportedOperationException();
        }

        @Override // com.google.common.collect.ForwardingMultimap, com.google.common.collect.Multimap
        public final Map u() {
            throw null;
        }

        @Override // com.google.common.collect.ForwardingMultimap, com.google.common.collect.Multimap
        public final Collection values() {
            throw null;
        }

        @Override // com.google.common.collect.ForwardingMultimap, com.google.common.collect.ForwardingObject
        public Multimap w() {
            return null;
        }
    }

    public static class UnmodifiableSetMultimap<K, V> extends UnmodifiableMultimap<K, V> implements SetMultimap<K, V> {
        private static final long serialVersionUID = 0;

        @Override // com.google.common.collect.Multimaps.UnmodifiableMultimap, com.google.common.collect.ForwardingMultimap, com.google.common.collect.Multimap, com.google.common.collect.ListMultimap
        public /* bridge */ /* synthetic */ Collection a(Object obj) {
            a(obj);
            throw null;
        }

        @Override // com.google.common.collect.Multimaps.UnmodifiableMultimap, com.google.common.collect.ForwardingMultimap, com.google.common.collect.Multimap
        public final Collection d() {
            throw null;
        }

        @Override // com.google.common.collect.Multimaps.UnmodifiableMultimap, com.google.common.collect.ForwardingMultimap, com.google.common.collect.ForwardingObject
        public /* bridge */ /* synthetic */ Object w() {
            return null;
        }

        @Override // com.google.common.collect.Multimaps.UnmodifiableMultimap, com.google.common.collect.ForwardingMultimap
        public /* bridge */ /* synthetic */ Multimap x() {
            return null;
        }

        @Override // com.google.common.collect.Multimaps.UnmodifiableMultimap, com.google.common.collect.ForwardingMultimap, com.google.common.collect.Multimap, com.google.common.collect.ListMultimap
        public Set a(Object obj) {
            throw new UnsupportedOperationException();
        }

        @Override // com.google.common.collect.Multimaps.UnmodifiableMultimap, com.google.common.collect.ForwardingMultimap, com.google.common.collect.Multimap
        public final Set d() {
            throw null;
        }

        @Override // com.google.common.collect.Multimaps.UnmodifiableMultimap, com.google.common.collect.ForwardingMultimap, com.google.common.collect.Multimap, com.google.common.collect.ListMultimap
        public Set get(Object obj) {
            throw null;
        }
    }

    public static class UnmodifiableSortedSetMultimap<K, V> extends UnmodifiableSetMultimap<K, V> implements SortedSetMultimap<K, V> {
        private static final long serialVersionUID = 0;

        @Override // com.google.common.collect.Multimaps.UnmodifiableSetMultimap, com.google.common.collect.Multimaps.UnmodifiableMultimap, com.google.common.collect.ForwardingMultimap, com.google.common.collect.Multimap, com.google.common.collect.ListMultimap
        public final Collection a(Object obj) {
            throw new UnsupportedOperationException();
        }

        @Override // com.google.common.collect.Multimaps.UnmodifiableSetMultimap, com.google.common.collect.Multimaps.UnmodifiableMultimap, com.google.common.collect.ForwardingMultimap, com.google.common.collect.Multimap, com.google.common.collect.ListMultimap
        public final Collection get(Object obj) {
            throw null;
        }

        @Override // com.google.common.collect.Multimaps.UnmodifiableSetMultimap, com.google.common.collect.Multimaps.UnmodifiableMultimap, com.google.common.collect.ForwardingMultimap, com.google.common.collect.ForwardingObject
        public final /* bridge */ /* synthetic */ Object w() {
            return null;
        }

        @Override // com.google.common.collect.Multimaps.UnmodifiableSetMultimap, com.google.common.collect.Multimaps.UnmodifiableMultimap, com.google.common.collect.ForwardingMultimap
        public final /* bridge */ /* synthetic */ Multimap x() {
            return null;
        }

        @Override // com.google.common.collect.Multimaps.UnmodifiableSetMultimap, com.google.common.collect.Multimaps.UnmodifiableMultimap, com.google.common.collect.ForwardingMultimap, com.google.common.collect.Multimap, com.google.common.collect.ListMultimap
        public final Set a(Object obj) {
            throw new UnsupportedOperationException();
        }

        @Override // com.google.common.collect.Multimaps.UnmodifiableSetMultimap, com.google.common.collect.Multimaps.UnmodifiableMultimap, com.google.common.collect.ForwardingMultimap, com.google.common.collect.Multimap, com.google.common.collect.ListMultimap
        public final Set get(Object obj) {
            throw null;
        }

        @Override // com.google.common.collect.Multimaps.UnmodifiableSetMultimap, com.google.common.collect.Multimaps.UnmodifiableMultimap, com.google.common.collect.ForwardingMultimap, com.google.common.collect.Multimap, com.google.common.collect.ListMultimap
        public final SortedSet a(Object obj) {
            throw new UnsupportedOperationException();
        }

        @Override // com.google.common.collect.Multimaps.UnmodifiableSetMultimap, com.google.common.collect.Multimaps.UnmodifiableMultimap, com.google.common.collect.ForwardingMultimap, com.google.common.collect.Multimap, com.google.common.collect.ListMultimap
        public final SortedSet get(Object obj) {
            throw null;
        }
    }

    public static ListMultimap a(ImmutableListMultimap immutableListMultimap, com.google.android.exoplayer2.analytics.f fVar) {
        return new TransformedEntriesListMultimap(immutableListMultimap, new Maps.AnonymousClass9(fVar));
    }
}
