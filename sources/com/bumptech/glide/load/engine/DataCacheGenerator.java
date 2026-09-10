package com.bumptech.glide.load.engine;

import com.bumptech.glide.load.DataSource;
import com.bumptech.glide.load.Key;
import com.bumptech.glide.load.data.DataFetcher;
import com.bumptech.glide.load.model.ModelLoader;
import java.io.File;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
class DataCacheGenerator implements DataFetcherGenerator, DataFetcher.DataCallback<Object> {
    public final List X;

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    public final DecodeHelper f12398Y;
    public final DataFetcherGenerator.FetcherReadyCallback Z;
    public int e0 = -1;
    public Key f0;
    public List g0;
    public int h0;
    public volatile ModelLoader.LoadData i0;
    public File j0;

    public DataCacheGenerator(List list, DecodeHelper decodeHelper, DataFetcherGenerator.FetcherReadyCallback fetcherReadyCallback) {
        this.X = list;
        this.f12398Y = decodeHelper;
        this.Z = fetcherReadyCallback;
    }

    @Override // com.bumptech.glide.load.engine.DataFetcherGenerator
    public final boolean b() {
        while (true) {
            List list = this.g0;
            boolean z2 = false;
            if (list != null && this.h0 < list.size()) {
                this.i0 = null;
                while (!z2 && this.h0 < this.g0.size()) {
                    List list2 = this.g0;
                    int i2 = this.h0;
                    this.h0 = i2 + 1;
                    ModelLoader modelLoader = (ModelLoader) list2.get(i2);
                    File file = this.j0;
                    DecodeHelper decodeHelper = this.f12398Y;
                    this.i0 = modelLoader.b(file, decodeHelper.f12407e, decodeHelper.f, decodeHelper.f12409i);
                    if (this.i0 != null && this.f12398Y.c(this.i0.f12577c.a()) != null) {
                        this.i0.f12577c.e(this.f12398Y.o, this);
                        z2 = true;
                    }
                }
                return z2;
            }
            int i3 = this.e0 + 1;
            this.e0 = i3;
            if (i3 >= this.X.size()) {
                return false;
            }
            Key key = (Key) this.X.get(this.e0);
            DecodeHelper decodeHelper2 = this.f12398Y;
            File fileB = decodeHelper2.f12408h.a().b(new DataCacheKey(key, decodeHelper2.f12411n));
            this.j0 = fileB;
            if (fileB != null) {
                this.f0 = key;
                this.g0 = this.f12398Y.f12406c.a().f12301a.b(fileB);
                this.h0 = 0;
            }
        }
    }

    @Override // com.bumptech.glide.load.data.DataFetcher.DataCallback
    public final void c(Exception exc) {
        this.Z.a(this.f0, exc, this.i0.f12577c, DataSource.Z);
    }

    @Override // com.bumptech.glide.load.engine.DataFetcherGenerator
    public final void cancel() {
        ModelLoader.LoadData loadData = this.i0;
        if (loadData != null) {
            loadData.f12577c.cancel();
        }
    }

    @Override // com.bumptech.glide.load.data.DataFetcher.DataCallback
    public final void f(Object obj) {
        this.Z.d(this.f0, obj, this.i0.f12577c, DataSource.Z, this.f0);
    }
}
