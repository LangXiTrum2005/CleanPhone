package com.facebook.ads.redexgen.core;

import android.text.TextUtils;
import java.util.Arrays;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.dr, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public abstract /* synthetic */ class AbstractC1454dr {
    public static byte[] A00;

    static {
        A01();
    }

    public static String A00(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A00, i, i + i2);
        for (int i4 = 0; i4 < bArrCopyOfRange.length; i4++) {
            bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] - i3) - 13);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A01() {
        A00 = new byte[]{120, -124, 125, 124, -16, -31, -12, -16, -69, -84, -65, -69, 118, -67, -69, -69, -94, -105, -106};
    }

    public static /* synthetic */ boolean A02(String str) {
        if (str == null) {
            return false;
        }
        String strA01 = AbstractC1684hb.A01(str);
        if (TextUtils.isEmpty(strA01)) {
            return false;
        }
        return ((strA01.contains(A00(4, 4, 111)) && !strA01.contains(A00(8, 8, 58))) || strA01.contains(A00(0, 4, 3)) || strA01.contains(A00(16, 3, 29))) ? false : true;
    }
}
