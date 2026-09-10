package com.google.common.collect;

import java.util.Map;

/* JADX INFO: loaded from: classes4.dex */
@ElementTypesAreNonnullByDefault
public abstract class ForwardingMapEntry<K, V> extends ForwardingObject implements Map.Entry<K, V> {
    @Override // java.util.Map.Entry
    public boolean equals(Object obj) {
        return w().equals(obj);
    }

    @Override // java.util.Map.Entry
    public final Object getKey() {
        return w().getKey();
    }

    @Override // java.util.Map.Entry
    public Object getValue() {
        return w().getValue();
    }

    @Override // java.util.Map.Entry
    public final int hashCode() {
        return w().hashCode();
    }

    public Object setValue(Object obj) {
        return w().setValue(obj);
    }

    @Override // com.google.common.collect.ForwardingObject
    /* JADX INFO: renamed from: x, reason: merged with bridge method [inline-methods] */
    public abstract Map.Entry w();
}
