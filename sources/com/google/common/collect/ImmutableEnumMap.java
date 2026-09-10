package com.google.common.collect;

import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.lang.Enum;

/* JADX INFO: loaded from: classes4.dex */
@ElementTypesAreNonnullByDefault
final class ImmutableEnumMap<K extends Enum<K>, V> extends ImmutableMap.IteratorBasedImmutableMap<K, V> {

    public static class EnumSerializedForm<K extends Enum<K>, V> implements Serializable {
        private static final long serialVersionUID = 0;

        public Object readResolve() {
            throw null;
        }
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Use EnumSerializedForm");
    }

    @Override // com.google.common.collect.ImmutableMap, java.util.Map
    public final boolean containsKey(Object obj) {
        throw null;
    }

    @Override // com.google.common.collect.ImmutableMap, java.util.Map
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ImmutableEnumMap)) {
            throw null;
        }
        throw null;
    }

    @Override // com.google.common.collect.ImmutableMap, java.util.Map
    public final Object get(Object obj) {
        throw null;
    }

    @Override // com.google.common.collect.ImmutableMap
    public final boolean l() {
        return false;
    }

    @Override // com.google.common.collect.ImmutableMap
    public final UnmodifiableIterator m() {
        throw null;
    }

    @Override // java.util.Map
    public final int size() {
        throw null;
    }

    @Override // com.google.common.collect.ImmutableMap.IteratorBasedImmutableMap
    public final UnmodifiableIterator u() {
        throw null;
    }

    @Override // com.google.common.collect.ImmutableMap.IteratorBasedImmutableMap, com.google.common.collect.ImmutableMap
    public Object writeReplace() {
        throw null;
    }
}
