package com.facebook.ads.redexgen.core;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.3c, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public class C08953c extends AbstractC1151Dt {
    public final /* synthetic */ C1139Dh A00;

    public C08953c(C1139Dh c1139Dh) {
        this.A00 = c1139Dh;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.facebook.ads.redexgen.core.UN
    /* JADX INFO: renamed from: A00, reason: merged with bridge method [inline-methods] */
    public final void A03(C1152Du c1152Du) {
        if (this.A00.A01 == null || c1152Du.A00().getAction() != 0) {
            return;
        }
        this.A00.A04.removeCallbacksAndMessages(null);
        this.A00.A07(new C2032f7(this));
    }
}
