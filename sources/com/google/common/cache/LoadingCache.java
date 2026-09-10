package com.google.common.cache;

import com.google.common.base.Function;

/* JADX INFO: loaded from: classes4.dex */
@ElementTypesAreNonnullByDefault
public interface LoadingCache<K, V> extends Cache<K, V>, Function<K, V> {
    Object get(Object obj);
}
