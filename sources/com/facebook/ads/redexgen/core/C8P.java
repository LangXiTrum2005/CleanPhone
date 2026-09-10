package com.facebook.ads.redexgen.core;

import java.util.List;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.8P, reason: invalid class name */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public abstract class C8P extends AbstractC2780oz implements InterfaceC1464Jj {
    public long A00;
    public InterfaceC1464Jj A01;

    @Override // com.facebook.ads.redexgen.core.AbstractC2780oz
    public abstract void A0B();

    @Override // com.facebook.ads.redexgen.core.AbstractC11325u
    public final void A0A() {
        super.A0A();
        this.A01 = null;
    }

    public final void A0C(long j, InterfaceC1464Jj interfaceC1464Jj, long j2) {
        super.A01 = j;
        this.A01 = interfaceC1464Jj;
        if (j2 == Long.MAX_VALUE) {
            j2 = super.A01;
        }
        this.A00 = j2;
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC1464Jj
    public final List<C2810pT> A7X(long j) {
        return ((InterfaceC1464Jj) AbstractC10843y.A01(this.A01)).A7X(j - this.A00);
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC1464Jj
    public final long A83(int i2) {
        return ((InterfaceC1464Jj) AbstractC10843y.A01(this.A01)).A83(i2) + this.A00;
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC1464Jj
    public final int A84() {
        return ((InterfaceC1464Jj) AbstractC10843y.A01(this.A01)).A84();
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC1464Jj
    public final int A8a(long j) {
        return ((InterfaceC1464Jj) AbstractC10843y.A01(this.A01)).A8a(j - this.A00);
    }
}
