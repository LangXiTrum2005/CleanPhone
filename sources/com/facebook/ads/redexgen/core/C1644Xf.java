package com.facebook.ads.redexgen.core;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Xf, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public final class C1644Xf implements ViewpointAction<C1588Uw, V1> {
    public XM A00;

    public C1644Xf(XM xm) {
        this.A00 = xm;
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.rN != com.instagram.common.viewpoint.core.ViewpointData<com.facebook.ads.internal.impressionsecondchannel.model.Impression, com.facebook.ads.internal.impressionsecondchannel.state.ImpressionState> */
    @Override // com.facebook.ads.redexgen.core.ViewpointAction
    public final void A6R(C2740rN<C1588Uw, V1> c2740rN, InterfaceC2731rD interfaceC2731rD) {
        switch (interfaceC2731rD.A9U(c2740rN)) {
            case A02:
            case A04:
                this.A00.A02(c2740rN, interfaceC2731rD);
                break;
        }
    }
}
