package com.facebook.ads.redexgen.core;

import com.facebook.ads.AdError;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.jF, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public class C2448jF implements SM {
    public final /* synthetic */ AbstractC2465jd A00;
    public final /* synthetic */ InterfaceC1577Nt A01;
    public final /* synthetic */ C1578Nu A02;
    public final /* synthetic */ C2300gi A03;
    public final /* synthetic */ boolean A04;

    public C2448jF(C1578Nu c1578Nu, C2300gi c2300gi, boolean z2, AbstractC2465jd abstractC2465jd, InterfaceC1577Nt interfaceC1577Nt) {
        this.A02 = c1578Nu;
        this.A03 = c2300gi;
        this.A04 = z2;
        this.A00 = abstractC2465jd;
        this.A01 = interfaceC1577Nt;
    }

    @Override // com.facebook.ads.redexgen.core.SM
    public final void ACx() {
        if (C1750Up.A1q(this.A03) && this.A04) {
            this.A02.A02.add(AbstractC2085dD.A01(this.A03, this.A00, 1, new C2449jG(this)));
        } else {
            this.A01.ACp();
        }
    }

    @Override // com.facebook.ads.redexgen.core.SM
    public final void ACy() {
        this.A01.ACo(AdError.CACHE_ERROR);
    }
}
