package com.google.common.collect;

import java.util.Collection;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes4.dex */
@ElementTypesAreNonnullByDefault
public abstract class ForwardingMultimap<K, V> extends ForwardingObject implements Multimap<K, V> {
    public Collection a(Object obj) {
        return x().a(obj);
    }

    @Override // com.google.common.collect.Multimap
    public void clear() {
        x().clear();
    }

    @Override // com.google.common.collect.Multimap
    public final boolean containsKey(Object obj) {
        return x().containsKey(obj);
    }

    @Override // com.google.common.collect.Multimap
    public Collection d() {
        return x().d();
    }

    @Override // com.google.common.collect.Multimap
    public final boolean equals(Object obj) {
        return obj == this || x().equals(obj);
    }

    public Collection get(Object obj) {
        return x().get(obj);
    }

    @Override // com.google.common.collect.Multimap
    public Multiset h() {
        return x().h();
    }

    @Override // com.google.common.collect.Multimap
    public final int hashCode() {
        return x().hashCode();
    }

    @Override // com.google.common.collect.Multimap
    public final boolean isEmpty() {
        return x().isEmpty();
    }

    @Override // com.google.common.collect.Multimap
    public Set keySet() {
        return x().keySet();
    }

    @Override // com.google.common.collect.Multimap
    public boolean put(Object obj, Object obj2) {
        return x().put(obj, obj2);
    }

    @Override // com.google.common.collect.Multimap
    public boolean remove(Object obj, Object obj2) {
        return x().remove(obj, obj2);
    }

    @Override // com.google.common.collect.Multimap
    public final int size() {
        return x().size();
    }

    @Override // com.google.common.collect.Multimap
    public Map u() {
        return x().u();
    }

    @Override // com.google.common.collect.Multimap
    public final boolean v(Object obj, Object obj2) {
        return x().v(obj, obj2);
    }

    @Override // com.google.common.collect.Multimap
    public Collection values() {
        return x().values();
    }

    @Override // com.google.common.collect.ForwardingObject
    public abstract Multimap x();
}
