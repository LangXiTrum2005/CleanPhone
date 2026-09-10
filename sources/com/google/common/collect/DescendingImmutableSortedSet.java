package com.google.common.collect;

import java.util.Iterator;
import java.util.NavigableSet;

/* JADX INFO: loaded from: classes4.dex */
@ElementTypesAreNonnullByDefault
final class DescendingImmutableSortedSet<E> extends ImmutableSortedSet<E> {
    public final ImmutableSortedSet g0;

    public DescendingImmutableSortedSet(ImmutableSortedSet immutableSortedSet) {
        super(Ordering.b(immutableSortedSet.e0).j());
        this.g0 = immutableSortedSet;
    }

    @Override // com.google.common.collect.ImmutableSortedSet
    public final ImmutableSortedSet C() {
        throw new AssertionError("should never be called");
    }

    @Override // com.google.common.collect.ImmutableSortedSet
    /* JADX INFO: renamed from: D */
    public final UnmodifiableIterator descendingIterator() {
        return this.g0.iterator();
    }

    @Override // com.google.common.collect.ImmutableSortedSet
    /* JADX INFO: renamed from: E */
    public final ImmutableSortedSet descendingSet() {
        return this.g0;
    }

    @Override // com.google.common.collect.ImmutableSortedSet
    public final ImmutableSortedSet I(Object obj, boolean z2) {
        return this.g0.tailSet(obj, z2).descendingSet();
    }

    @Override // com.google.common.collect.ImmutableSortedSet
    public final ImmutableSortedSet L(Object obj, boolean z2, Object obj2, boolean z3) {
        return this.g0.subSet(obj2, z3, obj, z2).descendingSet();
    }

    @Override // com.google.common.collect.ImmutableSortedSet
    public final ImmutableSortedSet O(Object obj, boolean z2) {
        return this.g0.headSet(obj, z2).descendingSet();
    }

    @Override // com.google.common.collect.ImmutableSortedSet, java.util.NavigableSet
    public final Object ceiling(Object obj) {
        return this.g0.floor(obj);
    }

    @Override // com.google.common.collect.ImmutableCollection, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        return this.g0.contains(obj);
    }

    @Override // com.google.common.collect.ImmutableSortedSet, java.util.NavigableSet
    public final Iterator descendingIterator() {
        return this.g0.iterator();
    }

    @Override // com.google.common.collect.ImmutableSortedSet, java.util.NavigableSet
    public final NavigableSet descendingSet() {
        return this.g0;
    }

    @Override // com.google.common.collect.ImmutableSortedSet, java.util.NavigableSet
    public final Object floor(Object obj) {
        return this.g0.ceiling(obj);
    }

    @Override // com.google.common.collect.ImmutableSortedSet, java.util.NavigableSet
    public final Object higher(Object obj) {
        return this.g0.lower(obj);
    }

    @Override // com.google.common.collect.ImmutableSortedSet, com.google.common.collect.ImmutableSet, com.google.common.collect.ImmutableCollection, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set, java.util.NavigableSet
    public final Iterator iterator() {
        return this.g0.descendingIterator();
    }

    @Override // com.google.common.collect.ImmutableCollection
    public final boolean l() {
        return this.g0.l();
    }

    @Override // com.google.common.collect.ImmutableSortedSet, java.util.NavigableSet
    public final Object lower(Object obj) {
        return this.g0.higher(obj);
    }

    @Override // com.google.common.collect.ImmutableCollection
    /* JADX INFO: renamed from: o */
    public final UnmodifiableIterator iterator() {
        return this.g0.descendingIterator();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.g0.size();
    }

    @Override // com.google.common.collect.ImmutableSortedSet, com.google.common.collect.ImmutableSet, com.google.common.collect.ImmutableCollection
    public Object writeReplace() {
        return super.writeReplace();
    }
}
