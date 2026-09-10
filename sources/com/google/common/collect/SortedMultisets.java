package com.google.common.collect;

import java.util.Comparator;
import java.util.Iterator;
import java.util.NavigableSet;
import java.util.NoSuchElementException;
import java.util.SortedSet;

/* JADX INFO: loaded from: classes4.dex */
@ElementTypesAreNonnullByDefault
final class SortedMultisets {

    public static class ElementSet<E> extends Multisets.ElementSet<E> implements SortedSet<E> {
        public final SortedMultiset X;

        public ElementSet(SortedMultiset sortedMultiset) {
            this.X = sortedMultiset;
        }

        @Override // com.google.common.collect.Multisets.ElementSet
        public final Multiset a() {
            return this.X;
        }

        @Override // java.util.SortedSet
        public final Comparator comparator() {
            return this.X.comparator();
        }

        @Override // java.util.SortedSet
        public final Object first() {
            Multiset.Entry entryFirstEntry = this.X.firstEntry();
            if (entryFirstEntry != null) {
                return entryFirstEntry.d();
            }
            throw new NoSuchElementException();
        }

        @Override // java.util.SortedSet
        public final SortedSet headSet(Object obj) {
            return this.X.t0(obj, BoundType.X).k();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public final Iterator iterator() {
            return new Multisets.AnonymousClass5(this.X.entrySet().iterator());
        }

        @Override // java.util.SortedSet
        public final Object last() {
            Multiset.Entry entryLastEntry = this.X.lastEntry();
            if (entryLastEntry != null) {
                return entryLastEntry.d();
            }
            throw new NoSuchElementException();
        }

        @Override // java.util.SortedSet
        public final SortedSet subSet(Object obj, Object obj2) {
            return this.X.n(obj, BoundType.f19795Y, obj2, BoundType.X).k();
        }

        @Override // java.util.SortedSet
        public final SortedSet tailSet(Object obj) {
            return this.X.z0(obj, BoundType.f19795Y).k();
        }
    }

    public static class NavigableElementSet<E> extends ElementSet<E> implements NavigableSet<E> {
        @Override // java.util.NavigableSet
        public final Object ceiling(Object obj) {
            return SortedMultisets.a(this.X.z0(obj, BoundType.f19795Y).firstEntry());
        }

        @Override // java.util.NavigableSet
        public final Iterator descendingIterator() {
            return ((ElementSet) descendingSet()).iterator();
        }

        @Override // java.util.NavigableSet
        public final NavigableSet descendingSet() {
            return new NavigableElementSet(this.X.q());
        }

        @Override // java.util.NavigableSet
        public final Object floor(Object obj) {
            return SortedMultisets.a(this.X.t0(obj, BoundType.f19795Y).lastEntry());
        }

        @Override // java.util.NavigableSet
        public final NavigableSet headSet(Object obj, boolean z2) {
            return new NavigableElementSet(this.X.t0(obj, BoundType.a(z2)));
        }

        @Override // java.util.NavigableSet
        public final Object higher(Object obj) {
            return SortedMultisets.a(this.X.z0(obj, BoundType.X).firstEntry());
        }

        @Override // java.util.NavigableSet
        public final Object lower(Object obj) {
            return SortedMultisets.a(this.X.t0(obj, BoundType.X).lastEntry());
        }

        @Override // java.util.NavigableSet
        public final Object pollFirst() {
            return SortedMultisets.a(this.X.pollFirstEntry());
        }

        @Override // java.util.NavigableSet
        public final Object pollLast() {
            return SortedMultisets.a(this.X.pollLastEntry());
        }

        @Override // java.util.NavigableSet
        public final NavigableSet subSet(Object obj, boolean z2, Object obj2, boolean z3) {
            return new NavigableElementSet(this.X.n(obj, BoundType.a(z2), obj2, BoundType.a(z3)));
        }

        @Override // java.util.NavigableSet
        public final NavigableSet tailSet(Object obj, boolean z2) {
            return new NavigableElementSet(this.X.z0(obj, BoundType.a(z2)));
        }
    }

    public static Object a(Multiset.Entry entry) {
        if (entry == null) {
            return null;
        }
        return entry.d();
    }
}
