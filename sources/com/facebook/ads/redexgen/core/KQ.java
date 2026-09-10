package com.facebook.ads.redexgen.core;

/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public class KQ extends AbstractRunnableC1787Wc {
    public static String[] A02 = {"LRx", "usnMdIZ0FvkqiUZevNTWLktoEg5pLAC7", "DXfpDntuFVUaB3iAC9xpEYaXMcysh68b", "KPagnGwIHNxRQqHn90bhIF", "OiThbZ96vqk0YqBrWrlbCPGqj", "zO4ylzajSSdkzzLOGvXbKRrkPLlgkkF6", "2QDKj7W9IPpyibsxcOZVzQQBEZY6mcrJ", "j8cJ2BFMipeHC45SmF0VkU4zcd"};
    public final /* synthetic */ KE A00;
    public final /* synthetic */ boolean A01;

    public KQ(KE ke, boolean z2) {
        this.A00 = ke;
        this.A01 = z2;
    }

    /* JADX WARN: Code duplicated, block: B:15:0x003e  */
    @Override // com.facebook.ads.redexgen.core.AbstractRunnableC1787Wc
    public final void A07() {
        boolean z2;
        AbstractC1835Yb abstractC1835YbA0B = this.A00.A0J.A0B();
        if (abstractC1835YbA0B != null) {
            if (this.A01) {
                z2 = false;
            } else {
                boolean zA0E = abstractC1835YbA0B.A0E();
                if (A02[4].length() != 25) {
                    throw new RuntimeException();
                }
                A02[4] = "GjOMFYo3T7nhomgErVvGRCVPy";
                if (zA0E) {
                    z2 = false;
                } else {
                    z2 = true;
                }
            }
            abstractC1835YbA0B.setPageDetailsVisible(z2);
            abstractC1835YbA0B.setToolbarActionMode(this.A00.getCloseButtonStyle());
        }
    }
}
