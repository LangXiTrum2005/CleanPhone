package com.google.common.hash;

import com.google.common.base.Supplier;
import java.util.concurrent.atomic.AtomicLong;

/* JADX INFO: loaded from: classes4.dex */
@ElementTypesAreNonnullByDefault
final class LongAddables {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Supplier f20004a;

    /* JADX INFO: renamed from: com.google.common.hash.LongAddables$1, reason: invalid class name */
    public class AnonymousClass1 implements Supplier<LongAddable> {
        @Override // com.google.common.base.Supplier
        public final Object get() {
            return new LongAdder();
        }
    }

    /* JADX INFO: renamed from: com.google.common.hash.LongAddables$2, reason: invalid class name */
    public class AnonymousClass2 implements Supplier<LongAddable> {
        @Override // com.google.common.base.Supplier
        public final Object get() {
            return new PureJavaLongAddable();
        }
    }

    public static final class PureJavaLongAddable extends AtomicLong implements LongAddable {
        @Override // com.google.common.hash.LongAddable
        public final void a(long j) {
            getAndAdd(j);
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
        f20004a = anonymousClass2;
    }
}
