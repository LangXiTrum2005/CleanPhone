package com.google.common.collect;

import com.google.common.base.Preconditions;
import com.google.common.base.Predicate;
import com.google.common.base.Predicates;
import java.io.Serializable;
import java.util.AbstractSet;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.List;
import java.util.NavigableSet;
import java.util.NoSuchElementException;
import java.util.Set;
import java.util.SortedSet;

/* JADX INFO: loaded from: classes4.dex */
@ElementTypesAreNonnullByDefault
public final class Sets {

    /* JADX INFO: renamed from: com.google.common.collect.Sets$4, reason: invalid class name */
    class AnonymousClass4 extends SetView<Object> {

        /* JADX INFO: renamed from: com.google.common.collect.Sets$4$1, reason: invalid class name */
        class AnonymousClass1 extends AbstractIterator<Object> {
            @Override // com.google.common.collect.AbstractIterator
            public final Object a() {
                throw null;
            }
        }

        @Override // com.google.common.collect.Sets.SetView
        /* JADX INFO: renamed from: a */
        public final UnmodifiableIterator iterator() {
            throw null;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final boolean contains(Object obj) {
            throw null;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final boolean isEmpty() {
            throw null;
        }

        @Override // com.google.common.collect.Sets.SetView, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public final Iterator iterator() {
            throw null;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final int size() {
            throw null;
        }
    }

    /* JADX INFO: renamed from: com.google.common.collect.Sets$5, reason: invalid class name */
    class AnonymousClass5 extends AbstractSet<Set<Object>> {

        /* JADX INFO: renamed from: com.google.common.collect.Sets$5$1, reason: invalid class name */
        class AnonymousClass1 extends AbstractIterator<Set<Object>> {

            /* JADX INFO: renamed from: com.google.common.collect.Sets$5$1$1, reason: invalid class name and collision with other inner class name */
            class C02001 extends AbstractSet<Object> {

                /* JADX INFO: renamed from: com.google.common.collect.Sets$5$1$1$1, reason: invalid class name and collision with other inner class name */
                class C02011 extends AbstractIterator<Object> {
                    @Override // com.google.common.collect.AbstractIterator
                    public final Object a() {
                        throw null;
                    }
                }

                @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
                public final boolean contains(Object obj) {
                    throw null;
                }

                @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
                public final Iterator iterator() {
                    return new C02011();
                }

                @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
                public final int size() {
                    throw null;
                }
            }

            @Override // com.google.common.collect.AbstractIterator
            public final Object a() {
                throw null;
            }
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final boolean contains(Object obj) {
            if ((obj instanceof Set) && ((Set) obj).size() == 0) {
                throw null;
            }
            return false;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public final Iterator iterator() {
            throw null;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final int size() {
            throw null;
        }

        @Override // java.util.AbstractCollection
        public final String toString() {
            throw null;
        }
    }

    public static final class CartesianSet<E> extends ForwardingCollection<List<E>> implements Set<List<E>> {

        /* JADX INFO: renamed from: com.google.common.collect.Sets$CartesianSet$1, reason: invalid class name */
        class AnonymousClass1 extends ImmutableList<List<Object>> {
            @Override // java.util.List
            public final Object get(int i2) {
                throw null;
            }

            @Override // com.google.common.collect.ImmutableCollection
            public final boolean l() {
                return true;
            }

            @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
            public final int size() {
                throw null;
            }

            @Override // com.google.common.collect.ImmutableList, com.google.common.collect.ImmutableCollection
            public Object writeReplace() {
                return super.writeReplace();
            }
        }

        @Override // com.google.common.collect.ForwardingCollection, java.util.Collection, java.util.Set
        public final boolean contains(Object obj) {
            if (!(obj instanceof List)) {
                return false;
            }
            ((List) obj).size();
            throw null;
        }

        @Override // java.util.Collection, java.util.Set
        public final boolean equals(Object obj) {
            if (obj instanceof CartesianSet) {
                ((CartesianSet) obj).getClass();
                throw null;
            }
            if (obj instanceof Set) {
                Set set = (Set) obj;
                if (size() == set.size() && containsAll(set)) {
                    return true;
                }
            }
            return false;
        }

        @Override // java.util.Collection, java.util.Set
        public final int hashCode() {
            size();
            throw null;
        }

        @Override // com.google.common.collect.ForwardingCollection, com.google.common.collect.ForwardingObject
        /* JADX INFO: renamed from: w */
        public final /* bridge */ /* synthetic */ Object x() {
            return null;
        }

        @Override // com.google.common.collect.ForwardingCollection
        public final Collection x() {
            return null;
        }
    }

    public static class DescendingSet<E> extends ForwardingNavigableSet<E> {
        @Override // com.google.common.collect.ForwardingNavigableSet, com.google.common.collect.ForwardingSortedSet, com.google.common.collect.ForwardingSet
        /* JADX INFO: renamed from: A */
        public final /* bridge */ /* synthetic */ Set x() {
            return null;
        }

        @Override // com.google.common.collect.ForwardingNavigableSet, com.google.common.collect.ForwardingSortedSet
        /* JADX INFO: renamed from: B */
        public final /* bridge */ /* synthetic */ SortedSet w() {
            return null;
        }

        @Override // com.google.common.collect.ForwardingNavigableSet
        /* JADX INFO: renamed from: C */
        public final NavigableSet x() {
            return null;
        }

        @Override // com.google.common.collect.ForwardingNavigableSet, java.util.NavigableSet
        public final Object ceiling(Object obj) {
            throw null;
        }

        @Override // com.google.common.collect.ForwardingSortedSet, java.util.SortedSet
        public final Comparator comparator() {
            throw null;
        }

        @Override // com.google.common.collect.ForwardingNavigableSet, java.util.NavigableSet
        public final Iterator descendingIterator() {
            throw null;
        }

        @Override // com.google.common.collect.ForwardingNavigableSet, java.util.NavigableSet
        public final NavigableSet descendingSet() {
            return null;
        }

        @Override // com.google.common.collect.ForwardingSortedSet, java.util.SortedSet
        public final Object first() {
            throw null;
        }

        @Override // com.google.common.collect.ForwardingNavigableSet, java.util.NavigableSet
        public final Object floor(Object obj) {
            throw null;
        }

        @Override // com.google.common.collect.ForwardingSortedSet, java.util.SortedSet
        public final SortedSet headSet(Object obj) {
            headSet(obj, false);
            throw null;
        }

        @Override // com.google.common.collect.ForwardingNavigableSet, java.util.NavigableSet
        public final Object higher(Object obj) {
            throw null;
        }

        @Override // com.google.common.collect.ForwardingCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public final Iterator iterator() {
            throw null;
        }

        @Override // com.google.common.collect.ForwardingSortedSet, java.util.SortedSet
        public final Object last() {
            throw null;
        }

        @Override // com.google.common.collect.ForwardingNavigableSet, java.util.NavigableSet
        public final Object lower(Object obj) {
            throw null;
        }

        @Override // com.google.common.collect.ForwardingNavigableSet, java.util.NavigableSet
        public final Object pollFirst() {
            throw null;
        }

        @Override // com.google.common.collect.ForwardingNavigableSet, java.util.NavigableSet
        public final Object pollLast() {
            throw null;
        }

        @Override // com.google.common.collect.ForwardingSortedSet, java.util.SortedSet
        public final SortedSet subSet(Object obj, Object obj2) {
            subSet(obj, true, obj2, false);
            throw null;
        }

        @Override // com.google.common.collect.ForwardingSortedSet, java.util.SortedSet
        public final SortedSet tailSet(Object obj) {
            tailSet(obj, true);
            throw null;
        }

        @Override // com.google.common.collect.ForwardingCollection, java.util.Collection, java.util.Set
        public final Object[] toArray(Object[] objArr) {
            return ObjectArrays.c(this, objArr);
        }

        @Override // com.google.common.collect.ForwardingObject
        public final String toString() {
            return z();
        }

        @Override // com.google.common.collect.ForwardingNavigableSet, com.google.common.collect.ForwardingSortedSet, com.google.common.collect.ForwardingSet, com.google.common.collect.ForwardingCollection, com.google.common.collect.ForwardingObject
        /* JADX INFO: renamed from: w */
        public final /* bridge */ /* synthetic */ Object x() {
            return null;
        }

        @Override // com.google.common.collect.ForwardingNavigableSet, com.google.common.collect.ForwardingSortedSet, com.google.common.collect.ForwardingSet, com.google.common.collect.ForwardingCollection
        public final /* bridge */ /* synthetic */ Collection x() {
            return null;
        }

        @Override // com.google.common.collect.ForwardingNavigableSet, java.util.NavigableSet
        public final NavigableSet headSet(Object obj, boolean z2) {
            throw null;
        }

        @Override // com.google.common.collect.ForwardingNavigableSet, java.util.NavigableSet
        public final NavigableSet subSet(Object obj, boolean z2, Object obj2, boolean z3) {
            throw null;
        }

        @Override // com.google.common.collect.ForwardingNavigableSet, java.util.NavigableSet
        public final NavigableSet tailSet(Object obj, boolean z2) {
            throw null;
        }

        @Override // com.google.common.collect.ForwardingCollection, java.util.Collection, java.util.Set
        public final Object[] toArray() {
            return y();
        }
    }

    public static class FilteredNavigableSet<E> extends FilteredSortedSet<E> implements NavigableSet<E> {
        @Override // java.util.NavigableSet
        public final Object ceiling(Object obj) {
            return Iterators.f(((NavigableSet) this.X).tailSet(obj, true).iterator(), this.f19799Y);
        }

        @Override // java.util.NavigableSet
        public final Iterator descendingIterator() {
            return Iterators.e(((NavigableSet) this.X).descendingIterator(), this.f19799Y);
        }

        @Override // java.util.NavigableSet
        public final NavigableSet descendingSet() {
            return Sets.c(((NavigableSet) this.X).descendingSet(), this.f19799Y);
        }

        @Override // java.util.NavigableSet
        public final Object floor(Object obj) {
            return Iterators.f(((NavigableSet) this.X).headSet(obj, true).descendingIterator(), this.f19799Y);
        }

        @Override // java.util.NavigableSet
        public final NavigableSet headSet(Object obj, boolean z2) {
            return Sets.c(((NavigableSet) this.X).headSet(obj, z2), this.f19799Y);
        }

        @Override // java.util.NavigableSet
        public final Object higher(Object obj) {
            return Iterators.f(((NavigableSet) this.X).tailSet(obj, false).iterator(), this.f19799Y);
        }

        @Override // com.google.common.collect.Sets.FilteredSortedSet, java.util.SortedSet
        public final Object last() {
            Iterator<E> itDescendingIterator = ((NavigableSet) this.X).descendingIterator();
            itDescendingIterator.getClass();
            Predicate predicate = this.f19799Y;
            predicate.getClass();
            while (itDescendingIterator.hasNext()) {
                E next = itDescendingIterator.next();
                if (predicate.apply(next)) {
                    return next;
                }
            }
            throw new NoSuchElementException();
        }

        @Override // java.util.NavigableSet
        public final Object lower(Object obj) {
            return Iterators.f(((NavigableSet) this.X).headSet(obj, false).descendingIterator(), this.f19799Y);
        }

        @Override // java.util.NavigableSet
        public final Object pollFirst() {
            return Iterables.e((NavigableSet) this.X, this.f19799Y);
        }

        @Override // java.util.NavigableSet
        public final Object pollLast() {
            return Iterables.e(((NavigableSet) this.X).descendingSet(), this.f19799Y);
        }

        @Override // java.util.NavigableSet
        public final NavigableSet subSet(Object obj, boolean z2, Object obj2, boolean z3) {
            return Sets.c(((NavigableSet) this.X).subSet(obj, z2, obj2, z3), this.f19799Y);
        }

        @Override // java.util.NavigableSet
        public final NavigableSet tailSet(Object obj, boolean z2) {
            return Sets.c(((NavigableSet) this.X).tailSet(obj, z2), this.f19799Y);
        }
    }

    public static class FilteredSet<E> extends Collections2.FilteredCollection<E> implements Set<E> {
        @Override // java.util.Collection, java.util.Set
        public final boolean equals(Object obj) {
            return Sets.b(this, obj);
        }

        @Override // java.util.Collection, java.util.Set
        public final int hashCode() {
            return Sets.e(this);
        }
    }

    public static class FilteredSortedSet<E> extends FilteredSet<E> implements SortedSet<E> {
        @Override // java.util.SortedSet
        public final Comparator comparator() {
            return ((SortedSet) this.X).comparator();
        }

        @Override // java.util.SortedSet
        public final Object first() {
            Iterator<E> it = this.X.iterator();
            it.getClass();
            Predicate predicate = this.f19799Y;
            predicate.getClass();
            while (it.hasNext()) {
                E next = it.next();
                if (predicate.apply(next)) {
                    return next;
                }
            }
            throw new NoSuchElementException();
        }

        @Override // java.util.SortedSet
        public final SortedSet headSet(Object obj) {
            return new FilteredSortedSet(((SortedSet) this.X).headSet(obj), this.f19799Y);
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r0v2, types: [java.util.SortedSet] */
        /* JADX WARN: Type inference failed for: r0v4 */
        /* JADX WARN: Type inference failed for: r0v5 */
        public Object last() {
            ?? HeadSet = (SortedSet) this.X;
            while (true) {
                Object objLast = HeadSet.last();
                if (this.f19799Y.apply(objLast)) {
                    return objLast;
                }
                HeadSet = HeadSet.headSet(objLast);
            }
        }

        @Override // java.util.SortedSet
        public final SortedSet subSet(Object obj, Object obj2) {
            return new FilteredSortedSet(((SortedSet) this.X).subSet(obj, obj2), this.f19799Y);
        }

        @Override // java.util.SortedSet
        public final SortedSet tailSet(Object obj) {
            return new FilteredSortedSet(((SortedSet) this.X).tailSet(obj), this.f19799Y);
        }
    }

    public static abstract class ImprovedAbstractSet<E> extends AbstractSet<E> {
        @Override // java.util.AbstractSet, java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean removeAll(Collection collection) {
            return Sets.h(this, collection);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean retainAll(Collection collection) {
            collection.getClass();
            return super.retainAll(collection);
        }
    }

    public static final class PowerSet<E> extends AbstractSet<Set<E>> {

        /* JADX INFO: renamed from: com.google.common.collect.Sets$PowerSet$1, reason: invalid class name */
        class AnonymousClass1 extends AbstractIndexedListIterator<Set<Object>> {
            @Override // com.google.common.collect.AbstractIndexedListIterator
            public final Object a(int i2) {
                throw null;
            }
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final boolean contains(Object obj) {
            if (obj instanceof Set) {
                throw null;
            }
            return false;
        }

        @Override // java.util.AbstractSet, java.util.Collection, java.util.Set
        public final boolean equals(Object obj) {
            if (obj instanceof PowerSet) {
                throw null;
            }
            return super.equals(obj);
        }

        @Override // java.util.AbstractSet, java.util.Collection, java.util.Set
        public final int hashCode() {
            throw null;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final boolean isEmpty() {
            return false;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public final Iterator iterator() {
            throw null;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final int size() {
            throw null;
        }

        @Override // java.util.AbstractCollection
        public final String toString() {
            return "powerSet(null)";
        }
    }

    public static abstract class SetView<E> extends AbstractSet<E> {
        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public abstract UnmodifiableIterator iterator();

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final boolean add(Object obj) {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final boolean addAll(Collection collection) {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final void clear() {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final boolean remove(Object obj) {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.AbstractSet, java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final boolean removeAll(Collection collection) {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final boolean retainAll(Collection collection) {
            throw new UnsupportedOperationException();
        }
    }

    public static final class SubSet<E> extends AbstractSet<E> {

        /* JADX INFO: renamed from: com.google.common.collect.Sets$SubSet$1, reason: invalid class name */
        class AnonymousClass1 extends UnmodifiableIterator<Object> {
            public int X;

            @Override // java.util.Iterator
            public final boolean hasNext() {
                return this.X != 0;
            }

            @Override // java.util.Iterator
            public final Object next() {
                int iNumberOfTrailingZeros = Integer.numberOfTrailingZeros(this.X);
                if (iNumberOfTrailingZeros == 32) {
                    throw new NoSuchElementException();
                }
                this.X = (~(1 << iNumberOfTrailingZeros)) & this.X;
                throw null;
            }
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final boolean contains(Object obj) {
            throw null;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public final Iterator iterator() {
            throw null;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final int size() {
            return Integer.bitCount(0);
        }
    }

    public static final class UnmodifiableNavigableSet<E> extends ForwardingSortedSet<E> implements NavigableSet<E>, Serializable {
        private static final long serialVersionUID = 0;
        public final NavigableSet X;

        /* JADX INFO: renamed from: Y, reason: collision with root package name */
        public final SortedSet f19955Y;
        public transient UnmodifiableNavigableSet Z;

        public UnmodifiableNavigableSet(NavigableSet navigableSet) {
            navigableSet.getClass();
            this.X = navigableSet;
            this.f19955Y = Collections.unmodifiableSortedSet(navigableSet);
        }

        @Override // com.google.common.collect.ForwardingSortedSet, com.google.common.collect.ForwardingSet
        /* JADX INFO: renamed from: A */
        public final Set x() {
            return this.f19955Y;
        }

        @Override // com.google.common.collect.ForwardingSortedSet
        /* JADX INFO: renamed from: B */
        public final SortedSet w() {
            return this.f19955Y;
        }

        @Override // java.util.NavigableSet
        public final Object ceiling(Object obj) {
            return this.X.ceiling(obj);
        }

        @Override // java.util.NavigableSet
        public final Iterator descendingIterator() {
            return Iterators.n(this.X.descendingIterator());
        }

        @Override // java.util.NavigableSet
        public final NavigableSet descendingSet() {
            UnmodifiableNavigableSet unmodifiableNavigableSet = this.Z;
            if (unmodifiableNavigableSet != null) {
                return unmodifiableNavigableSet;
            }
            UnmodifiableNavigableSet unmodifiableNavigableSet2 = new UnmodifiableNavigableSet(this.X.descendingSet());
            this.Z = unmodifiableNavigableSet2;
            unmodifiableNavigableSet2.Z = this;
            return unmodifiableNavigableSet2;
        }

        @Override // java.util.NavigableSet
        public final Object floor(Object obj) {
            return this.X.floor(obj);
        }

        @Override // java.util.NavigableSet
        public final NavigableSet headSet(Object obj, boolean z2) {
            return Sets.k(this.X.headSet(obj, z2));
        }

        @Override // java.util.NavigableSet
        public final Object higher(Object obj) {
            return this.X.higher(obj);
        }

        @Override // java.util.NavigableSet
        public final Object lower(Object obj) {
            return this.X.lower(obj);
        }

        @Override // java.util.NavigableSet
        public final Object pollFirst() {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.NavigableSet
        public final Object pollLast() {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.NavigableSet
        public final NavigableSet subSet(Object obj, boolean z2, Object obj2, boolean z3) {
            return Sets.k(this.X.subSet(obj, z2, obj2, z3));
        }

        @Override // java.util.NavigableSet
        public final NavigableSet tailSet(Object obj, boolean z2) {
            return Sets.k(this.X.tailSet(obj, z2));
        }

        @Override // com.google.common.collect.ForwardingSortedSet, com.google.common.collect.ForwardingSet, com.google.common.collect.ForwardingCollection, com.google.common.collect.ForwardingObject
        /* JADX INFO: renamed from: w */
        public final Object x() {
            return this.f19955Y;
        }

        @Override // com.google.common.collect.ForwardingSortedSet, com.google.common.collect.ForwardingSet, com.google.common.collect.ForwardingCollection
        public final Collection x() {
            return this.f19955Y;
        }
    }

    public static SetView a(final Set set, final Set set2) {
        Preconditions.j(set, "set1");
        return new SetView<Object>() { // from class: com.google.common.collect.Sets.3

            /* JADX INFO: renamed from: com.google.common.collect.Sets$3$1, reason: invalid class name */
            class AnonymousClass1 extends AbstractIterator<Object> {
                public final Iterator Z;

                public AnonymousClass1() {
                    this.Z = set.iterator();
                }

                @Override // com.google.common.collect.AbstractIterator
                public final Object a() {
                    Object next;
                    do {
                        Iterator it = this.Z;
                        if (!it.hasNext()) {
                            this.X = AbstractIterator.State.Z;
                            return null;
                        }
                        next = it.next();
                    } while (((SingletonImmutableSet) set2).e0.equals(next));
                    return next;
                }
            }

            @Override // com.google.common.collect.Sets.SetView
            /* JADX INFO: renamed from: a */
            public final UnmodifiableIterator iterator() {
                return new AnonymousClass1();
            }

            @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
            public final boolean contains(Object obj) {
                return set.contains(obj) && !set2.contains(obj);
            }

            @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
            public final boolean isEmpty() {
                return set2.containsAll(set);
            }

            @Override // com.google.common.collect.Sets.SetView, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
            public final Iterator iterator() {
                return new AnonymousClass1();
            }

            @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
            public final int size() {
                Iterator it = set.iterator();
                int i2 = 0;
                while (it.hasNext()) {
                    if (!set2.contains(it.next())) {
                        i2++;
                    }
                }
                return i2;
            }
        };
    }

    public static boolean b(Set set, Object obj) {
        if (set == obj) {
            return true;
        }
        if (obj instanceof Set) {
            Set set2 = (Set) obj;
            try {
                if (set.size() == set2.size() && set.containsAll(set2)) {
                    return true;
                }
            } catch (ClassCastException | NullPointerException unused) {
            }
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static NavigableSet c(NavigableSet navigableSet, Predicate predicate) {
        if (navigableSet instanceof FilteredSet) {
            FilteredSet filteredSet = (FilteredSet) navigableSet;
            return new FilteredNavigableSet((NavigableSet) filteredSet.X, Predicates.c(filteredSet.f19799Y, predicate));
        }
        navigableSet.getClass();
        predicate.getClass();
        return new FilteredNavigableSet(navigableSet, predicate);
    }

    public static Set d(Set set, Predicate predicate) {
        if (!(set instanceof SortedSet)) {
            if (set instanceof FilteredSet) {
                FilteredSet filteredSet = (FilteredSet) set;
                return new FilteredSet((Set) filteredSet.X, Predicates.c(filteredSet.f19799Y, predicate));
            }
            set.getClass();
            predicate.getClass();
            return new FilteredSet(set, predicate);
        }
        Collection collection = (SortedSet) set;
        if (collection instanceof FilteredSet) {
            FilteredSet filteredSet2 = (FilteredSet) collection;
            return new FilteredSortedSet((SortedSet) filteredSet2.X, Predicates.c(filteredSet2.f19799Y, predicate));
        }
        collection.getClass();
        predicate.getClass();
        return new FilteredSortedSet(collection, predicate);
    }

    public static int e(Set set) {
        Iterator it = set.iterator();
        int i2 = 0;
        while (it.hasNext()) {
            Object next = it.next();
            i2 = ~(~(i2 + (next != null ? next.hashCode() : 0)));
        }
        return i2;
    }

    public static SetView f(final ImmutableSet immutableSet, final ImmutableSet immutableSet2) {
        Preconditions.j(immutableSet, "set1");
        Preconditions.j(immutableSet2, "set2");
        return new SetView<Object>() { // from class: com.google.common.collect.Sets.2

            /* JADX INFO: renamed from: com.google.common.collect.Sets$2$1, reason: invalid class name */
            class AnonymousClass1 extends AbstractIterator<Object> {
                public final Iterator Z;

                public AnonymousClass1() {
                    this.Z = immutableSet.iterator();
                }

                @Override // com.google.common.collect.AbstractIterator
                public final Object a() {
                    Object next;
                    do {
                        Iterator it = this.Z;
                        if (!it.hasNext()) {
                            this.X = AbstractIterator.State.Z;
                            return null;
                        }
                        next = it.next();
                    } while (!immutableSet2.contains(next));
                    return next;
                }
            }

            @Override // com.google.common.collect.Sets.SetView
            /* JADX INFO: renamed from: a */
            public final UnmodifiableIterator iterator() {
                return new AnonymousClass1();
            }

            @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
            public final boolean contains(Object obj) {
                return immutableSet.contains(obj) && immutableSet2.contains(obj);
            }

            @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
            public final boolean containsAll(Collection collection) {
                return immutableSet.containsAll(collection) && immutableSet2.containsAll(collection);
            }

            @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
            public final boolean isEmpty() {
                return Collections.disjoint(immutableSet2, immutableSet);
            }

            @Override // com.google.common.collect.Sets.SetView, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
            public final Iterator iterator() {
                return new AnonymousClass1();
            }

            @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
            public final int size() {
                Iterator<E> it = immutableSet.iterator();
                int i2 = 0;
                while (it.hasNext()) {
                    if (immutableSet2.contains(it.next())) {
                        i2++;
                    }
                }
                return i2;
            }
        };
    }

    public static Set g() {
        return Collections.newSetFromMap(new IdentityHashMap());
    }

    public static boolean h(Set set, Collection collection) {
        collection.getClass();
        if (collection instanceof Multiset) {
            collection = ((Multiset) collection).k();
        }
        return (!(collection instanceof Set) || collection.size() <= set.size()) ? i(set, collection.iterator()) : Iterators.k(collection, set.iterator());
    }

    public static boolean i(Set set, Iterator it) {
        boolean zRemove = false;
        while (it.hasNext()) {
            zRemove |= set.remove(it.next());
        }
        return zRemove;
    }

    public static SetView j(final Set set, final Set set2) {
        Preconditions.j(set, "set1");
        Preconditions.j(set2, "set2");
        return new SetView<Object>() { // from class: com.google.common.collect.Sets.1

            /* JADX INFO: renamed from: com.google.common.collect.Sets$1$1, reason: invalid class name and collision with other inner class name */
            class C01991 extends AbstractIterator<Object> {
                public final Iterator Z;
                public final Iterator e0;

                public C01991() {
                    this.Z = set.iterator();
                    this.e0 = set2.iterator();
                }

                @Override // com.google.common.collect.AbstractIterator
                public final Object a() {
                    Object next;
                    Iterator it = this.Z;
                    if (it.hasNext()) {
                        return it.next();
                    }
                    do {
                        Iterator it2 = this.e0;
                        if (!it2.hasNext()) {
                            this.X = AbstractIterator.State.Z;
                            return null;
                        }
                        next = it2.next();
                    } while (set.contains(next));
                    return next;
                }
            }

            @Override // com.google.common.collect.Sets.SetView
            /* JADX INFO: renamed from: a */
            public final UnmodifiableIterator iterator() {
                return new C01991();
            }

            @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
            public final boolean contains(Object obj) {
                return set.contains(obj) || set2.contains(obj);
            }

            @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
            public final boolean isEmpty() {
                return set.isEmpty() && set2.isEmpty();
            }

            @Override // com.google.common.collect.Sets.SetView, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
            public final Iterator iterator() {
                return new C01991();
            }

            @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
            public final int size() {
                Set set3 = set;
                int size = set3.size();
                Iterator it = set2.iterator();
                while (it.hasNext()) {
                    if (!set3.contains(it.next())) {
                        size++;
                    }
                }
                return size;
            }
        };
    }

    public static NavigableSet k(NavigableSet navigableSet) {
        return ((navigableSet instanceof ImmutableCollection) || (navigableSet instanceof UnmodifiableNavigableSet)) ? navigableSet : new UnmodifiableNavigableSet(navigableSet);
    }
}
