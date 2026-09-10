package com.google.common.collect;

import java.util.Collection;
import java.util.Collections;
import java.util.NavigableSet;
import java.util.Set;
import java.util.SortedSet;

/* JADX INFO: loaded from: classes4.dex */
@ElementTypesAreNonnullByDefault
abstract class AbstractSortedSetMultimap<K, V> extends AbstractSetMultimap<K, V> implements SortedSetMultimap<K, V> {
    private static final long serialVersionUID = 430848587173315748L;

    @Override // com.google.common.collect.AbstractSetMultimap
    /* JADX INFO: renamed from: B */
    public final Set s() {
        SortedSet sortedSetO = o();
        return sortedSetO instanceof NavigableSet ? Sets.k((NavigableSet) sortedSetO) : Collections.unmodifiableSortedSet(sortedSetO);
    }

    @Override // com.google.common.collect.AbstractSetMultimap, com.google.common.collect.AbstractMapBasedMultimap
    /* JADX INFO: renamed from: C */
    public abstract SortedSet o();

    @Override // com.google.common.collect.AbstractSetMultimap, com.google.common.collect.AbstractMapBasedMultimap
    public final Collection s() {
        SortedSet sortedSetO = o();
        return sortedSetO instanceof NavigableSet ? Sets.k((NavigableSet) sortedSetO) : Collections.unmodifiableSortedSet(sortedSetO);
    }

    @Override // com.google.common.collect.AbstractSetMultimap, com.google.common.collect.AbstractMapBasedMultimap
    public final Collection x(Collection collection) {
        return collection instanceof NavigableSet ? Sets.k((NavigableSet) collection) : Collections.unmodifiableSortedSet((SortedSet) collection);
    }

    @Override // com.google.common.collect.AbstractSetMultimap, com.google.common.collect.AbstractMapBasedMultimap
    public final Collection z(Object obj, Collection collection) {
        return collection instanceof NavigableSet ? new AbstractMapBasedMultimap.WrappedNavigableSet(obj, (NavigableSet) collection, null) : new AbstractMapBasedMultimap.WrappedSortedSet(obj, (SortedSet) collection, null);
    }

    @Override // com.google.common.collect.AbstractSetMultimap, com.google.common.collect.AbstractMapBasedMultimap, com.google.common.collect.Multimap, com.google.common.collect.ListMultimap
    public SortedSet a(Object obj) {
        return (SortedSet) super.a(obj);
    }

    @Override // com.google.common.collect.AbstractSetMultimap, com.google.common.collect.AbstractMapBasedMultimap, com.google.common.collect.Multimap, com.google.common.collect.ListMultimap
    public SortedSet get(Object obj) {
        return (SortedSet) super.get(obj);
    }
}
