package com.google.common.collect;

import java.util.Collection;
import java.util.Map;
import java.util.Set;
import javax.annotation.CheckForNull;

/* JADX INFO: compiled from: Multimap.java */
/* JADX INFO: loaded from: classes3.dex */
public interface claque<K, V> {
    Map<K, Collection<V>> asMap();

    void clear();

    boolean containsEntry(@CheckForNull Object obj, @CheckForNull Object obj2);

    boolean containsKey(@CheckForNull Object obj);

    Collection<Map.Entry<K, V>> entries();

    Collection<V> get(K k);

    boolean isEmpty();

    Set<K> keySet();

    boolean put(K k, V v);

    boolean putAll(claque<? extends K, ? extends V> claqueVar);

    boolean remove(@CheckForNull Object obj, @CheckForNull Object obj2);

    Collection<V> removeAll(@CheckForNull Object obj);

    int size();

    Collection<V> values();
}
