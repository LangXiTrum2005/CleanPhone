package com.google.common.cache;

/* JADX INFO: loaded from: classes4.dex */
@ElementTypesAreNonnullByDefault
public abstract class ForwardingLoadingCache<K, V> extends ForwardingCache<K, V> implements LoadingCache<K, V> {

    public static abstract class SimpleForwardingLoadingCache<K, V> extends ForwardingLoadingCache<K, V> {
        @Override // com.google.common.cache.ForwardingLoadingCache, com.google.common.cache.ForwardingCache, com.google.common.collect.ForwardingObject
        /* JADX INFO: renamed from: w */
        public final /* bridge */ /* synthetic */ Object x() {
            return null;
        }

        @Override // com.google.common.cache.ForwardingLoadingCache, com.google.common.cache.ForwardingCache
        public final /* bridge */ /* synthetic */ Cache x() {
            return null;
        }
    }

    @Override // com.google.common.base.Function, androidx.arch.core.util.Function, com.google.android.datatransport.Transformer
    public final Object apply(Object obj) {
        throw null;
    }

    @Override // com.google.common.cache.ForwardingCache, com.google.common.collect.ForwardingObject
    /* JADX INFO: renamed from: w */
    public /* bridge */ /* synthetic */ Object x() {
        return null;
    }

    @Override // com.google.common.cache.ForwardingCache
    public /* bridge */ /* synthetic */ Cache x() {
        return null;
    }
}
