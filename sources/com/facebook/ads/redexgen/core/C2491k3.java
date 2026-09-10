package com.facebook.ads.redexgen.core;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.k3, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public class C2491k3 extends AbstractRunnableC1787Wc {
    public final /* synthetic */ C2490k2 A00;
    public final /* synthetic */ AnonymousClass62 A01;

    public C2491k3(C2490k2 c2490k2, AnonymousClass62 anonymousClass62) {
        this.A00 = c2490k2;
        this.A01 = anonymousClass62;
    }

    @Override // com.facebook.ads.redexgen.core.AbstractRunnableC1787Wc
    public final void A07() {
        this.A00.A00.A0A();
        if (this.A00.A00.A0B != null) {
            this.A01.setAdViewabilityChecker(this.A00.A00.A0B);
            this.A00.A00.A0B.A0U();
        }
    }
}
