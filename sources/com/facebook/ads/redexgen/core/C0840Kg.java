package com.facebook.ads.redexgen.core;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Kg, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public class C0840Kg extends AbstractC1340c0 {
    public final /* synthetic */ ID A00;

    public C0840Kg(ID id) {
        this.A00 = id;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.facebook.ads.redexgen.core.C9K
    /* JADX INFO: renamed from: A00, reason: merged with bridge method [inline-methods] */
    public final void A03(KZ kz) {
        C0877Ls c0877Ls = new C0877Ls(this.A00.A05, kz.A03(), kz.A01(), kz.A02());
        if (kz.A00() >= 0.05d) {
            c0877Ls.A06(kz.A01());
        }
        ID.A00(this.A00);
        this.A00.A04.A04(c0877Ls);
    }
}
