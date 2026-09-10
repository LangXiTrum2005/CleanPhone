package com.facebook.ads.redexgen.core;

import com.facebook.ads.internal.protocol.AdPlacementType;
import java.util.Arrays;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.k1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public class C2489k1 extends AbstractC2244fo {
    public static byte[] A01;
    public final /* synthetic */ AnonymousClass81 A00;

    static {
        A01();
    }

    public static String A00(int i2, int i3, int i4) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A01, i2, i2 + i3);
        for (int i5 = 0; i5 < bArrCopyOfRange.length; i5++) {
            bArrCopyOfRange[i5] = (byte) ((bArrCopyOfRange[i5] ^ i4) ^ 19);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A01() {
        A01 = new byte[]{78, 77, 66, 66, 73, 94};
    }

    public C2489k1(AnonymousClass81 anonymousClass81) {
        this.A00 = anonymousClass81;
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC2244fo
    public final void A03() {
        if (!this.A00.A0H.A07()) {
            this.A00.A0H.A05();
            this.A00.A04.A0F().A4Q(this.A00.A02 != null);
            this.A00.A04.A0F().A3L();
            AbstractC1584Oa.A02(this.A00.A03.A0y(), AbstractC1820Xm.A00(A00(0, 6, 63)));
            this.A00.A05.ABJ(this.A00.A03.A2E(), new C1957b9().A03(this.A00.A0B).A02(this.A00.A0H).A04(this.A00.A03.A0z()).A05());
            if (C1750Up.A1A(this.A00.A04)) {
                C1796Wl.A00(this.A00.A04).A0E(AdPlacementType.BANNER.toString(), this.A00.A03.A2E());
            }
            C1564Ng.A07(this.A00.A03 == null ? null : this.A00.A03.A2A(), this.A00.A04);
            this.A00.A0B.A0V();
        }
    }
}
