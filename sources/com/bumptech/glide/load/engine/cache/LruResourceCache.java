package com.bumptech.glide.load.engine.cache;

import com.bumptech.glide.load.Key;
import com.bumptech.glide.load.engine.Engine;
import com.bumptech.glide.load.engine.Resource;
import com.bumptech.glide.util.LruCache;

/* JADX INFO: loaded from: classes.dex */
public class LruResourceCache extends LruCache<Key, Resource<?>> implements MemoryCache {
    public Engine d;

    @Override // com.bumptech.glide.util.LruCache
    public final int c(Object obj) {
        Resource resource = (Resource) obj;
        if (resource == null) {
            return 1;
        }
        return resource.getSize();
    }

    @Override // com.bumptech.glide.util.LruCache
    public final void d(Object obj, Object obj2) {
        Resource resource = (Resource) obj2;
        Engine engine = this.d;
        if (engine == null || resource == null) {
            return;
        }
        engine.f(resource);
    }
}
