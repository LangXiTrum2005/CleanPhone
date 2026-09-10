package com.facebook.ads.redexgen.core;

import java.util.List;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.8q, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public abstract class AbstractC05578q extends AbstractC1141Wu implements InterfaceC1142Wv {
    public long A00;
    public InterfaceC1142Wv A01;

    @Override // com.facebook.ads.redexgen.core.AbstractC1141Wu
    public abstract void A0B();

    @Override // com.facebook.ads.redexgen.core.AbstractC1031Sf
    public final void A0A() {
        super.A0A();
        this.A01 = null;
    }

    public final void A0C(long j, InterfaceC1142Wv interfaceC1142Wv, long j2) {
        super.A01 = j;
        this.A01 = interfaceC1142Wv;
        if (j2 == Long.MAX_VALUE) {
            j2 = super.A01;
        }
        this.A00 = j2;
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC1142Wv
    public final List<C0982Qh> A7N(long j) {
        return ((InterfaceC1142Wv) AbstractC1517es.A01(this.A01)).A7N(j - this.A00);
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC1142Wv
    public final long A7t(int i) {
        return ((InterfaceC1142Wv) AbstractC1517es.A01(this.A01)).A7t(i) + this.A00;
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC1142Wv
    public final int A7u() {
        return ((InterfaceC1142Wv) AbstractC1517es.A01(this.A01)).A7u();
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC1142Wv
    public final int A8Q(long j) {
        return ((InterfaceC1142Wv) AbstractC1517es.A01(this.A01)).A8Q(j - this.A00);
    }
}
