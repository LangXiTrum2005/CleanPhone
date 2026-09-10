package com.facebook.ads.redexgen.core;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.p8, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public final class C2789p8 implements C5Y {
    public final InterfaceC11315t A00;

    public C2789p8() {
        this(null);
    }

    public C2789p8(InterfaceC11315t interfaceC11315t) {
        this.A00 = interfaceC11315t;
    }

    @Override // com.facebook.ads.redexgen.core.C5Y
    public final InterfaceC2796pF A5I() {
        C10211j c10211j = new C10211j();
        if (this.A00 != null) {
            c10211j.A43(this.A00);
        }
        return c10211j;
    }
}
