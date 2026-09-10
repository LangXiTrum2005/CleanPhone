package com.google.common.cache;

import com.google.common.base.Supplier;
import java.util.concurrent.atomic.AtomicLong;

/* JADX INFO: loaded from: classes4.dex */
@ElementTypesAreNonnullByDefault
final class LongAddables {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Supplier f19770a;

    /* JADX INFO: renamed from: com.google.common.cache.LongAddables$1, reason: invalid class name */
    public class AnonymousClass1 implements Supplier<LongAddable> {
        @Override // com.google.common.base.Supplier
        public final Object get() {
            return new LongAdder();
        }
    }

    /* JADX INFO: renamed from: com.google.common.cache.LongAddables$2, reason: invalid class name */
    public class AnonymousClass2 implements Supplier<LongAddable> {
        @Override // com.google.common.base.Supplier
        public final Object get() {
            return new PureJavaLongAddable();
        }
    }

    public static final class PureJavaLongAddable extends AtomicLong implements LongAddable {
        @Override // com.google.common.cache.LongAddable
        public final void a(long j) {
            getAndAdd(j);
        }

        @Override // com.google.common.cache.LongAddable
        public final void d() {
            getAndIncrement();
        }
    }

    static {
        Supplier anonymousClass2;
        try {
            new LongAdder();
            anonymousClass2 = new AnonymousClass1();
        } catch (Throwable unused) {
            anonymousClass2 = new AnonymousClass2();
        }
        f19770a = anonymousClass2;
    }

    public static LongAddable a() {
        return (LongAddable) f19770a.get();
    }
}
