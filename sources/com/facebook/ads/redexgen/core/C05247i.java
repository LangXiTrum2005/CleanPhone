package com.facebook.ads.redexgen.core;

import android.text.TextUtils;
import java.util.Arrays;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.7i, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class C05247i {
    public static boolean A04;
    public static byte[] A05;
    public static final String A06;
    public final C05257j A00;
    public final C05267k A01;
    public final C1827k0 A02;
    public final InterfaceC0824Jq A03;

    public static String A00(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A05, i, i + i2);
        for (int i4 = 0; i4 < bArrCopyOfRange.length; i4++) {
            bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] ^ i3) ^ 31);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A01() {
        A05 = new byte[]{122, 108, 71, 125, 96, 108, 106, 121, 107};
    }

    static {
        A01();
        A06 = C05247i.class.getSimpleName();
    }

    public C05247i(C1827k0 c1827k0, InterfaceC1236aF interfaceC1236aF, C05257j c05257j, C05267k c05267k) {
        this.A02 = c1827k0;
        this.A03 = interfaceC1236aF.A5K(EnumC0825Jr.A06);
        this.A00 = c05257j;
        this.A01 = c05267k;
        this.A03.A3r(new C1836k9(this));
        A02();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public synchronized void A02() {
        if (BQ.A02(this)) {
            return;
        }
        try {
            if (!this.A03.AAT()) {
                this.A02.A05().AAD();
                return;
            }
            String btExtras = this.A03.A7Y().optString(A00(0, 9, 7));
            if (!TextUtils.isEmpty(btExtras)) {
                this.A00.A04(this.A02, btExtras);
                if (!A04 || C05789m.A0i(this.A02)) {
                    A04 = true;
                    this.A01.A07();
                }
            }
        } catch (Throwable th) {
            BQ.A00(th, this);
        }
    }
}
