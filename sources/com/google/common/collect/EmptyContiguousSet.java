package com.google.common.collect;

import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.lang.Comparable;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.Set;

/* JADX INFO: loaded from: classes4.dex */
@ElementTypesAreNonnullByDefault
final class EmptyContiguousSet<C extends Comparable> extends ContiguousSet<C> {

    public static final class SerializedForm<C extends Comparable> implements Serializable {
        private static final long serialVersionUID = 0;

        private Object readResolve() {
            return new EmptyContiguousSet();
        }
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Use SerializedForm");
    }

    @Override // com.google.common.collect.ContiguousSet, com.google.common.collect.ImmutableSortedSet
    public final ImmutableSortedSet C() {
        return ImmutableSortedSet.F(ReverseNaturalOrdering.X);
    }

    @Override // com.google.common.collect.ImmutableSortedSet
    /* JADX INFO: renamed from: D */
    public final UnmodifiableIterator descendingIterator() {
        return Iterators.ArrayItr.e0;
    }

    @Override // com.google.common.collect.ContiguousSet, com.google.common.collect.ImmutableSortedSet
    public final ImmutableSortedSet I(Object obj, boolean z2) {
        return this;
    }

    @Override // com.google.common.collect.ContiguousSet, com.google.common.collect.ImmutableSortedSet
    public final ImmutableSortedSet L(Object obj, boolean z2, Object obj2, boolean z3) {
        return this;
    }

    @Override // com.google.common.collect.ContiguousSet, com.google.common.collect.ImmutableSortedSet
    public final ImmutableSortedSet O(Object obj, boolean z2) {
        return this;
    }

    @Override // com.google.common.collect.ContiguousSet
    /* JADX INFO: renamed from: P */
    public final ContiguousSet I(Comparable comparable, boolean z2) {
        return this;
    }

    @Override // com.google.common.collect.ContiguousSet
    public final Range Q() {
        throw new NoSuchElementException();
    }

    @Override // com.google.common.collect.ContiguousSet
    /* JADX INFO: renamed from: R */
    public final ContiguousSet L(Comparable comparable, boolean z2, Comparable comparable2, boolean z3) {
        return this;
    }

    @Override // com.google.common.collect.ContiguousSet
    /* JADX INFO: renamed from: S */
    public final ContiguousSet O(Comparable comparable, boolean z2) {
        return this;
    }

    @Override // com.google.common.collect.ImmutableCollection, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        return false;
    }

    @Override // com.google.common.collect.ImmutableSet, com.google.common.collect.ImmutableCollection
    public final ImmutableList d() {
        UnmodifiableListIterator unmodifiableListIterator = ImmutableList.f19830Y;
        return RegularImmutableList.f0;
    }

    @Override // com.google.common.collect.ImmutableSortedSet, java.util.NavigableSet
    public final Iterator descendingIterator() {
        return Iterators.ArrayItr.e0;
    }

    @Override // com.google.common.collect.ImmutableSet, java.util.Collection, java.util.Set
    public final boolean equals(Object obj) {
        if (obj instanceof Set) {
            return ((Set) obj).isEmpty();
        }
        return false;
    }

    @Override // com.google.common.collect.ImmutableSortedSet, java.util.SortedSet
    public final Object first() {
        throw new NoSuchElementException();
    }

    @Override // com.google.common.collect.ImmutableSet, java.util.Collection, java.util.Set
    public final int hashCode() {
        return 0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean isEmpty() {
        return true;
    }

    @Override // com.google.common.collect.ImmutableSortedSet, com.google.common.collect.ImmutableSet, com.google.common.collect.ImmutableCollection, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set, java.util.NavigableSet
    public final Iterator iterator() {
        return Iterators.ArrayItr.e0;
    }

    @Override // com.google.common.collect.ImmutableCollection
    public final boolean l() {
        return false;
    }

    @Override // com.google.common.collect.ImmutableSortedSet, java.util.SortedSet
    public final Object last() {
        throw new NoSuchElementException();
    }

    @Override // com.google.common.collect.ImmutableCollection
    /* JADX INFO: renamed from: o */
    public final UnmodifiableIterator iterator() {
        return Iterators.ArrayItr.e0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return 0;
    }

    @Override // com.google.common.collect.ContiguousSet, java.util.AbstractCollection
    public final String toString() {
        return "[]";
    }

    @Override // com.google.common.collect.ContiguousSet, com.google.common.collect.ImmutableSortedSet, com.google.common.collect.ImmutableSet, com.google.common.collect.ImmutableCollection
    public Object writeReplace() {
        return new SerializedForm();
    }
}
