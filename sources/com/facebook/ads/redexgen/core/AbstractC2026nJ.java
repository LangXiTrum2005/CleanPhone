package com.facebook.ads.redexgen.core;

import com.google.common.collect.ElementTypesAreNonnullByDefault;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.EnumC4719u30;
import java.util.Arrays;
import java.util.Comparator;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.nJ, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
@ElementTypesAreNonnullByDefault
public abstract class AbstractC2026nJ<K0, V0> {
    public static byte[] A00;

    static {
        A04();
    }

    public static String A03(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A00, i, i + i2);
        for (int i4 = 0; i4 < bArrCopyOfRange.length; i4++) {
            bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] - i3) - 127);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A04() {
        A00 = new byte[]{97, 116, 108, 97, 95, 112, 97, 96, 71, 97, 117, 111};
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.nJ != com.google.common.collect.MultimapBuilder<K0, V0> */
    public AbstractC2026nJ() {
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.nJ != com.google.common.collect.MultimapBuilder<K0, V0> */
    public /* synthetic */ AbstractC2026nJ(O0 o0) {
        this();
    }

    public static AbstractC2025nI<Object> A00(int expectedKeys) {
        AbstractC1877ko.A00(expectedKeys, A03(0, 12, EnumC4719u30.INVALID_METRICS_ENDPOINT_VALUE));
        return new O0(expectedKeys);
    }

    public static <K0> AbstractC2025nI<K0> A01(Comparator<K0> comparator) {
        AbstractC1718iD.A04(comparator);
        return new C0926Nz(comparator);
    }

    public static AbstractC2025nI<Comparable> A02() {
        return A01(AbstractC2041nY.A03());
    }
}
