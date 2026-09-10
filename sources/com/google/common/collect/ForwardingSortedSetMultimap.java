package com.google.common.collect;

import java.util.SortedSet;

/* JADX INFO: loaded from: classes4.dex */
@ElementTypesAreNonnullByDefault
public abstract class ForwardingSortedSetMultimap<K, V> extends ForwardingSetMultimap<K, V> implements SortedSetMultimap<K, V> {
    @Override // com.google.common.collect.ForwardingSetMultimap
    /* JADX INFO: renamed from: z, reason: merged with bridge method [inline-methods] */
    public abstract SortedSetMultimap x();

    @Override // com.google.common.collect.ForwardingSetMultimap, com.google.common.collect.ForwardingMultimap, com.google.common.collect.Multimap, com.google.common.collect.ListMultimap
    public final SortedSet a(Object obj) {
        return x().a(obj);
    }

    @Override // com.google.common.collect.ForwardingSetMultimap, com.google.common.collect.ForwardingMultimap, com.google.common.collect.Multimap, com.google.common.collect.ListMultimap
    public final SortedSet get(Object obj) {
        return x().get(obj);
    }
}
