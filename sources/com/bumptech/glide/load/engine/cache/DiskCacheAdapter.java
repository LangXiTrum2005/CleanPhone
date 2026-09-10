package com.bumptech.glide.load.engine.cache;

import com.bumptech.glide.load.Key;
import java.io.File;

/* JADX INFO: loaded from: classes.dex */
public class DiskCacheAdapter implements DiskCache {

    public static final class Factory implements DiskCache.Factory {
    }

    @Override // com.bumptech.glide.load.engine.cache.DiskCache
    public final void a(Key key, DiskCache.Writer writer) {
    }

    @Override // com.bumptech.glide.load.engine.cache.DiskCache
    public final File b(Key key) {
        return null;
    }
}
