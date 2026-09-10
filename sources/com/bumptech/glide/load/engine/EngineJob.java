package com.bumptech.glide.load.engine;

import androidx.core.util.Pools;
import com.bumptech.glide.load.DataSource;
import com.bumptech.glide.load.Key;
import com.bumptech.glide.load.engine.executor.GlideExecutor;
import com.bumptech.glide.request.SingleRequest;
import com.bumptech.glide.util.Executors;
import com.bumptech.glide.util.Preconditions;
import com.bumptech.glide.util.pool.FactoryPools;
import com.bumptech.glide.util.pool.StateVerifier;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes.dex */
class EngineJob<R> implements DecodeJob.Callback<R>, FactoryPools.Poolable {
    public static final EngineResourceFactory x0 = new EngineResourceFactory();
    public final ResourceCallbacksAndExecutors X;

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    public final StateVerifier f12453Y;
    public final Engine Z;
    public final Pools.Pool e0;
    public final EngineResourceFactory f0;
    public final Engine g0;
    public final GlideExecutor h0;
    public final GlideExecutor i0;
    public final GlideExecutor j0;
    public final AtomicInteger k0;
    public Key l0;
    public boolean m0;
    public boolean n0;
    public Resource o0;
    public DataSource p0;
    public boolean q0;
    public GlideException r0;
    public boolean s0;
    public EngineResource t0;
    public DecodeJob u0;
    public volatile boolean v0;
    public boolean w0;

    public class CallLoadFailed implements Runnable {
        public final SingleRequest X;

        public CallLoadFailed(SingleRequest singleRequest) {
            this.X = singleRequest;
        }

