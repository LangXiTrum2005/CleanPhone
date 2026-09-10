package com.google.common.collect;

import java.util.Collection;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes4.dex */
@ElementTypesAreNonnullByDefault
public abstract class ForwardingMap<K, V> extends ForwardingObject implements Map<K, V> {

    public abstract class StandardEntrySet extends Maps.EntrySet<K, V> {
        @Override // com.google.common.collect.Maps.EntrySet
        public final Map a() {
            return null;
        }
    }

    public class StandardKeySet extends Maps.KeySet<K, V> {
    }

    public class StandardValues extends Maps.Values<K, V> {
    }

    public void clear() {
        x().clear();
    }

    public boolean containsKey(Object obj) {
        return x().containsKey(obj);
    }

    public boolean containsValue(Object obj) {
        return x().containsValue(obj);
    }

    public Set entrySet() {
        return x().entrySet();
    }

    public boolean equals(Object obj) {
        return obj == this || x().equals(obj);
    }

    public Object get(Object obj) {
        return x().get(obj);
    }

    public int hashCode() {
        return x().hashCode();
    }

    public boolean isEmpty() {
        return x().isEmpty();
    }

    public Set keySet() {
        return x().keySet();
    }

    public Object put(Object obj, Object obj2) {
        return x().put(obj, obj2);
    }

    public void putAll(Map map) {
        x().putAll(map);
    }

    public Object remove(Object obj) {
        return x().remove(obj);
    }

    public int size() {
        return x().size();
    }

    public Collection values() {
        return x().values();
    }

    @Override // com.google.common.collect.ForwardingObject
    public abstract Map x();

    public final boolean y(Object obj) {
        return Iterators.d(new Maps.AnonymousClass2(entrySet().iterator()), obj);
    }
}
