package com.facebook.ads.redexgen.core;

import com.facebook.ads.AdError;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.mT, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public class C1974mT implements InterfaceC05277l {
    public final /* synthetic */ AbstractC1984md A00;
    public final /* synthetic */ InterfaceC04092u A01;
    public final /* synthetic */ C04102v A02;
    public final /* synthetic */ C1828k1 A03;
    public final /* synthetic */ boolean A04;

    public C1974mT(C04102v c04102v, C1828k1 c1828k1, boolean z, AbstractC1984md abstractC1984md, InterfaceC04092u interfaceC04092u) {
        this.A02 = c04102v;
        this.A03 = c1828k1;
        this.A04 = z;
        this.A00 = abstractC1984md;
        this.A01 = interfaceC04092u;
    }

    private void A00(boolean z) {
        if (z) {
            if (C05789m.A1j(this.A03) && this.A04) {
                this.A02.A02.add(AbstractC0748Gs.A01(this.A03, this.A00, 1, new C1975mU(this)));
                return;
            } else {
                this.A01.AC9();
                return;
            }
        }
        this.A01.AC8(AdError.CACHE_ERROR);
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC05277l
    public final void ACa() {
        A00(false);
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC05277l
    public final void ACj() {
        A00(true);
    }
}
