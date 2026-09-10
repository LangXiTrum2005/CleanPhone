package com.facebook.ads.redexgen.core;

import java.util.Arrays;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.ev, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public class C1520ev extends BY {
    public static byte[] A02;
    public static String[] A03 = {"mPUp", "QaVG6HdjpkfaxAZj0g", "f", "awRGdU6dgRZhiPVlhe", "rFOzx0t9VnUrXKVKNhKeQ4JnbF82l9OW", "Jupus4hVDLzI", "SNB8L6kKTybUpjfk2kEtWCUyw", "zmy1APRNrfa5"};
    public final /* synthetic */ L1 A00;
    public final /* synthetic */ KX A01;

    public static String A01(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A02, i, i + i2);
        for (int i4 = 0; i4 < bArrCopyOfRange.length; i4++) {
            bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] - i3) - 26);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A04() {
        A02 = new byte[]{-43, 8, -7, -7, -8, 5, -4, 1, -6, -77, -4, 1, -9, -8, -7, -4, 1, -4, 7, -8, -1, 12};
    }

    static {
        A04();
    }

    public C1520ev(L1 l1, KX kx) {
        this.A00 = l1;
        this.A01 = kx;
    }

    @Override // com.facebook.ads.redexgen.core.BY
    public final void A05() {
        if (this.A00.A0I.getState() == JI.A02) {
            L1 l1 = this.A00;
            String[] strArr = A03;
            if (strArr[2].length() == strArr[1].length()) {
                throw new RuntimeException();
            }
            A03[3] = "r7zn";
            if (l1.A0I.getCurrentPositionInMillis() == this.A01.A00()) {
                this.A00.A0F.AFY(A01(0, 22, 121));
            }
        }
    }
}
