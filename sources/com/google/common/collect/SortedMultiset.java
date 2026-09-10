package com.google.common.collect;

import java.util.Comparator;
import java.util.NavigableSet;
import java.util.Set;

/* JADX INFO: loaded from: classes4.dex */
@ElementTypesAreNonnullByDefault
public interface SortedMultiset<E> extends SortedMultisetBridge<E>, SortedIterable<E> {
    Comparator comparator();

    @Override // com.google.common.collect.Multiset
    Set entrySet();

    Multiset.Entry firstEntry();

    @Override // com.google.common.collect.SortedMultisetBridge, com.google.common.collect.Multiset
    NavigableSet k();

    Multiset.Entry lastEntry();

    SortedMultiset n(Object obj, BoundType boundType, Object obj2, BoundType boundType2);

    Multiset.Entry pollFirstEntry();

    Multiset.Entry pollLastEntry();

    SortedMultiset q();

    SortedMultiset t0(Object obj, BoundType boundType);

    SortedMultiset z0(Object obj, BoundType boundType);
}
