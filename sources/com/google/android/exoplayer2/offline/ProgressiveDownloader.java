package com.google.android.exoplayer2.offline;

import com.google.android.exoplayer2.MediaItem;
import com.google.android.exoplayer2.upstream.DataSourceUtil;
import com.google.android.exoplayer2.upstream.DataSpec;
import com.google.android.exoplayer2.upstream.HttpDataSource;
import com.google.android.exoplayer2.upstream.cache.CacheDataSource;
import com.google.android.exoplayer2.upstream.cache.CacheWriter;
import com.google.android.exoplayer2.util.PriorityTaskManager;
import com.google.android.exoplayer2.util.RunnableFutureTask;
import com.google.android.exoplayer2.util.Util;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;

/* JADX INFO: loaded from: classes3.dex */
public final class ProgressiveDownloader implements Downloader {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ExecutorService f18293a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final DataSpec f18294b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final CacheDataSource f18295c;
    public final CacheWriter d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Downloader.ProgressListener f18296e;
    public volatile RunnableFutureTask f;
    public volatile boolean g;

    public ProgressiveDownloader(MediaItem mediaItem, CacheDataSource.Factory factory, ExecutorService executorService) {
        executorService.getClass();
        this.f18293a = executorService;
        MediaItem.PlaybackProperties playbackProperties = mediaItem.f17095Y;
        playbackProperties.getClass();
        DataSpec.Builder builder = new DataSpec.Builder();
        builder.f18748a = playbackProperties.f17112a;
        builder.f18752h = playbackProperties.f17115e;
        builder.f18753i = 4;
        DataSpec dataSpecA = builder.a();
        this.f18294b = dataSpecA;
        HttpDataSource.Factory factory2 = factory.d;
        CacheDataSource cacheDataSourceA = factory.a(factory2 != null ? factory2.createDataSource() : null, 1, -1000);
        this.f18295c = cacheDataSourceA;
        this.d = new CacheWriter(cacheDataSourceA, dataSpecA, new e(this));
    }

