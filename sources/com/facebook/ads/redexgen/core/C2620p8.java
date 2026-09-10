package com.facebook.ads.redexgen.core;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.p8, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public final class C2620p8 implements C5Y {
    public final InterfaceC09625t A00;

    public C2620p8() {
        this(null);
    }

    public C2620p8(InterfaceC09625t interfaceC09625t) {
        this.A00 = interfaceC09625t;
    }

    @Override // com.facebook.ads.redexgen.core.C5Y
    public final InterfaceC2627pF A5I() {
        C08521j c08521j = new C08521j();
        if (this.A00 != null) {
            c08521j.A43(this.A00);
        }
        return c08521j;
    }
}
