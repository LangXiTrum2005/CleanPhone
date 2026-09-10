package com.bumptech.glide.load.engine;

import com.bumptech.glide.load.Encoder;
import com.bumptech.glide.load.Options;
import com.bumptech.glide.load.engine.cache.DiskCache;
import java.io.File;

/* JADX INFO: loaded from: classes.dex */
class DataCacheWriter<DataType> implements DiskCache.Writer {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Encoder f12401a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f12402b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Options f12403c;

    public DataCacheWriter(Encoder encoder, Object obj, Options options) {
        this.f12401a = encoder;
        this.f12402b = obj;
        this.f12403c = options;
    }

    @Override // com.bumptech.glide.load.engine.cache.DiskCache.Writer
    public final boolean a(File file) {
        return this.f12401a.a(this.f12402b, file, this.f12403c);
    }
}
