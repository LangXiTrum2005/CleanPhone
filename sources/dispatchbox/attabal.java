package dispatchbox;

import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;
import p002kotlin.Metadata;
import p002kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: PlatformThreadLocalRandom.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\n\u001a\u00020\t2\u0006\u0010\u0006\u001a\u00020\tH\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u001f\u0010\n\u001a\u00020\t2\u0006\u0010\u0005\u001a\u00020\t2\u0006\u0010\u0006\u001a\u00020\tH\u0016¢\u0006\u0004\b\n\u0010\fJ\u0017\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0006\u001a\u00020\rH\u0016¢\u0006\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0013\u001a\u00020\u00108VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u0014"}, d2 = {"Ldispatchbox/attabal;", "Levaluating/attabal;", "<init>", "()V", "", "from", "until", "nextInt", "(II)I", "", "nextLong", "(J)J", "(JJ)J", "", "nextDouble", "(D)D", "Ljava/util/Random;", "attabal", "()Ljava/util/Random;", "impl", "kotlin-stdlib-jdk8"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class attabal extends evaluating.attabal {
    @Override // evaluating.attabal
    public Random attabal() {
        ThreadLocalRandom threadLocalRandomCurrent = ThreadLocalRandom.current();
        Intrinsics.checkNotNullExpressionValue(threadLocalRandomCurrent, "current(...)");
        return threadLocalRandomCurrent;
    }

    @Override // p002kotlin.random.Random
    public double nextDouble(double until) {
        return ThreadLocalRandom.current().nextDouble(until);
    }

    @Override // p002kotlin.random.Random
    public int nextInt(int from, int until) {
        return ThreadLocalRandom.current().nextInt(from, until);
    }

    @Override // p002kotlin.random.Random
    public long nextLong(long until) {
        return ThreadLocalRandom.current().nextLong(until);
    }

    @Override // p002kotlin.random.Random
    public long nextLong(long from, long until) {
        return ThreadLocalRandom.current().nextLong(from, until);
    }
}
