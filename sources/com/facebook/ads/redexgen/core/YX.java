package com.facebook.ads.redexgen.core;

import android.app.Activity;
import java.util.Arrays;

/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public abstract class YX {
    public static byte[] A00;
    public static String[] A01 = {"fNLd7n7EkFNgLvt4vtbAtkfYXAQTEPRW", "T28d5tP6PdXMoXHWEuFSx", "qUncBokoif621v1GQ7gcKknRgizXPQsv", "IkdBxGtQCWxg3d0UA", "tTLCQWoYBdse5ixamGS9HTw2k7WXO8kY", "MyXxcbJBNTQUhn8S7mcX9rM3djOk", "ymwmgwOSW636xClV84tW2WEHiZAMdx7v", "xCAHRx5Y4"};

    public static String A00(int i2, int i3, int i4) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A00, i2, i2 + i3);
        for (int i5 = 0; i5 < bArrCopyOfRange.length; i5++) {
            byte b2 = bArrCopyOfRange[i5];
            String[] strArr = A01;
            if (strArr[7].length() == strArr[1].length()) {
                throw new RuntimeException();
            }
            A01[0] = "dZQs1GEaNPWr5rijC2ubsciPbAft3PPF";
            bArrCopyOfRange[i5] = (byte) ((b2 - i4) - 117);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A01() {
        A00 = new byte[]{15, 13, 22, 13, 26, 17, 11};
    }

    static {
        A01();
    }

    public static void A02(Activity activity, int i2, C2300gi c2300gi) {
        try {
            activity.setRequestedOrientation(i2);
        } catch (IllegalStateException e2) {
            c2300gi.A08().ABz(A00(0, 7, 51), AbstractC1712Td.A0H, new C1713Te(e2));
        }
    }
}
