package com.facebook.ads.redexgen.core;

import java.util.Arrays;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.8I, reason: invalid class name */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public class C8I extends AbstractC2521kY<EnumC1524Lr> {
    public static byte[] A00;

    static {
        A01();
    }

    public static String A00(int i2, int i3, int i4) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A00, i2, i2 + i3);
        for (int i5 = 0; i5 < bArrCopyOfRange.length; i5++) {
            bArrCopyOfRange[i5] = (byte) ((bArrCopyOfRange[i5] - i4) - 44);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A01() {
        A00 = new byte[]{-56, -49, -58, -58};
    }

    public C8I(String str) {
        super(str);
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC2521kY
    /* JADX INFO: renamed from: A05, reason: merged with bridge method [inline-methods] */
    public final C1532Lz A04(EnumC1524Lr enumC1524Lr) {
        return new C1532Lz(this, enumC1524Lr == null ? A00(0, 4, 46) : A00(0, 0, 18) + enumC1524Lr.A03());
    }
}
