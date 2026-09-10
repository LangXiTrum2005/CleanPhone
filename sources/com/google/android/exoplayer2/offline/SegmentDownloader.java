package com.google.android.exoplayer2.offline;

import com.google.android.exoplayer2.offline.FilterableManifest;
import com.google.android.exoplayer2.upstream.cache.CacheWriter;
import com.google.android.exoplayer2.util.RunnableFutureTask;
import java.io.IOException;

/* JADX INFO: loaded from: classes3.dex */
public abstract class SegmentDownloader<M extends FilterableManifest<M>> implements Downloader {

    /* JADX INFO: renamed from: com.google.android.exoplayer2.offline.SegmentDownloader$1, reason: invalid class name */
    class AnonymousClass1 extends RunnableFutureTask<FilterableManifest<Object>, IOException> {
        @Override // com.google.android.exoplayer2.util.RunnableFutureTask
        public final Object c() {
            throw null;
        }
    }

    public static final class ProgressNotifier implements CacheWriter.ProgressListener {
    }

    public static class Segment implements Comparable<Segment> {
        @Override // java.lang.Comparable
        public final int compareTo(Segment segment) {
            throw null;
        }
    }

    public static final class SegmentDownloadRunnable extends RunnableFutureTask<Void, IOException> {
        @Override // com.google.android.exoplayer2.util.RunnableFutureTask
        public final void b() {
            throw null;
        }

        @Override // com.google.android.exoplayer2.util.RunnableFutureTask
        public final Object c() {
            throw null;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:7:?, code lost:
    
        throw null;
     */
    @Override // com.google.android.exoplayer2.offline.Downloader
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void a(com.google.android.exoplayer2.offline.Downloader.ProgressListener r1) {
        /*
            r0 = this;
            java.util.ArrayDeque r1 = new java.util.ArrayDeque
            r1.<init>()
            java.util.ArrayDeque r1 = new java.util.ArrayDeque
            r1.<init>()
            r1 = 0
            throw r1     // Catch: java.lang.Throwable -> Lc
        Lc:
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.offline.SegmentDownloader.a(com.google.android.exoplayer2.offline.Downloader$ProgressListener):void");
    }

    @Override // com.google.android.exoplayer2.offline.Downloader
    public final void cancel() {
        throw null;
    }

    @Override // com.google.android.exoplayer2.offline.Downloader
    public final void remove() {
        throw null;
    }
}
