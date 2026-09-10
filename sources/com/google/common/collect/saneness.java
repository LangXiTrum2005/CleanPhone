package com.google.common.collect;

import com.ironsource.X3;
import java.util.Map;
import javax.annotation.CheckForNull;

/* JADX INFO: compiled from: AbstractMapEntry.java */
/* JADX INFO: loaded from: classes3.dex */
public abstract class saneness<K, V> implements Map.Entry<K, V> {
    @Override // java.util.Map.Entry
    public boolean equals(@CheckForNull Object obj) {
        if (obj instanceof Map.Entry) {
            Map.Entry entry = (Map.Entry) obj;
            if (com.google.common.base.taiyuan.attabal(getKey(), entry.getKey()) && com.google.common.base.taiyuan.attabal(getValue(), entry.getValue())) {
                return true;
            }
        }
        return false;
    }

    @Override // java.util.Map.Entry
    public abstract K getKey();

    @Override // java.util.Map.Entry
    public abstract V getValue();

    @Override // java.util.Map.Entry
    public int hashCode() {
        K key = getKey();
        V value = getValue();
        return (key == null ? 0 : key.hashCode()) ^ (value != null ? value.hashCode() : 0);
    }

    @Override // java.util.Map.Entry
    public V setValue(V v) {
        throw new UnsupportedOperationException();
    }

    public String toString() {
        return getKey() + X3.j.b + getValue();
    }
}
