package com.facebook.ads.redexgen.core;

import com.mbridge.msdk.playercommon.exoplayer2.C;
import java.util.Arrays;
import java.util.Locale;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Xg, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public abstract class AbstractC1645Xg {
    public static byte[] A00;

    static {
        A02();
    }

    public static String A00(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A00, i, i + i2);
        for (int i4 = 0; i4 < bArrCopyOfRange.length; i4++) {
            bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] - i3) - 124);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A02() {
        A00 = new byte[]{-16, -7, -3, 49, -85, -83, -83, 1, -2, -9};
    }

    public static String A01(long j) {
        String string;
        String strA00 = A00(0, 0, 78);
        if (j < 1000) {
            string = j + strA00;
        } else {
            String strA01 = A00(0, 4, 79);
            if (j < 1000000) {
                StringBuilder sb = new StringBuilder();
                String formattedNumber = String.format(Locale.US, strA01, Double.valueOf(j / 1000.0d));
                StringBuilder sbAppend = sb.append(formattedNumber);
                String formattedNumber2 = A00(8, 1, 55);
                string = sbAppend.append(formattedNumber2).toString();
            } else if (j < C.NANOS_PER_SECOND) {
                StringBuilder sb2 = new StringBuilder();
                String formattedNumber3 = String.format(Locale.US, strA01, Double.valueOf(j / 1000000.0d));
                StringBuilder sbAppend2 = sb2.append(formattedNumber3);
                String formattedNumber4 = A00(9, 1, 46);
                string = sbAppend2.append(formattedNumber4).toString();
            } else {
                StringBuilder sb3 = new StringBuilder();
                String formattedNumber5 = String.format(Locale.US, strA01, Double.valueOf(j / 1.0E9d));
                StringBuilder sbAppend3 = sb3.append(formattedNumber5);
                String formattedNumber6 = A00(7, 1, 67);
                string = sbAppend3.append(formattedNumber6).toString();
            }
        }
        String strA02 = A00(4, 3, 1);
        if (string.contains(strA02)) {
            return string.replace(strA02, strA00);
        }
        return string;
    }
}
