package com.google.common.cache;

import com.google.common.base.Ascii;
import com.google.common.base.Equivalence;
import com.google.common.base.MoreObjects;
import com.google.common.base.Preconditions;
import com.google.common.base.Supplier;
import com.google.common.base.Suppliers;
import com.google.common.base.Ticker;
import java.util.logging.Level;
import java.util.logging.Logger;

/* JADX INFO: loaded from: classes4.dex */
@ElementTypesAreNonnullByDefault
public final class CacheBuilder<K, V> {
    public static final Supplier o = Suppliers.b(new AnonymousClass1());

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final Ticker f19737p = new AnonymousClass3();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f19738a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f19739b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public long f19740c;
    public long d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Weigher f19741e;
    public LocalCache.Strength f;
    public LocalCache.Strength g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public long f19742h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public long f19743i;
    public Equivalence j;
    public Equivalence k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public RemovalListener f19744l;
    public Ticker m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public Supplier f19745n;

    /* JADX INFO: renamed from: com.google.common.cache.CacheBuilder$2, reason: invalid class name */
    public class AnonymousClass2 implements Supplier<AbstractCache.StatsCounter> {
        @Override // com.google.common.base.Supplier
        public final Object get() {
            return new AbstractCache.SimpleStatsCounter();
        }
    }

    /* JADX INFO: renamed from: com.google.common.cache.CacheBuilder$3, reason: invalid class name */
    public class AnonymousClass3 extends Ticker {
        @Override // com.google.common.base.Ticker
        public final long a() {
            return 0L;
        }
    }

    public static final class LoggerHolder {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final Logger f19746a = Logger.getLogger(CacheBuilder.class.getName());
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class NullListener implements RemovalListener<Object, Object> {
        public static final NullListener X;

        /* JADX INFO: renamed from: Y, reason: collision with root package name */
        public static final /* synthetic */ NullListener[] f19747Y;

        static {
            NullListener nullListener = new NullListener("INSTANCE", 0);
            X = nullListener;
            f19747Y = new NullListener[]{nullListener};
        }

        public static NullListener valueOf(String str) {
            return (NullListener) Enum.valueOf(NullListener.class, str);
        }

        public static NullListener[] values() {
            return (NullListener[]) f19747Y.clone();
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class OneWeigher implements Weigher<Object, Object> {
        public static final OneWeigher X;

        /* JADX INFO: renamed from: Y, reason: collision with root package name */
        public static final /* synthetic */ OneWeigher[] f19748Y;

        static {
            OneWeigher oneWeigher = new OneWeigher("INSTANCE", 0);
            X = oneWeigher;
            f19748Y = new OneWeigher[]{oneWeigher};
        }

        public static OneWeigher valueOf(String str) {
            return (OneWeigher) Enum.valueOf(OneWeigher.class, str);
        }

        public static OneWeigher[] values() {
            return (OneWeigher[]) f19748Y.clone();
        }
    }

    public static CacheBuilder c() {
        CacheBuilder cacheBuilder = new CacheBuilder();
        cacheBuilder.f19738a = true;
        cacheBuilder.f19739b = -1;
        cacheBuilder.f19740c = -1L;
        cacheBuilder.d = -1L;
        cacheBuilder.f19742h = -1L;
        cacheBuilder.f19743i = -1L;
        cacheBuilder.f19745n = o;
        return cacheBuilder;
    }

    public final LoadingCache a(CacheLoader cacheLoader) {
        b();
        cacheLoader.getClass();
        return new LocalCache.LocalLoadingCache(new LocalCache(this, cacheLoader));
    }

    public final void b() {
        if (this.f19741e == null) {
            Preconditions.o("maximumWeight requires weigher", this.d == -1);
        } else if (this.f19738a) {
            Preconditions.o("weigher requires maximumWeight", this.d != -1);
        } else if (this.d == -1) {
            LoggerHolder.f19746a.log(Level.WARNING, "ignoring weigher specified without maximumWeight");
        }
    }

    public final void d() {
        LocalCache.Strength.AnonymousClass3 anonymousClass3 = LocalCache.Strength.f19761Y;
        LocalCache.Strength strength = this.f;
        Preconditions.q(strength == null, "Key strength was already set to %s", strength);
        this.f = anonymousClass3;
    }

    public final String toString() {
        MoreObjects.ToStringHelper toStringHelperB = MoreObjects.b(this);
        int i2 = this.f19739b;
        if (i2 != -1) {
            toStringHelperB.c("concurrencyLevel", String.valueOf(i2));
        }
        long j = this.f19740c;
        if (j != -1) {
            toStringHelperB.a(j, "maximumSize");
        }
        long j2 = this.d;
        if (j2 != -1) {
            toStringHelperB.a(j2, "maximumWeight");
        }
        if (this.f19742h != -1) {
            toStringHelperB.b(android.support.v4.media.a.j(this.f19742h, "ns", new StringBuilder()), "expireAfterWrite");
        }
        if (this.f19743i != -1) {
            toStringHelperB.b(android.support.v4.media.a.j(this.f19743i, "ns", new StringBuilder()), "expireAfterAccess");
        }
        LocalCache.Strength strength = this.f;
        if (strength != null) {
            toStringHelperB.b(Ascii.b(strength.toString()), "keyStrength");
        }
        LocalCache.Strength strength2 = this.g;
        if (strength2 != null) {
            toStringHelperB.b(Ascii.b(strength2.toString()), "valueStrength");
        }
        if (this.j != null) {
            toStringHelperB.d("keyEquivalence");
        }
        if (this.k != null) {
            toStringHelperB.d("valueEquivalence");
        }
        if (this.f19744l != null) {
            toStringHelperB.d("removalListener");
        }
        return toStringHelperB.toString();
    }

    /* JADX INFO: renamed from: com.google.common.cache.CacheBuilder$1, reason: invalid class name */
    public class AnonymousClass1 implements AbstractCache.StatsCounter {
        @Override // com.google.common.cache.AbstractCache.StatsCounter
        public final void b() {
        }

        @Override // com.google.common.cache.AbstractCache.StatsCounter
        public final void c(long j) {
        }

        @Override // com.google.common.cache.AbstractCache.StatsCounter
        public final void d(long j) {
        }

        @Override // com.google.common.cache.AbstractCache.StatsCounter
        public final void a() {
        }

        @Override // com.google.common.cache.AbstractCache.StatsCounter
        public final void e() {
        }
    }
}
