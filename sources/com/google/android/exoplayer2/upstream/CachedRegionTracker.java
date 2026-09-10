package com.google.android.exoplayer2.upstream;

import com.google.android.exoplayer2.upstream.cache.Cache;
import com.google.android.exoplayer2.upstream.cache.CacheSpan;

/* JADX INFO: loaded from: classes3.dex */
public final class CachedRegionTracker implements Cache.Listener {

    public static class Region implements Comparable<Region> {
        @Override // java.lang.Comparable
        public final int compareTo(Region region) {
            throw null;
        }
    }

    @Override // com.google.android.exoplayer2.upstream.cache.Cache.Listener
    public final synchronized void onSpanAdded(Cache cache, CacheSpan cacheSpan) {
        throw null;
    }

    @Override // com.google.android.exoplayer2.upstream.cache.Cache.Listener
    public final synchronized void onSpanRemoved(Cache cache, CacheSpan cacheSpan) {
        long j = cacheSpan.f18852Y;
        throw null;
    }

    @Override // com.google.android.exoplayer2.upstream.cache.Cache.Listener
    public final void onSpanTouched(Cache cache, CacheSpan cacheSpan, CacheSpan cacheSpan2) {
    }
}
