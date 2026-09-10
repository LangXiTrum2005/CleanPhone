package com.facebook.ads.redexgen.core;

import java.util.Arrays;
import java.util.Map;
import javax.annotation.Nullable;

/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public abstract class N3 {
    public static byte[] A04;
    public boolean A00;

    @Nullable
    public final N4 A01;
    public final C2300gi A02;
    public final C2245fp A03;

    static {
        A01();
    }

    public static String A00(int i2, int i3, int i4) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A04, i2, i2 + i3);
        for (int i5 = 0; i5 < bArrCopyOfRange.length; i5++) {
            bArrCopyOfRange[i5] = (byte) ((bArrCopyOfRange[i5] - i4) - 121);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A01() {
        A04 = new byte[]{-2, 34, 37, 39, 26, 40, 40, 30, 36, 35, -43, 33, 36, 28, 28, 26, 25};
    }

    public abstract void A08(Map<String, String> map);

    public N3(C2300gi c2300gi, N4 n4, C2245fp c2245fp) {
        this.A02 = c2300gi;
        this.A01 = n4;
        this.A03 = c2245fp;
    }

    public final void A03() {
        if (this.A00) {
            return;
        }
        if (this.A01 != null) {
            this.A01.A00();
        }
        Map<String, String> extraData = new C1957b9().A03(this.A03).A05();
        A08(extraData);
        this.A00 = true;
        XI.A04(this.A02, A00(0, 17, 60));
        N4 n4 = this.A01;
    }
}
