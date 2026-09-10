package com.google.android.exoplayer2.upstream.cache;

import com.google.android.exoplayer2.offline.e;
import com.google.android.exoplayer2.upstream.DataSpec;

/* JADX INFO: loaded from: classes3.dex */
public final class CacheWriter {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final CacheDataSource f18853a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Cache f18854b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final DataSpec f18855c;
    public final String d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final byte[] f18856e = new byte[131072];
    public final e f;
    public long g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public long f18857h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public long f18858i;
    public volatile boolean j;

    public interface ProgressListener {
    }

    public CacheWriter(CacheDataSource cacheDataSource, DataSpec dataSpec, e eVar) {
        this.f18853a = cacheDataSource;
        this.f18854b = cacheDataSource.f18835a;
        this.f18855c = dataSpec;
        this.f = eVar;
        this.d = cacheDataSource.f18838e.d(dataSpec);
        this.g = dataSpec.f;
    }
}
