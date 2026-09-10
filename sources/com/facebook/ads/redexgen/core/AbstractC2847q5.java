package com.facebook.ads.redexgen.core;

import com.google.common.collect.ElementTypesAreNonnullByDefault;
import java.util.Arrays;
import java.util.Comparator;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.q5, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
@ElementTypesAreNonnullByDefault
public abstract class AbstractC2847q5<K0, V0> {
    public static byte[] A00;

    static {
        A04();
    }

    public static String A03(int i2, int i3, int i4) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A00, i2, i2 + i3);
        for (int i5 = 0; i5 < bArrCopyOfRange.length; i5++) {
            bArrCopyOfRange[i5] = (byte) ((bArrCopyOfRange[i5] - i4) - 127);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A04() {
        A00 = new byte[]{97, 116, 108, 97, 95, 112, 97, 96, 71, 97, 117, 111};
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.q5 != com.google.common.collect.MultimapBuilder<K0, V0> */
    public AbstractC2847q5() {
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.q5 != com.google.common.collect.MultimapBuilder<K0, V0> */
    public /* synthetic */ AbstractC2847q5(BG bg) {
        this();
    }

    public static AbstractC2846q4<Object> A00(int expectedKeys) {
        AbstractC2677nJ.A00(expectedKeys, A03(0, 12, 125));
        return new BG(expectedKeys);
    }

    public static <K0> AbstractC2846q4<K0> A01(Comparator<K0> comparator) {
        AbstractC2530ki.A04(comparator);
        return new BF(comparator);
    }

    public static AbstractC2846q4<Comparable> A02() {
        return A01(AbstractC2862qK.A03());
    }
}
