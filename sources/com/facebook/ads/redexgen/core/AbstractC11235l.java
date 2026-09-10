package com.facebook.ads.redexgen.core;

import android.text.TextUtils;
import java.util.Arrays;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.5l, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public abstract /* synthetic */ class AbstractC11235l {
    public static byte[] A00;

    static {
        A01();
    }

    public static String A00(int i2, int i3, int i4) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A00, i2, i2 + i3);
        for (int i5 = 0; i5 < bArrCopyOfRange.length; i5++) {
            bArrCopyOfRange[i5] = (byte) ((bArrCopyOfRange[i5] - i4) - 104);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A01() {
        A00 = new byte[]{52, 64, 57, 56, 69, 54, 73, 69, 43, 28, 47, 43, -26, 45, 43, 43, 32, 21, 20};
    }

    public static /* synthetic */ boolean A02(String str) {
        if (str == null) {
            return false;
        }
        String strA01 = AbstractC2495k7.A01(str);
        if (TextUtils.isEmpty(strA01)) {
            return false;
        }
        return ((strA01.contains(A00(4, 4, 105)) && !strA01.contains(A00(8, 8, 79))) || strA01.contains(A00(0, 4, 100)) || strA01.contains(A00(16, 3, 64))) ? false : true;
    }
}
