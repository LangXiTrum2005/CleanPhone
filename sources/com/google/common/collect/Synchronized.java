package com.google.common.collect;

import com.google.common.base.Function;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.Collection;
import java.util.Comparator;
import java.util.Deque;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.NavigableMap;
import java.util.NavigableSet;
import java.util.Queue;
import java.util.RandomAccess;
import java.util.Set;
import java.util.SortedMap;
import java.util.SortedSet;

/* JADX INFO: loaded from: classes4.dex */
@ElementTypesAreNonnullByDefault
final class Synchronized {

    public static final class SynchronizedAsMap<K, V> extends SynchronizedMap<K, Collection<V>> {
        private static final long serialVersionUID = 0;
        public transient Set g0;
        public transient Collection h0;

        @Override // com.google.common.collect.Synchronized.SynchronizedMap, java.util.Map
        public final boolean containsValue(Object obj) {
            return values().contains(obj);
        }

        @Override // com.google.common.collect.Synchronized.SynchronizedMap, java.util.Map
        public final Set entrySet() {
            Set set;
            synchronized (this.f19971Y) {
                try {
                    if (this.g0 == null) {
                        this.g0 = new SynchronizedAsMapEntries(((Map) this.X).entrySet(), this.f19971Y);
                    }
                    set = this.g0;
                } catch (Throwable th) {
                    throw th;
                }
            }
            return set;
        }

        @Override // com.google.common.collect.Synchronized.SynchronizedMap, java.util.Map
        public final Object get(Object obj) {
            Collection collectionB;
            synchronized (this.f19971Y) {
                Collection collection = (Collection) super.get(obj);
                collectionB = collection == null ? null : Synchronized.b(this.f19971Y, collection);
            }
            return collectionB;
        }

        @Override // com.google.common.collect.Synchronized.SynchronizedMap, java.util.Map
        public final Collection values() {
            Collection collection;
            synchronized (this.f19971Y) {
                try {
                    if (this.h0 == null) {
                        this.h0 = new SynchronizedAsMapValues(((Map) this.X).values(), this.f19971Y);
                    }
                    collection = this.h0;
                } catch (Throwable th) {
                    throw th;
                }
            }
            return collection;
        }
    }

    public static final class SynchronizedAsMapValues<V> extends SynchronizedCollection<Collection<V>> {
        private static final long serialVersionUID = 0;

