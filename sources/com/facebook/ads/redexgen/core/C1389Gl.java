package com.facebook.ads.redexgen.core;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Gl, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public class C1389Gl implements InterfaceC1834Ya {
    public final /* synthetic */ AbstractC1387Gj A00;

    public C1389Gl(AbstractC1387Gj abstractC1387Gj) {
        this.A00 = abstractC1387Gj;
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC1834Ya
    public final void ACl(AbstractC1835Yb abstractC1835Yb) {
        if (abstractC1835Yb.getToolbarActionMode() == 8) {
            this.A00.A0g();
            return;
        }
        this.A00.A07.A04(VH.A07, null);
        if (this.A00.A0l()) {
            return;
        }
        this.A00.A05.A0F().AB0();
        this.A00.A0A.A4j(this.A00.A0B.A7w());
    }
}