        @Override // java.lang.Runnable
        public final void run() {
            synchronized (this.X.d()) {
                synchronized (EngineJob.this) {
                    try {
                        ResourceCallbacksAndExecutors resourceCallbacksAndExecutors = EngineJob.this.X;
                        SingleRequest singleRequest = this.X;
                        resourceCallbacksAndExecutors.getClass();
                        if (resourceCallbacksAndExecutors.X.contains(new ResourceCallbackAndExecutor(singleRequest, Executors.f12838b))) {
                            EngineJob engineJob = EngineJob.this;
                            SingleRequest singleRequest2 = this.X;
                            engineJob.getClass();
                            try {
                                singleRequest2.j(engineJob.r0, 5);
                            } catch (Throwable th) {
                                throw new CallbackException(th);
                            }
                        }
                        EngineJob.this.c();
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
            }
        }
    }

    public class CallResourceReady implements Runnable {
        public final SingleRequest X;

        public CallResourceReady(SingleRequest singleRequest) {
            this.X = singleRequest;
        }

        @Override // java.lang.Runnable
        public final void run() {
            synchronized (this.X.d()) {
                synchronized (EngineJob.this) {
                    try {
                        ResourceCallbacksAndExecutors resourceCallbacksAndExecutors = EngineJob.this.X;
                        SingleRequest singleRequest = this.X;
                        resourceCallbacksAndExecutors.getClass();
                        if (resourceCallbacksAndExecutors.X.contains(new ResourceCallbackAndExecutor(singleRequest, Executors.f12838b))) {
                            EngineJob.this.t0.b();
                            EngineJob engineJob = EngineJob.this;
                            SingleRequest singleRequest2 = this.X;
                            engineJob.getClass();
                            try {
                                singleRequest2.k(engineJob.t0, engineJob.p0, engineJob.w0);
                                EngineJob.this.g(this.X);
                            } catch (Throwable th) {
                                throw new CallbackException(th);
                            }
                        }
                        EngineJob.this.c();
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
            }
        }
    }

    public static class EngineResourceFactory {
    }

    public static final class ResourceCallbackAndExecutor {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final SingleRequest f12456a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Executor f12457b;

        public ResourceCallbackAndExecutor(SingleRequest singleRequest, Executor executor) {
            this.f12456a = singleRequest;
            this.f12457b = executor;
        }

        public final boolean equals(Object obj) {
            if (obj instanceof ResourceCallbackAndExecutor) {
                return this.f12456a.equals(((ResourceCallbackAndExecutor) obj).f12456a);
            }
            return false;
        }

        public final int hashCode() {
            return this.f12456a.hashCode();
        }
    }

    public static final class ResourceCallbacksAndExecutors implements Iterable<ResourceCallbackAndExecutor> {
        public final ArrayList X;

        public ResourceCallbacksAndExecutors(ArrayList arrayList) {
            this.X = arrayList;
        }

        @Override // java.lang.Iterable
        public final Iterator<ResourceCallbackAndExecutor> iterator() {
            return this.X.iterator();
        }
    }

    public EngineJob(GlideExecutor glideExecutor, GlideExecutor glideExecutor2, GlideExecutor glideExecutor3, GlideExecutor glideExecutor4, Engine engine, Engine engine2, Pools.Pool pool) {
        EngineResourceFactory engineResourceFactory = x0;
        this.X = new ResourceCallbacksAndExecutors(new ArrayList(2));
        this.f12453Y = StateVerifier.a();
        this.k0 = new AtomicInteger();
        this.h0 = glideExecutor;
        this.i0 = glideExecutor2;
        this.j0 = glideExecutor4;
        this.g0 = engine;
        this.Z = engine2;
        this.e0 = pool;
        this.f0 = engineResourceFactory;
    }

    public final synchronized void a(SingleRequest singleRequest, Executor executor) {
        try {
            this.f12453Y.b();
            ResourceCallbacksAndExecutors resourceCallbacksAndExecutors = this.X;
            resourceCallbacksAndExecutors.getClass();
            resourceCallbacksAndExecutors.X.add(new ResourceCallbackAndExecutor(singleRequest, executor));
            if (this.q0) {
                d(1);
                executor.execute(new CallResourceReady(singleRequest));
            } else if (this.s0) {
                d(1);
                executor.execute(new CallLoadFailed(singleRequest));
            } else {
                Preconditions.a("Cannot add callbacks to a cancelled EngineJob", !this.v0);
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // com.bumptech.glide.util.pool.FactoryPools.Poolable
    public final StateVerifier b() {
        return this.f12453Y;
    }

    public final void c() {
        EngineResource engineResource;
        synchronized (this) {
            try {
                this.f12453Y.b();
                Preconditions.a("Not yet complete!", e());
                int iDecrementAndGet = this.k0.decrementAndGet();
                Preconditions.a("Can't decrement below 0", iDecrementAndGet >= 0);
                if (iDecrementAndGet == 0) {
                    engineResource = this.t0;
                    f();
                } else {
                    engineResource = null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (engineResource != null) {
            engineResource.d();
        }
    }

    public final synchronized void d(int i2) {
        EngineResource engineResource;
        Preconditions.a("Not yet complete!", e());
        if (this.k0.getAndAdd(i2) == 0 && (engineResource = this.t0) != null) {
            engineResource.b();
        }
    }

    public final boolean e() {
        return this.s0 || this.q0 || this.v0;
    }

    public final synchronized void f() {
        boolean zA;
        if (this.l0 == null) {
            throw new IllegalArgumentException();
        }
        this.X.X.clear();
        this.l0 = null;
        this.t0 = null;
        this.o0 = null;
        this.s0 = false;
        this.v0 = false;
        this.q0 = false;
        this.w0 = false;
        DecodeJob decodeJob = this.u0;
        DecodeJob.ReleaseManager releaseManager = decodeJob.h0;
        synchronized (releaseManager) {
            releaseManager.f12422a = true;
            zA = releaseManager.a();
        }
        if (zA) {
            decodeJob.m();
        }
        this.u0 = null;
        this.r0 = null;
        this.p0 = null;
        this.e0.a(this);
    }

    public final synchronized void g(SingleRequest singleRequest) {
        try {
            this.f12453Y.b();
            ResourceCallbacksAndExecutors resourceCallbacksAndExecutors = this.X;
            resourceCallbacksAndExecutors.X.remove(new ResourceCallbackAndExecutor(singleRequest, Executors.f12838b));
            if (this.X.X.isEmpty()) {
                if (!e()) {
                    this.v0 = true;
                    DecodeJob decodeJob = this.u0;
                    decodeJob.E0 = true;
                    DataFetcherGenerator dataFetcherGenerator = decodeJob.C0;
                    if (dataFetcherGenerator != null) {
                        dataFetcherGenerator.cancel();
                    }
                    Engine engine = this.g0;
                    Key key = this.l0;
                    synchronized (engine) {
                        Jobs jobs = engine.f12435a;
                        jobs.getClass();
                        HashMap map = jobs.f12466a;
                        if (equals(map.get(key))) {
                            map.remove(key);
                        }
                    }
                }
                if (this.q0 || this.s0) {
                    if (this.k0.get() == 0) {
                        f();
                    }
                }
            }
        } catch (Throwable th) {
            throw th;
        }
    }
}
