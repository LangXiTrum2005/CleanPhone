package com.facebook.ads.redexgen.core;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.h8, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public class C2326h8 extends WP {
    public final /* synthetic */ C2323h5 A00;
    public final /* synthetic */ C1772Vm A01;

    public C2326h8(C2323h5 c2323h5, C1772Vm c1772Vm) {
        this.A00 = c2323h5;
        this.A01 = c1772Vm;
    }

    @Override // com.facebook.ads.redexgen.core.WP
    public final void A01() {
        if (this.A00.A01.A00() != null) {
            this.A00.A01.A00().onAdError(XE.A00(this.A01));
        }
    }
}
