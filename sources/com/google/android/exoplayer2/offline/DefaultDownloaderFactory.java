package com.google.android.exoplayer2.offline;

import android.net.Uri;
import android.util.SparseArray;
import com.google.android.exoplayer2.MediaItem;
import com.google.android.exoplayer2.upstream.cache.CacheDataSource;
import com.google.android.exoplayer2.util.Util;
import java.lang.reflect.Constructor;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;

/* JADX INFO: loaded from: classes3.dex */
public class DefaultDownloaderFactory implements DownloaderFactory {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final SparseArray f18252c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final CacheDataSource.Factory f18253a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ExecutorService f18254b;

    static {
        SparseArray sparseArray = new SparseArray();
        try {
            sparseArray.put(0, b(Class.forName("com.google.android.exoplayer2.source.dash.offline.DashDownloader")));
        } catch (ClassNotFoundException unused) {
        }
        try {
            sparseArray.put(2, b(Class.forName("com.google.android.exoplayer2.source.hls.offline.HlsDownloader")));
        } catch (ClassNotFoundException unused2) {
        }
        try {
            sparseArray.put(1, b(Class.forName("com.google.android.exoplayer2.source.smoothstreaming.offline.SsDownloader")));
        } catch (ClassNotFoundException unused3) {
        }
        f18252c = sparseArray;
    }

    public DefaultDownloaderFactory(CacheDataSource.Factory factory, ExecutorService executorService) {
        this.f18253a = factory;
        executorService.getClass();
        this.f18254b = executorService;
    }

    public static Constructor b(Class cls) {
        try {
            return cls.asSubclass(Downloader.class).getConstructor(MediaItem.class, CacheDataSource.Factory.class, Executor.class);
        } catch (NoSuchMethodException e2) {
            throw new IllegalStateException("Downloader constructor missing", e2);
        }
    }

    public final Downloader a(DownloadRequest downloadRequest) {
        int iX = Util.x(downloadRequest.f18282Y, downloadRequest.Z);
        CacheDataSource.Factory factory = this.f18253a;
        ExecutorService executorService = this.f18254b;
        String str = downloadRequest.g0;
        Uri uri = downloadRequest.f18282Y;
        if (iX != 0 && iX != 1 && iX != 2) {
            if (iX != 4) {
                throw new IllegalArgumentException(android.support.v4.media.a.h(iX, "Unsupported type: "));
            }
            MediaItem.Builder builder = new MediaItem.Builder();
            builder.f17097b = uri;
            builder.g = str;
            return new ProgressiveDownloader(builder.a(), factory, executorService);
        }
        Constructor constructor = (Constructor) f18252c.get(iX);
        if (constructor == null) {
            throw new IllegalStateException(android.support.v4.media.a.h(iX, "Module missing for content type "));
        }
        MediaItem.Builder builder2 = new MediaItem.Builder();
        builder2.f17097b = uri;
        List list = downloadRequest.e0;
        builder2.f = (list == null || list.isEmpty()) ? Collections.EMPTY_LIST : Collections.unmodifiableList(new ArrayList(list));
        builder2.g = str;
        try {
            return (Downloader) constructor.newInstance(builder2.a(), factory, executorService);
        } catch (Exception e2) {
            throw new IllegalStateException(android.support.v4.media.a.h(iX, "Failed to instantiate downloader for content type "), e2);
        }
    }
}
