package com.facebook.ads.redexgen.core;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.g0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public class C1586g0 extends BY {
    public static String[] A02 = {"LRx", "usnMdIZ0FvkqiUZevNTWLktoEg5pLAC7", "DXfpDntuFVUaB3iAC9xpEYaXMcysh68b", "KPagnGwIHNxRQqHn90bhIF", "OiThbZ96vqk0YqBrWrlbCPGqj", "zO4ylzajSSdkzzLOGvXbKRrkPLlgkkF6", "2QDKj7W9IPpyibsxcOZVzQQBEZY6mcrJ", "j8cJ2BFMipeHC45SmF0VkU4zcd"};
    public final /* synthetic */ C1580fu A00;
    public final /* synthetic */ boolean A01;

    public C1586g0(C1580fu c1580fu, boolean z) {
        this.A00 = c1580fu;
        this.A01 = z;
    }

    /* JADX WARN: Code duplicated, block: B:15:0x003e  */
    @Override // com.facebook.ads.redexgen.core.BY
    public final void A05() {
        boolean z;
        DQ dqA0B = this.A00.A0M.A0B();
        if (dqA0B != null) {
            if (this.A01) {
                z = false;
            } else {
                boolean zA0B = dqA0B.A0B();
                if (A02[4].length() != 25) {
                    throw new RuntimeException();
                }
                A02[4] = "GjOMFYo3T7nhomgErVvGRCVPy";
                if (zA0B) {
                    z = false;
                } else {
                    z = true;
                }
            }
            dqA0B.setPageDetailsVisible(z);
            dqA0B.setToolbarActionMode(this.A00.getCloseButtonStyle());
        }
    }
}
