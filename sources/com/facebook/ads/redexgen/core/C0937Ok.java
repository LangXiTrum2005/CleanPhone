package com.facebook.ads.redexgen.core;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Ok, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class C0937Ok {
    public static String[] A04 = {"TSoVlfhZvCPq", "QkoZyoHGLhi2L0mFTxGwI", "KqpurhhhLpikqxCPxbq9p", "eVtD", "yOe5K6k3kik2nD08LRVGDDKholWo4ynt", "KXJ0s1sDUecNBuwE0zK1sIgDD7qkokgF", "kibSovuxCIAR", "kYtq"};
    public int A00;
    public int A01;
    public Q9 A02;
    public boolean A03;

    public C0937Ok() {
    }

    public final void A03(int i) {
        this.A01 += i;
    }

    public final void A04(int i) {
        if (this.A03) {
            int i2 = this.A00;
            if (A04[4].charAt(31) == 'F') {
                throw new RuntimeException();
            }
            String[] strArr = A04;
            strArr[0] = "k0q31ZAKw6JC";
            strArr[6] = "miePuhQXo7fy";
            if (i2 != 4) {
                AbstractC1517es.A07(i == 4);
                return;
            }
        }
        this.A03 = true;
        this.A00 = i;
    }

    public final void A05(Q9 q9) {
        this.A02 = q9;
        this.A01 = 0;
        this.A03 = false;
    }

    public final boolean A06(Q9 q9) {
        return q9 != this.A02 || this.A01 > 0 || this.A03;
    }
}
