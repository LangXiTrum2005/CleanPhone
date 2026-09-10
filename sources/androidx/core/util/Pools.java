package androidx.core.util;

import com.google.android.gms.ads.RequestConfiguration;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Landroidx/core/util/Pools;", "", "Pool", "SimplePool", "SynchronizedPool", "core_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class Pools {

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\bf\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\u00020\u0001ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0003À\u0006\u0001"}, d2 = {"Landroidx/core/util/Pools$Pool;", "", RequestConfiguration.MAX_AD_CONTENT_RATING_T, "core_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public interface Pool<T> {
        boolean a(Object obj);

        Object b();
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0016\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\b\u0012\u0004\u0012\u00028\u00000\u0003¨\u0006\u0004"}, d2 = {"Landroidx/core/util/Pools$SimplePool;", "", RequestConfiguration.MAX_AD_CONTENT_RATING_T, "Landroidx/core/util/Pools$Pool;", "core_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static class SimplePool<T> implements Pool<T> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Object[] f4409a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f4410b;

        public SimplePool(int i2) {
            if (i2 <= 0) {
                throw new IllegalArgumentException("The max pool size must be > 0");
            }
            this.f4409a = new Object[i2];
        }

        @Override // androidx.core.util.Pools.Pool
        public boolean a(Object instance) {
            Object[] objArr;
            boolean z2;
            Intrinsics.f(instance, "instance");
            int i2 = this.f4410b;
            int i3 = 0;
            while (true) {
                objArr = this.f4409a;
                if (i3 >= i2) {
                    z2 = false;
                    break;
                }
                if (objArr[i3] == instance) {
                    z2 = true;
                    break;
                }
                i3++;
            }
            if (z2) {
                throw new IllegalStateException("Already in the pool!");
            }
            int i4 = this.f4410b;
            if (i4 >= objArr.length) {
                return false;
            }
            objArr[i4] = instance;
            this.f4410b = i4 + 1;
            return true;
        }

        @Override // androidx.core.util.Pools.Pool
        public Object b() {
            int i2 = this.f4410b;
            if (i2 <= 0) {
                return null;
            }
            int i3 = i2 - 1;
            Object[] objArr = this.f4409a;
            Object obj = objArr[i3];
            Intrinsics.d(obj, "null cannot be cast to non-null type T of androidx.core.util.Pools.SimplePool");
            objArr[i3] = null;
            this.f4410b--;
            return obj;
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0016\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\b\u0012\u0004\u0012\u00028\u00000\u0003¨\u0006\u0004"}, d2 = {"Landroidx/core/util/Pools$SynchronizedPool;", "", RequestConfiguration.MAX_AD_CONTENT_RATING_T, "Landroidx/core/util/Pools$SimplePool;", "core_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static class SynchronizedPool<T> extends SimplePool<T> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final Object f4411c;

        public SynchronizedPool(int i2) {
            super(i2);
            this.f4411c = new Object();
        }

        @Override // androidx.core.util.Pools.SimplePool, androidx.core.util.Pools.Pool
        public final boolean a(Object instance) {
            boolean zA;
            Intrinsics.f(instance, "instance");
            synchronized (this.f4411c) {
                zA = super.a(instance);
            }
            return zA;
        }

        @Override // androidx.core.util.Pools.SimplePool, androidx.core.util.Pools.Pool
        public final Object b() {
            Object objB;
            synchronized (this.f4411c) {
                objB = super.b();
            }
            return objB;
        }
    }
}
