package com.facebook.ads.redexgen.core;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.mC, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public abstract class AbstractC1958mC implements C2I {
    public C1744ie A00;

    public final void A00(C1744ie c1744ie) {
        this.A00 = c1744ie;
    }

    @Override // com.facebook.ads.redexgen.core.C2I
    public final void AEA(C2002mv c2002mv) {
        if (this.A00 != null && this.A00.A16() != null) {
            this.A00.A16().AC6();
        }
    }

    @Override // com.facebook.ads.redexgen.core.C2I
    public final void AEC(C2002mv c2002mv) {
    }

    @Override // com.facebook.ads.redexgen.core.C2I
    public final void AEE(C2002mv c2002mv, C0597Ag c0597Ag) {
    }
}
