package com.google.common.collect;

/* JADX INFO: loaded from: classes4.dex */
@ElementTypesAreNonnullByDefault
interface FilteredSetMultimap<K, V> extends FilteredMultimap<K, V>, SetMultimap<K, V> {
    @Override // com.google.common.collect.FilteredMultimap
    /* bridge */ /* synthetic */ default Multimap i() {
        return null;
    }
}
