package com.facebook.ads.redexgen.core;

import java.util.Arrays;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Wv, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public class RunnableC1805Wv implements Runnable {
    public static byte[] A01;
    public final /* synthetic */ C2300gi A00;

    static {
        A01();
    }

    public static String A00(int i2, int i3, int i4) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A01, i2, i2 + i3);
        for (int i5 = 0; i5 < bArrCopyOfRange.length; i5++) {
            bArrCopyOfRange[i5] = (byte) ((bArrCopyOfRange[i5] - i4) - 108);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A01() {
        A01 = new byte[]{-55, -50, -51, -58, -1, -3, 6, -3, 10, 1, -5};
    }

    public RunnableC1805Wv(C2300gi c2300gi) {
        this.A00 = c2300gi;
    }

    @Override // java.lang.Runnable
    public final void run() throws Throwable {
        if (WU.A02(this)) {
            return;
        }
        try {
            C1713Te otsl = new C1713Te(A00(0, 4, 14));
            otsl.A05(1);
            otsl.A06(1);
            otsl.A0A(false);
            this.A00.A08().ABD(A00(4, 7, 44), AbstractC1712Td.A1Y, otsl);
        } catch (Throwable th) {
            WU.A00(th, this);
        }
    }
}
