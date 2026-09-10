package com.facebook.ads.redexgen.core;

import java.util.Map;

/* JADX INFO: Add missing generic type declarations: [V, K] */
/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.lV, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public class C1916lV<K, V> extends C4C<K, V> {
    public final /* synthetic */ C1915lU A00;

    public C1916lV(C1915lU c1915lU) {
        this.A00 = c1915lU;
    }

    @Override // com.facebook.ads.redexgen.core.C4C
    public final int A04() {
        return ((C4F) this.A00).A00;
    }

    @Override // com.facebook.ads.redexgen.core.C4C
    public final int A05(Object obj) {
        return this.A00.A08(obj);
    }

    @Override // com.facebook.ads.redexgen.core.C4C
    public final int A06(Object obj) {
        return this.A00.A07(obj);
    }

    @Override // com.facebook.ads.redexgen.core.C4C
    public final Map<K, V> A07() {
        return this.A00;
    }

    @Override // com.facebook.ads.redexgen.core.C4C
    public final Object A0B(int i, int i2) {
        return this.A00.A02[(i << 1) + i2];
    }

    @Override // com.facebook.ads.redexgen.core.C4C
    public final V A0C(int i, V value) {
        return this.A00.A0C(i, value);
    }

    @Override // com.facebook.ads.redexgen.core.C4C
    public final void A0D() {
        this.A00.clear();
    }

    @Override // com.facebook.ads.redexgen.core.C4C
    public final void A0E(int i) {
        this.A00.A0A(i);
    }

    @Override // com.facebook.ads.redexgen.core.C4C
    public final void A0F(K key, V value) {
        this.A00.put(key, value);
    }
}
