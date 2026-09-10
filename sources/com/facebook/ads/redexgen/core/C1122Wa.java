package com.facebook.ads.redexgen.core;

import com.umeng.analytics.pro.cw;
import java.util.Arrays;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Wa, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class C1122Wa {
    public static byte[] A05;
    public final int A00;
    public final C1085Um A01;
    public final String A02;
    public final boolean A03;
    public final byte[] A04;

    static {
        A02();
    }

    public static String A01(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A05, i, i + i2);
        for (int i4 = 0; i4 < bArrCopyOfRange.length; i4++) {
            bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] ^ i3) ^ 91);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A02() {
        A05 = new byte[]{34, 43, 37, 68, 118, 118, 112, 104, 108, 107, 98, 37, 68, 64, 86, 40, 70, 81, 87, 37, 102, 119, 124, 117, 113, 106, 37, 104, 106, 97, 96, 43, 35, 5, 22, 20, 28, 50, 25, 20, 5, cw.l, 7, 3, 30, 24, 25, 53, 24, cw.m, 61, 6, 27, 29, 24, 24, 7, 26, 28, cw.k, 12, 72, 24, 26, 7, 28, cw.k, 11, 28, 1, 7, 6, 72, 27, 11, 0, cw.k, 5, cw.k, 72, 28, 17, 24, cw.k, 72, 79, 24, 25, 24, 74, 62, 63, 62, 46, 89, 95, 84, 89, 9, cw.m, 4, 25};
    }

    public C1122Wa(boolean z, String str, int i, byte[] bArr, int i2, int i3, byte[] bArr2) {
        AbstractC1517es.A07((bArr2 == null) ^ (i == 0));
        this.A03 = z;
        this.A02 = str;
        this.A00 = i;
        this.A04 = bArr2;
        this.A01 = new C1085Um(A00(str), bArr, i2, i3);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:7:0x000c  */
    public static int A00(String str) {
        byte b;
        if (str == null) {
            return 1;
        }
        switch (str.hashCode()) {
            case 3046605:
                if (!str.equals(A01(86, 4, 32))) {
                    b = -1;
                } else {
                    b = 2;
                }
                break;
            case 3046671:
                if (!str.equals(A01(90, 4, 6))) {
                    b = -1;
                } else {
                    b = 3;
                }
                break;
            case 3049879:
                if (!str.equals(A01(94, 4, 97))) {
                    b = -1;
                } else {
                    b = 0;
                }
                break;
            case 3049895:
                if (!str.equals(A01(98, 4, 49))) {
                    b = -1;
                } else {
                    b = 1;
                }
                break;
            default:
                b = -1;
                break;
        }
        switch (b) {
            case 0:
            case 1:
                return 1;
            case 2:
            case 3:
                return 2;
            default:
                AbstractC1561fb.A07(A01(32, 18, 44), A01(50, 36, 51) + str + A01(0, 32, 94));
                return 1;
        }
    }
}
