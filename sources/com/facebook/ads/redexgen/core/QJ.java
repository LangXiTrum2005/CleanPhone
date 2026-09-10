package com.facebook.ads.redexgen.core;

import java.util.Arrays;

/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public class QJ implements InterfaceC1825Xr {
    public static byte[] A03;
    public int A00;
    public String A01;
    public final InterfaceC1825Xr A02;

    static {
        A02();
    }

    public static String A00(int i2, int i3, int i4) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A03, i2, i2 + i3);
        for (int i5 = 0; i5 < bArrCopyOfRange.length; i5++) {
            bArrCopyOfRange[i5] = (byte) ((bArrCopyOfRange[i5] - i4) - 50);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A02() {
        A03 = new byte[]{-93, -93, -107, -104};
    }

    public QJ(InterfaceC1825Xr interfaceC1825Xr) {
        this.A02 = interfaceC1825Xr;
    }

    private void A01() {
        if (this.A01 != null) {
            this.A02.AH8(this.A01 + A00(0, 4, 67) + this.A00);
            this.A01 = null;
            this.A00 = 0;
        }
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC1825Xr
    public final void AH8(String str) {
        if (AbstractC1827Xt.A0A(str)) {
            A01();
            this.A02.AH8(str);
            return;
        }
        String strA04 = AbstractC1827Xt.A04(str);
        String filtered = this.A01;
        if (strA04.equals(filtered)) {
            this.A00++;
            return;
        }
        A01();
        this.A01 = strA04;
        this.A00 = 1;
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC1825Xr
    public final void flush() {
        A01();
        this.A02.flush();
    }
}
