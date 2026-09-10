package com.facebook.ads.redexgen.core;

import com.umeng.analytics.pro.cw;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Hc, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class C0758Hc {
    public static byte[] A03;
    public final int A00;
    public final int A01;
    public final C2T A02;

    static {
        A01();
    }

    public static String A00(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A03, i, i + i2);
        for (int i4 = 0; i4 < bArrCopyOfRange.length; i4++) {
            bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] ^ i3) ^ 112);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A01() {
        A03 = new byte[]{89, 91, 72, 94, 89, 84, 78, 7, 5, 22, 0, cw.k, 10, 0};
    }

    public C0758Hc(int i, int i2, C2T c2t) {
        this.A01 = i;
        this.A00 = i2;
        this.A02 = c2t;
    }

    public final int A02() {
        return this.A01;
    }

    public final C2T A03() {
        return this.A02;
    }

    public final Map<String, String> A04() {
        HashMap map = new HashMap();
        StringBuilder sbAppend = new StringBuilder().append(this.A01);
        String strA00 = A00(0, 0, 41);
        map.put(A00(7, 7, 20), sbAppend.append(strA00).toString());
        map.put(A00(0, 7, 74), this.A00 + strA00);
        return map;
    }
}
