package androidx.collection;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0001¨\u0006\u0002"}, d2 = {"androidx/collection/LruCacheKt$lruCache$4", "Landroidx/collection/LruCache;", "collection"}, k = 1, mv = {1, 9, 0}, xi = 176)
public final class LruCacheKt$lruCache$4 extends LruCache<Object, Object> {
    @Override // androidx.collection.LruCache
    public final Object create(Object key) {
        Intrinsics.f(key, "key");
        throw null;
    }

    @Override // androidx.collection.LruCache
    public final void entryRemoved(boolean z2, Object key, Object oldValue, Object obj) {
        Intrinsics.f(key, "key");
        Intrinsics.f(oldValue, "oldValue");
        throw null;
    }

    @Override // androidx.collection.LruCache
    public final int sizeOf(Object key, Object value) {
        Intrinsics.f(key, "key");
        Intrinsics.f(value, "value");
        throw null;
    }
}
