package com.facebook.ads.redexgen.core;

import java.util.Arrays;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.g3, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class C1589g3<V> {
    public int A00;
    public int A01;
    public long[] A02;
    public V[] A03;

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.g3 != com.google.android.exoplayer2.util.TimedValueQueue<V> */
    public C1589g3() {
        this(10);
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.g3 != com.google.android.exoplayer2.util.TimedValueQueue<V> */
    public C1589g3(int i) {
        this.A02 = new long[i];
        this.A03 = (V[]) A00(i);
    }

    public static <V> V[] A00(int i) {
        return (V[]) new Object[i];
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.g3 != com.google.android.exoplayer2.util.TimedValueQueue<V> */
    public final synchronized int A01() {
        return this.A01;
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.g3 != com.google.android.exoplayer2.util.TimedValueQueue<V> */
    public final synchronized void A02() {
        this.A00 = 0;
        this.A01 = 0;
        Arrays.fill(this.A03, (Object) null);
    }
}
