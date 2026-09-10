package com.facebook.ads.redexgen.core;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.f0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public final class C2194f0 implements InterfaceC1711Tc {
    public final T8 A00;

    public C2194f0(T8 t8) {
        this.A00 = t8;
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC1711Tc
    public final void A4I(Throwable th) {
        TX.A0E(th);
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC1711Tc
    public final void AA3(String str) {
        VL.A08(this.A00, str);
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC1711Tc
    public final void AA4(String str) {
        VL.A09(this.A00, str);
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC1711Tc
    public final void ABC(String str, int i2, C1713Te c1713Te) {
        TX.A06(this.A00, str, i2, c1713Te);
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC1711Tc
    public final void ABD(String str, int i2, C1713Te c1713Te) {
        TX.A06(this.A00, str, i2, c1713Te);
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC1711Tc
    public final void ABo(long j, long j2, long j3, long j4, int i2, Exception exc) {
        AbstractC1717Ti.A03(this.A00, j, j2, j3, j4, i2, exc);
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC1711Tc
    public final void ABz(String str, int i2, C1713Te c1713Te) {
        TX.A07(this.A00, str, i2, c1713Te);
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC1711Tc
    public final void ACA(String str, int i2, C1713Te c1713Te) {
        TX.A08(this.A00, str, i2, c1713Te);
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC1711Tc
    public final void ACP() {
        this.A00.A04().ACP();
    }
}
