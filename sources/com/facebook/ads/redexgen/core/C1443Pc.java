package com.facebook.ads.redexgen.core;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Pc, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public class C1443Pc implements InterfaceC1499Rk {
    public final /* synthetic */ PZ A00;

    public C1443Pc(PZ pz) {
        this.A00 = pz;
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC1499Rk
    public final boolean AAI() {
        if (this.A00.A0E.canGoBack()) {
            this.A00.A0E.goBack();
            return true;
        }
        return false;
    }
}
