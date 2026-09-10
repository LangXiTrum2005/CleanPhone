package com.facebook.ads.redexgen.core;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.j4, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public abstract class AbstractC2439j4 implements InterfaceC1698Sp {
    public final boolean A00;

    public abstract void A00();

    public abstract void A01(boolean z2);

    public AbstractC2439j4(boolean z2) {
        this.A00 = z2;
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC1698Sp
    public final void ADL() {
        if (this.A00) {
            A00();
        } else {
            A01(false);
        }
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC1698Sp
    public final void ADT() {
        A01(true);
    }
}
