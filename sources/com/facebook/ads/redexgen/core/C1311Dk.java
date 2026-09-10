package com.facebook.ads.redexgen.core;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Dk, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public class C1311Dk extends UN<C4A> {
    public final /* synthetic */ C1310Dj A00;

    public C1311Dk(C1310Dj c1310Dj) {
        this.A00 = c1310Dj;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.facebook.ads.redexgen.core.UN
    /* JADX INFO: renamed from: A00, reason: merged with bridge method [inline-methods] */
    public final void A03(C4A c4a) {
        if (this.A00.A00 == null) {
            return;
        }
        this.A00.setText(this.A00.A02(this.A00.A00.getDuration() - this.A00.A00.getCurrentPositionInMillis()));
    }

    @Override // com.facebook.ads.redexgen.core.UN
    public final Class<C4A> A01() {
        return C4A.class;
    }
}
