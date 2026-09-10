package com.facebook.ads.redexgen.core;

import com.google.common.collect.ElementTypesAreNonnullByDefault;
import com.umeng.analytics.pro.cw;
import java.util.Arrays;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.ko, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
@ElementTypesAreNonnullByDefault
public abstract class AbstractC1877ko {
    public static byte[] A00;

    static {
        A02();
    }

    public static String A01(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A00, i, i + i2);
        for (int i4 = 0; i4 < bArrCopyOfRange.length; i4++) {
            bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] ^ i3) ^ 87);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A02() {
        A00 = new byte[]{96, 35, 33, 46, 46, 47, 52, 96, 34, 37, 96, 46, 37, 39, 33, 52, 41, 54, 37, 96, 34, 53, 52, 96, 55, 33, 51, 122, 96, 43, 120, 99, 122, 122, 0, 1, 78, cw.k, cw.m, 2, 2, 29, 78, 26, 1, 78, 0, 11, 22, 26, 70, 71, 78, 29, 7, 0, cw.k, 11, 78, 26, 6, 11, 78, 2, cw.m, 29, 26, 78, cw.k, cw.m, 2, 2, 78, 26, 1, 78, 28, 11, 3, 1, 24, 11, 70, 71, 10, 17, 8, 8, 68, cw.m, 1, 29, 68, cw.k, 10, 68, 1, 10, cw.n, 22, 29, 94, 68, 10, 17, 8, 8, 89, 31, 4, 29, 29, 81, 7, cw.n, 29, 4, 20, 81, 24, 31, 81, 20, 31, 5, 3, 8, 75, 81};
    }

    public static int A00(int value, String name) {
        if (value >= 0) {
            return value;
        }
        throw new IllegalArgumentException(name + A01(0, 29, 23) + value);
    }

    public static void A03(Object key, Object value) {
        if (key != null) {
            if (value != null) {
                return;
            } else {
                throw new NullPointerException(A01(108, 21, 38) + key + A01(29, 5, 65));
            }
        }
        throw new NullPointerException(A01(84, 24, 51) + value);
    }

    public static void A04(boolean canRemove) {
        AbstractC1718iD.A0F(canRemove, A01(34, 50, 57));
    }
}
