package com.facebook.ads.redexgen.core;

import com.facebook.ads.internal.protocol.AdErrorType;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.iz, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public class C2434iz extends AbstractRunnableC1787Wc {
    public final /* synthetic */ C2487jz A00;
    public final /* synthetic */ O8 A01;
    public final /* synthetic */ C11737j A02;

    public C2434iz(C11737j c11737j, O8 o8, C2487jz c2487jz) {
        this.A02 = c11737j;
        this.A01 = o8;
        this.A00 = c2487jz;
    }

    @Override // com.facebook.ads.redexgen.core.AbstractRunnableC1787Wc
    public final void A07() {
        this.A02.A0T(this.A01);
        this.A02.A0Q(this.A00);
        this.A02.A00 = null;
        C1772Vm c1772VmA00 = C1772Vm.A00(AdErrorType.INTERSTITIAL_AD_TIMEOUT);
        this.A02.A0B.A0F().A5g(c1772VmA00.A03().getErrorCode(), c1772VmA00.A04());
        this.A02.A07.A0G(c1772VmA00);
    }
}
