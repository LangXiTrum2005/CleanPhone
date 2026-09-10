package com.bumptech.glide.load.engine.cache;

import java.io.File;

/* JADX INFO: loaded from: classes.dex */
public class DiskLruCacheFactory implements DiskCache.Factory {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final CacheDirectoryGetter f12516a;

    /* JADX INFO: renamed from: com.bumptech.glide.load.engine.cache.DiskLruCacheFactory$1, reason: invalid class name */
    class AnonymousClass1 implements CacheDirectoryGetter {
    }

    /* JADX INFO: renamed from: com.bumptech.glide.load.engine.cache.DiskLruCacheFactory$2, reason: invalid class name */
    class AnonymousClass2 implements CacheDirectoryGetter {
    }

    public interface CacheDirectoryGetter {
    }

    public DiskLruCacheFactory(CacheDirectoryGetter cacheDirectoryGetter) {
        this.f12516a = cacheDirectoryGetter;
    }

    public final DiskCache a() {
        File cacheDir = ((InternalCacheDiskCacheFactory.AnonymousClass1) this.f12516a).f12521a.getCacheDir();
        File file = cacheDir == null ? null : new File(cacheDir, "image_manager_disk_cache");
        if (file != null && (file.isDirectory() || file.mkdirs())) {
            return new DiskLruCacheWrapper(file);
        }
        return null;
    }
}
