package com.bumptech.glide.util.pool;

import android.util.Log;
import androidx.core.util.Pools;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class FactoryPools {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Resetter f12855a = new AnonymousClass1();

    /* JADX INFO: renamed from: com.bumptech.glide.util.pool.FactoryPools$1, reason: invalid class name */
    public class AnonymousClass1 implements Resetter<Object> {
        @Override // com.bumptech.glide.util.pool.FactoryPools.Resetter
        public final void a(Object obj) {
        }
    }

    /* JADX INFO: renamed from: com.bumptech.glide.util.pool.FactoryPools$2, reason: invalid class name */
    class AnonymousClass2 implements Factory<List<Object>> {
        @Override // com.bumptech.glide.util.pool.FactoryPools.Factory
        public final Object a() {
            return new ArrayList();
        }
    }

    /* JADX INFO: renamed from: com.bumptech.glide.util.pool.FactoryPools$3, reason: invalid class name */
    class AnonymousClass3 implements Resetter<List<Object>> {
        @Override // com.bumptech.glide.util.pool.FactoryPools.Resetter
        public final void a(Object obj) {
            ((List) obj).clear();
        }
    }

    public interface Factory<T> {
        Object a();
    }

    public static final class FactoryPool<T> implements Pools.Pool<T> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Factory f12856a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Resetter f12857b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final Pools.SynchronizedPool f12858c;

        public FactoryPool(Pools.SynchronizedPool synchronizedPool, Factory factory, Resetter resetter) {
            this.f12858c = synchronizedPool;
            this.f12856a = factory;
            this.f12857b = resetter;
        }

        @Override // androidx.core.util.Pools.Pool
        public final boolean a(Object obj) {
            if (obj instanceof Poolable) {
                ((StateVerifier.DefaultStateVerifier) ((Poolable) obj).b()).f12859a = true;
            }
            this.f12857b.a(obj);
            return this.f12858c.a(obj);
        }

        @Override // androidx.core.util.Pools.Pool
        public final Object b() {
            Object objB = this.f12858c.b();
            if (objB == null) {
                objB = this.f12856a.a();
                if (Log.isLoggable("FactoryPools", 2)) {
                    Log.v("FactoryPools", "Created new " + objB.getClass());
                }
            }
            if (objB instanceof Poolable) {
                ((StateVerifier.DefaultStateVerifier) ((Poolable) objB).b()).f12859a = false;
            }
            return objB;
        }
    }

    public interface Poolable {
        StateVerifier b();
    }

    public interface Resetter<T> {
        void a(Object obj);
    }

    public static Pools.Pool a(int i2, Factory factory) {
        return new FactoryPool(new Pools.SynchronizedPool(i2), factory, f12855a);
    }

    public static Pools.Pool b() {
        return new FactoryPool(new Pools.SynchronizedPool(20), new AnonymousClass2(), new AnonymousClass3());
    }
}
