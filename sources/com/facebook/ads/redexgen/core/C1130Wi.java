package com.facebook.ads.redexgen.core;

import java.io.IOException;
import java.util.Arrays;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Wi, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class C1130Wi {
    public static byte[] A0B;
    public static String[] A0C = {"VuRa0hoG4TndZuLpWOztYVF", "tJtHOf0G5Eo1LqK", "MmD5sDI9HZPvDS2dmrMrvBz", "CxnyFwRSJ2own3tKkETgrns1qWjEMF6u", "T8ltN1RKsPXuJ0RYd32TVwm9eSvclJ11", "k2g", "qm04N", "WQ7j3YZDGFUlXz6OW6Sp2iBzL8ik0ATg"};
    public int A00;
    public int A01;
    public int A02;
    public int A03;
    public int A04;
    public long A05;
    public long A06;
    public long A07;
    public long A08;
    public final int[] A09 = new int[255];
    public final C1576fq A0A = new C1576fq(255);

    public static String A00(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A0B, i, i + i2);
        for (int i4 = 0; i4 < bArrCopyOfRange.length; i4++) {
            bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] - i3) - 29);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A01() {
        A0B = new byte[]{-33, -40, -35, -33, -38, -38, -39, -36, -34, -49, -50, -118, -52, -45, -34, -118, -35, -34, -36, -49, -53, -41, -118, -36, -49, -32, -45, -35, -45, -39, -40};
    }

    static {
        A01();
    }

    public final void A02() {
        this.A03 = 0;
        this.A04 = 0;
        this.A05 = 0L;
        this.A08 = 0L;
        this.A07 = 0L;
        this.A06 = 0L;
        this.A02 = 0;
        this.A01 = 0;
        this.A00 = 0;
    }

    public final boolean A03(WJ wj) throws IOException {
        return A04(wj, -1L);
    }

    public final boolean A04(WJ wj, long j) throws IOException {
        AbstractC1517es.A07(wj.A8d() == wj.A8Y());
        this.A0A.A0d(4);
        while (true) {
            if ((j != -1 && wj.A8d() + 4 >= j) || !UM.A04(wj, this.A0A.A0l(), 0, 4, true)) {
                break;
            }
            this.A0A.A0f(0);
            if (this.A0A.A0Q() == 1332176723) {
                wj.AHr();
                return true;
            }
            wj.AJ9(1);
        }
        do {
            if (j != -1 && wj.A8d() >= j) {
                break;
            }
        } while (wj.AJ6(1) != -1);
        return false;
    }

    public final boolean A05(WJ wj, boolean z) throws IOException {
        A02();
        this.A0A.A0d(27);
        if (!UM.A04(wj, this.A0A.A0l(), 0, 27, z) || this.A0A.A0Q() != 1332176723) {
            return false;
        }
        this.A03 = this.A0A.A0I();
        if (this.A03 != 0) {
            if (z) {
                return false;
            }
            throw Q6.A00(A00(0, 31, 77));
        }
        this.A04 = this.A0A.A0I();
        this.A05 = this.A0A.A0N();
        this.A08 = this.A0A.A0O();
        this.A07 = this.A0A.A0O();
        this.A06 = this.A0A.A0O();
        this.A02 = this.A0A.A0I();
        this.A01 = this.A02 + 27;
        this.A0A.A0d(this.A02);
        if (!UM.A04(wj, this.A0A.A0l(), 0, this.A02, z)) {
            return false;
        }
        for (int i = 0; i < i; i++) {
            int[] iArr = this.A09;
            int i2 = this.A0A.A0I();
            iArr[i] = i2;
            int i3 = this.A00;
            int i4 = this.A09[i];
            this.A00 = i3 + i4;
        }
        if (A0C[6].length() == 29) {
            throw new RuntimeException();
        }
        A0C[4] = "CqFQ65VHAZ8UrjOPC72rQF5pGH0gGM8O";
        return true;
    }
}
