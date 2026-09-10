package com.facebook.ads.redexgen.core;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.e1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public final class C2134e1 implements InterfaceC2249ft {
    public static byte[] A01;
    public final C2296ge A00;

    static {
        A01();
    }

    public static String A00(int i2, int i3, int i4) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A01, i2, i2 + i3);
        for (int i5 = 0; i5 < bArrCopyOfRange.length; i5++) {
            bArrCopyOfRange[i5] = (byte) ((bArrCopyOfRange[i5] ^ i4) ^ 74);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A01() {
        A01 = new byte[]{82, 39, 76, 72, 39, 90, 101, 101, 102, 39, 88, 101, AbstractJsonLexerKt.TC_INVALID, 126, 99, 100, 109, 39, 94, 101, 97, 111, 100, 12, 10, 28, 11, 84, 24, 30, 28, 23, 13};
    }

    public C2134e1(C2296ge c2296ge) {
        this.A00 = c2296ge;
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC2249ft
    public final Map<String, String> A6g(boolean z2) {
        HashMap map = new HashMap();
        if (!SZ.A00().A04()) {
            map.put(A00(0, 23, 64), UG.A00().A01(this.A00, true).A04());
        }
        map.put(A00(23, 10, 51), UJ.A06(new C1723To(this.A00), this.A00, z2));
        return map;
    }
}
