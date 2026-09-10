package com.facebook.ads.redexgen.core;

/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public class EH extends AbstractC1587Od {
    public final /* synthetic */ EF A00;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public EH(EF ef, double d, double d2, double d3, boolean z2) {
        super(d, d2, d3, z2);
        this.A00 = ef;
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC1587Od
    public final void A00(boolean z2, boolean z3, C1589Of c1589Of) {
        if ((!C1750Up.A0z(this.A00.A0D) || !this.A00.A09) && z3) {
            this.A00.A09 = true;
            this.A00.A0R(this.A00.A0J, this.A00.A0J(EnumC2178ek.A03));
        }
    }
}
