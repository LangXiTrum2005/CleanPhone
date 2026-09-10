package com.facebook.ads.redexgen.core;

import com.facebook.ads.AdSize;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public abstract class XG {
    public static byte[] A00;
    public static String[] A01 = {"NoYeCqw0NuwsBVSvR8aiyPnoj7", "APA6ODPEmALJh8xHCjcwQdd6vsoZzjc", "og2YXunKDp8EqsbnYhzdu6qR", "YLuKSEsrRIdzXIjkloLmDmBrtZDR6KFi", "8qSAHAaIpnwwIsCvL7AfoFTJYv1h46H2", "PXVMr", "05SrQOor", "5yYP5"};
    public static final Map<EnumC1774Vp, EnumC1775Vq> A02;

    public static String A06(int i2, int i3, int i4) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A00, i2, i2 + i3);
        for (int i5 = 0; i5 < bArrCopyOfRange.length; i5++) {
            bArrCopyOfRange[i5] = (byte) ((bArrCopyOfRange[i5] ^ i4) ^ 18);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A07() {
        A00 = new byte[]{104, 74, 69, 12, 95, 11, 72, 89, 78, 74, 95, 78, 11, 106, 79, 120, 66, 81, 78, 11, 94, 88, 66, 69, 76, 11, 95, 67, 66, 88, 11, 92, 66, 79, 95, 67, 11, 74, 69, 79, 11, 67, 78, 66, 76, 67, 95, 5, 50, 9, 12, 9, 8, 16, 9, 71, 38, 3, 52, 14, 29, 2, 71, 19, 30, 23, 2, 73};
    }

    static {
        A07();
        A02 = new HashMap();
        A02.put(EnumC1774Vp.A09, EnumC1775Vq.A0D);
        A02.put(EnumC1774Vp.A07, EnumC1775Vq.A0F);
        A02.put(EnumC1774Vp.A06, EnumC1775Vq.A0E);
    }

    public static AdSize A00(EnumC1774Vp enumC1774Vp) {
        return AdSize.fromWidthAndHeight(enumC1774Vp.A04(), enumC1774Vp.A03());
    }

    public static AdSize A01(EnumC1775Vq enumC1775Vq) {
        for (Map.Entry<EnumC1774Vp, EnumC1775Vq> entry : A02.entrySet()) {
            if (entry.getValue() == enumC1775Vq) {
                EnumC1774Vp key = entry.getKey();
                if (A01[3].charAt(31) == 'z') {
                    throw new RuntimeException();
                }
                String[] strArr = A01;
                strArr[5] = "vUJqh";
                strArr[7] = "m1G2X";
                return A00(key);
            }
        }
        return AdSize.BANNER_320_50;
    }

    public static EnumC1774Vp A02(int i2) {
        switch (i2) {
            case 4:
                return EnumC1774Vp.A05;
            case 5:
                return EnumC1774Vp.A06;
            case 6:
                return EnumC1774Vp.A07;
            case 7:
                return EnumC1774Vp.A09;
            case 100:
                return EnumC1774Vp.A08;
            default:
                throw new IllegalArgumentException(A06(48, 20, 117));
        }
    }

    public static EnumC1774Vp A03(int i2, int i3) {
        if (EnumC1774Vp.A08.A03() == i3 && EnumC1774Vp.A08.A04() == i2) {
            return EnumC1774Vp.A08;
        }
        if (EnumC1774Vp.A05.A03() == i3) {
            int iA04 = EnumC1774Vp.A05.A04();
            String[] strArr = A01;
            if (strArr[5].length() != strArr[7].length()) {
                throw new RuntimeException();
            }
            A01[3] = "mZi1y4qoTe3Eq90wST2K5ufjmqQARasa";
            if (iA04 == i2) {
                return EnumC1774Vp.A05;
            }
        }
        if (EnumC1774Vp.A06.A03() == i3 && EnumC1774Vp.A06.A04() == i2) {
            return EnumC1774Vp.A06;
        }
        if (EnumC1774Vp.A07.A03() == i3 && EnumC1774Vp.A07.A04() == i2) {
            return EnumC1774Vp.A07;
        }
        if (EnumC1774Vp.A09.A03() == i3) {
            EnumC1774Vp enumC1774Vp = EnumC1774Vp.A09;
            String[] strArr2 = A01;
            if (strArr2[6].length() == strArr2[0].length()) {
                throw new RuntimeException();
            }
            A01[3] = "Hv8n5Vk5MDnKIrkb6r8Yx0AFcMxyPOg2";
            if (enumC1774Vp.A04() == i2) {
                return EnumC1774Vp.A09;
            }
        }
        throw new IllegalArgumentException(A06(0, 48, 57));
    }

    public static EnumC1774Vp A04(AdSize adSize) {
        return A03(adSize.getWidth(), adSize.getHeight());
    }

    public static EnumC1775Vq A05(EnumC1774Vp enumC1774Vp) {
        EnumC1775Vq adTemplate = A02.get(enumC1774Vp);
        if (adTemplate == null) {
            return EnumC1775Vq.A0G;
        }
        return adTemplate;
    }
}
