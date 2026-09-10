package com.facebook.ads.redexgen.core;

import com.facebook.ads.internal.util.process.ProcessUtils;
import java.util.Arrays;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.3h, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public abstract class AbstractC04223h {
    public static C04213g A00;
    public static byte[] A01;
    public static String[] A02 = {"g", "j", "XC0Rp", "xmnbF", "ZVN1dtOIFAKzm8JTATZerxuQP9zv55g", "kSPLn3WG70", "", ""};

    public static String A01(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A01, i, i + i2);
        for (int i4 = 0; i4 < bArrCopyOfRange.length; i4++) {
            int i5 = bArrCopyOfRange[i4] ^ i3;
            String[] strArr = A02;
            if (strArr[6].length() != strArr[7].length()) {
                throw new RuntimeException();
            }
            String[] strArr2 = A02;
            strArr2[1] = "w";
            strArr2[0] = "P";
            bArrCopyOfRange[i4] = (byte) (i5 ^ 92);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A02() {
        A01 = new byte[]{86, 90, 88, 27, 83, 84, 86, 80, 87, 90, 90, 94, 27, 84, 81, 70, 27, 116, 113, 106, 103, 112, 101, 122, 103, 97, 124, 123, 114, 106, 118, 122, 123, 115, 124, 114};
    }

    static {
        A02();
    }

    public static C04213g A00(C1827k0 c1827k0) {
        if (A00 == null) {
            synchronized (C04213g.class) {
                if (A00 == null) {
                    A00 = new C04213g(new C1920lZ(c1827k0.getSharedPreferences(ProcessUtils.getProcessSpecificName(A01(0, 36, 105), c1827k0), 0)));
                }
            }
        }
        return A00;
    }
}
