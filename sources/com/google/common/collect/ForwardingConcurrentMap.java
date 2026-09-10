package com.google.common.collect;

import java.util.concurrent.ConcurrentMap;

/* JADX INFO: loaded from: classes4.dex */
@ElementTypesAreNonnullByDefault
public abstract class ForwardingConcurrentMap<K, V> extends ForwardingMap<K, V> implements ConcurrentMap<K, V> {
    @Override // java.util.Map, java.util.concurrent.ConcurrentMap
    public final Object putIfAbsent(Object obj, Object obj2) {
        return x().putIfAbsent(obj, obj2);
    }

    @Override // java.util.Map, java.util.concurrent.ConcurrentMap
    public final boolean remove(Object obj, Object obj2) {
        return x().remove(obj, obj2);
    }

    @Override // java.util.Map, java.util.concurrent.ConcurrentMap
    public final Object replace(Object obj, Object obj2) {
        return x().replace(obj, obj2);
    }

    @Override // com.google.common.collect.ForwardingMap
    /* JADX INFO: renamed from: z, reason: merged with bridge method [inline-methods] */
    public abstract ConcurrentMap x();

    @Override // java.util.Map, java.util.concurrent.ConcurrentMap
    public final boolean replace(Object obj, Object obj2, Object obj3) {
        return x().replace(obj, obj2, obj3);
    }
}