    @Override // com.google.android.exoplayer2.offline.Downloader
    public final void a(Downloader.ProgressListener progressListener) {
        this.f18296e = progressListener;
        boolean z2 = false;
        while (!z2) {
            try {
                if (this.g) {
                    break;
                }
                this.f = new RunnableFutureTask<Void, IOException>() { // from class: com.google.android.exoplayer2.offline.ProgressiveDownloader.1
                    @Override // com.google.android.exoplayer2.util.RunnableFutureTask
                    public final void b() {
                        ProgressiveDownloader.this.d.j = true;
                    }

                    /* JADX WARN: Code duplicated, block: B:117:0x014e A[SYNTHETIC] */
                    /* JADX WARN: Code duplicated, block: B:121:0x0127 A[SYNTHETIC] */
                    /* JADX WARN: Code duplicated, block: B:123:0x0117 A[SYNTHETIC] */
                    /* JADX WARN: Code duplicated, block: B:76:0x011a A[Catch: IOException -> 0x014c, TryCatch #1 {IOException -> 0x014c, blocks: (B:64:0x00ee, B:67:0x00f5, B:71:0x0109, B:76:0x011a, B:78:0x011e, B:80:0x0127, B:85:0x0146, B:84:0x013c, B:88:0x014e, B:89:0x0153, B:91:0x0156, B:94:0x015f, B:98:0x0170, B:97:0x016a, B:70:0x0101), top: B:110:0x00ee }] */
                    /* JADX WARN: Code duplicated, block: B:78:0x011e A[Catch: IOException -> 0x014c, TryCatch #1 {IOException -> 0x014c, blocks: (B:64:0x00ee, B:67:0x00f5, B:71:0x0109, B:76:0x011a, B:78:0x011e, B:80:0x0127, B:85:0x0146, B:84:0x013c, B:88:0x014e, B:89:0x0153, B:91:0x0156, B:94:0x015f, B:98:0x0170, B:97:0x016a, B:70:0x0101), top: B:110:0x00ee }] */
                    /* JADX WARN: Code duplicated, block: B:82:0x0137  */
                    /* JADX WARN: Code duplicated, block: B:84:0x013c A[Catch: IOException -> 0x014c, TryCatch #1 {IOException -> 0x014c, blocks: (B:64:0x00ee, B:67:0x00f5, B:71:0x0109, B:76:0x011a, B:78:0x011e, B:80:0x0127, B:85:0x0146, B:84:0x013c, B:88:0x014e, B:89:0x0153, B:91:0x0156, B:94:0x015f, B:98:0x0170, B:97:0x016a, B:70:0x0101), top: B:110:0x00ee }] */
                    /* JADX WARN: Code duplicated, block: B:91:0x0156 A[Catch: IOException -> 0x014c, TryCatch #1 {IOException -> 0x014c, blocks: (B:64:0x00ee, B:67:0x00f5, B:71:0x0109, B:76:0x011a, B:78:0x011e, B:80:0x0127, B:85:0x0146, B:84:0x013c, B:88:0x014e, B:89:0x0153, B:91:0x0156, B:94:0x015f, B:98:0x0170, B:97:0x016a, B:70:0x0101), top: B:110:0x00ee }] */
                    /* JADX WARN: Code duplicated, block: B:93:0x015e  */
                    /* JADX WARN: Code duplicated, block: B:94:0x015f A[Catch: IOException -> 0x014c, TryCatch #1 {IOException -> 0x014c, blocks: (B:64:0x00ee, B:67:0x00f5, B:71:0x0109, B:76:0x011a, B:78:0x011e, B:80:0x0127, B:85:0x0146, B:84:0x013c, B:88:0x014e, B:89:0x0153, B:91:0x0156, B:94:0x015f, B:98:0x0170, B:97:0x016a, B:70:0x0101), top: B:110:0x00ee }] */
                    /* JADX WARN: Code duplicated, block: B:96:0x0167  */
                    /* JADX WARN: Code duplicated, block: B:97:0x016a A[Catch: IOException -> 0x014c, TryCatch #1 {IOException -> 0x014c, blocks: (B:64:0x00ee, B:67:0x00f5, B:71:0x0109, B:76:0x011a, B:78:0x011e, B:80:0x0127, B:85:0x0146, B:84:0x013c, B:88:0x014e, B:89:0x0153, B:91:0x0156, B:94:0x015f, B:98:0x0170, B:97:0x016a, B:70:0x0101), top: B:110:0x00ee }] */
                    @Override // com.google.android.exoplayer2.util.RunnableFutureTask
                    public final Object c() throws IOException {
                        long jA;
                        long j;
                        int i2;
                        int i3;
                        long j2;
                        long j3;
                        long j4;
                        long j5;
                        long j6;
                        CacheWriter cacheWriter = ProgressiveDownloader.this.d;
                        if (cacheWriter.j) {
                            throw new InterruptedIOException();
                        }
                        DataSpec dataSpec = cacheWriter.f18855c;
                        cacheWriter.f18858i = cacheWriter.f18854b.f(dataSpec.f, dataSpec.g, cacheWriter.d);
                        long j7 = dataSpec.g;
                        long j8 = -1;
                        if (j7 != -1) {
                            cacheWriter.f18857h = dataSpec.f + j7;
                        } else {
                            long jB = cacheWriter.f18854b.getContentMetadata(cacheWriter.d).b();
                            if (jB == -1) {
                                jB = -1;
                            }
                            cacheWriter.f18857h = jB;
                        }
                        e eVar = cacheWriter.f;
                        long j9 = cacheWriter.f18857h;
                        eVar.a(j9 == -1 ? -1L : j9 - cacheWriter.f18855c.f, cacheWriter.f18858i, 0L);
                        while (true) {
                            long j10 = cacheWriter.f18857h;
                            if (j10 != j8 && cacheWriter.g >= j10) {
                                return null;
                            }
                            if (cacheWriter.j) {
                                throw new InterruptedIOException();
                            }
                            long j11 = cacheWriter.f18857h;
                            long cachedLength = cacheWriter.f18854b.getCachedLength(cacheWriter.d, cacheWriter.g, j11 == j8 ? Long.MAX_VALUE : j11 - cacheWriter.g);
                            if (cachedLength > 0) {
                                cacheWriter.g += cachedLength;
                                j = j8;
                            } else {
                                long j12 = -cachedLength;
                                if (j12 == Long.MAX_VALUE) {
                                    j12 = j8;
                                }
                                long j13 = cacheWriter.g;
                                boolean z3 = true;
                                int i4 = 0;
                                boolean z4 = j13 + j12 == cacheWriter.f18857h || j12 == j8;
                                CacheDataSource cacheDataSource = cacheWriter.f18853a;
                                if (j12 != j8) {
                                    DataSpec.Builder builderA = dataSpec.a();
                                    builderA.f = j13;
                                    builderA.g = j12;
                                    try {
                                        jA = cacheDataSource.a(builderA.a());
                                    } catch (IOException unused) {
                                        DataSourceUtil.a(cacheDataSource);
                                        jA = j8;
                                        z3 = false;
                                    }
                                } else {
                                    jA = j8;
                                    z3 = false;
                                }
                                if (!z3) {
                                    if (cacheWriter.j) {
                                        throw new InterruptedIOException();
                                    }
                                    DataSpec.Builder builderA2 = dataSpec.a();
                                    builderA2.f = j13;
                                    builderA2.g = j8;
                                    try {
                                        jA = cacheDataSource.a(builderA2.a());
                                    } catch (IOException e2) {
                                        DataSourceUtil.a(cacheDataSource);
                                        throw e2;
                                    }
                                }
                                if (!z4 || jA == j8) {
                                    j = j8;
                                    i2 = 0;
                                    i3 = 0;
                                    while (i2 != -1) {
                                        if (!cacheWriter.j) {
                                            throw new InterruptedIOException();
                                        }
                                        byte[] bArr = cacheWriter.f18856e;
                                        i2 = cacheDataSource.read(bArr, i4, bArr.length);
                                        if (i2 != -1) {
                                            long j14 = i2;
                                            long j15 = cacheWriter.f18858i + j14;
                                            cacheWriter.f18858i = j15;
                                            e eVar2 = cacheWriter.f;
                                            j4 = cacheWriter.f18857h;
                                            if (j4 == j) {
                                                j5 = j;
                                            } else {
                                                j5 = j4 - cacheWriter.f18855c.f;
                                            }
                                            eVar2.a(j5, j15, j14);
                                            i3 += i2;
                                            i4 = 0;
                                        }
                                    }
                                    if (z4) {
                                        j2 = ((long) i3) + j13;
                                        if (cacheWriter.f18857h == j2) {
                                            cacheWriter.f18857h = j2;
                                            e eVar3 = cacheWriter.f;
                                            if (j2 == j) {
                                                j3 = j;
                                            } else {
                                                j3 = j2 - cacheWriter.f18855c.f;
                                            }
                                            eVar3.a(j3, cacheWriter.f18858i, 0L);
                                        }
                                    }
                                    cacheDataSource.close();
                                    cacheWriter.g = j13 + ((long) i3);
                                } else {
                                    long j16 = jA + j13;
                                    try {
                                        if (cacheWriter.f18857h == j16) {
                                            j = j8;
                                        } else {
                                            cacheWriter.f18857h = j16;
                                            e eVar4 = cacheWriter.f;
                                            if (j16 == j8) {
                                                j6 = j8;
                                                j = j6;
                                            } else {
                                                j = j8;
                                                j6 = j16 - cacheWriter.f18855c.f;
                                            }
                                            eVar4.a(j6, cacheWriter.f18858i, 0L);
                                        }
                                        i2 = 0;
                                        i3 = 0;
                                        while (i2 != -1) {
                                            if (!cacheWriter.j) {
                                                throw new InterruptedIOException();
                                            }
                                            byte[] bArr2 = cacheWriter.f18856e;
                                            i2 = cacheDataSource.read(bArr2, i4, bArr2.length);
                                            if (i2 != -1) {
                                                long j17 = i2;
                                                long j18 = cacheWriter.f18858i + j17;
                                                cacheWriter.f18858i = j18;
                                                e eVar5 = cacheWriter.f;
                                                j4 = cacheWriter.f18857h;
                                                if (j4 == j) {
                                                    j5 = j;
                                                } else {
                                                    j5 = j4 - cacheWriter.f18855c.f;
                                                }
                                                eVar5.a(j5, j18, j17);
                                                i3 += i2;
                                                i4 = 0;
                                            }
                                        }
                                        if (z4) {
                                            j2 = ((long) i3) + j13;
                                            if (cacheWriter.f18857h == j2) {
                                                cacheWriter.f18857h = j2;
                                                e eVar6 = cacheWriter.f;
                                                if (j2 == j) {
                                                    j3 = j;
                                                } else {
                                                    j3 = j2 - cacheWriter.f18855c.f;
                                                }
                                                eVar6.a(j3, cacheWriter.f18858i, 0L);
                                            }
                                        }
                                        cacheDataSource.close();
                                        cacheWriter.g = j13 + ((long) i3);
                                    } catch (IOException e3) {
                                        DataSourceUtil.a(cacheDataSource);
                                        throw e3;
                                    }
                                }
                            }
                            j8 = j;
                        }
                    }
                };
                this.f18293a.execute(this.f);
                try {
                    this.f.get();
                    z2 = true;
                } catch (ExecutionException e2) {
                    Throwable cause = e2.getCause();
                    cause.getClass();
                    if (!(cause instanceof PriorityTaskManager.PriorityTooLowException)) {
                        if (cause instanceof IOException) {
                            throw ((IOException) cause);
                        }
                        int i2 = Util.f18979a;
                        throw cause;
                    }
                }
            } catch (Throwable th) {
                RunnableFutureTask runnableFutureTask = this.f;
                runnableFutureTask.getClass();
                runnableFutureTask.f18962Y.b();
                throw th;
            }
        }
        RunnableFutureTask runnableFutureTask2 = this.f;
        runnableFutureTask2.getClass();
        runnableFutureTask2.f18962Y.b();
    }

    @Override // com.google.android.exoplayer2.offline.Downloader
    public final void cancel() {
        this.g = true;
        RunnableFutureTask runnableFutureTask = this.f;
        if (runnableFutureTask != null) {
            runnableFutureTask.cancel(true);
        }
    }

    @Override // com.google.android.exoplayer2.offline.Downloader
    public final void remove() {
        CacheDataSource cacheDataSource = this.f18295c;
        cacheDataSource.f18835a.h(cacheDataSource.f18838e.d(this.f18294b));
    }
}
