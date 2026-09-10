package com.google.common.collect;

import java.io.Serializable;

/* JADX INFO: loaded from: classes4.dex */
@ElementTypesAreNonnullByDefault
class ImmutableEntry<K, V> extends AbstractMapEntry<K, V> implements Serializable {
    private static final long serialVersionUID = 0;
    public final Object X;

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    public final Object f19829Y;

    public ImmutableEntry(Object obj, Object obj2) {
        this.X = obj;
        this.f19829Y = obj2;
    }

    @Override // java.util.Map.Entry
    public final Object getKey() {
        return this.X;
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        return this.f19829Y;
    }

    @Override // com.google.common.collect.AbstractMapEntry, java.util.Map.Entry
    public final Object setValue(Object obj) {
        throw new UnsupportedOperationException();
    }
}
