package com.facebook.ads.redexgen.core;

import java.util.Map;

/* JADX INFO: Add missing generic type declarations: [V, K] */
/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.i8, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public class C2385i8<K, V> extends PC<K, V> {
    public final /* synthetic */ C2384i7 A00;

    public C2385i8(C2384i7 c2384i7) {
        this.A00 = c2384i7;
    }

    @Override // com.facebook.ads.redexgen.core.PC
    public final int A04() {
        return ((PF) this.A00).A00;
    }

    @Override // com.facebook.ads.redexgen.core.PC
    public final int A05(Object obj) {
        return this.A00.A08(obj);
    }

    @Override // com.facebook.ads.redexgen.core.PC
    public final int A06(Object obj) {
        return this.A00.A07(obj);
    }

    @Override // com.facebook.ads.redexgen.core.PC
    public final Map<K, V> A07() {
        return this.A00;
    }

    @Override // com.facebook.ads.redexgen.core.PC
    public final Object A0B(int i2, int i3) {
        return this.A00.A02[(i2 << 1) + i3];
    }

    @Override // com.facebook.ads.redexgen.core.PC
    public final V A0C(int i2, V value) {
        return this.A00.A0C(i2, value);
    }

    @Override // com.facebook.ads.redexgen.core.PC
    public final void A0D() {
        this.A00.clear();
    }

    @Override // com.facebook.ads.redexgen.core.PC
    public final void A0E(int i2) {
        this.A00.A0A(i2);
    }

    @Override // com.facebook.ads.redexgen.core.PC
    public final void A0F(K key, V value) {
        this.A00.put(key, value);
    }
}
