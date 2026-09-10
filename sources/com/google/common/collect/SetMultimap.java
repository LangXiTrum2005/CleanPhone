package com.google.common.collect;

import java.util.Set;

/* JADX INFO: loaded from: classes4.dex */
@ElementTypesAreNonnullByDefault
public interface SetMultimap<K, V> extends Multimap<K, V> {
    @Override // com.google.common.collect.Multimap, com.google.common.collect.ListMultimap
    Set a(Object obj);

    @Override // com.google.common.collect.Multimap
    Set d();

    @Override // com.google.common.collect.Multimap, com.google.common.collect.ListMultimap
    Set get(Object obj);
}
