package com.google.common.collect;

import java.util.Map;
import java.util.Set;

/* JADX INFO: compiled from: SetMultimap.java */
/* JADX INFO: loaded from: classes3.dex */
public interface homozygous<K, V> extends claque<K, V> {
    @Override // com.google.common.collect.claque
    Set<Map.Entry<K, V>> entries();

    @Override // com.google.common.collect.claque, com.google.common.collect.unconsolidated
    Set<V> get(K k);
}
