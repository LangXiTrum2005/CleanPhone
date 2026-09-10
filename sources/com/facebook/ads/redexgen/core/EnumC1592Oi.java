package com.facebook.ads.redexgen.core;

import java.util.Arrays;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Oi, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public final class EnumC1592Oi {
    public static byte[] A01;
    public static String[] A02 = {"VujXzvSFrlMAu4R1I5vUAWLnq57AsPWM", "eCB4AeZNNUxNJOW0xCQdVSKErAFKyRUE", "SxM7TzuiGj5mLkDPau1usW4gOWoxs80M", "JPSotx28OKEE72Qpgvn7eDCIGwp5uNVo", "DEnf6Zvbz7peiDJpz513nqQn8JHSiM1H", "gOyBV6cEPVg9ZlKZ082v3gM", "JzQKQqAcA3MWJuXBOCM1CdL45YEfwdQ5", "kFuiftK6CrUjCipoQAB5otHUPyyIQR1T"};
    public static final /* synthetic */ EnumC1592Oi[] A03;
    public static final EnumC1592Oi A04;
    public static final EnumC1592Oi A05;
    public static final EnumC1592Oi A06;
    public final String A00;

    public static String A00(int i2, int i3, int i4) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A01, i2, i2 + i3);
        for (int i5 = 0; i5 < bArrCopyOfRange.length; i5++) {
            bArrCopyOfRange[i5] = (byte) ((bArrCopyOfRange[i5] ^ i4) ^ 62);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A01() {
        A01 = new byte[]{124, 125, 112, 113, 70, 71, 70, 77, 82, 69, 80, 79, 82, 84, 74, 75, 70, 71, 101, 100, 101, 110, 44, 59, 46, 49, 44, 42};
    }

    static {
        A01();
        A06 = new EnumC1592Oi(A00(8, 6, 62), 0, A00(22, 6, 96));
        A04 = new EnumC1592Oi(A00(0, 4, 10), 1, A00(14, 4, 28));
        A05 = new EnumC1592Oi(A00(4, 4, 54), 2, A00(18, 4, 53));
        A03 = A02();
    }

    public EnumC1592Oi(String str, int i2, String str2) {
        super(str, i2);
        this.A00 = str2;
    }

    public static /* synthetic */ EnumC1592Oi[] A02() {
        EnumC1592Oi[] enumC1592OiArr = new EnumC1592Oi[3];
        enumC1592OiArr[0] = A06;
        EnumC1592Oi enumC1592Oi = A04;
        String[] strArr = A02;
        if (strArr[0].charAt(31) != strArr[2].charAt(31)) {
            throw new RuntimeException();
        }
        String[] strArr2 = A02;
        strArr2[4] = "cigJDFmR8APB9TZFazKvkLU6eV5xdG1z";
        strArr2[7] = "bxChofFJf2xaRn9PIbRGfpqcGnLInP10";
        enumC1592OiArr[1] = enumC1592Oi;
        enumC1592OiArr[2] = A05;
        return enumC1592OiArr;
    }

    public final String A03() {
        return this.A00;
    }

    public static EnumC1592Oi valueOf(String str) {
        return (EnumC1592Oi) Enum.valueOf(EnumC1592Oi.class, str);
    }

    public static EnumC1592Oi[] values() {
        return (EnumC1592Oi[]) A03.clone();
    }
}
