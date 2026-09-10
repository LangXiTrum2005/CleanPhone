package com.chartboost.sdk.impl;

import com.chartboost.sdk.impl.t3;
import com.google.android.exoplayer2.upstream.cache.Cache;
import com.google.android.exoplayer2.upstream.cache.CacheEvictor;
import com.google.android.exoplayer2.upstream.cache.CacheSpan;
import java.util.Comparator;
import java.util.TreeSet;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes3.dex */
public final class t3 implements CacheEvictor {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f15169a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final b f15170b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Function0 f15171c;
    public final Lazy d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public long f15172e;

    public interface b {
        void c(String str);
    }

    public static final class c extends Lambda implements Function0 {
        public c() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final TreeSet invoke() {
            return (TreeSet) t3.this.f15171c.invoke();
        }
    }

    public t3(long j, b evictUrlCallback, Function0 treeSetFactory) {
        Intrinsics.f(evictUrlCallback, "evictUrlCallback");
        Intrinsics.f(treeSetFactory, "treeSetFactory");
        this.f15169a = j;
        this.f15170b = evictUrlCallback;
        this.f15171c = treeSetFactory;
        this.d = LazyKt.b(new c());
    }

    @Override // com.google.android.exoplayer2.upstream.cache.CacheEvictor
    public void onCacheInitialized() {
    }

    @Override // com.google.android.exoplayer2.upstream.cache.Cache.Listener
    public void onSpanAdded(Cache cache, CacheSpan span) {
        Intrinsics.f(cache, "cache");
        Intrinsics.f(span, "span");
        a().add(span);
        this.f15172e += span.Z;
        a(cache, 0L);
    }

    @Override // com.google.android.exoplayer2.upstream.cache.Cache.Listener
    public void onSpanRemoved(Cache cache, CacheSpan span) {
        Intrinsics.f(cache, "cache");
        Intrinsics.f(span, "span");
        a().remove(span);
        this.f15172e -= span.Z;
    }

    @Override // com.google.android.exoplayer2.upstream.cache.Cache.Listener
    public void onSpanTouched(Cache cache, CacheSpan oldSpan, CacheSpan newSpan) {
        Intrinsics.f(cache, "cache");
        Intrinsics.f(oldSpan, "oldSpan");
        Intrinsics.f(newSpan, "newSpan");
        onSpanRemoved(cache, oldSpan);
        onSpanAdded(cache, newSpan);
    }

    @Override // com.google.android.exoplayer2.upstream.cache.CacheEvictor
    public void onStartFile(Cache cache, String key, long j, long j2) {
        Intrinsics.f(cache, "cache");
        Intrinsics.f(key, "key");
        if (j2 != -1) {
            a(cache, j2);
        }
    }

    @Override // com.google.android.exoplayer2.upstream.cache.CacheEvictor
    public boolean requiresCacheSpanTouches() {
        return true;
    }

    public static final class a extends Lambda implements Function0 {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final a f15173b = new a();

        /* JADX INFO: renamed from: com.chartboost.sdk.impl.t3$a$a, reason: collision with other inner class name */
        public /* synthetic */ class C0174a extends FunctionReferenceImpl implements Function2 {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public static final C0174a f15174b = new C0174a();

            public C0174a() {
                super(2, u3.class, "compare", "compare(Lcom/google/android/exoplayer2/upstream/cache/CacheSpan;Lcom/google/android/exoplayer2/upstream/cache/CacheSpan;)I", 1);
            }

            @Override // kotlin.jvm.functions.Function2
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Integer invoke(CacheSpan p0, CacheSpan p1) {
                Intrinsics.f(p0, "p0");
                Intrinsics.f(p1, "p1");
                return Integer.valueOf(u3.b(p0, p1));
            }
        }

        public a() {
            super(0);
        }

        public static final int a(Function2 tmp0, Object obj, Object obj2) {
            Intrinsics.f(tmp0, "$tmp0");
            return ((Number) tmp0.invoke(obj, obj2)).intValue();
        }

        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final TreeSet invoke() {
            final C0174a c0174a = C0174a.f15174b;
            return new TreeSet(new Comparator() { // from class: p.j
                @Override // java.util.Comparator
                public final int compare(Object obj, Object obj2) {
                    return t3.a.a(c0174a, obj, obj2);
                }
            });
        }
    }

    public final void a(Cache cache, long j) {
        while (this.f15172e + j > this.f15169a && !a().isEmpty()) {
            CacheSpan cacheSpan = (CacheSpan) a().first();
            za.a("evictCache() - " + cacheSpan.X, (Throwable) null, 2, (Object) null);
            cache.e(cacheSpan);
            b bVar = this.f15170b;
            String key = cacheSpan.X;
            Intrinsics.e(key, "key");
            bVar.c(key);
        }
    }

    public /* synthetic */ t3(long j, b bVar, Function0 function0, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(j, bVar, (i2 & 4) != 0 ? a.f15173b : function0);
    }

    public final TreeSet a() {
        return (TreeSet) this.d.getX();
    }
}
