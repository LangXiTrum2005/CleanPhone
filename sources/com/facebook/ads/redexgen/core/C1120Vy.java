package com.facebook.ads.redexgen.core;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Vy, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public class C1120Vy implements Uj {
    public final long A00;
    public final C1082Ui A01;

    public C1120Vy(long j) {
        this(j, 0L);
    }

    public C1120Vy(long j, long j2) {
        this.A00 = j;
        this.A01 = new C1082Ui(j2 == 0 ? C1083Uk.A03 : new C1083Uk(0L, j2));
    }

    @Override // com.facebook.ads.redexgen.core.Uj
    public final long A7j() {
        return this.A00;
    }

    @Override // com.facebook.ads.redexgen.core.Uj
    public final C1082Ui A8r(long j) {
        return this.A01;
    }

    @Override // com.facebook.ads.redexgen.core.Uj
    public final boolean AAY() {
        return false;
    }
}
