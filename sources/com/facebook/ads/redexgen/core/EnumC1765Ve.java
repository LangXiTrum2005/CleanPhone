package com.facebook.ads.redexgen.core;

import java.util.Arrays;
import javax.annotation.Nullable;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Ve, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public enum EnumC1765Ve {
    A06(-1, 100, 1, 0),
    A07(-1, 120, 2, 1),
    A08(-1, 300, 3, 2),
    A09(-1, 400, 4, 3),
    A0A(-1, 50, 5, 4),
    A0B(-1, -1, 6, 5);

    public static byte[] A04;
    public final int A00;
    public final int A01;
    public final int A02;
    public final int A03;

    public static String A01(int i2, int i3, int i4) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A04, i2, i2 + i3);
        for (int i5 = 0; i5 < bArrCopyOfRange.length; i5++) {
            bArrCopyOfRange[i5] = (byte) ((bArrCopyOfRange[i5] ^ i4) ^ 77);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A02() {
        A04 = new byte[]{16, 29, 17, 31, 16, 12, 7, 105, 104, 104, 95, 82, 94, 80, 95, 67, 72, 38, 37, 39, 91, 86, 90, 84, 91, 71, 76, 32, 35, 35, 115, 126, 114, 124, 115, 111, 100, 15, 11, 11, 91, 86, 90, 84, 91, 71, 76, 38, 35, 82, 69, 67, 84, 95, 68, 89, 78, 65, 77, 73, 67};
    }

    static {
        A02();
    }

    EnumC1765Ve(int i2, int i3, int i4, int i5) {
        this.A03 = i2;
        this.A01 = i3;
        this.A02 = i4;
        this.A00 = i5;
    }

    @Nullable
    public static EnumC1765Ve A00(int i2) {
        for (EnumC1765Ve enumC1765Ve : values()) {
            if (enumC1765Ve.A00 == i2) {
                return enumC1765Ve;
            }
        }
        return null;
    }

    public final int A04() {
        return this.A01;
    }

    public final int A05() {
        return this.A02;
    }

    public final int A06() {
        return this.A03;
    }
}
