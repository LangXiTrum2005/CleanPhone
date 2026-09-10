package com.google.android.exoplayer2.upstream.cache;

import android.net.Uri;
import com.google.android.exoplayer2.analytics.f;
import com.google.android.exoplayer2.upstream.DataSink;
import com.google.android.exoplayer2.upstream.DataSource;
import com.google.android.exoplayer2.upstream.DataSourceException;
import com.google.android.exoplayer2.upstream.DataSpec;
import com.google.android.exoplayer2.upstream.FileDataSource;
import com.google.android.exoplayer2.upstream.HttpDataSource;
import com.google.android.exoplayer2.upstream.PlaceholderDataSource;
import com.google.android.exoplayer2.upstream.TeeDataSource;
import com.google.android.exoplayer2.upstream.TransferListener;
import com.google.android.exoplayer2.util.Assertions;
import com.google.android.exoplayer2.util.Util;
import com.google.common.base.Charsets;
import java.io.InterruptedIOException;
import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.util.Collections;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public final class CacheDataSource implements DataSource {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Cache f18835a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final DataSource f18836b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final TeeDataSource f18837c;
    public final DataSource d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final CacheKeyFactory f18838e;
    public final boolean f;
    public final boolean g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final boolean f18839h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public Uri f18840i;
    public DataSpec j;
    public DataSpec k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public DataSource f18841l;
    public long m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public long f18842n;
    public long o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public CacheSpan f18843p;
    public boolean q;
    public boolean r;
    public long s;
    public long t;

    @Target({ElementType.FIELD, ElementType.METHOD, ElementType.PARAMETER, ElementType.LOCAL_VARIABLE, ElementType.TYPE_USE})
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    public @interface CacheIgnoredReason {
    }

    public interface EventListener {
    }

    public static final class Factory implements DataSource.Factory {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public Cache f18844a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final FileDataSource.Factory f18845b = new FileDataSource.Factory();

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public boolean f18846c;
        public HttpDataSource.Factory d;

        public final CacheDataSource a(DataSource dataSource, int i2, int i3) {
            CacheDataSink cacheDataSink;
            Cache cache = this.f18844a;
            cache.getClass();
            if (this.f18846c || dataSource == null) {
                cacheDataSink = null;
            } else {
                CacheDataSink.Factory factory = new CacheDataSink.Factory();
                factory.f18834a = cache;
                Cache cache2 = factory.f18834a;
                cache2.getClass();
                cacheDataSink = new CacheDataSink(cache2);
            }
            return new CacheDataSource(cache, dataSource, this.f18845b.createDataSource(), cacheDataSink, i2, i3);
        }

        @Override // com.google.android.exoplayer2.upstream.DataSource.Factory
        public final DataSource createDataSource() {
            HttpDataSource.Factory factory = this.d;
            return a(factory != null ? factory.createDataSource() : null, 0, 0);
        }
    }

    @Target({ElementType.TYPE_USE})
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    public @interface Flags {
    }

    public CacheDataSource(Cache cache, DataSource dataSource, DataSource dataSource2, DataSink dataSink, int i2, int i3) {
        f fVar = CacheKeyFactory.R8;
        this.f18835a = cache;
        this.f18836b = dataSource2;
        this.f18838e = fVar;
        this.f = (i2 & 1) != 0;
        this.g = false;
        this.f18839h = false;
        if (dataSource != null) {
            this.d = dataSource;
            this.f18837c = dataSink != null ? new TeeDataSource(dataSource, dataSink) : null;
        } else {
            this.d = PlaceholderDataSource.f18802a;
            this.f18837c = null;
        }
    }

    @Override // com.google.android.exoplayer2.upstream.DataSource
    public final long a(DataSpec dataSpec) {
        long j;
        Cache cache = this.f18835a;
        try {
            String strD = this.f18838e.d(dataSpec);
            DataSpec.Builder builderA = dataSpec.a();
            long j2 = dataSpec.f;
            builderA.f18752h = strD;
            DataSpec dataSpecA = builderA.a();
            this.j = dataSpecA;
            Uri uri = dataSpecA.f18742a;
            byte[] bArr = (byte[]) cache.getContentMetadata(strD).f18881b.get("exo_redir");
            Uri uri2 = null;
            String str = bArr != null ? new String(bArr, Charsets.f19705c) : null;
            if (str != null) {
                uri2 = Uri.parse(str);
            }
            if (uri2 != null) {
                uri = uri2;
            }
            this.f18840i = uri;
            this.f18842n = j2;
            boolean z2 = this.g;
            long j3 = dataSpec.g;
            boolean z3 = (z2 && this.q) || (this.f18839h && j3 == -1);
            this.r = z3;
            if (z3) {
                this.o = -1L;
                j = -1;
            } else {
                j = -1;
                long jB = cache.getContentMetadata(strD).b();
                this.o = jB;
                if (jB != -1) {
                    long j4 = jB - j2;
                    this.o = j4;
                    if (j4 < 0) {
                        throw new DataSourceException(2008);
                    }
                }
            }
            if (j3 != j) {
                long j5 = this.o;
                this.o = j5 == j ? j3 : Math.min(j5, j3);
            }
            long j6 = this.o;
            if (j6 > 0 || j6 == j) {
                d(dataSpecA, false);
            }
            return j3 != j ? j3 : this.o;
        } catch (Throwable th) {
            if (this.f18841l == this.f18836b || (th instanceof Cache.CacheException)) {
                this.q = true;
            }
            throw th;
        }
    }

    @Override // com.google.android.exoplayer2.upstream.DataSource
    public final void b(TransferListener transferListener) {
        transferListener.getClass();
        this.f18836b.b(transferListener);
        this.d.b(transferListener);
    }

    public final void c() {
        Cache cache = this.f18835a;
        DataSource dataSource = this.f18841l;
        if (dataSource == null) {
            return;
        }
        try {
            dataSource.close();
        } finally {
            this.k = null;
            this.f18841l = null;
            CacheSpan cacheSpan = this.f18843p;
            if (cacheSpan != null) {
                cache.c(cacheSpan);
                this.f18843p = null;
            }
        }
    }

    @Override // com.google.android.exoplayer2.upstream.DataSource
    public final void close() {
        this.j = null;
        this.f18840i = null;
        this.f18842n = 0L;
        try {
            c();
        } catch (Throwable th) {
            if (this.f18841l == this.f18836b || (th instanceof Cache.CacheException)) {
                this.q = true;
            }
            throw th;
        }
    }

    public final void d(DataSpec dataSpec, boolean z2) throws InterruptedIOException {
        CacheSpan cacheSpanB;
        Cache cache;
        long j;
        DataSpec dataSpecA;
        Cache cache2;
        DataSource dataSource;
        String str = dataSpec.f18746h;
        int i2 = Util.f18979a;
        if (this.r) {
            cacheSpanB = null;
        } else if (this.f) {
            try {
                cacheSpanB = this.f18835a.b(this.f18842n, this.o, str);
            } catch (InterruptedException unused) {
                Thread.currentThread().interrupt();
                throw new InterruptedIOException();
            }
        } else {
            cacheSpanB = this.f18835a.d(this.f18842n, this.o, str);
        }
        TeeDataSource teeDataSource = this.f18837c;
        DataSource dataSource2 = this.f18836b;
        Cache cache3 = this.f18835a;
        DataSource dataSource3 = this.d;
        if (cacheSpanB == null) {
            DataSpec.Builder builderA = dataSpec.a();
            builderA.f = this.f18842n;
            builderA.g = this.o;
            dataSpecA = builderA.a();
            cache2 = cache3;
            dataSource = dataSource3;
            j = -1;
        } else {
            boolean z3 = cacheSpanB.e0;
            long jMin = cacheSpanB.Z;
            if (z3) {
                Uri uriFromFile = Uri.fromFile(cacheSpanB.f0);
                long j2 = this.f18842n;
                j = -1;
                long j3 = cacheSpanB.f18852Y;
                long j4 = j2 - j3;
                long jMin2 = jMin - j4;
                cache = cache3;
                long j5 = this.o;
                if (j5 != -1) {
                    jMin2 = Math.min(jMin2, j5);
                }
                DataSpec.Builder builderA2 = dataSpec.a();
                builderA2.f18748a = uriFromFile;
                builderA2.f18749b = j3;
                builderA2.f = j4;
                builderA2.g = jMin2;
                dataSpecA = builderA2.a();
                dataSource = dataSource2;
            } else {
                cache = cache3;
                j = -1;
                if (jMin == -1) {
                    jMin = this.o;
                } else {
                    long j6 = this.o;
                    if (j6 != -1) {
                        jMin = Math.min(jMin, j6);
                    }
                }
                DataSpec.Builder builderA3 = dataSpec.a();
                builderA3.f = this.f18842n;
                builderA3.g = jMin;
                dataSpecA = builderA3.a();
                if (teeDataSource != null) {
                    dataSource = teeDataSource;
                } else {
                    cache2 = cache;
                    cache2.c(cacheSpanB);
                    dataSource = dataSource3;
                    cacheSpanB = null;
                }
            }
            cache2 = cache;
        }
        this.t = (this.r || dataSource != dataSource3) ? Long.MAX_VALUE : this.f18842n + 102400;
        if (z2) {
            Assertions.d(this.f18841l == dataSource3);
            if (dataSource == dataSource3) {
                return;
            }
            try {
                c();
            } catch (Throwable th) {
                if (!cacheSpanB.e0) {
                    cache2.c(cacheSpanB);
                }
                throw th;
            }
        }
        if (cacheSpanB != null && !cacheSpanB.e0) {
            this.f18843p = cacheSpanB;
        }
        this.f18841l = dataSource;
        this.k = dataSpecA;
        this.m = 0L;
        long jA = dataSource.a(dataSpecA);
        ContentMetadataMutations contentMetadataMutations = new ContentMetadataMutations();
        if (dataSpecA.g == j && jA != j) {
            this.o = jA;
            contentMetadataMutations.a(Long.valueOf(this.f18842n + jA), "exo_len");
        }
        if (!(this.f18841l == dataSource2)) {
            Uri uri = dataSource.getUri();
            this.f18840i = uri;
            Uri uri2 = !dataSpec.f18742a.equals(uri) ? this.f18840i : null;
            if (uri2 == null) {
                contentMetadataMutations.f18878b.add("exo_redir");
                contentMetadataMutations.f18877a.remove("exo_redir");
            } else {
                contentMetadataMutations.a(uri2.toString(), "exo_redir");
            }
        }
        if (this.f18841l == teeDataSource) {
            cache2.a(str, contentMetadataMutations);
        }
    }

    @Override // com.google.android.exoplayer2.upstream.DataSource
    public final Map getResponseHeaders() {
        return !(this.f18841l == this.f18836b) ? this.d.getResponseHeaders() : Collections.EMPTY_MAP;
    }

    @Override // com.google.android.exoplayer2.upstream.DataSource
    public final Uri getUri() {
        return this.f18840i;
    }

    @Override // com.google.android.exoplayer2.upstream.DataReader
    public final int read(byte[] bArr, int i2, int i3) {
        int i4;
        long j;
        DataSource dataSource = this.f18836b;
        if (i3 == 0) {
            return 0;
        }
        if (this.o == 0) {
            return -1;
        }
        DataSpec dataSpec = this.j;
        dataSpec.getClass();
        DataSpec dataSpec2 = this.k;
        dataSpec2.getClass();
        try {
            if (this.f18842n >= this.t) {
                d(dataSpec, true);
            }
            DataSource dataSource2 = this.f18841l;
            dataSource2.getClass();
            int i5 = dataSource2.read(bArr, i2, i3);
            if (i5 != -1) {
                if (this.f18841l == dataSource) {
                    this.s += (long) i5;
                }
                long j2 = i5;
                this.f18842n += j2;
                this.m += j2;
                long j3 = this.o;
                if (j3 == -1) {
                    return i5;
                }
                this.o = j3 - j2;
                return i5;
            }
            DataSource dataSource3 = this.f18841l;
            if (!(dataSource3 == dataSource)) {
                j = -1;
                long j4 = dataSpec2.g;
                if (j4 != -1) {
                    i4 = i5;
                    if (this.m < j4) {
                    }
                } else {
                    i4 = i5;
                }
                String str = dataSpec.f18746h;
                int i6 = Util.f18979a;
                this.o = 0L;
                if (!(dataSource3 == this.f18837c)) {
                    return i4;
                }
                ContentMetadataMutations contentMetadataMutations = new ContentMetadataMutations();
                contentMetadataMutations.a(Long.valueOf(this.f18842n), "exo_len");
                this.f18835a.a(str, contentMetadataMutations);
                return i4;
            }
            i4 = i5;
            j = -1;
            long j5 = this.o;
            if (j5 <= 0 && j5 != j) {
                return i4;
            }
            c();
            d(dataSpec, false);
            return read(bArr, i2, i3);
        } catch (Throwable th) {
            if (this.f18841l == dataSource || (th instanceof Cache.CacheException)) {
                this.q = true;
            }
            throw th;
        }
    }
}
