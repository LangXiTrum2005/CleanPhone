package com.google.common.collect;

import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.util.Collection;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes4.dex */
@ElementTypesAreNonnullByDefault
public abstract class ImmutableBiMap<K, V> extends ImmutableMap<K, V> implements BiMap<K, V> {
    private static final long serialVersionUID = 912559;

    public static final class Builder<K, V> extends ImmutableMap.Builder<K, V> {
        @Override // com.google.common.collect.ImmutableMap.Builder
        public final ImmutableMap b() {
            return this.f19833b == 0 ? RegularImmutableBiMap.j0 : new RegularImmutableBiMap(this.f19832a, this.f19833b);
        }

        @Override // com.google.common.collect.ImmutableMap.Builder
        public final ImmutableMap.Builder c(Object obj, Object obj2) {
            super.c(obj, obj2);
            return this;
        }

        @Override // com.google.common.collect.ImmutableMap.Builder
        public final ImmutableMap.Builder d(Iterable iterable) {
            super.d(iterable);
            return this;
        }

        @Override // com.google.common.collect.ImmutableMap.Builder
        public final ImmutableMap.Builder e(Map map) {
            d(((ImmutableMap) map).entrySet());
            return this;
        }
    }

    public static class SerializedForm<K, V> extends ImmutableMap.SerializedForm<K, V> {
        private static final long serialVersionUID = 0;

        @Override // com.google.common.collect.ImmutableMap.SerializedForm
        public final ImmutableMap.Builder a(int i2) {
            return new Builder(i2);
        }
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Use SerializedForm");
    }

    @Override // com.google.common.collect.ImmutableMap
    public final ImmutableCollection i() {
        throw new AssertionError("should never be called");
    }

    @Override // com.google.common.collect.ImmutableMap
    /* JADX INFO: renamed from: t */
    public final ImmutableCollection values() {
        return H().keySet();
    }

    @Override // com.google.common.collect.BiMap
    /* JADX INFO: renamed from: u, reason: merged with bridge method [inline-methods] */
    public abstract ImmutableBiMap H();

    @Override // com.google.common.collect.ImmutableMap, java.util.Map
    public final Collection values() {
        return H().keySet();
    }

    @Override // com.google.common.collect.ImmutableMap
    public Object writeReplace() {
        return new SerializedForm(this);
    }

    @Override // com.google.common.collect.ImmutableMap, java.util.Map
    public final Set values() {
        return H().keySet();
    }
}
