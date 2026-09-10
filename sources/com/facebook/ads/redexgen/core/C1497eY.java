package com.facebook.ads.redexgen.core;

import com.umeng.analytics.pro.cw;
import java.util.Arrays;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.eY, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public class C1497eY extends BY {
    public static byte[] A01;
    public final /* synthetic */ C0851Kr A00;

    static {
        A04();
    }

    public static String A01(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A01, i, i + i2);
        for (int i4 = 0; i4 < bArrCopyOfRange.length; i4++) {
            bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] - i3) - 122);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A04() {
        A01 = new byte[]{-20, -1, -6, -5, 5, -74, cw.k, -9, 9, -74, 4, -5, 12, -5, 8, -74, 6, 8, -5, 6, -9, 8, -5, -6};
    }

    public C1497eY(C0851Kr c0851Kr) {
        this.A00 = c0851Kr;
    }

    @Override // com.facebook.ads.redexgen.core.BY
    public final void A05() {
        if (!this.A00.A0T) {
            this.A00.A0Y.AFY(A01(0, 24, 28));
        }
    }
}
