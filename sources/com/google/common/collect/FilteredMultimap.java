package com.google.common.collect;

import com.google.common.base.Predicate;

/* JADX INFO: loaded from: classes4.dex */
@ElementTypesAreNonnullByDefault
interface FilteredMultimap<K, V> extends Multimap<K, V> {
    Multimap i();

    Predicate t();
}
