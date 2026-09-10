package com.bumptech.glide.load.engine;

import android.os.SystemClock;
import android.util.Log;
import androidx.datastore.preferences.protobuf.a;
import com.bumptech.glide.Registry;
import com.bumptech.glide.load.DataSource;
import com.bumptech.glide.load.Encoder;
import com.bumptech.glide.load.Key;
import com.bumptech.glide.load.data.DataFetcher;
import com.bumptech.glide.load.data.DataRewinder;
import com.bumptech.glide.load.engine.cache.DiskCache;
import com.bumptech.glide.load.model.ModelLoader;
import com.bumptech.glide.util.LogTime;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;

/* JADX INFO: loaded from: classes.dex */
class SourceGenerator implements DataFetcherGenerator, DataFetcherGenerator.FetcherReadyCallback {
    public final DecodeHelper X;

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    public final DataFetcherGenerator.FetcherReadyCallback f12479Y;
    public volatile int Z;
    public volatile DataCacheGenerator e0;
    public volatile Object f0;
    public volatile ModelLoader.LoadData g0;
    public volatile DataCacheKey h0;

    public SourceGenerator(DecodeHelper decodeHelper, DataFetcherGenerator.FetcherReadyCallback fetcherReadyCallback) {
        this.X = decodeHelper;
        this.f12479Y = fetcherReadyCallback;
    }

    @Override // com.bumptech.glide.load.engine.DataFetcherGenerator.FetcherReadyCallback
    public final void a(Key key, Exception exc, DataFetcher dataFetcher, DataSource dataSource) {
        ((DecodeJob) this.f12479Y).a(key, exc, dataFetcher, this.g0.f12577c.d());
    }

    /* JADX WARN: Code duplicated, block: B:12:0x0020  */
    @Override // com.bumptech.glide.load.engine.DataFetcherGenerator
    public final boolean b() {
        boolean z2;
        if (this.f0 == null) {
            if (this.e0 != null) {
            }
            this.e0 = null;
            this.g0 = null;
            z2 = false;
            while (!z2) {
                ArrayList arrayListB = this.X.b();
                int i2 = this.Z;
                this.Z = i2 + 1;
                this.g0 = (ModelLoader.LoadData) arrayListB.get(i2);
                if (this.g0 == null) {
                }
            }
            return z2;
        }
        Object obj = this.f0;
        this.f0 = null;
        try {
            if (c(obj)) {
                if (this.e0 != null || !this.e0.b()) {
                    this.e0 = null;
                    this.g0 = null;
                    z2 = false;
                    while (!z2 && this.Z < this.X.b().size()) {
                        ArrayList arrayListB2 = this.X.b();
                        int i3 = this.Z;
                        this.Z = i3 + 1;
                        this.g0 = (ModelLoader.LoadData) arrayListB2.get(i3);
                        if (this.g0 == null && (this.X.f12412p.c(this.g0.f12577c.d()) || this.X.c(this.g0.f12577c.a()) != null)) {
                            final ModelLoader.LoadData loadData = this.g0;
                            this.g0.f12577c.e(this.X.o, new DataFetcher.DataCallback<Object>() { // from class: com.bumptech.glide.load.engine.SourceGenerator.1
                                @Override // com.bumptech.glide.load.data.DataFetcher.DataCallback
                                public final void c(Exception exc) {
                                    SourceGenerator sourceGenerator = SourceGenerator.this;
                                    ModelLoader.LoadData loadData2 = loadData;
                                    ModelLoader.LoadData loadData3 = sourceGenerator.g0;
                                    if (loadData3 == null || loadData3 != loadData2) {
                                        return;
                                    }
                                    SourceGenerator sourceGenerator2 = SourceGenerator.this;
                                    ModelLoader.LoadData loadData4 = loadData;
                                    DataFetcherGenerator.FetcherReadyCallback fetcherReadyCallback = sourceGenerator2.f12479Y;
                                    DataCacheKey dataCacheKey = sourceGenerator2.h0;
                                    DataFetcher dataFetcher = loadData4.f12577c;
                                    ((DecodeJob) fetcherReadyCallback).a(dataCacheKey, exc, dataFetcher, dataFetcher.d());
                                }

                                @Override // com.bumptech.glide.load.data.DataFetcher.DataCallback
                                public final void f(Object obj2) {
                                    SourceGenerator sourceGenerator = SourceGenerator.this;
                                    ModelLoader.LoadData loadData2 = loadData;
                                    ModelLoader.LoadData loadData3 = sourceGenerator.g0;
                                    if (loadData3 == null || loadData3 != loadData2) {
                                        return;
                                    }
                                    SourceGenerator sourceGenerator2 = SourceGenerator.this;
                                    ModelLoader.LoadData loadData4 = loadData;
                                    DiskCacheStrategy diskCacheStrategy = sourceGenerator2.X.f12412p;
                                    if (obj2 == null || !diskCacheStrategy.c(loadData4.f12577c.d())) {
                                        DataFetcherGenerator.FetcherReadyCallback fetcherReadyCallback = sourceGenerator2.f12479Y;
                                        Key key = loadData4.f12575a;
                                        DataFetcher dataFetcher = loadData4.f12577c;
                                        ((DecodeJob) fetcherReadyCallback).d(key, obj2, dataFetcher, dataFetcher.d(), sourceGenerator2.h0);
                                        return;
                                    }
                                    sourceGenerator2.f0 = obj2;
                                    DecodeJob decodeJob = (DecodeJob) sourceGenerator2.f12479Y;
                                    decodeJob.t0 = DecodeJob.RunReason.f12425Y;
                                    EngineJob engineJob = decodeJob.q0;
                                    (engineJob.n0 ? engineJob.j0 : engineJob.i0).execute(decodeJob);
                                }
                            });
                            z2 = true;
                        }
                    }
                    return z2;
                }
            }
        } catch (IOException e2) {
            if (Log.isLoggable("SourceGenerator", 3)) {
                Log.d("SourceGenerator", "Failed to properly rewind or write data to cache", e2);
            }
        }
        return true;
    }

