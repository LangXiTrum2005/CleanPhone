package com.facebook.ads.redexgen.core;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Pa, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public class C1610Pa implements InterfaceC1938aq {
    public final /* synthetic */ PZ A00;

    public C1610Pa(PZ pz) {
        this.A00 = pz;
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC1938aq
    public final void AF7(String str) {
        this.A00.A0C.setProgress(100);
        this.A00.A05 = false;
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC1938aq
    public final void AF9(String str) {
        this.A00.A05 = true;
        this.A00.A0F.setUrl(str);
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC1938aq
    public final void AFY(int i2) {
        if (this.A00.A05) {
            this.A00.A0C.setProgress(i2);
        }
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC1938aq
    public final void AFb(String str) {
        this.A00.A0F.setTitle(str);
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC1938aq
    public final void AFe() {
        this.A00.A0B.ADJ(14);
    }
}
