package com.google.android.exoplayer2.upstream.cache;

import com.google.android.exoplayer2.upstream.DataSink;
import com.google.android.exoplayer2.upstream.DataSpec;
import com.google.android.exoplayer2.util.Util;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

/* JADX INFO: loaded from: classes3.dex */
public final class CacheDataSink implements DataSink {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Cache f18828a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f18829b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f18830c;
    public DataSpec d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public long f18831e;
    public File f;
    public OutputStream g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public long f18832h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public long f18833i;
    public ReusableBufferedOutputStream j;

    public static final class CacheDataSinkException extends Cache.CacheException {
    }

    public static final class Factory implements DataSink.Factory {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public Cache f18834a;
    }

    public CacheDataSink(Cache cache) {
        cache.getClass();
        this.f18828a = cache;
        this.f18829b = 5242880L;
        this.f18830c = 20480;
    }

    @Override // com.google.android.exoplayer2.upstream.DataSink
    public final void a(DataSpec dataSpec) throws CacheDataSinkException {
        dataSpec.f18746h.getClass();
        long j = dataSpec.g;
        int i2 = dataSpec.f18747i;
        if (j == -1 && (i2 & 2) == 2) {
            this.d = null;
            return;
        }
        this.d = dataSpec;
        this.f18831e = (i2 & 4) == 4 ? this.f18829b : Long.MAX_VALUE;
        this.f18833i = 0L;
        try {
            c(dataSpec);
        } catch (IOException e2) {
            throw new CacheDataSinkException(e2);
        }
    }

    public final void b() {
        OutputStream outputStream = this.g;
        if (outputStream == null) {
            return;
        }
        try {
            outputStream.flush();
            Util.h(this.g);
            this.g = null;
            File file = this.f;
            this.f = null;
            this.f18828a.g(file, this.f18832h);
        } catch (Throwable th) {
            Util.h(this.g);
            this.g = null;
            File file2 = this.f;
            this.f = null;
            file2.delete();
            throw th;
        }
    }

    public final void c(DataSpec dataSpec) {
        long j = dataSpec.g;
        long jMin = j != -1 ? Math.min(j - this.f18833i, this.f18831e) : -1L;
        int i2 = Util.f18979a;
        this.f = this.f18828a.startFile(dataSpec.f18746h, dataSpec.f + this.f18833i, jMin);
        FileOutputStream fileOutputStream = new FileOutputStream(this.f);
        int i3 = this.f18830c;
        if (i3 > 0) {
            ReusableBufferedOutputStream reusableBufferedOutputStream = this.j;
            if (reusableBufferedOutputStream == null) {
                this.j = new ReusableBufferedOutputStream(fileOutputStream, i3);
            } else {
                reusableBufferedOutputStream.a(fileOutputStream);
            }
            this.g = this.j;
        } else {
            this.g = fileOutputStream;
        }
        this.f18832h = 0L;
    }

    @Override // com.google.android.exoplayer2.upstream.DataSink
    public final void close() throws CacheDataSinkException {
        if (this.d == null) {
            return;
        }
        try {
            b();
        } catch (IOException e2) {
            throw new CacheDataSinkException(e2);
        }
    }

    @Override // com.google.android.exoplayer2.upstream.DataSink
    public final void write(byte[] bArr, int i2, int i3) throws CacheDataSinkException {
        DataSpec dataSpec = this.d;
        if (dataSpec == null) {
            return;
        }
        int i4 = 0;
        while (i4 < i3) {
            try {
                if (this.f18832h == this.f18831e) {
                    b();
                    c(dataSpec);
                }
                int iMin = (int) Math.min(i3 - i4, this.f18831e - this.f18832h);
                OutputStream outputStream = this.g;
                int i5 = Util.f18979a;
                outputStream.write(bArr, i2 + i4, iMin);
                i4 += iMin;
                long j = iMin;
                this.f18832h += j;
                this.f18833i += j;
            } catch (IOException e2) {
                throw new CacheDataSinkException(e2);
            }
        }
    }
}
