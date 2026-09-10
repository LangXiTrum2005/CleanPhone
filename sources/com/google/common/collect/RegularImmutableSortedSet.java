package com.google.common.collect;

import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.Set;

/* JADX INFO: loaded from: classes4.dex */
@ElementTypesAreNonnullByDefault
final class RegularImmutableSortedSet<E> extends ImmutableSortedSet<E> {
    public static final RegularImmutableSortedSet h0;
    public final transient ImmutableList g0;

    static {
        UnmodifiableListIterator unmodifiableListIterator = ImmutableList.f19830Y;
        h0 = new RegularImmutableSortedSet(RegularImmutableList.f0, NaturalOrdering.Z);
    }

    public RegularImmutableSortedSet(ImmutableList immutableList, Comparator comparator) {
        super(comparator);
        this.g0 = immutableList;
    }

    @Override // com.google.common.collect.ImmutableSortedSet
    public final ImmutableSortedSet C() {
        Comparator comparatorReverseOrder = Collections.reverseOrder(this.e0);
        return isEmpty() ? ImmutableSortedSet.F(comparatorReverseOrder) : new RegularImmutableSortedSet(this.g0.C(), comparatorReverseOrder);
    }

    @Override // com.google.common.collect.ImmutableSortedSet, java.util.NavigableSet
    /* JADX INFO: renamed from: D */
    public final UnmodifiableIterator descendingIterator() {
        return this.g0.C().listIterator(0);
    }

    @Override // com.google.common.collect.ImmutableSortedSet
    public final ImmutableSortedSet I(Object obj, boolean z2) {
        return P(0, Q(obj, z2));
    }

    @Override // com.google.common.collect.ImmutableSortedSet
    public final ImmutableSortedSet L(Object obj, boolean z2, Object obj2, boolean z3) {
        return O(obj, z2).I(obj2, z3);
    }

    @Override // com.google.common.collect.ImmutableSortedSet
    public final ImmutableSortedSet O(Object obj, boolean z2) {
        return P(R(obj, z2), this.g0.size());
    }

    public final RegularImmutableSortedSet P(int i2, int i3) {
        ImmutableList immutableList = this.g0;
        if (i2 == 0 && i3 == immutableList.size()) {
            return this;
        }
        Comparator comparator = this.e0;
        return i2 < i3 ? new RegularImmutableSortedSet(immutableList.subList(i2, i3), comparator) : ImmutableSortedSet.F(comparator);
    }

    public final int Q(Object obj, boolean z2) {
        obj.getClass();
        int iBinarySearch = Collections.binarySearch(this.g0, obj, this.e0);
        if (iBinarySearch >= 0) {
            return z2 ? iBinarySearch + 1 : iBinarySearch;
        }
        return ~iBinarySearch;
    }

    public final int R(Object obj, boolean z2) {
        obj.getClass();
        int iBinarySearch = Collections.binarySearch(this.g0, obj, this.e0);
        if (iBinarySearch >= 0) {
            return z2 ? iBinarySearch : iBinarySearch + 1;
        }
        return ~iBinarySearch;
    }

    @Override // com.google.common.collect.ImmutableSortedSet, java.util.NavigableSet
    public final Object ceiling(Object obj) {
        int iR = R(obj, true);
        ImmutableList immutableList = this.g0;
        if (iR == immutableList.size()) {
            return null;
        }
        return immutableList.get(iR);
    }

