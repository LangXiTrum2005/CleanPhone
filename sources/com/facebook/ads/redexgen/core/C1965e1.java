package com.facebook.ads.redexgen.core;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.e1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public final class C1965e1 implements InterfaceC2080ft {
    public static byte[] A01;
    public final C2127ge A00;

    static {
        A01();
    }

    public static String A00(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A01, i, i + i2);
        for (int i4 = 0; i4 < bArrCopyOfRange.length; i4++) {
            bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] ^ i3) ^ 74);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A01() {
        A01 = new byte[]{82, 39, 76, 72, 39, 90, 101, 101, 102, 39, 88, 101, 127, 126, 99, 100, 109, 39, 94, 101, 97, 111, 100, 12, 10, 28, 11, 84, 24, 30, 28, 23, 13};
    }

    public C1965e1(C2127ge c2127ge) {
        this.A00 = c2127ge;
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC2080ft
    public final Map<String, String> A6g(boolean z) {
        HashMap map = new HashMap();
        if (!SZ.A00().A04()) {
            map.put(A00(0, 23, 64), UG.A00().A01(this.A00, true).A04());
        }
        map.put(A00(23, 10, 51), UJ.A06(new C1554To(this.A00), this.A00, z));
        return map;
    }
}
