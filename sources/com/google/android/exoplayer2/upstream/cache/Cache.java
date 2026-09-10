package com.google.android.exoplayer2.upstream.cache;

import java.io.File;
import java.io.IOException;

/* JADX INFO: loaded from: classes3.dex */
public interface Cache {

    public static class CacheException extends IOException {
    }

    public interface Listener {
        void onSpanAdded(Cache cache, CacheSpan cacheSpan);

        void onSpanRemoved(Cache cache, CacheSpan cacheSpan);

        void onSpanTouched(Cache cache, CacheSpan cacheSpan, CacheSpan cacheSpan2);
    }

    void a(String str, ContentMetadataMutations contentMetadataMutations);

    CacheSpan b(long j, long j2, String str);

    void c(CacheSpan cacheSpan);

    CacheSpan d(long j, long j2, String str);

    void e(CacheSpan cacheSpan);

    long f(long j, long j2, String str);

    void g(File file, long j);

    long getCachedLength(String str, long j, long j2);

    DefaultContentMetadata getContentMetadata(String str);

    void h(String str);

    File startFile(String str, long j, long j2);
}
