package com.bumptech.glide.load.engine;

import android.os.SystemClock;
import android.support.v4.media.a;
import android.util.Log;
import androidx.core.util.Pools;
import com.bumptech.glide.GlideContext;
import com.bumptech.glide.Priority;
import com.bumptech.glide.load.DataSource;
import com.bumptech.glide.load.Key;
import com.bumptech.glide.load.Options;
import com.bumptech.glide.load.engine.cache.DiskCache;
import com.bumptech.glide.load.engine.cache.DiskCacheAdapter;
import com.bumptech.glide.load.engine.cache.InternalCacheDiskCacheFactory;
import com.bumptech.glide.load.engine.cache.LruResourceCache;
import com.bumptech.glide.load.engine.cache.MemoryCache;
import com.bumptech.glide.load.engine.executor.GlideExecutor;
import com.bumptech.glide.request.SingleRequest;
import com.bumptech.glide.util.CachedHashCodeArrayMap;
import com.bumptech.glide.util.LogTime;
import com.bumptech.glide.util.Preconditions;
import com.bumptech.glide.util.pool.FactoryPools;
import java.util.HashMap;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes.dex */
public class Engine implements EngineJobListener, MemoryCache.ResourceRemovedListener, EngineResource.ResourceListener {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final boolean f12434h = Log.isLoggable("Engine", 2);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Jobs f12435a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final EngineKeyFactory f12436b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final LruResourceCache f12437c;
    public final EngineJobFactory d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final ResourceRecycler f12438e;
    public final DecodeJobFactory f;
    public final ActiveResources g;

    public static class DecodeJobFactory {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final LazyDiskCacheProvider f12439a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Pools.Pool f12440b = FactoryPools.a(150, new FactoryPools.Factory<DecodeJob<?>>() { // from class: com.bumptech.glide.load.engine.Engine.DecodeJobFactory.1
            @Override // com.bumptech.glide.util.pool.FactoryPools.Factory
            public final Object a() {
                DecodeJobFactory decodeJobFactory = DecodeJobFactory.this;
                return new DecodeJob(decodeJobFactory.f12439a, decodeJobFactory.f12440b);
            }
        });

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f12441c;

        public DecodeJobFactory(LazyDiskCacheProvider lazyDiskCacheProvider) {
            this.f12439a = lazyDiskCacheProvider;
        }
    }

    public static class EngineJobFactory {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final GlideExecutor f12443a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final GlideExecutor f12444b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final GlideExecutor f12445c;
        public final GlideExecutor d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final Engine f12446e;
        public final Engine f;
        public final Pools.Pool g = FactoryPools.a(150, new FactoryPools.Factory<EngineJob<?>>() { // from class: com.bumptech.glide.load.engine.Engine.EngineJobFactory.1
            @Override // com.bumptech.glide.util.pool.FactoryPools.Factory
            public final Object a() {
                EngineJobFactory engineJobFactory = EngineJobFactory.this;
                GlideExecutor glideExecutor = engineJobFactory.f12443a;
                Pools.Pool pool = engineJobFactory.g;
                return new EngineJob(glideExecutor, engineJobFactory.f12444b, engineJobFactory.f12445c, engineJobFactory.d, engineJobFactory.f12446e, engineJobFactory.f, pool);
            }
        });

        public EngineJobFactory(GlideExecutor glideExecutor, GlideExecutor glideExecutor2, GlideExecutor glideExecutor3, GlideExecutor glideExecutor4, Engine engine, Engine engine2) {
            this.f12443a = glideExecutor;
            this.f12444b = glideExecutor2;
            this.f12445c = glideExecutor3;
            this.d = glideExecutor4;
            this.f12446e = engine;
            this.f = engine2;
        }
    }

    public static class LazyDiskCacheProvider implements DecodeJob.DiskCacheProvider {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final InternalCacheDiskCacheFactory f12448a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public volatile DiskCache f12449b;

        public LazyDiskCacheProvider(InternalCacheDiskCacheFactory internalCacheDiskCacheFactory) {
            this.f12448a = internalCacheDiskCacheFactory;
        }

