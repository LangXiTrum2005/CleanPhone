package com.facebook.ads.redexgen.core;

import java.util.Arrays;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Wd, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class EnumC1125Wd {
    public static byte[] A00;
    public static String[] A01 = {"GMoX6LJM8ECzPVFFSTYySIjy2G46b7CC", "K4ROu9GbaiuUz0OUbYPvc3VtR6Ocg10D", "2AA4uqnc2zCDDCio5EZ97QWSPUtmQR3f", "A8a3QYxScFddez2bdU1mla2lprwVYHmf", "V4UPsIp0", "PIqIX5wy82zXVIF2a02jCZ2W7L5u5YXV", "X7cDthlcc3bRPhxwlR4vwK2rkVwYY95c", "6fkX9VznN37pSxFnefpopLVwpVOmzDnD"};
    public static final /* synthetic */ EnumC1125Wd[] A02;
    public static final EnumC1125Wd A03;
    public static final EnumC1125Wd A04;

    public static String A00(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A00, i, i + i2);
        for (int i4 = 0; i4 < bArrCopyOfRange.length; i4++) {
            bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] - i3) - 44);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A01() {
        A00 = new byte[]{-56, -57, -66, -35, -32, -40};
    }

    static {
        A01();
        A03 = new EnumC1125Wd(A00(0, 3, 77), 0);
        A04 = new EnumC1125Wd(A00(3, 3, 93), 1);
        A02 = A02();
    }

    public EnumC1125Wd(String str, int i) {
        super(str, i);
    }

    public static /* synthetic */ EnumC1125Wd[] A02() {
        EnumC1125Wd[] enumC1125WdArr = new EnumC1125Wd[2];
        EnumC1125Wd enumC1125Wd = A03;
        if (A01[3].charAt(12) == 'X') {
            throw new RuntimeException();
        }
        A01[4] = "0E2R1KIW";
        enumC1125WdArr[0] = enumC1125Wd;
        enumC1125WdArr[1] = A04;
        return enumC1125WdArr;
    }

    public static EnumC1125Wd valueOf(String str) {
        return (EnumC1125Wd) Enum.valueOf(EnumC1125Wd.class, str);
    }

    public static EnumC1125Wd[] values() {
        return (EnumC1125Wd[]) A02.clone();
    }
}
