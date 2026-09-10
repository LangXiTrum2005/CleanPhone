package com.google.common.collect;

import java.util.Set;
import java.util.SortedMap;
import java.util.SortedSet;

/* JADX INFO: loaded from: classes4.dex */
@ElementTypesAreNonnullByDefault
abstract class AbstractSortedKeySortedSetMultimap<K, V> extends AbstractSortedSetMultimap<K, V> {
    @Override // com.google.common.collect.AbstractMultimap, com.google.common.collect.Multimap
    /* JADX INFO: renamed from: D, reason: merged with bridge method [inline-methods] */
    public SortedMap u() {
        return (SortedMap) super.u();
    }

    @Override // com.google.common.collect.AbstractMultimap, com.google.common.collect.Multimap
    /* JADX INFO: renamed from: E, reason: merged with bridge method [inline-methods] */
    public SortedSet keySet() {
        return (SortedSet) super.keySet();
    }

    @Override // com.google.common.collect.AbstractMapBasedMultimap, com.google.common.collect.AbstractMultimap
    public final Set k() {
        return r();
    }
}
