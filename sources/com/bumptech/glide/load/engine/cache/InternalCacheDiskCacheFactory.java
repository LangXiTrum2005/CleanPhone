package com.bumptech.glide.load.engine.cache;

import android.content.Context;

/* JADX INFO: loaded from: classes.dex */
public final class InternalCacheDiskCacheFactory extends DiskLruCacheFactory {

    /* JADX INFO: renamed from: com.bumptech.glide.load.engine.cache.InternalCacheDiskCacheFactory$1, reason: invalid class name */
    class AnonymousClass1 implements DiskLruCacheFactory.CacheDirectoryGetter {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Context f12521a;

        public AnonymousClass1(Context context) {
            this.f12521a = context;
        }
    }

    public InternalCacheDiskCacheFactory(Context context) {
        super(new AnonymousClass1(context));
    }
}
