package com.facebook.ads.redexgen.core;

import com.facebook.ads.internal.protocol.AdPlacementType;
import java.util.Arrays;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.n5, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public class C2012n5 extends JK {
    public static byte[] A01;
    public final /* synthetic */ N5 A00;

    static {
        A01();
    }

    public static String A00(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A01, i, i + i2);
        for (int i4 = 0; i4 < bArrCopyOfRange.length; i4++) {
            bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] ^ i3) ^ 19);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A01() {
        A01 = new byte[]{78, 77, 66, 66, 73, 94};
    }

    public C2012n5(N5 n5) {
        this.A00 = n5;
    }

    @Override // com.facebook.ads.redexgen.core.JK
    public final void A03() {
        if (!this.A00.A07.A07()) {
            this.A00.A07.A05();
            this.A00.A04.A0F().A4G(this.A00.A02 != null);
            this.A00.A04.A0F().A3B();
            AbstractC04153a.A02(this.A00.A03.A0g(), AbstractC0630Ce.A00(A00(0, 6, 63)));
            this.A00.A05.AB0(this.A00.A03.A1g(), new FB().A03(this.A00.A0C).A02(this.A00.A07).A04(this.A00.A03.A0h()).A05());
            if (C05789m.A18(this.A00.A04)) {
                C0614Bh.A00(this.A00.A04).A0E(AdPlacementType.BANNER.toString(), this.A00.A03.A1g());
            }
            C03962h.A07(this.A00.A03 == null ? null : this.A00.A03.A1c(), this.A00.A04);
            this.A00.A0C.A0V();
        }
    }
}
