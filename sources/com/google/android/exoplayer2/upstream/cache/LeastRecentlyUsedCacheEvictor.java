package com.google.android.exoplayer2.upstream.cache;

/* JADX INFO: loaded from: classes3.dex */
public final class LeastRecentlyUsedCacheEvictor implements CacheEvictor {
    @Override // com.google.android.exoplayer2.upstream.cache.CacheEvictor
    public final void onCacheInitialized() {
    }

    @Override // com.google.android.exoplayer2.upstream.cache.Cache.Listener
    public final void onSpanAdded(Cache cache, CacheSpan cacheSpan) {
        throw null;
    }

    @Override // com.google.android.exoplayer2.upstream.cache.Cache.Listener
    public final void onSpanRemoved(Cache cache, CacheSpan cacheSpan) {
        throw null;
    }

    @Override // com.google.android.exoplayer2.upstream.cache.Cache.Listener
    public final void onSpanTouched(Cache cache, CacheSpan cacheSpan, CacheSpan cacheSpan2) {
        throw null;
    }

    @Override // com.google.android.exoplayer2.upstream.cache.CacheEvictor
    public final void onStartFile(Cache cache, String str, long j, long j2) {
        if (j2 != -1) {
            throw null;
        }
    }

    @Override // com.google.android.exoplayer2.upstream.cache.CacheEvictor
    public final boolean requiresCacheSpanTouches() {
        return true;
    }
}
