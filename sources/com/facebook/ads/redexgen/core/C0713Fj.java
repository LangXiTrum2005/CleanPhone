package com.facebook.ads.redexgen.core;

import com.facebook.ads.sync.SyncModifiableBundle;
import com.umeng.analytics.pro.cw;
import java.util.Arrays;
import java.util.Map;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Fj, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public class C0713Fj extends AbstractC1233aC {
    public static byte[] A00;

    static {
        A01();
    }

    public static String A00(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A00, i, i + i2);
        for (int i4 = 0; i4 < bArrCopyOfRange.length; i4++) {
            bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] - i3) - 102);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A01() {
        A00 = new byte[]{48, 34, 49, cw.m, 34, 46, 50, 38, 47, 34, 48, cw.n, 54, 43, 32};
    }

    public C0713Fj(HX hx) {
        super(hx, K0.A04);
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC1233aC, com.facebook.ads.redexgen.core.K8
    public final void A43(Map<InterfaceC0824Jq, KD> map, Map<SyncModifiableBundle, K0> map2) {
        throw new NullPointerException(A00(0, 15, 87));
    }
}
