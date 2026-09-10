package com.google.common.collect;

/* JADX INFO: loaded from: classes4.dex */
@ElementTypesAreNonnullByDefault
final class DescendingImmutableSortedMultiset<E> extends ImmutableSortedMultiset<E> {
    public final transient ImmutableSortedMultiset h0;

    public DescendingImmutableSortedMultiset(ImmutableSortedMultiset immutableSortedMultiset) {
        this.h0 = immutableSortedMultiset;
    }

    @Override // com.google.common.collect.SortedMultiset
    public final Multiset.Entry firstEntry() {
        return this.h0.lastEntry();
    }

    @Override // com.google.common.collect.ImmutableCollection
    public final boolean l() {
        return this.h0.l();
    }

    @Override // com.google.common.collect.SortedMultiset
    public final Multiset.Entry lastEntry() {
        return this.h0.firstEntry();
    }

    @Override // com.google.common.collect.ImmutableSortedMultiset, com.google.common.collect.SortedMultiset
    public final SortedMultiset q() {
        return this.h0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final int size() {
        return this.h0.size();
    }

    @Override // com.google.common.collect.ImmutableMultiset
    public final Multiset.Entry u(int i2) {
        return (Multiset.Entry) this.h0.entrySet().d().C().get(i2);
    }

    @Override // com.google.common.collect.ImmutableSortedMultiset
    /* JADX INFO: renamed from: v */
    public final ImmutableSortedMultiset q() {
        return this.h0;
    }

    @Override // com.google.common.collect.ImmutableSortedMultiset, com.google.common.collect.ImmutableMultiset
    /* JADX INFO: renamed from: w, reason: merged with bridge method [inline-methods] */
    public final ImmutableSortedSet k() {
        return this.h0.k().descendingSet();
    }

    @Override // com.google.common.collect.Multiset
    public final int w0(Object obj) {
        return this.h0.w0(obj);
    }

    @Override // com.google.common.collect.ImmutableSortedMultiset, com.google.common.collect.ImmutableMultiset, com.google.common.collect.ImmutableCollection
    public Object writeReplace() {
        return super.writeReplace();
    }

    @Override // com.google.common.collect.ImmutableSortedMultiset, com.google.common.collect.SortedMultiset
    /* JADX INFO: renamed from: x, reason: merged with bridge method [inline-methods] */
    public final ImmutableSortedMultiset t0(Object obj, BoundType boundType) {
        return this.h0.z0(obj, boundType).q();
    }

    @Override // com.google.common.collect.ImmutableSortedMultiset, com.google.common.collect.SortedMultiset
    /* JADX INFO: renamed from: y, reason: merged with bridge method [inline-methods] */
    public final ImmutableSortedMultiset z0(Object obj, BoundType boundType) {
        return this.h0.t0(obj, boundType).q();
    }
}
