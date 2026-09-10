package com.facebook.ads.redexgen.core;

import java.util.Arrays;
import java.util.List;

/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public final class L9 {
    public static byte[] A02;
    public final List<C2860qI> A00;
    public final InterfaceC1407Hd[] A01;

    static {
        A01();
    }

    public static String A00(int i2, int i3, int i4) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A02, i2, i2 + i3);
        for (int i5 = 0; i5 < bArrCopyOfRange.length; i5++) {
            bArrCopyOfRange[i5] = (byte) ((bArrCopyOfRange[i5] - i4) - 29);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A01() {
        A02 = new byte[]{119, -100, -92, -113, -102, -105, -110, 78, -111, -102, -99, -95, -109, -110, 78, -111, -113, -98, -94, -105, -99, -100, 78, -101, -105, -101, -109, 78, -94, -89, -98, -109, 78, -98, -96, -99, -92, -105, -110, -109, -110, 104, 78, -123, -108, -108, -112, -115, -121, -123, -104, -115, -109, -110, 83, -121, -119, -123, 81, 90, 84, 92, -49, -34, -34, -38, -41, -47, -49, -30, -41, -35, -36, -99, -47, -45, -49, -101, -91, -98, -90};
    }

    public L9(List<C2860qI> list) {
        this.A00 = list;
        this.A01 = new InterfaceC1407Hd[list.size()];
    }

    public final void A02(long j, C11074v c11074v) {
        H3.A03(j, c11074v, this.A01);
    }

    public final void A03(HA ha, LG lg) {
        for (int i2 = 0; i2 < i; i2++) {
            lg.A05();
            InterfaceC1407Hd interfaceC1407HdAKS = ha.AKS(lg.A03(), 3);
            C2860qI c2860qI = this.A00.get(i2);
            String str = c2860qI.A0W;
            AbstractC10843y.A09(A00(43, 19, 7).equals(str) || A00(62, 19, 81).equals(str), A00(0, 43, 17) + str);
            C10512p c10512pA11 = new C10512p().A0y(c2860qI.A0T != null ? c2860qI.A0T : lg.A04()).A11(str);
            int i3 = c2860qI.A0H;
            C10512p c10512pA10 = c10512pA11.A0n(i3).A10(c2860qI.A0V);
            int i4 = c2860qI.A03;
            interfaceC1407HdAKS.A6e(c10512pA10.A0Z(i4).A12(c2860qI.A0X).A14());
            this.A01[i2] = interfaceC1407HdAKS;
        }
    }
}
