package com.facebook.ads.redexgen.core;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.jD, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class C1778jD implements ViewpointAction<C05859t, C05909y> {
    public C1775jA A00;

    public C1778jD(C1775jA c1775jA) {
        this.A00 = c1775jA;
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.oc != com.instagram.common.viewpoint.core.ViewpointData<com.facebook.ads.internal.impressionsecondchannel.model.Impression, com.facebook.ads.internal.impressionsecondchannel.state.ImpressionState> */
    @Override // com.facebook.ads.redexgen.core.ViewpointAction
    public final void A6H(C2088oc<C05859t, C05909y> c2088oc, InterfaceC2078oP interfaceC2078oP) {
        switch (interfaceC2078oP.A9K(c2088oc)) {
            case A02:
            case A04:
                this.A00.A02(c2088oc, interfaceC2078oP);
                break;
        }
    }
}
