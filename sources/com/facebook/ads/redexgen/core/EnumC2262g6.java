package com.facebook.ads.redexgen.core;

import java.util.Arrays;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.g6, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public enum EnumC2262g6 {
    A05(true, false),
    A06(true, true);

    public static byte[] A02;
    public static String[] A03 = {"2ontwM2arFslKncjF33kbqsw34bOv6le", "G9q7n4RrTr1", "g4gCsJajd0OYdOA8Ye5rYJWq4JgSICF", "NFoKf805ct", "mafT0Rfur7fS0CNoj1tBpTWo2FQFb5xI", "EiMXCOKYsXD", "uVuWHRjrR7UDLAS", "0Dp8HE0WixXMfpgDKF4PEgrQKOmjSnl7"};
    public boolean A00;
    public boolean A01;

    public static String A00(int i2, int i3, int i4) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A02, i2, i2 + i3);
        for (int i5 = 0; i5 < bArrCopyOfRange.length; i5++) {
            bArrCopyOfRange[i5] = (byte) ((bArrCopyOfRange[i5] ^ i4) ^ 120);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A01() {
        A02 = new byte[]{39, 37, 52, 86, 73, 85, 82};
    }

    static {
        A01();
    }

    EnumC2262g6(boolean z2, boolean z3) {
        this.A00 = z2;
        this.A01 = z3;
    }

    public final String A03() {
        return toString();
    }

    public final boolean A04() {
        return this.A00;
    }

    public final boolean A05() {
        return this.A01;
    }

    /* JADX INFO: renamed from: values, reason: to resolve conflict with enum method */
    public static EnumC2262g6[] valuesCustom() {
        EnumC2262g6[] enumC2262g6ArrValuesCustom = values();
        if (A03[7].charAt(2) != 'p') {
            throw new RuntimeException();
        }
        A03[7] = "eYpi2UA0ZlC7PiDY55aF0B4EyL2494ge";
        return (EnumC2262g6[]) enumC2262g6ArrValuesCustom.clone();
    }
}
