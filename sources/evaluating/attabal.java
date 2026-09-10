package evaluating;

import p002kotlin.Metadata;
import p002kotlin.jvm.internal.Intrinsics;
import p002kotlin.random.Random;

/* JADX INFO: compiled from: PlatformRandom.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b \u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\b\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\b\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\b\u0010\u0007J\u000f\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0012\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0015\u001a\u00020\u0014H\u0016¢\u0006\u0004\b\u0015\u0010\u0016J\u0017\u0010\u0019\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u0017H\u0016¢\u0006\u0004\b\u0019\u0010\u001aR\u0014\u0010\u001e\u001a\u00020\u001b8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u001c\u0010\u001d¨\u0006\u001f"}, d2 = {"Levaluating/attabal;", "Lkotlin/random/Random;", "<init>", "()V", "", "bitCount", "nextBits", "(I)I", "nextInt", "()I", "until", "", "nextLong", "()J", "", "nextBoolean", "()Z", "", "nextDouble", "()D", "", "nextFloat", "()F", "", "array", "nextBytes", "([B)[B", "Ljava/util/Random;", "attabal", "()Ljava/util/Random;", "impl", "kotlin-stdlib"}, k = 1, mv = {2, 2, 0}, xi = 48)
public abstract class attabal extends Random {
    public abstract java.util.Random attabal();

    @Override // p002kotlin.random.Random
    public int nextBits(int bitCount) {
        return wireman.beachfront(attabal().nextInt(), bitCount);
    }

    @Override // p002kotlin.random.Random
    public boolean nextBoolean() {
        return attabal().nextBoolean();
    }

    @Override // p002kotlin.random.Random
    public byte[] nextBytes(byte[] array) {
        Intrinsics.checkNotNullParameter(array, "array");
        attabal().nextBytes(array);
        return array;
    }

    @Override // p002kotlin.random.Random
    public double nextDouble() {
        return attabal().nextDouble();
    }

    @Override // p002kotlin.random.Random
    public float nextFloat() {
        return attabal().nextFloat();
    }

    @Override // p002kotlin.random.Random
    public int nextInt() {
        return attabal().nextInt();
    }

    @Override // p002kotlin.random.Random
    public long nextLong() {
        return attabal().nextLong();
    }

    @Override // p002kotlin.random.Random
    public int nextInt(int until) {
        return attabal().nextInt(until);
    }
}
