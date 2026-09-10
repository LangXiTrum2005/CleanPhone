package kotlin.random;

import java.io.Serializable;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u00012\u00060\u0002j\u0002`\u0003:\u0001\u0004¨\u0006\u0005"}, d2 = {"Lkotlin/random/XorWowRandom;", "Lkotlin/random/Random;", "Ljava/io/Serializable;", "Lkotlin/io/Serializable;", "Companion", "kotlin-stdlib"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class XorWowRandom extends Random implements Serializable {
    private static final long serialVersionUID = 0;
    public int Z;
    public int e0;
    public int f0;
    public int g0;
    public int h0;
    public int i0;

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0002\b\u0003\b\u0082\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lkotlin/random/XorWowRandom$Companion;", "", "", "serialVersionUID", "J", "kotlin-stdlib"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
    }

    @Override // kotlin.random.Random
    public final int a(int i2) {
        return ((-i2) >> 31) & (d() >>> (32 - i2));
    }

    @Override // kotlin.random.Random
    public final int d() {
        int i2 = this.Z;
        int i3 = i2 ^ (i2 >>> 2);
        this.Z = this.e0;
        this.e0 = this.f0;
        this.f0 = this.g0;
        int i4 = this.h0;
        this.g0 = i4;
        int i5 = ((i3 ^ (i3 << 1)) ^ i4) ^ (i4 << 4);
        this.h0 = i5;
        int i6 = this.i0 + 362437;
        this.i0 = i6;
        return i5 + i6;
    }
}
