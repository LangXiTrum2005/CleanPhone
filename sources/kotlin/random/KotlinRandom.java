package kotlin.random;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0002\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lkotlin/random/KotlinRandom;", "Ljava/util/Random;", "Companion", "kotlin-stdlib"}, k = 1, mv = {2, 1, 0}, xi = 48)
final class KotlinRandom extends java.util.Random {
    private static final long serialVersionUID = 0;

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0002\b\u0003\b\u0082\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lkotlin/random/KotlinRandom$Companion;", "", "", "serialVersionUID", "J", "kotlin-stdlib"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
    }

    @Override // java.util.Random
    public final int next(int i2) {
        throw null;
    }

    @Override // java.util.Random
    public final boolean nextBoolean() {
        throw null;
    }

    @Override // java.util.Random
    public final void nextBytes(byte[] bytes) {
        Intrinsics.f(bytes, "bytes");
        throw null;
    }

    @Override // java.util.Random
    public final double nextDouble() {
        throw null;
    }

    @Override // java.util.Random
    public final float nextFloat() {
        throw null;
    }

    @Override // java.util.Random
    public final int nextInt() {
        throw null;
    }

    @Override // java.util.Random
    public final long nextLong() {
        throw null;
    }

    @Override // java.util.Random
    public final void setSeed(long j) {
        throw new UnsupportedOperationException("Setting seed is not supported.");
    }

    @Override // java.util.Random
    public final int nextInt(int i2) {
        throw null;
    }
}
