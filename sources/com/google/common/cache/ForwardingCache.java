package com.google.common.cache;

import com.google.common.collect.ForwardingObject;

/* JADX INFO: loaded from: classes4.dex */
@ElementTypesAreNonnullByDefault
public abstract class ForwardingCache<K, V> extends ForwardingObject implements Cache<K, V> {

    public static abstract class SimpleForwardingCache<K, V> extends ForwardingCache<K, V> {
        @Override // com.google.common.cache.ForwardingCache, com.google.common.collect.ForwardingObject
        /* JADX INFO: renamed from: w */
        public final /* bridge */ /* synthetic */ Object x() {
            return null;
        }

        @Override // com.google.common.cache.ForwardingCache
        public final Cache x() {
            return null;
        }
    }

    @Override // com.google.common.collect.ForwardingObject
    public abstract Cache x();
}
