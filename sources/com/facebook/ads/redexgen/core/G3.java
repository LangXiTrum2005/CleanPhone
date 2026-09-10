package com.facebook.ads.redexgen.core;

import android.view.Surface;
import java.util.Arrays;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public final class G3 {
    public static byte[] A00;
    public static String[] A01 = {"C9RGb7NCXIcFkq487TbtOiV6wJyl5V", "dIw4BKlzmuU3zMuMzRjmW2qgnJuCAgWy", "9uTfiPT", "rJUClzDzuXOVG7xlKmzeqZnP5Peloa5p", "Z", "9S6veErjLDkLbxAihnisBS", "TmmUyGbb1uzRJUdaHSZi2e0nreAYvBIE", "B53ji15DIU9T3sUrLFCN0rmnX0Pwja5D"};

    public static String A00(int i2, int i3, int i4) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A00, i2, i2 + i3);
        for (int i5 = 0; i5 < bArrCopyOfRange.length; i5++) {
            int i6 = (bArrCopyOfRange[i5] ^ i4) ^ 94;
            if (A01[0].length() != 30) {
                throw new RuntimeException();
            }
            A01[0] = "TD1mTFY2qo3QaoZPZEPw0mbH2R8uHE";
            bArrCopyOfRange[i5] = (byte) i6;
        }
        return new String(bArrCopyOfRange);
    }

    public static void A01() {
        byte[] bArr = {20, 51, 59, 62, 55, 54, 114, 38, 61, 114, 49, 51, 62, 62, 114, 1, 39, 32, 52, 51, 49, 55, 124, 33, 55, 38, 20, 32, 51, 63, 55, 0, 51, 38, 55, 77, 114, AbstractJsonLexerKt.TC_INVALID, 126, 116, 93, 105, 122, 118, 126, 73, 126, 119, 126, 122, 104, 126, 83, 126, 119, 107, 126, 105};
        if (A01[2].length() != 7) {
            throw new RuntimeException();
        }
        A01[5] = "Lq9CeCJTygMtbBn2m02oyI";
        A00 = bArr;
    }

    static {
        A01();
    }

    public static void A02(Surface surface, float f) {
        int compatibility;
        if (f == 0.0f) {
            compatibility = 0;
        } else {
            compatibility = 1;
        }
        try {
            surface.setFrameRate(f, compatibility);
        } catch (IllegalStateException e2) {
            AbstractC10924g.A08(A00(35, 23, 69), A00(0, 35, 12), e2);
        }
    }
}
