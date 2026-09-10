package com.google.common.collect;

import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: classes4.dex */
@ElementTypesAreNonnullByDefault
abstract class ImmutableMapEntrySet<K, V> extends ImmutableSet<Map.Entry<K, V>> {

    public static class EntrySetSerializedForm<K, V> implements Serializable {
        private static final long serialVersionUID = 0;
        public final ImmutableMap X;

        public EntrySetSerializedForm(ImmutableMap immutableMap) {
            this.X = immutableMap;
        }

        public Object readResolve() {
            return this.X.entrySet();
        }
    }

    public static final class RegularEntrySet<K, V> extends ImmutableMapEntrySet<K, V> {
        @Override // com.google.common.collect.ImmutableMapEntrySet
        public final ImmutableMap B() {
            return null;
        }

        @Override // com.google.common.collect.ImmutableCollection
        public final int e(int i2, Object[] objArr) {
            throw null;
        }

        @Override // com.google.common.collect.ImmutableSet, com.google.common.collect.ImmutableCollection, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set, java.util.NavigableSet
        public final Iterator iterator() {
            throw null;
        }

        @Override // com.google.common.collect.ImmutableCollection
        /* JADX INFO: renamed from: o */
        public final UnmodifiableIterator iterator() {
            throw null;
        }

        @Override // com.google.common.collect.ImmutableSet
        public final ImmutableList w() {
            return null;
        }

        @Override // com.google.common.collect.ImmutableMapEntrySet, com.google.common.collect.ImmutableSet, com.google.common.collect.ImmutableCollection
        public Object writeReplace() {
            return super.writeReplace();
        }
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Use EntrySetSerializedForm");
    }

    public abstract ImmutableMap B();

    @Override // com.google.common.collect.ImmutableCollection, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        if (!(obj instanceof Map.Entry)) {
            return false;
        }
        Map.Entry entry = (Map.Entry) obj;
        Object obj2 = B().get(entry.getKey());
        return obj2 != null && obj2.equals(entry.getValue());
    }

    @Override // com.google.common.collect.ImmutableSet, java.util.Collection, java.util.Set
    public final int hashCode() {
        return B().hashCode();
    }

    @Override // com.google.common.collect.ImmutableCollection
    public final boolean l() {
        return B().l();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return B().size();
    }

    @Override // com.google.common.collect.ImmutableSet, com.google.common.collect.ImmutableCollection
    public Object writeReplace() {
        return new EntrySetSerializedForm(B());
    }

    @Override // com.google.common.collect.ImmutableSet
    public final boolean x() {
        return B().k();
    }
}
