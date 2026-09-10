package com.facebook.ads.redexgen.core;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.7g, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public final class C11707g extends AbstractC2435j0 {
    public static byte[] A00;
    public static String[] A01 = {"5V5lzA70kRKZvNcqBnXwT00Z041t6ONl", "kRuh8LYE7MIIox", "vbi5lrus1TtIcXopJBSqGum5Kl452Sg0", "JcNQ6WafPgnmx1aBDePIhrwzaceROyrU", "60x4BO5hhvvMWgz", "65jgyaanPJJ2TdYJaJc79ygQBnrUrWFq", "zOX7nuTxFizV3LeqTcyyEc2wd", "PvIxiwPRiyIOar7lINjn4bFuW"};

    public static String A00(int i2, int i3, int i4) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A00, i2, i2 + i3);
        for (int i5 = 0; i5 < bArrCopyOfRange.length; i5++) {
            bArrCopyOfRange[i5] = (byte) ((bArrCopyOfRange[i5] ^ i4) ^ 124);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A03() {
        A00 = new byte[]{42, 47, 107, 34, 56, 107, 37, 36, 63, 107, 57, 46, 42, 47, 50, 107, 36, 57, 107, 42, 39, 57, 46, 42, 47, 50, 107, 47, 34, 56, 59, 39, 42, 50, 46, 47, 20, 21, 28, 17, 9};
    }

    static {
        A03();
    }

    public C11707g(C2300gi c2300gi, O7 o7) {
        super(c2300gi, o7);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Map<String, String> A01(long j) {
        HashMap map = new HashMap();
        map.put(A00(36, 5, 12), String.valueOf(System.currentTimeMillis() - j));
        return map;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A05(List<String> trackingUrls, Map<String, String> extraData) {
        if (trackingUrls != null) {
            boolean zIsEmpty = trackingUrls.isEmpty();
            if (A01[3].charAt(25) != 'c') {
                throw new RuntimeException();
            }
            String[] strArr = A01;
            strArr[6] = "86KHDrV9NKgfIZAVdUdv4tP2w";
            strArr[7] = "hnWt117Y9rLxZfnYOmFuZ36IL";
            if (zIsEmpty) {
                return;
            }
            Iterator<String> it = trackingUrls.iterator();
            while (it.hasNext()) {
                new AsyncTaskC2271gF(this.A0B, extraData).execute(it.next());
            }
        }
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC2435j0
    public final void A0P() {
        C2482ju c2482ju = (C2482ju) this.A01;
        if (c2482ju.A0R()) {
            N2 n2 = this.A07;
            if (A01[3].charAt(25) != 'c') {
                throw new RuntimeException();
            }
            A01[4] = "SmlVqZ";
            if (n2 != null) {
                this.A07.A0B(c2482ju);
                return;
            }
            return;
        }
        throw new IllegalStateException(A00(0, 36, 55));
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC2435j0
    public final void A0R(N1 n1, C1731Tw c1731Tw, C1729Tu c1729Tu, O8 o8) {
        C2482ju c2482ju = (C2482ju) n1;
        long jCurrentTimeMillis = System.currentTimeMillis();
        C2432ix c2432ix = new C2432ix(this, o8, c2482ju, jCurrentTimeMillis, c1729Tu);
        A0H().postDelayed(c2432ix, c1731Tw.A05().A05());
        c2482ju.A0L(this.A0B, new C2431iw(this, c2432ix, jCurrentTimeMillis, c1729Tu), this.A09, o8, UK.A0K());
    }
}
