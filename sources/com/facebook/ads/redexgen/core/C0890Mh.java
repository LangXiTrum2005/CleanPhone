package com.facebook.ads.redexgen.core;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Mh, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class C0890Mh extends AbstractC1709i2<C1957mB> {
    public C0890Mh(C1957mB c1957mB) {
        super(c1957mB);
    }

    @Override // com.facebook.ads.redexgen.core.BY
    public final void A05() {
        C1957mB c1957mBA06 = A06();
        if (c1957mBA06 == null) {
            return;
        }
        if (DK.A02(c1957mBA06.A08)) {
            c1957mBA06.A07();
        } else {
            c1957mBA06.A05.postDelayed(c1957mBA06.A0C, 5000L);
        }
    }
}
