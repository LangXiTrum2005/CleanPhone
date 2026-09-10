package com.facebook.ads.redexgen.core;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Mm, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public class C1545Mm implements InterfaceC1668Rk {
    public static String[] A01 = {"OzZgVge9f1M6v6ECGvfzE2lelYGRNpcR", "wWE4h2nZ4zwlNyDcFF4AKhs", "2tlTz3YI6lX4F9BnCi72Ebdo8SjZZSMc", "OEQW3vRvYAQWgt7PHCfPR8E", "3OILw1bCaEkMk35ZNNqR0SRTWeQg1PRg", "i6GFbsYgPXu23Z4kIsNVdeySMROLxMHq", "jYSQemNdDQ7ZZ3K3t", "DXND3IEKe4RSyw4IFeihHP08ajxTSSoO"};
    public final /* synthetic */ MW A00;

    public C1545Mm(MW mw) {
        this.A00 = mw;
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC1668Rk
    public final boolean AAI() {
        if (this.A00.A0E) {
            if (this.A00.A0U.getToolbarActionMode() == 1) {
                AbstractC1835Yb abstractC1835Yb = this.A00.A0U;
                if (A01[6].length() != 17) {
                    throw new RuntimeException();
                }
                A01[6] = "6SLOwM6DBUuyj18aF";
                abstractC1835Yb.setToolbarActionMode(2);
                this.A00.A0N();
            } else if (this.A00.A0U.getToolbarActionMode() == 0) {
                this.A00.A0L.A04(VH.A07, null);
                this.A00.A0O.A4j(this.A00.A0P.A7w());
            } else if (this.A00.A09 != null && this.A00.A09.A0h()) {
                this.A00.A0L.A04(VH.A07, null);
                this.A00.A0O.A4j(this.A00.A0P.A7w());
            }
            return true;
        }
        return false;
    }
}
