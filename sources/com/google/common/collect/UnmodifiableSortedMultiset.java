package com.google.common.collect;

import java.util.Collection;
import java.util.Comparator;
import java.util.NavigableSet;
import java.util.Set;

/* JADX INFO: loaded from: classes4.dex */
@ElementTypesAreNonnullByDefault
final class UnmodifiableSortedMultiset<E> extends Multisets.UnmodifiableMultiset<E> implements SortedMultiset<E> {
    private static final long serialVersionUID = 0;
    public transient UnmodifiableSortedMultiset e0;

    @Override // com.google.common.collect.Multisets.UnmodifiableMultiset, com.google.common.collect.ForwardingMultiset
    /* JADX INFO: renamed from: A */
    public final Multiset x() {
        return this.X;
    }

    @Override // com.google.common.collect.Multisets.UnmodifiableMultiset
    public final Set B() {
        return Sets.k(this.X.k());
    }

    @Override // com.google.common.collect.SortedMultiset, com.google.common.collect.SortedIterable
    public final Comparator comparator() {
        return this.X.comparator();
    }

    @Override // com.google.common.collect.SortedMultiset
    public final Multiset.Entry firstEntry() {
        return this.X.firstEntry();
    }

    @Override // com.google.common.collect.SortedMultiset
    public final Multiset.Entry lastEntry() {
        return this.X.lastEntry();
    }

    @Override // com.google.common.collect.SortedMultiset
    public final SortedMultiset n(Object obj, BoundType boundType, Object obj2, BoundType boundType2) {
        SortedMultiset sortedMultisetN = this.X.n(obj, boundType, obj2, boundType2);
        sortedMultisetN.getClass();
        return new UnmodifiableSortedMultiset(sortedMultisetN);
    }

    @Override // com.google.common.collect.SortedMultiset
    public final Multiset.Entry pollFirstEntry() {
        throw new UnsupportedOperationException();
    }

    @Override // com.google.common.collect.SortedMultiset
    public final Multiset.Entry pollLastEntry() {
        throw new UnsupportedOperationException();
    }

    @Override // com.google.common.collect.SortedMultiset
    public final SortedMultiset q() {
        UnmodifiableSortedMultiset unmodifiableSortedMultiset = this.e0;
        if (unmodifiableSortedMultiset != null) {
            return unmodifiableSortedMultiset;
        }
        UnmodifiableSortedMultiset unmodifiableSortedMultiset2 = new UnmodifiableSortedMultiset(this.X.q());
        unmodifiableSortedMultiset2.e0 = this;
        this.e0 = unmodifiableSortedMultiset2;
        return unmodifiableSortedMultiset2;
    }

    @Override // com.google.common.collect.SortedMultiset
    public final SortedMultiset t0(Object obj, BoundType boundType) {
        SortedMultiset sortedMultisetT0 = this.X.t0(obj, boundType);
        sortedMultisetT0.getClass();
        return new UnmodifiableSortedMultiset(sortedMultisetT0);
    }

    @Override // com.google.common.collect.Multisets.UnmodifiableMultiset, com.google.common.collect.ForwardingMultiset, com.google.common.collect.ForwardingCollection, com.google.common.collect.ForwardingObject
    public final Object w() {
        return this.X;
    }

    @Override // com.google.common.collect.Multisets.UnmodifiableMultiset, com.google.common.collect.ForwardingMultiset, com.google.common.collect.ForwardingCollection
    public final Collection x() {
        return this.X;
    }

    @Override // com.google.common.collect.SortedMultiset
    public final SortedMultiset z0(Object obj, BoundType boundType) {
        SortedMultiset sortedMultisetZ0 = this.X.z0(obj, boundType);
        sortedMultisetZ0.getClass();
        return new UnmodifiableSortedMultiset(sortedMultisetZ0);
    }

    @Override // com.google.common.collect.Multisets.UnmodifiableMultiset, com.google.common.collect.ForwardingMultiset, com.google.common.collect.Multiset
    public final NavigableSet k() {
        return (NavigableSet) super.k();
    }
}
