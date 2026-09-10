package com.google.common.cache;

import A.W;
import com.google.common.util.concurrent.Futures;
import com.google.common.util.concurrent.ListenableFuture;
import com.google.common.util.concurrent.ListenableFutureTask;
import java.io.Serializable;

/* JADX INFO: loaded from: classes4.dex */
@ElementTypesAreNonnullByDefault
public abstract class CacheLoader<K, V> {

    /* JADX INFO: renamed from: com.google.common.cache.CacheLoader$1, reason: invalid class name */
    class AnonymousClass1 extends CacheLoader<Object, Object> {
        @Override // com.google.common.cache.CacheLoader
        public final Object a(Object obj) {
            throw null;
        }

        @Override // com.google.common.cache.CacheLoader
        public final ListenableFuture b(Object obj, Object obj2) {
            new ListenableFutureTask(new W(1, obj, obj2));
            throw null;
        }
    }

    public static final class FunctionToCacheLoader<K, V> extends CacheLoader<K, V> implements Serializable {
        private static final long serialVersionUID = 0;

        @Override // com.google.common.cache.CacheLoader
        public final Object a(Object obj) {
            obj.getClass();
            throw null;
        }
    }

    public static final class InvalidCacheLoadException extends RuntimeException {
    }

    public static final class SupplierToCacheLoader<V> extends CacheLoader<Object, V> implements Serializable {
        private static final long serialVersionUID = 0;

        @Override // com.google.common.cache.CacheLoader
        public final Object a(Object obj) {
            obj.getClass();
            throw null;
        }
    }

    public static final class UnsupportedLoadingOperationException extends UnsupportedOperationException {
    }

    public abstract Object a(Object obj);

    public ListenableFuture b(Object obj, Object obj2) {
        obj.getClass();
        return Futures.c(a(obj));
    }
}
