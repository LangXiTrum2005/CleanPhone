package com.google.common.collect;

import java.io.Serializable;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: classes4.dex */
@ElementTypesAreNonnullByDefault
final class ImmutableMapKeySet<K, V> extends IndexedImmutableSet<K> {
    public final ImmutableMap e0;

    public static class KeySetSerializedForm<K> implements Serializable {
        private static final long serialVersionUID = 0;
        public final ImmutableMap X;

        public KeySetSerializedForm(ImmutableMap immutableMap) {
            this.X = immutableMap;
        }

        public Object readResolve() {
            return this.X.keySet();
        }
    }

    public ImmutableMapKeySet(ImmutableMap immutableMap) {
        this.e0 = immutableMap;
    }

    @Override // com.google.common.collect.ImmutableCollection, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        return this.e0.containsKey(obj);
    }

    @Override // com.google.common.collect.IndexedImmutableSet
    public final Object get(int i2) {
        return ((Map.Entry) this.e0.entrySet().d().get(i2)).getKey();
    }

    @Override // com.google.common.collect.IndexedImmutableSet, com.google.common.collect.ImmutableSet, com.google.common.collect.ImmutableCollection, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set, java.util.NavigableSet
    public final Iterator iterator() {
        return this.e0.m();
    }

    @Override // com.google.common.collect.ImmutableCollection
    public final boolean l() {
        return true;
    }

    @Override // com.google.common.collect.IndexedImmutableSet, com.google.common.collect.ImmutableCollection
    /* JADX INFO: renamed from: o */
    public final UnmodifiableIterator iterator() {
        return this.e0.m();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.e0.size();
    }

    @Override // com.google.common.collect.IndexedImmutableSet, com.google.common.collect.ImmutableSet, com.google.common.collect.ImmutableCollection
    public Object writeReplace() {
        return new KeySetSerializedForm(this.e0);
    }
}
