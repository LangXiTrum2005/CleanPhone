package com.facebook.ads.redexgen.core;

import android.text.TextUtils;
import java.util.Arrays;
import java.util.Iterator;

/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public abstract class O6 {
    public static byte[] A00;

    static {
        A01();
    }

    public static String A00(int i2, int i3, int i4) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A00, i2, i2 + i3);
        for (int i5 = 0; i5 < bArrCopyOfRange.length; i5++) {
            bArrCopyOfRange[i5] = (byte) ((bArrCopyOfRange[i5] ^ i4) ^ 102);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A01() {
        A00 = new byte[]{10, 76, 80, 73, 72, 121, 126, 100, 117, 98, 99, 100, 121, 100, 121, 113, 124, 101, 114, 96, 118, 101, 115, 114, 115, 72, 97, 126, 115, 114, 120};
    }

    public static void A02(C2300gi c2300gi, C1706Sx c1706Sx, C11757l c11757l) {
        c1706Sx.A0d(new C1704Sv(c11757l.A2C().A01(), C2137e4.A04, C2137e4.A04, c11757l.A1D(), A00(17, 14, 113)));
        boolean zA1g = c11757l.A1g();
        String strA00 = A00(17, 14, 113);
        if (zA1g) {
            C1702St c1702St = new C1702St(c11757l.A0x(), c11757l.A1D(), strA00);
            c1702St.A04 = true;
            c1702St.A03 = A00(0, 5, 66);
            c1706Sx.A0Y(c1702St);
        }
        boolean zA30 = C1750Up.A30(c2300gi, C2227fX.A03());
        C1702St c1702St2 = new C1702St(c11757l.A29().A0H().A09(), c11757l.A1D(), A00(17, 14, 113), c11757l.A29().A0H().A06());
        if (zA1g && !zA30) {
            c1706Sx.A0Y(c1702St2);
        } else {
            c1706Sx.A0b(c1702St2);
        }
        c1706Sx.A0d(new C1704Sv(c11757l.A29().A0H().A08(), O1.A00(c11757l.A29().A0H()), O1.A01(c11757l.A29().A0H()), c11757l.A1D(), A00(17, 14, 113)));
        O0.A00(c11757l, c1706Sx, strA00);
        Iterator<String> it = c11757l.A29().A0K().A02().iterator();
        while (isDSL) {
            String url = it.next();
            c1706Sx.A0d(new C1704Sv(url, -1, -1, c11757l.A1D(), A00(17, 14, 113)));
        }
    }

    public static void A03(C2300gi c2300gi, C1706Sx c1706Sx, C11757l c11757l) {
        int i2 = 0;
        for (NR nr : c11757l.A2G()) {
            C1704Sv c1704Sv = new C1704Sv(nr.A0H().A08(), O1.A00(nr.A0H()), O1.A01(nr.A0H()), c11757l.A1D(), A00(5, 12, 118));
            if (i2 == 0) {
                c1706Sx.A0c(c1704Sv);
            } else {
                c1706Sx.A0d(c1704Sv);
            }
            O0.A00(c11757l, c1706Sx, A00(17, 14, 113));
            Iterator<String> it = nr.A0K().A02().iterator();
            while (it.hasNext()) {
                c1706Sx.A0d(new C1704Sv(it.next(), -1, -1, c11757l.A1D(), A00(5, 12, 118)));
            }
            if (!TextUtils.isEmpty(nr.A0H().A09())) {
                new C1702St(nr.A0H().A09(), c11757l.A1D(), A00(5, 12, 118), nr.A0H().A06()).A04 = false;
            }
            i2++;
        }
    }
}