    public final boolean c(Object obj) throws Throwable {
        Throwable th;
        int i2 = LogTime.f12842b;
        long jElapsedRealtimeNanos = SystemClock.elapsedRealtimeNanos();
        boolean z2 = false;
        try {
            DataRewinder dataRewinderC = this.X.f12406c.a().c(obj);
            Object objA = dataRewinderC.a();
            Registry registryA = this.X.f12406c.a();
            registryA.getClass();
            Encoder encoderB = registryA.f12302b.b(objA.getClass());
            if (encoderB == null) {
                throw new Registry.NoSourceEncoderAvailableException(a.j(objA.getClass(), "Failed to find source encoder for data class: "));
            }
            DataCacheWriter dataCacheWriter = new DataCacheWriter(encoderB, objA, this.X.f12409i);
            Key key = this.g0.f12575a;
            DecodeHelper decodeHelper = this.X;
            DataCacheKey dataCacheKey = new DataCacheKey(key, decodeHelper.f12411n);
            DiskCache diskCacheA = decodeHelper.f12408h.a();
            diskCacheA.a(dataCacheKey, dataCacheWriter);
            if (Log.isLoggable("SourceGenerator", 2)) {
                Log.v("SourceGenerator", "Finished encoding source to cache, key: " + dataCacheKey + ", data: " + obj + ", encoder: " + encoderB + ", duration: " + LogTime.a(jElapsedRealtimeNanos));
            }
            if (diskCacheA.b(dataCacheKey) != null) {
                this.h0 = dataCacheKey;
                this.e0 = new DataCacheGenerator(Collections.singletonList(this.g0.f12575a), this.X, this);
                this.g0.f12577c.b();
                return true;
            }
            if (Log.isLoggable("SourceGenerator", 3)) {
                Log.d("SourceGenerator", "Attempt to write: " + this.h0 + ", data: " + obj + " to the disk cache failed, maybe the disk cache is disabled? Trying to decode the data directly...");
            }
            try {
                ((DecodeJob) this.f12479Y).d(this.g0.f12575a, dataRewinderC.a(), this.g0.f12577c, this.g0.f12577c.d(), this.g0.f12575a);
                return false;
            } catch (Throwable th2) {
                th = th2;
                z2 = true;
                if (z2) {
                    throw th;
                }
                this.g0.f12577c.b();
                throw th;
            }
        } catch (Throwable th3) {
            th = th3;
        }
    }

    @Override // com.bumptech.glide.load.engine.DataFetcherGenerator
    public final void cancel() {
        ModelLoader.LoadData loadData = this.g0;
        if (loadData != null) {
            loadData.f12577c.cancel();
        }
    }

    @Override // com.bumptech.glide.load.engine.DataFetcherGenerator.FetcherReadyCallback
    public final void d(Key key, Object obj, DataFetcher dataFetcher, DataSource dataSource, Key key2) {
        this.f12479Y.d(key, obj, dataFetcher, this.g0.f12577c.d(), key);
    }
}
