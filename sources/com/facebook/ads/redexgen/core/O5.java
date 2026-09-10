package com.facebook.ads.redexgen.core;

import com.facebook.ads.AdError;
import java.util.Arrays;

/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public abstract class O5 {
    public static byte[] A00;

    static {
        A01();
    }

    public static String A00(int i2, int i3, int i4) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A00, i2, i2 + i3);
        for (int i5 = 0; i5 < bArrCopyOfRange.length; i5++) {
            bArrCopyOfRange[i5] = (byte) ((bArrCopyOfRange[i5] ^ i4) ^ 115);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A01() {
        A00 = new byte[]{11, 77, 81, 72, 73, 93, 90, 64, 81, 70, 71, 64, 93, 64, 93, 85, 88};
    }

    public static void A02(C2300gi c2300gi, AbstractC2465jd abstractC2465jd, boolean z2, O3 o3) {
        if (!C1750Up.A2E(c2300gi)) {
            C1706Sx c1706Sx = new C1706Sx(c2300gi);
            C1572No c1572NoA07 = abstractC2465jd.A29().A0H().A07();
            c1706Sx.A0e(new VI(abstractC2465jd.A2E(), c2300gi.A0A()));
            if (c1572NoA07 == null) {
                o3.AFF(AdError.CACHE_ERROR);
                return;
            }
            if (c1572NoA07.A0Y()) {
                o3.AFG();
                return;
            }
            C1702St c1702St = new C1702St(c1572NoA07.A0L(), abstractC2465jd.A1D(), abstractC2465jd.A10());
            c1702St.A04 = true;
            c1702St.A03 = A00(0, 5, 86);
            switch (O2.A00[c1572NoA07.A0G().ordinal()]) {
                case 1:
                case 2:
                    c1706Sx.A0Y(c1702St);
                    break;
            }
            c1706Sx.A0c(new C1704Sv(abstractC2465jd.A2C().A01(), -1, -1, abstractC2465jd.A1D(), abstractC2465jd.A10()));
            c1706Sx.A0c(new C1704Sv(c1572NoA07.A0K(), -1, -1, abstractC2465jd.A1D(), abstractC2465jd.A10()));
            O0.A00(abstractC2465jd, c1706Sx, A00(5, 12, 71));
            c1706Sx.A0X(new C2443jA(c2300gi, o3, c1706Sx, c1572NoA07, z2), new C1699Sq(abstractC2465jd.A1D(), abstractC2465jd.A10()));
            return;
        }
        o3.AFG();
    }
}
