package com.facebook.ads.redexgen.core;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.3x, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public class C10833x extends E2 {
    public final /* synthetic */ C1313Dm A00;

    public C10833x(C1313Dm c1313Dm) {
        this.A00 = c1313Dm;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.facebook.ads.redexgen.core.UN
    /* JADX INFO: renamed from: A00, reason: merged with bridge method [inline-methods] */
    public final void A03(E3 e3) {
        if ((this.A00.A03 && this.A00.A02) || !this.A00.A05 || !this.A00.A04) {
            return;
        }
        this.A00.A05 = false;
        if (!this.A00.A0G(EnumC2213fJ.A03) && !this.A00.A06) {
            if (!this.A00.A0G(EnumC2213fJ.A02)) {
                return;
            }
            this.A00.A03();
            this.A00.A06(true, true);
            return;
        }
        this.A00.A06 = false;
        this.A00.A07.postDelayed(new C1315Do(this), this.A00.A00);
    }
}
