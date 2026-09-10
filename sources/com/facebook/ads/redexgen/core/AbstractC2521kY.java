package com.facebook.ads.redexgen.core;

import java.util.Arrays;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.kY, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public abstract class AbstractC2521kY<T> implements M0<T> {
    public static byte[] A01;
    public final String A00;

    static {
        A03();
    }

    public static String A02(int i2, int i3, int i4) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A01, i2, i2 + i3);
        for (int i5 = 0; i5 < bArrCopyOfRange.length; i5++) {
            bArrCopyOfRange[i5] = (byte) ((bArrCopyOfRange[i5] - i4) - 21);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A03() {
        A01 = new byte[]{-90, -83, -92, -92};
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.kY != com.facebook.ads.funnel.FunnelParamType$AbstractFunnelParamType<T> */
    public AbstractC2521kY(String str) {
        this.A00 = str;
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.kY != com.facebook.ads.funnel.FunnelParamType$AbstractFunnelParamType<T> */
    public C1532Lz A04(T t) {
        return new C1532Lz(this, t == null ? A02(0, 4, 35) : t.toString());
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.kY != com.facebook.ads.funnel.FunnelParamType$AbstractFunnelParamType<T> */
    @Override // com.facebook.ads.redexgen.core.M0
    public final String getName() {
        return this.A00;
    }
}
