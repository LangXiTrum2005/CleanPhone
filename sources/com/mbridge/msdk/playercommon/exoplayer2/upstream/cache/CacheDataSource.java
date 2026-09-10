package com.mbridge.msdk.playercommon.exoplayer2.upstream.cache;

import android.net.Uri;
import androidx.annotation.Nullable;
import com.mbridge.msdk.playercommon.exoplayer2.upstream.DataSink;
import com.mbridge.msdk.playercommon.exoplayer2.upstream.DataSource;
import com.mbridge.msdk.playercommon.exoplayer2.upstream.DataSourceException;
import com.mbridge.msdk.playercommon.exoplayer2.upstream.DataSpec;
import com.mbridge.msdk.playercommon.exoplayer2.upstream.FileDataSource;
import com.mbridge.msdk.playercommon.exoplayer2.upstream.TeeDataSource;
import com.mbridge.msdk.playercommon.exoplayer2.util.Assertions;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public final class CacheDataSource implements DataSource {
    public static final int CACHE_IGNORED_REASON_ERROR = 0;
    public static final int CACHE_IGNORED_REASON_UNSET_LENGTH = 1;
    private static final int CACHE_NOT_IGNORED = -1;
    public static final long DEFAULT_MAX_CACHE_FILE_SIZE = 2097152;
    public static final int FLAG_BLOCK_ON_CACHE = 1;
    public static final int FLAG_IGNORE_CACHE_FOR_UNSET_LENGTH_REQUESTS = 4;
    public static final int FLAG_IGNORE_CACHE_ON_ERROR = 2;
    private static final long MIN_READ_BEFORE_CHECKING_CACHE = 102400;
    private Uri actualUri;
    private final boolean blockOnCache;
    private long bytesRemaining;
    private final Cache cache;
    private final DataSource cacheReadDataSource;
    private final DataSource cacheWriteDataSource;
    private long checkCachePosition;
    private DataSource currentDataSource;
    private boolean currentDataSpecLengthUnset;
    private CacheSpan currentHoleSpan;
    private boolean currentRequestIgnoresCache;

    @Nullable
    private final EventListener eventListener;
    private int flags;
    private final boolean ignoreCacheForUnsetLengthRequests;
    private final boolean ignoreCacheOnError;
    private String key;
    private long readPosition;
    private boolean seenCacheError;
    private long totalCachedBytesRead;
    private final DataSource upstreamDataSource;
    private Uri uri;

    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    @Retention(RetentionPolicy.SOURCE)
    public @interface CacheIgnoredReason {
    }

    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    public interface EventListener {
        void onCacheIgnored(int i10);

        void onCachedBytesRead(long j10, long j11);
    }

    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    @Retention(RetentionPolicy.SOURCE)
    public @interface Flags {
    }

    public CacheDataSource(Cache cache, DataSource dataSource) {
        this(cache, dataSource, 0, DEFAULT_MAX_CACHE_FILE_SIZE);
    }

    private void closeCurrentSource() throws IOException {
        DataSource dataSource = this.currentDataSource;
        if (dataSource == null) {
            return;
        }
        try {
            dataSource.close();
        } finally {
            this.currentDataSource = null;
            this.currentDataSpecLengthUnset = false;
            CacheSpan cacheSpan = this.currentHoleSpan;
            if (cacheSpan != null) {
                this.cache.releaseHoleSpan(cacheSpan);
                this.currentHoleSpan = null;
            }
        }
    }

    private static Uri getRedirectedUriOrDefault(Cache cache, String str, Uri uri) {
        Uri redirectedUri = ContentMetadataInternal.getRedirectedUri(cache.getContentMetadata(str));
        return redirectedUri == null ? uri : redirectedUri;
    }

    private void handleBeforeThrow(IOException iOException) {
        if (isReadingFromCache() || (iOException instanceof Cache.CacheException)) {
            this.seenCacheError = true;
        }
    }

    private boolean isBypassingCache() {
        return this.currentDataSource == this.upstreamDataSource;
    }

    private static boolean isCausedByPositionOutOfRange(IOException iOException) {
        for (Throwable cause = iOException; cause != null; cause = cause.getCause()) {
            if ((cause instanceof DataSourceException) && ((DataSourceException) cause).reason == 0) {
                return true;
            }
        }
        return false;
    }

    private boolean isReadingFromCache() {
        return this.currentDataSource == this.cacheReadDataSource;
    }

    private boolean isReadingFromUpstream() {
        return !isReadingFromCache();
    }

    private boolean isWritingToCache() {
        return this.currentDataSource == this.cacheWriteDataSource;
    }

    private void notifyBytesRead() {
        EventListener eventListener = this.eventListener;
        if (eventListener == null || this.totalCachedBytesRead <= 0) {
            return;
        }
        eventListener.onCachedBytesRead(this.cache.getCacheSpace(), this.totalCachedBytesRead);
        this.totalCachedBytesRead = 0L;
    }

    private void notifyCacheIgnored(int i10) {
        EventListener eventListener = this.eventListener;
        if (eventListener != null) {
            eventListener.onCacheIgnored(i10);
        }
    }

    /* JADX WARN: Code duplicated, block: B:39:0x00b6  */
    /* JADX WARN: Code duplicated, block: B:42:0x00bf  */
    /* JADX WARN: Code duplicated, block: B:58:0x00ee  */
    /* JADX WARN: Code duplicated, block: B:59:0x00f0  */
    /* JADX WARN: Code duplicated, block: B:67:0x0112  */
    /* JADX WARN: Code duplicated, block: B:69:0x0122  */
    /* JADX WARN: Code duplicated, block: B:70:0x0128  */
    /* JADX WARN: Code duplicated, block: B:73:0x0131  */
    /* JADX WARN: Code duplicated, block: B:77:0x00cb A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:79:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:80:? A[RETURN, SYNTHETIC] */
    private void openNextSource(boolean z10) throws IOException {
        CacheSpan cacheSpanStartReadWrite;
        long jMin;
        DataSpec dataSpec;
        CacheSpan cacheSpan;
        DataSource dataSource;
        DataSpec dataSpec2;
        long j10;
        boolean z11;
        long jOpen;
        ContentMetadataMutations contentMetadataMutations;
        Uri uri;
        if (this.currentRequestIgnoresCache) {
            cacheSpanStartReadWrite = null;
        } else if (this.blockOnCache) {
            try {
                cacheSpanStartReadWrite = this.cache.startReadWrite(this.key, this.readPosition);
            } catch (InterruptedException unused) {
                Thread.currentThread().interrupt();
                throw new InterruptedIOException();
            }
        } else {
            cacheSpanStartReadWrite = this.cache.startReadWriteNonBlocking(this.key, this.readPosition);
        }
        if (cacheSpanStartReadWrite != null) {
            if (cacheSpanStartReadWrite.isCached) {
                Uri uriFromFile = Uri.fromFile(cacheSpanStartReadWrite.file);
                long j11 = this.readPosition - cacheSpanStartReadWrite.position;
                long jMin2 = cacheSpanStartReadWrite.length - j11;
                long j12 = this.bytesRemaining;
                if (j12 != -1) {
                    jMin2 = Math.min(jMin2, j12);
                }
                dataSpec2 = new DataSpec(uriFromFile, this.readPosition, j11, jMin2, this.key, this.flags);
                dataSource = this.cacheReadDataSource;
            } else {
                if (cacheSpanStartReadWrite.isOpenEnded()) {
                    jMin = this.bytesRemaining;
                } else {
                    jMin = cacheSpanStartReadWrite.length;
                    long j13 = this.bytesRemaining;
                    if (j13 != -1) {
                        jMin = Math.min(jMin, j13);
                    }
                }
                dataSpec = new DataSpec(this.uri, this.readPosition, jMin, this.key, this.flags);
                DataSource dataSource2 = this.cacheWriteDataSource;
                if (dataSource2 != null) {
                    dataSource = dataSource2;
                    cacheSpan = cacheSpanStartReadWrite;
                } else {
                    DataSource dataSource3 = this.upstreamDataSource;
                    this.cache.releaseHoleSpan(cacheSpanStartReadWrite);
                    cacheSpan = null;
                    dataSource = dataSource3;
                }
            }
            if (this.currentRequestIgnoresCache && dataSource == this.upstreamDataSource) {
                j10 = this.readPosition + MIN_READ_BEFORE_CHECKING_CACHE;
            } else {
                j10 = Long.MAX_VALUE;
            }
            this.checkCachePosition = j10;
            if (z10) {
                Assertions.checkState(isBypassingCache());
                if (dataSource == this.upstreamDataSource) {
                    return;
                }
                try {
                    closeCurrentSource();
                } catch (Throwable th2) {
                    if (cacheSpan.isHoleSpan()) {
                        this.cache.releaseHoleSpan(cacheSpan);
                    }
                    throw th2;
                }
            }
            if (cacheSpan != null && cacheSpan.isHoleSpan()) {
                this.currentHoleSpan = cacheSpan;
            }
            this.currentDataSource = dataSource;
            if (dataSpec.length == -1) {
                z11 = true;
            } else {
                z11 = false;
            }
            this.currentDataSpecLengthUnset = z11;
            jOpen = dataSource.open(dataSpec);
            contentMetadataMutations = new ContentMetadataMutations();
            if (this.currentDataSpecLengthUnset && jOpen != -1) {
                this.bytesRemaining = jOpen;
                ContentMetadataInternal.setContentLength(contentMetadataMutations, this.readPosition + jOpen);
            }
            if (isReadingFromUpstream()) {
                uri = this.currentDataSource.getUri();
                this.actualUri = uri;
                if (this.uri.equals(uri)) {
                    ContentMetadataInternal.removeRedirectedUri(contentMetadataMutations);
                } else {
                    ContentMetadataInternal.setRedirectedUri(contentMetadataMutations, this.actualUri);
                }
            }
            if (isWritingToCache()) {
                this.cache.applyContentMetadataMutations(this.key, contentMetadataMutations);
            }
        }
        dataSource = this.upstreamDataSource;
        dataSpec2 = new DataSpec(this.uri, this.readPosition, this.bytesRemaining, this.key, this.flags);
        dataSpec = dataSpec2;
        cacheSpan = cacheSpanStartReadWrite;
        if (this.currentRequestIgnoresCache) {
            j10 = Long.MAX_VALUE;
        } else {
            j10 = Long.MAX_VALUE;
        }
        this.checkCachePosition = j10;
        if (z10) {
            Assertions.checkState(isBypassingCache());
            if (dataSource == this.upstreamDataSource) {
                return;
            } else {
                closeCurrentSource();
            }
        }
        if (cacheSpan != null) {
            this.currentHoleSpan = cacheSpan;
        }
        this.currentDataSource = dataSource;
        if (dataSpec.length == -1) {
            z11 = true;
        } else {
            z11 = false;
        }
        this.currentDataSpecLengthUnset = z11;
        jOpen = dataSource.open(dataSpec);
        contentMetadataMutations = new ContentMetadataMutations();
        if (this.currentDataSpecLengthUnset) {
            this.bytesRemaining = jOpen;
            ContentMetadataInternal.setContentLength(contentMetadataMutations, this.readPosition + jOpen);
        }
        if (isReadingFromUpstream()) {
            uri = this.currentDataSource.getUri();
            this.actualUri = uri;
            if (this.uri.equals(uri)) {
                ContentMetadataInternal.setRedirectedUri(contentMetadataMutations, this.actualUri);
            } else {
                ContentMetadataInternal.removeRedirectedUri(contentMetadataMutations);
            }
        }
        if (isWritingToCache()) {
            this.cache.applyContentMetadataMutations(this.key, contentMetadataMutations);
        }
    }

    private void setNoBytesRemainingAndMaybeStoreLength() throws IOException {
        this.bytesRemaining = 0L;
        if (isWritingToCache()) {
            this.cache.setContentLength(this.key, this.readPosition);
        }
    }

    private int shouldIgnoreCacheForRequest(DataSpec dataSpec) {
        if (this.ignoreCacheOnError && this.seenCacheError) {
            return 0;
        }
        return (this.ignoreCacheForUnsetLengthRequests && dataSpec.length == -1) ? 1 : -1;
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.upstream.DataSource
    public void close() throws IOException {
        this.uri = null;
        this.actualUri = null;
        notifyBytesRead();
        try {
            closeCurrentSource();
        } catch (IOException e10) {
            handleBeforeThrow(e10);
            throw e10;
        }
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.upstream.DataSource
    public Uri getUri() {
        return this.actualUri;
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.upstream.DataSource
    public long open(DataSpec dataSpec) throws IOException {
        try {
            String key = CacheUtil.getKey(dataSpec);
            this.key = key;
            Uri uri = dataSpec.uri;
            this.uri = uri;
            this.actualUri = getRedirectedUriOrDefault(this.cache, key, uri);
            this.flags = dataSpec.flags;
            this.readPosition = dataSpec.position;
            int iShouldIgnoreCacheForRequest = shouldIgnoreCacheForRequest(dataSpec);
            boolean z10 = iShouldIgnoreCacheForRequest != -1;
            this.currentRequestIgnoresCache = z10;
            if (z10) {
                notifyCacheIgnored(iShouldIgnoreCacheForRequest);
            }
            long j10 = dataSpec.length;
            if (j10 != -1 || this.currentRequestIgnoresCache) {
                this.bytesRemaining = j10;
            } else {
                long contentLength = this.cache.getContentLength(this.key);
                this.bytesRemaining = contentLength;
                if (contentLength != -1) {
                    long j11 = contentLength - dataSpec.position;
                    this.bytesRemaining = j11;
                    if (j11 <= 0) {
                        throw new DataSourceException(0);
                    }
                }
            }
            openNextSource(false);
            return this.bytesRemaining;
        } catch (IOException e10) {
            handleBeforeThrow(e10);
            throw e10;
        }
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.upstream.DataSource
    public int read(byte[] bArr, int i10, int i11) throws IOException {
        if (i11 == 0) {
            return 0;
        }
        if (this.bytesRemaining == 0) {
            return -1;
        }
        try {
            if (this.readPosition >= this.checkCachePosition) {
                openNextSource(true);
            }
            int i12 = this.currentDataSource.read(bArr, i10, i11);
            if (i12 == -1) {
                if (this.currentDataSpecLengthUnset) {
                    setNoBytesRemainingAndMaybeStoreLength();
                    return i12;
                }
                long j10 = this.bytesRemaining;
                if (j10 <= 0) {
                    if (j10 == -1) {
                    }
                }
                closeCurrentSource();
                openNextSource(false);
                return read(bArr, i10, i11);
            }
            if (isReadingFromCache()) {
                this.totalCachedBytesRead += (long) i12;
            }
            long j11 = i12;
            this.readPosition += j11;
            long j12 = this.bytesRemaining;
            if (j12 != -1) {
                this.bytesRemaining = j12 - j11;
                return i12;
            }
            return i12;
        } catch (IOException e10) {
            if (this.currentDataSpecLengthUnset && isCausedByPositionOutOfRange(e10)) {
                setNoBytesRemainingAndMaybeStoreLength();
                return -1;
            }
            handleBeforeThrow(e10);
            throw e10;
        }
    }

    public CacheDataSource(Cache cache, DataSource dataSource, int i10) {
        this(cache, dataSource, i10, DEFAULT_MAX_CACHE_FILE_SIZE);
    }

    public CacheDataSource(Cache cache, DataSource dataSource, int i10, long j10) {
        this(cache, dataSource, new FileDataSource(), new CacheDataSink(cache, j10), i10, null);
    }

    public CacheDataSource(Cache cache, DataSource dataSource, DataSource dataSource2, DataSink dataSink, int i10, @Nullable EventListener eventListener) {
        this.cache = cache;
        this.cacheReadDataSource = dataSource2;
        this.blockOnCache = (i10 & 1) != 0;
        this.ignoreCacheOnError = (i10 & 2) != 0;
        this.ignoreCacheForUnsetLengthRequests = (i10 & 4) != 0;
        this.upstreamDataSource = dataSource;
        if (dataSink != null) {
            this.cacheWriteDataSource = new TeeDataSource(dataSource, dataSink);
        } else {
            this.cacheWriteDataSource = null;
        }
        this.eventListener = eventListener;
    }
}
