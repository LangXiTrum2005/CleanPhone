package com.bumptech.glide.load.engine;

import androidx.core.util.Pools;
import com.bumptech.glide.util.pool.FactoryPools;
import com.bumptech.glide.util.pool.StateVerifier;

/* JADX INFO: loaded from: classes.dex */
final class LockedResource<Z> implements Resource<Z>, FactoryPools.Poolable {
    public static final Pools.Pool f0 = FactoryPools.a(20, new AnonymousClass1());
    public final StateVerifier X = StateVerifier.a();

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    public Resource f12470Y;
    public boolean Z;
    public boolean e0;

    /* JADX INFO: renamed from: com.bumptech.glide.load.engine.LockedResource$1, reason: invalid class name */
    public class AnonymousClass1 implements FactoryPools.Factory<LockedResource<?>> {
        @Override // com.bumptech.glide.util.pool.FactoryPools.Factory
        public final Object a() {
            return new LockedResource();
        }
    }

    @Override // com.bumptech.glide.load.engine.Resource
    public final synchronized void a() {
        this.X.b();
        this.e0 = true;
        if (!this.Z) {
            this.f12470Y.a();
            this.f12470Y = null;
            f0.a(this);
        }
    }

    @Override // com.bumptech.glide.util.pool.FactoryPools.Poolable
    public final StateVerifier b() {
        return this.X;
    }

    @Override // com.bumptech.glide.load.engine.Resource
    public final Class c() {
        return this.f12470Y.c();
    }

    public final synchronized void d() {
        this.X.b();
        if (!this.Z) {
            throw new IllegalStateException("Already unlocked");
        }
        this.Z = false;
        if (this.e0) {
            a();
        }
    }

    @Override // com.bumptech.glide.load.engine.Resource
    public final Object get() {
        return this.f12470Y.get();
    }

    @Override // com.bumptech.glide.load.engine.Resource
    public final int getSize() {
        return this.f12470Y.getSize();
    }
}