        public final DiskCache a() {
            if (this.f12449b == null) {
                synchronized (this) {
                    try {
                        if (this.f12449b == null) {
                            this.f12449b = this.f12448a.a();
                        }
                        if (this.f12449b == null) {
                            this.f12449b = new DiskCacheAdapter();
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            }
            return this.f12449b;
        }
    }

    public class LoadStatus {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final EngineJob f12450a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final SingleRequest f12451b;

        public LoadStatus(SingleRequest singleRequest, EngineJob engineJob) {
            this.f12451b = singleRequest;
            this.f12450a = engineJob;
        }

        public final void a() {
            synchronized (Engine.this) {
                this.f12450a.g(this.f12451b);
            }
        }
    }

    public Engine(LruResourceCache lruResourceCache, InternalCacheDiskCacheFactory internalCacheDiskCacheFactory, GlideExecutor glideExecutor, GlideExecutor glideExecutor2, GlideExecutor glideExecutor3, GlideExecutor glideExecutor4) throws Throwable {
        this.f12437c = lruResourceCache;
        LazyDiskCacheProvider lazyDiskCacheProvider = new LazyDiskCacheProvider(internalCacheDiskCacheFactory);
        ActiveResources activeResources = new ActiveResources();
        this.g = activeResources;
        synchronized (this) {
            try {
                synchronized (activeResources) {
                    try {
                        try {
                            activeResources.d = this;
                        } catch (Throwable th) {
                            th = th;
                            while (true) {
                                try {
                                    throw th;
                                } catch (Throwable th2) {
                                    th = th2;
                                }
                            }
                        }
                    } catch (Throwable th3) {
                        th = th3;
                        throw th;
                    }
                }
                this.f12436b = new EngineKeyFactory();
                this.f12435a = new Jobs();
                this.d = new EngineJobFactory(glideExecutor, glideExecutor2, glideExecutor3, glideExecutor4, this, this);
                this.f = new DecodeJobFactory(lazyDiskCacheProvider);
                this.f12438e = new ResourceRecycler();
                lruResourceCache.d = this;
            } catch (Throwable th4) {
                th = th4;
            }
        }
    }

    public static void c(String str, long j, Key key) {
        StringBuilder sbX = a.x(str, " in ");
        sbX.append(LogTime.a(j));
        sbX.append("ms, key: ");
        sbX.append(key);
        Log.v("Engine", sbX.toString());
    }

    public static void g(Resource resource) {
        if (!(resource instanceof EngineResource)) {
            throw new IllegalArgumentException("Cannot release anything but an EngineResource");
        }
        ((EngineResource) resource).d();
    }

    public final LoadStatus a(GlideContext glideContext, Object obj, Key key, int i2, int i3, Class cls, Class cls2, Priority priority, DiskCacheStrategy diskCacheStrategy, CachedHashCodeArrayMap cachedHashCodeArrayMap, boolean z2, boolean z3, Options options, boolean z4, boolean z5, SingleRequest singleRequest, Executor executor) {
        long jElapsedRealtimeNanos;
        if (f12434h) {
            int i4 = LogTime.f12842b;
            jElapsedRealtimeNanos = SystemClock.elapsedRealtimeNanos();
        } else {
            jElapsedRealtimeNanos = 0;
        }
        this.f12436b.getClass();
        EngineKey engineKey = new EngineKey(obj, key, i2, i3, cachedHashCodeArrayMap, cls, cls2, options);
        synchronized (this) {
            try {
                EngineResource engineResourceB = b(engineKey, z4, jElapsedRealtimeNanos);
                if (engineResourceB == null) {
                    return h(glideContext, obj, key, i2, i3, cls, cls2, priority, diskCacheStrategy, cachedHashCodeArrayMap, z2, z3, options, z4, z5, singleRequest, executor, engineKey, jElapsedRealtimeNanos);
                }
                singleRequest.k(engineResourceB, DataSource.f0, false);
                return null;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final EngineResource b(EngineKey engineKey, boolean z2, long j) throws Throwable {
        Throwable th;
        EngineResource<?> engineResource;
        Engine engine;
        EngineKey engineKey2;
        EngineResource engineResource2;
        if (z2) {
            ActiveResources activeResources = this.g;
            synchronized (activeResources) {
                try {
                    ActiveResources.ResourceWeakReference resourceWeakReference = (ActiveResources.ResourceWeakReference) activeResources.f12393b.get(engineKey);
                    if (resourceWeakReference == null) {
                        engineResource = null;
                    } else {
                        engineResource = resourceWeakReference.get();
                        if (engineResource == null) {
                            try {
                                activeResources.b(resourceWeakReference);
                            } catch (Throwable th2) {
                                th = th2;
                                while (true) {
                                    try {
                                        throw th;
                                    } catch (Throwable th3) {
                                        th = th3;
                                    }
                                    th = th3;
                                }
                            }
                        }
                    }
                    if (engineResource != null) {
                        engineResource.b();
                    }
                    if (engineResource != null) {
                        if (f12434h) {
                            c("Loaded resource from active resources", j, engineKey);
                        }
                        return engineResource;
                    }
                    Resource resource = (Resource) this.f12437c.f(engineKey);
                    if (resource == null) {
                        engine = this;
                        engineKey2 = engineKey;
                        engineResource2 = null;
                    } else if (resource instanceof EngineResource) {
                        engineResource2 = (EngineResource) resource;
                        engine = this;
                        engineKey2 = engineKey;
                    } else {
                        engine = this;
                        engineKey2 = engineKey;
                        engineResource2 = new EngineResource(resource, true, true, engineKey2, engine);
                    }
                    if (engineResource2 != null) {
                        engineResource2.b();
                        engine.g.a(engineKey2, engineResource2);
                    }
                    if (engineResource2 != null) {
                        if (f12434h) {
                            c("Loaded resource from cache", j, engineKey2);
                        }
                        return engineResource2;
                    }
                } catch (Throwable th4) {
                    th = th4;
                }
            }
        }
        return null;
    }

    public final synchronized void d(EngineJob engineJob, Key key, EngineResource engineResource) {
        if (engineResource != null) {
            try {
                if (engineResource.X) {
                    this.g.a(key, engineResource);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        Jobs jobs = this.f12435a;
        jobs.getClass();
        engineJob.getClass();
        HashMap map = jobs.f12466a;
        if (engineJob.equals(map.get(key))) {
            map.remove(key);
        }
    }

    public final void e(Key key, EngineResource engineResource) {
        ActiveResources activeResources = this.g;
        synchronized (activeResources) {
            ActiveResources.ResourceWeakReference resourceWeakReference = (ActiveResources.ResourceWeakReference) activeResources.f12393b.remove(key);
            if (resourceWeakReference != null) {
                resourceWeakReference.f12397c = null;
                resourceWeakReference.clear();
            }
        }
        if (engineResource.X) {
        } else {
            this.f12438e.a(engineResource, false);
        }
    }

    public final void f(Resource resource) {
        this.f12438e.a(resource, true);
    }

    public final LoadStatus h(GlideContext glideContext, Object obj, Key key, int i2, int i3, Class cls, Class cls2, Priority priority, DiskCacheStrategy diskCacheStrategy, CachedHashCodeArrayMap cachedHashCodeArrayMap, boolean z2, boolean z3, Options options, boolean z4, boolean z5, SingleRequest singleRequest, Executor executor, EngineKey engineKey, long j) {
        GlideExecutor glideExecutor;
        EngineJob engineJob = (EngineJob) this.f12435a.f12466a.get(engineKey);
        if (engineJob != null) {
            engineJob.a(singleRequest, executor);
            if (f12434h) {
                c("Added to existing load", j, engineKey);
            }
            return new LoadStatus(singleRequest, engineJob);
        }
        EngineJob engineJob2 = (EngineJob) this.d.g.b();
        Preconditions.c(engineJob2, "Argument must not be null");
        synchronized (engineJob2) {
            engineJob2.l0 = engineKey;
            engineJob2.m0 = z4;
            engineJob2.n0 = z5;
        }
        DecodeJobFactory decodeJobFactory = this.f;
        DecodeJob decodeJob = (DecodeJob) decodeJobFactory.f12440b.b();
        Preconditions.c(decodeJob, "Argument must not be null");
        int i4 = decodeJobFactory.f12441c;
        decodeJobFactory.f12441c = i4 + 1;
        DecodeHelper decodeHelper = decodeJob.X;
        decodeHelper.f12406c = glideContext;
        decodeHelper.d = obj;
        decodeHelper.f12411n = key;
        decodeHelper.f12407e = i2;
        decodeHelper.f = i3;
        decodeHelper.f12412p = diskCacheStrategy;
        decodeHelper.g = cls;
        decodeHelper.f12408h = decodeJob.e0;
        decodeHelper.k = cls2;
        decodeHelper.o = priority;
        decodeHelper.f12409i = options;
        decodeHelper.j = cachedHashCodeArrayMap;
        decodeHelper.q = z2;
        decodeHelper.r = z3;
        decodeJob.i0 = glideContext;
        decodeJob.j0 = key;
        decodeJob.k0 = priority;
        decodeJob.l0 = engineKey;
        decodeJob.m0 = i2;
        decodeJob.n0 = i3;
        decodeJob.o0 = diskCacheStrategy;
        decodeJob.p0 = options;
        decodeJob.q0 = engineJob2;
        decodeJob.r0 = i4;
        decodeJob.t0 = DecodeJob.RunReason.X;
        decodeJob.v0 = obj;
        Jobs jobs = this.f12435a;
        jobs.getClass();
        jobs.f12466a.put(engineKey, engineJob2);
        engineJob2.a(singleRequest, executor);
        synchronized (engineJob2) {
            engineJob2.u0 = decodeJob;
            DecodeJob.Stage stageJ = decodeJob.j(DecodeJob.Stage.X);
            if (stageJ == DecodeJob.Stage.f12426Y || stageJ == DecodeJob.Stage.Z) {
                glideExecutor = engineJob2.h0;
            } else {
                glideExecutor = engineJob2.n0 ? engineJob2.j0 : engineJob2.i0;
            }
            glideExecutor.execute(decodeJob);
        }
        if (f12434h) {
            c("Started new load", j, engineKey);
        }
        return new LoadStatus(singleRequest, engineJob2);
    }
}
