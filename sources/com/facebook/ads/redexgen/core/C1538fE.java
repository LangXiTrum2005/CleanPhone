package com.facebook.ads.redexgen.core;

import com.facebook.video.heroplayer.exocustom.MetaExoPlayerCustomization;
import java.util.Arrays;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.fE, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class C1538fE {
    public static byte[] A04;
    public static String[] A05 = {"1wyZbVqSUEJVoNG7PV0F0wU84tMzpskM", "1tLWmpCTmQBDbg1NCfVeIDUZ", "zSJQjbK4RXnpukTjj7aiH8ZxU9zMfWNo", "ONfjwOEe6DQFrmTWlbvZ4dpZ30zJWh57", "HLczMI", "iMFJRtixmdZqvTue6kW7JPGFrVPSgVs9", "hMQl0KwSfHrSPR6OcHxnbCfUvisUITrX", "7mAwqmZzZfOrAHZV04F6r35tqP3ev7sr"};
    public final float A00;
    public final int A01;
    public final int A02;
    public final long A03;

    public static String A00(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A04, i, i + i2);
        for (int i4 = 0; i4 < bArrCopyOfRange.length; i4++) {
            bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] ^ i3) ^ 38);
            if (A05[4].length() == 8) {
                throw new RuntimeException();
            }
            String[] strArr = A05;
            strArr[3] = "G61Ig15gnJL0jpTaRQDM3x7iAqZJqs85";
            strArr[2] = "pYoLxA93zhlSqYT3gDlAoMN0UyYRQagZ";
        }
        return new String(bArrCopyOfRange);
    }

    public static void A01() {
        A04 = new byte[]{40, 37, 41, 39, 40, 52, 96, 45, 53, 51, 52, 96, 34, 37, 96, 48, 47, 51, 41, 52, 41, 54, 37, 108, 96, 34, 53, 52, 96, 41, 51, 122, 96, 115, 109, 96, 112, 108, 36, 105, 113, 119, 112, 36, 102, 97, 36, 116, 107, 119, 109, 112, 109, 114, 97, 40, 36, 102, 113, 112, 36, 109, 119, 62, 36};
    }

    static {
        A01();
    }

    @MetaExoPlayerCustomization("Should be private but left public for backward compat")
    public C1538fE(int i, int i2, float f, long j) {
        AbstractC1517es.A09(i > 0, A00(33, 32, 34) + i);
        AbstractC1517es.A09(i2 > 0, A00(0, 33, 102) + i2);
        this.A02 = i;
        this.A01 = i2;
        this.A00 = f;
        this.A03 = j;
    }
}
