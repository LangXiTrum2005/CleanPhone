package com.facebook.ads.redexgen.core;

import com.umeng.analytics.pro.cw;
import java.util.Arrays;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Rx, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class C1023Rx extends Exception {
    public static byte[] A02;
    public static String[] A03 = {"XXye7LHZAeozqK8gapFsXSPF4xH", "t374HOVmt9LWG", "bgBFIwcrXQsVFM8uRII", "RFOuUGqKEUIlnO0HvszVIy1I5C9wZcDC", "dKNM0NGxlq4K1FEB6Qdh", "IHZMfrSF7wlU63KM", "B2fvb0FgtHpN0g1RQrEBtjrTNzTotaI0", "YZAHX3f"};
    public final long A00;
    public final long A01;

    public static String A00(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A02, i, i + i2);
        for (int i4 = 0; i4 < bArrCopyOfRange.length; i4++) {
            byte b = (byte) ((bArrCopyOfRange[i4] ^ i3) ^ 20);
            if (A03[5].length() != 16) {
                throw new RuntimeException();
            }
            A03[6] = "8A6cGvM1NjIj7bT8Ce2tcNmgCuMcob1V";
            bArrCopyOfRange[i4] = b;
        }
        return new String(bArrCopyOfRange);
    }

    public static void A01() {
        A02 = new byte[]{cw.m, 3, 68, 76, 87, 3, 31, 36, 47, 50, 58, 47, 41, 62, 47, 46, 106, 43, 63, 46, 35, 37, 106, 62, 56, 43, 41, 33, 106, 62, 35, 39, 47, 57, 62, 43, 39, 58, 106, 46, 35, 57, 41, 37, 36, 62, 35, 36, 63, 35, 62, 51, 112, 106, 47, 50, 58, 47, 41, 62, 47, 46, 106};
    }

    static {
        A01();
    }

    public C1023Rx(long j, long j2) {
        super(A00(6, 57, 94) + j2 + A00(0, 6, 55) + j);
        this.A00 = j;
        this.A01 = j2;
    }
}
