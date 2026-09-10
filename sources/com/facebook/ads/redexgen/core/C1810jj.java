package com.facebook.ads.redexgen.core;

import com.umeng.analytics.pro.cw;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.jj, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class C1810jj implements JP {
    public static byte[] A01;
    public final C1827k0 A00;

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
        A01 = new byte[]{82, 39, 76, 72, 39, 90, 101, 101, 102, 39, 88, 101, 127, 126, 99, 100, 109, 39, 94, 101, 97, 111, 100, 12, 10, 28, 11, 84, 24, 30, 28, 23, cw.k};
    }

    public C1810jj(C1827k0 c1827k0) {
        this.A00 = c1827k0;
    }

    @Override // com.facebook.ads.redexgen.core.JP
    public final Map<String, String> A6W(boolean z) {
        HashMap map = new HashMap();
        if (!C7V.A00().A04()) {
            map.put(A00(0, 23, 64), C9D.A00().A01(this.A00, true).A03());
        }
        map.put(A00(23, 10, 51), C9G.A06(new C05528l(this.A00), this.A00, z));
        return map;
    }
}
