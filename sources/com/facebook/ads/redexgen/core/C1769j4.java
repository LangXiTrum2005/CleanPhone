package com.facebook.ads.redexgen.core;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.j4, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public class C1769j4 extends C9L<String> {
    public final /* synthetic */ A4 A00;
    public final /* synthetic */ C1768j3 A01;

    public C1769j4(C1768j3 c1768j3, A4 a4) {
        this.A01 = c1768j3;
        this.A00 = a4;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.facebook.ads.redexgen.core.C9L
    /* JADX INFO: renamed from: A00, reason: merged with bridge method [inline-methods] */
    public final void A02(String str) {
        super.A02(str);
        if (this.A00.A0B()) {
            this.A01.A02.A5s();
        } else {
            this.A01.A02.A5r();
        }
    }

    @Override // com.facebook.ads.redexgen.core.C9L
    public final void A01(int i, String str) {
        super.A01(i, str);
    }
}
