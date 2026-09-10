package com.facebook.ads.redexgen.core;

import java.util.Arrays;
import java.util.Locale;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Xj, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public final class C1817Xj {
    public static byte[] A02;
    public long A00;
    public long A01;

    static {
        A01();
    }

    public static String A00(int i2, int i3, int i4) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A02, i2, i2 + i3);
        for (int i5 = 0; i5 < bArrCopyOfRange.length; i5++) {
            bArrCopyOfRange[i5] = (byte) ((bArrCopyOfRange[i5] - i4) - 16);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A01() {
        A02 = new byte[]{-52, -15, -7, -28, -17, -20, -25, -93, -15, -8, -16, -27, -24, -11, -93, -14, -23, -93, -15, -28, -15, -14, -10, -24, -26, -14, -15, -25, -10, -93, -23, -14, -11, -93, -9, -21, -24, -93, -9, -20, -16, -24, -11, -67, -93, -88, -25};
    }

    public C1817Xj(long j) {
        if (j < 0) {
            throw new IllegalArgumentException(String.format(Locale.US, A00(0, 47, 115), Long.valueOf(j)));
        }
        this.A01 = j;
        this.A00 = System.nanoTime() + j;
    }

    public final synchronized void A02() {
        this.A00 = System.nanoTime();
        notifyAll();
    }

    public final synchronized void A03() {
        this.A00 = System.nanoTime() + this.A01;
    }

    public final synchronized void A04() throws InterruptedException {
        while (!A05()) {
            long jMax = Math.max(this.A00 - System.nanoTime(), 1L);
            wait(jMax / 1000000, (int) (jMax % 1000000));
        }
    }

    public final synchronized boolean A05() {
        return System.nanoTime() >= this.A00;
    }
}
