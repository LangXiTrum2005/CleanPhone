package com.facebook.ads.redexgen.core;

import com.google.common.primitives.ElementTypesAreNonnullByDefault;
import com.inmobi.commons.core.configs.AdConfig;
import java.util.Arrays;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.pN, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
@ElementTypesAreNonnullByDefault
public abstract class AbstractC2804pN {
    public static byte[] A00;

    static {
        A03();
    }

    public static String A02(int i2, int i3, int i4) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A00, i2, i2 + i3);
        for (int i5 = 0; i5 < bArrCopyOfRange.length; i5++) {
            bArrCopyOfRange[i5] = (byte) ((bArrCopyOfRange[i5] ^ i4) ^ 49);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A03() {
        A00 = new byte[]{0, 58, 59, 111, 32, 41, 111, 61, 46, 33, 40, 42, 117, 111, 106, 60};
    }

    public static char A00(byte b1, byte b2) {
        return (char) ((b1 << 8) | (b2 & AdConfig.NETWORK_LOAD_LIMIT_DISABLED));
    }

    public static char A01(long value) {
        char c2 = (char) value;
        AbstractC2530ki.A0H(((long) c2) == value, A02(0, 16, 126), value);
        return c2;
    }

    public static boolean A04(char[] array, char target) {
        for (char c2 : array) {
            if (c2 == target) {
                return true;
            }
        }
        return false;
    }
}
