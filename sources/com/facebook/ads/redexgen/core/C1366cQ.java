package com.facebook.ads.redexgen.core;

import java.util.Map;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.cQ, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class C1366cQ implements IG {
    public final C1828k1 A00;
    public final A7 A01;
    public final ID A02;
    public final C1361cL A03;
    public final String A06;
    public final AbstractC1337bx A05 = new C0839Kf(this);
    public final AbstractC1343c3 A04 = new C0838Ke(this);

    public C1366cQ(C1828k1 c1828k1, A7 a7, C1361cL c1361cL, String str, C1348c8 c1348c8, Map<String, String> extraParams) {
        this.A00 = c1828k1;
        this.A01 = a7;
        this.A06 = str;
        this.A03 = c1361cL;
        this.A02 = new ID(c1361cL, str, extraParams);
        if (C05789m.A23(this.A00)) {
            this.A00.A0F().AI3();
            c1348c8.A0m(this);
        } else {
            this.A00.A0F().AI4();
            this.A03.getEventBus().A03(this.A05, this.A04);
        }
    }

    public final void A05() {
        C1367cR c1367cR = new C1367cR(this);
        if (this.A03.A0s()) {
            ExecutorC0649Cx.A00(c1367cR);
        } else {
            this.A03.getStateHandler().post(c1367cR);
        }
    }

    public final synchronized void A06() {
        this.A01.ABL(this.A06, this.A02.A05());
    }

    @Override // com.facebook.ads.redexgen.core.IG
    public final void ADy() {
        this.A00.A0F().AI7();
        A06();
    }
}
