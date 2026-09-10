package com.bumptech.glide.load.engine;

import com.bumptech.glide.load.Key;
import com.bumptech.glide.util.Preconditions;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* JADX INFO: loaded from: classes.dex */
class EngineResource<Z> implements Resource<Z> {
    public final boolean X;

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    public final boolean f12463Y;
    public final Resource Z;
    public final Engine e0;
    public final Key f0;
    public int g0;
    public boolean h0;

    public interface ResourceListener {
    }

    public EngineResource(Resource resource, boolean z2, boolean z3, Key key, Engine engine) {
        Preconditions.c(resource, "Argument must not be null");
        this.Z = resource;
        this.X = z2;
        this.f12463Y = z3;
        this.f0 = key;
        Preconditions.c(engine, "Argument must not be null");
        this.e0 = engine;
    }

    @Override // com.bumptech.glide.load.engine.Resource
    public final synchronized void a() {
        if (this.g0 > 0) {
            throw new IllegalStateException("Cannot recycle a resource while it is still acquired");
        }
        if (this.h0) {
            throw new IllegalStateException("Cannot recycle a resource that has already been recycled");
        }
        this.h0 = true;
        if (this.f12463Y) {
            this.Z.a();
        }
    }

    public final synchronized void b() {
        if (this.h0) {
            throw new IllegalStateException("Cannot acquire a recycled resource");
        }
        this.g0++;
    }

    @Override // com.bumptech.glide.load.engine.Resource
    public final Class c() {
        return this.Z.c();
    }

    public final void d() {
        boolean z2;
        synchronized (this) {
            int i2 = this.g0;
            if (i2 <= 0) {
                throw new IllegalStateException("Cannot release a recycled or not yet acquired resource");
            }
            z2 = true;
            int i3 = i2 - 1;
            this.g0 = i3;
            if (i3 != 0) {
                z2 = false;
            }
        }
        if (z2) {
            this.e0.e(this.f0, this);
        }
    }

    @Override // com.bumptech.glide.load.engine.Resource
    public final Object get() {
        return this.Z.get();
    }

    @Override // com.bumptech.glide.load.engine.Resource
    public final int getSize() {
        return this.Z.getSize();
    }

    public final synchronized String toString() {
        return "EngineResource{isMemoryCacheable=" + this.X + ", listener=" + this.e0 + ", key=" + this.f0 + ", acquired=" + this.g0 + ", isRecycled=" + this.h0 + ", resource=" + this.Z + AbstractJsonLexerKt.END_OBJ;
    }
}