    @Override // com.google.common.collect.ImmutableCollection, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        if (obj != null) {
            try {
                if (Collections.binarySearch(this.g0, obj, this.e0) >= 0) {
                    return true;
                }
            } catch (ClassCastException unused) {
            }
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean containsAll(Collection collection) {
        if (collection instanceof Multiset) {
            collection = ((Multiset) collection).k();
        }
        Comparator comparator = this.e0;
        if (!SortedIterables.a(comparator, collection) || collection.size() <= 1) {
            return super.containsAll(collection);
        }
        UnmodifiableIterator it = iterator();
        Iterator<E> it2 = collection.iterator();
        if (!it.hasNext()) {
            return false;
        }
        E next = it2.next();
        E next2 = it.next();
        while (true) {
            try {
                int iCompare = comparator.compare(next2, next);
                if (iCompare < 0) {
                    if (!it.hasNext()) {
                        return false;
                    }
                    next2 = it.next();
                } else if (iCompare == 0) {
                    if (!it2.hasNext()) {
                        return true;
                    }
                    next = it2.next();
                } else if (iCompare > 0) {
                    return false;
                }
            } catch (ClassCastException | NullPointerException unused) {
                return false;
            }
        }
    }

    @Override // com.google.common.collect.ImmutableSet, com.google.common.collect.ImmutableCollection
    public final ImmutableList d() {
        return this.g0;
    }

    @Override // com.google.common.collect.ImmutableCollection
    public final int e(int i2, Object[] objArr) {
        return this.g0.e(i2, objArr);
    }

    @Override // com.google.common.collect.ImmutableSet, java.util.Collection, java.util.Set
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Set)) {
            return false;
        }
        Set set = (Set) obj;
        if (this.g0.size() != set.size()) {
            return false;
        }
        if (isEmpty()) {
            return true;
        }
        Comparator comparator = this.e0;
        if (!SortedIterables.a(comparator, set)) {
            return containsAll(set);
        }
        Iterator<E> it = set.iterator();
        try {
            UnmodifiableIterator it2 = iterator();
            while (it2.hasNext()) {
                E next = it2.next();
                E next2 = it.next();
                if (next2 == null || comparator.compare(next, next2) != 0) {
                    return false;
                }
            }
            return true;
        } catch (ClassCastException | NoSuchElementException unused) {
            return false;
        }
    }

    @Override // com.google.common.collect.ImmutableSortedSet, java.util.SortedSet
    public final Object first() {
        if (isEmpty()) {
            throw new NoSuchElementException();
        }
        return this.g0.get(0);
    }

    @Override // com.google.common.collect.ImmutableSortedSet, java.util.NavigableSet
    public final Object floor(Object obj) {
        int iQ = Q(obj, true) - 1;
        if (iQ == -1) {
            return null;
        }
        return this.g0.get(iQ);
    }

    @Override // com.google.common.collect.ImmutableCollection
    public final Object[] g() {
        return this.g0.g();
    }

    @Override // com.google.common.collect.ImmutableCollection
    public final int h() {
        return this.g0.h();
    }

    @Override // com.google.common.collect.ImmutableSortedSet, java.util.NavigableSet
    public final Object higher(Object obj) {
        int iR = R(obj, false);
        ImmutableList immutableList = this.g0;
        if (iR == immutableList.size()) {
            return null;
        }
        return immutableList.get(iR);
    }

    @Override // com.google.common.collect.ImmutableCollection
    public final int i() {
        return this.g0.i();
    }

    @Override // com.google.common.collect.ImmutableCollection
    public final boolean l() {
        return this.g0.l();
    }

    @Override // com.google.common.collect.ImmutableSortedSet, java.util.SortedSet
    public final Object last() {
        if (isEmpty()) {
            throw new NoSuchElementException();
        }
        ImmutableList immutableList = this.g0;
        return immutableList.get(immutableList.size() - 1);
    }

    @Override // com.google.common.collect.ImmutableSortedSet, java.util.NavigableSet
    public final Object lower(Object obj) {
        int iQ = Q(obj, false) - 1;
        if (iQ == -1) {
            return null;
        }
        return this.g0.get(iQ);
    }

    @Override // com.google.common.collect.ImmutableSortedSet, com.google.common.collect.ImmutableSet, com.google.common.collect.ImmutableCollection, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set, java.util.NavigableSet
    /* JADX INFO: renamed from: o */
    public final UnmodifiableIterator iterator() {
        return this.g0.listIterator(0);
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
