package com.google.common.cache;

/* JADX INFO: loaded from: classes4.dex */
@ElementTypesAreNonnullByDefault
public abstract class AbstractCache<K, V> implements Cache<K, V> {

    public static final class SimpleStatsCounter implements StatsCounter {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final LongAddable f19733a = LongAddables.a();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final LongAddable f19734b = LongAddables.a();

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final LongAddable f19735c = LongAddables.a();
        public final LongAddable d = LongAddables.a();

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final LongAddable f19736e = LongAddables.a();
        public final LongAddable f = LongAddables.a();

        @Override // com.google.common.cache.AbstractCache.StatsCounter
        public final void a() {
            this.f19734b.a(1);
        }

        @Override // com.google.common.cache.AbstractCache.StatsCounter
        public final void b() {
            this.f.d();
        }

        @Override // com.google.common.cache.AbstractCache.StatsCounter
        public final void c(long j) {
            this.d.d();
            this.f19736e.a(j);
        }

        @Override // com.google.common.cache.AbstractCache.StatsCounter
        public final void d(long j) {
            this.f19735c.d();
            this.f19736e.a(j);
        }

        @Override // com.google.common.cache.AbstractCache.StatsCounter
        public final void e() {
            this.f19733a.a(1);
        }
    }

    public interface StatsCounter {
        void a();

        void b();

        void c(long j);

        void d(long j);

        void e();
    }
}
