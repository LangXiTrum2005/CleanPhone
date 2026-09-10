package com.google.common.collect;

import java.util.concurrent.ConcurrentMap;
import javax.annotation.CheckForNull;

/* JADX INFO: compiled from: ForwardingConcurrentMap.java */
/* JADX INFO: loaded from: classes3.dex */
public abstract class preterite<K, V> extends wostteth<K, V> implements ConcurrentMap<K, V> {
    @Override // com.google.common.collect.wostteth, com.google.common.collect.igbo
    /* JADX INFO: renamed from: delegate */
    public abstract ConcurrentMap<K, V> wireman();

    @Override // java.util.Map, java.util.concurrent.ConcurrentMap
    @CheckForNull
    public V putIfAbsent(K k, V v) {
        return wireman().putIfAbsent(k, v);
    }

    @Override // java.util.Map, java.util.concurrent.ConcurrentMap
    public boolean remove(@CheckForNull Object obj, @CheckForNull Object obj2) {
        return wireman().remove(obj, obj2);
    }

    @Override // java.util.Map, java.util.concurrent.ConcurrentMap
    @CheckForNull
    public V replace(K k, V v) {
        return wireman().replace(k, v);
    }

    @Override // java.util.Map, java.util.concurrent.ConcurrentMap
    public boolean replace(K k, V v, V v2) {
        return wireman().replace(k, v, v2);
    }
}
