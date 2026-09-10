package kotlin.random;

import kotlin.Metadata;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b \u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lkotlin/random/AbstractPlatformRandom;", "Lkotlin/random/Random;", "kotlin-stdlib"}, k = 1, mv = {2, 1, 0}, xi = 48)
public abstract class AbstractPlatformRandom extends Random {
    @Override // kotlin.random.Random
    public final int a(int i2) {
        return ((-i2) >> 31) & (i().nextInt() >>> (32 - i2));
    }

    @Override // kotlin.random.Random
    public final int d() {
        return i().nextInt();
    }

    @Override // kotlin.random.Random
    public final long g() {
        return i().nextLong();
    }

    public abstract java.util.Random i();

    public final int j(int i2) {
        return i().nextInt(i2);
    }
}
