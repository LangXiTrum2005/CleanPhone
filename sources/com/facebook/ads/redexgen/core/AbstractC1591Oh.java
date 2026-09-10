package com.facebook.ads.redexgen.core;

import com.facebook.ads.internal.util.process.ProcessUtils;
import com.smartdigimkt.y4.g;
import java.util.Arrays;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Oh, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public abstract class AbstractC1591Oh {
    public static C1590Og A00;
    public static byte[] A01;
    public static String[] A02 = {g.f40227p, "j", "XC0Rp", "xmnbF", "ZVN1dtOIFAKzm8JTATZerxuQP9zv55g", "kSPLn3WG70", "", ""};

    public static String A01(int i2, int i3, int i4) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A01, i2, i2 + i3);
        for (int i5 = 0; i5 < bArrCopyOfRange.length; i5++) {
            int i6 = bArrCopyOfRange[i5] ^ i4;
            String[] strArr = A02;
            if (strArr[6].length() != strArr[7].length()) {
                throw new RuntimeException();
            }
            String[] strArr2 = A02;
            strArr2[1] = "w";
            strArr2[0] = "P";
            bArrCopyOfRange[i5] = (byte) (i6 ^ 92);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A02() {
        A01 = new byte[]{86, 90, 88, 27, 83, 84, 86, 80, 87, 90, 90, 94, 27, 84, 81, 70, 27, 116, 113, 106, 103, 112, 101, 122, 103, 97, 124, 123, 114, 106, 118, 122, 123, 115, 124, 114};
    }

    static {
        A02();
    }

    public static C1590Og A00(C2296ge c2296ge) {
        if (A00 == null) {
            synchronized (C1590Og.class) {
                if (A00 == null) {
                    A00 = new C1590Og(new C2388iB(c2296ge.getSharedPreferences(ProcessUtils.getProcessSpecificName(A01(0, 36, 105), c2296ge), 0)));
                }
            }
        }
        return A00;
    }
}
