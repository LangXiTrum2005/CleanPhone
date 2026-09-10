package com.facebook.ads.redexgen.core;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Nz, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public class C1414Nz implements InterfaceC1822bh {
    public final /* synthetic */ NO A00;

    public C1414Nz(NO no) {
        this.A00 = no;
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC1822bh
    public final void ACt() {
        if (this.A00.A0X()) {
            this.A00.A0N();
            this.A00.A0g.setToolbarActionMessage("");
            this.A00.A0g.setToolbarActionMode(0);
        }
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC1822bh
    public final void AEm() {
        this.A00.A0K = false;
        this.A00.A0U.A07();
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC1822bh
    public final void AEn() {
        this.A00.A0K = true;
        this.A00.A0U.A06();
    }
}
