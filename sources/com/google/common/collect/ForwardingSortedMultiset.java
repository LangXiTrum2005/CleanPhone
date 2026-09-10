package com.google.common.collect;

import java.util.Comparator;
import java.util.NavigableSet;

/* JADX INFO: loaded from: classes4.dex */
@ElementTypesAreNonnullByDefault
public abstract class ForwardingSortedMultiset<E> extends ForwardingMultiset<E> implements SortedMultiset<E> {

    public abstract class StandardDescendingMultiset extends DescendingMultiset<E> {
        @Override // com.google.common.collect.DescendingMultiset
        public final SortedMultiset C() {
            return null;
        }
    }

    public class StandardElementSet extends SortedMultisets.NavigableElementSet<E> {
    }

    @Override // com.google.common.collect.ForwardingMultiset, com.google.common.collect.ForwardingCollection
    /* JADX INFO: renamed from: B, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public abstract SortedMultiset x();

    @Override // com.google.common.collect.SortedMultiset, com.google.common.collect.SortedIterable
    public final Comparator comparator() {
        return w().comparator();
    }

    @Override // com.google.common.collect.SortedMultiset
    public final Multiset.Entry firstEntry() {
        return w().firstEntry();
    }

    @Override // com.google.common.collect.SortedMultiset
    public final Multiset.Entry lastEntry() {
        return w().lastEntry();
    }

    @Override // com.google.common.collect.SortedMultiset
    public final SortedMultiset n(Object obj, BoundType boundType, Object obj2, BoundType boundType2) {
        return w().n(obj, boundType, obj2, boundType2);
    }

    @Override // com.google.common.collect.SortedMultiset
    public final Multiset.Entry pollFirstEntry() {
        return w().pollFirstEntry();
    }

    @Override // com.google.common.collect.SortedMultiset
    public final Multiset.Entry pollLastEntry() {
        return w().pollLastEntry();
    }

    @Override // com.google.common.collect.SortedMultiset
    public final SortedMultiset q() {
        return w().q();
    }

    @Override // com.google.common.collect.SortedMultiset
    public final SortedMultiset t0(Object obj, BoundType boundType) {
        return w().t0(obj, boundType);
    }

    @Override // com.google.common.collect.SortedMultiset
    public final SortedMultiset z0(Object obj, BoundType boundType) {
        return w().z0(obj, boundType);
    }

    @Override // com.google.common.collect.ForwardingMultiset, com.google.common.collect.Multiset
    public final NavigableSet k() {
        return w().k();
    }
}
