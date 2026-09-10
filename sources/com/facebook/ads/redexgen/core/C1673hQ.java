package com.facebook.ads.redexgen.core;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.hQ, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public class C1673hQ implements DP {
    public static String[] A01 = {"dAENZa04S5kpLZ1505OVGzU", "BCWAX", "x4EBtM5L1", "d5mzvX7vdf5oGTbdkf23a85QS6J33UuP", "T3xMk8xyeuXfnP2cHDF22zgmf4sSWk7a", "D6RnJQb1nSkQk7teZoJG77p", "lMrZ8D5HcAsH09zpnUIM78ubrFXrhoz6", "r7D6OIPJDO7XxyVdFUwVLtQI1zZlrgYr"};
    public final /* synthetic */ C1669hM A00;

    public C1673hQ(C1669hM c1669hM) {
        this.A00 = c1669hM;
    }

    @Override // com.facebook.ads.redexgen.core.DP
    public final void AC5(DQ dq) {
        if (this.A00.A0W() && !this.A00.A0V.get()) {
            this.A00.A0T.A07(this.A00);
            return;
        }
        C1669hM c1669hM = this.A00;
        if (A01[4].charAt(5) == '8') {
            A01[1] = "011C";
            if (!c1669hM.A0X || this.A00.A0V.get() || !this.A00.A0V()) {
                this.A00.A0N.A04(AE.A07, null);
                if (this.A00.A0J.A0P()) {
                    this.A00.A0L.A0F().ADd();
                }
                DR dr = this.A00.A0Q;
                C1669hM c1669hM2 = this.A00;
                if (A01[2].length() == 9) {
                    A01[6] = "SsRiNY9tvP3hEWy4eyTF9NsffnrPtCfL";
                    dr.A4Z(c1669hM2.A0R.A7m());
                    return;
                }
            } else {
                this.A00.A0a.setToolbarActionMode(0);
                this.A00.A0L();
                return;
            }
        }
        throw new RuntimeException();
    }
}
