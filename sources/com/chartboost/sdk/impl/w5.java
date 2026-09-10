package com.chartboost.sdk.impl;

import android.content.Context;
import com.google.android.exoplayer2.DefaultLoadControl;
import com.google.android.exoplayer2.LoadControl;
import com.google.android.exoplayer2.database.DatabaseProvider;
import com.google.android.exoplayer2.database.DefaultDatabaseProvider;
import com.google.android.exoplayer2.extractor.DefaultExtractorsFactory;
import com.google.android.exoplayer2.offline.DownloadManager;
import com.google.android.exoplayer2.scheduler.PlatformScheduler;
import com.google.android.exoplayer2.scheduler.Scheduler;
import com.google.android.exoplayer2.source.DefaultMediaSourceFactory;
import com.google.android.exoplayer2.source.MediaSource;
import com.google.android.exoplayer2.upstream.DataSource;
import com.google.android.exoplayer2.upstream.DefaultAllocator;
import com.google.android.exoplayer2.upstream.HttpDataSource;
import com.google.android.exoplayer2.upstream.cache.Cache;
import com.google.android.exoplayer2.upstream.cache.CacheDataSource;
import com.google.android.exoplayer2.upstream.cache.CacheEvictor;
import com.google.android.exoplayer2.upstream.cache.SimpleCache;
import com.google.android.exoplayer2.util.Assertions;
import com.google.android.exoplayer2.util.Util;
import java.io.File;
import java.net.CookieHandler;
import java.net.CookieManager;
import java.net.CookiePolicy;
import java.util.concurrent.Executors;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public abstract class w5 {
    public static final Cache a(m7 fileCaching, DatabaseProvider databaseProvider, si cachePolicy, t3.b evictorCallback, CacheEvictor evictor) {
        Intrinsics.f(fileCaching, "fileCaching");
        Intrinsics.f(databaseProvider, "databaseProvider");
        Intrinsics.f(cachePolicy, "cachePolicy");
        Intrinsics.f(evictorCallback, "evictorCallback");
        Intrinsics.f(evictor, "evictor");
        return new SimpleCache(fileCaching.b(), evictor, databaseProvider);
    }

    public static final File b(Context context) {
        Intrinsics.f(context, "<this>");
        File precacheDir = new b8(context.getCacheDir()).f13495h;
        Intrinsics.e(precacheDir, "precacheDir");
        return precacheDir;
    }

    public static final File c(Context context) {
        Intrinsics.f(context, "<this>");
        File precacheQueueDir = new b8(context.getCacheDir()).f13496i;
        Intrinsics.e(precacheQueueDir, "precacheQueueDir");
        return precacheQueueDir;
    }

    public static /* synthetic */ Cache a(m7 m7Var, DatabaseProvider databaseProvider, si siVar, t3.b bVar, CacheEvictor cacheEvictor, int i2, Object obj) {
        t3.b bVar2;
        if ((i2 & 16) != 0) {
            bVar2 = bVar;
            cacheEvictor = new t3(siVar.b(), bVar2, null, 4, null);
        } else {
            bVar2 = bVar;
        }
        return a(m7Var, databaseProvider, siVar, bVar2, cacheEvictor);
    }

    public static final CacheDataSource.Factory a(Cache cache, HttpDataSource.Factory httpDataSourceFactory) {
        Intrinsics.f(cache, "cache");
        Intrinsics.f(httpDataSourceFactory, "httpDataSourceFactory");
        CacheDataSource.Factory factory = new CacheDataSource.Factory();
        factory.f18844a = cache;
        factory.d = httpDataSourceFactory;
        factory.f18846c = true;
        return factory;
    }

    public static final DatabaseProvider a(Context context) {
        Intrinsics.f(context, "context");
        return new DefaultDatabaseProvider(new p7(context, null, null, 0, 14, null));
    }

    public static final DownloadManager a(Context context, DatabaseProvider databaseProvider, Cache cache, HttpDataSource.Factory httpDataSourceFactory, DownloadManager.Listener listener, int i2, int i3) {
        Intrinsics.f(context, "context");
        Intrinsics.f(databaseProvider, "databaseProvider");
        Intrinsics.f(cache, "cache");
        Intrinsics.f(httpDataSourceFactory, "httpDataSourceFactory");
        Intrinsics.f(listener, "listener");
        DownloadManager downloadManager = new DownloadManager(context, databaseProvider, cache, httpDataSourceFactory, Executors.newFixedThreadPool(i2));
        Assertions.b(i3 > 0);
        if (downloadManager.j != i3) {
            downloadManager.j = i3;
            downloadManager.f++;
            downloadManager.f18263c.obtainMessage(4, i3, 0).sendToTarget();
        }
        downloadManager.f18264e.add(listener);
        return downloadManager;
    }

    public static /* synthetic */ DownloadManager a(Context context, DatabaseProvider databaseProvider, Cache cache, HttpDataSource.Factory factory, DownloadManager.Listener listener, int i2, int i3, int i4, Object obj) {
        if ((i4 & 32) != 0) {
            i2 = 2;
        }
        int i5 = i2;
        if ((i4 & 64) != 0) {
            i3 = 1;
        }
        return a(context, databaseProvider, cache, factory, listener, i5, i3);
    }

    public static /* synthetic */ LoadControl a(int i2, int i3, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            i2 = 500;
        }
        if ((i4 & 2) != 0) {
            i3 = 50000;
        }
        return a(i2, i3);
    }

    public static final Scheduler a(Context context, int i2) {
        Intrinsics.f(context, "context");
        if (Util.f18979a >= 21) {
            return new PlatformScheduler(context, i2);
        }
        return null;
    }

    public static /* synthetic */ Scheduler a(Context context, int i2, int i3, Object obj) {
        if ((i3 & 2) != 0) {
            i2 = 1;
        }
        return a(context, i2);
    }

    public static final MediaSource.Factory a(DataSource.Factory factory) {
        Intrinsics.f(factory, "<this>");
        return new DefaultMediaSourceFactory(factory, new DefaultExtractorsFactory());
    }

    public static final void a() {
        CookieManager cookieManager = new CookieManager();
        cookieManager.setCookiePolicy(CookiePolicy.ACCEPT_ORIGINAL_SERVER);
        CookieHandler.setDefault(cookieManager);
    }

    public static final LoadControl a(int i2, int i3) {
        DefaultLoadControl.Builder builder = new DefaultLoadControl.Builder();
        builder.f17016b = 50000;
        builder.f17017c = 50000;
        builder.d = 2500;
        builder.f17018e = 5000;
        Assertions.d(!builder.f);
        DefaultLoadControl.c(i2, 0, "bufferForPlaybackMs", "0");
        DefaultLoadControl.c(i2, 0, "bufferForPlaybackAfterRebufferMs", "0");
        DefaultLoadControl.c(i2, i2, "minBufferMs", "bufferForPlaybackMs");
        DefaultLoadControl.c(i2, i2, "minBufferMs", "bufferForPlaybackAfterRebufferMs");
        DefaultLoadControl.c(i3, i2, "maxBufferMs", "minBufferMs");
        builder.f17016b = i2;
        builder.f17017c = i3;
        builder.d = i2;
        builder.f17018e = i2;
        Assertions.d(!builder.f);
        builder.f = true;
        if (builder.f17015a == null) {
            builder.f17015a = new DefaultAllocator();
        }
        return new DefaultLoadControl(builder.f17015a, builder.f17016b, builder.f17017c, builder.d, builder.f17018e);
    }
}
