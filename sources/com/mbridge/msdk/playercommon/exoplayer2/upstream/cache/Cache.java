package com.mbridge.msdk.playercommon.exoplayer2.upstream.cache;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.io.File;
import java.io.IOException;
import java.util.NavigableSet;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public interface Cache {

    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    public static class CacheException extends IOException {
        public CacheException(String str) {
            super(str);
        }

        public CacheException(Throwable th2) {
            super(th2);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    public interface Listener {
        void onSpanAdded(Cache cache, CacheSpan cacheSpan);

        void onSpanRemoved(Cache cache, CacheSpan cacheSpan);

        void onSpanTouched(Cache cache, CacheSpan cacheSpan, CacheSpan cacheSpan2);
    }

    @NonNull
    NavigableSet<CacheSpan> addListener(String str, Listener listener);

    void applyContentMetadataMutations(String str, ContentMetadataMutations contentMetadataMutations) throws CacheException;

    void commitFile(File file) throws CacheException;

    long getCacheSpace();

    long getCachedLength(String str, long j10, long j11);

    @NonNull
    NavigableSet<CacheSpan> getCachedSpans(String str);

    long getContentLength(String str);

    ContentMetadata getContentMetadata(String str);

    Set<String> getKeys();

    boolean isCached(String str, long j10, long j11);

    void release() throws CacheException;

    void releaseHoleSpan(CacheSpan cacheSpan);

    void removeListener(String str, Listener listener);

    void removeSpan(CacheSpan cacheSpan) throws CacheException;

    void setContentLength(String str, long j10) throws CacheException;

    File startFile(String str, long j10, long j11) throws CacheException;

    CacheSpan startReadWrite(String str, long j10) throws InterruptedException, CacheException;

    @Nullable
    CacheSpan startReadWriteNonBlocking(String str, long j10) throws CacheException;
}
