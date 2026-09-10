package com.facebook.ads.redexgen.core;

import com.facebook.ads.internal.protocol.AdErrorType;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.iz, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public class C2265iz extends AbstractRunnableC1618Wc {
    public final /* synthetic */ C2318jz A00;
    public final /* synthetic */ O8 A01;
    public final /* synthetic */ C10047j A02;

    public C2265iz(C10047j c10047j, O8 o8, C2318jz c2318jz) {
        this.A02 = c10047j;
        this.A01 = o8;
        this.A00 = c2318jz;
    }

    @Override // com.facebook.ads.redexgen.core.AbstractRunnableC1618Wc
    public final void A07() {
        this.A02.A0T(this.A01);
        this.A02.A0Q(this.A00);
        this.A02.A00 = null;
        C1603Vm c1603VmA00 = C1603Vm.A00(AdErrorType.INTERSTITIAL_AD_TIMEOUT);
        this.A02.A0B.A0F().A5g(c1603VmA00.A03().getErrorCode(), c1603VmA00.A04());
        this.A02.A07.A0G(c1603VmA00);
    }
}
