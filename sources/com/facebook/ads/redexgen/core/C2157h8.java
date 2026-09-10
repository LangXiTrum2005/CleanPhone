package com.facebook.ads.redexgen.core;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.h8, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public class C2157h8 extends WP {
    public final /* synthetic */ C2154h5 A00;
    public final /* synthetic */ C1603Vm A01;

    public C2157h8(C2154h5 c2154h5, C1603Vm c1603Vm) {
        this.A00 = c2154h5;
        this.A01 = c1603Vm;
    }

    @Override // com.facebook.ads.redexgen.core.WP
    public final void A01() {
        if (this.A00.A01.A00() != null) {
            this.A00.A01.A00().onAdError(XE.A00(this.A01));
        }
    }
}
