package com.google.common.collect;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import javax.annotation.CheckForNull;

/* JADX INFO: compiled from: ForwardingMap.java */
/* JADX INFO: loaded from: classes3.dex */
public abstract class wostteth<K, V> extends igbo implements Map<K, V> {
    @Override // java.util.Map
    public void clear() {
        wireman().clear();
    }

    public boolean containsKey(@CheckForNull Object obj) {
        return wireman().containsKey(obj);
    }

    public boolean containsValue(@CheckForNull Object obj) {
        return wireman().containsValue(obj);
    }

    @Override // com.google.common.collect.igbo
    /* JADX INFO: renamed from: delegate */
    public abstract Map<K, V> wireman();

    public Set<Map.Entry<K, V>> entrySet() {
        return wireman().entrySet();
    }

    public boolean equals(@CheckForNull Object obj) {
        return obj == this || wireman().equals(obj);
    }

    @CheckForNull
    public V get(@CheckForNull Object obj) {
        return wireman().get(obj);
    }

    public int hashCode() {
        return wireman().hashCode();
    }

    public boolean isEmpty() {
        return wireman().isEmpty();
    }

    public Set<K> keySet() {
        return wireman().keySet();
    }

    @Override // java.util.Map
    @CheckForNull
    public V put(K k, V v) {
        return wireman().put(k, v);
    }

    @Override // java.util.Map
    public void putAll(Map<? extends K, ? extends V> map) {
        wireman().putAll(map);
    }

    @Override // java.util.Map
    @CheckForNull
    public V remove(@CheckForNull Object obj) {
        return wireman().remove(obj);
    }

    public int size() {
        return wireman().size();
    }

    public void standardClear() {
        Iterators.dern(entrySet().iterator());
    }

    public boolean standardContainsKey(@CheckForNull Object obj) {
        return Maps.saneness(this, obj);
    }

    public boolean standardContainsValue(@CheckForNull Object obj) {
        return Maps.dern(this, obj);
    }

    public boolean standardEquals(@CheckForNull Object obj) {
        return Maps.wireman(this, obj);
    }

    public int standardHashCode() {
        return Sets.wireman(entrySet());
    }

    public boolean standardIsEmpty() {
        return !entrySet().iterator().hasNext();
    }

    public void standardPutAll(Map<? extends K, ? extends V> map) {
        Maps.apical(this, map);
    }

    @CheckForNull
    public V standardRemove(@CheckForNull Object obj) {
        Iterator<Map.Entry<K, V>> it = entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry<K, V> next = it.next();
            if (com.google.common.base.taiyuan.attabal(next.getKey(), obj)) {
                V value = next.getValue();
                it.remove();
                return value;
            }
        }
        return null;
    }

    public String standardToString() {
        return Maps.kowloon(this);
    }

    public Collection<V> values() {
        return wireman().values();
    }
}