        @Override // com.google.common.collect.Synchronized.SynchronizedCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public final Iterator iterator() {
            return new TransformedIterator<Collection<Object>, Collection<Object>>(super.iterator()) { // from class: com.google.common.collect.Synchronized.SynchronizedAsMapValues.1
                @Override // com.google.common.collect.TransformedIterator
                public final Object a(Object obj) {
                    return Synchronized.b(SynchronizedAsMapValues.this.f19971Y, (Collection) obj);
                }
            };
        }
    }

    public static final class SynchronizedBiMap<K, V> extends SynchronizedMap<K, V> implements BiMap<K, V>, Serializable {
        private static final long serialVersionUID = 0;
        public transient Set g0;
        public transient BiMap h0;

        @Override // com.google.common.collect.BiMap
        public final BiMap H() {
            BiMap biMap;
            synchronized (this.f19971Y) {
                try {
                    if (this.h0 == null) {
                        SynchronizedBiMap synchronizedBiMap = new SynchronizedBiMap(((BiMap) ((Map) this.X)).H(), this.f19971Y);
                        synchronizedBiMap.h0 = this;
                        this.h0 = synchronizedBiMap;
                    }
                    biMap = this.h0;
                } catch (Throwable th) {
                    throw th;
                }
            }
            return biMap;
        }

        @Override // com.google.common.collect.Synchronized.SynchronizedMap
        public final Map l() {
            return (BiMap) ((Map) this.X);
        }

        @Override // com.google.common.collect.Synchronized.SynchronizedMap, java.util.Map
        public final Set values() {
            Set set;
            synchronized (this.f19971Y) {
                try {
                    if (this.g0 == null) {
                        this.g0 = new SynchronizedSet(((BiMap) ((Map) this.X)).values(), this.f19971Y);
                    }
                    set = this.g0;
                } catch (Throwable th) {
                    throw th;
                }
            }
            return set;
        }
    }

    public static final class SynchronizedDeque<E> extends SynchronizedQueue<E> implements Deque<E> {
        private static final long serialVersionUID = 0;

        @Override // java.util.Deque
        public final void addFirst(Object obj) {
            synchronized (this.f19971Y) {
                ((Deque) super.l()).addFirst(obj);
            }
        }

        @Override // java.util.Deque
        public final void addLast(Object obj) {
            synchronized (this.f19971Y) {
                ((Deque) super.l()).addLast(obj);
            }
        }

        @Override // java.util.Deque
        public final Iterator descendingIterator() {
            Iterator<E> itDescendingIterator;
            synchronized (this.f19971Y) {
                itDescendingIterator = ((Deque) super.l()).descendingIterator();
            }
            return itDescendingIterator;
        }

        @Override // java.util.Deque
        public final Object getFirst() {
            Object first;
            synchronized (this.f19971Y) {
                first = ((Deque) super.l()).getFirst();
            }
            return first;
        }

        @Override // java.util.Deque
        public final Object getLast() {
            Object last;
            synchronized (this.f19971Y) {
                last = ((Deque) super.l()).getLast();
            }
            return last;
        }

        @Override // com.google.common.collect.Synchronized.SynchronizedQueue, com.google.common.collect.Synchronized.SynchronizedCollection
        public final Collection l() {
            return (Deque) super.l();
        }

        @Override // java.util.Deque
        public final boolean offerFirst(Object obj) {
            boolean zOfferFirst;
            synchronized (this.f19971Y) {
                zOfferFirst = ((Deque) super.l()).offerFirst(obj);
            }
            return zOfferFirst;
        }

        @Override // java.util.Deque
        public final boolean offerLast(Object obj) {
            boolean zOfferLast;
            synchronized (this.f19971Y) {
                zOfferLast = ((Deque) super.l()).offerLast(obj);
            }
            return zOfferLast;
        }

        @Override // java.util.Deque
        public final Object peekFirst() {
            Object objPeekFirst;
            synchronized (this.f19971Y) {
                objPeekFirst = ((Deque) super.l()).peekFirst();
            }
            return objPeekFirst;
        }

        @Override // java.util.Deque
        public final Object peekLast() {
            Object objPeekLast;
            synchronized (this.f19971Y) {
                objPeekLast = ((Deque) super.l()).peekLast();
            }
            return objPeekLast;
        }

        @Override // java.util.Deque
        public final Object pollFirst() {
            Object objPollFirst;
            synchronized (this.f19971Y) {
                objPollFirst = ((Deque) super.l()).pollFirst();
            }
            return objPollFirst;
        }

        @Override // java.util.Deque
        public final Object pollLast() {
            Object objPollLast;
            synchronized (this.f19971Y) {
                objPollLast = ((Deque) super.l()).pollLast();
            }
            return objPollLast;
        }

        @Override // java.util.Deque
        public final Object pop() {
            Object objPop;
            synchronized (this.f19971Y) {
                objPop = ((Deque) super.l()).pop();
            }
            return objPop;
        }

        @Override // java.util.Deque
        public final void push(Object obj) {
            synchronized (this.f19971Y) {
                ((Deque) super.l()).push(obj);
            }
        }

        @Override // java.util.Deque
        public final Object removeFirst() {
            Object objRemoveFirst;
            synchronized (this.f19971Y) {
                objRemoveFirst = ((Deque) super.l()).removeFirst();
            }
            return objRemoveFirst;
        }

        @Override // java.util.Deque
        public final boolean removeFirstOccurrence(Object obj) {
            boolean zRemoveFirstOccurrence;
            synchronized (this.f19971Y) {
                zRemoveFirstOccurrence = ((Deque) super.l()).removeFirstOccurrence(obj);
            }
            return zRemoveFirstOccurrence;
        }

        @Override // java.util.Deque
        public final Object removeLast() {
            Object objRemoveLast;
            synchronized (this.f19971Y) {
                objRemoveLast = ((Deque) super.l()).removeLast();
            }
            return objRemoveLast;
        }

        @Override // java.util.Deque
        public final boolean removeLastOccurrence(Object obj) {
            boolean zRemoveLastOccurrence;
            synchronized (this.f19971Y) {
                zRemoveLastOccurrence = ((Deque) super.l()).removeLastOccurrence(obj);
            }
            return zRemoveLastOccurrence;
        }

        @Override // com.google.common.collect.Synchronized.SynchronizedQueue
        /* JADX INFO: renamed from: w */
        public final Queue l() {
            return (Deque) super.l();
        }
    }

    public static final class SynchronizedEntry<K, V> extends SynchronizedObject implements Map.Entry<K, V> {
        private static final long serialVersionUID = 0;

        @Override // java.util.Map.Entry
        public final boolean equals(Object obj) {
            boolean zEquals;
            synchronized (this.f19971Y) {
                zEquals = ((Map.Entry) this.X).equals(obj);
            }
            return zEquals;
        }

        @Override // java.util.Map.Entry
        public final Object getKey() {
            Object key;
            synchronized (this.f19971Y) {
                key = ((Map.Entry) this.X).getKey();
            }
            return key;
        }

        @Override // java.util.Map.Entry
        public final Object getValue() {
            Object value;
            synchronized (this.f19971Y) {
                value = ((Map.Entry) this.X).getValue();
            }
            return value;
        }

        @Override // java.util.Map.Entry
        public final int hashCode() {
            int iHashCode;
            synchronized (this.f19971Y) {
                iHashCode = ((Map.Entry) this.X).hashCode();
            }
            return iHashCode;
        }

        @Override // java.util.Map.Entry
        public final Object setValue(Object obj) {
            Object value;
            synchronized (this.f19971Y) {
                value = ((Map.Entry) this.X).setValue(obj);
            }
            return value;
        }
    }

    public static class SynchronizedList<E> extends SynchronizedCollection<E> implements List<E> {
        private static final long serialVersionUID = 0;

        @Override // java.util.List
        public final void add(int i2, Object obj) {
            synchronized (this.f19971Y) {
                l().add(i2, obj);
            }
        }

        @Override // java.util.List
        public final boolean addAll(int i2, Collection collection) {
            boolean zAddAll;
            synchronized (this.f19971Y) {
                zAddAll = l().addAll(i2, collection);
            }
            return zAddAll;
        }

        @Override // java.util.Collection, java.util.List
        public final boolean equals(Object obj) {
            boolean zEquals;
            if (obj == this) {
                return true;
            }
            synchronized (this.f19971Y) {
                zEquals = l().equals(obj);
            }
            return zEquals;
        }

        @Override // java.util.List
        public final Object get(int i2) {
            Object obj;
            synchronized (this.f19971Y) {
                obj = l().get(i2);
            }
            return obj;
        }

        @Override // java.util.Collection, java.util.List
        public final int hashCode() {
            int iHashCode;
            synchronized (this.f19971Y) {
                iHashCode = l().hashCode();
            }
            return iHashCode;
        }

        @Override // java.util.List
        public final int indexOf(Object obj) {
            int iIndexOf;
            synchronized (this.f19971Y) {
                iIndexOf = l().indexOf(obj);
            }
            return iIndexOf;
        }

        @Override // java.util.List
        public final int lastIndexOf(Object obj) {
            int iLastIndexOf;
            synchronized (this.f19971Y) {
                iLastIndexOf = l().lastIndexOf(obj);
            }
            return iLastIndexOf;
        }

        @Override // java.util.List
        public final ListIterator listIterator() {
            return l().listIterator();
        }

        @Override // java.util.List
        public final Object remove(int i2) {
            Object objRemove;
            synchronized (this.f19971Y) {
                objRemove = l().remove(i2);
            }
            return objRemove;
        }

        @Override // java.util.List
        public final Object set(int i2, Object obj) {
            Object obj2;
            synchronized (this.f19971Y) {
                obj2 = l().set(i2, obj);
            }
            return obj2;
        }

        @Override // java.util.List
        public final List subList(int i2, int i3) {
            List listD;
            synchronized (this.f19971Y) {
                listD = Synchronized.d(l().subList(i2, i3), this.f19971Y);
            }
            return listD;
        }

        @Override // com.google.common.collect.Synchronized.SynchronizedCollection
        /* JADX INFO: renamed from: w, reason: merged with bridge method [inline-methods] */
        public final List l() {
            return (List) ((Collection) this.X);
        }

        @Override // java.util.List
        public final ListIterator listIterator(int i2) {
            return l().listIterator(i2);
        }
    }

    public static final class SynchronizedListMultimap<K, V> extends SynchronizedMultimap<K, V> implements ListMultimap<K, V> {
        private static final long serialVersionUID = 0;

        @Override // com.google.common.collect.Synchronized.SynchronizedMultimap
        public final Multimap l() {
            return (ListMultimap) ((Multimap) this.X);
        }

        @Override // com.google.common.collect.Synchronized.SynchronizedMultimap, com.google.common.collect.Multimap, com.google.common.collect.ListMultimap
        public final List a(Object obj) {
            List listA;
            synchronized (this.f19971Y) {
                listA = ((ListMultimap) ((Multimap) this.X)).a(obj);
            }
            return listA;
        }

        @Override // com.google.common.collect.Synchronized.SynchronizedMultimap, com.google.common.collect.Multimap, com.google.common.collect.ListMultimap
        public final List get(Object obj) {
            List listD;
            synchronized (this.f19971Y) {
                listD = Synchronized.d(((ListMultimap) ((Multimap) this.X)).get(obj), this.f19971Y);
            }
            return listD;
        }
    }

    public static class SynchronizedMap<K, V> extends SynchronizedObject implements Map<K, V> {
        private static final long serialVersionUID = 0;
        public transient Set Z;
        public transient Collection e0;
        public transient Set f0;

        @Override // java.util.Map
        public final void clear() {
            synchronized (this.f19971Y) {
                l().clear();
            }
        }

        @Override // java.util.Map
        public final boolean containsKey(Object obj) {
            boolean zContainsKey;
            synchronized (this.f19971Y) {
                zContainsKey = l().containsKey(obj);
            }
            return zContainsKey;
        }

        public boolean containsValue(Object obj) {
            boolean zContainsValue;
            synchronized (this.f19971Y) {
                zContainsValue = l().containsValue(obj);
            }
            return zContainsValue;
        }

        public Set entrySet() {
            Set set;
            synchronized (this.f19971Y) {
                try {
                    if (this.f0 == null) {
                        this.f0 = new SynchronizedSet(l().entrySet(), this.f19971Y);
                    }
                    set = this.f0;
                } catch (Throwable th) {
                    throw th;
                }
            }
            return set;
        }

        @Override // java.util.Map
        public final boolean equals(Object obj) {
            boolean zEquals;
            if (obj == this) {
                return true;
            }
            synchronized (this.f19971Y) {
                zEquals = l().equals(obj);
            }
            return zEquals;
        }

        public Object get(Object obj) {
            Object obj2;
            synchronized (this.f19971Y) {
                obj2 = l().get(obj);
            }
            return obj2;
        }

        @Override // java.util.Map
        public final int hashCode() {
            int iHashCode;
            synchronized (this.f19971Y) {
                iHashCode = l().hashCode();
            }
            return iHashCode;
        }

        @Override // java.util.Map
        public final boolean isEmpty() {
            boolean zIsEmpty;
            synchronized (this.f19971Y) {
                zIsEmpty = l().isEmpty();
            }
            return zIsEmpty;
        }

        @Override // java.util.Map
        public Set keySet() {
            Set set;
            synchronized (this.f19971Y) {
                try {
                    if (this.Z == null) {
                        this.Z = new SynchronizedSet(l().keySet(), this.f19971Y);
                    }
                    set = this.Z;
                } catch (Throwable th) {
                    throw th;
                }
            }
            return set;
        }

        public Map l() {
            return (Map) this.X;
        }

        @Override // java.util.Map
        public final Object put(Object obj, Object obj2) {
            Object objPut;
            synchronized (this.f19971Y) {
                objPut = l().put(obj, obj2);
            }
            return objPut;
        }

        @Override // java.util.Map
        public final void putAll(Map map) {
            synchronized (this.f19971Y) {
                l().putAll(map);
            }
        }

        @Override // java.util.Map
        public final Object remove(Object obj) {
            Object objRemove;
            synchronized (this.f19971Y) {
                objRemove = l().remove(obj);
            }
            return objRemove;
        }

        @Override // java.util.Map
        public final int size() {
            int size;
            synchronized (this.f19971Y) {
                size = l().size();
            }
            return size;
        }

        public Collection values() {
            Collection collection;
            synchronized (this.f19971Y) {
                try {
                    if (this.e0 == null) {
                        this.e0 = new SynchronizedCollection(l().values(), this.f19971Y);
                    }
                    collection = this.e0;
                } catch (Throwable th) {
                    throw th;
                }
            }
            return collection;
        }
    }

    public static class SynchronizedMultimap<K, V> extends SynchronizedObject implements Multimap<K, V> {
        private static final long serialVersionUID = 0;
        public transient Collection Z;
        public transient Object e0;

        public Collection a(Object obj) {
            Collection collectionA;
            synchronized (this.f19971Y) {
                collectionA = l().a(obj);
            }
            return collectionA;
        }

        @Override // com.google.common.collect.Multimap
        public final void clear() {
            synchronized (this.f19971Y) {
                l().clear();
            }
        }

        @Override // com.google.common.collect.Multimap
        public final boolean containsKey(Object obj) {
            boolean zContainsKey;
            synchronized (this.f19971Y) {
                zContainsKey = l().containsKey(obj);
            }
            return zContainsKey;
        }

        @Override // com.google.common.collect.Multimap
        public Collection d() {
            synchronized (this.f19971Y) {
            }
            return null;
        }

        @Override // com.google.common.collect.Multimap
        public final boolean equals(Object obj) {
            boolean zEquals;
            if (obj == this) {
                return true;
            }
            synchronized (this.f19971Y) {
                zEquals = l().equals(obj);
            }
            return zEquals;
        }

        public Collection get(Object obj) {
            Collection collectionB;
            synchronized (this.f19971Y) {
                collectionB = Synchronized.b(this.f19971Y, l().get(obj));
            }
            return collectionB;
        }

        /* JADX WARN: Type inference failed for: r1v2, types: [com.google.common.collect.Multiset, java.lang.Object] */
        @Override // com.google.common.collect.Multimap
        public final Multiset h() {
            ?? r1;
            synchronized (this.f19971Y) {
                try {
                    if (this.e0 == null) {
                        Multiset multisetH = l().h();
                        Object obj = this.f19971Y;
                        if (!(multisetH instanceof SynchronizedMultiset) && !(multisetH instanceof ImmutableMultiset)) {
                            multisetH = new SynchronizedMultiset(multisetH, obj);
                        }
                        this.e0 = multisetH;
                    }
                    r1 = this.e0;
                } catch (Throwable th) {
                    throw th;
                }
            }
            return r1;
        }

        @Override // com.google.common.collect.Multimap
        public final int hashCode() {
            int iHashCode;
            synchronized (this.f19971Y) {
                iHashCode = l().hashCode();
            }
            return iHashCode;
        }

        @Override // com.google.common.collect.Multimap
        public final boolean isEmpty() {
            boolean zIsEmpty;
            synchronized (this.f19971Y) {
                zIsEmpty = l().isEmpty();
            }
            return zIsEmpty;
        }

        @Override // com.google.common.collect.Multimap
        public final Set keySet() {
            synchronized (this.f19971Y) {
            }
            return null;
        }

        public Multimap l() {
            return (Multimap) this.X;
        }

        @Override // com.google.common.collect.Multimap
        public final boolean put(Object obj, Object obj2) {
            boolean zPut;
            synchronized (this.f19971Y) {
                zPut = l().put(obj, obj2);
            }
            return zPut;
        }

        @Override // com.google.common.collect.Multimap
        public final boolean remove(Object obj, Object obj2) {
            boolean zRemove;
            synchronized (this.f19971Y) {
                zRemove = l().remove(obj, obj2);
            }
            return zRemove;
        }

        @Override // com.google.common.collect.Multimap
        public final int size() {
            int size;
            synchronized (this.f19971Y) {
                size = l().size();
            }
            return size;
        }

        @Override // com.google.common.collect.Multimap
        public final Map u() {
            synchronized (this.f19971Y) {
            }
            return null;
        }

        @Override // com.google.common.collect.Multimap
        public final boolean v(Object obj, Object obj2) {
            boolean zV;
            synchronized (this.f19971Y) {
                zV = l().v(obj, obj2);
            }
            return zV;
        }

        @Override // com.google.common.collect.Multimap
        public final Collection values() {
            Collection collection;
            synchronized (this.f19971Y) {
                try {
                    if (this.Z == null) {
                        this.Z = new SynchronizedCollection(l().values(), this.f19971Y);
                    }
                    collection = this.Z;
                } catch (Throwable th) {
                    throw th;
                }
            }
            return collection;
        }
    }

    public static final class SynchronizedMultiset<E> extends SynchronizedCollection<E> implements Multiset<E> {
        private static final long serialVersionUID = 0;
        public transient Set Z;
        public transient Set e0;

        @Override // com.google.common.collect.Multiset
        public final int Q0(Object obj) {
            int iQ0;
            synchronized (this.f19971Y) {
                iQ0 = l().Q0(obj);
            }
            return iQ0;
        }

        @Override // com.google.common.collect.Multiset
        public final int add(int i2, Object obj) {
            int iAdd;
            synchronized (this.f19971Y) {
                iAdd = l().add(i2, obj);
            }
            return iAdd;
        }

        @Override // com.google.common.collect.Multiset
        public final Set entrySet() {
            Set set;
            synchronized (this.f19971Y) {
                try {
                    if (this.e0 == null) {
                        this.e0 = Synchronized.a(l().entrySet(), this.f19971Y);
                    }
                    set = this.e0;
                } catch (Throwable th) {
                    throw th;
                }
            }
            return set;
        }

        @Override // java.util.Collection, com.google.common.collect.Multiset
        public final boolean equals(Object obj) {
            boolean zEquals;
            if (obj == this) {
                return true;
            }
            synchronized (this.f19971Y) {
                zEquals = l().equals(obj);
            }
            return zEquals;
        }

        @Override // java.util.Collection, com.google.common.collect.Multiset
        public final int hashCode() {
            int iHashCode;
            synchronized (this.f19971Y) {
                iHashCode = l().hashCode();
            }
            return iHashCode;
        }

        @Override // com.google.common.collect.Multiset
        public final Set k() {
            Set set;
            synchronized (this.f19971Y) {
                try {
                    if (this.Z == null) {
                        this.Z = Synchronized.a(l().k(), this.f19971Y);
                    }
                    set = this.Z;
                } catch (Throwable th) {
                    throw th;
                }
            }
            return set;
        }

        @Override // com.google.common.collect.Multiset
        public final int m(int i2, Object obj) {
            int iM;
            synchronized (this.f19971Y) {
                iM = l().m(i2, obj);
            }
            return iM;
        }

        @Override // com.google.common.collect.Multiset
        public final boolean r(int i2, Object obj) {
            boolean zR;
            synchronized (this.f19971Y) {
                zR = l().r(i2, obj);
            }
            return zR;
        }

        @Override // com.google.common.collect.Synchronized.SynchronizedCollection
        /* JADX INFO: renamed from: w, reason: merged with bridge method [inline-methods] */
        public final Multiset l() {
            return (Multiset) ((Collection) this.X);
        }

        @Override // com.google.common.collect.Multiset
        public final int w0(Object obj) {
            int iW0;
            synchronized (this.f19971Y) {
                iW0 = l().w0(obj);
            }
            return iW0;
        }
    }

    public static class SynchronizedObject implements Serializable {
        private static final long serialVersionUID = 0;
        public final Object X;

        /* JADX INFO: renamed from: Y, reason: collision with root package name */
        public final Object f19971Y;

        public SynchronizedObject(Object obj, Object obj2) {
            obj.getClass();
            this.X = obj;
            this.f19971Y = obj2 == null ? this : obj2;
        }

        private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
            synchronized (this.f19971Y) {
                objectOutputStream.defaultWriteObject();
            }
        }

        public final String toString() {
            String string;
            synchronized (this.f19971Y) {
                string = this.X.toString();
            }
            return string;
        }
    }

    public static class SynchronizedQueue<E> extends SynchronizedCollection<E> implements Queue<E> {
        private static final long serialVersionUID = 0;

        @Override // java.util.Queue
        public final Object element() {
            Object objElement;
            synchronized (this.f19971Y) {
                objElement = l().element();
            }
            return objElement;
        }

        @Override // java.util.Queue
        public final boolean offer(Object obj) {
            boolean zOffer;
            synchronized (this.f19971Y) {
                zOffer = l().offer(obj);
            }
            return zOffer;
        }

        @Override // java.util.Queue
        public final Object peek() {
            Object objPeek;
            synchronized (this.f19971Y) {
                objPeek = l().peek();
            }
            return objPeek;
        }

        @Override // java.util.Queue
        public final Object poll() {
            Object objPoll;
            synchronized (this.f19971Y) {
                objPoll = l().poll();
            }
            return objPoll;
        }

        @Override // java.util.Queue
        public final Object remove() {
            Object objRemove;
            synchronized (this.f19971Y) {
                objRemove = l().remove();
            }
            return objRemove;
        }

        @Override // com.google.common.collect.Synchronized.SynchronizedCollection
        /* JADX INFO: renamed from: w, reason: merged with bridge method [inline-methods] */
        public Queue l() {
            return (Queue) ((Collection) this.X);
        }
    }

    public static final class SynchronizedRandomAccessList<E> extends SynchronizedList<E> implements RandomAccess {
        private static final long serialVersionUID = 0;
    }

    public static class SynchronizedSet<E> extends SynchronizedCollection<E> implements Set<E> {
        private static final long serialVersionUID = 0;

        public boolean equals(Object obj) {
            boolean zEquals;
            if (obj == this) {
                return true;
            }
            synchronized (this.f19971Y) {
                zEquals = l().equals(obj);
            }
            return zEquals;
        }

        @Override // java.util.Collection, java.util.Set
        public final int hashCode() {
            int iHashCode;
            synchronized (this.f19971Y) {
                iHashCode = l().hashCode();
            }
            return iHashCode;
        }

        @Override // com.google.common.collect.Synchronized.SynchronizedCollection
        /* JADX INFO: renamed from: w, reason: merged with bridge method [inline-methods] */
        public Set l() {
            return (Set) ((Collection) this.X);
        }
    }

    public static class SynchronizedSetMultimap<K, V> extends SynchronizedMultimap<K, V> implements SetMultimap<K, V> {
        private static final long serialVersionUID = 0;

        @Override // com.google.common.collect.Synchronized.SynchronizedMultimap
        /* JADX INFO: renamed from: w, reason: merged with bridge method [inline-methods] */
        public SetMultimap l() {
            return (SetMultimap) ((Multimap) this.X);
        }

        @Override // com.google.common.collect.Synchronized.SynchronizedMultimap, com.google.common.collect.Multimap, com.google.common.collect.ListMultimap
        public Set a(Object obj) {
            Set setA;
            synchronized (this.f19971Y) {
                setA = l().a(obj);
            }
            return setA;
        }

        @Override // com.google.common.collect.Synchronized.SynchronizedMultimap, com.google.common.collect.Multimap
        public final Set d() {
            synchronized (this.f19971Y) {
            }
            return null;
        }

        @Override // com.google.common.collect.Synchronized.SynchronizedMultimap, com.google.common.collect.Multimap, com.google.common.collect.ListMultimap
        public Set get(Object obj) {
            SynchronizedSet synchronizedSet;
            synchronized (this.f19971Y) {
                synchronizedSet = new SynchronizedSet(l().get(obj), this.f19971Y);
            }
            return synchronizedSet;
        }
    }

    public static class SynchronizedSortedMap<K, V> extends SynchronizedMap<K, V> implements SortedMap<K, V> {
        private static final long serialVersionUID = 0;

        @Override // java.util.SortedMap
        public final Comparator comparator() {
            Comparator<? super K> comparator;
            synchronized (this.f19971Y) {
                comparator = l().comparator();
            }
            return comparator;
        }

        @Override // java.util.SortedMap
        public final Object firstKey() {
            Object objFirstKey;
            synchronized (this.f19971Y) {
                objFirstKey = l().firstKey();
            }
            return objFirstKey;
        }

        public SortedMap headMap(Object obj) {
            SynchronizedSortedMap synchronizedSortedMap;
            synchronized (this.f19971Y) {
                synchronizedSortedMap = new SynchronizedSortedMap(l().headMap(obj), this.f19971Y);
            }
            return synchronizedSortedMap;
        }

        @Override // java.util.SortedMap
        public final Object lastKey() {
            Object objLastKey;
            synchronized (this.f19971Y) {
                objLastKey = l().lastKey();
            }
            return objLastKey;
        }

        public SortedMap subMap(Object obj, Object obj2) {
            SynchronizedSortedMap synchronizedSortedMap;
            synchronized (this.f19971Y) {
                synchronizedSortedMap = new SynchronizedSortedMap(l().subMap(obj, obj2), this.f19971Y);
            }
            return synchronizedSortedMap;
        }

        public SortedMap tailMap(Object obj) {
            SynchronizedSortedMap synchronizedSortedMap;
            synchronized (this.f19971Y) {
                synchronizedSortedMap = new SynchronizedSortedMap(l().tailMap(obj), this.f19971Y);
            }
            return synchronizedSortedMap;
        }

        @Override // com.google.common.collect.Synchronized.SynchronizedMap
        /* JADX INFO: renamed from: w, reason: merged with bridge method [inline-methods] */
        public SortedMap l() {
            return (SortedMap) ((Map) this.X);
        }
    }

    public static class SynchronizedSortedSet<E> extends SynchronizedSet<E> implements SortedSet<E> {
        private static final long serialVersionUID = 0;

        @Override // java.util.SortedSet
        public final Comparator comparator() {
            Comparator<? super E> comparator;
            synchronized (this.f19971Y) {
                comparator = l().comparator();
            }
            return comparator;
        }

        @Override // java.util.SortedSet
        public final Object first() {
            Object objFirst;
            synchronized (this.f19971Y) {
                objFirst = l().first();
            }
            return objFirst;
        }

        public SortedSet headSet(Object obj) {
            SynchronizedSortedSet synchronizedSortedSet;
            synchronized (this.f19971Y) {
                synchronizedSortedSet = new SynchronizedSortedSet(l().headSet(obj), this.f19971Y);
            }
            return synchronizedSortedSet;
        }

        @Override // java.util.SortedSet
        public final Object last() {
            Object objLast;
            synchronized (this.f19971Y) {
                objLast = l().last();
            }
            return objLast;
        }

        public SortedSet subSet(Object obj, Object obj2) {
            SynchronizedSortedSet synchronizedSortedSet;
            synchronized (this.f19971Y) {
                synchronizedSortedSet = new SynchronizedSortedSet(l().subSet(obj, obj2), this.f19971Y);
            }
            return synchronizedSortedSet;
        }

        public SortedSet tailSet(Object obj) {
            SynchronizedSortedSet synchronizedSortedSet;
            synchronized (this.f19971Y) {
                synchronizedSortedSet = new SynchronizedSortedSet(l().tailSet(obj), this.f19971Y);
            }
            return synchronizedSortedSet;
        }

        @Override // com.google.common.collect.Synchronized.SynchronizedSet
        /* JADX INFO: renamed from: x, reason: merged with bridge method [inline-methods] */
        public SortedSet l() {
            return (SortedSet) super.l();
        }
    }

    public static final class SynchronizedTable<R, C, V> extends SynchronizedObject implements Table<R, C, V> {

        /* JADX INFO: renamed from: com.google.common.collect.Synchronized$SynchronizedTable$2, reason: invalid class name */
        class AnonymousClass2 implements Function<Map<Object, Object>, Map<Object, Object>> {
            @Override // com.google.common.base.Function, androidx.arch.core.util.Function, com.google.android.datatransport.Transformer
            public final Object apply(Object obj) {
                throw null;
            }
        }

        @Override // com.google.common.collect.Table
        public final boolean equals(Object obj) {
            boolean zEquals;
            if (this == obj) {
                return true;
            }
            synchronized (this.f19971Y) {
                zEquals = ((Table) this.X).equals(obj);
            }
            return zEquals;
        }

        @Override // com.google.common.collect.Table
        public final Map g() {
            SynchronizedMap synchronizedMap;
            synchronized (this.f19971Y) {
                synchronizedMap = new SynchronizedMap(new Maps.TransformedEntriesMap(((Table) this.X).g(), new Maps.AnonymousClass9(new Function<Map<Object, Object>, Map<Object, Object>>() { // from class: com.google.common.collect.Synchronized.SynchronizedTable.1
                    @Override // com.google.common.base.Function, androidx.arch.core.util.Function, com.google.android.datatransport.Transformer
                    public final Object apply(Object obj) {
                        return new SynchronizedMap((Map) obj, SynchronizedTable.this.f19971Y);
                    }
                })), this.f19971Y);
            }
            return synchronizedMap;
        }

        @Override // com.google.common.collect.Table
        public final int hashCode() {
            int iHashCode;
            synchronized (this.f19971Y) {
                iHashCode = ((Table) this.X).hashCode();
            }
            return iHashCode;
        }

        @Override // com.google.common.collect.Table
        public final Set o() {
            SynchronizedSet synchronizedSet;
            synchronized (this.f19971Y) {
                synchronizedSet = new SynchronizedSet(((Table) this.X).o(), this.f19971Y);
            }
            return synchronizedSet;
        }

        @Override // com.google.common.collect.Table
        public final int size() {
            int size;
            synchronized (this.f19971Y) {
                size = ((Table) this.X).size();
            }
            return size;
        }
    }

    public static Set a(Set set, Object obj) {
        return set instanceof SortedSet ? new SynchronizedSortedSet((SortedSet) set, obj) : new SynchronizedSet(set, obj);
    }

    public static Collection b(Object obj, Collection collection) {
        if (collection instanceof SortedSet) {
            return new SynchronizedSortedSet((SortedSet) collection, obj);
        }
        if (collection instanceof Set) {
            return new SynchronizedSet((Set) collection, obj);
        }
        return collection instanceof List ? d((List) collection, obj) : new SynchronizedCollection(collection, obj);
    }

    public static Map.Entry c(Map.Entry entry, Object obj) {
        if (entry == null) {
            return null;
        }
        return new SynchronizedEntry(entry, obj);
    }

    public static List d(List list, Object obj) {
        return list instanceof RandomAccess ? new SynchronizedRandomAccessList(list, obj) : new SynchronizedList(list, obj);
    }

    public static final class SynchronizedSortedSetMultimap<K, V> extends SynchronizedSetMultimap<K, V> implements SortedSetMultimap<K, V> {
        private static final long serialVersionUID = 0;

        @Override // com.google.common.collect.Synchronized.SynchronizedSetMultimap, com.google.common.collect.Synchronized.SynchronizedMultimap
        public final Multimap l() {
            return (SortedSetMultimap) super.l();
        }

        @Override // com.google.common.collect.Synchronized.SynchronizedSetMultimap
        /* JADX INFO: renamed from: w */
        public final SetMultimap l() {
            return (SortedSetMultimap) super.l();
        }

        @Override // com.google.common.collect.Synchronized.SynchronizedSetMultimap, com.google.common.collect.Synchronized.SynchronizedMultimap, com.google.common.collect.Multimap, com.google.common.collect.ListMultimap
        public final SortedSet a(Object obj) {
            SortedSet sortedSetA;
            synchronized (this.f19971Y) {
                sortedSetA = ((SortedSetMultimap) super.l()).a(obj);
            }
            return sortedSetA;
        }

        @Override // com.google.common.collect.Synchronized.SynchronizedSetMultimap, com.google.common.collect.Synchronized.SynchronizedMultimap, com.google.common.collect.Multimap, com.google.common.collect.ListMultimap
        public final SortedSet get(Object obj) {
            SynchronizedSortedSet synchronizedSortedSet;
            synchronized (this.f19971Y) {
                synchronizedSortedSet = new SynchronizedSortedSet(((SortedSetMultimap) super.l()).get(obj), this.f19971Y);
            }
            return synchronizedSortedSet;
        }
    }

    public static class SynchronizedCollection<E> extends SynchronizedObject implements Collection<E> {
        private static final long serialVersionUID = 0;

        @Override // java.util.Collection
        public final boolean add(Object obj) {
            boolean zAdd;
            synchronized (this.f19971Y) {
                zAdd = l().add(obj);
            }
            return zAdd;
        }

        @Override // java.util.Collection
        public final boolean addAll(Collection collection) {
            boolean zAddAll;
            synchronized (this.f19971Y) {
                zAddAll = l().addAll(collection);
            }
            return zAddAll;
        }

        @Override // java.util.Collection
        public final void clear() {
            synchronized (this.f19971Y) {
                l().clear();
            }
        }

        public boolean contains(Object obj) {
            boolean zContains;
            synchronized (this.f19971Y) {
                zContains = l().contains(obj);
            }
            return zContains;
        }

        public boolean containsAll(Collection collection) {
            boolean zContainsAll;
            synchronized (this.f19971Y) {
                zContainsAll = l().containsAll(collection);
            }
            return zContainsAll;
        }

        @Override // java.util.Collection
        public final boolean isEmpty() {
            boolean zIsEmpty;
            synchronized (this.f19971Y) {
                zIsEmpty = l().isEmpty();
            }
            return zIsEmpty;
        }

        public Iterator iterator() {
            return l().iterator();
        }

        public Collection l() {
            return (Collection) this.X;
        }

        public boolean remove(Object obj) {
            boolean zRemove;
            synchronized (this.f19971Y) {
                zRemove = l().remove(obj);
            }
            return zRemove;
        }

        public boolean removeAll(Collection collection) {
            boolean zRemoveAll;
            synchronized (this.f19971Y) {
                zRemoveAll = l().removeAll(collection);
            }
            return zRemoveAll;
        }

        public boolean retainAll(Collection collection) {
            boolean zRetainAll;
            synchronized (this.f19971Y) {
                zRetainAll = l().retainAll(collection);
            }
            return zRetainAll;
        }

        @Override // java.util.Collection
        public final int size() {
            int size;
            synchronized (this.f19971Y) {
                size = l().size();
            }
            return size;
        }

        public Object[] toArray() {
            Object[] array;
            synchronized (this.f19971Y) {
                array = l().toArray();
            }
            return array;
        }

        public Object[] toArray(Object[] objArr) {
            Object[] array;
            synchronized (this.f19971Y) {
                array = l().toArray(objArr);
            }
            return array;
        }
    }

    public static final class SynchronizedAsMapEntries<K, V> extends SynchronizedSet<Map.Entry<K, Collection<V>>> {
        private static final long serialVersionUID = 0;

        @Override // com.google.common.collect.Synchronized.SynchronizedCollection, java.util.Collection, java.util.Set
        public final boolean contains(Object obj) {
            boolean zContains;
            synchronized (this.f19971Y) {
                Set setL = l();
                if (obj instanceof Map.Entry) {
                    Map.Entry entry = (Map.Entry) obj;
                    entry.getClass();
                    zContains = setL.contains(new Maps.AnonymousClass7(entry));
                } else {
                    zContains = false;
                }
            }
            return zContains;
        }

        @Override // com.google.common.collect.Synchronized.SynchronizedCollection, java.util.Collection, java.util.Set
        public final boolean containsAll(Collection collection) {
            boolean zA;
            synchronized (this.f19971Y) {
                zA = Collections2.a(l(), collection);
            }
            return zA;
        }

        @Override // com.google.common.collect.Synchronized.SynchronizedSet, java.util.Collection, java.util.Set
        public final boolean equals(Object obj) {
            boolean zB;
            if (obj == this) {
                return true;
            }
            synchronized (this.f19971Y) {
                zB = Sets.b(l(), obj);
            }
            return zB;
        }

        @Override // com.google.common.collect.Synchronized.SynchronizedCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public final Iterator iterator() {
            return new TransformedIterator<Map.Entry<Object, Collection<Object>>, Map.Entry<Object, Collection<Object>>>(super.iterator()) { // from class: com.google.common.collect.Synchronized.SynchronizedAsMapEntries.1
                @Override // com.google.common.collect.TransformedIterator
                public final Object a(Object obj) {
                    final Map.Entry entry = (Map.Entry) obj;
                    return new ForwardingMapEntry<Object, Collection<Object>>() { // from class: com.google.common.collect.Synchronized.SynchronizedAsMapEntries.1.1
                        @Override // com.google.common.collect.ForwardingMapEntry, java.util.Map.Entry
                        public final Object getValue() {
                            return Synchronized.b(SynchronizedAsMapEntries.this.f19971Y, (Collection) entry.getValue());
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

        @Override // com.google.common.collect.Synchronized.SynchronizedCollection, java.util.Collection, java.util.Set
        public final boolean remove(Object obj) {
            boolean zRemove;
            synchronized (this.f19971Y) {
                Set setL = l();
                if (obj instanceof Map.Entry) {
                    Map.Entry entry = (Map.Entry) obj;
                    entry.getClass();
                    zRemove = setL.remove(new Maps.AnonymousClass7(entry));
                } else {
                    zRemove = false;
                }
            }
            return zRemove;
        }

        @Override // com.google.common.collect.Synchronized.SynchronizedCollection, java.util.Collection, java.util.Set
        public final boolean removeAll(Collection collection) {
            boolean zK;
            synchronized (this.f19971Y) {
                zK = Iterators.k(collection, l().iterator());
            }
            return zK;
        }

        @Override // com.google.common.collect.Synchronized.SynchronizedCollection, java.util.Collection, java.util.Set
        public final boolean retainAll(Collection collection) {
            boolean z2;
            synchronized (this.f19971Y) {
                Iterator it = l().iterator();
                collection.getClass();
                z2 = false;
                while (it.hasNext()) {
                    if (!collection.contains(it.next())) {
                        it.remove();
                        z2 = true;
                    }
                }
            }
            return z2;
        }

        @Override // com.google.common.collect.Synchronized.SynchronizedCollection, java.util.Collection, java.util.Set
        public final Object[] toArray() {
            Object[] objArr;
            synchronized (this.f19971Y) {
                Set setL = l();
                objArr = new Object[setL.size()];
                ObjectArrays.b(setL, objArr);
            }
            return objArr;
        }

        @Override // com.google.common.collect.Synchronized.SynchronizedCollection, java.util.Collection, java.util.Set
        public final Object[] toArray(Object[] objArr) {
            Object[] objArrC;
            synchronized (this.f19971Y) {
                objArrC = ObjectArrays.c(l(), objArr);
            }
            return objArrC;
        }
    }

    public static final class SynchronizedNavigableMap<K, V> extends SynchronizedSortedMap<K, V> implements NavigableMap<K, V> {
        private static final long serialVersionUID = 0;
        public transient NavigableSet g0;
        public transient NavigableMap h0;
        public transient NavigableSet i0;

        @Override // java.util.NavigableMap
        public final Map.Entry ceilingEntry(Object obj) {
            Map.Entry entryC;
            synchronized (this.f19971Y) {
                entryC = Synchronized.c(((NavigableMap) super.l()).ceilingEntry(obj), this.f19971Y);
            }
            return entryC;
        }

        @Override // java.util.NavigableMap
        public final Object ceilingKey(Object obj) {
            Object objCeilingKey;
            synchronized (this.f19971Y) {
                objCeilingKey = ((NavigableMap) super.l()).ceilingKey(obj);
            }
            return objCeilingKey;
        }

        @Override // java.util.NavigableMap
        public final NavigableSet descendingKeySet() {
            synchronized (this.f19971Y) {
                try {
                    NavigableSet navigableSet = this.g0;
                    if (navigableSet != null) {
                        return navigableSet;
                    }
                    SynchronizedNavigableSet synchronizedNavigableSet = new SynchronizedNavigableSet(((NavigableMap) super.l()).descendingKeySet(), this.f19971Y);
                    this.g0 = synchronizedNavigableSet;
                    return synchronizedNavigableSet;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        @Override // java.util.NavigableMap
        public final NavigableMap descendingMap() {
            synchronized (this.f19971Y) {
                try {
                    NavigableMap navigableMap = this.h0;
                    if (navigableMap != null) {
                        return navigableMap;
                    }
                    SynchronizedNavigableMap synchronizedNavigableMap = new SynchronizedNavigableMap(((NavigableMap) super.l()).descendingMap(), this.f19971Y);
                    this.h0 = synchronizedNavigableMap;
                    return synchronizedNavigableMap;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        @Override // java.util.NavigableMap
        public final Map.Entry firstEntry() {
            Map.Entry entryC;
            synchronized (this.f19971Y) {
                entryC = Synchronized.c(((NavigableMap) super.l()).firstEntry(), this.f19971Y);
            }
            return entryC;
        }

        @Override // java.util.NavigableMap
        public final Map.Entry floorEntry(Object obj) {
            Map.Entry entryC;
            synchronized (this.f19971Y) {
                entryC = Synchronized.c(((NavigableMap) super.l()).floorEntry(obj), this.f19971Y);
            }
            return entryC;
        }

        @Override // java.util.NavigableMap
        public final Object floorKey(Object obj) {
            Object objFloorKey;
            synchronized (this.f19971Y) {
                objFloorKey = ((NavigableMap) super.l()).floorKey(obj);
            }
            return objFloorKey;
        }

        @Override // java.util.NavigableMap
        public final NavigableMap headMap(Object obj, boolean z2) {
            SynchronizedNavigableMap synchronizedNavigableMap;
            synchronized (this.f19971Y) {
                synchronizedNavigableMap = new SynchronizedNavigableMap(((NavigableMap) super.l()).headMap(obj, z2), this.f19971Y);
            }
            return synchronizedNavigableMap;
        }

        @Override // java.util.NavigableMap
        public final Map.Entry higherEntry(Object obj) {
            Map.Entry entryC;
            synchronized (this.f19971Y) {
                entryC = Synchronized.c(((NavigableMap) super.l()).higherEntry(obj), this.f19971Y);
            }
            return entryC;
        }

        @Override // java.util.NavigableMap
        public final Object higherKey(Object obj) {
            Object objHigherKey;
            synchronized (this.f19971Y) {
                objHigherKey = ((NavigableMap) super.l()).higherKey(obj);
            }
            return objHigherKey;
        }

        @Override // com.google.common.collect.Synchronized.SynchronizedMap, java.util.Map
        public final Set keySet() {
            return navigableKeySet();
        }

        @Override // com.google.common.collect.Synchronized.SynchronizedSortedMap, com.google.common.collect.Synchronized.SynchronizedMap
        public final Map l() {
            return (NavigableMap) super.l();
        }

        @Override // java.util.NavigableMap
        public final Map.Entry lastEntry() {
            Map.Entry entryC;
            synchronized (this.f19971Y) {
                entryC = Synchronized.c(((NavigableMap) super.l()).lastEntry(), this.f19971Y);
            }
            return entryC;
        }

        @Override // java.util.NavigableMap
        public final Map.Entry lowerEntry(Object obj) {
            Map.Entry entryC;
            synchronized (this.f19971Y) {
                entryC = Synchronized.c(((NavigableMap) super.l()).lowerEntry(obj), this.f19971Y);
            }
            return entryC;
        }

        @Override // java.util.NavigableMap
        public final Object lowerKey(Object obj) {
            Object objLowerKey;
            synchronized (this.f19971Y) {
                objLowerKey = ((NavigableMap) super.l()).lowerKey(obj);
            }
            return objLowerKey;
        }

        @Override // java.util.NavigableMap
        public final NavigableSet navigableKeySet() {
            synchronized (this.f19971Y) {
                try {
                    NavigableSet navigableSet = this.i0;
                    if (navigableSet != null) {
                        return navigableSet;
                    }
                    SynchronizedNavigableSet synchronizedNavigableSet = new SynchronizedNavigableSet(((NavigableMap) super.l()).navigableKeySet(), this.f19971Y);
                    this.i0 = synchronizedNavigableSet;
                    return synchronizedNavigableSet;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        @Override // java.util.NavigableMap
        public final Map.Entry pollFirstEntry() {
            Map.Entry entryC;
            synchronized (this.f19971Y) {
                entryC = Synchronized.c(((NavigableMap) super.l()).pollFirstEntry(), this.f19971Y);
            }
            return entryC;
        }

        @Override // java.util.NavigableMap
        public final Map.Entry pollLastEntry() {
            Map.Entry entryC;
            synchronized (this.f19971Y) {
                entryC = Synchronized.c(((NavigableMap) super.l()).pollLastEntry(), this.f19971Y);
            }
            return entryC;
        }

        @Override // java.util.NavigableMap
        public final NavigableMap subMap(Object obj, boolean z2, Object obj2, boolean z3) {
            SynchronizedNavigableMap synchronizedNavigableMap;
            synchronized (this.f19971Y) {
                synchronizedNavigableMap = new SynchronizedNavigableMap(((NavigableMap) super.l()).subMap(obj, z2, obj2, z3), this.f19971Y);
            }
            return synchronizedNavigableMap;
        }

        @Override // java.util.NavigableMap
        public final NavigableMap tailMap(Object obj, boolean z2) {
            SynchronizedNavigableMap synchronizedNavigableMap;
            synchronized (this.f19971Y) {
                synchronizedNavigableMap = new SynchronizedNavigableMap(((NavigableMap) super.l()).tailMap(obj, z2), this.f19971Y);
            }
            return synchronizedNavigableMap;
        }

        @Override // com.google.common.collect.Synchronized.SynchronizedSortedMap
        /* JADX INFO: renamed from: w */
        public final SortedMap l() {
            return (NavigableMap) super.l();
        }

        @Override // com.google.common.collect.Synchronized.SynchronizedSortedMap, java.util.SortedMap, java.util.NavigableMap
        public final SortedMap headMap(Object obj) {
            return headMap(obj, false);
        }

        @Override // com.google.common.collect.Synchronized.SynchronizedSortedMap, java.util.SortedMap, java.util.NavigableMap
        public final SortedMap subMap(Object obj, Object obj2) {
            return subMap(obj, true, obj2, false);
        }

        @Override // com.google.common.collect.Synchronized.SynchronizedSortedMap, java.util.SortedMap, java.util.NavigableMap
        public final SortedMap tailMap(Object obj) {
            return tailMap(obj, true);
        }
    }

    public static final class SynchronizedNavigableSet<E> extends SynchronizedSortedSet<E> implements NavigableSet<E> {
        private static final long serialVersionUID = 0;
        public transient NavigableSet Z;

        @Override // java.util.NavigableSet
        public final Object ceiling(Object obj) {
            Object objCeiling;
            synchronized (this.f19971Y) {
                objCeiling = ((NavigableSet) super.l()).ceiling(obj);
            }
            return objCeiling;
        }

        @Override // java.util.NavigableSet
        public final Iterator descendingIterator() {
            return ((NavigableSet) super.l()).descendingIterator();
        }

        @Override // java.util.NavigableSet
        public final NavigableSet descendingSet() {
            synchronized (this.f19971Y) {
                try {
                    NavigableSet navigableSet = this.Z;
                    if (navigableSet != null) {
                        return navigableSet;
                    }
                    SynchronizedNavigableSet synchronizedNavigableSet = new SynchronizedNavigableSet(((NavigableSet) super.l()).descendingSet(), this.f19971Y);
                    this.Z = synchronizedNavigableSet;
                    return synchronizedNavigableSet;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        @Override // java.util.NavigableSet
        public final Object floor(Object obj) {
            Object objFloor;
            synchronized (this.f19971Y) {
                objFloor = ((NavigableSet) super.l()).floor(obj);
            }
            return objFloor;
        }

        @Override // java.util.NavigableSet
        public final NavigableSet headSet(Object obj, boolean z2) {
            SynchronizedNavigableSet synchronizedNavigableSet;
            synchronized (this.f19971Y) {
                synchronizedNavigableSet = new SynchronizedNavigableSet(((NavigableSet) super.l()).headSet(obj, z2), this.f19971Y);
            }
            return synchronizedNavigableSet;
        }

        @Override // java.util.NavigableSet
        public final Object higher(Object obj) {
            Object objHigher;
            synchronized (this.f19971Y) {
                objHigher = ((NavigableSet) super.l()).higher(obj);
            }
            return objHigher;
        }

        @Override // com.google.common.collect.Synchronized.SynchronizedSortedSet, com.google.common.collect.Synchronized.SynchronizedSet, com.google.common.collect.Synchronized.SynchronizedCollection
        public final Collection l() {
            return (NavigableSet) super.l();
        }

        @Override // java.util.NavigableSet
        public final Object lower(Object obj) {
            Object objLower;
            synchronized (this.f19971Y) {
                objLower = ((NavigableSet) super.l()).lower(obj);
            }
            return objLower;
        }

        @Override // java.util.NavigableSet
        public final Object pollFirst() {
            Object objPollFirst;
            synchronized (this.f19971Y) {
                objPollFirst = ((NavigableSet) super.l()).pollFirst();
            }
            return objPollFirst;
        }

        @Override // java.util.NavigableSet
        public final Object pollLast() {
            Object objPollLast;
            synchronized (this.f19971Y) {
                objPollLast = ((NavigableSet) super.l()).pollLast();
            }
            return objPollLast;
        }

        @Override // java.util.NavigableSet
        public final NavigableSet subSet(Object obj, boolean z2, Object obj2, boolean z3) {
            SynchronizedNavigableSet synchronizedNavigableSet;
            synchronized (this.f19971Y) {
                synchronizedNavigableSet = new SynchronizedNavigableSet(((NavigableSet) super.l()).subSet(obj, z2, obj2, z3), this.f19971Y);
            }
            return synchronizedNavigableSet;
        }

        @Override // java.util.NavigableSet
        public final NavigableSet tailSet(Object obj, boolean z2) {
            SynchronizedNavigableSet synchronizedNavigableSet;
            synchronized (this.f19971Y) {
                synchronizedNavigableSet = new SynchronizedNavigableSet(((NavigableSet) super.l()).tailSet(obj, z2), this.f19971Y);
            }
            return synchronizedNavigableSet;
        }

        @Override // com.google.common.collect.Synchronized.SynchronizedSortedSet, com.google.common.collect.Synchronized.SynchronizedSet
        /* JADX INFO: renamed from: w */
        public final Set l() {
            return (NavigableSet) super.l();
        }

        @Override // com.google.common.collect.Synchronized.SynchronizedSortedSet
        /* JADX INFO: renamed from: x */
        public final SortedSet l() {
            return (NavigableSet) super.l();
        }

        @Override // com.google.common.collect.Synchronized.SynchronizedSortedSet, java.util.SortedSet, java.util.NavigableSet
        public final SortedSet headSet(Object obj) {
            return headSet(obj, false);
        }

        @Override // com.google.common.collect.Synchronized.SynchronizedSortedSet, java.util.SortedSet, java.util.NavigableSet
        public final SortedSet subSet(Object obj, Object obj2) {
            return subSet(obj, true, obj2, false);
        }

        @Override // com.google.common.collect.Synchronized.SynchronizedSortedSet, java.util.SortedSet, java.util.NavigableSet
        public final SortedSet tailSet(Object obj) {
            return tailSet(obj, true);
        }
    }
}
