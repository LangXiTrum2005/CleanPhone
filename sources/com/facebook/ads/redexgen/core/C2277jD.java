package com.facebook.ads.redexgen.core;

import com.facebook.ads.AdError;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.jD, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public class C2277jD implements InterfaceC1529Sp {
    public final /* synthetic */ AbstractC2296jd A00;
    public final /* synthetic */ InterfaceC1408Nt A01;
    public final /* synthetic */ C1409Nu A02;
    public final /* synthetic */ C2131gi A03;
    public final /* synthetic */ boolean A04;

    public C2277jD(C1409Nu c1409Nu, C2131gi c2131gi, boolean z, AbstractC2296jd abstractC2296jd, InterfaceC1408Nt interfaceC1408Nt) {
        this.A02 = c1409Nu;
        this.A03 = c2131gi;
        this.A04 = z;
        this.A00 = abstractC2296jd;
        this.A01 = interfaceC1408Nt;
    }

    private void A00(boolean z) {
        if (z) {
            if (C1581Up.A1q(this.A03) && this.A04) {
                this.A02.A02.add(AbstractC1916dD.A01(this.A03, this.A00, 1, new C2278jE(this)));
                return;
            } else {
                this.A01.ACp();
                return;
            }
        }
        this.A01.ACo(AdError.CACHE_ERROR);
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC1529Sp
    public final void ADL() {
        A00(false);
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC1529Sp
    public final void ADT() {
        A00(true);
    }
}
