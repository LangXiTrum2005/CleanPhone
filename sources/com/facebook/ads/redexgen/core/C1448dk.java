package com.facebook.ads.redexgen.core;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.dk, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public class C1448dk implements DP {
    public static String[] A01 = {"ziFc1AxLwl06l9cm2ro8EEkTqcfxuLTc", "Ot3h47XlIqwqlb0VDKX34tYNREgAb88h", "XErmhi3UBKLFfekLEXmFG5T5AXnu", "x4ahbzSdp8w2tJq97wkZytqruvrbxvGd", "5eNtQA6JlDjBFR49aczWqHsgt2phfPFu", "5gzf4", "tgwS2khKEZgsCudiehRL6tpdm2kFQW", "Wy"};
    public final /* synthetic */ C0843Kj A00;

    public C1448dk(C0843Kj c0843Kj) {
        this.A00 = c0843Kj;
    }

    @Override // com.facebook.ads.redexgen.core.DP
    public final void AC5(DQ dq) {
        if (dq.getToolbarActionMode() == 8) {
            this.A00.A0b();
            return;
        }
        ((AbstractC1476eD) this.A00).A06.A04(AE.A07, null);
        if (this.A00.A0f()) {
            return;
        }
        DR dr = ((AbstractC1476eD) this.A00).A09;
        EC ec = ((AbstractC1476eD) this.A00).A0A;
        if (A01[7].length() != 2) {
            throw new RuntimeException();
        }
        String[] strArr = A01;
        strArr[4] = "aiGFPxx8CXfEdquuZVm2W5wuPm6cCNUb";
        strArr[3] = "iaZJUoQxe1noplKpEgf5PzuXPp1HxeHv";
        dr.A4Z(ec.A7m());
    }
}
