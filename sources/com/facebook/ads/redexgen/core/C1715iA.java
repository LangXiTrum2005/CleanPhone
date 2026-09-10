package com.facebook.ads.redexgen.core;

import java.util.Arrays;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.iA, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public class C1715iA implements InterfaceC0635Cj {
    public static byte[] A03;
    public int A00;
    public String A01;
    public final InterfaceC0635Cj A02;

    static {
        A02();
    }

    public static String A00(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A03, i, i + i2);
        for (int i4 = 0; i4 < bArrCopyOfRange.length; i4++) {
            bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] - i3) - 50);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A02() {
        A03 = new byte[]{-93, -93, -107, -104};
    }

    public C1715iA(InterfaceC0635Cj interfaceC0635Cj) {
        this.A02 = interfaceC0635Cj;
    }

    private void A01() {
        if (this.A01 != null) {
            this.A02.AGG(this.A01 + A00(0, 4, 67) + this.A00);
            this.A01 = null;
            this.A00 = 0;
        }
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC0635Cj
    public final void AGG(String str) {
        if (!AbstractC0637Cl.A0A(str)) {
            String strA04 = AbstractC0637Cl.A04(str);
            String filtered = this.A01;
            if (strA04.equals(filtered)) {
                this.A00++;
                return;
            }
            A01();
            this.A01 = strA04;
            this.A00 = 1;
            return;
        }
        A01();
        this.A02.AGG(str);
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC0635Cj
    public final void flush() {
        A01();
        this.A02.flush();
    }
}
