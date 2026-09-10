package com.facebook.ads.redexgen.core;

import java.util.Arrays;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.8G, reason: invalid class name */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public class C8G extends AbstractC2521kY<M5> {
    public static byte[] A00;

    static {
        A01();
    }

    public static String A00(int i2, int i3, int i4) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A00, i2, i2 + i3);
        for (int i5 = 0; i5 < bArrCopyOfRange.length; i5++) {
            bArrCopyOfRange[i5] = (byte) ((bArrCopyOfRange[i5] - i4) - 115);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A01() {
        A00 = new byte[]{83, 90, 81, 81};
    }

    public C8G(String str) {
        super(str);
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC2521kY
    /* JADX INFO: renamed from: A05, reason: merged with bridge method [inline-methods] */
    public final C1532Lz A04(M5 m5) {
        return new C1532Lz(this, m5 == null ? A00(0, 4, 114) : m5.A03());
    }
}
