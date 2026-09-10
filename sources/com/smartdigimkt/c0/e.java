package com.smartdigimkt.c0;

import java.util.Collection;

/* JADX INFO: loaded from: classes5.dex */
public interface e<K, V> {
    Collection<K> a();

    void clear();

    V get(K k);

    boolean put(K k, V v);

    void remove(K k);
}
