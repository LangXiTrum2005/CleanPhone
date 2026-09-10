package com.facebook.ads.redexgen.core;

import java.util.Arrays;
import java.util.Collection;
import java.util.Map;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.nI, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public abstract class AbstractC2025nI<K0> {
    public static byte[] A00;
    public static String[] A01 = {"bao8c38n28wPAMqvf0", "eVcWzAuCAXWumTICSFBebUgmb9TguTkL", "p", "gqL7Zo5j54GI4jqi05kLU", "fae6iywUSwwj1RjLTY2P", "asvzUEyWtHVXByXUijz9tuohidd7jT94", "t7lccWit4rbeEMhbm3WlI6hCZ2BNlGb8", "1T7kTgAAsxu7zrmAj3X1"};

    public static String A01(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A00, i, i + i2);
        for (int i4 = 0; i4 < bArrCopyOfRange.length; i4++) {
            int i5 = (bArrCopyOfRange[i4] ^ i3) ^ 104;
            String[] strArr = A01;
            if (strArr[0].length() == strArr[2].length()) {
                throw new RuntimeException();
            }
            A01[6] = "XFZlfL1njVMJiM3nHtzYTwesPM930KjJ";
            bArrCopyOfRange[i4] = (byte) i5;
        }
        return new String(bArrCopyOfRange);
    }

    public static void A02() {
        A00 = new byte[]{46, 51, 59, 46, 40, 63, 46, 47, 29, 42, 39, 62, 46, 56, 27, 46, 57, 0, 46, 50};
    }

    public abstract <K extends K0, V> Map<K, Collection<V>> A04();

    static {
        A02();
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.nI != com.google.common.collect.MultimapBuilder$MultimapBuilderWithKeys<K0> */
    private final AbstractC0924Nx<K0, Object> A00(final int expectedValuesPerKey) {
        AbstractC1877ko.A00(expectedValuesPerKey, A01(0, 20, 35));
        return new AbstractC0924Nx<K0, Object>() { // from class: com.facebook.ads.redexgen.X.3w
            @Override // com.facebook.ads.redexgen.core.AbstractC0924Nx
            public final <K extends K0, V> OB<K, V> A00() {
                return AbstractC2029nM.A00(this.A01.A04(), new C0925Ny(expectedValuesPerKey));
            }
        };
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.nI != com.google.common.collect.MultimapBuilder$MultimapBuilderWithKeys<K0> */
    public final AbstractC0924Nx<K0, Object> A03() {
        return A00(2);
    }
}
